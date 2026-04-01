/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DBD Lib</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DBDLib is a collection of DBDs, comparable to a COPYlib for data structures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBDLib#getDbd <em>Dbd</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBDLib()
 * @model
 * @generated
 */
public interface DBDLib extends orgomg.cwm.objectmodel.core.Package {

    /**
     * Returns the value of the '<em><b>Dbd</b></em>' reference list. The list
     * contents are of type {@link orgomg.cwmx.resource.imsdatabase.DBD}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.DBD#getLibrary <em>Library</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * DBDs stored in the DBDLIB. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dbd</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBDLib_Dbd()
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getLibrary
     * @model opposite="library"
     * @generated
     */
    EList<DBD> getDbd();

} // DBDLib
