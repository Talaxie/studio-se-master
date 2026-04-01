/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>File Section</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the File section of a COBOL Data Division.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.FileSection#getCobolFD <em>Cobol FD</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getFileSection()
 * @model
 * @generated
 */
public interface FileSection extends Section {

    /**
     * Returns the value of the '<em><b>Cobol FD</b></em>' containment reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.coboldata.COBOLFD}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getFileSection <em>File Section</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the COBOLFD instances that this FileSection instance contains.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cobol FD</em>' containment reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getFileSection_CobolFD()
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getFileSection
     * @model opposite="fileSection" containment="true"
     * @generated
     */
    EList<COBOLFD> getCobolFD();

} // FileSection
