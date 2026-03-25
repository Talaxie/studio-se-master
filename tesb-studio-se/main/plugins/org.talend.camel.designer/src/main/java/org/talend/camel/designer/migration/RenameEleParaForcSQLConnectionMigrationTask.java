// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.camel.designer.migration;

import java.util.Date;

import java.util.GregorianCalendar;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;

public class RenameEleParaForcSQLConnectionMigrationTask extends AbstractRouteItemComponentMigrationTask {

	public Date getOrder() {
		GregorianCalendar gc = new GregorianCalendar(2023, 4, 13, 16, 0, 0);
		return gc.getTime();
	}

	@Override
	public String getComponentNameRegex() {
		return "cSQLConnection";
	}

	@Override
	protected boolean execute(NodeType node) throws Exception {
		return renameParameters(node);
	}

	private boolean renameParameters(NodeType currentNode) {

		boolean modified = false;

		if (currentNode.getComponentName().startsWith("cSQLConnection")) { //$NON-NLS-1$
			for (Object o : currentNode.getElementParameter()) {
				ElementParameterType para = (ElementParameterType) o;
				if ("DRIVER_CLASS_NAME".equals(para.getName())) { //$NON-NLS-1$
					para.setName("DRIVER_CLASS"); //$NON-NLS-1$
					modified = true;
				}else if ("JDBC_URL".equals(para.getName())) { //$NON-NLS-1$
					para.setName("URL"); //$NON-NLS-1$
					modified = true;
				}else if ("SQL_USERNAME".equals(para.getName())) { //$NON-NLS-1$
					para.setName("USER"); //$NON-NLS-1$
					modified = true;
				}else if ("SQL_PASSWORD".equals(para.getName())) { //$NON-NLS-1$
					para.setName("PASS"); //$NON-NLS-1$
					modified = true;
				}
			}
		}

		if (modified) {
			return true;
		}

		return false;
	}
}
