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
package org.talend.hadoop.distribution.constants;

import java.util.Arrays;
import java.util.List;

public final class ImpalaConstant {

    public static final String SERVICE = "org.talend.hadoop.distribution.component.ImpalaComponent";//$NON-NLS-1$

    public static final String DISTRIBUTION_PARAMETER = "DISTRIBUTION";//$NON-NLS-1$

    public static final String DISTRIBUTION_REPOSITORYVALUE = "DISTRIBUTION";//$NON-NLS-1$

    public static final String VERSION_PARAMETER = "IMPALA_VERSION";//$NON-NLS-1$

    public static final String VERSION_REPOSITORYVALUE = "IMPALA_VERSION";//$NON-NLS-1$

    public static final List<String> IMPALA_COMPONENTS = Arrays.asList("tImpalaConnection", "tImpalaCreateTable", "tImpalaInput", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            "tImpalaLoad", "tImpalaOutput", "tImpalaRow"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
}
