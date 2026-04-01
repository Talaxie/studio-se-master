/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import orgomg.cwm.analysis.datamining.CategoricalAttribute;
import orgomg.cwm.analysis.datamining.Category;
import orgomg.cwm.analysis.datamining.CategoryProperty;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Category</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.CategoryImpl#getDisplayValue <em>Display Value</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.CategoryImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.CategoryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.CategoryImpl#getCategoricalAttribute <em>Categorical Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends ModelElementImpl implements Category {

    /**
     * The default value of the '{@link #getDisplayValue() <em>Display Value</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDisplayValue()
     * @generated
     * @ordered
     */
    protected static final String DISPLAY_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDisplayValue() <em>Display Value</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDisplayValue()
     * @generated
     * @ordered
     */
    protected String displayValue = DISPLAY_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected static final CategoryProperty PROPERTY_EDEFAULT = CategoryProperty.MISSING;

    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected CategoryProperty property = PROPERTY_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected CategoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.CATEGORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDisplayValue(String newDisplayValue) {
        String oldDisplayValue = displayValue;
        displayValue = newDisplayValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.CATEGORY__DISPLAY_VALUE, oldDisplayValue,
                    displayValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CategoryProperty getProperty() {
        return property;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setProperty(CategoryProperty newProperty) {
        CategoryProperty oldProperty = property;
        property = newProperty == null ? PROPERTY_EDEFAULT : newProperty;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.CATEGORY__PROPERTY, oldProperty, property));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.CATEGORY__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CategoricalAttribute getCategoricalAttribute() {
        if (eContainerFeatureID() != DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE)
            return null;
        return (CategoricalAttribute) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCategoricalAttribute(CategoricalAttribute newCategoricalAttribute, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newCategoricalAttribute, DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCategoricalAttribute(CategoricalAttribute newCategoricalAttribute) {
        if (newCategoricalAttribute != eInternalContainer()
                || (eContainerFeatureID() != DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE && newCategoricalAttribute != null)) {
            if (EcoreUtil.isAncestor(this, newCategoricalAttribute))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newCategoricalAttribute != null)
                msgs = ((InternalEObject) newCategoricalAttribute).eInverseAdd(this,
                        DataminingPackage.CATEGORICAL_ATTRIBUTE__CATEGORY, CategoricalAttribute.class, msgs);
            msgs = basicSetCategoricalAttribute(newCategoricalAttribute, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE,
                    newCategoricalAttribute, newCategoricalAttribute));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetCategoricalAttribute((CategoricalAttribute) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE:
            return basicSetCategoricalAttribute(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE:
            return eInternalContainer().eInverseRemove(this, DataminingPackage.CATEGORICAL_ATTRIBUTE__CATEGORY,
                    CategoricalAttribute.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DataminingPackage.CATEGORY__DISPLAY_VALUE:
            return getDisplayValue();
        case DataminingPackage.CATEGORY__PROPERTY:
            return getProperty();
        case DataminingPackage.CATEGORY__VALUE:
            return getValue();
        case DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE:
            return getCategoricalAttribute();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DataminingPackage.CATEGORY__DISPLAY_VALUE:
            setDisplayValue((String) newValue);
            return;
        case DataminingPackage.CATEGORY__PROPERTY:
            setProperty((CategoryProperty) newValue);
            return;
        case DataminingPackage.CATEGORY__VALUE:
            setValue((String) newValue);
            return;
        case DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE:
            setCategoricalAttribute((CategoricalAttribute) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case DataminingPackage.CATEGORY__DISPLAY_VALUE:
            setDisplayValue(DISPLAY_VALUE_EDEFAULT);
            return;
        case DataminingPackage.CATEGORY__PROPERTY:
            setProperty(PROPERTY_EDEFAULT);
            return;
        case DataminingPackage.CATEGORY__VALUE:
            setValue(VALUE_EDEFAULT);
            return;
        case DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE:
            setCategoricalAttribute((CategoricalAttribute) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case DataminingPackage.CATEGORY__DISPLAY_VALUE:
            return DISPLAY_VALUE_EDEFAULT == null ? displayValue != null : !DISPLAY_VALUE_EDEFAULT.equals(displayValue);
        case DataminingPackage.CATEGORY__PROPERTY:
            return property != PROPERTY_EDEFAULT;
        case DataminingPackage.CATEGORY__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
        case DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE:
            return getCategoricalAttribute() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (displayValue: ");
        result.append(displayValue);
        result.append(", property: ");
        result.append(property);
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} // CategoryImpl
