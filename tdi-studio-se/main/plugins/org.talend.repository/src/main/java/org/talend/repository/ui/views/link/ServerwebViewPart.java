// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.ui.views.link;

import org.apache.log4j.Logger;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.talend.repository.ui.views.link.ServerRest;
import org.talend.repository.ui.views.link.ServerUtil;

public class ServerwebViewPart extends ViewPart {

    private static final Logger LOGGER = Logger.getLogger(ServerwebViewPart.class);

    public static final String ID = "org.talend.repository.ui.views.link.ServerwebViewPart"; //$NON-NLS-1$

    private Text portTextField;
	private Button startButton;
	private Button stopButton;
    private CLabel serverLabel;

	private ServerRest serverRest;
    private String port = "8080";

    /**
     * Constructor
     */
    public ServerwebViewPart() {
        // TODO
    }

    @Override
    public void createPartControl(Composite container) {
	    serverRest = new ServerRest();
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	    container.setLayout(new GridLayout(1, true));
	    Composite compositeMain = new Composite(container, SWT.NONE);
        compositeMain.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	    compositeMain.setLayout(new GridLayout(1, true));

	    Composite compositeBody = new Composite(compositeMain, SWT.NONE);
	    compositeBody.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    compositeBody.setLayout(new GridLayout(1, true));

	    CLabel titleLabel = new CLabel(compositeBody, SWT.NONE);
	    FontDescriptor descriptor = FontDescriptor.createFrom(titleLabel.getFont());
	    descriptor = descriptor.setStyle(SWT.BOLD);
	    titleLabel.setFont(descriptor.createFont(titleLabel.getDisplay()));
	    titleLabel.setForeground(new Color(66, 139, 202));
	    titleLabel.setText("API web");
	    GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
	    gridData.grabExcessHorizontalSpace = true;
	    titleLabel.setLayoutData(gridData);

	    serverLabel = new CLabel(compositeBody, SWT.NONE);
	    serverLabel.setText("Application Programming Interface enabling access to functionalities.");
	    gridData = new GridData(GridData.FILL_HORIZONTAL);
	    gridData.grabExcessHorizontalSpace = true;
	    serverLabel.setLayoutData(gridData);

	    // Create a new composite for the label, text field and buttons
	    Composite topComposite = new Composite(compositeMain, SWT.NONE);
	    topComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    topComposite.setLayout(new GridLayout(4, false));

	    // Create the port label
	    CLabel portLabel = new CLabel(topComposite, SWT.NONE);
	    portLabel.setText("Port #2");

	    // Create the text field
	    portTextField = new Text(topComposite, SWT.BORDER);
	    portTextField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        portTextField.setText(port);

	    // Create the ON button
	    startButton = new Button(topComposite, SWT.PUSH);
	    startButton.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/play.png")).createImage());
	    startButton.setText("Start");
	    startButton.setLayoutData(new GridData(100, SWT.DEFAULT));
	    startButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent evt) {
            	startButton.setEnabled(false);
        	    stopButton.setEnabled(false);
                try {
                    serverLabel.setText("Server starting...");
                    port = portTextField.getText();
                    serverRest.startServer(port);
                    serverLabel.setText("Server started and listening on port " + port);
                } catch (Exception e) {
                    e.printStackTrace();
                    if (LOGGER.isInfoEnabled()) {
                        LOGGER.info(e);
                    }
                    serverLabel.setText("Server error !");
                }
            	startButton.setEnabled(false);
        	    stopButton.setEnabled(true);
            }
        });

	    // Create the OFF button
	    stopButton = new Button(topComposite, SWT.PUSH);
	    stopButton.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/stop.png")).createImage());
	    stopButton.setText("Stop");
	    stopButton.setLayoutData(new GridData(100, SWT.DEFAULT));
	    stopButton.setEnabled(false);
	    stopButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent evt) {
            	startButton.setEnabled(false);
        	    stopButton.setEnabled(false);
                try {
                    serverLabel.setText("Server ending...");
                    serverRest.stopServer();
                    serverLabel.setText("Server off");
                } catch (Exception e) {
                    e.printStackTrace();
                    if (LOGGER.isInfoEnabled()) {
                        LOGGER.info(e);
                    }
                    serverLabel.setText("Server error !");
                }
            	startButton.setEnabled(true);
        	    stopButton.setEnabled(false);
            }
        });

	    Composite compositeBody2 = new Composite(compositeMain, SWT.NONE);
	    compositeBody2.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    compositeBody2.setLayout(new GridLayout(1, false));

	    Button testButton = new Button(compositeBody2, SWT.PUSH);
        testButton.setVisible(false);
	    testButton.setText("Test");
	    testButton.setLayoutData(new GridData(100, SWT.DEFAULT));
	    testButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent evt) {
                try {
                    String jobZipPath = "C:/Temp/ETL01_000_JobEtl_Master.zip";
                    String jobName = "ETL01_000_JobEtl_Master";
                    ServerUtil.jobImport(jobZipPath, jobName);
                } catch (Exception e) {
                    e.printStackTrace();
                    if (LOGGER.isInfoEnabled()) {
                        LOGGER.info(e);
                    }
                }
            }
        });
    }

    @Override
    public void setFocus() {
        // TODO
    }
}
