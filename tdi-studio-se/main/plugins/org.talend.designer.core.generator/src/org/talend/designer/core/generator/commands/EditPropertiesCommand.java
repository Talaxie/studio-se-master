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
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.Property;
import org.talend.core.model.relationship.RelationshipItemBuilder;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.utils.RoutineUtils;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.designer.core.generator.cli.CommandDefinition;
import org.talend.designer.core.generator.cli.OptionDefinition;
import org.talend.expressionbuilder.ExpressionPersistance;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.IProxyRepositoryFactory;

/**
 * This command edits properties of an item (process, context, ...).
 */
public final class EditPropertiesCommand implements CLICommand {

	/** The supported repository object types which we may look into. */
	private static final ERepositoryObjectType[] SUPPORTED_REPOSITORIES = new ERepositoryObjectType[] {
			ERepositoryObjectType.PROCESS, ERepositoryObjectType.CONTEXT, ERepositoryObjectType.ROUTINES };
	/*
	 * ERepositoryObjectType.DOCUMENTATION may be null, e.g. during tests. Leave it
	 * out for now.
	 */

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
	 * The name option for the editProperties command.
	 */
	private final OptionDefinition nameOption = new OptionDefinition("name", Optional.empty(),
			"Updates the name in the item's properties.", false, Optional.of("new value"));

	/**
	 * The purpose option for the editProperties command.
	 */
	private final OptionDefinition purposeOption = new OptionDefinition("purpose", Optional.empty(),
			"Updates the purpose in the item's properties.", false, Optional.of("new value"));

	/**
	 * The description option for the editProperties command.
	 */
	private final OptionDefinition descriptionOption = new OptionDefinition("description", Optional.empty(),
			"Updates the description in the item's properties.", false, Optional.of("new value"));

	/**
	 * The command to edit properties of an item (process, context, ...).
	 */
	private final CommandDefinition editPropertiesCommand = new CommandDefinition("editProperties",
			"Edit properties of an item (process, context, ...).", List.of(projectOption, itemOption, updateMinorOption,
					updateMajorOption, nameOption, purposeOption, descriptionOption));

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
		Optional<String> newName = options.getOrDefault(nameOption, Optional.empty());
		Optional<String> newPurpose = options.getOrDefault(purposeOption, Optional.empty());
		Optional<String> newDescription = options.getOrDefault(descriptionOption, Optional.empty());

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
		List<String> pathSegments = segments.subList(1, segments.size());

		AtomicBoolean successFulUpdate = new AtomicBoolean(false);

		executeWithOpenedProject(projectName, p -> {
			Optional<IRepositoryViewObject> item = findItem(p, repoType.get(), pathSegments);
			item.ifPresentOrElse(i -> {
				Property propertyToUpdate = i.getProperty();
				Assert.isNotNull(propertyToUpdate);
				final String originalLabel = propertyToUpdate.getLabel();
				final String originalVersion = propertyToUpdate.getVersion();
				// update version
				if (updateMajor) {
					propertyToUpdate.setVersion(VersionUtils.upMajor(originalVersion));
					log(format("Version updated from {0} to {1}", originalVersion, propertyToUpdate.getVersion()));
				} else if (updateMinor) {
					propertyToUpdate.setVersion(VersionUtils.upMinor(originalVersion));
					log(format("Version updated from {0} to {1}", originalVersion, propertyToUpdate.getVersion()));
				}
				// update other properties
				newName.ifPresent(newValue -> {
					propertyToUpdate.setDisplayName(newValue);
					log(format("Name updated from {0} to {1}", originalLabel, newValue));
				});
				newPurpose.ifPresent(newValue -> {
					propertyToUpdate.setPurpose(newValue);
					log(format("Purpose updated tor {0}", newValue));
				});
				newDescription.ifPresent(newValue -> {
					propertyToUpdate.setDescription(newValue);
					log(format("Description updated tor {0}", newValue));
				});
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

}
