// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2021 Talend – www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.camel.designer.migration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.talend.camel.core.model.camelProperties.BeanItem;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.component.ComponentFactory;
import org.talend.designer.core.model.utils.emf.component.IMPORTType;
import org.talend.librariesmanager.model.ModulesNeededProvider;
import org.talend.migration.MigrationReportRecorder;

/**
 * DOC yyan class global comment. Add esb libraries by default for bean TESB-21419
 *
 */
public class RemoveBeansDuplicateLibrariesMigrationTask extends AbstractItemMigrationTask {

    @Override
    public List<ERepositoryObjectType> getTypes() {
        List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
        toReturn.add(ERepositoryObjectType.BEANS);
        return toReturn;
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, 10, 12, 12, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        if (item instanceof BeanItem) {
            BeanItem beanItem = (BeanItem) item;
            removeDuplicateModulesInBeanImport(beanItem);
            try {
                ProxyRepositoryFactory.getInstance().save(beanItem);
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }
    }

    private void removeDuplicateModulesInBeanImport(BeanItem beanItem) {
    	EList<IMPORTType> eList = beanItem.getImports();
    	
    	Map<String, Set<String>> moduleVersions = new HashMap<String, Set<String>>();
    	Map<String, List<String>> moduleVersionsWithSortedArray = new HashMap<String, List<String>>();
    	
    	for (IMPORTType object : eList) {
    		try {
	    		int index = object.getMODULE().lastIndexOf('-');
	    		String moduleName = object.getMODULE().substring(0, index);
	    		String moduleVersion = object.getMODULE().substring(index + 1);
	    		String moduleVersionWithoutJar = moduleVersion.split(".jar")[0].split(".RELEASE")[0].split(".SNAPSHOT")[0];
	    		
	    		moduleVersions.putIfAbsent(moduleName, new HashSet<String>());
	    		moduleVersions.get(moduleName).add(moduleVersionWithoutJar);
	    		
	    		Set<String> sortedVersions = moduleVersions.get(moduleName);
	    		List<String> listSorted = new ArrayList<String>(sortedVersions);
	    		
	    		Comparator<String> comparator = new Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {
						return o1.compareTo(o2);
					}
	    			
				};
				
				listSorted.sort(comparator);
	    		
	    		moduleVersionsWithSortedArray.put(moduleName, listSorted);
    		} catch (Exception e) {
    			ExceptionHandler.process(e);
    		}
    	}

    	Iterator iterator = beanItem.getImports().listIterator();
    	Map<String, Integer> modulesAdded = new HashMap<String, Integer>();
    	
    	while (iterator.hasNext()) {
    		
    		try {
	    		IMPORTType iteratorObject = (IMPORTType)iterator.next();
	    		
	    		int index = iteratorObject.getMODULE().lastIndexOf('-');
	    		String moduleName = iteratorObject.getMODULE().substring(0, index);
	    		String moduleVersion = iteratorObject.getMODULE().substring(index + 1);
	    		String moduleVersionWithoutJar = moduleVersion.split(".jar")[0].split(".RELEASE")[0].split(".SNAPSHOT")[0];
	    		
	    		List<String> versions = moduleVersionsWithSortedArray.get(moduleName);
	    		
	    		modulesAdded.putIfAbsent(iteratorObject.getMODULE(), 0);
	    		modulesAdded.put(iteratorObject.getMODULE(), modulesAdded.get(iteratorObject.getMODULE()) + 1);
	
	    		boolean cond0 = modulesAdded.get(iteratorObject.getMODULE()) >= 2;
				boolean cond1 = versions.size() > 1;
				boolean cond2 = cond1 && !versions.get(versions.size() - 1).equals(moduleVersionWithoutJar);
				boolean cond3 = versions.contains(moduleVersionWithoutJar);
				
	    		if (cond0 || (cond1 && cond2 && cond3)) {
	
	    		    String message = String.format("Removing duplicate bean module: %s", iteratorObject.getMODULE());
	    			
	    	        generateReportRecord(new MigrationReportRecorder(this,
	    	                MigrationReportRecorder.MigrationOperationType.MODIFY, beanItem, null, message, null, null));
	    			
	    			iterator.remove();
	    		} 
    		} catch (Exception e) {
				ExceptionHandler.process(e);
    		}
    	}
    }
}
