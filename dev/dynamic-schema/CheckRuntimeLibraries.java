import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.adaptor.EclipseStarter;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/** Runs the library collector regression in the built product's real OSGi class space. */
public class CheckRuntimeLibraries {
    public static void main(String[] args) throws Exception {
        Path installation = Path.of(args[0]).toAbsolutePath();
        Path output = Path.of(args[1]).toAbsolutePath();
        Map<String, String> properties = new HashMap<>();
        properties.put("osgi.install.area", installation.toUri().toString());
        properties.put("osgi.configuration.area", output.resolve("configuration").toUri().toString());
        properties.put("osgi.instance.area", output.resolve("workspace").toUri().toString());
        properties.put("osgi.bundles", "org.eclipse.equinox.simpleconfigurator@1:start");
        properties.put("osgi.framework.extensions", "org.talend.osgi.lib.loader,org.eclipse.osgi.compatibility.state");
        properties.put("org.eclipse.equinox.simpleconfigurator.configUrl", installation.resolve(
                "configuration/org.eclipse.equinox.simpleconfigurator/bundles.info").toUri().toString());
        EclipseStarter.setInitialProperties(properties);
        try {
            BundleContext context = EclipseStarter.startup(new String[] { "-clean", "-consoleLog" }, null);
            Bundle libraries = null;
            for (Bundle bundle : context.getBundles()) {
                if ("org.talend.librariesmanager".equals(bundle.getSymbolicName())) { libraries = bundle; }
            }
            if (libraries == null) { throw new AssertionError("Missing libraries manager bundle"); }
            Class<?> provider = libraries.loadClass("org.talend.librariesmanager.model.ModulesNeededProvider");
            try (URLClassLoader tests = new URLClassLoader(new java.net.URL[] {
                    Path.of(args[2]).toUri().toURL(), Path.of(args[3]).toUri().toURL(),
                    Path.of(args[4]).toUri().toURL() }, provider.getClassLoader())) {
                Class<?> test = tests.loadClass("org.talend.librariesmanager.model.ProcessRuntimeLibrariesTest");
                Class<?> runner = tests.loadClass("org.junit.runner.JUnitCore");
                Object result = runner.getMethod("runClasses", Class[].class).invoke(null, (Object) new Class<?>[] { test });
                int count = (Integer) result.getClass().getMethod("getRunCount").invoke(result);
                System.out.println("Runtime library regressions: " + count + " tests; "
                        + result.getClass().getMethod("getFailures").invoke(result));
                if (!(Boolean) result.getClass().getMethod("wasSuccessful").invoke(result)) {
                    for (Object failure : (Iterable<?>) result.getClass().getMethod("getFailures").invoke(result)) {
                        System.err.println(failure.getClass().getMethod("getTrace").invoke(failure));
                    }
                    throw new AssertionError("Runtime library regression failed");
                }
            }
        } finally {
            EclipseStarter.shutdown();
        }
    }
}
