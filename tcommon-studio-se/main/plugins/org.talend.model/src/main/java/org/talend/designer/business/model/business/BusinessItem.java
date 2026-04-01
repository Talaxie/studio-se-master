/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Item</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.business.model.business.BusinessItem#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.BusinessItem#getBusinessProcess <em>Business Process</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.BusinessItem#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.BusinessItem#getVAlignment <em>VAlignment</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.BusinessItem#getHAlignment <em>HAlignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessItem()
 * @model abstract="true"
 * @generated
 */
public interface BusinessItem extends EObject {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    String copyright = ""; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Business Process</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.BusinessProcess#getBusinessItems <em>Business Items</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Process</em>' container reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Business Process</em>' container reference.
     * @see #setBusinessProcess(BusinessProcess)
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessItem_BusinessProcess()
     * @see org.talend.designer.business.model.business.BusinessProcess#getBusinessItems
     * @model opposite="businessItems" required="true" transient="false"
     * @generated
     */
    BusinessProcess getBusinessProcess();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.BusinessItem#getBusinessProcess <em>Business Process</em>}' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Business Process</em>' container reference.
     * @see #getBusinessProcess()
     * @generated
     */
    void setBusinessProcess(BusinessProcess value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessItem_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.BusinessItem#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.business.model.business.BusinessAssignment}.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.BusinessAssignment#getBusinessItem <em>Business Item</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignments</em>' containment reference list.
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessItem_Assignments()
     * @see org.talend.designer.business.model.business.BusinessAssignment#getBusinessItem
     * @model type="org.talend.designer.business.model.business.BusinessAssignment" opposite="businessItem" containment="true"
     * @generated
     */
    EList getAssignments();

    /**
     * Returns the value of the '<em><b>VAlignment</b></em>' attribute.
     * The default value is <code>"VCENTRE"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VAlignment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VAlignment</em>' attribute.
     * @see #setVAlignment(String)
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessItem_VAlignment()
     * @model default="VCENTRE"
     * @generated
     */
    String getVAlignment();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.BusinessItem#getVAlignment <em>VAlignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VAlignment</em>' attribute.
     * @see #getVAlignment()
     * @generated
     */
    void setVAlignment(String value);

    /**
     * Returns the value of the '<em><b>HAlignment</b></em>' attribute.
     * The default value is <code>"HCENTRE"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>HAlignment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>HAlignment</em>' attribute.
     * @see #setHAlignment(String)
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessItem_HAlignment()
     * @model default="HCENTRE"
     * @generated
     */
    String getHAlignment();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.BusinessItem#getHAlignment <em>HAlignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>HAlignment</em>' attribute.
     * @see #getHAlignment()
     * @generated
     */
    void setHAlignment(String value);

} // BusinessItem
