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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.talend.camel.core.model.camelProperties.BeanItem;
import org.talend.camel.designer.ui.wizards.actions.JavaCamelJobScriptsExportWSAction;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.RoutineItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;

/**
 * Update core libraries version to default for beans, should run before login
 *
 */
public class UpdateBeansPackageReplaceMigrationTask extends AbstractItemMigrationTask {

    private static final Logger log = Logger.getLogger(UpdateBeansPackageReplaceMigrationTask.class);
    private static final Properties PACKAGES_TO_REPLACE = loadPackagesToReplace();

    private static Properties loadPackagesToReplace() {
        Properties result = new Properties();
        InputStream is = JavaCamelJobScriptsExportWSAction.class
                .getClassLoader()
                .getResourceAsStream("resources/package-replace.properties");
        if (is == null) {
            log.error("Error reading \"package-replace.properties\" file");
            return result;
        }
        try {
            try {
                result.load(is);
            } finally {
                is.close();
            }
        } catch (IOException e) {
            log.error("Error loading \"package-replace.properties\" file", e);
            ExceptionHandler.process(e);
        }
        return result;
    }


    @Override
    public List<ERepositoryObjectType> getTypes() {
        List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
        toReturn.add(ERepositoryObjectType.BEANS);
        toReturn.add(ERepositoryObjectType.ROUTINES);
        return toReturn;
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2019, 4, 20, 0, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        ExecutionResult execResult = ExecutionResult.NOTHING_TO_DO;
        String pattern = "(\\s*|\t|\r|\n)";
        if (item instanceof RoutineItem) {

            boolean isItemUpdated = false;
            RoutineItem resourceItem = null;
            if(item instanceof BeanItem) {
                resourceItem = (BeanItem) item;
            }else {
                resourceItem = (RoutineItem) item;
            }

            String content = new String(resourceItem.getContent().getInnerContent());
            Set<Entry<Object, Object>> entrySet = PACKAGES_TO_REPLACE.entrySet();

            for(Entry<Object, Object> entry : entrySet) {
                String prePeplaceValue = (String) entry.getKey();
                String replaceValue = (String) entry.getValue();

                StringBuffer computePattenBuffer = new StringBuffer();
                String[] computePattenArray = prePeplaceValue.split("\\.");

                for (int i = 0; i < computePattenArray.length; i++) {
                    computePattenBuffer.append(pattern).append(computePattenArray[i]).append(pattern);
                    if (i != computePattenArray.length - 1) {
                        computePattenBuffer.append(".");
                    }
                }

                Pattern p = Pattern.compile(computePattenBuffer.toString());

                Matcher m = p.matcher(content);

                if (m.find()) {
                    content = content.replaceAll(computePattenBuffer.toString(), " "+replaceValue+" ");
                    resourceItem.getContent().setInnerContent(content.getBytes());
                    isItemUpdated = true;
                }
            }
            resourceItem.getProperty().getInformations().clear();
            if(isItemUpdated) {
                try {
                    ProxyRepositoryFactory.getInstance().save(resourceItem);
                    execResult = ExecutionResult.SUCCESS_NO_ALERT;
                } catch (PersistenceException e) {
                    log.error("Error replacing import statements", e);
                    ExceptionHandler.process(e);
                    execResult = ExecutionResult.FAILURE;
                } catch (Exception e) {
                    log.error("Building Code Project Failed", e);
                    ExceptionHandler.process(e);
                    execResult = ExecutionResult.FAILURE;
                }
            }
        }
        return execResult;
    }
}
