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
package org.talend.metadata.managment.ui.utils;

import org.talend.metadata.managment.ui.model.AbsConnParamName;

/**
 * created by ycbai on 2015骞�11鏈�20鏃� Detailled comment
 *
 */
public class GenericConnParamName extends AbsConnParamName {

    private String contextVar;

    public String getContextVar() {
        return this.contextVar;
    }

    public void setContextVar(String contextVar) {
        this.contextVar = contextVar;
    }

}
