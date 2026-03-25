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
 * A representation of the literals of the enumeration '<em><b>Enum Statistics</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getEnumStatistics()
 * @model
 * @generated
 */
public enum EnumStatistics implements Enumerator {
    /**
     * The '<em><b>MIN VALUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MIN_VALUE_VALUE
     * @generated
     * @ordered
     */
    MIN_VALUE(0, "MIN_VALUE", "Minimal value"),

    /**
     * The '<em><b>MAX VALUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAX_VALUE_VALUE
     * @generated
     * @ordered
     */
    MAX_VALUE(1, "MAX_VALUE", "Maximal value"),

    /**
     * The '<em><b>LOWER QUARTILE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOWER_QUARTILE_VALUE
     * @generated
     * @ordered
     */
    LOWER_QUARTILE(2, "LOWER_QUARTILE", "Lower quartile"),

    /**
     * The '<em><b>UPPER QUARTILE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UPPER_QUARTILE_VALUE
     * @generated
     * @ordered
     */
    UPPER_QUARTILE(3, "UPPER_QUARTILE", "Upper quartile"),

    /**
     * The '<em><b>MEAN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MEAN_VALUE
     * @generated
     * @ordered
     */
    MEAN(4, "MEAN", "Mean"),

    /**
     * The '<em><b>MEDIAN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MEDIAN_VALUE
     * @generated
     * @ordered
     */
    MEDIAN(5, "MEDIAN", "Median"),

    /**
     * The '<em><b>ROW COUNT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROW_COUNT_VALUE
     * @generated
     * @ordered
     */
    ROW_COUNT(0, "ROW_COUNT", "Row count"),

    /**
     * The '<em><b>NULL COUNT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NULL_COUNT_VALUE
     * @generated
     * @ordered
     */
    NULL_COUNT(1, "NULL_COUNT", "Null count"),

    /**
     * The '<em><b>DISTINCT COUNT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISTINCT_COUNT_VALUE
     * @generated
     * @ordered
     */
    DISTINCT_COUNT(2, "DISTINCT_COUNT", "Distinct count"),

    /**
     * The '<em><b>UNIQUE COUNT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNIQUE_COUNT_VALUE
     * @generated
     * @ordered
     */
    UNIQUE_COUNT(3, "UNIQUE_COUNT", "Unique count"),

    /**
     * The '<em><b>DUPLICATE COUNT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DUPLICATE_COUNT_VALUE
     * @generated
     * @ordered
     */
    DUPLICATE_COUNT(4, "DUPLICATE_COUNT", "Duplicate count"),

    /**
     * The '<em><b>BOX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOX_VALUE
     * @generated
     * @ordered
     */
    BOX(0, "BOX", "BOX"),

    /**
     * The '<em><b>FREQ TABLE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FREQ_TABLE_VALUE
     * @generated
     * @ordered
     */
    FREQ_TABLE(1, "FREQ_TABLE", "Frequency table"),

    /**
     * The '<em><b>RANGE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RANGE_VALUE
     * @generated
     * @ordered
     */
    RANGE(2, "RANGE", "Range"),

    /**
     * The '<em><b>IQR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IQR_VALUE
     * @generated
     * @ordered
     */
    IQR(3, "IQR", "Inter quartile range"),

    /**
     * The '<em><b>BIN COUNT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BIN_COUNT_VALUE
     * @generated
     * @ordered
     */
    BIN_COUNT(4, "BIN_COUNT", "Bin count"),

    /**
     * The '<em><b>MATCHING VALUES</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MATCHING_VALUES_VALUE
     * @generated
     * @ordered
     */
    MATCHING_VALUES(0, "MATCHING_VALUES", "Matching values"),

    /**
     * The '<em><b>BLANK COUNT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BLANK_COUNT_VALUE
     * @generated
     * @ordered
     */
    BLANK_COUNT(0, "BLANK_COUNT", "Blank count"),

    /**
     * The '<em><b>MIN LENGTH</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MIN_LENGTH_VALUE
     * @generated
     * @ordered
     */
    MIN_LENGTH(1, "MIN_LENGTH", "Minimal length"),

    /**
     * The '<em><b>MAX LENGTH</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAX_LENGTH_VALUE
     * @generated
     * @ordered
     */
    MAX_LENGTH(2, "MAX_LENGTH", "Maximal length"),

    /**
     * The '<em><b>AVG LENGTH</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AVG_LENGTH_VALUE
     * @generated
     * @ordered
     */
    AVG_LENGTH(3, "AVG_LENGTH", "Average length");

    /**
     * The '<em><b>MIN VALUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MIN VALUE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MIN_VALUE
     * @model literal="Minimal value"
     * @generated
     * @ordered
     */
    public static final int MIN_VALUE_VALUE = 0;

    /**
     * The '<em><b>MAX VALUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MAX VALUE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAX_VALUE
     * @model literal="Maximal value"
     * @generated
     * @ordered
     */
    public static final int MAX_VALUE_VALUE = 1;

    /**
     * The '<em><b>LOWER QUARTILE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LOWER QUARTILE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOWER_QUARTILE
     * @model literal="Lower quartile"
     * @generated
     * @ordered
     */
    public static final int LOWER_QUARTILE_VALUE = 2;

    /**
     * The '<em><b>UPPER QUARTILE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UPPER QUARTILE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UPPER_QUARTILE
     * @model literal="Upper quartile"
     * @generated
     * @ordered
     */
    public static final int UPPER_QUARTILE_VALUE = 3;

    /**
     * The '<em><b>MEAN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MEAN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MEAN
     * @model literal="Mean"
     * @generated
     * @ordered
     */
    public static final int MEAN_VALUE = 4;

    /**
     * The '<em><b>MEDIAN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MEDIAN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MEDIAN
     * @model literal="Median"
     * @generated
     * @ordered
     */
    public static final int MEDIAN_VALUE = 5;

    /**
     * The '<em><b>ROW COUNT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ROW COUNT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROW_COUNT
     * @model literal="Row count"
     * @generated
     * @ordered
     */
    public static final int ROW_COUNT_VALUE = 0;

    /**
     * The '<em><b>NULL COUNT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NULL COUNT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NULL_COUNT
     * @model literal="Null count"
     * @generated
     * @ordered
     */
    public static final int NULL_COUNT_VALUE = 1;

    /**
     * The '<em><b>DISTINCT COUNT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DISTINCT COUNT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISTINCT_COUNT
     * @model literal="Distinct count"
     * @generated
     * @ordered
     */
    public static final int DISTINCT_COUNT_VALUE = 2;

    /**
     * The '<em><b>UNIQUE COUNT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UNIQUE COUNT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNIQUE_COUNT
     * @model literal="Unique count"
     * @generated
     * @ordered
     */
    public static final int UNIQUE_COUNT_VALUE = 3;

    /**
     * The '<em><b>DUPLICATE COUNT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DUPLICATE COUNT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DUPLICATE_COUNT
     * @model literal="Duplicate count"
     * @generated
     * @ordered
     */
    public static final int DUPLICATE_COUNT_VALUE = 4;

    /**
     * The '<em><b>BOX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BOX</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BOX
     * @model
     * @generated
     * @ordered
     */
    public static final int BOX_VALUE = 0;

    /**
     * The '<em><b>FREQ TABLE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FREQ TABLE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FREQ_TABLE
     * @model literal="Frequency table"
     * @generated
     * @ordered
     */
    public static final int FREQ_TABLE_VALUE = 1;

    /**
     * The '<em><b>RANGE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>RANGE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RANGE
     * @model literal="Range"
     * @generated
     * @ordered
     */
    public static final int RANGE_VALUE = 2;

    /**
     * The '<em><b>IQR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>IQR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IQR
     * @model literal="Inter quartile range"
     * @generated
     * @ordered
     */
    public static final int IQR_VALUE = 3;

    /**
     * The '<em><b>BIN COUNT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BIN COUNT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BIN_COUNT
     * @model literal="Bin count"
     * @generated
     * @ordered
     */
    public static final int BIN_COUNT_VALUE = 4;

    /**
     * The '<em><b>MATCHING VALUES</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MATCHING VALUES</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MATCHING_VALUES
     * @model literal="Matching values"
     * @generated
     * @ordered
     */
    public static final int MATCHING_VALUES_VALUE = 0;

    /**
     * The '<em><b>BLANK COUNT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BLANK COUNT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BLANK_COUNT
     * @model literal="Blank count"
     * @generated
     * @ordered
     */
    public static final int BLANK_COUNT_VALUE = 0;

    /**
     * The '<em><b>MIN LENGTH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MIN LENGTH</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MIN_LENGTH
     * @model literal="Minimal length"
     * @generated
     * @ordered
     */
    public static final int MIN_LENGTH_VALUE = 1;

    /**
     * The '<em><b>MAX LENGTH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MAX LENGTH</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAX_LENGTH
     * @model literal="Maximal length"
     * @generated
     * @ordered
     */
    public static final int MAX_LENGTH_VALUE = 2;

    /**
     * The '<em><b>AVG LENGTH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>AVG LENGTH</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AVG_LENGTH
     * @model literal="Average length"
     * @generated
     * @ordered
     */
    public static final int AVG_LENGTH_VALUE = 3;

    /**
     * An array of all the '<em><b>Enum Statistics</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EnumStatistics[] VALUES_ARRAY =
        new EnumStatistics[] {
            MIN_VALUE,
            MAX_VALUE,
            LOWER_QUARTILE,
            UPPER_QUARTILE,
            MEAN,
            MEDIAN,
            ROW_COUNT,
            NULL_COUNT,
            DISTINCT_COUNT,
            UNIQUE_COUNT,
            DUPLICATE_COUNT,
            BOX,
            FREQ_TABLE,
            RANGE,
            IQR,
            BIN_COUNT,
            MATCHING_VALUES,
            BLANK_COUNT,
            MIN_LENGTH,
            MAX_LENGTH,
            AVG_LENGTH,
        };

    /**
     * A public read-only list of all the '<em><b>Enum Statistics</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EnumStatistics> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Enum Statistics</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EnumStatistics get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EnumStatistics result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Enum Statistics</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EnumStatistics getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EnumStatistics result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Enum Statistics</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EnumStatistics get(int value) {
        switch (value) {
            case MIN_VALUE_VALUE: return MIN_VALUE;
            case MAX_VALUE_VALUE: return MAX_VALUE;
            case LOWER_QUARTILE_VALUE: return LOWER_QUARTILE;
            case UPPER_QUARTILE_VALUE: return UPPER_QUARTILE;
            case MEAN_VALUE: return MEAN;
            case MEDIAN_VALUE: return MEDIAN;
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
    private EnumStatistics(int value, String name, String literal) {
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
    
} //EnumStatistics
