// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.properties.controllers.executors;

import java.util.HashMap;
import java.util.Map;

import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IContextManager;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.sqlbuilder.util.ConnectionParameters;
import org.talend.designer.core.ui.editor.properties.controllers.IControllerContext;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IBusinessControllerUI;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IControllerUI;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public abstract class ControllerExecutor implements IControllerExecutor {

    public static final String SQLEDITOR = IBusinessControllerUI.SQLEDITOR;

    public static final String NAME = IBusinessControllerUI.NAME;

    public static final String COLUMN = IBusinessControllerUI.COLUMN;

    // PTODO qzhang use PARAMETER_NAME it for bug 853.
    public static final String PARAMETER_NAME = IBusinessControllerUI.PARAMETER_NAME;

    public static Map<String, String> connKeyMap = new HashMap<String, String>(10);

    static {
        connKeyMap.put("SERVER_NAME", "HOST"); //$NON-NLS-1$ //$NON-NLS-2$
        connKeyMap.put("PORT", "PORT"); //$NON-NLS-1$ //$NON-NLS-2$
        connKeyMap.put("SID", "DBNAME"); //$NON-NLS-1$ //$NON-NLS-2$
        connKeyMap.put("SCHEMA", "SCHEMA_DB"); //$NON-NLS-1$ //$NON-NLS-2$
        connKeyMap.put("USERNAME", "USER"); //$NON-NLS-1$ //$NON-NLS-2$
        connKeyMap.put("PASSWORD", "PASS"); //$NON-NLS-1$ //$NON-NLS-2$
        connKeyMap.put("PROPERTIES_STRING", "PROPERTIES"); //$NON-NLS-1$ //$NON-NLS-2$
        connKeyMap.put("DIRECTORY", "DIRECTORY"); //$NON-NLS-1$ //$NON-NLS-2$
        connKeyMap.put("FILE", "FILE"); //$NON-NLS-1$ //$NON-NLS-2$
        connKeyMap.put("DATASOURCE", "DATASOURCE"); //$NON-NLS-1$ //$NON-NLS-2$
    }

    private IControllerContext ctx;

    private IControllerUI ui;

    @Override
    public void init(IControllerContext ctx, IControllerUI ui) {
        this.ctx = ctx;
        this.ui = ui;
    }

    @Override
    public boolean execute(Map<String, Object> params) {
        throw new UnsupportedOperationException(
                "Implement it in fragments for different Platform!! => " + this.getClass().getCanonicalName());
    }

    protected IControllerContext getControllerContext() {
        return this.ctx;
    }

    protected IControllerUI getUi() {
        return ui;
    }

    protected boolean isInWizard() {
        return ctx.isInWizard();
    }

    protected IElement getElem() {
        return ctx.getElement();
    }

    protected void setElem(IElement elem) {
        ctx.setElement(elem);
    }

    protected IElementParameter getCurParameter() {
        return ctx.getCurParameter();
    }

    protected void setCurParameter(IElementParameter curParameter) {
        ctx.setCurParameter(curParameter);
    }

    protected ConnectionParameters getConnParameters() {
        return ctx.getConnParameters();
    }

    protected void setConnParameters(ConnectionParameters connParameters) {
        ctx.setConnParameters(connParameters);
    }

    protected EParameterFieldType getParamFieldType() {
        return ctx.getParamFieldType();
    }

    protected void setParamFieldType(EParameterFieldType paramFieldType) {
        ctx.setParamFieldType(paramFieldType);
    }

    protected INode getConnectionNode() {
        return ctx.getConnectionNode();
    }

    protected void setConnectionNode(INode connectionNode) {
        ctx.setConnectionNode(connectionNode);
    }

    protected IContextManager getContextManager() {
        return ctx.getContextManager();
    }

    protected void setContextManager(IContextManager contextManager) {
        ctx.setContextManager(contextManager);
    }

    protected EComponentCategory getSection() {
        return ctx.getSection();
    }

    protected void setSection(EComponentCategory section) {
        ctx.setSection(section);
    }

    protected Map<String, String> getPromptParameterMap() {
        return ctx.getPromptParameterMap();
    }

}
