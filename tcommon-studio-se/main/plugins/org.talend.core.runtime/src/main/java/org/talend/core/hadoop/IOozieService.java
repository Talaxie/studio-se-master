package org.talend.core.hadoop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.talend.core.IService;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.repository.model.RepositoryNode;

/**
 * created by plv on 2013-3-2 Detailed comment
 * 
 */
public interface IOozieService extends IService {

    /**
     * DOC plv Comment method "getOozieParamFromConnection".
     * 
     * Get oozie parameters from connection
     * 
     * @param Connection
     * @return
     */
    public Map<String, Object> getOozieParamFromConnection(Connection connection);

    public boolean isOozieNode(RepositoryNode node);

    public List<HashMap<String, Object>> getHadoopProperties(Connection connection);

}
