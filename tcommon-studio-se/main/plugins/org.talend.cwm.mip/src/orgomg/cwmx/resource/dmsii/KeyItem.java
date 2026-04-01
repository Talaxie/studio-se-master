/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.foundation.keysindexes.IndexedFeature;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Key Item</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * KeyItem instances correspond to DASDL's <key item> construct. Every Key instance has the inherited attribute isSorted = True and the inherited isAscending attribute set as indicated in the DASDL <key item>. By default, isAscending = True.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.KeyItem#getCollation <em>Collation</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getKeyItem()
 * @model
 * @generated
 */
public interface KeyItem extends IndexedFeature {

    /**
     * Returns the value of the '<em><b>Collation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Identifies the value of the collation clause specified for a KeyItem
     * instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Collation</em>' attribute.
     * @see #setCollation(String)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getKeyItem_Collation()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getCollation();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.dmsii.KeyItem#getCollation
     * <em>Collation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Collation</em>' attribute.
     * @see #getCollation()
     * @generated
     */
    void setCollation(String value);

} // KeyItem
