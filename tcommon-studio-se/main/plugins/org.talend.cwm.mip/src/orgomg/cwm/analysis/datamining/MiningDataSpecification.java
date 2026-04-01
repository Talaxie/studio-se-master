/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Mining Data Specification</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The collection of mining attributes specifying how to interpret the input data attributes.
 * A description of the attributes accepted by the model for scoring data.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningDataSpecification#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningDataSpecification#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningDataSpecification()
 * @model
 * @generated
 */
public interface MiningDataSpecification extends orgomg.cwm.objectmodel.core.Class {

    /**
     * Returns the value of the '<em><b>Attribute</b></em>' containment
     * reference list. The list contents are of type
     * {@link orgomg.cwm.analysis.datamining.MiningAttribute}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.MiningAttribute#getDataSpecification
     * <em>Data Specification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> MiningAttributes owned by the
     * MiningDataSpecification. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Attribute</em>' containment reference list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningDataSpecification_Attribute()
     * @see orgomg.cwm.analysis.datamining.MiningAttribute#getDataSpecification
     * @model opposite="dataSpecification" containment="true" required="true"
     * @generated
     */
    EList<MiningAttribute> getAttribute();

    /**
     * Returns the value of the '<em><b>Settings</b></em>' reference list. The
     * list contents are of type
     * {@link orgomg.cwm.analysis.datamining.MiningSettings}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.MiningSettings#getDataSpecification
     * <em>Data Specification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> MiningSettings referencing the
     * MiningAttribute. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Settings</em>' reference list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningDataSpecification_Settings()
     * @see orgomg.cwm.analysis.datamining.MiningSettings#getDataSpecification
     * @model opposite="dataSpecification"
     * @generated
     */
    EList<MiningSettings> getSettings();

} // MiningDataSpecification
