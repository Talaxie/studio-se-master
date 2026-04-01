/**
 * <copyright> </copyright>
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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Folder Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * @see org.talend.core.model.properties.PropertiesPackage#getFolderType()
 * @model
 * @generated
 */
public final class FolderType extends AbstractEnumerator
{
    /**
     * The '<em><b>FOLDER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FOLDER</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FOLDER_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int FOLDER = 0;

    /**
     * The '<em><b>SYSTEM FOLDER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SYSTEM FOLDER</b></em>' literal object isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SYSTEM_FOLDER_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int SYSTEM_FOLDER = 1;

    /**
     * The '<em><b>STABLE SYSTEM FOLDER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>STABLE SYSTEM FOLDER</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STABLE_SYSTEM_FOLDER_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int STABLE_SYSTEM_FOLDER = 2;

    /**
     * The '<em><b>FOLDER</b></em>' literal object.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #FOLDER
     * @generated
     * @ordered
     */
    public static final FolderType FOLDER_LITERAL = new FolderType(FOLDER, "FOLDER", "FOLDER");

    /**
     * The '<em><b>SYSTEM FOLDER</b></em>' literal object.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #SYSTEM_FOLDER
     * @generated
     * @ordered
     */
    public static final FolderType SYSTEM_FOLDER_LITERAL = new FolderType(SYSTEM_FOLDER, "SYSTEM_FOLDER", "SYSTEM_FOLDER");

    /**
     * The '<em><b>STABLE SYSTEM FOLDER</b></em>' literal object.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #STABLE_SYSTEM_FOLDER
     * @generated
     * @ordered
     */
    public static final FolderType STABLE_SYSTEM_FOLDER_LITERAL = new FolderType(STABLE_SYSTEM_FOLDER, "STABLE_SYSTEM_FOLDER", "STABLE_SYSTEM_FOLDER");

    /**
     * An array of all the '<em><b>Folder Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static final FolderType[] VALUES_ARRAY =
        new FolderType[] {
            FOLDER_LITERAL,
            SYSTEM_FOLDER_LITERAL,
            STABLE_SYSTEM_FOLDER_LITERAL,
        };

    /**
     * A public read-only list of all the '<em><b>Folder Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Folder Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static FolderType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FolderType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Folder Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static FolderType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FolderType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Folder Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static FolderType get(int value) {
        switch (value) {
            case FOLDER: return FOLDER_LITERAL;
            case SYSTEM_FOLDER: return SYSTEM_FOLDER_LITERAL;
            case STABLE_SYSTEM_FOLDER: return STABLE_SYSTEM_FOLDER_LITERAL;
        }
        return null;
    }

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private FolderType(int value, String name, String literal) {
        super(value, name, literal);
    }
}
