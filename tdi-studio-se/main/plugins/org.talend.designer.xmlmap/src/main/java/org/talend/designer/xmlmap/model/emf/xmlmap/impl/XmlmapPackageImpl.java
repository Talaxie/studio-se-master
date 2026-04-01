/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;
import org.talend.designer.gefabstractmap.model.abstractmap.AbstractmapPackage;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.Connection;
import org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection;
import org.talend.designer.xmlmap.model.emf.xmlmap.GlobalMapNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.IConnection;
import org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection;
import org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable;
import org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.LookupConnection;
import org.talend.designer.xmlmap.model.emf.xmlmap.NodeType;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarTable;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapFactory;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class XmlmapPackageImpl extends EPackageImpl implements XmlmapPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass xmlMapDataEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractInOutTreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass inputXmlTreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass outputXmlTreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass varTableEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractNodeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass treeNodeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass outputTreeNodeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass varNodeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass globalMapNodeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass iConnectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass iNodeConnectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass connectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass lookupConnectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass filterConnectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass inputLoopNodesTableEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum nodeTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
     * EPackage.Registry} by the package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
     * performs initialization of the package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private XmlmapPackageImpl() {
        super(eNS_URI, XmlmapFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link XmlmapPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static XmlmapPackage init() {
        if (isInited) return (XmlmapPackage)EPackage.Registry.INSTANCE.getEPackage(XmlmapPackage.eNS_URI);

        // Obtain or create and register package
        XmlmapPackageImpl theXmlmapPackage = (XmlmapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XmlmapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XmlmapPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        AbstractmapPackage.eINSTANCE.eClass();
        TalendFilePackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theXmlmapPackage.createPackageContents();

        // Initialize created meta-data
        theXmlmapPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theXmlmapPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(XmlmapPackage.eNS_URI, theXmlmapPackage);
        return theXmlmapPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getXmlMapData() {
        return xmlMapDataEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getXmlMapData_InputTrees() {
        return (EReference)xmlMapDataEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getXmlMapData_OutputTrees() {
        return (EReference)xmlMapDataEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getXmlMapData_VarTables() {
        return (EReference)xmlMapDataEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getXmlMapData_Connections() {
        return (EReference)xmlMapDataEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractInOutTree() {
        return abstractInOutTreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractInOutTree_ExpressionFilter() {
        return (EAttribute)abstractInOutTreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractInOutTree_ActivateExpressionFilter() {
        return (EAttribute)abstractInOutTreeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractInOutTree_ActivateCondensedTool() {
        return (EAttribute)abstractInOutTreeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractInOutTree_Minimized() {
        return (EAttribute)abstractInOutTreeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractInOutTree_Name() {
        return (EAttribute)abstractInOutTreeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractInOutTree_FilterIncomingConnections() {
        return (EReference)abstractInOutTreeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractInOutTree_MultiLoops() {
        return (EAttribute)abstractInOutTreeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputXmlTree() {
        return inputXmlTreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getInputXmlTree_Nodes() {
        return (EReference)inputXmlTreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputXmlTree_Lookup() {
        return (EAttribute)inputXmlTreeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputXmlTree_MatchingMode() {
        return (EAttribute)inputXmlTreeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputXmlTree_LookupMode() {
        return (EAttribute)inputXmlTreeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputXmlTree_InnerJoin() {
        return (EAttribute)inputXmlTreeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputXmlTree_Persistent() {
        return (EAttribute)inputXmlTreeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputXmlTree_ActivateGlobalMap() {
        return (EAttribute)inputXmlTreeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getInputXmlTree_GlobalMapKeysValues() {
        return (EReference)inputXmlTreeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutputXmlTree() {
        return outputXmlTreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getOutputXmlTree_Nodes() {
        return (EReference)outputXmlTreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputXmlTree_Reject() {
        return (EAttribute)outputXmlTreeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputXmlTree_RejectInnerJoin() {
        return (EAttribute)outputXmlTreeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputXmlTree_ErrorReject() {
        return (EAttribute)outputXmlTreeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputXmlTree_AllInOne() {
        return (EAttribute)outputXmlTreeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputXmlTree_EnableEmptyElement() {
        return (EAttribute)outputXmlTreeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getOutputXmlTree_InputLoopNodesTables() {
        return (EReference)outputXmlTreeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getVarTable() {
        return varTableEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVarTable_Name() {
        return (EAttribute)varTableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getVarTable_Nodes() {
        return (EReference)varTableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVarTable_Minimized() {
        return (EAttribute)varTableEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractNode() {
        return abstractNodeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractNode_Name() {
        return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractNode_Expression() {
        return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractNode_Type() {
        return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractNode_OutgoingConnections() {
        return (EReference)abstractNodeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractNode_IncomingConnections() {
        return (EReference)abstractNodeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractNode_FilterOutGoingConnections() {
        return (EReference)abstractNodeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTreeNode() {
        return treeNodeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTreeNode_Children() {
        return (EReference)treeNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_Xpath() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_Loop() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_NodeType() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_Pattern() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_Key() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_Group() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_Main() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTreeNode_LookupOutgoingConnections() {
        return (EReference)treeNodeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTreeNode_LookupIncomingConnections() {
        return (EReference)treeNodeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_DefaultValue() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_Nullable() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_Choice() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_Substitution() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNode_Optional() {
        return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutputTreeNode() {
        return outputTreeNodeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputTreeNode_Aggregate() {
        return (EAttribute)outputTreeNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getOutputTreeNode_InputLoopNodesTable() {
        return (EReference)outputTreeNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getVarNode() {
        return varNodeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVarNode_Nullable() {
        return (EAttribute)varNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getGlobalMapNode() {
        return globalMapNodeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getIConnection() {
        return iConnectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getINodeConnection() {
        return iNodeConnectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINodeConnection_Name() {
        return (EAttribute)iNodeConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getINodeConnection_Source() {
        return (EReference)iNodeConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getINodeConnection_Target() {
        return (EReference)iNodeConnectionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnection() {
        return connectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getLookupConnection() {
        return lookupConnectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getFilterConnection() {
        return filterConnectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFilterConnection_Name() {
        return (EAttribute)filterConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFilterConnection_Source() {
        return (EReference)filterConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFilterConnection_Target() {
        return (EReference)filterConnectionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputLoopNodesTable() {
        return inputLoopNodesTableEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getInputLoopNodesTable_Inputloopnodes() {
        return (EReference)inputLoopNodesTableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getNodeType() {
        return nodeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public XmlmapFactory getXmlmapFactory() {
        return (XmlmapFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        xmlMapDataEClass = createEClass(XML_MAP_DATA);
        createEReference(xmlMapDataEClass, XML_MAP_DATA__INPUT_TREES);
        createEReference(xmlMapDataEClass, XML_MAP_DATA__OUTPUT_TREES);
        createEReference(xmlMapDataEClass, XML_MAP_DATA__VAR_TABLES);
        createEReference(xmlMapDataEClass, XML_MAP_DATA__CONNECTIONS);

        abstractInOutTreeEClass = createEClass(ABSTRACT_IN_OUT_TREE);
        createEAttribute(abstractInOutTreeEClass, ABSTRACT_IN_OUT_TREE__EXPRESSION_FILTER);
        createEAttribute(abstractInOutTreeEClass, ABSTRACT_IN_OUT_TREE__ACTIVATE_EXPRESSION_FILTER);
        createEAttribute(abstractInOutTreeEClass, ABSTRACT_IN_OUT_TREE__ACTIVATE_CONDENSED_TOOL);
        createEAttribute(abstractInOutTreeEClass, ABSTRACT_IN_OUT_TREE__MINIMIZED);
        createEAttribute(abstractInOutTreeEClass, ABSTRACT_IN_OUT_TREE__NAME);
        createEReference(abstractInOutTreeEClass, ABSTRACT_IN_OUT_TREE__FILTER_INCOMING_CONNECTIONS);
        createEAttribute(abstractInOutTreeEClass, ABSTRACT_IN_OUT_TREE__MULTI_LOOPS);

        inputXmlTreeEClass = createEClass(INPUT_XML_TREE);
        createEReference(inputXmlTreeEClass, INPUT_XML_TREE__NODES);
        createEAttribute(inputXmlTreeEClass, INPUT_XML_TREE__LOOKUP);
        createEAttribute(inputXmlTreeEClass, INPUT_XML_TREE__MATCHING_MODE);
        createEAttribute(inputXmlTreeEClass, INPUT_XML_TREE__LOOKUP_MODE);
        createEAttribute(inputXmlTreeEClass, INPUT_XML_TREE__INNER_JOIN);
        createEAttribute(inputXmlTreeEClass, INPUT_XML_TREE__PERSISTENT);
        createEAttribute(inputXmlTreeEClass, INPUT_XML_TREE__ACTIVATE_GLOBAL_MAP);
        createEReference(inputXmlTreeEClass, INPUT_XML_TREE__GLOBAL_MAP_KEYS_VALUES);

        outputXmlTreeEClass = createEClass(OUTPUT_XML_TREE);
        createEReference(outputXmlTreeEClass, OUTPUT_XML_TREE__NODES);
        createEAttribute(outputXmlTreeEClass, OUTPUT_XML_TREE__REJECT);
        createEAttribute(outputXmlTreeEClass, OUTPUT_XML_TREE__REJECT_INNER_JOIN);
        createEAttribute(outputXmlTreeEClass, OUTPUT_XML_TREE__ERROR_REJECT);
        createEAttribute(outputXmlTreeEClass, OUTPUT_XML_TREE__ALL_IN_ONE);
        createEAttribute(outputXmlTreeEClass, OUTPUT_XML_TREE__ENABLE_EMPTY_ELEMENT);
        createEReference(outputXmlTreeEClass, OUTPUT_XML_TREE__INPUT_LOOP_NODES_TABLES);

        varTableEClass = createEClass(VAR_TABLE);
        createEAttribute(varTableEClass, VAR_TABLE__NAME);
        createEReference(varTableEClass, VAR_TABLE__NODES);
        createEAttribute(varTableEClass, VAR_TABLE__MINIMIZED);

        abstractNodeEClass = createEClass(ABSTRACT_NODE);
        createEAttribute(abstractNodeEClass, ABSTRACT_NODE__NAME);
        createEAttribute(abstractNodeEClass, ABSTRACT_NODE__EXPRESSION);
        createEAttribute(abstractNodeEClass, ABSTRACT_NODE__TYPE);
        createEReference(abstractNodeEClass, ABSTRACT_NODE__OUTGOING_CONNECTIONS);
        createEReference(abstractNodeEClass, ABSTRACT_NODE__INCOMING_CONNECTIONS);
        createEReference(abstractNodeEClass, ABSTRACT_NODE__FILTER_OUT_GOING_CONNECTIONS);

        treeNodeEClass = createEClass(TREE_NODE);
        createEReference(treeNodeEClass, TREE_NODE__CHILDREN);
        createEAttribute(treeNodeEClass, TREE_NODE__XPATH);
        createEAttribute(treeNodeEClass, TREE_NODE__LOOP);
        createEAttribute(treeNodeEClass, TREE_NODE__NODE_TYPE);
        createEAttribute(treeNodeEClass, TREE_NODE__PATTERN);
        createEAttribute(treeNodeEClass, TREE_NODE__KEY);
        createEAttribute(treeNodeEClass, TREE_NODE__GROUP);
        createEAttribute(treeNodeEClass, TREE_NODE__MAIN);
        createEReference(treeNodeEClass, TREE_NODE__LOOKUP_OUTGOING_CONNECTIONS);
        createEReference(treeNodeEClass, TREE_NODE__LOOKUP_INCOMING_CONNECTIONS);
        createEAttribute(treeNodeEClass, TREE_NODE__DEFAULT_VALUE);
        createEAttribute(treeNodeEClass, TREE_NODE__NULLABLE);
        createEAttribute(treeNodeEClass, TREE_NODE__CHOICE);
        createEAttribute(treeNodeEClass, TREE_NODE__SUBSTITUTION);
        createEAttribute(treeNodeEClass, TREE_NODE__OPTIONAL);

        outputTreeNodeEClass = createEClass(OUTPUT_TREE_NODE);
        createEAttribute(outputTreeNodeEClass, OUTPUT_TREE_NODE__AGGREGATE);
        createEReference(outputTreeNodeEClass, OUTPUT_TREE_NODE__INPUT_LOOP_NODES_TABLE);

        varNodeEClass = createEClass(VAR_NODE);
        createEAttribute(varNodeEClass, VAR_NODE__NULLABLE);

        globalMapNodeEClass = createEClass(GLOBAL_MAP_NODE);

        iConnectionEClass = createEClass(ICONNECTION);

        iNodeConnectionEClass = createEClass(INODE_CONNECTION);
        createEAttribute(iNodeConnectionEClass, INODE_CONNECTION__NAME);
        createEReference(iNodeConnectionEClass, INODE_CONNECTION__SOURCE);
        createEReference(iNodeConnectionEClass, INODE_CONNECTION__TARGET);

        connectionEClass = createEClass(CONNECTION);

        lookupConnectionEClass = createEClass(LOOKUP_CONNECTION);

        filterConnectionEClass = createEClass(FILTER_CONNECTION);
        createEAttribute(filterConnectionEClass, FILTER_CONNECTION__NAME);
        createEReference(filterConnectionEClass, FILTER_CONNECTION__SOURCE);
        createEReference(filterConnectionEClass, FILTER_CONNECTION__TARGET);

        inputLoopNodesTableEClass = createEClass(INPUT_LOOP_NODES_TABLE);
        createEReference(inputLoopNodesTableEClass, INPUT_LOOP_NODES_TABLE__INPUTLOOPNODES);

        // Create enums
        nodeTypeEEnum = createEEnum(NODE_TYPE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        TalendFilePackage theTalendFilePackage = (TalendFilePackage)EPackage.Registry.INSTANCE.getEPackage(TalendFilePackage.eNS_URI);
        AbstractmapPackage theAbstractmapPackage = (AbstractmapPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractmapPackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        xmlMapDataEClass.getESuperTypes().add(theTalendFilePackage.getAbstractExternalData());
        abstractInOutTreeEClass.getESuperTypes().add(theAbstractmapPackage.getMapperTable());
        inputXmlTreeEClass.getESuperTypes().add(this.getAbstractInOutTree());
        outputXmlTreeEClass.getESuperTypes().add(this.getAbstractInOutTree());
        varTableEClass.getESuperTypes().add(theAbstractmapPackage.getMapperTable());
        abstractNodeEClass.getESuperTypes().add(theAbstractmapPackage.getMapperTableEntity());
        treeNodeEClass.getESuperTypes().add(this.getAbstractNode());
        outputTreeNodeEClass.getESuperTypes().add(this.getTreeNode());
        varNodeEClass.getESuperTypes().add(this.getAbstractNode());
        globalMapNodeEClass.getESuperTypes().add(this.getTreeNode());
        iNodeConnectionEClass.getESuperTypes().add(this.getIConnection());
        connectionEClass.getESuperTypes().add(this.getINodeConnection());
        lookupConnectionEClass.getESuperTypes().add(this.getINodeConnection());
        filterConnectionEClass.getESuperTypes().add(this.getIConnection());

        // Initialize classes and features; add operations and parameters
        initEClass(xmlMapDataEClass, XmlMapData.class, "XmlMapData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getXmlMapData_InputTrees(), this.getInputXmlTree(), null, "inputTrees", null, 0, -1, XmlMapData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getXmlMapData_OutputTrees(), this.getOutputXmlTree(), null, "outputTrees", null, 0, -1, XmlMapData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getXmlMapData_VarTables(), this.getVarTable(), null, "varTables", null, 0, -1, XmlMapData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getXmlMapData_Connections(), this.getIConnection(), null, "connections", null, 0, -1, XmlMapData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractInOutTreeEClass, AbstractInOutTree.class, "AbstractInOutTree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractInOutTree_ExpressionFilter(), ecorePackage.getEString(), "expressionFilter", null, 0, 1, AbstractInOutTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractInOutTree_ActivateExpressionFilter(), ecorePackage.getEBoolean(), "activateExpressionFilter", null, 0, 1, AbstractInOutTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractInOutTree_ActivateCondensedTool(), ecorePackage.getEBoolean(), "activateCondensedTool", null, 0, 1, AbstractInOutTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractInOutTree_Minimized(), ecorePackage.getEBoolean(), "minimized", null, 0, 1, AbstractInOutTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractInOutTree_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractInOutTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractInOutTree_FilterIncomingConnections(), this.getFilterConnection(), null, "filterIncomingConnections", null, 0, -1, AbstractInOutTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractInOutTree_MultiLoops(), theXMLTypePackage.getBoolean(), "multiLoops", null, 0, 1, AbstractInOutTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(inputXmlTreeEClass, InputXmlTree.class, "InputXmlTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInputXmlTree_Nodes(), this.getTreeNode(), null, "nodes", null, 0, -1, InputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInputXmlTree_Lookup(), ecorePackage.getEBoolean(), "lookup", null, 0, 1, InputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInputXmlTree_MatchingMode(), ecorePackage.getEString(), "matchingMode", null, 0, 1, InputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInputXmlTree_LookupMode(), ecorePackage.getEString(), "lookupMode", null, 0, 1, InputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInputXmlTree_InnerJoin(), ecorePackage.getEBoolean(), "innerJoin", null, 0, 1, InputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInputXmlTree_Persistent(), ecorePackage.getEBoolean(), "persistent", null, 0, 1, InputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInputXmlTree_ActivateGlobalMap(), ecorePackage.getEBoolean(), "activateGlobalMap", null, 0, 1, InputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInputXmlTree_GlobalMapKeysValues(), this.getGlobalMapNode(), null, "globalMapKeysValues", null, 0, -1, InputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(outputXmlTreeEClass, OutputXmlTree.class, "OutputXmlTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOutputXmlTree_Nodes(), this.getOutputTreeNode(), null, "nodes", null, 0, -1, OutputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOutputXmlTree_Reject(), ecorePackage.getEBoolean(), "reject", null, 0, 1, OutputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOutputXmlTree_RejectInnerJoin(), ecorePackage.getEBoolean(), "rejectInnerJoin", null, 0, 1, OutputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOutputXmlTree_ErrorReject(), ecorePackage.getEBoolean(), "errorReject", null, 0, 1, OutputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOutputXmlTree_AllInOne(), ecorePackage.getEBoolean(), "allInOne", null, 0, 1, OutputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOutputXmlTree_EnableEmptyElement(), ecorePackage.getEBoolean(), "enableEmptyElement", "true", 0, 1, OutputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOutputXmlTree_InputLoopNodesTables(), this.getInputLoopNodesTable(), null, "inputLoopNodesTables", null, 0, -1, OutputXmlTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(varTableEClass, VarTable.class, "VarTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVarTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, VarTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVarTable_Nodes(), this.getVarNode(), null, "nodes", null, 0, -1, VarTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVarTable_Minimized(), ecorePackage.getEBoolean(), "minimized", null, 0, 1, VarTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractNode_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractNode_Type(), ecorePackage.getEString(), "type", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractNode_OutgoingConnections(), this.getConnection(), null, "outgoingConnections", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractNode_IncomingConnections(), this.getConnection(), null, "incomingConnections", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractNode_FilterOutGoingConnections(), this.getFilterConnection(), null, "filterOutGoingConnections", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(treeNodeEClass, TreeNode.class, "TreeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTreeNode_Children(), this.getTreeNode(), null, "children", null, 0, -1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_Xpath(), ecorePackage.getEString(), "xpath", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_Loop(), ecorePackage.getEBoolean(), "loop", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_NodeType(), this.getNodeType(), "nodeType", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_Key(), ecorePackage.getEBoolean(), "key", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_Group(), ecorePackage.getEBoolean(), "group", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_Main(), ecorePackage.getEBoolean(), "main", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTreeNode_LookupOutgoingConnections(), this.getLookupConnection(), null, "lookupOutgoingConnections", null, 0, -1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTreeNode_LookupIncomingConnections(), this.getLookupConnection(), null, "lookupIncomingConnections", null, 0, -1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_Nullable(), ecorePackage.getEBoolean(), "nullable", "true", 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_Choice(), ecorePackage.getEBoolean(), "choice", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_Substitution(), ecorePackage.getEBoolean(), "substitution", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNode_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(outputTreeNodeEClass, OutputTreeNode.class, "OutputTreeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOutputTreeNode_Aggregate(), ecorePackage.getEBoolean(), "aggregate", null, 0, 1, OutputTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOutputTreeNode_InputLoopNodesTable(), this.getInputLoopNodesTable(), null, "inputLoopNodesTable", null, 0, 1, OutputTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(varNodeEClass, VarNode.class, "VarNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVarNode_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, VarNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(globalMapNodeEClass, GlobalMapNode.class, "GlobalMapNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(iConnectionEClass, IConnection.class, "IConnection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(iNodeConnectionEClass, INodeConnection.class, "INodeConnection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getINodeConnection_Name(), ecorePackage.getEString(), "name", null, 0, 1, INodeConnection.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getINodeConnection_Source(), this.getAbstractNode(), null, "source", null, 0, 1, INodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getINodeConnection_Target(), this.getAbstractNode(), null, "target", null, 0, 1, INodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(lookupConnectionEClass, LookupConnection.class, "LookupConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(filterConnectionEClass, FilterConnection.class, "FilterConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFilterConnection_Name(), ecorePackage.getEString(), "name", null, 0, 1, FilterConnection.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFilterConnection_Source(), this.getAbstractNode(), null, "source", null, 0, 1, FilterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFilterConnection_Target(), this.getAbstractInOutTree(), null, "target", null, 0, 1, FilterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(inputLoopNodesTableEClass, InputLoopNodesTable.class, "InputLoopNodesTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInputLoopNodesTable_Inputloopnodes(), this.getTreeNode(), null, "inputloopnodes", null, 0, -1, InputLoopNodesTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
        addEEnumLiteral(nodeTypeEEnum, NodeType.ELEMENT);
        addEEnumLiteral(nodeTypeEEnum, NodeType.ATTRIBUT);
        addEEnumLiteral(nodeTypeEEnum, NodeType.NAME_SPACE);

        // Create resource
        createResource(eNS_URI);
    }

} // XmlmapPackageImpl
