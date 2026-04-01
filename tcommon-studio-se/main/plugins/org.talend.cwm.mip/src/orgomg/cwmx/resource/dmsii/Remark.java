/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.objectmodel.core.StructuralFeature;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Remark</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains the text of a % comment embedded anywhere within a DASDL source (except at places where the Comment class should be used). Making Remarks a subtype of StructuralFeature allows their location and order within a DASDL source to be preserved.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Remark#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemark()
 * @model
 * @generated
 */
public interface Remark extends StructuralFeature {

    /**
     * Returns the value of the '<em><b>Text</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the text of the Remark. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Text</em>' attribute.
     * @see #setText(String)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemark_Text()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getText();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Remark#getText <em>Text</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' attribute.
     * @see #getText()
     * @generated
     */
    void setText(String value);

} // Remark
