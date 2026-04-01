/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.columnset;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage
 * @generated
 */
public interface ColumnsetFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ColumnsetFactory eINSTANCE = org.talend.dataquality.indicators.columnset.impl.ColumnsetFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Value Matching Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Matching Indicator</em>'.
     * @generated
     */
    ValueMatchingIndicator createValueMatchingIndicator();

    /**
     * Returns a new object of class '<em>Row Matching Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Row Matching Indicator</em>'.
     * @generated
     */
    RowMatchingIndicator createRowMatchingIndicator();

    /**
     * Returns a new object of class '<em>Column Set Multi Value Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Column Set Multi Value Indicator</em>'.
     * @generated
     */
    ColumnSetMultiValueIndicator createColumnSetMultiValueIndicator();

    /**
     * Returns a new object of class '<em>All Match Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>All Match Indicator</em>'.
     * @generated
     */
    AllMatchIndicator createAllMatchIndicator();

    /**
     * Returns a new object of class '<em>Count Avg Null Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Count Avg Null Indicator</em>'.
     * @generated
     */
    CountAvgNullIndicator createCountAvgNullIndicator();

    /**
     * Returns a new object of class '<em>Min Max Date Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Min Max Date Indicator</em>'.
     * @generated
     */
    MinMaxDateIndicator createMinMaxDateIndicator();

    /**
     * Returns a new object of class '<em>Weak Correlation Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Weak Correlation Indicator</em>'.
     * @generated
     */
    WeakCorrelationIndicator createWeakCorrelationIndicator();

    /**
     * Returns a new object of class '<em>Column Dependency Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Column Dependency Indicator</em>'.
     * @generated
     */
    ColumnDependencyIndicator createColumnDependencyIndicator();

    /**
     * Returns a new object of class '<em>Simple Stat Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Simple Stat Indicator</em>'.
     * @generated
     */
    SimpleStatIndicator createSimpleStatIndicator();

    /**
     * Returns a new object of class '<em>Block Key Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Block Key Indicator</em>'.
     * @generated
     */
    BlockKeyIndicator createBlockKeyIndicator();

    /**
     * Returns a new object of class '<em>Record Matching Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Record Matching Indicator</em>'.
     * @generated
     */
    RecordMatchingIndicator createRecordMatchingIndicator();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ColumnsetPackage getColumnsetPackage();

} //ColumnsetFactory
