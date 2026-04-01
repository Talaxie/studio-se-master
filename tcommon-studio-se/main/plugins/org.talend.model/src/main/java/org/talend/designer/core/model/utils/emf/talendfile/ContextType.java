/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#getContextParameter <em>Context Parameter</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#isConfirmationNeeded <em>Confirmation Needed</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#isHide <em>Hide</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getContextType()
 * @model extendedMetaData="name='Context_._type' kind='elementOnly'"
 * @generated
 */
public interface ContextType extends EObject {
    /**
     * Returns the value of the '<em><b>Context Parameter</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Parameter</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getContextType_ContextParameter()
     * @model type="org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType" containment="true"
     *        extendedMetaData="kind='element' name='ContextParameter' namespace='##targetNamespace'"
     * @generated
     */
    EList getContextParameter();

    /**
     * Returns the value of the '<em><b>Confirmation Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Confirmation Needed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Confirmation Needed</em>' attribute.
     * @see #isSetConfirmationNeeded()
     * @see #unsetConfirmationNeeded()
     * @see #setConfirmationNeeded(boolean)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getContextType_ConfirmationNeeded()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='confirmationNeeded' namespace='##targetNamespace'"
     * @generated
     */
    boolean isConfirmationNeeded();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#isConfirmationNeeded <em>Confirmation Needed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Confirmation Needed</em>' attribute.
     * @see #isSetConfirmationNeeded()
     * @see #unsetConfirmationNeeded()
     * @see #isConfirmationNeeded()
     * @generated
     */
    void setConfirmationNeeded(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#isConfirmationNeeded <em>Confirmation Needed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConfirmationNeeded()
     * @see #isConfirmationNeeded()
     * @see #setConfirmationNeeded(boolean)
     * @generated
     */
    void unsetConfirmationNeeded();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#isConfirmationNeeded <em>Confirmation Needed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Confirmation Needed</em>' attribute is set.
     * @see #unsetConfirmationNeeded()
     * @see #isConfirmationNeeded()
     * @see #setConfirmationNeeded(boolean)
     * @generated
     */
    boolean isSetConfirmationNeeded();

    /**
     * Returns the value of the '<em><b>Hide</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hide</em>' attribute.
     * @see #isSetHide()
     * @see #unsetHide()
     * @see #setHide(boolean)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getContextType_Hide()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='confirmationNeeded' namespace='##targetNamespace'"
     * @generated
     */
    boolean isHide();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#isHide <em>Hide</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hide</em>' attribute.
     * @see #isSetHide()
     * @see #unsetHide()
     * @see #isHide()
     * @generated
     */
    void setHide(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#isHide <em>Hide</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHide()
     * @see #isHide()
     * @see #setHide(boolean)
     * @generated
     */
    void unsetHide();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#isHide <em>Hide</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hide</em>' attribute is set.
     * @see #unsetHide()
     * @see #isHide()
     * @see #setHide(boolean)
     * @generated
     */
    boolean isSetHide();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getContextType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.ContextType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // ContextType