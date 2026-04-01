/**
 */
package org.talend.designer.core.model.utils.emf.component.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.talend.designer.core.model.utils.emf.component.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage
 * @generated
 */
public class ComponentAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ComponentPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ComponentPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentSwitch modelSwitch =
        new ComponentSwitch() {
            public Object caseADVANCEDPARAMETERSType(ADVANCEDPARAMETERSType object) {
                return createADVANCEDPARAMETERSTypeAdapter();
            }
            public Object caseARGType(ARGType object) {
                return createARGTypeAdapter();
            }
            public Object caseCODEGENERATIONType(CODEGENERATIONType object) {
                return createCODEGENERATIONTypeAdapter();
            }
            public Object caseCOLUMNType(COLUMNType object) {
                return createCOLUMNTypeAdapter();
            }
            public Object caseCOMPONENTType(COMPONENTType object) {
                return createCOMPONENTTypeAdapter();
            }
            public Object caseCONNECTORSType(CONNECTORSType object) {
                return createCONNECTORSTypeAdapter();
            }
            public Object caseCONNECTORType(CONNECTORType object) {
                return createCONNECTORTypeAdapter();
            }
            public Object caseDEFAULTType(DEFAULTType object) {
                return createDEFAULTTypeAdapter();
            }
            public Object caseDOCUMENTATIONType(DOCUMENTATIONType object) {
                return createDOCUMENTATIONTypeAdapter();
            }
            public Object caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            public Object caseFAMILIESType(FAMILIESType object) {
                return createFAMILIESTypeAdapter();
            }
            public Object caseFORMATType(FORMATType object) {
                return createFORMATTypeAdapter();
            }
            public Object caseHEADERType(HEADERType object) {
                return createHEADERTypeAdapter();
            }
            public Object caseIMPORTSType(IMPORTSType object) {
                return createIMPORTSTypeAdapter();
            }
            public Object caseIMPORTType(IMPORTType object) {
                return createIMPORTTypeAdapter();
            }
            public Object caseINSTALLType(INSTALLType object) {
                return createINSTALLTypeAdapter();
            }
            public Object caseITEMSType(ITEMSType object) {
                return createITEMSTypeAdapter();
            }
            public Object caseITEMType(ITEMType object) {
                return createITEMTypeAdapter();
            }
            public Object caseJAVACOMMANDType(JAVACOMMANDType object) {
                return createJAVACOMMANDTypeAdapter();
            }
            public Object caseLINKTOType(LINKTOType object) {
                return createLINKTOTypeAdapter();
            }
            public Object casePARAMETERSType(PARAMETERSType object) {
                return createPARAMETERSTypeAdapter();
            }
            public Object casePARAMETERType(PARAMETERType object) {
                return createPARAMETERTypeAdapter();
            }
            public Object casePLUGINDEPENDENCIESType(PLUGINDEPENDENCIESType object) {
                return createPLUGINDEPENDENCIESTypeAdapter();
            }
            public Object casePLUGINDEPENDENCYType(PLUGINDEPENDENCYType object) {
                return createPLUGINDEPENDENCYTypeAdapter();
            }
            public Object caseRETURNSType(RETURNSType object) {
                return createRETURNSTypeAdapter();
            }
            public Object caseRETURNType(RETURNType object) {
                return createRETURNTypeAdapter();
            }
            public Object caseSQLTEMPLATESType(SQLTEMPLATESType object) {
                return createSQLTEMPLATESTypeAdapter();
            }
            public Object caseSQLTEMPLATEType(SQLTEMPLATEType object) {
                return createSQLTEMPLATETypeAdapter();
            }
            public Object caseTABLEType(TABLEType object) {
                return createTABLETypeAdapter();
            }
            public Object caseTEMPLATEPARAMType(TEMPLATEPARAMType object) {
                return createTEMPLATEPARAMTypeAdapter();
            }
            public Object caseTEMPLATESType(TEMPLATESType object) {
                return createTEMPLATESTypeAdapter();
            }
            public Object caseTEMPLATEType(TEMPLATEType object) {
                return createTEMPLATETypeAdapter();
            }
            public Object defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    public Adapter createAdapter(Notifier target) {
        return (Adapter)modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.ADVANCEDPARAMETERSType <em>ADVANCEDPARAMETERS Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.ADVANCEDPARAMETERSType
     * @generated
     */
    public Adapter createADVANCEDPARAMETERSTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.ARGType <em>ARG Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.ARGType
     * @generated
     */
    public Adapter createARGTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType <em>CODEGENERATION Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType
     * @generated
     */
    public Adapter createCODEGENERATIONTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType <em>COLUMN Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.COLUMNType
     * @generated
     */
    public Adapter createCOLUMNTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType <em>COMPONENT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.COMPONENTType
     * @generated
     */
    public Adapter createCOMPONENTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORSType <em>CONNECTORS Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.CONNECTORSType
     * @generated
     */
    public Adapter createCONNECTORSTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType <em>CONNECTOR Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.CONNECTORType
     * @generated
     */
    public Adapter createCONNECTORTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.DEFAULTType <em>DEFAULT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.DEFAULTType
     * @generated
     */
    public Adapter createDEFAULTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.DOCUMENTATIONType <em>DOCUMENTATION Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.DOCUMENTATIONType
     * @generated
     */
    public Adapter createDOCUMENTATIONTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.FAMILIESType <em>FAMILIES Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.FAMILIESType
     * @generated
     */
    public Adapter createFAMILIESTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.FORMATType <em>FORMAT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.FORMATType
     * @generated
     */
    public Adapter createFORMATTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.HEADERType <em>HEADER Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.HEADERType
     * @generated
     */
    public Adapter createHEADERTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.IMPORTSType <em>IMPORTS Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.IMPORTSType
     * @generated
     */
    public Adapter createIMPORTSTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType <em>IMPORT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.IMPORTType
     * @generated
     */
    public Adapter createIMPORTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.INSTALLType <em>INSTALL Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.INSTALLType
     * @generated
     */
    public Adapter createINSTALLTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType <em>ITEMS Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMSType
     * @generated
     */
    public Adapter createITEMSTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.ITEMType <em>ITEM Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.ITEMType
     * @generated
     */
    public Adapter createITEMTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.JAVACOMMANDType <em>JAVACOMMAND Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.JAVACOMMANDType
     * @generated
     */
    public Adapter createJAVACOMMANDTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.LINKTOType <em>LINKTO Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.LINKTOType
     * @generated
     */
    public Adapter createLINKTOTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERSType <em>PARAMETERS Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERSType
     * @generated
     */
    public Adapter createPARAMETERSTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.PARAMETERType <em>PARAMETER Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.PARAMETERType
     * @generated
     */
    public Adapter createPARAMETERTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCIESType <em>PLUGINDEPENDENCIES Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCIESType
     * @generated
     */
    public Adapter createPLUGINDEPENDENCIESTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCYType <em>PLUGINDEPENDENCY Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCYType
     * @generated
     */
    public Adapter createPLUGINDEPENDENCYTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.RETURNSType <em>RETURNS Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.RETURNSType
     * @generated
     */
    public Adapter createRETURNSTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.RETURNType <em>RETURN Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.RETURNType
     * @generated
     */
    public Adapter createRETURNTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.SQLTEMPLATESType <em>SQLTEMPLATES Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.SQLTEMPLATESType
     * @generated
     */
    public Adapter createSQLTEMPLATESTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.SQLTEMPLATEType <em>SQLTEMPLATE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.SQLTEMPLATEType
     * @generated
     */
    public Adapter createSQLTEMPLATETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.TABLEType <em>TABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.TABLEType
     * @generated
     */
    public Adapter createTABLETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType <em>TEMPLATEPARAM Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType
     * @generated
     */
    public Adapter createTEMPLATEPARAMTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType <em>TEMPLATES Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATESType
     * @generated
     */
    public Adapter createTEMPLATESTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATEType <em>TEMPLATE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.component.TEMPLATEType
     * @generated
     */
    public Adapter createTEMPLATETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ComponentAdapterFactory
