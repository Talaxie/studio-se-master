/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Mining Model Result</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the result set produced by a run of a MiningModel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningModelResult#getType <em>Type</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningModelResult#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningModelResult()
 * @model
 * @generated
 */
public interface MiningModelResult extends orgomg.cwm.objectmodel.core.Class {

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Type of
     * information contained in mining result. The following types are
     * predefined: sensitivityResult, liftResult, classificationEvalResult,
     * regressionEvalResult <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningModelResult_Type()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.MiningModelResult#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwm.analysis.datamining.MiningModel#getMiningResult <em>Mining Result</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The mining model that produced the result set.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Model</em>' reference.
     * @see #setModel(MiningModel)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningModelResult_Model()
     * @see orgomg.cwm.analysis.datamining.MiningModel#getMiningResult
     * @model opposite="miningResult" required="true"
     * @generated
     */
    MiningModel getModel();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.MiningModelResult#getModel <em>Model</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' reference.
     * @see #getModel()
     * @generated
     */
    void setModel(MiningModel value);

} // MiningModelResult
