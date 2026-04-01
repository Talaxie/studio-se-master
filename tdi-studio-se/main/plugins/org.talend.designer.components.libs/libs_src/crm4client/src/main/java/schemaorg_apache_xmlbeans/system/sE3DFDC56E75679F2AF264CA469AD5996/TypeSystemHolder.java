package schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996;

import org.apache.xmlbeans.SchemaTypeSystem;

public class TypeSystemHolder {
    public static final SchemaTypeSystem typeSystem = loadTypeSystem();

    private TypeSystemHolder() {
    }

    private static final SchemaTypeSystem loadTypeSystem() {
        try {
            return (SchemaTypeSystem)Class.forName("org.apache.xmlbeans.impl.schema.SchemaTypeSystemImpl", true, TypeSystemHolder.class.getClassLoader()).getConstructor(Class.class).newInstance(TypeSystemHolder.class);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot load org.apache.xmlbeans.impl.SchemaTypeSystemImpl: make sure xbean.jar is on the classpath.", e);
        } catch (Exception e) {
            throw new RuntimeException("Could not instantiate SchemaTypeSystemImpl (" + e + "): is the version of xbean.jar correct?", e);
        }
    }
}
