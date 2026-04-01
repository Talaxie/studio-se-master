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
 * <em><b>Label Kind</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> An enumeration representing the
 * values that a COBOLFD label kind may take. <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getLabelKind()
 * @model
 * @generated
 */
public enum LabelKind implements Enumerator {
    /**
     * The '<em><b>Lk unspecified</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #LK_UNSPECIFIED_VALUE
     * @generated
     * @ordered
     */
    LK_UNSPECIFIED(0, "lk_unspecified", "lk_unspecified"),

    /**
     * The '<em><b>Lk standard</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LK_STANDARD_VALUE
     * @generated
     * @ordered
     */
    LK_STANDARD(1, "lk_standard", "lk_standard"),

    /**
     * The '<em><b>Lk omitted</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LK_OMITTED_VALUE
     * @generated
     * @ordered
     */
    LK_OMITTED(2, "lk_omitted", "lk_omitted");

    /**
     * The '<em><b>Lk unspecified</b></em>' literal value.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Lk unspecified</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LK_UNSPECIFIED
     * @model name="lk_unspecified"
     * @generated
     * @ordered
     */
    public static final int LK_UNSPECIFIED_VALUE = 0;

    /**
     * The '<em><b>Lk standard</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Lk standard</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LK_STANDARD
     * @model name="lk_standard"
     * @generated
     * @ordered
     */
    public static final int LK_STANDARD_VALUE = 1;

    /**
     * The '<em><b>Lk omitted</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Lk omitted</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LK_OMITTED
     * @model name="lk_omitted"
     * @generated
     * @ordered
     */
    public static final int LK_OMITTED_VALUE = 2;

    /**
     * An array of all the '<em><b>Label Kind</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final LabelKind[] VALUES_ARRAY = new LabelKind[] { LK_UNSPECIFIED, LK_STANDARD, LK_OMITTED, };

    /**
     * A public read-only list of all the '<em><b>Label Kind</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<LabelKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Label Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LabelKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LabelKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Label Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LabelKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LabelKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Label Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LabelKind get(int value) {
        switch (value) {
        case LK_UNSPECIFIED_VALUE:
            return LK_UNSPECIFIED;
        case LK_STANDARD_VALUE:
            return LK_STANDARD;
        case LK_OMITTED_VALUE:
            return LK_OMITTED;
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
    private LabelKind(int value, String name, String literal) {
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

} // LabelKind
