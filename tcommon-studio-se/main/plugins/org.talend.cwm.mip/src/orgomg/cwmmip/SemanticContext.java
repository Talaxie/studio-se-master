/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Semantic Context</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SemaniticContext is a concrete subclass of Projection that specifies a projection by naming the CWM model elements and associations comprising the projection, along with any constraints on those elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmmip.SemanticContext#getElement <em>Element</em>}</li>
 *   <li>{@link orgomg.cwmmip.SemanticContext#getAssociation <em>Association</em>}</li>
 *   <li>{@link orgomg.cwmmip.SemanticContext#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link orgomg.cwmmip.SemanticContext#getAnchorElement <em>Anchor Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmmip.CwmmipPackage#getSemanticContext()
 * @model
 * @generated
 */
public interface SemanticContext extends Projection {

    /**
     * Returns the value of the '<em><b>Element</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Element
     * contains the names of the CWM metamodel classes comprising the
     * Projection, expressed as string-based, logical names. This attribute has
     * a multiplicity of 0..*. These logical names may refer to elements from
     * multiple CWM metamodel packages. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Element</em>' attribute.
     * @see #setElement(String)
     * @see orgomg.cwmmip.CwmmipPackage#getSemanticContext_Element()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getElement();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.SemanticContext#getElement
     * <em>Element</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Element</em>' attribute.
     * @see #getElement()
     * @generated
     */
    void setElement(String value);

    /**
     * Returns the value of the '<em><b>Association</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Association contains the names of CWM associations comprising the
     * Projection, expressed as string-based logical names. This attribute has a
     * multiplicity of 0..*. These logical names may refer to associations from
     * any number of CWM packages, including associations that span packages.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Association</em>' attribute.
     * @see #setAssociation(String)
     * @see orgomg.cwmmip.CwmmipPackage#getSemanticContext_Association()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getAssociation();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.SemanticContext#getAssociation <em>Association</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Association</em>' attribute.
     * @see #getAssociation()
     * @generated
     */
    void setAssociation(String value);

    /**
     * Returns the value of the '<em><b>Constraint</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Constraint is a collection of pattern constraints
     * that apply to elements and associations comprising the Projection. This
     * attribute has a multiplicity of 0..*. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Constraint</em>' containment reference.
     * @see #setConstraint(PatternConstraint)
     * @see orgomg.cwmmip.CwmmipPackage#getSemanticContext_Constraint()
     * @model containment="true"
     * @generated
     */
    PatternConstraint getConstraint();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.SemanticContext#getConstraint <em>Constraint</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Constraint</em>' containment reference.
     * @see #getConstraint()
     * @generated
     */
    void setConstraint(PatternConstraint value);

    /**
     * Returns the value of the '<em><b>Anchor Element</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * AnchorElement names CWM metamodel elements from the Projection that have
     * some distinguished meaning. Generally, these elements are thought of as
     * root objects of the metamodel Projection graph and are used as starting
     * points for navigating the graph. This attribute has a multiplicity of
     * 0..*. Although a Projection may have multiple anchor points, in practice,
     * most Projections will usually have a single anchor point. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Anchor Element</em>' attribute.
     * @see #setAnchorElement(String)
     * @see orgomg.cwmmip.CwmmipPackage#getSemanticContext_AnchorElement()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getAnchorElement();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.SemanticContext#getAnchorElement <em>Anchor Element</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Anchor Element</em>' attribute.
     * @see #getAnchorElement()
     * @generated
     */
    void setAnchorElement(String value);

} // SemanticContext
