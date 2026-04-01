/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.core.Expression;
import orgomg.cwm.objectmodel.core.StructuralFeature;
import orgomg.cwm.resource.record.impl.RecordDefImpl;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.dmsii.Remap;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Remap</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapImpl#isIsRequiredAll <em>Is Required All</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapImpl#isIsReadOnlyAll <em>Is Read Only All</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapImpl#isIsGivingException <em>Is Giving Exception</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapImpl#getSelectCondition <em>Select Condition</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapImpl#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemapImpl extends RecordDefImpl implements Remap {

    /**
     * The default value of the '{@link #isIsRequiredAll() <em>Is Required All</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsRequiredAll()
     * @generated
     * @ordered
     */
    protected static final boolean IS_REQUIRED_ALL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsRequiredAll() <em>Is Required All</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsRequiredAll()
     * @generated
     * @ordered
     */
    protected boolean isRequiredAll = IS_REQUIRED_ALL_EDEFAULT;

    /**
     * The default value of the '{@link #isIsReadOnlyAll() <em>Is Read Only All</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsReadOnlyAll()
     * @generated
     * @ordered
     */
    protected static final boolean IS_READ_ONLY_ALL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsReadOnlyAll() <em>Is Read Only All</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsReadOnlyAll()
     * @generated
     * @ordered
     */
    protected boolean isReadOnlyAll = IS_READ_ONLY_ALL_EDEFAULT;

    /**
     * The default value of the '{@link #isIsGivingException() <em>Is Giving Exception</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsGivingException()
     * @generated
     * @ordered
     */
    protected static final boolean IS_GIVING_EXCEPTION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsGivingException() <em>Is Giving Exception</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsGivingException()
     * @generated
     * @ordered
     */
    protected boolean isGivingException = IS_GIVING_EXCEPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getSelectCondition() <em>Select Condition</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getSelectCondition()
     * @generated
     * @ordered
     */
    protected Expression selectCondition;

    /**
     * The cached value of the '{@link #getStructure() <em>Structure</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStructure()
     * @generated
     * @ordered
     */
    protected StructuralFeature structure;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected RemapImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmsiiPackage.Literals.REMAP;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsRequiredAll() {
        return isRequiredAll;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsRequiredAll(boolean newIsRequiredAll) {
        boolean oldIsRequiredAll = isRequiredAll;
        isRequiredAll = newIsRequiredAll;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP__IS_REQUIRED_ALL, oldIsRequiredAll,
                    isRequiredAll));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsReadOnlyAll() {
        return isReadOnlyAll;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsReadOnlyAll(boolean newIsReadOnlyAll) {
        boolean oldIsReadOnlyAll = isReadOnlyAll;
        isReadOnlyAll = newIsReadOnlyAll;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP__IS_READ_ONLY_ALL, oldIsReadOnlyAll,
                    isReadOnlyAll));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsGivingException() {
        return isGivingException;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsGivingException(boolean newIsGivingException) {
        boolean oldIsGivingException = isGivingException;
        isGivingException = newIsGivingException;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP__IS_GIVING_EXCEPTION, oldIsGivingException,
                    isGivingException));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Expression getSelectCondition() {
        return selectCondition;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSelectCondition(Expression newSelectCondition, NotificationChain msgs) {
        Expression oldSelectCondition = selectCondition;
        selectCondition = newSelectCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP__SELECT_CONDITION,
                    oldSelectCondition, newSelectCondition);
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
    public void setSelectCondition(Expression newSelectCondition) {
        if (newSelectCondition != selectCondition) {
            NotificationChain msgs = null;
            if (selectCondition != null)
                msgs = ((InternalEObject) selectCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - DmsiiPackage.REMAP__SELECT_CONDITION, null, msgs);
            if (newSelectCondition != null)
                msgs = ((InternalEObject) newSelectCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - DmsiiPackage.REMAP__SELECT_CONDITION, null, msgs);
            msgs = basicSetSelectCondition(newSelectCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP__SELECT_CONDITION, newSelectCondition,
                    newSelectCondition));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public StructuralFeature getStructure() {
        if (structure != null && structure.eIsProxy()) {
            InternalEObject oldStructure = (InternalEObject) structure;
            structure = (StructuralFeature) eResolveProxy(oldStructure);
            if (structure != oldStructure) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmsiiPackage.REMAP__STRUCTURE, oldStructure,
                            structure));
            }
        }
        return structure;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public StructuralFeature basicGetStructure() {
        return structure;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStructure(StructuralFeature newStructure, NotificationChain msgs) {
        StructuralFeature oldStructure = structure;
        structure = newStructure;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP__STRUCTURE,
                    oldStructure, newStructure);
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
    public void setStructure(StructuralFeature newStructure) {
        if (newStructure != structure) {
            NotificationChain msgs = null;
            if (structure != null)
                msgs = ((InternalEObject) structure).eInverseRemove(this, CorePackage.STRUCTURAL_FEATURE__REMAP,
                        StructuralFeature.class, msgs);
            if (newStructure != null)
                msgs = ((InternalEObject) newStructure).eInverseAdd(this, CorePackage.STRUCTURAL_FEATURE__REMAP,
                        StructuralFeature.class, msgs);
            msgs = basicSetStructure(newStructure, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP__STRUCTURE, newStructure, newStructure));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmsiiPackage.REMAP__STRUCTURE:
            if (structure != null)
                msgs = ((InternalEObject) structure).eInverseRemove(this, CorePackage.STRUCTURAL_FEATURE__REMAP,
                        StructuralFeature.class, msgs);
            return basicSetStructure((StructuralFeature) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmsiiPackage.REMAP__SELECT_CONDITION:
            return basicSetSelectCondition(null, msgs);
        case DmsiiPackage.REMAP__STRUCTURE:
            return basicSetStructure(null, msgs);
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
        case DmsiiPackage.REMAP__IS_REQUIRED_ALL:
            return isIsRequiredAll();
        case DmsiiPackage.REMAP__IS_READ_ONLY_ALL:
            return isIsReadOnlyAll();
        case DmsiiPackage.REMAP__IS_GIVING_EXCEPTION:
            return isIsGivingException();
        case DmsiiPackage.REMAP__SELECT_CONDITION:
            return getSelectCondition();
        case DmsiiPackage.REMAP__STRUCTURE:
            if (resolve)
                return getStructure();
            return basicGetStructure();
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
        case DmsiiPackage.REMAP__IS_REQUIRED_ALL:
            setIsRequiredAll((Boolean) newValue);
            return;
        case DmsiiPackage.REMAP__IS_READ_ONLY_ALL:
            setIsReadOnlyAll((Boolean) newValue);
            return;
        case DmsiiPackage.REMAP__IS_GIVING_EXCEPTION:
            setIsGivingException((Boolean) newValue);
            return;
        case DmsiiPackage.REMAP__SELECT_CONDITION:
            setSelectCondition((Expression) newValue);
            return;
        case DmsiiPackage.REMAP__STRUCTURE:
            setStructure((StructuralFeature) newValue);
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
        case DmsiiPackage.REMAP__IS_REQUIRED_ALL:
            setIsRequiredAll(IS_REQUIRED_ALL_EDEFAULT);
            return;
        case DmsiiPackage.REMAP__IS_READ_ONLY_ALL:
            setIsReadOnlyAll(IS_READ_ONLY_ALL_EDEFAULT);
            return;
        case DmsiiPackage.REMAP__IS_GIVING_EXCEPTION:
            setIsGivingException(IS_GIVING_EXCEPTION_EDEFAULT);
            return;
        case DmsiiPackage.REMAP__SELECT_CONDITION:
            setSelectCondition((Expression) null);
            return;
        case DmsiiPackage.REMAP__STRUCTURE:
            setStructure((StructuralFeature) null);
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
        case DmsiiPackage.REMAP__IS_REQUIRED_ALL:
            return isRequiredAll != IS_REQUIRED_ALL_EDEFAULT;
        case DmsiiPackage.REMAP__IS_READ_ONLY_ALL:
            return isReadOnlyAll != IS_READ_ONLY_ALL_EDEFAULT;
        case DmsiiPackage.REMAP__IS_GIVING_EXCEPTION:
            return isGivingException != IS_GIVING_EXCEPTION_EDEFAULT;
        case DmsiiPackage.REMAP__SELECT_CONDITION:
            return selectCondition != null;
        case DmsiiPackage.REMAP__STRUCTURE:
            return structure != null;
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
        result.append(" (isRequiredAll: ");
        result.append(isRequiredAll);
        result.append(", isReadOnlyAll: ");
        result.append(isReadOnlyAll);
        result.append(", isGivingException: ");
        result.append(isGivingException);
        result.append(')');
        return result.toString();
    }

} // RemapImpl
