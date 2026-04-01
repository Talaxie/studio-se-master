/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip;

import org.eclipse.emf.common.util.EList;
import orgomg.mof.model.Association;
import orgomg.mof.model.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Modeled Semantic Context</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ModeledSemanticContext is a subclass of SemanticContext that adds references to instances of MOF ModelElements and MOF Associations, as well as an association to MOF ModelElements as a means of specifying anchor classes. Constraints may be specified within ModelSemanticContext via the inherited SemanticContext::constraint attribute.
 * 
 * Note that this class generally supports the construction of "explicitly modeled" pattern definitions; that is, pattern definitions composed of MOF metaclass instances (or MOF metaobjects), rather than simply logical class names.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmmip.ModeledSemanticContext#getMofAssociation <em>Mof Association</em>}</li>
 *   <li>{@link orgomg.cwmmip.ModeledSemanticContext#getMofElement <em>Mof Element</em>}</li>
 *   <li>{@link orgomg.cwmmip.ModeledSemanticContext#getMofAnchorElement <em>Mof Anchor Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmmip.CwmmipPackage#getModeledSemanticContext()
 * @model
 * @generated
 */
public interface ModeledSemanticContext extends SemanticContext {

    /**
     * Returns the value of the '<em><b>Mof Association</b></em>' reference list.
     * The list contents are of type {@link orgomg.mof.model.Association}.
     * It is bidirectional and its opposite is '{@link orgomg.mof.model.Association#getModeledProjection <em>Modeled Projection</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mof Association</em>' reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mof Association</em>' reference list.
     * @see orgomg.cwmmip.CwmmipPackage#getModeledSemanticContext_MofAssociation()
     * @see orgomg.mof.model.Association#getModeledProjection
     * @model opposite="modeledProjection"
     * @generated
     */
    EList<Association> getMofAssociation();

    /**
     * Returns the value of the '<em><b>Mof Element</b></em>' reference list.
     * The list contents are of type {@link orgomg.mof.model.ModelElement}.
     * It is bidirectional and its opposite is '{@link orgomg.mof.model.ModelElement#getModeledProjection <em>Modeled Projection</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mof Element</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mof Element</em>' reference list.
     * @see orgomg.cwmmip.CwmmipPackage#getModeledSemanticContext_MofElement()
     * @see orgomg.mof.model.ModelElement#getModeledProjection
     * @model opposite="modeledProjection"
     * @generated
     */
    EList<ModelElement> getMofElement();

    /**
     * Returns the value of the '<em><b>Mof Anchor Element</b></em>' reference list.
     * The list contents are of type {@link orgomg.mof.model.ModelElement}.
     * It is bidirectional and its opposite is '{@link orgomg.mof.model.ModelElement#getModeledSemanticContext <em>Modeled Semantic Context</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mof Anchor Element</em>' reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mof Anchor Element</em>' reference list.
     * @see orgomg.cwmmip.CwmmipPackage#getModeledSemanticContext_MofAnchorElement()
     * @see orgomg.mof.model.ModelElement#getModeledSemanticContext
     * @model opposite="modeledSemanticContext"
     * @generated
     */
    EList<ModelElement> getMofAnchorElement();

} // ModeledSemanticContext
