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
package org.talend.designer.core.ui.editor.properties.controllers.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.talend.core.model.metadata.IDynamicBaseProperty;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IContextManager;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.Problem;
import org.talend.core.sqlbuilder.util.ConnectionParameters;
import org.talend.designer.core.ui.editor.properties.controllers.AbsControllerContext;
import org.talend.designer.core.ui.editor.properties.controllers.IControllerContext;
import org.talend.designer.core.ui.editor.properties.controllers.executors.BusinessControllerExecutor;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public abstract class ControllerUI implements IControllerUI {

    protected IElement elem;

    // for job settings extra.(feature 2710)
    protected IElementParameter curParameter;

    protected ConnectionParameters connParameters;

    protected EParameterFieldType paramFieldType;

    protected IContextManager contextManager;

    protected EComponentCategory section;

    protected List<Problem> codeProblems;

    protected INode connectionNode;

    protected Map<String, String> promptParameterMap = new HashMap<String, String>();

    private IDynamicBaseProperty dynamicBaseProp;

    private IControllerContext ctx;

    private BusinessControllerExecutor controllerExecutor;

    /**
     * DOC cmeng ControllerUI constructor comment.
     */
    public ControllerUI(IDynamicBaseProperty dynamicBaseProp, BusinessControllerExecutor controllerExecutor) {
        this.controllerExecutor = controllerExecutor;
        configure(dynamicBaseProp);
        // create ctx after all data init
        this.ctx = createControllerContext();
    }

    protected void configure(IDynamicBaseProperty dynamicBaseProp) {
        configureBase(dynamicBaseProp);
    }

    protected void configureBase(IDynamicBaseProperty dynamicBaseProp) {
        this.dynamicBaseProp = dynamicBaseProp;
        this.elem = dynamicBaseProp.getElement();
        this.section = dynamicBaseProp.getSection();
    }

    protected void setDynamicBaseProp(IDynamicBaseProperty prop) {
        this.dynamicBaseProp = prop;
    }

    protected IDynamicBaseProperty getDynamicBaseProp() {
        return this.dynamicBaseProp;
    }

    public BusinessControllerExecutor getControllerExecutor() {
        return controllerExecutor;
    }

    protected IControllerContext getControllerContext() {
        return ctx;
    }

    protected abstract IControllerContext createControllerContext();

    protected abstract class BusinessControllerContext extends AbsControllerContext {

        @Override
        public IElement getElement() {
            return ControllerUI.this.elem;
        }

        @Override
        public void setElement(IElement elem) {
            ControllerUI.this.elem = elem;
        }

        @Override
        public IElementParameter getCurParameter() {
            return ControllerUI.this.curParameter;
        }

        @Override
        public void setCurParameter(IElementParameter param) {
            ControllerUI.this.curParameter = param;
        }

        @Override
        public ConnectionParameters getConnParameters() {
            return ControllerUI.this.connParameters;
        }

        @Override
        public void setConnParameters(ConnectionParameters params) {
            ControllerUI.this.connParameters = params;
        }

        @Override
        public EParameterFieldType getParamFieldType() {
            return ControllerUI.this.paramFieldType;
        }

        @Override
        public void setParamFieldType(EParameterFieldType paramFieldType) {
            ControllerUI.this.paramFieldType = paramFieldType;
        }

        @Override
        public IContextManager getContextManager() {
            return ControllerUI.this.contextManager;
        }

        @Override
        public void setContextManager(IContextManager contextManager) {
            ControllerUI.this.contextManager = contextManager;
        }

        @Override
        public EComponentCategory getSection() {
            return ControllerUI.this.section;
        }

        @Override
        public void setSection(EComponentCategory section) {
            ControllerUI.this.section = section;
        }

        @Override
        public List<Problem> getCodeProblems() {
            return ControllerUI.this.codeProblems;
        }

        @Override
        public void setCodeProblems(List<Problem> codeProblems) {
            ControllerUI.this.codeProblems = codeProblems;
        }

        @Override
        public INode getConnectionNode() {
            return ControllerUI.this.connectionNode;
        }

        @Override
        public void setConnectionNode(INode node) {
            ControllerUI.this.connectionNode = node;
        }

        @Override
        public Map<String, String> getPromptParameterMap() {
            return ControllerUI.this.promptParameterMap;
        }

    }

}
