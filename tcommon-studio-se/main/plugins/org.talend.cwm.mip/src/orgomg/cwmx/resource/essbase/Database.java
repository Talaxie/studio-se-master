/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase;

import orgomg.cwm.resource.multidimensional.Schema;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Database</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Essbase Database is a unique, named multidimensional database implemented by an Essbase server.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.essbase.Database#isIsCurrency <em>Is Currency</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.Database#getOutline <em>Outline</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.essbase.EssbasePackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends Schema {

    /**
     * Returns the value of the '<em><b>Is Currency</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * true, then this Database is a Currency Database. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Currency</em>' attribute.
     * @see #setIsCurrency(boolean)
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#getDatabase_IsCurrency()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsCurrency();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.essbase.Database#isIsCurrency <em>Is Currency</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Currency</em>' attribute.
     * @see #isIsCurrency()
     * @generated
     */
    void setIsCurrency(boolean value);

    /**
     * Returns the value of the '<em><b>Outline</b></em>' containment reference.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.essbase.Outline#getDatabase
     * <em>Database</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The Outline owned by the Database. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Outline</em>' containment reference.
     * @see #setOutline(Outline)
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#getDatabase_Outline()
     * @see orgomg.cwmx.resource.essbase.Outline#getDatabase
     * @model opposite="database" containment="true" required="true"
     * @generated
     */
    Outline getOutline();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.essbase.Database#getOutline <em>Outline</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Outline</em>' containment reference.
     * @see #getOutline()
     * @generated
     */
    void setOutline(Outline value);

} // Database
