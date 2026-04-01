/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import orgomg.cwm.foundation.softwaredeployment.Component;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Model</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents a physical Express model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.Model#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Component {

    /**
     * Returns the value of the '<em><b>Content</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> An
     * Express representation of the content of the Model. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Content</em>' attribute.
     * @see #setContent(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getModel_Content()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getContent();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.Model#getContent <em>Content</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Content</em>' attribute.
     * @see #getContent()
     * @generated
     */
    void setContent(String value);

} // Model
