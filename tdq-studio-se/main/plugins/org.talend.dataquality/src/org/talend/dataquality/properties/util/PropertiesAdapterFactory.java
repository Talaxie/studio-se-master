/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.properties.PropertiesPackage
 * @generated
 */
public class PropertiesAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PropertiesPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = PropertiesPackage.eINSTANCE;
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
    protected PropertiesSwitch<Adapter> modelSwitch =
        new PropertiesSwitch<Adapter>() {
            @Override
            public Adapter caseTDQAnalysisItem(TDQAnalysisItem object) {
                return createTDQAnalysisItemAdapter();
            }
            @Override
            public Adapter caseTDQReportItem(TDQReportItem object) {
                return createTDQReportItemAdapter();
            }
            @Override
            public Adapter caseTDQIndicatorDefinitionItem(TDQIndicatorDefinitionItem object) {
                return createTDQIndicatorDefinitionItemAdapter();
            }
            @Override
            public Adapter caseTDQBusinessRuleItem(TDQBusinessRuleItem object) {
                return createTDQBusinessRuleItemAdapter();
            }
            @Override
            public Adapter caseTDQPatternItem(TDQPatternItem object) {
                return createTDQPatternItemAdapter();
            }
            @Override
            public Adapter caseTDQFileItem(TDQFileItem object) {
                return createTDQFileItemAdapter();
            }
            @Override
            public Adapter caseTDQJrxmlItem(TDQJrxmlItem object) {
                return createTDQJrxmlItemAdapter();
            }
            @Override
            public Adapter caseTDQSourceFileItem(TDQSourceFileItem object) {
                return createTDQSourceFileItemAdapter();
            }
            @Override
            public Adapter caseTDQMatchRuleItem(TDQMatchRuleItem object) {
                return createTDQMatchRuleItemAdapter();
            }
            @Override
            public Adapter caseItem(Item object) {
                return createItemAdapter();
            }
            @Override
            public Adapter caseTDQItem(TDQItem object) {
                return createTDQItemAdapter();
            }
            @Override
            public Adapter caseFileItem(FileItem object) {
                return createFileItemAdapter();
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
     * Creates a new adapter for an object of class '{@link org.talend.core.model.properties.TDQItem <em>TDQ Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.core.model.properties.TDQItem
     * @generated
     */
    public Adapter createTDQItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.core.model.properties.FileItem <em>File Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.core.model.properties.FileItem
     * @generated
     */
    public Adapter createFileItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.properties.TDQAnalysisItem <em>TDQ Analysis Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.properties.TDQAnalysisItem
     * @generated
     */
    public Adapter createTDQAnalysisItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.properties.TDQReportItem <em>TDQ Report Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.properties.TDQReportItem
     * @generated
     */
    public Adapter createTDQReportItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.properties.TDQIndicatorDefinitionItem <em>TDQ Indicator Definition Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.properties.TDQIndicatorDefinitionItem
     * @generated
     */
    public Adapter createTDQIndicatorDefinitionItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.properties.TDQBusinessRuleItem <em>TDQ Business Rule Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.properties.TDQBusinessRuleItem
     * @generated
     */
    public Adapter createTDQBusinessRuleItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.properties.TDQPatternItem <em>TDQ Pattern Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.properties.TDQPatternItem
     * @generated
     */
    public Adapter createTDQPatternItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.properties.TDQFileItem <em>TDQ File Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.properties.TDQFileItem
     * @generated
     */
    public Adapter createTDQFileItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.properties.TDQJrxmlItem <em>TDQ Jrxml Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.properties.TDQJrxmlItem
     * @generated
     */
    public Adapter createTDQJrxmlItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.properties.TDQSourceFileItem <em>TDQ Source File Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.properties.TDQSourceFileItem
     * @generated
     */
    public Adapter createTDQSourceFileItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.properties.TDQMatchRuleItem <em>TDQ Match Rule Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.properties.TDQMatchRuleItem
     * @generated
     */
    public Adapter createTDQMatchRuleItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.core.model.properties.Item <em>Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.core.model.properties.Item
     * @generated
     */
    public Adapter createItemAdapter() {
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

} //PropertiesAdapterFactory
