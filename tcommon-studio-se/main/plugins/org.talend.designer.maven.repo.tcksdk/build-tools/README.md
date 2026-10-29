# Consumer POM for component-runtime-di

The upstream `1.62.1` JAR embeds a source-build POM with the internal
`org.talend.studio:routines-stubs:741` system dependency and a source-relative
`systemPath`. Maven rejects that POM when it loads the engine as a job dependency.

The Studio build still resolves the upstream binary at `1.62.1`. During this
plugin's `generate-sources` phase, `ConsumerRuntime` creates the separate local
revision `1.62.1-talaxie-1`:

1. Read the upstream POM from the JAR and remove exactly
   `org.talend.studio:routines-stubs`; require exactly one match.
2. Build the effective Maven model using the upstream version and already-resolved
   parent/BOM POMs in the build's local repository. This preserves sibling module
   versions, scopes, optional flags, exclusions and dependency management.
3. Write a standalone consumer POM without the source build configuration. Give
   only this artifact the corrective version; no other runtime is version-bumped.
4. Replace the embedded `pom.xml` and `pom.properties`. All other JAR entry
   contents, including every class, remain unchanged. Reject signed JARs and
   bundled routine substitution classes rather than silently redistributing them.
5. Ship this POM and JAR in `repository/maven_repository.zip`, replacing the
   upstream DI entry. Install the same pair locally with `install-file` and an
   explicit `pomFile`. Nothing is deployed remotely by these executions.

The source-build POM and its compilation stubs are not changed. This repository
contains the upstream dependency, not the engine source project; rebuilding that
engine from sources is therefore outside these targeted checks.

The corrected coordinates are used by the generated `tcompv1` POM and the Studio
integration's `ComponentModel` through `GAV.getComponentRuntimeDiVersion()`.
`component-runtime.version` continues to select upstream `1.62.1` for all other
runtime artifacts.

## Build and regression checks

From the aggregate repository root, with the normal Studio target platform and
dependencies available:

```sh
mvn -B -ntp -f tcommon-studio-se/main/plugins/org.talend.designer.maven.repo.tcksdk/pom.xml generate-sources
mvn -B -ntp -f tdi-studio-se/main/plugins/org.talend.sdk.component.studio-integration/pom.xml -DskipTests package
```

The first command also runs `ConsumerRuntimeTest`. Its synthetic parent/child
fixture checks inherited sibling versions, exact dependency filtering,
preservation of an unrelated system dependency, identical bytecode, both metadata
files, upstream preservation, and rejection of signatures/substitution classes.

Check both the external consumer POM and the POM extracted from the JAR when
testing a new upstream version. Do not validate against a cache where `1.62.1`
has already been manually repaired. To check transitive dependencies, use a small
consumer POM with **no exclusions**: generated job POMs exclude all transitives.
To check reinstallation, install the corrected JAR without `pomFile`, then verify
that Maven recovers the corrected embedded POM and dependencies.

## Job validation and rollout

For an existing converted project, regenerate the job POMs with the corrected
Studio. Old generated POMs explicitly reference `1.62.1` and cannot automatically
switch to the corrective revision. Test on a copy with a separate Maven repository
and include its routines/beans in the reactor. Compiling or packaging a job must
not execute its main class or connect to the business database.

Validation used an isolated copy of a converted job and a separate Maven
repository. Its generated POM, assembly descriptor and launcher templates were
aligned on the corrective DI version, simulating regeneration without modifying
the source project. Targeted SDK repository generation and Studio integration
packaging passed. The old POM reproduced the `systemPath` error under Maven debug
logging; the corrected dependency tree, Java compilation and ZIP packaging passed.
The ZIP contained the corrective engine and matching launcher classpaths, without
routine substitution classes. A consumer without exclusions resolved runtime
transitives after a JAR-only reinstallation. No job execution or dynamic-schema
execution was tested. Export through a rebuilt Studio UI remains to be checked.

Initial full product generation produced five products for five platforms. All
25 assembled distributions were checked for the corrective runtime and consumer
POM. That validation also exposed test infrastructure failures, which are handled
in a separate change rather than included in this runtime fix.

After updating this branch to the current `develop` baseline, SDK repository
generation and its regression checks, Studio integration verification, JAR-only
reinstallation, and runtime transitive dependency resolution all passed again.
The engine source build, job execution, dynamic-schema execution and Studio UI
export remain outside the completed validation.

## Rollback

Keep the previous Studio distribution and the original generated job artifacts.
The upstream `1.62.1` coordinates are not overwritten; both versions can coexist
in a Maven repository. For rollback, restore the previous distribution and
regenerate affected jobs with it (or restore their previous exports). Merely
removing the corrective artifact leaves generated jobs pointing to a missing
version. No cache-wide deletion or replacement of system-scope dependencies is
part of this change.
