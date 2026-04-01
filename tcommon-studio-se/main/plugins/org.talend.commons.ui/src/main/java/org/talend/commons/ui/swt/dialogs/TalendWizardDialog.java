// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.swt.dialogs;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.ColorConstants;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class TalendWizardDialog extends WizardDialog implements ITalendWizardContainer {

    private boolean useNewStyle = false;

    private Color backgroundColor;

    private Color foregroundColor;

    private static Font titleBigFont;

    private Canvas titleLabelWithAnimation;

    private Canvas messagePanel;

    private Color msgPanelColor = ColorConstants.INFO_COLOR;

    private Composite topPanel;

    private Label errIcon;

    private StyledText errMsgTxt;

    private Hyperlink moreInfoLink;

    private String moreInfoUrl;

    private volatile Thread titleAnimationSchedulerThread;

    private volatile boolean threadShowingMsg = false;

    private Image bigTitleImg;

    private Image smallTitleImg;

    private String title;

    private int messageTopY;

    private volatile double percentage = 1.0;

    private boolean hideMessageArea = false;

    public TalendWizardDialog(Shell parentShell, IWizard newWizard) {
        super(parentShell, newWizard);
        useNewStyle = true;
        if (newWizard instanceof ITalendWizard) {
            ITalendWizard talendWizard = (ITalendWizard) newWizard;
            backgroundColor = talendWizard.getBackgroundColor();
            foregroundColor = talendWizard.getForegroundColor();
            hideMessageArea = talendWizard.hideDefaultMessageArea();
        }
//        this.setTitleAreaColor(new RGB(205, 227, 242));
    }

    private Thread createTitleAnimationSchedulerThread(boolean showMessage) {
        return new Thread(new Runnable() {

            @Override
            public void run() {
                titleAnimationSchedulerThread(showMessage);
            }
        }, "title anmimation, show: " + showMessage);
    }

    private void titleAnimationSchedulerThread(boolean showMessage) {
        int totalTime = 500;
        int split = 30;
        int sleepTime = totalTime / split;
        double percentPerFrame = 1.0 / split;
        for (int i = 1; i < split; i++) {
            double curX = 1 - percentPerFrame * i;
            double donePercent = Math.sqrt(1 - curX * curX);
            onTitleAreaRefresh(donePercent, showMessage);
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                onTitleAnimationInterupted(showMessage);
                return;
            }
        }
        onTitleAreaRefresh(1.0, showMessage);
    }

    private void onTitleAnimationInterupted(boolean showMessage) {
        this.percentage = 1.0;
    }

    private boolean isHideMessageArea() {
        return hideMessageArea;
    }

    private void onTitleAreaRefresh(double donePercent, boolean showMessage) {
        if (isHideMessageArea()) {
            return;
        }
        topPanel.getDisplay().syncExec(() -> {
            onTitleAreaRefreshFrame(donePercent, showMessage);
        });
    }

    private void onTitleAreaRefreshFrame(double donePercent, boolean showMessage) {
        if (isHideMessageArea()) {
            return;
        }
        this.percentage = donePercent;
        sortPanelOrder();
        if (!showMessage) {
            messagePanel.setVisible(false);
        } else {
            messagePanel.setVisible(true);
//            errIcon.setVisible(true);
        }
        Point size = topPanel.getSize();
        int totalY = size.y - messageTopY;
        int y = 0;
        if (showMessage) {
            y = messageTopY + (int) ((1.0 - donePercent) * totalY);
        } else {
            y = messageTopY + (int) (donePercent * totalY);
        }

        FormData fd = (FormData) messagePanel.getLayoutData();
        fd.top = new FormAttachment(0, y);
        this.titleLabelWithAnimation.redraw();
        topPanel.layout();
    }

    public void setNewErrorStyle(boolean newErrStyle) {
        this.useNewStyle = newErrStyle;
    }

    @Override
    protected Control createContents(Composite parent) {
        if (useNewStyle()) {
            parent.setBackground(backgroundColor);
            parent.setForeground(foregroundColor);
        }
        Control panel = super.createContents(parent);
        try {
            if (useNewStyle()) {
                sortPanelOrder();
                workArea.setBackground(backgroundColor);
                workArea.setForeground(foregroundColor);
                pageContainer.setBackground(backgroundColor);
                pageContainer.setForeground(foregroundColor);
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return panel;
    }

    private boolean useNewStyle() {
        return this.useNewStyle;
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite panel = (Composite) super.createDialogArea(parent);
        if (useNewStyle()) {
            this.titleBarSeparator.dispose();
            this.separator.dispose();
        }
        return panel;
    }

    @Override
    protected ProgressMonitorPart createProgressMonitorPart(Composite composite, GridLayout pmlayout) {
        if (useNewStyle()) {
            composite.setBackground(backgroundColor);
            composite.setForeground(foregroundColor);
//            progMonitor.setBackground(backgroundColor);
//            progMonitor.setForeground(foregroundColor);
        }
        ProgressMonitorPart progMonitor = super.createProgressMonitorPart(composite, pmlayout);
        return progMonitor;
    }

    @Override
    protected Control createButtonBar(Composite parent) {
        if (!useNewStyle()) {
            return super.createButtonBar(parent);
        }
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setBackground(backgroundColor);
        composite.setForeground(foregroundColor);
        GridLayout layout = new GridLayout();
        layout.marginWidth = 0;
        layout.marginHeight = 0;
        layout.horizontalSpacing = 0;
        composite.setLayout(layout);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
        composite.setFont(parent.getFont());

        Control helpControl = null;
        // create help control if needed
        if (isHelpAvailable()) {
            helpControl = createHelpControl(composite);
            ((GridData) helpControl.getLayoutData()).horizontalIndent = convertHorizontalDLUsToPixels(
                    IDialogConstants.HORIZONTAL_MARGIN);
        }
        createButtonsForButtonBar(composite);

        Button helpButton = getButton(IDialogConstants.HELP_ID);
        Button finishButton = getButton(IDialogConstants.FINISH_ID);
        Button cancelButton = getButton(IDialogConstants.CANCEL_ID);
        Button backButton = getButton(IDialogConstants.BACK_ID);
        Button nextButton = getButton(IDialogConstants.NEXT_ID);

        FormLayout formLayout = new FormLayout();
        formLayout.marginWidth = getHorizonMargin();
        formLayout.marginHeight = getVerticalPadding();
        composite.setLayout(formLayout);
        final int HORIZON_ALIGN = getHorizonPadding();

        cancelButton.setBackground(backgroundColor);
        cancelButton.setForeground(foregroundColor);
        FormData cancelData = new FormData();
        cancelData.left = new FormAttachment(0);
        cancelData.top = new FormAttachment(composite, 0, SWT.CENTER);
        cancelData.width = getButtonWidth(cancelButton);
        cancelButton.setLayoutData(cancelData);

        Control tmpCtrl = cancelButton;

        if (helpControl != null) {
            helpControl.setBackground(backgroundColor);
            helpControl.setForeground(foregroundColor);
            FormData formData = new FormData();
            formData.left = new FormAttachment(tmpCtrl, HORIZON_ALIGN, SWT.RIGHT);
            formData.top = new FormAttachment(tmpCtrl, 0, SWT.CENTER);
            helpControl.setLayoutData(formData);
            tmpCtrl = helpControl;
        }
        if (helpButton != null) {
            helpButton.setBackground(backgroundColor);
            helpButton.setForeground(foregroundColor);
            FormData formData = new FormData();
            formData.left = new FormAttachment(tmpCtrl, HORIZON_ALIGN, SWT.RIGHT);
            formData.top = new FormAttachment(tmpCtrl, 0, SWT.CENTER);
            formData.width = getButtonWidth(helpButton);
            helpButton.setLayoutData(formData);
            tmpCtrl = helpButton;
        }
        finishButton.setBackground(backgroundColor);
        finishButton.setForeground(foregroundColor);
        FormData finishData = new FormData();
        finishData.right = new FormAttachment(100);
        finishData.top = new FormAttachment(composite, 0, SWT.CENTER);
        finishData.width = getButtonWidth(finishButton);
        finishButton.setLayoutData(finishData);
        tmpCtrl = finishButton;

        if (nextButton != null) {
            nextButton.setBackground(backgroundColor);
            nextButton.setForeground(foregroundColor);
            FormData nextData = new FormData();
            Composite nextParentCtrl = nextButton.getParent();
            nextParentCtrl.setBackground(backgroundColor);
            nextParentCtrl.setForeground(foregroundColor);
            nextData.right = new FormAttachment(tmpCtrl, -HORIZON_ALIGN, SWT.LEFT);
            nextData.top = new FormAttachment(tmpCtrl, 0, SWT.CENTER);
            nextParentCtrl.setLayoutData(nextData);
        }
        if (backButton != null) {
            backButton.setBackground(backgroundColor);
            backButton.setForeground(foregroundColor);
        }

        return composite;
    }

    private int getButtonWidth(Button btn) {
        int widthHint = convertHorizontalDLUsToPixels(IDialogConstants.BUTTON_WIDTH);
        Point minSize = btn.computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
        return Math.max(widthHint, minSize.x);
    }

    @Override
    protected Control createTitleArea(Composite parent) {
        Control titleCtrl = null;
        if (useNewStyle()) {
            final int horizonPadding = getHorizonPadding();
            final int horizonMargin = getHorizonMargin();
            final int verticalPadding = getVerticalPadding();
            final int msgMargin = getMargin();
            Control oldTitleArea = super.createTitleArea(parent);
            topPanel = new Composite(parent, SWT.NONE);
            titleCtrl = topPanel;
//            topPanel.setBackground(ColorConstants.RED_COLOR);
            topPanel.setBackground(backgroundColor);
            topPanel.setForeground(foregroundColor);
            FormData topPanelFd = new FormData();
            topPanelFd.top = new FormAttachment(0);
            topPanelFd.left = new FormAttachment(0);
            topPanelFd.right = new FormAttachment(100);
//            topPanelFd.bottom = new FormAttachment(oldTitleArea, 0, SWT.BOTTOM);
            Label tmpLabel = new Label(parent, SWT.NONE);
//            tmpLabel.setFont(getTitleBigFont());
            tmpLabel.setFont(JFaceResources.getBannerFont());
            tmpLabel.setText("Test");
            tmpLabel.pack();
            Point size = tmpLabel.getSize();
            tmpLabel.setFont(null);
            tmpLabel.setText("Test");
            tmpLabel.pack();
            Point errSize = tmpLabel.getSize();
            tmpLabel.dispose();
            if (isHideMessageArea()) {
                topPanelFd.height = 0;
            } else {
                topPanelFd.height = verticalPadding + size.y + verticalPadding + errSize.y + msgMargin * 2;
            }
            topPanel.setLayoutData(topPanelFd);
            topPanel.setLayout(new FormLayout());
//            sortPanelOrder();

            titleLabelWithAnimation = new Canvas(topPanel, SWT.DOUBLE_BUFFERED);
            titleLabelWithAnimation.addPaintListener(new PaintListener() {

                @Override
                public void paintControl(PaintEvent e) {
                    drawTitle(e);
                }
            });
            titleLabelWithAnimation.setBackground(backgroundColor);
            titleLabelWithAnimation.setForeground(foregroundColor);
            titleLabelWithAnimation.addDisposeListener(new DisposeListener() {

                @Override
                public void widgetDisposed(DisposeEvent e) {
                    if (bigTitleImg != null && !bigTitleImg.isDisposed()) {
                        bigTitleImg.dispose();
                    }
                    if (smallTitleImg != null && !smallTitleImg.isDisposed()) {
                        smallTitleImg.dispose();
                    }
                }
            });

            FormData fd = new FormData();
            fd.top = new FormAttachment(0, verticalPadding);
            fd.left = new FormAttachment(0, horizonMargin);
            fd.right = new FormAttachment(100);
            fd.bottom = new FormAttachment(100);
            titleLabelWithAnimation.setLayoutData(fd);

            messagePanel = new Canvas(topPanel, SWT.DOUBLE_BUFFERED);
            messagePanel.addPaintListener(new PaintListener() {

                @Override
                public void paintControl(PaintEvent e) {
                    drawMessageBackground(e, messagePanel);
//                    int len = 160;
//                    int a = 10;
//                    int a_Len = a + (int) (percentage * (size.x - a));
//                    int b_Len = a_Len + len;
//                    if (a_Len < size.x || b_Len < size.x) {
//                        if (size.x <= a_Len) {
//                            a_Len = size.x;
//                        }
//                        if (size.x <= b_Len) {
//                            b_Len = size.x;
//                        }
//                        e.gc.setBackground(ColorConstants.WHITE_COLOR);
//                        e.gc.fillPolygon(new int[] { a_Len, 0, size.x, 0, size.x, size.y, b_Len, size.y });
//                    }
                }
            });
            messagePanel.setBackground(backgroundColor);
            messagePanel.setForeground(foregroundColor);
            fd = new FormData();
            tmpLabel = new Label(topPanel, SWT.NONE);
            tmpLabel.setFont(JFaceResources.getBannerFont());
            tmpLabel.setText("Test");
            tmpLabel.pack();
            size = tmpLabel.getSize();
            tmpLabel.dispose();
            messageTopY = verticalPadding + size.y + verticalPadding;
            fd.top = new FormAttachment(0, messageTopY);
//            fd.left = new FormAttachment(0, convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING));
//            fd.right = new FormAttachment(100, -convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING));
            fd.left = new FormAttachment(0, horizonMargin);
            fd.right = new FormAttachment(100, -horizonMargin);
            fd.bottom = new FormAttachment(100);
            messagePanel.setLayoutData(fd);
            messagePanel.setLayout(new FormLayout());

            errIcon = new Label(messagePanel, SWT.NONE);
            errIcon.setBackground(msgPanelColor);
            errIcon.setForeground(foregroundColor);
            fd = new FormData();
            fd.top = new FormAttachment(0, msgMargin);
            fd.left = new FormAttachment(0, msgMargin);
            errIcon.setLayoutData(fd);

            moreInfoLink = new Hyperlink(messagePanel, SWT.NONE);
            moreInfoLink.setText("");
            moreInfoLink.setBackground(msgPanelColor);
            moreInfoLink.setUnderlined(true);
            moreInfoLink.addHyperlinkListener(new HyperlinkAdapter() {

                @Override
                public void linkActivated(HyperlinkEvent e) {
                    onMoreInfoLinkClicked(e);
                }
            });

            errMsgTxt = new StyledText(messagePanel, SWT.READ_ONLY | SWT.WRAP);
            errMsgTxt.setEditable(false);
            errMsgTxt.setBackground(msgPanelColor);
            errMsgTxt.setForeground(org.eclipse.draw2d.ColorConstants.black);

            fd = new FormData();
            fd.top = new FormAttachment(errMsgTxt, 0, SWT.CENTER);
            fd.right = new FormAttachment(100, -msgMargin);
            moreInfoLink.setLayoutData(fd);

            fd = new FormData();
            fd.top = new FormAttachment(errIcon, 0, SWT.TOP);
            fd.left = new FormAttachment(errIcon, horizonPadding, SWT.RIGHT);
            fd.right = new FormAttachment(moreInfoLink, -horizonPadding, SWT.LEFT);
            fd.bottom = new FormAttachment(100, -msgMargin);
            errMsgTxt.setLayoutData(fd);

            parent.setBackground(backgroundColor);
//            parent.setBackground(ColorConstants.YELLOW_COLOR);
            titleImageLabel.setBackground(backgroundColor);
            titleLabel.setBackground(backgroundColor);
            titleLabel.moveBelow(null);
            messageImageLabel.setBackground(backgroundColor);
            leftFillerLabel.setBackground(backgroundColor);
            bottomFillerLabel.setBackground(backgroundColor);
            messageLabel.setBackground(backgroundColor);
        } else {
            titleCtrl = super.createTitleArea(parent);
        }
        return titleCtrl;
    }

    private Composite createToolTipContent(Composite parent) {
        Composite result = new Composite(parent, SWT.NONE);
        final int msgMargin = getMargin();
        final int horizonPadding = getHorizonPadding();
        result.setBackground(null);
        result.setLayout(new FormLayout());
        Canvas msgPanel = new Canvas(result, SWT.DOUBLE_BUFFERED);
        FormData fd = new FormData();
        fd.top = new FormAttachment(0);
        fd.left = new FormAttachment(0);
        fd.width = messagePanel.getSize().x;
        fd.bottom = new FormAttachment(100);
        msgPanel.setLayoutData(fd);
        msgPanel.addPaintListener(new PaintListener() {

            @Override
            public void paintControl(PaintEvent e) {
                drawMessageBackground(e, msgPanel);
            }
        });
        msgPanel.setBackground(messagePanel.getBackground());
        msgPanel.setForeground(messagePanel.getForeground());
        msgPanel.setLayout(new FormLayout());

        Label errIconLabel = new Label(msgPanel, SWT.NONE);
        errIconLabel.setBackground(errIcon.getBackground());
        errIconLabel.setForeground(errIcon.getForeground());
        errIconLabel.setImage(errIcon.getImage());
        fd = new FormData();
        fd.top = new FormAttachment(0, msgMargin);
        fd.left = new FormAttachment(0, msgMargin);
        errIconLabel.setLayoutData(fd);

        Hyperlink link = new Hyperlink(msgPanel, SWT.NONE);
        link.setText(moreInfoLink.getText());
        link.setBackground(moreInfoLink.getBackground());
        link.setUnderlined(moreInfoLink.isUnderlined());

        StyledText msgTxt = new StyledText(msgPanel, SWT.READ_ONLY | SWT.WRAP);
        msgTxt.setBackground(errMsgTxt.getBackground());
        msgTxt.setForeground(errMsgTxt.getForeground());
        msgTxt.setText(errMsgTxt.getText());

        fd = new FormData();
        fd.top = new FormAttachment(msgTxt, 0, SWT.CENTER);
        fd.right = new FormAttachment(100, -msgMargin);
        link.setLayoutData(fd);

        fd = new FormData();
        fd.top = new FormAttachment(errIconLabel, 0, SWT.TOP);
        fd.left = new FormAttachment(errIconLabel, horizonPadding, SWT.RIGHT);
        fd.right = new FormAttachment(link, -horizonPadding, SWT.LEFT);
        msgTxt.setLayoutData(fd);
        return result;
    }

    private void onMoreInfoLinkClicked(HyperlinkEvent e) {
        Program.launch(moreInfoUrl);
    }

    @Override
    protected void resetWorkAreaAttachments(Control top) {
        FormData childData = new FormData();
        childData.top = new FormAttachment(topPanel, 0, SWT.BOTTOM);
        childData.right = new FormAttachment(100, 0);
        childData.left = new FormAttachment(0, 0);
        childData.bottom = new FormAttachment(100, 0);
        workArea.setLayoutData(childData);
    }

    @Override
    protected void layoutForNewMessage(boolean forceLayout) {
        if (!useNewStyle()) {
            super.layoutForNewMessage(forceLayout);
            return;
        }
//        if (forceLayout) {
//            return;
//        }
        if (hasMessage()) {
            messagePanel.setVisible(true);
//            Image image = messageImageLabel.getImage();
//            if (image == null) {
//                image = messageImage;
//            }
//            if (image != null && messageImageLabel.isVisible()) {
////                this.errIcon.setVisible(true);
//                this.errIcon.setImage(image);
//            } else {
//                this.errIcon.setImage(null);
////                this.errIcon.setVisible(false);
//            }
            updateMsgPanelColor(pageMessageType);
//            topPanel.layout();
            messagePanel.layout();
            Point messageSize = errMsgTxt.getSize();
            int messageLabelUnclippedHeight = errMsgTxt.computeSize(messageSize.x, SWT.DEFAULT, true).y;
            boolean messageLabelClipped = messageLabelUnclippedHeight > messageSize.y;
            if (errMsgTxt.getData() instanceof ToolTip) {
                ToolTip toolTip = (ToolTip) errMsgTxt.getData();
                toolTip.hide();
                toolTip.deactivate();
                errMsgTxt.setData(null);
            }
            if (messageLabelClipped) {
                ToolTip tooltip = new ToolTip(errMsgTxt, ToolTip.NO_RECREATE, false) {

                    @Override
                    protected Composite createToolTipContentArea(Event event, Composite parent) {
                        return createToolTipContent(parent);
                    }

                    @Override
                    public Point getLocation(Point tipSize, Event event) {
                        return errMsgTxt.getShell().toDisplay(messagePanel.getLocation());
                    }
                };
                errMsgTxt.setData(tooltip);
                tooltip.setPopupDelay(0);
                tooltip.activate();
            }
        }
    }

    @Override
    protected void setImageLabelVisible(boolean visible) {
        super.setImageLabelVisible(visible);
        if (useNewStyle()) {
            messagePanel.setVisible(visible);
            if (visible) {
                errIcon.setImage(messageImageLabel.getImage());
            } else {
                errIcon.setImage(null);
            }
        }
    }

    private void sortPanelOrder() {
        if (isHideMessageArea()) {
            return;
        }
        if (this.topPanel == null) {
            return;
        }
        this.titleImageLabel.moveAbove(null);
        this.topPanel.moveBelow(this.titleImageLabel);
        messagePanel.moveAbove(titleLabelWithAnimation);
        if (!hasMessage()) {
            messagePanel.setVisible(false);
        }
    }

    @Override
    protected void setLayoutsForNormalMessage(int verticalSpacing, int horizontalSpacing) {
        if (isHideMessageArea()) {
            return;
        }
        super.setLayoutsForNormalMessage(verticalSpacing, horizontalSpacing);
        if (useNewStyle()) {
            if (this.topPanel != null) {
                onTitleAreaRefreshFrame(1.0, false);
            }
        }
    }

    private static Font getTitleBigFont() {
        if (titleBigFont != null) {
            return titleBigFont;
        }
        Font bannerFont = JFaceResources.getBannerFont();
        FontData[] fontData = bannerFont.getFontData();
        for (FontData fd : fontData) {
            fd.setHeight(fd.getHeight() + 7);
        }
        titleBigFont = new Font(Display.getDefault(), fontData);
        return titleBigFont;
    }

    @Override
    protected void updateMessage(String newMessage) {
        if (isHideMessageArea()) {
            return;
        }
        boolean hadMsg = hasMessage();
        super.updateMessage(newMessage);
        this.errMsgTxt.setText(this.messageLabel.getText());
        boolean hasMsg = hasMessage();
        messagePanel.setVisible(hasMsg);
        if (hadMsg != hasMsg) {
            startAnimation();
        }
    }

    @Override
    public void setErrorMessage(String newErrorMessage) {
        if (isHideMessageArea()) {
            return;
        }
        if (StringUtils.isNotBlank(newErrorMessage)) {
            this.pageMessageType = IMessageProvider.ERROR;
            updateMsgPanelColor(this.pageMessageType);
        }
        super.setErrorMessage(newErrorMessage);
    }

    @Override
    protected void showMessage(String newMessage, Image newImage) {
        if (isHideMessageArea()) {
            return;
        }
        super.showMessage(newMessage, newImage);
    }

    @Override
    public void setMessage(String newMessage, int newType) {
        if (isHideMessageArea()) {
            return;
        }
        if (StringUtils.isNotBlank(newMessage)) {
            updateMsgPanelColor(newType);
        }
        super.setMessage(newMessage, newType);
    }

    private void updateMsgPanelColor(int type) {
        Color foreColor = getMsgPanelForegroundColor(type);
        msgPanelColor = getMsgPanelBackgroundColor(type);
        errIcon.setBackground(msgPanelColor);
        errMsgTxt.setBackground(msgPanelColor);
        errMsgTxt.setForeground(foreColor);
        moreInfoLink.setBackground(msgPanelColor);
//        moreInfoLink.setForeground(getMoreInfoLinkForegroundColor(type));
        messagePanel.redraw();
    }

    private Color getMsgPanelBackgroundColor(int type) {
        Color color = ColorConstants.INFO_COLOR;
        switch (type) {
        case IMessageProvider.NONE:
        case IMessageProvider.INFORMATION:
            color = ColorConstants.INFO_COLOR;
            break;
        case IMessageProvider.WARNING:
            color = ColorConstants.WARN_COLOR;
            break;
        case IMessageProvider.ERROR:
            color = ColorConstants.ERR_COLOR;
            break;
        }
        return color;
    }

    private Color getMsgPanelForegroundColor(int type) {
        Color color = ColorConstants.WHITE_COLOR;
        switch (type) {
        case IMessageProvider.WARNING:
            color = org.eclipse.draw2d.ColorConstants.black;
            break;
        case IMessageProvider.NONE:
        case IMessageProvider.INFORMATION:
        case IMessageProvider.ERROR:
            color = ColorConstants.WHITE_COLOR;
            break;
        }
        return color;
    }

    private Color getMoreInfoLinkForegroundColor(int type) {
        Color color = null;
        switch (type) {
        case IMessageProvider.NONE:
        case IMessageProvider.INFORMATION:
        case IMessageProvider.ERROR:
            color = ColorConstants.WHITE_COLOR;
            break;
        default:
            break;
        }
        return color;
    }

    private void startAnimation() {
        boolean hasMsg = hasMessage();
        if (this.titleAnimationSchedulerThread != null) {
            if (hasMsg == threadShowingMsg) {
                return;
            } else {
                this.titleAnimationSchedulerThread.interrupt();
            }
        }
        threadShowingMsg = hasMsg;
        titleAnimationSchedulerThread = createTitleAnimationSchedulerThread(threadShowingMsg);
        titleAnimationSchedulerThread.start();
    }

    private boolean hasMessage() {
        return StringUtils.isNotBlank(messageLabel.getText());
    }

    @Override
    public void setTitle(String newTitle) {
        super.setTitle(newTitle);
        if (StringUtils.equals(newTitle, title) && this.bigTitleImg != null) {
            return;
        }
        if (this.titleAnimationSchedulerThread != null) {
            this.titleAnimationSchedulerThread.interrupt();
        }
        this.title = newTitle;
        if (this.bigTitleImg != null) {
            this.bigTitleImg.dispose();
        }
        this.bigTitleImg = createTitleImage(getTitleBigFont(), this.title);
        if (this.smallTitleImg != null) {
            this.smallTitleImg.dispose();
        }
        this.smallTitleImg = createTitleImage(JFaceResources.getBannerFont(), this.title);
        this.titleLabelWithAnimation.redraw();
    }

    @Override
    public void showMoreInfoLink(IDialogPage page, String name, String link) {
        if (isHideMessageArea()) {
            return;
        }
        if (getCurrentPage() != page) {
            return;
        }
        if (StringUtils.isBlank(name)) {
            moreInfoLink.setText("");
            moreInfoLink.setEnabled(false);
        } else {
            moreInfoLink.setEnabled(true);
            moreInfoLink.setText(name);
        }
        moreInfoUrl = link;
        this.moreInfoLink.pack();
        this.moreInfoLink.redraw();
        this.messagePanel.layout();
    }

    @Override
    public void setTitleImage(Image newTitleImage) {
        super.setTitleImage(newTitleImage);
        if (this.titleAreaImage != null) {
            if (this.messageTopY < this.titleAreaImage.getBounds().height) {
                FormData fd = (FormData) messagePanel.getLayoutData();
                Rectangle imgBounds = this.titleAreaImage.getBounds();
                fd.right = new FormAttachment(100, -getHorizonPadding() - imgBounds.width);
                FormData panelFd = (FormData) this.topPanel.getLayoutData();
                int imageY = imgBounds.height;
                int topPanelY = panelFd.height;
                if (topPanelY < imageY) {
                    panelFd.height = imageY;
//            fd.right = new FormAttachment(this.titleImageLabel, -getMargin(), SWT.LEFT);
                    this.topPanel.getParent().layout();
                } else {
                }
                this.topPanel.layout();
            }
        }
    }

    private Image createTitleImage(Font font, String title) {
        Label tmpLabel = new Label(titleLabel.getParent(), SWT.NONE);
        tmpLabel.setText(title);
        tmpLabel.setFont(font);
        tmpLabel.pack();
        Point size = tmpLabel.getSize();
        tmpLabel.dispose();

        int width = size.x;
        if (StringUtils.isEmpty(title)) {
            width = 1;
        }
        Image tmpImg = new Image(Display.getDefault(), width, size.y);
        GC gc = new GC(tmpImg);
        gc.setAntialias(SWT.ON);
        gc.setInterpolation(SWT.HIGH);
        gc.setFont(font);
        gc.setAlpha(0);
        gc.drawRectangle(0, 0, width, size.y);
        gc.setAlpha(255);
        gc.drawText(title, 0, 0, true);
        gc.dispose();

        ImageData imageData = tmpImg.getImageData();
        imageData.transparentPixel = imageData.getPixel(0, 0);
        tmpImg.dispose();

        return new Image(Display.getDefault(), imageData);
    }

    private void drawTitle(PaintEvent e) {
        double p = percentage;
        Rectangle sBounds = smallTitleImg.getBounds();
        Rectangle bBounds = bigTitleImg.getBounds();
        int width = bBounds.width - sBounds.width;
        int height = bBounds.height - sBounds.height;
        Rectangle baseBounds = sBounds;
        Image finalImg = bigTitleImg;
        finalImg = bigTitleImg;
        int totalHight = e.height;
        int middleY = (totalHight - bBounds.height) / 2;
//        int startY = getMargin();
        int startY = 0;
        int baseY = startY;
        int y = (int) (p * (middleY - startY));
        if (hasMessage()) {
            y = -y;
            width = -width;
            height = -height;
            baseBounds = bBounds;
            baseY = middleY;
            finalImg = smallTitleImg;
        }

        Point newSize = new Point((int) (baseBounds.width + p * width), (int) (baseBounds.height + p * height));
        GC gc = e.gc;
        gc.setAntialias(SWT.ON);
        gc.setInterpolation(SWT.HIGH);
        if (p <= 1.0) {
            gc.drawImage(bigTitleImg, 0, 0, bBounds.width, bBounds.height, 0, baseY + y, newSize.x, newSize.y);
        } else {
            Rectangle bounds = finalImg.getBounds();
            gc.drawImage(finalImg, 0, 0, bounds.width, bounds.height, 0, baseY + y, bounds.width, bounds.height);
        }
    }

    private void drawMessageBackground(PaintEvent e, Control ctrl) {
        e.gc.setBackground(msgPanelColor);
        e.gc.setAntialias(SWT.ON);
        e.gc.setInterpolation(SWT.HIGH);
        Point size = ctrl.getSize();
        e.gc.fillRoundRectangle(0, 0, size.x, size.y, 15, 15);
    }

    private int getHorizonPadding() {
        IWizard wizard = this.getWizard();
        if (wizard instanceof ITalendWizard) {
            return ((ITalendWizard) wizard).getHorizonPadding();
        }
        return 5;
    }

    private int getVerticalPadding() {
        IWizard wizard = this.getWizard();
        if (wizard instanceof ITalendWizard) {
            return ((ITalendWizard) wizard).getVerticalPadding();
        }
        return 5;
    }

    private int getHorizonMargin() {
        IWizard wizard = this.getWizard();
        if (wizard instanceof ITalendWizard) {
            return ((ITalendWizard) wizard).getHorizonMargin();
        }
        return 5;
    }

    private int getMargin() {
        return 10;
    }

}
