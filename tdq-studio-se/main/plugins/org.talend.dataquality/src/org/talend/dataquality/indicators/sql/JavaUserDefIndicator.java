/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.sql;

import org.talend.dataquality.analysis.ExecutionLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java User Def Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getJavaUserDefIndicator()
 * @model
 * @generated
 */
public interface JavaUserDefIndicator extends UserDefIndicator {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void setJavaUserDefObject(UserDefIndicator javaUDIObj);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void setExecuteEngine(ExecutionLanguage executionLanguage);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    UserDefIndicator getJavaUserDefObject();

} // JavaUserDefIndicator
