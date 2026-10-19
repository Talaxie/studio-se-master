// ============================================================================
//
// Copyright (C) 2006-2026 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.ai;

import java.net.ProxySelector;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.talend.core.ui.i18n.Messages;
import org.talend.core.ui.preference.ai.AiProvider;
import org.talend.core.ui.preference.ai.AiSettings;
import org.talend.utils.json.JSONArray;
import org.talend.utils.json.JSONObject;

/**
 * Sends a conversation to the LLM configured in Talaxie > AI and streams the answer.
 * <p>
 * All the providers are called with their REST API (java.net.http): Anthropic Messages API, OpenAI Chat Completions
 * API (also used by Mistral, xAI, DeepSeek, Meta Llama API and the OpenAI compatible servers), Gemini API and Ollama
 * API.
 */
public class AiChatClient {

    private static final String ANTHROPIC_VERSION = "2023-06-01"; //$NON-NLS-1$

    /** Server-side fallback when Claude declines a request, with the model recommended by Anthropic */
    private static final String ANTHROPIC_FALLBACK_BETA = "server-side-fallback-2026-07-01"; //$NON-NLS-1$

    /** Claude models which support the server-side fallback ("default" mode) */
    private static final String[] ANTHROPIC_FALLBACK_MODELS = { "claude-fable-5-1", "claude-opus-5-5", "claude-opus-5", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            "claude-sonnet-5-5" }; //$NON-NLS-1$

    private static final int MAX_ERROR_LENGTH = 500;

    /** Receives the answer while it is generated (called from a background thread) */
    public interface Listener {

        /** A part of the answer */
        void onText(String text);

        /** Information about the request (e.g. the answer is continued by a fallback model) */
        void onInfo(String info);
    }

    /** End of an answer */
    public static class Result {

        private String model;

        private String stopReason;

        private boolean refused;

        public String getModel() {
            return model;
        }

        public String getStopReason() {
            return stopReason;
        }

        /** The provider declined the request (safety filters...): the partial answer must not be used */
        public boolean isRefused() {
            return refused;
        }

        /** The answer was cut because the maximum number of tokens was reached */
        public boolean isTruncated() {
            return "max_tokens".equals(stopReason) || "length".equalsIgnoreCase(stopReason) //$NON-NLS-1$ //$NON-NLS-2$
                    || "MAX_TOKENS".equals(stopReason); //$NON-NLS-1$
        }
    }

    private final AiProvider provider;

    private final String url;

    private final String apiKey;

    private final String model;

    private final int maxTokens;

    private final int timeout;

    private volatile Stream<String> currentStream;

    private volatile boolean cancelled;

    /** A client with the settings of Talaxie > AI */
    public AiChatClient() {
        this.provider = AiSettings.getProvider();
        this.url = AiSettings.getUrl().replaceAll("/+$", ""); //$NON-NLS-1$ //$NON-NLS-2$
        this.apiKey = AiSettings.getApiKey();
        this.model = AiSettings.getModel();
        this.maxTokens = AiSettings.getMaxTokens();
        this.timeout = AiSettings.getTimeout();
    }

    public AiProvider getProvider() {
        return provider;
    }

    public String getModel() {
        return model;
    }

    /** Stops the answer in progress (can be called from any thread) */
    public void cancel() {
        cancelled = true;
        Stream<String> stream = currentStream;
        if (stream != null) {
            stream.close();
        }
    }

    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sends the conversation and streams the answer to the listener. Blocking: must be called from a background
     * thread.
     *
     * @throws Exception with a message which can be shown to the user
     */
    public Result send(String systemPrompt, List<AiChatMessage> messages, Listener listener) throws Exception {
        if (model == null || model.isBlank()) {
            throw new Exception(Messages.getString("AiAssistantView.error.noModel")); //$NON-NLS-1$
        }
        if (provider.isApiKeyRequired() && (apiKey == null || apiKey.isBlank())) {
            throw new Exception(Messages.getString("AiPreferencePage.error.apiKeyRequired")); //$NON-NLS-1$
        }
        HttpRequest request;
        switch (provider.getApiStyle()) {
        case ANTHROPIC:
            request = createAnthropicRequest(systemPrompt, messages);
            break;
        case GEMINI:
            request = createGeminiRequest(systemPrompt, messages);
            break;
        case OLLAMA:
            request = createOllamaRequest(systemPrompt, messages);
            break;
        case OPENAI:
        default:
            request = createOpenAiRequest(systemPrompt, messages);
            break;
        }

        HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(timeout))
                .proxy(ProxySelector.getDefault()).followRedirects(HttpClient.Redirect.NORMAL).build();
        HttpResponse<Stream<String>> response = client.send(request, HttpResponse.BodyHandlers.ofLines());
        Stream<String> lines = response.body();
        currentStream = lines;
        Result result = new Result();
        result.model = model;
        try {
            if (response.statusCode() < 200 || response.statusCode() >= 300) {
                String body = lines.collect(Collectors.joining("\n")); //$NON-NLS-1$
                throw new Exception(Messages.getString("AiPreferencePage.error.http", response.statusCode(), //$NON-NLS-1$
                        extractErrorMessage(body)));
            }
            Iterator<String> iterator = lines.iterator();
            while (!cancelled && iterator.hasNext()) {
                String line = iterator.next();
                if (provider.getApiStyle() == AiProvider.ApiStyle.OLLAMA) {
                    if (!line.isBlank()) {
                        handleOllamaChunk(new JSONObject(line), result, listener);
                    }
                    continue;
                }
                // Server-Sent Events: only the "data:" lines carry the content
                if (!line.startsWith("data:")) { //$NON-NLS-1$
                    continue;
                }
                String data = line.substring("data:".length()).trim(); //$NON-NLS-1$
                if (data.isEmpty() || "[DONE]".equals(data)) { //$NON-NLS-1$
                    continue;
                }
                JSONObject json = new JSONObject(data);
                switch (provider.getApiStyle()) {
                case ANTHROPIC:
                    handleAnthropicEvent(json, result, listener);
                    break;
                case GEMINI:
                    handleGeminiChunk(json, result, listener);
                    break;
                case OPENAI:
                default:
                    handleOpenAiChunk(json, result, listener);
                    break;
                }
            }
            return result;
        } catch (Exception e) {
            if (cancelled) {
                // the stream has been closed by cancel(): the partial answer is kept
                return result;
            }
            throw e;
        } finally {
            currentStream = null;
            lines.close();
        }
    }

    // ---------------------------------------------------------------- Anthropic

    private HttpRequest createAnthropicRequest(String systemPrompt, List<AiChatMessage> messages) throws Exception {
        JSONArray jsonMessages = new JSONArray();
        for (AiChatMessage message : messages) {
            jsonMessages.put(new JSONObject().put("role", message.getRole() == AiChatMessage.Role.USER ? "user" : "assistant") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    .put("content", message.getText())); //$NON-NLS-1$
        }
        JSONObject body = new JSONObject();
        body.put("model", model); //$NON-NLS-1$
        body.put("max_tokens", maxTokens); //$NON-NLS-1$
        body.put("system", systemPrompt); //$NON-NLS-1$
        body.put("messages", jsonMessages); //$NON-NLS-1$
        body.put("stream", true); //$NON-NLS-1$

        HttpRequest.Builder builder = HttpRequest.newBuilder(URI.create(url + "/messages")) //$NON-NLS-1$
                .timeout(Duration.ofSeconds(timeout)).header("Content-Type", "application/json") //$NON-NLS-1$ //$NON-NLS-2$
                .header("x-api-key", apiKey).header("anthropic-version", ANTHROPIC_VERSION); //$NON-NLS-1$ //$NON-NLS-2$
        if (supportsAnthropicFallback()) {
            // when the safety classifiers decline the request, the API retries it on the model recommended for the
            // refusal category, on the same stream
            body.put("fallbacks", "default"); //$NON-NLS-1$ //$NON-NLS-2$
            builder.header("anthropic-beta", ANTHROPIC_FALLBACK_BETA); //$NON-NLS-1$
        }
        return builder.POST(HttpRequest.BodyPublishers.ofString(body.toString(), StandardCharsets.UTF_8)).build();
    }

    private boolean supportsAnthropicFallback() {
        // server-side fallback is available on the Claude API only (not on a proxy or another platform)
        if (!url.startsWith(AiProvider.ANTHROPIC.getDefaultUrl())) {
            return false;
        }
        for (String fallbackModel : ANTHROPIC_FALLBACK_MODELS) {
            if (fallbackModel.equals(model)) {
                return true;
            }
        }
        return false;
    }

    private void handleAnthropicEvent(JSONObject event, Result result, Listener listener) throws Exception {
        String type = event.optString("type", ""); //$NON-NLS-1$ //$NON-NLS-2$
        switch (type) {
        case "message_start": //$NON-NLS-1$
            JSONObject message = event.optJSONObject("message"); //$NON-NLS-1$
            if (message != null && !message.optString("model", "").isEmpty()) { //$NON-NLS-1$ //$NON-NLS-2$
                result.model = message.optString("model", model); //$NON-NLS-1$
            }
            break;
        case "content_block_start": //$NON-NLS-1$
            JSONObject block = event.optJSONObject("content_block"); //$NON-NLS-1$
            if (block != null && "fallback".equals(block.optString("type", ""))) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                JSONObject to = block.optJSONObject("to"); //$NON-NLS-1$
                String toModel = to == null ? "" : to.optString("model", ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                result.model = toModel.isEmpty() ? result.model : toModel;
                listener.onInfo(Messages.getString("AiAssistantView.fallback", result.model)); //$NON-NLS-1$
            }
            break;
        case "content_block_delta": //$NON-NLS-1$
            JSONObject delta = event.optJSONObject("delta"); //$NON-NLS-1$
            // thinking deltas are ignored, only the text of the answer is shown
            if (delta != null && "text_delta".equals(delta.optString("type", ""))) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                listener.onText(delta.optString("text", "")); //$NON-NLS-1$ //$NON-NLS-2$
            }
            break;
        case "message_delta": //$NON-NLS-1$
            JSONObject messageDelta = event.optJSONObject("delta"); //$NON-NLS-1$
            if (messageDelta != null && !messageDelta.isNull("stop_reason") //$NON-NLS-1$
                    && !messageDelta.optString("stop_reason", "").isEmpty()) { //$NON-NLS-1$ //$NON-NLS-2$
                result.stopReason = messageDelta.optString("stop_reason", ""); //$NON-NLS-1$ //$NON-NLS-2$
                result.refused = "refusal".equals(result.stopReason); //$NON-NLS-1$
            }
            break;
        case "error": //$NON-NLS-1$
            throw new Exception(extractErrorMessage(event.toString()));
        default:
            // ping, content_block_stop, message_stop...
            break;
        }
    }

    // ---------------------------------------------------------------- OpenAI (and compatible APIs)

    private HttpRequest createOpenAiRequest(String systemPrompt, List<AiChatMessage> messages) throws Exception {
        JSONArray jsonMessages = new JSONArray();
        jsonMessages.put(new JSONObject().put("role", "system").put("content", systemPrompt)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        for (AiChatMessage message : messages) {
            jsonMessages.put(new JSONObject().put("role", message.getRole() == AiChatMessage.Role.USER ? "user" : "assistant") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    .put("content", message.getText())); //$NON-NLS-1$
        }
        JSONObject body = new JSONObject();
        body.put("model", model); //$NON-NLS-1$
        body.put("messages", jsonMessages); //$NON-NLS-1$
        body.put("stream", true); //$NON-NLS-1$
        // OpenAI and Meta use the new parameter name (the old one is rejected by the reasoning models)
        if (provider == AiProvider.OPENAI || provider == AiProvider.META) {
            body.put("max_completion_tokens", maxTokens); //$NON-NLS-1$
        } else {
            body.put("max_tokens", maxTokens); //$NON-NLS-1$
        }

        HttpRequest.Builder builder = HttpRequest.newBuilder(URI.create(url + "/chat/completions")) //$NON-NLS-1$
                .timeout(Duration.ofSeconds(timeout)).header("Content-Type", "application/json"); //$NON-NLS-1$ //$NON-NLS-2$
        if (apiKey != null && !apiKey.isBlank()) {
            builder.header("Authorization", "Bearer " + apiKey); //$NON-NLS-1$ //$NON-NLS-2$
        }
        return builder.POST(HttpRequest.BodyPublishers.ofString(body.toString(), StandardCharsets.UTF_8)).build();
    }

    private static void handleOpenAiChunk(JSONObject chunk, Result result, Listener listener) throws Exception {
        if (chunk.optJSONObject("error") != null) { //$NON-NLS-1$
            throw new Exception(extractErrorMessage(chunk.toString()));
        }
        if (!chunk.optString("model", "").isEmpty()) { //$NON-NLS-1$ //$NON-NLS-2$
            result.model = chunk.optString("model", result.model); //$NON-NLS-1$
        }
        JSONArray choices = chunk.optJSONArray("choices"); //$NON-NLS-1$
        if (choices == null || choices.length() == 0) {
            return;
        }
        JSONObject choice = choices.optJSONObject(0);
        if (choice == null) {
            return;
        }
        JSONObject delta = choice.optJSONObject("delta"); //$NON-NLS-1$
        if (delta != null && !delta.isNull("content")) { //$NON-NLS-1$
            String text = delta.optString("content", ""); //$NON-NLS-1$ //$NON-NLS-2$
            if (!text.isEmpty()) {
                listener.onText(text);
            }
        }
        if (!choice.isNull("finish_reason") && !choice.optString("finish_reason", "").isEmpty()) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            result.stopReason = choice.optString("finish_reason", ""); //$NON-NLS-1$ //$NON-NLS-2$
            result.refused = "content_filter".equals(result.stopReason); //$NON-NLS-1$
        }
    }

    // ---------------------------------------------------------------- Gemini

    private HttpRequest createGeminiRequest(String systemPrompt, List<AiChatMessage> messages) throws Exception {
        JSONArray contents = new JSONArray();
        for (AiChatMessage message : messages) {
            JSONArray parts = new JSONArray();
            parts.put(new JSONObject().put("text", message.getText())); //$NON-NLS-1$
            contents.put(new JSONObject().put("role", message.getRole() == AiChatMessage.Role.USER ? "user" : "model") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    .put("parts", parts)); //$NON-NLS-1$
        }
        JSONArray systemParts = new JSONArray();
        systemParts.put(new JSONObject().put("text", systemPrompt)); //$NON-NLS-1$
        JSONObject body = new JSONObject();
        body.put("systemInstruction", new JSONObject().put("parts", systemParts)); //$NON-NLS-1$ //$NON-NLS-2$
        body.put("contents", contents); //$NON-NLS-1$
        body.put("generationConfig", new JSONObject().put("maxOutputTokens", maxTokens)); //$NON-NLS-1$ //$NON-NLS-2$

        String modelPath = URLEncoder.encode(model, StandardCharsets.UTF_8);
        return HttpRequest.newBuilder(URI.create(url + "/models/" + modelPath + ":streamGenerateContent?alt=sse")) //$NON-NLS-1$ //$NON-NLS-2$
                .timeout(Duration.ofSeconds(timeout)).header("Content-Type", "application/json") //$NON-NLS-1$ //$NON-NLS-2$
                .header("x-goog-api-key", apiKey) //$NON-NLS-1$
                .POST(HttpRequest.BodyPublishers.ofString(body.toString(), StandardCharsets.UTF_8)).build();
    }

    private static void handleGeminiChunk(JSONObject chunk, Result result, Listener listener) throws Exception {
        if (chunk.optJSONObject("error") != null) { //$NON-NLS-1$
            throw new Exception(extractErrorMessage(chunk.toString()));
        }
        JSONObject promptFeedback = chunk.optJSONObject("promptFeedback"); //$NON-NLS-1$
        if (promptFeedback != null && !promptFeedback.optString("blockReason", "").isEmpty()) { //$NON-NLS-1$ //$NON-NLS-2$
            result.stopReason = promptFeedback.optString("blockReason", ""); //$NON-NLS-1$ //$NON-NLS-2$
            result.refused = true;
            return;
        }
        JSONArray candidates = chunk.optJSONArray("candidates"); //$NON-NLS-1$
        if (candidates == null || candidates.length() == 0) {
            return;
        }
        JSONObject candidate = candidates.optJSONObject(0);
        if (candidate == null) {
            return;
        }
        JSONObject content = candidate.optJSONObject("content"); //$NON-NLS-1$
        JSONArray parts = content == null ? null : content.optJSONArray("parts"); //$NON-NLS-1$
        if (parts != null) {
            for (int i = 0; i < parts.length(); i++) {
                JSONObject part = parts.optJSONObject(i);
                // the "thought" parts are the reasoning of the model, not the answer
                if (part != null && !part.optBoolean("thought") && !part.isNull("text")) { //$NON-NLS-1$ //$NON-NLS-2$
                    String text = part.optString("text", ""); //$NON-NLS-1$ //$NON-NLS-2$
                    if (!text.isEmpty()) {
                        listener.onText(text);
                    }
                }
            }
        }
        String finishReason = candidate.optString("finishReason", ""); //$NON-NLS-1$ //$NON-NLS-2$
        if (!finishReason.isEmpty()) {
            result.stopReason = finishReason;
            result.refused = "SAFETY".equals(finishReason) || "PROHIBITED_CONTENT".equals(finishReason) //$NON-NLS-1$ //$NON-NLS-2$
                    || "BLOCKLIST".equals(finishReason); //$NON-NLS-1$
        }
    }

    // ---------------------------------------------------------------- Ollama

    private HttpRequest createOllamaRequest(String systemPrompt, List<AiChatMessage> messages) throws Exception {
        JSONArray jsonMessages = new JSONArray();
        jsonMessages.put(new JSONObject().put("role", "system").put("content", systemPrompt)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        for (AiChatMessage message : messages) {
            jsonMessages.put(new JSONObject().put("role", message.getRole() == AiChatMessage.Role.USER ? "user" : "assistant") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    .put("content", message.getText())); //$NON-NLS-1$
        }
        JSONObject body = new JSONObject();
        body.put("model", model); //$NON-NLS-1$
        body.put("messages", jsonMessages); //$NON-NLS-1$
        body.put("stream", true); //$NON-NLS-1$
        body.put("options", new JSONObject().put("num_predict", maxTokens)); //$NON-NLS-1$ //$NON-NLS-2$

        return HttpRequest.newBuilder(URI.create(url + "/api/chat")) //$NON-NLS-1$
                .timeout(Duration.ofSeconds(timeout)).header("Content-Type", "application/json") //$NON-NLS-1$ //$NON-NLS-2$
                .POST(HttpRequest.BodyPublishers.ofString(body.toString(), StandardCharsets.UTF_8)).build();
    }

    private static void handleOllamaChunk(JSONObject chunk, Result result, Listener listener) throws Exception {
        if (!chunk.optString("error", "").isEmpty()) { //$NON-NLS-1$ //$NON-NLS-2$
            throw new Exception(chunk.optString("error", "")); //$NON-NLS-1$ //$NON-NLS-2$
        }
        JSONObject message = chunk.optJSONObject("message"); //$NON-NLS-1$
        if (message != null && !message.isNull("content")) { //$NON-NLS-1$
            String text = message.optString("content", ""); //$NON-NLS-1$ //$NON-NLS-2$
            if (!text.isEmpty()) {
                listener.onText(text);
            }
        }
        if (chunk.optBoolean("done")) { //$NON-NLS-1$
            result.stopReason = chunk.optString("done_reason", "stop"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    // ---------------------------------------------------------------- errors

    /**
     * Extracts the readable message of an error body: {"error": {"message": ...}} (Anthropic, OpenAI, Gemini...) or
     * {"error": "..."} (Ollama), else the body itself.
     */
    private static String extractErrorMessage(String body) {
        String message = body == null ? "" : body.trim(); //$NON-NLS-1$
        try {
            JSONObject json = new JSONObject(message);
            JSONObject error = json.optJSONObject("error"); //$NON-NLS-1$
            if (error != null && !error.optString("message", "").isEmpty()) { //$NON-NLS-1$ //$NON-NLS-2$
                message = error.optString("message", message); //$NON-NLS-1$
            } else if (!json.optString("error", "").isEmpty() && json.optJSONObject("error") == null) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                message = json.optString("error", message); //$NON-NLS-1$
            } else if (!json.optString("message", "").isEmpty()) { //$NON-NLS-1$ //$NON-NLS-2$
                message = json.optString("message", message); //$NON-NLS-1$
            }
        } catch (Exception e) {
            // not JSON: keep the body
        }
        if (message.length() > MAX_ERROR_LENGTH) {
            message = message.substring(0, MAX_ERROR_LENGTH) + "..."; //$NON-NLS-1$
        }
        return message;
    }
}
