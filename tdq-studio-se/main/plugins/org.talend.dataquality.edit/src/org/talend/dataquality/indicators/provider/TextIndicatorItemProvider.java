/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.talend.dataquality.indicators.IndicatorsFactory;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.TextIndicator;

/**
 * This is the item provider adapter for a {@link org.talend.dataquality.indicators.TextIndicator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextIndicatorItemProvider
    extends CompositeIndicatorItemProvider
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
    public TextIndicatorItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR);
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_INDICATOR);
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_INDICATOR);
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR);
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR);
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR);
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR);
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR);
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR);
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR);
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR);
            childrenFeatures.add(IndicatorsPackage.Literals.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR);
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
     * This returns TextIndicator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/TextIndicator"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((TextIndicator)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_TextIndicator_type") :
            getString("_UI_TextIndicator_type") + " " + label;
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

        switch (notification.getFeatureID(TextIndicator.class)) {
            case IndicatorsPackage.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR:
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_INDICATOR:
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_INDICATOR:
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR:
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR:
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR:
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR:
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR:
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR:
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR:
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR:
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR:
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
                (IndicatorsPackage.Literals.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createAverageLengthIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createAvgLengthWithNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createAvgLengthWithBlankIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createAvgLengthWithBlankNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMaxLengthIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMaxLengthWithNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMaxLengthWithBlankIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMaxLengthWithBlankNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMinLengthIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMinLengthWithNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMinLengthWithBlankIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMinLengthWithBlankNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMinLengthWithBlankIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMinLengthWithNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMinLengthWithBlankNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMaxLengthWithBlankIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMaxLengthWithNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createMaxLengthWithBlankNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createAvgLengthWithBlankIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createAvgLengthWithNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (IndicatorsPackage.Literals.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createAvgLengthWithBlankNullIndicator()));
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

        boolean qualify =
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR ||
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR ||
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR ||
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR ||
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_INDICATOR ||
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR ||
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR ||
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR ||
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_INDICATOR ||
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR ||
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR ||
            childFeature == IndicatorsPackage.Literals.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
