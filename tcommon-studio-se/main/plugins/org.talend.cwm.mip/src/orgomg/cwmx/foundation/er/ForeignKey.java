/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.foundation.er;

import orgomg.cwm.foundation.keysindexes.KeyRelationship;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Foreign Key</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ForeignKey instance identifies a set of attributes in one Entity instance that uniquely identifies an instance of another Entity containing a matching primary or candidate key value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.foundation.er.ForeignKey#getRelationshipEnd <em>Relationship End</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.foundation.er.ErPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends KeyRelationship {

    /**
     * Returns the value of the '<em><b>Relationship End</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.foundation.er.RelationshipEnd#getForeignKey <em>Foreign Key</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the RelationshipEnd instance that this ForeignKey instance implements.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Relationship End</em>' reference.
     * @see #setRelationshipEnd(RelationshipEnd)
     * @see orgomg.cwmx.foundation.er.ErPackage#getForeignKey_RelationshipEnd()
     * @see orgomg.cwmx.foundation.er.RelationshipEnd#getForeignKey
     * @model opposite="foreignKey"
     * @generated
     */
    RelationshipEnd getRelationshipEnd();

    /**
     * Sets the value of the '{@link orgomg.cwmx.foundation.er.ForeignKey#getRelationshipEnd <em>Relationship End</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Relationship End</em>' reference.
     * @see #getRelationshipEnd()
     * @generated
     */
    void setRelationshipEnd(RelationshipEnd value);

} // ForeignKey
