// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.model.process.migration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.hadoop.BigDataBasicUtil;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.utils.ConvertJobsUtil;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * created by hzhao on May 10, 2023 Detailled comment
 *
 */
public class AddDistributionForDIItemMigrationTask extends AbstractJobMigrationTask {

    @Override
    public List<ERepositoryObjectType> getTypes() {
        List<ERepositoryObjectType> toReturn = new ArrayList<>();
        toReturn.add(ERepositoryObjectType.PROCESS);
        toReturn.add(ERepositoryObjectType.JOBLET);
        toReturn.add(ERepositoryObjectType.TEST_CONTAINER);
        return toReturn;
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 5, 11, 10, 0, 0);
        return gc.getTime();
    }

    /*
     * (non-Javadoc)
     *
     * @seeorg.talend.core.model.migration.AbstractJobMigrationTask#executeOnProcess(org.talend.core.model.properties.
     * ProcessItem)
     */
    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        try {
            // only deal with DI testcase
            ERepositoryObjectType itemType = ERepositoryObjectType.getItemType(item);
            if (itemType == ERepositoryObjectType.TEST_CONTAINER
                    && !ConvertJobsUtil.JobType.STANDARD
                            .getDisplayName()
                            .equalsIgnoreCase(getTestContainerJobType(item, processType))) {
                return ExecutionResult.NOTHING_TO_DO;
            }
            
            // only filter when :
            // 1.components contains HBase/HDFS/Hive/Impala
            // 2.node parampter contains version but there's no distribution
            IComponentFilter filter = new IComponentFilter() {

                final transient List<String> names = new ArrayList<String>() {

                    private static final long serialVersionUID = 1L;
                    {
                        add("HBase"); //$NON-NLS-1$
                        add("HDFS"); //$NON-NLS-1$
                        add("Hive"); //$NON-NLS-1$
                        add("Impala"); //$NON-NLS-1$
                    }
                };

                @Override
                public boolean accept(NodeType node) {
                    boolean isContains = false;
                    String componentName = node.getComponentName();
                    for (String name : names) {
                        if (componentName.contains(name)) {
                            isContains = true;
                            break;
                        }
                    }
                    if (!isContains) {
                        return false;
                    }
                    String versionName = null;
                    versionName = getVersionNameByComponentName(componentName);

                    if (versionName == null)
                        return false;

                    EList<ElementParameterType> elementParameters = node.getElementParameter();
                    String distribution = null;
                    String dbVersion = null;
                    // Iterate over the item elementParameters in order to find the "DISTRIBUTION" and "SPARK_VERSION"
                    // parameters values.
                    for (int i = 0; i < elementParameters.size(); i++) {
                        ElementParameterType param = elementParameters.get(i);
                        if (versionName.equals(param.getName())) {
                            dbVersion = param.getValue();
                            continue;
                        }
                        if ("DISTRIBUTION".equals(param.getName())) {//$NON-NLS-1$
                            distribution = param.getValue();
                        }
                    }
                    return dbVersion != null && distribution == null;
                }

            };
            IComponentConversion checkDistribution = new CheckDistribution();
            boolean modified = ModifyComponentsAction
                    .searchAndModify(item, processType, filter, Arrays.<IComponentConversion> asList(checkDistribution));
            if (modified) {
                return ExecutionResult.SUCCESS_NO_ALERT;
            } else {
                return ExecutionResult.NOTHING_TO_DO;
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }

    }

    private class CheckDistribution implements IComponentConversion {
        
        @Override
        public void transform(NodeType node) {
            String dbVersionName = getVersionNameByComponentName(node.getComponentName());
            if (dbVersionName != null) {
                BigDataBasicUtil.setDistribution(node, dbVersionName);
            }

        }
        
    }

    private String getVersionNameByComponentName(String componentName) {
        String versionName = null;
        if (componentName.contains("HBase")) {//$NON-NLS-1$
            versionName = "HBASE_VERSION";//$NON-NLS-1$
        } else if (componentName.contains("HDFS")) {//$NON-NLS-1$
            versionName = "DB_VERSION";//$NON-NLS-1$
        } else if (componentName.contains("Hive")) {//$NON-NLS-1$
            versionName = "HIVE_VERSION";//$NON-NLS-1$
        } else if (componentName.contains("Impala")) {//$NON-NLS-1$
            versionName = "IMPALA_VERSION";//$NON-NLS-1$
        }
        return versionName;
    }
}
