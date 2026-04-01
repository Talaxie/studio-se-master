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
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.RoutineItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.model.utils.emf.component.ComponentFactory;
import org.talend.designer.core.model.utils.emf.component.IMPORTType;
import org.talend.librariesmanager.model.ModulesNeededProvider;
import org.talend.migration.MigrationReportRecorder;

/**
 * Update core libraries version to default for beans, should run before login
 *
 */
public class UpdateRoutinesLibrariesMigrationTask extends AbstractItemMigrationTask {

    private static final String camelPrefix = "camel-";
    
    private static final String camelCorePrefix = "camel-core-";
        
    private static String camelVersion;
    
    private static final String groupIdOld = "org.talend.libraries";

    private static final String groupIdNew = "org.apache.camel";

    private static final List<String> camelModuleListNew = Arrays.asList(
    		"camel-core-",
    		"camel-cxf-",
    		"camel-cxf-transport-",
    		"camel-flatpack-",
    		"camel-ftp-",
    		"camel-http-",
    		"camel-http-common-",
    		"camel-jackson-",
    		"camel-jetty-",
    		"camel-jetty-common-",
    		"camel-jms-",
    		"camel-jsonpath-",
    		"camel-kafka-",
    		"camel-mail-",
    		"camel-saxon-",
    		"camel-servlet-",
    		"camel-spring-",
    		"camel-test-",
    		"camel-test-spring-",
    		"camel-xstream-");
    
    private static final List<String> camelModuleListOld = Arrays.asList(
    		"camel-amqp-",
    		"camel-wmq-alldep-");


    @Override
    public List<ERepositoryObjectType> getTypes() {
        List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
        toReturn.add(ERepositoryObjectType.ROUTINES);
        return toReturn;
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, 9, 27, 0, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        if (item instanceof RoutineItem) {
            if (camelVersion == null) {
                IComponent component = ComponentsFactoryProvider.getInstance().get("cTimer", "CAMEL");
                for (ModuleNeeded mn : component.getModulesNeeded()) {
                    if (mn.getModuleName().startsWith(camelPrefix)) {
                        String moduleName = mn.getModuleName();
                        camelVersion = moduleName.substring(moduleName.lastIndexOf("-") + 1, moduleName.lastIndexOf("."));
                        break;
                    }
                }
            }
            
            RoutineItem routineItem = (RoutineItem) item;
            boolean migrateCamelCore = upgradeModulesNeededForRoutines(routineItem);
            if (migrateCamelCore) {
            	migrateCamelCore(routineItem);
            }
            try {
                ProxyRepositoryFactory.getInstance().save(routineItem);
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }
    }

    private boolean upgradeModulesNeededForRoutines(RoutineItem routineItem) {
        EList imports = routineItem.getImports();
        
        boolean migrateCamelCore = false;

        for (Object imp : imports) {
            if (imp instanceof IMPORTType) {
                IMPORTType importType = (IMPORTType) imp;

                String fullName = importType.getMODULE();
                String version = fullName.substring(fullName.lastIndexOf('-') + 1, fullName.lastIndexOf("."));
                String prefix = fullName.substring(0, fullName.lastIndexOf('-') + 1);
				if (version != null && !version.equals(camelVersion)
						&& (camelModuleListNew.contains(prefix) || camelModuleListOld.contains(prefix))) {
					importType.setMODULE(fullName.replaceAll(version, camelVersion));
					if (camelModuleListNew.contains(prefix)) {
						importType.setMVN(importType.getMVN().replaceAll(groupIdOld, groupIdNew)
								.replaceAll("-" + version + "/6.0.0", "/" + camelVersion));
					} else {
						importType.setMVN(importType.getMVN().replaceAll(version, camelVersion));						
					}

					String message = String.format("Upgrading camel routine dependency %s version from %s to %s",
							fullName, version, camelVersion);

					generateReportRecord(
							new MigrationReportRecorder(this, MigrationReportRecorder.MigrationOperationType.MODIFY,
									routineItem, null, message, null, null));
					
					if (camelCorePrefix.equals(prefix)) {
						migrateCamelCore = true;
					}
				}
            }
        }
        return migrateCamelCore;
    }
    
    private void migrateCamelCore(RoutineItem routineItem) {
    	
        EList imports = routineItem.getImports();
		
		List<ModuleNeeded> importNeedsList = ModulesNeededProvider.getModulesNeededForCamelCore();
		
        for (ModuleNeeded model : importNeedsList) {
            IMPORTType importTypeToAdd = ComponentFactory.eINSTANCE.createIMPORTType();
            importTypeToAdd.setMODULE(model.getModuleName());
            importTypeToAdd.setMESSAGE(model.getInformationMsg());
            importTypeToAdd.setREQUIRED(model.isRequired());
            importTypeToAdd.setMVN(model.getMavenUri());
            if (!imports.contains(importTypeToAdd)) {
            	String messageAdd = String.format("Adding module needed for Routine: %s", importTypeToAdd.getMODULE());
            	
                generateReportRecord(new MigrationReportRecorder(this,
                        MigrationReportRecorder.MigrationOperationType.ADD, routineItem, null, messageAdd,
                        null, null));
                imports.add(importTypeToAdd);
            } else {
                String messageAdd = String.format("Duplicate module found: %s", importTypeToAdd.getMODULE());
            	
                generateReportRecord(new MigrationReportRecorder(this,
                        MigrationReportRecorder.MigrationOperationType.ADD, routineItem, null, messageAdd,
                        null, null));
            }
        }
    }
}