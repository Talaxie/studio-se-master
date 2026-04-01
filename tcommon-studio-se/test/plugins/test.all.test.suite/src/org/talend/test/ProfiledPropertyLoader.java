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

class ProfiledPropertyLoader {

    private static final String[] PROFILE_NAMES = { "France", "China" };

    private static final String[] PRODUCT_NAMES = { "tdi", "tdq", "tesb", "tbpm" };

    private static final String TALEND_TESTING_PRODUCT = "talend.testing.product";

    private static final String TALEND_TESTING_PROFILE = "talend.testing.profile";

    private static final String PROPERTY_FOLDER_PATH = "/conf/"; //$NON-NLS-1$

    private String activeProfile;

    private String activeProduct;

    ProfiledPropertyLoader() {
        activeProfile = System.getProperty(TALEND_TESTING_PROFILE,
        // "* Location name must be specified in system property " + TALEND_TESTING_PROFILE + " *"
                "");
        activeProduct = System.getProperty(TALEND_TESTING_PRODUCT,
        // "* Location name must be specified in system property " + TALEND_TESTING_PRODUCT + " *"
                "");
    }

    /**
     * Load properties to System from properties file.
     * 
     * @throws IOException
     * @throws URISyntaxException
     */
    void loadProperties() throws IOException, URISyntaxException {
        String defaultFileName = "global.swtbot.properties";
        String fileName = "global.swtbot" + activeProfile + ".properties";
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
     * return a File instance pointing to the file or folder located below this plugin sample folder
     * 
     * @param subSamplePath , path located below /sample/, so subpath should never start with a /, example : test.xsl
     * @return the File instance pointing to the obsolute path of the subSamplePath
     * @throws IOException
     * @throws URISyntaxException
     */
    File getFileFromCurrentPluginSampleFolder(String subSamplePath) throws IOException, URISyntaxException {
        Bundle bundle = Platform.getBundle("test.all.test.suite");
        URL url = bundle.getEntry(PROPERTY_FOLDER_PATH + subSamplePath);
        URI escapedURI = getFileUrl(url);
        return URIUtil.toFile(escapedURI);
    }

    /**
     * Convert any URL to a file URL
     * 
     * @param url may be a eclipse URL
     * @return a file:/ url
     * @throws IOException
     * @throws URISyntaxException
     */
    URI getFileUrl(URL url) throws IOException, URISyntaxException {
        // bundleresource://875.fwk22949069:4/top400/
        URL unescapedURL = FileLocator.toFileURL(url);// bug 145096
        // file:/E:sv n/org.talend.model.migration.test/samples/top400/
        URI escapedURI = new URI(unescapedURL.getProtocol(), unescapedURL.getPath(), unescapedURL.getQuery());
        // file:/E:sv%20n/org.talend.model.migration.test/samples/top400/
        return escapedURI;
    }

    /**
     * Load properties file
     */
    void loadPropertiesFile(File file) {
        Properties props = new Properties();
        String profileSuffix = "." + activeProfile;
        String productSuffix = "." + activeProduct;

        try {
            InputStream is = new FileInputStream(file);
            props.load(is);

            // Get System properties
            Properties sysProp = System.getProperties();

            System.out.println("Load the profile specific values overriding the non suffixed values");
            for (Object key : props.keySet()) {
                String pKey = (String) key;

                if (pKey.endsWith(productSuffix + profileSuffix)) {
                    String overriddenKey = pKey.substring(0, pKey.indexOf(productSuffix + profileSuffix));
                    System.out.println("Value '" + props.get(key) + "' from '" + key + "' overrides value '"
                            + props.get(overriddenKey) + "' in '" + overriddenKey + "'");

                    // Existed in System properties or not
                    if (!sysProp.containsKey(overriddenKey)) {
                        System.setProperty(overriddenKey, (String) props.get(key));
                    }
                }

                if (pKey.endsWith(profileSuffix) && !pKey.endsWith(productSuffix + profileSuffix)) {
                    String overriddenKey = pKey.substring(0, pKey.indexOf(profileSuffix));
                    System.out.println("Value '" + props.get(key) + "' from '" + key + "' overrides value '"
                            + props.get(overriddenKey) + "' in '" + overriddenKey + "'");

                    // Existed in System properties or not
                    if (!sysProp.containsKey(overriddenKey)) {
                        System.setProperty(overriddenKey, (String) props.get(key));
                    }
                }

                if (pKey.endsWith(productSuffix)) {
                    String overriddenKey = pKey.substring(0, pKey.indexOf(productSuffix));
                    System.out.println("Value '" + props.get(key) + "' from '" + key + "' overrides value '"
                            + props.get(overriddenKey) + "' in '" + overriddenKey + "'");

                    // Existed in System properties or not
                    if (!sysProp.containsKey(overriddenKey)) {
                        System.setProperty(overriddenKey, (String) props.get(key));
                    }
                }
            }

            System.out.println("Load default properties without profile suffix");
            for (Object key : props.keySet()) {
                String pKey = (String) key;

                // Existed in System properties or not
                if (!sysProp.containsKey(pKey)) {

                    boolean hasSuffix = false;
                    for (String suffix : PROFILE_NAMES) {
                        if (pKey.endsWith("." + suffix)) {
                            hasSuffix = true;
                        }
                    }
                    for (String prodSuffix : PRODUCT_NAMES) {
                        if (pKey.endsWith("." + prodSuffix)) {
                            hasSuffix = true;
                        }
                    }

                    if (!hasSuffix) {
                        System.setProperty(pKey, (String) props.get(key));
                    } else {
                        System.out.println("Ignored entry '" + pKey + "' because it belongs to a profile.");
                    }
                }
            }

            is.close();
        } catch (IOException e) {
            System.out.println("Failed to load properties file!");
        }

        System.out.println("Property: " + System.getProperty("properties.flag"));
    }
}
