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
 * <em><b>Sign Kind Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc --> <!-- begin-model-doc --> An enumeration representing
 * the values that a COBOLField sign may take. <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getSignKindType()
 * @model
 * @generated
 */
public enum SignKindType implements Enumerator {
    /**
     * The '<em><b>Sk unsigned</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SK_UNSIGNED_VALUE
     * @generated
     * @ordered
     */
    SK_UNSIGNED(0, "sk_unsigned", "sk_unsigned"),

    /**
     * The '<em><b>Sk leading Sign</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #SK_LEADING_SIGN_VALUE
     * @generated
     * @ordered
     */
    SK_LEADING_SIGN(1, "sk_leadingSign", "sk_leadingSign"),

    /**
     * The '<em><b>Sk trailing Sign</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #SK_TRAILING_SIGN_VALUE
     * @generated
     * @ordered
     */
    SK_TRAILING_SIGN(2, "sk_trailingSign", "sk_trailingSign"),

    /**
     * The '<em><b>Sk leading Sep Sign</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #SK_LEADING_SEP_SIGN_VALUE
     * @generated
     * @ordered
     */
    SK_LEADING_SEP_SIGN(3, "sk_leadingSepSign", "sk_leadingSepSign"),

    /**
     * The '<em><b>Sk trailing Sep Sign</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #SK_TRAILING_SEP_SIGN_VALUE
     * @generated
     * @ordered
     */
    SK_TRAILING_SEP_SIGN(4, "sk_trailingSepSign", "sk_trailingSepSign");

    /**
     * The '<em><b>Sk unsigned</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sk unsigned</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SK_UNSIGNED
     * @model name="sk_unsigned"
     * @generated
     * @ordered
     */
    public static final int SK_UNSIGNED_VALUE = 0;

    /**
     * The '<em><b>Sk leading Sign</b></em>' literal value.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Sk leading Sign</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SK_LEADING_SIGN
     * @model name="sk_leadingSign"
     * @generated
     * @ordered
     */
    public static final int SK_LEADING_SIGN_VALUE = 1;

    /**
     * The '<em><b>Sk trailing Sign</b></em>' literal value.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Sk trailing Sign</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SK_TRAILING_SIGN
     * @model name="sk_trailingSign"
     * @generated
     * @ordered
     */
    public static final int SK_TRAILING_SIGN_VALUE = 2;

    /**
     * The '<em><b>Sk leading Sep Sign</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sk leading Sep Sign</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #SK_LEADING_SEP_SIGN
     * @model name="sk_leadingSepSign"
     * @generated
     * @ordered
     */
    public static final int SK_LEADING_SEP_SIGN_VALUE = 3;

    /**
     * The '<em><b>Sk trailing Sep Sign</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sk trailing Sep Sign</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #SK_TRAILING_SEP_SIGN
     * @model name="sk_trailingSepSign"
     * @generated
     * @ordered
     */
    public static final int SK_TRAILING_SEP_SIGN_VALUE = 4;

    /**
     * An array of all the '<em><b>Sign Kind Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final SignKindType[] VALUES_ARRAY = new SignKindType[] { SK_UNSIGNED, SK_LEADING_SIGN, SK_TRAILING_SIGN,
            SK_LEADING_SEP_SIGN, SK_TRAILING_SEP_SIGN, };

    /**
     * A public read-only list of all the '<em><b>Sign Kind Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<SignKindType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Sign Kind Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static SignKindType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SignKindType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sign Kind Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static SignKindType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SignKindType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sign Kind Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static SignKindType get(int value) {
        switch (value) {
        case SK_UNSIGNED_VALUE:
            return SK_UNSIGNED;
        case SK_LEADING_SIGN_VALUE:
            return SK_LEADING_SIGN;
        case SK_TRAILING_SIGN_VALUE:
            return SK_TRAILING_SIGN;
        case SK_LEADING_SEP_SIGN_VALUE:
            return SK_LEADING_SEP_SIGN;
        case SK_TRAILING_SEP_SIGN_VALUE:
            return SK_TRAILING_SEP_SIGN;
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
    private SignKindType(int value, String name, String literal) {
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

} // SignKindType
