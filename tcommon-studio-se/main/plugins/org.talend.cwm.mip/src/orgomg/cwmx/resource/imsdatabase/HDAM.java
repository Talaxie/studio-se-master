/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>HDAM</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of this object class represents a DBD user object that has access=HDAM. These attributes are part of the randomizing module information that a valid HDAM DBD must have. HDAM is a full-function DBD with indexing and logical relationships.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.HDAM#getRmName <em>Rm Name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.HDAM#getRelativeBlockNumber <em>Relative Block Number</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.HDAM#getRootAnchorPoints <em>Root Anchor Points</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.HDAM#getRootMaxBytes <em>Root Max Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getHDAM()
 * @model
 * @generated
 */
public interface HDAM extends AccessMethod {

    /**
     * Returns the value of the '<em><b>Rm Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute is the name of the executable module used to randomize the
     * database. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Rm Name</em>' attribute.
     * @see #setRmName(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getHDAM_RmName()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getRmName();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.HDAM#getRmName <em>Rm Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Rm Name</em>' attribute.
     * @see #getRmName()
     * @generated
     */
    void setRmName(String value);

    /**
     * Returns the value of the '<em><b>Relative Block Number</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The maximum relative block number that the user
     * wishes to allow a randomizing module to produce for a database. This
     * attributes determines the number of control intervals or blocks in the
     * root-addressable area of a HDAM database. Valid Values: 0 or 1-16777215
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Relative Block Number</em>' attribute.
     * @see #setRelativeBlockNumber(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getHDAM_RelativeBlockNumber()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getRelativeBlockNumber();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.HDAM#getRelativeBlockNumber <em>Relative Block Number</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Relative Block Number</em>' attribute.
     * @see #getRelativeBlockNumber()
     * @generated
     */
    void setRelativeBlockNumber(long value);

    /**
     * Returns the value of the '<em><b>Root Anchor Points</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The number of root anchor points desired in each control interval of
     * block in the root addressable area. Valid Values: 0 or 1-255 <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Root Anchor Points</em>' attribute.
     * @see #setRootAnchorPoints(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getHDAM_RootAnchorPoints()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getRootAnchorPoints();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.HDAM#getRootAnchorPoints <em>Root Anchor Points</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Root Anchor Points</em>' attribute.
     * @see #getRootAnchorPoints()
     * @generated
     */
    void setRootAnchorPoints(long value);

    /**
     * Returns the value of the '<em><b>Root Max Bytes</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * maximum number of bytes of database record that can be stored in the
     * root-addressable area in a series of inserts unbroken by a call to
     * another database record. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Root Max Bytes</em>' attribute.
     * @see #setRootMaxBytes(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getHDAM_RootMaxBytes()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getRootMaxBytes();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.HDAM#getRootMaxBytes <em>Root Max Bytes</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Root Max Bytes</em>' attribute.
     * @see #getRootMaxBytes()
     * @generated
     */
    void setRootMaxBytes(long value);

} // HDAM
