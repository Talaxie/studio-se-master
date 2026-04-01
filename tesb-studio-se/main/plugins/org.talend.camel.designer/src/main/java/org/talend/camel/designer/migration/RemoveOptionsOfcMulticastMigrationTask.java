// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2023 Talend – www.talend.com
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
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.migration.MigrationReportRecorder;

/**
 * DOC xldai class global comment. Remove stopOnAggregateException option from cMulticast for APPINT-35473
 *
 */
public class RemoveOptionsOfcMulticastMigrationTask extends AbstractRouteItemComponentMigrationTask {

    @Override
    public String getComponentNameRegex() {
        return "cMulticast";
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 3, 20, 12, 0, 0);
        return gc.getTime();
    }

	@Override
	protected boolean execute(NodeType nodeType) throws Exception {
		return removeOptionsOfcMulticast(nodeType);
	}

    private boolean removeOptionsOfcMulticast(NodeType nodeType) {
        boolean needSave = false;

        EList<ElementParameterType> list = nodeType.getElementParameter();

        for (ElementParameterType elParameter : list) {
            if ("STOP_ON_AGGREGATE_EXCEPTION".equals(elParameter.getName())) {
                String previousValue = elParameter.getValue();
                list.remove(elParameter);
                needSave = true;

                String message = "Removing the stopOnAggregateException option from cMulticast";

                generateReportRecord(new MigrationReportRecorder(this,
                        MigrationReportRecorder.MigrationOperationType.MODIFY, getRouteItem(), nodeType, message, previousValue, ""));
                break;
            }
        }

        return needSave;
    }
}
