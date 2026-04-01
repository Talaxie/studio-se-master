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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.codec.digest.DigestUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.SystemException;
import org.talend.commons.runtime.xml.XmlUtil;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.commons.utils.workbench.resources.ResourceUtils;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.language.LanguageManager;
import org.talend.core.model.metadata.types.ContextParameterJavaTypeManager;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.metadata.types.PerlTypesManager;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.runtime.i18n.Messages;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.RepositoryConstants;
import org.talend.utils.json.JSONObject;
import org.talend.utils.xml.XmlUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Load Metadata Talaxie Type from mappingMetadataTypes.xml. Talaxie Types available in the application
 *
 *
 * $Id: MetadataTalendType.java 38013 2010-03-05 14:21:59Z mhirt $
 *
 */
public final class MetadataTalendType {

    public static final String INTERNAL_MAPPINGS_FOLDER = "mappings"; //$NON-NLS-1$

    public static final String PROJECT_MAPPING_FOLDER = ".settings/mappings"; //$NON-NLS-1$

    public static final String FILE_MAPPING_REVISION = "mapping_revision.json"; //$NON-NLS-1$

    public static final String MAPPING_FILE_PATTERN = "^mapping_.*\\.xml$"; //$NON-NLS-1$

    private static ECodeLanguage codeLanguage;

    private static final String[] PERL_TYPES = new String[] { PerlTypesManager.BOOLEAN, PerlTypesManager.DATE,
            PerlTypesManager.DATETIME, PerlTypesManager.INT, PerlTypesManager.DECIMAL, PerlTypesManager.STRING };

    private static Set<Dbms> dbmsSet = new HashSet<Dbms>();

    /**
     * Default Constructor. Must not be used.
     */
    private MetadataTalendType() {
    }

    private static final String MAPPING_METADATA_TYPES_XML = "mappingMetadataTypes.xml"; //$NON-NLS-1$

    private static Map<String, Map<String, String>> talendTypes = null;

    private static Map<String, Map<String, String>> defaultvalue = null;

    public static final String NULLABLE = "nullable"; //$NON-NLS-1$

    public static final String LANGUAGE_JAVA = "JAVA"; //$NON-NLS-1$

    public static final String TALENDDEFAULT = "TALENDDEFAULT"; //$NON-NLS-1$

    private static Comparator<String> comparatorIgnoreCase = new Comparator<String>() {

        @Override
        public int compare(String o1, String o2) {
            if (o1 == null) {
                return 1;
            }
            if (o2 == null) {
                return -1;
            }

            int compareIgnoreCase = o1.compareToIgnoreCase(o2);
            int compare = o1.compareTo(o2);
            if (compareIgnoreCase == 0 && compare != 0) {
                return -1 * compare;
            }

            return compareIgnoreCase;
        }

    };

    private static List<File> metadataMappingFiles = null;

    /**
     * Get the Talaxie Type for a particular type of a particular database.
     *
     * @param type to map
     * @param dbms
     * @param reload, true if it's necessary to reload mapping from our repository
     * @return
     * @deprecated Use {@link MetadataTalendType#getTalendTypesLabels()} method instead.
     */
    @Deprecated
    public static String loadTalendType(String type, String dbms, boolean reload) {
        dbms = dbms.toUpperCase();
        checkTypesAreInitialized(dbms, reload);
        if (talendTypes.get(dbms) != null) {
            return talendTypes.get(dbms).get(type.toUpperCase());
        }
        return null;
    }

    /**
     * Load dbms default type for a talend Type and a dbms.
     *
     * @param talendType
     * @param dbms
     * @param reload
     * @return
     * @deprecated
     */
    @Deprecated
    public static String loadDBMSType(String talendType, String dbms, boolean reload) {
        dbms = dbms.toUpperCase();
        checkTypesAreInitialized(dbms, reload);
        if (defaultvalue.get(dbms) != null) {
            return defaultvalue.get(dbms).get(talendType);
        }
        return null;
    }

    /**
     * Load Talaxie Types available for a particular Database.
     *
     * @param dbms
     * @param reload
     * @return
     * @deprecated Use {@link MetadataTalendType#getTalendTypesLabels()} method instead.
     */
    @Deprecated
    public static String[] loadTalendTypes(String dbms, boolean reload) {

        if (getCodeLanguage() == ECodeLanguage.JAVA) {
            return JavaTypesManager.getJavaTypesLabels();
        } else {
            dbms = dbms.toUpperCase();
            Collection<String> types = new TreeSet<String>();
            checkTypesAreInitialized(dbms, reload);
            if (talendTypes.get(dbms) != null) {
                types = talendTypes.get(dbms).values();
            }

            return createStringArray(types);
        }
    }

    /**
     * Load Database Types available.
     *
     * @param dbms
     * @param reload
     * @return
     * @deprecated
     */
    @Deprecated
    public static String[] loadDatabaseTypes(String dbms, boolean reload) {
        dbms = dbms.toUpperCase();
        Collection<String> types = new TreeSet<String>();
        checkTypesAreInitialized(dbms, reload);
        if (talendTypes.get(dbms) != null) {
            types = talendTypes.get(dbms).keySet();
        }
        return createStringArray(types);
    }

    /**
     * initialisation of datas.
     *
     * @return
     * @throws SystemException
     * @deprecated.
     */
    private static void init() throws SystemException {
        talendTypes = new HashMap<String, Map<String, String>>();
        defaultvalue = new HashMap<String, Map<String, String>>();

        try {
            DocumentBuilderFactory fabrique = XmlUtils.getSecureDocumentBuilderFactory();
            DocumentBuilder analyseur = fabrique.newDocumentBuilder();

            Bundle b = Platform.getBundle(CoreRuntimePlugin.PLUGIN_ID);
            URL url = FileLocator.toFileURL(FileLocator.find(b, new Path(MAPPING_METADATA_TYPES_XML), null));
            File dir = new File(url.getPath());
            Document document = analyseur.parse(dir);

            NodeList nodes = document.getElementsByTagName("version"); //$NON-NLS-1$
            for (int i = 0; i < nodes.getLength(); i++) {
                Node nodetoParse = nodes.item(i);
                NamedNodeMap nodeMap = nodetoParse.getAttributes();
                Node version = nodeMap.getNamedItem("name"); //$NON-NLS-1$
                Node brotherNode = nodetoParse.getParentNode().getParentNode().getFirstChild();
                Map<String, String> value = new HashMap<String, String>();
                Map<String, String> dv = new HashMap<String, String>();
                while (brotherNode != null) {
                    if (brotherNode.getNodeName().compareTo("type") == 0) { //$NON-NLS-1$
                        NamedNodeMap typeNodeAttributes = brotherNode.getAttributes();
                        String dbmsNodeValue = typeNodeAttributes.getNamedItem("dbms").getNodeValue(); //$NON-NLS-1$
                        Node nullableNamedItem = typeNodeAttributes.getNamedItem(NULLABLE);
                        String keyForValues = dbmsNodeValue;
                        if (nullableNamedItem != null && "true".equals(nullableNamedItem.getNodeValue())) { //$NON-NLS-1$
                            keyForValues = dbmsNodeValue + NULLABLE;
                        }
                        value.put(keyForValues.toUpperCase(), typeNodeAttributes.getNamedItem("talend").getNodeValue()); //$NON-NLS-1$

                        Node defaultNamedItem = typeNodeAttributes.getNamedItem("default"); //$NON-NLS-1$
                        if (defaultNamedItem != null && "true".equals(defaultNamedItem.getNodeValue())) { //$NON-NLS-1$
                            dv.put(typeNodeAttributes.getNamedItem("talend").getNodeValue(), typeNodeAttributes.getNamedItem("dbms") //$NON-NLS-1$ //$NON-NLS-2$
                                            .getNodeValue());
                        }
                    }
                    brotherNode = brotherNode.getNextSibling();
                }
                talendTypes.put(version.getNodeValue().toUpperCase(), value);
                defaultvalue.put(version.getNodeValue().toUpperCase(), dv);
            }
        } catch (IOException e) {
            throw new SystemException(e.getCause());
        } catch (ParserConfigurationException e) {
            throw new SystemException(e.getCause());
        } catch (SAXException e) {
            throw new SystemException(e.getCause());
        }
    }

    /**
     * return an Array of String for a given Collection TO DO Move in utils.
     *
     * @param types
     * @return
     * @deprecated
     */
    @Deprecated
    private static String[] createStringArray(Collection<String> types) {
        SortedSet<String> sortedTypes = new TreeSet<String>(comparatorIgnoreCase);
        sortedTypes.addAll(types);
        return sortedTypes.toArray(new String[] {});
    }

    /**
     * initialize if necessary or asked.
     *
     * @param dbms
     * @param reload
     * @throws SystemException
     * @deprecated
     */
    @Deprecated
    private static void checkTypesAreInitialized(String dbms, boolean reload) {
        if (dbms == null) {
            throw new NullPointerException(Messages.getString("MetadataTalendType.DBMSNotSetted")); //$NON-NLS-1$
        }
        if ((talendTypes == null) || (reload)) {
            try {
                init();
            } catch (SystemException e) {
                // e.printStackTrace();
                ExceptionHandler.process(e);
            }
        }
    }

    /**
     *
     * Return the talend types function of the current language.
     *
     * @return
     */
    public static String[] getTalendTypesLabels() {
        if (getCodeLanguage() == ECodeLanguage.JAVA) {
            return JavaTypesManager.getJavaTypesLabels();
        } else if (getCodeLanguage() == ECodeLanguage.PERL) {
            // return (String[]) ArrayUtils.clone(PERL_TYPES);
            // return loadTalendTypes("TALENDDEFAULT", false); //before
            return getPerlTypes();
        }
        throw new IllegalStateException("Case not found."); //$NON-NLS-1$
    }

    public static String[] getCxtParameterTalendTypesLabels() {
        if (getCodeLanguage() == ECodeLanguage.JAVA) {
            return ContextParameterJavaTypeManager.getJavaTypesLabels();
        } else if (getCodeLanguage() == ECodeLanguage.PERL) {
            // return (String[]) ArrayUtils.clone(PERL_TYPES);
            return ContextParameterJavaTypeManager.getPerlTypesLabels();
        }
        throw new IllegalStateException("Case not found."); //$NON-NLS-1$
    }

    public static Dbms[] getAllDbmsArray() {
        if (dbmsSet.isEmpty()) {
            // if not loaded
            try {
                loadCommonMappings();
            } catch (SystemException e) {
                ExceptionHandler.process(e);
            }
        }
        return dbmsSet.toArray(new Dbms[0]);
    }

    /**
     *
     * Return array of Dbms which have the given product value.
     *
     * @param product
     * @return array of Dbms which have the given product value
     */
    public static Dbms[] getDbmsArrayFromProduct(final String product) {
        if (product == null) {
            throw new IllegalArgumentException();
        }
        Dbms[] allDbmsArray = getAllDbmsArray();
        ArrayList<Dbms> list = new ArrayList<Dbms>();
        for (Dbms dbms : allDbmsArray) {
            if (sameDBProductType(product, dbms.getProduct())) {
                list.add(dbms);
            }
        }
        return list.toArray(new Dbms[0]);
    }

    public static Dbms getDefaultDbmsFromProduct(final String product) {
        if (product == null) {
            throw new IllegalArgumentException();
        }
        Dbms[] allDbmsArray = getAllDbmsArray();
        Dbms defaultDbms = null;
        for (Dbms dbms : allDbmsArray) {
            if (sameDBProductType(product, dbms.getProduct())) {
                if (dbms.isDefaultDbms()) {
                    return dbms;
                }
                defaultDbms = dbms; // set this value, so even if no dbms is set by default there will still be a dbms
                // used.
            }
        }
        return defaultDbms;
    }

    // See bug 4565. ORACLE product is separated to two types, ORACLE_SID and ORACLE_SERVICE
    public static String getMapProductName(final String product) {

        String temp = product.toUpperCase();

        // ORACLE_SID and ORACLE_SERVICE are all ORACLE type dbms
        if (temp.startsWith("ORACLE")) { //$NON-NLS-1$
            return "ORACLE"; //$NON-NLS-1$
        }
        if (temp.equals(EDatabaseTypeName.MSSQL.getXMLType())) {
            return EDatabaseTypeName.MSSQL.getProduct();
        }
        // Other db just return the product name
        return temp;
    }

    /**
     *
     * Retrieve and return the dbms from the given id.
     *
     * @param dbmsId
     * @return the dbms from the given id
     */
    public static Dbms getDbms(String dbmsId) {
        if (dbmsId == null) {
            throw new IllegalArgumentException();
        }
        Dbms[] allDbmsArray = getAllDbmsArray();
        for (Dbms dbms : allDbmsArray) {
            if (TalendQuoteUtils.removeQuotesIfExist(dbmsId).equals(dbms.getId())) {
                return dbms;
            }
        }
        ExceptionHandler.log(Messages.getString("MetadataTalendType.dbIdNotFound", dbmsId)); //$NON-NLS-1$
        return null;
    }

    public static Dbms getDbmsByProduct(String product) {
        if (product == null) {
            throw new IllegalArgumentException();
        }
        Dbms[] allDbmsArray = getAllDbmsArray();
        for (Dbms dbms : allDbmsArray) {
            if (product.equals(dbms.getProduct())) {
                return dbms;
            }
        }
        ExceptionHandler.log(Messages.getString("MetadataTalendType.dbIdNotFound", product)); //$NON-NLS-1$
        return null;
    }

    /**
     * Retrievd the dbms from the given dbmsId and return db types from it.
     *
     * @param dbmsId
     * @return return db types from the dbms
     */
    public static String[] getDbTypes(String dbmsId) {
        if (dbmsId == null) {
            throw new IllegalArgumentException();
        }
        Dbms dbms = getDbms(dbmsId);
        if (dbms == null) {
            throw new IllegalArgumentException("Unknown dbmsId: '" + dbmsId + "'"); //$NON-NLS-1$ //$NON-NLS-2$
        }
        String[] list = dbms.getDbTypes().toArray(new String[0]);
        Arrays.sort(list);
        return list;
    }

    public static File getSystemFolderURLOfMappingsFile() throws SystemException {
        String dirPath = "/" + INTERNAL_MAPPINGS_FOLDER; //$NON-NLS-1$
        Path filePath = new Path(dirPath);
        Bundle b = Platform.getBundle(CoreRuntimePlugin.PLUGIN_ID);
        if (b != null) {
            try {
                // Enumeration<URL> entries = b.findEntries(dirPath, "mapping_*.xml", false);
                return new File(FileLocator.toFileURL(FileLocator.find(b, filePath, null)).getFile());
            } catch (IOException e) {
                throw new SystemException(e);
            }
        }
        return null;
    }

    public static File getProjectFolderURLOfMappingsFile() throws SystemException {
        try {
            String dirPath = "/" + INTERNAL_MAPPINGS_FOLDER; //$NON-NLS-1$
            IProject project = ResourceUtils.getProject(ProjectManager.getInstance().getCurrentProject());
            IPath settingPath = new ProjectScope(project).getLocation();
            File mappingFolder = settingPath.append(dirPath).toFile();
            if (!mappingFolder.exists()) {
                mappingFolder.mkdirs();
            }
            return mappingFolder;
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }

    public static URL getProjectTempMappingFolder() {
        try {
            IProject project = ResourceUtils.getProject(ProjectManager.getInstance().getCurrentProject());
            File folder = ResourceUtils
                    .getFolder(project, RepositoryConstants.TEMP_DIRECTORY + "/" + INTERNAL_MAPPINGS_FOLDER, false).getLocation()
                    .toFile();
            syncMappingFiles(folder, false);
            return folder.toURI().toURL();
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return null;
        }
    }

    public static void syncMappingFiles(File target, boolean rename) {
        if (!target.exists()) {
            target.mkdir();
        }
        File[] arr = target.listFiles(f -> f.getName().matches(MAPPING_FILE_PATTERN));
        if (arr == null) {
            arr = new File[0];
        }
        try {
            Map<String, File> targetFileMap = Stream.of(arr).collect(Collectors.toMap(File::getName, Function.identity()));
            Map<String, File> workingFileMap = getWorkingMappingFiles().stream()
                    .collect(Collectors.toMap(f -> getTargetName(f, rename), Function.identity(), (f1, f2) -> f1));

            targetFileMap.entrySet().stream().filter(entry -> !workingFileMap.containsKey(entry.getKey()))
                    .forEach(entry -> entry.getValue().delete());

            for (Entry<String, File> entry : workingFileMap.entrySet()) {
                String targetName = entry.getKey();
                File workingMappingFile = entry.getValue();
                boolean needUpdate = false;
                File targetMappingFile = targetFileMap.get(targetName);
                if (targetMappingFile == null) {
                    targetMappingFile = new File(target, targetName);
                    needUpdate = true;
                } else if (!getSha1OfFile(workingMappingFile).equals(getSha1OfFile(targetMappingFile))) {
                    needUpdate = true;
                }
                if (needUpdate) {
                    if (targetMappingFile.exists()) {
                        targetMappingFile.delete();
                    }
                    FilesUtils.copyFile(workingMappingFile, targetMappingFile);
                }
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

    public static String getTargetName(File file, boolean rename) {
        String targetName = file.getName();
        if (!rename) {
            return targetName;
        }
        try {
            DocumentBuilderFactory documentBuilderFactory = XmlUtils.getSecureDocumentBuilderFactory();
            DocumentBuilder analyser = documentBuilderFactory.newDocumentBuilder();
            Document document = analyser.parse(file);
            NodeList dbmsNodes = document.getElementsByTagName("dbms"); //$NON-NLS-1$
            String dbmsIdValue = "";
            for (int iDbms = 0; iDbms < dbmsNodes.getLength(); iDbms++) {
                Node dbmsNode = dbmsNodes.item(iDbms);
                NamedNodeMap dbmsAttributes = dbmsNode.getAttributes();
                dbmsIdValue = dbmsAttributes.getNamedItem("id").getNodeValue(); //$NON-NLS-1$

            }
            if (dbmsIdValue != null && !"".equals(dbmsIdValue)) {
                final String[] fileNameSplit = targetName.split("_");
                String idA = "_id";
                String idB = "id_";
                final int indexA = dbmsIdValue.indexOf(idA);
                final int indexB = dbmsIdValue.indexOf(idB);
                String secondeName = "";
                if (indexA > 0) {
                    secondeName = dbmsIdValue.substring(0, dbmsIdValue.length() - idA.length());
                } else if (indexB == 0) {
                    secondeName = dbmsIdValue.substring(idB.length(), dbmsIdValue.length());
                } else if (indexA == -1 && indexB == -1) {
                    secondeName = dbmsIdValue;
                }
                if (secondeName != null && !"".equals(secondeName)) {
                    targetName = fileNameSplit[0] + "_" + secondeName.toLowerCase() + XmlUtil.FILE_XML_SUFFIX;
                }

            }
        } catch (ParserConfigurationException e) {
            ExceptionHandler.process(e);
        } catch (SAXException e) {
            ExceptionHandler.process(e);
        } catch (IOException e) {
            ExceptionHandler.process(e);
        }
        return targetName;
    }

    public static JSONObject getRevisionObject() {
        try {
            File revisonFile = new File(getSystemFolderURLOfMappingsFile(), FILE_MAPPING_REVISION);
            String jsonStr = new String(Files.readAllBytes(revisonFile.toPath()));
            return new JSONObject(jsonStr);
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return new JSONObject();
    }

    public static boolean restoreMappingFiles() throws Exception {
        List<File> toDelete = new ArrayList<>();
        JSONObject revision = getRevisionObject();
        File projectMappingFolder = getProjectFolderURLOfMappingsFile();
        if (projectMappingFolder.exists()) {
            File[] projectMappingFiles = projectMappingFolder.listFiles(f -> f.getName().matches(MAPPING_FILE_PATTERN));
            if (projectMappingFiles != null) {
                for (File file : projectMappingFiles) {
                    if (revision.has(file.getName())) {
                        String sha1 = getSha1OfFile(file);
                        if (revision.getJSONObject(file.getName()).has(sha1)) {
                            toDelete.add(file);
                        }
                    }
                }
            }
            File xsd = new File(projectMappingFolder, "mapping_validate.xsd"); //$NON-NLS-1$
            if (xsd.exists()) {
                xsd.delete();
            }
        }
        toDelete.forEach(File::delete);
        return !toDelete.isEmpty();
    }

    public static String getSha1OfFile(File file) {
        try {
            String text = new String(Files.readAllBytes(file.toPath()));
            return getSha1OfText(text);
        } catch (IOException e) {
            ExceptionHandler.process(e);
        }
        return null;
    }
    
    public static String getSha1OfText(String text) {
        text = text.replace("\r\n", "\n"); //$NON-NLS-1$ //$NON-NLS-2$
        return DigestUtils.sha1Hex(text);
    }

    public static void copyFile(File in, IFile out) throws CoreException, IOException {
        FileInputStream fis = new FileInputStream(in);
        if (out.exists()) {
            out.setContents(fis, true, false, null);
        } else {
            out.create(fis, true, null);
        }
        fis.close();
    }

    /**
     *
     * Load db types and mapping with the current activated language (Java, Perl, ...).
     *
     * @throws SystemException
     */
    public static void loadCommonMappings() throws SystemException {
        metadataMappingFiles = new ArrayList<File>();
        dbmsSet.clear();
        for (File file : getWorkingMappingFiles()) {
            loadMapping(file);
            metadataMappingFiles.add(file);
        }
    }

    public static List<File> getWorkingMappingFiles() throws SystemException {
        File projectMappingFolder = getProjectFolderURLOfMappingsFile();
        File[] projectMappingFiles = projectMappingFolder.listFiles(f -> f.getName().matches(MAPPING_FILE_PATTERN));
        File systemMappingFolder = getSystemFolderURLOfMappingsFile();
        File[] systemMappingFiles = systemMappingFolder.listFiles(f -> f.getName().matches(MAPPING_FILE_PATTERN));
        if (projectMappingFiles == null || projectMappingFiles.length == 0) {
            return Arrays.asList(systemMappingFiles);
        }
        List<File> workingMappingFiles = new ArrayList<>();
        Map<String, File> projectMappingFilesMap = Stream.of(projectMappingFiles)
                .collect(Collectors.toMap(File::getName, Function.identity()));
        workingMappingFiles.addAll(projectMappingFilesMap.values());
        Stream.of(systemMappingFiles).filter(f -> !projectMappingFilesMap.containsKey(f.getName()))
                .forEach(f -> workingMappingFiles.add(f));
        return workingMappingFiles;
    }

    public static String getSha1OfSystemMappingFile(String fileName) {
        try {
            return getSha1OfFile(new File(getSystemFolderURLOfMappingsFile(), fileName));
        } catch (SystemException e) {
            ExceptionHandler.process(e);
            return null;
        }
    }

    private static void loadMapping(File file) throws SystemException {
        MappingFileLoader mappingFileLoader = new MappingFileLoader();
        mappingFileLoader.load(file);
    }

    public static List<File> getMetadataMappingFiles() {
        if (metadataMappingFiles == null) {
            // in some cases mapping files are not set, depends the actions of the user.
            try {
                loadCommonMappings();
            } catch (SystemException e) {
                ExceptionHandler.process(e);
            }
        }
        return metadataMappingFiles;
    }

    /**
     * Getter for codeLanguage.
     *
     * @return the codeLanguage
     */
    static ECodeLanguage getCodeLanguage() {
        if (codeLanguage == null) {
            codeLanguage = LanguageManager.getCurrentLanguage();
        }
        return codeLanguage;
    }

    /**
     * Getter for dbmsSet.
     *
     * @return the dbmsSet
     */
    static Set<Dbms> getDbmsSet() {
        return dbmsSet;
    }

    /**
     * Create and return a MappingTypeRetriever which helps to retrieve dbType from a talendType or the contrary.
     *
     * @param dbmsId
     * @return new MappingTypeRetriever loaded with Dbms found with given dbmsId
     */
    public static MappingTypeRetriever getMappingTypeRetriever(String dbmsId) {
        if (dbmsId == null) {
            throw new IllegalArgumentException();
        }
        Dbms dbms = getDbms(dbmsId);
        if (dbms == null) {
            return null;
        }
        return new MappingTypeRetriever(dbms);
    }

    /**
     *
     * Return the default Talaxie type function of the current language.
     *
     * @return the default Talaxie type function of the current language
     */
    public static String getDefaultTalendType() {
        if (getCodeLanguage() == ECodeLanguage.JAVA) {
            return JavaTypesManager.getDefaultJavaType().getId();
        } else if (getCodeLanguage() == ECodeLanguage.PERL) {
            return ""; //$NON-NLS-1$
        } else {
            throw new IllegalStateException("Case not found"); //$NON-NLS-1$
        }
    }

    /**
     * Getter for pERL_TYPES.
     *
     * @return the pERL_TYPES
     */
    public static String[] getPerlTypes() {
        return PERL_TYPES.clone();
    }

    public static boolean sameDBProductType(String sourceProduct, String targetProduct) {
        if (sourceProduct == null || targetProduct == null) {
            return false;
        }
        if (sourceProduct.equals(targetProduct) || sourceProduct.equals(getMapProductName(targetProduct))) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        codeLanguage = ECodeLanguage.JAVA;

        String dbmsId = "oracle_id"; //$NON-NLS-1$
        Dbms dbms = getDbms(dbmsId);
        System.out.println("dbms:" + dbms); //$NON-NLS-1$
        System.out.println("types:" + Arrays.asList(getDbTypes(dbmsId))); //$NON-NLS-1$

        MappingTypeRetriever mappingTypeRetriever = getMappingTypeRetriever(dbmsId);
        System.out.println("java int(id_Integer) => " + mappingTypeRetriever.getDefaultSelectedDbType("id_Integer")); //$NON-NLS-1$ //$NON-NLS-2$

        System.out.println("Db INT => " + mappingTypeRetriever.getDefaultSelectedTalendType("INT")); //$NON-NLS-1$ //$NON-NLS-2$

        System.out.println("java UNKNOWN TYPE => " + mappingTypeRetriever.getDefaultSelectedDbType("UNKNOWN")); //$NON-NLS-1$ //$NON-NLS-2$

        System.out.println("Db UNKNOWN TYPE => " + mappingTypeRetriever.getDefaultSelectedTalendType("UNKNOWN")); //$NON-NLS-1$ //$NON-NLS-2$

        System.out.println("java id_byte[] => " + mappingTypeRetriever.getDefaultSelectedDbType("id_byte[]")); //$NON-NLS-1$ //$NON-NLS-2$

        System.out.println("INt => " + mappingTypeRetriever.getAdvicedDbToTalendTypes("INt")); //$NON-NLS-1$ //$NON-NLS-2$

        System.out.println("int => " + mappingTypeRetriever.getAdvicedTalendToDbTypes("int")); //$NON-NLS-1$ //$NON-NLS-2$

        System.out.println("id_Long => " + mappingTypeRetriever.getAdvicedTalendToDbTypes("id_Long")); //$NON-NLS-1$ //$NON-NLS-2$

        System.out.println();
    }

    /**
     * DOC xqliu Comment method "getMappingTypeProduct".
     *
     * @param product
     * @return
     */
    public static MappingTypeRetriever getMappingTypeRetrieverByProduct(String product) {
        if (product == null) {
            throw new IllegalArgumentException();
        }
        Dbms dbms = getDbmsByProduct(product);
        if (dbms == null) {
            return null;
        }
        return new MappingTypeRetriever(dbms);
    }

}
