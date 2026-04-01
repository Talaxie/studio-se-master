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
package org.talend.rcp.util;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.talend.rcp.util.TalaxieUtil;

public class ServerRest {

  private static final Logger LOGGER = Logger.getLogger(ServerRest.class);

  public static void startServer(String port) throws IOException {
    HttpServer server = HttpServer.create(new InetSocketAddress(Integer.parseInt(port)), 0);
    server.createContext("/hello", new HelloHandler());
    server.setExecutor(null);
    server.start();
    System.out.println("Server started. Listening on port " + port);
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
        String response = "Talaxie services #2 - ";
        if (queryParams.get("action") != null) {
          if (queryParams.get("action").equals("test")) {
            response += " test !";
          } else if (queryParams.get("action").equals("import")) {
            try {
              TalaxieUtil.importZipFile("C:/Temp/ETL01_000_JobEtl_Master.zip", "ETL01_000_JobEtl_Master");
            } catch (Exception e) {
              e.printStackTrace();
              if (LOGGER.isInfoEnabled()) {
                  LOGGER.info("Talaxie importZipFile");
              }
              response = " Error import !";
            }
            response += " import !";
          } else {
            response += " unknow action !";
          }
        } else {
          response += " no action !";
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
