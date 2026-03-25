/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.camel.core.model.camelProperties;

import org.talend.core.model.properties.ProcessItem;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Camel Process Item</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.talend.camel.core.model.camelProperties.CamelProcessItem#getCamelProcess <em>Camel Process</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.talend.camel.core.model.camelProperties.CamelPropertiesPackage#getCamelProcessItem()
 * @model
 * @generated
 */
public interface CamelProcessItem extends ProcessItem {

	/**
     * Returns the value of the '<em><b>Spring Content</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spring Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Spring Content</em>' attribute.
     * @see #setSpringContent(String)
     * @see org.talend.camel.core.model.camelProperties.CamelPropertiesPackage#getCamelProcessItem_SpringContent()
     * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
	String getSpringContent();

	/**
     * Sets the value of the '{@link org.talend.camel.core.model.camelProperties.CamelProcessItem#getSpringContent <em>Spring Content</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spring Content</em>' attribute.
     * @see #getSpringContent()
     * @generated
     */
	void setSpringContent(String value);

    /**
     * Returns the value of the '<em><b>Export Micro Service</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Export Micro Service</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Export Micro Service</em>' attribute.
     * @see #setExportMicroService(boolean)
     * @see org.talend.camel.core.model.camelProperties.CamelPropertiesPackage#getCamelProcessItem_ExportMicroService()
     * @model
     * @generated
     */
    boolean isExportMicroService();

    /**
     * Sets the value of the '{@link org.talend.camel.core.model.camelProperties.CamelProcessItem#isExportMicroService <em>Export Micro Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Export Micro Service</em>' attribute.
     * @see #isExportMicroService()
     * @generated
     */
    void setExportMicroService(boolean value);

} // CamelProcessItem
