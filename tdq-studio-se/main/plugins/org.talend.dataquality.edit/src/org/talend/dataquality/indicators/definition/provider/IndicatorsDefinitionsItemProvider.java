/**
 * <copyright>
 * </copyright>
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
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.talend.dataquality.analysis.provider.DataqualityEditPlugin;
import org.talend.dataquality.indicators.definition.DefinitionFactory;
import org.talend.dataquality.indicators.definition.DefinitionPackage;
import org.talend.dataquality.indicators.definition.IndicatorsDefinitions;
import org.talend.dataquality.rules.RulesFactory;
import orgomg.cwm.objectmodel.core.provider.ModelElementItemProvider;

/**
 * This is the item provider adapter for a {@link org.talend.dataquality.indicators.definition.IndicatorsDefinitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IndicatorsDefinitionsItemProvider
    extends ModelElementItemProvider
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
    public IndicatorsDefinitionsItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add(DefinitionPackage.Literals.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS);
            childrenFeatures.add(DefinitionPackage.Literals.INDICATORS_DEFINITIONS__CATEGORIES);
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
     * This returns IndicatorsDefinitions.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/IndicatorsDefinitions"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((IndicatorsDefinitions)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_IndicatorsDefinitions_type") :
            getString("_UI_IndicatorsDefinitions_type") + " " + label;
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

        switch (notification.getFeatureID(IndicatorsDefinitions.class)) {
            case DefinitionPackage.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS:
            case DefinitionPackage.INDICATORS_DEFINITIONS__CATEGORIES:
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

        newChildDescriptors.add
            (createChildParameter
                (DefinitionPackage.Literals.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS,
                 DefinitionFactory.eINSTANCE.createIndicatorDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (DefinitionPackage.Literals.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS,
                 RulesFactory.eINSTANCE.createDQRule()));

        newChildDescriptors.add
            (createChildParameter
                (DefinitionPackage.Literals.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS,
                 RulesFactory.eINSTANCE.createSpecifiedDQRule()));

        newChildDescriptors.add
            (createChildParameter
                (DefinitionPackage.Literals.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS,
                 RulesFactory.eINSTANCE.createInferredDQRule()));

        newChildDescriptors.add
            (createChildParameter
                (DefinitionPackage.Literals.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS,
                 RulesFactory.eINSTANCE.createWhereRule()));

        newChildDescriptors.add
            (createChildParameter
                (DefinitionPackage.Literals.INDICATORS_DEFINITIONS__CATEGORIES,
                 DefinitionFactory.eINSTANCE.createIndicatorCategory()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return DataqualityEditPlugin.INSTANCE;
    }

}
