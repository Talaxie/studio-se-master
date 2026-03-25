/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Tree Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.OutputTreeNodeImpl#isAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.OutputTreeNodeImpl#getInputLoopNodesTable <em>Input Loop Nodes Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputTreeNodeImpl extends TreeNodeImpl implements OutputTreeNode {
    /**
     * The default value of the '{@link #isAggregate() <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAggregate()
     * @generated
     * @ordered
     */
    protected static final boolean AGGREGATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAggregate() <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAggregate()
     * @generated
     * @ordered
     */
    protected boolean aggregate = AGGREGATE_EDEFAULT;

    /**
     * The cached value of the '{@link #getInputLoopNodesTable() <em>Input Loop Nodes Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputLoopNodesTable()
     * @generated
     * @ordered
     */
    protected InputLoopNodesTable inputLoopNodesTable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutputTreeNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XmlmapPackage.Literals.OUTPUT_TREE_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAggregate() {
        return aggregate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAggregate(boolean newAggregate) {
        boolean oldAggregate = aggregate;
        aggregate = newAggregate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmlmapPackage.OUTPUT_TREE_NODE__AGGREGATE, oldAggregate, aggregate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputLoopNodesTable getInputLoopNodesTable() {
        if (inputLoopNodesTable != null && inputLoopNodesTable.eIsProxy()) {
            InternalEObject oldInputLoopNodesTable = (InternalEObject)inputLoopNodesTable;
            inputLoopNodesTable = (InputLoopNodesTable)eResolveProxy(oldInputLoopNodesTable);
            if (inputLoopNodesTable != oldInputLoopNodesTable) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmlmapPackage.OUTPUT_TREE_NODE__INPUT_LOOP_NODES_TABLE, oldInputLoopNodesTable, inputLoopNodesTable));
            }
        }
        return inputLoopNodesTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputLoopNodesTable basicGetInputLoopNodesTable() {
        return inputLoopNodesTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputLoopNodesTable(InputLoopNodesTable newInputLoopNodesTable) {
        InputLoopNodesTable oldInputLoopNodesTable = inputLoopNodesTable;
        inputLoopNodesTable = newInputLoopNodesTable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmlmapPackage.OUTPUT_TREE_NODE__INPUT_LOOP_NODES_TABLE, oldInputLoopNodesTable, inputLoopNodesTable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XmlmapPackage.OUTPUT_TREE_NODE__AGGREGATE:
                return isAggregate();
            case XmlmapPackage.OUTPUT_TREE_NODE__INPUT_LOOP_NODES_TABLE:
                if (resolve) return getInputLoopNodesTable();
                return basicGetInputLoopNodesTable();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XmlmapPackage.OUTPUT_TREE_NODE__AGGREGATE:
                setAggregate((Boolean)newValue);
                return;
            case XmlmapPackage.OUTPUT_TREE_NODE__INPUT_LOOP_NODES_TABLE:
                setInputLoopNodesTable((InputLoopNodesTable)newValue);
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
            case XmlmapPackage.OUTPUT_TREE_NODE__AGGREGATE:
                setAggregate(AGGREGATE_EDEFAULT);
                return;
            case XmlmapPackage.OUTPUT_TREE_NODE__INPUT_LOOP_NODES_TABLE:
                setInputLoopNodesTable((InputLoopNodesTable)null);
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
            case XmlmapPackage.OUTPUT_TREE_NODE__AGGREGATE:
                return aggregate != AGGREGATE_EDEFAULT;
            case XmlmapPackage.OUTPUT_TREE_NODE__INPUT_LOOP_NODES_TABLE:
                return inputLoopNodesTable != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (aggregate: ");
        result.append(aggregate);
        result.append(')');
        return result.toString();
    }

} //OutputTreeNodeImpl
