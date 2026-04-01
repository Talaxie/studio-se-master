/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.core.model.properties.FileTrigger;
import org.talend.core.model.properties.FileTriggerMask;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerImpl#getFileTriggerMasks <em>File Trigger Masks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileTriggerImpl extends SimpleTalendTriggerImpl implements FileTrigger {
    /**
     * The cached value of the '{@link #getFileTriggerMasks() <em>File Trigger Masks</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileTriggerMasks()
     * @generated
     * @ordered
     */
    protected EList fileTriggerMasks;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FileTriggerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.FILE_TRIGGER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getFileTriggerMasks() {
        if (fileTriggerMasks == null) {
            fileTriggerMasks = new EObjectContainmentEList(FileTriggerMask.class, this, PropertiesPackage.FILE_TRIGGER__FILE_TRIGGER_MASKS);
        }
        return fileTriggerMasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.FILE_TRIGGER__FILE_TRIGGER_MASKS:
                return ((InternalEList)getFileTriggerMasks()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.FILE_TRIGGER__FILE_TRIGGER_MASKS:
                return getFileTriggerMasks();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.FILE_TRIGGER__FILE_TRIGGER_MASKS:
                getFileTriggerMasks().clear();
                getFileTriggerMasks().addAll((Collection)newValue);
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
            case PropertiesPackage.FILE_TRIGGER__FILE_TRIGGER_MASKS:
                getFileTriggerMasks().clear();
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
            case PropertiesPackage.FILE_TRIGGER__FILE_TRIGGER_MASKS:
                return fileTriggerMasks != null && !fileTriggerMasks.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //FileTriggerImpl
