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
 * <em><b>File Organization</b></em>', and utility methods for working with
 * them. <!-- end-user-doc --> <!-- begin-model-doc --> An enumeration
 * representing the values that a COBOLFD file organization may take. <!--
 * end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getFileOrganization()
 * @model
 * @generated
 */
public enum FileOrganization implements Enumerator {
    /**
     * The '<em><b>Fo unspecified</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #FO_UNSPECIFIED_VALUE
     * @generated
     * @ordered
     */
    FO_UNSPECIFIED(0, "fo_unspecified", "fo_unspecified"),

    /**
     * The '<em><b>Fo indexed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FO_INDEXED_VALUE
     * @generated
     * @ordered
     */
    FO_INDEXED(1, "fo_indexed", "fo_indexed"),

    /**
     * The '<em><b>Fo relative</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FO_RELATIVE_VALUE
     * @generated
     * @ordered
     */
    FO_RELATIVE(2, "fo_relative", "fo_relative"),

    /**
     * The '<em><b>Fo sequential</b></em>' literal object.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #FO_SEQUENTIAL_VALUE
     * @generated
     * @ordered
     */
    FO_SEQUENTIAL(3, "fo_sequential", "fo_sequential");

    /**
     * The '<em><b>Fo unspecified</b></em>' literal value.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Fo unspecified</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FO_UNSPECIFIED
     * @model name="fo_unspecified"
     * @generated
     * @ordered
     */
    public static final int FO_UNSPECIFIED_VALUE = 0;

    /**
     * The '<em><b>Fo indexed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fo indexed</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FO_INDEXED
     * @model name="fo_indexed"
     * @generated
     * @ordered
     */
    public static final int FO_INDEXED_VALUE = 1;

    /**
     * The '<em><b>Fo relative</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fo relative</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FO_RELATIVE
     * @model name="fo_relative"
     * @generated
     * @ordered
     */
    public static final int FO_RELATIVE_VALUE = 2;

    /**
     * The '<em><b>Fo sequential</b></em>' literal value.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Fo sequential</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FO_SEQUENTIAL
     * @model name="fo_sequential"
     * @generated
     * @ordered
     */
    public static final int FO_SEQUENTIAL_VALUE = 3;

    /**
     * An array of all the '<em><b>File Organization</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final FileOrganization[] VALUES_ARRAY = new FileOrganization[] { FO_UNSPECIFIED, FO_INDEXED, FO_RELATIVE,
            FO_SEQUENTIAL, };

    /**
     * A public read-only list of all the '<em><b>File Organization</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<FileOrganization> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>File Organization</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static FileOrganization get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FileOrganization result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>File Organization</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static FileOrganization getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FileOrganization result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>File Organization</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static FileOrganization get(int value) {
        switch (value) {
        case FO_UNSPECIFIED_VALUE:
            return FO_UNSPECIFIED;
        case FO_INDEXED_VALUE:
            return FO_INDEXED;
        case FO_RELATIVE_VALUE:
            return FO_RELATIVE;
        case FO_SEQUENTIAL_VALUE:
            return FO_SEQUENTIAL;
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
    private FileOrganization(int value, String name, String literal) {
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

} // FileOrganization
