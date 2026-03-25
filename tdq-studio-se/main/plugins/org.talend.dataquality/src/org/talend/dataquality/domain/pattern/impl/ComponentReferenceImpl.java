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
import org.talend.dataquality.domain.pattern.ComponentReference;
import org.talend.dataquality.domain.pattern.PatternComponent;
import org.talend.dataquality.domain.pattern.PatternPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.pattern.impl.ComponentReferenceImpl#getReferencedComponent <em>Referenced Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentReferenceImpl extends PatternComponentImpl implements ComponentReference {
    /**
     * The cached value of the '{@link #getReferencedComponent() <em>Referenced Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedComponent()
     * @generated
     * @ordered
     */
    protected PatternComponent referencedComponent;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.COMPONENT_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternComponent getReferencedComponent() {
        if (referencedComponent != null && referencedComponent.eIsProxy()) {
            InternalEObject oldReferencedComponent = (InternalEObject)referencedComponent;
            referencedComponent = (PatternComponent)eResolveProxy(oldReferencedComponent);
            if (referencedComponent != oldReferencedComponent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.COMPONENT_REFERENCE__REFERENCED_COMPONENT, oldReferencedComponent, referencedComponent));
            }
        }
        return referencedComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternComponent basicGetReferencedComponent() {
        return referencedComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedComponent(PatternComponent newReferencedComponent) {
        PatternComponent oldReferencedComponent = referencedComponent;
        referencedComponent = newReferencedComponent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.COMPONENT_REFERENCE__REFERENCED_COMPONENT, oldReferencedComponent, referencedComponent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PatternPackage.COMPONENT_REFERENCE__REFERENCED_COMPONENT:
                if (resolve) return getReferencedComponent();
                return basicGetReferencedComponent();
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
            case PatternPackage.COMPONENT_REFERENCE__REFERENCED_COMPONENT:
                setReferencedComponent((PatternComponent)newValue);
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
            case PatternPackage.COMPONENT_REFERENCE__REFERENCED_COMPONENT:
                setReferencedComponent((PatternComponent)null);
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
            case PatternPackage.COMPONENT_REFERENCE__REFERENCED_COMPONENT:
                return referencedComponent != null;
        }
        return super.eIsSet(featureID);
    }

} //ComponentReferenceImpl
