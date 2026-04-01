/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.analysis.olap.impl.CubeRegionImpl;
import orgomg.cwm.foundation.expressions.ExpressionNode;
import orgomg.cwmx.resource.essbase.EssbasePackage;
import orgomg.cwmx.resource.essbase.Partition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Partition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.essbase.impl.PartitionImpl#isIsSource <em>Is Source</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.impl.PartitionImpl#isIsShared <em>Is Shared</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.impl.PartitionImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PartitionImpl extends CubeRegionImpl implements Partition {

    /**
     * The default value of the '{@link #isIsSource() <em>Is Source</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsSource()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SOURCE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsSource() <em>Is Source</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsSource()
     * @generated
     * @ordered
     */
    protected boolean isSource = IS_SOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #isIsShared() <em>Is Shared</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsShared()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SHARED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsShared() <em>Is Shared</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsShared()
     * @generated
     * @ordered
     */
    protected boolean isShared = IS_SHARED_EDEFAULT;

    /**
     * The cached value of the '{@link #getFormula() <em>Formula</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFormula()
     * @generated
     * @ordered
     */
    protected ExpressionNode formula;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected PartitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EssbasePackage.Literals.PARTITION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsSource() {
        return isSource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsSource(boolean newIsSource) {
        boolean oldIsSource = isSource;
        isSource = newIsSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EssbasePackage.PARTITION__IS_SOURCE, oldIsSource, isSource));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsShared() {
        return isShared;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsShared(boolean newIsShared) {
        boolean oldIsShared = isShared;
        isShared = newIsShared;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EssbasePackage.PARTITION__IS_SHARED, oldIsShared, isShared));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionNode getFormula() {
        return formula;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFormula(ExpressionNode newFormula, NotificationChain msgs) {
        ExpressionNode oldFormula = formula;
        formula = newFormula;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssbasePackage.PARTITION__FORMULA,
                    oldFormula, newFormula);
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
    public void setFormula(ExpressionNode newFormula) {
        if (newFormula != formula) {
            NotificationChain msgs = null;
            if (formula != null)
                msgs = ((InternalEObject) formula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - EssbasePackage.PARTITION__FORMULA, null, msgs);
            if (newFormula != null)
                msgs = ((InternalEObject) newFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - EssbasePackage.PARTITION__FORMULA, null, msgs);
            msgs = basicSetFormula(newFormula, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EssbasePackage.PARTITION__FORMULA, newFormula, newFormula));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case EssbasePackage.PARTITION__FORMULA:
            return basicSetFormula(null, msgs);
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
        case EssbasePackage.PARTITION__IS_SOURCE:
            return isIsSource();
        case EssbasePackage.PARTITION__IS_SHARED:
            return isIsShared();
        case EssbasePackage.PARTITION__FORMULA:
            return getFormula();
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
        case EssbasePackage.PARTITION__IS_SOURCE:
            setIsSource((Boolean) newValue);
            return;
        case EssbasePackage.PARTITION__IS_SHARED:
            setIsShared((Boolean) newValue);
            return;
        case EssbasePackage.PARTITION__FORMULA:
            setFormula((ExpressionNode) newValue);
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
        case EssbasePackage.PARTITION__IS_SOURCE:
            setIsSource(IS_SOURCE_EDEFAULT);
            return;
        case EssbasePackage.PARTITION__IS_SHARED:
            setIsShared(IS_SHARED_EDEFAULT);
            return;
        case EssbasePackage.PARTITION__FORMULA:
            setFormula((ExpressionNode) null);
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
        case EssbasePackage.PARTITION__IS_SOURCE:
            return isSource != IS_SOURCE_EDEFAULT;
        case EssbasePackage.PARTITION__IS_SHARED:
            return isShared != IS_SHARED_EDEFAULT;
        case EssbasePackage.PARTITION__FORMULA:
            return formula != null;
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
        result.append(" (isSource: ");
        result.append(isSource);
        result.append(", isShared: ");
        result.append(isShared);
        result.append(')');
        return result.toString();
    }

} // PartitionImpl
