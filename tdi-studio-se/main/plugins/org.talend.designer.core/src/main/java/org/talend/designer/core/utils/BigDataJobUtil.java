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
package org.talend.designer.core.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.talend.core.hadoop.HadoopConstants;
import org.talend.core.hadoop.version.EHadoopDistributions;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.hadoop.distribution.constants.apache.ESparkMode;

/**
 * created by nrousseau on Mar 24, 2018 Detailled comment
 *
 */
public class BigDataJobUtil {

    private IProcess process;

    public BigDataJobUtil(IProcess process) {
        this.process = process;
    }

    /**
     * DOC nrousseau Comment method "needsShade".
     *
     * @param item
     */
    public boolean needsShade() {
        if (isMRWithHDInsight()) {
            return true;
        }
        if (isBDJobWithFramework(ERepositoryObjectType.PROCESS_STORM, HadoopConstants.FRAMEWORK_STORM)) {
            return true;
        }
        return isMRWithHDInsight();
    }

    public boolean isSparkWithSynapse() {
        boolean isSparkWithSynapse = false;
        if (isBDJobWithFramework(ERepositoryObjectType.PROCESS_MR, HadoopConstants.FRAMEWORK_SPARK)
                || isBDJobWithFramework(ERepositoryObjectType.PROCESS_STORM, HadoopConstants.FRAMEWORK_SPARKSTREAMING)) {
            List<? extends IElementParameter> parameters = process.getElementParametersWithChildrens();
            for (IElementParameter pt : parameters) {
            	boolean isSynapseSparkMode = HadoopConstants.SPARK_MODE_SYNAPSE.equals(pt.getName()) && ESparkMode.SYNAPSE.getValue().equals(pt.getValue());
		boolean isSynapseDistribution = pt.getName().equals("DISTRIBUTION") && EHadoopDistributions.AZURE_SYNAPSE.getName().equals(pt.getValue());
                if (isSynapseSparkMode || isSynapseDistribution) {
                   isSparkWithSynapse = true;
                }
            }
        }
        return isSparkWithSynapse;
    }

    public boolean isMRWithHDInsight() {
        Boolean isMRWithHDInsight = false;
        if (process != null) {
            isMRWithHDInsight = false;
            if (isBDJobWithFramework(ERepositoryObjectType.PROCESS_MR, HadoopConstants.FRAMEWORK_MAPREDUCE)) {
                List<? extends IElementParameter> parameters = process.getElementParametersWithChildrens();
                for (IElementParameter pt : parameters) {
             boolean isHDIDistribution = pt.getName().equals("DISTRIBUTION") && EHadoopDistributions.MICROSOFT_HD_INSIGHT.getName().equals(pt.getValue());
                if (isHDIDistribution) {
                    isMRWithHDInsight = true;
                   }
                }
            }
        }
        return isMRWithHDInsight;
    }

    /**
     * Test if it is a spark job with yarn cluster mode
     */
    private boolean isSparkWithYarnClusterMode() {
        Boolean isSparkInYarnClusterMode = false;
        // Test if we are in Spark or Spark streaming
        if (isBDJobWithFramework(ERepositoryObjectType.PROCESS_MR, HadoopConstants.FRAMEWORK_SPARK)
                || isBDJobWithFramework(ERepositoryObjectType.PROCESS_STORM, HadoopConstants.FRAMEWORK_SPARKSTREAMING)) {

            List<? extends IElementParameter> parameters = process.getElementParametersWithChildrens();
            for (IElementParameter pt : parameters) {
                if (HadoopConstants.SPARK_MODE.equals(pt.getName())
                        && HadoopConstants.SPARK_MODE_YARN_CLUSTER.equals(pt.getValue())) {
                    isSparkInYarnClusterMode = true;
                    break;
                }
            }
        }
        return isSparkInYarnClusterMode;
    }

    private boolean isBDJobWithFramework(ERepositoryObjectType objectType, String frameworkName) {
        // Storm/SparkStreaming(PROCESS_STORM), MR/Spark(PROCESS_MR)
        if (process != null && process instanceof IProcess2 && ((IProcess2) process).getAdditionalProperties() != null
                && frameworkName.equals(((IProcess2) process).getAdditionalProperties().get(HadoopConstants.FRAMEWORK))) {
            return true;
        }
        return false;
    }

    /** Find the distribution where the generated jar rquired to have the context files inside **/
    public boolean needsToHaveContextInsideJar() {
        List<? extends IElementParameter> parameters = process.getElementParametersWithChildrens();

        if (process != null && parameters != null) {

            for (IElementParameter pt : parameters) {
                if (pt.getName().equals("DISTRIBUTION")) { //$NON-NLS-1$
                    String value = String.valueOf(pt.getValue());
                    if ("MICROSOFT_HD_INSIGHT".equals(value) //$NON-NLS-1$
                            || "GOOGLE_CLOUD_DATAPROC".equals(value) //$NON-NLS-1$
                            || "DATABRICKS".equals(value)) { //$NON-NLS-1$
                        return true;
                    }
                }
            }
            if (isSparkWithYarnClusterMode()) {
                return true;
            }
        }
        return false;
    }

    public void setExcludedModules(Collection<ModuleNeeded> modulesNeeded) {
        if (isMRWithHDInsight()) {
            // we need to exclude every non-MR Required jars.
            for (ModuleNeeded currentModule : modulesNeeded) {
                if (currentModule.isMrRequired()) {
                    currentModule.setExcluded(true);
                }
            }
        }
    }

    public void removeExcludedModules(Collection<ModuleNeeded> modulesNeeded) {
        Iterator<ModuleNeeded> itModules = modulesNeeded.iterator();
        while (itModules.hasNext()) {
            ModuleNeeded module = itModules.next();
            if (module.isExcluded()) {
                itModules.remove();
            }
        }
    }

    /**
     * DOC nrousseau Comment method "getShadedModulesExclude".
     *
     * @param modulesNeeded
     * @return
     */
    public Set<ModuleNeeded> getShadedModulesExclude(Set<ModuleNeeded> modulesNeeded) {
        Set<ModuleNeeded> excludedModules = new HashSet<>();
        if (isMRWithHDInsight()) {
            // we need to exclude every non-MR Required jars.
            for (ModuleNeeded currentModule : modulesNeeded) {
                if (!currentModule.isMrRequired()) {
                    excludedModules.add(currentModule);
                } else {
                    currentModule.setExcluded(true);
                }
            }
        }

        return excludedModules;
    }

}
