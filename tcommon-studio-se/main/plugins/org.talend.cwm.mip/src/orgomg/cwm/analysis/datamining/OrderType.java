/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Order Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> Ways to define an ordering on a set
 * of string values. <!-- end-model-doc -->
 * 
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getOrderType()
 * @model
 * @generated
 */
public enum OrderType implements Enumerator {
    /**
     * The '<em><b>Alphabetic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ALPHABETIC_VALUE
     * @generated
     * @ordered
     */
    ALPHABETIC(0, "alphabetic", "alphabetic"),

    /**
     * The '<em><b>Date</b></em>' literal object.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #DATE_VALUE
     * @generated
     * @ordered
     */
    DATE(1, "date", "date"),

    /**
     * The '<em><b>Numeric</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NUMERIC_VALUE
     * @generated
     * @ordered
     */
    NUMERIC(2, "numeric", "numeric"),

    /**
     * The '<em><b>In Sequence</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IN_SEQUENCE_VALUE
     * @generated
     * @ordered
     */
    IN_SEQUENCE(3, "inSequence", "inSequence");

    /**
     * The '<em><b>Alphabetic</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Alphabetic order. <!--
     * end-model-doc -->
     * 
     * @see #ALPHABETIC
     * @model name="alphabetic"
     * @generated
     * @ordered
     */
    public static final int ALPHABETIC_VALUE = 0;

    /**
     * The '<em><b>Date</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Interprets the strings as dates
     * and orders accordingly. <!-- end-model-doc -->
     * 
     * @see #DATE
     * @model name="date"
     * @generated
     * @ordered
     */
    public static final int DATE_VALUE = 1;

    /**
     * The '<em><b>Numeric</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Interprets the strings as
     * numbers and orders accordingly. <!-- end-model-doc -->
     * 
     * @see #NUMERIC
     * @model name="numeric"
     * @generated
     * @ordered
     */
    public static final int NUMERIC_VALUE = 2;

    /**
     * The '<em><b>In Sequence</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> As specified by the order
     * of the aggregation of categories in CategoricalAttribute. <!--
     * end-model-doc -->
     * 
     * @see #IN_SEQUENCE
     * @model name="inSequence"
     * @generated
     * @ordered
     */
    public static final int IN_SEQUENCE_VALUE = 3;

    /**
     * An array of all the '<em><b>Order Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final OrderType[] VALUES_ARRAY = new OrderType[] { ALPHABETIC, DATE, NUMERIC, IN_SEQUENCE, };

    /**
     * A public read-only list of all the '<em><b>Order Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<OrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Order Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static OrderType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            OrderType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Order Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static OrderType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            OrderType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Order Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static OrderType get(int value) {
        switch (value) {
        case ALPHABETIC_VALUE:
            return ALPHABETIC;
        case DATE_VALUE:
            return DATE;
        case NUMERIC_VALUE:
            return NUMERIC;
        case IN_SEQUENCE_VALUE:
            return IN_SEQUENCE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    private OrderType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} // OrderType
