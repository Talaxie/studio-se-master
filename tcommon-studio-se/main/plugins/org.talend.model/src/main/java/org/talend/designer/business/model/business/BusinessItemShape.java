/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Item Shape</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.business.model.business.BusinessItemShape#getIncomingRelationships <em>Incoming Relationships</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.BusinessItemShape#getOutgoingRelationships <em>Outgoing Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessItemShape()
 * @model abstract="true"
 * @generated
 */
public interface BusinessItemShape extends BusinessItem {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    String copyright = ""; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Incoming Relationships</b></em>' reference list.
     * The list contents are of type {@link org.talend.designer.business.model.business.BaseBusinessItemRelationship}.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.BaseBusinessItemRelationship#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming Relationships</em>' reference list isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming Relationships</em>' reference list.
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessItemShape_IncomingRelationships()
     * @see org.talend.designer.business.model.business.BaseBusinessItemRelationship#getTarget
     * @model type="org.talend.designer.business.model.business.BaseBusinessItemRelationship" opposite="target"
     * @generated
     */
    EList getIncomingRelationships();

    /**
     * Returns the value of the '<em><b>Outgoing Relationships</b></em>' reference list.
     * The list contents are of type {@link org.talend.designer.business.model.business.BaseBusinessItemRelationship}.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.BaseBusinessItemRelationship#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Relationships</em>' reference list isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing Relationships</em>' reference list.
     * @see org.talend.designer.business.model.business.BusinessPackage#getBusinessItemShape_OutgoingRelationships()
     * @see org.talend.designer.business.model.business.BaseBusinessItemRelationship#getSource
     * @model type="org.talend.designer.business.model.business.BaseBusinessItemRelationship" opposite="source"
     * @generated
     */
    EList getOutgoingRelationships();

} // BusinessItemShape
