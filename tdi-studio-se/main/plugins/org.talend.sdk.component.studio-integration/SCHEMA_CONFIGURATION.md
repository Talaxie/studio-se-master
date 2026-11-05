# Schema configuration generation

TaCoKit components use `jet_stub/generic/configuration.javajet` to describe their
schemas in a configuration map. Wide schemas can otherwise make the generated
subjob method exceed the JVM limit of 65,535 bytes of bytecode per method.

The template generates a local `SchemaSettingHelper_<component>_<schema>` class
for each emitted schema. Its `set` method calls `set_0`, `set_50`, and subsequent
methods in order, with at most 50 columns in each method. All properties of a
column stay together and retain their original global column indices.

The helper receives the existing configuration map and runs at the original
initialization point. Property values, assignment order, dynamic-schema emission
rules and registry metadata are preserved. Empty schemas produce no helper.
Helper names distinguish multiple schemas and components within the same job.

This applies to schemas emitted by the common TaCoKit configuration template.
It does not change the generators of legacy components or remove JVM limits on
other large sections of a job, such as mapping expressions.

## Regression tests

From the repository root, run:

```sh
mvn -B -ntp -f tdi-studio-se/main/plugins/org.talend.sdk.component.studio-integration/pom.xml -Dtest=SchemaConfigurationTemplateTest test
```

The tests evaluate the actual schema scriptlets, compile the resulting Java with
Java 17 compatibility and execute it to check configuration values. They cover
0, 1, 49, 50, 51, 99, 100, 101, 404 and 1,000 columns, multiple schemas and
components, dynamic schemas, primitive schema lists, escaping and absent numeric
metadata. They require a JDK because they invoke the Java compiler.

For an end-to-end check, regenerate and export a wide-schema job with the built
Studio or CLI. Check that the exported job JAR includes the helper classes and
that the generated configuration entries are unchanged. Existing generated jobs
must be regenerated to benefit from the change; merely recompiling old Java does
not introduce the helpers.

The template is packaged in the Studio integration plugin. At startup it is
extracted into `org.talend.designer.codegen/tacokit/jet_stub/generic`. Verify the
packaged template in distributions, rather than editing that extracted copy as a
permanent fix.
