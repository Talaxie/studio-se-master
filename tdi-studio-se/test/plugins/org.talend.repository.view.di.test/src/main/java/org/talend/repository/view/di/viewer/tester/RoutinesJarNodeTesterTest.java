// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.view.di.viewer.tester;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;

public class RoutinesJarNodeTesterTest {

    @Test
    public void testCustomJarNodeIsAvailable() {
        RoutinesJarNodeTester tester = new RoutinesJarNodeTester();
        RepositoryNode node = new RepositoryNode(null, null, ENodeType.SYSTEM_FOLDER);

        assertTrue(tester.testProperty(node, "isNeedShowCustomJarNode", null, null));
    }

    @Test
    public void testRoutinesJarNode() {
        RoutinesJarNodeTester tester = new RoutinesJarNodeTester();
        RepositoryNode node = new RepositoryNode(null, null, ENodeType.SYSTEM_FOLDER);
        node.setProperties(EProperties.CONTENT_TYPE, ERepositoryObjectType.ROUTINESJAR);

        assertTrue(tester.isRoutinesJar(node));
    }
}
