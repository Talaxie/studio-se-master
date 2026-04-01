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
 * <em><b>Model Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> Model types <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getModelType()
 * @model
 * @generated
 */
public enum ModelType implements Enumerator {
    /**
     * The '<em><b>Imsdt 1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSDT_1_VALUE
     * @generated
     * @ordered
     */
    IMSDT_1(0, "imsdt_1", "imsdt_1"),

    /**
     * The '<em><b>Imsdt 2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSDT_2_VALUE
     * @generated
     * @ordered
     */
    IMSDT_2(1, "imsdt_2", "imsdt_2"),

    /**
     * The '<em><b>Imsdt 11</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSDT_11_VALUE
     * @generated
     * @ordered
     */
    IMSDT_11(2, "imsdt_11", "imsdt_11");

    /**
     * The '<em><b>Imsdt 1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Imsdt 1</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IMSDT_1
     * @model name="imsdt_1"
     * @generated
     * @ordered
     */
    public static final int IMSDT_1_VALUE = 0;

    /**
     * The '<em><b>Imsdt 2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Imsdt 2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IMSDT_2
     * @model name="imsdt_2"
     * @generated
     * @ordered
     */
    public static final int IMSDT_2_VALUE = 1;

    /**
     * The '<em><b>Imsdt 11</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Imsdt 11</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IMSDT_11
     * @model name="imsdt_11"
     * @generated
     * @ordered
     */
    public static final int IMSDT_11_VALUE = 2;

    /**
     * An array of all the '<em><b>Model Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final ModelType[] VALUES_ARRAY = new ModelType[] { IMSDT_1, IMSDT_2, IMSDT_11, };

    /**
     * A public read-only list of all the '<em><b>Model Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<ModelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Model Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ModelType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ModelType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Model Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ModelType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ModelType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Model Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ModelType get(int value) {
        switch (value) {
        case IMSDT_1_VALUE:
            return IMSDT_1;
        case IMSDT_2_VALUE:
            return IMSDT_2;
        case IMSDT_11_VALUE:
            return IMSDT_11;
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
    private ModelType(int value, String name, String literal) {
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

} // ModelType
