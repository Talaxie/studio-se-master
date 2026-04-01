/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Access Method</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of a subtype of this virtual class holds access-method-specific attributes of a DBD user object. DBDs with access methods MSDB, INDEX, HIDAM, DEDB or HDAM will use instances of the subclasses of this object class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.AccessMethod#getDbd <em>Dbd</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getAccessMethod()
 * @model
 * @generated
 */
public interface AccessMethod extends ModelElement {

    /**
     * Returns the value of the '<em><b>Dbd</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.DBD#getAccessMethod <em>Access Method</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * DBD extended by this access method instance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dbd</em>' container reference.
     * @see #setDbd(DBD)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getAccessMethod_Dbd()
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getAccessMethod
     * @model opposite="accessMethod" required="true"
     * @generated
     */
    DBD getDbd();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.AccessMethod#getDbd <em>Dbd</em>}' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Dbd</em>' container reference.
     * @see #getDbd()
     * @generated
     */
    void setDbd(DBD value);

} // AccessMethod
