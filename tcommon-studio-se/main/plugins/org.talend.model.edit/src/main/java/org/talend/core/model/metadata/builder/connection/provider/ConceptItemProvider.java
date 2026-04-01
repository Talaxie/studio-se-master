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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.talend.core.model.metadata.builder.connection.Concept;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.cwm.relational.provider.TdTableItemProvider;
import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.Concept} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptItemProvider extends TdTableItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConceptItemProvider(AdapterFactory adapterFactory) {
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

            addLoopExpressionPropertyDescriptor(object);
            addLoopLimitPropertyDescriptor(object);
            addInputModelPropertyDescriptor(object);
            addConceptTypePropertyDescriptor(object);
            addXPathPrefixPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Loop Expression feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoopExpressionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Concept_LoopExpression_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Concept_LoopExpression_feature", "_UI_Concept_type"),
                ConnectionPackage.Literals.CONCEPT__LOOP_EXPRESSION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Loop Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoopLimitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Concept_LoopLimit_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Concept_LoopLimit_feature", "_UI_Concept_type"),
                ConnectionPackage.Literals.CONCEPT__LOOP_LIMIT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Input Model feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputModelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Concept_inputModel_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Concept_inputModel_feature", "_UI_Concept_type"),
                ConnectionPackage.Literals.CONCEPT__INPUT_MODEL, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Concept Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConceptTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Concept_conceptType_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Concept_conceptType_feature", "_UI_Concept_type"),
                ConnectionPackage.Literals.CONCEPT__CONCEPT_TYPE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the XPath Prefix feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXPathPrefixPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Concept_xPathPrefix_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Concept_xPathPrefix_feature", "_UI_Concept_type"),
                ConnectionPackage.Literals.CONCEPT__XPATH_PREFIX, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null, null));
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
            childrenFeatures.add(ConnectionPackage.Literals.CONCEPT__CONCEPT_TARGETS);
            childrenFeatures.add(ConnectionPackage.Literals.CONCEPT__GROUP);
            childrenFeatures.add(ConnectionPackage.Literals.CONCEPT__ROOT);
            childrenFeatures.add(ConnectionPackage.Literals.CONCEPT__LOOP);
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
     * This returns Concept.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Concept"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Concept) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Concept_type") : getString("_UI_Concept_type") + " " + label;
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

        switch (notification.getFeatureID(Concept.class)) {
        case ConnectionPackage.CONCEPT__LOOP_EXPRESSION:
        case ConnectionPackage.CONCEPT__LOOP_LIMIT:
        case ConnectionPackage.CONCEPT__INPUT_MODEL:
        case ConnectionPackage.CONCEPT__CONCEPT_TYPE:
        case ConnectionPackage.CONCEPT__XPATH_PREFIX:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ConnectionPackage.CONCEPT__CONCEPT_TARGETS:
        case ConnectionPackage.CONCEPT__GROUP:
        case ConnectionPackage.CONCEPT__ROOT:
        case ConnectionPackage.CONCEPT__LOOP:
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

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.CONCEPT__CONCEPT_TARGETS,
                ConnectionFactory.eINSTANCE.createConceptTarget()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.CONCEPT__GROUP,
                ConnectionFactory.eINSTANCE.createXMLFileNode()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.CONCEPT__ROOT,
                ConnectionFactory.eINSTANCE.createXMLFileNode()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.CONCEPT__LOOP,
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
                || childFeature == CorePackage.Literals.CLASSIFIER__FEATURE
                || childFeature == ConnectionPackage.Literals.METADATA_TABLE__COLUMNS
                || childFeature == ConnectionPackage.Literals.CONCEPT__GROUP
                || childFeature == ConnectionPackage.Literals.CONCEPT__ROOT
                || childFeature == ConnectionPackage.Literals.CONCEPT__LOOP;

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
        return ((IChildCreationExtender) adapterFactory).getResourceLocator();
    }

}
