/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.resource.record.RecordDef;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Set</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DataSet is the primary container of data records in a DMS II database. A DataSet instance that is owned by another DataSet instance is embedded in its owner.
 * 
 * If the isGlobal attribute is True, the DataSet instance is the global data set -- a special data set with a single instance that contains database global data items.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataSet#isIsGlobal <em>Is Global</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataSet#getOrganization <em>Organization</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataSet#getReorganize <em>Reorganize</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataSet#isIsRequiredAll <em>Is Required All</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataSet#getPartitioningSet <em>Partitioning Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataSet()
 * @model
 * @generated
 */
public interface DataSet extends RecordDef {

    /**
     * Returns the value of the '<em><b>Is Global</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * isGlobal = True, the DataSet instance represents the database?s global
     * data record. There can be at most one DataSet instance with isGlobal =
     * True for a given database, but multiple with isGlobal = False.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Global</em>' attribute.
     * @see #setIsGlobal(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataSet_IsGlobal()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsGlobal();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataSet#isIsGlobal <em>Is Global</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Global</em>' attribute.
     * @see #isIsGlobal()
     * @generated
     */
    void setIsGlobal(boolean value);

    /**
     * Returns the value of the '<em><b>Organization</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Identifies the structural organization of the DataSet.
     * 
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Organization</em>' attribute.
     * @see #setOrganization(String)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataSet_Organization()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getOrganization();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataSet#getOrganization <em>Organization</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Organization</em>' attribute.
     * @see #getOrganization()
     * @generated
     */
    void setOrganization(String value);

    /**
     * Returns the value of the '<em><b>Reorganize</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the reorganization clause attached the DataSet instance.
     * 
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Reorganize</em>' attribute.
     * @see #setReorganize(String)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataSet_Reorganize()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getReorganize();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataSet#getReorganize <em>Reorganize</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Reorganize</em>' attribute.
     * @see #getReorganize()
     * @generated
     */
    void setReorganize(String value);

    /**
     * Returns the value of the '<em><b>Is Required All</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the REQUIRED ALL clause was specified in the DASDL for this DataSet
     * instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Required All</em>' attribute.
     * @see #setIsRequiredAll(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataSet_IsRequiredAll()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsRequiredAll();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataSet#isIsRequiredAll <em>Is Required All</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Required All</em>' attribute.
     * @see #isIsRequiredAll()
     * @generated
     */
    void setIsRequiredAll(boolean value);

    /**
     * Returns the value of the '<em><b>Partitioning Set</b></em>' reference. It
     * is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.dmsii.Set#getPartitionedDataSet
     * <em>Partitioned Data Set</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Identifies the partitioning set
     * for this DataItem instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Partitioning Set</em>' reference.
     * @see #setPartitioningSet(Set)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataSet_PartitioningSet()
     * @see orgomg.cwmx.resource.dmsii.Set#getPartitionedDataSet
     * @model opposite="partitionedDataSet"
     * @generated
     */
    Set getPartitioningSet();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataSet#getPartitioningSet <em>Partitioning Set</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Partitioning Set</em>' reference.
     * @see #getPartitioningSet()
     * @generated
     */
    void setPartitioningSet(Set value);

} // DataSet
