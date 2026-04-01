/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Project Authorization Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.talend.core.model.properties.PropertiesPackage#getUserProjectAuthorizationType()
 * @model
 * @generated
 */
public final class UserProjectAuthorizationType extends AbstractEnumerator
{
    /**
     * The '<em><b>Read Write</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Read Write</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #READ_WRITE_LITERAL
     * @model name="ReadWrite"
     * @generated
     * @ordered
     */
    public static final int READ_WRITE = 1;

    /**
     * The '<em><b>Read Only</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Read Only</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #READ_ONLY_LITERAL
     * @model name="ReadOnly"
     * @generated
     * @ordered
     */
    public static final int READ_ONLY = 2;

    /**
     * The '<em><b>Read Write</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #READ_WRITE
     * @generated
     * @ordered
     */
    public static final UserProjectAuthorizationType READ_WRITE_LITERAL = new UserProjectAuthorizationType(READ_WRITE, "ReadWrite", "ReadWrite");

    /**
     * The '<em><b>Read Only</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #READ_ONLY
     * @generated
     * @ordered
     */
    public static final UserProjectAuthorizationType READ_ONLY_LITERAL = new UserProjectAuthorizationType(READ_ONLY, "ReadOnly", "ReadOnly");

    /**
     * An array of all the '<em><b>User Project Authorization Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final UserProjectAuthorizationType[] VALUES_ARRAY =
        new UserProjectAuthorizationType[] {
            READ_WRITE_LITERAL,
            READ_ONLY_LITERAL,
        };

    /**
     * A public read-only list of all the '<em><b>User Project Authorization Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>User Project Authorization Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UserProjectAuthorizationType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            UserProjectAuthorizationType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>User Project Authorization Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UserProjectAuthorizationType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            UserProjectAuthorizationType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>User Project Authorization Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UserProjectAuthorizationType get(int value) {
        switch (value) {
            case READ_WRITE: return READ_WRITE_LITERAL;
            case READ_ONLY: return READ_ONLY_LITERAL;
        }
        return null;
    }

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private UserProjectAuthorizationType(int value, String name, String literal) {
        super(value, name, literal);
    }
}
