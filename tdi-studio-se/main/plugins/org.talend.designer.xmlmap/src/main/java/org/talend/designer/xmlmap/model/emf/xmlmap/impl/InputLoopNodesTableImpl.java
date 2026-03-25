/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Loop Nodes Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.InputLoopNodesTableImpl#getInputloopnodes <em>Inputloopnodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputLoopNodesTableImpl extends EObjectImpl implements InputLoopNodesTable {
    /**
     * The cached value of the '{@link #getInputloopnodes() <em>Inputloopnodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputloopnodes()
     * @generated
     * @ordered
     */
    protected EList<TreeNode> inputloopnodes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InputLoopNodesTableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XmlmapPackage.Literals.INPUT_LOOP_NODES_TABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TreeNode> getInputloopnodes() {
        if (inputloopnodes == null) {
            inputloopnodes = new EObjectResolvingEList<TreeNode>(TreeNode.class, this, XmlmapPackage.INPUT_LOOP_NODES_TABLE__INPUTLOOPNODES);
        }
        return inputloopnodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XmlmapPackage.INPUT_LOOP_NODES_TABLE__INPUTLOOPNODES:
                return getInputloopnodes();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XmlmapPackage.INPUT_LOOP_NODES_TABLE__INPUTLOOPNODES:
                getInputloopnodes().clear();
                getInputloopnodes().addAll((Collection<? extends TreeNode>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XmlmapPackage.INPUT_LOOP_NODES_TABLE__INPUTLOOPNODES:
                getInputloopnodes().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XmlmapPackage.INPUT_LOOP_NODES_TABLE__INPUTLOOPNODES:
                return inputloopnodes != null && !inputloopnodes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //InputLoopNodesTableImpl
