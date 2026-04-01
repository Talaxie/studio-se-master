// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2021 Talend – www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.camel.designer.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.migration.MigrationReportRecorder;

public class UpdateAWSConnectionRemovedRegionMigrationTask extends AbstractRouteItemComponentMigrationTask {

    @Override
    public String getComponentNameRegex() {
        return "cAWSConnection";
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, 12, 31, 12, 0, 0);
        return gc.getTime();
    }

	@Override
	protected boolean execute(NodeType nodeType) throws Exception {
		return removeAWSConnectionDefaultRegion(nodeType);
	}

    private boolean removeAWSConnectionDefaultRegion(NodeType nodeType) {
        boolean needSave = false;

        EList<ElementParameterType> list = nodeType.getElementParameter();

        for (ElementParameterType elParameter : list) {
			if ("REGION".equals(elParameter.getName()) && ("\"cn-north-1\"".equals(elParameter.getValue())
					|| "\"us-gov-west-1\"".equals(elParameter.getValue()))) {
				
				String value = elParameter.getValue();
				
                elParameter.setValue("\"us-east-1\"");
                needSave = true;

                String message = "Migrating " + value + " region of cAWSConnection to US East (N. Virginia)";

                generateReportRecord(new MigrationReportRecorder(this,
                        MigrationReportRecorder.MigrationOperationType.MODIFY, getRouteItem(), nodeType, message, "", "us-east-1"));
            }
        }

        return needSave;
    }
}
