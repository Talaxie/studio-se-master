/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>COBOL Field</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents fields that appear in COBOL record descriptions. COBOLField instances are associated with their owning RecordDef or Group instances via the UML owner/feature association between Feature and Classifier.
 * 
 * The VALUE IS clause for a COBOLField instance is stored in the initialValue attribute inherited from the UML Attribute superclass.
 * 
 * The "occurs-depending" syntax that may be attached to a COBOLField instance is addressed by a collection of attributes (occursLower and occursUpper) and a reference (dependingOnField). To illustrate the roles these attributes and references play, their names can be substituted into the following COBOL syntax fragment: 
 * 
 *     OCCURS occursLower TO occursUpper TIMES DEPENDING ON dependingOnField
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getLevel <em>Level</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getSignKind <em>Sign Kind</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsFiller <em>Is Filler</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsJustifiedRight <em>Is Justified Right</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsBlankWhenZero <em>Is Blank When Zero</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsSynchronized <em>Is Synchronized</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getPicture <em>Picture</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursLower <em>Occurs Lower</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursUpper <em>Occurs Upper</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsGlobal <em>Is Global</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getDependingOnField <em>Depending On Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getRedefinedField <em>Redefined Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getRedefinedByField <em>Redefined By Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursKeyInfo <em>Occurs Key Info</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursKeyFieldInfo <em>Occurs Key Field Info</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getFirstRenames <em>First Renames</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLField#getThruRenames <em>Thru Renames</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField()
 * @model
 * @generated
 */
public interface COBOLField extends COBOLItem {

    /**
     * Returns the value of the '<em><b>Level</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * level number of a COBOLField.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Level</em>' attribute.
     * @see #setLevel(long)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_Level()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getLevel();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLField#getLevel <em>Level</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Level</em>' attribute.
     * @see #getLevel()
     * @generated
     */
    void setLevel(long value);

    /**
     * Returns the value of the '<em><b>Sign Kind</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.coboldata.SignKindType}. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> The type of sign for
     * the field. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Sign Kind</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.SignKindType
     * @see #setSignKind(SignKindType)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_SignKind()
     * @model
     * @generated
     */
    SignKindType getSignKind();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.coboldata.COBOLField#getSignKind
     * <em>Sign Kind</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Sign Kind</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.SignKindType
     * @see #getSignKind()
     * @generated
     */
    void setSignKind(SignKindType value);

    /**
     * Returns the value of the '<em><b>Is Filler</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the field is a filler field. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Filler</em>' attribute.
     * @see #setIsFiller(boolean)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_IsFiller()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsFiller();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.coboldata.COBOLField#isIsFiller
     * <em>Is Filler</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Is Filler</em>' attribute.
     * @see #isIsFiller()
     * @generated
     */
    void setIsFiller(boolean value);

    /**
     * Returns the value of the '<em><b>Is Justified Right</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the content of the field is right justified. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Justified Right</em>' attribute.
     * @see #setIsJustifiedRight(boolean)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_IsJustifiedRight()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsJustifiedRight();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsJustifiedRight <em>Is Justified Right</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Justified Right</em>' attribute.
     * @see #isIsJustifiedRight()
     * @generated
     */
    void setIsJustifiedRight(boolean value);

    /**
     * Returns the value of the '<em><b>Is Blank When Zero</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the field is interpreted as having the numeric value zero when the
     * field contains blanks. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Blank When Zero</em>' attribute.
     * @see #setIsBlankWhenZero(boolean)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_IsBlankWhenZero()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsBlankWhenZero();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsBlankWhenZero <em>Is Blank When Zero</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Blank When Zero</em>' attribute.
     * @see #isIsBlankWhenZero()
     * @generated
     */
    void setIsBlankWhenZero(boolean value);

    /**
     * Returns the value of the '<em><b>Is Synchronized</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the field is synchronized. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Synchronized</em>' attribute.
     * @see #setIsSynchronized(boolean)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_IsSynchronized()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsSynchronized();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsSynchronized <em>Is Synchronized</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Synchronized</em>' attribute.
     * @see #isIsSynchronized()
     * @generated
     */
    void setIsSynchronized(boolean value);

    /**
     * Returns the value of the '<em><b>Picture</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the picture specification for the field. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Picture</em>' attribute.
     * @see #setPicture(String)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_Picture()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getPicture();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.coboldata.COBOLField#getPicture
     * <em>Picture</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Picture</em>' attribute.
     * @see #getPicture()
     * @generated
     */
    void setPicture(String value);

    /**
     * Returns the value of the '<em><b>Occurs Lower</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If the
     * field occurs, contains the lower bound of the number of possible
     * occurrences. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Occurs Lower</em>' attribute.
     * @see #setOccursLower(long)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_OccursLower()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getOccursLower();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursLower <em>Occurs Lower</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Occurs Lower</em>' attribute.
     * @see #getOccursLower()
     * @generated
     */
    void setOccursLower(long value);

    /**
     * Returns the value of the '<em><b>Occurs Upper</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If the
     * field occurs, contains the upper bound of the number of possible
     * occurrences. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Occurs Upper</em>' attribute.
     * @see #setOccursUpper(long)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_OccursUpper()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getOccursUpper();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursUpper <em>Occurs Upper</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Occurs Upper</em>' attribute.
     * @see #getOccursUpper()
     * @generated
     */
    void setOccursUpper(long value);

    /**
     * Returns the value of the '<em><b>Index Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A list
     * of strings that are the names obtained from the INDEXED BY clause. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Index Name</em>' attribute.
     * @see #setIndexName(String)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_IndexName()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getIndexName();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLField#getIndexName <em>Index Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Index Name</em>' attribute.
     * @see #getIndexName()
     * @generated
     */
    void setIndexName(String value);

    /**
     * Returns the value of the '<em><b>Is External</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the field is external. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is External</em>' attribute.
     * @see #setIsExternal(boolean)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_IsExternal()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsExternal();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsExternal <em>Is External</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is External</em>' attribute.
     * @see #isIsExternal()
     * @generated
     */
    void setIsExternal(boolean value);

    /**
     * Returns the value of the '<em><b>Is Global</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the field is global. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Global</em>' attribute.
     * @see #setIsGlobal(boolean)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_IsGlobal()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsGlobal();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.coboldata.COBOLField#isIsGlobal
     * <em>Is Global</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Is Global</em>' attribute.
     * @see #isIsGlobal()
     * @generated
     */
    void setIsGlobal(boolean value);

    /**
     * Returns the value of the '<em><b>Depending On Field</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.COBOLItem#getOccurringField <em>Occurring Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the COBOLField instance that contains the number of occurrences.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Depending On Field</em>' reference.
     * @see #setDependingOnField(COBOLItem)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_DependingOnField()
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getOccurringField
     * @model opposite="occurringField"
     * @generated
     */
    COBOLItem getDependingOnField();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLField#getDependingOnField <em>Depending On Field</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Depending On Field</em>' reference.
     * @see #getDependingOnField()
     * @generated
     */
    void setDependingOnField(COBOLItem value);

    /**
     * Returns the value of the '<em><b>Redefined Field</b></em>' reference. It
     * is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.COBOLField#getRedefinedByField
     * <em>Redefined By Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the COBOLField instance that is
     * redefined. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Redefined Field</em>' reference.
     * @see #setRedefinedField(COBOLField)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_RedefinedField()
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getRedefinedByField
     * @model opposite="redefinedByField"
     * @generated
     */
    COBOLField getRedefinedField();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLField#getRedefinedField <em>Redefined Field</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Redefined Field</em>' reference.
     * @see #getRedefinedField()
     * @generated
     */
    void setRedefinedField(COBOLField value);

    /**
     * Returns the value of the '<em><b>Redefined By Field</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.coboldata.COBOLField}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.COBOLField#getRedefinedField <em>Redefined Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the COBOLField instances that redefine this field.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Redefined By Field</em>' reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_RedefinedByField()
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getRedefinedField
     * @model opposite="redefinedField"
     * @generated
     */
    EList<COBOLField> getRedefinedByField();

    /**
     * Returns the value of the '<em><b>Occurs Key Info</b></em>' containment reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.coboldata.OccursKey}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyOf <em>Occurs Key Of</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the OccursKey instances relevant for this field.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Occurs Key Info</em>' containment reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_OccursKeyInfo()
     * @see orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyOf
     * @model opposite="occursKeyOf" containment="true"
     * @generated
     */
    EList<OccursKey> getOccursKeyInfo();

    /**
     * Returns the value of the '<em><b>Occurs Key Field Info</b></em>'
     * reference list. The list contents are of type
     * {@link orgomg.cwmx.resource.coboldata.OccursKey}. It is bidirectional and
     * its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyField
     * <em>Occurs Key Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the OccursKey instances relevant
     * to this COBOLField instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Occurs Key Field Info</em>' reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_OccursKeyFieldInfo()
     * @see orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyField
     * @model opposite="occursKeyField"
     * @generated
     */
    EList<OccursKey> getOccursKeyFieldInfo();

    /**
     * Returns the value of the '<em><b>First Renames</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.coboldata.Renames}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.Renames#getFirstField <em>First Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the Renames instances in which this COBOLField instance is the first renamed field.
     * <!-- end-model-doc -->
     * @return the value of the '<em>First Renames</em>' reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_FirstRenames()
     * @see orgomg.cwmx.resource.coboldata.Renames#getFirstField
     * @model opposite="firstField"
     * @generated
     */
    EList<Renames> getFirstRenames();

    /**
     * Returns the value of the '<em><b>Thru Renames</b></em>' reference list.
     * The list contents are of type
     * {@link orgomg.cwmx.resource.coboldata.Renames}. It is bidirectional and
     * its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.Renames#getThruField
     * <em>Thru Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the Renames instances in which this
     * COBOLField instance is the last renamed field in a range of renamed
     * fields. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Thru Renames</em>' reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLField_ThruRenames()
     * @see orgomg.cwmx.resource.coboldata.Renames#getThruField
     * @model opposite="thruField"
     * @generated
     */
    EList<Renames> getThruRenames();

} // COBOLField
