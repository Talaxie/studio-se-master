/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>PSB Lib</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of PSBs - comparable to a COPYlib for data structures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSBLib#getPsb <em>Psb</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSBLib()
 * @model
 * @generated
 */
public interface PSBLib extends orgomg.cwm.objectmodel.core.Package {

    /**
     * Returns the value of the '<em><b>Psb</b></em>' reference list. The list
     * contents are of type {@link orgomg.cwmx.resource.imsdatabase.PSB}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.PSB#getLibrary <em>Library</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The PSBs stored in this PSBLIB. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Psb</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSBLib_Psb()
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getLibrary
     * @model opposite="library"
     * @generated
     */
    EList<PSB> getPsb();

} // PSBLib
