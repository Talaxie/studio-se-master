package org.talend.designer.core.ui.editor.cmd;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Test;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.context.JobContext;
import org.talend.core.model.context.JobContextManager;
import org.talend.core.model.context.JobContextParameter;
import org.talend.core.model.context.link.ContextLink;
import org.talend.core.model.context.link.ContextLinkService;
import org.talend.core.model.context.link.ContextParamLink;
import org.talend.core.model.context.link.ItemContextLink;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.update.EUpdateItemType;
import org.talend.core.model.update.EUpdateResult;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.designer.core.ui.editor.update.UpdateCheckResult;
import org.talend.designer.core.ui.editor.update.cmd.UpdateContextParameterCommand;
import org.talend.repository.UpdateRepositoryUtils;
public class UpdateContextParameterCommandTest {

    @Test
    public void testCheckNewRepositoryParameters() {
        Property property1 = PropertiesFactory.eINSTANCE.createProperty();
        property1.setId("property1");
        property1.setVersion("0.1");
        property1.setLabel("test1");
        Process process = new Process(property1);
        JobContextManager jobContextManager = new JobContextManager();
        process.setContextManager(jobContextManager);

        ContextItem contextItem = PropertiesFactory.eINSTANCE.createContextItem();
        Property myContextProperty = PropertiesFactory.eINSTANCE.createProperty();
        myContextProperty.setId("_DHiJ0KPlEeGSwOgmctA-XA");
        myContextProperty.setLabel("testContext");
        myContextProperty.setVersion("0.1");
        contextItem.setProperty(myContextProperty);
        contextItem.setDefaultContext("Default");

        // case1: add context
        ContextType contextType = TalendFileFactory.eINSTANCE.createContextType();
        contextType.setName("Default");
        ContextParameterType contextParameterTypeNew = TalendFileFactory.eINSTANCE.createContextParameterType();
        contextParameterTypeNew.setName("new1");
        contextParameterTypeNew.setValue("value1");
        contextParameterTypeNew.setType(JavaTypesManager.getDefaultJavaType().getId());
        contextType.getContextParameter().add(contextParameterTypeNew);
        contextItem.getContext().add(contextType);
        Set<String> set = new HashSet<String>();
        set.add("new1");
        UpdateCheckResult result = new UpdateCheckResult(set);
        result.setJob(process);
        result.setResult(EUpdateItemType.CONTEXT, EUpdateResult.ADD, contextItem,
                UpdateRepositoryUtils.getRepositorySourceName(contextItem));
        result.setChecked(true);
        UpdateContextParameterCommand updateContextParameterCommand = new UpdateContextParameterCommand(result);
        updateContextParameterCommand.execute();
        List<IContext> listContext = process.getContextManager().getListContext();
        assertTrue(listContext.size() == 1);
        IContext contextJob = listContext.get(0);
        IContextParameter contextParameter = contextJob.getContextParameter("new1");
        assertTrue(contextParameter != null && contextParameter.getValue().equals("value1"));

        // case2: add Group
        IContext testGroup = new JobContext("NewGroup");
        jobContextManager.getListContext().add(testGroup);
        IContextParameter contextParam = new JobContextParameter();
        contextParam.setName(contextParameterTypeNew.getName());
        contextParam.setType(JavaTypesManager.getDefaultJavaType().getId());
        contextParam.setValue(contextParameterTypeNew.getValue());
        testGroup.getContextParameterList().add(contextParam);
        result = new UpdateCheckResult(testGroup);
        result.setJob(process);
        result.setResult(EUpdateItemType.CONTEXT_GROUP, EUpdateResult.ADD, contextItem,
                UpdateRepositoryUtils.getRepositorySourceName(contextItem));
        result.setChecked(true);
        updateContextParameterCommand = new UpdateContextParameterCommand(result);
        updateContextParameterCommand.execute();
        listContext = process.getContextManager().getListContext();
        assertTrue(listContext.size() == 2);
        IContextParameter contextParameterGroup = listContext.get(1).getContextParameter(contextParameterTypeNew.getName());
        assertTrue(contextParameterGroup != null && contextParameterGroup.getValue().equals(contextParameterTypeNew.getValue()));

        // case3: jobsetting added with db context model
        ContextType contextTypeGroup = TalendFileFactory.eINSTANCE.createContextType();
        contextTypeGroup.setName("GroupSetting");
        ContextParameterType contextParameterTypeNewGroup = TalendFileFactory.eINSTANCE.createContextParameterType();
        contextParameterTypeNewGroup.setType(JavaTypesManager.getDefaultJavaType().getId());
        contextParameterTypeNewGroup.setName(contextParameterTypeNew.getName());
        contextParameterTypeNewGroup.setValue(contextParameterTypeNew.getValue());
        contextTypeGroup.getContextParameter().add(contextParameterTypeNewGroup);
        contextItem.getContext().add(contextTypeGroup);
        set = new HashSet<String>();
        set.add(contextParameterTypeNew.getName());
        result = new UpdateCheckResult(set);
        result.setJob(process);
        // only the remark ending with UpdatesConstants.CONTEXT_MODE,a dialog will pop to list contextGroups need to be
        // added.
        result.setResult(EUpdateItemType.CONTEXT, EUpdateResult.ADD, contextItem,
                UpdateRepositoryUtils.getRepositorySourceName(contextItem));
        result.setChecked(true);
        updateContextParameterCommand = new UpdateContextParameterCommand(result);
        updateContextParameterCommand.execute();
        listContext = process.getContextManager().getListContext();
        assertTrue(listContext.size() == 2);
    }
    
    @Test
    public void testUpdateContextLink() {
        Property processProp1 = PropertiesFactory.eINSTANCE.createProperty();
        processProp1.setId("jobPropId1");
        processProp1.setVersion("0.1");
        processProp1.setLabel("testjob1");
        Process process = new Process(processProp1);
        ProcessItem processItem = PropertiesFactory.eINSTANCE.createProcessItem();
        processItem.setProperty(processProp1);
//        
        ContextItem contextItem = PropertiesFactory.eINSTANCE.createContextItem();
        Property myContextProperty = PropertiesFactory.eINSTANCE.createProperty();
        myContextProperty.setId("_DHiJ0KPlEeGSwOgmctA-XA");
        myContextProperty.setLabel("testContext");
        myContextProperty.setVersion("0.1");
        contextItem.setProperty(myContextProperty);
        contextItem.setDefaultContext("Default");
        
        String oldContextParamName = "oldContextParamName";
        String newContextParamName = "newContextParamName";
        String contextGroupName = "NewContextGroup";
        JobContext testGroup = new JobContext(contextGroupName);
        IContextParameter contextParam = new JobContextParameter();
        contextParam.setName(oldContextParamName);
        contextParam.setSource(myContextProperty.getId());
        contextParam.setType(JavaTypesManager.getDefaultJavaType().getId());
        contextParam.setValue(oldContextParamName);
        
        ItemContextLink itemcontextLink = new ItemContextLink();
        itemcontextLink.setItemId(processProp1.getId());
        List<ContextLink> contextLinks = new ArrayList<>();
        ContextLink contextLink = new ContextLink();
        contextLink.setContextName(contextGroupName);
        contextLink.setRepoId(myContextProperty.getId());
        List<ContextParamLink> cpLinks = new ArrayList<>();
        ContextParamLink cplink = new ContextParamLink();
        cplink.setId("_D-EIsLMTEe2hideXX9atiw");
        cplink.setName(oldContextParamName);
        cpLinks.add(cplink);
        contextLink.setParameterList(cpLinks);
        
        contextLinks.add(contextLink);
        itemcontextLink.setContextList(contextLinks);
        
        try {
            ContextLinkService.getInstance().saveContextLinkToJson(processItem, itemcontextLink);
        } catch (PersistenceException e) {//
        }
        
        UpdateCheckResult result = new UpdateCheckResult(new HashSet<String>());
        new UpdateContextParameterCommand(result).updateContextLink(process, testGroup, contextParam, oldContextParamName, newContextParamName);
        try {
            ItemContextLink loadContextLinkFromJson = ContextLinkService.getInstance().loadContextLinkFromJson(processItem);
            ContextParamLink paramLink = loadContextLinkFromJson.findContextParamLinkByName(contextParam.getSource(), testGroup.getName(), oldContextParamName);
            assertNull(paramLink);
            paramLink = loadContextLinkFromJson.findContextParamLinkByName(contextParam.getSource(), testGroup.getName(), newContextParamName);
            assertNotNull(paramLink);
        } catch (PersistenceException e) {
        } finally {
            try {
                IFile linkFile = ContextLinkService.getInstance().calContextLinkFile(processItem);
                linkFile.delete(true, new NullProgressMonitor());
            } catch (PersistenceException | CoreException e) {
            }
        }
    }
}
