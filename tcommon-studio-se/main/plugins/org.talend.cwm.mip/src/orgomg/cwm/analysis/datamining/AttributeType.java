/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Attribute Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc --> <!-- begin-model-doc --> Defines the possible Attribute
 * types. <!-- end-model-doc -->
 * 
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAttributeType()
 * @model
 * @generated
 */
public enum AttributeType implements Enumerator {
    /**
     * The '<em><b>Categorical</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CATEGORICAL_VALUE
     * @generated
     * @ordered
     */
    CATEGORICAL(0, "categorical", "categorical"),

    /**
     * The '<em><b>Numerical</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NUMERICAL_VALUE
     * @generated
     * @ordered
     */
    NUMERICAL(1, "numerical", "numerical");

    /**
     * The '<em><b>Categorical</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Categorical attribute
     * type. <!-- end-model-doc -->
     * 
     * @see #CATEGORICAL
     * @model name="categorical"
     * @generated
     * @ordered
     */
    public static final int CATEGORICAL_VALUE = 0;

    /**
     * The '<em><b>Numerical</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Numeric attribute type.
     * <!-- end-model-doc -->
     * 
     * @see #NUMERICAL
     * @model name="numerical"
     * @generated
     * @ordered
     */
    public static final int NUMERICAL_VALUE = 1;

    /**
     * An array of all the '<em><b>Attribute Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final AttributeType[] VALUES_ARRAY = new AttributeType[] { CATEGORICAL, NUMERICAL, };

    /**
     * A public read-only list of all the '<em><b>Attribute Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<AttributeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Attribute Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AttributeType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttributeType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attribute Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AttributeType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttributeType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attribute Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AttributeType get(int value) {
        switch (value) {
        case CATEGORICAL_VALUE:
            return CATEGORICAL;
        case NUMERICAL_VALUE:
            return NUMERICAL;
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
    private AttributeType(int value, String name, String literal) {
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

} // AttributeType
