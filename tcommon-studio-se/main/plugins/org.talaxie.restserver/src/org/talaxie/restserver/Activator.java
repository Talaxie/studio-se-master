package org.talaxie.restserver;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    private static BundleContext context;
    private RestServer server;

    static BundleContext getContext() {
        return context;
    }

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        Activator.context = bundleContext;

        server = new RestServer(8080); // Choix du port
        server.start();

        System.out.println("[REST] Serveur REST démarré sur http://localhost:8080");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        if (server != null) {
            server.stop();
            System.out.println("[REST] Serveur REST arrêté");
        }
        Activator.context = null;
    }

}
