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
 * <em><b>Positioning Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc --> <!-- begin-model-doc --> Positioning types <!--
 * end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getPositioningType()
 * @model
 * @generated
 */
public enum PositioningType implements Enumerator {
    /**
     * The '<em><b>Imsps Single</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSPS_SINGLE_VALUE
     * @generated
     * @ordered
     */
    IMSPS_SINGLE(0, "imsps_Single", "imsps_Single"),

    /**
     * The '<em><b>Imsps Multiple</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSPS_MULTIPLE_VALUE
     * @generated
     * @ordered
     */
    IMSPS_MULTIPLE(1, "imsps_Multiple", "imsps_Multiple");

    /**
     * The '<em><b>Imsps Single</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Single positioning is
     * desired for the logical data structure <!-- end-model-doc -->
     * 
     * @see #IMSPS_SINGLE
     * @model name="imsps_Single"
     * @generated
     * @ordered
     */
    public static final int IMSPS_SINGLE_VALUE = 0;

    /**
     * The '<em><b>Imsps Multiple</b></em>' literal value. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> Multiple positioning
     * is desired for the logical data structure <!-- end-model-doc -->
     * 
     * @see #IMSPS_MULTIPLE
     * @model name="imsps_Multiple"
     * @generated
     * @ordered
     */
    public static final int IMSPS_MULTIPLE_VALUE = 1;

    /**
     * An array of all the '<em><b>Positioning Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final PositioningType[] VALUES_ARRAY = new PositioningType[] { IMSPS_SINGLE, IMSPS_MULTIPLE, };

    /**
     * A public read-only list of all the '<em><b>Positioning Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<PositioningType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Positioning Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PositioningType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PositioningType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Positioning Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PositioningType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PositioningType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Positioning Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PositioningType get(int value) {
        switch (value) {
        case IMSPS_SINGLE_VALUE:
            return IMSPS_SINGLE;
        case IMSPS_MULTIPLE_VALUE:
            return IMSPS_MULTIPLE;
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
    private PositioningType(int value, String name, String literal) {
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

} // PositioningType
