/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Clustering Settings</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parameters for computing a clustering model partitioning the input records into segments.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.ClusteringSettings#getMaxNumberOfClusters <em>Max Number Of Clusters</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.ClusteringSettings#getClusterIdAttributeName <em>Cluster Id Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getClusteringSettings()
 * @model
 * @generated
 */
public interface ClusteringSettings extends MiningSettings {

    /**
     * Returns the value of the '<em><b>Max Number Of Clusters</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Upper limit for the number of computed clusters. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Max Number Of Clusters</em>' attribute.
     * @see #setMaxNumberOfClusters(long)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getClusteringSettings_MaxNumberOfClusters()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getMaxNumberOfClusters();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.ClusteringSettings#getMaxNumberOfClusters <em>Max Number Of Clusters</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Max Number Of Clusters</em>' attribute.
     * @see #getMaxNumberOfClusters()
     * @generated
     */
    void setMaxNumberOfClusters(long value);

    /**
     * Returns the value of the '<em><b>Cluster Id Attribute Name</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Attribute name for output of cluster id values. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Cluster Id Attribute Name</em>' attribute.
     * @see #setClusterIdAttributeName(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getClusteringSettings_ClusterIdAttributeName()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getClusterIdAttributeName();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.ClusteringSettings#getClusterIdAttributeName <em>Cluster Id Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cluster Id Attribute Name</em>' attribute.
     * @see #getClusterIdAttributeName()
     * @generated
     */
    void setClusterIdAttributeName(String value);

} // ClusteringSettings
