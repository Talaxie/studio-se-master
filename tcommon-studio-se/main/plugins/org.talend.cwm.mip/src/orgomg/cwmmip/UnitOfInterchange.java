/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip;

import orgomg.cwm.objectmodel.core.Namespace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Unit Of Interchange</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UnitOfInterchange is a subclass of CWM Namespace that contains the complete CWM instance (model/metadata) being interchanged.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmmip.UnitOfInterchange#getInterchangePattern <em>Interchange Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmmip.CwmmipPackage#getUnitOfInterchange()
 * @model
 * @generated
 */
public interface UnitOfInterchange extends Namespace {

    /**
     * Returns the value of the '<em><b>Interchange Pattern</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmmip.InterchangePattern#getUnitOfInterchange <em>Unit Of Interchange</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interchange Pattern</em>' reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interchange Pattern</em>' reference.
     * @see #setInterchangePattern(InterchangePattern)
     * @see orgomg.cwmmip.CwmmipPackage#getUnitOfInterchange_InterchangePattern()
     * @see orgomg.cwmmip.InterchangePattern#getUnitOfInterchange
     * @model opposite="unitOfInterchange"
     * @generated
     */
    InterchangePattern getInterchangePattern();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.UnitOfInterchange#getInterchangePattern <em>Interchange Pattern</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Interchange Pattern</em>' reference.
     * @see #getInterchangePattern()
     * @generated
     */
    void setInterchangePattern(InterchangePattern value);

} // UnitOfInterchange
