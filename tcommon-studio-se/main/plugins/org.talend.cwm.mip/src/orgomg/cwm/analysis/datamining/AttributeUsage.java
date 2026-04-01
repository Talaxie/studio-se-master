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
 * <em><b>Attribute Usage</b></em>', and utility methods for working with them.
 * <!-- end-user-doc --> <!-- begin-model-doc --> Ways to use an attribute as
 * part of a mining operation. <!-- end-model-doc -->
 * 
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAttributeUsage()
 * @model
 * @generated
 */
public enum AttributeUsage implements Enumerator {
    /**
     * The '<em><b>Active</b></em>' literal object.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #ACTIVE_VALUE
     * @generated
     * @ordered
     */
    ACTIVE(0, "active", "active"),

    /**
     * The '<em><b>Inactive</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INACTIVE_VALUE
     * @generated
     * @ordered
     */
    INACTIVE(1, "inactive", "inactive"),

    /**
     * The '<em><b>Supplementary</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #SUPPLEMENTARY_VALUE
     * @generated
     * @ordered
     */
    SUPPLEMENTARY(2, "supplementary", "supplementary");

    /**
     * The '<em><b>Active</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Active attributes contribute to
     * the model building process <!-- end-model-doc -->
     * 
     * @see #ACTIVE
     * @model name="active"
     * @generated
     * @ordered
     */
    public static final int ACTIVE_VALUE = 0;

    /**
     * The '<em><b>Inactive</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Inactive attributes
     * provide supplementary data that may be useful as part of the analysis.
     * <!-- end-model-doc -->
     * 
     * @see #INACTIVE
     * @model name="inactive"
     * @generated
     * @ordered
     */
    public static final int INACTIVE_VALUE = 1;

    /**
     * The '<em><b>Supplementary</b></em>' literal value. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> Supplementary
     * attributes provide any other supplementary data useful to the analysis.
     * <!-- end-model-doc -->
     * 
     * @see #SUPPLEMENTARY
     * @model name="supplementary"
     * @generated
     * @ordered
     */
    public static final int SUPPLEMENTARY_VALUE = 2;

    /**
     * An array of all the '<em><b>Attribute Usage</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final AttributeUsage[] VALUES_ARRAY = new AttributeUsage[] { ACTIVE, INACTIVE, SUPPLEMENTARY, };

    /**
     * A public read-only list of all the '<em><b>Attribute Usage</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<AttributeUsage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Attribute Usage</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AttributeUsage get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttributeUsage result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attribute Usage</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AttributeUsage getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttributeUsage result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attribute Usage</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AttributeUsage get(int value) {
        switch (value) {
        case ACTIVE_VALUE:
            return ACTIVE;
        case INACTIVE_VALUE:
            return INACTIVE;
        case SUPPLEMENTARY_VALUE:
            return SUPPLEMENTARY;
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
    private AttributeUsage(int value, String name, String literal) {
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

} // AttributeUsage
