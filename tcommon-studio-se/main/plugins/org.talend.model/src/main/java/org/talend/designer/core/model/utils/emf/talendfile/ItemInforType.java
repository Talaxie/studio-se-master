/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Infor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ItemInforType#getIdOrName <em>Id Or Name</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ItemInforType#isSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getItemInforType()
 * @model
 * @generated
 */
public interface ItemInforType extends EObject {
    /**
     * Returns the value of the '<em><b>Id Or Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id Or Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id Or Name</em>' attribute.
     * @see #setIdOrName(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getItemInforType_IdOrName()
     * @model
     * @generated
     */
    String getIdOrName();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ItemInforType#getIdOrName <em>Id Or Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Or Name</em>' attribute.
     * @see #getIdOrName()
     * @generated
     */
    void setIdOrName(String value);

    /**
     * Returns the value of the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>System</em>' attribute.
     * @see #setSystem(boolean)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getItemInforType_System()
     * @model
     * @generated
     */
    boolean isSystem();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ItemInforType#isSystem <em>System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>System</em>' attribute.
     * @see #isSystem()
     * @generated
     */
    void setSystem(boolean value);

} // ItemInforType
