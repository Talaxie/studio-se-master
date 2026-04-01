/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dashboard Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getDialect <em>Dialect</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getHost <em>Host</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getPort <em>Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getUsername <em>Username</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getPassword <em>Password</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getLogTable <em>Log Table</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getStatTable <em>Stat Table</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getFlowMeterTable <em>Flow Meter Table</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getAdditionnalsParams <em>Additionnals Params</em>}</li>
 *   <li>{@link org.talend.core.model.properties.DashboardConnection#getDatasource <em>Datasource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection()
 * @model
 * @generated
 */
public interface DashboardConnection extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Dialect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dialect</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dialect</em>' attribute.
     * @see #setDialect(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_Dialect()
     * @model
     * @generated
     */
    String getDialect();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getDialect <em>Dialect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dialect</em>' attribute.
     * @see #getDialect()
     * @generated
     */
    void setDialect(String value);

    /**
     * Returns the value of the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host</em>' attribute.
     * @see #setHost(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_Host()
     * @model
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getHost <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host</em>' attribute.
     * @see #getHost()
     * @generated
     */
    void setHost(String value);

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_Port()
     * @model
     * @generated
     */
    String getPort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort(String value);

    /**
     * Returns the value of the '<em><b>Database</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Database</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Database</em>' attribute.
     * @see #setDatabase(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_Database()
     * @model
     * @generated
     */
    String getDatabase();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getDatabase <em>Database</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Database</em>' attribute.
     * @see #getDatabase()
     * @generated
     */
    void setDatabase(String value);

    /**
     * Returns the value of the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Username</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Username</em>' attribute.
     * @see #setUsername(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_Username()
     * @model
     * @generated
     */
    String getUsername();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getUsername <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Username</em>' attribute.
     * @see #getUsername()
     * @generated
     */
    void setUsername(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_Password()
     * @model
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Log Table</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Log Table</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Log Table</em>' attribute.
     * @see #setLogTable(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_LogTable()
     * @model
     * @generated
     */
    String getLogTable();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getLogTable <em>Log Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Table</em>' attribute.
     * @see #getLogTable()
     * @generated
     */
    void setLogTable(String value);

    /**
     * Returns the value of the '<em><b>Stat Table</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stat Table</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stat Table</em>' attribute.
     * @see #setStatTable(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_StatTable()
     * @model
     * @generated
     */
    String getStatTable();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getStatTable <em>Stat Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stat Table</em>' attribute.
     * @see #getStatTable()
     * @generated
     */
    void setStatTable(String value);

    /**
     * Returns the value of the '<em><b>Flow Meter Table</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Meter Table</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Meter Table</em>' attribute.
     * @see #setFlowMeterTable(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_FlowMeterTable()
     * @model
     * @generated
     */
    String getFlowMeterTable();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getFlowMeterTable <em>Flow Meter Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flow Meter Table</em>' attribute.
     * @see #getFlowMeterTable()
     * @generated
     */
    void setFlowMeterTable(String value);

    /**
     * Returns the value of the '<em><b>Additionnals Params</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Additionnals Params</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Additionnals Params</em>' attribute.
     * @see #setAdditionnalsParams(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_AdditionnalsParams()
     * @model
     * @generated
     */
    String getAdditionnalsParams();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getAdditionnalsParams <em>Additionnals Params</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Additionnals Params</em>' attribute.
     * @see #getAdditionnalsParams()
     * @generated
     */
    void setAdditionnalsParams(String value);

    /**
     * Returns the value of the '<em><b>Datasource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Datasource</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Datasource</em>' attribute.
     * @see #setDatasource(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getDashboardConnection_Datasource()
     * @model
     * @generated
     */
    String getDatasource();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.DashboardConnection#getDatasource <em>Datasource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Datasource</em>' attribute.
     * @see #getDatasource()
     * @generated
     */
    void setDatasource(String value);

} // DashboardConnection
