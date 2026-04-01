/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.designer.business.model.business.BusinessAssignment;
import org.talend.designer.business.model.business.BusinessPackage;
import org.talend.designer.business.model.business.Repository;
import org.talend.designer.business.model.business.TalendItem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Talaxie Item</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.designer.business.model.business.impl.TalendItemImpl#getId <em>Id</em>}</li>
 * <li>{@link org.talend.designer.business.model.business.impl.TalendItemImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class TalendItemImpl extends EObjectImpl implements TalendItem {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public static final String copyright = ""; //$NON-NLS-1$

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLabel()
     * @generated NOT
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAuthor()
     * @generated NOT
     * @ordered
     */
    protected static final String AUTHOR_EDEFAULT = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected String author = AUTHOR_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getComment()
     * @generated NOT
     * @ordered
     */
    protected static final String COMMENT_EDEFAULT = ""; //$NON-NLS-1$

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
     * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getAssignments()
     * @generated
     * @ordered
     */
    protected EList assignments;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected TalendItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return BusinessPackage.Literals.TALEND_ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.TALEND_ITEM__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.TALEND_ITEM__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAuthor(String newAuthor) {
        String oldAuthor = author;
        author = newAuthor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.TALEND_ITEM__AUTHOR, oldAuthor, author));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.TALEND_ITEM__VERSION, oldVersion, version));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.TALEND_ITEM__COMMENT, oldComment, comment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getAssignments() {
        if (assignments == null) {
            assignments = new EObjectWithInverseResolvingEList(BusinessAssignment.class, this, BusinessPackage.TALEND_ITEM__ASSIGNMENTS, BusinessPackage.BUSINESS_ASSIGNMENT__TALEND_ITEM);
        }
        return assignments;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Repository getRepository() {
        if (eContainerFeatureID() != BusinessPackage.TALEND_ITEM__REPOSITORY) return null;
        return (Repository)eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newRepository, BusinessPackage.TALEND_ITEM__REPOSITORY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public void setRepository(Repository newRepository) {
        if (newRepository != eInternalContainer() || (eContainerFeatureID != BusinessPackage.TALEND_ITEM__REPOSITORY && newRepository != null)) {
            if (EcoreUtil.isAncestor(this, newRepository))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newRepository != null)
                msgs = ((InternalEObject)newRepository).eInverseAdd(this, BusinessPackage.REPOSITORY__TALENDITEMS, Repository.class, msgs);
            msgs = basicSetRepository(newRepository, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.TALEND_ITEM__REPOSITORY, newRepository, newRepository));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.TALEND_ITEM__ASSIGNMENTS:
                return ((InternalEList)getAssignments()).basicAdd(otherEnd, msgs);
            case BusinessPackage.TALEND_ITEM__REPOSITORY:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetRepository((Repository)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.TALEND_ITEM__ASSIGNMENTS:
                return ((InternalEList)getAssignments()).basicRemove(otherEnd, msgs);
            case BusinessPackage.TALEND_ITEM__REPOSITORY:
                return basicSetRepository(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case BusinessPackage.TALEND_ITEM__REPOSITORY:
                return eInternalContainer().eInverseRemove(this, BusinessPackage.REPOSITORY__TALENDITEMS, Repository.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessPackage.TALEND_ITEM__ID:
                return getId();
            case BusinessPackage.TALEND_ITEM__LABEL:
                return getLabel();
            case BusinessPackage.TALEND_ITEM__AUTHOR:
                return getAuthor();
            case BusinessPackage.TALEND_ITEM__VERSION:
                return getVersion();
            case BusinessPackage.TALEND_ITEM__COMMENT:
                return getComment();
            case BusinessPackage.TALEND_ITEM__ASSIGNMENTS:
                return getAssignments();
            case BusinessPackage.TALEND_ITEM__REPOSITORY:
                return getRepository();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BusinessPackage.TALEND_ITEM__ID:
                setId((String)newValue);
                return;
            case BusinessPackage.TALEND_ITEM__LABEL:
                setLabel((String)newValue);
                return;
            case BusinessPackage.TALEND_ITEM__AUTHOR:
                setAuthor((String)newValue);
                return;
            case BusinessPackage.TALEND_ITEM__VERSION:
                setVersion((String)newValue);
                return;
            case BusinessPackage.TALEND_ITEM__COMMENT:
                setComment((String)newValue);
                return;
            case BusinessPackage.TALEND_ITEM__ASSIGNMENTS:
                getAssignments().clear();
                getAssignments().addAll((Collection)newValue);
                return;
            case BusinessPackage.TALEND_ITEM__REPOSITORY:
                setRepository((Repository)newValue);
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
            case BusinessPackage.TALEND_ITEM__ID:
                setId(ID_EDEFAULT);
                return;
            case BusinessPackage.TALEND_ITEM__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case BusinessPackage.TALEND_ITEM__AUTHOR:
                setAuthor(AUTHOR_EDEFAULT);
                return;
            case BusinessPackage.TALEND_ITEM__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case BusinessPackage.TALEND_ITEM__COMMENT:
                setComment(COMMENT_EDEFAULT);
                return;
            case BusinessPackage.TALEND_ITEM__ASSIGNMENTS:
                getAssignments().clear();
                return;
            case BusinessPackage.TALEND_ITEM__REPOSITORY:
                setRepository((Repository)null);
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
            case BusinessPackage.TALEND_ITEM__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case BusinessPackage.TALEND_ITEM__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case BusinessPackage.TALEND_ITEM__AUTHOR:
                return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
            case BusinessPackage.TALEND_ITEM__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
            case BusinessPackage.TALEND_ITEM__COMMENT:
                return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
            case BusinessPackage.TALEND_ITEM__ASSIGNMENTS:
                return assignments != null && !assignments.isEmpty();
            case BusinessPackage.TALEND_ITEM__REPOSITORY:
                return getRepository() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (id: "); //$NON-NLS-1$
        result.append(id);
        result.append(", label: "); //$NON-NLS-1$
        result.append(label);
        result.append(", author: "); //$NON-NLS-1$
        result.append(author);
        result.append(", version: "); //$NON-NLS-1$
        result.append(version);
        result.append(", comment: "); //$NON-NLS-1$
        result.append(comment);
        result.append(')');
        return result.toString();
    }

} // TalendItemImpl
