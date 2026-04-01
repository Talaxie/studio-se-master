/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.mof.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwmmip.ModeledGraphSubset;
import orgomg.cwmmip.ModeledSemanticContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Element</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.mof.model.ModelElement#getModeledGraphSubset <em>Modeled Graph Subset</em>}</li>
 *   <li>{@link orgomg.mof.model.ModelElement#getModeledProjection <em>Modeled Projection</em>}</li>
 *   <li>{@link orgomg.mof.model.ModelElement#getModeledSemanticContext <em>Modeled Semantic Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.mof.model.ModelPackage#getModelElement()
 * @model
 * @generated
 */
public interface ModelElement extends EObject {

    /**
     * Returns the value of the '<em><b>Modeled Graph Subset</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmmip.ModeledGraphSubset}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmmip.ModeledGraphSubset#getMofElement <em>Mof Element</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modeled Graph Subset</em>' reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modeled Graph Subset</em>' reference list.
     * @see orgomg.mof.model.ModelPackage#getModelElement_ModeledGraphSubset()
     * @see orgomg.cwmmip.ModeledGraphSubset#getMofElement
     * @model opposite="mofElement"
     * @generated
     */
    EList<ModeledGraphSubset> getModeledGraphSubset();

    /**
     * Returns the value of the '<em><b>Modeled Projection</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmmip.ModeledSemanticContext}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmmip.ModeledSemanticContext#getMofElement <em>Mof Element</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modeled Projection</em>' reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modeled Projection</em>' reference list.
     * @see orgomg.mof.model.ModelPackage#getModelElement_ModeledProjection()
     * @see orgomg.cwmmip.ModeledSemanticContext#getMofElement
     * @model opposite="mofElement"
     * @generated
     */
    EList<ModeledSemanticContext> getModeledProjection();

    /**
     * Returns the value of the '<em><b>Modeled Semantic Context</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmmip.ModeledSemanticContext}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmmip.ModeledSemanticContext#getMofAnchorElement <em>Mof Anchor Element</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modeled Semantic Context</em>' reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modeled Semantic Context</em>' reference list.
     * @see orgomg.mof.model.ModelPackage#getModelElement_ModeledSemanticContext()
     * @see orgomg.cwmmip.ModeledSemanticContext#getMofAnchorElement
     * @model opposite="mofAnchorElement"
     * @generated
     */
    EList<ModeledSemanticContext> getModeledSemanticContext();

} // ModelElement
