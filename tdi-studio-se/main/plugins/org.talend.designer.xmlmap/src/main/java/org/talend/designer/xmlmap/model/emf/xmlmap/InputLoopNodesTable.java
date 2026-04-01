/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Loop Nodes Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable#getInputloopnodes <em>Inputloopnodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getInputLoopNodesTable()
 * @model
 * @generated
 */
public interface InputLoopNodesTable extends EObject {
    /**
     * Returns the value of the '<em><b>Inputloopnodes</b></em>' reference list.
     * The list contents are of type {@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputloopnodes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inputloopnodes</em>' reference list.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getInputLoopNodesTable_Inputloopnodes()
     * @model
     * @generated
     */
    EList<TreeNode> getInputloopnodes();

} // InputLoopNodesTable
