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

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.RepositoryNode;

/**
 * DOC xqliu class global comment. Detailled comment
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ RepositoryNodeHelper.class })
public class RepositoryNodeHelperTest {

    @Test
    public void testFindNearestSystemFolderNode() {
        RepositoryNode node = mock(RepositoryNode.class);
        RepositoryNode parent1 = mock(RepositoryNode.class);
        when(parent1.getType()).thenReturn(ENodeType.SIMPLE_FOLDER);
        when(node.getParent()).thenReturn(parent1);
        RepositoryNode parent2 = mock(RepositoryNode.class);
        when(parent2.getType()).thenReturn(ENodeType.SYSTEM_FOLDER);
        when(parent1.getParent()).thenReturn(parent2);
        RepositoryNode parent3 = mock(RepositoryNode.class);
        when(parent3.getType()).thenReturn(ENodeType.SYSTEM_FOLDER);
        when(parent2.getParent()).thenReturn(parent3);
        RepositoryNode findNearestSysNode = RepositoryNodeHelper.findNearestSystemFolderNode(node);
        assertTrue(findNearestSysNode.equals(parent2));
    }

}
