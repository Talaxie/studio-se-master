/*
 * Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 */
package org.talend.sdk.component.studio.mvn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.runtime.maven.MavenConstants;

class MvnTest {

    private static final String MVN_PRE = "mvn:";

    private static final String MVN_LOC = "localrepositories://@id=talend.local!";

    private static final String MVN_PATH = "io.netty/netty-codec-http/4.1.68.Final/jar";

    private static final String MVN_URI_CONF = MVN_PRE + MVN_PATH;

    private static final String MVN_GAVT = MVN_PRE + MVN_LOC + MVN_PATH;

    private static final String MVN_GAVTC = MVN_GAVT + "/osx-x86_64";

    private static final String GAV = "io.netty:netty-codec-http:4.1.68.Final";

    private static final String GATV = "io.netty:netty-codec-http:jar:4.1.68.Final";

    private static final String GATVS = "io.netty:netty-codec-http:jar:4.1.68.Final:compile";

    private static final String GATCV = "io.netty:netty-codec-http:jar:osx-x86_64:4.1.68.Final";

    private static final String GA = "io.netty:netty-codec-http";


    void locationToMvn() {
        assertEquals(MVN_GAVT, Mvn.locationToMvn(MVN_GAVT));
        assertEquals(MVN_GAVTC, Mvn.locationToMvn(MVN_GAVTC));
        assertEquals(MVN_GAVT, Mvn.locationToMvn(GAV));
        assertEquals(MVN_GAVT, Mvn.locationToMvn(GATV));
        assertEquals(MVN_GAVT, Mvn.locationToMvn(GATVS));
        assertEquals(MVN_GAVTC, Mvn.locationToMvn(GATCV));
        assertEquals(MVN_GAVTC, Mvn.locationToMvn(GATCV + ":runtime"));
        assertThrows(IllegalArgumentException.class, () -> Mvn.locationToMvn(GA));
    }

    private void assertNeededModule(final String location, final String ext) {
        final ModuleNeeded need = new ModuleNeeded("fake", "", true, location.replace(MavenConstants.LOCAL_RESOLUTION_URL + '!', ""));
        assertEquals("fake", need.getContext());
        // from ModuleNeeded$constructor:
        // this.setModuleName(mavenArtifact.getArtifactId() + "-" + mavenArtifact.getVersion() + "." + mavenArtifact.getType());
        assertEquals("netty-codec-http-4.1.68.Final.jar", need.getModuleName());
        assertEquals(MVN_URI_CONF + ext, need.getMavenURIFromConfiguration());
        assertEquals(MVN_URI_CONF + ext, need.getDefaultMavenURI());
    }

    void moduleNeededFromGAV() {
        assertNeededModule(Mvn.locationToMvn(GAV), "");
    }

    void moduleNeededFromGATV() {
        assertNeededModule(Mvn.locationToMvn(GATV), "");
    }

    void moduleNeededFromGATVS() {
        assertNeededModule(Mvn.locationToMvn(GATVS), "");
    }

    void moduleNeededFromGATCV() {
        assertNeededModule(Mvn.locationToMvn(GATCV), "/osx-x86_64");
    }

    void moduleNeededFromGATCVE() {
        assertNeededModule(Mvn.locationToMvn(GATCV + ":extra-param"), "/osx-x86_64");
    }
}