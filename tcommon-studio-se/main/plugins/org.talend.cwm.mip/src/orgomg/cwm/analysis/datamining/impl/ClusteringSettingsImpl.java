/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.analysis.datamining.ClusteringSettings;
import orgomg.cwm.analysis.datamining.DataminingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Clustering Settings</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.ClusteringSettingsImpl#getMaxNumberOfClusters <em>Max Number Of Clusters</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.ClusteringSettingsImpl#getClusterIdAttributeName <em>Cluster Id Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClusteringSettingsImpl extends MiningSettingsImpl implements ClusteringSettings {

    /**
     * The default value of the '{@link #getMaxNumberOfClusters() <em>Max Number Of Clusters</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMaxNumberOfClusters()
     * @generated
     * @ordered
     */
    protected static final long MAX_NUMBER_OF_CLUSTERS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMaxNumberOfClusters() <em>Max Number Of Clusters</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMaxNumberOfClusters()
     * @generated
     * @ordered
     */
    protected long maxNumberOfClusters = MAX_NUMBER_OF_CLUSTERS_EDEFAULT;

    /**
     * The default value of the '{@link #getClusterIdAttributeName() <em>Cluster Id Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClusterIdAttributeName()
     * @generated
     * @ordered
     */
    protected static final String CLUSTER_ID_ATTRIBUTE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getClusterIdAttributeName() <em>Cluster Id Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClusterIdAttributeName()
     * @generated
     * @ordered
     */
    protected String clusterIdAttributeName = CLUSTER_ID_ATTRIBUTE_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ClusteringSettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.CLUSTERING_SETTINGS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getMaxNumberOfClusters() {
        return maxNumberOfClusters;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMaxNumberOfClusters(long newMaxNumberOfClusters) {
        long oldMaxNumberOfClusters = maxNumberOfClusters;
        maxNumberOfClusters = newMaxNumberOfClusters;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.CLUSTERING_SETTINGS__MAX_NUMBER_OF_CLUSTERS,
                    oldMaxNumberOfClusters, maxNumberOfClusters));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getClusterIdAttributeName() {
        return clusterIdAttributeName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setClusterIdAttributeName(String newClusterIdAttributeName) {
        String oldClusterIdAttributeName = clusterIdAttributeName;
        clusterIdAttributeName = newClusterIdAttributeName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.CLUSTERING_SETTINGS__CLUSTER_ID_ATTRIBUTE_NAME, oldClusterIdAttributeName,
                    clusterIdAttributeName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DataminingPackage.CLUSTERING_SETTINGS__MAX_NUMBER_OF_CLUSTERS:
            return getMaxNumberOfClusters();
        case DataminingPackage.CLUSTERING_SETTINGS__CLUSTER_ID_ATTRIBUTE_NAME:
            return getClusterIdAttributeName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DataminingPackage.CLUSTERING_SETTINGS__MAX_NUMBER_OF_CLUSTERS:
            setMaxNumberOfClusters((Long) newValue);
            return;
        case DataminingPackage.CLUSTERING_SETTINGS__CLUSTER_ID_ATTRIBUTE_NAME:
            setClusterIdAttributeName((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case DataminingPackage.CLUSTERING_SETTINGS__MAX_NUMBER_OF_CLUSTERS:
            setMaxNumberOfClusters(MAX_NUMBER_OF_CLUSTERS_EDEFAULT);
            return;
        case DataminingPackage.CLUSTERING_SETTINGS__CLUSTER_ID_ATTRIBUTE_NAME:
            setClusterIdAttributeName(CLUSTER_ID_ATTRIBUTE_NAME_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case DataminingPackage.CLUSTERING_SETTINGS__MAX_NUMBER_OF_CLUSTERS:
            return maxNumberOfClusters != MAX_NUMBER_OF_CLUSTERS_EDEFAULT;
        case DataminingPackage.CLUSTERING_SETTINGS__CLUSTER_ID_ATTRIBUTE_NAME:
            return CLUSTER_ID_ATTRIBUTE_NAME_EDEFAULT == null ? clusterIdAttributeName != null
                    : !CLUSTER_ID_ATTRIBUTE_NAME_EDEFAULT.equals(clusterIdAttributeName);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (maxNumberOfClusters: ");
        result.append(maxNumberOfClusters);
        result.append(", clusterIdAttributeName: ");
        result.append(clusterIdAttributeName);
        result.append(')');
        return result.toString();
    }

} // ClusteringSettingsImpl
