/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Access Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> An enumeration representing the
 * values that a COBOLFD access mode may take. <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getAccessType()
 * @model
 * @generated
 */
public enum AccessType implements Enumerator {
    /**
     * The '<em><b>At unspecified</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #AT_UNSPECIFIED_VALUE
     * @generated
     * @ordered
     */
    AT_UNSPECIFIED(0, "at_unspecified", "at_unspecified"),

    /**
     * The '<em><b>At dynamic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AT_DYNAMIC_VALUE
     * @generated
     * @ordered
     */
    AT_DYNAMIC(1, "at_dynamic", "at_dynamic"),

    /**
     * The '<em><b>At random</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AT_RANDOM_VALUE
     * @generated
     * @ordered
     */
    AT_RANDOM(2, "at_random", "at_random"),

    /**
     * The '<em><b>At sequential</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #AT_SEQUENTIAL_VALUE
     * @generated
     * @ordered
     */
    AT_SEQUENTIAL(3, "at_sequential", "at_sequential");

    /**
     * The '<em><b>At unspecified</b></em>' literal value.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>At unspecified</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AT_UNSPECIFIED
     * @model name="at_unspecified"
     * @generated
     * @ordered
     */
    public static final int AT_UNSPECIFIED_VALUE = 0;

    /**
     * The '<em><b>At dynamic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>At dynamic</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AT_DYNAMIC
     * @model name="at_dynamic"
     * @generated
     * @ordered
     */
    public static final int AT_DYNAMIC_VALUE = 1;

    /**
     * The '<em><b>At random</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>At random</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AT_RANDOM
     * @model name="at_random"
     * @generated
     * @ordered
     */
    public static final int AT_RANDOM_VALUE = 2;

    /**
     * The '<em><b>At sequential</b></em>' literal value.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>At sequential</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AT_SEQUENTIAL
     * @model name="at_sequential"
     * @generated
     * @ordered
     */
    public static final int AT_SEQUENTIAL_VALUE = 3;

    /**
     * An array of all the '<em><b>Access Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final AccessType[] VALUES_ARRAY = new AccessType[] { AT_UNSPECIFIED, AT_DYNAMIC, AT_RANDOM, AT_SEQUENTIAL, };

    /**
     * A public read-only list of all the '<em><b>Access Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<AccessType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Access Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AccessType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AccessType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Access Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AccessType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AccessType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Access Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AccessType get(int value) {
        switch (value) {
        case AT_UNSPECIFIED_VALUE:
            return AT_UNSPECIFIED;
        case AT_DYNAMIC_VALUE:
            return AT_DYNAMIC;
        case AT_RANDOM_VALUE:
            return AT_RANDOM;
        case AT_SEQUENTIAL_VALUE:
            return AT_SEQUENTIAL;
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
    private AccessType(int value, String name, String literal) {
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

} // AccessType
