/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.joblet.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl;
import org.talend.designer.joblet.model.JobletNode;
import org.talend.designer.joblet.model.JobletPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.joblet.model.impl.JobletNodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.designer.joblet.model.impl.JobletNodeImpl#isInput <em>Input</em>}</li>
 *   <li>{@link org.talend.designer.joblet.model.impl.JobletNodeImpl#isTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JobletNodeImpl extends NodeTypeImpl implements JobletNode {
    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;
    /**
     * The default value of the '{@link #isInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInput()
     * @generated
     * @ordered
     */
    protected static final boolean INPUT_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInput()
     * @generated
     * @ordered
     */
    protected boolean input = INPUT_EDEFAULT;

    /**
     * The default value of the '{@link #isTrigger() <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTrigger()
     * @generated
     * @ordered
     */
    protected static final boolean TRIGGER_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isTrigger() <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTrigger()
     * @generated
     * @ordered
     */
    protected boolean trigger = TRIGGER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JobletNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JobletPackage.Literals.JOBLET_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JobletPackage.JOBLET_NODE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInput() {
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInput(boolean newInput) {
        boolean oldInput = input;
        input = newInput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JobletPackage.JOBLET_NODE__INPUT, oldInput, input));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTrigger() {
        return trigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrigger(boolean newTrigger) {
        boolean oldTrigger = trigger;
        trigger = newTrigger;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JobletPackage.JOBLET_NODE__TRIGGER, oldTrigger, trigger));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JobletPackage.JOBLET_NODE__DESCRIPTION:
                return getDescription();
            case JobletPackage.JOBLET_NODE__INPUT:
                return isInput() ? Boolean.TRUE : Boolean.FALSE;
            case JobletPackage.JOBLET_NODE__TRIGGER:
                return isTrigger() ? Boolean.TRUE : Boolean.FALSE;
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case JobletPackage.JOBLET_NODE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case JobletPackage.JOBLET_NODE__INPUT:
                setInput(((Boolean)newValue).booleanValue());
                return;
            case JobletPackage.JOBLET_NODE__TRIGGER:
                setTrigger(((Boolean)newValue).booleanValue());
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case JobletPackage.JOBLET_NODE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case JobletPackage.JOBLET_NODE__INPUT:
                setInput(INPUT_EDEFAULT);
                return;
            case JobletPackage.JOBLET_NODE__TRIGGER:
                setTrigger(TRIGGER_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case JobletPackage.JOBLET_NODE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case JobletPackage.JOBLET_NODE__INPUT:
                return input != INPUT_EDEFAULT;
            case JobletPackage.JOBLET_NODE__TRIGGER:
                return trigger != TRIGGER_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (description: ");
        result.append(description);
        result.append(", input: ");
        result.append(input);
        result.append(", trigger: ");
        result.append(trigger);
        result.append(')');
        return result.toString();
    }

} //JobletNodeImpl
