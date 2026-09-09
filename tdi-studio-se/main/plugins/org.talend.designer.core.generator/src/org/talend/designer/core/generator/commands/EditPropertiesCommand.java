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
package org.talend.designer.core.generator.commands;

import static java.text.MessageFormat.format;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.equinox.app.IApplication;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.utils.VersionUtils;
import org.talend.commons.utils.workbench.resources.ResourceUtils;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.IESBService;
import org.talend.core.context.Context;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.model.relationship.RelationshipItemBuilder;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.utils.RoutineUtils;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.runtime.util.URIHelper;
import org.talend.designer.core.generator.cli.CommandDefinition;
import org.talend.designer.core.generator.cli.OptionDefinition;
import org.talend.expressionbuilder.ExpressionPersistance;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IProxyRepositoryService;

/**
 * This command edits properties of an item (process, context, ...).
 */
public final class EditPropertiesCommand implements CLICommand {

	/** The supported repository object types which we may look into. */
	private static final ERepositoryObjectType[] SUPPORTED_REPOSITORIES = new ERepositoryObjectType[] {
			ERepositoryObjectType.PROCESS, ERepositoryObjectType.CONTEXT, ERepositoryObjectType.ROUTINES,
			ERepositoryObjectType.DOCUMENTATION };

	/**
	 * The user-friendly list of supported repository object types, e.g.
	 * "`process/`, `context/`, `routines/`, `documentation/`".
	 */
	private static final String SUPPORTED_REPOSITORIES_LIST_MESSAGE = Stream.of(SUPPORTED_REPOSITORIES)
			.map(ERepositoryObjectType::getFolder).filter(Objects::nonNull).map("`%s/`"::formatted)
			.collect(Collectors.joining(", "));

	/**
	 * The project option for the editProperties command.
	 */
	private final OptionDefinition projectOption = new OptionDefinition("p", Optional.of("project"),
			"The name of the existing project to look into.`.", true, Optional.of("name"));

	/**
	 * The item option for the editProperties command.
	 */
	private final OptionDefinition itemOption = new OptionDefinition("i", Optional.of("item"), format(
			"The functional path to the item, e.g. `process/myFolder/myJob`. The prefix indicates the type of edited item and can be one of {0}. Then comes the folder(s) name(s) and finally the item name.",
			SUPPORTED_REPOSITORIES_LIST_MESSAGE), true, Optional.of("path"));

	/**
	 * The updateMinor option for the editProperties command.
	 */
	private final OptionDefinition updateMinorOption = new OptionDefinition("updateMinor", Optional.empty(),
			"Updates the minor version in the item's properties. Ignored when `updateMajor` is used.", false,
			Optional.empty());

	/**
	 * The updateMajor option for the editProperties command.
	 */
	private final OptionDefinition updateMajorOption = new OptionDefinition("updateMajor", Optional.empty(),
			"Updates the major version in the item's properties.", false, Optional.empty());

	/**
	 * The command to edit properties of an item (process, context, ...).
	 */
	private final CommandDefinition editPropertiesCommand = new CommandDefinition("editProperties",
			"Edit properties of an item (process, context, ...).",
			List.of(projectOption, itemOption, updateMinorOption, updateMajorOption));

	@Override
	public CommandDefinition getDefinition() {
		return editPropertiesCommand;
	}

	@Override
	public int execute(Map<OptionDefinition, Optional<String>> options) throws Exception {
		String projectName = options.get(projectOption).orElseThrow();
		String itemPath = options.get(itemOption).orElseThrow();
		boolean updateMinor = options.containsKey(updateMinorOption);
		boolean updateMajor = options.containsKey(updateMajorOption);

		List<String> segments = Arrays.asList(itemPath.split("/"));
		if (segments.size() < 2) {
			return fail(format(
					"The item path {0} is invalid. It should be of the form <repositoryType>/<folder(s)>/<itemName>",
					itemPath));
		}
		String firstSegment = segments.get(0);
		Optional<ERepositoryObjectType> repoType = Stream.of(SUPPORTED_REPOSITORIES)
				.filter(r -> r.getFolder() != null && r.getFolder().equals(firstSegment)).findFirst();
		if (!repoType.isPresent()) {
			return fail(format(
					"The item path {0} is invalid. The repository type {1} is not supported. It should be one of {2}",
					itemPath, firstSegment, SUPPORTED_REPOSITORIES_LIST_MESSAGE));
		}

		AtomicBoolean successFulUpdate = new AtomicBoolean(false);

		executeWithOpenedProject(projectName, p -> {
			IProxyRepositoryService service = (IProxyRepositoryService) GlobalServiceRegister.getDefault()
					.getService(IProxyRepositoryService.class);
			IProxyRepositoryFactory factory = service.getProxyRepositoryFactory();
			try {
				String lastSegment = segments.get(segments.size() - 1);
				List<IRepositoryViewObject> candidates = factory.getAll(repoType.get());
				Stream<IRepositoryViewObject> labelMatchinCandidates = candidates.stream()
						.filter(o -> lastSegment.equals(o.getLabel()));
				Stream<IRepositoryViewObject> matchingCandidates = labelMatchinCandidates.filter(o -> segments
						.subList(1, segments.size() - 1).stream().collect(Collectors.joining("/")).equals(o.getPath()));
				Optional<IRepositoryViewObject> item = matchingCandidates.findFirst();
				item.ifPresentOrElse(i -> {
					Property propertyToUpdate = i.getProperty();
					Assert.isNotNull(propertyToUpdate);
					final String originalLabel = propertyToUpdate.getLabel();
					final String originalVersion = propertyToUpdate.getVersion();
					// update version
					if (updateMajor) {
						propertyToUpdate.setVersion(VersionUtils.upMajor(originalVersion));
						log(format("Version updated from {0} to {1}", originalVersion,
								propertyToUpdate.getVersion()));
					} else if (updateMinor) {
						propertyToUpdate.setVersion(VersionUtils.upMinor(originalVersion));
						log(format("Version updated from {0} to {1}", originalVersion,
								propertyToUpdate.getVersion()));
					}
					/*
					 * TDI-19527, label=displayName (see
					 * org.talend.metadata.managment.ui.wizard.PropertiesWizard.performFinish())
					 */
					propertyToUpdate.setLabel(propertyToUpdate.getDisplayName());
					// save changes
					boolean success;
					try {
						success = savePropertyChanges(propertyToUpdate, originalLabel, originalVersion, repoType.get());
						successFulUpdate.set(success);
					} catch (CoreException e) {
						fail(format("Error occurred while saving changes for item {0} in project {1}", itemPath,
								projectName), e);
					}
				}, () -> {
					fail(format("Could not find item {0} in project {1}", itemPath, projectName));
				});
			} catch (PersistenceException e) {
				fail(format("Could not recover items from project {0}", projectName), e);
			}
		});

		return successFulUpdate.get() ? IApplication.EXIT_OK : fail("Properties update failed.");
	}

	/**
	 * Saves the changes made to the property and make required updates when name
	 * has changed.
	 * 
	 * @param propertyToUpdate the updated property to save
	 * @param originalLabel    the original label of the property before the update
	 * @param originalVersion  the original version of the property before the
	 *                         update
	 * @param repositoryType   the type of repository holding the item
	 * @return true if the save operation was successful, false otherwise
	 * @throws CoreException if an error occurs during the save operation
	 */
	private boolean savePropertyChanges(Property propertyToUpdate, final String originalLabel,
			final String originalVersion, ERepositoryObjectType repositoryType) throws CoreException {
		IProxyRepositoryFactory proxyRepositoryFactory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
		try {
			processBeforeItemSave(proxyRepositoryFactory, originalLabel, propertyToUpdate, repositoryType);
			proxyRepositoryFactory.save(propertyToUpdate, originalLabel, originalVersion);
			ExpressionPersistance.getInstance().jobNameChanged(originalLabel, propertyToUpdate.getLabel());

			if (!originalVersion.equals(propertyToUpdate.getVersion())) {
				RelationshipItemBuilder.getInstance().addOrUpdateItem(propertyToUpdate.getItem());
			}
			proxyRepositoryFactory.saveProject(ProjectManager.getInstance().getCurrentProject());
			if (GlobalServiceRegister.getDefault().isServiceRegistered(IESBService.class)) {
				IESBService service = (IESBService) GlobalServiceRegister.getDefault().getService(IESBService.class);
				service.editJobName(originalLabel, propertyToUpdate.getLabel());
			}
			return true;
		} catch (PersistenceException e) {
			fail(format("Failed to save changes for item {0}", propertyToUpdate.getId()), e);
		}
		return false;
	}

	private void processBeforeItemSave(IProxyRepositoryFactory proxyRepositoryFactory, String originalLabel,
			Property propertyToUpdate, ERepositoryObjectType repositoryType)
			throws PersistenceException, CoreException {
		if (!originalLabel.equals(propertyToUpdate.getLabel())
				&& ERepositoryObjectType.getAllTypesOfCodesJar().contains(repositoryType)) {
			// the label of a jar item has changed, we should rename the corresponding inner
			// core folder.
			Project currentProject = ProjectManager.getInstance().getCurrentProject();
			IFolder innerCodeFolder = ResourceUtils.getFolder(ResourceUtils.getProject(currentProject),
					ERepositoryObjectType.getFolderName(repositoryType) + "/" + originalLabel, true);
			List<IRepositoryViewObject> innerCodesObjs = proxyRepositoryFactory.getAll(currentProject, repositoryType,
					false, false, innerCodeFolder);
			proxyRepositoryFactory.renameFolder(repositoryType, new Path(originalLabel), propertyToUpdate.getLabel());
			// for codejar to change innercode folder name
			if (innerCodesObjs != null && !innerCodesObjs.isEmpty()) {
				innerCodesObjs.stream().forEach(repObj -> {
					RoutineUtils.changeInnerCodePackage(repObj.getProperty().getItem(), false, false);
				});
			}
		}

	}

	/**
	 * Ensure project can be exploited and that all required services are correctly
	 * initialized.
	 * 
	 * <ul>
	 * <li>{@link Context#REPOSITORY_CONTEXT_KEY} is associated to a repository
	 * context</li>
	 * <li>This context contains a user</li>
	 * <li>This context contains the project (avoids NPE in project-based preference
	 * lookups during Process initialization).</li>
	 * <li>Execute login tasks created using the extension point
	 * <code>org.talend.core.repository.login.task</code></li>
	 * </ul>
	 * 
	 * @param processItem the process item to find the project for
	 * @param wsProjects  workspace projects to find the project of the process item
	 */
	private void ensureProjectExploitable(ProcessItem processItem, Project[] wsProjects) {
		IFile itemFile = URIHelper.getFile(URIHelper.convert(processItem.eResource().getURI()));
		Stream.of(wsProjects).filter(p -> p.getTechnicalLabel().equals(itemFile.getProject().getName())).findFirst()
				.ifPresentOrElse(this::ensureProjectExploitable, () -> {
					fail("The project of the process item cannot be found in the workspace projects: "
							+ itemFile.getProject().getName());
				});
	}

}
