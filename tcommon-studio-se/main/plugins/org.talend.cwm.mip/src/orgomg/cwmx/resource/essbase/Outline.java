/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.objectmodel.core.Namespace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Outline</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Essbase Outline defines the structure of an Essbase Database, including the dimensional hierarchies, members, tags, types, consolidations, and mathematical relationships. Data is stored in the Database according to the structure defined in the Outline.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.essbase.Outline#getAliasTableName <em>Alias Table Name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.Outline#getDatabase <em>Database</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.Outline#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.essbase.EssbasePackage#getOutline()
 * @model
 * @generated
 */
public interface Outline extends Namespace {

    /**
     * Returns the value of the '<em><b>Alias Table Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The name of the Alias Table to be used by this instance of Outline. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Alias Table Name</em>' attribute.
     * @see #setAliasTableName(String)
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#getOutline_AliasTableName()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getAliasTableName();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.essbase.Outline#getAliasTableName <em>Alias Table Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Alias Table Name</em>' attribute.
     * @see #getAliasTableName()
     * @generated
     */
    void setAliasTableName(String value);

    /**
     * Returns the value of the '<em><b>Database</b></em>' container reference.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.essbase.Database#getOutline <em>Outline</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The Database that owns the Outline. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Database</em>' container reference.
     * @see #setDatabase(Database)
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#getOutline_Database()
     * @see orgomg.cwmx.resource.essbase.Database#getOutline
     * @model opposite="outline" required="true"
     * @generated
     */
    Database getDatabase();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.essbase.Outline#getDatabase <em>Database</em>}' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Database</em>' container reference.
     * @see #getDatabase()
     * @generated
     */
    void setDatabase(Database value);

    /**
     * Returns the value of the '<em><b>Dimension</b></em>' reference list. The
     * list contents are of type {@link orgomg.cwmx.resource.essbase.Dimension}.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.essbase.Dimension#getOutline
     * <em>Outline</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Dimensions organized by the Outline. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Dimension</em>' reference list.
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#getOutline_Dimension()
     * @see orgomg.cwmx.resource.essbase.Dimension#getOutline
     * @model opposite="outline"
     * @generated
     */
    EList<Dimension> getDimension();

} // Outline
