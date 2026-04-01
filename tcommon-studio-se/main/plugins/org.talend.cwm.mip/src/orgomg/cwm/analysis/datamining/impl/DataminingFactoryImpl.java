/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import orgomg.cwm.analysis.datamining.*;
import orgomg.cwm.analysis.datamining.ApplicationAttribute;
import orgomg.cwm.analysis.datamining.ApplicationInputSpecification;
import orgomg.cwm.analysis.datamining.AssociationRulesSettings;
import orgomg.cwm.analysis.datamining.AttributeType;
import orgomg.cwm.analysis.datamining.AttributeUsage;
import orgomg.cwm.analysis.datamining.AttributeUsageRelation;
import orgomg.cwm.analysis.datamining.CategoricalAttribute;
import orgomg.cwm.analysis.datamining.Category;
import orgomg.cwm.analysis.datamining.CategoryHierarchy;
import orgomg.cwm.analysis.datamining.CategoryProperty;
import orgomg.cwm.analysis.datamining.ClassificationSettings;
import orgomg.cwm.analysis.datamining.ClusteringSettings;
import orgomg.cwm.analysis.datamining.CostMatrix;
import orgomg.cwm.analysis.datamining.DataminingFactory;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningAttribute;
import orgomg.cwm.analysis.datamining.MiningDataSpecification;
import orgomg.cwm.analysis.datamining.MiningModel;
import orgomg.cwm.analysis.datamining.MiningModelResult;
import orgomg.cwm.analysis.datamining.MiningSettings;
import orgomg.cwm.analysis.datamining.NumericAttribute;
import orgomg.cwm.analysis.datamining.OrderType;
import orgomg.cwm.analysis.datamining.OrdinalAttribute;
import orgomg.cwm.analysis.datamining.RegressionSettings;
import orgomg.cwm.analysis.datamining.StatisticsSettings;
import orgomg.cwm.analysis.datamining.SupervisedMiningModel;
import orgomg.cwm.analysis.datamining.SupervisedMiningSettings;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DataminingFactoryImpl extends EFactoryImpl implements DataminingFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static DataminingFactory init() {
        try {
            DataminingFactory theDataminingFactory = (DataminingFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///orgomg/cwm/analysis/datamining.ecore");
            if (theDataminingFactory != null) {
                return theDataminingFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DataminingFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public DataminingFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION:
            return createApplicationInputSpecification();
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION:
            return createAttributeUsageRelation();
        case DataminingPackage.CATEGORY:
            return createCategory();
        case DataminingPackage.CATEGORY_HIERARCHY:
            return createCategoryHierarchy();
        case DataminingPackage.COST_MATRIX:
            return createCostMatrix();
        case DataminingPackage.MINING_ATTRIBUTE:
            return createMiningAttribute();
        case DataminingPackage.MINING_DATA_SPECIFICATION:
            return createMiningDataSpecification();
        case DataminingPackage.MINING_MODEL:
            return createMiningModel();
        case DataminingPackage.MINING_MODEL_RESULT:
            return createMiningModelResult();
        case DataminingPackage.NUMERIC_ATTRIBUTE:
            return createNumericAttribute();
        case DataminingPackage.SUPERVISED_MINING_MODEL:
            return createSupervisedMiningModel();
        case DataminingPackage.CATEGORICAL_ATTRIBUTE:
            return createCategoricalAttribute();
        case DataminingPackage.ORDINAL_ATTRIBUTE:
            return createOrdinalAttribute();
        case DataminingPackage.MINING_SETTINGS:
            return createMiningSettings();
        case DataminingPackage.CLUSTERING_SETTINGS:
            return createClusteringSettings();
        case DataminingPackage.STATISTICS_SETTINGS:
            return createStatisticsSettings();
        case DataminingPackage.SUPERVISED_MINING_SETTINGS:
            return createSupervisedMiningSettings();
        case DataminingPackage.CLASSIFICATION_SETTINGS:
            return createClassificationSettings();
        case DataminingPackage.REGRESSION_SETTINGS:
            return createRegressionSettings();
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS:
            return createAssociationRulesSettings();
        case DataminingPackage.APPLICATION_ATTRIBUTE:
            return createApplicationAttribute();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case DataminingPackage.ATTRIBUTE_TYPE:
            return createAttributeTypeFromString(eDataType, initialValue);
        case DataminingPackage.ATTRIBUTE_USAGE:
            return createAttributeUsageFromString(eDataType, initialValue);
        case DataminingPackage.CATEGORY_PROPERTY:
            return createCategoryPropertyFromString(eDataType, initialValue);
        case DataminingPackage.ORDER_TYPE:
            return createOrderTypeFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case DataminingPackage.ATTRIBUTE_TYPE:
            return convertAttributeTypeToString(eDataType, instanceValue);
        case DataminingPackage.ATTRIBUTE_USAGE:
            return convertAttributeUsageToString(eDataType, instanceValue);
        case DataminingPackage.CATEGORY_PROPERTY:
            return convertCategoryPropertyToString(eDataType, instanceValue);
        case DataminingPackage.ORDER_TYPE:
            return convertOrderTypeToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ApplicationInputSpecification createApplicationInputSpecification() {
        ApplicationInputSpecificationImpl applicationInputSpecification = new ApplicationInputSpecificationImpl();
        return applicationInputSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AttributeUsageRelation createAttributeUsageRelation() {
        AttributeUsageRelationImpl attributeUsageRelation = new AttributeUsageRelationImpl();
        return attributeUsageRelation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Category createCategory() {
        CategoryImpl category = new CategoryImpl();
        return category;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CategoryHierarchy createCategoryHierarchy() {
        CategoryHierarchyImpl categoryHierarchy = new CategoryHierarchyImpl();
        return categoryHierarchy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CostMatrix createCostMatrix() {
        CostMatrixImpl costMatrix = new CostMatrixImpl();
        return costMatrix;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningAttribute createMiningAttribute() {
        MiningAttributeImpl miningAttribute = new MiningAttributeImpl();
        return miningAttribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningDataSpecification createMiningDataSpecification() {
        MiningDataSpecificationImpl miningDataSpecification = new MiningDataSpecificationImpl();
        return miningDataSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningModel createMiningModel() {
        MiningModelImpl miningModel = new MiningModelImpl();
        return miningModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningModelResult createMiningModelResult() {
        MiningModelResultImpl miningModelResult = new MiningModelResultImpl();
        return miningModelResult;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NumericAttribute createNumericAttribute() {
        NumericAttributeImpl numericAttribute = new NumericAttributeImpl();
        return numericAttribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SupervisedMiningModel createSupervisedMiningModel() {
        SupervisedMiningModelImpl supervisedMiningModel = new SupervisedMiningModelImpl();
        return supervisedMiningModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CategoricalAttribute createCategoricalAttribute() {
        CategoricalAttributeImpl categoricalAttribute = new CategoricalAttributeImpl();
        return categoricalAttribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public OrdinalAttribute createOrdinalAttribute() {
        OrdinalAttributeImpl ordinalAttribute = new OrdinalAttributeImpl();
        return ordinalAttribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningSettings createMiningSettings() {
        MiningSettingsImpl miningSettings = new MiningSettingsImpl();
        return miningSettings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ClusteringSettings createClusteringSettings() {
        ClusteringSettingsImpl clusteringSettings = new ClusteringSettingsImpl();
        return clusteringSettings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public StatisticsSettings createStatisticsSettings() {
        StatisticsSettingsImpl statisticsSettings = new StatisticsSettingsImpl();
        return statisticsSettings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SupervisedMiningSettings createSupervisedMiningSettings() {
        SupervisedMiningSettingsImpl supervisedMiningSettings = new SupervisedMiningSettingsImpl();
        return supervisedMiningSettings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ClassificationSettings createClassificationSettings() {
        ClassificationSettingsImpl classificationSettings = new ClassificationSettingsImpl();
        return classificationSettings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RegressionSettings createRegressionSettings() {
        RegressionSettingsImpl regressionSettings = new RegressionSettingsImpl();
        return regressionSettings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AssociationRulesSettings createAssociationRulesSettings() {
        AssociationRulesSettingsImpl associationRulesSettings = new AssociationRulesSettingsImpl();
        return associationRulesSettings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ApplicationAttribute createApplicationAttribute() {
        ApplicationAttributeImpl applicationAttribute = new ApplicationAttributeImpl();
        return applicationAttribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
        AttributeType result = AttributeType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AttributeUsage createAttributeUsageFromString(EDataType eDataType, String initialValue) {
        AttributeUsage result = AttributeUsage.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertAttributeUsageToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CategoryProperty createCategoryPropertyFromString(EDataType eDataType, String initialValue) {
        CategoryProperty result = CategoryProperty.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertCategoryPropertyToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public OrderType createOrderTypeFromString(EDataType eDataType, String initialValue) {
        OrderType result = OrderType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertOrderTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataminingPackage getDataminingPackage() {
        return (DataminingPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DataminingPackage getPackage() {
        return DataminingPackage.eINSTANCE;
    }

} // DataminingFactoryImpl
