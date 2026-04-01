/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isKey <em>Key</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getLength <em>Length</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getOriginalDbColumnName <em>Original Db Column Name</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getType <em>Type</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getRelatedEntity <em>Related Entity</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getOriginalLength <em>Original Length</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getAdditionalField <em>Additional Field</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isUsefulColumn <em>Useful Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType()
 * @model extendedMetaData="name='Column_._type' kind='elementOnly'"
 * @generated
 */
public interface ColumnType extends EObject {
    /**
     * Returns the value of the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Comment</em>' attribute.
     * @see #setComment(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_Comment()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
     * @generated
     */
    String getComment();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @see #getComment()
     * @generated
     */
    void setComment(String value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_DefaultValue()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='defaultValue' namespace='##targetNamespace'"
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

    /**
     * Returns the value of the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key</em>' attribute.
     * @see #isSetKey()
     * @see #unsetKey()
     * @see #setKey(boolean)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_Key()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='key' namespace='##targetNamespace'"
     * @generated
     */
    boolean isKey();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isKey <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' attribute.
     * @see #isSetKey()
     * @see #unsetKey()
     * @see #isKey()
     * @generated
     */
    void setKey(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isKey <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKey()
     * @see #isKey()
     * @see #setKey(boolean)
     * @generated
     */
    void unsetKey();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isKey <em>Key</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Key</em>' attribute is set.
     * @see #unsetKey()
     * @see #isKey()
     * @see #setKey(boolean)
     * @generated
     */
    boolean isSetKey();

    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #isSetLength()
     * @see #unsetLength()
     * @see #setLength(int)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_Length()
     * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='length' namespace='##targetNamespace'"
     * @generated
     */
    int getLength();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #isSetLength()
     * @see #unsetLength()
     * @see #getLength()
     * @generated
     */
    void setLength(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLength()
     * @see #getLength()
     * @see #setLength(int)
     * @generated
     */
    void unsetLength();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getLength <em>Length</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Length</em>' attribute is set.
     * @see #unsetLength()
     * @see #getLength()
     * @see #setLength(int)
     * @generated
     */
    boolean isSetLength();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nullable</em>' attribute.
     * @see #isSetNullable()
     * @see #unsetNullable()
     * @see #setNullable(boolean)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_Nullable()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='nullable' namespace='##targetNamespace'"
     * @generated
     */
    boolean isNullable();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isNullable <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nullable</em>' attribute.
     * @see #isSetNullable()
     * @see #unsetNullable()
     * @see #isNullable()
     * @generated
     */
    void setNullable(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isNullable <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNullable()
     * @see #isNullable()
     * @see #setNullable(boolean)
     * @generated
     */
    void unsetNullable();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isNullable <em>Nullable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nullable</em>' attribute is set.
     * @see #unsetNullable()
     * @see #isNullable()
     * @see #setNullable(boolean)
     * @generated
     */
    boolean isSetNullable();

    /**
     * Returns the value of the '<em><b>Original Db Column Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Original Db Column Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Original Db Column Name</em>' attribute.
     * @see #setOriginalDbColumnName(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_OriginalDbColumnName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='originalDbColumnName' namespace='##targetNamespace'"
     * @generated
     */
    String getOriginalDbColumnName();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getOriginalDbColumnName <em>Original Db Column Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Original Db Column Name</em>' attribute.
     * @see #getOriginalDbColumnName()
     * @generated
     */
    void setOriginalDbColumnName(String value);

    /**
     * Returns the value of the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pattern</em>' attribute.
     * @see #setPattern(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_Pattern()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='pattern' namespace='##targetNamespace'"
     * @generated
     */
    String getPattern();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getPattern <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pattern</em>' attribute.
     * @see #getPattern()
     * @generated
     */
    void setPattern(String value);

    /**
     * Returns the value of the '<em><b>Precision</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Precision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Precision</em>' attribute.
     * @see #isSetPrecision()
     * @see #unsetPrecision()
     * @see #setPrecision(int)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_Precision()
     * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='precision' namespace='##targetNamespace'"
     * @generated
     */
    int getPrecision();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getPrecision <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Precision</em>' attribute.
     * @see #isSetPrecision()
     * @see #unsetPrecision()
     * @see #getPrecision()
     * @generated
     */
    void setPrecision(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getPrecision <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrecision()
     * @see #getPrecision()
     * @see #setPrecision(int)
     * @generated
     */
    void unsetPrecision();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getPrecision <em>Precision</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Precision</em>' attribute is set.
     * @see #unsetPrecision()
     * @see #getPrecision()
     * @see #setPrecision(int)
     * @generated
     */
    boolean isSetPrecision();

    /**
     * Returns the value of the '<em><b>Source Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Type</em>' attribute.
     * @see #setSourceType(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_SourceType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='sourceType' namespace='##targetNamespace'"
     * @generated
     */
    String getSourceType();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getSourceType <em>Source Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Type</em>' attribute.
     * @see #getSourceType()
     * @generated
     */
    void setSourceType(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Related Entity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Related Entity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Related Entity</em>' attribute.
     * @see #setRelatedEntity(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_RelatedEntity()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='relatedEntity' namespace='##targetNamespace'"
     * @generated
     */
    String getRelatedEntity();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getRelatedEntity <em>Related Entity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Related Entity</em>' attribute.
     * @see #getRelatedEntity()
     * @generated
     */
    void setRelatedEntity(String value);

    /**
     * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relationship Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relationship Type</em>' attribute.
     * @see #setRelationshipType(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_RelationshipType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='relationshipType' namespace='##targetNamespace'"
     * @generated
     */
    String getRelationshipType();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getRelationshipType <em>Relationship Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relationship Type</em>' attribute.
     * @see #getRelationshipType()
     * @generated
     */
    void setRelationshipType(String value);

    /**
     * Returns the value of the '<em><b>Original Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Original Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Original Length</em>' attribute.
     * @see #setOriginalLength(int)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_OriginalLength()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
     * @generated
     */
    int getOriginalLength();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#getOriginalLength <em>Original Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Original Length</em>' attribute.
     * @see #getOriginalLength()
     * @generated
     */
    void setOriginalLength(int value);

    /**
     * Returns the value of the '<em><b>Additional Field</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Additional Field</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Additional Field</em>' map.
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_AdditionalField()
     * @model mapType="org.talend.designer.core.model.utils.emf.talendfile.AdditionalFieldMap" keyType="java.lang.String" valueType="java.lang.String"
     * @generated
     */
    EMap getAdditionalField();

    /**
     * Returns the value of the '<em><b>Useful Column</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Useful Column</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Useful Column</em>' attribute.
     * @see #isSetUsefulColumn()
     * @see #unsetUsefulColumn()
     * @see #setUsefulColumn(boolean)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getColumnType_UsefulColumn()
     * @model default="true" unsettable="true"
     * @generated
     */
    boolean isUsefulColumn();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isUsefulColumn <em>Useful Column</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Useful Column</em>' attribute.
     * @see #isSetUsefulColumn()
     * @see #unsetUsefulColumn()
     * @see #isUsefulColumn()
     * @generated
     */
    void setUsefulColumn(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isUsefulColumn <em>Useful Column</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsefulColumn()
     * @see #isUsefulColumn()
     * @see #setUsefulColumn(boolean)
     * @generated
     */
    void unsetUsefulColumn();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ColumnType#isUsefulColumn <em>Useful Column</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Useful Column</em>' attribute is set.
     * @see #unsetUsefulColumn()
     * @see #isUsefulColumn()
     * @see #setUsefulColumn(boolean)
     * @generated
     */
    boolean isSetUsefulColumn();

} // ColumnType