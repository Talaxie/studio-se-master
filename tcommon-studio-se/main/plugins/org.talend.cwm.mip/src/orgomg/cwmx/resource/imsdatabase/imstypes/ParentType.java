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
 * <em><b>Parent Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getParentType()
 * @model
 * @generated
 */
public enum ParentType implements Enumerator {
    /**
     * The '<em><b>Ims VIRTUAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMS_VIRTUAL_VALUE
     * @generated
     * @ordered
     */
    IMS_VIRTUAL(0, "ims_VIRTUAL", "ims_VIRTUAL"),

    /**
     * The '<em><b>Ims PHYSICAL</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMS_PHYSICAL_VALUE
     * @generated
     * @ordered
     */
    IMS_PHYSICAL(1, "ims_PHYSICAL", "ims_PHYSICAL");

    /**
     * The '<em><b>Ims VIRTUAL</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> the concatenated key of
     * the logical parent segment is not stored with each logical child segment
     * <!-- end-model-doc -->
     * 
     * @see #IMS_VIRTUAL
     * @model name="ims_VIRTUAL"
     * @generated
     * @ordered
     */
    public static final int IMS_VIRTUAL_VALUE = 0;

    /**
     * The '<em><b>Ims PHYSICAL</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> the concatenated key of
     * the logical parent segment is physically stored with each logical child
     * segment <!-- end-model-doc -->
     * 
     * @see #IMS_PHYSICAL
     * @model name="ims_PHYSICAL"
     * @generated
     * @ordered
     */
    public static final int IMS_PHYSICAL_VALUE = 1;

    /**
     * An array of all the '<em><b>Parent Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final ParentType[] VALUES_ARRAY = new ParentType[] { IMS_VIRTUAL, IMS_PHYSICAL, };

    /**
     * A public read-only list of all the '<em><b>Parent Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<ParentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Parent Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ParentType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParentType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Parent Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ParentType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParentType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Parent Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ParentType get(int value) {
        switch (value) {
        case IMS_VIRTUAL_VALUE:
            return IMS_VIRTUAL;
        case IMS_PHYSICAL_VALUE:
            return IMS_PHYSICAL;
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
    private ParentType(int value, String name, String literal) {
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

} // ParentType
