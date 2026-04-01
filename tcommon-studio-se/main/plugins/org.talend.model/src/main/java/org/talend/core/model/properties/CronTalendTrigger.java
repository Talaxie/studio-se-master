/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cron Talaxie Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.CronTalendTrigger#getCronExpression <em>Cron Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getCronTalendTrigger()
 * @model
 * @generated
 */
public interface CronTalendTrigger extends TalendTrigger {
    /**
     * Returns the value of the '<em><b>Cron Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cron Expression</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cron Expression</em>' attribute.
     * @see #setCronExpression(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getCronTalendTrigger_CronExpression()
     * @model
     * @generated
     */
    String getCronExpression();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.CronTalendTrigger#getCronExpression <em>Cron Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cron Expression</em>' attribute.
     * @see #getCronExpression()
     * @generated
     */
    void setCronExpression(String value);

} // CronTalendTrigger
