/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Dimension Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc --> <!-- begin-model-doc --> An enumeration defining
 * possible types of Essbase Dimension. <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.essbase.EssbasePackage#getDimensionType()
 * @model
 * @generated
 */
public enum DimensionType implements Enumerator {
    /**
     * The '<em><b>Ess none</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ESS_NONE_VALUE
     * @generated
     * @ordered
     */
    ESS_NONE(0, "ess_none", "ess_none"),

    /**
     * The '<em><b>Ess accounts</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #ESS_ACCOUNTS_VALUE
     * @generated
     * @ordered
     */
    ESS_ACCOUNTS(1, "ess_accounts", "ess_accounts"),

    /**
     * The '<em><b>Ess time</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ESS_TIME_VALUE
     * @generated
     * @ordered
     */
    ESS_TIME(2, "ess_time", "ess_time"),

    /**
     * The '<em><b>Ess country</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ESS_COUNTRY_VALUE
     * @generated
     * @ordered
     */
    ESS_COUNTRY(3, "ess_country", "ess_country"),

    /**
     * The '<em><b>Ess currency Partition</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #ESS_CURRENCY_PARTITION_VALUE
     * @generated
     * @ordered
     */
    ESS_CURRENCY_PARTITION(4, "ess_currencyPartition", "ess_currencyPartition"),

    /**
     * The '<em><b>Ess attribute</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #ESS_ATTRIBUTE_VALUE
     * @generated
     * @ordered
     */
    ESS_ATTRIBUTE(5, "ess_attribute", "ess_attribute");

    /**
     * The '<em><b>Ess none</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Denotes a Dimension of no
     * particular type. <!-- end-model-doc -->
     * 
     * @see #ESS_NONE
     * @model name="ess_none"
     * @generated
     * @ordered
     */
    public static final int ESS_NONE_VALUE = 0;

    /**
     * The '<em><b>Ess accounts</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Denotes an Accounts (i.e.,
     * Measures) Dimension. <!-- end-model-doc -->
     * 
     * @see #ESS_ACCOUNTS
     * @model name="ess_accounts"
     * @generated
     * @ordered
     */
    public static final int ESS_ACCOUNTS_VALUE = 1;

    /**
     * The '<em><b>Ess time</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Denotes a Time Dimension.
     * <!-- end-model-doc -->
     * 
     * @see #ESS_TIME
     * @model name="ess_time"
     * @generated
     * @ordered
     */
    public static final int ESS_TIME_VALUE = 2;

    /**
     * The '<em><b>Ess country</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Denotes a Dimension
     * representing a list of country codes or locales. <!-- end-model-doc -->
     * 
     * @see #ESS_COUNTRY
     * @model name="ess_country"
     * @generated
     * @ordered
     */
    public static final int ESS_COUNTRY_VALUE = 3;

    /**
     * The '<em><b>Ess currency Partition</b></em>' literal value. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Denotes
     * a Dimension used for currency conversions. <!-- end-model-doc -->
     * 
     * @see #ESS_CURRENCY_PARTITION
     * @model name="ess_currencyPartition"
     * @generated
     * @ordered
     */
    public static final int ESS_CURRENCY_PARTITION_VALUE = 4;

    /**
     * The '<em><b>Ess attribute</b></em>' literal value. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> Denotes a Dimension of
     * user-defined attributes (UDAs). <!-- end-model-doc -->
     * 
     * @see #ESS_ATTRIBUTE
     * @model name="ess_attribute"
     * @generated
     * @ordered
     */
    public static final int ESS_ATTRIBUTE_VALUE = 5;

    /**
     * An array of all the '<em><b>Dimension Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final DimensionType[] VALUES_ARRAY = new DimensionType[] { ESS_NONE, ESS_ACCOUNTS, ESS_TIME, ESS_COUNTRY,
            ESS_CURRENCY_PARTITION, ESS_ATTRIBUTE, };

    /**
     * A public read-only list of all the '<em><b>Dimension Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<DimensionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Dimension Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static DimensionType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DimensionType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Dimension Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static DimensionType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DimensionType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Dimension Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static DimensionType get(int value) {
        switch (value) {
        case ESS_NONE_VALUE:
            return ESS_NONE;
        case ESS_ACCOUNTS_VALUE:
            return ESS_ACCOUNTS;
        case ESS_TIME_VALUE:
            return ESS_TIME;
        case ESS_COUNTRY_VALUE:
            return ESS_COUNTRY;
        case ESS_CURRENCY_PARTITION_VALUE:
            return ESS_CURRENCY_PARTITION;
        case ESS_ATTRIBUTE_VALUE:
            return ESS_ATTRIBUTE;
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
    private DimensionType(int value, String name, String literal) {
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

} // DimensionType
