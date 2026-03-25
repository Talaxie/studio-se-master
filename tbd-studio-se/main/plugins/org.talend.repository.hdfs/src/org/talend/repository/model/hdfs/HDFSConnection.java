/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.hdfs;

import org.talend.repository.model.hadoopcluster.HadoopSubConnection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#getDfVersion <em>Df Version</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#getDfDrivers <em>Df Drivers</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#getNameNodeURI <em>Name Node URI</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#isEnableKerberos <em>Enable Kerberos</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#getGroup <em>Group</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#getRowSeparator <em>Row Separator</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#getFieldSeparator <em>Field Separator</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#isUseHeader <em>Use Header</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#getHeaderValue <em>Header Value</em>}</li>
 *   <li>{@link org.talend.repository.model.hdfs.HDFSConnection#isFirstLineCaption <em>First Line Caption</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection()
 * @model
 * @generated
 */
public interface HDFSConnection extends HadoopSubConnection {
    /**
     * Returns the value of the '<em><b>Distribution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Distribution</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distribution</em>' attribute.
     * @see #setDistribution(String)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_Distribution()
     * @model
     * @generated
     */
    String getDistribution();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#getDistribution <em>Distribution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distribution</em>' attribute.
     * @see #getDistribution()
     * @generated
     */
    void setDistribution(String value);

    /**
     * Returns the value of the '<em><b>Df Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Df Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Df Version</em>' attribute.
     * @see #setDfVersion(String)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_DfVersion()
     * @model
     * @generated
     */
    String getDfVersion();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#getDfVersion <em>Df Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Df Version</em>' attribute.
     * @see #getDfVersion()
     * @generated
     */
    void setDfVersion(String value);

    /**
     * Returns the value of the '<em><b>Df Drivers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Df Drivers</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Df Drivers</em>' attribute.
     * @see #setDfDrivers(String)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_DfDrivers()
     * @model
     * @generated
     */
    String getDfDrivers();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#getDfDrivers <em>Df Drivers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Df Drivers</em>' attribute.
     * @see #getDfDrivers()
     * @generated
     */
    void setDfDrivers(String value);

    /**
     * Returns the value of the '<em><b>Name Node URI</b></em>' attribute.
     * The default value is <code>"hdfs://localhost:9000/"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name Node URI</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name Node URI</em>' attribute.
     * @see #setNameNodeURI(String)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_NameNodeURI()
     * @model default="hdfs://localhost:9000/"
     * @generated
     */
    String getNameNodeURI();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#getNameNodeURI <em>Name Node URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name Node URI</em>' attribute.
     * @see #getNameNodeURI()
     * @generated
     */
    void setNameNodeURI(String value);

    /**
     * Returns the value of the '<em><b>Enable Kerberos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enable Kerberos</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enable Kerberos</em>' attribute.
     * @see #setEnableKerberos(boolean)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_EnableKerberos()
     * @model
     * @generated
     */
    boolean isEnableKerberos();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#isEnableKerberos <em>Enable Kerberos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enable Kerberos</em>' attribute.
     * @see #isEnableKerberos()
     * @generated
     */
    void setEnableKerberos(boolean value);

    /**
     * Returns the value of the '<em><b>Principal</b></em>' attribute.
     * The default value is <code>"nn/_HOST@EXAMPLE.COM"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Principal</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Principal</em>' attribute.
     * @see #setPrincipal(String)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_Principal()
     * @model default="nn/_HOST@EXAMPLE.COM"
     * @generated
     */
    String getPrincipal();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#getPrincipal <em>Principal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Principal</em>' attribute.
     * @see #getPrincipal()
     * @generated
     */
    void setPrincipal(String value);

    /**
     * Returns the value of the '<em><b>User Name</b></em>' attribute.
     * The default value is <code>"anonymous"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Name</em>' attribute.
     * @see #setUserName(String)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_UserName()
     * @model default="anonymous"
     * @generated
     */
    String getUserName();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#getUserName <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User Name</em>' attribute.
     * @see #getUserName()
     * @generated
     */
    void setUserName(String value);

    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute.
     * @see #setGroup(String)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_Group()
     * @model
     * @generated
     */
    String getGroup();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#getGroup <em>Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group</em>' attribute.
     * @see #getGroup()
     * @generated
     */
    void setGroup(String value);

    /**
     * Returns the value of the '<em><b>Row Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Row Separator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Row Separator</em>' attribute.
     * @see #setRowSeparator(String)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_RowSeparator()
     * @model
     * @generated
     */
    String getRowSeparator();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#getRowSeparator <em>Row Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Row Separator</em>' attribute.
     * @see #getRowSeparator()
     * @generated
     */
    void setRowSeparator(String value);

    /**
     * Returns the value of the '<em><b>Field Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Field Separator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Field Separator</em>' attribute.
     * @see #setFieldSeparator(String)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_FieldSeparator()
     * @model
     * @generated
     */
    String getFieldSeparator();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#getFieldSeparator <em>Field Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Field Separator</em>' attribute.
     * @see #getFieldSeparator()
     * @generated
     */
    void setFieldSeparator(String value);

    /**
     * Returns the value of the '<em><b>Use Header</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Header</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Header</em>' attribute.
     * @see #setUseHeader(boolean)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_UseHeader()
     * @model
     * @generated
     */
    boolean isUseHeader();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#isUseHeader <em>Use Header</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Header</em>' attribute.
     * @see #isUseHeader()
     * @generated
     */
    void setUseHeader(boolean value);

    /**
     * Returns the value of the '<em><b>Header Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Header Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Header Value</em>' attribute.
     * @see #setHeaderValue(String)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_HeaderValue()
     * @model
     * @generated
     */
    String getHeaderValue();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#getHeaderValue <em>Header Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Header Value</em>' attribute.
     * @see #getHeaderValue()
     * @generated
     */
    void setHeaderValue(String value);

    /**
     * Returns the value of the '<em><b>First Line Caption</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>First Line Caption</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>First Line Caption</em>' attribute.
     * @see #setFirstLineCaption(boolean)
     * @see org.talend.repository.model.hdfs.HDFSPackage#getHDFSConnection_FirstLineCaption()
     * @model
     * @generated
     */
    boolean isFirstLineCaption();

    /**
     * Sets the value of the '{@link org.talend.repository.model.hdfs.HDFSConnection#isFirstLineCaption <em>First Line Caption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>First Line Caption</em>' attribute.
     * @see #isFirstLineCaption()
     * @generated
     */
    void setFirstLineCaption(boolean value);

} // HDFSConnection
