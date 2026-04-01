/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.columnset.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage
 * @generated
 */
public class ColumnsetAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ColumnsetPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColumnsetAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ColumnsetPackage.eINSTANCE;
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ColumnsetSwitch<Adapter> modelSwitch =
        new ColumnsetSwitch<Adapter>() {
            @Override
            public Adapter caseColumnsCompareIndicator(ColumnsCompareIndicator object) {
                return createColumnsCompareIndicatorAdapter();
            }
            @Override
            public Adapter caseValueMatchingIndicator(ValueMatchingIndicator object) {
                return createValueMatchingIndicatorAdapter();
            }
            @Override
            public Adapter caseRowMatchingIndicator(RowMatchingIndicator object) {
                return createRowMatchingIndicatorAdapter();
            }
            @Override
            public Adapter caseColumnSetMultiValueIndicator(ColumnSetMultiValueIndicator object) {
                return createColumnSetMultiValueIndicatorAdapter();
            }
            @Override
            public Adapter caseAllMatchIndicator(AllMatchIndicator object) {
                return createAllMatchIndicatorAdapter();
            }
            @Override
            public Adapter caseCountAvgNullIndicator(CountAvgNullIndicator object) {
                return createCountAvgNullIndicatorAdapter();
            }
            @Override
            public Adapter caseMinMaxDateIndicator(MinMaxDateIndicator object) {
                return createMinMaxDateIndicatorAdapter();
            }
            @Override
            public Adapter caseWeakCorrelationIndicator(WeakCorrelationIndicator object) {
                return createWeakCorrelationIndicatorAdapter();
            }
            @Override
            public Adapter caseColumnDependencyIndicator(ColumnDependencyIndicator object) {
                return createColumnDependencyIndicatorAdapter();
            }
            @Override
            public Adapter caseSimpleStatIndicator(SimpleStatIndicator object) {
                return createSimpleStatIndicatorAdapter();
            }
            @Override
            public Adapter caseBlockKeyIndicator(BlockKeyIndicator object) {
                return createBlockKeyIndicatorAdapter();
            }
            @Override
            public Adapter caseRecordMatchingIndicator(RecordMatchingIndicator object) {
                return createRecordMatchingIndicatorAdapter();
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
            public Adapter caseMatchingIndicator(MatchingIndicator object) {
                return createMatchingIndicatorAdapter();
            }
            @Override
            public Adapter caseCompositeIndicator(CompositeIndicator object) {
                return createCompositeIndicatorAdapter();
            }
            @Override
            public Adapter casePatternMatchingIndicator(PatternMatchingIndicator object) {
                return createPatternMatchingIndicatorAdapter();
            }
            @Override
            public Adapter caseRegexpMatchingIndicator(RegexpMatchingIndicator object) {
                return createRegexpMatchingIndicatorAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
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
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.ColumnsCompareIndicator <em>Columns Compare Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.ColumnsCompareIndicator
     * @generated
     */
    public Adapter createColumnsCompareIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.ValueMatchingIndicator <em>Value Matching Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.ValueMatchingIndicator
     * @generated
     */
    public Adapter createValueMatchingIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.RowMatchingIndicator <em>Row Matching Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.RowMatchingIndicator
     * @generated
     */
    public Adapter createRowMatchingIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator <em>Column Set Multi Value Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator
     * @generated
     */
    public Adapter createColumnSetMultiValueIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.AllMatchIndicator <em>All Match Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.AllMatchIndicator
     * @generated
     */
    public Adapter createAllMatchIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.CountAvgNullIndicator <em>Count Avg Null Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.CountAvgNullIndicator
     * @generated
     */
    public Adapter createCountAvgNullIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.MinMaxDateIndicator <em>Min Max Date Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.MinMaxDateIndicator
     * @generated
     */
    public Adapter createMinMaxDateIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.WeakCorrelationIndicator <em>Weak Correlation Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.WeakCorrelationIndicator
     * @generated
     */
    public Adapter createWeakCorrelationIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator <em>Column Dependency Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator
     * @generated
     */
    public Adapter createColumnDependencyIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.SimpleStatIndicator <em>Simple Stat Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.SimpleStatIndicator
     * @generated
     */
    public Adapter createSimpleStatIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.BlockKeyIndicator <em>Block Key Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.BlockKeyIndicator
     * @generated
     */
    public Adapter createBlockKeyIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator <em>Record Matching Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.columnset.RecordMatchingIndicator
     * @generated
     */
    public Adapter createRecordMatchingIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.ModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.ModelElement
     * @generated
     */
    public Adapter createModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.Indicator <em>Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.Indicator
     * @generated
     */
    public Adapter createIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.MatchingIndicator <em>Matching Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.MatchingIndicator
     * @generated
     */
    public Adapter createMatchingIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.CompositeIndicator <em>Composite Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.CompositeIndicator
     * @generated
     */
    public Adapter createCompositeIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.PatternMatchingIndicator <em>Pattern Matching Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.PatternMatchingIndicator
     * @generated
     */
    public Adapter createPatternMatchingIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.indicators.RegexpMatchingIndicator <em>Regexp Matching Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.indicators.RegexpMatchingIndicator
     * @generated
     */
    public Adapter createRegexpMatchingIndicatorAdapter() {
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

} //ColumnsetAdapterFactory
