package org.talend.designer.core;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.talend.commons.exception.ExceptionHandler;

public class ConnectionValidatorManager {

    private static final String CLASS_ATTRIBUTE = "class";

    private static final String CONNECTION_VALIDATOR = "org.talend.designer.core.connection_validator";

    private static Set<IConnectionValidator> validators = null;

    public static Set<IConnectionValidator> getConnectionValidators() {
        if (validators == null) {
            validators = new HashSet<IConnectionValidator>();
            IConfigurationElement[] validatorExtensions = Platform.getExtensionRegistry().getConfigurationElementsFor(
                    CONNECTION_VALIDATOR);
            if (validatorExtensions != null && validatorExtensions.length > 0) {
                for (IConfigurationElement ie : validatorExtensions) {
                    try {
                        Object execution = ie.createExecutableExtension(CLASS_ATTRIBUTE);
                        validators.add((IConnectionValidator) execution);
                    } catch (CoreException e) {
                        ExceptionHandler.log(e.getMessage());
                        continue;
                    }
                }
            }
        }
        return validators;
    }

}
