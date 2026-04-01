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
package org.talend.core.service;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.talend.commons.CommonsPlugin;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.Item;
import org.talend.core.runtime.maven.MavenArtifact;
import org.talend.core.runtime.maven.MavenUrlHelper;

/**
 * @author bhe created on Dec 22, 2021
 *
 */
public interface IDetectCVEService extends IService {

    /**
     * Load CVEData base file
     * 
     * @param cveDataFile
     * @return
     */
    Set<CVEData> loadCVEData(String cveDataFile);

    /**
     * Filter CVEData based on given CVEData set
     * 
     * @param datas given CVEData set
     * @param patchVerionFrom from patch version
     * @param patchVersionTo to patch version
     * @param includeNotFixed flag to indicate whether include not fixed CVEData
     * @return filtered CVEData set
     */
    Set<CVEData> filterCVEData(Set<CVEData> datas, String patchVerionFrom, String patchVersionTo, boolean includeNotFixed);

    /**
     * Detect CVEs
     * 
     * @param prj Project
     * @param datas cve data base
     * @param includeNotFixed flag to indicate whether include not fixed
     * @return impacted jobs
     */
    List<ImpactedItem> detect(Project prj, Set<CVEData> datas, boolean includeNotFixed);

    /**
     * Detect CVEs
     * 
     * @param item Item
     * @param datas cve data base
     * @param includeNotFixed flag to indicate whether include not fixed
     * @return impacted jobs
     */
    ImpactedItem detect(Item item, Set<CVEData> datas, boolean includeNotFixed);

    /**
     * Persist final cve report
     * @param impactedItems impacted items
     * @param reportFile - report file path
     */
    void writeReport(List<ImpactedItem> impactedItems, File reportFile);
    
    /**
     * Clear CVE cache
     */
    void clearCache();

    public static IDetectCVEService get() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IDetectCVEService.class)) {
            return GlobalServiceRegister.getDefault().getService(IDetectCVEService.class);
        }
        return null;
    }

    public static String mavenUri2GAV(String uri) {
        if (MavenUrlHelper.isMvnUrl(uri)) {
            MavenArtifact art = MavenUrlHelper.parseMvnUrl(uri);
            if (art == null) {
                return null;
            }
            String gavc = String.format("%s:%s:%s", art.getGroupId(), art.getArtifactId(), art.getVersion());
            if (!StringUtils.isEmpty(art.getClassifier())) {
                gavc += ":" + art.getClassifier();
            }
            return gavc;
        }
        return null;
    }

    public static final String[] CVE_INDEX_HEADERS =
            new String[] { "Status", "Patch Version", "GAV with CVE", "GAV with CVE mitigated", "CVE-ID", "CVSS", "UsedByTalendComponent", "Component Names", "Distributions", "Comment" };

    public static final String[] CVE_REPORT_HEADERS = new String[] { "Status", "Fix Version", "Project Name", "Item type", "Item ID", "Item Name", "GAV with CVE", "GAV with CVE mitigated",
            "UsedByTalendComponent", "CVE-ID", "CVSS", "Component Names", "Comment" };

    static class GAV implements Cloneable {

        private String g;

        private String a;

        private String v;
        
        private String c;

        /**
         * @return the g
         */
        public String getG() {
            return g;
        }

        /**
         * @param g the g to set
         */
        public void setG(String g) {
            this.g = g;
        }

        /**
         * @return the a
         */
        public String getA() {
            return a;
        }

        /**
         * @param a the a to set
         */
        public void setA(String a) {
            this.a = a;
        }

        /**
         * @return the v
         */
        public String getV() {
            return v;
        }

        /**
         * @param v the v to set
         */
        public void setV(String v) {
            this.v = v;
        }

        
        /**
         * @return the c
         */
        public String getC() {
            return c;
        }

        
        /**
         * @param c the c to set
         */
        public void setC(String c) {
            this.c = c;
        }

        public String getGAVString() {
            String gav = String.format("%s:%s:%s", g, a, v);
            if (!StringUtils.isEmpty(c)) {
                gav += ":" + c;
            }
            return gav;
        }

        public String getGA() {
            return String.format("%s:%s", g, a);
        }

        public static GAV parseFromGAV(String gav) {
            if (StringUtils.isEmpty(gav)) {
                return null;
            }
            String[] gavs = gav.split(":");
            if (gavs.length < 3) {
                return null;
            }
            GAV ret = new GAV();
            ret.setG(gavs[0]);
            ret.setA(gavs[1]);
            ret.setV(gavs[2]);
            if (gavs.length > 3) {
                ret.setC(gavs[3]);
            }
            return ret;
        }

        public static GAV parseFromURI(String mavenURI) {
            if (StringUtils.isEmpty(mavenURI)) {
                return null;
            }

            String gav = mavenUri2GAV(mavenURI);
            return parseFromGAV(gav);
        }

        public GAV clone() throws CloneNotSupportedException {
            return (GAV) super.clone();
        }

        public String toString() {

            StringBuffer sb = new StringBuffer();

            if (!StringUtils.isEmpty(g)) {
                sb.append("g:");
                sb.append(g);
                sb.append(",");
            }

            if (!StringUtils.isEmpty(a)) {
                sb.append("a:");
                sb.append(a);
                sb.append(",");
            }

            if (!StringUtils.isEmpty(v)) {
                sb.append("v:");
                sb.append(v);
                sb.append(",");
            }
            
            if (!StringUtils.isEmpty(c)) {
                sb.append("c:");
                sb.append(c);
                sb.append(",");
            }

            if (sb.lastIndexOf(",") > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }

            return sb.toString();

        }

        public int hashCode() {
            int hash = 7;

            if (!StringUtils.isEmpty(g)) {
                hash += hash * 31 + g.hashCode();
            }
            if (!StringUtils.isEmpty(a)) {
                hash += hash * 31 + a.hashCode();
            }
            if (!StringUtils.isEmpty(v)) {
                hash += hash * 31 + v.hashCode();
            }
            if (!StringUtils.isEmpty(c)) {
                hash += hash * 31 + c.hashCode();
            }
            return hash;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;

            }

            if (!(o instanceof GAV)) {
                return false;
            }

            GAV gav = (GAV) o;

            if (!StringUtils.equals(g, gav.getG())) {
                return false;
            }

            if (!StringUtils.equals(a, gav.getA())) {
                return false;
            }
            
            if (!StringUtils.equals(v, gav.getV())) {
                return false;
            }

            return StringUtils.equals(c, gav.getC());

        }

    }

    static class JarInfo implements Cloneable {

        private GAV gav;

        private String CVEInfo;

        private String CVSS;

        private String components;

        private String distributions;

        private boolean notUsed = false;

        private boolean loadedByTalend = true;

        /**
         * @return the gav
         */
        public GAV getGav() {
            return gav;
        }

        /**
         * @param gav the gav to set
         */
        public void setGav(GAV gav) {
            this.gav = gav;
        }

        /**
         * @return the cVEInfo
         */
        public String getCVEInfo() {
            return CVEInfo;
        }

        /**
         * @param cVEInfo the cVEInfo to set
         */
        public void setCVEInfo(String cVEInfo) {
            CVEInfo = cVEInfo;
        }

        /**
         * @return the components
         */
        public String getComponents() {
            return components;
        }

        /**
         * @param components the components to set
         */
        public void setComponents(String components) {
            this.components = components;
        }

        /**
         * @return the distributions
         */
        public String getDistributions() {
            return distributions;
        }

        /**
         * @param distributions the distributions to set
         */
        public void setDistributions(String distributions) {
            this.distributions = distributions;
        }

        /**
         * @return the notUsed
         */
        public boolean isNotUsed() {
            return notUsed;
        }

        /**
         * @param notUsed the notUsed to set
         */
        public void setNotUsed(boolean notUsed) {
            this.notUsed = notUsed;
        }

        /**
         * @return the usedByTalend
         */
        public boolean isLoadedByTalend() {
            return loadedByTalend;
        }

        /**
         * @param loadedByTalend the usedByTalend to set
         */
        public void setLoadedByTalend(boolean loadedByTalend) {
            this.loadedByTalend = loadedByTalend;
        }

        /**
         * @return the cVSS
         */
        public String getCVSS() {
            return CVSS;
        }

        /**
         * @param cVSS the cVSS to set
         */
        public void setCVSS(String cVSS) {
            CVSS = cVSS;
        }

        public JarInfo clone() throws CloneNotSupportedException {
            return (JarInfo) super.clone();
        }

        public String toString() {

            StringBuffer sb = new StringBuffer();
            sb.append("gav");
            sb.append(gav);
            sb.append(",");

            if (!StringUtils.isEmpty(CVEInfo)) {
                sb.append("CVEInfo:");
                sb.append(CVEInfo);
                sb.append(",");
            }

            if (!StringUtils.isEmpty(components)) {
                sb.append("components:");
                sb.append(components);
                sb.append(",");
            }

            if (!StringUtils.isEmpty(distributions)) {
                sb.append("distributions:");
                sb.append(distributions);
                sb.append(",");
            }

            sb.append("notUsed:");
            sb.append(notUsed);

            sb.append(",loadedByTalend:");
            sb.append(loadedByTalend);

            return sb.toString();

        }

        public int hashCode() {
            int hash = 7;

            hash += hash * 31 + gav.hashCode();

            if (!StringUtils.isEmpty(CVEInfo)) {
                hash += hash * 31 + CVEInfo.hashCode();
            }
            if (!StringUtils.isEmpty(components)) {
                hash += hash * 31 + components.hashCode();
            }
            if (!StringUtils.isEmpty(distributions)) {
                hash += hash * 31 + distributions.hashCode();
            }
            hash += hash * 31 + (notUsed ? 1 : 0);
            return hash;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;

            }

            if (!(o instanceof JarInfo)) {
                return false;
            }

            JarInfo ji = (JarInfo) o;

            if (!gav.equals(ji.getGav())) {
                return false;
            }

            if (!StringUtils.equals(CVEInfo, ji.getCVEInfo())) {
                return false;
            }

            if (!StringUtils.equals(components, ji.getComponents())) {
                return false;
            }

            if (!StringUtils.equals(distributions, ji.getDistributions())) {
                return false;
            }

            return notUsed == ji.isNotUsed();

        }

    }

    static class CVEDataItem {

        private CVEData cveData;

        private Set<String> itemComponents = new HashSet<String>();

        /**
         * @return the cveData
         */
        public CVEData getCveData() {
            return cveData;
        }

        /**
         * @param cveData the cveData to set
         */
        public void setCveData(CVEData cveData) {
            this.cveData = cveData;
        }

        public Set<String> getItemComponents() {
            return Collections.unmodifiableSet(this.itemComponents);
        }

        public void addItemComponent(String itemComp) {
            this.itemComponents.add(itemComp);
        }

        public String toString() {

            StringBuffer sb = new StringBuffer();

            sb.append("cveData: ");
            sb.append(cveData.toString());

            if (!this.itemComponents.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append("itemComponents:");
                sb.append(Arrays.toString(this.itemComponents.toArray(new String[0])));
            }

            return sb.toString();

        }

        public int hashCode() {
            int hash = 7;
            hash += hash * 31 + cveData.getID().hashCode();

            return hash;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;

            }

            if (!(o instanceof CVEDataItem)) {
                return false;
            }

            CVEDataItem di = (CVEDataItem) o;

            return StringUtils.equals(this.cveData.getID(), di.getCveData().getID());
        }

    }

    static class CVEData implements Cloneable {

        private JarInfo baseJar;

        private JarInfo newJar;

        private PatchVersion patchVersion;

        private String status;

        private boolean usedByTalend = true;

        private String comment;

        /**
         * @return the baseJar
         */
        public JarInfo getBaseJar() {
            return baseJar;
        }

        /**
         * @param baseJar the baseJar to set
         */
        public void setBaseJar(JarInfo baseJar) {
            this.baseJar = baseJar;
        }

        /**
         * @return the newJar
         */
        public JarInfo getNewJar() {
            return newJar;
        }

        /**
         * @param newJar the newJar to set
         */
        public void setNewJar(JarInfo newJar) {
            this.newJar = newJar;
        }

        /**
         * @return the patchVersion
         */
        public PatchVersion getPatchVersion() {
            return patchVersion;
        }

        /**
         * @param patchVersion the patchVersion to set
         */
        public void setPatchVersion(String patchVersion) {
            this.patchVersion = new PatchVersion(patchVersion);
        }

        /**
         * @return the status
         */
        public String getStatus() {
            return status;
        }

        /**
         * @param status the status to set
         */
        public void setStatus(String status) {
            this.status = status;
        }

        /**
         * @return the usedByTalend
         */
        public boolean isUsedByTalend() {
            return usedByTalend;
        }

        /**
         * @param usedByTalend the usedByTalend to set
         */
        public void setUsedByTalend(boolean usedByTalend) {
            this.usedByTalend = usedByTalend;
        }

        /**
         * @return the comment
         */
        public String getComment() {
            return comment;
        }

        /**
         * @param comment the comment to set
         */
        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getID() {

            StringBuffer sb = new StringBuffer();

            if (!StringUtils.isEmpty(patchVersion.getVersion())) {
                sb.append(patchVersion.getVersion());
                sb.append(",");
            }

            if (baseJar != null) {
                sb.append(baseJar.getGav().getGAVString());
                sb.append(",");
            }

            if (newJar != null) {
                sb.append(newJar.getGav().getGAVString());
                sb.append(",");
            }

            if (!StringUtils.isEmpty(status)) {
                sb.append(status);
                sb.append(",");
            }

            if (!StringUtils.isEmpty(comment)) {
                sb.append(comment);
                sb.append(",");
            }

            if (sb.lastIndexOf(",") > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }

            return sb.toString();

        }

        public CVEData clone() {
            try {
                return (CVEData) super.clone();
            } catch (CloneNotSupportedException e) {
                ExceptionHandler.process(e);
            }
            return null;
        }

        public String toString() {

            StringBuffer sb = new StringBuffer();

            if (!StringUtils.isEmpty(patchVersion.getVersion())) {
                sb.append("patchVersion:");
                sb.append(patchVersion.getVersion());
                sb.append(",");
            }

            if (baseJar != null) {
                sb.append("baseJar:");
                sb.append(baseJar.toString());
                sb.append(",");
            }

            if (newJar != null) {
                sb.append("newJar:");
                sb.append(newJar);
                sb.append(",");
            }

            if (!StringUtils.isEmpty(status)) {
                sb.append("status:");
                sb.append(status);
                sb.append(",");
            }

            if (!StringUtils.isEmpty(comment)) {
                sb.append("comment:");
                sb.append(comment);
                sb.append(",");
            }

            if (sb.lastIndexOf(",") > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }

            return sb.toString();

        }

        public int hashCode() {
            int hash = 7;

            if (patchVersion != null) {
                hash += hash * 31 + patchVersion.hashCode();
            }
            if (baseJar != null) {
                hash += hash * 31 + baseJar.hashCode();
            }
            if (newJar != null) {
                hash += hash * 31 + newJar.hashCode();
            }
            if (!StringUtils.isEmpty(status)) {
                hash += hash * 31 + status.hashCode();
            }

            if (!StringUtils.isEmpty(comment)) {
                hash += hash * 31 + comment.hashCode();
            }
            return hash;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;

            }

            if (!(o instanceof CVEData)) {
                return false;
            }

            CVEData data = (CVEData) o;

            if (patchVersion == null) {
                if (data.getPatchVersion() != null) {
                    return false;
                }
            } else if (!patchVersion.equals(data.getPatchVersion())) {
                return false;
            }

            if (this.baseJar == null) {
                if (data.getBaseJar() != null) {
                    return false;
                }
            } else if (!this.baseJar.equals(data.getBaseJar())) {
                return false;
            }

            if (this.newJar == null) {
                if (data.getNewJar() != null) {
                    return false;
                }
            } else if (!this.newJar.equals(data.getNewJar())) {
                return false;
            }

            if (!StringUtils.equals(status, data.getStatus())) {
                return false;
            }

            return StringUtils.equals(comment, data.getComment());

        }

    }

    static class ImpactedItem {

        private String id;

        private String name;

        private String projectName;

        private String type;

        private Set<CVEDataItem> cveDataItems = new HashSet<CVEDataItem>();

        /**
         * @return the id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return the projectName
         */
        public String getProjectName() {
            return projectName;
        }

        /**
         * @param projectName the projectName to set
         */
        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        /**
         * @return the type
         */
        public String getType() {
            return type;
        }

        /**
         * @param type the type to set
         */
        public void setType(String type) {
            this.type = type;
        }

        public Set<CVEDataItem> getCVEDataItems() {
            return Collections.unmodifiableSet(this.cveDataItems);
        }

        public void addCVEDataItem(CVEDataItem cdi) {
            if (!this.cveDataItems.contains(cdi)) {
                this.cveDataItems.add(cdi);
            }
        }

        public void addAllCVEDataItem(Collection<CVEDataItem> cdis) {
            if (cdis != null) {
                cdis.forEach(cdi -> {
                    addCVEDataItem(cdi);
                });
            }
        }

        public String toString() {

            StringBuffer sb = new StringBuffer();

            if (!StringUtils.isEmpty(id)) {
                sb.append("id:");
                sb.append(id);
                sb.append(",");
            }

            if (!StringUtils.isEmpty(name)) {
                sb.append("name:");
                sb.append(name);
                sb.append(",");
            }

            if (!StringUtils.isEmpty(projectName)) {
                sb.append("projectName:");
                sb.append(projectName);
                sb.append(",");
            }

            if (!this.cveDataItems.isEmpty()) {
                sb.append("cveDataItems:");
                sb.append(Arrays.toString(cveDataItems.toArray(new CVEDataItem[0])));
                sb.append(",");
            }

            return sb.toString();

        }

        public int hashCode() {
            int hash = 7;

            if (!StringUtils.isEmpty(id)) {
                hash += hash * 31 + id.hashCode();
            }
            if (!StringUtils.isEmpty(name)) {
                hash += hash * 31 + name.hashCode();
            }
            if (!StringUtils.isEmpty(projectName)) {
                hash += hash * 31 + projectName.hashCode();
            }

            if (!this.cveDataItems.isEmpty()) {
                hash += hash * 31 + cveDataItems.hashCode();
            }
            return hash;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;

            }

            if (!(o instanceof CVEData)) {
                return false;
            }

            ImpactedItem data = (ImpactedItem) o;

            if (!StringUtils.equals(id, data.getId())) {
                return false;
            }

            if (!StringUtils.equals(name, data.getName())) {
                return false;
            }

            if (!StringUtils.equals(projectName, data.getProjectName())) {
                return false;
            }

            return this.cveDataItems.equals(data.getCVEDataItems());

        }

    }

    static class PatchVersion implements Comparable<PatchVersion>, Cloneable {

        private String version;

        public PatchVersion(String ver) {
            this.version = ver;
        }

        public Date parseVersion() {
            String ver = version;
            if (ver != null) {
                if (ver.startsWith("R")) {
                    ver = ver.replace("R", "");
                }
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
                try {
                    return df.parse(ver);
                } catch (ParseException e) {
                    if (CommonsPlugin.isDebugMode()) {
                        // avoid too much log
                        ExceptionHandler.process(e);
                    }
                }
            }
            return null;
        }

        public String getVersion() {
            return this.version;
        }

        public String toString() {

            return this.version;

        }

        public PatchVersion clone() throws CloneNotSupportedException {
            return (PatchVersion) super.clone();
        }

        public int hashCode() {
            int hash = 7;

            if (!StringUtils.isEmpty(this.version)) {
                hash += hash * 31 + version.hashCode();
            }

            return hash;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;

            }

            if (!(o instanceof PatchVersion)) {
                return false;
            }

            PatchVersion pv = (PatchVersion) o;

            return StringUtils.equals(this.version, pv.getVersion());

        }

        @Override
        public int compareTo(PatchVersion o) {
            if (StringUtils.equals(version, o.getVersion())) {
                return 0;
            }
            if (StringUtils.isEmpty(version)) {
                if (StringUtils.isEmpty(o.getVersion())) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                if (StringUtils.isEmpty(o.getVersion())) {
                    return 1;
                } else {
                    Date d1 = this.parseVersion();
                    Date d2 = o.parseVersion();
                    if (d1 == null) {
                        if (d2 == null) {
                            return 0;
                        } else {
                            return -1;
                        }
                    } else {
                        if (d2 == null) {
                            return 1;
                        } else {
                            return d1.compareTo(d2);
                        }
                    }
                }
            }
        }

    }

}
