/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Set</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a DMS II Set that spans some DataSet. Sets are represented by a physical file in a deployed DMSII database.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Set#getSetType <em>Set Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Set#getReorganize <em>Reorganize</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Set#getKeyDataItem <em>Key Data Item</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Set#getPartitionedSet <em>Partitioned Set</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Set#getPartitioningSet <em>Partitioning Set</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Set#getPartitionedDataSet <em>Partitioned Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends SetStructure {

    /**
     * Returns the value of the '<em><b>Set Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the set organization for this Set instance. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Set Type</em>' attribute.
     * @see #setSetType(String)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getSet_SetType()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getSetType();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Set#getSetType
     * <em>Set Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Set Type</em>' attribute.
     * @see #getSetType()
     * @generated
     */
    void setSetType(String value);

    /**
     * Returns the value of the '<em><b>Reorganize</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the content of the reorganization clause, if any, that was
     * specified for the Set instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Reorganize</em>' attribute.
     * @see #setReorganize(String)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getSet_Reorganize()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getReorganize();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Set#getReorganize <em>Reorganize</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Reorganize</em>' attribute.
     * @see #getReorganize()
     * @generated
     */
    void setReorganize(String value);

    /**
     * Returns the value of the '<em><b>Key Data Item</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.dmsii.DataItem}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.dmsii.DataItem#getKeyDataSet <em>Key Data Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the DataItem instances that participate in the Set instance?s key data.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Key Data Item</em>' reference list.
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getSet_KeyDataItem()
     * @see orgomg.cwmx.resource.dmsii.DataItem#getKeyDataSet
     * @model opposite="keyDataSet"
     * @generated
     */
    EList<DataItem> getKeyDataItem();

    /**
     * Returns the value of the '<em><b>Partitioned Set</b></em>' reference
     * list. The list contents are of type
     * {@link orgomg.cwmx.resource.dmsii.Set}. It is bidirectional and its
     * opposite is '{@link orgomg.cwmx.resource.dmsii.Set#getPartitioningSet
     * <em>Partitioning Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the partitioned set. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Partitioned Set</em>' reference list.
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getSet_PartitionedSet()
     * @see orgomg.cwmx.resource.dmsii.Set#getPartitioningSet
     * @model opposite="partitioningSet"
     * @generated
     */
    EList<Set> getPartitionedSet();

    /**
     * Returns the value of the '<em><b>Partitioning Set</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.dmsii.Set#getPartitionedSet <em>Partitioned Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the partitioning set.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Partitioning Set</em>' reference.
     * @see #setPartitioningSet(Set)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getSet_PartitioningSet()
     * @see orgomg.cwmx.resource.dmsii.Set#getPartitionedSet
     * @model opposite="partitionedSet"
     * @generated
     */
    Set getPartitioningSet();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Set#getPartitioningSet <em>Partitioning Set</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Partitioning Set</em>' reference.
     * @see #getPartitioningSet()
     * @generated
     */
    void setPartitioningSet(Set value);

    /**
     * Returns the value of the '<em><b>Partitioned Data Set</b></em>'
     * reference. It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.dmsii.DataSet#getPartitioningSet
     * <em>Partitioning Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the DataSet instances which the
     * Set instance partitions. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Partitioned Data Set</em>' reference.
     * @see #setPartitionedDataSet(DataSet)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getSet_PartitionedDataSet()
     * @see orgomg.cwmx.resource.dmsii.DataSet#getPartitioningSet
     * @model opposite="partitioningSet"
     * @generated
     */
    DataSet getPartitionedDataSet();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Set#getPartitionedDataSet <em>Partitioned Data Set</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Partitioned Data Set</em>' reference.
     * @see #getPartitionedDataSet()
     * @generated
     */
    void setPartitionedDataSet(DataSet value);

} // Set
