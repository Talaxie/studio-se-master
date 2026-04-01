/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.imstypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>MSD Btype</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> Parent types <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getMSDBtype()
 * @model
 * @generated
 */
public enum MSDBtype implements Enumerator {
    /**
     * The '<em><b>Imsmt NO</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSMT_NO_VALUE
     * @generated
     * @ordered
     */
    IMSMT_NO(0, "imsmt_NO", "imsmt_NO"),

    /**
     * The '<em><b>Imsmt TERM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSMT_TERM_VALUE
     * @generated
     * @ordered
     */
    IMSMT_TERM(1, "imsmt_TERM", "imsmt_TERM"),

    /**
     * The '<em><b>Imsmt FIXED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSMT_FIXED_VALUE
     * @generated
     * @ordered
     */
    IMSMT_FIXED(2, "imsmt_FIXED", "imsmt_FIXED"),

    /**
     * The '<em><b>Imsmt DYNAMIC</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSMT_DYNAMIC_VALUE
     * @generated
     * @ordered
     */
    IMSMT_DYNAMIC(3, "imsmt_DYNAMIC", "imsmt_DYNAMIC");

    /**
     * The '<em><b>Imsmt NO</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> nonterminal-related
     * without terminal-related keys which has key and sequence field as part of
     * the segment <!-- end-model-doc -->
     * 
     * @see #IMSMT_NO
     * @model name="imsmt_NO"
     * @generated
     * @ordered
     */
    public static final int IMSMT_NO_VALUE = 0;

    /**
     * The '<em><b>Imsmt TERM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> nonterminal-related with
     * terminal-related keys <!-- end-model-doc -->
     * 
     * @see #IMSMT_TERM
     * @model name="imsmt_TERM"
     * @generated
     * @ordered
     */
    public static final int IMSMT_TERM_VALUE = 1;

    /**
     * The '<em><b>Imsmt FIXED</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> terminal-related fixed
     * <!-- end-model-doc -->
     * 
     * @see #IMSMT_FIXED
     * @model name="imsmt_FIXED"
     * @generated
     * @ordered
     */
    public static final int IMSMT_FIXED_VALUE = 2;

    /**
     * The '<em><b>Imsmt DYNAMIC</b></em>' literal value. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> terminal-related
     * dynamic <!-- end-model-doc -->
     * 
     * @see #IMSMT_DYNAMIC
     * @model name="imsmt_DYNAMIC"
     * @generated
     * @ordered
     */
    public static final int IMSMT_DYNAMIC_VALUE = 3;

    /**
     * An array of all the '<em><b>MSD Btype</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final MSDBtype[] VALUES_ARRAY = new MSDBtype[] { IMSMT_NO, IMSMT_TERM, IMSMT_FIXED, IMSMT_DYNAMIC, };

    /**
     * A public read-only list of all the '<em><b>MSD Btype</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<MSDBtype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>MSD Btype</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static MSDBtype get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MSDBtype result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>MSD Btype</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static MSDBtype getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MSDBtype result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>MSD Btype</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static MSDBtype get(int value) {
        switch (value) {
        case IMSMT_NO_VALUE:
            return IMSMT_NO;
        case IMSMT_TERM_VALUE:
            return IMSMT_TERM;
        case IMSMT_FIXED_VALUE:
            return IMSMT_FIXED;
        case IMSMT_DYNAMIC_VALUE:
            return IMSMT_DYNAMIC;
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
    private MSDBtype(int value, String name, String literal) {
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

} // MSDBtype
