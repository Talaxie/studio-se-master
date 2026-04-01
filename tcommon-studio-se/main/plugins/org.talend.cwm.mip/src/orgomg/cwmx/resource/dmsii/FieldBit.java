/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Field Bit</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FieldBit instances name the individual bits in a DMS II field data item.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.FieldBit#getDataItem <em>Data Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getFieldBit()
 * @model
 * @generated
 */
public interface FieldBit extends ModelElement {

    /**
     * Returns the value of the '<em><b>Data Item</b></em>' container reference.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.dmsii.DataItem#getFieldBit
     * <em>Field Bit</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the FIELD data item for which a FieldBit
     * is relevant. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Data Item</em>' container reference.
     * @see #setDataItem(DataItem)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getFieldBit_DataItem()
     * @see orgomg.cwmx.resource.dmsii.DataItem#getFieldBit
     * @model opposite="fieldBit" required="true"
     * @generated
     */
    DataItem getDataItem();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.FieldBit#getDataItem <em>Data Item</em>}' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Data Item</em>' container reference.
     * @see #getDataItem()
     * @generated
     */
    void setDataItem(DataItem value);

} // FieldBit
