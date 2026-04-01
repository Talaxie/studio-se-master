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
package org.talend.rcp.util;

import java.util.Scanner;
import org.talend.repository.ui.wizards.exportjob.JobScriptsExportWizardPage;
import org.talend.rcp.util.ServerRest;
// import org.talend.rcp.util.TalaxieUtil;
import org.talend.repository.items.importexport.ui.wizard.server.ServerUtil;

public class CommandLine {

  public static boolean parseArgs(String[] args) {
    if (args == null) {
      return false;
    }

    // Traiter les arguments
    try {
      System.out.println("Start Talaxie...");
      String argString = "";
      for (String arg : args) {
        if (
            arg.length() > 4 &&
            arg.contains("--") &&
            arg.contains("=")
        ) {
          String[] splitFromEqual = arg.split("=");
          String key = splitFromEqual[0].substring(2);
          String value = splitFromEqual[1];
          argString += key + "/" + value + " [" + arg + "] || ";
          if (key.equals("offline")) {
            System.out.print("Enter a string 2 : ");
            Scanner scanner2 = new Scanner(System.in);
            String inputString2 = scanner2.nextLine();
            System.out.println("Offline input zone : \n" + inputString2);
            // throw new Exception("Exception talaxie JC 200 : " + argString);
            return true;
          } else if (key.equals("api")) {
            ServerRest.startServer(value);
            System.out.print("End REST API ? ");
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();
            return true;
          } else if (key.equals("apiV2")) {
            ServerRest.startServer(value);
            return false;
          } else if (key.equals("importZipFile")) {
            ServerUtil.jobImport("C:/Temp/ETL01_000_JobEtl_Master.zip", "ETL01_000_JobEtl_Master");
            return true;
          } else if (key.equals("exportZipFile")) {
            // ServerUtil.jobExport("/chemin/vers/votre/fichier.zip");
            return true;
          } else if (key.equals("getProjects")) {
            // ServerUtil.getProjects();
            System.out.print("wait : ");
            Scanner scanner2 = new Scanner(System.in);
            String inputString2 = scanner2.nextLine();
            System.out.println("Offline input zone : \n" + inputString2);
            return true;
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return false;
  }
}
