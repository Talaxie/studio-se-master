// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.items.importexport.handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Level;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.properties.Property;
import org.talend.core.pendo.AbstractPendoTrackManager;
import org.talend.core.pendo.PendoDataTrackFactory;
import org.talend.core.pendo.PendoItemSignatureUtil;
import org.talend.core.pendo.PendoItemSignatureUtil.SignatureStatus;
import org.talend.core.pendo.PendoItemSignatureUtil.TOSProdNameEnum;
import org.talend.core.pendo.PendoItemSignatureUtil.ValueEnum;
import org.talend.core.pendo.PendoTrackDataUtil;
import org.talend.core.pendo.TrackEvent;
import org.talend.core.pendo.properties.IPendoDataProperties;
import org.talend.core.pendo.properties.PendoSignImportProperties;
import org.talend.core.services.ICoreTisService;
import org.talend.repository.items.importexport.handlers.model.ImportItem;
import org.talend.utils.migration.MigrationTokenUtil;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoImportManager extends AbstractPendoTrackManager {

    private static final String seperator = "@";

    private static boolean isTrackAvailable;

    static {
        try {
            isTrackAvailable = PendoDataTrackFactory.getInstance().isTrackSendAvailable();
        } catch (Exception e) {
            ExceptionHandler.process(e, Level.WARN);
        }
    }

    private boolean isStudioImport;

    private PendoSignImportProperties importProperties = new PendoSignImportProperties();

    // sourceVersion based on item. the project version item created/modified
    private Set<String> projectVersionSet = new HashSet<String>();

    // productVersion based on talend.project. possible list multiple projects on import wizard.
    private Set<String> importProductVersion = new HashSet<String>();

    private Map<String, Integer> tosUnsignItemMap = new HashMap<String, Integer>();

    private Map<String, Property> itemPropertyCache = new HashMap<String, Property>();

    public void cacheItemProperty(List<ImportItem> importItemList) {
        try {
            // in case property change
            importItemList.forEach(importItem -> {
                Property property = importItem.getProperty();
                if (property!=null) {
                    String key = property.getId() + seperator + property.getVersion();
                    Property propertyClone = EcoreUtil.copy(property);
                    itemPropertyCache.put(key, propertyClone);
                }
            });
        } catch (Exception e) {
            ExceptionHandler.process(e, Level.WARN);
        }
    }

    public void countItem(ImportItem itemRecord) {
        if (!isTrackRequired()) {
            return;
        }
        try {
            Property property = getCachedProperty(itemRecord);
            if (property == null) {
                property = itemRecord.getProperty();
            }
            ICoreTisService tisService = ICoreTisService.get();
            if (tisService != null) {
                Integer verifyResult = tisService.getSignatureVerifyResult(itemRecord.getProperty(), itemRecord.getPath(), false);
                if (itemRecord.getProperty() != null && itemRecord.getProperty().eResource() != null && verifyResult == null) {
                    // item no need to sign
                    importProperties.setValidItems(importProperties.getValidItems() + 1);
                } else {
                    switch (verifyResult) {
                    case SignatureStatus.V_VALID:
                        importProperties.setValidItems(importProperties.getValidItems() + 1);
                        break;
                    case SignatureStatus.V_UNSIGNED:
                        String itemProductName = PendoItemSignatureUtil.getItemProductName(property);
                        if (StringUtils.isNotBlank(itemProductName)) {
                            String tosCategory = TOSProdNameEnum.getTOSCategoryByProdName(itemProductName);
                            if (StringUtils.isBlank(tosCategory)) {
                                importProperties.setUnsignEEItems(importProperties.getUnsignEEItems() + 1);
                            } else {
                                if (tosUnsignItemMap.get(tosCategory) == null) {
                                    tosUnsignItemMap.put(tosCategory, 0);
                                }
                                tosUnsignItemMap.put(tosCategory, tosUnsignItemMap.get(tosCategory) + 1);
                            }
                        }
                        break;
                    }
                }
            }
            String itemProductVersion = PendoItemSignatureUtil.getItemProductVersion(property);
            if (StringUtils.isNotBlank(itemProductVersion)) {
                projectVersionSet.add(itemProductVersion);
            }
            if (itemRecord.getItemProject() != null && StringUtils.isNotBlank(itemRecord.getItemProject().getProductVersion())) {
                importProductVersion.add(itemRecord.getItemProject().getProductVersion());
            }
        } catch (Exception e) {
            ExceptionHandler.process(e, Level.WARN);
        }
    }

    public IPendoDataProperties collectProperties() {
        if (!isTrackRequired()) {
            return null;
        }

        importProperties.setUnsignSEItems(getSortTOSUnsignItems(tosUnsignItemMap));
        List<String> sourceVersion = new ArrayList<String>(projectVersionSet);
        Collections.sort(sourceVersion);
        importProperties.setSourceVersion(sourceVersion);
        List<String> productVersion = new ArrayList<String>(importProductVersion);
        Collections.sort(productVersion);
        importProperties.setImportProduct(productVersion);

        importProperties.setStudioVersion(PendoItemSignatureUtil.getStudioVersion());
        ICoreTisService tisService = ICoreTisService.get();
        if (tisService != null) {
            if (tisService.isInValidGP()) {
                importProperties.setGracePeriod(ValueEnum.YES.getDisplayValue());
            } else {
                importProperties.setGracePeriod(ValueEnum.NO.getDisplayValue());
            }
        }
        String prodDate = PendoItemSignatureUtil.formatDate(System.getProperty(PendoItemSignatureUtil.PROD_DATE_ID),
                "yyyy-MM-dd");
        importProperties.setInstallDate(prodDate);
        String projectCreateDate = PendoItemSignatureUtil.getCurrentProjectCreateDate();
        importProperties.setProjectCreateDate(PendoItemSignatureUtil.formatDate(projectCreateDate, "yyyy-MM-dd"));

        String value = System.getProperty(PendoItemSignatureUtil.MIGRATION_TOKEN_KEY);
        Map<String, Date> tokenTime = MigrationTokenUtil.getMigrationTokenTime(value);
        if (tokenTime == null || tokenTime.isEmpty()) {
            importProperties.setValidMigrationToken(ValueEnum.NOT_APPLICATE.getDisplayValue());
        } else if (tisService != null) {
            String customer = tisService.getLicenseCustomer();
            Date tokenDate = tokenTime.get(customer);
            Date currentDate = new Date();
            if (tokenDate != null && tokenDate.after(currentDate)) {
                importProperties.setValidMigrationToken(ValueEnum.YES.getDisplayValue());
            } else {
                importProperties.setValidMigrationToken(ValueEnum.NO.getDisplayValue());
            }
        }
        return importProperties;
    }

    private String getSortTOSUnsignItems(Map<String, Integer> tosUnsignItemMap) {
        List<Map.Entry<String, Integer>> resultMapList = new ArrayList<Map.Entry<String, Integer>>(tosUnsignItemMap.entrySet());
        Collections.sort(resultMapList, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                List<TOSProdNameEnum> categoryList = Arrays.asList(TOSProdNameEnum.values());
                TOSProdNameEnum category1 = TOSProdNameEnum.valueOf(o1.getKey());
                TOSProdNameEnum category2 = TOSProdNameEnum.valueOf(o2.getKey());
                return categoryList.indexOf(category1) - categoryList.indexOf(category2);
            }
        });
        Map<String, Integer> tosUnsignMap = new LinkedHashMap<String, Integer>();
        resultMapList.forEach(entry -> {
            tosUnsignMap.put(entry.getKey(), entry.getValue());
        });
        return PendoTrackDataUtil.convertEntityJsonString(tosUnsignMap);
    }

    private Property getCachedProperty(ImportItem itemRecord) {
        Property property = null;
        Property recordProperty = itemRecord.getProperty();
        if (recordProperty != null) {
            String key = recordProperty.getId() + seperator + recordProperty.getVersion();
            return itemPropertyCache.get(key);
        }
        return property;
    }


    public boolean isTrackRequired() {
        return ICoreTisService.get() != null && isStudioImport && isTrackAvailable;
    }

    public void setStudioImport(boolean isStudioImport) {
        this.isStudioImport = isStudioImport;
    }

    public Set<String> getProjectVersionSet() {
        return projectVersionSet;
    }

    public Map<String, Integer> getTosUnsignItemMap() {
        return tosUnsignItemMap;
    }

    public PendoSignImportProperties getImportProperties() {
        return importProperties;
    }

    public void sendTrackToPendo() {
        if (!isTrackRequired()) {
            return;
        }
        super.sendTrackToPendo();
    }

    @Override
    public TrackEvent getTrackEvent() {
        return TrackEvent.ITEM_IMPORT;
    }


}
