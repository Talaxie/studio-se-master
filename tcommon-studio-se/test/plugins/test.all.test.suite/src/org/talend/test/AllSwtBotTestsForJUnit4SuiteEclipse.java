package org.talend.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.URIUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.osgi.framework.Bundle;

import test.common.BundleTestCollector;

@RunWith(AllSwtBotTestsForJUnit4SuiteEclipse.class)
public class AllSwtBotTestsForJUnit4SuiteEclipse extends Suite {

    /**
     * the folder for property files
     */
    private static final String PROPERTY_FOLDER_PATH = "/conf/"; //$NON-NLS-1$

    public AllSwtBotTestsForJUnit4SuiteEclipse(Class<?> klass) throws InitializationError {
        super(klass, getSwtBotTests());
    }

    static Class<?>[] getTests() {
        BundleTestCollector testCollector = new BundleTestCollector();
        
        // add classes filter
        String[][] filters = new String[][]{
                {"org.talend.", ".swtbot.test", "tos", "*Test"},       		
        };
        List<Class> classes = getClassesViaFilter(testCollector, filters);
        for(Class c : classes) {
        	System.out.println("Add - "  + c.getCanonicalName());
        }
        
        // remove classes filter
        String[][] exceptions = new String[][]{
//        		 {"org.talend.", ".swtbot.test", "", "ColumnAnaWithMDMTest"},
        		};
        List<Class> exceptionClasses = getClassesViaFilter(testCollector, exceptions);
        for(Class c : exceptionClasses) {
        	System.out.println("Remove - "  + c.getCanonicalName());
        }
        
        // remove the except classes from added classes
        for(Class clazz : exceptionClasses) {
        	if(classes.contains(clazz)) {
        		classes.remove(clazz);
        	}
        }
        
        for(Class clazz : classes) {
        	System.out.println("Finally Class : - " + clazz.getCanonicalName());
        }
        
        return classes.toArray(new Class<?>[]{});
    }
    
    static List<Class> getClassesViaFilter(BundleTestCollector testCollector, String[][] filters) {
        List<Class> filterClasses = new ArrayList<Class>(); 
        for(String[] filter : filters) {
        	Class<?>[] classFilter = testCollector.collectTestsClasses(filter[0], filter[1], filter[2], filter[3], false);;
        	addArrayToArrayList(filterClasses, classFilter);
        }
        return filterClasses;
    }
    
    
    static void addArrayToArrayList(List<Class> classes, Class[] clazz) {
    	for(Class clz : clazz) {
    		if(!classes.contains(clz)) {
    			classes.add(clz);
    		}
    	}
    }
    
    /**
     * DOC sgandon Comment method "getSwtBotTests".
     * 
     * @return
     */
    static Class<?>[] getSwtBotTests() {
        Class<?>[] classes = getTests();
        System.out.println("classes " + classes.length);
        
        // Add ProfiledPropertyLoader
        ProfiledPropertyLoader loader = new ProfiledPropertyLoader();
        try {
            // resource associated with the first class
        	loader.loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return classes;
    }
//
//    /**
//     * return a File instance pointing to the file or folder located below this plugin sample folder
//     * 
//     * @param subSamplePath, path located below /sample/, so subpath should never start with a /, example : test.xsl
//     * @return the File instance pointing to the obsolute path of the subSamplePath
//     * @throws IOException
//     * @throws URISyntaxException
//     */
//    public static File getFileFromCurrentPluginSampleFolder(String subSamplePath) throws IOException, URISyntaxException {
//        Bundle bundle = Platform.getBundle("test.all.test.suite");
//        URL url = bundle.getEntry(PROPERTY_FOLDER_PATH + subSamplePath);
//        URI escapedURI = getFileUrl(url);
//        return URIUtil.toFile(escapedURI);
//    }
//
//    /**
//     * Convert any URL to a file URL
//     * 
//     * @param url, may be a eclipse URL
//     * @return a file:/ url
//     * @throws IOException
//     * @throws URISyntaxException
//     */
//    public static URI getFileUrl(URL url) throws IOException, URISyntaxException {
//        // bundleresource://875.fwk22949069:4/top400/
//        URL unescapedURL = FileLocator.toFileURL(url);// bug 145096
//        // file:/E:sv n/org.talend.model.migration.test/samples/top400/
//        URI escapedURI = new URI(unescapedURL.getProtocol(), unescapedURL.getPath(), unescapedURL.getQuery());
//        // file:/E:sv%20n/org.talend.model.migration.test/samples/top400/
//        return escapedURI;
//    }
//
//    /**
//     * Load properties to System from properties file.
//     * 
//     * @throws IOException
//     * @throws URISyntaxException
//     */
//    public static void loadProperties() throws IOException, URISyntaxException {
//        String defaultFileName = "global.swtbot_.properties";
//        String fileName = "global.swtbot_" + System.getProperty("talend.testing.profile", "") + ".properties";
//        File propertiesFile = null;
//        try {
//            propertiesFile = getFileFromCurrentPluginSampleFolder(fileName);
//        } catch (Exception e) {
//            System.out.println("Couldn't load the properties file: " + fileName + ", try to load the default the file: "
//                    + defaultFileName);
//            propertiesFile = getFileFromCurrentPluginSampleFolder(defaultFileName);
//        }
//        loadPropertiesFile(propertiesFile);
//    }
//
//    /**
//     * Load properties file
//     */
//    public static void loadPropertiesFile(File file) {
//        Properties props = new Properties();
//        try {
//            InputStream is = new FileInputStream(file);
//            props.load(is);
//            for (Object key : props.keySet()) {
//                System.setProperty((String) key, (String) props.get(key));
//            }
//            is.close();
//        } catch (IOException e) {
//            System.out.println("Failed to load properties file!");
//        }
//
//        System.out.println("Property: " + System.getProperty("properties.flag"));
//    }
    
    
}
