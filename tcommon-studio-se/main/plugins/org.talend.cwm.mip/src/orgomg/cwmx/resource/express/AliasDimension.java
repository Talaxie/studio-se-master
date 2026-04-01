/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Alias Dimension</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents an Express alias dimension.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.AliasDimension#getBaseDimension <em>Base Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getAliasDimension()
 * @model
 * @generated
 */
public interface AliasDimension extends Dimension {

    /**
     * Returns the value of the '<em><b>Base Dimension</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.express.SimpleDimension#getAliasDimension <em>Alias Dimension</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the SimpleDimension on which an AliasDimension is based.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Base Dimension</em>' reference.
     * @see #setBaseDimension(SimpleDimension)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getAliasDimension_BaseDimension()
     * @see orgomg.cwmx.resource.express.SimpleDimension#getAliasDimension
     * @model opposite="aliasDimension" required="true"
     * @generated
     */
    SimpleDimension getBaseDimension();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.AliasDimension#getBaseDimension <em>Base Dimension</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Base Dimension</em>' reference.
     * @see #getBaseDimension()
     * @generated
     */
    void setBaseDimension(SimpleDimension value);

} // AliasDimension
