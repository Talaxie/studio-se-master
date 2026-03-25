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
 * A representation of the literals of the enumeration '<em><b>Date Grain</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getDateGrain()
 * @model
 * @generated
 */
public enum DateGrain implements Enumerator {
    /**
     * The '<em><b>DAY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DAY_VALUE
     * @generated
     * @ordered
     */
    DAY(6, "DAY", "day"),

    /**
     * The '<em><b>WEEK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WEEK_VALUE
     * @generated
     * @ordered
     */
    WEEK(1, "WEEK", "week"),

    /**
     * The '<em><b>MONTH</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MONTH_VALUE
     * @generated
     * @ordered
     */
    MONTH(2, "MONTH", "month"),

    /**
     * The '<em><b>QUARTER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QUARTER_VALUE
     * @generated
     * @ordered
     */
    QUARTER(3, "QUARTER", "quarter"),

    /**
     * The '<em><b>YEAR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #YEAR_VALUE
     * @generated
     * @ordered
     */
    YEAR(5, "YEAR", "year"),

    /**
     * The '<em><b>NONE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE(0, "NONE", "none");

    /**
     * The '<em><b>DAY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DAY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DAY
     * @model literal="day"
     * @generated
     * @ordered
     */
    public static final int DAY_VALUE = 6;

    /**
     * The '<em><b>WEEK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WEEK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WEEK
     * @model literal="week"
     * @generated
     * @ordered
     */
    public static final int WEEK_VALUE = 1;

    /**
     * The '<em><b>MONTH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MONTH</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MONTH
     * @model literal="month"
     * @generated
     * @ordered
     */
    public static final int MONTH_VALUE = 2;

    /**
     * The '<em><b>QUARTER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>QUARTER</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QUARTER
     * @model literal="quarter"
     * @generated
     * @ordered
     */
    public static final int QUARTER_VALUE = 3;

    /**
     * The '<em><b>YEAR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>YEAR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #YEAR
     * @model literal="year"
     * @generated
     * @ordered
     */
    public static final int YEAR_VALUE = 5;

    /**
     * The '<em><b>NONE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONE
     * @model literal="none"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 0;

    /**
     * An array of all the '<em><b>Date Grain</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DateGrain[] VALUES_ARRAY =
        new DateGrain[] {
            DAY,
            WEEK,
            MONTH,
            QUARTER,
            YEAR,
            NONE,
        };

    /**
     * A public read-only list of all the '<em><b>Date Grain</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DateGrain> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Date Grain</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DateGrain get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DateGrain result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Date Grain</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DateGrain getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DateGrain result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Date Grain</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DateGrain get(int value) {
        switch (value) {
            case DAY_VALUE: return DAY;
            case WEEK_VALUE: return WEEK;
            case MONTH_VALUE: return MONTH;
            case QUARTER_VALUE: return QUARTER;
            case YEAR_VALUE: return YEAR;
            case NONE_VALUE: return NONE;
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
    private DateGrain(int value, String name, String literal) {
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
    
} //DateGrain
