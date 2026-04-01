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
package org.talend.dq.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.talend.cwm.helper.TaggedValueHelper;
import org.talend.dataquality.reports.ReportsFactory;
import org.talend.dataquality.reports.TdReport;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;

import junit.framework.Assert;
import orgomg.cwm.objectmodel.core.CoreFactory;
import orgomg.cwm.objectmodel.core.TaggedValue;

/**
 * created by xqliu on Aug 6, 2013 Detailled comment
 *
 */
public class ContextHelperTest {

    /**
     * Test method for {@link org.talend.dq.helper.ContextHelper#isContextVar(java.lang.String)}.
     */
    @Test
    public void testIsContextVar() {
        String varName = null;
        Assert.assertFalse(ContextHelper.isContextVar(varName));

        varName = ""; //$NON-NLS-1$
        Assert.assertFalse(ContextHelper.isContextVar(varName));

        varName = "        "; //$NON-NLS-1$
        Assert.assertFalse(ContextHelper.isContextVar(varName));

        varName = "varName"; //$NON-NLS-1$
        Assert.assertFalse(ContextHelper.isContextVar(varName));

        varName = "context.varName"; //$NON-NLS-1$
        Assert.assertTrue(ContextHelper.isContextVar(varName));
    }

    /**
     * Test method for
     * {@link org.talend.dq.helper.ContextHelper#getContextValue(java.util.List, java.lang.String, java.lang.String)}.
     */
    @Test
    public void testGetContextValue() {
        List<ContextType> contexts = new ArrayList<ContextType>();

        ContextType ct = TalendFileFactory.eINSTANCE.createContextType();
        ct.setName("default"); //$NON-NLS-1$

        ContextParameterType cpt = TalendFileFactory.eINSTANCE.createContextParameterType();
        cpt.setName("abc"); //$NON-NLS-1$
        cpt.setValue("123"); //$NON-NLS-1$

        ct.getContextParameter().add(cpt);
        contexts.add(ct);

        String defaultContextName = "default"; //$NON-NLS-1$
        String str = "context.abc"; //$NON-NLS-1$
        Assert.assertEquals("123", ContextHelper.getContextValue(contexts, defaultContextName, str)); //$NON-NLS-1$

        str = "context.xyz"; //$NON-NLS-1$
        Assert.assertEquals(str, ContextHelper.getContextValue(contexts, defaultContextName, str));

        str = "realValue"; //$NON-NLS-1$
        Assert.assertEquals(str, ContextHelper.getContextValue(contexts, defaultContextName, str));
    }

    /**
     * Test method for {@link org.talend.dq.helper.ContextHelper#getOutputFolderFromReports(java.util.List)}.
     */
    @Test
    public void testGetOutputFolderFromReports() {
        String empty = ""; //$NON-NLS-1$
        String blank = "      "; //$NON-NLS-1$
        String defaultStr = "default"; //$NON-NLS-1$
        String var1 = "context.outputFolder"; //$NON-NLS-1$
        String var1a = "outputFolder"; //$NON-NLS-1$
        String var2 = "context.of2"; //$NON-NLS-1$
        String var2a = "of2"; //$NON-NLS-1$
        String folder1 = "/home/user/talend/a"; //$NON-NLS-1$
        String folder2 = "/home/user/talend/b"; //$NON-NLS-1$

        Assert.assertNull(ContextHelper.getOutputFolderFromReports(null));
        Assert.assertNull(ContextHelper.getOutputFolderFromReports(new ArrayList<TdReport>()));

        List<TdReport> reports = new ArrayList<TdReport>();

        TdReport tdReport = ReportsFactory.eINSTANCE.createTdReport();
        tdReport.setDefaultContext(defaultStr);

        TaggedValue tv = CoreFactory.eINSTANCE.createTaggedValue();
        tv.setTag(TaggedValueHelper.OUTPUT_FOLDER_TAG);
        tv.setValue(empty);

        tdReport.getTaggedValue().add(tv);
        reports.add(tdReport);

        Assert.assertNull(ContextHelper.getOutputFolderFromReports(reports));

        tv.setValue(blank);
        Assert.assertNull(ContextHelper.getOutputFolderFromReports(reports));

        tv.setValue(folder1);
        Assert.assertEquals(folder1, ContextHelper.getOutputFolderFromReports(reports));

        tv.setValue(var1);
        Assert.assertEquals(var1, ContextHelper.getOutputFolderFromReports(reports));

        TdReport tdReport2 = ReportsFactory.eINSTANCE.createTdReport();
        tdReport2.setDefaultContext(defaultStr);

        TaggedValue tv2 = CoreFactory.eINSTANCE.createTaggedValue();
        tv2.setTag(TaggedValueHelper.OUTPUT_FOLDER_TAG);
        tv2.setValue(empty);

        tdReport2.getTaggedValue().add(tv2);
        reports.add(tdReport2);

        ContextType ct = TalendFileFactory.eINSTANCE.createContextType();
        ct.setName(defaultStr);
        ContextParameterType cpt = TalendFileFactory.eINSTANCE.createContextParameterType();
        cpt.setName(var1a);
        cpt.setValue(folder1);
        ct.getContextParameter().add(cpt);
        tdReport.getContext().add(ct);

        ContextType ct2 = TalendFileFactory.eINSTANCE.createContextType();
        ct2.setName(defaultStr);
        ContextParameterType cpt2 = TalendFileFactory.eINSTANCE.createContextParameterType();
        cpt2.setName(var2a);
        cpt2.setValue(folder2);
        ct2.getContextParameter().add(cpt2);
        tdReport2.getContext().add(ct2);

        // both context, different output folder
        tv.setValue(var1);
        tv2.setValue(var2);
        Assert.assertNull(ContextHelper.getOutputFolderFromReports(reports));

        // both context, same output folder
        cpt2.setValue(folder1);
        ct2.getContextParameter().clear();
        ct2.getContextParameter().add(cpt2);
        tdReport2.getContext().clear();
        tdReport2.getContext().add(ct2);
        String temp = ContextHelper.getOutputFolderFromReports(reports);
        Assert.assertTrue(var1.equals(temp) || var2.equals(temp));

        // both real folder, different output folder
        tv.setValue(folder1);
        tdReport.getTaggedValue().clear();
        tdReport.getTaggedValue().add(tv);
        tv2.setValue(folder2);
        tdReport2.getTaggedValue().clear();
        tdReport2.getTaggedValue().add(tv2);
        Assert.assertNull(ContextHelper.getOutputFolderFromReports(reports));

        // both real folder, same output folder
        tv2.setValue(folder1);
        tdReport2.getTaggedValue().clear();
        tdReport2.getTaggedValue().add(tv2);
        Assert.assertEquals(folder1, ContextHelper.getOutputFolderFromReports(reports));

        // context and real folder, different output folder
        tv2.setValue(var2);
        tdReport2.getTaggedValue().clear();
        tdReport2.getTaggedValue().add(tv2);
        cpt2.setValue(folder2);
        ct2.getContextParameter().clear();
        ct2.getContextParameter().add(cpt2);
        tdReport2.getContext().clear();
        tdReport2.getContext().add(ct2);
        Assert.assertNull(ContextHelper.getOutputFolderFromReports(reports));

        // context and real folder, same output folder
        cpt2.setValue(folder1);
        ct2.getContextParameter().clear();
        ct2.getContextParameter().add(cpt2);
        tdReport2.getContext().clear();
        tdReport2.getContext().add(ct2);
        Assert.assertEquals(folder1, ContextHelper.getOutputFolderFromReports(reports));

        // one report's output folder is empty(mean default location)
        tv2.setValue(empty);
        tdReport2.getTaggedValue().clear();
        tdReport2.getTaggedValue().add(tv2);
        Assert.assertNull(ContextHelper.getOutputFolderFromReports(reports));

        // one report's output folder is blank(mean default location)
        tv2.setValue(blank);
        tdReport2.getTaggedValue().clear();
        tdReport2.getTaggedValue().add(tv2);
        Assert.assertNull(ContextHelper.getOutputFolderFromReports(reports));
    }

    /**
     * Test method for {@link org.talend.dq.helper.ContextHelper#removeContextPreffix(java.lang.String)}.
     */
    @Test
    public void testRemoveContextPreffix() {
        String varName = null;
        Assert.assertEquals(null, ContextHelper.removeContextPreffix(varName));

        // TDQ-18578: fix a StringIndexOutOfBoundsException
        varName = ""; //$NON-NLS-1$
        Assert.assertEquals("", ContextHelper.removeContextPreffix(varName)); //$NON-NLS-1$

        varName = "        "; //$NON-NLS-1$
        Assert.assertEquals("        ", ContextHelper.removeContextPreffix(varName)); //$NON-NLS-1$

        varName = "varName"; //$NON-NLS-1$
        Assert.assertEquals("varName", ContextHelper.removeContextPreffix(varName)); //$NON-NLS-1$

        varName = "context.varName"; //$NON-NLS-1$
        Assert.assertEquals("varName", ContextHelper.removeContextPreffix(varName)); //$NON-NLS-1$

        varName = "contextvarName"; //$NON-NLS-1$
        Assert.assertEquals("contextvarName", ContextHelper.removeContextPreffix(varName)); //$NON-NLS-1$

    }

    /**
     * Test method for {@link org.talend.dq.helper.ContextHelper#getUrlWithoutContext(java.lang.String,
     * java.util.Map<String, String>)}.
     */
    @Test
    public void testGetUrlWithoutContext() {
        String contextualizeUrl =
                "jdbc:mysql://context.mysql_context_Server_dataMart:context.mysql_context_Port_dataMart/talend_dq?characterEncoding=UTF8"; //$NON-NLS-1$

        String expectResultUrl = "jdbc:mysql://10.67.8.81:3306/talend_dq?characterEncoding=UTF8"; //$NON-NLS-1$
        Map<String, String> contextValues = new HashMap<String, String>();
        contextValues.put("context.mysql_context_Login", "root"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.mysql_context_Server_dataMart", "10.67.8.81"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.mysql_context_Password_dataMart", ""); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.mysql_context_Password", ""); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.mysql_context_Database", "tbi"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues
                .put("context.mysql_context_AdditionalParams", //$NON-NLS-1$
                        "noDatetimeStringSync=true&enabledTLSProtocols=TLSv1.2,TLSv1.1,TLSv1"); //$NON-NLS-1$
        contextValues.put("context.mysql_context_Database_dataMart", "tbi"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.mysql_context_Login_dataMart", "root"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.mysql_context_Port", "3308"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.mysql_context_Server", "10.67.8.78"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues
                .put("context.mysql_context_AdditionalParams_dataMart", //$NON-NLS-1$
                        "noDatetimeStringSync=true&enabledTLSProtocols=TLSv1.2,TLSv1.1,TLSv1"); //$NON-NLS-1$
        contextValues.put("context.mysql_context_Port_dataMart", "3306"); //$NON-NLS-1$ //$NON-NLS-2$

        String urlWithoutContext = ContextHelper.getUrlWithoutContext(contextualizeUrl, contextValues);
        Assert.assertEquals(expectResultUrl, urlWithoutContext);

        // jdbc:mysql://context.rep_Server:context.rep_Port/context.rep_Database?context.rep_AdditionalParams

    }

    /**
     * Test method for {@link org.talend.dq.helper.ContextHelper#getUrlWithoutContext(java.lang.String,
     * java.util.Map<String, String>)}.
     */
    @Test
    public void testGetUrlWithoutContext_2() {
        String contextualizeUrl =
                "jdbc:mysql://context.rep_Server:context.rep_Port/context.rep_Database?context.rep_AdditionalParams"; //$NON-NLS-1$

        String expectResultUrl = "jdbc:mysql://10.67.8.76:3306/talend_dq888context?characterEncoding=UTF8"; //$NON-NLS-1$
        Map<String, String> contextValues = new HashMap<String, String>();
        contextValues.put("context.rep_Login", "root"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.rep_Database", "talend_dq888context"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.rep_Password", "root"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.rep_Server", "10.67.8.76"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.rep_AdditionalParams", "characterEncoding=UTF8"); //$NON-NLS-1$ //$NON-NLS-2$
        contextValues.put("context.rep_Port", "3306"); //$NON-NLS-1$ //$NON-NLS-2$

        String urlWithoutContext = ContextHelper.getUrlWithoutContext(contextualizeUrl, contextValues);
        Assert.assertEquals(expectResultUrl, urlWithoutContext);

    }

    /**
     * Test method for {@link org.talend.dq.helper.ContextHelper#getUrlWithoutContext(java.lang.String,
     * java.util.Map<String, String>)}.
     */
    @Test
    public void testGetUrlWithoutContext_3Oracle() {
        String contextualizeUrl =
                "jdbc:oracle:thin:@context.TdqContext_Server:context.TdqContext_Port:context.TdqContext_Database"; //$NON-NLS-1$

        String expectResultUrl = "jdbc:oracle:thin:@192.168.31.20:1521:xe"; //$NON-NLS-1$
        Map<String, String> contextValues = new HashMap<String, String>();
        contextValues.put("context.TdqContext_Schema", "SYSTEM");
        contextValues.put("context.TdqContext_OutputFolder", "");
        contextValues.put("context.TdqContext_Warehouse", "");
        contextValues.put("context.TdqContext_Port", "1521");
        contextValues.put("context.TdqContext_AdditionalParams", "");
        contextValues.put("context.TdqContext_Server", "192.168.31.20");
        contextValues.put("context.TdqContext_LogoFile", "");
        contextValues.put("context.TdqContext_Password", "oracle");
        contextValues.put("context.TdqContext_Database", "xe");
        contextValues.put("context.TdqContext_Login", "system");

        String urlWithoutContext = ContextHelper.getUrlWithoutContext(contextualizeUrl, contextValues);
        Assert.assertEquals(expectResultUrl, urlWithoutContext);

    }
}
