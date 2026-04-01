/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INSTALL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.INSTALLType#getCOMMAND <em>COMMAND</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.INSTALLType#getOS <em>OS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getINSTALLType()
 * @model extendedMetaData="name='INSTALL_._type' kind='elementOnly'"
 * @generated
 */
public interface INSTALLType extends EObject {
    /**
     * Returns the value of the '<em><b>COMMAND</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COMMAND</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COMMAND</em>' attribute.
     * @see #setCOMMAND(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getINSTALLType_COMMAND()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='COMMAND' namespace='##targetNamespace'"
     * @generated
     */
    String getCOMMAND();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.INSTALLType#getCOMMAND <em>COMMAND</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMMAND</em>' attribute.
     * @see #getCOMMAND()
     * @generated
     */
    void setCOMMAND(String value);

    /**
     * Returns the value of the '<em><b>OS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OS</em>' attribute.
     * @see #setOS(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getINSTALLType_OS()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='OS' namespace='##targetNamespace'"
     * @generated
     */
    String getOS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.INSTALLType#getOS <em>OS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OS</em>' attribute.
     * @see #getOS()
     * @generated
     */
    void setOS(String value);

} // INSTALLType
