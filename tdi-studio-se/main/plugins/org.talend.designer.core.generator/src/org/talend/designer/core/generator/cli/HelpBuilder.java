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

import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.runtime.Platform;

public class HelpBuilder {

	/**
	 * "OPTION" label for help of an option name.
	 */
	private static final String OPTION = "OPTION";
	/**
	 * "LONG OPTION" label for help of an option alternative name.
	 */
	private static final String LONG_OPTION = "LONG OPTION";
	/**
	 * "MEANING" label for help of an option description.
	 */
	private static final String MEANING = "MEANING";
	/**
	 * "COMMAND" label for help of a command name.
	 */
	private static final String COMMAND = "COMMAND";
	/**
	 * "EFFECT DESCRIPTION" label for help of a command description.
	 */
	private static final String COMMAND_EFFECT = "EFFECT DESCRIPTION";

	/**
	 * Spacing between columns in the help message.
	 */
	private static final int SPACING = 2;

	/**
	 * Builds a help message for the CLI application based on the provided CLI
	 * definition.
	 * 
	 * @param cliDefinition      the definition of the CLI, including commands and
	 *                           global options
	 * @param exeName            the name of the executable (e.g., "TOS_CLI_GEN")
	 * @param alternativeExeName the name of the alternative executable containing
	 *                           the product (e.g. "TOS_DI")
	 * @param productId          the identifier of the product (e.g.,
	 *                           "org.talaxie.cli.branding.generator.product")
	 * @return generated help message as a string
	 */
	public static String buildHelpMessage(CLIDefinition cliDefinition, String exeName, String alternativeExeName,
			String productId) {
		StringBuilder helpMessage = new StringBuilder();

		String suffix = Platform.getOS().equals(Platform.OS_WIN32) ? "c.exe" : "";
		helpMessage.append(format("""
				Usage: {0}{1} [global options] <commands> [command options]
				""", exeName, suffix));
		if (alternativeExeName != null && productId != null) {
			helpMessage.append(format("""
					or alternatively: {0}{1} -product {2} [global options] <commands> [command options]
					""", alternativeExeName, suffix, productId));
		}
		helpMessage.append("Several commands can be chained.\n");

		// Display global options header
		helpMessage.append("\n\n");
		helpMessage.append("Global Options:\n");
		/*
		 * The -data is not part of the CLI definition, but is a required option for the
		 * Eclipse application to run.
		 */
		List<OptionDefinition> globalOptions = Stream
				.concat(Stream.of(OptionDefinition.DATA), cliDefinition.globalOptions().stream()).toList();
		String globalOptionsFormat = computeOptionsFormat(globalOptions, 1);
		helpMessage.append(globalOptionsFormat.formatted(OPTION, LONG_OPTION, MEANING));

		// Display global options list
		for (OptionDefinition option : globalOptions) {
			String required = option.required() ? "*Required* " : "";
			helpMessage.append(globalOptionsFormat.formatted(option.formattedFullName(),
					option.formattedFullAlternativeName(), required + option.description()));
		}
		helpMessage.append("\n\n");

		// Display commands header
		helpMessage.append("Available Commands:\n");
		String commandFormat = computeCommandsFormat(cliDefinition.commands());
		helpMessage.append(commandFormat.formatted(COMMAND, COMMAND_EFFECT));

		// Display commands list
		for (CommandDefinition command : cliDefinition.commands()) {
			helpMessage.append(commandFormat.formatted(command.formattedName(), command.description()));
			if (!command.options().isEmpty()) {
				// Display options header
				helpMessage.append(commandFormat.formatted("", "With Command Options:"));
				String optionsFormat = computeOptionsFormat(command.options(), 3);
				helpMessage.append(optionsFormat.formatted(OPTION, LONG_OPTION, MEANING));

				// Display options list
				for (OptionDefinition option : command.options()) {
					String required = option.required() ? "*Required* " : "";
					helpMessage.append(optionsFormat.formatted(option.formattedFullName(),
							option.formattedFullAlternativeName(), required + option.description()));
				}
			}
			helpMessage.append("\n");
		}

		return helpMessage.toString();
	}

	/**
	 * Computes the format string for displaying options in the help message, based
	 * on the provided list of options and the specified indentation level.
	 * 
	 * @param options          the list of option definitions to format
	 * @param indentationLevel the level of indentation for the options in the help
	 *                         message
	 * @return the computed format string for displaying options with
	 *         {@link String#formatted(Object...)}
	 */
	private static String computeOptionsFormat(List<OptionDefinition> options, int indentationLevel) {
		int shortWidth = Math.max(OPTION.length(), options.stream()//
				.mapToInt(o -> o.formattedFullName().length()).max().orElse(0)) + SPACING;
		int longWidth = Math.max(LONG_OPTION.length(), options.stream()//
				.mapToInt(o -> o.formattedFullAlternativeName().length()).max().orElse(0)) + SPACING;
		String prefix = " ".repeat(indentationLevel * SPACING);
		return prefix + "%-" + shortWidth + "s " + "%-" + longWidth + "s " + "%s%n";
	}

	/**
	 * Computes the format string for displaying commands in the help message, based
	 * on the provided list of commands (indentation level = 1).
	 * 
	 * @param options the list of option definitions to format
	 * @return the computed format string for displaying options with
	 *         {@link String#formatted(Object...)}
	 */
	private static String computeCommandsFormat(List<CommandDefinition> commands) {
		int shortWidth = Math.max(COMMAND.length(), commands.stream()//
				.mapToInt(o -> o.formattedName().length()).max().orElse(0)) + SPACING;
		String prefix = " ".repeat(SPACING);
		return prefix + "%-" + shortWidth + "s %s%n";
	}

	/**
	 * Get extra length for the value of an option, if it has one.
	 * 
	 * @param option the option definition
	 * @return the extra length for displaying the value of the option
	 */
	private static Integer getExtraLengthForValue(OptionDefinition option) {
		// <valueName>
		return option.valueName().map(v -> v.length() + 3).orElse(0);
	}

}
