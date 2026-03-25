/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.services.model.services;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.talend.core.model.metadata.builder.connection.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.repository.services.model.services.ServiceConnection#getWSDLPath <em>WSDL Path</em>}</li>
 *   <li>{@link org.talend.repository.services.model.services.ServiceConnection#getServicePort <em>Service Port</em>}</li>
 *   <li>{@link org.talend.repository.services.model.services.ServiceConnection#getAdditionalInfo <em>Additional Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.repository.services.model.services.ServicesPackage#getServiceConnection()
 * @model
 * @generated
 */
public interface ServiceConnection extends Connection {
    /**
     * Returns the value of the '<em><b>WSDL Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WSDL Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WSDL Path</em>' attribute.
     * @see #setWSDLPath(String)
     * @see org.talend.repository.services.model.services.ServicesPackage#getServiceConnection_WSDLPath()
     * @model
     * @generated
     */
    String getWSDLPath();

    /**
     * Sets the value of the '{@link org.talend.repository.services.model.services.ServiceConnection#getWSDLPath <em>WSDL Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>WSDL Path</em>' attribute.
     * @see #getWSDLPath()
     * @generated
     */
    void setWSDLPath(String value);

    /**
     * Returns the value of the '<em><b>Service Port</b></em>' reference list.
     * The list contents are of type {@link org.talend.repository.services.model.services.ServicePort}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Port</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Port</em>' reference list.
     * @see org.talend.repository.services.model.services.ServicesPackage#getServiceConnection_ServicePort()
     * @model
     * @generated
     */
    EList<ServicePort> getServicePort();

    /**
     * Returns the value of the '<em><b>Additional Info</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Additional Info</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Additional Info</em>' map.
     * @see org.talend.repository.services.model.services.ServicesPackage#getServiceConnection_AdditionalInfo()
     * @model mapType="org.talend.core.model.properties.AdditionalInfoMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
     * @generated
     */
    EMap<String, String> getAdditionalInfo();

} // ServiceConnection
