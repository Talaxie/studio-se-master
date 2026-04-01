package org.talend.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.URIUtil;
import org.osgi.framework.Bundle;

/**
 * DOC sgandon  class global comment. Detailled comment
 * <br/>
 *
 * $Id: talend.epf 1 2006-09-29 17:06:40Z nrousseau $
 *
 */
final class TalendSwtBotTestCollector extends TalendTestCollector {

    private static final String PROPERTY_FOLDER_PATH = "/conf/"; //$NON-NLS-1$

    public Class<?>[] getTests() {
        Class<?>[] classes = super.getTests();
        try {
            loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        System.out.println("properties.flag: " + System.getProperty("properties.flag"));
        // load the properties here.
        return classes;
    }

    /**
     * return a File instance pointing to the file or folder located below this plugin sample folder
     * 
     * @param subSamplePath, path located below /sample/, so subpath should never start with a /, example : test.xsl
     * @return the File instance pointing to the obsolute path of the subSamplePath
     * @throws IOException
     * @throws URISyntaxException
     */
    public File getFileFromCurrentPluginSampleFolder(String subSamplePath) throws IOException, URISyntaxException {
        Bundle bundle = Platform.getBundle("test.all.test.suite");
        URL url = bundle.getEntry(PROPERTY_FOLDER_PATH + subSamplePath);
        URI escapedURI = getFileUrl(url);
        return URIUtil.toFile(escapedURI);
    }

    /**
     * Convert any URL to a file URL
     * 
     * @param url, may be a eclipse URL
     * @return a file:/ url
     * @throws IOException
     * @throws URISyntaxException
     */
    public URI getFileUrl(URL url) throws IOException, URISyntaxException {
        // bundleresource://875.fwk22949069:4/top400/
        URL unescapedURL = FileLocator.toFileURL(url);// bug 145096
        // file:/E:sv n/org.talend.model.migration.test/samples/top400/
        URI escapedURI = new URI(unescapedURL.getProtocol(), unescapedURL.getPath(), unescapedURL.getQuery());
        // file:/E:sv%20n/org.talend.model.migration.test/samples/top400/
        return escapedURI;
    }

    /**
     * Load properties to System from properties file.
     * 
     * @throws IOException
     * @throws URISyntaxException
     */
    public void loadProperties() throws IOException, URISyntaxException {
        String defaultFileName = "global.swtbot_.properties";
        String fileName = "global.swtbot_" + System.getProperty("talend.testing.profile", "") + ".properties";
        File propertiesFile = null;
        try {
            propertiesFile = getFileFromCurrentPluginSampleFolder(fileName);
        } catch (Exception e) {
            System.out.println("Couldn't load the properties file: " + fileName + ", try to load the default the file: "
                    + defaultFileName);
            propertiesFile = getFileFromCurrentPluginSampleFolder(defaultFileName);
        }
        loadPropertiesFile(propertiesFile);
    }

    /**
     * Load properties file
     */
    public void loadPropertiesFile(File file) {
        Properties props = new Properties();

        try {
            InputStream is = new FileInputStream(file);
            props.load(is);
            // System.setProperties(props);
            for (Object key : props.keySet()) {
                System.setProperty((String) key, (String) props.get(key));
            }
            is.close();
        } catch (IOException e) {
            System.out.println("Failed to load properties file!");
        }

        System.out.println("Property: " + System.getProperty("properties.flag"));
    }
}