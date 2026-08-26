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
package org.talend.designer.core.generator.cli;

import static java.text.MessageFormat.format;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

import org.talend.designer.core.generator.CodeGeneratorApplication;

/**
 * Defines the CLI: commands, global options, how to invoke them.
 * <p>
 * Currently only used by {@link CodeGeneratorApplication}, but could be
 * extended to other CLI applications in the future.
 * </p>
 * 
 * @param globalOptions the global options that can be used with any command
 * @param commands      the commands that can be invoked by CLI
 */
public record CLIDefinition(List<OptionDefinition> globalOptions, List<CommandDefinition> commands) {

	/**
	 * The result of parsing the command line arguments, including the parsed global
	 * options and the parsed commands with their respective options.
	 * <p>
	 * The presence of an entry in the map indicates that the option/command was
	 * provided, the value contains the value if provided, or empty.
	 * <p/>
	 */
	public static record Parsed(Map<OptionDefinition, Optional<String>> parsedGlobalOptions,
			Map<CommandDefinition, Map<OptionDefinition, Optional<String>>> parsedCommandsWithOptions) {
	}

	/**
	 * Parses the command line arguments according to the CLI definition.
	 * 
	 * @param args                         the command line arguments to parse
	 * @param globalOptionIgnoringCommands a global option that tells the parser
	 *                                     commands are not mandatory (e.g. help
	 *                                     option)
	 * @return a {@link Parsed} object containing the parsed global options and
	 *         commands with their respective options
	 * @throws IllegalArgumentException if the arguments are invalid or do not match
	 *                                  the CLI definition
	 */
	public Parsed parseArguments(String[] args, OptionDefinition globalOptionIgnoringCommands) {
		Map<OptionDefinition, Optional<String>> parseGlobalOptions = new HashMap<>();
		Map<CommandDefinition, Map<OptionDefinition, Optional<String>>> parseCommandsWithOptions = new HashMap<>();

		OptionDefinition currentOption = null;
		CommandDefinition currentCommand = null;

		// parse arguments in order, keeping track of the current command and option
		for (String arg : args) {
			if (currentOption != null) {
				if (arg.startsWith("-")) {
					throw new IllegalArgumentException(
							"Expected value for option " + currentOption.formattedName() + ", but got: " + arg);
				}
				// It's a value for the current option
				if (currentCommand != null) {
					// command option value
					parseCommandsWithOptions.get(currentCommand).put(currentOption, Optional.of(arg));
				} else {
					// global option value
					parseGlobalOptions.put(currentOption, Optional.of(arg));
				}
				// reset current option after consuming its value
				currentOption = null;
			} else if (arg.startsWith("--")) {
				// it may be a global option or a command option
				OptionDefinition option = findOption(currentCommand, arg);
				if (option.valueName().isPresent()) {
					// wait for the next argument to be the value for this option
					currentOption = option;
				} else if (currentCommand != null) {
					parseCommandsWithOptions.get(currentCommand).put(option, Optional.empty());
				} else {
					parseGlobalOptions.put(option, Optional.empty());
				}
			} else if (arg.startsWith("-")) {
				// It's a command
				CommandDefinition command = commands.stream().filter(c -> c.formattedName().equals(arg)).findFirst()
						.orElseThrow(() -> new IllegalArgumentException("Unknown command: " + arg));
				parseCommandsWithOptions.put(command, new HashMap<>());
				// now, read options for this command until we hit another command
				currentCommand = command;
			} else {
				throw new IllegalArgumentException("Unexpected argument: " + arg);
			}

		}
		// now, check for required options
		Predicate<OptionDefinition> hasGlobalOption = parseGlobalOptions::containsKey;
		globalOptions.stream().filter(OptionDefinition::required).filter(hasGlobalOption.negate()).findFirst()
				.ifPresent(option -> {
					throw new IllegalArgumentException("Missing required global option: " + option.formattedName());
				});
		if (parseCommandsWithOptions.isEmpty() && !parseGlobalOptions.containsKey(globalOptionIgnoringCommands)) {
			throw new IllegalArgumentException("No command provided. At least one command is required.");
		}
		parseCommandsWithOptions.forEach((command, options) -> {
			Predicate<OptionDefinition> hasOption = options::containsKey;
			command.options().stream().filter(OptionDefinition::required).filter(hasOption.negate()).findFirst()
					.ifPresent(option -> {
						throw new IllegalArgumentException(format("Missing required option for command {0}: {1}",
								command.formattedName(), option.formattedName()));
					});
		});
		return new Parsed(parseGlobalOptions, parseCommandsWithOptions);
	}

	/**
	 * Find option corresponding to the given argument, either in the current
	 * command or in the global options.
	 * 
	 * @param currentCommand the current command, or null if we are not in a command
	 *                       context
	 * @param arg            the argument to find the option for
	 * @return the option definition corresponding to the argument
	 * @throws IllegalArgumentException if the option is not found
	 */
	private OptionDefinition findOption(CommandDefinition currentCommand, String arg) {
		List<OptionDefinition> availableOptions = currentCommand != null ? currentCommand.options() : globalOptions;
		return availableOptions.stream()
				.filter(o -> o.formattedName().equals(arg) || o.formattedAlternativeName().equals(arg)).findFirst()
				.orElseThrow(() -> {
					List<String> available = availableOptions.stream()
							.map(o -> o.formattedFullName()
									+ (o.alternativeName().isPresent() ? " / " + o.formattedFullAlternativeName() : ""))
							.toList();
					if (currentCommand != null) {
						return new IllegalArgumentException(
								format("Unknown option for command {0}: {1}.\n Available options are: {2}",
										currentCommand.formattedName(), arg, available));
					} else {
						return new IllegalArgumentException(
								format("Unknown global option: {0}.\n Available options are: {1}", arg, available));
					}
				});
	}

}
