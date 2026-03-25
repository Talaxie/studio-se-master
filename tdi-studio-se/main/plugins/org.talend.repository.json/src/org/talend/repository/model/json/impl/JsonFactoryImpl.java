/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.json.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.talend.repository.model.json.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonFactoryImpl extends EFactoryImpl implements JsonFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static JsonFactory init() {
        try {
            JsonFactory theJsonFactory = (JsonFactory)EPackage.Registry.INSTANCE.getEFactory(JsonPackage.eNS_URI);
            if (theJsonFactory != null) {
                return theJsonFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new JsonFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JsonFactoryImpl() {
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
            case JsonPackage.JSON_FILE_CONNECTION: return createJSONFileConnection();
            case JsonPackage.JSON_FILE_CONNECTION_ITEM: return createJSONFileConnectionItem();
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR: return createJSONXPathLoopDescriptor();
            case JsonPackage.JSON_FILE_NODE: return createJSONFileNode();
            case JsonPackage.SCHEMA_TARGET: return createSchemaTarget();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JSONFileConnection createJSONFileConnection() {
        JSONFileConnectionImpl jsonFileConnection = new JSONFileConnectionImpl();
        return jsonFileConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JSONFileConnectionItem createJSONFileConnectionItem() {
        JSONFileConnectionItemImpl jsonFileConnectionItem = new JSONFileConnectionItemImpl();
        return jsonFileConnectionItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JSONXPathLoopDescriptor createJSONXPathLoopDescriptor() {
        JSONXPathLoopDescriptorImpl jsonxPathLoopDescriptor = new JSONXPathLoopDescriptorImpl();
        return jsonxPathLoopDescriptor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JSONFileNode createJSONFileNode() {
        JSONFileNodeImpl jsonFileNode = new JSONFileNodeImpl();
        return jsonFileNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaTarget createSchemaTarget() {
        SchemaTargetImpl schemaTarget = new SchemaTargetImpl();
        return schemaTarget;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JsonPackage getJsonPackage() {
        return (JsonPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static JsonPackage getPackage() {
        return JsonPackage.eINSTANCE;
    }

} //JsonFactoryImpl
