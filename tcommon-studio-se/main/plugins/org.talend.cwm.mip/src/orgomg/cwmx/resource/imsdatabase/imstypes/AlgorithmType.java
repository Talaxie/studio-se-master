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
 * <em><b>Algorithm Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc --> <!-- begin-model-doc --> LPointer types <!--
 * end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getAlgorithmType()
 * @model
 * @generated
 */
public enum AlgorithmType implements Enumerator {
    /**
     * The '<em><b>Imsat 0</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAT_0_VALUE
     * @generated
     * @ordered
     */
    IMSAT_0(0, "imsat_0", "imsat_0"),

    /**
     * The '<em><b>Imsat 1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAT_1_VALUE
     * @generated
     * @ordered
     */
    IMSAT_1(1, "imsat_1", "imsat_1"),

    /**
     * The '<em><b>Imsat 2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAT_2_VALUE
     * @generated
     * @ordered
     */
    IMSAT_2(2, "imsat_2", "imsat_2");

    /**
     * The '<em><b>Imsat 0</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Specifies that IMS chooses
     * which HD space search algorithm to use. Maps to a value of SEARCHA=0.
     * <!-- end-model-doc -->
     * 
     * @see #IMSAT_0
     * @model name="imsat_0"
     * @generated
     * @ordered
     */
    public static final int IMSAT_0_VALUE = 0;

    /**
     * The '<em><b>Imsat 1</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Specifies that IMS uses the HD
     * space search algorithm that does not search for space in the second-most
     * desirable block or CI. Maps to SEARCHA=1
     * 
     * <!-- end-model-doc -->
     * 
     * @see #IMSAT_1
     * @model name="imsat_1"
     * @generated
     * @ordered
     */
    public static final int IMSAT_1_VALUE = 1;

    /**
     * The '<em><b>Imsat 2</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Specifies that IMS uses the HD
     * space search algorithm that includes a search for space in the
     * second-most desirable block or CI. Maps to SEARCHA=2 <!-- end-model-doc
     * -->
     * 
     * @see #IMSAT_2
     * @model name="imsat_2"
     * @generated
     * @ordered
     */
    public static final int IMSAT_2_VALUE = 2;

    /**
     * An array of all the '<em><b>Algorithm Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final AlgorithmType[] VALUES_ARRAY = new AlgorithmType[] { IMSAT_0, IMSAT_1, IMSAT_2, };

    /**
     * A public read-only list of all the '<em><b>Algorithm Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<AlgorithmType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Algorithm Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AlgorithmType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AlgorithmType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Algorithm Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AlgorithmType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AlgorithmType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Algorithm Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AlgorithmType get(int value) {
        switch (value) {
        case IMSAT_0_VALUE:
            return IMSAT_0;
        case IMSAT_1_VALUE:
            return IMSAT_1;
        case IMSAT_2_VALUE:
            return IMSAT_2;
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
    private AlgorithmType(int value, String name, String literal) {
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

} // AlgorithmType
