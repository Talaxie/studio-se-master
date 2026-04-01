/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soa Input Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.SoaInputParameter#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaInputParameter#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaInputParameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaInputParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaInputParameter#getExposedName <em>Exposed Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaInputParameter#isExposed <em>Exposed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getSoaInputParameter()
 * @model
 * @generated
 */
public interface SoaInputParameter extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaInputParameter_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaInputParameter#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaInputParameter_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaInputParameter#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Operation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' reference.
     * @see #setOperation(SoaOperation)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaInputParameter_Operation()
     * @model
     * @generated
     */
    SoaOperation getOperation();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaInputParameter#getOperation <em>Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' reference.
     * @see #getOperation()
     * @generated
     */
    void setOperation(SoaOperation value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaInputParameter_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaInputParameter#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

    /**
     * Returns the value of the '<em><b>Exposed Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exposed Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exposed Name</em>' attribute.
     * @see #setExposedName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaInputParameter_ExposedName()
     * @model
     * @generated
     */
    String getExposedName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaInputParameter#getExposedName <em>Exposed Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exposed Name</em>' attribute.
     * @see #getExposedName()
     * @generated
     */
    void setExposedName(String value);

    /**
     * Returns the value of the '<em><b>Exposed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exposed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exposed</em>' attribute.
     * @see #setExposed(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaInputParameter_Exposed()
     * @model
     * @generated
     */
    boolean isExposed();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaInputParameter#isExposed <em>Exposed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exposed</em>' attribute.
     * @see #isExposed()
     * @generated
     */
    void setExposed(boolean value);

} // SoaInputParameter
