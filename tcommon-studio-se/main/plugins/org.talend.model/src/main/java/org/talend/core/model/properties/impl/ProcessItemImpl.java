/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Process Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.core.model.properties.impl.ProcessItemImpl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ProcessItemImpl extends ItemImpl implements ProcessItem {

    /**
     * The cached value of the '{@link #getProcess() <em>Process</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getProcess()
     * @generated
     * @ordered
     */
    protected ProcessType process;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ProcessItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.PROCESS_ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public synchronized ProcessType getProcess() {
        if (process != null && process.eIsProxy()) {
            InternalEObject oldProcess = (InternalEObject) process;
            process = (ProcessType) eResolveProxy(oldProcess);
            if (process.eResource() == null && eResource() != null) {
                URI uri = EcoreUtil.getURI(process);
                if (uri.hasFragment()) {
                    uri = uri.trimFragment();
                }
                Resource resource = eResource().getResourceSet().getResource(uri, true);
                for (EObject object : resource.getContents()) {
                    if (object instanceof ProcessType) {
                        process = (ProcessType) object;
                        break;
                    }
                }
            }
            if (process != oldProcess) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROCESS_ITEM__PROCESS,
                            oldProcess, process));
                }
            }
        }
        return process;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProcessType basicGetProcess() {
        return process;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setProcess(ProcessType newProcess) {
        ProcessType oldProcess = process;
        process = newProcess;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROCESS_ITEM__PROCESS, oldProcess, process));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case PropertiesPackage.PROCESS_ITEM__PROCESS:
            if (resolve) {
                return getProcess();
            }
            return basicGetProcess();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case PropertiesPackage.PROCESS_ITEM__PROCESS:
            setProcess((ProcessType) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case PropertiesPackage.PROCESS_ITEM__PROCESS:
            setProcess((ProcessType) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case PropertiesPackage.PROCESS_ITEM__PROCESS:
            return process != null;
        }
        return super.eIsSet(featureID);
    }

} // ProcessItemImpl
