/**
 * <copyright> </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.talend.cwm.relational.RelationalFactory;
import org.talend.dataquality.analysis.provider.DataqualityEditPlugin;
import org.talend.dataquality.indicators.definition.DefinitionFactory;
import org.talend.dataquality.indicators.definition.DefinitionPackage;
import org.talend.dataquality.indicators.definition.IndicatorDefinition;
import orgomg.cwm.objectmodel.core.provider.ModelElementItemProvider;

/**
 * This is the item provider adapter for a {@link org.talend.dataquality.indicators.definition.IndicatorDefinition}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class IndicatorDefinitionItemProvider extends ModelElementItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public IndicatorDefinitionItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addCategoriesPropertyDescriptor(object);
            addAggregatedDefinitionsPropertyDescriptor(object);
            addLabelPropertyDescriptor(object);
            addSubCategoriesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Categories feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addCategoriesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_IndicatorDefinition_categories_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_IndicatorDefinition_categories_feature",
                        "_UI_IndicatorDefinition_type"), DefinitionPackage.Literals.INDICATOR_DEFINITION__CATEGORIES, true,
                false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Aggregated Definitions feature. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    protected void addAggregatedDefinitionsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_IndicatorDefinition_aggregatedDefinitions_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_IndicatorDefinition_aggregatedDefinitions_feature",
                        "_UI_IndicatorDefinition_type"), DefinitionPackage.Literals.INDICATOR_DEFINITION__AGGREGATED_DEFINITIONS,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Label feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addLabelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_IndicatorDefinition_label_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_IndicatorDefinition_label_feature",
                        "_UI_IndicatorDefinition_type"), DefinitionPackage.Literals.INDICATOR_DEFINITION__LABEL, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Sub Categories feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addSubCategoriesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_IndicatorDefinition_subCategories_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_IndicatorDefinition_subCategories_feature",
                        "_UI_IndicatorDefinition_type"), DefinitionPackage.Literals.INDICATOR_DEFINITION__SUB_CATEGORIES, true,
                false, true, null, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(DefinitionPackage.Literals.INDICATOR_DEFINITION__SQL_GENERIC_EXPRESSION);
            childrenFeatures.add(DefinitionPackage.Literals.INDICATOR_DEFINITION__AGGREGATE1ARG_FUNCTIONS);
            childrenFeatures.add(DefinitionPackage.Literals.INDICATOR_DEFINITION__DATE1ARG_FUNCTIONS);
            childrenFeatures.add(DefinitionPackage.Literals.INDICATOR_DEFINITION__CHARACTERS_MAPPING);
            childrenFeatures.add(DefinitionPackage.Literals.INDICATOR_DEFINITION__INDICATOR_DEFINITION_PARAMETER);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns IndicatorDefinition.png. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/IndicatorDefinition"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((IndicatorDefinition) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_IndicatorDefinition_type")
                : getString("_UI_IndicatorDefinition_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
     * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(IndicatorDefinition.class)) {
        case DefinitionPackage.INDICATOR_DEFINITION__LABEL:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case DefinitionPackage.INDICATOR_DEFINITION__SQL_GENERIC_EXPRESSION:
        case DefinitionPackage.INDICATOR_DEFINITION__AGGREGATE1ARG_FUNCTIONS:
        case DefinitionPackage.INDICATOR_DEFINITION__DATE1ARG_FUNCTIONS:
        case DefinitionPackage.INDICATOR_DEFINITION__CHARACTERS_MAPPING:
        case DefinitionPackage.INDICATOR_DEFINITION__INDICATOR_DEFINITION_PARAMETER:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created
     * under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(DefinitionPackage.Literals.INDICATOR_DEFINITION__SQL_GENERIC_EXPRESSION,
                RelationalFactory.eINSTANCE.createTdExpression()));

        newChildDescriptors.add(createChildParameter(DefinitionPackage.Literals.INDICATOR_DEFINITION__AGGREGATE1ARG_FUNCTIONS,
                RelationalFactory.eINSTANCE.createTdExpression()));

        newChildDescriptors.add(createChildParameter(DefinitionPackage.Literals.INDICATOR_DEFINITION__DATE1ARG_FUNCTIONS,
                RelationalFactory.eINSTANCE.createTdExpression()));

        newChildDescriptors.add(createChildParameter(DefinitionPackage.Literals.INDICATOR_DEFINITION__CHARACTERS_MAPPING,
                DefinitionFactory.eINSTANCE.createCharactersMapping()));

        newChildDescriptors.add(createChildParameter(
                DefinitionPackage.Literals.INDICATOR_DEFINITION__INDICATOR_DEFINITION_PARAMETER,
                DefinitionFactory.eINSTANCE.createIndicatorDefinitionParameter()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == DefinitionPackage.Literals.INDICATOR_DEFINITION__SQL_GENERIC_EXPRESSION
                || childFeature == DefinitionPackage.Literals.INDICATOR_DEFINITION__AGGREGATE1ARG_FUNCTIONS
                || childFeature == DefinitionPackage.Literals.INDICATOR_DEFINITION__DATE1ARG_FUNCTIONS;

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject), getFeatureText(childFeature),
                    getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return DataqualityEditPlugin.INSTANCE;
    }

}
