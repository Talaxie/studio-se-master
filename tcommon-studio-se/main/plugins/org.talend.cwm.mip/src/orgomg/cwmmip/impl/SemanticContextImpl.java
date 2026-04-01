/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmmip.PatternConstraint;
import orgomg.cwmmip.SemanticContext;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Semantic Context</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmmip.impl.SemanticContextImpl#getElement <em>Element</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.SemanticContextImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.SemanticContextImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.SemanticContextImpl#getAnchorElement <em>Anchor Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SemanticContextImpl extends ProjectionImpl implements SemanticContext {

    /**
     * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getElement()
     * @generated
     * @ordered
     */
    protected static final String ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getElement()
     * @generated
     * @ordered
     */
    protected String element = ELEMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getAssociation() <em>Association</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAssociation()
     * @generated
     * @ordered
     */
    protected static final String ASSOCIATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAssociation() <em>Association</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAssociation()
     * @generated
     * @ordered
     */
    protected String association = ASSOCIATION_EDEFAULT;

    /**
     * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getConstraint()
     * @generated
     * @ordered
     */
    protected PatternConstraint constraint;

    /**
     * The default value of the '{@link #getAnchorElement() <em>Anchor Element</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAnchorElement()
     * @generated
     * @ordered
     */
    protected static final String ANCHOR_ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAnchorElement() <em>Anchor Element</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAnchorElement()
     * @generated
     * @ordered
     */
    protected String anchorElement = ANCHOR_ELEMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SemanticContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CwmmipPackage.Literals.SEMANTIC_CONTEXT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getElement() {
        return element;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setElement(String newElement) {
        String oldElement = element;
        element = newElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.SEMANTIC_CONTEXT__ELEMENT, oldElement, element));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getAssociation() {
        return association;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAssociation(String newAssociation) {
        String oldAssociation = association;
        association = newAssociation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.SEMANTIC_CONTEXT__ASSOCIATION, oldAssociation,
                    association));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PatternConstraint getConstraint() {
        return constraint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConstraint(PatternConstraint newConstraint, NotificationChain msgs) {
        PatternConstraint oldConstraint = constraint;
        constraint = newConstraint;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    CwmmipPackage.SEMANTIC_CONTEXT__CONSTRAINT, oldConstraint, newConstraint);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setConstraint(PatternConstraint newConstraint) {
        if (newConstraint != constraint) {
            NotificationChain msgs = null;
            if (constraint != null)
                msgs = ((InternalEObject) constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - CwmmipPackage.SEMANTIC_CONTEXT__CONSTRAINT, null, msgs);
            if (newConstraint != null)
                msgs = ((InternalEObject) newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - CwmmipPackage.SEMANTIC_CONTEXT__CONSTRAINT, null, msgs);
            msgs = basicSetConstraint(newConstraint, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.SEMANTIC_CONTEXT__CONSTRAINT, newConstraint,
                    newConstraint));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getAnchorElement() {
        return anchorElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAnchorElement(String newAnchorElement) {
        String oldAnchorElement = anchorElement;
        anchorElement = newAnchorElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.SEMANTIC_CONTEXT__ANCHOR_ELEMENT,
                    oldAnchorElement, anchorElement));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CwmmipPackage.SEMANTIC_CONTEXT__CONSTRAINT:
            return basicSetConstraint(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case CwmmipPackage.SEMANTIC_CONTEXT__ELEMENT:
            return getElement();
        case CwmmipPackage.SEMANTIC_CONTEXT__ASSOCIATION:
            return getAssociation();
        case CwmmipPackage.SEMANTIC_CONTEXT__CONSTRAINT:
            return getConstraint();
        case CwmmipPackage.SEMANTIC_CONTEXT__ANCHOR_ELEMENT:
            return getAnchorElement();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case CwmmipPackage.SEMANTIC_CONTEXT__ELEMENT:
            setElement((String) newValue);
            return;
        case CwmmipPackage.SEMANTIC_CONTEXT__ASSOCIATION:
            setAssociation((String) newValue);
            return;
        case CwmmipPackage.SEMANTIC_CONTEXT__CONSTRAINT:
            setConstraint((PatternConstraint) newValue);
            return;
        case CwmmipPackage.SEMANTIC_CONTEXT__ANCHOR_ELEMENT:
            setAnchorElement((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case CwmmipPackage.SEMANTIC_CONTEXT__ELEMENT:
            setElement(ELEMENT_EDEFAULT);
            return;
        case CwmmipPackage.SEMANTIC_CONTEXT__ASSOCIATION:
            setAssociation(ASSOCIATION_EDEFAULT);
            return;
        case CwmmipPackage.SEMANTIC_CONTEXT__CONSTRAINT:
            setConstraint((PatternConstraint) null);
            return;
        case CwmmipPackage.SEMANTIC_CONTEXT__ANCHOR_ELEMENT:
            setAnchorElement(ANCHOR_ELEMENT_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case CwmmipPackage.SEMANTIC_CONTEXT__ELEMENT:
            return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
        case CwmmipPackage.SEMANTIC_CONTEXT__ASSOCIATION:
            return ASSOCIATION_EDEFAULT == null ? association != null : !ASSOCIATION_EDEFAULT.equals(association);
        case CwmmipPackage.SEMANTIC_CONTEXT__CONSTRAINT:
            return constraint != null;
        case CwmmipPackage.SEMANTIC_CONTEXT__ANCHOR_ELEMENT:
            return ANCHOR_ELEMENT_EDEFAULT == null ? anchorElement != null : !ANCHOR_ELEMENT_EDEFAULT.equals(anchorElement);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (element: ");
        result.append(element);
        result.append(", association: ");
        result.append(association);
        result.append(", anchorElement: ");
        result.append(anchorElement);
        result.append(')');
        return result.toString();
    }

} // SemanticContextImpl
