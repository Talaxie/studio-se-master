/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Supervised Mining Model</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Description of data produced by a predictive mining function.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.SupervisedMiningModel#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getSupervisedMiningModel()
 * @model
 * @generated
 */
public interface SupervisedMiningModel extends MiningModel {

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.ApplicationAttribute#getSupervisedMiningModel
     * <em>Supervised Mining Model</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> The "target"
     * ApplicationAttribute referenced by SupervisedMiningModels. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(ApplicationAttribute)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getSupervisedMiningModel_Target()
     * @see orgomg.cwm.analysis.datamining.ApplicationAttribute#getSupervisedMiningModel
     * @model opposite="supervisedMiningModel" required="true"
     * @generated
     */
    ApplicationAttribute getTarget();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.SupervisedMiningModel#getTarget
     * <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(ApplicationAttribute value);

} // SupervisedMiningModel
