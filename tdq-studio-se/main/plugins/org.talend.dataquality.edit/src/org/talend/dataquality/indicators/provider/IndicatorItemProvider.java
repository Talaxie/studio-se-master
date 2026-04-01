/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.provider;

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
import org.talend.dataquality.analysis.provider.DataqualityEditPlugin;
import org.talend.dataquality.indicators.Indicator;
import org.talend.dataquality.indicators.IndicatorsFactory;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.rules.RulesFactory;
import orgomg.cwm.foundation.datatypes.DatatypesFactory;
import orgomg.cwm.objectmodel.core.CoreFactory;
import orgomg.cwm.objectmodel.core.provider.ModelElementItemProvider;

/**
 * This is the item provider adapter for a {@link org.talend.dataquality.indicators.Indicator} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class IndicatorItemProvider extends ModelElementItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public IndicatorItemProvider(AdapterFactory adapterFactory) {
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

            addCountPropertyDescriptor(object);
            addNullCountPropertyDescriptor(object);
            addAnalyzedElementPropertyDescriptor(object);
            addDataminingTypePropertyDescriptor(object);
            addIndicatorDefinitionPropertyDescriptor(object);
            addComputedPropertyDescriptor(object);
            addMaxNumberRowsPropertyDescriptor(object);
            addValidRowPropertyDescriptor(object);
            addInValidRowPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Count feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory)
                .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Indicator_count_feature"), getString(
                "_UI_PropertyDescriptor_description", "_UI_Indicator_count_feature", "_UI_Indicator_type"),
                IndicatorsPackage.Literals.INDICATOR__COUNT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Null Count feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addNullCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory)
                .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Indicator_nullCount_feature"), getString(
                "_UI_PropertyDescriptor_description", "_UI_Indicator_nullCount_feature", "_UI_Indicator_type"),
                IndicatorsPackage.Literals.INDICATOR__NULL_COUNT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Analyzed Element feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addAnalyzedElementPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory)
                .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Indicator_analyzedElement_feature"), getString(
                "_UI_PropertyDescriptor_description", "_UI_Indicator_analyzedElement_feature", "_UI_Indicator_type"),
                IndicatorsPackage.Literals.INDICATOR__ANALYZED_ELEMENT, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Datamining Type feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addDataminingTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory)
                .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Indicator_dataminingType_feature"), getString(
                "_UI_PropertyDescriptor_description", "_UI_Indicator_dataminingType_feature", "_UI_Indicator_type"),
                IndicatorsPackage.Literals.INDICATOR__DATAMINING_TYPE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Indicator Definition feature. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    protected void addIndicatorDefinitionPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Indicator_indicatorDefinition_feature"), getString(
                                "_UI_PropertyDescriptor_description", "_UI_Indicator_indicatorDefinition_feature",
                                "_UI_Indicator_type"), IndicatorsPackage.Literals.INDICATOR__INDICATOR_DEFINITION, true, false,
                        true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Computed feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addComputedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory)
                .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Indicator_computed_feature"), getString(
                "_UI_PropertyDescriptor_description", "_UI_Indicator_computed_feature", "_UI_Indicator_type"),
                IndicatorsPackage.Literals.INDICATOR__COMPUTED, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Max Number Rows feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addMaxNumberRowsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory)
                .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Indicator_maxNumberRows_feature"), getString(
                "_UI_PropertyDescriptor_description", "_UI_Indicator_maxNumberRows_feature", "_UI_Indicator_type"),
                IndicatorsPackage.Literals.INDICATOR__MAX_NUMBER_ROWS, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Valid Row feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addValidRowPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory)
                .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Indicator_validRow_feature"), getString(
                "_UI_PropertyDescriptor_description", "_UI_Indicator_validRow_feature", "_UI_Indicator_type"),
                IndicatorsPackage.Literals.INDICATOR__VALID_ROW, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the In Valid Row feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addInValidRowPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory)
                .getRootAdapterFactory(), getResourceLocator(), getString("_UI_Indicator_inValidRow_feature"), getString(
                "_UI_PropertyDescriptor_description", "_UI_Indicator_inValidRow_feature", "_UI_Indicator_type"),
                IndicatorsPackage.Literals.INDICATOR__IN_VALID_ROW, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(IndicatorsPackage.Literals.INDICATOR__PARAMETERS);
            childrenFeatures.add(IndicatorsPackage.Literals.INDICATOR__INSTANTIATED_EXPRESSIONS);
            childrenFeatures.add(IndicatorsPackage.Literals.INDICATOR__JOIN_CONDITIONS);
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
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Indicator) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Indicator_type") : getString("_UI_Indicator_type") + " "
                + label;
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

        switch (notification.getFeatureID(Indicator.class)) {
        case IndicatorsPackage.INDICATOR__COUNT:
        case IndicatorsPackage.INDICATOR__NULL_COUNT:
        case IndicatorsPackage.INDICATOR__DATAMINING_TYPE:
        case IndicatorsPackage.INDICATOR__COMPUTED:
        case IndicatorsPackage.INDICATOR__MAX_NUMBER_ROWS:
        case IndicatorsPackage.INDICATOR__VALID_ROW:
        case IndicatorsPackage.INDICATOR__IN_VALID_ROW:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case IndicatorsPackage.INDICATOR__PARAMETERS:
        case IndicatorsPackage.INDICATOR__INSTANTIATED_EXPRESSIONS:
        case IndicatorsPackage.INDICATOR__JOIN_CONDITIONS:
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

        newChildDescriptors.add(createChildParameter(IndicatorsPackage.Literals.INDICATOR__PARAMETERS,
                IndicatorsFactory.eINSTANCE.createIndicatorParameters()));

        newChildDescriptors.add(createChildParameter(IndicatorsPackage.Literals.INDICATOR__INSTANTIATED_EXPRESSIONS,
                CoreFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add(createChildParameter(IndicatorsPackage.Literals.INDICATOR__INSTANTIATED_EXPRESSIONS,
                CoreFactory.eINSTANCE.createBooleanExpression()));

        newChildDescriptors.add(createChildParameter(IndicatorsPackage.Literals.INDICATOR__INSTANTIATED_EXPRESSIONS,
                CoreFactory.eINSTANCE.createProcedureExpression()));

        newChildDescriptors.add(createChildParameter(IndicatorsPackage.Literals.INDICATOR__INSTANTIATED_EXPRESSIONS,
                DatatypesFactory.eINSTANCE.createQueryExpression()));

        newChildDescriptors.add(createChildParameter(IndicatorsPackage.Literals.INDICATOR__JOIN_CONDITIONS,
                RulesFactory.eINSTANCE.createJoinElement()));
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
