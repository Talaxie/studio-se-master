/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Talaxie Item</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.talend.designer.business.model.business.TalendItem#getId <em>Id</em>}</li>
 * <li>{@link org.talend.designer.business.model.business.TalendItem#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.talend.designer.business.model.business.BusinessPackage#getTalendItem()
 * @model
 * @generated
 */
public interface TalendItem extends EObject {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    String copyright = ""; //$NON-NLS-1$

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.talend.designer.business.model.business.BusinessPackage#getTalendItem_Id()
     * @model
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.TalendItem#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute. The default value is <code>""</code>. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.designer.business.model.business.BusinessPackage#getTalendItem_Label()
     * @model default=""
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.TalendItem#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Author</b></em>' attribute. The default value is <code>""</code>. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Author</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Author</em>' attribute.
     * @see #setAuthor(String)
     * @see org.talend.designer.business.model.business.BusinessPackage#getTalendItem_Author()
     * @model default=""
     * @generated
     */
    String getAuthor();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.TalendItem#getAuthor <em>Author</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Author</em>' attribute.
     * @see #getAuthor()
     * @generated
     */
    void setAuthor(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see org.talend.designer.business.model.business.BusinessPackage#getTalendItem_Version()
     * @model
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.TalendItem#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

    /**
     * Returns the value of the '<em><b>Comment</b></em>' attribute. The default value is <code>""</code>. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Comment</em>' attribute.
     * @see #setComment(String)
     * @see org.talend.designer.business.model.business.BusinessPackage#getTalendItem_Comment()
     * @model default=""
     * @generated
     */
    String getComment();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.TalendItem#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @see #getComment()
     * @generated
     */
    void setComment(String value);

    /**
     * Returns the value of the '<em><b>Assignments</b></em>' reference list.
     * The list contents are of type {@link org.talend.designer.business.model.business.BusinessAssignment}.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.BusinessAssignment#getTalendItem <em>Talaxie Item</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignments</em>' reference list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignments</em>' reference list.
     * @see org.talend.designer.business.model.business.BusinessPackage#getTalendItem_Assignments()
     * @see org.talend.designer.business.model.business.BusinessAssignment#getTalendItem
     * @model type="org.talend.designer.business.model.business.BusinessAssignment" opposite="talendItem"
     * @generated
     */
    EList getAssignments();

    /**
     * Returns the value of the '<em><b>Repository</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.talend.designer.business.model.business.Repository#getTalenditems <em>Talenditems</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Repository</em>' container reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Repository</em>' container reference.
     * @see #setRepository(Repository)
     * @see org.talend.designer.business.model.business.BusinessPackage#getTalendItem_Repository()
     * @see org.talend.designer.business.model.business.Repository#getTalenditems
     * @model opposite="Talenditems" transient="false"
     * @generated
     */
    Repository getRepository();

    /**
     * Sets the value of the '{@link org.talend.designer.business.model.business.TalendItem#getRepository <em>Repository</em>}' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Repository</em>' container reference.
     * @see #getRepository()
     * @generated
     */
    void setRepository(Repository value);

} // TalendItem
