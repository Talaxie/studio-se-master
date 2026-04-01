/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.metadata.builder.connection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.MetadataSchema#getSchemaTargets <em>Schema Targets</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.MetadataSchema#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getMetadataSchema()
 * @model
 * @generated
 */
public interface MetadataSchema extends EObject {
    /**
     * Returns the value of the '<em><b>Schema Targets</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.metadata.builder.connection.SchemaTarget}.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.metadata.builder.connection.SchemaTarget#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Targets</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Targets</em>' containment reference list.
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getMetadataSchema_SchemaTargets()
     * @see org.talend.core.model.metadata.builder.connection.SchemaTarget#getSchema
     * @model type="org.talend.core.model.metadata.builder.connection.SchemaTarget" opposite="schema" containment="true"
     * @generated
     */
    EList getSchemaTargets();

    /**
     * Returns the value of the '<em><b>Connection</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection</em>' container reference.
     * @see #setConnection(XmlFileConnection)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getMetadataSchema_Connection()
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#getSchema
     * @model opposite="schema" resolveProxies="false"
     * @generated
     */
    XmlFileConnection getConnection();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.MetadataSchema#getConnection <em>Connection</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection</em>' container reference.
     * @see #getConnection()
     * @generated
     */
    void setConnection(XmlFileConnection value);

} // MetadataSchema