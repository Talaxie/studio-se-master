/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.talend.core.model.properties.DashboardConnection;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.DashboardConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DashboardConnectionItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DashboardConnectionItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addIdPropertyDescriptor(object);
            addLabelPropertyDescriptor(object);
            addDialectPropertyDescriptor(object);
            addHostPropertyDescriptor(object);
            addPortPropertyDescriptor(object);
            addDatabasePropertyDescriptor(object);
            addUsernamePropertyDescriptor(object);
            addPasswordPropertyDescriptor(object);
            addLogTablePropertyDescriptor(object);
            addStatTablePropertyDescriptor(object);
            addFlowMeterTablePropertyDescriptor(object);
            addAdditionnalsParamsPropertyDescriptor(object);
            addDatasourcePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_id_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLabelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_label_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_label_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__LABEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Dialect feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDialectPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_dialect_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_dialect_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__DIALECT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Host feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHostPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_host_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_host_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__HOST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPortPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_port_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_port_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__PORT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Database feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatabasePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_database_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_database_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__DATABASE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Username feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsernamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_username_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_username_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__USERNAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_password_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_password_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__PASSWORD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Log Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogTablePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_logTable_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_logTable_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__LOG_TABLE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Stat Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStatTablePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_statTable_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_statTable_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__STAT_TABLE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Flow Meter Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlowMeterTablePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_flowMeterTable_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_flowMeterTable_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__FLOW_METER_TABLE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Additionnals Params feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAdditionnalsParamsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_additionnalsParams_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_additionnalsParams_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__ADDITIONNALS_PARAMS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Datasource feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatasourcePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DashboardConnection_datasource_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DashboardConnection_datasource_feature", "_UI_DashboardConnection_type"),
                 PropertiesPackage.Literals.DASHBOARD_CONNECTION__DATASOURCE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns DashboardConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DashboardConnection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        DashboardConnection dashboardConnection = (DashboardConnection)object;
        return getString("_UI_DashboardConnection_type") + " " + dashboardConnection.getId();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(DashboardConnection.class)) {
            case PropertiesPackage.DASHBOARD_CONNECTION__ID:
            case PropertiesPackage.DASHBOARD_CONNECTION__LABEL:
            case PropertiesPackage.DASHBOARD_CONNECTION__DIALECT:
            case PropertiesPackage.DASHBOARD_CONNECTION__HOST:
            case PropertiesPackage.DASHBOARD_CONNECTION__PORT:
            case PropertiesPackage.DASHBOARD_CONNECTION__DATABASE:
            case PropertiesPackage.DASHBOARD_CONNECTION__USERNAME:
            case PropertiesPackage.DASHBOARD_CONNECTION__PASSWORD:
            case PropertiesPackage.DASHBOARD_CONNECTION__LOG_TABLE:
            case PropertiesPackage.DASHBOARD_CONNECTION__STAT_TABLE:
            case PropertiesPackage.DASHBOARD_CONNECTION__FLOW_METER_TABLE:
            case PropertiesPackage.DASHBOARD_CONNECTION__ADDITIONNALS_PARAMS:
            case PropertiesPackage.DASHBOARD_CONNECTION__DATASOURCE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator() {
        return PropertiesEditPlugin.INSTANCE;
    }

}
