// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.librariesmanager.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Supplier;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.routines.IRoutineProviderCreator;
import org.talend.core.model.routines.IRoutinesProvider;
import org.talend.librariesmanager.i18n.Messages;

/**
 * DOC bqian class global comment. Detailled comment
 */
public class RoutineProviderManager {

	private static Logger log = Logger.getLogger(RoutineProviderManager.class);

	private static final RoutineProviderManager INSTANCE = new RoutineProviderManager();

	/**
	 * Supplier to load the IRoutineProviderCreator from extension point lazily and
	 * in a thread-safe way.
	 */
	private Supplier<Collection<IRoutineProviderCreator>> providerCreatorsSupplier = new Supplier<>() {
		private Collection<IRoutineProviderCreator> providerCreators = null;

		@Override
		public synchronized Collection<IRoutineProviderCreator> get() {
			if (providerCreators == null) {
				providerCreators = new ArrayList<IRoutineProviderCreator>();

				IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
				IExtensionPoint extensionPoint = extensionRegistry
						.getExtensionPoint("org.talend.core.routines_provider"); //$NON-NLS-1$
				IExtension[] extensions = extensionPoint.getExtensions();
				for (IExtension extension : extensions) {
					IConfigurationElement[] configurationElements = extension.getConfigurationElements();
					for (IConfigurationElement configurationElement : configurationElements) {
						try {
							IRoutineProviderCreator componentsProviderCreator = (IRoutineProviderCreator) configurationElement
									.createExecutableExtension("class"); //$NON-NLS-1$
							providerCreators.add(componentsProviderCreator);
						} catch (CoreException e) {
							log.error(Messages.getString("RoutineProviderManager.unableLoad"), e); //$NON-NLS-1$
						}
					}
				}
			}
			return providerCreators;
		}
	};

	private RoutineProviderManager() {
	}

	public static RoutineProviderManager getInstance() {
		return INSTANCE;
	}

	public Collection<IRoutinesProvider> getProviders(ECodeLanguage lan) {
		return providerCreatorsSupplier.get().stream().map(creator -> creator.createIRoutinesProviderByLanguage(lan))
				.filter(Objects::nonNull).toList();
	}
}
