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

import java.util.List;

import org.talend.designer.core.generator.CodeGeneratorApplication;

/**
 * Defines a command which may be invoked by CLI.
 * <p>
 * Currently only used by {@link CodeGeneratorApplication}, but could be
 * extended to other CLI applications in the future.
 * </p>
 * 
 * @param name        the name of the command
 * @param description a description of the command
 * @param options     the options that can be used within this command
 */
public record CommandDefinition(String name, String description, List<OptionDefinition> options) {

	/**
	 * Get the formatted name of the option, including the preceding `-`.
	 * 
	 * @return formatted name of the option, e.g., `-import`.
	 */
	public String formattedName() {
		return "-" + name;
	}
}
