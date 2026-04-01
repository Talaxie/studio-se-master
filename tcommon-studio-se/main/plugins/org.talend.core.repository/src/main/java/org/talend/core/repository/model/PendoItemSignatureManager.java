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
package org.talend.core.repository.model;

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
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.ICoreService;
import org.talend.core.PluginChecker;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.RoutineItem;
import org.talend.core.model.properties.SQLPatternItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.pendo.AbstractPendoTrackManager;
import org.talend.core.pendo.PendoDataTrackFactory;
import org.talend.core.pendo.PendoItemSignatureUtil;
import org.talend.core.pendo.PendoItemSignatureUtil.SignatureStatus;
import org.talend.core.pendo.PendoItemSignatureUtil.TOSProdNameEnum;
import org.talend.core.pendo.PendoItemSignatureUtil.ValueEnum;
import org.talend.core.pendo.PendoTrackDataUtil;
import org.talend.core.pendo.TrackEvent;
import org.talend.core.pendo.properties.IPendoDataProperties;
import org.talend.core.pendo.properties.PendoSignLogonProperties;
import org.talend.utils.migration.MigrationTokenUtil;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoItemSignatureManager extends AbstractPendoTrackManager {

    private static PendoItemSignatureManager manager;

    private static boolean isTrackAvailable;

    static {
        manager = new PendoItemSignatureManager();
        try {
            isTrackAvailable = PluginChecker.isTIS() && PendoDataTrackFactory.getInstance().isTrackSendAvailable();
        } catch (Exception e) {
            ExceptionHandler.process(e, Level.WARN);
        }
    }

    private PendoItemSignatureManager() {
    }

    public static PendoItemSignatureManager getInstance() {
        return manager;
    }

    private Set<String> signByLoginMigrationItems = new HashSet<String>();

    public void countItemSignByMigration(String file) {
        if (!isTrackAvailable) {
            return;
        }
        if (!ProxyRepositoryFactory.getInstance().isFullLogonFinished()) {
            signByLoginMigrationItems.add(file);
        }
    }

    public IPendoDataProperties collectProperties() {
        ICoreService coreService = ICoreService.get();
        if (coreService == null || !isTrackAvailable) {
            return null;
        }
        PendoSignLogonProperties itemSignProperties = new PendoSignLogonProperties();
        try {
            itemSignProperties.setSignByMigration(signByLoginMigrationItems.size());

            String seperator = "@";
            Map<String, Integer> tosUnsignItemMap = new HashMap<String, Integer>();
            Map<String, Integer> invalidItemVersionMap = new HashMap<String, Integer>();
            Set<String> checkedItem = new HashSet<String>();
            ProxyRepositoryFactory proxyRepositoryFactory = ProxyRepositoryFactory.getInstance();
            ERepositoryObjectType[] types = (ERepositoryObjectType[]) ERepositoryObjectType.values();
            for (ERepositoryObjectType type : types) {
                List<IRepositoryViewObject> allObjectList = proxyRepositoryFactory.getAll(type);
                for (IRepositoryViewObject repositoryObject : allObjectList) {
                    Property property = repositoryObject.getProperty();
                    if (property == null || property.eResource() == null) {
                        continue;
                    }
                    String itemKey = repositoryObject.getRepositoryObjectType() + seperator + property.getId() + seperator
                            + property.getVersion();
                    if (isBuiltInItem(repositoryObject) || checkedItem.contains(itemKey)) {
                        continue;
                    }
                    checkedItem.add(itemKey);
                    Integer verifyResult = null;
                    try {
                        verifyResult = coreService.getSignatureVerifyResult(property, null, false);
                        if (verifyResult != null) {
                            switch (verifyResult) {
                            case SignatureStatus.V_VALID:
                                itemSignProperties.setValidItems(itemSignProperties.getValidItems() + 1);
                                break;
                            case SignatureStatus.V_UNSIGNED:
                                String itemProductName = PendoItemSignatureUtil
                                        .getItemProductName(property);
                                if (StringUtils.isNotBlank(itemProductName)) {
                                    String tosCategory = TOSProdNameEnum.getTOSCategoryByProdName(itemProductName);
                                    if (StringUtils.isBlank(tosCategory)) {
                                        itemSignProperties.setUnsignEEItems(itemSignProperties.getUnsignEEItems() + 1);
                                    } else {
                                        if (tosUnsignItemMap.get(tosCategory) == null) {
                                            tosUnsignItemMap.put(tosCategory, 0);
                                        }
                                        tosUnsignItemMap.put(tosCategory, tosUnsignItemMap.get(tosCategory) + 1);
                                    }
                                }
                                addInvalidItemVersion(property, invalidItemVersionMap);
                                break;
                            default:
                                addInvalidItemVersion(property, invalidItemVersionMap);
                                itemSignProperties.setInvalidSignItems(itemSignProperties.getInvalidSignItems() + 1);
                            }

                        }
                    } catch (Exception e) {
                        ExceptionHandler.process(e, Level.WARN);
                        if (verifyResult == null) {
                            // exception during verify
                            addInvalidItemVersion(property, invalidItemVersionMap);
                            itemSignProperties.setInvalidSignItems(itemSignProperties.getInvalidSignItems() + 1);
                        }
                    }
                }
            }

            itemSignProperties.setInvalidItemSourceVersion(getSortInvalidItems(invalidItemVersionMap));
            itemSignProperties.setUnsignSEItems(getSortTOSUnsignItems(tosUnsignItemMap));

            itemSignProperties.setStudioVersion(PendoItemSignatureUtil.getStudioVersion());
            if (coreService.isInValidGP()) {
                itemSignProperties.setGracePeriod(ValueEnum.YES.getDisplayValue());
            } else {
                itemSignProperties.setGracePeriod(ValueEnum.NO.getDisplayValue());
            }
            String prodDate = PendoItemSignatureUtil.formatDate(System.getProperty(PendoItemSignatureUtil.PROD_DATE_ID),
                    "yyyy-MM-dd");
            itemSignProperties.setInstallDate(prodDate);
            String projectCreateDate = PendoItemSignatureUtil.getCurrentProjectCreateDate();
            itemSignProperties.setProjectCreateDate(PendoItemSignatureUtil.formatDate(projectCreateDate, "yyyy-MM-dd"));

            String value = System.getProperty(PendoItemSignatureUtil.MIGRATION_TOKEN_KEY);
            Map<String, Date> tokenTime = MigrationTokenUtil.getMigrationTokenTime(value);
            if (tokenTime == null || tokenTime.isEmpty()) {
                itemSignProperties.setValidMigrationToken(ValueEnum.NOT_APPLICATE.getDisplayValue());
            } else {
                String customer = coreService.getLicenseCustomer();
                Date tokenDate = tokenTime.get(customer);
                Date currentDate = new Date();
                if (tokenDate != null && tokenDate.after(currentDate)) {
                    itemSignProperties.setValidMigrationToken(ValueEnum.YES.getDisplayValue());
                } else {
                    itemSignProperties.setValidMigrationToken(ValueEnum.NO.getDisplayValue());
                }
            }

        } catch (Exception e) {
            ExceptionHandler.process(e, Level.WARN);
        }
        return itemSignProperties;

    }

    private void addInvalidItemVersion(Property property, Map<String, Integer> invalidItemVersionMap) {
        String itemProductVersion = PendoItemSignatureUtil.getItemProductVersion(property);
        if (StringUtils.isNotBlank(itemProductVersion)) {
            if (invalidItemVersionMap.get(itemProductVersion) == null) {
                invalidItemVersionMap.put(itemProductVersion, 0);
            }
            invalidItemVersionMap.put(itemProductVersion, invalidItemVersionMap.get(itemProductVersion) + 1);
        }
    }

    private boolean isBuiltInItem(IRepositoryViewObject repositoryObject) {
        if (repositoryObject.getProperty().getItem() instanceof SQLPatternItem) {
            SQLPatternItem sqlPatternItem = (SQLPatternItem) repositoryObject.getProperty().getItem();
            if (sqlPatternItem.isSystem()) {
                return true;
            }
        }
        if (repositoryObject.getProperty().getItem() instanceof RoutineItem) {
            RoutineItem routineItem = (RoutineItem) repositoryObject.getProperty().getItem();
            if (routineItem.isBuiltIn()) {
                return true;
            }
        }
        return false;
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

    private String getSortInvalidItems(Map<String, Integer> invalidItemVersionMap) {
        List<Map.Entry<String, Integer>> resultMapList = new ArrayList<Map.Entry<String, Integer>>(
                invalidItemVersionMap.entrySet());
        Collections.sort(resultMapList, new Comparator<Map.Entry<String, Integer>>(){

            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
            
        });
        Map<String, Integer> invalidMap = new LinkedHashMap<String, Integer>();
        resultMapList.forEach(entry -> {
            invalidMap.put(entry.getKey(), entry.getValue());
        });
        return PendoTrackDataUtil.convertEntityJsonString(invalidMap);
    }

    public void sendTrackToPendo() {
        if (!isTrackAvailable) {
            return;
        }
        super.sendTrackToPendo();
    }

    @Override
    public TrackEvent getTrackEvent() {
        return TrackEvent.ITEM_SIGNATURE;
    }

}
