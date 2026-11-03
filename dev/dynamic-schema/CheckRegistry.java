import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.adaptor.EclipseStarter;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/** Checks the real Eclipse type registry in an isolated configuration and workspace. */
public class CheckRegistry {
    public static void main(String[] args) throws Exception {
        Path installation = Path.of(args[0]).toAbsolutePath();
        Path output = Path.of(args[1]).toAbsolutePath();
        Map<String, String> properties = new HashMap<String, String>();
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
            Bundle core = bundle(context, "org.talend.core.runtime");
            Class<?> manager = core.loadClass("org.talend.core.model.metadata.types.JavaTypesManager");
            Object dynamic = manager.getMethod("getJavaTypeFromId", String.class).invoke(null, "id_Dynamic");
            Class<?> nullable = (Class<?>) dynamic.getClass().getMethod("getNullableClass").invoke(dynamic);
            require("routines.system.Dynamic".equals(nullable.getName()), "Dynamic must resolve to the runtime container");
            require(dynamic == manager.getField("DYNAMIC").get(null), "The Dynamic constant must match the registered type");
            Object object = manager.getMethod("getJavaTypeFromId", String.class).invoke(null, "id_Object");
            require(object != dynamic, "Object and Dynamic must remain distinct");
            require("Dynamic".equals(manager.getMethod("getTypeToGenerate", String.class, boolean.class)
                    .invoke(null, "id_Dynamic", true)), "Generated type must retain its simple name");
            Class<?> contexts = core.loadClass("org.talend.core.model.metadata.types.ContextParameterJavaTypeManager");
            Object[] contextTypes = (Object[]) contexts.getMethod("getJavaTypes").invoke(null);
            for (Object type : contextTypes) {
                require(!"id_Dynamic".equals(type.getClass().getMethod("getId").invoke(type)),
                        "Dynamic must not appear in context parameters");
            }
            Bundle libraries = bundle(context, "org.talend.librariesmanager");
            Class<?> provider = libraries.loadClass("org.talend.librariesmanager.model.service.TosJavaRoutinesProvider");
            List<?> routines = (List<?>) provider.getMethod("getTalendRoutines")
                    .invoke(provider.getConstructor().newInstance());
            for (String name : new String[] { "Dynamic.java", "DynamicMetadata.java", "DynamicUtils.java" }) {
                require(routines.stream().anyMatch(url -> url.toString().endsWith("/" + name)),
                        "Missing exported routine source: " + name);
            }
            System.out.println("Eclipse registry passed: Dynamic resolved, Object unchanged, context hidden, three routine sources exportable.");
        } finally {
            EclipseStarter.shutdown();
        }
    }

    private static Bundle bundle(BundleContext context, String name) {
        for (Bundle bundle : context.getBundles()) {
            if (name.equals(bundle.getSymbolicName())) { return bundle; }
        }
        throw new AssertionError("Missing bundle " + name);
    }

    private static void require(boolean condition, String message) {
        if (!condition) { throw new AssertionError(message); }
    }
}
