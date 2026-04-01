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
package org.talend.repository.ui.wizards.metadata.connection.database;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.model.metadata.IMetadataConnection;
import org.talend.core.model.metadata.MetadataTalendType;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.runtime.services.IGenericDBService;
import org.talend.core.runtime.services.IGenericWizardService;
import org.talend.core.ui.check.ICheckListener;
import org.talend.core.ui.check.IChecker;
import org.talend.daikon.properties.presentation.Form;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.wizard.AbstractForm;
import org.talend.metadata.managment.ui.wizard.RepositoryWizard;
import org.talend.repository.metadata.i18n.Messages;

/**
 * DatabaseWizard present the DatabaseForm. Use to Use to manage the metadata connection. Page allows setting a
 * database.
 */
public class DatabaseWizardPage extends WizardPage {

    private String dbType;

    private String displayDbType;

    private ConnectionItem connectionItem;

    private DatabaseForm databaseForm;

    private Composite dynamicForm;

    private Composite dynamicContextForm;

    private Composite dynamicParentForm;

    private Composite compositeDbSettings;

    private final String[] existingNames;

    private final boolean isRepositoryObjectEditable;

    private Composite parentContainer;

    private boolean isCreation = false;

    private ConnectionItem oriConnItem;

    protected IStatus genericStatus;

    /**
     * DatabaseWizardPage constructor.
     *
     * @param connection
     * @param isRepositoryObjectEditable
     * @param existingNames
     */
    public DatabaseWizardPage(ConnectionItem connectionItem, boolean isRepositoryObjectEditable, String[] existingNames) {
        super("wizardPage"); //$NON-NLS-1$
        this.connectionItem = connectionItem;
        this.existingNames = existingNames;
        this.isRepositoryObjectEditable = isRepositoryObjectEditable;
    }

    /**
     * Create the composites, initialize it and add controls.
     *
     * @see IDialogPage#createControl(Composite)
     */
    @Override
    public void createControl(final Composite parent) {
        if (this.getWizard() instanceof RepositoryWizard) {
            isCreation = ((RepositoryWizard) getWizard()).isCreation();
            if (!isCreation) {
                oriConnItem = connectionItem;
            }
        }

        parentContainer = new Composite(parent, SWT.NONE);
        FillLayout fillLayout = new FillLayout();
        fillLayout.spacing = 1;
        fillLayout.marginHeight = 0;
        fillLayout.marginWidth = 0;
        parentContainer.setLayout(new FormLayout());
        GridData parentGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        parentContainer.setLayoutData(parentGridData);
        compositeDbSettings = new Composite(parentContainer, SWT.NULL);
        compositeDbSettings.setLayout(new GridLayout(3, false));

        FormData data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, 0);
        compositeDbSettings.setLayoutData(data);

        createDBForm();
    }

    public void updateByDBSelection() {
        setPageComplete(isRepositoryObjectEditable);
        setErrorMessage(null);
        if (dbType == null) {
            return;
        }
        if (isAdditionalJDBC(dbType)) {
            dbType = "JDBC";
        }
        String oldType = getDisplayConnectionDBType();
        if (dbType.equals(oldType)) {
            return;
        }
        if (needDisposeOldForm(dbType, oldType)) {
            recreateConnection();
            setConnectionDBType(dbType);
            if (!isTCOMDB(dbType)) {
                ((DatabaseConnection) connectionItem.getConnection()).getParameters().clear();
                ((DatabaseConnection) connectionItem.getConnection()).setDbVersionString(null);
            }
            refreshDBForm(connectionItem);
            if (isTCOMDB(dbType)) {
                setPageComplete(true);
            }
        } else {
            setConnectionDBType(dbType);
            refreshDBForm(null);
        }
    }

    private boolean isAdditionalJDBC(String dbType) {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericWizardService.class)) {
            IGenericWizardService service = GlobalServiceRegister.getDefault().getService(IGenericWizardService.class);
            if (service != null) {
                return service.getIfAdditionalJDBCDBType(dbType);
            }
        }
        return false;
    }

    public boolean needDisposeOldForm(String newType, String oldType) {
        return !newType.equals(oldType);
    }

    private void recreateConnection() {
        if (isTCOMDB(dbType)) {
            IGenericDBService dbService = null;
            if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericDBService.class)) {
                dbService = (IGenericDBService) GlobalServiceRegister.getDefault().getService(IGenericDBService.class);
            }
            if (dbService == null) {
                return;
            }
            if (!isCreation && dbType.equals(oriConnItem.getTypeName())) {
                connectionItem = oriConnItem;
                return;
            }
        }
    }

    private void setConnectionDBType(String type) {
        if (connectionItem.getConnection() instanceof DatabaseConnection) {
            connectionItem.setTypeName(type);
            ((DatabaseConnection) connectionItem.getConnection()).setDatabaseType(type);
        }
    }

    public String getDisplayConnectionDBType() {
        DatabaseConnection connection = (DatabaseConnection) connectionItem.getConnection();
        String databaseType = connection.getDatabaseType();
        String productId = connection.getProductId();
        if (isTCOMDB(databaseType) && !databaseType.equals(productId)) {
            return productId;
        }
        return databaseType;
    }

    public void createDBForm(){
        if(parentContainer == null || parentContainer.isDisposed()){
            return;
        }

        //dynamic Composite
        createDynamicForm();

        //DB Composite
        createDatabaseForm();
        parentContainer.layout();
    }

    private void createDynamicForm(){
        IGenericDBService dbService = null;
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericDBService.class)) {
            dbService = GlobalServiceRegister.getDefault().getService(
                    IGenericDBService.class);
        }
        if(dbService == null){
            return;
        }
        if(dbService.getExtraTypes().isEmpty()){
           return;
        }
        FormData data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(compositeDbSettings, 0);
        data.bottom = new FormAttachment(100, 0);

        dynamicParentForm = new Composite(parentContainer, SWT.NONE);
        dynamicParentForm.setLayoutData(data);
        dynamicParentForm.setLayout(new FormLayout());
        Map<String, Composite> map = dbService.creatDBDynamicComposite(dynamicParentForm, EComponentCategory.BASIC,
                !isRepositoryObjectEditable, isCreation, connectionItem.getProperty(), "JDBC");
        dynamicForm = map.get("DynamicComposite");//$NON-NLS-1$
        dynamicContextForm = map.get("ContextComposite");//$NON-NLS-1$
        if (isTCOMDB(dbType)) {
            setControl(dynamicForm);
        }
        dynamicParentForm.setVisible(isTCOMDB(dbType));
        addCheckListener(dbService.getDynamicChecker(dynamicForm));
        if(isCreation){
            resetDynamicConnectionItem(connectionItem);
        } else {
            DatabaseWizardPage.this.setPageComplete(true);
        }
    }

    private void createDatabaseForm(){
        if (isTCOMDB(dbType)) {
           return;
        }
        FormData data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(compositeDbSettings, 0);
        data.bottom = new FormAttachment(100, 0);

        databaseForm = new DatabaseForm(parentContainer, connectionItem, existingNames, isCreation);
        databaseForm.setLayoutData(data);
        databaseForm.setReadOnly(!isRepositoryObjectEditable);
        databaseForm.updateSpecialFieldsState();

        AbstractForm.ICheckListener listener = new AbstractForm.ICheckListener() {

            @Override
            public void checkPerformed(final AbstractForm source) {
                if (dbType == null) {
                    DatabaseWizardPage.this.setPageComplete(false);
                    setErrorMessage(Messages.getString("DatabaseForm.alert", "DB Type"));//$NON-NLS-1$  //$NON-NLS-2$
                }else if (source.isStatusOnError()) {
                    DatabaseWizardPage.this.setPageComplete(false);
                    setErrorMessage(source.getStatus());
                } else {
                    DatabaseWizardPage.this.setPageComplete(isRepositoryObjectEditable);
                    setErrorMessage(null);
                    setMessage(source.getStatus(), source.getStatusLevel());
                }
            }
        };
        databaseForm.setListener(listener);
        if (connectionItem.getProperty().getLabel() != null && !connectionItem.getProperty().getLabel().equals("")) { //$NON-NLS-1$
            databaseForm.checkFieldsValue();
        }
        if (!isTCOMDB(dbType)) {
            setControl(databaseForm);
        }
        databaseForm.setVisible(!isTCOMDB(dbType));
    }

    public boolean isTCOMDB(String type){
        if(type == null){
            return false;
        }
        List<ERepositoryObjectType> extraTypes = new ArrayList<ERepositoryObjectType>();
        IGenericDBService dbService = null;
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericDBService.class)) {
            dbService = GlobalServiceRegister.getDefault().getService(
                    IGenericDBService.class);
        }
        if(dbService != null){
            extraTypes.addAll(dbService.getExtraTypes());
        }
        for(ERepositoryObjectType eType:extraTypes){
            if(eType.getType().equals(type)){
               return true;
            }
        }
        return false;
    }

    public boolean isGenericConn(ConnectionItem connItem){
        IGenericWizardService dbService = null;
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericWizardService.class)) {
            dbService = GlobalServiceRegister.getDefault().getService(
                    IGenericWizardService.class);
        }
        if(dbService != null){
            return dbService.isGenericItem(connItem);
        }
        return false;
    }

    private void resetDynamicConnectionItem(ConnectionItem connItem){
        if(connItem == null){
            return;
        }
        IGenericDBService dbService = null;
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericDBService.class)) {
            dbService = GlobalServiceRegister.getDefault().getService(
                    IGenericDBService.class);
        }
        if(dbService != null){
            dbService.resetConnectionItem(dynamicForm, connItem);
            dbService.resetConnectionItem(dynamicContextForm, connItem);
        }
    }

    public void refreshDBForm(ConnectionItem connItem){
        if(connItem != null){
            this.connectionItem = connItem;
            ((DatabaseWizard)getWizard()).setNewConnectionItem(connItem);
        }
        if(databaseForm == null || databaseForm.isDisposed()){
            createDatabaseForm();
        }
        if (isTCOMDB(dbType)) {
            if(dynamicParentForm == null || dynamicParentForm.isDisposed()){
                createDynamicForm();
            }
            dynamicParentForm.setVisible(true);
            if (databaseForm != null && !databaseForm.isDisposed()) {
                databaseForm.setVisible(false);
            }
            setControl(dynamicForm);
            resetDynamicConnectionItem(connItem);

            DatabaseConnection dbConnection = ((DatabaseConnection) connItem.getConnection());
            String product = displayDbType;
            dbConnection.setProductId(product);
            String mapping = null;
            if (MetadataTalendType.getDefaultDbmsFromProduct(product) != null) {
                mapping = MetadataTalendType.getDefaultDbmsFromProduct(product).getId();
            }
            if (mapping == null) {
                mapping = "mysql_id"; // default value //$NON-NLS-1$
            }
            dbConnection.setDbmsId(mapping);
            initJDBCDefaultConnection4SwitchType(dbConnection);

        }else{
            databaseForm.setVisible(true);
            if(dynamicParentForm != null && !dynamicParentForm.isDisposed()){
                dynamicParentForm.setVisible(false);
            }
            databaseForm.refreshDBForm(connItem);
            setControl(databaseForm);
        }
        parentContainer.layout();
    }

    private void initJDBCDefaultConnection4SwitchType(DatabaseConnection connection) {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericWizardService.class)) {
            IGenericWizardService service = GlobalServiceRegister.getDefault().getService(IGenericWizardService.class);
            if (service != null) {
                service.initAdditonalJDBCConnectionValue(connection, dynamicForm, displayDbType,
                        connectionItem.getProperty().getId());
            }
        }
    }

    public void disposeDBForm(){
        if(databaseForm != null && !databaseForm.isDisposed()){
            databaseForm.dispose();
        }
        if(dynamicParentForm != null && !dynamicParentForm.isDisposed()){
            dynamicParentForm.dispose();
        }
        if(dynamicForm != null && !dynamicForm.isDisposed()){
            dynamicForm.dispose();
        }
    }
    /**
     *
     * DOC zshen Comment method "getMetadataConnection".
     *
     * @return
     */
    public IMetadataConnection getMetadataConnection() {
        if(databaseForm != null){
            return databaseForm.getMetadataConnection();
        }
        return null;
    }

    public ContextType getSelectedContextType() {
        if(databaseForm != null){
            return databaseForm.getSelectedContextType();
        }
        return null;
    }


    public Form getForm(){
        if(dynamicForm != null){
            IGenericDBService dbService = null;
            if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericDBService.class)) {
                dbService = GlobalServiceRegister.getDefault().getService(
                        IGenericDBService.class);
            }
            if(dbService != null){
                return dbService.getDynamicForm(dynamicForm);
            }
        }
        return null;
    }

    protected void addCheckListener(IChecker checker) {
        if(checker == null){
            return;
        }
        ICheckListener checkListener = new ICheckListener() {

            @Override
            public void checkPerformed(IChecker source) {
                if (source.isStatusOnError()) {
                    DatabaseWizardPage.this.setPageComplete(true);
                    setErrorMessage(source.getStatus());
                } else {
                    DatabaseWizardPage.this.setPageComplete(isRepositoryObjectEditable);
                    setErrorMessage(null);
                    setMessage(source.getStatus(), source.getStatusLevel());
                }
            }
        };
        checker.setListener(checkListener);
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
        displayDbType = dbType;
    }

}
