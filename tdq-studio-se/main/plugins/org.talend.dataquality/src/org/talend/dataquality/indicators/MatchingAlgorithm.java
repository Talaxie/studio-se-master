/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Matching Algorithm</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getMatchingAlgorithm()
 * @model
 * @generated
 */
public enum MatchingAlgorithm implements Enumerator {
    /**
     * The '<em><b>EXACT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXACT_VALUE
     * @generated
     * @ordered
     */
    EXACT(0, "EXACT", "Exact match"),

    /**
     * The '<em><b>METAPHONE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #METAPHONE_VALUE
     * @generated
     * @ordered
     */
    METAPHONE(1, "METAPHONE", "Metaphone"),

    /**
     * The '<em><b>DOUBLE METAPHONE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_METAPHONE_VALUE
     * @generated
     * @ordered
     */
    DOUBLE_METAPHONE(2, "DOUBLE_METAPHONE", "Double metaphone"),

    /**
     * The '<em><b>LEVENSHTEIN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LEVENSHTEIN_VALUE
     * @generated
     * @ordered
     */
    LEVENSHTEIN(3, "LEVENSHTEIN", "Levenshtein"),

    /**
     * The '<em><b>SOUNDEX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOUNDEX_VALUE
     * @generated
     * @ordered
     */
    SOUNDEX(4, "SOUNDEX", "Soundex"),

    /**
     * The '<em><b>REFINED SOUNDEX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REFINED_SOUNDEX_VALUE
     * @generated
     * @ordered
     */
    REFINED_SOUNDEX(5, "REFINED_SOUNDEX", "Refined Soundex");

    /**
     * The '<em><b>EXACT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>EXACT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXACT
     * @model literal="Exact match"
     * @generated
     * @ordered
     */
    public static final int EXACT_VALUE = 0;

    /**
     * The '<em><b>METAPHONE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>METAPHONE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #METAPHONE
     * @model literal="Metaphone"
     * @generated
     * @ordered
     */
    public static final int METAPHONE_VALUE = 1;

    /**
     * The '<em><b>DOUBLE METAPHONE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DOUBLE METAPHONE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DOUBLE_METAPHONE
     * @model literal="Double metaphone"
     * @generated
     * @ordered
     */
    public static final int DOUBLE_METAPHONE_VALUE = 2;

    /**
     * The '<em><b>LEVENSHTEIN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LEVENSHTEIN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LEVENSHTEIN
     * @model literal="Levenshtein"
     * @generated
     * @ordered
     */
    public static final int LEVENSHTEIN_VALUE = 3;

    /**
     * The '<em><b>SOUNDEX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SOUNDEX</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOUNDEX
     * @model literal="Soundex"
     * @generated
     * @ordered
     */
    public static final int SOUNDEX_VALUE = 4;

    /**
     * The '<em><b>REFINED SOUNDEX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>REFINED SOUNDEX</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REFINED_SOUNDEX
     * @model literal="Refined Soundex"
     * @generated
     * @ordered
     */
    public static final int REFINED_SOUNDEX_VALUE = 5;

    /**
     * An array of all the '<em><b>Matching Algorithm</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final MatchingAlgorithm[] VALUES_ARRAY =
        new MatchingAlgorithm[] {
            EXACT,
            METAPHONE,
            DOUBLE_METAPHONE,
            LEVENSHTEIN,
            SOUNDEX,
            REFINED_SOUNDEX,
        };

    /**
     * A public read-only list of all the '<em><b>Matching Algorithm</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<MatchingAlgorithm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Matching Algorithm</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MatchingAlgorithm get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MatchingAlgorithm result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Matching Algorithm</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MatchingAlgorithm getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MatchingAlgorithm result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Matching Algorithm</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MatchingAlgorithm get(int value) {
        switch (value) {
            case EXACT_VALUE: return EXACT;
            case METAPHONE_VALUE: return METAPHONE;
            case DOUBLE_METAPHONE_VALUE: return DOUBLE_METAPHONE;
            case LEVENSHTEIN_VALUE: return LEVENSHTEIN;
            case SOUNDEX_VALUE: return SOUNDEX;
            case REFINED_SOUNDEX_VALUE: return REFINED_SOUNDEX;
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
    private MatchingAlgorithm(int value, String name, String literal) {
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
    
} //MatchingAlgorithm
