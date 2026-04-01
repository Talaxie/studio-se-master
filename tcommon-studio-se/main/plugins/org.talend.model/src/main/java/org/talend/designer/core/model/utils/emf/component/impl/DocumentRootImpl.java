/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.designer.core.model.utils.emf.component.ADVANCEDPARAMETERSType;
import org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType;
import org.talend.designer.core.model.utils.emf.component.COMPONENTType;
import org.talend.designer.core.model.utils.emf.component.CONNECTORSType;
import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.DOCUMENTATIONType;
import org.talend.designer.core.model.utils.emf.component.DocumentRoot;
import org.talend.designer.core.model.utils.emf.component.FAMILIESType;
import org.talend.designer.core.model.utils.emf.component.HEADERType;
import org.talend.designer.core.model.utils.emf.component.ITEMSType;
import org.talend.designer.core.model.utils.emf.component.PARAMETERSType;
import org.talend.designer.core.model.utils.emf.component.PARAMETERType;
import org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCIESType;
import org.talend.designer.core.model.utils.emf.component.RETURNSType;
import org.talend.designer.core.model.utils.emf.component.SQLTEMPLATESType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getADVANCEDPARAMETERS <em>ADVANCEDPARAMETERS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getCODEGENERATION <em>CODEGENERATION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getCOMPONENT <em>COMPONENT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getCONNECTORS <em>CONNECTORS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getDOCUMENTATION <em>DOCUMENTATION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getFAMILIES <em>FAMILIES</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getHEADER <em>HEADER</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getITEMS <em>ITEMS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getPARAMETER <em>PARAMETER</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getPARAMETERS <em>PARAMETERS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getPLUGINDEPENDENCIES <em>PLUGINDEPENDENCIES</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getRETURNS <em>RETURNS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DocumentRootImpl#getSQLTEMPLATES <em>SQLTEMPLATES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap xSISchemaLocation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, ComponentPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ComponentPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ComponentPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ADVANCEDPARAMETERSType getADVANCEDPARAMETERS() {
        return (ADVANCEDPARAMETERSType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__ADVANCEDPARAMETERS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetADVANCEDPARAMETERS(ADVANCEDPARAMETERSType newADVANCEDPARAMETERS, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__ADVANCEDPARAMETERS, newADVANCEDPARAMETERS, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setADVANCEDPARAMETERS(ADVANCEDPARAMETERSType newADVANCEDPARAMETERS) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__ADVANCEDPARAMETERS, newADVANCEDPARAMETERS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CODEGENERATIONType getCODEGENERATION() {
        return (CODEGENERATIONType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__CODEGENERATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCODEGENERATION(CODEGENERATIONType newCODEGENERATION, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__CODEGENERATION, newCODEGENERATION, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCODEGENERATION(CODEGENERATIONType newCODEGENERATION) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__CODEGENERATION, newCODEGENERATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public COMPONENTType getCOMPONENT() {
        return (COMPONENTType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__COMPONENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCOMPONENT(COMPONENTType newCOMPONENT, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__COMPONENT, newCOMPONENT, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCOMPONENT(COMPONENTType newCOMPONENT) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__COMPONENT, newCOMPONENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONNECTORSType getCONNECTORS() {
        return (CONNECTORSType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__CONNECTORS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCONNECTORS(CONNECTORSType newCONNECTORS, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__CONNECTORS, newCONNECTORS, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONNECTORS(CONNECTORSType newCONNECTORS) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__CONNECTORS, newCONNECTORS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DOCUMENTATIONType getDOCUMENTATION() {
        return (DOCUMENTATIONType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDOCUMENTATION(DOCUMENTATIONType newDOCUMENTATION, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDOCUMENTATION, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDOCUMENTATION(DOCUMENTATIONType newDOCUMENTATION) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDOCUMENTATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FAMILIESType getFAMILIES() {
        return (FAMILIESType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__FAMILIES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFAMILIES(FAMILIESType newFAMILIES, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__FAMILIES, newFAMILIES, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFAMILIES(FAMILIESType newFAMILIES) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__FAMILIES, newFAMILIES);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HEADERType getHEADER() {
        return (HEADERType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__HEADER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHEADER(HEADERType newHEADER, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__HEADER, newHEADER, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHEADER(HEADERType newHEADER) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__HEADER, newHEADER);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ITEMSType getITEMS() {
        return (ITEMSType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__ITEMS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetITEMS(ITEMSType newITEMS, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__ITEMS, newITEMS, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setITEMS(ITEMSType newITEMS) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__ITEMS, newITEMS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARAMETERType getPARAMETER() {
        return (PARAMETERType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__PARAMETER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPARAMETER(PARAMETERType newPARAMETER, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__PARAMETER, newPARAMETER, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARAMETER(PARAMETERType newPARAMETER) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__PARAMETER, newPARAMETER);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARAMETERSType getPARAMETERS() {
        return (PARAMETERSType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__PARAMETERS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPARAMETERS(PARAMETERSType newPARAMETERS, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__PARAMETERS, newPARAMETERS, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARAMETERS(PARAMETERSType newPARAMETERS) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__PARAMETERS, newPARAMETERS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PLUGINDEPENDENCIESType getPLUGINDEPENDENCIES() {
        return (PLUGINDEPENDENCIESType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__PLUGINDEPENDENCIES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPLUGINDEPENDENCIES(PLUGINDEPENDENCIESType newPLUGINDEPENDENCIES, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__PLUGINDEPENDENCIES, newPLUGINDEPENDENCIES, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPLUGINDEPENDENCIES(PLUGINDEPENDENCIESType newPLUGINDEPENDENCIES) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__PLUGINDEPENDENCIES, newPLUGINDEPENDENCIES);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RETURNSType getRETURNS() {
        return (RETURNSType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__RETURNS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRETURNS(RETURNSType newRETURNS, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__RETURNS, newRETURNS, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRETURNS(RETURNSType newRETURNS) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__RETURNS, newRETURNS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SQLTEMPLATESType getSQLTEMPLATES() {
        return (SQLTEMPLATESType)getMixed().get(ComponentPackage.Literals.DOCUMENT_ROOT__SQLTEMPLATES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSQLTEMPLATES(SQLTEMPLATESType newSQLTEMPLATES, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ComponentPackage.Literals.DOCUMENT_ROOT__SQLTEMPLATES, newSQLTEMPLATES, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSQLTEMPLATES(SQLTEMPLATESType newSQLTEMPLATES) {
        ((FeatureMap.Internal)getMixed()).set(ComponentPackage.Literals.DOCUMENT_ROOT__SQLTEMPLATES, newSQLTEMPLATES);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
            case ComponentPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case ComponentPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case ComponentPackage.DOCUMENT_ROOT__ADVANCEDPARAMETERS:
                return basicSetADVANCEDPARAMETERS(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__CODEGENERATION:
                return basicSetCODEGENERATION(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__COMPONENT:
                return basicSetCOMPONENT(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__CONNECTORS:
                return basicSetCONNECTORS(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return basicSetDOCUMENTATION(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__FAMILIES:
                return basicSetFAMILIES(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__HEADER:
                return basicSetHEADER(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__ITEMS:
                return basicSetITEMS(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__PARAMETER:
                return basicSetPARAMETER(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__PARAMETERS:
                return basicSetPARAMETERS(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__PLUGINDEPENDENCIES:
                return basicSetPLUGINDEPENDENCIES(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__RETURNS:
                return basicSetRETURNS(null, msgs);
            case ComponentPackage.DOCUMENT_ROOT__SQLTEMPLATES:
                return basicSetSQLTEMPLATES(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case ComponentPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case ComponentPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case ComponentPackage.DOCUMENT_ROOT__ADVANCEDPARAMETERS:
                return getADVANCEDPARAMETERS();
            case ComponentPackage.DOCUMENT_ROOT__CODEGENERATION:
                return getCODEGENERATION();
            case ComponentPackage.DOCUMENT_ROOT__COMPONENT:
                return getCOMPONENT();
            case ComponentPackage.DOCUMENT_ROOT__CONNECTORS:
                return getCONNECTORS();
            case ComponentPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return getDOCUMENTATION();
            case ComponentPackage.DOCUMENT_ROOT__FAMILIES:
                return getFAMILIES();
            case ComponentPackage.DOCUMENT_ROOT__HEADER:
                return getHEADER();
            case ComponentPackage.DOCUMENT_ROOT__ITEMS:
                return getITEMS();
            case ComponentPackage.DOCUMENT_ROOT__PARAMETER:
                return getPARAMETER();
            case ComponentPackage.DOCUMENT_ROOT__PARAMETERS:
                return getPARAMETERS();
            case ComponentPackage.DOCUMENT_ROOT__PLUGINDEPENDENCIES:
                return getPLUGINDEPENDENCIES();
            case ComponentPackage.DOCUMENT_ROOT__RETURNS:
                return getRETURNS();
            case ComponentPackage.DOCUMENT_ROOT__SQLTEMPLATES:
                return getSQLTEMPLATES();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ComponentPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__ADVANCEDPARAMETERS:
                setADVANCEDPARAMETERS((ADVANCEDPARAMETERSType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__CODEGENERATION:
                setCODEGENERATION((CODEGENERATIONType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__COMPONENT:
                setCOMPONENT((COMPONENTType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__CONNECTORS:
                setCONNECTORS((CONNECTORSType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__DOCUMENTATION:
                setDOCUMENTATION((DOCUMENTATIONType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__FAMILIES:
                setFAMILIES((FAMILIESType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__HEADER:
                setHEADER((HEADERType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__ITEMS:
                setITEMS((ITEMSType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__PARAMETER:
                setPARAMETER((PARAMETERType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__PARAMETERS:
                setPARAMETERS((PARAMETERSType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__PLUGINDEPENDENCIES:
                setPLUGINDEPENDENCIES((PLUGINDEPENDENCIESType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__RETURNS:
                setRETURNS((RETURNSType)newValue);
                return;
            case ComponentPackage.DOCUMENT_ROOT__SQLTEMPLATES:
                setSQLTEMPLATES((SQLTEMPLATESType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case ComponentPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case ComponentPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case ComponentPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case ComponentPackage.DOCUMENT_ROOT__ADVANCEDPARAMETERS:
                setADVANCEDPARAMETERS((ADVANCEDPARAMETERSType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__CODEGENERATION:
                setCODEGENERATION((CODEGENERATIONType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__COMPONENT:
                setCOMPONENT((COMPONENTType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__CONNECTORS:
                setCONNECTORS((CONNECTORSType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__DOCUMENTATION:
                setDOCUMENTATION((DOCUMENTATIONType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__FAMILIES:
                setFAMILIES((FAMILIESType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__HEADER:
                setHEADER((HEADERType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__ITEMS:
                setITEMS((ITEMSType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__PARAMETER:
                setPARAMETER((PARAMETERType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__PARAMETERS:
                setPARAMETERS((PARAMETERSType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__PLUGINDEPENDENCIES:
                setPLUGINDEPENDENCIES((PLUGINDEPENDENCIESType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__RETURNS:
                setRETURNS((RETURNSType)null);
                return;
            case ComponentPackage.DOCUMENT_ROOT__SQLTEMPLATES:
                setSQLTEMPLATES((SQLTEMPLATESType)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ComponentPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case ComponentPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case ComponentPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case ComponentPackage.DOCUMENT_ROOT__ADVANCEDPARAMETERS:
                return getADVANCEDPARAMETERS() != null;
            case ComponentPackage.DOCUMENT_ROOT__CODEGENERATION:
                return getCODEGENERATION() != null;
            case ComponentPackage.DOCUMENT_ROOT__COMPONENT:
                return getCOMPONENT() != null;
            case ComponentPackage.DOCUMENT_ROOT__CONNECTORS:
                return getCONNECTORS() != null;
            case ComponentPackage.DOCUMENT_ROOT__DOCUMENTATION:
                return getDOCUMENTATION() != null;
            case ComponentPackage.DOCUMENT_ROOT__FAMILIES:
                return getFAMILIES() != null;
            case ComponentPackage.DOCUMENT_ROOT__HEADER:
                return getHEADER() != null;
            case ComponentPackage.DOCUMENT_ROOT__ITEMS:
                return getITEMS() != null;
            case ComponentPackage.DOCUMENT_ROOT__PARAMETER:
                return getPARAMETER() != null;
            case ComponentPackage.DOCUMENT_ROOT__PARAMETERS:
                return getPARAMETERS() != null;
            case ComponentPackage.DOCUMENT_ROOT__PLUGINDEPENDENCIES:
                return getPLUGINDEPENDENCIES() != null;
            case ComponentPackage.DOCUMENT_ROOT__RETURNS:
                return getRETURNS() != null;
            case ComponentPackage.DOCUMENT_ROOT__SQLTEMPLATES:
                return getSQLTEMPLATES() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
