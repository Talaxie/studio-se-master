/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>HIDAM</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of this object class represents a DBD user object with an access method of HIDAM. A HIDAM DBD must have a primary index relationship to be valid. The relationship maps to an LCHILD statement under the root segment that has POINTER=INDX and no associated XDFLD statement. A HIDAM DBD is a full function DBD with indexing and logical relationships.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.HIDAM#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getHIDAM()
 * @model
 * @generated
 */
public interface HIDAM extends AccessMethod {

    /**
     * Returns the value of the '<em><b>Index</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.INDEX#getPrimaryTarget <em>Primary Target</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The primary index for this HIDAM DBD
     * <!-- end-model-doc -->
     * @return the value of the '<em>Index</em>' reference.
     * @see #setIndex(INDEX)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getHIDAM_Index()
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#getPrimaryTarget
     * @model opposite="primaryTarget"
     * @generated
     */
    INDEX getIndex();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.HIDAM#getIndex <em>Index</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Index</em>' reference.
     * @see #getIndex()
     * @generated
     */
    void setIndex(INDEX value);

} // HIDAM
