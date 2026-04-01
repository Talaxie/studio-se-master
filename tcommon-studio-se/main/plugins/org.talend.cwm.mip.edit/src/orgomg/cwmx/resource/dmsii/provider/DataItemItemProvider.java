/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwmx.resource.dmsii.provider;


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
import orgomg.cwm.foundation.expressions.ExpressionsFactory;
import orgomg.cwm.objectmodel.core.provider.Cwm_mipEditPlugin;
import orgomg.cwm.resource.record.provider.FieldItemProvider;
import orgomg.cwmx.resource.dmsii.DataItem;
import orgomg.cwmx.resource.dmsii.DmsiiFactory;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;

/**
 * This is the item provider adapter for a {@link orgomg.cwmx.resource.dmsii.DataItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataItemItemProvider
    extends FieldItemProvider
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
    public DataItemItemProvider(AdapterFactory adapterFactory) {
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

            addIsRequiredPropertyDescriptor(object);
            addSizePropertyDescriptor(object);
            addScaleFactorPropertyDescriptor(object);
            addIsSignedPropertyDescriptor(object);
            addOccursPropertyDescriptor(object);
            addIsVirtualPropertyDescriptor(object);
            addIsKanjiPropertyDescriptor(object);
            addCcsVersionPropertyDescriptor(object);
            addIsGemcosLiteralPropertyDescriptor(object);
            addIsGemcosDataPropertyDescriptor(object);
            addIsGemcosSSNPropertyDescriptor(object);
            addIsGemcosDBSNPropertyDescriptor(object);
            addIsComsProgramPropertyDescriptor(object);
            addIsComsIDPropertyDescriptor(object);
            addIsComsLocatorPropertyDescriptor(object);
            addIsComsOutpQPropertyDescriptor(object);
            addOccuringDataItemPropertyDescriptor(object);
            addOccursDataItemPropertyDescriptor(object);
            addKeyDataSetPropertyDescriptor(object);
            addStructurePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Is Required feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsRequiredPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isRequired_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isRequired_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_REQUIRED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_size_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_size_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Scale Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScaleFactorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_scaleFactor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_scaleFactor_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__SCALE_FACTOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Signed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSignedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isSigned_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isSigned_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_SIGNED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Occurs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOccursPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_occurs_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_occurs_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__OCCURS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Virtual feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsVirtualPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isVirtual_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isVirtual_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_VIRTUAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Kanji feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsKanjiPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isKanji_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isKanji_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_KANJI,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ccs Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCcsVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_ccsVersion_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_ccsVersion_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__CCS_VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Gemcos Literal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsGemcosLiteralPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isGemcosLiteral_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isGemcosLiteral_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_GEMCOS_LITERAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Gemcos Data feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsGemcosDataPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isGemcosData_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isGemcosData_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_GEMCOS_DATA,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Gemcos SSN feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsGemcosSSNPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isGemcosSSN_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isGemcosSSN_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_GEMCOS_SSN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Gemcos DBSN feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsGemcosDBSNPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isGemcosDBSN_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isGemcosDBSN_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_GEMCOS_DBSN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Coms Program feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsComsProgramPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isComsProgram_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isComsProgram_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_COMS_PROGRAM,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Coms ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsComsIDPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isComsID_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isComsID_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_COMS_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Coms Locator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsComsLocatorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isComsLocator_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isComsLocator_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_COMS_LOCATOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Coms Outp Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsComsOutpQPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_isComsOutpQ_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_isComsOutpQ_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__IS_COMS_OUTP_Q,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Occuring Data Item feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOccuringDataItemPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_occuringDataItem_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_occuringDataItem_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__OCCURING_DATA_ITEM,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Occurs Data Item feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOccursDataItemPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_occursDataItem_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_occursDataItem_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__OCCURS_DATA_ITEM,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Key Data Set feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeyDataSetPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_keyDataSet_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_keyDataSet_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__KEY_DATA_SET,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Structure feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStructurePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataItem_structure_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataItem_structure_feature", "_UI_DataItem_type"),
                 DmsiiPackage.Literals.DATA_ITEM__STRUCTURE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
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
            childrenFeatures.add(DmsiiPackage.Literals.DATA_ITEM__NULL_VALUE);
            childrenFeatures.add(DmsiiPackage.Literals.DATA_ITEM__VIRTUAL_EXPRESSION);
            childrenFeatures.add(DmsiiPackage.Literals.DATA_ITEM__FIELD_BIT);
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
     * This returns DataItem.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DataItem"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((DataItem)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_DataItem_type") :
            getString("_UI_DataItem_type") + " " + label;
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

        switch (notification.getFeatureID(DataItem.class)) {
            case DmsiiPackage.DATA_ITEM__IS_REQUIRED:
            case DmsiiPackage.DATA_ITEM__SIZE:
            case DmsiiPackage.DATA_ITEM__SCALE_FACTOR:
            case DmsiiPackage.DATA_ITEM__IS_SIGNED:
            case DmsiiPackage.DATA_ITEM__OCCURS:
            case DmsiiPackage.DATA_ITEM__IS_VIRTUAL:
            case DmsiiPackage.DATA_ITEM__IS_KANJI:
            case DmsiiPackage.DATA_ITEM__CCS_VERSION:
            case DmsiiPackage.DATA_ITEM__IS_GEMCOS_LITERAL:
            case DmsiiPackage.DATA_ITEM__IS_GEMCOS_DATA:
            case DmsiiPackage.DATA_ITEM__IS_GEMCOS_SSN:
            case DmsiiPackage.DATA_ITEM__IS_GEMCOS_DBSN:
            case DmsiiPackage.DATA_ITEM__IS_COMS_PROGRAM:
            case DmsiiPackage.DATA_ITEM__IS_COMS_ID:
            case DmsiiPackage.DATA_ITEM__IS_COMS_LOCATOR:
            case DmsiiPackage.DATA_ITEM__IS_COMS_OUTP_Q:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case DmsiiPackage.DATA_ITEM__NULL_VALUE:
            case DmsiiPackage.DATA_ITEM__VIRTUAL_EXPRESSION:
            case DmsiiPackage.DATA_ITEM__FIELD_BIT:
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
                (DmsiiPackage.Literals.DATA_ITEM__NULL_VALUE,
                 ExpressionsFactory.eINSTANCE.createExpressionNode()));

        newChildDescriptors.add
            (createChildParameter
                (DmsiiPackage.Literals.DATA_ITEM__NULL_VALUE,
                 ExpressionsFactory.eINSTANCE.createConstantNode()));

        newChildDescriptors.add
            (createChildParameter
                (DmsiiPackage.Literals.DATA_ITEM__NULL_VALUE,
                 ExpressionsFactory.eINSTANCE.createElementNode()));

        newChildDescriptors.add
            (createChildParameter
                (DmsiiPackage.Literals.DATA_ITEM__NULL_VALUE,
                 ExpressionsFactory.eINSTANCE.createFeatureNode()));

        newChildDescriptors.add
            (createChildParameter
                (DmsiiPackage.Literals.DATA_ITEM__VIRTUAL_EXPRESSION,
                 ExpressionsFactory.eINSTANCE.createExpressionNode()));

        newChildDescriptors.add
            (createChildParameter
                (DmsiiPackage.Literals.DATA_ITEM__VIRTUAL_EXPRESSION,
                 ExpressionsFactory.eINSTANCE.createConstantNode()));

        newChildDescriptors.add
            (createChildParameter
                (DmsiiPackage.Literals.DATA_ITEM__VIRTUAL_EXPRESSION,
                 ExpressionsFactory.eINSTANCE.createElementNode()));

        newChildDescriptors.add
            (createChildParameter
                (DmsiiPackage.Literals.DATA_ITEM__VIRTUAL_EXPRESSION,
                 ExpressionsFactory.eINSTANCE.createFeatureNode()));

        newChildDescriptors.add
            (createChildParameter
                (DmsiiPackage.Literals.DATA_ITEM__FIELD_BIT,
                 DmsiiFactory.eINSTANCE.createFieldBit()));
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
            childFeature == DmsiiPackage.Literals.DATA_ITEM__NULL_VALUE ||
            childFeature == DmsiiPackage.Literals.DATA_ITEM__VIRTUAL_EXPRESSION;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
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
        return Cwm_mipEditPlugin.INSTANCE;
    }

}
