/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.business.model.business;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Business Item Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.business.model.business.BaseBusinessItemRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.BaseBusinessItemRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.business.model.business.BusinessPackage#getBaseBusinessItemRelationship()
 * @model abstract="true"
 * @generated
 */
public interface BaseBusinessItemRelationship extends BusinessItem {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    String copyright = ""; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.BusinessItemShape#getOutgoingRelationships <em>Outgoing Relationships</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(BusinessItemShape)
     * @see org.talend.designer.business.model.business.BusinessPackage#getBaseBusinessItemRelationship_Source()
     * @see org.talend.designer.business.model.business.BusinessItemShape#getOutgoingRelationships
     * @model opposite="outgoingRelationships"
     * @generated
     */
    BusinessItemShape getSource();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.BaseBusinessItemRelationship#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(BusinessItemShape value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.BusinessItemShape#getIncomingRelationships <em>Incoming Relationships</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(BusinessItemShape)
     * @see org.talend.designer.business.model.business.BusinessPackage#getBaseBusinessItemRelationship_Target()
     * @see org.talend.designer.business.model.business.BusinessItemShape#getIncomingRelationships
     * @model opposite="incomingRelationships"
     * @generated
     */
    BusinessItemShape getTarget();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.BaseBusinessItemRelationship#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(BusinessItemShape value);

} // BaseBusinessItemRelationship