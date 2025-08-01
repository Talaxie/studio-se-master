package org.talaxie.restserver;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.talend.repository.items.importexport.ui.wizard.server.ServerUtil;

public class BuildServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String body = new String(req.getInputStream().readAllBytes(), StandardCharsets.UTF_8);

        System.out.println("[REST] Build triggered with payload: " + body);
        
//        curl -X POST http://localhost:8080/build \
//            -H "Content-Type: application/json" \
//            -d '{"project":"MyProject","job":"Job1"}'

        
            try {
//                String project = queryParams.get("project");
//                String master = queryParams.get("master");
//                String version = queryParams.get("version");
//                String nexusRepo = queryParams.get("nexusRepo");
//                String fileLocation = queryParams.get("fileLocation");
                
//                http://127.0.0.1/:8081/hello?action=export&project=DEMOETL&master=JOB04_000_JobEtl_Master&fileLocation=C:\Talend\TOS_DI-talaxie\JOB04_000_JobEtl_Master.zip
                
                String project = "DEMOETL";
                String master = "JOB04_000_JobEtl_Master";
                String version = "version";
                String nexusRepo = "nexusRepo";
                String fileLocation = "/Applications/Eclipse.app/Contents/MacOS/Job4.zip";
                
                ServerUtil.jobExport(fileLocation, project, master, version, nexusRepo);
              } catch (Exception e) {
                e.printStackTrace();
//                if (LOGGER.isInfoEnabled()) {
//                  LOGGER.info("Error - ServerRest export");
//                  LOGGER.info(e);
                }

        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write("Build lancé");
    }
}
