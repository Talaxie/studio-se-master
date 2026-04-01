/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.impl;

import java.util.Collection;

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
import org.talend.designer.core.model.utils.emf.talendfile.ColumnType;
import org.talend.designer.core.model.utils.emf.talendfile.MetadataType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Metadata Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataTypeImpl extends EObjectImpl implements MetadataType {

    /**
     * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getColumn()
     * @generated
     * @ordered
     */
    protected EList column;

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
     * The default value of the '{@link #getConnector() <em>Connector</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getConnector()
     * @generated
     * @ordered
     */
    protected static final String CONNECTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnector() <em>Connector</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getConnector()
     * @generated
     * @ordered
     */
    protected String connector = CONNECTOR_EDEFAULT;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

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
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected String source = SOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdditionalProperties()
     * @generated
     * @ordered
     */
    protected EMap additionalProperties;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MetadataTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return TalendFilePackage.Literals.METADATA_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getColumn() {
        if (column == null) {
            column = new EObjectContainmentEList(ColumnType.class, this, TalendFilePackage.METADATA_TYPE__COLUMN);
        }
        return column;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.METADATA_TYPE__COMMENT, oldComment, comment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getConnector() {
        return connector;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setConnector(String newConnector) {
        String oldConnector = connector;
        connector = newConnector;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.METADATA_TYPE__CONNECTOR, oldConnector, connector));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.METADATA_TYPE__LABEL, oldLabel, label));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.METADATA_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSource(String newSource) {
        String oldSource = source;
        source = newSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.METADATA_TYPE__SOURCE, oldSource, source));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.METADATA_TYPE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap getAdditionalProperties() {
        if (additionalProperties == null) {
            additionalProperties = new EcoreEMap(TalendFilePackage.Literals.ADDITIONAL_FIELD_MAP, AdditionalFieldMapImpl.class, this, TalendFilePackage.METADATA_TYPE__ADDITIONAL_PROPERTIES);
        }
        return additionalProperties;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendFilePackage.METADATA_TYPE__COLUMN:
                return ((InternalEList)getColumn()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.METADATA_TYPE__ADDITIONAL_PROPERTIES:
                return ((InternalEList)getAdditionalProperties()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TalendFilePackage.METADATA_TYPE__COLUMN:
                return getColumn();
            case TalendFilePackage.METADATA_TYPE__COMMENT:
                return getComment();
            case TalendFilePackage.METADATA_TYPE__CONNECTOR:
                return getConnector();
            case TalendFilePackage.METADATA_TYPE__LABEL:
                return getLabel();
            case TalendFilePackage.METADATA_TYPE__NAME:
                return getName();
            case TalendFilePackage.METADATA_TYPE__SOURCE:
                return getSource();
            case TalendFilePackage.METADATA_TYPE__TYPE:
                return getType();
            case TalendFilePackage.METADATA_TYPE__ADDITIONAL_PROPERTIES:
                if (coreType) return getAdditionalProperties();
                else return getAdditionalProperties().map();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TalendFilePackage.METADATA_TYPE__COLUMN:
                getColumn().clear();
                getColumn().addAll((Collection)newValue);
                return;
            case TalendFilePackage.METADATA_TYPE__COMMENT:
                setComment((String)newValue);
                return;
            case TalendFilePackage.METADATA_TYPE__CONNECTOR:
                setConnector((String)newValue);
                return;
            case TalendFilePackage.METADATA_TYPE__LABEL:
                setLabel((String)newValue);
                return;
            case TalendFilePackage.METADATA_TYPE__NAME:
                setName((String)newValue);
                return;
            case TalendFilePackage.METADATA_TYPE__SOURCE:
                setSource((String)newValue);
                return;
            case TalendFilePackage.METADATA_TYPE__TYPE:
                setType((String)newValue);
                return;
            case TalendFilePackage.METADATA_TYPE__ADDITIONAL_PROPERTIES:
                ((EStructuralFeature.Setting)getAdditionalProperties()).set(newValue);
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
            case TalendFilePackage.METADATA_TYPE__COLUMN:
                getColumn().clear();
                return;
            case TalendFilePackage.METADATA_TYPE__COMMENT:
                setComment(COMMENT_EDEFAULT);
                return;
            case TalendFilePackage.METADATA_TYPE__CONNECTOR:
                setConnector(CONNECTOR_EDEFAULT);
                return;
            case TalendFilePackage.METADATA_TYPE__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case TalendFilePackage.METADATA_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TalendFilePackage.METADATA_TYPE__SOURCE:
                setSource(SOURCE_EDEFAULT);
                return;
            case TalendFilePackage.METADATA_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case TalendFilePackage.METADATA_TYPE__ADDITIONAL_PROPERTIES:
                getAdditionalProperties().clear();
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
            case TalendFilePackage.METADATA_TYPE__COLUMN:
                return column != null && !column.isEmpty();
            case TalendFilePackage.METADATA_TYPE__COMMENT:
                return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
            case TalendFilePackage.METADATA_TYPE__CONNECTOR:
                return CONNECTOR_EDEFAULT == null ? connector != null : !CONNECTOR_EDEFAULT.equals(connector);
            case TalendFilePackage.METADATA_TYPE__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case TalendFilePackage.METADATA_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TalendFilePackage.METADATA_TYPE__SOURCE:
                return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
            case TalendFilePackage.METADATA_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case TalendFilePackage.METADATA_TYPE__ADDITIONAL_PROPERTIES:
                return additionalProperties != null && !additionalProperties.isEmpty();
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
        result.append(", connector: ");
        result.append(connector);
        result.append(", label: ");
        result.append(label);
        result.append(", name: ");
        result.append(name);
        result.append(", source: ");
        result.append(source);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} // MetadataTypeImpl
