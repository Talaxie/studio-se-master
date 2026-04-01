/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>ACBLIB</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the collection of components needed for an IMS ACB (Application Control Block).
 * 
 * An IMS application will use one or more PSBs. For an application to be compiled successfully, all of the PSBs and all of the DBDs referenced by those PSBs must be collected into an ACBLIB.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.ACBLIB#getPsb <em>Psb</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.ACBLIB#getDbd <em>Dbd</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getACBLIB()
 * @model
 * @generated
 */
public interface ACBLIB extends orgomg.cwm.objectmodel.core.Package {

    /**
     * Returns the value of the '<em><b>Psb</b></em>' reference list. The list
     * contents are of type {@link orgomg.cwmx.resource.imsdatabase.PSB}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.PSB#getAcblib <em>Acblib</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The PSBs used in this ACBLIB. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Psb</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getACBLIB_Psb()
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getAcblib
     * @model opposite="acblib"
     * @generated
     */
    EList<PSB> getPsb();

    /**
     * Returns the value of the '<em><b>Dbd</b></em>' reference list. The list
     * contents are of type {@link orgomg.cwmx.resource.imsdatabase.DBD}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.DBD#getAcblib <em>Acblib</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The DBDs used in the ACBLIB. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dbd</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getACBLIB_Dbd()
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getAcblib
     * @model opposite="acblib"
     * @generated
     */
    EList<DBD> getDbd();

} // ACBLIB
