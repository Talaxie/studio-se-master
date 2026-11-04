import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.core.runtime.adaptor.EclipseStarter;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/** Run actual schema editor label/editability regressions in an isolated OSGi configuration. */
public class CheckSchemaEditor {
    public static void main(String[] args) throws Exception {
        Path installation = Path.of(args[0]).toAbsolutePath();
        Path output = Path.of(args[1]).toAbsolutePath();
        Files.createDirectories(output);
        Path bundles = output.resolve("bundles.info");
        String info = Files.readString(installation.resolve("configuration/org.eclipse.equinox.simpleconfigurator/bundles.info"));
        StringBuilder replacement = new StringBuilder();
        for (String line : info.split("\\R")) {
            if (line.startsWith("org.talend.core.ui,")) {
                String[] fields = line.split(",");
                fields[2] = Path.of(args[5]).toAbsolutePath().toUri().toString();
                line = String.join(",", fields);
            } else if (!line.isEmpty() && !line.startsWith("#")) {
                String[] fields = line.split(",");
                if (fields[2].startsWith("plugins/")) fields[2] = installation.resolve(fields[2]).toUri().toString();
                line = String.join(",", fields);
            }
            replacement.append(line).append('\n');
        }
        Files.writeString(bundles, replacement);
        Map<String, String> properties = new HashMap<>();
        properties.put("osgi.install.area", installation.toUri().toString());
        properties.put("osgi.configuration.area", output.resolve("configuration").toUri().toString());
        properties.put("osgi.instance.area", output.resolve("workspace").toUri().toString());
        properties.put("osgi.bundles", "org.eclipse.equinox.simpleconfigurator@1:start");
        properties.put("osgi.framework.extensions", "org.talend.osgi.lib.loader,org.eclipse.osgi.compatibility.state");
        properties.put("org.eclipse.equinox.simpleconfigurator.configUrl", bundles.toUri().toString());
        EclipseStarter.setInitialProperties(properties);
        try {
            BundleContext context = EclipseStarter.startup(new String[] { "-clean", "-consoleLog" }, null);
            Bundle ui = null;
            for (Bundle bundle : context.getBundles()) if ("org.talend.core.ui".equals(bundle.getSymbolicName())) ui = bundle;
            if (ui == null) throw new AssertionError("Missing core UI bundle");
            Class<?> provider = ui.loadClass("org.talend.core.ui.metadata.dialog.CustomTableManager");
            try (URLClassLoader tests = new URLClassLoader(new java.net.URL[] {
                    Path.of(args[2]).toUri().toURL(), Path.of(args[3]).toUri().toURL(), Path.of(args[4]).toUri().toURL() }, provider.getClassLoader())) {
                Class<?> test = tests.loadClass("org.talend.core.ui.metadata.dialog.CustomTableManagerDynamicTest");
                Class<?> runner = tests.loadClass("org.junit.runner.JUnitCore");
                Object result = runner.getMethod("runClasses", Class[].class).invoke(null, (Object) new Class<?>[] { test });
                System.out.println("Schema editor regressions: " + result.getClass().getMethod("getRunCount").invoke(result)
                        + " tests; " + result.getClass().getMethod("getFailures").invoke(result));
                if (!(Boolean) result.getClass().getMethod("wasSuccessful").invoke(result)) {
                    for (Object failure : (Iterable<?>) result.getClass().getMethod("getFailures").invoke(result))
                        System.err.println(failure.getClass().getMethod("getTrace").invoke(failure));
                    throw new AssertionError("Schema editor regression failed");
                }
            }
        } finally {
            EclipseStarter.shutdown();
        }
    }
}
