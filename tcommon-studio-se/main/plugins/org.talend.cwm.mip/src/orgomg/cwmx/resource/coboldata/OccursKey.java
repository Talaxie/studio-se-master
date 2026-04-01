/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Occurs Key</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This intersection class identifies the COBOLField instances that are parts of occurs keys and contains attributes relevant to the fields? roles in the occurs key.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.OccursKey#isIsAscending <em>Is Ascending</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyOf <em>Occurs Key Of</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyField <em>Occurs Key Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getOccursKey()
 * @model
 * @generated
 */
public interface OccursKey extends ModelElement {

    /**
     * Returns the value of the '<em><b>Is Ascending</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the COBOLField on the occursKeyField end is maintained in an
     * ascending order in the occurs key. If False, the occursKeyField is
     * maintained in descending order. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Ascending</em>' attribute.
     * @see #setIsAscending(boolean)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getOccursKey_IsAscending()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsAscending();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.OccursKey#isIsAscending <em>Is Ascending</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Ascending</em>' attribute.
     * @see #isIsAscending()
     * @generated
     */
    void setIsAscending(boolean value);

    /**
     * Returns the value of the '<em><b>Occurs Key Of</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursKeyInfo <em>Occurs Key Info</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the COBOLField instance that owns the occurs key.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Occurs Key Of</em>' container reference.
     * @see #setOccursKeyOf(COBOLField)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getOccursKey_OccursKeyOf()
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getOccursKeyInfo
     * @model opposite="occursKeyInfo" required="true"
     * @generated
     */
    COBOLField getOccursKeyOf();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyOf <em>Occurs Key Of</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Occurs Key Of</em>' container reference.
     * @see #getOccursKeyOf()
     * @generated
     */
    void setOccursKeyOf(COBOLField value);

    /**
     * Returns the value of the '<em><b>Occurs Key Field</b></em>' reference. It
     * is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursKeyFieldInfo
     * <em>Occurs Key Field Info</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Identifies the COBOLField
     * instance that participates in this occurs key. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Occurs Key Field</em>' reference.
     * @see #setOccursKeyField(COBOLField)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getOccursKey_OccursKeyField()
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getOccursKeyFieldInfo
     * @model opposite="occursKeyFieldInfo" required="true"
     * @generated
     */
    COBOLField getOccursKeyField();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyField <em>Occurs Key Field</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Occurs Key Field</em>' reference.
     * @see #getOccursKeyField()
     * @generated
     */
    void setOccursKeyField(COBOLField value);

} // OccursKey
