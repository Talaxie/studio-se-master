/**
 */
package org.talend.dataquality.analysis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sample Data Show Way</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.analysis.AnalysisPackage#getSampleDataShowWay()
 * @model
 * @generated
 */
public enum SampleDataShowWay implements Enumerator {
    /**
     * The '<em><b>FIRST</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIRST_VALUE
     * @generated
     * @ordered
     */
    FIRST(0, "FIRST", "n first rows"),

    /**
     * The '<em><b>RANDOM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RANDOM_VALUE
     * @generated
     * @ordered
     */
    RANDOM(1, "RANDOM", "n random rows");

    /**
     * The '<em><b>FIRST</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FIRST</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIRST
     * @model literal="n first rows"
     * @generated
     * @ordered
     */
    public static final int FIRST_VALUE = 0;

    /**
     * The '<em><b>RANDOM</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>RANDOM</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RANDOM
     * @model literal="n random rows"
     * @generated
     * @ordered
     */
    public static final int RANDOM_VALUE = 1;

    /**
     * An array of all the '<em><b>Sample Data Show Way</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SampleDataShowWay[] VALUES_ARRAY =
        new SampleDataShowWay[] {
            FIRST,
            RANDOM,
        };

    /**
     * A public read-only list of all the '<em><b>Sample Data Show Way</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SampleDataShowWay> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Sample Data Show Way</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SampleDataShowWay get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SampleDataShowWay result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sample Data Show Way</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SampleDataShowWay getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SampleDataShowWay result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sample Data Show Way</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SampleDataShowWay get(int value) {
        switch (value) {
            case FIRST_VALUE: return FIRST;
            case RANDOM_VALUE: return RANDOM;
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
    private SampleDataShowWay(int value, String name, String literal) {
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
    
} //SampleDataShowWay
