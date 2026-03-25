/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.services.model.services.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.core.model.metadata.builder.connection.impl.ConnectionImpl;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.impl.AdditionalInfoMapImpl;
import org.talend.repository.services.model.services.ServiceConnection;
import org.talend.repository.services.model.services.ServicePort;
import org.talend.repository.services.model.services.ServicesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.repository.services.model.services.impl.ServiceConnectionImpl#getWSDLPath <em>WSDL Path</em>}</li>
 *   <li>{@link org.talend.repository.services.model.services.impl.ServiceConnectionImpl#getServicePort <em>Service Port</em>}</li>
 *   <li>{@link org.talend.repository.services.model.services.impl.ServiceConnectionImpl#getAdditionalInfo <em>Additional Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceConnectionImpl extends ConnectionImpl implements ServiceConnection {
    /**
     * The default value of the '{@link #getWSDLPath() <em>WSDL Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWSDLPath()
     * @generated
     * @ordered
     */
    protected static final String WSDL_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWSDLPath() <em>WSDL Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWSDLPath()
     * @generated
     * @ordered
     */
    protected String wsdlPath = WSDL_PATH_EDEFAULT;

    /**
     * The cached value of the '{@link #getServicePort() <em>Service Port</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServicePort()
     * @generated
     * @ordered
     */
    protected EList<ServicePort> servicePort;

    /**
     * The cached value of the '{@link #getAdditionalInfo() <em>Additional Info</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdditionalInfo()
     * @generated
     * @ordered
     */
    protected EMap<String, String> additionalInfo;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServicesPackage.Literals.SERVICE_CONNECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWSDLPath() {
        return wsdlPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWSDLPath(String newWSDLPath) {
        String oldWSDLPath = wsdlPath;
        wsdlPath = newWSDLPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE_CONNECTION__WSDL_PATH, oldWSDLPath, wsdlPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ServicePort> getServicePort() {
        if (servicePort == null) {
            servicePort = new EObjectResolvingEList<ServicePort>(ServicePort.class, this, ServicesPackage.SERVICE_CONNECTION__SERVICE_PORT);
        }
        return servicePort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new EcoreEMap<String,String>(PropertiesPackage.Literals.ADDITIONAL_INFO_MAP, AdditionalInfoMapImpl.class, this, ServicesPackage.SERVICE_CONNECTION__ADDITIONAL_INFO);
        }
        return additionalInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ServicesPackage.SERVICE_CONNECTION__ADDITIONAL_INFO:
                return ((InternalEList<?>)getAdditionalInfo()).basicRemove(otherEnd, msgs);
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
            case ServicesPackage.SERVICE_CONNECTION__WSDL_PATH:
                return getWSDLPath();
            case ServicesPackage.SERVICE_CONNECTION__SERVICE_PORT:
                return getServicePort();
            case ServicesPackage.SERVICE_CONNECTION__ADDITIONAL_INFO:
                if (coreType) return getAdditionalInfo();
                else return getAdditionalInfo().map();
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
            case ServicesPackage.SERVICE_CONNECTION__WSDL_PATH:
                setWSDLPath((String)newValue);
                return;
            case ServicesPackage.SERVICE_CONNECTION__SERVICE_PORT:
                getServicePort().clear();
                getServicePort().addAll((Collection<? extends ServicePort>)newValue);
                return;
            case ServicesPackage.SERVICE_CONNECTION__ADDITIONAL_INFO:
                ((EStructuralFeature.Setting)getAdditionalInfo()).set(newValue);
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
            case ServicesPackage.SERVICE_CONNECTION__WSDL_PATH:
                setWSDLPath(WSDL_PATH_EDEFAULT);
                return;
            case ServicesPackage.SERVICE_CONNECTION__SERVICE_PORT:
                getServicePort().clear();
                return;
            case ServicesPackage.SERVICE_CONNECTION__ADDITIONAL_INFO:
                getAdditionalInfo().clear();
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
            case ServicesPackage.SERVICE_CONNECTION__WSDL_PATH:
                return WSDL_PATH_EDEFAULT == null ? wsdlPath != null : !WSDL_PATH_EDEFAULT.equals(wsdlPath);
            case ServicesPackage.SERVICE_CONNECTION__SERVICE_PORT:
                return servicePort != null && !servicePort.isEmpty();
            case ServicesPackage.SERVICE_CONNECTION__ADDITIONAL_INFO:
                return additionalInfo != null && !additionalInfo.isEmpty();
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
        result.append(" (WSDLPath: ");
        result.append(wsdlPath);
        result.append(')');
        return result.toString();
    }

} //ServiceConnectionImpl
