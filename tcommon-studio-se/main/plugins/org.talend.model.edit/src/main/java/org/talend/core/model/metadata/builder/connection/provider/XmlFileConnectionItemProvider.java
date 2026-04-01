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
import org.talend.core.model.metadata.builder.connection.XmlFileConnection;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.XmlFileConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlFileConnectionItemProvider extends ConnectionItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmlFileConnectionItemProvider(AdapterFactory adapterFactory) {
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

            addXsdFilePathPropertyDescriptor(object);
            addXmlFilePathPropertyDescriptor(object);
            addGuessPropertyDescriptor(object);
            addMaskXPatternPropertyDescriptor(object);
            addEncodingPropertyDescriptor(object);
            addInputModelPropertyDescriptor(object);
            addOutputFilePathPropertyDescriptor(object);
            addFileContentPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Xsd File Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXsdFilePathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_XmlFileConnection_XsdFilePath_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_XmlFileConnection_XsdFilePath_feature",
                        "_UI_XmlFileConnection_type"), ConnectionPackage.Literals.XML_FILE_CONNECTION__XSD_FILE_PATH, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Xml File Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXmlFilePathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_XmlFileConnection_XmlFilePath_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_XmlFileConnection_XmlFilePath_feature",
                        "_UI_XmlFileConnection_type"), ConnectionPackage.Literals.XML_FILE_CONNECTION__XML_FILE_PATH, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Guess feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGuessPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_XmlFileConnection_Guess_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_XmlFileConnection_Guess_feature",
                        "_UI_XmlFileConnection_type"), ConnectionPackage.Literals.XML_FILE_CONNECTION__GUESS, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Mask XPattern feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaskXPatternPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_XmlFileConnection_MaskXPattern_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_XmlFileConnection_MaskXPattern_feature",
                        "_UI_XmlFileConnection_type"), ConnectionPackage.Literals.XML_FILE_CONNECTION__MASK_XPATTERN, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Encoding feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEncodingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_XmlFileConnection_Encoding_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_XmlFileConnection_Encoding_feature",
                        "_UI_XmlFileConnection_type"), ConnectionPackage.Literals.XML_FILE_CONNECTION__ENCODING, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Input Model feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputModelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_XmlFileConnection_inputModel_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_XmlFileConnection_inputModel_feature",
                        "_UI_XmlFileConnection_type"), ConnectionPackage.Literals.XML_FILE_CONNECTION__INPUT_MODEL, true, false,
                false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Output File Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutputFilePathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_XmlFileConnection_outputFilePath_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_XmlFileConnection_outputFilePath_feature",
                        "_UI_XmlFileConnection_type"), ConnectionPackage.Literals.XML_FILE_CONNECTION__OUTPUT_FILE_PATH, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the File Content feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFileContentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_XmlFileConnection_fileContent_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_XmlFileConnection_fileContent_feature",
                        "_UI_XmlFileConnection_type"), ConnectionPackage.Literals.XML_FILE_CONNECTION__FILE_CONTENT, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(ConnectionPackage.Literals.XML_FILE_CONNECTION__SCHEMA);
            childrenFeatures.add(ConnectionPackage.Literals.XML_FILE_CONNECTION__GROUP);
            childrenFeatures.add(ConnectionPackage.Literals.XML_FILE_CONNECTION__ROOT);
            childrenFeatures.add(ConnectionPackage.Literals.XML_FILE_CONNECTION__LOOP);
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
     * This returns XmlFileConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/XmlFileConnection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((XmlFileConnection) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_XmlFileConnection_type")
                : getString("_UI_XmlFileConnection_type") + " " + label;
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

        switch (notification.getFeatureID(XmlFileConnection.class)) {
        case ConnectionPackage.XML_FILE_CONNECTION__XSD_FILE_PATH:
        case ConnectionPackage.XML_FILE_CONNECTION__XML_FILE_PATH:
        case ConnectionPackage.XML_FILE_CONNECTION__GUESS:
        case ConnectionPackage.XML_FILE_CONNECTION__MASK_XPATTERN:
        case ConnectionPackage.XML_FILE_CONNECTION__ENCODING:
        case ConnectionPackage.XML_FILE_CONNECTION__INPUT_MODEL:
        case ConnectionPackage.XML_FILE_CONNECTION__OUTPUT_FILE_PATH:
        case ConnectionPackage.XML_FILE_CONNECTION__FILE_CONTENT:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ConnectionPackage.XML_FILE_CONNECTION__SCHEMA:
        case ConnectionPackage.XML_FILE_CONNECTION__GROUP:
        case ConnectionPackage.XML_FILE_CONNECTION__ROOT:
        case ConnectionPackage.XML_FILE_CONNECTION__LOOP:
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

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.XML_FILE_CONNECTION__SCHEMA,
                ConnectionFactory.eINSTANCE.createXmlXPathLoopDescriptor()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.XML_FILE_CONNECTION__GROUP,
                ConnectionFactory.eINSTANCE.createXMLFileNode()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.XML_FILE_CONNECTION__ROOT,
                ConnectionFactory.eINSTANCE.createXMLFileNode()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.XML_FILE_CONNECTION__LOOP,
                ConnectionFactory.eINSTANCE.createXMLFileNode()));
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
                || childFeature == SoftwaredeploymentPackage.Literals.DATA_PROVIDER__RESOURCE_CONNECTION
                || childFeature == ConnectionPackage.Literals.XML_FILE_CONNECTION__GROUP
                || childFeature == ConnectionPackage.Literals.XML_FILE_CONNECTION__ROOT
                || childFeature == ConnectionPackage.Literals.XML_FILE_CONNECTION__LOOP;

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject), getFeatureText(childFeature),
                    getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
