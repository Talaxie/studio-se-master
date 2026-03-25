/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Key Definition class.
 * It has a name to refer to. 
 * And subclasses have algorithm parameters definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.KeyDefinition#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.rules.RulesPackage#getKeyDefinition()
 * @model
 * @generated
 */
public interface KeyDefinition extends ModelElement {
    /**
     * Returns the value of the '<em><b>Column</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Attribute name.  When used, it's mapped to a real column name. 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Column</em>' attribute.
     * @see #setColumn(String)
     * @see org.talend.dataquality.rules.RulesPackage#getKeyDefinition_Column()
     * @model
     * @generated
     */
    String getColumn();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.KeyDefinition#getColumn <em>Column</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Column</em>' attribute.
     * @see #getColumn()
     * @generated
     */
    void setColumn(String value);

} // KeyDefinition
