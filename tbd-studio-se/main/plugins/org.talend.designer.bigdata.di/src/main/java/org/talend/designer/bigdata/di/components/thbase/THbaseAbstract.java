package org.talend.designer.bigdata.di.components.thbase;

import org.talend.core.model.process.INode;
import org.talend.designer.bigdata.di.components.DesignerDIComponent;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.hadoop.distribution.DistributionFactory;
import org.talend.hadoop.distribution.component.HBaseComponent;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class THbaseAbstract implements DesignerDIComponent.BigDataDIComponent {
    protected final CodeGeneratorArgument codeGeneratorArgument;
    protected final INode node;
    protected final INode connNode;
    protected final THBaseConfiguration tHBaseConfiguration;

    public THbaseAbstract(CodeGeneratorArgument codeGeneratorArgument) {
        this.codeGeneratorArgument = codeGeneratorArgument;
        this.node = (INode) codeGeneratorArgument().getArgument();
        this.connNode = setTargetNode();
        this.tHBaseConfiguration = new THBaseConfiguration();
    }

    public CodeGeneratorArgument codeGeneratorArgument() {
        return this.codeGeneratorArgument;
    }

    public INode node() {
        return this.node;
    }

    public INode connNode() {
        return this.connNode;
    }

    public Map<String, String> getConnectionConfiguration() {
        return tHBaseConfiguration.getConnectionConfiguration(this);
    }

    public String getKeytab() {
        return tHBaseConfiguration.getKeytab(this);
    }

    public boolean isSetTableNsMapping() {
        return false;
    }

    public String getTableNsMapping() {
        return null;
    }

    public boolean isConfigureFromClassPath() {
        return BigDataDIComponent.getParameter(node, "__CONFIGURATIONS_FROM_CLASSPATH__", false);
    }

    public INode getNode() {
        return node;
    }
    public INode setTargetNode() {
        if (useExistingConnection()) {
            return BigDataDIComponent.getLinkedParameter(node(), "__CONNECTION__", node());
        }
        return node();
    }

    public String getHbaseVersion() {
        return BigDataDIComponent.getParameter(connNode(), "__HBASE_VERSION__", "");
    }

    public HBaseComponent getHbaseDistrib() {
        try {
            return (HBaseComponent) DistributionFactory.buildDistribution(getDistribution(), getHbaseVersion());
        } catch (Exception e) {
            return null;
        }
    }

    public String getDistribution() {
        return BigDataDIComponent.getParameter(connNode(), "__DISTRIBUTION__", "");
    }

    public String getZookeeperUrl() {
        return BigDataDIComponent.getParameter(node(), "__ZOOKEEPER_QUORUM__", "");
    }

    public String getZookeeperPort() {
        return BigDataDIComponent.getParameter(node(), "__ZOOKEEPER_CLIENT_PORT__", "");
    }

    public boolean isHBase2x() {
        boolean isHBase2x = BigDataDIComponent.getParameter(connNode(), "__HBASE_API_VERSION__", "").equals("HBASE_2");
        HBaseComponent hbaseDistrib = getHbaseDistrib();

        if (hbaseDistrib != null) {
            boolean isSparkDistrib = "SPARK".equals(getDistribution());
            isHBase2x = isSparkDistrib ? isHBase2x : hbaseDistrib.doSupportHBase2x();
        }
        return isHBase2x;
    }

    public boolean isCustom() {
        if (getDistribution() != null) {
            return getHbaseDistrib() instanceof org.talend.hadoop.distribution.custom.CustomDistribution;
        }
        return false;
    }

    public boolean isHadoop2() {
        return BigDataDIComponent.getParameter(connNode(), "__HADOOP_CUSTOM_VERSION__",false);
    }

    public boolean isZNodeParentSet() {
        return BigDataDIComponent.getParameter(node(), "__SET_ZNODE_PARENT__",false);
    }

    public String getZNodeParent() {
        return BigDataDIComponent.getParameter(node(), "__ZNODE_PARENT__", "");
    }

    public String getExistingConnection() {
        return BigDataDIComponent.getParameter(node(), "__CONNECTION__", "");
    }

    public boolean useKrb() {
        if (!useExistingConnection()) {
            return BigDataDIComponent.getParameter(node(), "__USE_KRB__",false);
        }
        return false;
    }

    public boolean useKeytab() {
        if (!useExistingConnection()) {
            return BigDataDIComponent.getParameter(node(), "__USE_KEYTAB__", false);
        }
        return false;
    }

    public String getUsePrincipal() {
        return BigDataDIComponent.getParameter(node(), "__PRINCIPAL__", "");
    }

    public String getKeytabPath() {
        return BigDataDIComponent.getParameter(node(), "__KEYTAB_PATH__", "");
    }

    public String getHbaseMasterPrincipal() {
        return BigDataDIComponent.getParameter(node(), "__HBASE_MASTER_PRINCIPAL__", "");
    }

    public String getHbaseRegionServerPrincipal() {
        return BigDataDIComponent.getParameter(node(), "__HBASE_REGIONSERVER_PRINCIPAL__", "");
    }

    public boolean isSparkDistrib() {
        return "SPARK".equals(getDistribution());
    }

    public Map<String, String> getHbaseParameters() {
        Map<String, String> result = new HashMap<>();
        List<Map<String, String>> properties = BigDataDIComponent.tableParameter(node(), "__HBASE_PARAMETERS__", Collections.emptyList());
        if (!properties.isEmpty()) {
            for (Map<String, String> mapItem : properties) {
                result.put(THbaseUtils.trimDuplicateQuotes(mapItem.get("PROPERTY")),
                        THbaseUtils.trimDuplicateQuotes(mapItem.get("VALUE")));
            }
        }
        return result;
    }

    public boolean isSpecifyNamespace() {
        return BigDataDIComponent.getParameter(node(), "__SPECIFY_NAMESPACE__", false);
    }

    public String getNamespace() {
        return BigDataDIComponent.getParameter(node(), "__NAMESPACE__", "");
    }

    public String getTableName() {
        return BigDataDIComponent.getParameter(node(), "__TABLE__", "");
    }

    public boolean isUseMapRTicket() {
        return BigDataDIComponent.getParameter(node(), "__USE_MAPRTICKET__", false);
    }

    public String getMapRUserName() {
        return BigDataDIComponent.getParameter(node(), "__USERNAME__", "");
    }

    public String getMapRTicketCluster() {
        return BigDataDIComponent.getParameter(node(), "__MAPRTICKET_CLUSTER__", "");
    }

    public String getMapRTicketDuration() {
        return BigDataDIComponent.getParameter(node(), "__MAPRTICKET_DURATION__", "");
    }

    public boolean isSetMapRHomeDir() {
        return BigDataDIComponent.getParameter(node(), "__SET_MAPR_HOME_DIR__", false);
    }

    public String getMapRHomeDir() {
        return BigDataDIComponent.getParameter(node(), "__MAPR_HOME_DIR__", "");
    }

    public boolean isSetMapRHadoopLogin() {
        return BigDataDIComponent.getParameter(node(), "__SET_HADOOP_LOGIN__", false);
    }

    public String getMapRHadoopLogin() {
        return BigDataDIComponent.getParameter(node(), "__HADOOP_LOGIN__", "");
    }

    public boolean useExistingConnection() {
        return BigDataDIComponent.getParameter(node(), "__USE_EXISTING_CONNECTION__", false);
    }
}