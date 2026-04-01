/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import orgomg.cwm.foundation.softwaredeployment.Component;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Program</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents a physical Express program. The interface to the Program may be documented as an Operation associated with the Program.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.Program#getProgram <em>Program</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.Program#getReturnDimension <em>Return Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends Component {

    /**
     * Returns the value of the '<em><b>Program</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> An
     * Express representation of the Program. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Program</em>' attribute.
     * @see #setProgram(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getProgram_Program()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getProgram();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.Program#getProgram <em>Program</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Program</em>' attribute.
     * @see #getProgram()
     * @generated
     */
    void setProgram(String value);

    /**
     * Returns the value of the '<em><b>Return Dimension</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * present, this specifies that when the Program is called as a function it
     * returns a value of the named Dimension. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Return Dimension</em>' attribute.
     * @see #setReturnDimension(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getProgram_ReturnDimension()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getReturnDimension();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.Program#getReturnDimension <em>Return Dimension</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Return Dimension</em>' attribute.
     * @see #getReturnDimension()
     * @generated
     */
    void setReturnDimension(String value);

} // Program
