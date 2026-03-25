/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.sql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sql Compound Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * See http://www.experlog.com/gibello/zql/sqltut.html#Compound%20Conditions
 * <!-- end-model-doc -->
 * @see org.talend.dataquality.domain.sql.SQLPackage#getSqlCompoundCondition()
 * @model
 * @generated
 */
public enum SqlCompoundCondition implements Enumerator {
    /**
     * The '<em><b>AND</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AND_VALUE
     * @generated
     * @ordered
     */
    AND(0, "AND", "AND"),

    /**
     * The '<em><b>OR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OR_VALUE
     * @generated
     * @ordered
     */
    OR(1, "OR", "OR"),

    /**
     * The '<em><b>LIKE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LIKE_VALUE
     * @generated
     * @ordered
     */
    LIKE(2, "LIKE", "LIKE"),

    /**
     * The '<em><b>IN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IN_VALUE
     * @generated
     * @ordered
     */
    IN(3, "IN", "IN"),

    /**
     * The '<em><b>BETWEEN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BETWEEN_VALUE
     * @generated
     * @ordered
     */
    BETWEEN(4, "BETWEEN", "BETWEEN");

    /**
     * The '<em><b>AND</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>AND</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AND
     * @model
     * @generated
     * @ordered
     */
    public static final int AND_VALUE = 0;

    /**
     * The '<em><b>OR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OR
     * @model
     * @generated
     * @ordered
     */
    public static final int OR_VALUE = 1;

    /**
     * The '<em><b>LIKE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LIKE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LIKE
     * @model
     * @generated
     * @ordered
     */
    public static final int LIKE_VALUE = 2;

    /**
     * The '<em><b>IN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>IN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IN
     * @model
     * @generated
     * @ordered
     */
    public static final int IN_VALUE = 3;

    /**
     * The '<em><b>BETWEEN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BETWEEN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BETWEEN
     * @model
     * @generated
     * @ordered
     */
    public static final int BETWEEN_VALUE = 4;

    /**
     * An array of all the '<em><b>Sql Compound Condition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SqlCompoundCondition[] VALUES_ARRAY =
        new SqlCompoundCondition[] {
            AND,
            OR,
            LIKE,
            IN,
            BETWEEN,
        };

    /**
     * A public read-only list of all the '<em><b>Sql Compound Condition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SqlCompoundCondition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Sql Compound Condition</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SqlCompoundCondition get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SqlCompoundCondition result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sql Compound Condition</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SqlCompoundCondition getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SqlCompoundCondition result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sql Compound Condition</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SqlCompoundCondition get(int value) {
        switch (value) {
            case AND_VALUE: return AND;
            case OR_VALUE: return OR;
            case LIKE_VALUE: return LIKE;
            case IN_VALUE: return IN;
            case BETWEEN_VALUE: return BETWEEN;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private SqlCompoundCondition(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //SqlCompoundCondition
