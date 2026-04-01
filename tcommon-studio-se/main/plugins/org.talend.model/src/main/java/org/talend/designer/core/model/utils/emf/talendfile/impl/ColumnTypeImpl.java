/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.talend.designer.core.model.utils.emf.talendfile.ColumnType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Column Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#isKey <em>Key</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getOriginalDbColumnName <em>Original Db Column Name</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getRelatedEntity <em>Related Entity</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getOriginalLength <em>Original Length</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#getAdditionalField <em>Additional Field</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ColumnTypeImpl#isUsefulColumn <em>Useful Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnTypeImpl extends EObjectImpl implements ColumnType {

    /**
     * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected static final String COMMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected String comment = COMMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #isKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isKey()
     * @generated
     * @ordered
     */
    protected static final boolean KEY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isKey()
     * @generated
     * @ordered
     */
    protected boolean key = KEY_EDEFAULT;

    /**
     * This is true if the Key attribute has been set.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean keyESet;

    /**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected static final int LENGTH_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected int length = LENGTH_EDEFAULT;

    /**
     * This is true if the Length attribute has been set.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lengthESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isNullable()
     * @generated
     * @ordered
     */
    protected static final boolean NULLABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isNullable()
     * @generated
     * @ordered
     */
    protected boolean nullable = NULLABLE_EDEFAULT;

    /**
     * This is true if the Nullable attribute has been set.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nullableESet;

    /**
     * The default value of the '{@link #getOriginalDbColumnName() <em>Original Db Column Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOriginalDbColumnName()
     * @generated
     * @ordered
     */
    protected static final String ORIGINAL_DB_COLUMN_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOriginalDbColumnName() <em>Original Db Column Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOriginalDbColumnName()
     * @generated
     * @ordered
     */
    protected String originalDbColumnName = ORIGINAL_DB_COLUMN_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
    protected static final String PATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
    protected String pattern = PATTERN_EDEFAULT;

    /**
     * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected static final int PRECISION_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected int precision = PRECISION_EDEFAULT;

    /**
     * This is true if the Precision attribute has been set.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean precisionESet;

    /**
     * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSourceType()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSourceType()
     * @generated
     * @ordered
     */
    protected String sourceType = SOURCE_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getRelatedEntity() <em>Related Entity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelatedEntity()
     * @generated
     * @ordered
     */
    protected static final String RELATED_ENTITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRelatedEntity() <em>Related Entity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelatedEntity()
     * @generated
     * @ordered
     */
    protected String relatedEntity = RELATED_ENTITY_EDEFAULT;

    /**
     * The default value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelationshipType()
     * @generated
     * @ordered
     */
    protected static final String RELATIONSHIP_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelationshipType()
     * @generated
     * @ordered
     */
    protected String relationshipType = RELATIONSHIP_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getOriginalLength() <em>Original Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalLength()
     * @generated
     * @ordered
     */
    protected static final int ORIGINAL_LENGTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getOriginalLength() <em>Original Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalLength()
     * @generated
     * @ordered
     */
    protected int originalLength = ORIGINAL_LENGTH_EDEFAULT;

    /**
     * The cached value of the '{@link #getAdditionalField() <em>Additional Field</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdditionalField()
     * @generated
     * @ordered
     */
    protected EMap additionalField;

    /**
     * The default value of the '{@link #isUsefulColumn() <em>Useful Column</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUsefulColumn()
     * @generated
     * @ordered
     */
    protected static final boolean USEFUL_COLUMN_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isUsefulColumn() <em>Useful Column</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUsefulColumn()
     * @generated
     * @ordered
     */
    protected boolean usefulColumn = USEFUL_COLUMN_EDEFAULT;

    /**
     * This is true if the Useful Column attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usefulColumnESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ColumnTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return TalendFilePackage.Literals.COLUMN_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setComment(String newComment) {
        String oldComment = comment;
        comment = newComment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__COMMENT, oldComment, comment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultValue(String newDefaultValue) {
        String oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isKey() {
        return key;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setKey(boolean newKey) {
        boolean oldKey = key;
        key = newKey;
        boolean oldKeyESet = keyESet;
        keyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__KEY, oldKey, key, !oldKeyESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void unsetKey() {
        boolean oldKey = key;
        boolean oldKeyESet = keyESet;
        key = KEY_EDEFAULT;
        keyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.COLUMN_TYPE__KEY, oldKey, KEY_EDEFAULT, oldKeyESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetKey() {
        return keyESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLength(int newLength) {
        int oldLength = length;
        length = newLength;
        boolean oldLengthESet = lengthESet;
        lengthESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__LENGTH, oldLength, length, !oldLengthESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void unsetLength() {
        int oldLength = length;
        boolean oldLengthESet = lengthESet;
        length = LENGTH_EDEFAULT;
        lengthESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.COLUMN_TYPE__LENGTH, oldLength, LENGTH_EDEFAULT, oldLengthESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLength() {
        return lengthESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setNullable(boolean newNullable) {
        boolean oldNullable = nullable;
        nullable = newNullable;
        boolean oldNullableESet = nullableESet;
        nullableESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__NULLABLE, oldNullable, nullable, !oldNullableESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void unsetNullable() {
        boolean oldNullable = nullable;
        boolean oldNullableESet = nullableESet;
        nullable = NULLABLE_EDEFAULT;
        nullableESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.COLUMN_TYPE__NULLABLE, oldNullable, NULLABLE_EDEFAULT, oldNullableESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNullable() {
        return nullableESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getOriginalDbColumnName() {
        return originalDbColumnName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOriginalDbColumnName(String newOriginalDbColumnName) {
        String oldOriginalDbColumnName = originalDbColumnName;
        originalDbColumnName = newOriginalDbColumnName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__ORIGINAL_DB_COLUMN_NAME, oldOriginalDbColumnName, originalDbColumnName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPattern(String newPattern) {
        String oldPattern = pattern;
        pattern = newPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__PATTERN, oldPattern, pattern));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPrecision(int newPrecision) {
        int oldPrecision = precision;
        precision = newPrecision;
        boolean oldPrecisionESet = precisionESet;
        precisionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__PRECISION, oldPrecision, precision, !oldPrecisionESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void unsetPrecision() {
        int oldPrecision = precision;
        boolean oldPrecisionESet = precisionESet;
        precision = PRECISION_EDEFAULT;
        precisionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.COLUMN_TYPE__PRECISION, oldPrecision, PRECISION_EDEFAULT, oldPrecisionESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPrecision() {
        return precisionESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSourceType(String newSourceType) {
        String oldSourceType = sourceType;
        sourceType = newSourceType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__SOURCE_TYPE, oldSourceType, sourceType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRelatedEntity() {
        return relatedEntity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRelatedEntity(String newRelatedEntity) {
        String oldRelatedEntity = relatedEntity;
        relatedEntity = newRelatedEntity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__RELATED_ENTITY, oldRelatedEntity, relatedEntity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRelationshipType(String newRelationshipType) {
        String oldRelationshipType = relationshipType;
        relationshipType = newRelationshipType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__RELATIONSHIP_TYPE, oldRelationshipType, relationshipType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getOriginalLength() {
        return originalLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOriginalLength(int newOriginalLength) {
        int oldOriginalLength = originalLength;
        originalLength = newOriginalLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__ORIGINAL_LENGTH, oldOriginalLength, originalLength));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap getAdditionalField() {
        if (additionalField == null) {
            additionalField = new EcoreEMap(TalendFilePackage.Literals.ADDITIONAL_FIELD_MAP, AdditionalFieldMapImpl.class, this, TalendFilePackage.COLUMN_TYPE__ADDITIONAL_FIELD);
        }
        return additionalField;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUsefulColumn() {
        return usefulColumn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsefulColumn(boolean newUsefulColumn) {
        boolean oldUsefulColumn = usefulColumn;
        usefulColumn = newUsefulColumn;
        boolean oldUsefulColumnESet = usefulColumnESet;
        usefulColumnESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.COLUMN_TYPE__USEFUL_COLUMN, oldUsefulColumn, usefulColumn, !oldUsefulColumnESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUsefulColumn() {
        boolean oldUsefulColumn = usefulColumn;
        boolean oldUsefulColumnESet = usefulColumnESet;
        usefulColumn = USEFUL_COLUMN_EDEFAULT;
        usefulColumnESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.COLUMN_TYPE__USEFUL_COLUMN, oldUsefulColumn, USEFUL_COLUMN_EDEFAULT, oldUsefulColumnESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUsefulColumn() {
        return usefulColumnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendFilePackage.COLUMN_TYPE__ADDITIONAL_FIELD:
                return ((InternalEList)getAdditionalField()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TalendFilePackage.COLUMN_TYPE__COMMENT:
                return getComment();
            case TalendFilePackage.COLUMN_TYPE__DEFAULT_VALUE:
                return getDefaultValue();
            case TalendFilePackage.COLUMN_TYPE__KEY:
                return isKey() ? Boolean.TRUE : Boolean.FALSE;
            case TalendFilePackage.COLUMN_TYPE__LENGTH:
                return new Integer(getLength());
            case TalendFilePackage.COLUMN_TYPE__NAME:
                return getName();
            case TalendFilePackage.COLUMN_TYPE__NULLABLE:
                return isNullable() ? Boolean.TRUE : Boolean.FALSE;
            case TalendFilePackage.COLUMN_TYPE__ORIGINAL_DB_COLUMN_NAME:
                return getOriginalDbColumnName();
            case TalendFilePackage.COLUMN_TYPE__PATTERN:
                return getPattern();
            case TalendFilePackage.COLUMN_TYPE__PRECISION:
                return new Integer(getPrecision());
            case TalendFilePackage.COLUMN_TYPE__SOURCE_TYPE:
                return getSourceType();
            case TalendFilePackage.COLUMN_TYPE__TYPE:
                return getType();
            case TalendFilePackage.COLUMN_TYPE__RELATED_ENTITY:
                return getRelatedEntity();
            case TalendFilePackage.COLUMN_TYPE__RELATIONSHIP_TYPE:
                return getRelationshipType();
            case TalendFilePackage.COLUMN_TYPE__ORIGINAL_LENGTH:
                return new Integer(getOriginalLength());
            case TalendFilePackage.COLUMN_TYPE__ADDITIONAL_FIELD:
                if (coreType) return getAdditionalField();
                else return getAdditionalField().map();
            case TalendFilePackage.COLUMN_TYPE__USEFUL_COLUMN:
                return isUsefulColumn() ? Boolean.TRUE : Boolean.FALSE;
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TalendFilePackage.COLUMN_TYPE__COMMENT:
                setComment((String)newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__DEFAULT_VALUE:
                setDefaultValue((String)newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__KEY:
                setKey(((Boolean)newValue).booleanValue());
                return;
            case TalendFilePackage.COLUMN_TYPE__LENGTH:
                setLength(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.COLUMN_TYPE__NAME:
                setName((String)newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__NULLABLE:
                setNullable(((Boolean)newValue).booleanValue());
                return;
            case TalendFilePackage.COLUMN_TYPE__ORIGINAL_DB_COLUMN_NAME:
                setOriginalDbColumnName((String)newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__PATTERN:
                setPattern((String)newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__PRECISION:
                setPrecision(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.COLUMN_TYPE__SOURCE_TYPE:
                setSourceType((String)newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__TYPE:
                setType((String)newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__RELATED_ENTITY:
                setRelatedEntity((String)newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__RELATIONSHIP_TYPE:
                setRelationshipType((String)newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__ORIGINAL_LENGTH:
                setOriginalLength(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.COLUMN_TYPE__ADDITIONAL_FIELD:
                ((EStructuralFeature.Setting)getAdditionalField()).set(newValue);
                return;
            case TalendFilePackage.COLUMN_TYPE__USEFUL_COLUMN:
                setUsefulColumn(((Boolean)newValue).booleanValue());
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case TalendFilePackage.COLUMN_TYPE__COMMENT:
                setComment(COMMENT_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__DEFAULT_VALUE:
                setDefaultValue(DEFAULT_VALUE_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__KEY:
                unsetKey();
                return;
            case TalendFilePackage.COLUMN_TYPE__LENGTH:
                unsetLength();
                return;
            case TalendFilePackage.COLUMN_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__NULLABLE:
                unsetNullable();
                return;
            case TalendFilePackage.COLUMN_TYPE__ORIGINAL_DB_COLUMN_NAME:
                setOriginalDbColumnName(ORIGINAL_DB_COLUMN_NAME_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__PATTERN:
                setPattern(PATTERN_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__PRECISION:
                unsetPrecision();
                return;
            case TalendFilePackage.COLUMN_TYPE__SOURCE_TYPE:
                setSourceType(SOURCE_TYPE_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__RELATED_ENTITY:
                setRelatedEntity(RELATED_ENTITY_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__RELATIONSHIP_TYPE:
                setRelationshipType(RELATIONSHIP_TYPE_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__ORIGINAL_LENGTH:
                setOriginalLength(ORIGINAL_LENGTH_EDEFAULT);
                return;
            case TalendFilePackage.COLUMN_TYPE__ADDITIONAL_FIELD:
                getAdditionalField().clear();
                return;
            case TalendFilePackage.COLUMN_TYPE__USEFUL_COLUMN:
                unsetUsefulColumn();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TalendFilePackage.COLUMN_TYPE__COMMENT:
                return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
            case TalendFilePackage.COLUMN_TYPE__DEFAULT_VALUE:
                return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
            case TalendFilePackage.COLUMN_TYPE__KEY:
                return isSetKey();
            case TalendFilePackage.COLUMN_TYPE__LENGTH:
                return isSetLength();
            case TalendFilePackage.COLUMN_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TalendFilePackage.COLUMN_TYPE__NULLABLE:
                return isSetNullable();
            case TalendFilePackage.COLUMN_TYPE__ORIGINAL_DB_COLUMN_NAME:
                return ORIGINAL_DB_COLUMN_NAME_EDEFAULT == null ? originalDbColumnName != null : !ORIGINAL_DB_COLUMN_NAME_EDEFAULT.equals(originalDbColumnName);
            case TalendFilePackage.COLUMN_TYPE__PATTERN:
                return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
            case TalendFilePackage.COLUMN_TYPE__PRECISION:
                return isSetPrecision();
            case TalendFilePackage.COLUMN_TYPE__SOURCE_TYPE:
                return SOURCE_TYPE_EDEFAULT == null ? sourceType != null : !SOURCE_TYPE_EDEFAULT.equals(sourceType);
            case TalendFilePackage.COLUMN_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case TalendFilePackage.COLUMN_TYPE__RELATED_ENTITY:
                return RELATED_ENTITY_EDEFAULT == null ? relatedEntity != null : !RELATED_ENTITY_EDEFAULT.equals(relatedEntity);
            case TalendFilePackage.COLUMN_TYPE__RELATIONSHIP_TYPE:
                return RELATIONSHIP_TYPE_EDEFAULT == null ? relationshipType != null : !RELATIONSHIP_TYPE_EDEFAULT.equals(relationshipType);
            case TalendFilePackage.COLUMN_TYPE__ORIGINAL_LENGTH:
                return originalLength != ORIGINAL_LENGTH_EDEFAULT;
            case TalendFilePackage.COLUMN_TYPE__ADDITIONAL_FIELD:
                return additionalField != null && !additionalField.isEmpty();
            case TalendFilePackage.COLUMN_TYPE__USEFUL_COLUMN:
                return isSetUsefulColumn();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (comment: ");
        result.append(comment);
        result.append(", defaultValue: ");
        result.append(defaultValue);
        result.append(", key: ");
        if (keyESet) result.append(key); else result.append("<unset>");
        result.append(", length: ");
        if (lengthESet) result.append(length); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(", nullable: ");
        if (nullableESet) result.append(nullable); else result.append("<unset>");
        result.append(", originalDbColumnName: ");
        result.append(originalDbColumnName);
        result.append(", pattern: ");
        result.append(pattern);
        result.append(", precision: ");
        if (precisionESet) result.append(precision); else result.append("<unset>");
        result.append(", sourceType: ");
        result.append(sourceType);
        result.append(", type: ");
        result.append(type);
        result.append(", relatedEntity: ");
        result.append(relatedEntity);
        result.append(", relationshipType: ");
        result.append(relationshipType);
        result.append(", originalLength: ");
        result.append(originalLength);
        result.append(", usefulColumn: ");
        if (usefulColumnESet) result.append(usefulColumn); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} // ColumnTypeImpl
