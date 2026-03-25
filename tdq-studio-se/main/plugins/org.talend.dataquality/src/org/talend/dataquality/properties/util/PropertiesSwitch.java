/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.talend.core.model.properties.FileItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.TDQItem;
import org.talend.dataquality.properties.PropertiesPackage;
import org.talend.dataquality.properties.TDQAnalysisItem;
import org.talend.dataquality.properties.TDQBusinessRuleItem;
import org.talend.dataquality.properties.TDQFileItem;
import org.talend.dataquality.properties.TDQIndicatorDefinitionItem;
import org.talend.dataquality.properties.TDQJrxmlItem;
import org.talend.dataquality.properties.TDQMatchRuleItem;
import org.talend.dataquality.properties.TDQPatternItem;
import org.talend.dataquality.properties.TDQReportItem;
import org.talend.dataquality.properties.TDQSourceFileItem;

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
 * @see org.talend.dataquality.properties.PropertiesPackage
 * @generated
 */
public class PropertiesSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PropertiesPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesSwitch() {
        if (modelPackage == null) {
            modelPackage = PropertiesPackage.eINSTANCE;
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
            case PropertiesPackage.TDQ_ANALYSIS_ITEM: {
                TDQAnalysisItem tdqAnalysisItem = (TDQAnalysisItem)theEObject;
                T result = caseTDQAnalysisItem(tdqAnalysisItem);
                if (result == null) result = caseTDQItem(tdqAnalysisItem);
                if (result == null) result = caseItem(tdqAnalysisItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropertiesPackage.TDQ_REPORT_ITEM: {
                TDQReportItem tdqReportItem = (TDQReportItem)theEObject;
                T result = caseTDQReportItem(tdqReportItem);
                if (result == null) result = caseTDQItem(tdqReportItem);
                if (result == null) result = caseItem(tdqReportItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropertiesPackage.TDQ_INDICATOR_DEFINITION_ITEM: {
                TDQIndicatorDefinitionItem tdqIndicatorDefinitionItem = (TDQIndicatorDefinitionItem)theEObject;
                T result = caseTDQIndicatorDefinitionItem(tdqIndicatorDefinitionItem);
                if (result == null) result = caseTDQItem(tdqIndicatorDefinitionItem);
                if (result == null) result = caseItem(tdqIndicatorDefinitionItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropertiesPackage.TDQ_BUSINESS_RULE_ITEM: {
                TDQBusinessRuleItem tdqBusinessRuleItem = (TDQBusinessRuleItem)theEObject;
                T result = caseTDQBusinessRuleItem(tdqBusinessRuleItem);
                if (result == null) result = caseTDQItem(tdqBusinessRuleItem);
                if (result == null) result = caseItem(tdqBusinessRuleItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropertiesPackage.TDQ_PATTERN_ITEM: {
                TDQPatternItem tdqPatternItem = (TDQPatternItem)theEObject;
                T result = caseTDQPatternItem(tdqPatternItem);
                if (result == null) result = caseTDQItem(tdqPatternItem);
                if (result == null) result = caseItem(tdqPatternItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropertiesPackage.TDQ_FILE_ITEM: {
                TDQFileItem tdqFileItem = (TDQFileItem)theEObject;
                T result = caseTDQFileItem(tdqFileItem);
                if (result == null) result = caseTDQItem(tdqFileItem);
                if (result == null) result = caseFileItem(tdqFileItem);
                if (result == null) result = caseItem(tdqFileItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropertiesPackage.TDQ_JRXML_ITEM: {
                TDQJrxmlItem tdqJrxmlItem = (TDQJrxmlItem)theEObject;
                T result = caseTDQJrxmlItem(tdqJrxmlItem);
                if (result == null) result = caseTDQFileItem(tdqJrxmlItem);
                if (result == null) result = caseTDQItem(tdqJrxmlItem);
                if (result == null) result = caseFileItem(tdqJrxmlItem);
                if (result == null) result = caseItem(tdqJrxmlItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropertiesPackage.TDQ_SOURCE_FILE_ITEM: {
                TDQSourceFileItem tdqSourceFileItem = (TDQSourceFileItem)theEObject;
                T result = caseTDQSourceFileItem(tdqSourceFileItem);
                if (result == null) result = caseTDQFileItem(tdqSourceFileItem);
                if (result == null) result = caseTDQItem(tdqSourceFileItem);
                if (result == null) result = caseFileItem(tdqSourceFileItem);
                if (result == null) result = caseItem(tdqSourceFileItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropertiesPackage.TDQ_MATCH_RULE_ITEM: {
                TDQMatchRuleItem tdqMatchRuleItem = (TDQMatchRuleItem)theEObject;
                T result = caseTDQMatchRuleItem(tdqMatchRuleItem);
                if (result == null) result = caseTDQItem(tdqMatchRuleItem);
                if (result == null) result = caseItem(tdqMatchRuleItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDQ Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDQ Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDQItem(TDQItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFileItem(FileItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDQ Analysis Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDQ Analysis Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDQAnalysisItem(TDQAnalysisItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDQ Report Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDQ Report Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDQReportItem(TDQReportItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDQ Indicator Definition Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDQ Indicator Definition Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDQIndicatorDefinitionItem(TDQIndicatorDefinitionItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDQ Business Rule Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDQ Business Rule Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDQBusinessRuleItem(TDQBusinessRuleItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDQ Pattern Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDQ Pattern Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDQPatternItem(TDQPatternItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDQ File Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDQ File Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDQFileItem(TDQFileItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDQ Jrxml Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDQ Jrxml Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDQJrxmlItem(TDQJrxmlItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDQ Source File Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDQ Source File Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDQSourceFileItem(TDQSourceFileItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDQ Match Rule Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDQ Match Rule Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDQMatchRuleItem(TDQMatchRuleItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseItem(Item object) {
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

} //PropertiesSwitch
