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
import org.talend.core.model.metadata.builder.connection.FileConnection;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.FileConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileConnectionItemProvider extends ConnectionItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileConnectionItemProvider(AdapterFactory adapterFactory) {
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

            addServerPropertyDescriptor(object);
            addFilePathPropertyDescriptor(object);
            addFormatPropertyDescriptor(object);
            addEncodingPropertyDescriptor(object);
            addFieldSeparatorValuePropertyDescriptor(object);
            addRowSeparatorTypePropertyDescriptor(object);
            addRowSeparatorValuePropertyDescriptor(object);
            addTextIdentifierPropertyDescriptor(object);
            addUseHeaderPropertyDescriptor(object);
            addHeaderValuePropertyDescriptor(object);
            addUseFooterPropertyDescriptor(object);
            addFooterValuePropertyDescriptor(object);
            addUseLimitPropertyDescriptor(object);
            addLimitValuePropertyDescriptor(object);
            addFirstLineCaptionPropertyDescriptor(object);
            addRemoveEmptyRowPropertyDescriptor(object);
            addEscapeTypePropertyDescriptor(object);
            addEscapeCharPropertyDescriptor(object);
            addTextEnclosurePropertyDescriptor(object);
            addCsvOptionPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Server feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FileConnection_Server_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_Server_feature", "_UI_FileConnection_type"),
                ConnectionPackage.Literals.FILE_CONNECTION__SERVER, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the File Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFilePathPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_FileConnection_FilePath_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_FilePath_feature",
                                "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__FILE_PATH, true, false,
                        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Format feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFormatPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FileConnection_Format_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_Format_feature", "_UI_FileConnection_type"),
                ConnectionPackage.Literals.FILE_CONNECTION__FORMAT, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Encoding feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEncodingPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_FileConnection_Encoding_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_Encoding_feature",
                                "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__ENCODING, true, false,
                        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Field Separator Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFieldSeparatorValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_FieldSeparatorValue_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_FieldSeparatorValue_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__FIELD_SEPARATOR_VALUE, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Row Separator Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRowSeparatorTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_RowSeparatorType_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_RowSeparatorType_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__ROW_SEPARATOR_TYPE, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Row Separator Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRowSeparatorValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_RowSeparatorValue_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_RowSeparatorValue_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__ROW_SEPARATOR_VALUE, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Text Identifier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTextIdentifierPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_TextIdentifier_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_TextIdentifier_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__TEXT_IDENTIFIER, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Header feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseHeaderPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_FileConnection_UseHeader_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_UseHeader_feature",
                                "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__USE_HEADER, true, false,
                        false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Header Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeaderValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_HeaderValue_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_HeaderValue_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__HEADER_VALUE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Footer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseFooterPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_FileConnection_UseFooter_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_UseFooter_feature",
                                "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__USE_FOOTER, true, false,
                        false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Footer Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFooterValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_FooterValue_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_FooterValue_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__FOOTER_VALUE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseLimitPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_FileConnection_UseLimit_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_UseLimit_feature",
                                "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__USE_LIMIT, true, false,
                        false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Limit Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLimitValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_LimitValue_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_LimitValue_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__LIMIT_VALUE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the First Line Caption feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFirstLineCaptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_FirstLineCaption_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_FirstLineCaption_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__FIRST_LINE_CAPTION, true, false,
                false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Remove Empty Row feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoveEmptyRowPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_RemoveEmptyRow_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_RemoveEmptyRow_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__REMOVE_EMPTY_ROW, true, false,
                false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Escape Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEscapeTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_EscapeType_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_EscapeType_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__ESCAPE_TYPE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Escape Char feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEscapeCharPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_EscapeChar_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_EscapeChar_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__ESCAPE_CHAR, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Text Enclosure feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTextEnclosurePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FileConnection_TextEnclosure_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_TextEnclosure_feature",
                        "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__TEXT_ENCLOSURE, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Csv Option feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCsvOptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_FileConnection_CsvOption_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_FileConnection_CsvOption_feature",
                                "_UI_FileConnection_type"), ConnectionPackage.Literals.FILE_CONNECTION__CSV_OPTION, true, false,
                        false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This returns FileConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/FileConnection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((FileConnection) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_FileConnection_type") : getString("_UI_FileConnection_type")
                + " " + label;
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

        switch (notification.getFeatureID(FileConnection.class)) {
        case ConnectionPackage.FILE_CONNECTION__SERVER:
        case ConnectionPackage.FILE_CONNECTION__FILE_PATH:
        case ConnectionPackage.FILE_CONNECTION__FORMAT:
        case ConnectionPackage.FILE_CONNECTION__ENCODING:
        case ConnectionPackage.FILE_CONNECTION__FIELD_SEPARATOR_VALUE:
        case ConnectionPackage.FILE_CONNECTION__ROW_SEPARATOR_TYPE:
        case ConnectionPackage.FILE_CONNECTION__ROW_SEPARATOR_VALUE:
        case ConnectionPackage.FILE_CONNECTION__TEXT_IDENTIFIER:
        case ConnectionPackage.FILE_CONNECTION__USE_HEADER:
        case ConnectionPackage.FILE_CONNECTION__HEADER_VALUE:
        case ConnectionPackage.FILE_CONNECTION__USE_FOOTER:
        case ConnectionPackage.FILE_CONNECTION__FOOTER_VALUE:
        case ConnectionPackage.FILE_CONNECTION__USE_LIMIT:
        case ConnectionPackage.FILE_CONNECTION__LIMIT_VALUE:
        case ConnectionPackage.FILE_CONNECTION__FIRST_LINE_CAPTION:
        case ConnectionPackage.FILE_CONNECTION__REMOVE_EMPTY_ROW:
        case ConnectionPackage.FILE_CONNECTION__ESCAPE_TYPE:
        case ConnectionPackage.FILE_CONNECTION__ESCAPE_CHAR:
        case ConnectionPackage.FILE_CONNECTION__TEXT_ENCLOSURE:
        case ConnectionPackage.FILE_CONNECTION__CSV_OPTION:
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
