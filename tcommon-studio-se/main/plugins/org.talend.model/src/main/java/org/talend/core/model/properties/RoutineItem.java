/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.common.util.EList;
import org.talend.designer.core.model.utils.emf.component.IMPORTType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Routine Item</b></em>'. <!-- end-user-doc
 * -->
 * 
 * 
 * @see org.talend.core.model.properties.PropertiesPackage#getRoutineItem()
 * @model
 * @generated
 */
public interface RoutineItem extends FileItem {
    /**
     * Returns the value of the '<em><b>Built In</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Built In</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Built In</em>' attribute.
     * @see #setBuiltIn(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getRoutineItem_BuiltIn()
     * @model default="false"
     * @generated
     */
    boolean isBuiltIn();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.RoutineItem#isBuiltIn <em>Built In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Built In</em>' attribute.
     * @see #isBuiltIn()
     * @generated
     */
    void setBuiltIn(boolean value);

    /**
     * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.IMPORTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Imports</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getRoutineItem_Imports()
     * @model type="org.talend.designer.core.model.utils.emf.component.IMPORTType" containment="true"
     * @generated
     */
    EList getImports();

    /**
     * Returns the value of the '<em><b>Package Type</b></em>' attribute.
     * The default value is <code>"routines"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package Type</em>' attribute.
     * @see org.talend.core.model.properties.PropertiesPackage#getRoutineItem_PackageType()
     * @model default="routines" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" changeable="false"
     * @generated
     */
    String getPackageType();

} // RoutineItem
