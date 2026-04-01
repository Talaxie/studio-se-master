/**
 */
package org.talend.core.model.metadata.builder.connection.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.talend.core.model.metadata.builder.connection.BigQueryConnection;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Big Query Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.BigQueryConnectionImpl#getServiceAccountCredentialsFile <em>Service Account Credentials File</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.BigQueryConnectionImpl#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.BigQueryConnectionImpl#isUseRegionEndpoint <em>Use Region Endpoint</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.BigQueryConnectionImpl#getRegionEndpoint <em>Region Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BigQueryConnectionImpl extends ConnectionImpl implements BigQueryConnection {

    /**
     * The default value of the '{@link #getServiceAccountCredentialsFile() <em>Service Account Credentials File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceAccountCredentialsFile()
     * @generated
     * @ordered
     */
    protected static final String SERVICE_ACCOUNT_CREDENTIALS_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceAccountCredentialsFile() <em>Service Account Credentials File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceAccountCredentialsFile()
     * @generated
     * @ordered
     */
    protected String serviceAccountCredentialsFile = SERVICE_ACCOUNT_CREDENTIALS_FILE_EDEFAULT;

    /**
     * The default value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProjectId()
     * @generated
     * @ordered
     */
    protected static final String PROJECT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProjectId()
     * @generated
     * @ordered
     */
    protected String projectId = PROJECT_ID_EDEFAULT;

    /**
     * The default value of the '{@link #isUseRegionEndpoint() <em>Use Region Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseRegionEndpoint()
     * @generated
     * @ordered
     */
    protected static final boolean USE_REGION_ENDPOINT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUseRegionEndpoint() <em>Use Region Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseRegionEndpoint()
     * @generated
     * @ordered
     */
    protected boolean useRegionEndpoint = USE_REGION_ENDPOINT_EDEFAULT;

    /**
     * The default value of the '{@link #getRegionEndpoint() <em>Region Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegionEndpoint()
     * @generated
     * @ordered
     */
    protected static final String REGION_ENDPOINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRegionEndpoint() <em>Region Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegionEndpoint()
     * @generated
     * @ordered
     */
    protected String regionEndpoint = REGION_ENDPOINT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BigQueryConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConnectionPackage.Literals.BIG_QUERY_CONNECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getServiceAccountCredentialsFile() {
        return serviceAccountCredentialsFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServiceAccountCredentialsFile(String newServiceAccountCredentialsFile) {
        String oldServiceAccountCredentialsFile = serviceAccountCredentialsFile;
        serviceAccountCredentialsFile = newServiceAccountCredentialsFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    ConnectionPackage.BIG_QUERY_CONNECTION__SERVICE_ACCOUNT_CREDENTIALS_FILE, oldServiceAccountCredentialsFile,
                    serviceAccountCredentialsFile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProjectId(String newProjectId) {
        String oldProjectId = projectId;
        projectId = newProjectId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.BIG_QUERY_CONNECTION__PROJECT_ID,
                    oldProjectId, projectId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUseRegionEndpoint() {
        return useRegionEndpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseRegionEndpoint(boolean newUseRegionEndpoint) {
        boolean oldUseRegionEndpoint = useRegionEndpoint;
        useRegionEndpoint = newUseRegionEndpoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.BIG_QUERY_CONNECTION__USE_REGION_ENDPOINT,
                    oldUseRegionEndpoint, useRegionEndpoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRegionEndpoint() {
        return regionEndpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRegionEndpoint(String newRegionEndpoint) {
        String oldRegionEndpoint = regionEndpoint;
        regionEndpoint = newRegionEndpoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.BIG_QUERY_CONNECTION__REGION_ENDPOINT,
                    oldRegionEndpoint, regionEndpoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ConnectionPackage.BIG_QUERY_CONNECTION__SERVICE_ACCOUNT_CREDENTIALS_FILE:
            return getServiceAccountCredentialsFile();
        case ConnectionPackage.BIG_QUERY_CONNECTION__PROJECT_ID:
            return getProjectId();
        case ConnectionPackage.BIG_QUERY_CONNECTION__USE_REGION_ENDPOINT:
            return isUseRegionEndpoint();
        case ConnectionPackage.BIG_QUERY_CONNECTION__REGION_ENDPOINT:
            return getRegionEndpoint();
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
        case ConnectionPackage.BIG_QUERY_CONNECTION__SERVICE_ACCOUNT_CREDENTIALS_FILE:
            setServiceAccountCredentialsFile((String) newValue);
            return;
        case ConnectionPackage.BIG_QUERY_CONNECTION__PROJECT_ID:
            setProjectId((String) newValue);
            return;
        case ConnectionPackage.BIG_QUERY_CONNECTION__USE_REGION_ENDPOINT:
            setUseRegionEndpoint((Boolean) newValue);
            return;
        case ConnectionPackage.BIG_QUERY_CONNECTION__REGION_ENDPOINT:
            setRegionEndpoint((String) newValue);
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
        case ConnectionPackage.BIG_QUERY_CONNECTION__SERVICE_ACCOUNT_CREDENTIALS_FILE:
            setServiceAccountCredentialsFile(SERVICE_ACCOUNT_CREDENTIALS_FILE_EDEFAULT);
            return;
        case ConnectionPackage.BIG_QUERY_CONNECTION__PROJECT_ID:
            setProjectId(PROJECT_ID_EDEFAULT);
            return;
        case ConnectionPackage.BIG_QUERY_CONNECTION__USE_REGION_ENDPOINT:
            setUseRegionEndpoint(USE_REGION_ENDPOINT_EDEFAULT);
            return;
        case ConnectionPackage.BIG_QUERY_CONNECTION__REGION_ENDPOINT:
            setRegionEndpoint(REGION_ENDPOINT_EDEFAULT);
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
        case ConnectionPackage.BIG_QUERY_CONNECTION__SERVICE_ACCOUNT_CREDENTIALS_FILE:
            return SERVICE_ACCOUNT_CREDENTIALS_FILE_EDEFAULT == null ? serviceAccountCredentialsFile != null
                    : !SERVICE_ACCOUNT_CREDENTIALS_FILE_EDEFAULT.equals(serviceAccountCredentialsFile);
        case ConnectionPackage.BIG_QUERY_CONNECTION__PROJECT_ID:
            return PROJECT_ID_EDEFAULT == null ? projectId != null : !PROJECT_ID_EDEFAULT.equals(projectId);
        case ConnectionPackage.BIG_QUERY_CONNECTION__USE_REGION_ENDPOINT:
            return useRegionEndpoint != USE_REGION_ENDPOINT_EDEFAULT;
        case ConnectionPackage.BIG_QUERY_CONNECTION__REGION_ENDPOINT:
            return REGION_ENDPOINT_EDEFAULT == null ? regionEndpoint != null : !REGION_ENDPOINT_EDEFAULT.equals(regionEndpoint);
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
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (ServiceAccountCredentialsFile: ");
        result.append(serviceAccountCredentialsFile);
        result.append(", ProjectId: ");
        result.append(projectId);
        result.append(", UseRegionEndpoint: ");
        result.append(useRegionEndpoint);
        result.append(", RegionEndpoint: ");
        result.append(regionEndpoint);
        result.append(')');
        return result.toString();
    }

} //BigQueryConnectionImpl
