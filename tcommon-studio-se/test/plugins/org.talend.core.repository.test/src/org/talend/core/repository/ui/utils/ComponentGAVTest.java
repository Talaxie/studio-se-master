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
package org.talend.core.repository.ui.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.talend.core.model.utils.ComponentGAV;

/**
 * @author bhe created on Jul 20, 2021
 *
 */
public class ComponentGAVTest {

    @Test
    public void testToCoordinateStr() throws Exception {
        ComponentGAV gav = new ComponentGAV();

        gav.setGroupId("org.talend.components");
        gav.setArtifactId("neo4j");
        gav.setVersion("1.25.0-SNAPSHOT");

        assertEquals("org.talend.components:neo4j:1.25.0-SNAPSHOT", gav.toCoordinateStr());
    }

    @Test
    public void testToMavenUri() throws Exception {
        ComponentGAV gav = new ComponentGAV();

        gav.setGroupId("org.talend.components");
        gav.setArtifactId("neo4j");
        gav.setVersion("1.25.0-SNAPSHOT");
        gav.setClassifier("component");
        gav.setType("jar");

        assertEquals("mvn:org.talend.components/neo4j/1.25.0-SNAPSHOT/component/jar", gav.toMavenUri());
    }

}
