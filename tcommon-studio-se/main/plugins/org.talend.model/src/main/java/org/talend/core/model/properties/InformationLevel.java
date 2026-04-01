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
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Information Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.talend.core.model.properties.PropertiesPackage#getInformationLevel()
 * @model
 * @generated
 */
public final class InformationLevel extends AbstractEnumerator
{
    /**
     * The '<em><b>DEBUG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEBUG_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int DEBUG = 10;

    /**
     * The '<em><b>INFO</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INFO_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int INFO = 20;

    /**
     * The '<em><b>WARN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WARN_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int WARN = 30;

    /**
     * The '<em><b>ERROR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ERROR_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int ERROR = 40;

    /**
     * The '<em><b>DEBUG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEBUG
     * @generated
     * @ordered
     */
    public static final InformationLevel DEBUG_LITERAL = new InformationLevel(DEBUG, "DEBUG", "DEBUG");

    /**
     * The '<em><b>INFO</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INFO
     * @generated
     * @ordered
     */
    public static final InformationLevel INFO_LITERAL = new InformationLevel(INFO, "INFO", "INFO");

    /**
     * The '<em><b>WARN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WARN
     * @generated
     * @ordered
     */
    public static final InformationLevel WARN_LITERAL = new InformationLevel(WARN, "WARN", "WARN");

    /**
     * The '<em><b>ERROR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ERROR
     * @generated
     * @ordered
     */
    public static final InformationLevel ERROR_LITERAL = new InformationLevel(ERROR, "ERROR", "ERROR");

    /**
     * An array of all the '<em><b>Information Level</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InformationLevel[] VALUES_ARRAY =
        new InformationLevel[] {
            DEBUG_LITERAL,
            INFO_LITERAL,
            WARN_LITERAL,
            ERROR_LITERAL,
        };

    /**
     * A public read-only list of all the '<em><b>Information Level</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Information Level</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InformationLevel get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InformationLevel result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Information Level</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InformationLevel getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InformationLevel result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Information Level</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InformationLevel get(int value) {
        switch (value) {
            case DEBUG: return DEBUG_LITERAL;
            case INFO: return INFO_LITERAL;
            case WARN: return WARN_LITERAL;
            case ERROR: return ERROR_LITERAL;
        }
        return null;
    }

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private InformationLevel(int value, String name, String literal) {
        super(value, name, literal);
    }
}
