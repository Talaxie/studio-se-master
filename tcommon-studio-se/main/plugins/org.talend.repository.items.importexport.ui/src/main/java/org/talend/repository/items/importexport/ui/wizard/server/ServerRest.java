// ============================================================================
//
// Copyright (C) 2006-2024 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.items.importexport.ui.wizard.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.talend.repository.items.importexport.ui.wizard.server.ServerUtil;

public class ServerRest {

	private static final Logger LOGGER = Logger.getLogger(ServerRest.class);
    
  private HttpServer server;

	public void startServer(String port) throws IOException {
		server = HttpServer.create(new InetSocketAddress(Integer.parseInt(port)), 0);
		server.createContext("/hello", new HelloHandler());
		server.setExecutor(null);
		server.start();
	}

	public void stopServer() {
    server.stop(1);
	}

  static class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      // Handling a GET request
      if ("GET".equals(exchange.getRequestMethod())) {
        String query = exchange.getRequestURI().getQuery();
        if (query == null) {
          query = "";
        }
        HashMap<String, String> queryParams = new HashMap<String, String>();
        if (!query.equals("")) {
          String[] queryItems = query.split("&");
          for (String queryItem : queryItems) {
            String[] queryItemSplit = queryItem.split("=");
            String key = queryItemSplit[0];
            String value = queryItemSplit[1];
            queryParams.put(key, value);
          }
        }
        String response = "Talaxie services #1 - ";
        if (queryParams.get("action") != null) {
          if (queryParams.get("action").equals("test")) {
            response += " test !";
          } else if (queryParams.get("action").equals("import")) {
            try {
              String projectLabel = queryParams.get("project");
              String jobName = queryParams.get("jobName");
              ServerUtil.jobImport(projectLabel, jobName);
            } catch (Exception e) {
              e.printStackTrace();
              if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Error - ServerRest importZipFile");
                LOGGER.info(e);
              }
              response = "Error import !";
            }
            response += "import ok!";
          } else if (queryParams.get("action").equals("export")) {
            try {
              String project = queryParams.get("project");
              String master = queryParams.get("master");
              String version = queryParams.get("version");
              String nexusRepo = queryParams.get("nexusRepo");
              String fileLocation = queryParams.get("fileLocation");
              ServerUtil.jobExport(fileLocation, project, master, version, nexusRepo);
            } catch (Exception e) {
              e.printStackTrace();
              if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Error - ServerRest export");
                LOGGER.info(e);
              }
              response = "Error export!";
            }
            response += "export ok!";
          } else if (queryParams.get("action").equals("scriptStart")) {
            try {
              String scriptLocation = queryParams.get("scriptLocation");
              String arg = queryParams.get("arg");
              ServerUtil.scriptStart(scriptLocation, arg);
            } catch (Exception e) {
              e.printStackTrace();
              if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Error - ServerRest scriptStart");
                LOGGER.info(e);
              }
              response = "Error scriptStart!";
            }
            response += "scriptStart ok!";
          } else {
            response += "unknow action!";
          }
        } else {
          response += "no action!";
        }
        exchange.sendResponseHeaders(200, response.length());
        try (OutputStream os = exchange.getResponseBody()) {
          os.write(response.getBytes());
        }
      } else {
        // Method not allowed
        exchange.sendResponseHeaders(405, -1);
      }
    }
  }

}
