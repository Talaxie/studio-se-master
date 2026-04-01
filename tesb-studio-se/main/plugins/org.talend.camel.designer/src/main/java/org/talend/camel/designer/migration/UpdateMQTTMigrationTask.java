package org.talend.camel.designer.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.PersistenceException;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.migration.MigrationReportRecorder;

public class UpdateMQTTMigrationTask extends AbstractRouteItemComponentMigrationTask {

    @Override
    public String getComponentNameRegex() {
        return "cMQConnectionFactory";
    }

    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, 6, 7, 13, 0, 0);
        return gc.getTime();
    }

	@Override
	protected boolean execute(NodeType node) throws Exception {
		return replaceValuesOfParas(node);
	}

	private boolean replaceValuesOfParas(NodeType currentNode) throws PersistenceException {
        boolean needSave = false;

        ElementParameterType param = UtilTool.findParameterType(currentNode, "MQTT_RECONNECT_DELAY");
        String value = param.getValue();

        for (Object e : currentNode.getElementParameter()) {
            ElementParameterType p = (ElementParameterType) e;
            if ("MQTT_RECONNECT_DELAY".equals(p.getName())) {
                p.setValue(value);
                needSave = true;

                generateReportRecord(new MigrationReportRecorder(this,
                    MigrationReportRecorder.MigrationOperationType.MODIFY, getRouteItem(), currentNode, "MQTT_RECONNECT_DELAY of cMQConnectionFactory",
                        "", value));
                break;
            }
        }

        ElementParameterType paramQOS = UtilTool.findParameterType(currentNode, "MQTT_QOS");
        String valueQOS = paramQOS.getValue();

        for (Object e : currentNode.getElementParameter()) {
            ElementParameterType p = (ElementParameterType) e;
            if ("MQTT_QOS".equals(p.getName())) {
                if ("AtLeastOnce".equalsIgnoreCase(valueQOS)) {
                    p.setValue("0");
                    needSave = true;
                }
                if ("AtMostOnce".equalsIgnoreCase(valueQOS)) {
                    p.setValue("1");
                    needSave = true;
                }
                if ("ExactlyOnce".equalsIgnoreCase(valueQOS)) {
                    p.setValue("2");
                    needSave = true;
                }
            }
        }

        return needSave;
	}

}
