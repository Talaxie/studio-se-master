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
 * <em><b>PCB Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> PCB types <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getPCBType()
 * @model
 * @generated
 */
public enum PCBType implements Enumerator {
    /**
     * The '<em><b>Imspt DB</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSPT_DB_VALUE
     * @generated
     * @ordered
     */
    IMSPT_DB(0, "imspt_DB", "imspt_DB"),

    /**
     * The '<em><b>Imspt GSAM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSPT_GSAM_VALUE
     * @generated
     * @ordered
     */
    IMSPT_GSAM(1, "imspt_GSAM", "imspt_GSAM"),

    /**
     * The '<em><b>Imspt TP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSPT_TP_VALUE
     * @generated
     * @ordered
     */
    IMSPT_TP(2, "imspt_TP", "imspt_TP");

    /**
     * The '<em><b>Imspt DB</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> database type <!--
     * end-model-doc -->
     * 
     * @see #IMSPT_DB
     * @model name="imspt_DB"
     * @generated
     * @ordered
     */
    public static final int IMSPT_DB_VALUE = 0;

    /**
     * The '<em><b>Imspt GSAM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> GSAM type - connects to a
     * GSAM DBD as a link to a file. <!-- end-model-doc -->
     * 
     * @see #IMSPT_GSAM
     * @model name="imspt_GSAM"
     * @generated
     * @ordered
     */
    public static final int IMSPT_GSAM_VALUE = 1;

    /**
     * The '<em><b>Imspt TP</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Teleprocessing type <!--
     * end-model-doc -->
     * 
     * @see #IMSPT_TP
     * @model name="imspt_TP"
     * @generated
     * @ordered
     */
    public static final int IMSPT_TP_VALUE = 2;

    /**
     * An array of all the '<em><b>PCB Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final PCBType[] VALUES_ARRAY = new PCBType[] { IMSPT_DB, IMSPT_GSAM, IMSPT_TP, };

    /**
     * A public read-only list of all the '<em><b>PCB Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<PCBType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>PCB Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PCBType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PCBType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>PCB Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PCBType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PCBType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>PCB Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PCBType get(int value) {
        switch (value) {
        case IMSPT_DB_VALUE:
            return IMSPT_DB;
        case IMSPT_GSAM_VALUE:
            return IMSPT_GSAM;
        case IMSPT_TP_VALUE:
            return IMSPT_TP;
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
    private PCBType(int value, String name, String literal) {
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

} // PCBType
