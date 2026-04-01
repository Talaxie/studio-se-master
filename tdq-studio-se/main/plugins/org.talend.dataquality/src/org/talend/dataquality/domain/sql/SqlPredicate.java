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
 * A representation of the literals of the enumeration '<em><b>Sql Predicate</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * See http://www.experlog.com/gibello/zql/sqltut.html#Relational%20Operators
 * <!-- end-model-doc -->
 * @see org.talend.dataquality.domain.sql.SQLPackage#getSqlPredicate()
 * @model
 * @generated
 */
public enum SqlPredicate implements Enumerator {
    /**
     * The '<em><b>EQUAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EQUAL_VALUE
     * @generated
     * @ordered
     */
    EQUAL(0, "EQUAL", "="),

    /**
     * The '<em><b>NOT EQUAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_EQUAL_VALUE
     * @generated
     * @ordered
     */
    NOT_EQUAL(1, "NOT_EQUAL", "<>"),

    /**
     * The '<em><b>GREATER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREATER_VALUE
     * @generated
     * @ordered
     */
    GREATER(2, "GREATER", ">"),

    /**
     * The '<em><b>LESS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LESS_VALUE
     * @generated
     * @ordered
     */
    LESS(3, "LESS", "<"),

    /**
     * The '<em><b>GREATER EQUAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREATER_EQUAL_VALUE
     * @generated
     * @ordered
     */
    GREATER_EQUAL(4, "GREATER_EQUAL", ">="),

    /**
     * The '<em><b>LESS EQUAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LESS_EQUAL_VALUE
     * @generated
     * @ordered
     */
    LESS_EQUAL(5, "LESS_EQUAL", "<="),

    /**
     * The '<em><b>IS NULL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IS_NULL_VALUE
     * @generated
     * @ordered
     */
    IS_NULL(6, "IS_NULL", "IS NULL"), /**
     * The '<em><b>BETWEEN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BETWEEN_VALUE
     * @generated
     * @ordered
     */
    BETWEEN(7, "BETWEEN", "BETWEEN"), /**
     * The '<em><b>LIKE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LIKE_VALUE
     * @generated
     * @ordered
     */
    LIKE(8, "LIKE", "LIKE"), /**
     * The '<em><b>IN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IN_VALUE
     * @generated
     * @ordered
     */
    IN(9, "IN", "IN"),

    /**
     * The '<em><b>NOT EQUAL2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_EQUAL2_VALUE
     * @generated
     * @ordered
     */
    NOT_EQUAL2(10, "NOT_EQUAL2", "!="), /**
     * The '<em><b>NOT IN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_IN_VALUE
     * @generated
     * @ordered
     */
    NOT_IN(11, "NOT_IN", "NOT IN"), /**
     * The '<em><b>NOT BETWEEN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_BETWEEN_VALUE
     * @generated
     * @ordered
     */
    NOT_BETWEEN(12, "NOT_BETWEEN", "NOT BETWEEN"), /**
     * The '<em><b>NOT LIKE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_LIKE_VALUE
     * @generated
     * @ordered
     */
    NOT_LIKE(13, "NOT_LIKE", "NOT LIKE"), /**
     * The '<em><b>IS NOT NULL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IS_NOT_NULL_VALUE
     * @generated
     * @ordered
     */
    IS_NOT_NULL(14, "IS_NOT_NULL", "IS NOT NULL"), /**
     * The '<em><b>AND</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AND_VALUE
     * @generated
     * @ordered
     */
    AND(15, "AND", "AND"), /**
     * The '<em><b>OR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OR_VALUE
     * @generated
     * @ordered
     */
    OR(16, "OR", "OR"), /**
     * The '<em><b>UNION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNION_VALUE
     * @generated
     * @ordered
     */
    UNION(17, "UNION", "UNION"), /**
     * The '<em><b>ALL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ALL_VALUE
     * @generated
     * @ordered
     */
    ALL(18, "ALL", "ALL");

    /**
     * The '<em><b>EQUAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>EQUAL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EQUAL
     * @model literal="="
     * @generated
     * @ordered
     */
    public static final int EQUAL_VALUE = 0;

    /**
     * The '<em><b>NOT EQUAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Some DBMS do not support the != not equal syntax. In this case, use this syntax.
     * <!-- end-model-doc -->
     * @see #NOT_EQUAL
     * @model literal="<>"
     * @generated
     * @ordered
     */
    public static final int NOT_EQUAL_VALUE = 1;

    /**
     * The '<em><b>GREATER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GREATER</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GREATER
     * @model literal=">"
     * @generated
     * @ordered
     */
    public static final int GREATER_VALUE = 2;

    /**
     * The '<em><b>LESS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LESS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LESS
     * @model literal="<"
     * @generated
     * @ordered
     */
    public static final int LESS_VALUE = 3;

    /**
     * The '<em><b>GREATER EQUAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GREATER EQUAL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GREATER_EQUAL
     * @model literal=">="
     * @generated
     * @ordered
     */
    public static final int GREATER_EQUAL_VALUE = 4;

    /**
     * The '<em><b>LESS EQUAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LESS EQUAL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LESS_EQUAL
     * @model literal="<="
     * @generated
     * @ordered
     */
    public static final int LESS_EQUAL_VALUE = 5;

    /**
     * The '<em><b>IS NULL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>IS NULL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IS_NULL
     * @model literal="IS NULL"
     * @generated
     * @ordered
     */
    public static final int IS_NULL_VALUE = 6;

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
    public static final int BETWEEN_VALUE = 7;

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
    public static final int LIKE_VALUE = 8;

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
    public static final int IN_VALUE = 9;

    /**
     * The '<em><b>NOT EQUAL2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Some DBMS do not support the <> not equal syntax. In this case, use this syntax.
     * <!-- end-model-doc -->
     * @see #NOT_EQUAL2
     * @model literal="!="
     * @generated
     * @ordered
     */
    public static final int NOT_EQUAL2_VALUE = 10;

    /**
     * The '<em><b>NOT IN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NOT IN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NOT_IN
     * @model literal="NOT IN"
     * @generated
     * @ordered
     */
    public static final int NOT_IN_VALUE = 11;

    /**
     * The '<em><b>NOT BETWEEN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NOT BETWEEN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NOT_BETWEEN
     * @model literal="NOT BETWEEN"
     * @generated
     * @ordered
     */
    public static final int NOT_BETWEEN_VALUE = 12;

    /**
     * The '<em><b>NOT LIKE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NOT LIKE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NOT_LIKE
     * @model literal="NOT LIKE"
     * @generated
     * @ordered
     */
    public static final int NOT_LIKE_VALUE = 13;

    /**
     * The '<em><b>IS NOT NULL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>IS NOT NULL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IS_NOT_NULL
     * @model literal="IS NOT NULL"
     * @generated
     * @ordered
     */
    public static final int IS_NOT_NULL_VALUE = 14;

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
    public static final int AND_VALUE = 15;

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
    public static final int OR_VALUE = 16;

    /**
     * The '<em><b>UNION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UNION</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNION
     * @model
     * @generated
     * @ordered
     */
    public static final int UNION_VALUE = 17;

    /**
     * The '<em><b>ALL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ALL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ALL
     * @model
     * @generated
     * @ordered
     */
    public static final int ALL_VALUE = 18;

    /**
     * An array of all the '<em><b>Sql Predicate</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SqlPredicate[] VALUES_ARRAY =
        new SqlPredicate[] {
            EQUAL,
            NOT_EQUAL,
            GREATER,
            LESS,
            GREATER_EQUAL,
            LESS_EQUAL,
            IS_NULL,
            BETWEEN,
            LIKE,
            IN,
            NOT_EQUAL2,
            NOT_IN,
            NOT_BETWEEN,
            NOT_LIKE,
            IS_NOT_NULL,
            AND,
            OR,
            UNION,
            ALL,
        };

    /**
     * A public read-only list of all the '<em><b>Sql Predicate</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SqlPredicate> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Sql Predicate</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SqlPredicate get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SqlPredicate result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sql Predicate</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SqlPredicate getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SqlPredicate result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sql Predicate</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SqlPredicate get(int value) {
        switch (value) {
            case EQUAL_VALUE: return EQUAL;
            case NOT_EQUAL_VALUE: return NOT_EQUAL;
            case GREATER_VALUE: return GREATER;
            case LESS_VALUE: return LESS;
            case GREATER_EQUAL_VALUE: return GREATER_EQUAL;
            case LESS_EQUAL_VALUE: return LESS_EQUAL;
            case IS_NULL_VALUE: return IS_NULL;
            case BETWEEN_VALUE: return BETWEEN;
            case LIKE_VALUE: return LIKE;
            case IN_VALUE: return IN;
            case NOT_EQUAL2_VALUE: return NOT_EQUAL2;
            case NOT_IN_VALUE: return NOT_IN;
            case NOT_BETWEEN_VALUE: return NOT_BETWEEN;
            case NOT_LIKE_VALUE: return NOT_LIKE;
            case IS_NOT_NULL_VALUE: return IS_NOT_NULL;
            case AND_VALUE: return AND;
            case OR_VALUE: return OR;
            case UNION_VALUE: return UNION;
            case ALL_VALUE: return ALL;
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
    private SqlPredicate(int value, String name, String literal) {
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
    
} //SqlPredicate
