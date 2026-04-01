/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Attribute Usage Relation</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parameters for mining activities that are specific for an attribute. Mining attribute usage is intended as a specification apart from the mining input specification itself to enable reuse of the mining input specification for different mining settings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#isIncludeInApplyResult <em>Include In Apply Result</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#getWeight <em>Weight</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#isSuppressNormalization <em>Suppress Normalization</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#getSettings <em>Settings</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAttributeUsageRelation()
 * @model
 * @generated
 */
public interface AttributeUsageRelation extends ModelElement {

    /**
     * Returns the value of the '<em><b>Usage Type</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwm.analysis.datamining.AttributeUsage}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Indicates how the attribute is used by the mining function. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Usage Type</em>' attribute.
     * @see orgomg.cwm.analysis.datamining.AttributeUsage
     * @see #setUsageType(AttributeUsage)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAttributeUsageRelation_UsageType()
     * @model
     * @generated
     */
    AttributeUsage getUsageType();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#getUsageType <em>Usage Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Usage Type</em>' attribute.
     * @see orgomg.cwm.analysis.datamining.AttributeUsage
     * @see #getUsageType()
     * @generated
     */
    void setUsageType(AttributeUsage value);

    /**
     * Returns the value of the '<em><b>Include In Apply Result</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Indicates whether the attribute is included in the
     * output. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Include In Apply Result</em>' attribute.
     * @see #setIncludeInApplyResult(boolean)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAttributeUsageRelation_IncludeInApplyResult()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIncludeInApplyResult();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#isIncludeInApplyResult <em>Include In Apply Result</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Include In Apply Result</em>' attribute.
     * @see #isIncludeInApplyResult()
     * @generated
     */
    void setIncludeInApplyResult(boolean value);

    /**
     * Returns the value of the '<em><b>Weight</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Relative weight of the attribute. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Weight</em>' attribute.
     * @see #setWeight(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAttributeUsageRelation_Weight()
     * @model dataType="orgomg.cwm.objectmodel.core.Float"
     * @generated
     */
    String getWeight();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#getWeight
     * <em>Weight</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Weight</em>' attribute.
     * @see #getWeight()
     * @generated
     */
    void setWeight(String value);

    /**
     * Returns the value of the '<em><b>Suppress Normalization</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Indicates whether normalization is to be suppressed.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Suppress Normalization</em>' attribute.
     * @see #setSuppressNormalization(boolean)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAttributeUsageRelation_SuppressNormalization()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isSuppressNormalization();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#isSuppressNormalization <em>Suppress Normalization</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Suppress Normalization</em>' attribute.
     * @see #isSuppressNormalization()
     * @generated
     */
    void setSuppressNormalization(boolean value);

    /**
     * Returns the value of the '<em><b>Settings</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwm.analysis.datamining.MiningSettings#getAttributeUsage <em>Attribute Usage</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Settings owning AttributeUsageRelations.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Settings</em>' container reference.
     * @see #setSettings(MiningSettings)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAttributeUsageRelation_Settings()
     * @see orgomg.cwm.analysis.datamining.MiningSettings#getAttributeUsage
     * @model opposite="attributeUsage" required="true"
     * @generated
     */
    MiningSettings getSettings();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#getSettings <em>Settings</em>}' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Settings</em>' container reference.
     * @see #getSettings()
     * @generated
     */
    void setSettings(MiningSettings value);

    /**
     * Returns the value of the '<em><b>Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwm.analysis.datamining.MiningAttribute#getAttributeUsage <em>Attribute Usage</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The MiningAttribute referenced by AttributeUsageRelations
     * <!-- end-model-doc -->
     * @return the value of the '<em>Attribute</em>' reference.
     * @see #setAttribute(MiningAttribute)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAttributeUsageRelation_Attribute()
     * @see orgomg.cwm.analysis.datamining.MiningAttribute#getAttributeUsage
     * @model opposite="attributeUsage" required="true"
     * @generated
     */
    MiningAttribute getAttribute();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#getAttribute
     * <em>Attribute</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Attribute</em>' reference.
     * @see #getAttribute()
     * @generated
     */
    void setAttribute(MiningAttribute value);

} // AttributeUsageRelation
