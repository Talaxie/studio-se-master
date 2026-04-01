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
import orgomg.cwm.objectmodel.core.BooleanExpression;
import orgomg.cwm.resource.record.impl.RecordDefImpl;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.dmsii.VariableFormatPart;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Format Part</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.VariableFormatPartImpl#getVfLabel <em>Vf Label</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.VariableFormatPartImpl#getSelectCondition <em>Select Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableFormatPartImpl extends RecordDefImpl implements VariableFormatPart {

    /**
     * The default value of the '{@link #getVfLabel() <em>Vf Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getVfLabel()
     * @generated
     * @ordered
     */
    protected static final long VF_LABEL_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getVfLabel() <em>Vf Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getVfLabel()
     * @generated
     * @ordered
     */
    protected long vfLabel = VF_LABEL_EDEFAULT;

    /**
     * The cached value of the '{@link #getSelectCondition() <em>Select Condition</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getSelectCondition()
     * @generated
     * @ordered
     */
    protected BooleanExpression selectCondition;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected VariableFormatPartImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmsiiPackage.Literals.VARIABLE_FORMAT_PART;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getVfLabel() {
        return vfLabel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setVfLabel(long newVfLabel) {
        long oldVfLabel = vfLabel;
        vfLabel = newVfLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.VARIABLE_FORMAT_PART__VF_LABEL, oldVfLabel,
                    vfLabel));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BooleanExpression getSelectCondition() {
        return selectCondition;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSelectCondition(BooleanExpression newSelectCondition, NotificationChain msgs) {
        BooleanExpression oldSelectCondition = selectCondition;
        selectCondition = newSelectCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DmsiiPackage.VARIABLE_FORMAT_PART__SELECT_CONDITION, oldSelectCondition, newSelectCondition);
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
    public void setSelectCondition(BooleanExpression newSelectCondition) {
        if (newSelectCondition != selectCondition) {
            NotificationChain msgs = null;
            if (selectCondition != null)
                msgs = ((InternalEObject) selectCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - DmsiiPackage.VARIABLE_FORMAT_PART__SELECT_CONDITION, null, msgs);
            if (newSelectCondition != null)
                msgs = ((InternalEObject) newSelectCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - DmsiiPackage.VARIABLE_FORMAT_PART__SELECT_CONDITION, null, msgs);
            msgs = basicSetSelectCondition(newSelectCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.VARIABLE_FORMAT_PART__SELECT_CONDITION,
                    newSelectCondition, newSelectCondition));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmsiiPackage.VARIABLE_FORMAT_PART__SELECT_CONDITION:
            return basicSetSelectCondition(null, msgs);
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
        case DmsiiPackage.VARIABLE_FORMAT_PART__VF_LABEL:
            return getVfLabel();
        case DmsiiPackage.VARIABLE_FORMAT_PART__SELECT_CONDITION:
            return getSelectCondition();
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
        case DmsiiPackage.VARIABLE_FORMAT_PART__VF_LABEL:
            setVfLabel((Long) newValue);
            return;
        case DmsiiPackage.VARIABLE_FORMAT_PART__SELECT_CONDITION:
            setSelectCondition((BooleanExpression) newValue);
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
        case DmsiiPackage.VARIABLE_FORMAT_PART__VF_LABEL:
            setVfLabel(VF_LABEL_EDEFAULT);
            return;
        case DmsiiPackage.VARIABLE_FORMAT_PART__SELECT_CONDITION:
            setSelectCondition((BooleanExpression) null);
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
        case DmsiiPackage.VARIABLE_FORMAT_PART__VF_LABEL:
            return vfLabel != VF_LABEL_EDEFAULT;
        case DmsiiPackage.VARIABLE_FORMAT_PART__SELECT_CONDITION:
            return selectCondition != null;
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
        result.append(" (vfLabel: ");
        result.append(vfLabel);
        result.append(')');
        return result.toString();
    }

} // VariableFormatPartImpl
