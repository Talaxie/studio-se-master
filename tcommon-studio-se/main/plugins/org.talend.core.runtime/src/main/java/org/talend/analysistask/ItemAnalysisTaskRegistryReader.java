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
package org.talend.analysistask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.SafeRunner;
import org.osgi.framework.FrameworkUtil;
import org.talend.core.model.relationship.RelationshipRegistryReader;
import org.talend.core.utils.RegistryReader;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class ItemAnalysisTaskRegistryReader extends RegistryReader {

    private Map<String, IItemAnalysisTask> idItemAnalysisTaskMap = new HashMap<String, IItemAnalysisTask>();

    private static final ItemAnalysisTaskRegistryReader INSTANCE = new ItemAnalysisTaskRegistryReader();

    private Map<String, String> allItemURIsMap = new HashMap<String, String>();

    private Map<String, List<String>> duplicatedItemURIsMap = new HashMap<String, List<String>>();

    public static ItemAnalysisTaskRegistryReader getInstance() {
        return INSTANCE;
    }

    private ItemAnalysisTaskRegistryReader() {
        super(FrameworkUtil.getBundle(RelationshipRegistryReader.class).getSymbolicName(), "analysisTask");
        init();
    }

    private synchronized void init() {
        idItemAnalysisTaskMap.clear();
        readRegistry();
    }

    public List<IItemAnalysisTask> getItemAnalysisTasks() {
        if (idItemAnalysisTaskMap.isEmpty()) {
            init();
        }
        List<IItemAnalysisTask> taskList = new ArrayList<IItemAnalysisTask>();
        taskList.addAll(idItemAnalysisTaskMap.values());
        return taskList;
    }

    @Override
    protected boolean readElement(IConfigurationElement element) {
        if ("analysisTask".equals(element.getName())) {
            SafeRunner.run(new RegistryReader.RegistrySafeRunnable() {

                @Override
                public void run() throws Exception {
                    IItemAnalysisTask analysisTask = (IItemAnalysisTask) element.createExecutableExtension("class");
                    String id = element.getAttribute("id");
                    analysisTask.setId(id);
                    analysisTask.setName(element.getAttribute("name"));
                    analysisTask.setDescription(element.getAttribute("description"));
                    analysisTask.setDetailLink(element.getAttribute("detailLink"));
                    idItemAnalysisTaskMap.put(id, analysisTask);
                }

            });
            return true;
        }
        return false;
    }

    public synchronized void clearCache() {
        idItemAnalysisTaskMap.clear();
    }

    /**
     * Getter for allItemURIsMap.
     * 
     * @return the allItemURIsMap
     */
    public Map<String, String> getAllItemURIsMap() {
        return this.allItemURIsMap;
    }

    public Map<String, List<String>> getDuplicatedItemURIsMap() {
        return this.duplicatedItemURIsMap;
    }

}
