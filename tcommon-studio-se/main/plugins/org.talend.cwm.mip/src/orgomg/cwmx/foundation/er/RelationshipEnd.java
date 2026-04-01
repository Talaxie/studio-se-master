/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.foundation.er;

import orgomg.cwm.foundation.expressions.ExpressionNode;
import orgomg.cwm.objectmodel.relationships.AssociationEnd;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Relationship End</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The RelationshipEnd class extends CWM?s AssociationEnd class to permit the definition of separate delete, update, and insert rules on each end of a Relationship.
 * 
 * An ER model Relationship instance owns two or more RelationshipEnds via an inherited CWM association between the Association and AssociationEnd classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.foundation.er.RelationshipEnd#getDelete <em>Delete</em>}</li>
 *   <li>{@link orgomg.cwmx.foundation.er.RelationshipEnd#getUpdate <em>Update</em>}</li>
 *   <li>{@link orgomg.cwmx.foundation.er.RelationshipEnd#getInsert <em>Insert</em>}</li>
 *   <li>{@link orgomg.cwmx.foundation.er.RelationshipEnd#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.foundation.er.ErPackage#getRelationshipEnd()
 * @model
 * @generated
 */
public interface RelationshipEnd extends AssociationEnd {

    /**
     * Returns the value of the '<em><b>Delete</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> An
     * expression describing the integrity constraint rule for deletes on this
     * RelationshipEnd instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Delete</em>' containment reference.
     * @see #setDelete(ExpressionNode)
     * @see orgomg.cwmx.foundation.er.ErPackage#getRelationshipEnd_Delete()
     * @model containment="true"
     * @generated
     */
    ExpressionNode getDelete();

    /**
     * Sets the value of the '{@link orgomg.cwmx.foundation.er.RelationshipEnd#getDelete <em>Delete</em>}' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Delete</em>' containment reference.
     * @see #getDelete()
     * @generated
     */
    void setDelete(ExpressionNode value);

    /**
     * Returns the value of the '<em><b>Update</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> An
     * expression describing the integrity constraint rule for updates on this
     * RelationshipEnd instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Update</em>' containment reference.
     * @see #setUpdate(ExpressionNode)
     * @see orgomg.cwmx.foundation.er.ErPackage#getRelationshipEnd_Update()
     * @model containment="true"
     * @generated
     */
    ExpressionNode getUpdate();

    /**
     * Sets the value of the '{@link orgomg.cwmx.foundation.er.RelationshipEnd#getUpdate <em>Update</em>}' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Update</em>' containment reference.
     * @see #getUpdate()
     * @generated
     */
    void setUpdate(ExpressionNode value);

    /**
     * Returns the value of the '<em><b>Insert</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> An
     * expression describing the integrity constraint rule for inserts on this
     * RelationshipEnd instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Insert</em>' containment reference.
     * @see #setInsert(ExpressionNode)
     * @see orgomg.cwmx.foundation.er.ErPackage#getRelationshipEnd_Insert()
     * @model containment="true"
     * @generated
     */
    ExpressionNode getInsert();

    /**
     * Sets the value of the '{@link orgomg.cwmx.foundation.er.RelationshipEnd#getInsert <em>Insert</em>}' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Insert</em>' containment reference.
     * @see #getInsert()
     * @generated
     */
    void setInsert(ExpressionNode value);

    /**
     * Returns the value of the '<em><b>Foreign Key</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.foundation.er.ForeignKey#getRelationshipEnd
     * <em>Relationship End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the ForeignKey instance that
     * implements the RelationshipEnd instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Foreign Key</em>' reference.
     * @see #setForeignKey(ForeignKey)
     * @see orgomg.cwmx.foundation.er.ErPackage#getRelationshipEnd_ForeignKey()
     * @see orgomg.cwmx.foundation.er.ForeignKey#getRelationshipEnd
     * @model opposite="relationshipEnd"
     * @generated
     */
    ForeignKey getForeignKey();

    /**
     * Sets the value of the '{@link orgomg.cwmx.foundation.er.RelationshipEnd#getForeignKey <em>Foreign Key</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Foreign Key</em>' reference.
     * @see #getForeignKey()
     * @generated
     */
    void setForeignKey(ForeignKey value);

} // RelationshipEnd
