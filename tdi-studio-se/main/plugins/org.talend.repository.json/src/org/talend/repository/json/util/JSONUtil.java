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
package org.talend.repository.json.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IProject;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.commons.utils.workbench.resources.ResourceUtils;
import org.talend.core.model.general.Project;
import org.talend.repository.ProjectManager;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.util.JSONUtils;

/**
 * DOC wanghong class global comment. Detailled comment
 */
public class JSONUtil {

    public static final String TMP_JSON_FILE = "tempJSONFile" + '.' + "xml"; //$NON-NLS-1$ //$NON-NLS-2$

    public static final String JSON_FILE = '.' + "xml"; //$NON-NLS-1$

    // for json from url
    public static String tempJSONXsdPath = null;

    public static boolean validateLabelForJSON(String label) {
        if (label == null) {
            return false;
        }
        if (label.length() < 1) {
            return false;
        }
        char firstChar = label.charAt(0);
        // see bug 10359,support begin with "_".
        if (!Character.isLetter(firstChar) && !('_' == firstChar)) {
            return false;
        }
        //        if (label.toLowerCase().startsWith("xml")) { //$NON-NLS-1$
        // return false;
        // }
        char[] array = label.toCharArray();
        for (char element : array) {
            if (Character.isSpaceChar(element) || Character.isWhitespace(element)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateLabelForFixedValue(String label) {
        if (label == null) {
            return false;
        }
        if (label.length() < 1) {
            return false;
        }
        if (label.toLowerCase().startsWith(JSON_FILE)) {
            return false;
        }
        // char[] array = label.toCharArray();
        // for (int i = 0; i < array.length; i++) {
        // if (Character.isSpaceChar(array[i]) || Character.isWhitespace(array[i])) {
        // return false;
        // }
        // }
        return true;
    }

    public static boolean validateLabelForNameSpace(String label) {
        if (label == null) {
            return false;
        }
        if (label.toLowerCase().startsWith(JSON_FILE)) {
            return false;
        }
        if (label.contains(".")) { //$NON-NLS-1$
            return false;
        }
        if (!("".equals(label)) && !("".equals(label.trim()))) { //$NON-NLS-1$ //$NON-NLS-2$
            char firstChar = label.charAt(0);
            if (!Character.isLetter(firstChar)) {
                return false;
            }
            char[] array = label.toCharArray();
            for (char element : array) {
                if (Character.isSpaceChar(element) || Character.isWhitespace(element)) {
                    return false;
                }
            }

        }
        return true;
    }

    public static String changeJsonToXml(String jsonPath, String encoding) {
        Project project = ProjectManager.getInstance().getCurrentProject();
        IProject fsProject = null;
        try {
            fsProject = ResourceUtils.getProject(project);
        } catch (PersistenceException e2) {
            ExceptionHandler.process(e2);
        }
        if (fsProject == null) {
            return jsonPath;
        }
        String temPath = fsProject.getLocationURI().getPath() + File.separator + "temp" + File.separator + "jsonwizard"
                + File.separator;

        ConvertJSONString convertJSON = new ConvertJSONString();
        de.odysseus.staxon.json.JsonXMLConfig jsonConfig = new de.odysseus.staxon.json.JsonXMLConfigBuilder().multiplePI(false)
                .build();
        de.odysseus.staxon.json.JsonXMLInputFactory jsonXMLInputFactory = new de.odysseus.staxon.json.JsonXMLInputFactory(
                jsonConfig);
        javax.xml.stream.XMLOutputFactory xmlOutputFactory = javax.xml.stream.XMLOutputFactory.newInstance();

        java.io.ByteArrayOutputStream outStream = new java.io.ByteArrayOutputStream();
        InputStream inStream = null;
        File file = new File(jsonPath);

        // String filename = file.getName().replaceAll("\\.", "_");
        // filename = "tempTest";
        boolean isFromUrl = false;
        boolean illegalURL = false;
        InputStream input = null;

        if (file.exists()) {
            if (file.isDirectory()) {
                return "";
            }
            try {
                input = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                ExceptionHandler.process(e);
            }
        } else {
            isFromUrl = true;
            try {
                input = new URL(jsonPath).openStream();
            } catch (MalformedURLException e) {
                illegalURL = true;
            } catch (IOException e) {
                illegalURL = true;
            }
            if (illegalURL) {
                return "";
            }
        }

        try {
            String jsonStr = IOUtils.toString(input, encoding);

            convertJSON.setJsonString(jsonStr);
            convertJSON.generate();
            jsonStr = convertJSON.getJsonString4XML();
            inStream = new ByteArrayInputStream(jsonStr.getBytes());
            javax.xml.stream.XMLEventReader xmlEventReader = jsonXMLInputFactory.createXMLEventReader(inStream);
            javax.xml.stream.XMLEventWriter xmLEventWriter = xmlOutputFactory.createXMLEventWriter(outStream);
            xmLEventWriter.add(xmlEventReader);
            String xmlStr = outStream.toString();

            File xmlFolder = new File(temPath);
            if (!xmlFolder.exists()) {
                xmlFolder.mkdirs();
            }
            temPath = temPath + TMP_JSON_FILE;
            FileWriter writer = new FileWriter(temPath);
            writer.write(xmlStr);
            writer.flush();
            writer.close();

            xmLEventWriter.close();
            xmlEventReader.close();
            if (isFromUrl) {
                tempJSONXsdPath = temPath;
            }
        } catch (java.lang.Exception e) {
            ExceptionHandler.process(e);
        } finally {
            try {
                outStream.close();
                if (inStream != null) {
                    inStream.close();
                }
            } catch (IOException e) {
                ExceptionHandler.process(e);
            }

        }
        return temPath;
    }

    public static void deleteWizardTempFiles() {
        tempJSONXsdPath = null;
        Project project = ProjectManager.getInstance().getCurrentProject();
        IProject fsProject = null;
        try {
            fsProject = ResourceUtils.getProject(project);
        } catch (PersistenceException e2) {
            ExceptionHandler.process(e2);
        }
        if (fsProject == null) {
            return;
        }
        String tempPath = fsProject.getLocationURI().getPath() + File.separator + "temp" + File.separator + "wizard";
        File tempWizardDir = new File(tempPath);
        tempWizardDir.delete();
        String tempjsonPath = fsProject.getLocationURI().getPath() + File.separator + "temp" + File.separator + "jsonwizard";
        File tempjsonWizardDir = new File(tempjsonPath);
        if (tempjsonWizardDir.exists()) {
            tempjsonWizardDir.delete();
        }
    }

    /**
     * <p>
     * Remove [?(Expression)] from json path
     * </p>
     * e.g. $.person[?(@.attribute==1)].birthday => $.person.birthday
     * @param jsonPath
     * @return
     */
    public static String detachJsonPathExpression(String jsonPath) {
        if (StringUtils.isNotBlank(jsonPath)) {
            jsonPath = jsonPath.replaceAll("(\\[\\?\\()(.*?)(\\)\\])", "");
        }
        StringBuffer expBuffer = new StringBuffer();
        String[] fields = jsonPath.split("\\.");
        for (int i = 0; i < fields.length; i++) {
            String field = fields[i];
            expBuffer.append(detachFieldNameWrap(field));
            if (i != fields.length - 1) {
                expBuffer.append(".");
            }
        }
        return expBuffer.toString();
    }

    public static String detachFieldNameWrap(String fieldName) {
        if (StringUtils.isNotBlank(fieldName) && fieldName.startsWith("['") && fieldName.endsWith("']")) {
            fieldName = fieldName.substring(2, fieldName.lastIndexOf("']"));
        }
        return fieldName;
    }

    public static boolean isFieldNameWrapped(char[] charArray, int fieldStartIndex, int fieldEndIndex) {
        if (fieldStartIndex == 0) {
            return false;
        }

        int checkIndex = fieldStartIndex - 1;
        List<String> strList = new ArrayList<String>();
        while (checkIndex >= 0) {
            if (!Character.isWhitespace(charArray[checkIndex])) {
                strList.add(String.valueOf(charArray[checkIndex]));
            }
            if (strList.size() == 2) {
                break;
            }
            checkIndex--;
        }
        if (strList.size() < 2 || !"['".equals(strList.get(1) + strList.get(0))) {
            return false;
        }

        strList.clear();
        checkIndex = fieldEndIndex + 1;
        while (checkIndex < charArray.length) {
            if (!Character.isWhitespace(charArray[checkIndex])) {
                strList.add(String.valueOf(charArray[checkIndex]));
            }
            if (strList.size() == 2) {
                break;
            }
            checkIndex++;
        }
        if (strList.size() == 2 && "']".equals(strList.get(0) + strList.get(1))) {
            return true;
        }

        return false;
    }

    public static List<Integer> getAllIndexOfString(String sourceStr, String indexStr) {
        List<Integer> indexList = new ArrayList<Integer>();
        int fromIndex = 0;
        while (fromIndex < sourceStr.length()) {
            int index = sourceStr.indexOf(indexStr, fromIndex);
            if (index == -1) {
                break;
            }
            indexList.add(index);
            fromIndex = index + indexStr.length();
        }
        return indexList;
    }

    /**
     * @param jsonContent
     * @param xpath  like "root/a/b", "/root/a/b" 
     * @param sep  xpath separator, default '/' 
     * @return
     */
    public static boolean isXPathOfJson(String jsonContent, String xpath, Character sep) {
        if(jsonContent == null || xpath == null) {
            return false;
        }
        
        if(null == sep) {
            sep = '/';
        }
        
        if(xpath.startsWith(sep.toString())) {
            xpath = xpath.substring(1);
        }
        
        String sep_str = sep.toString();
        if(sep == '.') {
            sep_str = "\\" + sep_str;
        }
        String[] split = xpath.split(sep_str);
        
        boolean result = false;
        
        JSON json = JSONSerializer.toJSON(jsonContent);
        if(json.isArray()) {
            JSONArray jarray = (JSONArray) json;
            result = canFoundInArray(jarray, split);
        }else {
            JSONObject jsonobj = (JSONObject) json;
            result = canFoundInJsonObject(jsonobj, split);
        }
        
        return result;
    }
    
    private static boolean canFoundInArray(JSONArray array, String[] xpath) {
        Iterator iterator = array.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            if(JSONUtils.isObject(next) && xpath.length > 0) {
                JSONObject obj = (JSONObject) next;
                if(obj.containsKey(xpath[0])) {
                    return canFoundInJsonObject(obj, xpath);
                }
            } else if(JSONUtils.isString(next)) {
                return xpath.length == 1 && xpath[0].equals(next);
            }
        }
            
        return false;
    }
    
    private static boolean canFoundInJsonObject(JSONObject jobj, String[] xpath) {
        if(xpath.length == 1) {
            return jobj.containsKey(xpath[0]);
        }
        
        if(jobj.containsKey(xpath[0])) {
            Object obj = jobj.get(xpath[0]);
            String[] _xpath = new String[xpath.length - 1];
            System.arraycopy(xpath, 1, _xpath, 0, _xpath.length);
            if(JSONUtils.isArray(obj)) {
                return canFoundInArray((JSONArray)obj, _xpath);
            } 
            
            if(JSONUtils.isObject(obj)) {
                return canFoundInJsonObject((JSONObject)obj, _xpath);
            }
            
            if(JSONUtils.isString(obj)) {
                return xpath.length == 1 && xpath[0].equals(obj);
            }
        }
        
        return false;
    }
}
