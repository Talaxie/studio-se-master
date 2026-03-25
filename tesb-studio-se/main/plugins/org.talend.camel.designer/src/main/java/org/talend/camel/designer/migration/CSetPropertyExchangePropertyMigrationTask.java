package org.talend.camel.designer.migration;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.PersistenceException;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;

public class CSetPropertyExchangePropertyMigrationTask extends AbstractRouteItemComponentMigrationTask {

    @Override
    public String getComponentNameRegex() {
        return "cSetProperty";
    }

    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, 6, 7, 13, 0, 0);
        return gc.getTime();
    }

	@Override
	protected boolean execute(NodeType node) throws Exception {
		return disableHandleFaultExpression(node);
	}

	private boolean disableHandleFaultExpression(NodeType currentNode) throws PersistenceException {
		boolean needSave = false;

		@SuppressWarnings("unchecked")
		List<ElementParameterType> parameters = currentNode.getElementParameter();
		for (Object tmp : parameters) {
			ElementParameterType param1 = (ElementParameterType) tmp;
			String paramName = param1.getName();
			if("VALUES".equals(paramName)) {
				@SuppressWarnings("unchecked")
				EList<ElementValueType> elementValueList = param1.getElementValue();
				for (Object object : elementValueList) {
					ElementValueType valueType = (ElementValueType)object;
					if("LANGUAGE".equals(valueType.getElementRef())
							&& "property".equals(valueType.getValue())){
						valueType.setValue("exchangeProperty");
						needSave = true;
					}
				}
			}
		}

		return needSave;
	}
}