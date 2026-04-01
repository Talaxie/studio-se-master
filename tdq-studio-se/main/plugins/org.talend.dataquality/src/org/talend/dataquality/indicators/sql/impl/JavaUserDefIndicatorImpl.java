/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.sql.impl;

import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.analysis.ExecutionLanguage;
import org.talend.dataquality.indicators.sql.IndicatorSqlPackage;
import org.talend.dataquality.indicators.sql.JavaUserDefIndicator;
import org.talend.dataquality.indicators.sql.UserDefIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Java User Def Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class JavaUserDefIndicatorImpl extends UserDefIndicatorImpl implements JavaUserDefIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected JavaUserDefIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorSqlPackage.Literals.JAVA_USER_DEF_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void setJavaUserDefObject(UserDefIndicator javaUDIObj) {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void setExecuteEngine(ExecutionLanguage executionLanguage) {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public UserDefIndicator getJavaUserDefObject() {
        return null;
    }

} // JavaUserDefIndicatorImpl