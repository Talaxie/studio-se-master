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
 * <em><b>Pointer Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc --> <!-- begin-model-doc --> Pointer types <!--
 * end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getPointerType()
 * @model
 * @generated
 */
public enum PointerType implements Enumerator {
    /**
     * The '<em><b>Imspn NOTWIN</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSPN_NOTWIN_VALUE
     * @generated
     * @ordered
     */
    IMSPN_NOTWIN(0, "imspn_NOTWIN", "imspn_NOTWIN"),

    /**
     * The '<em><b>Imspn TWIN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSPN_TWIN_VALUE
     * @generated
     * @ordered
     */
    IMSPN_TWIN(1, "imspn_TWIN", "imspn_TWIN"),

    /**
     * The '<em><b>Imspn HIER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSPN_HIER_VALUE
     * @generated
     * @ordered
     */
    IMSPN_HIER(2, "imspn_HIER", "imspn_HIER"),

    /**
     * The '<em><b>Imspn TWINBWD</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSPN_TWINBWD_VALUE
     * @generated
     * @ordered
     */
    IMSPN_TWINBWD(3, "imspn_TWINBWD", "imspn_TWINBWD"),

    /**
     * The '<em><b>Imspn HIERBWD</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSPN_HIERBWD_VALUE
     * @generated
     * @ordered
     */
    IMSPN_HIERBWD(4, "imspn_HIERBWD", "imspn_HIERBWD");

    /**
     * The '<em><b>Imspn NOTWIN</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Is used to prevent
     * reserving space for a physical twin forward pointer in the prefix of
     * occurrences of the segment type being defined. <!-- end-model-doc -->
     * 
     * @see #IMSPN_NOTWIN
     * @model name="imspn_NOTWIN"
     * @generated
     * @ordered
     */
    public static final int IMSPN_NOTWIN_VALUE = 0;

    /**
     * The '<em><b>Imspn TWIN</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Reserves a 4-byte physical
     * twin forward pointer field in the segment prefix being defined. <!--
     * end-model-doc -->
     * 
     * @see #IMSPN_TWIN
     * @model name="imspn_TWIN"
     * @generated
     * @ordered
     */
    public static final int IMSPN_TWIN_VALUE = 1;

    /**
     * The '<em><b>Imspn HIER</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Reserves a 4-byte
     * hierarchic forward pointer field in the prefix of occurrences of the
     * segment type being defined. <!-- end-model-doc -->
     * 
     * @see #IMSPN_HIER
     * @model name="imspn_HIER"
     * @generated
     * @ordered
     */
    public static final int IMSPN_HIER_VALUE = 2;

    /**
     * The '<em><b>Imspn TWINBWD</b></em>' literal value. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> Reserves a 4-byte
     * physical twin forward pointer field and a 4-byte physical twin backward
     * pointer field in the segment prefix being defined. The twin backward
     * pointers provide increased delete performance. <!-- end-model-doc -->
     * 
     * @see #IMSPN_TWINBWD
     * @model name="imspn_TWINBWD"
     * @generated
     * @ordered
     */
    public static final int IMSPN_TWINBWD_VALUE = 3;

    /**
     * The '<em><b>Imspn HIERBWD</b></em>' literal value. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> Reserves a 4-byte
     * hierarchic forward pointer field and a 4-byte hierarchic backward pointer
     * field in the prefix of occurrences of the segment type being defined.
     * Hierarchic backward pointers provide increased delete performance. <!--
     * end-model-doc -->
     * 
     * @see #IMSPN_HIERBWD
     * @model name="imspn_HIERBWD"
     * @generated
     * @ordered
     */
    public static final int IMSPN_HIERBWD_VALUE = 4;

    /**
     * An array of all the '<em><b>Pointer Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final PointerType[] VALUES_ARRAY = new PointerType[] { IMSPN_NOTWIN, IMSPN_TWIN, IMSPN_HIER, IMSPN_TWINBWD,
            IMSPN_HIERBWD, };

    /**
     * A public read-only list of all the '<em><b>Pointer Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<PointerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Pointer Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PointerType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PointerType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Pointer Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PointerType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PointerType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Pointer Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PointerType get(int value) {
        switch (value) {
        case IMSPN_NOTWIN_VALUE:
            return IMSPN_NOTWIN;
        case IMSPN_TWIN_VALUE:
            return IMSPN_TWIN;
        case IMSPN_HIER_VALUE:
            return IMSPN_HIER;
        case IMSPN_TWINBWD_VALUE:
            return IMSPN_TWINBWD;
        case IMSPN_HIERBWD_VALUE:
            return IMSPN_HIERBWD;
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
    private PointerType(int value, String name, String literal) {
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

} // PointerType
