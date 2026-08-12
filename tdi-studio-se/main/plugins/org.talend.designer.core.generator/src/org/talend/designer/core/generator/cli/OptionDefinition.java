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

import java.util.Optional;

import org.talend.designer.core.generator.CodeGeneratorApplication;

/**
 * Defines an option for a command or a global option.
 * <p>
 * Currently only used by {@link CodeGeneratorApplication}, but could be
 * extended to other CLI applications in the future.
 * </p>
 * 
 * @param name            the name of the option (preferably the short version,
 *                        e.g., "v" for "verbose")
 * @param alternativeName an alternative name for the option (e.g. a longer
 *                        version), or empty
 * @param description     a description of the option
 * @param required        whether the option is required
 * @param valueName       then name for the required value after it (e.g.
 *                        --option value), or empty when the option does not
 *                        require a value
 */
public record OptionDefinition(String name, Optional<String> alternativeName, String description, boolean required,
		Optional<String> valueName) {

	/**
	 * The "-data" option for eclipse workspace.
	 */
	public static final OptionDefinition DATA = new OptionDefinition("data", Optional.empty(),
			"The path to a Talaxie workspace to use, such as `C:/TOS_DI-X.Y.Z/workspace`.", true,
			Optional.of("workspace path"));

	/**
	 * Get the formatted name of the option, including the preceding `--`.
	 * 
	 * @return formatted name of the option, e.g., `--o`.
	 */
	public String formattedName() {
		// let's make an exception for the "-data" option, which is the eclipse
		// workspace location
		String prefix = DATA.equals(this) ? "-" : "--";
		return prefix + name;
	}

	/**
	 * Get the formatted name of the option, including the value name if present and
	 * preceding `--`.
	 * 
	 * @return formatted name of the option, e.g., `--o <value>`.
	 */
	public String formattedFullName() {
		return formattedName() + (valueName.isPresent() ? " <" + valueName.get() + ">" : "");
	}

	/**
	 * Get the formatted alternative name of the option, including the preceding
	 * `--`.
	 * 
	 * @return formatted alternative name of the option, e.g., `--option`, or empty
	 *         string if no alternative name is present.
	 */
	public String formattedAlternativeName() {
		return alternativeName.map(name -> "--" + name).orElse("");
	}

	/**
	 * Get the formatted alternative name of the option, including the value name if
	 * present and preceding `--`.
	 * 
	 * @return formatted alternative name of the option, e.g., `--option <value>`,
	 *         or empty string if no alternative name is present.
	 */
	public String formattedFullAlternativeName() {
		return alternativeName
				.map(name -> formattedAlternativeName() + (valueName.isPresent() ? " <" + valueName.get() + ">" : ""))
				.orElse("");
	}

}