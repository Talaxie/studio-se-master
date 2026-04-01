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
 * <em><b>Access Method Type</b></em>', and utility methods for working with
 * them. <!-- end-user-doc --> <!-- begin-model-doc --> Access method types <!--
 * end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getAccessMethodType()
 * @model
 * @generated
 */
public enum AccessMethodType implements Enumerator {
    /**
     * The '<em><b>Imsam DEDB</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAM_DEDB_VALUE
     * @generated
     * @ordered
     */
    IMSAM_DEDB(0, "imsam_DEDB", "imsam_DEDB"),

    /**
     * The '<em><b>Imsam GSAM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAM_GSAM_VALUE
     * @generated
     * @ordered
     */
    IMSAM_GSAM(1, "imsam_GSAM", "imsam_GSAM"),

    /**
     * The '<em><b>Imsam HDAM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAM_HDAM_VALUE
     * @generated
     * @ordered
     */
    IMSAM_HDAM(2, "imsam_HDAM", "imsam_HDAM"),

    /**
     * The '<em><b>Imsam HIDAM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAM_HIDAM_VALUE
     * @generated
     * @ordered
     */
    IMSAM_HIDAM(3, "imsam_HIDAM", "imsam_HIDAM"),

    /**
     * The '<em><b>Imsam HISAM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAM_HISAM_VALUE
     * @generated
     * @ordered
     */
    IMSAM_HISAM(4, "imsam_HISAM", "imsam_HISAM"),

    /**
     * The '<em><b>Imsam HSAM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAM_HSAM_VALUE
     * @generated
     * @ordered
     */
    IMSAM_HSAM(5, "imsam_HSAM", "imsam_HSAM"),

    /**
     * The '<em><b>Imsam INDEX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAM_INDEX_VALUE
     * @generated
     * @ordered
     */
    IMSAM_INDEX(6, "imsam_INDEX", "imsam_INDEX"),

    /**
     * The '<em><b>Imsam LOGICAL</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSAM_LOGICAL_VALUE
     * @generated
     * @ordered
     */
    IMSAM_LOGICAL(7, "imsam_LOGICAL", "imsam_LOGICAL"),

    /**
     * The '<em><b>Imsam MSDB</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAM_MSDB_VALUE
     * @generated
     * @ordered
     */
    IMSAM_MSDB(8, "imsam_MSDB", "imsam_MSDB"),

    /**
     * The '<em><b>Imsam PSINDEX</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSAM_PSINDEX_VALUE
     * @generated
     * @ordered
     */
    IMSAM_PSINDEX(9, "imsam_PSINDEX", "imsam_PSINDEX"),

    /**
     * The '<em><b>Imsam PHDAM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAM_PHDAM_VALUE
     * @generated
     * @ordered
     */
    IMSAM_PHDAM(10, "imsam_PHDAM", "imsam_PHDAM"),

    /**
     * The '<em><b>Imsam PHIDAM</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSAM_PHIDAM_VALUE
     * @generated
     * @ordered
     */
    IMSAM_PHIDAM(11, "imsam_PHIDAM", "imsam_PHIDAM"),

    /**
     * The '<em><b>Imsam SHSAM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSAM_SHSAM_VALUE
     * @generated
     * @ordered
     */
    IMSAM_SHSAM(12, "imsam_SHSAM", "imsam_SHSAM"),

    /**
     * The '<em><b>Imsam SHISAM</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSAM_SHISAM_VALUE
     * @generated
     * @ordered
     */
    IMSAM_SHISAM(13, "imsam_SHISAM", "imsam_SHISAM");

    /**
     * The '<em><b>Imsam DEDB</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Data Entry Data Base <!--
     * end-model-doc -->
     * 
     * @see #IMSAM_DEDB
     * @model name="imsam_DEDB"
     * @generated
     * @ordered
     */
    public static final int IMSAM_DEDB_VALUE = 0;

    /**
     * The '<em><b>Imsam GSAM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Generalized Sequential
     * Access Method <!-- end-model-doc -->
     * 
     * @see #IMSAM_GSAM
     * @model name="imsam_GSAM"
     * @generated
     * @ordered
     */
    public static final int IMSAM_GSAM_VALUE = 1;

    /**
     * The '<em><b>Imsam HDAM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Hierarchical Direct Access
     * Method <!-- end-model-doc -->
     * 
     * @see #IMSAM_HDAM
     * @model name="imsam_HDAM"
     * @generated
     * @ordered
     */
    public static final int IMSAM_HDAM_VALUE = 2;

    /**
     * The '<em><b>Imsam HIDAM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Hierarchical Indexed
     * Direct Access Method <!-- end-model-doc -->
     * 
     * @see #IMSAM_HIDAM
     * @model name="imsam_HIDAM"
     * @generated
     * @ordered
     */
    public static final int IMSAM_HIDAM_VALUE = 3;

    /**
     * The '<em><b>Imsam HISAM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Hierarchical Indexed
     * Sequential Access Method <!-- end-model-doc -->
     * 
     * @see #IMSAM_HISAM
     * @model name="imsam_HISAM"
     * @generated
     * @ordered
     */
    public static final int IMSAM_HISAM_VALUE = 4;

    /**
     * The '<em><b>Imsam HSAM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Hierarchical Sequential
     * Access Method <!-- end-model-doc -->
     * 
     * @see #IMSAM_HSAM
     * @model name="imsam_HSAM"
     * @generated
     * @ordered
     */
    public static final int IMSAM_HSAM_VALUE = 5;

    /**
     * The '<em><b>Imsam INDEX</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> index database <!--
     * end-model-doc -->
     * 
     * @see #IMSAM_INDEX
     * @model name="imsam_INDEX"
     * @generated
     * @ordered
     */
    public static final int IMSAM_INDEX_VALUE = 6;

    /**
     * The '<em><b>Imsam LOGICAL</b></em>' literal value. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> Logical database <!--
     * end-model-doc -->
     * 
     * @see #IMSAM_LOGICAL
     * @model name="imsam_LOGICAL"
     * @generated
     * @ordered
     */
    public static final int IMSAM_LOGICAL_VALUE = 7;

    /**
     * The '<em><b>Imsam MSDB</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Mass Storage Data Base
     * <!-- end-model-doc -->
     * 
     * @see #IMSAM_MSDB
     * @model name="imsam_MSDB"
     * @generated
     * @ordered
     */
    public static final int IMSAM_MSDB_VALUE = 8;

    /**
     * The '<em><b>Imsam PSINDEX</b></em>' literal value. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> Partitioned Index <!--
     * end-model-doc -->
     * 
     * @see #IMSAM_PSINDEX
     * @model name="imsam_PSINDEX"
     * @generated
     * @ordered
     */
    public static final int IMSAM_PSINDEX_VALUE = 9;

    /**
     * The '<em><b>Imsam PHDAM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Partitioned HDAM <!--
     * end-model-doc -->
     * 
     * @see #IMSAM_PHDAM
     * @model name="imsam_PHDAM"
     * @generated
     * @ordered
     */
    public static final int IMSAM_PHDAM_VALUE = 10;

    /**
     * The '<em><b>Imsam PHIDAM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Partitioned HIDAM <!--
     * end-model-doc -->
     * 
     * @see #IMSAM_PHIDAM
     * @model name="imsam_PHIDAM"
     * @generated
     * @ordered
     */
    public static final int IMSAM_PHIDAM_VALUE = 11;

    /**
     * The '<em><b>Imsam SHSAM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Simple (single segment)
     * HSAM <!-- end-model-doc -->
     * 
     * @see #IMSAM_SHSAM
     * @model name="imsam_SHSAM"
     * @generated
     * @ordered
     */
    public static final int IMSAM_SHSAM_VALUE = 12;

    /**
     * The '<em><b>Imsam SHISAM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Simple (single segment)
     * HISAM <!-- end-model-doc -->
     * 
     * @see #IMSAM_SHISAM
     * @model name="imsam_SHISAM"
     * @generated
     * @ordered
     */
    public static final int IMSAM_SHISAM_VALUE = 13;

    /**
     * An array of all the '<em><b>Access Method Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static final AccessMethodType[] VALUES_ARRAY = new AccessMethodType[] { IMSAM_DEDB, IMSAM_GSAM, IMSAM_HDAM,
            IMSAM_HIDAM, IMSAM_HISAM, IMSAM_HSAM, IMSAM_INDEX, IMSAM_LOGICAL, IMSAM_MSDB, IMSAM_PSINDEX, IMSAM_PHDAM,
            IMSAM_PHIDAM, IMSAM_SHSAM, IMSAM_SHISAM, };

    /**
     * A public read-only list of all the '<em><b>Access Method Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<AccessMethodType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Access Method Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AccessMethodType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AccessMethodType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Access Method Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AccessMethodType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AccessMethodType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Access Method Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static AccessMethodType get(int value) {
        switch (value) {
        case IMSAM_DEDB_VALUE:
            return IMSAM_DEDB;
        case IMSAM_GSAM_VALUE:
            return IMSAM_GSAM;
        case IMSAM_HDAM_VALUE:
            return IMSAM_HDAM;
        case IMSAM_HIDAM_VALUE:
            return IMSAM_HIDAM;
        case IMSAM_HISAM_VALUE:
            return IMSAM_HISAM;
        case IMSAM_HSAM_VALUE:
            return IMSAM_HSAM;
        case IMSAM_INDEX_VALUE:
            return IMSAM_INDEX;
        case IMSAM_LOGICAL_VALUE:
            return IMSAM_LOGICAL;
        case IMSAM_MSDB_VALUE:
            return IMSAM_MSDB;
        case IMSAM_PSINDEX_VALUE:
            return IMSAM_PSINDEX;
        case IMSAM_PHDAM_VALUE:
            return IMSAM_PHDAM;
        case IMSAM_PHIDAM_VALUE:
            return IMSAM_PHIDAM;
        case IMSAM_SHSAM_VALUE:
            return IMSAM_SHSAM;
        case IMSAM_SHISAM_VALUE:
            return IMSAM_SHISAM;
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
    private AccessMethodType(int value, String name, String literal) {
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

} // AccessMethodType
