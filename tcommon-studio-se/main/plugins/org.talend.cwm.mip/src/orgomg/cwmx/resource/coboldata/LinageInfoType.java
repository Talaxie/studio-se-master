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
 * <em><b>Linage Info Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc --> <!-- begin-model-doc --> An enumeration representing
 * the types of linage information the are maintained for a COBOLFD. <!--
 * end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getLinageInfoType()
 * @model
 * @generated
 */
public enum LinageInfoType implements Enumerator {
    /**
     * The '<em><b>Li linage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LI_LINAGE_VALUE
     * @generated
     * @ordered
     */
    LI_LINAGE(0, "li_linage", "li_linage"),

    /**
     * The '<em><b>Li linage Footing</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #LI_LINAGE_FOOTING_VALUE
     * @generated
     * @ordered
     */
    LI_LINAGE_FOOTING(1, "li_linageFooting", "li_linageFooting"),

    /**
     * The '<em><b>Li linage Top</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #LI_LINAGE_TOP_VALUE
     * @generated
     * @ordered
     */
    LI_LINAGE_TOP(2, "li_linageTop", "li_linageTop"),

    /**
     * The '<em><b>Li linage Bottom</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #LI_LINAGE_BOTTOM_VALUE
     * @generated
     * @ordered
     */
    LI_LINAGE_BOTTOM(3, "li_linageBottom", "li_linageBottom");

    /**
     * The '<em><b>Li linage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Li linage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LI_LINAGE
     * @model name="li_linage"
     * @generated
     * @ordered
     */
    public static final int LI_LINAGE_VALUE = 0;

    /**
     * The '<em><b>Li linage Footing</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Li linage Footing</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #LI_LINAGE_FOOTING
     * @model name="li_linageFooting"
     * @generated
     * @ordered
     */
    public static final int LI_LINAGE_FOOTING_VALUE = 1;

    /**
     * The '<em><b>Li linage Top</b></em>' literal value.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Li linage Top</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LI_LINAGE_TOP
     * @model name="li_linageTop"
     * @generated
     * @ordered
     */
    public static final int LI_LINAGE_TOP_VALUE = 2;

    /**
     * The '<em><b>Li linage Bottom</b></em>' literal value.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Li linage Bottom</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LI_LINAGE_BOTTOM
     * @model name="li_linageBottom"
     * @generated
     * @ordered
     */
    public static final int LI_LINAGE_BOTTOM_VALUE = 3;

    /**
     * An array of all the '<em><b>Linage Info Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final LinageInfoType[] VALUES_ARRAY = new LinageInfoType[] { LI_LINAGE, LI_LINAGE_FOOTING, LI_LINAGE_TOP,
            LI_LINAGE_BOTTOM, };

    /**
     * A public read-only list of all the '<em><b>Linage Info Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<LinageInfoType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Linage Info Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LinageInfoType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LinageInfoType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Linage Info Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LinageInfoType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LinageInfoType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Linage Info Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LinageInfoType get(int value) {
        switch (value) {
        case LI_LINAGE_VALUE:
            return LI_LINAGE;
        case LI_LINAGE_FOOTING_VALUE:
            return LI_LINAGE_FOOTING;
        case LI_LINAGE_TOP_VALUE:
            return LI_LINAGE_TOP;
        case LI_LINAGE_BOTTOM_VALUE:
            return LI_LINAGE_BOTTOM;
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
    private LinageInfoType(int value, String name, String literal) {
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

} // LinageInfoType
