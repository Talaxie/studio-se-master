/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Pattern Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.SQLPatternItem#isSystem <em>System</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SQLPatternItem#getEltName <em>Elt Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getSQLPatternItem()
 * @model
 * @generated
 */
public interface SQLPatternItem extends FileItem {
    /**
     * Returns the value of the '<em><b>System</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>System</em>' attribute.
     * @see #setSystem(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getSQLPatternItem_System()
     * @model default="false"
     * @generated
     */
    boolean isSystem();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SQLPatternItem#isSystem <em>System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>System</em>' attribute.
     * @see #isSystem()
     * @generated
     */
    void setSystem(boolean value);

    /**
     * Returns the value of the '<em><b>Elt Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elt Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elt Name</em>' attribute.
     * @see #setEltName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSQLPatternItem_EltName()
     * @model
     * @generated
     */
    String getEltName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SQLPatternItem#getEltName <em>Elt Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Elt Name</em>' attribute.
     * @see #getEltName()
     * @generated
     */
    void setEltName(String value);

} // SQLPatternItem
