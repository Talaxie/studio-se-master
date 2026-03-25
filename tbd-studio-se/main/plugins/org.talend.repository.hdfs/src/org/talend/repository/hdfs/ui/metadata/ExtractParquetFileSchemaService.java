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
package org.talend.repository.hdfs.ui.metadata;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EMap;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ILibraryManagerService;
import org.talend.core.classloader.DynamicClassLoader;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.components.IComponentsService;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.MetadataColumn;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.utils.ReflectionUtils;
import org.talend.designer.hdfsbrowse.manager.HadoopServerUtil;
import org.talend.designer.hdfsbrowse.model.EHDFSFileTypes;
import org.talend.designer.hdfsbrowse.model.EHadoopFileTypes;
import org.talend.designer.hdfsbrowse.model.HDFSConnectionBean;
import org.talend.designer.hdfsbrowse.model.HDFSFile;
import org.talend.designer.hdfsbrowse.model.IHDFSNode;
import org.talend.repository.hadoopcluster.service.IExtractSchemaService;
import org.talend.repository.hdfs.util.HDFSConstants;
import org.talend.repository.hdfs.util.HDFSModelUtil;
import org.talend.repository.model.hdfs.HDFSConnection;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class ExtractParquetFileSchemaService implements IExtractSchemaService<HDFSConnection> {

    private static final String FILE_FORMAT_PARQUET = "parquet";

    private ClassLoader classLoader;

    public ExtractParquetFileSchemaService(ClassLoader classLoader) {
        this.classLoader = classLoader;
        initJarLibrary();
    }

    @Override
    public List<MetadataColumn> extractColumns(HDFSConnection connection, IHDFSNode node) throws Exception {
        if (connection == null || node == null || node.getType() != EHadoopFileTypes.FILE) {
            return Collections.EMPTY_LIST;
        }
        HDFSFile file = (HDFSFile) node;
        file.setFileType(EHDFSFileTypes.PARQUET);
        return extractColumns(connection, file.getPath());
    }

    @Override
    public List<MetadataColumn> extractColumns(HDFSConnection connection, MetadataTable metadataTable) throws Exception {
        if (connection == null || metadataTable == null) {
            return Collections.EMPTY_LIST;
        }
        EMap<String, String> additionalProperties = metadataTable.getAdditionalProperties();
        String hdfsPath = additionalProperties.get(HDFSConstants.HDFS_PATH);
        if (StringUtils.isEmpty(hdfsPath)) {
            return Collections.EMPTY_LIST;
        }
        return extractColumns(connection, hdfsPath);
    }

    private List<MetadataColumn> extractColumns(HDFSConnection connection, String filePath) throws Exception {
        List<MetadataColumn> columns = new ArrayList<MetadataColumn>();
        HDFSConnectionBean connectionBean = HDFSModelUtil.convert2HDFSConnectionBean(connection);
        Object fs = HadoopServerUtil.getDFS(connectionBean, classLoader);
        Object conf = HadoopServerUtil.getConfiguration(connectionBean, classLoader);
        Object pathObj = ReflectionUtils.newInstance("org.apache.hadoop.fs.Path", classLoader, new Object[] { filePath }); //$NON-NLS-1$
        ClassLoader oldClassLoaderLoader = Thread.currentThread().getContextClassLoader();
        try {
            Thread.currentThread().setContextClassLoader(classLoader);
            Object fileReader = ReflectionUtils.invokeStaticMethod("org.apache.parquet.hadoop.ParquetFileReader", classLoader,
                    "open", new Object[] { conf, pathObj });
            Object fileMetadata = ReflectionUtils.invokeMethod(fileReader, "getFileMetaData", new Object[] {});
            Object schema = ReflectionUtils.invokeMethod(fileMetadata, "getSchema", new Object[] {});
            List fields = (List) ReflectionUtils.invokeMethod(schema, "getFields", new Object[] {});
            Class RepetitionEnum = Class.forName("org.apache.parquet.schema.Type$Repetition", true, classLoader);
            for (Object field : fields) {
                String fieldName = (String) ReflectionUtils.invokeMethod(field, "getName", new Object[] {});
                Object repetition = ReflectionUtils.invokeMethod(field, "getRepetition", new Object[] {});
                boolean isNullable = true;
                if (Enum.valueOf(RepetitionEnum, "REQUIRED") == repetition) {
                    isNullable = false;
                }
                MetadataColumn metadataColumn = ConnectionFactory.eINSTANCE.createMetadataColumn();
                metadataColumn.setLabel(fieldName);
                metadataColumn.setNullable(isNullable);
                handleFieldMatchedTalendType(field, metadataColumn);
                columns.add(metadataColumn);
            }
        } finally {
            Thread.currentThread().setContextClassLoader(oldClassLoaderLoader);
        }
        return columns;
    }

    private void handleFieldMatchedTalendType(Object field, MetadataColumn column) throws Exception {
        String talendType = JavaTypesManager.getDefaultJavaType().getId();
        Class OriginalTypeEnum = Class.forName("org.apache.parquet.schema.OriginalType", true, classLoader);
        Object originalType = ReflectionUtils.invokeMethod(field, "getOriginalType", new Object[] {});
        Object isPrimitive = ReflectionUtils.invokeMethod(field, "isPrimitive", new Object[] {});

        if (Enum.valueOf(OriginalTypeEnum, "DATE") == originalType
                || Enum.valueOf(OriginalTypeEnum, "TIME_MILLIS") == originalType
                || Enum.valueOf(OriginalTypeEnum, "TIME_MICROS") == originalType
                || Enum.valueOf(OriginalTypeEnum, "TIMESTAMP_MILLIS") == originalType
                || Enum.valueOf(OriginalTypeEnum, "TIMESTAMP_MICROS") == originalType) {

            talendType = JavaTypesManager.DATE.getId();

        } else if (Enum.valueOf(OriginalTypeEnum, "DECIMAL") == originalType) {
            talendType = JavaTypesManager.BIGDECIMAL.getId();

        } else if (Boolean.valueOf(isPrimitive.toString())) {
            Object primitiveType = ReflectionUtils.invokeMethod(field, "asPrimitiveType", new Object[] {});
            Object primitiveTypeName = ReflectionUtils.invokeMethod(primitiveType, "getPrimitiveTypeName", new Object[] {});
            String name = (String) ReflectionUtils.invokeMethod(primitiveTypeName, "name", new Object[] {});
            switch (name) {
            case "INT96":
                talendType = JavaTypesManager.DATE.getId();
                break;
            case "INT64":
                talendType = JavaTypesManager.LONG.getId();
                break;
            case "INT32":
                talendType = JavaTypesManager.INTEGER.getId();
                if (Enum.valueOf(OriginalTypeEnum, "INT_8") == originalType) {
                    talendType = JavaTypesManager.BYTE.getId();
                } else if (Enum.valueOf(OriginalTypeEnum, "INT_16") == originalType) {
                    talendType = JavaTypesManager.SHORT.getId();
                }
                break;
            case "DOUBLE":
                talendType = JavaTypesManager.DOUBLE.getId();
                break;
            case "FLOAT":
                talendType = JavaTypesManager.FLOAT.getId();
                break;
            case "BOOLEAN":
                talendType = JavaTypesManager.BOOLEAN.getId();
                break;
            default:
                talendType = JavaTypesManager.STRING.getId();
            }
        } else {
            talendType = JavaTypesManager.STRING.getId();
        }

        column.setTalendType(talendType);
    }

    public static boolean isParquetFile(String fileFullPathName) {
        boolean isParquet = false;
        if (StringUtils.isEmpty(fileFullPathName)) {
            return isParquet;
        }
        String fileNameUpperCase = fileFullPathName.toLowerCase();
        if (fileNameUpperCase.endsWith("." + FILE_FORMAT_PARQUET) //$NON-NLS-1$
                || fileNameUpperCase.endsWith("." + FILE_FORMAT_PARQUET)) { //$NON-NLS-1$
            isParquet = true;
        }
        return isParquet;
    }

    private void initJarLibrary() {
        List<File> libList = new ArrayList<File>();
        List<String> jars = new ArrayList<String>();
        List<File> jarFileList = new ArrayList<File>();
        List<ModuleNeeded> modulesNeeded = new ArrayList<ModuleNeeded>();

        if (classLoader instanceof DynamicClassLoader) {
            GlobalServiceRegister register = GlobalServiceRegister.getDefault();
            DynamicClassLoader loader = (DynamicClassLoader) classLoader;
            String libStorePath = loader.getLibStorePath();
            File libFolder = new File(libStorePath);
            File[] listFiles = libFolder.listFiles();
            libList = Arrays.asList(listFiles);
            if (register.isServiceRegistered(IComponentsService.class)) {
                IComponentsService componentsService = register.getService(IComponentsService.class);
                IComponent component = componentsService.getComponentsFactory().get("tFileInputParquet",
                        ComponentCategory.CATEGORY_4_DI.getName());
                modulesNeeded = component.getModulesNeeded();
                modulesNeeded.forEach(module -> {
                    jars.add(module.getMavenUri());
                    jarFileList.add(new File(libStorePath + "/" + module.getModuleName()));
                });
            }

            if (register.isServiceRegistered(ILibraryManagerService.class)) {
                ILibraryManagerService service = GlobalServiceRegister.getDefault().getService(ILibraryManagerService.class);
                service.retrieve(jars, libStorePath, true, new NullProgressMonitor());
            }

            for (File jarFile : jarFileList) {
                loader.addLibrary(jarFile.getAbsolutePath());
            }

        }

    }

}
