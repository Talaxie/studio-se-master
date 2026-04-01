/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Linage Info</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LinageInfo instances are used to record the individual components of a LINAGE clause for a COBOLFD. A LINAGE clause is used to specify a page layout for a sequential file.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.LinageInfo#getValue <em>Value</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.LinageInfo#getType <em>Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.LinageInfo#getCobolItem <em>Cobol Item</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.LinageInfo#getCobolFD <em>Cobol FD</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getLinageInfo()
 * @model
 * @generated
 */
public interface LinageInfo extends ModelElement {

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the value of the LinageInfo. If the value is empty, the
     * cobolField reference must identify a COBOLField instance that contains
     * the value. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(long)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getLinageInfo_Value()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getValue();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.LinageInfo#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(long value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute. The literals
     * are from the enumeration
     * {@link orgomg.cwmx.resource.coboldata.LinageInfoType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Identifies the COBOLItem instance that contains the linage information.
     * If thisreference is empty, the value attribute must contain the linage
     * information. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Type</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.LinageInfoType
     * @see #setType(LinageInfoType)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getLinageInfo_Type()
     * @model
     * @generated
     */
    LinageInfoType getType();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.LinageInfo#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.LinageInfoType
     * @see #getType()
     * @generated
     */
    void setType(LinageInfoType value);

    /**
     * Returns the value of the '<em><b>Cobol Item</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.COBOLItem#getLinageInfo <em>Linage Info</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the COBOLItem instance to which the LinageInfo instance applies.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cobol Item</em>' reference.
     * @see #setCobolItem(COBOLItem)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getLinageInfo_CobolItem()
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getLinageInfo
     * @model opposite="linageInfo"
     * @generated
     */
    COBOLItem getCobolItem();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.LinageInfo#getCobolItem <em>Cobol Item</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Cobol Item</em>' reference.
     * @see #getCobolItem()
     * @generated
     */
    void setCobolItem(COBOLItem value);

    /**
     * Returns the value of the '<em><b>Cobol FD</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getLinageInfo <em>Linage Info</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the COBOLFD instance that owns this LinageInfo instance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cobol FD</em>' container reference.
     * @see #setCobolFD(COBOLFD)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getLinageInfo_CobolFD()
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getLinageInfo
     * @model opposite="linageInfo" required="true"
     * @generated
     */
    COBOLFD getCobolFD();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.LinageInfo#getCobolFD <em>Cobol FD</em>}' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Cobol FD</em>' container reference.
     * @see #getCobolFD()
     * @generated
     */
    void setCobolFD(COBOLFD value);

} // LinageInfo
