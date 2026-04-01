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
 * A representation of the literals of the enumeration '<em><b>Indicator Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The indicator content values (useful for historization of indicator in the TALEND_DQ data mart).
 * <!-- end-model-doc -->
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getIndicatorValueType()
 * @model
 * @generated
 */
public enum IndicatorValueType implements Enumerator {
    /**
     * The '<em><b>INTEGER VALUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTEGER_VALUE_VALUE
     * @generated
     * @ordered
     */
    INTEGER_VALUE(0, "INTEGER_VALUE", "I"),

    /**
     * The '<em><b>REAL VALUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REAL_VALUE_VALUE
     * @generated
     * @ordered
     */
    REAL_VALUE(1, "REAL_VALUE", "R"), /**
     * The '<em><b>INSTANCE VALUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSTANCE_VALUE_VALUE
     * @generated
     * @ordered
     */
    INSTANCE_VALUE(2, "INSTANCE_VALUE", "V"), /**
     * The '<em><b>DATE VALUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATE_VALUE_VALUE
     * @generated
     * @ordered
     */
    DATE_VALUE(3, "DATE_VALUE", "D");

    /**
     * The '<em><b>INTEGER VALUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tells that the indicator contains integer values (for example, row count, distinct count, text length...)
     * <!-- end-model-doc -->
     * @see #INTEGER_VALUE
     * @model literal="I"
     * @generated
     * @ordered
     */
    public static final int INTEGER_VALUE_VALUE = 0;

    /**
     * The '<em><b>REAL VALUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tells that the indicator contains real values (for example when computing a mean on float data)
     * <!-- end-model-doc -->
     * @see #REAL_VALUE
     * @model literal="R"
     * @generated
     * @ordered
     */
    public static final int REAL_VALUE_VALUE = 1;

    /**
     * The '<em><b>INSTANCE VALUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This type of value is for indicators when the content of the indicator is an instance of the data (For example for the ModeIndicator). 
     * <!-- end-model-doc -->
     * @see #INSTANCE_VALUE
     * @model literal="V"
     * @generated
     * @ordered
     */
    public static final int INSTANCE_VALUE_VALUE = 2;

    /**
     * The '<em><b>DATE VALUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DATE VALUE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DATE_VALUE
     * @model literal="D"
     * @generated
     * @ordered
     */
    public static final int DATE_VALUE_VALUE = 3;

    /**
     * An array of all the '<em><b>Indicator Value Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final IndicatorValueType[] VALUES_ARRAY =
        new IndicatorValueType[] {
            INTEGER_VALUE,
            REAL_VALUE,
            INSTANCE_VALUE,
            DATE_VALUE,
        };

    /**
     * A public read-only list of all the '<em><b>Indicator Value Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<IndicatorValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Indicator Value Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static IndicatorValueType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IndicatorValueType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Indicator Value Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static IndicatorValueType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IndicatorValueType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Indicator Value Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static IndicatorValueType get(int value) {
        switch (value) {
            case INTEGER_VALUE_VALUE: return INTEGER_VALUE;
            case REAL_VALUE_VALUE: return REAL_VALUE;
            case INSTANCE_VALUE_VALUE: return INSTANCE_VALUE;
            case DATE_VALUE_VALUE: return DATE_VALUE;
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
    private IndicatorValueType(int value, String name, String literal) {
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
    
} //IndicatorValueType
