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
 * <em><b>PSB Language Type</b></em>', and utility methods for working with
 * them. <!-- end-user-doc --> <!-- begin-model-doc --> PSB language types <!--
 * end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#getPSBLanguageType()
 * @model
 * @generated
 */
public enum PSBLanguageType implements Enumerator {
    /**
     * The '<em><b>Imslt ASSEM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSLT_ASSEM_VALUE
     * @generated
     * @ordered
     */
    IMSLT_ASSEM(0, "imslt_ASSEM", "imslt_ASSEM"),

    /**
     * The '<em><b>Imslt C</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSLT_C_VALUE
     * @generated
     * @ordered
     */
    IMSLT_C(1, "imslt_C", "imslt_C"),

    /**
     * The '<em><b>Imslt COBOL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSLT_COBOL_VALUE
     * @generated
     * @ordered
     */
    IMSLT_COBOL(2, "imslt_COBOL", "imslt_COBOL"),

    /**
     * The '<em><b>Imslt PLI</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMSLT_PLI_VALUE
     * @generated
     * @ordered
     */
    IMSLT_PLI(3, "imslt_PLI", "imslt_PLI"),

    /**
     * The '<em><b>Imslt PASCAL</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #IMSLT_PASCAL_VALUE
     * @generated
     * @ordered
     */
    IMSLT_PASCAL(4, "imslt_PASCAL", "imslt_PASCAL");

    /**
     * The '<em><b>Imslt ASSEM</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Assembler programming
     * language <!-- end-model-doc -->
     * 
     * @see #IMSLT_ASSEM
     * @model name="imslt_ASSEM"
     * @generated
     * @ordered
     */
    public static final int IMSLT_ASSEM_VALUE = 0;

    /**
     * The '<em><b>Imslt C</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> C programming language <!--
     * end-model-doc -->
     * 
     * @see #IMSLT_C
     * @model name="imslt_C"
     * @generated
     * @ordered
     */
    public static final int IMSLT_C_VALUE = 1;

    /**
     * The '<em><b>Imslt COBOL</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> COBOL programming language
     * <!-- end-model-doc -->
     * 
     * @see #IMSLT_COBOL
     * @model name="imslt_COBOL"
     * @generated
     * @ordered
     */
    public static final int IMSLT_COBOL_VALUE = 2;

    /**
     * The '<em><b>Imslt PLI</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> PL/I programming language
     * <!-- end-model-doc -->
     * 
     * @see #IMSLT_PLI
     * @model name="imslt_PLI"
     * @generated
     * @ordered
     */
    public static final int IMSLT_PLI_VALUE = 3;

    /**
     * The '<em><b>Imslt PASCAL</b></em>' literal value. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Pascal programming
     * language <!-- end-model-doc -->
     * 
     * @see #IMSLT_PASCAL
     * @model name="imslt_PASCAL"
     * @generated
     * @ordered
     */
    public static final int IMSLT_PASCAL_VALUE = 4;

    /**
     * An array of all the '<em><b>PSB Language Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final PSBLanguageType[] VALUES_ARRAY = new PSBLanguageType[] { IMSLT_ASSEM, IMSLT_C, IMSLT_COBOL, IMSLT_PLI,
            IMSLT_PASCAL, };

    /**
     * A public read-only list of all the '<em><b>PSB Language Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<PSBLanguageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>PSB Language Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PSBLanguageType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PSBLanguageType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>PSB Language Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PSBLanguageType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PSBLanguageType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>PSB Language Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static PSBLanguageType get(int value) {
        switch (value) {
        case IMSLT_ASSEM_VALUE:
            return IMSLT_ASSEM;
        case IMSLT_C_VALUE:
            return IMSLT_C;
        case IMSLT_COBOL_VALUE:
            return IMSLT_COBOL;
        case IMSLT_PLI_VALUE:
            return IMSLT_PLI;
        case IMSLT_PASCAL_VALUE:
            return IMSLT_PASCAL;
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
    private PSBLanguageType(int value, String name, String literal) {
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

} // PSBLanguageType
