package org.talaxie.restserver;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.talend.repository.items.importexport.ui.wizard.server.ServerUtil;

public class ImportServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String body = new String(req.getInputStream().readAllBytes(), StandardCharsets.UTF_8);

        System.out.println("[REST] Import triggered with payload: " + body);

        try {
//            String projectLabel = queryParams.get("project");
//            String jobName = queryParams.get("jobName");
            
            String projectLabel = "DEMOETL";
            String jobName = "JOB04_000_JobEtl_Master";
            
            ServerUtil.jobImport(projectLabel, jobName);
          } catch (Exception e) {
            e.printStackTrace();
            
            }

        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write("Import lancé");
    }
}
