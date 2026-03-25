package metadata;

import static org.junit.Assert.*;

import org.junit.Test;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.cwm.helper.SAPBWTableHelper;
import org.talend.designer.core.model.metadata.MetadataEmfFactory;

public class MetadataEmfFacotryTest {

    @Test
    public void testSetMetadataTable() {
        IMetadataTable table = new MetadataTable();
        table.getAdditionalProperties().put(SAPBWTableHelper.SAP_INFOOBJECT_INNER_TYPE, SAPBWTableHelper.IO_INNERTYPE_ATTRIBUTE);
        MetadataEmfFactory factory = new MetadataEmfFactory();
        factory.setMetadataTable(table);
        Object innerType = factory.getMetadataType().getAdditionalProperties().get(SAPBWTableHelper.SAP_INFOOBJECT_INNER_TYPE);
        assertEquals(SAPBWTableHelper.IO_INNERTYPE_ATTRIBUTE, innerType);
    }
    
}
