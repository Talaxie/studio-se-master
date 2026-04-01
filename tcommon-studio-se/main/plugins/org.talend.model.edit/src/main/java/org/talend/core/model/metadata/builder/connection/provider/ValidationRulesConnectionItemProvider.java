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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.ValidationRulesConnection;

import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;

import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationRulesConnectionItemProvider extends ConnectionItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValidationRulesConnectionItemProvider(AdapterFactory adapterFactory) {
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

            addIsSelectPropertyDescriptor(object);
            addIsInsertPropertyDescriptor(object);
            addIsUpdatePropertyDescriptor(object);
            addIsDeletePropertyDescriptor(object);
            addTypePropertyDescriptor(object);
            addBaseSchemaPropertyDescriptor(object);
            addBaseColumnNamesPropertyDescriptor(object);
            addRefSchemaPropertyDescriptor(object);
            addRefColumnNamesPropertyDescriptor(object);
            addJavaConditionPropertyDescriptor(object);
            addSqlConditionPropertyDescriptor(object);
            addLogicalOperatorPropertyDescriptor(object);
            addConditionsPropertyDescriptor(object);
            addInnerJoinsPropertyDescriptor(object);
            addIsDisallowPropertyDescriptor(object);
            addIsRejectLinkPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Is Select feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSelectPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_isSelect_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_isSelect_feature",
                        "_UI_ValidationRulesConnection_type"), ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__IS_SELECT,
                true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is Insert feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsInsertPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_isInsert_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_isInsert_feature",
                        "_UI_ValidationRulesConnection_type"), ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__IS_INSERT,
                true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is Update feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsUpdatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_isUpdate_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_isUpdate_feature",
                        "_UI_ValidationRulesConnection_type"), ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__IS_UPDATE,
                true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is Delete feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsDeletePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_isDelete_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_isDelete_feature",
                        "_UI_ValidationRulesConnection_type"), ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__IS_DELETE,
                true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_type_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_type_feature",
                        "_UI_ValidationRulesConnection_type"), ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__TYPE,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Base Schema feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBaseSchemaPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_baseSchema_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_baseSchema_feature",
                        "_UI_ValidationRulesConnection_type"),
                ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__BASE_SCHEMA, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Base Column Names feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBaseColumnNamesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_baseColumnNames_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_baseColumnNames_feature",
                        "_UI_ValidationRulesConnection_type"),
                ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__BASE_COLUMN_NAMES, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Ref Schema feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefSchemaPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_refSchema_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_refSchema_feature",
                        "_UI_ValidationRulesConnection_type"),
                ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__REF_SCHEMA, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Ref Column Names feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefColumnNamesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_refColumnNames_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_refColumnNames_feature",
                        "_UI_ValidationRulesConnection_type"),
                ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__REF_COLUMN_NAMES, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Java Condition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addJavaConditionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_javaCondition_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_javaCondition_feature",
                        "_UI_ValidationRulesConnection_type"),
                ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__JAVA_CONDITION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Sql Condition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSqlConditionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_sqlCondition_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_sqlCondition_feature",
                        "_UI_ValidationRulesConnection_type"),
                ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__SQL_CONDITION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Logical Operator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogicalOperatorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_logicalOperator_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_logicalOperator_feature",
                        "_UI_ValidationRulesConnection_type"),
                ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__LOGICAL_OPERATOR, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Conditions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConditionsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_conditions_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_conditions_feature",
                        "_UI_ValidationRulesConnection_type"),
                ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__CONDITIONS, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Inner Joins feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInnerJoinsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_innerJoins_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_innerJoins_feature",
                        "_UI_ValidationRulesConnection_type"),
                ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__INNER_JOINS, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Is Disallow feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsDisallowPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_isDisallow_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_isDisallow_feature",
                        "_UI_ValidationRulesConnection_type"),
                ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__IS_DISALLOW, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is Reject Link feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsRejectLinkPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ValidationRulesConnection_isRejectLink_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_ValidationRulesConnection_isRejectLink_feature",
                        "_UI_ValidationRulesConnection_type"),
                ConnectionPackage.Literals.VALIDATION_RULES_CONNECTION__IS_REJECT_LINK, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This returns ValidationRulesConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ValidationRulesConnection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ValidationRulesConnection) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_ValidationRulesConnection_type")
                : getString("_UI_ValidationRulesConnection_type") + " " + label;
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

        switch (notification.getFeatureID(ValidationRulesConnection.class)) {
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__IS_SELECT:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__IS_INSERT:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__IS_UPDATE:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__IS_DELETE:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__TYPE:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__BASE_SCHEMA:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__BASE_COLUMN_NAMES:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__REF_SCHEMA:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__REF_COLUMN_NAMES:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__JAVA_CONDITION:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__SQL_CONDITION:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__LOGICAL_OPERATOR:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__IS_DISALLOW:
        case ConnectionPackage.VALIDATION_RULES_CONNECTION__IS_REJECT_LINK:
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
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
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
