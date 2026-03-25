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

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.components.ElementParameter;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.migration.MigrationReportRecorder;

/**
 * DOC vdrokov class global comment. Remove cAWSConnection default region for APPINT-33845
 *
 */
public class RemoveAWSConnectionDefaultRegionMigrationTask extends AbstractRouteItemComponentMigrationTask {

    @Override
    public String getComponentNameRegex() {
        return "cAWSConnection";
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, 10, 26, 12, 0, 0);
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
            if ("REGION".equals(elParameter.getName()) && "DEFAULT".equals(elParameter.getValue())) {
                elParameter.setValue("\"us-east-1\"");
                needSave = true;

                String message = "Migrating DEFAULT region of cAWSConnection to US East (N. Virginia)";

                generateReportRecord(new MigrationReportRecorder(this,
                        MigrationReportRecorder.MigrationOperationType.MODIFY, getRouteItem(), nodeType, message, "", "us-east-1"));
            }
        }

        return needSave;
    }
}
