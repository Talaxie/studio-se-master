/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.analysis.datamining.*;
import orgomg.cwm.analysis.datamining.ApplicationAttribute;
import orgomg.cwm.analysis.datamining.ApplicationInputSpecification;
import orgomg.cwm.analysis.datamining.AssociationRulesSettings;
import orgomg.cwm.analysis.datamining.AttributeUsageRelation;
import orgomg.cwm.analysis.datamining.CategoricalAttribute;
import orgomg.cwm.analysis.datamining.Category;
import orgomg.cwm.analysis.datamining.CategoryHierarchy;
import orgomg.cwm.analysis.datamining.ClassificationSettings;
import orgomg.cwm.analysis.datamining.ClusteringSettings;
import orgomg.cwm.analysis.datamining.CostMatrix;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningAttribute;
import orgomg.cwm.analysis.datamining.MiningDataSpecification;
import orgomg.cwm.analysis.datamining.MiningModel;
import orgomg.cwm.analysis.datamining.MiningModelResult;
import orgomg.cwm.analysis.datamining.MiningSettings;
import orgomg.cwm.analysis.datamining.NumericAttribute;
import orgomg.cwm.analysis.datamining.OrdinalAttribute;
import orgomg.cwm.analysis.datamining.RegressionSettings;
import orgomg.cwm.analysis.datamining.StatisticsSettings;
import orgomg.cwm.analysis.datamining.SupervisedMiningModel;
import orgomg.cwm.analysis.datamining.SupervisedMiningSettings;
import orgomg.cwm.objectmodel.core.Attribute;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.Feature;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwm.objectmodel.core.StructuralFeature;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see orgomg.cwm.analysis.datamining.DataminingPackage
 * @generated
 */
public class DataminingAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static DataminingPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public DataminingAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DataminingPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc --> This implementation returns <code>true</code> if
     * the object is either the model's package or is an instance object of the
     * model. <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DataminingSwitch<Adapter> modelSwitch = new DataminingSwitch<Adapter>() {

        @Override
        public Adapter caseApplicationInputSpecification(ApplicationInputSpecification object) {
            return createApplicationInputSpecificationAdapter();
        }

        @Override
        public Adapter caseAttributeUsageRelation(AttributeUsageRelation object) {
            return createAttributeUsageRelationAdapter();
        }

        @Override
        public Adapter caseCategory(Category object) {
            return createCategoryAdapter();
        }

        @Override
        public Adapter caseCategoryHierarchy(CategoryHierarchy object) {
            return createCategoryHierarchyAdapter();
        }

        @Override
        public Adapter caseCostMatrix(CostMatrix object) {
            return createCostMatrixAdapter();
        }

        @Override
        public Adapter caseMiningAttribute(MiningAttribute object) {
            return createMiningAttributeAdapter();
        }

        @Override
        public Adapter caseMiningDataSpecification(MiningDataSpecification object) {
            return createMiningDataSpecificationAdapter();
        }

        @Override
        public Adapter caseMiningModel(MiningModel object) {
            return createMiningModelAdapter();
        }

        @Override
        public Adapter caseMiningModelResult(MiningModelResult object) {
            return createMiningModelResultAdapter();
        }

        @Override
        public Adapter caseNumericAttribute(NumericAttribute object) {
            return createNumericAttributeAdapter();
        }

        @Override
        public Adapter caseSupervisedMiningModel(SupervisedMiningModel object) {
            return createSupervisedMiningModelAdapter();
        }

        @Override
        public Adapter caseCategoricalAttribute(CategoricalAttribute object) {
            return createCategoricalAttributeAdapter();
        }

        @Override
        public Adapter caseOrdinalAttribute(OrdinalAttribute object) {
            return createOrdinalAttributeAdapter();
        }

        @Override
        public Adapter caseMiningSettings(MiningSettings object) {
            return createMiningSettingsAdapter();
        }

        @Override
        public Adapter caseClusteringSettings(ClusteringSettings object) {
            return createClusteringSettingsAdapter();
        }

        @Override
        public Adapter caseStatisticsSettings(StatisticsSettings object) {
            return createStatisticsSettingsAdapter();
        }

        @Override
        public Adapter caseSupervisedMiningSettings(SupervisedMiningSettings object) {
            return createSupervisedMiningSettingsAdapter();
        }

        @Override
        public Adapter caseClassificationSettings(ClassificationSettings object) {
            return createClassificationSettingsAdapter();
        }

        @Override
        public Adapter caseRegressionSettings(RegressionSettings object) {
            return createRegressionSettingsAdapter();
        }

        @Override
        public Adapter caseAssociationRulesSettings(AssociationRulesSettings object) {
            return createAssociationRulesSettingsAdapter();
        }

        @Override
        public Adapter caseApplicationAttribute(ApplicationAttribute object) {
            return createApplicationAttributeAdapter();
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
        public Adapter caseNamespace(Namespace object) {
            return createNamespaceAdapter();
        }

        @Override
        public Adapter caseClassifier(Classifier object) {
            return createClassifierAdapter();
        }

        @Override
        public Adapter caseClass(orgomg.cwm.objectmodel.core.Class object) {
            return createClassAdapter();
        }

        @Override
        public Adapter caseFeature(Feature object) {
            return createFeatureAdapter();
        }

        @Override
        public Adapter caseStructuralFeature(StructuralFeature object) {
            return createStructuralFeatureAdapter();
        }

        @Override
        public Adapter caseAttribute(Attribute object) {
            return createAttributeAdapter();
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
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.ApplicationInputSpecification <em>Application Input Specification</em>}'.
     * <!-- begin-user-doc --> This
     * default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.ApplicationInputSpecification
     * @generated
     */
    public Adapter createApplicationInputSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.AttributeUsageRelation <em>Attribute Usage Relation</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.AttributeUsageRelation
     * @generated
     */
    public Adapter createAttributeUsageRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.analysis.datamining.Category <em>Category</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.Category
     * @generated
     */
    public Adapter createCategoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.CategoryHierarchy <em>Category Hierarchy</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.CategoryHierarchy
     * @generated
     */
    public Adapter createCategoryHierarchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.CostMatrix <em>Cost Matrix</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.CostMatrix
     * @generated
     */
    public Adapter createCostMatrixAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.MiningAttribute <em>Mining Attribute</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.MiningAttribute
     * @generated
     */
    public Adapter createMiningAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.MiningDataSpecification <em>Mining Data Specification</em>}'.
     * <!-- begin-user-doc --> This
     * default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.MiningDataSpecification
     * @generated
     */
    public Adapter createMiningDataSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.MiningModel <em>Mining Model</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.MiningModel
     * @generated
     */
    public Adapter createMiningModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.MiningModelResult <em>Mining Model Result</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.MiningModelResult
     * @generated
     */
    public Adapter createMiningModelResultAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.NumericAttribute <em>Numeric Attribute</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.NumericAttribute
     * @generated
     */
    public Adapter createNumericAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.SupervisedMiningModel <em>Supervised Mining Model</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.SupervisedMiningModel
     * @generated
     */
    public Adapter createSupervisedMiningModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.CategoricalAttribute <em>Categorical Attribute</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.CategoricalAttribute
     * @generated
     */
    public Adapter createCategoricalAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.OrdinalAttribute <em>Ordinal Attribute</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.OrdinalAttribute
     * @generated
     */
    public Adapter createOrdinalAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.MiningSettings <em>Mining Settings</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.MiningSettings
     * @generated
     */
    public Adapter createMiningSettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.ClusteringSettings <em>Clustering Settings</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.ClusteringSettings
     * @generated
     */
    public Adapter createClusteringSettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.StatisticsSettings <em>Statistics Settings</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.StatisticsSettings
     * @generated
     */
    public Adapter createStatisticsSettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.SupervisedMiningSettings <em>Supervised Mining Settings</em>}'.
     * <!-- begin-user-doc --> This
     * default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.SupervisedMiningSettings
     * @generated
     */
    public Adapter createSupervisedMiningSettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.ClassificationSettings <em>Classification Settings</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.ClassificationSettings
     * @generated
     */
    public Adapter createClassificationSettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.RegressionSettings <em>Regression Settings</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.RegressionSettings
     * @generated
     */
    public Adapter createRegressionSettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.AssociationRulesSettings <em>Association Rules Settings</em>}'.
     * <!-- begin-user-doc --> This
     * default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.AssociationRulesSettings
     * @generated
     */
    public Adapter createAssociationRulesSettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.analysis.datamining.ApplicationAttribute <em>Application Attribute</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.analysis.datamining.ApplicationAttribute
     * @generated
     */
    public Adapter createApplicationAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Element <em>Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.ModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.ModelElement
     * @generated
     */
    public Adapter createModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Namespace <em>Namespace</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Namespace
     * @generated
     */
    public Adapter createNamespaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Classifier <em>Classifier</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Classifier
     * @generated
     */
    public Adapter createClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Class <em>Class</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Class
     * @generated
     */
    public Adapter createClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Feature <em>Feature</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Feature
     * @generated
     */
    public Adapter createFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.StructuralFeature <em>Structural Feature</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.StructuralFeature
     * @generated
     */
    public Adapter createStructuralFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Attribute <em>Attribute</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc --> This
     * default implementation returns null. <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // DataminingAdapterFactory
