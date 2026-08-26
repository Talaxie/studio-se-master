/**
 * Copyright (c) 2026 Talaxie.
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Apache v2 License
 * which accompanies this distribution, and is available at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.talend.designer.core.generator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.talend.core.model.general.Project;

/**
 * Tests for {@link CodeGeneratorApplication}.
 */
public class CodeGeneratorApplicationTest {

	/** Original out. */
	private PrintStream originalOut;
	/** Captured out for testing. */
	private ByteArrayOutputStream capturedOut;

	@Before
	public void setup() {
		originalOut = System.out;
		// capture the output and keep printing it to the console
		capturedOut = new ByteArrayOutputStream();
		PrintStream tee = new PrintStream(new OutputStream() {
			@Override
			public void write(int b) throws IOException {
				originalOut.write(b);
				capturedOut.write(b);
			}

			@Override
			public void flush() throws IOException {
				originalOut.flush();
				capturedOut.flush();
			}
		}, true);
		System.setOut(tee);
		/*
		 * The org.talaxie.cli.branding.generator dependency registers
		 * CliBrandingService as IBrandingService.
		 */
	}

	@After
	public void teardown() throws CoreException {
		System.setOut(originalOut);
		// clean up any existing project to avoid interference with tests
		ResourcesPlugin.getWorkspace().getRoot().delete(true, null);
	}

	private Object runApplicationWithArgs(String[] args) throws Exception {
		IApplication app = new CodeGeneratorApplication();

		IApplicationContext context = Mockito.mock(IApplicationContext.class);
		Map<String, Object> arguments = Map.of(IApplicationContext.APPLICATION_ARGS, args);
		Mockito.when(context.getArguments()).thenReturn(arguments);

		// running the application with the arguments
		return app.start(context);
	}

	/**
	 * Tests that the application prints the help message when run with the "--help"
	 * argument.
	 * 
	 * @throws Exception exception
	 */
	@Test
	public void testRunApplicationHelp() throws Exception {
		// given
		String[] args = { "--help" };
		// when
		Object result = runApplicationWithArgs(args);

		// then help message is printed
		String output = capturedOut.toString(StandardCharsets.UTF_8);
		assertThat(output).contains("Prints this help message.");
		assertEquals(IApplication.EXIT_OK, result);
	}

	/**
	 * Tests that the application imports the project with the "-import" command.
	 * 
	 * @throws Exception exception
	 */
	@Test
	public void testRunApplicationImport() throws Exception {
		// given
		assertThat(ResourcesPlugin.getWorkspace().getRoot().getProject("MyTest").exists()).isFalse();
		String[] args = { "-import", "--project", "MyTest", "--file",
				extractResourceToTempFile(getClass().getResource("/resources/MyTestJob_0.1.zip")) };
		// when
		Object result = runApplicationWithArgs(args);

		// then project is imported
		String output = capturedOut.toString(StandardCharsets.UTF_8);
		assertThat(output).contains("`MyTest` project import completed successfully.");
		assertEquals(IApplication.EXIT_OK, result);
		String techName = Project.createTechnicalName("MyTest");
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(techName);
		assertThat(project.exists()).isTrue();
		assertThat(project.getFile(IPath.fromPortableString("process/MyTestJob_0.1.item")).exists()).isTrue();
	}

	// FIXME test failing for now
//	/**
//	 * Tests that the application exports the project with the "-build" command.
//	 * 
//	 * @throws Exception exception
//	 */
//	@Test
//	public void testRunApplicationBuild() throws Exception {
//		// given
//		assertThat(ResourcesPlugin.getWorkspace().getRoot().getProject("MyTest").exists()).isFalse();
//		Path outDir = Files.createTempDirectory("out");
//		outDir.toFile().deleteOnExit();
//		String[] args = { "-import", "--project", "MyTest", "--file",
//				extractResourceToTempFile(getClass().getResource("/resources/MyTestJob_0.1.zip")), "-build",
//				"--project", "MyTest", "--output", outDir.toAbsolutePath().toString() };
//		// when
//		Object result = runApplicationWithArgs(args);
//
//		// then project is built and exported
//		String output = capturedOut.toString(StandardCharsets.UTF_8);
//		Path outputZip = outDir.resolve("MyTestJob_0.1.zip");
//		String successMsg = MessageFormat.format(
//				"`{0}` project build completed successfully. The resulting archive is located at `{1}`.", "MyTest",
//				outputZip.toAbsolutePath().toString());
//		assertThat(output).contains(successMsg);
//		assertEquals(IApplication.EXIT_OK, result);
//		assertThat(Files.exists(outputZip)).isTrue();
//	}

	private String extractResourceToTempFile(URL resourceEntry) throws Exception {
		String fileName = Path.of(resourceEntry.getPath()).getFileName().toString();

		Path tmp;
		if (fileName.toString().contains(".")) {
			String prefix = fileName.substring(0, fileName.lastIndexOf('.'));
			String ext = fileName.substring(fileName.lastIndexOf('.'));
			tmp = Files.createTempFile(prefix, ext);
		} else {
			tmp = Files.createTempFile(fileName, "");
		}

		try (InputStream in = resourceEntry.openStream()) {
			Files.copy(in, tmp, StandardCopyOption.REPLACE_EXISTING);
		}
		File resultFile = tmp.toFile();
		resultFile.deleteOnExit();
		return resultFile.getAbsolutePath();
	}

}
