/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Migration Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.talend.core.model.properties.PropertiesPackage#getMigrationStatus()
 * @model
 * @generated
 */
public final class MigrationStatus extends AbstractEnumerator {
    /**
     * The '<em><b>Default</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEFAULT_LITERAL
     * @model name="default"
     * @generated
     * @ordered
     */
    public static final int DEFAULT = 0;

    /**
     * The '<em><b>Ok</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ok</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OK_LITERAL
     * @model name="ok"
     * @generated
     * @ordered
     */
    public static final int OK = 1;

    /**
     * The '<em><b>Failed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Failed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAILED_LITERAL
     * @model name="failed"
     * @generated
     * @ordered
     */
    public static final int FAILED = 2;

    /**
     * The '<em><b>Noimpact</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Noimpact</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NOIMPACT_LITERAL
     * @model name="noimpact"
     * @generated
     * @ordered
     */
    public static final int NOIMPACT = 3;

    /**
     * The '<em><b>Default</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEFAULT
     * @generated
     * @ordered
     */
    public static final MigrationStatus DEFAULT_LITERAL = new MigrationStatus(DEFAULT, "default", "default");

    /**
     * The '<em><b>Ok</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OK
     * @generated
     * @ordered
     */
    public static final MigrationStatus OK_LITERAL = new MigrationStatus(OK, "ok", "ok");

    /**
     * The '<em><b>Failed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAILED
     * @generated
     * @ordered
     */
    public static final MigrationStatus FAILED_LITERAL = new MigrationStatus(FAILED, "failed", "failed");

    /**
     * The '<em><b>Noimpact</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOIMPACT
     * @generated
     * @ordered
     */
    public static final MigrationStatus NOIMPACT_LITERAL = new MigrationStatus(NOIMPACT, "noimpact", "noimpact");

    /**
     * An array of all the '<em><b>Migration Status</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final MigrationStatus[] VALUES_ARRAY =
        new MigrationStatus[] {
            DEFAULT_LITERAL,
            OK_LITERAL,
            FAILED_LITERAL,
            NOIMPACT_LITERAL,
        };

    /**
     * A public read-only list of all the '<em><b>Migration Status</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Migration Status</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MigrationStatus get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MigrationStatus result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Migration Status</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MigrationStatus getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MigrationStatus result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Migration Status</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MigrationStatus get(int value) {
        switch (value) {
            case DEFAULT: return DEFAULT_LITERAL;
            case OK: return OK_LITERAL;
            case FAILED: return FAILED_LITERAL;
            case NOIMPACT: return NOIMPACT_LITERAL;
        }
        return null;
    }

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private MigrationStatus(int value, String name, String literal) {
        super(value, name, literal);
    }

} //MigrationStatus
