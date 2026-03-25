// ============================================================================
//
// Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.properties.controllers;

import java.util.List;
import java.util.Map;

import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IContextManager;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.process.Problem;
import org.talend.core.sqlbuilder.util.ConnectionParameters;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface IControllerContext {

    IElement getElement();

    void setElement(IElement elem);

    IElementParameter getCurParameter();

    void setCurParameter(IElementParameter param);

    ConnectionParameters getConnParameters();

    void setConnParameters(ConnectionParameters params);

    INode getConnectionNode();

    void setConnectionNode(INode node);

    EParameterFieldType getParamFieldType();

    void setParamFieldType(EParameterFieldType paramFieldType);

    IContextManager getContextManager();

    void setContextManager(IContextManager contextManager);

    EComponentCategory getSection();

    void setSection(EComponentCategory section);

    List<Problem> getCodeProblems();

    void setCodeProblems(List<Problem> codeProblems);

    boolean isInWizard();

    IProcess2 getProcess();

    Map<String, String> getTableIdAndDbTypeMap();

    Map<String, String> getTableIdAndDbSchemaMap();

    Map<String, String> getPromptParameterMap();

}
