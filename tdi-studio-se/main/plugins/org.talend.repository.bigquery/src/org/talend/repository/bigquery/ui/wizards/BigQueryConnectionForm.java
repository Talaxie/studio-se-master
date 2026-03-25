// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.bigquery.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.commons.ui.swt.formtools.Form;
import org.talend.commons.ui.swt.formtools.LabelledFileField;
import org.talend.commons.ui.swt.formtools.LabelledText;
import org.talend.commons.ui.swt.formtools.UtilsButton;
import org.talend.commons.ui.utils.PathUtils;
import org.talend.core.model.metadata.IMetadataContextModeManager;
import org.talend.core.model.metadata.builder.connection.BigQueryConnection;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.repository.bigquery.BigQueryClientManager;
import org.talend.repository.bigquery.i18n.Messages;

public class BigQueryConnectionForm extends AbstractBigQueryForm {
	
	//TODO is good to use i18n? not look good
	public static String AUTH_MODE_SERVICE_ACCOUNT = Messages.getString("BigQueryForm.serviceAccount");
	
	public static String AUTH_MODE_OAUTH = Messages.getString("BigQueryForm.oauth");
	
	public static String AUTH_MODE_TOKEN = Messages.getString("BigQueryForm.token");

    private LabelledFileField serviceAccountCredentialsFile;

    private LabelledText projectId;
    
    private Button useRegionEndpoint;
    
    private Text regionEndpoint;
    
    private UtilsButton checkButton;
    
    private Composite serviceAccountComposite;
    
    private GridData serviceAccountCompGD;
    
    private Group bigqueryParameterGroup;
    
    // other variables
    private boolean readOnly;

    public BigQueryConnectionForm(Composite parent, ConnectionItem connectionItem, String[] existingNames,
            IMetadataContextModeManager contextModeManager) {
        super(parent, SWT.NONE, existingNames);
        this.connectionItem = connectionItem;
        setConnectionItem(connectionItem); // must be first.
        setupForm();
        layoutForm();
    }

    private void layoutForm() {
        GridLayout layout = (GridLayout) getLayout();
        layout.marginHeight = 0;
        setLayout(layout);
    }

    @Override
    protected void adaptFormToReadOnly() {
        readOnly = isReadOnly();

        serviceAccountCredentialsFile.setReadOnly(readOnly);

        projectId.setReadOnly(readOnly);
    }

    @Override
    protected void addFields() {
        createPropertiesGroup(this);
        addCheckButton(this);
    }

    private void createPropertiesGroup(Composite parent) {
        bigqueryParameterGroup = new Group(parent, SWT.NULL);
        GridLayout layoutGroup = new GridLayout();
        layoutGroup.numColumns = 2;
        bigqueryParameterGroup.setLayout(layoutGroup);

        GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
        bigqueryParameterGroup.setLayoutData(gridData);
        
        gridData.minimumHeight = 400;
        gridData.heightHint = 400;
        
        serviceAccountComposite = new Composite(bigqueryParameterGroup, SWT.NONE);
        serviceAccountCompGD = new GridData(SWT.FILL, SWT.CENTER, true, false);
        serviceAccountCompGD.horizontalSpan = 2;
        serviceAccountComposite.setLayoutData(serviceAccountCompGD);
        GridLayout serviceAccountCompLayout = new GridLayout(3, false);
        serviceAccountCompLayout.marginWidth = 0;
        serviceAccountComposite.setLayout(serviceAccountCompLayout);
        
        String[] extensions = { "*.*" };
        serviceAccountCredentialsFile = new LabelledFileField(serviceAccountComposite, Messages.getString("BigQueryForm.serviceAccountCredentialsFile"), extensions);
        useRegionEndpoint = new Button(serviceAccountComposite, SWT.CHECK);
        useRegionEndpoint.setText(Messages.getString("BigQueryForm.useRegionEndpoint"));
        regionEndpoint = new Text(serviceAccountComposite, SWT.BORDER | SWT.SINGLE);
        GridData regionEndpointGD = new GridData(SWT.FILL, SWT.CENTER, true, false);
        regionEndpointGD.horizontalSpan = 1;
        regionEndpoint.setLayoutData(regionEndpointGD);
        regionEndpoint.setText("https://bigquery.googleapis.com");
        //regionEndpoint = new LabelledText(serviceAccountComposite, Messages.getString("BigQueryForm.regionEndpoint"), true);
        
        projectId = new LabelledText(bigqueryParameterGroup, Messages.getString("BigQueryForm.projectId"), true);
    }

    private void addCheckButton(Composite parent) {
        Composite compositeCheckButton = Form.startNewGridLayout(parent, 1, false, SWT.CENTER, SWT.TOP);

        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        data.horizontalSpan = 2;
        data.horizontalAlignment = SWT.CENTER;
        compositeCheckButton.setLayoutData(data);

        GridLayout layout2 = (GridLayout) compositeCheckButton.getLayout();
        layout2.marginHeight = 0;
        layout2.marginTop = 0;
        layout2.marginBottom = 0;
        checkButton = new UtilsButton(compositeCheckButton, Messages.getString("BigQueryForm.check"), WIDTH_BUTTON_PIXEL,
                HEIGHT_BUTTON_PIXEL);
        checkButton.setEnabled(false);
    }
    
    private void showif() {
		serviceAccountCredentialsFile.setVisible(true);
		useRegionEndpoint.setVisible(true);
		regionEndpoint.setVisible(useRegionEndpoint.getSelection());
		
		serviceAccountComposite.setVisible(true);
		serviceAccountCompGD.exclude = false;
//		serviceAccountComposite.setEnabled(true);
		
		serviceAccountComposite.layout();
		bigqueryParameterGroup.layout();
	}

    @Override
    protected void addFieldsListeners() {
    	serviceAccountCredentialsFile.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                if (!isContextMode()) {
                    if (serviceAccountCredentialsFile.getEditable()) {
                        BigQueryConnection bigqueryConn = getConnection();
                        bigqueryConn.setServiceAccountCredentialsFile(PathUtils.getPortablePath(serviceAccountCredentialsFile.getText()));
                        checkFieldsValue();
                        updateCheckButton();
                    }
                }
            }
        });

        projectId.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                if (!isContextMode()) {
                    if (projectId.getEditable()) {
                        getConnection().setProjectId(projectId.getText());
                        checkFieldsValue();
                        updateCheckButton();
                    }
                }
            }
        });
        
        regionEndpoint.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                if (!isContextMode()) {
                    if (regionEndpoint.getEditable()) {
                        getConnection().setRegionEndpoint(regionEndpoint.getText());
                        checkFieldsValue();
                        updateCheckButton();
                    }
                }
            }
        });
        
    }

    @Override
    protected void addUtilsButtonListeners() {
        checkButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(final SelectionEvent e) {
                checkBigQueryConnection();
            }

        });
        
        useRegionEndpoint.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(final SelectionEvent e) {
                if (!isContextMode()) {
                    //TODO improve it
                    regionEndpoint.setVisible(useRegionEndpoint.getSelection());
                    getConnection().setUseRegionEndpoint(useRegionEndpoint.getSelection());
                    getConnection().setRegionEndpoint(regionEndpoint.getText());
                    checkFieldsValue();
                    updateCheckButton();
                }
            }
        });

    }

    private void checkBigQueryConnection() {
        final BigQueryConnection connection = getConnection();

        ProgressMonitorDialog dialog = new ProgressMonitorDialog(getShell());

        try {
            dialog.run(true, false, new IRunnableWithProgress() {

                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    try {
                    	BigQueryClientManager manager = new BigQueryClientManager();
                        if (!connection.isContextMode()) {
                            manager.init(connection);
                        } else {
                            manager.init(connection, getContextModeManager(connection));
                        }

                        Display.getDefault().asyncExec(new Runnable() {

                            @Override
                            public void run() {
                                if (!isReadOnly()) {
                                    updateStatus(IStatus.OK, null);
                                }
                                MessageDialog.openInformation(getShell(), Messages.getString("BigQueryForm.checkConnectionTitle"), "\""
                                        + connectionItem.getProperty().getLabel() + "\" "
                                        + Messages.getString("BigQueryForm.checkIsDone"));
                                if (!isReadOnly()) {
                                    if (isContextMode()) {
                                        adaptFormToEditable();
                                    }
                                }
                            }

                        });

                    } catch (Throwable e) {
                        openErrorDialogWithDetail(e);
                    }
                }

            });
        } catch (InvocationTargetException e1) {
            ExceptionHandler.process(e1);
        } catch (InterruptedException e1) {
            ExceptionHandler.process(e1);
        }
    }

    @Override
    protected boolean checkFieldsValue() {
        if (isContextMode()) {
            return true;
        }

        if (serviceAccountCredentialsFile.getCharCount() == 0) {
            updateStatus(IStatus.WARNING, Messages.getString("BigQueryForm.alert", serviceAccountCredentialsFile.getLabelText()));
            return false;
        }
        
        if(useRegionEndpoint.getSelection()) {
            if (regionEndpoint.getCharCount() == 0) {
                updateStatus(IStatus.WARNING, Messages.getString("BigQueryForm.alert", regionEndpoint.getText()));
                return false;
            }
        }
        
        if (projectId.getCharCount() == 0) {
            updateStatus(IStatus.WARNING, Messages.getString("BigQueryForm.alert", projectId.getLabelText()));
            return false;
        }
        
        updateStatus(IStatus.OK, null);
        return true;
    }

    private void updateCheckButton() {
        // update checkEnable
        if (isContextMode()) {
            checkButton.setEnabled(true);
        } else {
            boolean enable = serviceAccountCredentialsFile.getCharCount() != 0 && projectId.getCharCount() != 0;
            checkButton.setEnabled(enable);
        }
    }

    @Override
    protected void initialize() {
        if (isContextMode()) {
            adaptFormToEditable();
        }
        initizalizeBasicConnectionInfo();
        updateStatus(IStatus.OK, "");
    }

    private void initizalizeBasicConnectionInfo() {
        BigQueryConnection connection = getConnection();
        serviceAccountCredentialsFile.setText(connection.getServiceAccountCredentialsFile());
        projectId.setText(connection.getProjectId());
        useRegionEndpoint.setSelection(connection.isUseRegionEndpoint());
        if(connection.getRegionEndpoint()!=null) {
            regionEndpoint.setText(connection.getRegionEndpoint());
        }
        
        showif();
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);

        updateCheckButton();

        if (isContextMode()) {
            adaptFormToEditable();
        }
        if (visible) {
            adaptFormToEditable();
            initizalizeBasicConnectionInfo();
        }

        if (isReadOnly() != readOnly) {
            adaptFormToReadOnly();
        }
    }

    @Override
    protected void adaptFormToEditable() {
        super.adaptFormToEditable();
        
        serviceAccountCredentialsFile.setEditable(!isContextMode());
        projectId.setEditable(!isContextMode());
        regionEndpoint.setEditable(!isContextMode());
    }

    @Override
    protected BigQueryConnection getConnection() {
        return (BigQueryConnection) connectionItem.getConnection();
    }

}
