/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Repository</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.business.model.business.Repository#getTalenditems <em>Talenditems</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.business.model.business.BusinessPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    String copyright = ""; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Talenditems</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.business.model.business.TalendItem}.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.TalendItem#getRepository <em>Repository</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Talenditems</em>' containment reference list isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Talenditems</em>' containment reference list.
     * @see org.talend.designer.business.model.business.BusinessPackage#getRepository_Talenditems()
     * @see org.talend.designer.business.model.business.TalendItem#getRepository
     * @model type="org.talend.designer.business.model.business.TalendItem" opposite="repository" containment="true"
     * @generated
     */
    EList getTalenditems();

} // Repository
