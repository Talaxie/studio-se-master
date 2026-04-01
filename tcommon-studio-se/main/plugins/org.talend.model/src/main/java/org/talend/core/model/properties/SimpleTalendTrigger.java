/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Talaxie Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.SimpleTalendTrigger#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SimpleTalendTrigger#getRepeatInterval <em>Repeat Interval</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SimpleTalendTrigger#getTimesTriggered <em>Times Triggered</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getSimpleTalendTrigger()
 * @model
 * @generated
 */
public interface SimpleTalendTrigger extends TalendTrigger {
    /**
     * Returns the value of the '<em><b>Repeat Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Repeat Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Repeat Count</em>' attribute.
     * @see #setRepeatCount(Integer)
     * @see org.talend.core.model.properties.PropertiesPackage#getSimpleTalendTrigger_RepeatCount()
     * @model
     * @generated
     */
    Integer getRepeatCount();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SimpleTalendTrigger#getRepeatCount <em>Repeat Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Repeat Count</em>' attribute.
     * @see #getRepeatCount()
     * @generated
     */
    void setRepeatCount(Integer value);

    /**
     * Returns the value of the '<em><b>Repeat Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Repeat Interval</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Repeat Interval</em>' attribute.
     * @see #setRepeatInterval(long)
     * @see org.talend.core.model.properties.PropertiesPackage#getSimpleTalendTrigger_RepeatInterval()
     * @model
     * @generated
     */
    long getRepeatInterval();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SimpleTalendTrigger#getRepeatInterval <em>Repeat Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Repeat Interval</em>' attribute.
     * @see #getRepeatInterval()
     * @generated
     */
    void setRepeatInterval(long value);

    /**
     * Returns the value of the '<em><b>Times Triggered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Times Triggered</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Times Triggered</em>' attribute.
     * @see #setTimesTriggered(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSimpleTalendTrigger_TimesTriggered()
     * @model
     * @generated
     */
    int getTimesTriggered();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SimpleTalendTrigger#getTimesTriggered <em>Times Triggered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Times Triggered</em>' attribute.
     * @see #getTimesTriggered()
     * @generated
     */
    void setTimesTriggered(int value);

} // SimpleTalendTrigger
