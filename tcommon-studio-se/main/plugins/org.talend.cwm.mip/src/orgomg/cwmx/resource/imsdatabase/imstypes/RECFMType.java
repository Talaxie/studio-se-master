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
 * <em><b>RECFM Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> Record format types <!--
 * end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getRECFMType()
 * @model
 * @generated
 */
public enum RECFMType implements Enumerator {
    /**
     * The '<em><b>Imsrf F</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSRF_F_VALUE
     * @generated
     * @ordered
     */
    IMSRF_F(0, "imsrf_F", "imsrf_F"),

    /**
     * The '<em><b>Imsrf FB</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSRF_FB_VALUE
     * @generated
     * @ordered
     */
    IMSRF_FB(1, "imsrf_FB", "imsrf_FB"),

    /**
     * The '<em><b>Imsrf V</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSRF_V_VALUE
     * @generated
     * @ordered
     */
    IMSRF_V(2, "imsrf_V", "imsrf_V"),

    /**
     * The '<em><b>Imsrf VB</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSRF_VB_VALUE
     * @generated
     * @ordered
     */
    IMSRF_VB(3, "imsrf_VB", "imsrf_VB"),

    /**
     * The '<em><b>Imsrf U</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSRF_U_VALUE
     * @generated
     * @ordered
     */
    IMSRF_U(4, "imsrf_U", "imsrf_U");

    /**
     * The '<em><b>Imsrf F</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Records are Fixed-length <!--
     * end-model-doc -->
     * 
     * @see #IMSRF_F
     * @model name="imsrf_F"
     * @generated
     * @ordered
     */
    public static final int IMSRF_F_VALUE = 0;

    /**
     * The '<em><b>Imsrf FB</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Records are Fixed length
     * and Blocked. <!-- end-model-doc -->
     * 
     * @see #IMSRF_FB
     * @model name="imsrf_FB"
     * @generated
     * @ordered
     */
    public static final int IMSRF_FB_VALUE = 1;

    /**
     * The '<em><b>Imsrf V</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Records are Variable length
     * <!-- end-model-doc -->
     * 
     * @see #IMSRF_V
     * @model name="imsrf_V"
     * @generated
     * @ordered
     */
    public static final int IMSRF_V_VALUE = 2;

    /**
     * The '<em><b>Imsrf VB</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Records are Variable
     * length and Blocked <!-- end-model-doc -->
     * 
     * @see #IMSRF_VB
     * @model name="imsrf_VB"
     * @generated
     * @ordered
     */
    public static final int IMSRF_VB_VALUE = 3;

    /**
     * The '<em><b>Imsrf U</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Record format is Undefined <!--
     * end-model-doc -->
     * 
     * @see #IMSRF_U
     * @model name="imsrf_U"
     * @generated
     * @ordered
     */
    public static final int IMSRF_U_VALUE = 4;

    /**
     * An array of all the '<em><b>RECFM Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final RECFMType[] VALUES_ARRAY = new RECFMType[] { IMSRF_F, IMSRF_FB, IMSRF_V, IMSRF_VB, IMSRF_U, };

    /**
     * A public read-only list of all the '<em><b>RECFM Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<RECFMType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>RECFM Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static RECFMType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            RECFMType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>RECFM Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static RECFMType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            RECFMType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>RECFM Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static RECFMType get(int value) {
        switch (value) {
        case IMSRF_F_VALUE:
            return IMSRF_F;
        case IMSRF_FB_VALUE:
            return IMSRF_FB;
        case IMSRF_V_VALUE:
            return IMSRF_V;
        case IMSRF_VB_VALUE:
            return IMSRF_VB;
        case IMSRF_U_VALUE:
            return IMSRF_U;
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
    private RECFMType(int value, String name, String literal) {
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

} // RECFMType
