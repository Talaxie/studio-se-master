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

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ResourceLocator;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.part.ViewPart;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.core.ui.i18n.Messages;
import org.talend.core.ui.preference.ai.AiPreferencePage;
import org.talend.core.ui.preference.ai.AiSettings;

/**
 * "AI" view: assistant connected to the LLM configured in Talaxie > AI, the conversation is shown as message bubbles.
 * When no AI connection is active, only a message and a button to the preferences are shown.
 * <p>
 * The job opened in the active editor is described to the model with each message; when the user asks to modify it,
 * the model answers with a "talaxie-actions" block which is applied to the job (see {@link IAiJobService}).
 */
public class AiAssistantView extends ViewPart {

    public static final String ID = "org.talend.core.ui.ai.AiAssistantView"; //$NON-NLS-1$

    private static final String ACTIONS_BLOCK_START = "```talaxie-actions"; //$NON-NLS-1$

    private static final Pattern ACTIONS_BLOCK = Pattern.compile("```talaxie-actions\\s*(.*?)```", Pattern.DOTALL); //$NON-NLS-1$

    private static final String SYSTEM_PROMPT = "You are the assistant built into Talaxie Open Studio, an open source " //$NON-NLS-1$
            + "data integration (ETL) studio forked from Talend Open Studio. You help users design, understand, debug and " //$NON-NLS-1$
            + "modify Talaxie jobs: components (tMap, tDBInput, tFileInputDelimited, tRunJob, tDie...), schemas, contexts, " //$NON-NLS-1$
            + "metadata, routines (Java), expressions and the generated Java code. Answer in the language of the user, be " //$NON-NLS-1$
            + "concise and practical, and say so when you are not sure of a component behavior instead of guessing.\n\n" //$NON-NLS-1$
            + "Each message of the user is preceded by <current_job>, the description of the job open in the editor " //$NON-NLS-1$
            + "(components with their unique names and main parameters, connections, and what is selected in the editor: " //$NON-NLS-1$
            + "use it when the user refers to \"the selected component\", \"this link\", \"these components\"...; if nothing " //$NON-NLS-1$
            + "is selected, ask which element is meant), and possibly by " //$NON-NLS-1$
            + "<last_modifications_report>, the result of the modifications you asked previously: fix the errors it reports.\n\n" //$NON-NLS-1$
            + "When the user asks you to modify the job, explain in one or two sentences what you do, then end your answer " //$NON-NLS-1$
            + "with exactly one block in this format (it is applied automatically to the job, the user can undo it):\n" //$NON-NLS-1$
            + "```talaxie-actions\n[ ...actions... ]\n```\n" //$NON-NLS-1$
            + "Never write this block when the user does not ask for a modification, and never show it as an example. " //$NON-NLS-1$
            + "The actions are JSON objects:\n" //$NON-NLS-1$
            + "- {\"action\": \"add_component\", \"component\": \"tDie\", \"ref\": \"die\", \"after\": \"tLogRow_1\", \"params\": {...}}: " //$NON-NLS-1$
            + "adds a component; \"ref\" (optional) names it for the next actions, \"after\" (optional) places it to the right of " //$NON-NLS-1$
            + "a component.\n" //$NON-NLS-1$
            + "- {\"action\": \"set_params\", \"component\": \"tDie_1\", \"params\": {\"PARAMETER_NAME\": value}}: changes parameters.\n" //$NON-NLS-1$
            + "- {\"action\": \"connect\", \"from\": \"tLogRow_1\", \"to\": \"die\", \"type\": \"ON_SUBJOB_OK\"}: connects two components; " //$NON-NLS-1$
            + "type is FLOW_MAIN, ON_SUBJOB_OK, ON_SUBJOB_ERROR, ON_COMPONENT_OK, ON_COMPONENT_ERROR, RUN_IF (with \"condition\": " //$NON-NLS-1$
            + "a Java boolean expression), ITERATE or FLOW_REJECT.\n" //$NON-NLS-1$
            + "- {\"action\": \"delete_component\", \"component\": \"tDie_1\"}: deletes a component and its connections.\n" //$NON-NLS-1$
            + "- {\"action\": \"delete_connection\", \"connection\": \"row1\"} or {\"action\": \"delete_connection\", \"from\": " //$NON-NLS-1$
            + "\"tLogRow_1\", \"to\": \"tDie_1\", \"type\": \"ON_SUBJOB_OK\"}: deletes a connection (by its name, or by its " //$NON-NLS-1$
            + "components and optionally its type).\n" //$NON-NLS-1$
            + "Notes (the yellow sticky notes of the job) are NOT components: there is no tNote, never use add_component, " //$NON-NLS-1$
            + "set_params or delete_component for them. They are listed under \"Notes\" in <current_job> as note1, note2...:\n" //$NON-NLS-1$
            + "- {\"action\": \"add_note\", \"text\": \"...\", \"ref\": \"n\", \"near\": \"tLogRow_1\"}: adds a note; \"near\" " //$NON-NLS-1$
            + "(optional) places it above a component, or give \"x\" and \"y\"; it accepts the properties of update_note.\n" //$NON-NLS-1$
            + "- {\"action\": \"update_note\", \"note\": \"note1\", \"text\": \"...\"}: changes a note; optional properties: " //$NON-NLS-1$
            + "\"text\", \"x\" and \"y\", \"width\" and \"height\", \"color\" (background, \"#RRGGBB\"), \"text_color\", " //$NON-NLS-1$
            + "\"border_color\", \"font\", \"font_size\" (e.g. \"12\"), \"bold\" and \"italic\" (true/false). The text of a note " //$NON-NLS-1$
            + "is plain text, not a Java expression (no quotes).\n" //$NON-NLS-1$
            + "- {\"action\": \"delete_note\", \"note\": \"note1\"}: deletes a note.\n" //$NON-NLS-1$
            + "Rules: reference the existing components by their unique names from <current_job>. Parameter names are the " //$NON-NLS-1$
            + "Talend internal names (e.g. tDie: MESSAGE, CODE, PRIORITY). Text parameters are Java expressions: a literal " //$NON-NLS-1$
            + "string keeps its double quotes inside the JSON string, e.g. \"MESSAGE\": \"\\\"Done\\\"\"; a number is written " //$NON-NLS-1$
            + "as a string, e.g. \"CODE\": \"21\". A list parameter takes one of its values (e.g. \"PRIORITY\": \"INFO\"). " //$NON-NLS-1$
            + "To run a component at the end of the job, connect it with ON_SUBJOB_OK from the first component of the last " //$NON-NLS-1$
            + "subjob. The modifications are not saved: the user saves the job."; //$NON-NLS-1$

    /** Maximum width of a bubble compared to the conversation width */
    private static final double BUBBLE_WIDTH_RATIO = 0.85;

    private Display display;

    private AiTheme theme;

    private Color background;

    private Composite pages;

    private StackLayout pagesLayout;

    private Composite notConfiguredPage;

    private Composite chatPage;

    private ScrolledComposite scrolled;

    private Composite conversation;

    private Text inputText;

    private Button sendButton;

    private Image sendImage;

    private Image stopImage;

    private IAction newConversationAction;

    private final List<AiChatMessage> messages = new ArrayList<>();

    /** Report of the last modifications of the job, sent to the model with the next message */
    private String lastModificationsReport;

    /** Request in progress, null if none */
    private volatile AiChatClient currentClient;

    private ChatBubble typingBubble;

    private ChatBubble answerBubble;

    private final IPropertyChangeListener settingsListener = event -> {
        if (event.getProperty() != null && event.getProperty().startsWith("AI_") && display != null //$NON-NLS-1$
                && !display.isDisposed()) {
            display.asyncExec(this::updateState);
        }
    };

    @Override
    public void createPartControl(Composite parent) {
        display = parent.getDisplay();
        theme = AiTheme.get();
        background = theme.viewBackground;
        sendImage = createImage("icons/ai_send.png"); //$NON-NLS-1$
        stopImage = createImage("icons/ai_stop.png"); //$NON-NLS-1$

        parent.setLayout(new FillLayout());
        pages = new Composite(parent, SWT.NONE);
        pagesLayout = new StackLayout();
        pages.setLayout(pagesLayout);
        AiTheme.setColors(pages, background, null);

        createNotConfiguredPage();
        createChatPage();
        createActions();

        AiSettings.getPreferenceStore().addPropertyChangeListener(settingsListener);
        updateState();
    }

    private static Image createImage(String path) {
        ImageDescriptor descriptor = ResourceLocator.imageDescriptorFromBundle(CoreUIPlugin.class, path).orElse(null);
        return descriptor == null ? null : descriptor.createImage();
    }

    /** "New conversation" in the tool bar of the view, "Configure" in its menu */
    private void createActions() {
        newConversationAction = new Action(Messages.getString("AiAssistantView.newConversation")) { //$NON-NLS-1$

            @Override
            public void run() {
                newConversation();
            }
        };
        newConversationAction.setToolTipText(newConversationAction.getText());
        newConversationAction.setImageDescriptor(
                PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ETOOL_CLEAR));

        IAction configureAction = new Action(Messages.getString("AiAssistantView.configure")) { //$NON-NLS-1$

            @Override
            public void run() {
                openPreferences();
            }
        };

        IToolBarManager toolBar = getViewSite().getActionBars().getToolBarManager();
        toolBar.add(newConversationAction);
        getViewSite().getActionBars().getMenuManager().add(newConversationAction);
        getViewSite().getActionBars().getMenuManager().add(configureAction);
        getViewSite().getActionBars().updateActionBars();
    }

    /** No AI connection: a message and a button to the preferences */
    private void createNotConfiguredPage() {
        notConfiguredPage = new Composite(pages, SWT.NONE);
        notConfiguredPage.setLayout(new GridLayout(1, false));
        AiTheme.setColors(notConfiguredPage, background, null);

        Composite center = new Composite(notConfiguredPage, SWT.NONE);
        center.setLayout(new GridLayout(1, false));
        center.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true));
        AiTheme.setColors(center, background, null);

        Label message = new Label(center, SWT.WRAP | SWT.CENTER);
        message.setText(Messages.getString("AiAssistantView.notConfigured")); //$NON-NLS-1$
        AiTheme.setColors(message, background, theme.text);
        GridData messageData = new GridData(SWT.CENTER, SWT.CENTER, true, false);
        messageData.widthHint = 220;
        message.setLayoutData(messageData);

        Button configureButton = new Button(center, SWT.PUSH);
        configureButton.setText(Messages.getString("AiAssistantView.configure")); //$NON-NLS-1$
        configureButton.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false));
        configureButton.addListener(SWT.Selection, e -> openPreferences());
    }

    private void createChatPage() {
        chatPage = new Composite(pages, SWT.NONE);
        GridLayout layout = new GridLayout(1, false);
        layout.marginWidth = 0;
        layout.marginHeight = 0;
        layout.verticalSpacing = 0;
        chatPage.setLayout(layout);
        AiTheme.setColors(chatPage, background, null);

        // conversation
        scrolled = new ScrolledComposite(chatPage, SWT.V_SCROLL);
        scrolled.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        scrolled.setExpandHorizontal(true);
        AiTheme.setColors(scrolled, background, null);
        conversation = new Composite(scrolled, SWT.NONE);
        GridLayout conversationLayout = new GridLayout(1, false);
        conversationLayout.marginWidth = 10;
        conversationLayout.marginHeight = 10;
        conversationLayout.verticalSpacing = 10;
        conversation.setLayout(conversationLayout);
        AiTheme.setColors(conversation, background, null);
        scrolled.setContent(conversation);
        scrolled.addListener(SWT.Resize, e -> relayoutConversation(false));

        // input area: the text and the send button, same height
        Composite footer = new Composite(chatPage, SWT.NONE);
        GridLayout footerLayout = new GridLayout(2, false);
        footerLayout.marginWidth = 10;
        footerLayout.marginHeight = 10;
        footerLayout.horizontalSpacing = 6;
        footer.setLayout(footerLayout);
        footer.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false));
        AiTheme.setColors(footer, background, null);

        inputText = new Text(footer, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
        GridData inputData = new GridData(SWT.FILL, SWT.FILL, true, false);
        inputData.heightHint = inputText.getLineHeight() * 3;
        inputText.setLayoutData(inputData);
        inputText.setMessage(Messages.getString("AiAssistantView.inputHint")); //$NON-NLS-1$
        inputText.addListener(SWT.KeyDown, e -> {
            // Enter sends the message, Shift+Enter inserts a new line
            if ((e.keyCode == SWT.CR || e.keyCode == SWT.KEYPAD_CR) && (e.stateMask & SWT.SHIFT) == 0) {
                e.doit = false;
                if (currentClient == null) {
                    send();
                }
            }
        });

        sendButton = new Button(footer, SWT.PUSH);
        GridData sendData = new GridData(SWT.FILL, SWT.FILL, false, true);
        sendData.widthHint = 44;
        sendButton.setLayoutData(sendData);
        sendButton.addListener(SWT.Selection, e -> {
            AiChatClient client = currentClient;
            if (client == null) {
                send();
            } else {
                client.cancel();
            }
        });
    }

    @Override
    public void setFocus() {
        if (pagesLayout != null && pagesLayout.topControl == chatPage && inputText != null && !inputText.isDisposed()) {
            inputText.setFocus();
        } else if (pages != null && !pages.isDisposed()) {
            pages.setFocus();
        }
    }

    @Override
    public void dispose() {
        AiSettings.getPreferenceStore().removePropertyChangeListener(settingsListener);
        AiChatClient client = currentClient;
        if (client != null) {
            client.cancel();
        }
        if (sendImage != null) {
            sendImage.dispose();
        }
        if (stopImage != null) {
            stopImage.dispose();
        }
        super.dispose();
    }

    private void openPreferences() {
        PreferencesUtil.createPreferenceDialogOn(pages.getShell(), AiPreferencePage.PAGE_ID, null, null).open();
    }

    /** An AI connection is active: enabled, with a model and an API key when the provider needs one */
    private static boolean isAiConfigured() {
        if (!AiSettings.isEnabled() || AiSettings.getModel().isBlank()) {
            return false;
        }
        return !AiSettings.getProvider().isApiKeyRequired() || !AiSettings.getApiKey().isBlank();
    }

    /** Shows the conversation or the "no AI" page, according to the preferences */
    private void updateState() {
        if (pages == null || pages.isDisposed()) {
            return;
        }
        boolean configured = isAiConfigured();
        pagesLayout.topControl = configured ? chatPage : notConfiguredPage;
        updateButtons();
        pages.layout(true, true);
    }

    private void updateButtons() {
        boolean running = currentClient != null;
        String tooltip = Messages.getString(running ? "AiAssistantView.stop" : "AiAssistantView.send"); //$NON-NLS-1$ //$NON-NLS-2$
        Image image = running ? stopImage : sendImage;
        if (image != null) {
            sendButton.setImage(image);
            sendButton.setText(""); //$NON-NLS-1$
        } else {
            sendButton.setText(tooltip);
        }
        sendButton.setToolTipText(AiSettings.getProvider().getLabel() + " - " + AiSettings.getModel() + "\n" + tooltip); //$NON-NLS-1$ //$NON-NLS-2$
        if (newConversationAction != null) {
            newConversationAction.setEnabled(!running);
        }
    }

    private void newConversation() {
        messages.clear();
        lastModificationsReport = null;
        for (Control child : conversation.getChildren()) {
            child.dispose();
        }
        typingBubble = null;
        answerBubble = null;
        relayoutConversation(false);
        inputText.setFocus();
    }

    private void send() {
        if (!isAiConfigured()) {
            updateState();
            return;
        }
        String question = inputText.getText().trim();
        if (question.isEmpty()) {
            return;
        }
        inputText.setText(""); //$NON-NLS-1$
        // the model receives the job open in the editor with the question, only the question is shown
        messages.add(new AiChatMessage(AiChatMessage.Role.USER, getJobContext() + question));
        addBubble(ChatBubble.Kind.USER, question);
        typingBubble = addBubble(ChatBubble.Kind.TYPING, null);
        answerBubble = null;

        final AiChatClient client = new AiChatClient();
        currentClient = client;
        updateButtons();
        final List<AiChatMessage> history = new ArrayList<>(messages);
        final StringBuilder answer = new StringBuilder();

        Thread thread = new Thread(() -> {
            AiChatClient.Result result = null;
            String error = null;
            try {
                result = client.send(SYSTEM_PROMPT, history, new AiChatClient.Listener() {

                    @Override
                    public void onText(String text) {
                        final String current;
                        synchronized (answer) {
                            answer.append(text);
                            current = answer.toString();
                        }
                        asyncUI(() -> showAnswer(current));
                    }

                    @Override
                    public void onInfo(String info) {
                        asyncUI(() -> addInfo(info));
                    }
                });
            } catch (Exception e) {
                if (!client.isCancelled()) {
                    error = e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage();
                }
            }
            final AiChatClient.Result finalResult = result;
            final String finalError = error;
            final String finalAnswer;
            synchronized (answer) {
                finalAnswer = answer.toString();
            }
            asyncUI(() -> answerFinished(client, finalResult, finalError, finalAnswer));
        }, "Talaxie AI assistant"); //$NON-NLS-1$
        thread.setDaemon(true);
        thread.start();
    }

    /** Description of the job open in the editor and report of the last modifications, sent before the question */
    private String getJobContext() {
        StringBuilder context = new StringBuilder();
        IAiJobService jobService = IAiJobService.get();
        String job = jobService == null ? null : jobService.getActiveJobDescription();
        context.append("<current_job>\n").append(job == null ? "No job is open in the editor.\n" : job) //$NON-NLS-1$ //$NON-NLS-2$
                .append("</current_job>\n"); //$NON-NLS-1$
        if (lastModificationsReport != null) {
            context.append("<last_modifications_report>\n").append(lastModificationsReport) //$NON-NLS-1$
                    .append("\n</last_modifications_report>\n"); //$NON-NLS-1$
            lastModificationsReport = null;
        }
        return context.append('\n').toString();
    }

    /** Shows the answer received so far: the "..." bubble is replaced by the answer, the actions block is hidden */
    private void showAnswer(String answer) {
        String visible = getVisibleText(answer);
        if (visible.isBlank()) {
            return;
        }
        if (answerBubble == null) {
            removeTypingBubble();
            answerBubble = addBubble(ChatBubble.Kind.ASSISTANT, ""); //$NON-NLS-1$
        }
        answerBubble.setText(visible);
        relayoutConversation(true);
    }

    /** The answer without the leading empty lines and the actions block (also while the block is being received) */
    private static String getVisibleText(String text) {
        String answer = text.stripLeading();
        int start = answer.indexOf(ACTIONS_BLOCK_START);
        if (start >= 0) {
            return answer.substring(0, start).stripTrailing();
        }
        // the beginning of the block may be received: hide a trailing "`", "``", "```t"...
        for (int length = Math.min(ACTIONS_BLOCK_START.length() - 1, answer.length()); length > 0; length--) {
            if (answer.endsWith(ACTIONS_BLOCK_START.substring(0, length))) {
                return answer.substring(0, answer.length() - length).stripTrailing();
            }
        }
        return answer;
    }

    private void answerFinished(AiChatClient client, AiChatClient.Result result, String error, String answer) {
        currentClient = null;
        removeTypingBubble();
        if (error != null) {
            addBubble(ChatBubble.Kind.ERROR, Messages.getString("AiPreferencePage.error.connection", error)); //$NON-NLS-1$
            // the question is removed from the history so the conversation stays valid
            removeLastQuestion();
        } else if (result != null && result.isRefused()) {
            addBubble(ChatBubble.Kind.ERROR, Messages.getString("AiAssistantView.refused")); //$NON-NLS-1$
            removeLastQuestion();
        } else if (answer.isBlank()) {
            addInfo(Messages.getString(client.isCancelled() ? "AiAssistantView.cancelled" : "AiAssistantView.emptyAnswer")); //$NON-NLS-1$ //$NON-NLS-2$
            removeLastQuestion();
        } else {
            messages.add(new AiChatMessage(AiChatMessage.Role.ASSISTANT, answer));
            if (client.isCancelled()) {
                addInfo(Messages.getString("AiAssistantView.cancelled")); //$NON-NLS-1$
            } else {
                if (result != null && result.isTruncated()) {
                    addInfo(Messages.getString("AiAssistantView.truncated")); //$NON-NLS-1$
                }
                applyJobModifications(answer);
            }
        }
        answerBubble = null;
        updateButtons();
        relayoutConversation(true);
        inputText.setFocus();
    }

    /** Applies the actions block of the answer to the job open in the editor */
    private void applyJobModifications(String answer) {
        Matcher matcher = ACTIONS_BLOCK.matcher(answer);
        if (!matcher.find()) {
            return;
        }
        IAiJobService jobService = IAiJobService.get();
        if (jobService == null) {
            addBubble(ChatBubble.Kind.ERROR, Messages.getString("AiAssistantView.noJobService")); //$NON-NLS-1$
            return;
        }
        IAiJobService.Modification modification = jobService.applyActions(matcher.group(1).trim());
        lastModificationsReport = modification.getReport();
        ChatBubble bubble = addBubble(ChatBubble.Kind.ACTIONS, modification.getReport());
        if (modification.hasChanges()) {
            bubble.setAction(Messages.getString("AiAssistantView.undo"), () -> undoModification(bubble, modification)); //$NON-NLS-1$
            relayoutConversation(true);
        }
    }

    /** "Undo the modification": the bubble becomes gray and the button is replaced by a text */
    private void undoModification(ChatBubble bubble, IAiJobService.Modification modification) {
        String error = modification.undo();
        if (error == null) {
            bubble.setStatus(Messages.getString("AiAssistantView.undone"), true); //$NON-NLS-1$
            // the model is told that its modifications were undone
            lastModificationsReport = "The user undid these modifications:\n" + modification.getReport(); //$NON-NLS-1$
        } else {
            addInfo(error);
        }
        relayoutConversation(false);
    }

    private void removeTypingBubble() {
        if (typingBubble != null && !typingBubble.isDisposed()) {
            typingBubble.dispose();
        }
        typingBubble = null;
    }

    private void removeLastQuestion() {
        if (!messages.isEmpty() && messages.get(messages.size() - 1).getRole() == AiChatMessage.Role.USER) {
            messages.remove(messages.size() - 1);
        }
    }

    private ChatBubble addBubble(ChatBubble.Kind kind, String text) {
        ChatBubble bubble = new ChatBubble(conversation, kind, theme);
        if (text != null) {
            bubble.setText(text);
        }
        GridData data = new GridData(kind == ChatBubble.Kind.USER ? SWT.END : SWT.BEGINNING, SWT.TOP, true, false);
        bubble.setLayoutData(data);
        // the bubble text has no scroll bar: the mouse wheel scrolls the conversation
        Control content = bubble.getContentControl();
        if (content != null) {
            content.addListener(SWT.MouseVerticalWheel, e -> {
                Point origin = scrolled.getOrigin();
                scrolled.setOrigin(origin.x, Math.max(0, origin.y - e.count * 20));
            });
        }
        relayoutConversation(true);
        return bubble;
    }

    /** Information shown in the conversation (not a message): small gray text */
    private void addInfo(String info) {
        Label label = new Label(conversation, SWT.WRAP | SWT.CENTER);
        label.setText(info);
        AiTheme.setColors(label, background, theme.secondaryText);
        label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
        relayoutConversation(true);
    }

    /**
     * Computes the width of the bubbles (wrapped at a percentage of the view width) and the size of the conversation.
     *
     * @param scrollToEnd true to show the last message
     */
    private void relayoutConversation(boolean scrollToEnd) {
        if (conversation == null || conversation.isDisposed()) {
            return;
        }
        int width = scrolled.getClientArea().width;
        layoutConversation(width);
        // the vertical scroll bar may appear (or disappear) with the new size and change the available width
        if (scrolled.getClientArea().width != width) {
            layoutConversation(scrolled.getClientArea().width);
        }
        if (scrollToEnd) {
            Point size = conversation.getSize();
            scrolled.setOrigin(0, Math.max(0, size.y - scrolled.getClientArea().height));
        }
    }

    private void layoutConversation(int width) {
        GridLayout layout = (GridLayout) conversation.getLayout();
        int available = Math.max(50, width - 2 * layout.marginWidth);
        int maxBubbleWidth = (int) (available * BUBBLE_WIDTH_RATIO);
        for (Control child : conversation.getChildren()) {
            GridData data = (GridData) child.getLayoutData();
            if (child instanceof ChatBubble) {
                data.widthHint = Math.min(((ChatBubble) child).getPreferredContentWidth(), maxBubbleWidth);
            } else {
                data.widthHint = available;
            }
        }
        Point size = conversation.computeSize(width, SWT.DEFAULT, true);
        conversation.setSize(Math.max(width, size.x), size.y);
        conversation.layout(true, true);
        scrolled.setMinSize(size);
    }

    private void asyncUI(Runnable runnable) {
        if (display != null && !display.isDisposed()) {
            display.asyncExec(() -> {
                if (conversation != null && !conversation.isDisposed()) {
                    runnable.run();
                }
            });
        }
    }
}
