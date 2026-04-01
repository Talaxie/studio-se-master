/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Block Kind</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> An enumeration representing the
 * values that COBOLFD block size fields may take. <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getBlockKind()
 * @model
 * @generated
 */
public enum BlockKind implements Enumerator {
    /**
     * The '<em><b>Bk records</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BK_RECORDS_VALUE
     * @generated
     * @ordered
     */
    BK_RECORDS(0, "bk_records", "bk_records"),

    /**
     * The '<em><b>Bk characters</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #BK_CHARACTERS_VALUE
     * @generated
     * @ordered
     */
    BK_CHARACTERS(1, "bk_characters", "bk_characters");

    /**
     * The '<em><b>Bk records</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bk records</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BK_RECORDS
     * @model name="bk_records"
     * @generated
     * @ordered
     */
    public static final int BK_RECORDS_VALUE = 0;

    /**
     * The '<em><b>Bk characters</b></em>' literal value.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Bk characters</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BK_CHARACTERS
     * @model name="bk_characters"
     * @generated
     * @ordered
     */
    public static final int BK_CHARACTERS_VALUE = 1;

    /**
     * An array of all the '<em><b>Block Kind</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final BlockKind[] VALUES_ARRAY = new BlockKind[] { BK_RECORDS, BK_CHARACTERS, };

    /**
     * A public read-only list of all the '<em><b>Block Kind</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<BlockKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Block Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static BlockKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BlockKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Block Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static BlockKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BlockKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Block Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static BlockKind get(int value) {
        switch (value) {
        case BK_RECORDS_VALUE:
            return BK_RECORDS;
        case BK_CHARACTERS_VALUE:
            return BK_CHARACTERS;
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
    private BlockKind(int value, String name, String literal) {
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

} // BlockKind
