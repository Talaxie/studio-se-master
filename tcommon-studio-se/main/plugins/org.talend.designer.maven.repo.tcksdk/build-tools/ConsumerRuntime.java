/* Copyright (c) 2026 Talaxie. Licensed under the Apache License, Version 2.0. */
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.Parent;
import org.apache.maven.model.Repository;
import org.apache.maven.model.building.DefaultModelBuilderFactory;
import org.apache.maven.model.building.DefaultModelBuildingRequest;
import org.apache.maven.model.building.FileModelSource;
import org.apache.maven.model.building.ModelSource;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.model.io.xpp3.MavenXpp3Writer;
import org.apache.maven.model.resolution.ModelResolver;
import org.apache.maven.model.resolution.UnresolvableModelException;

/** Build a consumer artifact; never modify the upstream build POM or classes. */
public final class ConsumerRuntime {
    private static final String GROUP = "org.talend.sdk.component";
    private static final String ARTIFACT = "component-runtime-di";
    private static final String METADATA = "META-INF/maven/" + GROUP + "/" + ARTIFACT + "/";

    public static void main(String[] args) throws Exception {
        if (args.length != 5) {
            throw new IllegalArgumentException("Expected upstream.jar output-repository local-repository upstream-version consumer-version");
        }
        Path input = Path.of(args[0]);
        String upstreamVersion = args[3];
        String consumerVersion = args[4];
        if (upstreamVersion.equals(consumerVersion)) {
            throw new IllegalArgumentException("Consumer revision must differ from upstream");
        }
        Path output = Path.of(args[1], GROUP.replace('.', '/'), ARTIFACT, consumerVersion);
        Files.createDirectories(output);
        try (ZipFile jar = new ZipFile(input.toFile())) {
            Model raw;
            try (var stream = jar.getInputStream(jar.getEntry(METADATA + "pom.xml"))) {
                raw = new MavenXpp3Reader().read(new InputStreamReader(stream, StandardCharsets.UTF_8));
            }
            String version = raw.getVersion() == null ? raw.getParent().getVersion() : raw.getVersion();
            String group = raw.getGroupId() == null ? raw.getParent().getGroupId() : raw.getGroupId();
            if (!GROUP.equals(group) || !ARTIFACT.equals(raw.getArtifactId()) || !upstreamVersion.equals(version)) {
                throw new IllegalArgumentException("Unexpected upstream artifact");
            }
            long removed = raw.getDependencies().stream().filter(ConsumerRuntime::isStub).count();
            if (removed != 1) {
                throw new IllegalArgumentException("Expected exactly one routines-stubs dependency, found " + removed);
            }
            raw.getDependencies().removeIf(ConsumerRuntime::isStub);
            // Resolve inheritance at the UPSTREAM version. Changing project.version first
            // would also change sibling runtime dependencies to an unpublished revision.
            if (raw.getParent() != null) {
                raw.getParent().setRelativePath("");
            }
            var request = new DefaultModelBuildingRequest();
            request.setRawModel(raw);
            request.setSystemProperties(System.getProperties());
            request.setProcessPlugins(false);
            request.setModelResolver(new CachedModels(Path.of(args[2])));
            Model effective = new DefaultModelBuilderFactory().newInstance().build(request).getEffectiveModel();
            // A consumer POM needs dependency metadata, not the engine's source build.
            Model consumer = new Model();
            consumer.setModelVersion("4.0.0");
            consumer.setGroupId(GROUP);
            consumer.setArtifactId(ARTIFACT);
            consumer.setVersion(consumerVersion);
            consumer.setPackaging("jar");
            consumer.setName(effective.getName());
            consumer.setDescription(effective.getDescription());
            consumer.setLicenses(effective.getLicenses());
            consumer.setScm(effective.getScm());
            consumer.setDependencies(effective.getDependencies());
            consumer.setDependencyManagement(effective.getDependencyManagement());
            consumer.setRepositories(effective.getRepositories());
            ByteArrayOutputStream pom = new ByteArrayOutputStream();
            try (var writer = new OutputStreamWriter(pom, StandardCharsets.UTF_8)) {
                new MavenXpp3Writer().write(writer, consumer);
            }
            byte[] pomBytes = pom.toByteArray();
            Properties coordinates = new Properties();
            coordinates.setProperty("groupId", GROUP);
            coordinates.setProperty("artifactId", ARTIFACT);
            coordinates.setProperty("version", consumerVersion);
            ByteArrayOutputStream properties = new ByteArrayOutputStream();
            coordinates.store(properties, "Talaxie consumer revision");
            String basename = ARTIFACT + "-" + consumerVersion;
            Files.write(output.resolve(basename + ".pom"), pomBytes);
            try (ZipOutputStream result = new ZipOutputStream(Files.newOutputStream(output.resolve(basename + ".jar")))) {
                var entries = jar.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry entry = entries.nextElement();
                    String name = entry.getName();
                    if (name.matches("(?i)META-INF/[^/]+\\.(SF|RSA|DSA|EC)")) {
                        throw new IllegalArgumentException("Refusing to rewrite a signed upstream JAR");
                    }
                    if (name.startsWith("routines/") && name.endsWith(".class")) {
                        throw new IllegalArgumentException("Upstream JAR contains routine substitution classes");
                    }
                    ZipEntry copy = new ZipEntry(name);
                    copy.setTime(entry.getTime());
                    result.putNextEntry(copy);
                    if (name.equals(METADATA + "pom.xml")) {
                        result.write(pomBytes);
                    } else if (name.equals(METADATA + "pom.properties")) {
                        result.write(properties.toByteArray());
                    } else if (!entry.isDirectory()) {
                        try (var stream = jar.getInputStream(entry)) {
                            stream.transferTo(result);
                        }
                    }
                    result.closeEntry();
                }
            }
            System.out.println("Consumer runtime generated: " + output);
        }
    }

    private static boolean isStub(Dependency dependency) {
        return "org.talend.studio".equals(dependency.getGroupId())
                && "routines-stubs".equals(dependency.getArtifactId());
    }

    /** Parent/BOM POMs have already been resolved by copy-dependencies. */
    private static final class CachedModels implements ModelResolver {
        private final Path repository;

        CachedModels(Path repository) {
            this.repository = repository;
        }

        public ModelSource resolveModel(String group, String artifact, String version) throws UnresolvableModelException {
            Path pom = repository.resolve(group.replace('.', '/')).resolve(artifact).resolve(version)
                    .resolve(artifact + "-" + version + ".pom");
            if (!Files.isRegularFile(pom)) {
                throw new UnresolvableModelException("Missing previously resolved POM: " + pom, group, artifact, version);
            }
            return new FileModelSource(pom.toFile());
        }

        public ModelSource resolveModel(Parent parent) throws UnresolvableModelException {
            return resolveModel(parent.getGroupId(), parent.getArtifactId(), parent.getVersion());
        }

        public ModelSource resolveModel(Dependency dependency) throws UnresolvableModelException {
            return resolveModel(dependency.getGroupId(), dependency.getArtifactId(), dependency.getVersion());
        }

        public void addRepository(Repository repository) { }
        public void addRepository(Repository repository, boolean replace) { }
        public ModelResolver newCopy() { return new CachedModels(repository); }
    }
}
