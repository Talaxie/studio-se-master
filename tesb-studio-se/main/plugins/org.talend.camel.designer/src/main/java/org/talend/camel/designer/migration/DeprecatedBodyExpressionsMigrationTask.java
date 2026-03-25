package org.talend.camel.designer.migration;

import java.util.Date;
import java.util.GregorianCalendar;
import org.talend.commons.exception.PersistenceException;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.migration.MigrationReportRecorder;

public class DeprecatedBodyExpressionsMigrationTask extends AbstractRouteItemComponentMigrationTask {

	private final String ID_PATTERN = "\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*";

	private String valueExpression = null;
	private String valueLanguage = null;
	private boolean save = false;

	@Override
	public String getComponentNameRegex() {
		return "cAggregate|cIdempotentConsumer|cLoadBalancer|cMessageFilter|cMessageRouter|cRecipientList|cSetBody|cSetHeader|cSetProperty|cSplitter|cWireTap";
	}

	public Date getOrder() {
		GregorianCalendar gc = new GregorianCalendar(2021, 7, 10, 13, 0, 0);
		return gc.getTime();
	}

	@Override
	protected boolean execute(NodeType node) throws Exception {
		return updateBodyExpressions(node);
	}

	@SuppressWarnings("unchecked")
	private boolean updateBodyExpressions(NodeType currentNode) throws PersistenceException {

		save = false;

		if ("cSetHeader".equalsIgnoreCase(currentNode.getComponentName())) {

			ElementParameterType paramValues = UtilTool.findParameterType(currentNode, "VALUES");
			paramValues.getElementValue().forEach(e -> {

				ElementValueType element = (ElementValueType) e;

				String name = ((ElementValueType) element).getElementRef();
				String value = ((ElementValueType) element).getValue();

				if ("NONE".equalsIgnoreCase(name)) {
					valueLanguage = value;
				}

				if ("EXPRESSION".equalsIgnoreCase(name) && "NONE".equalsIgnoreCase(valueLanguage)) {
					valueExpression = value;

					String correctedBodyExpressions = correctBodyExpressions(valueExpression);
					if (!valueExpression.equalsIgnoreCase(correctedBodyExpressions)) {
						element.setValue(correctedBodyExpressions);
						save = true;
						generateReportRecord(new MigrationReportRecorder(this,
							MigrationReportRecorder.MigrationOperationType.MODIFY, getRouteItem(), currentNode, "Language Expression",
							    valueExpression, correctedBodyExpressions));
					}
				}

			});

		} else {

			ElementParameterType paramLanguages = UtilTool.findParameterType(currentNode, "LANGUAGES");
			ElementParameterType paramExpression = UtilTool.findParameterType(currentNode, "EXPRESSION");

			if (paramLanguages == null || paramExpression == null) {
				return false;
			}

			valueLanguage = paramLanguages.getValue();
			valueExpression = paramExpression.getValue();

			if (valueLanguage == null || valueExpression == null) {
				return false;
			}

			if (valueLanguage.equalsIgnoreCase("NONE")) {

				String correctedBodyExpressions = correctBodyExpressions(valueExpression);
				if (!valueExpression.equalsIgnoreCase(correctedBodyExpressions)) {
					valueExpression = correctedBodyExpressions;
					save = true;
					generateReportRecord(new MigrationReportRecorder(this,
					    MigrationReportRecorder.MigrationOperationType.MODIFY, getRouteItem(), currentNode, "Language Expression",
					        valueExpression, correctedBodyExpressions));
				}

				if (save) {
					for (Object e : currentNode.getElementParameter()) {
						ElementParameterType p = (ElementParameterType) e;
						if ("EXPRESSION".equals(p.getName())) {
							p.setValue(valueExpression);
							break;
						}
					}
				}

			}
		}

		return save;

	}

	private String correctBodyExpressions(String valueExpression) {
		String findRegExp = "body\\((" + ID_PATTERN + "(\\." + ID_PATTERN + ")*)\\)";
		String replaceRegExp = "bodyAs($1)";
		return valueExpression.replaceAll(findRegExp, replaceRegExp);
	}

}
