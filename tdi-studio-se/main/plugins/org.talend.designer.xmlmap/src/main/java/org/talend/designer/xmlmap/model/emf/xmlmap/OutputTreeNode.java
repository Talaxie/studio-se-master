/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Tree Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode#isAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode#getInputLoopNodesTable <em>Input Loop Nodes Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getOutputTreeNode()
 * @model
 * @generated
 */
public interface OutputTreeNode extends TreeNode {
    /**
     * Returns the value of the '<em><b>Aggregate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregate</em>' attribute.
     * @see #setAggregate(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getOutputTreeNode_Aggregate()
     * @model
     * @generated
     */
    boolean isAggregate();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode#isAggregate <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregate</em>' attribute.
     * @see #isAggregate()
     * @generated
     */
    void setAggregate(boolean value);

    /**
     * Returns the value of the '<em><b>Input Loop Nodes Table</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Loop Nodes Table</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Loop Nodes Table</em>' reference.
     * @see #setInputLoopNodesTable(InputLoopNodesTable)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getOutputTreeNode_InputLoopNodesTable()
     * @model
     * @generated
     */
    InputLoopNodesTable getInputLoopNodesTable();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode#getInputLoopNodesTable <em>Input Loop Nodes Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Loop Nodes Table</em>' reference.
     * @see #getInputLoopNodesTable()
     * @generated
     */
    void setInputLoopNodesTable(InputLoopNodesTable value);

} // OutputTreeNode
