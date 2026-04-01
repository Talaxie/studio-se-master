/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.talend.dataquality.domain.Domain;
import org.talend.dataquality.domain.DomainPackage;
import org.talend.dataquality.domain.EnumerationRule;
import orgomg.cwm.foundation.datatypes.Enumeration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.impl.EnumerationRuleImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.impl.EnumerationRuleImpl#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationRuleImpl extends EObjectImpl implements EnumerationRule {
    /**
     * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected EList<Domain> domain;

    /**
     * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnumeration()
     * @generated
     * @ordered
     */
    protected Enumeration enumeration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumerationRuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DomainPackage.Literals.ENUMERATION_RULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Domain> getDomain() {
        if (domain == null) {
            domain = new EObjectResolvingEList<Domain>(Domain.class, this, DomainPackage.ENUMERATION_RULE__DOMAIN);
        }
        return domain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Enumeration getEnumeration() {
        if (enumeration != null && enumeration.eIsProxy()) {
            InternalEObject oldEnumeration = (InternalEObject)enumeration;
            enumeration = (Enumeration)eResolveProxy(oldEnumeration);
            if (enumeration != oldEnumeration) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ENUMERATION_RULE__ENUMERATION, oldEnumeration, enumeration));
            }
        }
        return enumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Enumeration basicGetEnumeration() {
        return enumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnumeration(Enumeration newEnumeration) {
        Enumeration oldEnumeration = enumeration;
        enumeration = newEnumeration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ENUMERATION_RULE__ENUMERATION, oldEnumeration, enumeration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DomainPackage.ENUMERATION_RULE__DOMAIN:
                return getDomain();
            case DomainPackage.ENUMERATION_RULE__ENUMERATION:
                if (resolve) return getEnumeration();
                return basicGetEnumeration();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DomainPackage.ENUMERATION_RULE__DOMAIN:
                getDomain().clear();
                getDomain().addAll((Collection<? extends Domain>)newValue);
                return;
            case DomainPackage.ENUMERATION_RULE__ENUMERATION:
                setEnumeration((Enumeration)newValue);
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
            case DomainPackage.ENUMERATION_RULE__DOMAIN:
                getDomain().clear();
                return;
            case DomainPackage.ENUMERATION_RULE__ENUMERATION:
                setEnumeration((Enumeration)null);
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
            case DomainPackage.ENUMERATION_RULE__DOMAIN:
                return domain != null && !domain.isEmpty();
            case DomainPackage.ENUMERATION_RULE__ENUMERATION:
                return enumeration != null;
        }
        return super.eIsSet(featureID);
    }

} //EnumerationRuleImpl
