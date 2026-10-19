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

/**
 * LLM providers which can be used by the Talaxie assistant.
 * <p>
 * The default URL and the way to list the models are given for each provider: they are used by the preference page
 * (default values, connection test, list of the models). The URL can always be changed (proxy, gateway, other region...).
 */
public enum AiProvider {

    ANTHROPIC("Anthropic (Claude)", "https://api.anthropic.com/v1", ApiStyle.ANTHROPIC, true, false, "claude-opus-5-5"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    OPENAI("OpenAI (GPT)", "https://api.openai.com/v1", ApiStyle.OPENAI, true, false, ""), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    GEMINI("Google (Gemini)", "https://generativelanguage.googleapis.com/v1beta", ApiStyle.GEMINI, true, false, ""), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    MISTRAL("Mistral AI", "https://api.mistral.ai/v1", ApiStyle.OPENAI, true, false, ""), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    XAI("xAI (Grok)", "https://api.x.ai/v1", ApiStyle.OPENAI, true, false, ""), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    DEEPSEEK("DeepSeek", "https://api.deepseek.com", ApiStyle.OPENAI, true, false, ""), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    META("Meta (Llama API)", "https://api.llama.com/v1", ApiStyle.OPENAI, true, false, ""), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    OLLAMA("Ollama (local)", "http://localhost:11434", ApiStyle.OLLAMA, false, true, ""), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** Any server compatible with the OpenAI API: LM Studio, vLLM, LocalAI, LiteLLM, Azure OpenAI gateway... */
    OPENAI_COMPATIBLE("OpenAI compatible", "http://localhost:1234/v1", ApiStyle.OPENAI, false, true, ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** How to call the provider API */
    public enum ApiStyle {
        /** GET {url}/models, headers x-api-key + anthropic-version, response data[].id */
        ANTHROPIC,
        /** GET {url}/models, header Authorization: Bearer, response data[].id */
        OPENAI,
        /** GET {url}/models, header x-goog-api-key, response models[].name ("models/xxx") */
        GEMINI,
        /** GET {url}/api/tags, no key, response models[].name */
        OLLAMA
    }

    private final String label;

    private final String defaultUrl;

    private final ApiStyle apiStyle;

    private final boolean apiKeyRequired;

    private final boolean local;

    private final String defaultModel;

    AiProvider(String label, String defaultUrl, ApiStyle apiStyle, boolean apiKeyRequired, boolean local, String defaultModel) {
        this.label = label;
        this.defaultUrl = defaultUrl;
        this.apiStyle = apiStyle;
        this.apiKeyRequired = apiKeyRequired;
        this.local = local;
        this.defaultModel = defaultModel;
    }

    public String getLabel() {
        return label;
    }

    public String getDefaultUrl() {
        return defaultUrl;
    }

    public ApiStyle getApiStyle() {
        return apiStyle;
    }

    public boolean isApiKeyRequired() {
        return apiKeyRequired;
    }

    /** The model runs on the user machine or network (no data sent to a cloud provider) */
    public boolean isLocal() {
        return local;
    }

    /** Model proposed by default, empty when the model must be chosen from the list returned by the provider */
    public String getDefaultModel() {
        return defaultModel;
    }

    public static AiProvider fromName(String name) {
        for (AiProvider provider : values()) {
            if (provider.name().equals(name)) {
                return provider;
            }
        }
        return ANTHROPIC;
    }
}
