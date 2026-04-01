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
 * <em><b>Flags Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> Flag types <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getFlagsType()
 * @model
 * @generated
 */
public enum FlagsType implements Enumerator {
    /**
     * The '<em><b>Imsft P</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSFT_P_VALUE
     * @generated
     * @ordered
     */
    IMSFT_P(0, "imsft_P", "imsft_P"),

    /**
     * The '<em><b>Imsft L</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSFT_L_VALUE
     * @generated
     * @ordered
     */
    IMSFT_L(1, "imsft_L", "imsft_L"),

    /**
     * The '<em><b>Imsft V</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSFT_V_VALUE
     * @generated
     * @ordered
     */
    IMSFT_V(2, "imsft_V", "imsft_V"),

    /**
     * The '<em><b>Imdft B</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMDFT_B_VALUE
     * @generated
     * @ordered
     */
    IMDFT_B(3, "imdft_B", "imdft_B");

    /**
     * The '<em><b>Imsft P</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Specifies the path type that
     * must be used to insert, delete, or replace a segment is physical. <!--
     * end-model-doc -->
     * 
     * @see #IMSFT_P
     * @model name="imsft_P"
     * @generated
     * @ordered
     */
    public static final int IMSFT_P_VALUE = 0;

    /**
     * The '<em><b>Imsft L</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Specifies the path type that
     * must be used to insert, delete, or replace a segment is logical. <!--
     * end-model-doc -->
     * 
     * @see #IMSFT_L
     * @model name="imsft_L"
     * @generated
     * @ordered
     */
    public static final int IMSFT_L_VALUE = 1;

    /**
     * The '<em><b>Imsft V</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Specifies the path type that
     * must be used to insert, delete, or replace a segment is virtual. <!--
     * end-model-doc -->
     * 
     * @see #IMSFT_V
     * @model name="imsft_V"
     * @generated
     * @ordered
     */
    public static final int IMSFT_V_VALUE = 2;

    /**
     * The '<em><b>Imdft B</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Specifies the path type that
     * must be used to insert, delete, or replace a segment is bidirectional
     * virtual. <!-- end-model-doc -->
     * 
     * @see #IMDFT_B
     * @model name="imdft_B"
     * @generated
     * @ordered
     */
    public static final int IMDFT_B_VALUE = 3;

    /**
     * An array of all the '<em><b>Flags Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final FlagsType[] VALUES_ARRAY = new FlagsType[] { IMSFT_P, IMSFT_L, IMSFT_V, IMDFT_B, };

    /**
     * A public read-only list of all the '<em><b>Flags Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<FlagsType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Flags Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static FlagsType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FlagsType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Flags Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static FlagsType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FlagsType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Flags Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static FlagsType get(int value) {
        switch (value) {
        case IMSFT_P_VALUE:
            return IMSFT_P;
        case IMSFT_L_VALUE:
            return IMSFT_L;
        case IMSFT_V_VALUE:
            return IMSFT_V;
        case IMDFT_B_VALUE:
            return IMDFT_B;
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
    private FlagsType(int value, String name, String literal) {
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

} // FlagsType
