/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.mapper.model.emf.mapper.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.talend.designer.core.model.utils.emf.talendfile.AbstractExternalData;

import org.talend.designer.mapper.model.emf.mapper.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage
 * @generated
 */
public class MapperSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static MapperPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MapperSwitch() {
        if (modelPackage == null) {
            modelPackage = MapperPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case MapperPackage.MAPPER_DATA: {
                MapperData mapperData = (MapperData)theEObject;
                T result = caseMapperData(mapperData);
                if (result == null) result = caseAbstractExternalData(mapperData);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MapperPackage.MAPPER_TABLE_ENTRY: {
                MapperTableEntry mapperTableEntry = (MapperTableEntry)theEObject;
                T result = caseMapperTableEntry(mapperTableEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MapperPackage.ABSTRACT_DATA_MAP_TABLE: {
                AbstractDataMapTable abstractDataMapTable = (AbstractDataMapTable)theEObject;
                T result = caseAbstractDataMapTable(abstractDataMapTable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MapperPackage.ABSTRACT_IN_OUT_TABLE: {
                AbstractInOutTable abstractInOutTable = (AbstractInOutTable)theEObject;
                T result = caseAbstractInOutTable(abstractInOutTable);
                if (result == null) result = caseAbstractDataMapTable(abstractInOutTable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MapperPackage.UI_PROPERTIES: {
                UiProperties uiProperties = (UiProperties)theEObject;
                T result = caseUiProperties(uiProperties);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MapperPackage.VAR_TABLE: {
                VarTable varTable = (VarTable)theEObject;
                T result = caseVarTable(varTable);
                if (result == null) result = caseAbstractDataMapTable(varTable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MapperPackage.OUTPUT_TABLE: {
                OutputTable outputTable = (OutputTable)theEObject;
                T result = caseOutputTable(outputTable);
                if (result == null) result = caseAbstractInOutTable(outputTable);
                if (result == null) result = caseAbstractDataMapTable(outputTable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MapperPackage.INPUT_TABLE: {
                InputTable inputTable = (InputTable)theEObject;
                T result = caseInputTable(inputTable);
                if (result == null) result = caseAbstractInOutTable(inputTable);
                if (result == null) result = caseAbstractDataMapTable(inputTable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMapperData(MapperData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Table Entry</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Table Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMapperTableEntry(MapperTableEntry object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Data Map Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Data Map Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDataMapTable(AbstractDataMapTable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract In Out Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract In Out Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractInOutTable(AbstractInOutTable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ui Properties</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ui Properties</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUiProperties(UiProperties object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Var Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Var Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVarTable(VarTable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputTable(OutputTable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputTable(InputTable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract External Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract External Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractExternalData(AbstractExternalData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //MapperSwitch
