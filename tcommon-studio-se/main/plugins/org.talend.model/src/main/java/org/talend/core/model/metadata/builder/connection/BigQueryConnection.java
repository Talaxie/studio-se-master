/**
 */
package org.talend.core.model.metadata.builder.connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Big Query Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.BigQueryConnection#getServiceAccountCredentialsFile <em>Service Account Credentials File</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.BigQueryConnection#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.BigQueryConnection#isUseRegionEndpoint <em>Use Region Endpoint</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.BigQueryConnection#getRegionEndpoint <em>Region Endpoint</em>}</li>
 * </ul>
 *
 * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getBigQueryConnection()
 * @model
 * @generated
 */
public interface BigQueryConnection extends Connection {

    /**
     * Returns the value of the '<em><b>Service Account Credentials File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Account Credentials File</em>' attribute.
     * @see #setServiceAccountCredentialsFile(String)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getBigQueryConnection_ServiceAccountCredentialsFile()
     * @model
     * @generated
     */
    String getServiceAccountCredentialsFile();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.BigQueryConnection#getServiceAccountCredentialsFile <em>Service Account Credentials File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Account Credentials File</em>' attribute.
     * @see #getServiceAccountCredentialsFile()
     * @generated
     */
    void setServiceAccountCredentialsFile(String value);

    /**
     * Returns the value of the '<em><b>Project Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Project Id</em>' attribute.
     * @see #setProjectId(String)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getBigQueryConnection_ProjectId()
     * @model
     * @generated
     */
    String getProjectId();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.BigQueryConnection#getProjectId <em>Project Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Project Id</em>' attribute.
     * @see #getProjectId()
     * @generated
     */
    void setProjectId(String value);

    /**
     * Returns the value of the '<em><b>Use Region Endpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Region Endpoint</em>' attribute.
     * @see #setUseRegionEndpoint(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getBigQueryConnection_UseRegionEndpoint()
     * @model
     * @generated
     */
    boolean isUseRegionEndpoint();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.BigQueryConnection#isUseRegionEndpoint <em>Use Region Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Region Endpoint</em>' attribute.
     * @see #isUseRegionEndpoint()
     * @generated
     */
    void setUseRegionEndpoint(boolean value);

    /**
     * Returns the value of the '<em><b>Region Endpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Region Endpoint</em>' attribute.
     * @see #setRegionEndpoint(String)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getBigQueryConnection_RegionEndpoint()
     * @model
     * @generated
     */
    String getRegionEndpoint();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.BigQueryConnection#getRegionEndpoint <em>Region Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Region Endpoint</em>' attribute.
     * @see #getRegionEndpoint()
     * @generated
     */
    void setRegionEndpoint(String value);

} // BigQueryConnection
