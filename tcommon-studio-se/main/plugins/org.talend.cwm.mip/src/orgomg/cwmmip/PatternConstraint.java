/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip;

import orgomg.cwm.objectmodel.core.Element;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Pattern Constraint</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PatternConstraint is used to define constraints against the metamodel Projection. There is no requirement to use any particular constraint language. However, if OCL is used, the OCL expression contained by PatternConstraint::body must be a valid OCL expression relative to the modeling context of the Projection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmmip.PatternConstraint#getBody <em>Body</em>}</li>
 *   <li>{@link orgomg.cwmmip.PatternConstraint#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmmip.CwmmipPackage#getPatternConstraint()
 * @model
 * @generated
 */
public interface PatternConstraint extends Element {

    /**
     * Returns the value of the '<em><b>Body</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Constraint expressed as a textual string in some constraint language.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Body</em>' attribute.
     * @see #setBody(String)
     * @see orgomg.cwmmip.CwmmipPackage#getPatternConstraint_Body()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getBody();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.PatternConstraint#getBody <em>Body</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' attribute.
     * @see #getBody()
     * @generated
     */
    void setBody(String value);

    /**
     * Returns the value of the '<em><b>Language</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Specfies the names of the constraint language used. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Language</em>' attribute.
     * @see #setLanguage(String)
     * @see orgomg.cwmmip.CwmmipPackage#getPatternConstraint_Language()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getLanguage();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.PatternConstraint#getLanguage <em>Language</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' attribute.
     * @see #getLanguage()
     * @generated
     */
    void setLanguage(String value);

} // PatternConstraint
