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
 * <em><b>Rules Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> Rules types <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getRulesType()
 * @model
 * @generated
 */
public enum RulesType implements Enumerator {
    /**
     * The '<em><b>Imsrt FIRST</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSRT_FIRST_VALUE
     * @generated
     * @ordered
     */
    IMSRT_FIRST(0, "imsrt_FIRST", "imsrt_FIRST"),

    /**
     * The '<em><b>Imsrt LAST</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSRT_LAST_VALUE
     * @generated
     * @ordered
     */
    IMSRT_LAST(1, "imsrt_LAST", "imsrt_LAST"),

    /**
     * The '<em><b>Imsrt HERE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSRT_HERE_VALUE
     * @generated
     * @ordered
     */
    IMSRT_HERE(2, "imsrt_HERE", "imsrt_HERE");

    /**
     * The '<em><b>Imsrt FIRST</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> For segments without a
     * sequence field defined, a new occurrence is inserted before all existing
     * physical twins. For segments with a nonunique sequence field defined, a
     * new occurrence is inserted before all existing physical twins with the
     * same sequence field value. <!-- end-model-doc -->
     * 
     * @see #IMSRT_FIRST
     * @model name="imsrt_FIRST"
     * @generated
     * @ordered
     */
    public static final int IMSRT_FIRST_VALUE = 0;

    /**
     * The '<em><b>Imsrt LAST</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> For segments without a
     * sequence field defined, a new occurrence is inserted after all existing
     * physical twins. For segments with a nonunique sequence field defined, a
     * new occurrence is inserted after all existing physical twins with the
     * same sequence field value. <!-- end-model-doc -->
     * 
     * @see #IMSRT_LAST
     * @model name="imsrt_LAST"
     * @generated
     * @ordered
     */
    public static final int IMSRT_LAST_VALUE = 1;

    /**
     * The '<em><b>Imsrt HERE</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> For segments without a
     * sequence field, a new occurrence is inserted immediately before the
     * physical twin on which position was established. If a position was not
     * established on a physical twin of the segment being inserted, the new
     * occurrence is inserted before all existing physical twins. For segments
     * with a nonunique sequence field defined, a new occurrence is inserted
     * immediately before the physical twin with the same sequence field value
     * on which position was established. If a position was not established on a
     * physical twin with the same sequence field value, the new occurrence is
     * inserted before all physical twins with the same sequence field value.
     * The insert position is dependent on the position established by the
     * previous DL/I call. <!-- end-model-doc -->
     * 
     * @see #IMSRT_HERE
     * @model name="imsrt_HERE"
     * @generated
     * @ordered
     */
    public static final int IMSRT_HERE_VALUE = 2;

    /**
     * An array of all the '<em><b>Rules Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final RulesType[] VALUES_ARRAY = new RulesType[] { IMSRT_FIRST, IMSRT_LAST, IMSRT_HERE, };

    /**
     * A public read-only list of all the '<em><b>Rules Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<RulesType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Rules Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static RulesType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            RulesType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Rules Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static RulesType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            RulesType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Rules Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static RulesType get(int value) {
        switch (value) {
        case IMSRT_FIRST_VALUE:
            return IMSRT_FIRST;
        case IMSRT_LAST_VALUE:
            return IMSRT_LAST;
        case IMSRT_HERE_VALUE:
            return IMSRT_HERE;
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
    private RulesType(int value, String name, String literal) {
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

} // RulesType
