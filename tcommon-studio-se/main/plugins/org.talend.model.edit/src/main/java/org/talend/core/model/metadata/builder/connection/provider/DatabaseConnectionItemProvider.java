/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.metadata.builder.connection.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.DatabaseConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseConnectionItemProvider extends ConnectionItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatabaseConnectionItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addDatabaseTypePropertyDescriptor(object);
            addDriverJarPathPropertyDescriptor(object);
            addDriverClassPropertyDescriptor(object);
            addURLPropertyDescriptor(object);
            addDbVersionStringPropertyDescriptor(object);
            addPortPropertyDescriptor(object);
            addUsernamePropertyDescriptor(object);
            addPasswordPropertyDescriptor(object);
            addServerNamePropertyDescriptor(object);
            addDatasourceNamePropertyDescriptor(object);
            addFileFieldNamePropertyDescriptor(object);
            addSIDPropertyDescriptor(object);
            addSqlSynthaxPropertyDescriptor(object);
            addStringQuotePropertyDescriptor(object);
            addNullCharPropertyDescriptor(object);
            addDbmsIdPropertyDescriptor(object);
            addProductIdPropertyDescriptor(object);
            addDBRootPathPropertyDescriptor(object);
            addAdditionalParamsPropertyDescriptor(object);
            addStandardSQLPropertyDescriptor(object);
            addSystemSQLPropertyDescriptor(object);
            addCdcTypeModePropertyDescriptor(object);
            addSQLModePropertyDescriptor(object);
            addUiSchemaPropertyDescriptor(object);
            addSupportNLSPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Database Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatabaseTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_DatabaseType_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_DatabaseType_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__DATABASE_TYPE, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Driver Jar Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDriverJarPathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_DriverJarPath_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_DriverJarPath_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__DRIVER_JAR_PATH, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Driver Class feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDriverClassPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_DriverClass_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_DriverClass_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__DRIVER_CLASS, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the URL feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addURLPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_URL_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_URL_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__URL, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Db Version String feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDbVersionStringPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_dbVersionString_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_dbVersionString_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__DB_VERSION_STRING, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPortPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_Port_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_Port_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__PORT, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Username feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsernamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_Username_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_Username_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__USERNAME, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_Password_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_Password_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__PASSWORD, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Server Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServerNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_ServerName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_ServerName_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__SERVER_NAME, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Datasource Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatasourceNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_DatasourceName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_DatasourceName_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__DATASOURCE_NAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the File Field Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFileFieldNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_FileFieldName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_FileFieldName_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__FILE_FIELD_NAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the SID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSIDPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_SID_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_SID_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__SID, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Sql Synthax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSqlSynthaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_SqlSynthax_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_SqlSynthax_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__SQL_SYNTHAX, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the String Quote feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStringQuotePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_StringQuote_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_StringQuote_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__STRING_QUOTE, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Null Char feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNullCharPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_NullChar_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_NullChar_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__NULL_CHAR, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Dbms Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDbmsIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_DbmsId_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_DbmsId_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__DBMS_ID, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Product Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProductIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_ProductId_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_ProductId_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__PRODUCT_ID, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the DB Root Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDBRootPathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_DBRootPath_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_DBRootPath_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__DB_ROOT_PATH, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Additional Params feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAdditionalParamsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_AdditionalParams_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_AdditionalParams_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__ADDITIONAL_PARAMS, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Standard SQL feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStandardSQLPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_StandardSQL_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_StandardSQL_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__STANDARD_SQL, true,
                false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the System SQL feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSystemSQLPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_SystemSQL_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_SystemSQL_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__SYSTEM_SQL, true, false,
                false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Cdc Type Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCdcTypeModePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_cdcTypeMode_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_cdcTypeMode_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__CDC_TYPE_MODE, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the SQL Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSQLModePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_SQLMode_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_SQLMode_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__SQL_MODE, true, false,
                false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Ui Schema feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUiSchemaPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DatabaseConnection_UiSchema_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_UiSchema_feature",
                        "_UI_DatabaseConnection_type"), ConnectionPackage.Literals.DATABASE_CONNECTION__UI_SCHEMA, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Support NLS feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupportNLSPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_DatabaseConnection_supportNLS_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_DatabaseConnection_supportNLS_feature",
                                "_UI_DatabaseConnection_type"),
                        ConnectionPackage.Literals.DATABASE_CONNECTION__SUPPORT_NLS, true, false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(ConnectionPackage.Literals.DATABASE_CONNECTION__CDC_CONNS);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns DatabaseConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DatabaseConnection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((DatabaseConnection) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_DatabaseConnection_type")
                : getString("_UI_DatabaseConnection_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(DatabaseConnection.class)) {
        case ConnectionPackage.DATABASE_CONNECTION__DATABASE_TYPE:
        case ConnectionPackage.DATABASE_CONNECTION__DRIVER_JAR_PATH:
        case ConnectionPackage.DATABASE_CONNECTION__DRIVER_CLASS:
        case ConnectionPackage.DATABASE_CONNECTION__URL:
        case ConnectionPackage.DATABASE_CONNECTION__DB_VERSION_STRING:
        case ConnectionPackage.DATABASE_CONNECTION__PORT:
        case ConnectionPackage.DATABASE_CONNECTION__USERNAME:
        case ConnectionPackage.DATABASE_CONNECTION__PASSWORD:
        case ConnectionPackage.DATABASE_CONNECTION__SERVER_NAME:
        case ConnectionPackage.DATABASE_CONNECTION__DATASOURCE_NAME:
        case ConnectionPackage.DATABASE_CONNECTION__FILE_FIELD_NAME:
        case ConnectionPackage.DATABASE_CONNECTION__SID:
        case ConnectionPackage.DATABASE_CONNECTION__SQL_SYNTHAX:
        case ConnectionPackage.DATABASE_CONNECTION__STRING_QUOTE:
        case ConnectionPackage.DATABASE_CONNECTION__NULL_CHAR:
        case ConnectionPackage.DATABASE_CONNECTION__DBMS_ID:
        case ConnectionPackage.DATABASE_CONNECTION__PRODUCT_ID:
        case ConnectionPackage.DATABASE_CONNECTION__DB_ROOT_PATH:
        case ConnectionPackage.DATABASE_CONNECTION__ADDITIONAL_PARAMS:
        case ConnectionPackage.DATABASE_CONNECTION__STANDARD_SQL:
        case ConnectionPackage.DATABASE_CONNECTION__SYSTEM_SQL:
        case ConnectionPackage.DATABASE_CONNECTION__CDC_TYPE_MODE:
        case ConnectionPackage.DATABASE_CONNECTION__SQL_MODE:
        case ConnectionPackage.DATABASE_CONNECTION__UI_SCHEMA:
        case ConnectionPackage.DATABASE_CONNECTION__SUPPORT_NLS:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ConnectionPackage.DATABASE_CONNECTION__CDC_CONNS:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.DATABASE_CONNECTION__CDC_CONNS,
                ConnectionFactory.eINSTANCE.createCDCConnection()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == CorePackage.Literals.NAMESPACE__OWNED_ELEMENT
                || childFeature == SoftwaredeploymentPackage.Literals.DATA_PROVIDER__RESOURCE_CONNECTION;

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject), getFeatureText(childFeature),
                    getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
