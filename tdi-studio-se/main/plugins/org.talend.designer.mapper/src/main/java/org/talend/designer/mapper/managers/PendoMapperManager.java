// ============================================================================
//
// Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.mapper.managers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.language.LanguageManager;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.types.JavaType;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.pendo.AbstractPendoTrackManager;
import org.talend.core.pendo.PendoTrackDataUtil;
import org.talend.core.pendo.TrackEvent;
import org.talend.core.pendo.properties.IPendoDataProperties;
import org.talend.core.pendo.properties.PendoTMapProperties;
import org.talend.designer.abstractmap.model.tableentry.IColumnEntry;
import org.talend.designer.abstractmap.ui.visualmap.link.IMapperLink;
import org.talend.designer.abstractmap.ui.visualmap.link.PointLinkDescriptor;
import org.talend.designer.mapper.language.LanguageProvider;
import org.talend.designer.mapper.model.table.AbstractDataMapTable;
import org.talend.designer.mapper.model.tableentry.TableEntryLocation;
import org.talend.designer.mapper.ui.visualmap.zone.Zone;
import org.talend.designer.mapper.utils.DataMapExpressionParser;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoMapperManager extends AbstractPendoTrackManager {

    private MapperManager mapperManager;

    private DataMapExpressionParser dataMapExpressionParser;

    public PendoMapperManager(MapperManager mapperManager) {
        super();
        this.mapperManager = mapperManager;
        this.dataMapExpressionParser = new DataMapExpressionParser(LanguageProvider.getCurrentLanguage());
    }

    @Override
    public IPendoDataProperties collectProperties() {
        String[] mainInputTable = new String[1];
        PendoTMapProperties properties = new PendoTMapProperties();
        mapperManager.getInputTables().forEach(table -> {
            if (EConnectionType.FLOW_MAIN.equals(table.getConnection().getConnectionType())) {
                mainInputTable[0] = table.getName();
            } else {
                // except main table, default value left join
                if (table.isInnerJoin()) {
                    properties.setInnerJoinCounts(properties.getInnerJoinCounts() + 1);
                } else {
                    properties.setLeftJoinCounts(properties.getLeftJoinCounts() + 1);
                }
            }
            if (table.isActivateExpressionFilter() && StringUtils.isNotBlank(table.getExpressionFilter().getExpression())) {
                properties.setFilterCounts(properties.getFilterCounts() + 1);
            }
            properties.setInputColumns(incrementTableColumnsCount(table, properties.getInputColumns()));
            collectExpressionMapping(table, properties);
        });

        properties.setOutputNumber(mapperManager.getOutputTables().size());
        Map<String, Integer> fieldTypes = new HashMap<String, Integer>();
        mapperManager.getOutputTables().forEach(table -> {
            if (table.isActivateExpressionFilter() && StringUtils.isNotBlank(table.getExpressionFilter().getExpression())) {
                properties.setFilterCounts(properties.getFilterCounts() + 1);
            }
            properties.setOutputColumns(incrementTableColumnsCount(table, properties.getOutputColumns()));
            collectMetadataFieldTypes(table.getMetadataTable(), fieldTypes);
            collectExpressionMapping(table, properties);
        });
        properties.setOutputFieldTypes(PendoTrackDataUtil.convertEntityJsonString(fieldTypes));

        mapperManager.getVarsTables().forEach(table -> {
            if (!table.getColumnEntries().isEmpty()) {
                properties.setVarColumns(incrementTableColumnsCount(table, properties.getVarColumns()));
                collectExpressionMapping(table, properties);
            }
        });

        String seperator = "@";
        Map<String, List<IMapperLink>> inputlinkMap = new HashMap<String, List<IMapperLink>>();
        Map<String, List<IMapperLink>> outputlinkMap = new HashMap<String, List<IMapperLink>>();
        Map<String, List<IMapperLink>> linkFromVarMap = new HashMap<String, List<IMapperLink>>();
        Map<String, List<IMapperLink>> linkToVarMap = new HashMap<String, List<IMapperLink>>();
        mapperManager.getLinks().forEach(link->{
            PointLinkDescriptor linkFrom = link.getPointLinkDescriptor1();
            PointLinkDescriptor linkTo = link.getPointLinkDescriptor2();
            if (linkTo.getTableEntry() instanceof IColumnEntry) {
                if (Zone.INPUTS.equals(linkFrom.getZone())) {
                    if (Zone.INPUTS.equals(linkTo.getZone())) {
                        properties.setJoinMappingCounts(properties.getJoinMappingCounts() + 1);
                    } else if (Zone.OUTPUTS.equals(linkTo.getZone())) {
                        properties.setInputOutputMappings(properties.getInputOutputMappings() + 1);

                    } else if (Zone.VARS.equals(linkTo.getZone())) {
                        properties.setInputVarMappings(properties.getInputVarMappings() + 1);

                        String varKey = linkTo.getTableEntry().getName();
                        if (linkToVarMap.get(varKey) == null) {
                            linkToVarMap.put(varKey, new ArrayList<IMapperLink>());
                        }
                        linkToVarMap.get(varKey).add(link);
                    }
                } else if (Zone.VARS.equals(linkFrom.getZone()) && Zone.OUTPUTS.equals(linkTo.getZone())) {
                    properties.setVarOutputMappings(properties.getVarOutputMappings() + 1);

                    String varKey = linkFrom.getTableEntry().getName();
                    if (linkFromVarMap.get(varKey) == null) {
                        linkFromVarMap.put(varKey, new ArrayList<IMapperLink>());
                    }
                    linkFromVarMap.get(varKey).add(link);
                }
                
                if (!Zone.INPUTS.equals(linkTo.getZone())) {
                    // except join mapping
                    if (Zone.INPUTS.equals(linkFrom.getZone())) {
                        String inMapkey = linkFrom.getTableEntry().getParentName() + seperator
                                + linkFrom.getTableEntry().getName();
                        if (inputlinkMap.get(inMapkey) == null) {
                            inputlinkMap.put(inMapkey, new ArrayList<IMapperLink>());
                        }
                        inputlinkMap.get(inMapkey).add(link);
                    }

                    if (Zone.OUTPUTS.equals(linkTo.getZone())) {
                        String outMapKey = linkTo.getTableEntry().getParentName() + seperator + linkTo.getTableEntry().getName();
                        if (outputlinkMap.get(outMapKey) == null) {
                            outputlinkMap.put(outMapKey, new ArrayList<IMapperLink>());
                        }
                        outputlinkMap.get(outMapKey).add(link);
                    }
                }
            }

        });
        
        inputlinkMap.forEach((key, value) -> {
            // along the link flow to check
            int destinations = countLinkDestinations(value, linkFromVarMap);
            if (destinations > 1)
                properties.setOneToNMappings(properties.getOneToNMappings() + 1);
        });

        outputlinkMap.forEach((key, value) -> {
            // reverse the link flow to check
            int destinations = countLinkDestinations(value, linkToVarMap);
            if (destinations > 1)
                properties.setnToOneMappings(properties.getnToOneMappings() + 1);
        });

        Map<String, Set<String>> sourceToDestinationTable = collectSourceToDestinationTable(inputlinkMap, linkFromVarMap,
                seperator);
        sourceToDestinationTable.forEach((key, value) -> {
            if (key.equals(mainInputTable[0]))
                properties.setDestinationNumber(value.size());
            if (value.size() > 0)
                properties.setSourceNumber(properties.getSourceNumber() + 1);
        });

        return properties;
    }

    private int incrementTableColumnsCount(AbstractDataMapTable table, int originValue) {
        int count = table.getTableColumnsEntriesModel().getBeanCount();
        return count + originValue;
    }

    private void collectMetadataFieldTypes(IMetadataTable metadataTable, Map<String, Integer> fieldTypes) {
        metadataTable.getListColumns().forEach(column -> {
            String type = column.getTalendType();
            if (StringUtils.isNotBlank(type)) {
                type = getDisplayColumnType(type);
                if (fieldTypes.get(type) == null) {
                    fieldTypes.put(type, 1);
                } else {
                    fieldTypes.put(type, fieldTypes.get(type) + 1);
                }
            }
        });

    }

    private String getDisplayColumnType(String type) {
        String displayType = type;
        if (ECodeLanguage.JAVA.equals(LanguageManager.getCurrentLanguage())) {
            JavaType javaType = JavaTypesManager.getJavaTypeFromId(type);
            if (javaType != null) {
                if (type.equals(JavaTypesManager.DIRECTORY.getId()) || type.equals(JavaTypesManager.FILE.getId())
                        || type.equals(JavaTypesManager.VALUE_LIST.getId())) {
                    displayType = javaType.getLabel();
                } else {
                    displayType = javaType.getNullableClass().getSimpleName();
                }
            }
        }
        return displayType;
    }

    private void collectExpressionMapping(AbstractDataMapTable table, PendoTMapProperties properties) {
        table.getColumnEntries().forEach(column -> {
            if (StringUtils.isNotBlank(column.getExpression())) {
                TableEntryLocation[] entryLocations = null;
                try {
                    entryLocations = dataMapExpressionParser.parseTableEntryLocations(column.getExpression());
                } catch (Exception e) {
                }

                if (entryLocations != null) {
                    if (entryLocations.length == 1) {
                        TableEntryLocation loc = entryLocations[0];
                        String variable = getSimpleExpression(loc.tableName, loc.columnName);
                        if (variable.equals(column.getExpression().trim())) {
                            properties.setSimpleExpressions(properties.getSimpleExpressions() + 1);
                        } else {
                            properties.setTransformExpressions(properties.getTransformExpressions() + 1);
                        }
                    } else {
                        properties.setTransformExpressions(properties.getTransformExpressions() + 1);
                    }
                }
            }
        });

    }

    private String getSimpleExpression(String tableName, String columnName) {
        return LanguageProvider.getCurrentLanguage().getLocation(tableName, columnName);
    }

    private int countLinkDestinations(List<IMapperLink> linkList, Map<String, List<IMapperLink>> refVarMap) {
        int count = 0;
        for (IMapperLink link : linkList) {
            PointLinkDescriptor linkFrom = link.getPointLinkDescriptor1();
            PointLinkDescriptor linkTo = link.getPointLinkDescriptor2();
            if (!Zone.VARS.equals(linkFrom.getZone()) && !Zone.VARS.equals(linkTo.getZone())) {
                count++;
                continue;
            }

            String varName = null;
            if (Zone.VARS.equals(linkTo.getZone())) {
                varName = linkTo.getTableEntry().getName();
            } else if (Zone.VARS.equals(linkFrom.getZone())) {
                varName = linkFrom.getTableEntry().getName();
            }
            if (StringUtils.isNotBlank(varName)) {
                if (refVarMap.get(varName) != null && refVarMap.get(varName).size() > 0) {
                    count += refVarMap.get(varName).size();
                } else if (Zone.VARS.equals(linkFrom.getZone())) {
                    // reverse the link flow to count this var
                    count++;
                }
            }
        }
        return count;
    }

    private Map<String, Set<String>> collectSourceToDestinationTable(Map<String, List<IMapperLink>> inputlinkMap,
            Map<String, List<IMapperLink>> refVarMap, String seperator) {
        Map<String, Set<String>> sourceDestMap = new HashMap<String, Set<String>>();
        for (String inputKey : inputlinkMap.keySet()) {
            String[] keySplit = inputKey.split(seperator);
            if (keySplit.length < 1 || StringUtils.isBlank(keySplit[0])) {
                continue;
            }
            String inputTable = keySplit[0];
            if (sourceDestMap.get(inputTable) == null) {
                sourceDestMap.put(inputTable, new HashSet<String>());
            }

            for (IMapperLink link : inputlinkMap.get(inputKey)) {
                PointLinkDescriptor linkTo = link.getPointLinkDescriptor2();
                if (Zone.OUTPUTS.equals(linkTo.getZone())) {
                    sourceDestMap.get(inputTable).add(linkTo.getTableEntry().getParentName());
                }else if (Zone.VARS.equals(linkTo.getZone())) {
                    String varName = linkTo.getTableEntry().getName();
                    List<IMapperLink> outLinks = refVarMap.get(varName);
                    if (outLinks != null) {
                        for (IMapperLink outLink : outLinks) {
                            PointLinkDescriptor varLinkTo = outLink.getPointLinkDescriptor2();
                            sourceDestMap.get(inputTable).add(varLinkTo.getTableEntry().getParentName());
                        }
                    }
                }
            }
        }
        return sourceDestMap;
    }

    @Override
    public TrackEvent getTrackEvent() {
        return TrackEvent.TMAP;
    }
}
