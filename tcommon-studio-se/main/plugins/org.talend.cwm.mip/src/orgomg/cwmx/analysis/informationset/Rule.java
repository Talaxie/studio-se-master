/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset;

import orgomg.cwm.foundation.expressions.ExpressionNode;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Rule</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a rule that performs one or more of the following:
 * 
 * 1) Defines the validation required for data extracted from the data resource part of the InformationSet, Segment or SegmentRegion. This can include the requirement or otherwise of other Segment or SegmentRegions based on the value of the data extracted from this Segment or SegmentRegion.
 * 
 * 2) Defines a calculation that can be used to derive data values, based on data values that are part of the InformationSet, Segment or SegmentRegion.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.Rule#getRuleExpression <em>Rule Expression</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.Rule#getType <em>Type</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.Rule#getInformationSet <em>Information Set</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.Rule#getSegment <em>Segment</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.Rule#getSegmentRegion <em>Segment Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends ModelElement {

    /**
     * Returns the value of the '<em><b>Rule Expression</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> This is the rule, which can be an expression or an
     * expression tree. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Rule Expression</em>' containment
     *         reference.
     * @see #setRuleExpression(ExpressionNode)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getRule_RuleExpression()
     * @model containment="true"
     * @generated
     */
    ExpressionNode getRuleExpression();

    /**
     * Sets the value of the '{@link orgomg.cwmx.analysis.informationset.Rule#getRuleExpression <em>Rule Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rule Expression</em>' containment reference.
     * @see #getRuleExpression()
     * @generated
     */
    void setRuleExpression(ExpressionNode value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * allows the Rule to be categorized - for example validation, calculation.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getRule_Type()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link orgomg.cwmx.analysis.informationset.Rule#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Information Set</b></em>' reference. It
     * is bidirectional and its opposite is '
     * {@link orgomg.cwmx.analysis.informationset.InformationSet#getRule
     * <em>Rule</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The InformationSet for a Rule <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Information Set</em>' reference.
     * @see #setInformationSet(InformationSet)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getRule_InformationSet()
     * @see orgomg.cwmx.analysis.informationset.InformationSet#getRule
     * @model opposite="rule"
     * @generated
     */
    InformationSet getInformationSet();

    /**
     * Sets the value of the '{@link orgomg.cwmx.analysis.informationset.Rule#getInformationSet <em>Information Set</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Information Set</em>' reference.
     * @see #getInformationSet()
     * @generated
     */
    void setInformationSet(InformationSet value);

    /**
     * Returns the value of the '<em><b>Segment</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.analysis.informationset.Segment#getRule <em>Rule</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The Segment for a Rule <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Segment</em>' reference.
     * @see #setSegment(Segment)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getRule_Segment()
     * @see orgomg.cwmx.analysis.informationset.Segment#getRule
     * @model opposite="rule"
     * @generated
     */
    Segment getSegment();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.analysis.informationset.Rule#getSegment
     * <em>Segment</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Segment</em>' reference.
     * @see #getSegment()
     * @generated
     */
    void setSegment(Segment value);

    /**
     * Returns the value of the '<em><b>Segment Region</b></em>' reference. It
     * is bidirectional and its opposite is '
     * {@link orgomg.cwmx.analysis.informationset.SegmentRegion#getRule
     * <em>Rule</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The SegmentRegion for a Rule. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Segment Region</em>' reference.
     * @see #setSegmentRegion(SegmentRegion)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getRule_SegmentRegion()
     * @see orgomg.cwmx.analysis.informationset.SegmentRegion#getRule
     * @model opposite="rule"
     * @generated
     */
    SegmentRegion getSegmentRegion();

    /**
     * Sets the value of the '{@link orgomg.cwmx.analysis.informationset.Rule#getSegmentRegion <em>Segment Region</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Segment Region</em>' reference.
     * @see #getSegmentRegion()
     * @generated
     */
    void setSegmentRegion(SegmentRegion value);

} // Rule
