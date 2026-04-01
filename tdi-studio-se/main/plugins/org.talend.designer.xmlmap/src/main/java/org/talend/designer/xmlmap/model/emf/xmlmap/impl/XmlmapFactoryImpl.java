/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.talend.designer.xmlmap.model.emf.xmlmap.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlmapFactoryImpl extends EFactoryImpl implements XmlmapFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XmlmapFactory init() {
        try {
            XmlmapFactory theXmlmapFactory = (XmlmapFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.talend.org/xmlmap"); 
            if (theXmlmapFactory != null) {
                return theXmlmapFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new XmlmapFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmlmapFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case XmlmapPackage.XML_MAP_DATA: return createXmlMapData();
            case XmlmapPackage.INPUT_XML_TREE: return createInputXmlTree();
            case XmlmapPackage.OUTPUT_XML_TREE: return createOutputXmlTree();
            case XmlmapPackage.VAR_TABLE: return createVarTable();
            case XmlmapPackage.TREE_NODE: return createTreeNode();
            case XmlmapPackage.OUTPUT_TREE_NODE: return createOutputTreeNode();
            case XmlmapPackage.VAR_NODE: return createVarNode();
            case XmlmapPackage.GLOBAL_MAP_NODE: return createGlobalMapNode();
            case XmlmapPackage.CONNECTION: return createConnection();
            case XmlmapPackage.LOOKUP_CONNECTION: return createLookupConnection();
            case XmlmapPackage.FILTER_CONNECTION: return createFilterConnection();
            case XmlmapPackage.INPUT_LOOP_NODES_TABLE: return createInputLoopNodesTable();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case XmlmapPackage.NODE_TYPE:
                return createNodeTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case XmlmapPackage.NODE_TYPE:
                return convertNodeTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmlMapData createXmlMapData() {
        XmlMapDataImpl xmlMapData = new XmlMapDataImpl();
        return xmlMapData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputXmlTree createInputXmlTree() {
        InputXmlTreeImpl inputXmlTree = new InputXmlTreeImpl();
        return inputXmlTree;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputXmlTree createOutputXmlTree() {
        OutputXmlTreeImpl outputXmlTree = new OutputXmlTreeImpl();
        return outputXmlTree;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VarTable createVarTable() {
        VarTableImpl varTable = new VarTableImpl();
        return varTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TreeNode createTreeNode() {
        TreeNodeImpl treeNode = new TreeNodeImpl();
        return treeNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputTreeNode createOutputTreeNode() {
        OutputTreeNodeImpl outputTreeNode = new OutputTreeNodeImpl();
        return outputTreeNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VarNode createVarNode() {
        VarNodeImpl varNode = new VarNodeImpl();
        return varNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalMapNode createGlobalMapNode() {
        GlobalMapNodeImpl globalMapNode = new GlobalMapNodeImpl();
        return globalMapNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connection createConnection() {
        ConnectionImpl connection = new ConnectionImpl();
        return connection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LookupConnection createLookupConnection() {
        LookupConnectionImpl lookupConnection = new LookupConnectionImpl();
        return lookupConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FilterConnection createFilterConnection() {
        FilterConnectionImpl filterConnection = new FilterConnectionImpl();
        return filterConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputLoopNodesTable createInputLoopNodesTable() {
        InputLoopNodesTableImpl inputLoopNodesTable = new InputLoopNodesTableImpl();
        return inputLoopNodesTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue) {
        NodeType result = NodeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNodeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmlmapPackage getXmlmapPackage() {
        return (XmlmapPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static XmlmapPackage getPackage() {
        return XmlmapPackage.eINSTANCE;
    }

} //XmlmapFactoryImpl
