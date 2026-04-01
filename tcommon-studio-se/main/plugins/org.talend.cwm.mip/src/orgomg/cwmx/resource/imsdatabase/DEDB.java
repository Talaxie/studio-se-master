/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DEDB</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of this object class represents a DBD user object that has access=DEDB. A DEDB DBD is a Fast Path DBD designed for very fast transactions. It must have a randomizing module name to be valid. STAGE and XCI (Extended Call Interface) were new parameters added with IMS 5.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DEDB#getRmName <em>Rm Name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DEDB#getStage <em>Stage</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DEDB#isExtendedCall <em>Extended Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDEDB()
 * @model
 * @generated
 */
public interface DEDB extends AccessMethod {

    /**
     * Returns the value of the '<em><b>Rm Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute is the name of the executable module used to randomize the
     * database. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Rm Name</em>' attribute.
     * @see #setRmName(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDEDB_RmName()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getRmName();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.DEDB#getRmName <em>Rm Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Rm Name</em>' attribute.
     * @see #getRmName()
     * @generated
     */
    void setRmName(String value);

    /**
     * Returns the value of the '<em><b>Stage</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether or not the randomizer is a 1 or 2 stage
     * process (default is 1). <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Stage</em>' attribute.
     * @see #setStage(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDEDB_Stage()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getStage();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.DEDB#getStage <em>Stage</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Stage</em>' attribute.
     * @see #getStage()
     * @generated
     */
    void setStage(long value);

    /**
     * Returns the value of the '<em><b>Extended Call</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether or not the ramdomizer should use the extended
     * call interface. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Extended Call</em>' attribute.
     * @see #setExtendedCall(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDEDB_ExtendedCall()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isExtendedCall();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.DEDB#isExtendedCall <em>Extended Call</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Extended Call</em>' attribute.
     * @see #isExtendedCall()
     * @generated
     */
    void setExtendedCall(boolean value);

} // DEDB
