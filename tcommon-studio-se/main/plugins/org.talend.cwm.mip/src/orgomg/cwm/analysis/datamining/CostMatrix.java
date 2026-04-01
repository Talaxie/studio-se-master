/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Cost Matrix</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines cost of misclassifications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.CostMatrix#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCostMatrix()
 * @model
 * @generated
 */
public interface CostMatrix extends orgomg.cwm.objectmodel.core.Class {

    /**
     * Returns the value of the '<em><b>Settings</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwm.analysis.datamining.ClassificationSettings}.
     * It is bidirectional and its opposite is '{@link orgomg.cwm.analysis.datamining.ClassificationSettings#getCostMatrix <em>Cost Matrix</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * ClassificationSettings referencing the CostMatrix
     * <!-- end-model-doc -->
     * @return the value of the '<em>Settings</em>' reference list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCostMatrix_Settings()
     * @see orgomg.cwm.analysis.datamining.ClassificationSettings#getCostMatrix
     * @model opposite="costMatrix"
     * @generated
     */
    EList<ClassificationSettings> getSettings();

} // CostMatrix
