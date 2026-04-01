package org.talend.repository.hadoopcluster.testutils;

import org.junit.Ignore;
import org.junit.Test;
import org.talend.core.database.conn.ConnParameterKeys;
import org.talend.hadoop.distribution.constants.synapse.ISynapseDistribution;
import org.talend.repository.hadoopcluster.util.ClusterTestUtil;
import org.talend.repository.hadoopcluster.util.HCRepositoryUtil;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnection;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnectionItem;

import java.util.Map;

import static org.junit.Assert.assertEquals;


@Ignore
@SuppressWarnings("nls")
public class SynapseRepositoryUtilTest {

    @Test
    public void testFillDefaultValuesOfHadoopCluster() {
        HadoopClusterConnectionItem synapseItem = ClusterTestUtil.createDefaultHadoopClusterItem();
        HadoopClusterConnection synapseConnection = (HadoopClusterConnection) synapseItem.getConnection();
        synapseConnection.setDistribution(ISynapseDistribution.DISTRIBUTION_NAME);
        synapseConnection.setDfVersion("AZURE_SYNAPSE");

        HCRepositoryUtil.fillDefaultValuesOfHadoopCluster(synapseConnection);
        assertEquals("https://xxxx.dev.azuresynapse.net",
                synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_HOST));
        assertEquals("sparkpools", synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_SPARK_POOLS));
        assertEquals("https://xxxx.dfs.core.windows.net", synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_HOSTNAME));
        assertEquals("container", synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_CONTAINER));
        assertEquals("user", synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_USERNAME));
        assertEquals("password", synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_PASSWORD));
        assertEquals("XXXX-XXXX-XXXX-XXXX-XXXX", synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_DIRECTORY_ID));
        assertEquals("XXXX-XXXX-XXXX-XXXX-XXXX", synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_APPLICATION_ID));
        assertEquals("/tmp", synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_DEPLOY_BLOB));
        assertEquals("2g", synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DRIVER_MEMORY));
        assertEquals("1", synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DRIVER_CORES));
        assertEquals("2g", synapseConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_EXECUTOR_MEMORY));
        
    }
}
