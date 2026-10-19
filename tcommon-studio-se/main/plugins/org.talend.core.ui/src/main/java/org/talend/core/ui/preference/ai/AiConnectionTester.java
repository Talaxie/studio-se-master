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
package org.talend.core.ui.preference.ai;

import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.talend.core.ui.i18n.Messages;
import org.talend.utils.json.JSONArray;
import org.talend.utils.json.JSONObject;

/**
 * Tests the connection to an LLM provider by listing its models: this checks the URL, the API key and the network
 * (proxy...) without consuming tokens.
 */
public final class AiConnectionTester {

    private static final String ANTHROPIC_VERSION = "2023-06-01"; //$NON-NLS-1$

    private static final int MAX_ERROR_BODY_LENGTH = 300;

    private AiConnectionTester() {
    }

    /**
     * @return the ids of the models available for the given key, sorted
     * @throws Exception with a message which can be shown to the user if the connection fails
     */
    public static List<String> listModels(AiProvider provider, String url, String apiKey, int timeoutSeconds)
            throws Exception {
        String baseUrl = (url == null || url.isBlank() ? provider.getDefaultUrl() : url.trim()).replaceAll("/+$", ""); //$NON-NLS-1$ //$NON-NLS-2$
        String key = apiKey == null ? "" : apiKey.trim(); //$NON-NLS-1$
        if (provider.isApiKeyRequired() && key.isEmpty()) {
            throw new Exception(Messages.getString("AiPreferencePage.error.apiKeyRequired")); //$NON-NLS-1$
        }

        HttpRequest.Builder request = HttpRequest.newBuilder().timeout(Duration.ofSeconds(timeoutSeconds)).GET();
        switch (provider.getApiStyle()) {
        case ANTHROPIC:
            request.uri(URI.create(baseUrl + "/models?limit=1000")) //$NON-NLS-1$
                    .header("x-api-key", key) //$NON-NLS-1$
                    .header("anthropic-version", ANTHROPIC_VERSION); //$NON-NLS-1$
            break;
        case GEMINI:
            request.uri(URI.create(baseUrl + "/models?pageSize=1000")) //$NON-NLS-1$
                    .header("x-goog-api-key", key); //$NON-NLS-1$
            break;
        case OLLAMA:
            request.uri(URI.create(baseUrl + "/api/tags")); //$NON-NLS-1$
            break;
        case OPENAI:
        default:
            request.uri(URI.create(baseUrl + "/models")); //$NON-NLS-1$
            if (!key.isEmpty()) {
                request.header("Authorization", "Bearer " + key); //$NON-NLS-1$ //$NON-NLS-2$
            }
            break;
        }

        HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(timeoutSeconds))
                .proxy(ProxySelector.getDefault()).followRedirects(HttpClient.Redirect.NORMAL).build();
        HttpResponse<String> response = client.send(request.build(), HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            String body = response.body() == null ? "" : response.body(); //$NON-NLS-1$
            if (body.length() > MAX_ERROR_BODY_LENGTH) {
                body = body.substring(0, MAX_ERROR_BODY_LENGTH) + "..."; //$NON-NLS-1$
            }
            throw new Exception(Messages.getString("AiPreferencePage.error.http", response.statusCode(), body)); //$NON-NLS-1$
        }
        return parseModels(provider, response.body());
    }

    private static List<String> parseModels(AiProvider provider, String body) throws Exception {
        JSONObject json = new JSONObject(body);
        List<String> models = new ArrayList<>();
        switch (provider.getApiStyle()) {
        case GEMINI:
            if (json.has("models")) { //$NON-NLS-1$
                JSONArray array = json.getJSONArray("models"); //$NON-NLS-1$
                for (int i = 0; i < array.length(); i++) {
                    String name = array.getJSONObject(i).getString("name"); //$NON-NLS-1$
                    models.add(name.startsWith("models/") ? name.substring("models/".length()) : name); //$NON-NLS-1$ //$NON-NLS-2$
                }
            }
            break;
        case OLLAMA:
            if (json.has("models")) { //$NON-NLS-1$
                JSONArray array = json.getJSONArray("models"); //$NON-NLS-1$
                for (int i = 0; i < array.length(); i++) {
                    models.add(array.getJSONObject(i).getString("name")); //$NON-NLS-1$
                }
            }
            break;
        case ANTHROPIC:
        case OPENAI:
        default:
            if (json.has("data")) { //$NON-NLS-1$
                JSONArray array = json.getJSONArray("data"); //$NON-NLS-1$
                for (int i = 0; i < array.length(); i++) {
                    models.add(array.getJSONObject(i).getString("id")); //$NON-NLS-1$
                }
            }
            break;
        }
        Collections.sort(models);
        return models;
    }
}
