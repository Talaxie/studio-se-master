/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Assignment</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.business.model.business.BusinessAssignment#getBusinessItem <em>Business Item</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.BusinessAssignment#getTalendItem <em>Talaxie Item</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.BusinessAssignment#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessAssignment()
 * @model
 * @generated
 */
public interface BusinessAssignment extends EObject {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    String copyright = ""; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Business Item</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.BusinessItem#getAssignments <em>Assignments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Item</em>' container reference isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Business Item</em>' container reference.
     * @see #setBusinessItem(BusinessItem)
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessAssignment_BusinessItem()
     * @see org.talend.designer.business.model.business.BusinessItem#getAssignments
     * @model opposite="assignments" required="true" transient="false"
     * @generated
     */
    BusinessItem getBusinessItem();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.BusinessAssignment#getBusinessItem <em>Business Item</em>}' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Business Item</em>' container reference.
     * @see #getBusinessItem()
     * @generated
     */
    void setBusinessItem(BusinessItem value);

    /**
     * Returns the value of the '<em><b>Talaxie Item</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.TalendItem#getAssignments <em>Assignments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Talaxie Item</em>' reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Talaxie Item</em>' reference.
     * @see #setTalendItem(TalendItem)
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessAssignment_TalendItem()
     * @see org.talend.designer.business.model.business.TalendItem#getAssignments
     * @model opposite="assignments" required="true"
     * @generated
     */
    TalendItem getTalendItem();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.BusinessAssignment#getTalendItem <em>Talaxie Item</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Talaxie Item</em>' reference.
     * @see #getTalendItem()
     * @generated
     */
    void setTalendItem(TalendItem value);

    /**
     * Returns the value of the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Comment</em>' attribute.
     * @see #setComment(String)
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessAssignment_Comment()
     * @model
     * @generated
     */
    String getComment();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.BusinessAssignment#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @see #getComment()
     * @generated
     */
    void setComment(String value);

} // BusinessAssignment
