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
 * <em><b>LTerm Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> LTerm types <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getLTermType()
 * @model
 * @generated
 */
public enum LTermType implements Enumerator {
    /**
     * The '<em><b>Imstp LTERM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSTP_LTERM_VALUE
     * @generated
     * @ordered
     */
    IMSTP_LTERM(0, "imstp_LTERM", "imstp_LTERM"),

    /**
     * The '<em><b>Imstp NAME</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSTP_NAME_VALUE
     * @generated
     * @ordered
     */
    IMSTP_NAME(1, "imstp_NAME", "imstp_NAME");

    /**
     * The '<em><b>Imstp LTERM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> The PCB ltermName
     * attribute signifies a logical terminal. LTERM=ltermName is used in the
     * DL/I macro statement <!-- end-model-doc -->
     * 
     * @see #IMSTP_LTERM
     * @model name="imstp_LTERM"
     * @generated
     * @ordered
     */
    public static final int IMSTP_LTERM_VALUE = 0;

    /**
     * The '<em><b>Imstp NAME</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> The PCB ltermName
     * attribute signifies a transaction code. NAME=ltermName is used in the
     * DL/I macro statement <!-- end-model-doc -->
     * 
     * @see #IMSTP_NAME
     * @model name="imstp_NAME"
     * @generated
     * @ordered
     */
    public static final int IMSTP_NAME_VALUE = 1;

    /**
     * An array of all the '<em><b>LTerm Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final LTermType[] VALUES_ARRAY = new LTermType[] { IMSTP_LTERM, IMSTP_NAME, };

    /**
     * A public read-only list of all the '<em><b>LTerm Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<LTermType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>LTerm Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LTermType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LTermType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>LTerm Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LTermType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LTermType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>LTerm Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LTermType get(int value) {
        switch (value) {
        case IMSTP_LTERM_VALUE:
            return IMSTP_LTERM;
        case IMSTP_NAME_VALUE:
            return IMSTP_NAME;
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
    private LTermType(int value, String name, String literal) {
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

} // LTermType
