// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.runprocess.maven.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.routines.RoutinesUtil;
import org.talend.designer.maven.tools.CodeM2CacheManager;
import org.talend.repository.ProjectManager;
import org.talend.repository.documentation.ERepositoryActionName;

/**
 * DOC zwxue class global comment. Detailled comment
 */
public class CodesChangeListener implements PropertyChangeListener {

    private List<ERepositoryObjectType> allCodesTypes;

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        try {
            String propertyName = event.getPropertyName();
            Object oldValue = event.getOldValue();
            Object newValue = event.getNewValue();

            if (propertyName.equals(ERepositoryActionName.PROPERTIES_CHANGE.getName())) {
                casePropertiesChange(oldValue, newValue);
            } else if (propertyName.equals(ERepositoryActionName.MOVE.getName())) {
                caseMove(oldValue, newValue);
            } else if (propertyName.equals(ERepositoryActionName.DELETE_FOREVER.getName())) {
                caseDeleteForever(newValue);
            } else if (propertyName.equals(ERepositoryActionName.FOLDER_DELETE.getName())) {
                caseFolderDelete(oldValue, newValue);
            } else if (propertyName.equals(ERepositoryActionName.SAVE.getName())
                    || propertyName.equals(ERepositoryActionName.CREATE.getName())) {
                caseCreateAndSave(propertyName, newValue);
            } else if (propertyName.equals(ERepositoryActionName.IMPORT.getName())) {
                caseImport(propertyName, newValue);
            }
        } catch (Throwable t) {
            // Any exception here must be catched/logged, but it should not block the operations of user
            ExceptionHandler.process(t);
        }
    }

    private void casePropertiesChange(Object oldValue, Object newValue) {
        // oldValue: [oldName, oldVersion], newValue: property
        if (oldValue instanceof String[] && newValue instanceof Property) {
            Property property = (Property) newValue;
            if (needUpdate(property.getItem())) {
                String[] oldFields = (String[]) oldValue;
                if (oldFields.length == 0) {
                    // Do nothing case import project
                    return;
                }
                String oldName = oldFields[0];
                if (!oldName.equals(property.getLabel())) {
                    updateCacheStatus(property);
                }
            }
        }
    }

    private void caseMove(Object oldValue, Object newValue) {
        // oldValue: IRepositoryViewObject, newValue: [sourcePath, targetPath]
        if (oldValue instanceof IRepositoryViewObject && newValue instanceof IPath[]) {
            // delete all version job project, create all version new projects
            IRepositoryViewObject obj = (IRepositoryViewObject) oldValue;
            if (needUpdate(obj.getProperty().getItem())) {
                updateCacheStatus(obj.getProperty());
            }
        }
    }

    private void caseDeleteForever(Object newValue) {
        // newValue: obj
        if (newValue instanceof IRepositoryViewObject) {
            Property property = ((IRepositoryViewObject) newValue).getProperty();
            if (property != null && property.getItem() != null) {
                if (needUpdate(property.getItem())) {
                    updateCacheStatus(property);
                }
            }
        }
    }

    private void caseFolderDelete(Object oldValue, Object newValue) {
        // oldValue: IPath, newValue: type
        if (oldValue instanceof IPath && newValue instanceof ERepositoryObjectType) {
            if (getAllCodesTypes().contains((ERepositoryObjectType) newValue)) {
                updateCacheStatus(null);
            }
        }
    }

    private void caseCreateAndSave(String propertyName, Object newValue) {
        if (newValue instanceof Item) {
            Item item = (Item) newValue;
            if (needUpdate(item)) {
                updateCacheStatus(item.getProperty());
            }
        }
    }

    private void caseImport(String propertyName, Object newValue) {
        if (newValue instanceof Set) {
            Set<Item> importItems = (Set<Item>) newValue;
            for (Item item : importItems) {
                if (needUpdate(item)) {
                    updateCacheStatus(item.getProperty());
                }
            }
        }
    }

    private boolean needUpdate(Item item) {
        if (RoutinesUtil.isInnerCodes(item.getProperty())) {
            return false;
        }
        ERepositoryObjectType type = ERepositoryObjectType.getItemType(item);
        if (type != null) {
            return getAllCodesTypes().contains(type);
        }
        return false;
    }

    private void updateCacheStatus(Property property) {
        String projectTechName;
        if (property == null) {
            projectTechName = ProjectManager.getInstance().getCurrentProject().getTechnicalLabel();
        } else {
            projectTechName = ProjectManager.getInstance().getProject(property).getTechnicalLabel();
        }
        CodeM2CacheManager.updateCacheStatus(projectTechName, ERepositoryObjectType.getItemType(property.getItem()), false);
    }

    private List<ERepositoryObjectType> getAllCodesTypes() {
        if (allCodesTypes == null) {
            allCodesTypes = ERepositoryObjectType.getAllTypesOfCodes();
        }
        return allCodesTypes;
    }

}
