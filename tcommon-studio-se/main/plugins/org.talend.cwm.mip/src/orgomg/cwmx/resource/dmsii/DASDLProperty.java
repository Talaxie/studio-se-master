/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DASDL Property</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DASDL language source file from which DMS II databases are built contains a large number (>100) of options related primarily to the physical characteristics or deployment of DMS II databases and the data and set structures they contain.
 * Generally, these ?DASDL properties? are of the form <name> = <string>, where the meaning of the contents of <string> is specific to the property that is being described (i.e., knowing the content of <name>). Also, new DASDL properties are added from time to time. Capturing these DASDL properties as <name>/<string> pairs has several important side-effects, including 
 * 
 *     a much simplified DMS II model overall,
 *     addition of new properties without having to change the model, and
 *     maintenance of the order (because of the ordered nature of the association to 
 *         ModelElement) in which the property values were supplied in the DASDL source.
 * 
 * Note that allowing a DASDL remark (i.e., a %-comment) to be a DASDL property in this case allows preservation of the order remarks with respect to other DASDL properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DASDLProperty#getText <em>Text</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DASDLProperty#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDASDLProperty()
 * @model
 * @generated
 */
public interface DASDLProperty extends ModelElement {

    /**
     * Returns the value of the '<em><b>Text</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the text of the DASDL property. The precise content of the
     * string is dependent upon the name of the DASDL property defined in the
     * name attribute inherited from ModelElement. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Text</em>' attribute.
     * @see #setText(String)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDASDLProperty_Text()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getText();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DASDLProperty#getText <em>Text</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' attribute.
     * @see #getText()
     * @generated
     */
    void setText(String value);

    /**
     * Returns the value of the '<em><b>Owner</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwm.objectmodel.core.ModelElement#getDasdlProperty <em>Dasdl Property</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the owning ModelElement.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owner</em>' reference.
     * @see #setOwner(ModelElement)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDASDLProperty_Owner()
     * @see orgomg.cwm.objectmodel.core.ModelElement#getDasdlProperty
     * @model opposite="dasdlProperty" required="true"
     * @generated
     */
    ModelElement getOwner();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DASDLProperty#getOwner <em>Owner</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' reference.
     * @see #getOwner()
     * @generated
     */
    void setOwner(ModelElement value);

} // DASDLProperty
