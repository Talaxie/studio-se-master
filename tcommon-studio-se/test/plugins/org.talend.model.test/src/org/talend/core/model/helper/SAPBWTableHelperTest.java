package org.talend.core.model.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.SAPBWTable;
import org.talend.core.model.metadata.builder.connection.SAPConnection;
import org.talend.cwm.helper.SAPBWTableHelper;

public class SAPBWTableHelperTest {

    @Test
    public void testGetBWTableList() {
        List<SAPBWTable> list = SAPBWTableHelper.getBWTableList(getConnection(), SAPBWTableHelper.TYPE_DATASOURCE);
        assertNotNull(list);
        SAPBWTable table = list.get(0);
        assertEquals("DATASOURCE", table.getName());
    }

    @Test
    public void testRemoveBWTable() {
        SAPConnection connection = getConnection();
        SAPBWTable table = connection.getBWDataSources().get(0);
        SAPBWTableHelper.removeBWTable(connection, SAPBWTableHelper.TYPE_DATASOURCE, table);
        assertTrue(connection.getBWDataSources().isEmpty());
    }

    private SAPConnection getConnection() {
        SAPConnection connection = ConnectionFactory.eINSTANCE.createSAPConnection();
        SAPBWTable dataSource = ConnectionFactory.eINSTANCE.createSAPBWTable();
        dataSource.setName("DATASOURCE");
        connection.getBWDataSources().add(dataSource);
        return connection;
    }
}
