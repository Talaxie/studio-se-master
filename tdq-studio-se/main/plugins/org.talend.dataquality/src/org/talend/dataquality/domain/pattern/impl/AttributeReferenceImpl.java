/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.pattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.domain.pattern.AttributeReference;
import org.talend.dataquality.domain.pattern.PatternPackage;
import orgomg.cwm.objectmodel.core.Attribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.pattern.impl.AttributeReferenceImpl#getReferencedAttribute <em>Referenced Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeReferenceImpl extends PatternComponentImpl implements AttributeReference {
    /**
     * The cached value of the '{@link #getReferencedAttribute() <em>Referenced Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedAttribute()
     * @generated
     * @ordered
     */
    protected Attribute referencedAttribute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.ATTRIBUTE_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute getReferencedAttribute() {
        if (referencedAttribute != null && referencedAttribute.eIsProxy()) {
            InternalEObject oldReferencedAttribute = (InternalEObject)referencedAttribute;
            referencedAttribute = (Attribute)eResolveProxy(oldReferencedAttribute);
            if (referencedAttribute != oldReferencedAttribute) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE, oldReferencedAttribute, referencedAttribute));
            }
        }
        return referencedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute basicGetReferencedAttribute() {
        return referencedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedAttribute(Attribute newReferencedAttribute) {
        Attribute oldReferencedAttribute = referencedAttribute;
        referencedAttribute = newReferencedAttribute;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE, oldReferencedAttribute, referencedAttribute));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PatternPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE:
                if (resolve) return getReferencedAttribute();
                return basicGetReferencedAttribute();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PatternPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE:
                setReferencedAttribute((Attribute)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PatternPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE:
                setReferencedAttribute((Attribute)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PatternPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE:
                return referencedAttribute != null;
        }
        return super.eIsSet(featureID);
    }

} //AttributeReferenceImpl
