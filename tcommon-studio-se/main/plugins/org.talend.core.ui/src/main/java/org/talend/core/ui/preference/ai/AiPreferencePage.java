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

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.ui.i18n.Messages;

/**
 * Talaxie > AI preferences: connection to the LLM (cloud or local) used by the Talaxie assistant.
 */
public class AiPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

    public static final String PAGE_ID = "org.talend.core.prefs.ai"; //$NON-NLS-1$

    private Button enabledButton;

    private Combo providerCombo;

    private Text urlText;

    private Text apiKeyText;

    private Combo modelCombo;

    private Button loadModelsButton;

    private Spinner maxTokensSpinner;

    private Spinner timeoutSpinner;

    private Button testButton;

    private Label privacyLabel;

    private Label statusLabel;

    private AiProvider currentProvider;

    /** API keys typed in this page, per provider (saved in the secure storage on OK/Apply) */
    private final Map<AiProvider, String> apiKeys = new EnumMap<>(AiProvider.class);

    public AiPreferencePage() {
        setDescription(Messages.getString("AiPreferencePage.description")); //$NON-NLS-1$
    }

    @Override
    public void init(IWorkbench workbench) {
        setPreferenceStore(AiSettings.getPreferenceStore());
    }

    @Override
    protected Control createContents(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout(1, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        enabledButton = new Button(composite, SWT.CHECK);
        enabledButton.setText(Messages.getString("AiPreferencePage.enable")); //$NON-NLS-1$

        // connection
        Group connectionGroup = new Group(composite, SWT.NONE);
        connectionGroup.setText(Messages.getString("AiPreferencePage.connectionGroup")); //$NON-NLS-1$
        connectionGroup.setLayout(new GridLayout(3, false));
        connectionGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        createLabel(connectionGroup, Messages.getString("AiPreferencePage.provider")); //$NON-NLS-1$
        providerCombo = new Combo(connectionGroup, SWT.READ_ONLY | SWT.DROP_DOWN);
        for (AiProvider provider : AiProvider.values()) {
            providerCombo.add(provider.getLabel());
        }
        providerCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        providerCombo.addListener(SWT.Selection, e -> providerChanged(AiProvider.values()[providerCombo.getSelectionIndex()]));

        createLabel(connectionGroup, Messages.getString("AiPreferencePage.url")); //$NON-NLS-1$
        urlText = new Text(connectionGroup, SWT.BORDER);
        urlText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

        createLabel(connectionGroup, Messages.getString("AiPreferencePage.apiKey")); //$NON-NLS-1$
        apiKeyText = new Text(connectionGroup, SWT.BORDER | SWT.PASSWORD);
        apiKeyText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

        new Label(connectionGroup, SWT.NONE);
        Label apiKeyHint = new Label(connectionGroup, SWT.WRAP);
        apiKeyHint.setText(Messages.getString("AiPreferencePage.apiKeyHint")); //$NON-NLS-1$
        apiKeyHint.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

        createLabel(connectionGroup, Messages.getString("AiPreferencePage.model")); //$NON-NLS-1$
        modelCombo = new Combo(connectionGroup, SWT.DROP_DOWN);
        modelCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        loadModelsButton = new Button(connectionGroup, SWT.PUSH);
        loadModelsButton.setText(Messages.getString("AiPreferencePage.loadModels")); //$NON-NLS-1$
        loadModelsButton.addListener(SWT.Selection, e -> runConnectionTest(true));

        // requests
        Group requestGroup = new Group(composite, SWT.NONE);
        requestGroup.setText(Messages.getString("AiPreferencePage.requestGroup")); //$NON-NLS-1$
        requestGroup.setLayout(new GridLayout(2, false));
        requestGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        createLabel(requestGroup, Messages.getString("AiPreferencePage.maxTokens")); //$NON-NLS-1$
        maxTokensSpinner = new Spinner(requestGroup, SWT.BORDER);
        maxTokensSpinner.setValues(AiSettings.DEFAULT_MAX_TOKENS, 256, 128000, 0, 1000, 10000);

        createLabel(requestGroup, Messages.getString("AiPreferencePage.timeout")); //$NON-NLS-1$
        timeoutSpinner = new Spinner(requestGroup, SWT.BORDER);
        timeoutSpinner.setValues(AiSettings.DEFAULT_TIMEOUT, 5, 1800, 0, 5, 60);

        // test
        Composite testComposite = new Composite(composite, SWT.NONE);
        testComposite.setLayout(new GridLayout(2, false));
        testComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
        testButton = new Button(testComposite, SWT.PUSH);
        testButton.setText(Messages.getString("AiPreferencePage.test")); //$NON-NLS-1$
        testButton.addListener(SWT.Selection, e -> runConnectionTest(false));
        statusLabel = new Label(testComposite, SWT.WRAP);
        statusLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        privacyLabel = new Label(composite, SWT.WRAP);
        GridData privacyData = new GridData(SWT.FILL, SWT.TOP, true, false);
        privacyData.widthHint = 400;
        privacyLabel.setLayoutData(privacyData);

        enabledButton.addListener(SWT.Selection, e -> updateEnablement());
        loadValues();
        return composite;
    }

    private static void createLabel(Composite parent, String text) {
        Label label = new Label(parent, SWT.NONE);
        label.setText(text);
    }

    private void loadValues() {
        IPreferenceStore store = getPreferenceStore();
        enabledButton.setSelection(store.getBoolean(AiSettings.ENABLED));
        currentProvider = AiProvider.fromName(store.getString(AiSettings.PROVIDER));
        providerCombo.select(currentProvider.ordinal());
        urlText.setText(store.getString(AiSettings.URL));
        apiKeys.clear();
        apiKeyText.setText(getApiKey(currentProvider));
        modelCombo.removeAll();
        String model = store.getString(AiSettings.MODEL);
        modelCombo.setText(model.isBlank() ? currentProvider.getDefaultModel() : model);
        maxTokensSpinner.setSelection(store.getInt(AiSettings.MAX_TOKENS));
        timeoutSpinner.setSelection(store.getInt(AiSettings.TIMEOUT));
        updateProviderDependentControls();
        updateEnablement();
    }

    private String getApiKey(AiProvider provider) {
        return apiKeys.computeIfAbsent(provider, AiSettings::getApiKey);
    }

    private void providerChanged(AiProvider newProvider) {
        if (newProvider == currentProvider) {
            return;
        }
        apiKeys.put(currentProvider, apiKeyText.getText());
        // reset the values which are the defaults of the previous provider
        String url = urlText.getText().trim();
        if (url.isEmpty() || url.equals(currentProvider.getDefaultUrl())) {
            urlText.setText(""); //$NON-NLS-1$
        }
        String model = modelCombo.getText().trim();
        modelCombo.removeAll();
        if (model.isEmpty() || model.equals(currentProvider.getDefaultModel())) {
            modelCombo.setText(newProvider.getDefaultModel());
        } else {
            modelCombo.setText(""); //$NON-NLS-1$
        }
        currentProvider = newProvider;
        apiKeyText.setText(getApiKey(newProvider));
        statusLabel.setText(""); //$NON-NLS-1$
        updateProviderDependentControls();
    }

    private void updateProviderDependentControls() {
        urlText.setMessage(currentProvider.getDefaultUrl());
        apiKeyText.setMessage(currentProvider.isApiKeyRequired() ? "" //$NON-NLS-1$
                : Messages.getString("AiPreferencePage.apiKeyOptional")); //$NON-NLS-1$
        privacyLabel.setText(currentProvider.isLocal() ? Messages.getString("AiPreferencePage.localInfo") //$NON-NLS-1$
                : Messages.getString("AiPreferencePage.cloudWarning", currentProvider.getLabel())); //$NON-NLS-1$
        privacyLabel.getParent().layout(true, true);
    }

    private void updateEnablement() {
        boolean enabled = enabledButton.getSelection();
        for (Control control : new Control[] { providerCombo, urlText, apiKeyText, modelCombo, loadModelsButton,
                maxTokensSpinner, timeoutSpinner, testButton }) {
            control.setEnabled(enabled);
        }
    }

    /**
     * Lists the models of the provider in background, with the values typed in the page (not the saved ones).
     *
     * @param fillModels true to fill the list of the models
     */
    private void runConnectionTest(boolean fillModels) {
        final AiProvider provider = currentProvider;
        final String url = urlText.getText();
        final String apiKey = apiKeyText.getText();
        final int timeout = timeoutSpinner.getSelection();
        final String model = modelCombo.getText().trim();
        final Display display = getShell().getDisplay();

        setTestRunning(true);
        statusLabel.setText(Messages.getString("AiPreferencePage.testing")); //$NON-NLS-1$
        Thread thread = new Thread(() -> {
            String message;
            List<String> models = null;
            boolean success = false;
            try {
                models = AiConnectionTester.listModels(provider, url, apiKey, timeout);
                success = true;
                if (fillModels) {
                    message = Messages.getString("AiPreferencePage.modelsLoaded", models.size()); //$NON-NLS-1$
                } else if (!model.isEmpty() && !models.isEmpty() && !models.contains(model)) {
                    message = Messages.getString("AiPreferencePage.modelNotFound", model); //$NON-NLS-1$
                } else {
                    message = Messages.getString("AiPreferencePage.testOk", models.size()); //$NON-NLS-1$
                }
            } catch (Exception e) {
                message = Messages.getString("AiPreferencePage.error.connection", //$NON-NLS-1$
                        e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage());
            }
            final String finalMessage = message;
            final List<String> finalModels = models;
            final boolean finalSuccess = success;
            display.asyncExec(() -> {
                if (statusLabel.isDisposed()) {
                    return;
                }
                setTestRunning(false);
                statusLabel.setText(finalMessage);
                statusLabel.setForeground(display.getSystemColor(finalSuccess ? SWT.COLOR_DARK_GREEN : SWT.COLOR_RED));
                if (finalSuccess && provider == currentProvider) {
                    String typedModel = modelCombo.getText();
                    modelCombo.setItems(finalModels.toArray(new String[0]));
                    modelCombo.setText(typedModel);
                    if (fillModels) {
                        modelCombo.setListVisible(true);
                    }
                }
                statusLabel.getParent().layout(true, true);
            });
        }, "Talaxie AI connection test"); //$NON-NLS-1$
        thread.setDaemon(true);
        thread.start();
    }

    private void setTestRunning(boolean running) {
        testButton.setEnabled(!running && enabledButton.getSelection());
        loadModelsButton.setEnabled(!running && enabledButton.getSelection());
        statusLabel.setForeground(null);
    }

    @Override
    protected void performDefaults() {
        IPreferenceStore store = getPreferenceStore();
        enabledButton.setSelection(store.getDefaultBoolean(AiSettings.ENABLED));
        AiProvider defaultProvider = AiProvider.fromName(store.getDefaultString(AiSettings.PROVIDER));
        providerCombo.select(defaultProvider.ordinal());
        providerChanged(defaultProvider);
        urlText.setText(""); //$NON-NLS-1$
        modelCombo.setText(defaultProvider.getDefaultModel());
        maxTokensSpinner.setSelection(store.getDefaultInt(AiSettings.MAX_TOKENS));
        timeoutSpinner.setSelection(store.getDefaultInt(AiSettings.TIMEOUT));
        updateEnablement();
        super.performDefaults();
    }

    @Override
    public boolean performOk() {
        if (enabledButton == null || enabledButton.isDisposed()) {
            return true;
        }
        IPreferenceStore store = getPreferenceStore();
        store.setValue(AiSettings.ENABLED, enabledButton.getSelection());
        store.setValue(AiSettings.PROVIDER, currentProvider.name());
        String url = urlText.getText().trim();
        // the default URL of the provider is not stored, so it follows the provider
        store.setValue(AiSettings.URL, url.equals(currentProvider.getDefaultUrl()) ? "" : url); //$NON-NLS-1$
        store.setValue(AiSettings.MODEL, modelCombo.getText().trim());
        store.setValue(AiSettings.MAX_TOKENS, maxTokensSpinner.getSelection());
        store.setValue(AiSettings.TIMEOUT, timeoutSpinner.getSelection());

        apiKeys.put(currentProvider, apiKeyText.getText());
        try {
            for (Map.Entry<AiProvider, String> entry : apiKeys.entrySet()) {
                if (!entry.getValue().trim().equals(AiSettings.getApiKey(entry.getKey()))) {
                    AiSettings.setApiKey(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
            setErrorMessage(Messages.getString("AiPreferencePage.error.saveApiKey")); //$NON-NLS-1$
            return false;
        }
        return super.performOk();
    }
}
