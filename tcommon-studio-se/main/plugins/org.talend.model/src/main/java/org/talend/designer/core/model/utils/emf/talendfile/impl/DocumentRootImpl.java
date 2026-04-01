/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.impl;

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
import org.talend.designer.core.model.utils.emf.talendfile.ConnectionType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.NoteType;
import org.talend.designer.core.model.utils.emf.talendfile.ParametersType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.RequiredType;
import org.talend.designer.core.model.utils.emf.talendfile.SubjobType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getElementParameter <em>Element Parameter</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.DocumentRootImpl#getSubjob <em>Subjob</em>}</li>
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
        return TalendFilePackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, TalendFilePackage.DOCUMENT_ROOT__MIXED);
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
            xMLNSPrefixMap = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TalendFilePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
            xSISchemaLocation = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TalendFilePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionType getConnection() {
        return (ConnectionType)getMixed().get(TalendFilePackage.Literals.DOCUMENT_ROOT__CONNECTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnection(ConnectionType newConnection, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TalendFilePackage.Literals.DOCUMENT_ROOT__CONNECTION, newConnection, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnection(ConnectionType newConnection) {
        ((FeatureMap.Internal)getMixed()).set(TalendFilePackage.Literals.DOCUMENT_ROOT__CONNECTION, newConnection);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextType getContext() {
        return (ContextType)getMixed().get(TalendFilePackage.Literals.DOCUMENT_ROOT__CONTEXT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContext(ContextType newContext, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TalendFilePackage.Literals.DOCUMENT_ROOT__CONTEXT, newContext, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContext(ContextType newContext) {
        ((FeatureMap.Internal)getMixed()).set(TalendFilePackage.Literals.DOCUMENT_ROOT__CONTEXT, newContext);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementParameterType getElementParameter() {
        return (ElementParameterType)getMixed().get(TalendFilePackage.Literals.DOCUMENT_ROOT__ELEMENT_PARAMETER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElementParameter(ElementParameterType newElementParameter, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TalendFilePackage.Literals.DOCUMENT_ROOT__ELEMENT_PARAMETER, newElementParameter, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElementParameter(ElementParameterType newElementParameter) {
        ((FeatureMap.Internal)getMixed()).set(TalendFilePackage.Literals.DOCUMENT_ROOT__ELEMENT_PARAMETER, newElementParameter);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeType getNode() {
        return (NodeType)getMixed().get(TalendFilePackage.Literals.DOCUMENT_ROOT__NODE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNode(NodeType newNode, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TalendFilePackage.Literals.DOCUMENT_ROOT__NODE, newNode, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNode(NodeType newNode) {
        ((FeatureMap.Internal)getMixed()).set(TalendFilePackage.Literals.DOCUMENT_ROOT__NODE, newNode);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NoteType getNote() {
        return (NoteType)getMixed().get(TalendFilePackage.Literals.DOCUMENT_ROOT__NOTE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNote(NoteType newNote, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TalendFilePackage.Literals.DOCUMENT_ROOT__NOTE, newNote, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNote(NoteType newNote) {
        ((FeatureMap.Internal)getMixed()).set(TalendFilePackage.Literals.DOCUMENT_ROOT__NOTE, newNote);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParametersType getParameters() {
        return (ParametersType)getMixed().get(TalendFilePackage.Literals.DOCUMENT_ROOT__PARAMETERS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParameters(ParametersType newParameters, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TalendFilePackage.Literals.DOCUMENT_ROOT__PARAMETERS, newParameters, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParameters(ParametersType newParameters) {
        ((FeatureMap.Internal)getMixed()).set(TalendFilePackage.Literals.DOCUMENT_ROOT__PARAMETERS, newParameters);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType getProcess() {
        return (ProcessType)getMixed().get(TalendFilePackage.Literals.DOCUMENT_ROOT__PROCESS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcess(ProcessType newProcess, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TalendFilePackage.Literals.DOCUMENT_ROOT__PROCESS, newProcess, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcess(ProcessType newProcess) {
        ((FeatureMap.Internal)getMixed()).set(TalendFilePackage.Literals.DOCUMENT_ROOT__PROCESS, newProcess);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredType getRequired() {
        return (RequiredType)getMixed().get(TalendFilePackage.Literals.DOCUMENT_ROOT__REQUIRED, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRequired(RequiredType newRequired, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TalendFilePackage.Literals.DOCUMENT_ROOT__REQUIRED, newRequired, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequired(RequiredType newRequired) {
        ((FeatureMap.Internal)getMixed()).set(TalendFilePackage.Literals.DOCUMENT_ROOT__REQUIRED, newRequired);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubjobType getSubjob() {
        return (SubjobType)getMixed().get(TalendFilePackage.Literals.DOCUMENT_ROOT__SUBJOB, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubjob(SubjobType newSubjob, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(TalendFilePackage.Literals.DOCUMENT_ROOT__SUBJOB, newSubjob, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubjob(SubjobType newSubjob) {
        ((FeatureMap.Internal)getMixed()).set(TalendFilePackage.Literals.DOCUMENT_ROOT__SUBJOB, newSubjob);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendFilePackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.DOCUMENT_ROOT__CONNECTION:
                return basicSetConnection(null, msgs);
            case TalendFilePackage.DOCUMENT_ROOT__CONTEXT:
                return basicSetContext(null, msgs);
            case TalendFilePackage.DOCUMENT_ROOT__ELEMENT_PARAMETER:
                return basicSetElementParameter(null, msgs);
            case TalendFilePackage.DOCUMENT_ROOT__NODE:
                return basicSetNode(null, msgs);
            case TalendFilePackage.DOCUMENT_ROOT__NOTE:
                return basicSetNote(null, msgs);
            case TalendFilePackage.DOCUMENT_ROOT__PARAMETERS:
                return basicSetParameters(null, msgs);
            case TalendFilePackage.DOCUMENT_ROOT__PROCESS:
                return basicSetProcess(null, msgs);
            case TalendFilePackage.DOCUMENT_ROOT__REQUIRED:
                return basicSetRequired(null, msgs);
            case TalendFilePackage.DOCUMENT_ROOT__SUBJOB:
                return basicSetSubjob(null, msgs);
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
            case TalendFilePackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case TalendFilePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case TalendFilePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case TalendFilePackage.DOCUMENT_ROOT__CONNECTION:
                return getConnection();
            case TalendFilePackage.DOCUMENT_ROOT__CONTEXT:
                return getContext();
            case TalendFilePackage.DOCUMENT_ROOT__ELEMENT_PARAMETER:
                return getElementParameter();
            case TalendFilePackage.DOCUMENT_ROOT__NODE:
                return getNode();
            case TalendFilePackage.DOCUMENT_ROOT__NOTE:
                return getNote();
            case TalendFilePackage.DOCUMENT_ROOT__PARAMETERS:
                return getParameters();
            case TalendFilePackage.DOCUMENT_ROOT__PROCESS:
                return getProcess();
            case TalendFilePackage.DOCUMENT_ROOT__REQUIRED:
                return getRequired();
            case TalendFilePackage.DOCUMENT_ROOT__SUBJOB:
                return getSubjob();
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
            case TalendFilePackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__CONNECTION:
                setConnection((ConnectionType)newValue);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__CONTEXT:
                setContext((ContextType)newValue);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__ELEMENT_PARAMETER:
                setElementParameter((ElementParameterType)newValue);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__NODE:
                setNode((NodeType)newValue);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__NOTE:
                setNote((NoteType)newValue);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__PARAMETERS:
                setParameters((ParametersType)newValue);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__PROCESS:
                setProcess((ProcessType)newValue);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__REQUIRED:
                setRequired((RequiredType)newValue);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__SUBJOB:
                setSubjob((SubjobType)newValue);
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
            case TalendFilePackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case TalendFilePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case TalendFilePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case TalendFilePackage.DOCUMENT_ROOT__CONNECTION:
                setConnection((ConnectionType)null);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__CONTEXT:
                setContext((ContextType)null);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__ELEMENT_PARAMETER:
                setElementParameter((ElementParameterType)null);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__NODE:
                setNode((NodeType)null);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__NOTE:
                setNote((NoteType)null);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__PARAMETERS:
                setParameters((ParametersType)null);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__PROCESS:
                setProcess((ProcessType)null);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__REQUIRED:
                setRequired((RequiredType)null);
                return;
            case TalendFilePackage.DOCUMENT_ROOT__SUBJOB:
                setSubjob((SubjobType)null);
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
            case TalendFilePackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case TalendFilePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case TalendFilePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case TalendFilePackage.DOCUMENT_ROOT__CONNECTION:
                return getConnection() != null;
            case TalendFilePackage.DOCUMENT_ROOT__CONTEXT:
                return getContext() != null;
            case TalendFilePackage.DOCUMENT_ROOT__ELEMENT_PARAMETER:
                return getElementParameter() != null;
            case TalendFilePackage.DOCUMENT_ROOT__NODE:
                return getNode() != null;
            case TalendFilePackage.DOCUMENT_ROOT__NOTE:
                return getNote() != null;
            case TalendFilePackage.DOCUMENT_ROOT__PARAMETERS:
                return getParameters() != null;
            case TalendFilePackage.DOCUMENT_ROOT__PROCESS:
                return getProcess() != null;
            case TalendFilePackage.DOCUMENT_ROOT__REQUIRED:
                return getRequired() != null;
            case TalendFilePackage.DOCUMENT_ROOT__SUBJOB:
                return getSubjob() != null;
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