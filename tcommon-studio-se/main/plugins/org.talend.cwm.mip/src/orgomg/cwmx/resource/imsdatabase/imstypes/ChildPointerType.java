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
 * <em><b>Child Pointer Type</b></em>', and utility methods for working with
 * them. <!-- end-user-doc --> <!-- begin-model-doc --> Child pointer types <!--
 * end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getChildPointerType()
 * @model
 * @generated
 */
public enum ChildPointerType implements Enumerator {
    /**
     * The '<em><b>Imscp SNGL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSCP_SNGL_VALUE
     * @generated
     * @ordered
     */
    IMSCP_SNGL(0, "imscp_SNGL", "imscp_SNGL"),

    /**
     * The '<em><b>Imscp DBLE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSCP_DBLE_VALUE
     * @generated
     * @ordered
     */
    IMSCP_DBLE(1, "imscp_DBLE", "imscp_DBLE"),

    /**
     * The '<em><b>Imscp NONE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSCP_NONE_VALUE
     * @generated
     * @ordered
     */
    IMSCP_NONE(2, "imscp_NONE", "imscp_NONE");

    /**
     * The '<em><b>Imscp SNGL</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Use single pointers in the
     * prefix area (SNGL parameter). <!-- end-model-doc -->
     * 
     * @see #IMSCP_SNGL
     * @model name="imscp_SNGL"
     * @generated
     * @ordered
     */
    public static final int IMSCP_SNGL_VALUE = 0;

    /**
     * The '<em><b>Imscp DBLE</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Use double pointers in the
     * prefix area (DBLE parameter). <!-- end-model-doc -->
     * 
     * @see #IMSCP_DBLE
     * @model name="imscp_DBLE"
     * @generated
     * @ordered
     */
    public static final int IMSCP_DBLE_VALUE = 1;

    /**
     * The '<em><b>Imscp NONE</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Use no pointers in the
     * prefix area. <!-- end-model-doc -->
     * 
     * @see #IMSCP_NONE
     * @model name="imscp_NONE"
     * @generated
     * @ordered
     */
    public static final int IMSCP_NONE_VALUE = 2;

    /**
     * An array of all the '<em><b>Child Pointer Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static final ChildPointerType[] VALUES_ARRAY = new ChildPointerType[] { IMSCP_SNGL, IMSCP_DBLE, IMSCP_NONE, };

    /**
     * A public read-only list of all the '<em><b>Child Pointer Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<ChildPointerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Child Pointer Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ChildPointerType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ChildPointerType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Child Pointer Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ChildPointerType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ChildPointerType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Child Pointer Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ChildPointerType get(int value) {
        switch (value) {
        case IMSCP_SNGL_VALUE:
            return IMSCP_SNGL;
        case IMSCP_DBLE_VALUE:
            return IMSCP_DBLE;
        case IMSCP_NONE_VALUE:
            return IMSCP_NONE;
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
    private ChildPointerType(int value, String name, String literal) {
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

} // ChildPointerType
