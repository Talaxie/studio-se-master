/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Supervised Mining Settings</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parameters for computing a supervised model, i.e., one that requires a target attribute against which to measure model accuracy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.SupervisedMiningSettings#getConfidenceAttributeName <em>Confidence Attribute Name</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.SupervisedMiningSettings#getPredictedAttributeName <em>Predicted Attribute Name</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.SupervisedMiningSettings#getCostFunction <em>Cost Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getSupervisedMiningSettings()
 * @model
 * @generated
 */
public interface SupervisedMiningSettings extends MiningSettings {

    /**
     * Returns the value of the '<em><b>Confidence Attribute Name</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Attribute name for output of confidence values of the
     * prediction. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Confidence Attribute Name</em>' attribute.
     * @see #setConfidenceAttributeName(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getSupervisedMiningSettings_ConfidenceAttributeName()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getConfidenceAttributeName();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.SupervisedMiningSettings#getConfidenceAttributeName <em>Confidence Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Confidence Attribute Name</em>' attribute.
     * @see #getConfidenceAttributeName()
     * @generated
     */
    void setConfidenceAttributeName(String value);

    /**
     * Returns the value of the '<em><b>Predicted Attribute Name</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Attribute name for output of predicted values. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Predicted Attribute Name</em>' attribute.
     * @see #setPredictedAttributeName(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getSupervisedMiningSettings_PredictedAttributeName()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getPredictedAttributeName();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.SupervisedMiningSettings#getPredictedAttributeName <em>Predicted Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Predicted Attribute Name</em>' attribute.
     * @see #getPredictedAttributeName()
     * @generated
     */
    void setPredictedAttributeName(String value);

    /**
     * Returns the value of the '<em><b>Cost Function</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Function specifying the cost of incorrect predictions. Predefined methods
     * are: entropy, Gini, costMatrix, pnorm, none. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Cost Function</em>' attribute.
     * @see #setCostFunction(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getSupervisedMiningSettings_CostFunction()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getCostFunction();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.SupervisedMiningSettings#getCostFunction <em>Cost Function</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Cost Function</em>' attribute.
     * @see #getCostFunction()
     * @generated
     */
    void setCostFunction(String value);

} // SupervisedMiningSettings
