// ============================================================================
//
// Copyright (C) 2022-2024 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talaxie.commandline;

import java.util.Map;

import org.talend.repository.items.importexport.ui.wizard.server.ServerUtil;

public class TalaxieCommandLine {

    public static int launcher() {

        Map<String, String> args = ArgsHelper.getParsedArgs();

        String action = args.get("action");
        String project = args.get("project");

        // --disableLoginDialog -project=DEMOETL -action=import -jobname=JOB04_000_JobEtl_Master
        if ("import".equalsIgnoreCase(action)) {
            String jobname = args.get("jobname");
            if (jobname == null) {
                System.err.println("jobname is mandatory -> eg: jobname=\"JOB04_000_JobEtl_Master\"");
                return -1;
            }

            if (project == null) {
                System.err.println("project is mandatory -> eg: project=\"DEMOETL\"");
                return -1;
            }

            System.out.println("IMPORT → project=" + project + ", jobname=" + jobname);
            if (ServerUtil.jobImport(project, jobname)) {
                System.out.println("jobImport OK");
                return 1;
            } else {
                System.err.println("jobImport KO");
                return -1;
            }
        }

        // --disableLoginDialog -project=DEMOETL -action=export -master=JOB04_000_JobEtl_Master
        // -fileLocation=/Applications/Eclipse.app/Contents/MacOS/Job4.zip
        if ("export".equalsIgnoreCase(action)) {
            String jobname = args.get("jobname");

            if (jobname == null) {
                System.err.println("jobname is mandatory -> eg: jobname=\"JOB04_000_JobEtl_Master\"");
                return -1;
            }

            if (project == null) {
                System.err.println("project is mandatory -> eg: project=\"DEMOETL\"");
                return -1;
            }

            String fileLocation = args.get("fileLocation");

            if (fileLocation == null) {
                System.err.println(
                        "fileLocation is mandatory -> eg: fileLocation=\"/Applications/Eclipse.app/Contents/MacOS/Job4.zip\"");
                return -1;
            }

            System.out.println("EXPORT → project=" + project + ", jobname=" + jobname + ", file=" + fileLocation);
            String version = "version";
            String nexusRepo = "nexusRepo";
            if (ServerUtil.jobExport(fileLocation, project, jobname, version, nexusRepo)) {
                System.out.println("jobExport OK");
                return 1;
            } else {
                System.err.println("jobExport KO");
                return -1;
            }

        }

        return 0;
    }

}
