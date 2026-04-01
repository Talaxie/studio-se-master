/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.json.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.talend.core.model.metadata.builder.connection.ConnectionPackage;

import org.talend.core.model.properties.PropertiesPackage;

import org.talend.repository.model.json.JSONFileConnection;
import org.talend.repository.model.json.JSONFileConnectionItem;
import org.talend.repository.model.json.JSONFileNode;
import org.talend.repository.model.json.JSONXPathLoopDescriptor;
import org.talend.repository.model.json.JsonFactory;
import org.talend.repository.model.json.JsonPackage;
import org.talend.repository.model.json.SchemaTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonPackageImpl extends EPackageImpl implements JsonPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jsonFileConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jsonFileConnectionItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jsonxPathLoopDescriptorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jsonFileNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass schemaTargetEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.repository.model.json.JsonPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private JsonPackageImpl() {
        super(eNS_URI, JsonFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link JsonPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static JsonPackage init() {
        if (isInited) return (JsonPackage)EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI);

        // Obtain or create and register package
        JsonPackageImpl theJsonPackage = (JsonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JsonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JsonPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PropertiesPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theJsonPackage.createPackageContents();

        // Initialize created meta-data
        theJsonPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theJsonPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(JsonPackage.eNS_URI, theJsonPackage);
        return theJsonPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJSONFileConnection() {
        return jsonFileConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileConnection_JSONFilePath() {
        return (EAttribute)jsonFileConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileConnection_Guess() {
        return (EAttribute)jsonFileConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileConnection_MaskXPattern() {
        return (EAttribute)jsonFileConnectionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJSONFileConnection_Schema() {
        return (EReference)jsonFileConnectionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileConnection_Encoding() {
        return (EAttribute)jsonFileConnectionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJSONFileConnection_Group() {
        return (EReference)jsonFileConnectionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJSONFileConnection_Root() {
        return (EReference)jsonFileConnectionEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJSONFileConnection_Loop() {
        return (EReference)jsonFileConnectionEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileConnection_InputModel() {
        return (EAttribute)jsonFileConnectionEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileConnection_OutputFilePath() {
        return (EAttribute)jsonFileConnectionEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileConnection_FileContent() {
        return (EAttribute)jsonFileConnectionEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileConnection_ReadbyMode() {
        return (EAttribute)jsonFileConnectionEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJSONFileConnectionItem() {
        return jsonFileConnectionItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJSONXPathLoopDescriptor() {
        return jsonxPathLoopDescriptorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONXPathLoopDescriptor_LimitBoucle() {
        return (EAttribute)jsonxPathLoopDescriptorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONXPathLoopDescriptor_AbsoluteXPathQuery() {
        return (EAttribute)jsonxPathLoopDescriptorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJSONXPathLoopDescriptor_Connection() {
        return (EReference)jsonxPathLoopDescriptorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJSONXPathLoopDescriptor_SchemaTargets() {
        return (EReference)jsonxPathLoopDescriptorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONXPathLoopDescriptor_Flag() {
        return (EAttribute)jsonxPathLoopDescriptorEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJSONFileNode() {
        return jsonFileNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileNode_JSONPath() {
        return (EAttribute)jsonFileNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileNode_RelatedColumn() {
        return (EAttribute)jsonFileNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileNode_DefaultValue() {
        return (EAttribute)jsonFileNodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileNode_Attribute() {
        return (EAttribute)jsonFileNodeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileNode_Order() {
        return (EAttribute)jsonFileNodeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJSONFileNode_Type() {
        return (EAttribute)jsonFileNodeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSchemaTarget() {
        return schemaTargetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaTarget_RelativeXPathQuery() {
        return (EAttribute)schemaTargetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaTarget_TagName() {
        return (EAttribute)schemaTargetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaTarget_Schema() {
        return (EReference)schemaTargetEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JsonFactory getJsonFactory() {
        return (JsonFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        jsonFileConnectionEClass = createEClass(JSON_FILE_CONNECTION);
        createEAttribute(jsonFileConnectionEClass, JSON_FILE_CONNECTION__JSON_FILE_PATH);
        createEAttribute(jsonFileConnectionEClass, JSON_FILE_CONNECTION__GUESS);
        createEAttribute(jsonFileConnectionEClass, JSON_FILE_CONNECTION__MASK_XPATTERN);
        createEReference(jsonFileConnectionEClass, JSON_FILE_CONNECTION__SCHEMA);
        createEAttribute(jsonFileConnectionEClass, JSON_FILE_CONNECTION__ENCODING);
        createEReference(jsonFileConnectionEClass, JSON_FILE_CONNECTION__GROUP);
        createEReference(jsonFileConnectionEClass, JSON_FILE_CONNECTION__ROOT);
        createEReference(jsonFileConnectionEClass, JSON_FILE_CONNECTION__LOOP);
        createEAttribute(jsonFileConnectionEClass, JSON_FILE_CONNECTION__INPUT_MODEL);
        createEAttribute(jsonFileConnectionEClass, JSON_FILE_CONNECTION__OUTPUT_FILE_PATH);
        createEAttribute(jsonFileConnectionEClass, JSON_FILE_CONNECTION__FILE_CONTENT);
        createEAttribute(jsonFileConnectionEClass, JSON_FILE_CONNECTION__READBY_MODE);

        jsonFileConnectionItemEClass = createEClass(JSON_FILE_CONNECTION_ITEM);

        jsonxPathLoopDescriptorEClass = createEClass(JSONX_PATH_LOOP_DESCRIPTOR);
        createEAttribute(jsonxPathLoopDescriptorEClass, JSONX_PATH_LOOP_DESCRIPTOR__LIMIT_BOUCLE);
        createEAttribute(jsonxPathLoopDescriptorEClass, JSONX_PATH_LOOP_DESCRIPTOR__ABSOLUTE_XPATH_QUERY);
        createEReference(jsonxPathLoopDescriptorEClass, JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION);
        createEReference(jsonxPathLoopDescriptorEClass, JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS);
        createEAttribute(jsonxPathLoopDescriptorEClass, JSONX_PATH_LOOP_DESCRIPTOR__FLAG);

        jsonFileNodeEClass = createEClass(JSON_FILE_NODE);
        createEAttribute(jsonFileNodeEClass, JSON_FILE_NODE__JSON_PATH);
        createEAttribute(jsonFileNodeEClass, JSON_FILE_NODE__RELATED_COLUMN);
        createEAttribute(jsonFileNodeEClass, JSON_FILE_NODE__DEFAULT_VALUE);
        createEAttribute(jsonFileNodeEClass, JSON_FILE_NODE__ATTRIBUTE);
        createEAttribute(jsonFileNodeEClass, JSON_FILE_NODE__ORDER);
        createEAttribute(jsonFileNodeEClass, JSON_FILE_NODE__TYPE);

        schemaTargetEClass = createEClass(SCHEMA_TARGET);
        createEAttribute(schemaTargetEClass, SCHEMA_TARGET__RELATIVE_XPATH_QUERY);
        createEAttribute(schemaTargetEClass, SCHEMA_TARGET__TAG_NAME);
        createEReference(schemaTargetEClass, SCHEMA_TARGET__SCHEMA);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
        ConnectionPackage theConnectionPackage = (ConnectionPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI);
        PropertiesPackage thePropertiesPackage = (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        jsonFileConnectionEClass.getESuperTypes().add(theConnectionPackage.getConnection());
        jsonFileConnectionItemEClass.getESuperTypes().add(thePropertiesPackage.getConnectionItem());

        // Initialize classes and features; add operations and parameters
        initEClass(jsonFileConnectionEClass, JSONFileConnection.class, "JSONFileConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJSONFileConnection_JSONFilePath(), ecorePackage.getEString(), "JSONFilePath", null, 0, 1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileConnection_Guess(), ecorePackage.getEBoolean(), "Guess", null, 0, 1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileConnection_MaskXPattern(), ecorePackage.getEString(), "MaskXPattern", null, 0, 1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJSONFileConnection_Schema(), this.getJSONXPathLoopDescriptor(), this.getJSONXPathLoopDescriptor_Connection(), "schema", null, 0, -1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileConnection_Encoding(), ecorePackage.getEString(), "Encoding", null, 0, 1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJSONFileConnection_Group(), this.getJSONFileNode(), null, "group", null, 0, -1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJSONFileConnection_Root(), this.getJSONFileNode(), null, "root", null, 0, -1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getJSONFileConnection_Loop(), this.getJSONFileNode(), null, "loop", null, 0, -1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileConnection_InputModel(), ecorePackage.getEBoolean(), "inputModel", "true", 0, 1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileConnection_OutputFilePath(), ecorePackage.getEString(), "outputFilePath", null, 0, 1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileConnection_FileContent(), ecorePackage.getEByteArray(), "fileContent", null, 0, 1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileConnection_ReadbyMode(), ecorePackage.getEString(), "readbyMode", null, 0, 1, JSONFileConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jsonFileConnectionItemEClass, JSONFileConnectionItem.class, "JSONFileConnectionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(jsonxPathLoopDescriptorEClass, JSONXPathLoopDescriptor.class, "JSONXPathLoopDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJSONXPathLoopDescriptor_LimitBoucle(), ecorePackage.getEIntegerObject(), "LimitBoucle", null, 0, 1, JSONXPathLoopDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONXPathLoopDescriptor_AbsoluteXPathQuery(), ecorePackage.getEString(), "AbsoluteXPathQuery", null, 0, 1, JSONXPathLoopDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJSONXPathLoopDescriptor_Connection(), this.getJSONFileConnection(), this.getJSONFileConnection_Schema(), "connection", null, 0, 1, JSONXPathLoopDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJSONXPathLoopDescriptor_SchemaTargets(), this.getSchemaTarget(), this.getSchemaTarget_Schema(), "schemaTargets", null, 0, -1, JSONXPathLoopDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONXPathLoopDescriptor_Flag(), ecorePackage.getEString(), "flag", null, 0, 1, JSONXPathLoopDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jsonFileNodeEClass, JSONFileNode.class, "JSONFileNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJSONFileNode_JSONPath(), ecorePackage.getEString(), "JSONPath", null, 0, 1, JSONFileNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileNode_RelatedColumn(), ecorePackage.getEString(), "RelatedColumn", null, 0, 1, JSONFileNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileNode_DefaultValue(), ecorePackage.getEString(), "DefaultValue", null, 0, 1, JSONFileNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileNode_Attribute(), ecorePackage.getEString(), "Attribute", null, 0, 1, JSONFileNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileNode_Order(), ecorePackage.getEInt(), "Order", null, 0, 1, JSONFileNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJSONFileNode_Type(), ecorePackage.getEString(), "Type", null, 0, 1, JSONFileNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(schemaTargetEClass, SchemaTarget.class, "SchemaTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSchemaTarget_RelativeXPathQuery(), ecorePackage.getEString(), "RelativeXPathQuery", null, 0, 1, SchemaTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaTarget_TagName(), ecorePackage.getEString(), "TagName", null, 0, 1, SchemaTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaTarget_Schema(), this.getJSONXPathLoopDescriptor(), this.getJSONXPathLoopDescriptor_SchemaTargets(), "schema", null, 0, 1, SchemaTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //JsonPackageImpl
