/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Renames</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Renames instances define alternate identifiers for one or more contiguous COBOLField instances. Although they are not truly COBOL fields, Renames must be ordered in a record along with true COBOL fields. Because they are ObjectModel Features, they can be ordered among COBOL fields via the ClassifierFeature association.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.Renames#getFirstField <em>First Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.Renames#getThruField <em>Thru Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getRenames()
 * @model
 * @generated
 */
public interface Renames extends COBOLItem {

    /**
     * Returns the value of the '<em><b>First Field</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.COBOLField#getFirstRenames <em>First Renames</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the COBOLField instance that is the first renamed field.
     * <!-- end-model-doc -->
     * @return the value of the '<em>First Field</em>' reference.
     * @see #setFirstField(COBOLField)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getRenames_FirstField()
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getFirstRenames
     * @model opposite="firstRenames" required="true"
     * @generated
     */
    COBOLField getFirstField();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.Renames#getFirstField <em>First Field</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>First Field</em>' reference.
     * @see #getFirstField()
     * @generated
     */
    void setFirstField(COBOLField value);

    /**
     * Returns the value of the '<em><b>Thru Field</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.COBOLField#getThruRenames <em>Thru Renames</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the COBOLField instance that is the last field in a range of renamed fields.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Thru Field</em>' reference.
     * @see #setThruField(COBOLField)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getRenames_ThruField()
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getThruRenames
     * @model opposite="thruRenames"
     * @generated
     */
    COBOLField getThruField();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.Renames#getThruField <em>Thru Field</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Thru Field</em>' reference.
     * @see #getThruField()
     * @generated
     */
    void setThruField(COBOLField value);

} // Renames
