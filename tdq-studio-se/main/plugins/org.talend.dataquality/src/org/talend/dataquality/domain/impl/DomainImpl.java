/**
 * <copyright> </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.dataquality.domain.Domain;
import org.talend.dataquality.domain.DomainPackage;
import org.talend.dataquality.domain.JavaUDIIndicatorParameter;
import org.talend.dataquality.domain.LengthRestriction;
import org.talend.dataquality.domain.RangeRestriction;
import org.talend.dataquality.domain.pattern.Pattern;
import orgomg.cwm.objectmodel.core.DataType;
import orgomg.cwm.objectmodel.core.impl.NamespaceImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Domain</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.dataquality.domain.impl.DomainImpl#getDataType <em>Data Type</em>}</li>
 * <li>{@link org.talend.dataquality.domain.impl.DomainImpl#getLengthRestriction <em>Length Restriction</em>}</li>
 * <li>{@link org.talend.dataquality.domain.impl.DomainImpl#getRanges <em>Ranges</em>}</li>
 * <li>{@link org.talend.dataquality.domain.impl.DomainImpl#getPatterns <em>Patterns</em>}</li>
 * <li>{@link org.talend.dataquality.domain.impl.DomainImpl#getJavaUDIIndicatorParameter <em>Java UDI Indicator
 * Parameter</em>}</li>
 * <li>{@link org.talend.dataquality.domain.impl.DomainImpl#getBuiltInPatterns <em>Built In Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends NamespaceImpl implements Domain {

    /**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected DataType dataType;

    /**
     * The cached value of the '{@link #getLengthRestriction() <em>Length Restriction</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLengthRestriction()
     * @generated
     * @ordered
     */
    protected EList<LengthRestriction> lengthRestriction;

    /**
     * The cached value of the '{@link #getRanges() <em>Ranges</em>}' containment reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getRanges()
     * @generated
     * @ordered
     */
    protected EList<RangeRestriction> ranges;

    /**
     * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getPatterns()
     * @generated
     * @ordered
     */
    protected EList<Pattern> patterns;

    /**
     * The cached value of the '{@link #getJavaUDIIndicatorParameter() <em>Java UDI Indicator Parameter</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getJavaUDIIndicatorParameter()
     * @generated
     * @ordered
     */
    protected EList<JavaUDIIndicatorParameter> javaUDIIndicatorParameter;

    /**
     * The cached value of the '{@link #getBuiltInPatterns() <em>Built In Patterns</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBuiltInPatterns()
     * @generated
     * @ordered
     */
    protected EList<Pattern> builtInPatterns;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DomainImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DomainPackage.Literals.DOMAIN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public DataType getDataType() {
        if (dataType != null && dataType.eIsProxy()) {
            InternalEObject oldDataType = (InternalEObject) dataType;
            dataType = (DataType) eResolveProxy(oldDataType);
            if (dataType != oldDataType) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN__DATA_TYPE, oldDataType,
                            dataType));
                }
            }
        }
        return dataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public DataType basicGetDataType() {
        return dataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDataType(DataType newDataType) {
        DataType oldDataType = dataType;
        dataType = newDataType;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__DATA_TYPE, oldDataType, dataType));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<LengthRestriction> getLengthRestriction() {
        if (lengthRestriction == null) {
            lengthRestriction = new EObjectContainmentEList<LengthRestriction>(LengthRestriction.class, this,
                    DomainPackage.DOMAIN__LENGTH_RESTRICTION);
        }
        return lengthRestriction;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<RangeRestriction> getRanges() {
        if (ranges == null) {
            ranges = new EObjectContainmentEList<RangeRestriction>(RangeRestriction.class, this, DomainPackage.DOMAIN__RANGES);
        }
        return ranges;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public EList<Pattern> getPatterns() {
        if (patterns == null) {
            patterns = new EObjectResolvingEList<Pattern>(Pattern.class, this, DomainPackage.DOMAIN__PATTERNS);
        }
        if (patterns.isEmpty() && builtInPatterns != null && !builtInPatterns.isEmpty()) {
            return builtInPatterns;
        }
        return patterns;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<JavaUDIIndicatorParameter> getJavaUDIIndicatorParameter() {
        if (javaUDIIndicatorParameter == null) {
            javaUDIIndicatorParameter = new EObjectContainmentEList<JavaUDIIndicatorParameter>(JavaUDIIndicatorParameter.class,
                    this, DomainPackage.DOMAIN__JAVA_UDI_INDICATOR_PARAMETER);
        }
        return javaUDIIndicatorParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<Pattern> getBuiltInPatterns() {
        if (builtInPatterns == null) {
            builtInPatterns = new EObjectContainmentEList<Pattern>(Pattern.class, this, DomainPackage.DOMAIN__BUILT_IN_PATTERNS);
        }
        return builtInPatterns;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DomainPackage.DOMAIN__LENGTH_RESTRICTION:
            return ((InternalEList<?>) getLengthRestriction()).basicRemove(otherEnd, msgs);
        case DomainPackage.DOMAIN__RANGES:
            return ((InternalEList<?>) getRanges()).basicRemove(otherEnd, msgs);
        case DomainPackage.DOMAIN__JAVA_UDI_INDICATOR_PARAMETER:
            return ((InternalEList<?>) getJavaUDIIndicatorParameter()).basicRemove(otherEnd, msgs);
        case DomainPackage.DOMAIN__BUILT_IN_PATTERNS:
            return ((InternalEList<?>) getBuiltInPatterns()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DomainPackage.DOMAIN__DATA_TYPE:
            if (resolve) {
                return getDataType();
            }
            return basicGetDataType();
        case DomainPackage.DOMAIN__LENGTH_RESTRICTION:
            return getLengthRestriction();
        case DomainPackage.DOMAIN__RANGES:
            return getRanges();
        case DomainPackage.DOMAIN__PATTERNS:
            return getPatterns();
        case DomainPackage.DOMAIN__JAVA_UDI_INDICATOR_PARAMETER:
            return getJavaUDIIndicatorParameter();
        case DomainPackage.DOMAIN__BUILT_IN_PATTERNS:
            return getBuiltInPatterns();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DomainPackage.DOMAIN__DATA_TYPE:
            setDataType((DataType) newValue);
            return;
        case DomainPackage.DOMAIN__LENGTH_RESTRICTION:
            getLengthRestriction().clear();
            getLengthRestriction().addAll((Collection<? extends LengthRestriction>) newValue);
            return;
        case DomainPackage.DOMAIN__RANGES:
            getRanges().clear();
            getRanges().addAll((Collection<? extends RangeRestriction>) newValue);
            return;
        case DomainPackage.DOMAIN__PATTERNS:
            getPatterns().clear();
            getPatterns().addAll((Collection<? extends Pattern>) newValue);
            return;
        case DomainPackage.DOMAIN__JAVA_UDI_INDICATOR_PARAMETER:
            getJavaUDIIndicatorParameter().clear();
            getJavaUDIIndicatorParameter().addAll((Collection<? extends JavaUDIIndicatorParameter>) newValue);
            return;
        case DomainPackage.DOMAIN__BUILT_IN_PATTERNS:
            getBuiltInPatterns().clear();
            getBuiltInPatterns().addAll((Collection<? extends Pattern>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case DomainPackage.DOMAIN__DATA_TYPE:
            setDataType((DataType) null);
            return;
        case DomainPackage.DOMAIN__LENGTH_RESTRICTION:
            getLengthRestriction().clear();
            return;
        case DomainPackage.DOMAIN__RANGES:
            getRanges().clear();
            return;
        case DomainPackage.DOMAIN__PATTERNS:
            getPatterns().clear();
            return;
        case DomainPackage.DOMAIN__JAVA_UDI_INDICATOR_PARAMETER:
            getJavaUDIIndicatorParameter().clear();
            return;
        case DomainPackage.DOMAIN__BUILT_IN_PATTERNS:
            getBuiltInPatterns().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case DomainPackage.DOMAIN__DATA_TYPE:
            return dataType != null;
        case DomainPackage.DOMAIN__LENGTH_RESTRICTION:
            return lengthRestriction != null && !lengthRestriction.isEmpty();
        case DomainPackage.DOMAIN__RANGES:
            return ranges != null && !ranges.isEmpty();
        case DomainPackage.DOMAIN__PATTERNS:
            return patterns != null && !patterns.isEmpty();
        case DomainPackage.DOMAIN__JAVA_UDI_INDICATOR_PARAMETER:
            return javaUDIIndicatorParameter != null && !javaUDIIndicatorParameter.isEmpty();
        case DomainPackage.DOMAIN__BUILT_IN_PATTERNS:
            return builtInPatterns != null && !builtInPatterns.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // DomainImpl
