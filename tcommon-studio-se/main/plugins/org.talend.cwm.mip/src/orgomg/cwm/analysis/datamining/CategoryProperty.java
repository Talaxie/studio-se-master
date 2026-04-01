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
 * <em><b>Category Property</b></em>', and utility methods for working with
 * them. <!-- end-user-doc -->
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCategoryProperty()
 * @model
 * @generated
 */
public enum CategoryProperty implements Enumerator {
    /**
     * The '<em><b>Missing</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MISSING_VALUE
     * @generated
     * @ordered
     */
    MISSING(0, "missing", "missing"),

    /**
     * The '<em><b>Invalid</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INVALID_VALUE
     * @generated
     * @ordered
     */
    INVALID(1, "invalid", "invalid"),

    /**
     * The '<em><b>Valid</b></em>' literal object.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #VALID_VALUE
     * @generated
     * @ordered
     */
    VALID(2, "valid", "valid"),

    /**
     * The '<em><b>Positive</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POSITIVE_VALUE
     * @generated
     * @ordered
     */
    POSITIVE(3, "positive", "positive"),

    /**
     * The '<em><b>Negative</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NEGATIVE_VALUE
     * @generated
     * @ordered
     */
    NEGATIVE(4, "negative", "negative");

    /**
     * The '<em><b>Missing</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Represents that there is no
     * information. <!-- end-model-doc -->
     * 
     * @see #MISSING
     * @model name="missing"
     * @generated
     * @ordered
     */
    public static final int MISSING_VALUE = 0;

    /**
     * The '<em><b>Invalid</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Represents that value must be
     * treated as invalid. <!-- end-model-doc -->
     * 
     * @see #INVALID
     * @model name="invalid"
     * @generated
     * @ordered
     */
    public static final int INVALID_VALUE = 1;

    /**
     * The '<em><b>Valid</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Represents a regular value.
     * <!-- end-model-doc -->
     * 
     * @see #VALID
     * @model name="valid"
     * @generated
     * @ordered
     */
    public static final int VALID_VALUE = 2;

    /**
     * The '<em><b>Positive</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Represents the logical 1
     * of a Boolean attribute. <!-- end-model-doc -->
     * 
     * @see #POSITIVE
     * @model name="positive"
     * @generated
     * @ordered
     */
    public static final int POSITIVE_VALUE = 3;

    /**
     * The '<em><b>Negative</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Represents the logical 0
     * of a Boolean attribute. <!-- end-model-doc -->
     * 
     * @see #NEGATIVE
     * @model name="negative"
     * @generated
     * @ordered
     */
    public static final int NEGATIVE_VALUE = 4;

    /**
     * An array of all the '<em><b>Category Property</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final CategoryProperty[] VALUES_ARRAY = new CategoryProperty[] { MISSING, INVALID, VALID, POSITIVE, NEGATIVE, };

    /**
     * A public read-only list of all the '<em><b>Category Property</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<CategoryProperty> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Category Property</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static CategoryProperty get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CategoryProperty result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Category Property</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static CategoryProperty getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CategoryProperty result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Category Property</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static CategoryProperty get(int value) {
        switch (value) {
        case MISSING_VALUE:
            return MISSING;
        case INVALID_VALUE:
            return INVALID;
        case VALID_VALUE:
            return VALID;
        case POSITIVE_VALUE:
            return POSITIVE;
        case NEGATIVE_VALUE:
            return NEGATIVE;
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
    private CategoryProperty(int value, String name, String literal) {
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

} // CategoryProperty
