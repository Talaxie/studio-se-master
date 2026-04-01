/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.codegen.persistence.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.designer.codegen.i18n.Messages;
import org.talend.designer.codegen.persistence.DocumentRoot;
import org.talend.designer.codegen.persistence.EmittersPoolPackage;
import org.talend.designer.codegen.persistence.PoolType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Document Root</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.designer.codegen.persistence.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.talend.designer.codegen.persistence.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.talend.designer.codegen.persistence.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.talend.designer.codegen.persistence.impl.DocumentRootImpl#getPool <em>Pool</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {

    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed = null;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap xMLNSPrefixMap = null;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap xSISchemaLocation = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EClass eStaticClass() {
        return EmittersPoolPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, EmittersPoolPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EMap getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
                    EStringToStringMapEntryImpl.class, this, EmittersPoolPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EMap getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
                    EStringToStringMapEntryImpl.class, this, EmittersPoolPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public PoolType getPool() {
        return (PoolType) getMixed().get(EmittersPoolPackage.Literals.DOCUMENT_ROOT__POOL, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetPool(PoolType newPool, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(EmittersPoolPackage.Literals.DOCUMENT_ROOT__POOL, newPool,
                msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPool(PoolType newPool) {
        ((FeatureMap.Internal) getMixed()).set(EmittersPoolPackage.Literals.DOCUMENT_ROOT__POOL, newPool);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case EmittersPoolPackage.DOCUMENT_ROOT__MIXED:
            return ((InternalEList) getMixed()).basicRemove(otherEnd, msgs);
        case EmittersPoolPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return ((InternalEList) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
        case EmittersPoolPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return ((InternalEList) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
        case EmittersPoolPackage.DOCUMENT_ROOT__POOL:
            return basicSetPool(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case EmittersPoolPackage.DOCUMENT_ROOT__MIXED:
            if (coreType)
                return getMixed();
            return ((FeatureMap.Internal) getMixed()).getWrapper();
        case EmittersPoolPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            if (coreType)
                return getXMLNSPrefixMap();
            else
                return getXMLNSPrefixMap().map();
        case EmittersPoolPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            if (coreType)
                return getXSISchemaLocation();
            else
                return getXSISchemaLocation().map();
        case EmittersPoolPackage.DOCUMENT_ROOT__POOL:
            return getPool();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case EmittersPoolPackage.DOCUMENT_ROOT__MIXED:
            ((FeatureMap.Internal) getMixed()).set(newValue);
            return;
        case EmittersPoolPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            ((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
            return;
        case EmittersPoolPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            ((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
            return;
        case EmittersPoolPackage.DOCUMENT_ROOT__POOL:
            setPool((PoolType) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
        case EmittersPoolPackage.DOCUMENT_ROOT__MIXED:
            getMixed().clear();
            return;
        case EmittersPoolPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            getXMLNSPrefixMap().clear();
            return;
        case EmittersPoolPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            getXSISchemaLocation().clear();
            return;
        case EmittersPoolPackage.DOCUMENT_ROOT__POOL:
            setPool((PoolType) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case EmittersPoolPackage.DOCUMENT_ROOT__MIXED:
            return mixed != null && !mixed.isEmpty();
        case EmittersPoolPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
        case EmittersPoolPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
        case EmittersPoolPackage.DOCUMENT_ROOT__POOL:
            return getPool() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(Messages.getString("DocumentRootImpl.mixed")); //$NON-NLS-1$
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} // DocumentRootImpl
