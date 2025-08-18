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

import org.apache.log4j.Logger;
import org.talend.repository.items.importexport.ui.wizard.server.ServerUtil;

public class TalaxieCommandLine {

    private static final Logger LOGGER = Logger.getLogger(TalaxieCommandLine.class);

    public static int launcher() {

        Map<String, String> args = ArgsHelper.getParsedArgs();

        String action = args.get("action");
        String project = args.get("project");

        // --disableLoginDialog -project=DEMOETL -action=import -jobname=JOB04_000_JobEtl_Master
        if ("import".equalsIgnoreCase(action)) {
            String jobname = args.get("jobname");
            if (jobname == null) {
                
                String message = "jobname is mandatory -> eg: jobname=\"JOB04_000_JobEtl_Master\"";
                LOGGER.info(message);
                System.err.println(message);
                
                return -1;
            }

            if (project == null) {
                
                String message = "project is mandatory -> eg: project DEMOETL";
                LOGGER.info(message);
                System.err.println(message);
                return -1;
            }

            System.out.println("IMPORT → project=" + project + ", jobname=" + jobname);
            if (ServerUtil.jobImport(project, jobname)) {
                String message = "jobImport OK";
                LOGGER.info(message);
                System.out.println(message);
            } else {
                String message = "jobImport KO";
                LOGGER.info(message);
                System.err.println(message);
                return -1;
            }
        }

        // --disableLoginDialog -project=DEMOETL -action=export -master=JOB04_000_JobEtl_Master
        // -fileLocation=/Applications/Eclipse.app/Contents/MacOS/Job4.zip
        if ("export".equalsIgnoreCase(action)) {
            String jobname = args.get("jobname");

            if (jobname == null) {
                String message = "jobname is mandatory -> eg: jobname=\"JOB04_000_JobEtl_Master\"";
                LOGGER.info(message);
                System.err.println(message);
                return -1;
            }

            if (project == null) {
                String message = "project is mandatory -> eg: project=\"DEMOETL\"";
                LOGGER.info(message);
                System.err.println(message);
                return -1;
            }

            String fileLocation = args.get("fileLocation");

            if (fileLocation == null) {
                String message = "fileLocation is mandatory -> eg: fileLocation=\"/Applications/Eclipse.app/Contents/MacOS/Job4.zip\"";
                LOGGER.info(message);
                System.err.println(message);

                return -1;
            }

            System.out.println("EXPORT → project=" + project + ", jobname=" + jobname + ", file=" + fileLocation);
            String version = "version";
            String nexusRepo = "nexusRepo";
            if (ServerUtil.jobExport(fileLocation, project, jobname, version, nexusRepo)) {
                String message = "jobExport OK";
                LOGGER.info(message);
                System.out.println(message);
                return 0;
            } else {
                String message = "jobExport KO";
                LOGGER.info(message);
                System.err.println(message);
                return -1;
            }

        }

        return 0;
    }

}
