/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.sql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.dataquality.indicators.sql.*;
import org.talend.dataquality.indicators.sql.IndicatorSqlFactory;
import org.talend.dataquality.indicators.sql.IndicatorSqlPackage;
import org.talend.dataquality.indicators.sql.JavaUserDefIndicator;
import org.talend.dataquality.indicators.sql.UserDefIndicator;
import org.talend.dataquality.indicators.sql.WhereRuleIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class IndicatorSqlFactoryImpl extends EFactoryImpl implements IndicatorSqlFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static IndicatorSqlFactory init() {
        try {
            IndicatorSqlFactory theIndicatorSqlFactory = (IndicatorSqlFactory)EPackage.Registry.INSTANCE.getEFactory(IndicatorSqlPackage.eNS_URI);
            if (theIndicatorSqlFactory != null) {
                return theIndicatorSqlFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new IndicatorSqlFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public IndicatorSqlFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case IndicatorSqlPackage.USER_DEF_INDICATOR: return createUserDefIndicator();
            case IndicatorSqlPackage.WHERE_RULE_INDICATOR: return createWhereRuleIndicator();
            case IndicatorSqlPackage.JAVA_USER_DEF_INDICATOR: return createJavaUserDefIndicator();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UserDefIndicator createUserDefIndicator() {
        UserDefIndicatorImpl userDefIndicator = new UserDefIndicatorImpl();
        return userDefIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WhereRuleIndicator createWhereRuleIndicator() {
        WhereRuleIndicatorImpl whereRuleIndicator = new WhereRuleIndicatorImpl();
        return whereRuleIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JavaUserDefIndicator createJavaUserDefIndicator() {
        JavaUserDefIndicatorImpl javaUserDefIndicator = new JavaUserDefIndicatorImpl();
        return javaUserDefIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IndicatorSqlPackage getIndicatorSqlPackage() {
        return (IndicatorSqlPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static IndicatorSqlPackage getPackage() {
        return IndicatorSqlPackage.eINSTANCE;
    }

} // IndicatorSqlFactoryImpl
