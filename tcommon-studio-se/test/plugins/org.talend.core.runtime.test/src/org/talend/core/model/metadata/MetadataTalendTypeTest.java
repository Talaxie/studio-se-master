package org.talend.core.model.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.junit.Before;
import org.junit.Test;
import org.talend.commons.utils.generation.JavaUtils;
import org.talend.commons.utils.workbench.resources.ResourceUtils;
import org.talend.core.runtime.process.ITalendProcessJavaProject;
import org.talend.designer.runprocess.IRunProcessService;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.RepositoryConstants;

public class MetadataTalendTypeTest {

    private ITalendProcessJavaProject talendProcessJavaProject;

    @Before
    public void setUp() throws Exception {
        if (IRunProcessService.get() != null) {
            IRunProcessService runProcessService = IRunProcessService.get();
            talendProcessJavaProject = runProcessService.getTempJavaProject();
        }
    }

    @Test
    public void testGetProjectForderURLOfMappingsFile() throws Exception {
        URL url = MetadataTalendType.getProjectFolderURLOfMappingsFile().toURI().toURL();
        String projectLabel = ProjectManager.getInstance().getCurrentProject().getTechnicalLabel();
        assertTrue(StringUtils.removeEnd(url.getFile(), "/").endsWith(projectLabel + "/.settings/mappings"));
    }

    @Test
    public void testRestoreMappingFiles() throws Exception {
        IFolder projectMappingFolder = ResourceUtils.getProject(ProjectManager.getInstance().getCurrentProject())
                .getFolder(MetadataTalendType.PROJECT_MAPPING_FOLDER);
        if (!projectMappingFolder.exists()) {
            projectMappingFolder.create(true, true, null);
        }

        MetadataTalendType.restoreMappingFiles();
        IFile keep = null;
        IFile restore = null;
        IFile externalKeep = null;
        try {
            keep = projectMappingFolder.getFile("mapping_Access.xml");
            if (keep.exists()) {
                keep.delete(true, null);
            }
            keep.create(new ByteArrayInputStream("test1".getBytes()), true, null);
            String keepSha1_before = MetadataTalendType.getSha1OfFile(keep.getLocation().toFile());

            restore = projectMappingFolder.getFile("mapping_Firebird.xml");
            if (restore.exists()) {
                restore.delete(true, null);
            }
            restore.create(new ByteArrayInputStream(Files.readAllBytes(
                    new File(MetadataTalendType.getSystemFolderURLOfMappingsFile(), restore.getName()).toPath())), true,
                    null);

            externalKeep = projectMappingFolder.getFile("mapping_ExternalTest.xml");
            if (externalKeep.exists()) {
                externalKeep.delete(true, null);
            }
            externalKeep.create(new ByteArrayInputStream("test2".getBytes()), true, null);
            String externalKeepSha1_before = MetadataTalendType.getSha1OfFile(externalKeep.getLocation().toFile());

            MetadataTalendType.restoreMappingFiles();

            // kept
            assertTrue(keep.getLocation().toFile().exists());
            String keepSha1_after = MetadataTalendType.getSha1OfFile(keep.getLocation().toFile());
            assertEquals(keepSha1_before, keepSha1_after);

            // restored(migration)
            assertFalse(restore.getLocation().toFile().exists());

            // not impacted
            assertTrue(externalKeep.getLocation().toFile().exists());
            String externalKeepSha1_after = MetadataTalendType.getSha1OfFile(externalKeep.getLocation().toFile());
            assertEquals(externalKeepSha1_before, externalKeepSha1_after);
        } finally {
            if (keep != null && keep.getLocation().toFile().exists()) {
                keep.getLocation().toFile().delete();
            }
            if (restore != null && restore.getLocation().toFile().exists()) {
                restore.getLocation().toFile().delete();
            }
            if (externalKeep != null && externalKeep.getLocation().toFile().exists()) {
                externalKeep.getLocation().toFile().delete();
            }
            projectMappingFolder.refreshLocal(IResource.DEPTH_ONE, null);
        }
    }

    @Test
    public void testSyncMappingFilesToTempMappingFolder() throws Exception {
        boolean renamed = false;
        List<File> workingMappingFiles = MetadataTalendType.getWorkingMappingFiles();
        IProject project = ResourceUtils.getProject(ProjectManager.getInstance().getCurrentProject());
        IFolder tmpMappingFolder = ResourceUtils.getFolder(project,
                RepositoryConstants.TEMP_DIRECTORY + "/" + MetadataTalendType.INTERNAL_MAPPINGS_FOLDER, false);

        MetadataTalendType.getProjectTempMappingFolder();

        modifyTargetFolder(tmpMappingFolder, renamed);

        MetadataTalendType.getProjectTempMappingFolder();

        List<File> tmpMappingFiles = Arrays.asList(tmpMappingFolder.getLocation().toFile()
                .listFiles(f -> f.getName().matches(MetadataTalendType.MAPPING_FILE_PATTERN)));
        validateConsistence(workingMappingFiles, tmpMappingFiles, renamed);
    }

    @Test
    public void testSyncMappingFilesToJobProjectMappingFolder() throws Exception {
        boolean renamed = true;

        List<File> workingMappingFiles = MetadataTalendType.getWorkingMappingFiles();
        IFolder jobProjectMappingFolder = talendProcessJavaProject.getResourceSubFolder(null, JavaUtils.JAVA_XML_MAPPING);

        MetadataTalendType.syncMappingFiles(jobProjectMappingFolder.getLocation().toFile(), renamed);

        modifyTargetFolder(jobProjectMappingFolder, renamed);

        MetadataTalendType.syncMappingFiles(jobProjectMappingFolder.getLocation().toFile(), renamed);

        List<File> jobMappingFiles = Arrays.asList(jobProjectMappingFolder.getLocation().toFile()
                .listFiles(f -> f.getName().matches(MetadataTalendType.MAPPING_FILE_PATTERN)));
        validateConsistence(workingMappingFiles, jobMappingFiles, renamed);
    }

    private void modifyTargetFolder(IFolder folder, boolean renamed) throws CoreException {
        folder.refreshLocal(IResource.DEPTH_ONE, null);
        String fileName1 = "mapping_Access.xml";
        IFile file1 = folder.getFile(renamed ? fileName1.toLowerCase() : fileName1);
        assertTrue(file1.getLocation().toFile().exists());
        file1.delete(true, null);
        String fileName2 = "mapping_AS400.xml";
        IFile file2 = folder.getFile(renamed ? fileName2.toLowerCase() : fileName2);
        assertTrue(file2.getLocation().toFile().exists());
        String content = "test modification";
        InputStream in = new ByteArrayInputStream(content.getBytes());
        file2.setContents(in, true, false, null);
    }

    private void validateConsistence(List<File> sources, List<File> targets, boolean renamed) throws IOException {
        assertEquals(sources.size(), targets.size());
        for (File source : sources) {
            boolean isFound = false;
            String sourceSha1 = MetadataTalendType.getSha1OfFile(source);
            String sourceFileName = MetadataTalendType.getTargetName(source, renamed);
            for (File target : targets) {
                if (target.getName().equals(sourceFileName)) {
                    isFound = true;
                    String targetSha1 = MetadataTalendType.getSha1OfFile(target);
                    assertEquals(sourceSha1, targetSha1);
                }
            }
            assertTrue(isFound);
        }
    }

}
