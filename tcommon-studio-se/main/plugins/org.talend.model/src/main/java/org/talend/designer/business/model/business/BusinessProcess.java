/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Process</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.business.model.business.BusinessProcess#getBusinessItems <em>Business Items</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.BusinessProcess#getLocalRepositoryCopy <em>Local Repository Copy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessProcess()
 * @model
 * @generated
 */
public interface BusinessProcess extends TalendItem {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    String copyright = ""; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Business Items</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.business.model.business.BusinessItem}.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.BusinessItem#getBusinessProcess <em>Business Process</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Items</em>' containment reference list isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Business Items</em>' containment reference list.
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessProcess_BusinessItems()
     * @see org.talend.designer.business.model.business.BusinessItem#getBusinessProcess
     * @model type="org.talend.designer.business.model.business.BusinessItem" opposite="businessProcess" containment="true"
     * @generated
     */
    EList getBusinessItems();

    /**
     * Returns the value of the '<em><b>Local Repository Copy</b></em>' containment reference.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Local Repository Copy</em>' containment reference isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Repository Copy</em>' containment reference.
     * @see #setLocalRepositoryCopy(Repository)
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessProcess_LocalRepositoryCopy()
     * @model containment="true"
     * @generated
     */
    Repository getLocalRepositoryCopy();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.BusinessProcess#getLocalRepositoryCopy <em>Local Repository Copy</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Repository Copy</em>' containment reference.
     * @see #getLocalRepositoryCopy()
     * @generated
     */
    void setLocalRepositoryCopy(Repository value);

} // BusinessProcess
