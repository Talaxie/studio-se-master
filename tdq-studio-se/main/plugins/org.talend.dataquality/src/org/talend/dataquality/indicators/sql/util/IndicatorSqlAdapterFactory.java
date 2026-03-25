/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.sql.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.talend.dataquality.indicators.Indicator;
import org.talend.dataquality.indicators.sql.*;
import org.talend.dataquality.indicators.sql.IndicatorSqlPackage;
import org.talend.dataquality.indicators.sql.JavaUserDefIndicator;
import org.talend.dataquality.indicators.sql.UserDefIndicator;
import org.talend.dataquality.indicators.sql.WhereRuleIndicator;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage
 * @generated
 */
public class IndicatorSqlAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static IndicatorSqlPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public IndicatorSqlAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = IndicatorSqlPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc --> This
     * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
     * the model. <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected IndicatorSqlSwitch<Adapter> modelSwitch = new IndicatorSqlSwitch<Adapter>() {
            @Override
            public Adapter caseUserDefIndicator(UserDefIndicator object) {
                return createUserDefIndicatorAdapter();
            }
            @Override
            public Adapter caseWhereRuleIndicator(WhereRuleIndicator object) {
                return createWhereRuleIndicatorAdapter();
            }
            @Override
            public Adapter caseJavaUserDefIndicator(JavaUserDefIndicator object) {
                return createJavaUserDefIndicatorAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseModelElement(ModelElement object) {
                return createModelElementAdapter();
            }
            @Override
            public Adapter caseIndicator(Indicator object) {
                return createIndicatorAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.sql.UserDefIndicator <em>User Def Indicator</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator
     * @generated
     */
    public Adapter createUserDefIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.sql.WhereRuleIndicator <em>Where Rule Indicator</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.sql.WhereRuleIndicator
     * @generated
     */
    public Adapter createWhereRuleIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.sql.JavaUserDefIndicator <em>Java User Def Indicator</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.sql.JavaUserDefIndicator
     * @generated
     */
    public Adapter createJavaUserDefIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.Element <em>Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
     * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.ModelElement
     * <em>Model Element</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.ModelElement
     * @generated
     */
    public Adapter createModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.Indicator
     * <em>Indicator</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     * 
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.Indicator
     * @generated
     */
    public Adapter createIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc --> This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // IndicatorSqlAdapterFactory
