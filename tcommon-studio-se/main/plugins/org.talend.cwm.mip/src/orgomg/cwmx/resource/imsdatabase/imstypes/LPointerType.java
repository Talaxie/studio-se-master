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
 * <em><b>LPointer Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getLPointerType()
 * @model
 * @generated
 */
public enum LPointerType implements Enumerator {
    /**
     * The '<em><b>Imslp LTWIN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSLP_LTWIN_VALUE
     * @generated
     * @ordered
     */
    IMSLP_LTWIN(0, "imslp_LTWIN", "imslp_LTWIN"),

    /**
     * The '<em><b>Imslp LTWINBWD</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSLP_LTWINBWD_VALUE
     * @generated
     * @ordered
     */
    IMSLP_LTWINBWD(1, "imslp_LTWINBWD", "imslp_LTWINBWD");

    /**
     * The '<em><b>Imslp LTWIN</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Reserves a 4-byte logical
     * twin forward pointer field in the prefix of occurrences of the logical
     * child segment type being defined. <!-- end-model-doc -->
     * 
     * @see #IMSLP_LTWIN
     * @model name="imslp_LTWIN"
     * @generated
     * @ordered
     */
    public static final int IMSLP_LTWIN_VALUE = 0;

    /**
     * The '<em><b>Imslp LTWINBWD</b></em>' literal value. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> Reserves a 4-byte
     * logical twin forward pointer field and a 4-byte logical twin backward
     * field in the prefix of occurrences of the logical child segment type
     * being defined. <!-- end-model-doc -->
     * 
     * @see #IMSLP_LTWINBWD
     * @model name="imslp_LTWINBWD"
     * @generated
     * @ordered
     */
    public static final int IMSLP_LTWINBWD_VALUE = 1;

    /**
     * An array of all the '<em><b>LPointer Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final LPointerType[] VALUES_ARRAY = new LPointerType[] { IMSLP_LTWIN, IMSLP_LTWINBWD, };

    /**
     * A public read-only list of all the '<em><b>LPointer Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<LPointerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>LPointer Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LPointerType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LPointerType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>LPointer Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LPointerType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LPointerType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>LPointer Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static LPointerType get(int value) {
        switch (value) {
        case IMSLP_LTWIN_VALUE:
            return IMSLP_LTWIN;
        case IMSLP_LTWINBWD_VALUE:
            return IMSLP_LTWINBWD;
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
    private LPointerType(int value, String name, String literal) {
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

} // LPointerType
