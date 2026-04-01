/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.objectmodel.core.StructuralFeature;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Database</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For a given DASDL source, there can be at most one Database instance with isLogical = False (representing an independent, free standing database) and zero or more with isLogical = True (each representing a Logical Database declared within the physical database). A logical database can be owned by at most one database.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Database#isIsLogical <em>Is Logical</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Database#getGuardFile <em>Guard File</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Database#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends StructuralFeature, orgomg.cwm.objectmodel.core.Package {

    /**
     * Returns the value of the '<em><b>Is Logical</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, this Database instance is a logical database.
     * 
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Logical</em>' attribute.
     * @see #setIsLogical(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDatabase_IsLogical()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsLogical();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Database#isIsLogical <em>Is Logical</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Logical</em>' attribute.
     * @see #isIsLogical()
     * @generated
     */
    void setIsLogical(boolean value);

    /**
     * Returns the value of the '<em><b>Guard File</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the name of the database guard file that contains access control
     * information for the database. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Guard File</em>' attribute.
     * @see #setGuardFile(String)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDatabase_GuardFile()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getGuardFile();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Database#getGuardFile <em>Guard File</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Guard File</em>' attribute.
     * @see #getGuardFile()
     * @generated
     */
    void setGuardFile(String value);

    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the text of the DASDL source from which the database was
     * created. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDatabase_Source()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getSource();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Database#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #getSource()
     * @generated
     */
    void setSource(String value);

} // Database
