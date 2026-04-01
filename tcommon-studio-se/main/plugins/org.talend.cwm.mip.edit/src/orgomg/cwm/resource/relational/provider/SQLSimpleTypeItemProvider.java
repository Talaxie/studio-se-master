/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwm.resource.relational.provider;


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
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.core.provider.Cwm_mipEditPlugin;
import orgomg.cwm.resource.relational.RelationalPackage;
import orgomg.cwm.resource.relational.SQLSimpleType;

/**
 * This is the item provider adapter for a {@link orgomg.cwm.resource.relational.SQLSimpleType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SQLSimpleTypeItemProvider
    extends SQLDataTypeItemProvider
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
    public SQLSimpleTypeItemProvider(AdapterFactory adapterFactory) {
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

            addCharacterMaximumLengthPropertyDescriptor(object);
            addCharacterOctetLengthPropertyDescriptor(object);
            addNumericPrecisionPropertyDescriptor(object);
            addNumericPrecisionRadixPropertyDescriptor(object);
            addNumericScalePropertyDescriptor(object);
            addDateTimePrecisionPropertyDescriptor(object);
            addSqlDistinctTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Character Maximum Length feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCharacterMaximumLengthPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SQLSimpleType_characterMaximumLength_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SQLSimpleType_characterMaximumLength_feature", "_UI_SQLSimpleType_type"),
                 RelationalPackage.Literals.SQL_SIMPLE_TYPE__CHARACTER_MAXIMUM_LENGTH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Character Octet Length feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCharacterOctetLengthPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SQLSimpleType_characterOctetLength_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SQLSimpleType_characterOctetLength_feature", "_UI_SQLSimpleType_type"),
                 RelationalPackage.Literals.SQL_SIMPLE_TYPE__CHARACTER_OCTET_LENGTH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Numeric Precision feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNumericPrecisionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SQLSimpleType_numericPrecision_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SQLSimpleType_numericPrecision_feature", "_UI_SQLSimpleType_type"),
                 RelationalPackage.Literals.SQL_SIMPLE_TYPE__NUMERIC_PRECISION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Numeric Precision Radix feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNumericPrecisionRadixPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SQLSimpleType_numericPrecisionRadix_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SQLSimpleType_numericPrecisionRadix_feature", "_UI_SQLSimpleType_type"),
                 RelationalPackage.Literals.SQL_SIMPLE_TYPE__NUMERIC_PRECISION_RADIX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Numeric Scale feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNumericScalePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SQLSimpleType_numericScale_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SQLSimpleType_numericScale_feature", "_UI_SQLSimpleType_type"),
                 RelationalPackage.Literals.SQL_SIMPLE_TYPE__NUMERIC_SCALE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Date Time Precision feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDateTimePrecisionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SQLSimpleType_dateTimePrecision_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SQLSimpleType_dateTimePrecision_feature", "_UI_SQLSimpleType_type"),
                 RelationalPackage.Literals.SQL_SIMPLE_TYPE__DATE_TIME_PRECISION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sql Distinct Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSqlDistinctTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SQLSimpleType_sqlDistinctType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SQLSimpleType_sqlDistinctType_feature", "_UI_SQLSimpleType_type"),
                 RelationalPackage.Literals.SQL_SIMPLE_TYPE__SQL_DISTINCT_TYPE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns SQLSimpleType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SQLSimpleType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((SQLSimpleType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_SQLSimpleType_type") :
            getString("_UI_SQLSimpleType_type") + " " + label;
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

        switch (notification.getFeatureID(SQLSimpleType.class)) {
            case RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_MAXIMUM_LENGTH:
            case RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_OCTET_LENGTH:
            case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION:
            case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION_RADIX:
            case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_SCALE:
            case RelationalPackage.SQL_SIMPLE_TYPE__DATE_TIME_PRECISION:
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

        boolean qualify =
            childFeature == CorePackage.Literals.NAMESPACE__OWNED_ELEMENT ||
            childFeature == CorePackage.Literals.CLASSIFIER__FEATURE;

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
