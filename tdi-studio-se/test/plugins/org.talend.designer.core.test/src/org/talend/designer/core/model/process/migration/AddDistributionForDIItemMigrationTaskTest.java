package org.talend.designer.core.model.process.migration;

import org.eclipse.core.runtime.Path;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.process.IElement;
import org.talend.core.model.properties.ItemState;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.RepositoryObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.FakeElement;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;

public class AddDistributionForDIItemMigrationTaskTest {
    private ProcessItem testItem;

    @Before
    public void setUp() throws Exception {
        testItem = createTempProcessItem();
    }

    @After
    public void tearDown() throws Exception {
        RepositoryObject objToDelete = new RepositoryObject(testItem.getProperty());
        ProxyRepositoryFactory.getInstance().deleteObjectPhysical(objToDelete);
        testItem = null;
    }

    @Test
    public void testAddDistributionForDI() {

        AddDistributionForDIItemMigrationTask migration = new AddDistributionForDIItemMigrationTask();
        migration.execute(testItem);
        for (Object o : testItem.getProcess().getNode()) {
            if (o instanceof NodeType) {
                NodeType nt = (NodeType) o;
                if ("tHiveConnection".equals(nt.getComponentName())) {
                    assertDistribution(nt, "HORTONWORKS");
                } else if ("tHBaseConnection".equals(nt.getComponentName())) {
                    assertDistribution(nt, "AMAZON_EMR");
                } else if ("tHDFSConnection".equals(nt.getComponentName())) {
                    assertDistribution(nt, "CLOUDERA");
                } else if ("tImpalaConnection".equals(nt.getComponentName())) {
                    assertDistribution(nt, "SPARK");
                } else if ("tHiveInput".equals(nt.getComponentName())) {
                    assertDistribution(nt, "MICROSOFT_HD_INSIGHT");
                }
            }
        }
    }

    private void assertDistribution(NodeType nt, String distribution) {
        String distributionValue = null;
        for (Object o : nt.getElementParameter()) {
            if (o instanceof ElementParameterType) {
                ElementParameterType ept = (ElementParameterType) o;
                if ("DISTRIBUTION".equals(ept.getName())) {
                    distributionValue = ept.getValue();
                }
            }
        }
        Assert.assertEquals(distribution, distributionValue);
    }
    private ProcessItem createTempProcessItem() throws PersistenceException {
        ProcessItem processItem = PropertiesFactory.eINSTANCE.createProcessItem();
        Property myProperty = PropertiesFactory.eINSTANCE.createProperty();
        myProperty.setId(ProxyRepositoryFactory.getInstance().getNextId());
        ItemState itemState = PropertiesFactory.eINSTANCE.createItemState();
        itemState.setDeleted(false);
        itemState.setPath("");
        processItem.setState(itemState);
        processItem.setProperty(myProperty);
        myProperty.setLabel("addDistributionForDI");
        myProperty.setVersion("0.1");
        ProcessType processType = TalendFileFactory.eINSTANCE.createProcessType();
        // tHiveConnection
        NodeType nodeTypeHive = createNodeType("tHiveConnection", "HIVE_VERSION", "HDP_3_1_4_12_1");
        // tHBaseConnection
        NodeType nodeTypeHBase = createNodeType("tHBaseConnection", "HBASE_VERSION", "EMR_62_x");
        // tHDFSConnection
        NodeType nodeTypeHdfs = createNodeType("tHDFSConnection", "DB_VERSION", "Cloudera_CDH6_1_1");
        // tImpalaConnection
        NodeType nodeTypeImpala = createNodeType("tImpalaConnection", "IMPALA_VERSION", "SPARK_3_2_x");
        // tHiveInput
        NodeType nodeTypeHiveImput = createNodeType("tHiveInput", "HIVE_VERSION", "MICROSOFT_HD_INSIGHT_4_0");

        processType.getNode().add(nodeTypeHive);
        processType.getNode().add(nodeTypeHBase);
        processType.getNode().add(nodeTypeHdfs);
        processType.getNode().add(nodeTypeImpala);
        processType.getNode().add(nodeTypeHiveImput);

        processItem.setProcess(processType);
        ProxyRepositoryFactory.getInstance().create(processItem, new Path(""));
        return processItem;
    }

    private NodeType createNodeType(String componentName, String versionName, String versionValue) {
        IElement elem = new FakeElement("test");
        ElementParameterType elementParameterType = TalendFileFactory.eINSTANCE.createElementParameterType();
        elementParameterType.setName(versionName);
        elementParameterType.setValue(versionValue);
        NodeType nodeType = TalendFileFactory.eINSTANCE.createNodeType();
        nodeType.getElementParameter().add(elementParameterType);
        nodeType.setComponentName(componentName);
        return nodeType;
    }
}
