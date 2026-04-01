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
import org.talend.core.model.metadata.builder.connection.FileExcelConnection;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.FileExcelConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileExcelConnectionItemProvider extends FileConnectionItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileExcelConnectionItemProvider(AdapterFactory adapterFactory) {
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

            addSheetNamePropertyDescriptor(object);
            addSheetColumnsPropertyDescriptor(object);
            addFirstColumnPropertyDescriptor(object);
            addLastColumnPropertyDescriptor(object);
            addThousandSeparatorPropertyDescriptor(object);
            addDecimalSeparatorPropertyDescriptor(object);
            addAdvancedSpearatorPropertyDescriptor(object);
            addSelectAllSheetsPropertyDescriptor(object);
            addSheetListPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Sheet Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSheetNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileExcelConnection_SheetName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileExcelConnection_SheetName_feature",
                        "_UI_FileExcelConnection_type"), ConnectionPackage.Literals.FILE_EXCEL_CONNECTION__SHEET_NAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Sheet Columns feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSheetColumnsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileExcelConnection_sheetColumns_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileExcelConnection_sheetColumns_feature",
                        "_UI_FileExcelConnection_type"), ConnectionPackage.Literals.FILE_EXCEL_CONNECTION__SHEET_COLUMNS, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the First Column feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFirstColumnPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileExcelConnection_firstColumn_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileExcelConnection_firstColumn_feature",
                        "_UI_FileExcelConnection_type"), ConnectionPackage.Literals.FILE_EXCEL_CONNECTION__FIRST_COLUMN, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Last Column feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastColumnPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileExcelConnection_lastColumn_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileExcelConnection_lastColumn_feature",
                        "_UI_FileExcelConnection_type"), ConnectionPackage.Literals.FILE_EXCEL_CONNECTION__LAST_COLUMN, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Thousand Separator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThousandSeparatorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileExcelConnection_thousandSeparator_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileExcelConnection_thousandSeparator_feature",
                        "_UI_FileExcelConnection_type"), ConnectionPackage.Literals.FILE_EXCEL_CONNECTION__THOUSAND_SEPARATOR,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Decimal Separator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDecimalSeparatorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileExcelConnection_decimalSeparator_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileExcelConnection_decimalSeparator_feature",
                        "_UI_FileExcelConnection_type"), ConnectionPackage.Literals.FILE_EXCEL_CONNECTION__DECIMAL_SEPARATOR,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Advanced Spearator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAdvancedSpearatorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileExcelConnection_advancedSpearator_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileExcelConnection_advancedSpearator_feature",
                        "_UI_FileExcelConnection_type"), ConnectionPackage.Literals.FILE_EXCEL_CONNECTION__ADVANCED_SPEARATOR,
                true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Select All Sheets feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSelectAllSheetsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileExcelConnection_selectAllSheets_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileExcelConnection_selectAllSheets_feature",
                        "_UI_FileExcelConnection_type"), ConnectionPackage.Literals.FILE_EXCEL_CONNECTION__SELECT_ALL_SHEETS,
                true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Sheet List feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSheetListPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileExcelConnection_sheetList_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileExcelConnection_sheetList_feature",
                        "_UI_FileExcelConnection_type"), ConnectionPackage.Literals.FILE_EXCEL_CONNECTION__SHEET_LIST, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns FileExcelConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/FileExcelConnection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((FileExcelConnection) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_FileExcelConnection_type")
                : getString("_UI_FileExcelConnection_type") + " " + label;
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

        switch (notification.getFeatureID(FileExcelConnection.class)) {
        case ConnectionPackage.FILE_EXCEL_CONNECTION__SHEET_NAME:
        case ConnectionPackage.FILE_EXCEL_CONNECTION__SHEET_COLUMNS:
        case ConnectionPackage.FILE_EXCEL_CONNECTION__FIRST_COLUMN:
        case ConnectionPackage.FILE_EXCEL_CONNECTION__LAST_COLUMN:
        case ConnectionPackage.FILE_EXCEL_CONNECTION__THOUSAND_SEPARATOR:
        case ConnectionPackage.FILE_EXCEL_CONNECTION__DECIMAL_SEPARATOR:
        case ConnectionPackage.FILE_EXCEL_CONNECTION__ADVANCED_SPEARATOR:
        case ConnectionPackage.FILE_EXCEL_CONNECTION__SELECT_ALL_SHEETS:
        case ConnectionPackage.FILE_EXCEL_CONNECTION__SHEET_LIST:
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
