/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

import org.talend.designer.gefabstractmap.model.abstractmap.AbstractmapPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapFactory
 * @model kind="package"
 * @generated
 */
public interface XmlmapPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "xmlmap";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.talend.org/xmlmap";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "TalendXMLMap";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    XmlmapPackage eINSTANCE = org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlMapDataImpl <em>Xml Map Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlMapDataImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getXmlMapData()
     * @generated
     */
    int XML_MAP_DATA = 0;

    /**
     * The feature id for the '<em><b>Input Trees</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_MAP_DATA__INPUT_TREES = TalendFilePackage.ABSTRACT_EXTERNAL_DATA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Output Trees</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_MAP_DATA__OUTPUT_TREES = TalendFilePackage.ABSTRACT_EXTERNAL_DATA_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Var Tables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_MAP_DATA__VAR_TABLES = TalendFilePackage.ABSTRACT_EXTERNAL_DATA_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_MAP_DATA__CONNECTIONS = TalendFilePackage.ABSTRACT_EXTERNAL_DATA_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Xml Map Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_MAP_DATA_FEATURE_COUNT = TalendFilePackage.ABSTRACT_EXTERNAL_DATA_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.AbstractInOutTreeImpl <em>Abstract In Out Tree</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.AbstractInOutTreeImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getAbstractInOutTree()
     * @generated
     */
    int ABSTRACT_IN_OUT_TREE = 1;

    /**
     * The feature id for the '<em><b>Expression Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IN_OUT_TREE__EXPRESSION_FILTER = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Activate Expression Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IN_OUT_TREE__ACTIVATE_EXPRESSION_FILTER = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Activate Condensed Tool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IN_OUT_TREE__ACTIVATE_CONDENSED_TOOL = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Minimized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IN_OUT_TREE__MINIMIZED = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IN_OUT_TREE__NAME = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Filter Incoming Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IN_OUT_TREE__FILTER_INCOMING_CONNECTIONS = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Multi Loops</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IN_OUT_TREE__MULTI_LOOPS = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Abstract In Out Tree</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IN_OUT_TREE_FEATURE_COUNT = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.InputXmlTreeImpl <em>Input Xml Tree</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.InputXmlTreeImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getInputXmlTree()
     * @generated
     */
    int INPUT_XML_TREE = 2;

    /**
     * The feature id for the '<em><b>Expression Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__EXPRESSION_FILTER = ABSTRACT_IN_OUT_TREE__EXPRESSION_FILTER;

    /**
     * The feature id for the '<em><b>Activate Expression Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__ACTIVATE_EXPRESSION_FILTER = ABSTRACT_IN_OUT_TREE__ACTIVATE_EXPRESSION_FILTER;

    /**
     * The feature id for the '<em><b>Activate Condensed Tool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__ACTIVATE_CONDENSED_TOOL = ABSTRACT_IN_OUT_TREE__ACTIVATE_CONDENSED_TOOL;

    /**
     * The feature id for the '<em><b>Minimized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__MINIMIZED = ABSTRACT_IN_OUT_TREE__MINIMIZED;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__NAME = ABSTRACT_IN_OUT_TREE__NAME;

    /**
     * The feature id for the '<em><b>Filter Incoming Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__FILTER_INCOMING_CONNECTIONS = ABSTRACT_IN_OUT_TREE__FILTER_INCOMING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Multi Loops</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__MULTI_LOOPS = ABSTRACT_IN_OUT_TREE__MULTI_LOOPS;

    /**
     * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__NODES = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Lookup</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__LOOKUP = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Matching Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__MATCHING_MODE = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Lookup Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__LOOKUP_MODE = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Inner Join</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__INNER_JOIN = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Persistent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__PERSISTENT = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Activate Global Map</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__ACTIVATE_GLOBAL_MAP = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Global Map Keys Values</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE__GLOBAL_MAP_KEYS_VALUES = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Input Xml Tree</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_XML_TREE_FEATURE_COUNT = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.OutputXmlTreeImpl <em>Output Xml Tree</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.OutputXmlTreeImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getOutputXmlTree()
     * @generated
     */
    int OUTPUT_XML_TREE = 3;

    /**
     * The feature id for the '<em><b>Expression Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__EXPRESSION_FILTER = ABSTRACT_IN_OUT_TREE__EXPRESSION_FILTER;

    /**
     * The feature id for the '<em><b>Activate Expression Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__ACTIVATE_EXPRESSION_FILTER = ABSTRACT_IN_OUT_TREE__ACTIVATE_EXPRESSION_FILTER;

    /**
     * The feature id for the '<em><b>Activate Condensed Tool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__ACTIVATE_CONDENSED_TOOL = ABSTRACT_IN_OUT_TREE__ACTIVATE_CONDENSED_TOOL;

    /**
     * The feature id for the '<em><b>Minimized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__MINIMIZED = ABSTRACT_IN_OUT_TREE__MINIMIZED;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__NAME = ABSTRACT_IN_OUT_TREE__NAME;

    /**
     * The feature id for the '<em><b>Filter Incoming Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__FILTER_INCOMING_CONNECTIONS = ABSTRACT_IN_OUT_TREE__FILTER_INCOMING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Multi Loops</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__MULTI_LOOPS = ABSTRACT_IN_OUT_TREE__MULTI_LOOPS;

    /**
     * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__NODES = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Reject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__REJECT = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Reject Inner Join</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__REJECT_INNER_JOIN = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Error Reject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__ERROR_REJECT = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>All In One</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__ALL_IN_ONE = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Enable Empty Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__ENABLE_EMPTY_ELEMENT = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Input Loop Nodes Tables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE__INPUT_LOOP_NODES_TABLES = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Output Xml Tree</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_XML_TREE_FEATURE_COUNT = ABSTRACT_IN_OUT_TREE_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.VarTableImpl <em>Var Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.VarTableImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getVarTable()
     * @generated
     */
    int VAR_TABLE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_TABLE__NAME = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_TABLE__NODES = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Minimized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_TABLE__MINIMIZED = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Var Table</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_TABLE_FEATURE_COUNT = AbstractmapPackage.MAPPER_TABLE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.AbstractNodeImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getAbstractNode()
     * @generated
     */
    int ABSTRACT_NODE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NODE__NAME = AbstractmapPackage.MAPPER_TABLE_ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NODE__EXPRESSION = AbstractmapPackage.MAPPER_TABLE_ENTITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NODE__TYPE = AbstractmapPackage.MAPPER_TABLE_ENTITY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NODE__OUTGOING_CONNECTIONS = AbstractmapPackage.MAPPER_TABLE_ENTITY_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NODE__INCOMING_CONNECTIONS = AbstractmapPackage.MAPPER_TABLE_ENTITY_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Filter Out Going Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NODE__FILTER_OUT_GOING_CONNECTIONS = AbstractmapPackage.MAPPER_TABLE_ENTITY_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Abstract Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NODE_FEATURE_COUNT = AbstractmapPackage.MAPPER_TABLE_ENTITY_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.TreeNodeImpl <em>Tree Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.TreeNodeImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getTreeNode()
     * @generated
     */
    int TREE_NODE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__NAME = ABSTRACT_NODE__NAME;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__EXPRESSION = ABSTRACT_NODE__EXPRESSION;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__TYPE = ABSTRACT_NODE__TYPE;

    /**
     * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__OUTGOING_CONNECTIONS = ABSTRACT_NODE__OUTGOING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__INCOMING_CONNECTIONS = ABSTRACT_NODE__INCOMING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Filter Out Going Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__FILTER_OUT_GOING_CONNECTIONS = ABSTRACT_NODE__FILTER_OUT_GOING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__CHILDREN = ABSTRACT_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Xpath</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__XPATH = ABSTRACT_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Loop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__LOOP = ABSTRACT_NODE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Node Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__NODE_TYPE = ABSTRACT_NODE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__PATTERN = ABSTRACT_NODE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__KEY = ABSTRACT_NODE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__GROUP = ABSTRACT_NODE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Main</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__MAIN = ABSTRACT_NODE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Lookup Outgoing Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__LOOKUP_OUTGOING_CONNECTIONS = ABSTRACT_NODE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Lookup Incoming Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__LOOKUP_INCOMING_CONNECTIONS = ABSTRACT_NODE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__DEFAULT_VALUE = ABSTRACT_NODE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__NULLABLE = ABSTRACT_NODE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Choice</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__CHOICE = ABSTRACT_NODE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Substitution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__SUBSTITUTION = ABSTRACT_NODE_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Optional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__OPTIONAL = ABSTRACT_NODE_FEATURE_COUNT + 14;

    /**
     * The number of structural features of the '<em>Tree Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 15;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.OutputTreeNodeImpl <em>Output Tree Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.OutputTreeNodeImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getOutputTreeNode()
     * @generated
     */
    int OUTPUT_TREE_NODE = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__NAME = TREE_NODE__NAME;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__EXPRESSION = TREE_NODE__EXPRESSION;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__TYPE = TREE_NODE__TYPE;

    /**
     * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__OUTGOING_CONNECTIONS = TREE_NODE__OUTGOING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__INCOMING_CONNECTIONS = TREE_NODE__INCOMING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Filter Out Going Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__FILTER_OUT_GOING_CONNECTIONS = TREE_NODE__FILTER_OUT_GOING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__CHILDREN = TREE_NODE__CHILDREN;

    /**
     * The feature id for the '<em><b>Xpath</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__XPATH = TREE_NODE__XPATH;

    /**
     * The feature id for the '<em><b>Loop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__LOOP = TREE_NODE__LOOP;

    /**
     * The feature id for the '<em><b>Node Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__NODE_TYPE = TREE_NODE__NODE_TYPE;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__PATTERN = TREE_NODE__PATTERN;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__KEY = TREE_NODE__KEY;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__GROUP = TREE_NODE__GROUP;

    /**
     * The feature id for the '<em><b>Main</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__MAIN = TREE_NODE__MAIN;

    /**
     * The feature id for the '<em><b>Lookup Outgoing Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__LOOKUP_OUTGOING_CONNECTIONS = TREE_NODE__LOOKUP_OUTGOING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Lookup Incoming Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__LOOKUP_INCOMING_CONNECTIONS = TREE_NODE__LOOKUP_INCOMING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__DEFAULT_VALUE = TREE_NODE__DEFAULT_VALUE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__NULLABLE = TREE_NODE__NULLABLE;

    /**
     * The feature id for the '<em><b>Choice</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__CHOICE = TREE_NODE__CHOICE;

    /**
     * The feature id for the '<em><b>Substitution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__SUBSTITUTION = TREE_NODE__SUBSTITUTION;

    /**
     * The feature id for the '<em><b>Optional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__OPTIONAL = TREE_NODE__OPTIONAL;

    /**
     * The feature id for the '<em><b>Aggregate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__AGGREGATE = TREE_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Input Loop Nodes Table</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE__INPUT_LOOP_NODES_TABLE = TREE_NODE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Output Tree Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TREE_NODE_FEATURE_COUNT = TREE_NODE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.VarNodeImpl <em>Var Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.VarNodeImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getVarNode()
     * @generated
     */
    int VAR_NODE = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_NODE__NAME = ABSTRACT_NODE__NAME;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_NODE__EXPRESSION = ABSTRACT_NODE__EXPRESSION;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_NODE__TYPE = ABSTRACT_NODE__TYPE;

    /**
     * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_NODE__OUTGOING_CONNECTIONS = ABSTRACT_NODE__OUTGOING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_NODE__INCOMING_CONNECTIONS = ABSTRACT_NODE__INCOMING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Filter Out Going Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_NODE__FILTER_OUT_GOING_CONNECTIONS = ABSTRACT_NODE__FILTER_OUT_GOING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_NODE__NULLABLE = ABSTRACT_NODE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Var Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.GlobalMapNodeImpl <em>Global Map Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.GlobalMapNodeImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getGlobalMapNode()
     * @generated
     */
    int GLOBAL_MAP_NODE = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__NAME = TREE_NODE__NAME;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__EXPRESSION = TREE_NODE__EXPRESSION;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__TYPE = TREE_NODE__TYPE;

    /**
     * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__OUTGOING_CONNECTIONS = TREE_NODE__OUTGOING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__INCOMING_CONNECTIONS = TREE_NODE__INCOMING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Filter Out Going Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__FILTER_OUT_GOING_CONNECTIONS = TREE_NODE__FILTER_OUT_GOING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__CHILDREN = TREE_NODE__CHILDREN;

    /**
     * The feature id for the '<em><b>Xpath</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__XPATH = TREE_NODE__XPATH;

    /**
     * The feature id for the '<em><b>Loop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__LOOP = TREE_NODE__LOOP;

    /**
     * The feature id for the '<em><b>Node Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__NODE_TYPE = TREE_NODE__NODE_TYPE;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__PATTERN = TREE_NODE__PATTERN;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__KEY = TREE_NODE__KEY;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__GROUP = TREE_NODE__GROUP;

    /**
     * The feature id for the '<em><b>Main</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__MAIN = TREE_NODE__MAIN;

    /**
     * The feature id for the '<em><b>Lookup Outgoing Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__LOOKUP_OUTGOING_CONNECTIONS = TREE_NODE__LOOKUP_OUTGOING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Lookup Incoming Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__LOOKUP_INCOMING_CONNECTIONS = TREE_NODE__LOOKUP_INCOMING_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__DEFAULT_VALUE = TREE_NODE__DEFAULT_VALUE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__NULLABLE = TREE_NODE__NULLABLE;

    /**
     * The feature id for the '<em><b>Choice</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__CHOICE = TREE_NODE__CHOICE;

    /**
     * The feature id for the '<em><b>Substitution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__SUBSTITUTION = TREE_NODE__SUBSTITUTION;

    /**
     * The feature id for the '<em><b>Optional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE__OPTIONAL = TREE_NODE__OPTIONAL;

    /**
     * The number of structural features of the '<em>Global Map Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MAP_NODE_FEATURE_COUNT = TREE_NODE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.IConnection <em>IConnection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.IConnection
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getIConnection()
     * @generated
     */
    int ICONNECTION = 10;

    /**
     * The number of structural features of the '<em>IConnection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ICONNECTION_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection <em>INode Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getINodeConnection()
     * @generated
     */
    int INODE_CONNECTION = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INODE_CONNECTION__NAME = ICONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INODE_CONNECTION__SOURCE = ICONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INODE_CONNECTION__TARGET = ICONNECTION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>INode Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INODE_CONNECTION_FEATURE_COUNT = ICONNECTION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.ConnectionImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getConnection()
     * @generated
     */
    int CONNECTION = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__NAME = INODE_CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__SOURCE = INODE_CONNECTION__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__TARGET = INODE_CONNECTION__TARGET;

    /**
     * The number of structural features of the '<em>Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_FEATURE_COUNT = INODE_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.LookupConnectionImpl <em>Lookup Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.LookupConnectionImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getLookupConnection()
     * @generated
     */
    int LOOKUP_CONNECTION = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOKUP_CONNECTION__NAME = INODE_CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOKUP_CONNECTION__SOURCE = INODE_CONNECTION__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOKUP_CONNECTION__TARGET = INODE_CONNECTION__TARGET;

    /**
     * The number of structural features of the '<em>Lookup Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOKUP_CONNECTION_FEATURE_COUNT = INODE_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.FilterConnectionImpl <em>Filter Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.FilterConnectionImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getFilterConnection()
     * @generated
     */
    int FILTER_CONNECTION = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_CONNECTION__NAME = ICONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_CONNECTION__SOURCE = ICONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_CONNECTION__TARGET = ICONNECTION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Filter Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_CONNECTION_FEATURE_COUNT = ICONNECTION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.InputLoopNodesTableImpl <em>Input Loop Nodes Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.InputLoopNodesTableImpl
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getInputLoopNodesTable()
     * @generated
     */
    int INPUT_LOOP_NODES_TABLE = 15;

    /**
     * The feature id for the '<em><b>Inputloopnodes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_LOOP_NODES_TABLE__INPUTLOOPNODES = 0;

    /**
     * The number of structural features of the '<em>Input Loop Nodes Table</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_LOOP_NODES_TABLE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.NodeType <em>Node Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.NodeType
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getNodeType()
     * @generated
     */
    int NODE_TYPE = 16;


    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData <em>Xml Map Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Xml Map Data</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData
     * @generated
     */
    EClass getXmlMapData();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getInputTrees <em>Input Trees</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Input Trees</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getInputTrees()
     * @see #getXmlMapData()
     * @generated
     */
    EReference getXmlMapData_InputTrees();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getOutputTrees <em>Output Trees</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Output Trees</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getOutputTrees()
     * @see #getXmlMapData()
     * @generated
     */
    EReference getXmlMapData_OutputTrees();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getVarTables <em>Var Tables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Var Tables</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getVarTables()
     * @see #getXmlMapData()
     * @generated
     */
    EReference getXmlMapData_VarTables();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getConnections <em>Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connections</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getConnections()
     * @see #getXmlMapData()
     * @generated
     */
    EReference getXmlMapData_Connections();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree <em>Abstract In Out Tree</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract In Out Tree</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree
     * @generated
     */
    EClass getAbstractInOutTree();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#getExpressionFilter <em>Expression Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression Filter</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#getExpressionFilter()
     * @see #getAbstractInOutTree()
     * @generated
     */
    EAttribute getAbstractInOutTree_ExpressionFilter();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isActivateExpressionFilter <em>Activate Expression Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Activate Expression Filter</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isActivateExpressionFilter()
     * @see #getAbstractInOutTree()
     * @generated
     */
    EAttribute getAbstractInOutTree_ActivateExpressionFilter();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isActivateCondensedTool <em>Activate Condensed Tool</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Activate Condensed Tool</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isActivateCondensedTool()
     * @see #getAbstractInOutTree()
     * @generated
     */
    EAttribute getAbstractInOutTree_ActivateCondensedTool();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isMinimized <em>Minimized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Minimized</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isMinimized()
     * @see #getAbstractInOutTree()
     * @generated
     */
    EAttribute getAbstractInOutTree_Minimized();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#getName()
     * @see #getAbstractInOutTree()
     * @generated
     */
    EAttribute getAbstractInOutTree_Name();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#getFilterIncomingConnections <em>Filter Incoming Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Filter Incoming Connections</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#getFilterIncomingConnections()
     * @see #getAbstractInOutTree()
     * @generated
     */
    EReference getAbstractInOutTree_FilterIncomingConnections();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isMultiLoops <em>Multi Loops</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multi Loops</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isMultiLoops()
     * @see #getAbstractInOutTree()
     * @generated
     */
    EAttribute getAbstractInOutTree_MultiLoops();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree <em>Input Xml Tree</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Xml Tree</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree
     * @generated
     */
    EClass getInputXmlTree();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Nodes</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getNodes()
     * @see #getInputXmlTree()
     * @generated
     */
    EReference getInputXmlTree_Nodes();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isLookup <em>Lookup</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lookup</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isLookup()
     * @see #getInputXmlTree()
     * @generated
     */
    EAttribute getInputXmlTree_Lookup();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getMatchingMode <em>Matching Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Matching Mode</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getMatchingMode()
     * @see #getInputXmlTree()
     * @generated
     */
    EAttribute getInputXmlTree_MatchingMode();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getLookupMode <em>Lookup Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lookup Mode</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getLookupMode()
     * @see #getInputXmlTree()
     * @generated
     */
    EAttribute getInputXmlTree_LookupMode();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isInnerJoin <em>Inner Join</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inner Join</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isInnerJoin()
     * @see #getInputXmlTree()
     * @generated
     */
    EAttribute getInputXmlTree_InnerJoin();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isPersistent <em>Persistent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Persistent</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isPersistent()
     * @see #getInputXmlTree()
     * @generated
     */
    EAttribute getInputXmlTree_Persistent();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isActivateGlobalMap <em>Activate Global Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Activate Global Map</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isActivateGlobalMap()
     * @see #getInputXmlTree()
     * @generated
     */
    EAttribute getInputXmlTree_ActivateGlobalMap();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getGlobalMapKeysValues <em>Global Map Keys Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Global Map Keys Values</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getGlobalMapKeysValues()
     * @see #getInputXmlTree()
     * @generated
     */
    EReference getInputXmlTree_GlobalMapKeysValues();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree <em>Output Xml Tree</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Xml Tree</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree
     * @generated
     */
    EClass getOutputXmlTree();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Nodes</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#getNodes()
     * @see #getOutputXmlTree()
     * @generated
     */
    EReference getOutputXmlTree_Nodes();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isReject <em>Reject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reject</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isReject()
     * @see #getOutputXmlTree()
     * @generated
     */
    EAttribute getOutputXmlTree_Reject();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isRejectInnerJoin <em>Reject Inner Join</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reject Inner Join</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isRejectInnerJoin()
     * @see #getOutputXmlTree()
     * @generated
     */
    EAttribute getOutputXmlTree_RejectInnerJoin();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isErrorReject <em>Error Reject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Error Reject</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isErrorReject()
     * @see #getOutputXmlTree()
     * @generated
     */
    EAttribute getOutputXmlTree_ErrorReject();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isAllInOne <em>All In One</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>All In One</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isAllInOne()
     * @see #getOutputXmlTree()
     * @generated
     */
    EAttribute getOutputXmlTree_AllInOne();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isEnableEmptyElement <em>Enable Empty Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enable Empty Element</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isEnableEmptyElement()
     * @see #getOutputXmlTree()
     * @generated
     */
    EAttribute getOutputXmlTree_EnableEmptyElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#getInputLoopNodesTables <em>Input Loop Nodes Tables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Input Loop Nodes Tables</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#getInputLoopNodesTables()
     * @see #getOutputXmlTree()
     * @generated
     */
    EReference getOutputXmlTree_InputLoopNodesTables();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.VarTable <em>Var Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Var Table</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.VarTable
     * @generated
     */
    EClass getVarTable();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.VarTable#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.VarTable#getName()
     * @see #getVarTable()
     * @generated
     */
    EAttribute getVarTable_Name();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.VarTable#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Nodes</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.VarTable#getNodes()
     * @see #getVarTable()
     * @generated
     */
    EReference getVarTable_Nodes();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.VarTable#isMinimized <em>Minimized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Minimized</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.VarTable#isMinimized()
     * @see #getVarTable()
     * @generated
     */
    EAttribute getVarTable_Minimized();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode <em>Abstract Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Node</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode
     * @generated
     */
    EClass getAbstractNode();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getName()
     * @see #getAbstractNode()
     * @generated
     */
    EAttribute getAbstractNode_Name();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getExpression()
     * @see #getAbstractNode()
     * @generated
     */
    EAttribute getAbstractNode_Expression();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getType()
     * @see #getAbstractNode()
     * @generated
     */
    EAttribute getAbstractNode_Type();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getOutgoingConnections <em>Outgoing Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing Connections</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getOutgoingConnections()
     * @see #getAbstractNode()
     * @generated
     */
    EReference getAbstractNode_OutgoingConnections();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getIncomingConnections <em>Incoming Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Connections</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getIncomingConnections()
     * @see #getAbstractNode()
     * @generated
     */
    EReference getAbstractNode_IncomingConnections();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getFilterOutGoingConnections <em>Filter Out Going Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Filter Out Going Connections</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode#getFilterOutGoingConnections()
     * @see #getAbstractNode()
     * @generated
     */
    EReference getAbstractNode_FilterOutGoingConnections();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode <em>Tree Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tree Node</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode
     * @generated
     */
    EClass getTreeNode();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getChildren()
     * @see #getTreeNode()
     * @generated
     */
    EReference getTreeNode_Children();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getXpath <em>Xpath</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xpath</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getXpath()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_Xpath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isLoop <em>Loop</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Loop</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isLoop()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_Loop();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getNodeType <em>Node Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Node Type</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getNodeType()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_NodeType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pattern</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getPattern()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_Pattern();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isKey()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_Key();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isGroup()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_Group();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isMain <em>Main</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Main</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isMain()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_Main();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getLookupOutgoingConnections <em>Lookup Outgoing Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Lookup Outgoing Connections</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getLookupOutgoingConnections()
     * @see #getTreeNode()
     * @generated
     */
    EReference getTreeNode_LookupOutgoingConnections();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getLookupIncomingConnections <em>Lookup Incoming Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Lookup Incoming Connections</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getLookupIncomingConnections()
     * @see #getTreeNode()
     * @generated
     */
    EReference getTreeNode_LookupIncomingConnections();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#getDefaultValue()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isNullable <em>Nullable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nullable</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isNullable()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_Nullable();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isChoice <em>Choice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Choice</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isChoice()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_Choice();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isSubstitution <em>Substitution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Substitution</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isSubstitution()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_Substitution();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isOptional <em>Optional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Optional</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode#isOptional()
     * @see #getTreeNode()
     * @generated
     */
    EAttribute getTreeNode_Optional();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode <em>Output Tree Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Tree Node</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode
     * @generated
     */
    EClass getOutputTreeNode();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode#isAggregate <em>Aggregate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Aggregate</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode#isAggregate()
     * @see #getOutputTreeNode()
     * @generated
     */
    EAttribute getOutputTreeNode_Aggregate();

    /**
     * Returns the meta object for the reference '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode#getInputLoopNodesTable <em>Input Loop Nodes Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Input Loop Nodes Table</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode#getInputLoopNodesTable()
     * @see #getOutputTreeNode()
     * @generated
     */
    EReference getOutputTreeNode_InputLoopNodesTable();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.VarNode <em>Var Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Var Node</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.VarNode
     * @generated
     */
    EClass getVarNode();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.VarNode#isNullable <em>Nullable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nullable</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.VarNode#isNullable()
     * @see #getVarNode()
     * @generated
     */
    EAttribute getVarNode_Nullable();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.GlobalMapNode <em>Global Map Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Map Node</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.GlobalMapNode
     * @generated
     */
    EClass getGlobalMapNode();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.IConnection <em>IConnection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IConnection</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.IConnection
     * @generated
     */
    EClass getIConnection();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection <em>INode Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>INode Connection</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection
     * @generated
     */
    EClass getINodeConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection#getName()
     * @see #getINodeConnection()
     * @generated
     */
    EAttribute getINodeConnection_Name();

    /**
     * Returns the meta object for the reference '{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection#getSource()
     * @see #getINodeConnection()
     * @generated
     */
    EReference getINodeConnection_Source();

    /**
     * Returns the meta object for the reference '{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection#getTarget()
     * @see #getINodeConnection()
     * @generated
     */
    EReference getINodeConnection_Target();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.Connection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.Connection
     * @generated
     */
    EClass getConnection();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.LookupConnection <em>Lookup Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lookup Connection</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.LookupConnection
     * @generated
     */
    EClass getLookupConnection();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection <em>Filter Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Filter Connection</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection
     * @generated
     */
    EClass getFilterConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection#getName()
     * @see #getFilterConnection()
     * @generated
     */
    EAttribute getFilterConnection_Name();

    /**
     * Returns the meta object for the reference '{@link org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection#getSource()
     * @see #getFilterConnection()
     * @generated
     */
    EReference getFilterConnection_Source();

    /**
     * Returns the meta object for the reference '{@link org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection#getTarget()
     * @see #getFilterConnection()
     * @generated
     */
    EReference getFilterConnection_Target();

    /**
     * Returns the meta object for class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable <em>Input Loop Nodes Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Loop Nodes Table</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable
     * @generated
     */
    EClass getInputLoopNodesTable();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable#getInputloopnodes <em>Inputloopnodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Inputloopnodes</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable#getInputloopnodes()
     * @see #getInputLoopNodesTable()
     * @generated
     */
    EReference getInputLoopNodesTable_Inputloopnodes();

    /**
     * Returns the meta object for enum '{@link org.talend.designer.xmlmap.model.emf.xmlmap.NodeType <em>Node Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Node Type</em>'.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.NodeType
     * @generated
     */
    EEnum getNodeType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    XmlmapFactory getXmlmapFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlMapDataImpl <em>Xml Map Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlMapDataImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getXmlMapData()
         * @generated
         */
        EClass XML_MAP_DATA = eINSTANCE.getXmlMapData();

        /**
         * The meta object literal for the '<em><b>Input Trees</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XML_MAP_DATA__INPUT_TREES = eINSTANCE.getXmlMapData_InputTrees();

        /**
         * The meta object literal for the '<em><b>Output Trees</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XML_MAP_DATA__OUTPUT_TREES = eINSTANCE.getXmlMapData_OutputTrees();

        /**
         * The meta object literal for the '<em><b>Var Tables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XML_MAP_DATA__VAR_TABLES = eINSTANCE.getXmlMapData_VarTables();

        /**
         * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XML_MAP_DATA__CONNECTIONS = eINSTANCE.getXmlMapData_Connections();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.AbstractInOutTreeImpl <em>Abstract In Out Tree</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.AbstractInOutTreeImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getAbstractInOutTree()
         * @generated
         */
        EClass ABSTRACT_IN_OUT_TREE = eINSTANCE.getAbstractInOutTree();

        /**
         * The meta object literal for the '<em><b>Expression Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_IN_OUT_TREE__EXPRESSION_FILTER = eINSTANCE.getAbstractInOutTree_ExpressionFilter();

        /**
         * The meta object literal for the '<em><b>Activate Expression Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_IN_OUT_TREE__ACTIVATE_EXPRESSION_FILTER = eINSTANCE.getAbstractInOutTree_ActivateExpressionFilter();

        /**
         * The meta object literal for the '<em><b>Activate Condensed Tool</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_IN_OUT_TREE__ACTIVATE_CONDENSED_TOOL = eINSTANCE.getAbstractInOutTree_ActivateCondensedTool();

        /**
         * The meta object literal for the '<em><b>Minimized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_IN_OUT_TREE__MINIMIZED = eINSTANCE.getAbstractInOutTree_Minimized();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_IN_OUT_TREE__NAME = eINSTANCE.getAbstractInOutTree_Name();

        /**
         * The meta object literal for the '<em><b>Filter Incoming Connections</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_IN_OUT_TREE__FILTER_INCOMING_CONNECTIONS = eINSTANCE.getAbstractInOutTree_FilterIncomingConnections();

        /**
         * The meta object literal for the '<em><b>Multi Loops</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_IN_OUT_TREE__MULTI_LOOPS = eINSTANCE.getAbstractInOutTree_MultiLoops();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.InputXmlTreeImpl <em>Input Xml Tree</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.InputXmlTreeImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getInputXmlTree()
         * @generated
         */
        EClass INPUT_XML_TREE = eINSTANCE.getInputXmlTree();

        /**
         * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_XML_TREE__NODES = eINSTANCE.getInputXmlTree_Nodes();

        /**
         * The meta object literal for the '<em><b>Lookup</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_XML_TREE__LOOKUP = eINSTANCE.getInputXmlTree_Lookup();

        /**
         * The meta object literal for the '<em><b>Matching Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_XML_TREE__MATCHING_MODE = eINSTANCE.getInputXmlTree_MatchingMode();

        /**
         * The meta object literal for the '<em><b>Lookup Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_XML_TREE__LOOKUP_MODE = eINSTANCE.getInputXmlTree_LookupMode();

        /**
         * The meta object literal for the '<em><b>Inner Join</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_XML_TREE__INNER_JOIN = eINSTANCE.getInputXmlTree_InnerJoin();

        /**
         * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_XML_TREE__PERSISTENT = eINSTANCE.getInputXmlTree_Persistent();

        /**
         * The meta object literal for the '<em><b>Activate Global Map</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_XML_TREE__ACTIVATE_GLOBAL_MAP = eINSTANCE.getInputXmlTree_ActivateGlobalMap();

        /**
         * The meta object literal for the '<em><b>Global Map Keys Values</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_XML_TREE__GLOBAL_MAP_KEYS_VALUES = eINSTANCE.getInputXmlTree_GlobalMapKeysValues();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.OutputXmlTreeImpl <em>Output Xml Tree</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.OutputXmlTreeImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getOutputXmlTree()
         * @generated
         */
        EClass OUTPUT_XML_TREE = eINSTANCE.getOutputXmlTree();

        /**
         * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_XML_TREE__NODES = eINSTANCE.getOutputXmlTree_Nodes();

        /**
         * The meta object literal for the '<em><b>Reject</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_XML_TREE__REJECT = eINSTANCE.getOutputXmlTree_Reject();

        /**
         * The meta object literal for the '<em><b>Reject Inner Join</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_XML_TREE__REJECT_INNER_JOIN = eINSTANCE.getOutputXmlTree_RejectInnerJoin();

        /**
         * The meta object literal for the '<em><b>Error Reject</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_XML_TREE__ERROR_REJECT = eINSTANCE.getOutputXmlTree_ErrorReject();

        /**
         * The meta object literal for the '<em><b>All In One</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_XML_TREE__ALL_IN_ONE = eINSTANCE.getOutputXmlTree_AllInOne();

        /**
         * The meta object literal for the '<em><b>Enable Empty Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_XML_TREE__ENABLE_EMPTY_ELEMENT = eINSTANCE.getOutputXmlTree_EnableEmptyElement();

        /**
         * The meta object literal for the '<em><b>Input Loop Nodes Tables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_XML_TREE__INPUT_LOOP_NODES_TABLES = eINSTANCE.getOutputXmlTree_InputLoopNodesTables();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.VarTableImpl <em>Var Table</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.VarTableImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getVarTable()
         * @generated
         */
        EClass VAR_TABLE = eINSTANCE.getVarTable();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VAR_TABLE__NAME = eINSTANCE.getVarTable_Name();

        /**
         * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VAR_TABLE__NODES = eINSTANCE.getVarTable_Nodes();

        /**
         * The meta object literal for the '<em><b>Minimized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VAR_TABLE__MINIMIZED = eINSTANCE.getVarTable_Minimized();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.AbstractNodeImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getAbstractNode()
         * @generated
         */
        EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_NODE__NAME = eINSTANCE.getAbstractNode_Name();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_NODE__EXPRESSION = eINSTANCE.getAbstractNode_Expression();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_NODE__TYPE = eINSTANCE.getAbstractNode_Type();

        /**
         * The meta object literal for the '<em><b>Outgoing Connections</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_NODE__OUTGOING_CONNECTIONS = eINSTANCE.getAbstractNode_OutgoingConnections();

        /**
         * The meta object literal for the '<em><b>Incoming Connections</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_NODE__INCOMING_CONNECTIONS = eINSTANCE.getAbstractNode_IncomingConnections();

        /**
         * The meta object literal for the '<em><b>Filter Out Going Connections</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_NODE__FILTER_OUT_GOING_CONNECTIONS = eINSTANCE.getAbstractNode_FilterOutGoingConnections();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.TreeNodeImpl <em>Tree Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.TreeNodeImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getTreeNode()
         * @generated
         */
        EClass TREE_NODE = eINSTANCE.getTreeNode();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TREE_NODE__CHILDREN = eINSTANCE.getTreeNode_Children();

        /**
         * The meta object literal for the '<em><b>Xpath</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__XPATH = eINSTANCE.getTreeNode_Xpath();

        /**
         * The meta object literal for the '<em><b>Loop</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__LOOP = eINSTANCE.getTreeNode_Loop();

        /**
         * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__NODE_TYPE = eINSTANCE.getTreeNode_NodeType();

        /**
         * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__PATTERN = eINSTANCE.getTreeNode_Pattern();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__KEY = eINSTANCE.getTreeNode_Key();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__GROUP = eINSTANCE.getTreeNode_Group();

        /**
         * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__MAIN = eINSTANCE.getTreeNode_Main();

        /**
         * The meta object literal for the '<em><b>Lookup Outgoing Connections</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TREE_NODE__LOOKUP_OUTGOING_CONNECTIONS = eINSTANCE.getTreeNode_LookupOutgoingConnections();

        /**
         * The meta object literal for the '<em><b>Lookup Incoming Connections</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TREE_NODE__LOOKUP_INCOMING_CONNECTIONS = eINSTANCE.getTreeNode_LookupIncomingConnections();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__DEFAULT_VALUE = eINSTANCE.getTreeNode_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__NULLABLE = eINSTANCE.getTreeNode_Nullable();

        /**
         * The meta object literal for the '<em><b>Choice</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__CHOICE = eINSTANCE.getTreeNode_Choice();

        /**
         * The meta object literal for the '<em><b>Substitution</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__SUBSTITUTION = eINSTANCE.getTreeNode_Substitution();

        /**
         * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE__OPTIONAL = eINSTANCE.getTreeNode_Optional();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.OutputTreeNodeImpl <em>Output Tree Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.OutputTreeNodeImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getOutputTreeNode()
         * @generated
         */
        EClass OUTPUT_TREE_NODE = eINSTANCE.getOutputTreeNode();

        /**
         * The meta object literal for the '<em><b>Aggregate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TREE_NODE__AGGREGATE = eINSTANCE.getOutputTreeNode_Aggregate();

        /**
         * The meta object literal for the '<em><b>Input Loop Nodes Table</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_TREE_NODE__INPUT_LOOP_NODES_TABLE = eINSTANCE.getOutputTreeNode_InputLoopNodesTable();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.VarNodeImpl <em>Var Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.VarNodeImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getVarNode()
         * @generated
         */
        EClass VAR_NODE = eINSTANCE.getVarNode();

        /**
         * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VAR_NODE__NULLABLE = eINSTANCE.getVarNode_Nullable();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.GlobalMapNodeImpl <em>Global Map Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.GlobalMapNodeImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getGlobalMapNode()
         * @generated
         */
        EClass GLOBAL_MAP_NODE = eINSTANCE.getGlobalMapNode();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.IConnection <em>IConnection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.IConnection
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getIConnection()
         * @generated
         */
        EClass ICONNECTION = eINSTANCE.getIConnection();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection <em>INode Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getINodeConnection()
         * @generated
         */
        EClass INODE_CONNECTION = eINSTANCE.getINodeConnection();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INODE_CONNECTION__NAME = eINSTANCE.getINodeConnection_Name();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INODE_CONNECTION__SOURCE = eINSTANCE.getINodeConnection_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INODE_CONNECTION__TARGET = eINSTANCE.getINodeConnection_Target();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.ConnectionImpl <em>Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.ConnectionImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getConnection()
         * @generated
         */
        EClass CONNECTION = eINSTANCE.getConnection();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.LookupConnectionImpl <em>Lookup Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.LookupConnectionImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getLookupConnection()
         * @generated
         */
        EClass LOOKUP_CONNECTION = eINSTANCE.getLookupConnection();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.FilterConnectionImpl <em>Filter Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.FilterConnectionImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getFilterConnection()
         * @generated
         */
        EClass FILTER_CONNECTION = eINSTANCE.getFilterConnection();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILTER_CONNECTION__NAME = eINSTANCE.getFilterConnection_Name();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FILTER_CONNECTION__SOURCE = eINSTANCE.getFilterConnection_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FILTER_CONNECTION__TARGET = eINSTANCE.getFilterConnection_Target();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.impl.InputLoopNodesTableImpl <em>Input Loop Nodes Table</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.InputLoopNodesTableImpl
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getInputLoopNodesTable()
         * @generated
         */
        EClass INPUT_LOOP_NODES_TABLE = eINSTANCE.getInputLoopNodesTable();

        /**
         * The meta object literal for the '<em><b>Inputloopnodes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_LOOP_NODES_TABLE__INPUTLOOPNODES = eINSTANCE.getInputLoopNodesTable_Inputloopnodes();

        /**
         * The meta object literal for the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.NodeType <em>Node Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.NodeType
         * @see org.talend.designer.xmlmap.model.emf.xmlmap.impl.XmlmapPackageImpl#getNodeType()
         * @generated
         */
        EEnum NODE_TYPE = eINSTANCE.getNodeType();

    }

} //XmlmapPackage
