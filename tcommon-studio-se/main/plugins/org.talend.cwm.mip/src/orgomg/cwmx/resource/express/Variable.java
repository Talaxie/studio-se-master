/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import orgomg.cwm.resource.multidimensional.DimensionedObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Variable</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents a physical Express variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.Variable#getStorageType <em>Storage Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.Variable#getPageSpace <em>Page Space</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.Variable#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends DimensionedObject {

    /**
     * Returns the value of the '<em><b>Storage Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * type of storage to use for the Variable. The valid values are: TEMP,
     * INPLACE, PERMANENT. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Storage Type</em>' attribute.
     * @see #setStorageType(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getVariable_StorageType()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getStorageType();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.Variable#getStorageType <em>Storage Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Storage Type</em>' attribute.
     * @see #getStorageType()
     * @generated
     */
    void setStorageType(String value);

    /**
     * Returns the value of the '<em><b>Page Space</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * specified, this defines the type of page space in which data associated
     * with the Variable will be stored:
     * 
     * OWNSPACE specifies that the data will be stored in private page space
     * associated with the Variable. SHAREDSPACE specifies that the data will be
     * stored in the database?s global page space. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Page Space</em>' attribute.
     * @see #setPageSpace(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getVariable_PageSpace()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getPageSpace();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.Variable#getPageSpace <em>Page Space</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Page Space</em>' attribute.
     * @see #getPageSpace()
     * @generated
     */
    void setPageSpace(String value);

    /**
     * Returns the value of the '<em><b>Width</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * specified, this defines a fixed width, in bytes, for the storage area for
     * each value of a Variable. Fixed widths can be specified only for
     * dimensioned TEXT and INTEGER Variables. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Width</em>' attribute.
     * @see #setWidth(long)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getVariable_Width()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getWidth();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.Variable#getWidth <em>Width</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Width</em>' attribute.
     * @see #getWidth()
     * @generated
     */
    void setWidth(long value);

} // Variable
