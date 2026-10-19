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

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

/**
 * A message bubble of the assistant conversation: a rounded box with a selectable text, or the animated "..." shown
 * while the assistant is thinking.
 */
public class ChatBubble extends Composite {

    public enum Kind {
        USER,
        ASSISTANT,
        /** animated dots while waiting for the answer */
        TYPING,
        /** error shown in the conversation */
        ERROR,
        /** report of the modifications applied to the job */
        ACTIONS
    }

    private static final int ARC = 14;

    private static final int PADDING = 9;

    private static final int DOT_SIZE = 6;

    private static final int DOT_SPACING = 5;

    private static final int ANIMATION_DELAY = 350;

    private final Kind kind;

    private final AiTheme theme;

    private Color background;

    private Color border;

    private StyledText text;

    /** Button under the text (e.g. "Undo the modification"), null if none */
    private Button actionButton;

    /** Status shown under the text instead of the button (e.g. "The modification was undone"), null if none */
    private Label statusLabel;

    private Canvas dots;

    private int animationStep;

    public ChatBubble(Composite parent, Kind kind, AiTheme theme) {
        super(parent, SWT.DOUBLE_BUFFERED);
        this.kind = kind;
        this.theme = theme;
        Color foreground;
        switch (kind) {
        case USER:
            background = theme.userBubble;
            border = background;
            foreground = theme.text;
            break;
        case ERROR:
            background = theme.errorBubble;
            border = theme.errorBorder;
            foreground = theme.errorText;
            break;
        case ACTIONS:
            background = theme.actionsBubble;
            border = theme.actionsBorder;
            foreground = theme.actionsText;
            break;
        case ASSISTANT:
        case TYPING:
        default:
            background = theme.assistantBubble;
            border = background;
            foreground = theme.text;
            break;
        }
        // the bubble is drawn on the background of the conversation
        AiTheme.setColors(this, theme.viewBackground, null);

        // GridLayout (not FillLayout) because it removes the margins from the width given to the text, so the wrapped
        // text computes its height for its real width
        GridLayout layout = new GridLayout(1, false);
        layout.marginWidth = PADDING;
        layout.marginHeight = PADDING - 2;
        setLayout(layout);

        if (kind == Kind.TYPING) {
            dots = new Canvas(this, SWT.DOUBLE_BUFFERED);
            AiTheme.setColors(dots, background, null);
            dots.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
            dots.addListener(SWT.Paint, this::paintDots);
            animate();
        } else {
            text = new StyledText(this, SWT.MULTI | SWT.WRAP | SWT.READ_ONLY);
            text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
            AiTheme.setColors(text, background, foreground);
            text.setCaret(null);
        }

        addListener(SWT.Paint, e -> {
            Rectangle area = getClientArea();
            e.gc.setAntialias(SWT.ON);
            e.gc.setBackground(background);
            e.gc.fillRoundRectangle(0, 0, area.width - 1, area.height - 1, ARC, ARC);
            e.gc.setForeground(border);
            e.gc.drawRoundRectangle(0, 0, area.width - 1, area.height - 1, ARC, ARC);
        });
    }

    public Kind getKind() {
        return kind;
    }

    /** The control showing the text (null for the typing bubble), e.g. to forward the mouse wheel */
    public Control getContentControl() {
        return text != null ? text : dots;
    }

    public void setText(String value) {
        if (text != null) {
            text.setText(value);
        }
    }

    public void appendText(String value) {
        if (text != null) {
            text.append(value);
        }
    }

    public String getText() {
        return text == null ? "" : text.getText(); //$NON-NLS-1$
    }

    /** Adds a button under the text */
    public void setAction(String label, Runnable action) {
        actionButton = new Button(this, SWT.PUSH);
        actionButton.setText(label);
        actionButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        actionButton.addListener(SWT.Selection, e -> action.run());
    }

    /**
     * Replaces the button by a status text.
     *
     * @param gray true to show the bubble in gray (e.g. the modification it reports was undone)
     */
    public void setStatus(String status, boolean gray) {
        if (actionButton != null) {
            actionButton.dispose();
            actionButton = null;
        }
        if (gray) {
            background = theme.assistantBubble;
            border = theme.assistantBubble;
            if (text != null) {
                AiTheme.setColors(text, background, theme.secondaryText);
            }
        }
        if (statusLabel == null) {
            statusLabel = new Label(this, SWT.WRAP);
            statusLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
            statusLabel.setFont(JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT));
        }
        statusLabel.setText(status);
        AiTheme.setColors(statusLabel, background, theme.secondaryText);
        redraw();
    }

    /** Natural width of the content, without wrapping */
    public int getPreferredContentWidth() {
        if (dots != null) {
            return 3 * DOT_SIZE + 2 * DOT_SPACING + 2 * PADDING;
        }
        int width = text.computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
        if (actionButton != null) {
            width = Math.max(width, actionButton.computeSize(SWT.DEFAULT, SWT.DEFAULT).x);
        }
        if (statusLabel != null) {
            width = Math.max(width, statusLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT).x);
        }
        return width + 2 * PADDING;
    }

    @Override
    public org.eclipse.swt.graphics.Point computeSize(int wHint, int hHint, boolean changed) {
        if (dots != null) {
            return new org.eclipse.swt.graphics.Point(getPreferredContentWidth(), DOT_SIZE + 2 * (PADDING + 2));
        }
        org.eclipse.swt.graphics.Point size = super.computeSize(wHint, hHint, changed);
        if (wHint != SWT.DEFAULT) {
            // the wrapped text can be narrower than the given width: keep the given width, otherwise the bubble shrinks,
            // the text wraps on more lines and the height computed for the given width is too small
            size.x = wHint;
        }
        return size;
    }

    private void paintDots(org.eclipse.swt.widgets.Event e) {
        Rectangle area = dots.getClientArea();
        e.gc.setAntialias(SWT.ON);
        int totalWidth = 3 * DOT_SIZE + 2 * DOT_SPACING;
        int x = (area.width - totalWidth) / 2;
        int y = (area.height - DOT_SIZE) / 2;
        for (int i = 0; i < 3; i++) {
            boolean active = i == animationStep % 3;
            e.gc.setBackground(active ? theme.typingDotActive : theme.typingDot);
            int size = active ? DOT_SIZE : DOT_SIZE - 2;
            int offset = (DOT_SIZE - size) / 2;
            e.gc.fillOval(x + i * (DOT_SIZE + DOT_SPACING) + offset, y + offset - (active ? 1 : 0), size, size);
        }
    }

    private void animate() {
        getDisplay().timerExec(ANIMATION_DELAY, () -> {
            if (isDisposed() || dots == null || dots.isDisposed()) {
                return;
            }
            animationStep++;
            dots.redraw();
            animate();
        });
    }
}
