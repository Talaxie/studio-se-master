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
package org.talend.core.model.metadata;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;

/**
 * created by rdubois on 30 juil. 2015 Detailled comment
 *
 */
public class MetadataTalendTypeFilterTest {

    private static final String INTEGER = "Integer"; //$NON-NLS-1$

    private static final String DOCUMENT = "Document"; //$NON-NLS-1$

    private static final String STRING = "String"; //$NON-NLS-1$

    private static final String OBJECT = "Object"; //$NON-NLS-1$

    private static final String LIST = "List"; //$NON-NLS-1$

    private static final String DOUBLE = "Double"; //$NON-NLS-1$

    private static final String SHORT = "Short"; //$NON-NLS-1$

    private static final String DYNAMIC = "Dynamic"; //$NON-NLS-1$

    private static final String VECTOR = "Vector"; //$NON-NLS-1$

    private INode node;

    @Before
    public void createMocks() {
        IElementParameter param = mock(IElementParameter.class);
        when(param.getValue()).thenReturn(Boolean.TRUE);
        INode configNode = mock(INode.class);
        when(configNode.getElementParameter("USE_DATASET_API")).thenReturn(param);
        IProcess process = mock(IProcess.class);
        List<INode> configNodes = Arrays.asList(configNode);
        doReturn(configNodes).when(process).getNodesOfType("tSparkConfiguration");
        node = mock(INode.class);
        when(node.getProcess()).thenReturn(process);
    }

    @Test
    public void filterStringTest() {
        String[] types;
        MetadataTalendTypeFilter dummyfilter = new DummyMetadataTalendTypeFilter();
        MetadataTalendTypeFilter mrfilter = new MrMetadataTalendTypeFilter();
        MetadataTalendTypeFilter sparkfilter = new SparkMetadataTalendTypeFilter(""); //$NON-NLS-1$
        MetadataTalendTypeFilter sparkWithtRowGeneratorfilter = new SparkMetadataTalendTypeFilter("tRowGenerator"); //$NON-NLS-1$
        MetadataTalendTypeFilter sparkWithtFileInputParquetfilter = new SparkMetadataTalendTypeFilter("tFileInputParquet"); //$NON-NLS-1$
        MetadataTalendTypeFilter stormfilter = new StormMetadataTalendTypeFilter(""); //$NON-NLS-1$
        IComponent component = mock(IComponent.class);
        when(component.getName()).thenReturn("");
        when(node.getComponent()).thenReturn(component);

        MetadataTalendTypeFilter sparkBatchFilter = new SparkBatchMetadataTalendTypeFilter(node);

        types = new String[] { INTEGER, DOCUMENT, STRING, OBJECT, LIST, DOUBLE, SHORT, DYNAMIC, VECTOR };
        assertEquals(Arrays.asList(dummyfilter.filter(types)),
                Arrays.asList(new String[] { INTEGER, DOCUMENT, STRING, OBJECT, LIST, DOUBLE, SHORT, DYNAMIC }));
        assertEquals(Arrays.asList(mrfilter.filter(types)), Arrays.asList(new String[] { INTEGER, STRING, DOUBLE, SHORT }));
        assertEquals(Arrays.asList(sparkfilter.filter(types)),
                Arrays.asList(new String[] { INTEGER, STRING, OBJECT, LIST, DOUBLE, SHORT, VECTOR }));
        assertEquals(Arrays.asList(sparkWithtRowGeneratorfilter.filter(types)),
                Arrays.asList(new String[] { INTEGER, STRING, LIST, DOUBLE, SHORT, VECTOR }));
        assertEquals(Arrays.asList(sparkWithtFileInputParquetfilter.filter(types)),
                Arrays.asList(new String[] { INTEGER, STRING, DOUBLE, SHORT }));
        assertEquals(Arrays.asList(stormfilter.filter(types)),
                Arrays.asList(new String[] { INTEGER, STRING, OBJECT, LIST, DOUBLE, SHORT }));
        assertEquals(Arrays.asList(sparkBatchFilter.filter(types)),
                Arrays.asList(new String[] { INTEGER, STRING, OBJECT, LIST, DOUBLE, SHORT, VECTOR }));

        types = new String[] {};
        assertEquals(Arrays.asList(dummyfilter.filter(types)), Arrays.asList(new String[] {}));
        assertEquals(Arrays.asList(mrfilter.filter(types)), Arrays.asList(new String[] {}));
        assertEquals(Arrays.asList(sparkfilter.filter(types)), Arrays.asList(new String[] {}));
        assertEquals(Arrays.asList(sparkWithtRowGeneratorfilter.filter(types)), Arrays.asList(new String[] {}));
        assertEquals(Arrays.asList(sparkWithtFileInputParquetfilter.filter(types)), Arrays.asList(new String[] {}));
        assertEquals(Arrays.asList(stormfilter.filter(types)), Arrays.asList(new String[] {}));

        types = new String[] { INTEGER, STRING, DOUBLE, SHORT };
        assertEquals(Arrays.asList(dummyfilter.filter(types)), Arrays.asList(new String[] { INTEGER, STRING, DOUBLE, SHORT }));
        assertEquals(Arrays.asList(mrfilter.filter(types)), Arrays.asList(new String[] { INTEGER, STRING, DOUBLE, SHORT }));
        assertEquals(Arrays.asList(sparkfilter.filter(types)), Arrays.asList(new String[] { INTEGER, STRING, DOUBLE, SHORT }));
        assertEquals(Arrays.asList(sparkWithtRowGeneratorfilter.filter(types)),
                Arrays.asList(new String[] { INTEGER, STRING, DOUBLE, SHORT }));
        assertEquals(Arrays.asList(sparkWithtFileInputParquetfilter.filter(types)),
                Arrays.asList(new String[] { INTEGER, STRING, DOUBLE, SHORT }));
        assertEquals(Arrays.asList(stormfilter.filter(types)), Arrays.asList(new String[] { INTEGER, STRING, DOUBLE, SHORT }));

        types = new String[] { DOCUMENT, OBJECT, LIST, DYNAMIC, VECTOR };
        assertEquals(Arrays.asList(dummyfilter.filter(types)), Arrays.asList(new String[] { DOCUMENT, OBJECT, LIST, DYNAMIC }));
        assertEquals(Arrays.asList(mrfilter.filter(types)), Arrays.asList(new String[] {}));
        assertEquals(Arrays.asList(sparkfilter.filter(types)), Arrays.asList(new String[] { OBJECT, LIST, VECTOR }));
        assertEquals(Arrays.asList(sparkWithtRowGeneratorfilter.filter(types)), Arrays.asList(new String[] { LIST, VECTOR }));
        assertEquals(Arrays.asList(sparkWithtFileInputParquetfilter.filter(types)), Arrays.asList(new String[] {}));
        assertEquals(Arrays.asList(stormfilter.filter(types)), Arrays.asList(new String[] { OBJECT, LIST }));
    }

    @Test
    public void sparkDynamicTypeTest() {
        String[] types = new String[] { INTEGER, DOCUMENT, STRING, OBJECT, LIST, DOUBLE, SHORT, DYNAMIC, VECTOR };
        List<String> components = Arrays.asList(
                "tAggregateRow","tAlgoTemplate","tAvroInput","tAvroMap","tAvroOutput","tBigQueryInput","tBigQueryOutput","tCacheIn","tCacheOut","tCassandraInput","tCassandraOutput","tCollectAndCheck","tConvertType","tDataprepRun","tDeltaLakeInput","tDeltaLakeOutput","tDenormalize","tDynamoDBInput","tDynamoDBOutput","tElasticSearchInput","tElasticSearchOutput","tExtractDelimitedFields","tExtractFullRow","tExtractJSONFields","tExtractPositionalFields","tExtractRegexFields","tExtractXMLField","tFileInputDelimited","tFileInputFullRow","tFileInputJSON","tFileInputParquet","tFileInputPositional","tFileInputRegex","tFileInputXML","tFileOutputDelimited","tFileOutputJSON","tFileOutputParquet","tFileOutputPositional","tFileOutputXML","tFilterColumns","tFilterRow","tFixedFlowInput","tHBaseInput","tHBaseOutput","tHiveInput","tHiveOutput","tInputFormatAvro","tInputFormatJSON","tInputFormatXML","tJava","tJavaRow","tJDBCInput","tJDBCOutput","tKuduInput","tKuduOutput","tLogRow","tMap","tMapRDBInput","tMapRDBOutput","tMongoDBInput","tMongoDBOutput","tMysqlInput","tMysqlOutput","tNormalize","tOracleInput","tOracleOutput","tPartition","tPredictTemplate","tRedshiftInput","tRedshiftOutput","tReplace","tReplicate","tRowGenerator","tSample","tSchemaComplianceCheck","tSnowflakeInput","tSnowflakeOutput","tSortRow","tSparkOutput","tSqlRow","tTeradataInput","tTeradataOutput","tTop","tTopBy","tUniqRow","tUnite","tWriteJSONField"
                );
        IComponent component = mock(IComponent.class);
        when(node.getComponent()).thenReturn(component);
        List<String> compatibleComponents = components.stream().filter(componentName -> {
            when(component.getName()).thenReturn(componentName);
            return Arrays.asList(new SparkBatchMetadataTalendTypeFilter(node).filter(types)).contains(DYNAMIC);
        }).collect(Collectors.toList());
        
        List<String> dynamicTypeCompatibleComponents = new ArrayList<String>();
        dynamicTypeCompatibleComponents.addAll(SparkBatchMetadataTalendTypeFilter.dynamicTypeCompatibleComponents);              
        Collections.sort(dynamicTypeCompatibleComponents, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });
        
        assertEquals(dynamicTypeCompatibleComponents, compatibleComponents);
    }

}
