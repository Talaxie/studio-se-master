/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.hdfs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.talend.repository.model.hadoopcluster.impl.HadoopSubConnectionImpl;

import org.talend.repository.model.hdfs.HDFSConnection;
import org.talend.repository.model.hdfs.HDFSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#getDfVersion <em>Df Version</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#getDfDrivers <em>Df Drivers</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#getNameNodeURI <em>Name Node URI</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#isEnableKerberos <em>Enable Kerberos</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#getRowSeparator <em>Row Separator</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#getFieldSeparator <em>Field Separator</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#isUseHeader <em>Use Header</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#getHeaderValue <em>Header Value</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl#isFirstLineCaption <em>First Line Caption</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HDFSConnectionImpl extends HadoopSubConnectionImpl implements HDFSConnection {
    /**
     * The default value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistribution()
     * @generated
     * @ordered
     */
    protected static final String DISTRIBUTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistribution()
     * @generated
     * @ordered
     */
    protected String distribution = DISTRIBUTION_EDEFAULT;

    /**
     * The default value of the '{@link #getDfVersion() <em>Df Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDfVersion()
     * @generated
     * @ordered
     */
    protected static final String DF_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDfVersion() <em>Df Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDfVersion()
     * @generated
     * @ordered
     */
    protected String dfVersion = DF_VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getDfDrivers() <em>Df Drivers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDfDrivers()
     * @generated
     * @ordered
     */
    protected static final String DF_DRIVERS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDfDrivers() <em>Df Drivers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDfDrivers()
     * @generated
     * @ordered
     */
    protected String dfDrivers = DF_DRIVERS_EDEFAULT;

    /**
     * The default value of the '{@link #getNameNodeURI() <em>Name Node URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameNodeURI()
     * @generated
     * @ordered
     */
    protected static final String NAME_NODE_URI_EDEFAULT = "hdfs://localhost:9000/";

    /**
     * The cached value of the '{@link #getNameNodeURI() <em>Name Node URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameNodeURI()
     * @generated
     * @ordered
     */
    protected String nameNodeURI = NAME_NODE_URI_EDEFAULT;

    /**
     * The default value of the '{@link #isEnableKerberos() <em>Enable Kerberos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnableKerberos()
     * @generated
     * @ordered
     */
    protected static final boolean ENABLE_KERBEROS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isEnableKerberos() <em>Enable Kerberos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnableKerberos()
     * @generated
     * @ordered
     */
    protected boolean enableKerberos = ENABLE_KERBEROS_EDEFAULT;

    /**
     * The default value of the '{@link #getPrincipal() <em>Principal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrincipal()
     * @generated
     * @ordered
     */
    protected static final String PRINCIPAL_EDEFAULT = "nn/_HOST@EXAMPLE.COM";

    /**
     * The cached value of the '{@link #getPrincipal() <em>Principal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrincipal()
     * @generated
     * @ordered
     */
    protected String principal = PRINCIPAL_EDEFAULT;

    /**
     * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserName()
     * @generated
     * @ordered
     */
    protected static final String USER_NAME_EDEFAULT = "anonymous";

    /**
     * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserName()
     * @generated
     * @ordered
     */
    protected String userName = USER_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected static final String GROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected String group = GROUP_EDEFAULT;

    /**
     * The default value of the '{@link #getRowSeparator() <em>Row Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRowSeparator()
     * @generated
     * @ordered
     */
    protected static final String ROW_SEPARATOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRowSeparator() <em>Row Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRowSeparator()
     * @generated
     * @ordered
     */
    protected String rowSeparator = ROW_SEPARATOR_EDEFAULT;

    /**
     * The default value of the '{@link #getFieldSeparator() <em>Field Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFieldSeparator()
     * @generated
     * @ordered
     */
    protected static final String FIELD_SEPARATOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFieldSeparator() <em>Field Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFieldSeparator()
     * @generated
     * @ordered
     */
    protected String fieldSeparator = FIELD_SEPARATOR_EDEFAULT;

    /**
     * The default value of the '{@link #isUseHeader() <em>Use Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseHeader()
     * @generated
     * @ordered
     */
    protected static final boolean USE_HEADER_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUseHeader() <em>Use Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseHeader()
     * @generated
     * @ordered
     */
    protected boolean useHeader = USE_HEADER_EDEFAULT;

    /**
     * The default value of the '{@link #getHeaderValue() <em>Header Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeaderValue()
     * @generated
     * @ordered
     */
    protected static final String HEADER_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHeaderValue() <em>Header Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeaderValue()
     * @generated
     * @ordered
     */
    protected String headerValue = HEADER_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #isFirstLineCaption() <em>First Line Caption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFirstLineCaption()
     * @generated
     * @ordered
     */
    protected static final boolean FIRST_LINE_CAPTION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isFirstLineCaption() <em>First Line Caption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFirstLineCaption()
     * @generated
     * @ordered
     */
    protected boolean firstLineCaption = FIRST_LINE_CAPTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HDFSConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HDFSPackage.Literals.HDFS_CONNECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDistribution() {
        return distribution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDistribution(String newDistribution) {
        String oldDistribution = distribution;
        distribution = newDistribution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__DISTRIBUTION, oldDistribution, distribution));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDfVersion() {
        return dfVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDfVersion(String newDfVersion) {
        String oldDfVersion = dfVersion;
        dfVersion = newDfVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__DF_VERSION, oldDfVersion, dfVersion));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDfDrivers() {
        return dfDrivers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDfDrivers(String newDfDrivers) {
        String oldDfDrivers = dfDrivers;
        dfDrivers = newDfDrivers;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__DF_DRIVERS, oldDfDrivers, dfDrivers));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNameNodeURI() {
        return nameNodeURI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNameNodeURI(String newNameNodeURI) {
        String oldNameNodeURI = nameNodeURI;
        nameNodeURI = newNameNodeURI;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__NAME_NODE_URI, oldNameNodeURI, nameNodeURI));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isEnableKerberos() {
        return enableKerberos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnableKerberos(boolean newEnableKerberos) {
        boolean oldEnableKerberos = enableKerberos;
        enableKerberos = newEnableKerberos;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__ENABLE_KERBEROS, oldEnableKerberos, enableKerberos));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrincipal(String newPrincipal) {
        String oldPrincipal = principal;
        principal = newPrincipal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__PRINCIPAL, oldPrincipal, principal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUserName(String newUserName) {
        String oldUserName = userName;
        userName = newUserName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__USER_NAME, oldUserName, userName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getGroup() {
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroup(String newGroup) {
        String oldGroup = group;
        group = newGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__GROUP, oldGroup, group));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRowSeparator() {
        return rowSeparator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRowSeparator(String newRowSeparator) {
        String oldRowSeparator = rowSeparator;
        rowSeparator = newRowSeparator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__ROW_SEPARATOR, oldRowSeparator, rowSeparator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFieldSeparator() {
        return fieldSeparator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFieldSeparator(String newFieldSeparator) {
        String oldFieldSeparator = fieldSeparator;
        fieldSeparator = newFieldSeparator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__FIELD_SEPARATOR, oldFieldSeparator, fieldSeparator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUseHeader() {
        return useHeader;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseHeader(boolean newUseHeader) {
        boolean oldUseHeader = useHeader;
        useHeader = newUseHeader;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__USE_HEADER, oldUseHeader, useHeader));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHeaderValue() {
        return headerValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHeaderValue(String newHeaderValue) {
        String oldHeaderValue = headerValue;
        headerValue = newHeaderValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__HEADER_VALUE, oldHeaderValue, headerValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFirstLineCaption() {
        return firstLineCaption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFirstLineCaption(boolean newFirstLineCaption) {
        boolean oldFirstLineCaption = firstLineCaption;
        firstLineCaption = newFirstLineCaption;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HDFSPackage.HDFS_CONNECTION__FIRST_LINE_CAPTION, oldFirstLineCaption, firstLineCaption));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case HDFSPackage.HDFS_CONNECTION__DISTRIBUTION:
                return getDistribution();
            case HDFSPackage.HDFS_CONNECTION__DF_VERSION:
                return getDfVersion();
            case HDFSPackage.HDFS_CONNECTION__DF_DRIVERS:
                return getDfDrivers();
            case HDFSPackage.HDFS_CONNECTION__NAME_NODE_URI:
                return getNameNodeURI();
            case HDFSPackage.HDFS_CONNECTION__ENABLE_KERBEROS:
                return isEnableKerberos();
            case HDFSPackage.HDFS_CONNECTION__PRINCIPAL:
                return getPrincipal();
            case HDFSPackage.HDFS_CONNECTION__USER_NAME:
                return getUserName();
            case HDFSPackage.HDFS_CONNECTION__GROUP:
                return getGroup();
            case HDFSPackage.HDFS_CONNECTION__ROW_SEPARATOR:
                return getRowSeparator();
            case HDFSPackage.HDFS_CONNECTION__FIELD_SEPARATOR:
                return getFieldSeparator();
            case HDFSPackage.HDFS_CONNECTION__USE_HEADER:
                return isUseHeader();
            case HDFSPackage.HDFS_CONNECTION__HEADER_VALUE:
                return getHeaderValue();
            case HDFSPackage.HDFS_CONNECTION__FIRST_LINE_CAPTION:
                return isFirstLineCaption();
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
            case HDFSPackage.HDFS_CONNECTION__DISTRIBUTION:
                setDistribution((String)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__DF_VERSION:
                setDfVersion((String)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__DF_DRIVERS:
                setDfDrivers((String)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__NAME_NODE_URI:
                setNameNodeURI((String)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__ENABLE_KERBEROS:
                setEnableKerberos((Boolean)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__PRINCIPAL:
                setPrincipal((String)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__USER_NAME:
                setUserName((String)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__GROUP:
                setGroup((String)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__ROW_SEPARATOR:
                setRowSeparator((String)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__FIELD_SEPARATOR:
                setFieldSeparator((String)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__USE_HEADER:
                setUseHeader((Boolean)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__HEADER_VALUE:
                setHeaderValue((String)newValue);
                return;
            case HDFSPackage.HDFS_CONNECTION__FIRST_LINE_CAPTION:
                setFirstLineCaption((Boolean)newValue);
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
            case HDFSPackage.HDFS_CONNECTION__DISTRIBUTION:
                setDistribution(DISTRIBUTION_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__DF_VERSION:
                setDfVersion(DF_VERSION_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__DF_DRIVERS:
                setDfDrivers(DF_DRIVERS_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__NAME_NODE_URI:
                setNameNodeURI(NAME_NODE_URI_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__ENABLE_KERBEROS:
                setEnableKerberos(ENABLE_KERBEROS_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__PRINCIPAL:
                setPrincipal(PRINCIPAL_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__USER_NAME:
                setUserName(USER_NAME_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__GROUP:
                setGroup(GROUP_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__ROW_SEPARATOR:
                setRowSeparator(ROW_SEPARATOR_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__FIELD_SEPARATOR:
                setFieldSeparator(FIELD_SEPARATOR_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__USE_HEADER:
                setUseHeader(USE_HEADER_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__HEADER_VALUE:
                setHeaderValue(HEADER_VALUE_EDEFAULT);
                return;
            case HDFSPackage.HDFS_CONNECTION__FIRST_LINE_CAPTION:
                setFirstLineCaption(FIRST_LINE_CAPTION_EDEFAULT);
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
            case HDFSPackage.HDFS_CONNECTION__DISTRIBUTION:
                return DISTRIBUTION_EDEFAULT == null ? distribution != null : !DISTRIBUTION_EDEFAULT.equals(distribution);
            case HDFSPackage.HDFS_CONNECTION__DF_VERSION:
                return DF_VERSION_EDEFAULT == null ? dfVersion != null : !DF_VERSION_EDEFAULT.equals(dfVersion);
            case HDFSPackage.HDFS_CONNECTION__DF_DRIVERS:
                return DF_DRIVERS_EDEFAULT == null ? dfDrivers != null : !DF_DRIVERS_EDEFAULT.equals(dfDrivers);
            case HDFSPackage.HDFS_CONNECTION__NAME_NODE_URI:
                return NAME_NODE_URI_EDEFAULT == null ? nameNodeURI != null : !NAME_NODE_URI_EDEFAULT.equals(nameNodeURI);
            case HDFSPackage.HDFS_CONNECTION__ENABLE_KERBEROS:
                return enableKerberos != ENABLE_KERBEROS_EDEFAULT;
            case HDFSPackage.HDFS_CONNECTION__PRINCIPAL:
                return PRINCIPAL_EDEFAULT == null ? principal != null : !PRINCIPAL_EDEFAULT.equals(principal);
            case HDFSPackage.HDFS_CONNECTION__USER_NAME:
                return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
            case HDFSPackage.HDFS_CONNECTION__GROUP:
                return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
            case HDFSPackage.HDFS_CONNECTION__ROW_SEPARATOR:
                return ROW_SEPARATOR_EDEFAULT == null ? rowSeparator != null : !ROW_SEPARATOR_EDEFAULT.equals(rowSeparator);
            case HDFSPackage.HDFS_CONNECTION__FIELD_SEPARATOR:
                return FIELD_SEPARATOR_EDEFAULT == null ? fieldSeparator != null : !FIELD_SEPARATOR_EDEFAULT.equals(fieldSeparator);
            case HDFSPackage.HDFS_CONNECTION__USE_HEADER:
                return useHeader != USE_HEADER_EDEFAULT;
            case HDFSPackage.HDFS_CONNECTION__HEADER_VALUE:
                return HEADER_VALUE_EDEFAULT == null ? headerValue != null : !HEADER_VALUE_EDEFAULT.equals(headerValue);
            case HDFSPackage.HDFS_CONNECTION__FIRST_LINE_CAPTION:
                return firstLineCaption != FIRST_LINE_CAPTION_EDEFAULT;
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
        result.append(" (distribution: ");
        result.append(distribution);
        result.append(", dfVersion: ");
        result.append(dfVersion);
        result.append(", dfDrivers: ");
        result.append(dfDrivers);
        result.append(", nameNodeURI: ");
        result.append(nameNodeURI);
        result.append(", enableKerberos: ");
        result.append(enableKerberos);
        result.append(", principal: ");
        result.append(principal);
        result.append(", userName: ");
        result.append(userName);
        result.append(", group: ");
        result.append(group);
        result.append(", rowSeparator: ");
        result.append(rowSeparator);
        result.append(", fieldSeparator: ");
        result.append(fieldSeparator);
        result.append(", useHeader: ");
        result.append(useHeader);
        result.append(", headerValue: ");
        result.append(headerValue);
        result.append(", firstLineCaption: ");
        result.append(firstLineCaption);
        result.append(')');
        return result.toString();
    }

} //HDFSConnectionImpl
