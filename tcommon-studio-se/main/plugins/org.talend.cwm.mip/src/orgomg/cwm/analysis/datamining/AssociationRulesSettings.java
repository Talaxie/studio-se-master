/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Association Rules Settings</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parameters for computing association rules.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.AssociationRulesSettings#getMinimumSupport <em>Minimum Support</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.AssociationRulesSettings#getMinimumConfidence <em>Minimum Confidence</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.AssociationRulesSettings#getItemId <em>Item Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAssociationRulesSettings()
 * @model
 * @generated
 */
public interface AssociationRulesSettings extends MiningSettings {

    /**
     * Returns the value of the '<em><b>Minimum Support</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The minimum support required for association rules. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Minimum Support</em>' attribute.
     * @see #setMinimumSupport(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAssociationRulesSettings_MinimumSupport()
     * @model dataType="orgomg.cwm.objectmodel.core.Float"
     * @generated
     */
    String getMinimumSupport();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.AssociationRulesSettings#getMinimumSupport <em>Minimum Support</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Minimum Support</em>' attribute.
     * @see #getMinimumSupport()
     * @generated
     */
    void setMinimumSupport(String value);

    /**
     * Returns the value of the '<em><b>Minimum Confidence</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The minimum confidence required for association rules. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Minimum Confidence</em>' attribute.
     * @see #setMinimumConfidence(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAssociationRulesSettings_MinimumConfidence()
     * @model dataType="orgomg.cwm.objectmodel.core.Float"
     * @generated
     */
    String getMinimumConfidence();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.AssociationRulesSettings#getMinimumConfidence <em>Minimum Confidence</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Minimum Confidence</em>' attribute.
     * @see #getMinimumConfidence()
     * @generated
     */
    void setMinimumConfidence(String value);

    /**
     * Returns the value of the '<em><b>Item Id</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.MiningAttribute#getSettings
     * <em>Settings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The MiningAttribute referenced by
     * AssociationRulesSettings as an Item ID. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Item Id</em>' reference.
     * @see #setItemId(MiningAttribute)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getAssociationRulesSettings_ItemId()
     * @see orgomg.cwm.analysis.datamining.MiningAttribute#getSettings
     * @model opposite="settings" required="true"
     * @generated
     */
    MiningAttribute getItemId();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.AssociationRulesSettings#getItemId
     * <em>Item Id</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Item Id</em>' reference.
     * @see #getItemId()
     * @generated
     */
    void setItemId(MiningAttribute value);

} // AssociationRulesSettings
