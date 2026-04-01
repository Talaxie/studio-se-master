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
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.talend.camel.core.model.camelProperties.BeanItem;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.maven.MavenArtifact;
import org.talend.core.runtime.maven.MavenUrlHelper;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.model.utils.emf.component.ComponentFactory;
import org.talend.designer.core.model.utils.emf.component.IMPORTType;
import org.talend.librariesmanager.model.ModulesNeededProvider;
import org.talend.migration.MigrationReportRecorder;

/**
 * Update core libraries version to default for beans, should run before login
 *
 */
public class UpdateBeansDefaultLibrariesMigrationTask extends AbstractItemMigrationTask {

    private static final String CAMEL_CXF_PREFIX = "camel-cxf-";

    private static final String camelPrefix = "camel-core-";

    private static String camelVersionSubString;

    private static String camelVersion;

    @Override
    public List<ERepositoryObjectType> getTypes() {
        List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
        toReturn.add(ERepositoryObjectType.BEANS);
        return toReturn;
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2019, 5, 20, 0, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        if (item instanceof BeanItem) {
            if (camelVersion == null) {
                IComponent component = ComponentsFactoryProvider.getInstance().get("cTimer", "CAMEL");
                for (ModuleNeeded mn : component.getModulesNeeded()) {
                    MavenArtifact ma = MavenUrlHelper.parseMvnUrl(mn.getMavenUri());
                    if (ma != null) {
                        if (StringUtils.equals(camelPrefix, ma.getArtifactId() + "-")) {
                            camelVersionSubString = mn.getModuleName().substring(camelPrefix.length());
                            camelVersion = ma.getVersion();
                            break;
                        }
                    } else {
                        if (mn.getModuleName().startsWith(camelPrefix)) {
                            camelVersionSubString = mn.getModuleName().substring(camelPrefix.length());
                            camelVersion = camelVersionSubString.substring(0, camelVersionSubString.lastIndexOf(".jar"));
                            break;
                        }
                    }
                }
            }
            BeanItem beanItem = (BeanItem) item;
            addModulesNeededForBeans(beanItem);
            try {
                ProxyRepositoryFactory.getInstance().save(beanItem);
                generateReportRecord(new MigrationReportRecorder(this, item, "Set of default Bean dependencies is updated"));
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }
    }

    private void addModulesNeededForBeans(BeanItem beanItem) {
        List<ModuleNeeded> modulesNeededForBeans = ModulesNeededProvider.getModulesNeededForBeans();
        EList imports = beanItem.getImports();

        List<IMPORTType> deprecatedModules = new ArrayList<IMPORTType>();

        boolean foundCamelCXF = false;
        for (Object imp : imports) {

            if (imp instanceof IMPORTType) {
                IMPORTType importType = (IMPORTType) imp;

                String impName = importType.getMODULE().substring(importType.getMODULE().lastIndexOf('-') + 1);
                if (StringUtils.startsWith(importType.getMODULE(), CAMEL_CXF_PREFIX) && "TESB.jar".equals(impName)) {
                	
                	String mvnNewVersion = "mvn:org.talend.libraries/" + CAMEL_CXF_PREFIX + camelVersion + "/6.0.0-SNAPSHOT/jar";
                	
                    String message = String.format("Modifying camel cxf library version from %s to %s", importType.getMVN(), mvnNewVersion);
                    
                    importType.setMODULE(CAMEL_CXF_PREFIX + camelVersionSubString);
                    importType.setMVN(mvnNewVersion);
                    
                    generateReportRecord(new MigrationReportRecorder(this,
                    		MigrationReportRecorder.MigrationOperationType.MODIFY, beanItem, null, message, null, null));
                }
                
                if (StringUtils.startsWith(importType.getMODULE(), "javax.annotation") ) {
                	deprecatedModules.add(importType);
                	
                    generateReportRecord(new MigrationReportRecorder(this,
                            MigrationReportRecorder.MigrationOperationType.MODIFY, beanItem, null, "Adding javax.annotation to deprecated modules",
                            null, null));
                }

                if (StringUtils.startsWith(importType.getMODULE(), "org.apache.commons.logging_1.2.0") ) {
                    deprecatedModules.add(importType);

                    generateReportRecord(new MigrationReportRecorder(this,
                            MigrationReportRecorder.MigrationOperationType.MODIFY, beanItem, null, "Adding org.apache.commons.logging_1.2.0 to deprecated modules",
                            null, null));
                }

                if (StringUtils.startsWith(importType.getMODULE(), "camel-cxf") ) {
                    foundCamelCXF = true;
                    deprecatedModules.add(importType);

                    generateReportRecord(new MigrationReportRecorder(this,
                            MigrationReportRecorder.MigrationOperationType.MODIFY, beanItem, null, "Adding camel-cxf to deprecated modules",
                            null, null));
                }

            }

            for (ModuleNeeded defaultNeed : modulesNeededForBeans) {
                String moduleName = defaultNeed.getId();

                if (imp instanceof IMPORTType) {
                    IMPORTType importType = (IMPORTType) imp;

                    if (importType.getMODULE().indexOf('-') > 0) {
                        String impName = importType.getMODULE().substring(0, importType.getMODULE().lastIndexOf('-'));
                        if (moduleName.equals(impName) && !importType.getMODULE().equals(defaultNeed.getModuleName())) {

                            StringBuilder builder = new StringBuilder();
                            builder.append("Rewriting import type: ");
                            builder.append(String.format("Setting module name from %s to %s", importType.getMODULE(), defaultNeed.getModuleName()));
                            builder.append(String.format("Setting message name from %s to %s", importType.getMESSAGE(), defaultNeed.getInformationMsg()));
                            builder.append(String.format("Setting mvn url from %s to %s", importType.getMODULE(), defaultNeed.getMavenUri()));

                            importType.setMODULE(defaultNeed.getModuleName());
                            importType.setMESSAGE(defaultNeed.getInformationMsg());
                            importType.setMVN(defaultNeed.getMavenUri());

                            generateReportRecord(new MigrationReportRecorder(this,
                                    MigrationReportRecorder.MigrationOperationType.MODIFY, beanItem, null, builder.toString(),
                                    null, null));
                        }
                    }
                }
            }
        }

        String VERSION_PATTERN = "-([0-9]+)(.([0-9]+)?)(.([0-9]+)?)";
        
        List<IMPORTType> missingModels = new ArrayList<IMPORTType>();
        for (ModuleNeeded model : modulesNeededForBeans) {
            boolean found = false;
            for (Object imp : imports) {
                if (imp instanceof IMPORTType) {
                    IMPORTType importType = (IMPORTType) imp;
                    if (StringUtils.equals(importType.getMODULE().replaceAll(VERSION_PATTERN, ""),
                            model.getModuleName().replaceAll(VERSION_PATTERN, ""))) {
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                IMPORTType importType = ComponentFactory.eINSTANCE.createIMPORTType();
                importType.setMODULE(model.getModuleName());
                importType.setMESSAGE(model.getInformationMsg());
                importType.setREQUIRED(model.isRequired());
                importType.setMVN(model.getMavenUri());
                missingModels.add(importType);
                
                StringBuilder recorderMessage = new StringBuilder();
                recorderMessage.append("Adding missing module: ");
                recorderMessage.append(model.getModuleName());
                
                generateReportRecord(new MigrationReportRecorder(this,
                        MigrationReportRecorder.MigrationOperationType.ADD, beanItem, null, recorderMessage.toString(),
                        null, null));
            }
        }
        imports.addAll(missingModels);
        if (foundCamelCXF) {
            addCamelCXFdependencies(imports);
        }
        imports.removeAll(deprecatedModules);
    }

    private void addCamelCXFdependencies(EList imports) {
        IMPORTType addimportType = ComponentFactory.eINSTANCE.createIMPORTType();
        addimportType.setMODULE("camel-cxf-common-" + camelVersion + ".jar");
        addimportType.setREQUIRED(false);
        addimportType.setMVN("mvn:org.apache.camel/camel-cxf-common/" + camelVersion + "/jar");
        addimportType.setUrlPath("platform:/plugin/org.talend.designer.camel.components.localprovider/lib/camel-cxf-common-" + camelVersion + ".jar");
        imports.add(addimportType);

        addimportType = ComponentFactory.eINSTANCE.createIMPORTType();
        addimportType.setMODULE("camel-cxf-soap-" + camelVersion + ".jar");
        addimportType.setREQUIRED(false);
        addimportType.setMVN("mvn:org.apache.camel/camel-cxf-soap/" + camelVersion + "/jar");
        addimportType.setUrlPath("platform:/plugin/org.talend.designer.camel.components.localprovider/lib/camel-cxf-soap-" + camelVersion + ".jar");
        imports.add(addimportType);

        addimportType = ComponentFactory.eINSTANCE.createIMPORTType();
        addimportType.setMODULE("camel-cxf-rest-" + camelVersion + ".jar");
        addimportType.setREQUIRED(false);
        addimportType.setMVN("mvn:org.apache.camel/camel-cxf-rest/" + camelVersion + "/jar");
        addimportType.setUrlPath("platform:/plugin/org.talend.designer.camel.components.localprovider/lib/camel-cxf-rest-" + camelVersion + ".jar");
        imports.add(addimportType);

        addimportType = ComponentFactory.eINSTANCE.createIMPORTType();
        addimportType.setMODULE("camel-cxf-transport-" + camelVersion + ".jar");
        addimportType.setREQUIRED(false);
        addimportType.setMVN("mvn:org.apache.camel/camel-cxf-transport/" + camelVersion + "/jar");
        addimportType.setUrlPath("platform:/plugin/org.talend.designer.camel.components.localprovider/lib/camel-cxf-transport-" + camelVersion + ".jar");
        imports.add(addimportType);
    }
}
