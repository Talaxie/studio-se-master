/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.cwm.relational.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.talend.core.model.metadata.builder.connection.provider.MetadataEditPlugin;
import org.talend.core.model.metadata.builder.connection.provider.MetadataTableItemProvider;
import org.talend.cwm.relational.TdTable;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.resource.relational.RelationalPackage;

/**
 * This is the item provider adapter for a {@link org.talend.cwm.relational.TdTable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TdTableItemProvider extends MetadataTableItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TdTableItemProvider(AdapterFactory adapterFactory) {
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

            addUsingTriggerPropertyDescriptor(object);
            addTypePropertyDescriptor(object);
            addOptionScopeColumnPropertyDescriptor(object);
            addIsTemporaryPropertyDescriptor(object);
            addTemporaryScopePropertyDescriptor(object);
            addIsSystemPropertyDescriptor(object);
            addTriggerPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Using Trigger feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsingTriggerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_NamedColumnSet_usingTrigger_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_NamedColumnSet_usingTrigger_feature",
                        "_UI_NamedColumnSet_type"), RelationalPackage.Literals.NAMED_COLUMN_SET__USING_TRIGGER, true, false,
                true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_NamedColumnSet_type_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_NamedColumnSet_type_feature", "_UI_NamedColumnSet_type"),
                RelationalPackage.Literals.NAMED_COLUMN_SET__TYPE, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Option Scope Column feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOptionScopeColumnPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_NamedColumnSet_optionScopeColumn_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_NamedColumnSet_optionScopeColumn_feature",
                        "_UI_NamedColumnSet_type"), RelationalPackage.Literals.NAMED_COLUMN_SET__OPTION_SCOPE_COLUMN, true,
                false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Is Temporary feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsTemporaryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Table_isTemporary_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Table_isTemporary_feature", "_UI_Table_type"),
                RelationalPackage.Literals.TABLE__IS_TEMPORARY, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Temporary Scope feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTemporaryScopePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Table_temporaryScope_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Table_temporaryScope_feature", "_UI_Table_type"),
                RelationalPackage.Literals.TABLE__TEMPORARY_SCOPE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is System feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSystemPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Table_isSystem_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Table_isSystem_feature", "_UI_Table_type"),
                RelationalPackage.Literals.TABLE__IS_SYSTEM, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Trigger feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTriggerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Table_trigger_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Table_trigger_feature", "_UI_Table_type"),
                RelationalPackage.Literals.TABLE__TRIGGER, true, false, true, null, null, null));
    }

    /**
     * This returns TdTable.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/TdTable"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((TdTable) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_TdTable_type") : getString("_UI_TdTable_type") + " " + label;
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

        switch (notification.getFeatureID(TdTable.class)) {
        case org.talend.cwm.relational.RelationalPackage.TD_TABLE__IS_TEMPORARY:
        case org.talend.cwm.relational.RelationalPackage.TD_TABLE__TEMPORARY_SCOPE:
        case org.talend.cwm.relational.RelationalPackage.TD_TABLE__IS_SYSTEM:
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
                || childFeature == CorePackage.Literals.CLASSIFIER__FEATURE
                || childFeature == ConnectionPackage.Literals.METADATA_TABLE__COLUMNS;

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject), getFeatureText(childFeature),
                    getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return MetadataEditPlugin.INSTANCE;
    }

}
