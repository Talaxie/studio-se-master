/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.columnset.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.talend.dataquality.indicators.CompositeIndicator;
import org.talend.dataquality.indicators.Indicator;
import org.talend.dataquality.indicators.MatchingIndicator;
import org.talend.dataquality.indicators.PatternMatchingIndicator;
import org.talend.dataquality.indicators.RegexpMatchingIndicator;
import org.talend.dataquality.indicators.columnset.*;
import org.talend.dataquality.indicators.columnset.AllMatchIndicator;
import org.talend.dataquality.indicators.columnset.BlockKeyIndicator;
import org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator;
import org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator;
import org.talend.dataquality.indicators.columnset.ColumnsCompareIndicator;
import org.talend.dataquality.indicators.columnset.ColumnsetPackage;
import org.talend.dataquality.indicators.columnset.CountAvgNullIndicator;
import org.talend.dataquality.indicators.columnset.MinMaxDateIndicator;
import org.talend.dataquality.indicators.columnset.RecordMatchingIndicator;
import org.talend.dataquality.indicators.columnset.RowMatchingIndicator;
import org.talend.dataquality.indicators.columnset.SimpleStatIndicator;
import org.talend.dataquality.indicators.columnset.ValueMatchingIndicator;
import org.talend.dataquality.indicators.columnset.WeakCorrelationIndicator;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.ModelElement;

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
 * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage
 * @generated
 */
public class ColumnsetSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ColumnsetPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColumnsetSwitch() {
        if (modelPackage == null) {
            modelPackage = ColumnsetPackage.eINSTANCE;
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
            case ColumnsetPackage.COLUMNS_COMPARE_INDICATOR: {
                ColumnsCompareIndicator columnsCompareIndicator = (ColumnsCompareIndicator)theEObject;
                T result = caseColumnsCompareIndicator(columnsCompareIndicator);
                if (result == null) result = caseMatchingIndicator(columnsCompareIndicator);
                if (result == null) result = caseIndicator(columnsCompareIndicator);
                if (result == null) result = caseModelElement(columnsCompareIndicator);
                if (result == null) result = caseElement(columnsCompareIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ColumnsetPackage.VALUE_MATCHING_INDICATOR: {
                ValueMatchingIndicator valueMatchingIndicator = (ValueMatchingIndicator)theEObject;
                T result = caseValueMatchingIndicator(valueMatchingIndicator);
                if (result == null) result = caseColumnsCompareIndicator(valueMatchingIndicator);
                if (result == null) result = caseMatchingIndicator(valueMatchingIndicator);
                if (result == null) result = caseIndicator(valueMatchingIndicator);
                if (result == null) result = caseModelElement(valueMatchingIndicator);
                if (result == null) result = caseElement(valueMatchingIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ColumnsetPackage.ROW_MATCHING_INDICATOR: {
                RowMatchingIndicator rowMatchingIndicator = (RowMatchingIndicator)theEObject;
                T result = caseRowMatchingIndicator(rowMatchingIndicator);
                if (result == null) result = caseColumnsCompareIndicator(rowMatchingIndicator);
                if (result == null) result = caseMatchingIndicator(rowMatchingIndicator);
                if (result == null) result = caseIndicator(rowMatchingIndicator);
                if (result == null) result = caseModelElement(rowMatchingIndicator);
                if (result == null) result = caseElement(rowMatchingIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR: {
                ColumnSetMultiValueIndicator columnSetMultiValueIndicator = (ColumnSetMultiValueIndicator)theEObject;
                T result = caseColumnSetMultiValueIndicator(columnSetMultiValueIndicator);
                if (result == null) result = caseCompositeIndicator(columnSetMultiValueIndicator);
                if (result == null) result = caseIndicator(columnSetMultiValueIndicator);
                if (result == null) result = caseModelElement(columnSetMultiValueIndicator);
                if (result == null) result = caseElement(columnSetMultiValueIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ColumnsetPackage.ALL_MATCH_INDICATOR: {
                AllMatchIndicator allMatchIndicator = (AllMatchIndicator)theEObject;
                T result = caseAllMatchIndicator(allMatchIndicator);
                if (result == null) result = caseColumnSetMultiValueIndicator(allMatchIndicator);
                if (result == null) result = caseRegexpMatchingIndicator(allMatchIndicator);
                if (result == null) result = caseCompositeIndicator(allMatchIndicator);
                if (result == null) result = casePatternMatchingIndicator(allMatchIndicator);
                if (result == null) result = caseMatchingIndicator(allMatchIndicator);
                if (result == null) result = caseIndicator(allMatchIndicator);
                if (result == null) result = caseModelElement(allMatchIndicator);
                if (result == null) result = caseElement(allMatchIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ColumnsetPackage.COUNT_AVG_NULL_INDICATOR: {
                CountAvgNullIndicator countAvgNullIndicator = (CountAvgNullIndicator)theEObject;
                T result = caseCountAvgNullIndicator(countAvgNullIndicator);
                if (result == null) result = caseColumnSetMultiValueIndicator(countAvgNullIndicator);
                if (result == null) result = caseCompositeIndicator(countAvgNullIndicator);
                if (result == null) result = caseIndicator(countAvgNullIndicator);
                if (result == null) result = caseModelElement(countAvgNullIndicator);
                if (result == null) result = caseElement(countAvgNullIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ColumnsetPackage.MIN_MAX_DATE_INDICATOR: {
                MinMaxDateIndicator minMaxDateIndicator = (MinMaxDateIndicator)theEObject;
                T result = caseMinMaxDateIndicator(minMaxDateIndicator);
                if (result == null) result = caseColumnSetMultiValueIndicator(minMaxDateIndicator);
                if (result == null) result = caseCompositeIndicator(minMaxDateIndicator);
                if (result == null) result = caseIndicator(minMaxDateIndicator);
                if (result == null) result = caseModelElement(minMaxDateIndicator);
                if (result == null) result = caseElement(minMaxDateIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ColumnsetPackage.WEAK_CORRELATION_INDICATOR: {
                WeakCorrelationIndicator weakCorrelationIndicator = (WeakCorrelationIndicator)theEObject;
                T result = caseWeakCorrelationIndicator(weakCorrelationIndicator);
                if (result == null) result = caseColumnSetMultiValueIndicator(weakCorrelationIndicator);
                if (result == null) result = caseCompositeIndicator(weakCorrelationIndicator);
                if (result == null) result = caseIndicator(weakCorrelationIndicator);
                if (result == null) result = caseModelElement(weakCorrelationIndicator);
                if (result == null) result = caseElement(weakCorrelationIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ColumnsetPackage.COLUMN_DEPENDENCY_INDICATOR: {
                ColumnDependencyIndicator columnDependencyIndicator = (ColumnDependencyIndicator)theEObject;
                T result = caseColumnDependencyIndicator(columnDependencyIndicator);
                if (result == null) result = caseIndicator(columnDependencyIndicator);
                if (result == null) result = caseModelElement(columnDependencyIndicator);
                if (result == null) result = caseElement(columnDependencyIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ColumnsetPackage.SIMPLE_STAT_INDICATOR: {
                SimpleStatIndicator simpleStatIndicator = (SimpleStatIndicator)theEObject;
                T result = caseSimpleStatIndicator(simpleStatIndicator);
                if (result == null) result = caseColumnSetMultiValueIndicator(simpleStatIndicator);
                if (result == null) result = caseCompositeIndicator(simpleStatIndicator);
                if (result == null) result = caseIndicator(simpleStatIndicator);
                if (result == null) result = caseModelElement(simpleStatIndicator);
                if (result == null) result = caseElement(simpleStatIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ColumnsetPackage.BLOCK_KEY_INDICATOR: {
                BlockKeyIndicator blockKeyIndicator = (BlockKeyIndicator)theEObject;
                T result = caseBlockKeyIndicator(blockKeyIndicator);
                if (result == null) result = caseColumnSetMultiValueIndicator(blockKeyIndicator);
                if (result == null) result = caseCompositeIndicator(blockKeyIndicator);
                if (result == null) result = caseIndicator(blockKeyIndicator);
                if (result == null) result = caseModelElement(blockKeyIndicator);
                if (result == null) result = caseElement(blockKeyIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ColumnsetPackage.RECORD_MATCHING_INDICATOR: {
                RecordMatchingIndicator recordMatchingIndicator = (RecordMatchingIndicator)theEObject;
                T result = caseRecordMatchingIndicator(recordMatchingIndicator);
                if (result == null) result = caseColumnSetMultiValueIndicator(recordMatchingIndicator);
                if (result == null) result = caseCompositeIndicator(recordMatchingIndicator);
                if (result == null) result = caseIndicator(recordMatchingIndicator);
                if (result == null) result = caseModelElement(recordMatchingIndicator);
                if (result == null) result = caseElement(recordMatchingIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Columns Compare Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Columns Compare Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColumnsCompareIndicator(ColumnsCompareIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Matching Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Matching Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueMatchingIndicator(ValueMatchingIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Row Matching Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Row Matching Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRowMatchingIndicator(RowMatchingIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Column Set Multi Value Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Column Set Multi Value Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColumnSetMultiValueIndicator(ColumnSetMultiValueIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>All Match Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>All Match Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAllMatchIndicator(AllMatchIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Count Avg Null Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Count Avg Null Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCountAvgNullIndicator(CountAvgNullIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Min Max Date Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Min Max Date Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMinMaxDateIndicator(MinMaxDateIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Weak Correlation Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Weak Correlation Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWeakCorrelationIndicator(WeakCorrelationIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Column Dependency Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Column Dependency Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColumnDependencyIndicator(ColumnDependencyIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Stat Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Stat Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleStatIndicator(SimpleStatIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Block Key Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Block Key Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBlockKeyIndicator(BlockKeyIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Record Matching Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Record Matching Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecordMatchingIndicator(RecordMatchingIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElement(ModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIndicator(Indicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Matching Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Matching Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMatchingIndicator(MatchingIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Composite Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Composite Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompositeIndicator(CompositeIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pattern Matching Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pattern Matching Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePatternMatchingIndicator(PatternMatchingIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regexp Matching Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regexp Matching Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegexpMatchingIndicator(RegexpMatchingIndicator object) {
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

} //ColumnsetSwitch
