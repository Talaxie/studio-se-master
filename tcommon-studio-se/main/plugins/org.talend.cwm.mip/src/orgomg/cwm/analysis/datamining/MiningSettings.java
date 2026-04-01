/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Mining Settings</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parameters for mining activities. Mining settings indicate how the model should be or was built.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningSettings#getFunction <em>Function</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningSettings#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningSettings#getMiningModel <em>Mining Model</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningSettings#getAttributeUsage <em>Attribute Usage</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningSettings#getDataSpecification <em>Data Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningSettings()
 * @model
 * @generated
 */
public interface MiningSettings extends orgomg.cwm.objectmodel.core.Class {

    /**
     * Returns the value of the '<em><b>Function</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Names
     * the mining function. The following functions are predefined:
     * StatisticalAnalysis, FeatureSelection, AssociationRules, Classification,
     * Clustering, Regression <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Function</em>' attribute.
     * @see #setFunction(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningSettings_Function()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getFunction();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.MiningSettings#getFunction
     * <em>Function</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Function</em>' attribute.
     * @see #getFunction()
     * @generated
     */
    void setFunction(String value);

    /**
     * Returns the value of the '<em><b>Algorithm</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Names
     * the algorithm used to perform the mining function. The following
     * algorithms are predefined: decisionTree, neuralNetwork, naiveBayes,
     * selfOrganizingMap, centerBasedClustering, distributionBasedClustering
     * associationRules, polynomialRegression, radialBasisFunction,
     * ruleBasedClassification, principalComponentAnalysis, factorAnalysis,
     * bivariateAnalysis, descriptiveAnalysis, geneticAlgorithm <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Algorithm</em>' attribute.
     * @see #setAlgorithm(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningSettings_Algorithm()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getAlgorithm();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.MiningSettings#getAlgorithm
     * <em>Algorithm</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Algorithm</em>' attribute.
     * @see #getAlgorithm()
     * @generated
     */
    void setAlgorithm(String value);

    /**
     * Returns the value of the '<em><b>Mining Model</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.MiningModel#getSettings
     * <em>Settings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The mining model derived from its settings. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Mining Model</em>' reference.
     * @see #setMiningModel(MiningModel)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningSettings_MiningModel()
     * @see orgomg.cwm.analysis.datamining.MiningModel#getSettings
     * @model opposite="settings" required="true"
     * @generated
     */
    MiningModel getMiningModel();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.MiningSettings#getMiningModel <em>Mining Model</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Mining Model</em>' reference.
     * @see #getMiningModel()
     * @generated
     */
    void setMiningModel(MiningModel value);

    /**
     * Returns the value of the '<em><b>Attribute Usage</b></em>' containment
     * reference list. The list contents are of type
     * {@link orgomg.cwm.analysis.datamining.AttributeUsageRelation}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#getSettings
     * <em>Settings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> AttributeUsageRelations owned by the Settings. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Attribute Usage</em>' containment reference
     *         list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningSettings_AttributeUsage()
     * @see orgomg.cwm.analysis.datamining.AttributeUsageRelation#getSettings
     * @model opposite="settings" containment="true" required="true"
     * @generated
     */
    EList<AttributeUsageRelation> getAttributeUsage();

    /**
     * Returns the value of the '<em><b>Data Specification</b></em>' reference.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.MiningDataSpecification#getSettings
     * <em>Settings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The MiningAttribute referenced by MiningSettings.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Data Specification</em>' reference.
     * @see #setDataSpecification(MiningDataSpecification)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningSettings_DataSpecification()
     * @see orgomg.cwm.analysis.datamining.MiningDataSpecification#getSettings
     * @model opposite="settings" required="true"
     * @generated
     */
    MiningDataSpecification getDataSpecification();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.MiningSettings#getDataSpecification <em>Data Specification</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Data Specification</em>' reference.
     * @see #getDataSpecification()
     * @generated
     */
    void setDataSpecification(MiningDataSpecification value);

} // MiningSettings
