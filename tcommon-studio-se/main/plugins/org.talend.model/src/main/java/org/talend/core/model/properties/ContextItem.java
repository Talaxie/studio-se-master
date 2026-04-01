/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.common.util.EList;

import org.talend.designer.core.model.utils.emf.talendfile.ContextType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ContextItem#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ContextItem#getDefaultContext <em>Default Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getContextItem()
 * @model
 * @generated
 */
public interface ContextItem extends Item {
    /**
     * Returns the value of the '<em><b>Context</b></em>' reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.talendfile.ContextType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getContextItem_Context()
     * @model type="org.talend.designer.core.model.utils.emf.talendfile.ContextType"
     * @generated
     */
    EList getContext();

    /**
     * Returns the value of the '<em><b>Default Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Context</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Context</em>' attribute.
     * @see #setDefaultContext(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getContextItem_DefaultContext()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getDefaultContext();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ContextItem#getDefaultContext <em>Default Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Context</em>' attribute.
     * @see #getDefaultContext()
     * @generated
     */
    void setDefaultContext(String value);

} // ContextItem