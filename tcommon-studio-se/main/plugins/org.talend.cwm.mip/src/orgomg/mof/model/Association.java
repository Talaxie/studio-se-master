/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.mof.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwmmip.ModeledSemanticContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Association</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.mof.model.Association#getModeledProjection <em>Modeled Projection</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.mof.model.ModelPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {

    /**
     * Returns the value of the '<em><b>Modeled Projection</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmmip.ModeledSemanticContext}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmmip.ModeledSemanticContext#getMofAssociation <em>Mof Association</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modeled Projection</em>' reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modeled Projection</em>' reference list.
     * @see orgomg.mof.model.ModelPackage#getAssociation_ModeledProjection()
     * @see orgomg.cwmmip.ModeledSemanticContext#getMofAssociation
     * @model opposite="mofAssociation"
     * @generated
     */
    EList<ModeledSemanticContext> getModeledProjection();

} // Association
