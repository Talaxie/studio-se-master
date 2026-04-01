/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.objectmodel.core.Attribute;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Application Attribute</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Attribute used when the model was generated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.ApplicationAttribute#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.ApplicationAttribute#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.ApplicationAttribute#getInputSpec <em>Input Spec</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.ApplicationAttribute#getSupervisedMiningModel <em>Supervised Mining Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getApplicationAttribute()
 * @model
 * @generated
 */
public interface ApplicationAttribute extends Attribute {

    /**
     * Returns the value of the '<em><b>Usage Type</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwm.analysis.datamining.AttributeUsage}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Indicates whether attribute was actively used when the model was
     * generated. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Usage Type</em>' attribute.
     * @see orgomg.cwm.analysis.datamining.AttributeUsage
     * @see #setUsageType(AttributeUsage)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getApplicationAttribute_UsageType()
     * @model
     * @generated
     */
    AttributeUsage getUsageType();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.ApplicationAttribute#getUsageType <em>Usage Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Usage Type</em>' attribute.
     * @see orgomg.cwm.analysis.datamining.AttributeUsage
     * @see #getUsageType()
     * @generated
     */
    void setUsageType(AttributeUsage value);

    /**
     * Returns the value of the '<em><b>Attribute Type</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwm.analysis.datamining.AttributeType}. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> Type of
     * ApplicationAttribute. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Attribute Type</em>' attribute.
     * @see orgomg.cwm.analysis.datamining.AttributeType
     * @see #setAttributeType(AttributeType)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getApplicationAttribute_AttributeType()
     * @model
     * @generated
     */
    AttributeType getAttributeType();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.ApplicationAttribute#getAttributeType <em>Attribute Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Attribute Type</em>' attribute.
     * @see orgomg.cwm.analysis.datamining.AttributeType
     * @see #getAttributeType()
     * @generated
     */
    void setAttributeType(AttributeType value);

    /**
     * Returns the value of the '<em><b>Input Spec</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwm.analysis.datamining.ApplicationInputSpecification#getInputAttribute <em>Input Attribute</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ApplicationInputSpecification owning ApplicationAttributes.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Spec</em>' container reference.
     * @see #setInputSpec(ApplicationInputSpecification)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getApplicationAttribute_InputSpec()
     * @see orgomg.cwm.analysis.datamining.ApplicationInputSpecification#getInputAttribute
     * @model opposite="inputAttribute" required="true"
     * @generated
     */
    ApplicationInputSpecification getInputSpec();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.ApplicationAttribute#getInputSpec <em>Input Spec</em>}' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Input Spec</em>' container reference.
     * @see #getInputSpec()
     * @generated
     */
    void setInputSpec(ApplicationInputSpecification value);

    /**
     * Returns the value of the '<em><b>Supervised Mining Model</b></em>'
     * reference list. The list contents are of type
     * {@link orgomg.cwm.analysis.datamining.SupervisedMiningModel}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.SupervisedMiningModel#getTarget
     * <em>Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> SupervisedMiningModels referencing the
     * ApplicationAttribute as their "target". <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Supervised Mining Model</em>' reference
     *         list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getApplicationAttribute_SupervisedMiningModel()
     * @see orgomg.cwm.analysis.datamining.SupervisedMiningModel#getTarget
     * @model opposite="target"
     * @generated
     */
    EList<SupervisedMiningModel> getSupervisedMiningModel();

} // ApplicationAttribute
