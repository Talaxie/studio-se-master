/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Mining Model</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Description of the data produced by a mining function.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningModel#getFunction <em>Function</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningModel#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningModel#getSettings <em>Settings</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningModel#getMiningResult <em>Mining Result</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningModel#getInputSpec <em>Input Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningModel()
 * @model
 * @generated
 */
public interface MiningModel extends orgomg.cwm.objectmodel.core.Class {

    /**
     * Returns the value of the '<em><b>Function</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Names
     * the mining function. The following functions are predefined:
     * StatisticalAnalysis, FeatureSelection, AssociationRules, Classification,
     * Clustering, Regression. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Function</em>' attribute.
     * @see #setFunction(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningModel_Function()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getFunction();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.MiningModel#getFunction
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
     * selfOrganizingMap, centerBasedClustering, distributionBasedClustering,
     * associationRules, polynomialRegression, radialBasisFunction,
     * ruleBasedClassification, principalComponentAnalysis, factorAnalysis,
     * bivariateAnalysis, descriptiveAnalysis, geneticAlgorithm <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Algorithm</em>' attribute.
     * @see #setAlgorithm(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningModel_Algorithm()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getAlgorithm();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.MiningModel#getAlgorithm
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
     * Returns the value of the '<em><b>Settings</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwm.analysis.datamining.MiningSettings#getMiningModel <em>Mining Model</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The settings used to derive the mining model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Settings</em>' reference.
     * @see #setSettings(MiningSettings)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningModel_Settings()
     * @see orgomg.cwm.analysis.datamining.MiningSettings#getMiningModel
     * @model opposite="miningModel"
     * @generated
     */
    MiningSettings getSettings();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.MiningModel#getSettings
     * <em>Settings</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Settings</em>' reference.
     * @see #getSettings()
     * @generated
     */
    void setSettings(MiningSettings value);

    /**
     * Returns the value of the '<em><b>Mining Result</b></em>' reference list.
     * The list contents are of type
     * {@link orgomg.cwm.analysis.datamining.MiningModelResult}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.MiningModelResult#getModel
     * <em>Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The result set produced by the mining model. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Mining Result</em>' reference list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningModel_MiningResult()
     * @see orgomg.cwm.analysis.datamining.MiningModelResult#getModel
     * @model opposite="model"
     * @generated
     */
    EList<MiningModelResult> getMiningResult();

    /**
     * Returns the value of the '<em><b>Input Spec</b></em>' containment reference list.
     * The list contents are of type {@link orgomg.cwm.analysis.datamining.ApplicationInputSpecification}.
     * It is bidirectional and its opposite is '{@link orgomg.cwm.analysis.datamining.ApplicationInputSpecification#getMiningModel <em>Mining Model</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An ApplicationInputSpecification owned by a MiningModel.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Spec</em>' containment reference list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningModel_InputSpec()
     * @see orgomg.cwm.analysis.datamining.ApplicationInputSpecification#getMiningModel
     * @model opposite="miningModel" containment="true" required="true"
     * @generated
     */
    EList<ApplicationInputSpecification> getInputSpec();

} // MiningModel
