// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.model.general;

import java.util.HashSet;
import java.util.Set;

public class RetrieveResult {

    private boolean allResolved;

    private Set<ModuleNeeded> resovledModules = new HashSet<>();

    private Set<ModuleNeeded> unresolvedModules = new HashSet<>();

    public boolean isAllResolved() {
        return allResolved;
    }

    public void setAllResolved(boolean allResolved) {
        this.allResolved = allResolved;
    }

    public Set<ModuleNeeded> getResovledModules() {
        return resovledModules;
    }

    public Set<ModuleNeeded> getUnresolvedModules() {
        return unresolvedModules;
    }

}
