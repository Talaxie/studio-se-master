/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.talend.designer.core.model.utils.emf.talendfile.AbstractExternalData;

import org.talend.designer.gefabstractmap.model.abstractmap.MapperTable;
import org.talend.designer.gefabstractmap.model.abstractmap.MapperTableEntity;

import org.talend.designer.xmlmap.model.emf.xmlmap.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage
 * @generated
 */
public class XmlmapSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static XmlmapPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmlmapSwitch() {
        if (modelPackage == null) {
            modelPackage = XmlmapPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case XmlmapPackage.XML_MAP_DATA: {
                XmlMapData xmlMapData = (XmlMapData)theEObject;
                T result = caseXmlMapData(xmlMapData);
                if (result == null) result = caseAbstractExternalData(xmlMapData);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.ABSTRACT_IN_OUT_TREE: {
                AbstractInOutTree abstractInOutTree = (AbstractInOutTree)theEObject;
                T result = caseAbstractInOutTree(abstractInOutTree);
                if (result == null) result = caseMapperTable(abstractInOutTree);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.INPUT_XML_TREE: {
                InputXmlTree inputXmlTree = (InputXmlTree)theEObject;
                T result = caseInputXmlTree(inputXmlTree);
                if (result == null) result = caseAbstractInOutTree(inputXmlTree);
                if (result == null) result = caseMapperTable(inputXmlTree);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.OUTPUT_XML_TREE: {
                OutputXmlTree outputXmlTree = (OutputXmlTree)theEObject;
                T result = caseOutputXmlTree(outputXmlTree);
                if (result == null) result = caseAbstractInOutTree(outputXmlTree);
                if (result == null) result = caseMapperTable(outputXmlTree);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.VAR_TABLE: {
                VarTable varTable = (VarTable)theEObject;
                T result = caseVarTable(varTable);
                if (result == null) result = caseMapperTable(varTable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.ABSTRACT_NODE: {
                AbstractNode abstractNode = (AbstractNode)theEObject;
                T result = caseAbstractNode(abstractNode);
                if (result == null) result = caseMapperTableEntity(abstractNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.TREE_NODE: {
                TreeNode treeNode = (TreeNode)theEObject;
                T result = caseTreeNode(treeNode);
                if (result == null) result = caseAbstractNode(treeNode);
                if (result == null) result = caseMapperTableEntity(treeNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.OUTPUT_TREE_NODE: {
                OutputTreeNode outputTreeNode = (OutputTreeNode)theEObject;
                T result = caseOutputTreeNode(outputTreeNode);
                if (result == null) result = caseTreeNode(outputTreeNode);
                if (result == null) result = caseAbstractNode(outputTreeNode);
                if (result == null) result = caseMapperTableEntity(outputTreeNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.VAR_NODE: {
                VarNode varNode = (VarNode)theEObject;
                T result = caseVarNode(varNode);
                if (result == null) result = caseAbstractNode(varNode);
                if (result == null) result = caseMapperTableEntity(varNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.GLOBAL_MAP_NODE: {
                GlobalMapNode globalMapNode = (GlobalMapNode)theEObject;
                T result = caseGlobalMapNode(globalMapNode);
                if (result == null) result = caseTreeNode(globalMapNode);
                if (result == null) result = caseAbstractNode(globalMapNode);
                if (result == null) result = caseMapperTableEntity(globalMapNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.ICONNECTION: {
                IConnection iConnection = (IConnection)theEObject;
                T result = caseIConnection(iConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.INODE_CONNECTION: {
                INodeConnection iNodeConnection = (INodeConnection)theEObject;
                T result = caseINodeConnection(iNodeConnection);
                if (result == null) result = caseIConnection(iNodeConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.CONNECTION: {
                Connection connection = (Connection)theEObject;
                T result = caseConnection(connection);
                if (result == null) result = caseINodeConnection(connection);
                if (result == null) result = caseIConnection(connection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.LOOKUP_CONNECTION: {
                LookupConnection lookupConnection = (LookupConnection)theEObject;
                T result = caseLookupConnection(lookupConnection);
                if (result == null) result = caseINodeConnection(lookupConnection);
                if (result == null) result = caseIConnection(lookupConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.FILTER_CONNECTION: {
                FilterConnection filterConnection = (FilterConnection)theEObject;
                T result = caseFilterConnection(filterConnection);
                if (result == null) result = caseIConnection(filterConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XmlmapPackage.INPUT_LOOP_NODES_TABLE: {
                InputLoopNodesTable inputLoopNodesTable = (InputLoopNodesTable)theEObject;
                T result = caseInputLoopNodesTable(inputLoopNodesTable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Xml Map Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Xml Map Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseXmlMapData(XmlMapData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract In Out Tree</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract In Out Tree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractInOutTree(AbstractInOutTree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Xml Tree</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Xml Tree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputXmlTree(InputXmlTree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Xml Tree</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Xml Tree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputXmlTree(OutputXmlTree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Var Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Var Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVarTable(VarTable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractNode(AbstractNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tree Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tree Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTreeNode(TreeNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Tree Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Tree Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputTreeNode(OutputTreeNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Var Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Var Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVarNode(VarNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Global Map Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Global Map Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGlobalMapNode(GlobalMapNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IConnection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IConnection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIConnection(IConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>INode Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>INode Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseINodeConnection(INodeConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnection(Connection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lookup Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lookup Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLookupConnection(LookupConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Filter Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Filter Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFilterConnection(FilterConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Loop Nodes Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Loop Nodes Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputLoopNodesTable(InputLoopNodesTable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract External Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract External Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractExternalData(AbstractExternalData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mapper Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mapper Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMapperTable(MapperTable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mapper Table Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mapper Table Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMapperTableEntity(MapperTableEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //XmlmapSwitch
