/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip;

import orgomg.mof.model.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Modeled Graph Subset</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ModeledGraphSubset is a subclass of GraphSubset that adds a reference to a single instance of MOF ModelElement.
 * 
 * Note that this class generally supports the construction of "explicitly modeled" pattern definitions; that is, pattern definitions composed of MOF metaclass instances (or MOF metaobjects), rather than simply logical class names.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmmip.ModeledGraphSubset#getMofElement <em>Mof Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmmip.CwmmipPackage#getModeledGraphSubset()
 * @model
 * @generated
 */
public interface ModeledGraphSubset extends GraphSubset {

    /**
     * Returns the value of the '<em><b>Mof Element</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.mof.model.ModelElement#getModeledGraphSubset <em>Modeled Graph Subset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mof Element</em>' reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mof Element</em>' reference.
     * @see #setMofElement(ModelElement)
     * @see orgomg.cwmmip.CwmmipPackage#getModeledGraphSubset_MofElement()
     * @see orgomg.mof.model.ModelElement#getModeledGraphSubset
     * @model opposite="modeledGraphSubset"
     * @generated
     */
    ModelElement getMofElement();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.ModeledGraphSubset#getMofElement <em>Mof Element</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Mof Element</em>' reference.
     * @see #getMofElement()
     * @generated
     */
    void setMofElement(ModelElement value);

} // ModeledGraphSubset
