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
 * <em><b>Mining Attribute</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An attribute (aka field or variable). It carries the following user specifications:
 * 
 *     valid values
 *     ordering
 *     taxonomy
 *     normalization
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningAttribute#getDataSpecification <em>Data Specification</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningAttribute#getAttributeUsage <em>Attribute Usage</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.MiningAttribute#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningAttribute()
 * @model
 * @generated
 */
public interface MiningAttribute extends Attribute {

    /**
     * Returns the value of the '<em><b>Data Specification</b></em>' container
     * reference. It is bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.MiningDataSpecification#getAttribute
     * <em>Attribute</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The MiningDataSpecification owning MiningAttributes.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Data Specification</em>' container
     *         reference.
     * @see #setDataSpecification(MiningDataSpecification)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningAttribute_DataSpecification()
     * @see orgomg.cwm.analysis.datamining.MiningDataSpecification#getAttribute
     * @model opposite="attribute" required="true"
     * @generated
     */
    MiningDataSpecification getDataSpecification();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.MiningAttribute#getDataSpecification <em>Data Specification</em>}' container reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Specification</em>' container reference.
     * @see #getDataSpecification()
     * @generated
     */
    void setDataSpecification(MiningDataSpecification value);

    /**
     * Returns the value of the '<em><b>Attribute Usage</b></em>' reference
     * list. The list contents are of type
     * {@link orgomg.cwm.analysis.datamining.AttributeUsageRelation}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.AttributeUsageRelation#getAttribute
     * <em>Attribute</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> AttributeUsageRelations referencing the
     * MiningAttribute. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Attribute Usage</em>' reference list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningAttribute_AttributeUsage()
     * @see orgomg.cwm.analysis.datamining.AttributeUsageRelation#getAttribute
     * @model opposite="attribute"
     * @generated
     */
    EList<AttributeUsageRelation> getAttributeUsage();

    /**
     * Returns the value of the '<em><b>Settings</b></em>' reference list. The
     * list contents are of type
     * {@link orgomg.cwm.analysis.datamining.AssociationRulesSettings}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.AssociationRulesSettings#getItemId
     * <em>Item Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The AssociationRulesSettings referencing the
     * MiningAttribute as an Item ID. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Settings</em>' reference list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getMiningAttribute_Settings()
     * @see orgomg.cwm.analysis.datamining.AssociationRulesSettings#getItemId
     * @model opposite="itemId"
     * @generated
     */
    EList<AssociationRulesSettings> getSettings();

} // MiningAttribute
