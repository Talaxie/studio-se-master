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
 * A representation of the model object '<em><b>Migration Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.MigrationTask#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.MigrationTask#getBreaks <em>Breaks</em>}</li>
 *   <li>{@link org.talend.core.model.properties.MigrationTask#getVersion <em>Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.MigrationTask#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getMigrationTask()
 * @model
 * @generated
 */
public interface MigrationTask extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getMigrationTask_Id()
     * @model required="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.MigrationTask#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Breaks</b></em>' attribute.
     * The default value is <code>"5.1.9"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Breaks</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Breaks</em>' attribute.
     * @see #setBreaks(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getMigrationTask_Breaks()
     * @model default="5.1.9"
     * @generated
     */
    String getBreaks();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.MigrationTask#getBreaks <em>Breaks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Breaks</em>' attribute.
     * @see #getBreaks()
     * @generated
     */
    void setBreaks(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getMigrationTask_Version()
     * @model required="true"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.MigrationTask#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

    /**
     * Returns the value of the '<em><b>Status</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * The literals are from the enumeration {@link org.talend.core.model.properties.MigrationStatus}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status</em>' attribute.
     * @see org.talend.core.model.properties.MigrationStatus
     * @see #setStatus(MigrationStatus)
     * @see org.talend.core.model.properties.PropertiesPackage#getMigrationTask_Status()
     * @model default="0" required="true"
     * @generated
     */
    MigrationStatus getStatus();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.MigrationTask#getStatus <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' attribute.
     * @see org.talend.core.model.properties.MigrationStatus
     * @see #getStatus()
     * @generated
     */
    void setStatus(MigrationStatus value);

} // MigrationTask
