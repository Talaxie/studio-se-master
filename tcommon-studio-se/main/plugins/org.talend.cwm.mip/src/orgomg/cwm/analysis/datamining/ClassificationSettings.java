/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Classification Settings</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parameters for computing a classification model.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.ClassificationSettings#getCostMatrix <em>Cost Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getClassificationSettings()
 * @model
 * @generated
 */
public interface ClassificationSettings extends SupervisedMiningSettings {

    /**
     * Returns the value of the '<em><b>Cost Matrix</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.CostMatrix#getSettings
     * <em>Settings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The CostMatrix referenced by ClassificationSettings.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Cost Matrix</em>' reference.
     * @see #setCostMatrix(CostMatrix)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getClassificationSettings_CostMatrix()
     * @see orgomg.cwm.analysis.datamining.CostMatrix#getSettings
     * @model opposite="settings"
     * @generated
     */
    CostMatrix getCostMatrix();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.ClassificationSettings#getCostMatrix <em>Cost Matrix</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Cost Matrix</em>' reference.
     * @see #getCostMatrix()
     * @generated
     */
    void setCostMatrix(CostMatrix value);

} // ClassificationSettings
