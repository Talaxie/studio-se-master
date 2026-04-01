/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.sql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage
 * @generated
 */
public interface IndicatorSqlFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    IndicatorSqlFactory eINSTANCE = org.talend.dataquality.indicators.sql.impl.IndicatorSqlFactoryImpl.init();

    /**
     * Returns a new object of class '<em>User Def Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>User Def Indicator</em>'.
     * @generated
     */
    UserDefIndicator createUserDefIndicator();

    /**
     * Returns a new object of class '<em>Where Rule Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Where Rule Indicator</em>'.
     * @generated
     */
    WhereRuleIndicator createWhereRuleIndicator();

    /**
     * Returns a new object of class '<em>Java User Def Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Java User Def Indicator</em>'.
     * @generated
     */
    JavaUserDefIndicator createJavaUserDefIndicator();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    IndicatorSqlPackage getIndicatorSqlPackage();

} //IndicatorSqlFactory
