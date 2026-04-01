package org.talaxie.restserver;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class RestServer {

    private final Server server;

    public RestServer(int port) {
        this.server = new Server(port);
    }

    public void start() throws Exception {
        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");

        // Expose des endpoints REST
        context.addServlet(BuildServlet.class, "/build");
        context.addServlet(ImportServlet.class, "/import");

        server.setHandler(context);
        server.start();
    }

    public void stop() throws Exception {
        server.stop();
    }
}
