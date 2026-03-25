package org.talend.camel.designer.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.PersistenceException;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.migration.MigrationReportRecorder;

public class UpdateCHTTPUriMigrationTask extends AbstractRouteItemComponentMigrationTask {

    @Override
    public String getComponentNameRegex() {
        return "cHttp";
    }

    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, 7, 8, 13, 0, 0);
        return gc.getTime();
    }

	@Override
	protected boolean execute(NodeType node) throws Exception {
		return replaceUri(node);
	}

	private boolean replaceUri(NodeType currentNode) throws PersistenceException {
        boolean needSave = false;

        ElementParameterType param = UtilTool.findParameterType(currentNode, "URI");
        String previousValue = param.getValue();
        String value = param.getValue();

        for (Object e : currentNode.getElementParameter()) {
            ElementParameterType p = (ElementParameterType) e;
            if ("URI".equals(p.getName()) && value.startsWith("\"jetty://")) {
                value = value.replaceFirst("\"jetty://", "\"");
                if (!value.startsWith("\"http://")){
                    value = value.substring(value.indexOf("\"http://"));
                }
                p.setValue(value);
                needSave = true;

                generateReportRecord(new MigrationReportRecorder(this,
                    MigrationReportRecorder.MigrationOperationType.MODIFY, getRouteItem(), currentNode, "URI of cHTTP",
                        previousValue, value));
                break;
            }
        }

        return needSave;
    }

}
