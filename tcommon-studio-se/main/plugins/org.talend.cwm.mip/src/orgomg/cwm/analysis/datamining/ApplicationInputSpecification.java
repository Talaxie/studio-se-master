/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Application Input Specification</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ApplicationInputSpecification is a collection of ApplicationAttributes that drive the MiningModel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.ApplicationInputSpecification#getInputAttribute <em>Input Attribute</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.ApplicationInputSpecification#getMiningModel <em>Mining Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getApplicationInputSpecification()
 * @model
 * @generated
 */
public interface ApplicationInputSpecification extends orgomg.cwm.objectmodel.core.Class {

    /**
     * Returns the value of the '<em><b>Input Attribute</b></em>' containment
     * reference list. The list contents are of type
     * {@link orgomg.cwm.analysis.datamining.ApplicationAttribute}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.ApplicationAttribute#getInputSpec
     * <em>Input Spec</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> ApplicationAttributes owned by the
     * ApplicationInputSpecification. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Input Attribute</em>' containment reference
     *         list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getApplicationInputSpecification_InputAttribute()
     * @see orgomg.cwm.analysis.datamining.ApplicationAttribute#getInputSpec
     * @model opposite="inputSpec" containment="true" required="true"
     * @generated
     */
    EList<ApplicationAttribute> getInputAttribute();

    /**
     * Returns the value of the '<em><b>Mining Model</b></em>' container
     * reference. It is bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.MiningModel#getInputSpec
     * <em>Input Spec</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The MiningModel owning an
     * ApplicationInputSpecification. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Mining Model</em>' container reference.
     * @see #setMiningModel(MiningModel)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getApplicationInputSpecification_MiningModel()
     * @see orgomg.cwm.analysis.datamining.MiningModel#getInputSpec
     * @model opposite="inputSpec"
     * @generated
     */
    MiningModel getMiningModel();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.ApplicationInputSpecification#getMiningModel <em>Mining Model</em>}' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Mining Model</em>' container reference.
     * @see #getMiningModel()
     * @generated
     */
    void setMiningModel(MiningModel value);

} // ApplicationInputSpecification
