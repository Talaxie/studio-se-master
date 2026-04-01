// ============================================================================
//
// Talaxie Community Edition
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.commons.utils.system;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.service.datalocation.Location;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.util.tracker.ServiceTracker;
import org.talend.commons.exception.ExceptionHandler;

/**
 * Creates and updates properties for the eclipse commandline in case of relaunch <br/>
 *
 * $Id: talend.epf 55206 2011-02-15 17:32:14Z sgandon $
 *
 */
public class EclipseCommandLine {

    public static final String PROP_VM = "eclipse.vm"; //$NON-NLS-1$

    public static final String PROP_VMARGS = "eclipse.vmargs"; //$NON-NLS-1$

    static final String PROP_COMMANDS = "eclipse.commands"; //$NON-NLS-1$

    static final String CMD_VMARGS = "-vmargs"; //$NON-NLS-1$
    
    static final String CMD_VM = "-vm"; //$NON-NLS-1$

    static final String NEW_LINE = "\n"; //$NON-NLS-1$

    static public final String CLEAN = "-clean"; //$NON-NLS-1$

    public static final String PROP_CLEAR_PERSISTED_STATE = "clearPersistedState";

    public static final String PROP_DO_CLEAR_PERSISTED_STATE = "-talend.clearPersistedState";

    /**
     * Use it to specify the type of project that will be use to configure the studio when relaunched
     */
    static public final String TALEND_PROJECT_TYPE_COMMAND = "-talendProjectType"; //$NON-NLS-1$

    static public final String TALEND_LICENCE_PATH = "talend.licence.path"; //$NON-NLS-1$

    static public final String ARG_TALEND_LICENCE_PATH = "-" + TALEND_LICENCE_PATH; //$NON-NLS-1$

    /**
     * for relaunch of the plugins when relaunching the Studio
     */
    static public final String TALEND_RELOAD_COMMAND = "-talendReload"; //$NON-NLS-1$

    static public final String TALEND_CONTINUE_LOGON = "-talendContinueLogon";

    static public final String TALEND_CONTINUE_UPDATE = "-talendContinueUpdate";
    
    static public final String TALEND_CLEAN_M2 = "-talendCleanM2";

    static public final String TALEND_CLEAN_UNINSTALLED_BUNDLES = "-talendCleanUninstalledBundles";

    static public final String PROP_KEY_PROFILE_ID = "eclipse.p2.profile";

    static public final String ARG_BRANCH = "-branch";
    
    static public final String ARG_PROJECT = "-project";
    
    static public final String LOGIN_ONLINE_UPDATE = "--loginOnlineUpdate";

    static public final String ARG_TALEND_BUNDLES_CLEANED = "-talend.studio.bundles.cleaned"; //$NON-NLS-1$

    static public final String PROP_TALEND_BUNDLES_DO_CLEAN = "-talend.studio.bundles.doclean"; //$NON-NLS-1$

    /**
     * for relaunch of the plugins when relaunching the Studio
     */
    static public final String TALEND_DISABLE_LOGINDIALOG_COMMAND = "--disableLoginDialog"; //$NON-NLS-1$

    static public final String TALEND_DISABLE_UPDATE_DIALOG_COMMAND = "--disableUpdateDialog"; //$NON-NLS-1$

    static public final String TALEND_DISABLE_EXTERNAL_MODULE_INSTALL_DIALOG_COMMAND = "--disableExternalModuleInstallDialog"; //$NON-NLS-1$

    static public final String TALEND_NOSPLASH_COMMAND = "-nosplash"; //$NON-NLS-1$
    
    static public final String TALEND_RESTART_FLAG = "-talendRestart";
    
    static public final String TALEND_SKIP_PROJECT_VERSION_CHECK_FLAG = "-skipProjectVersionCheck";

    /**
     * for TUP-2218, enable to open the job auto, when open studio. the args should be name of job. if want to open
     * several jobs at same times. will split by comma "," or semicolon ";"
     */
    static public final String TALEND_SHOW_JOB_COMMAND = "--showJob"; //$NON-NLS-1$

    /**
     * By default, the type is PROCESS, but can be other type of job, like MR, Storm, Joblet etc, will implement it
     * later.
     */
    static public final String TALEND_SHOW_JOB_TYPE_COMMAND = "--showJobType"; //$NON-NLS-1$
    
    private static final String HEX_STRING = "0123456789ABCDEF";
    
    public static final String SCHEME_FILE = "file"; //$NON-NLS-1$

    private static final String UNC_PREFIX = "//"; //$NON-NLS-1$
    
    static private final Set<String> TALEND_ARGS = new HashSet<String>();
    
    static {
        TALEND_ARGS.add(TALEND_CLEAN_UNINSTALLED_BUNDLES);
        TALEND_ARGS.add(ARG_TALEND_BUNDLES_CLEANED);
        TALEND_ARGS.add(PROP_TALEND_BUNDLES_DO_CLEAN);
        TALEND_ARGS.add(TALEND_RELOAD_COMMAND);
    }

    static public void updateOrCreateExitDataPropertyWithCommand(String command, String value, boolean delete) {
        updateOrCreateExitDataPropertyWithCommand(command, value, delete, false);
    }

    public static String getEclipseArgument(String argName) {
        if (argName == null || argName.trim().isEmpty()) {
            return null;
        }

        try {
            if (isWindows() && TALEND_ARGS.contains(argName) && !isPoweredByTalend()) {
                ExceptionHandler.logDebug("argName: " + argName + ", sysProp: " + argName + ", value: " + System.getProperty(argName));
                Properties p = loadConfigIni();
                return p.getProperty(argName);
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        String[] commandLineArgs = Platform.getCommandLineArgs();
        if (commandLineArgs == null || commandLineArgs.length <= 0) {
            return null;
        }

        for (int i = 0; i < commandLineArgs.length - 1; i++) {
            if (argName.equals(commandLineArgs[i])) {
                return commandLineArgs[i + 1];
            }
        }
        return null;
    }

    private static boolean isPoweredByTalend() {
        return !Platform.getProduct().getId().equals("org.talend.rcp.branding.jetl.product") && !Platform.getProduct().getId().equals("org.talend.rcp.branding.jetl.bigdata.product");
    }
    
    private static boolean isWindows() {
        return EnvironmentUtils.isWindowsSystem();
    }
    
    private static void updateConfigIni(String command, String value, boolean delete) {
        Properties p = loadConfigIni();

        if (delete) {
            p.remove(command);
        } else {
            p.put(command, value);
        }
        try {
            File f = getConfigFile();
            try (FileOutputStream fos = new FileOutputStream(f)) {
                p.store(fos, "updated " + command);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    private static Properties loadConfigIni() {
        Properties p = new Properties();
        try {
            File f = getConfigFile();
            try (FileInputStream fis = new FileInputStream(f)) {
                p.load(fis);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
    
    private static String decode(String bytes) {
        if (bytes == null) {
            return null;
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream(bytes.length() / 2);
        for (int i = 0; i < bytes.length(); i += 2) {
            baos.write((HEX_STRING.indexOf(bytes.charAt(i)) << 4 | HEX_STRING.indexOf(bytes.charAt(i + 1))));
        }
        return new String(baos.toByteArray());
    }
    
    private static File getConfigFile() throws URISyntaxException {
        // configuration/config.ini
        File iniFile = new File(getConfigurationFolder(), decode("636F6E6669672E696E69")); //$NON-NLS-1$

        return iniFile;
    }

    private static Location getConfigLocation(BundleContext context) {
        Filter filter = null;
        try {
            filter = context.createFilter(Location.CONFIGURATION_FILTER);
        } catch (InvalidSyntaxException e) {
            // should not happen
        }
        ServiceTracker configLocationTracker = new ServiceTracker(context, filter, null);
        configLocationTracker.open();
        try {
            return (Location) configLocationTracker.getService();
        } finally {
            configLocationTracker.close();
        }
    }
    
    /**
     * Returns the URL as a URI. This method will handle broken URLs that are not properly encoded (for example they
     * contain unencoded space characters).
     */
    private static URI toURI(URL url) throws URISyntaxException {
        // URL behaves differently across platforms so for file: URLs we parse from string form
        if (SCHEME_FILE.equals(url.getProtocol())) {
            String pathString = url.toExternalForm().substring(5);
            // ensure there is a leading slash to handle common malformed URLs such as file:c:/tmp
            if (pathString.indexOf('/') != 0)
                pathString = '/' + pathString;
            else if (pathString.startsWith(UNC_PREFIX) && !pathString.startsWith(UNC_PREFIX, 2)) {
                // URL encodes UNC path with two slashes, but URI uses four (see bug 207103)
                pathString = UNC_PREFIX + pathString;
            }
            return new URI(SCHEME_FILE, null, pathString, null);
        }
        try {
            return new URI(url.toExternalForm());
        } catch (URISyntaxException e) {
            // try multi-argument URI constructor to perform encoding
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(),
                    url.getRef());
        }
    }

    private static File toFile(URI uri) {
        try {
            if (!SCHEME_FILE.equalsIgnoreCase(uri.getScheme()))
                return null;
            // assume all illegal characters have been properly encoded, so use URI class to unencode
            return new File(uri);
        } catch (IllegalArgumentException e) {
            // File constructor does not support non-hierarchical URI
            String path = uri.getPath();
            // path is null for non-hierarchical URI such as file:c:/tmp
            if (path == null)
                path = uri.getSchemeSpecificPart();
            return new File(path);
        }
    }
    
    private static File getConfigurationFolder() {
        BundleContext configuratorBundleContext = getCurrentBundleContext();
        final URL url = getConfigLocation(configuratorBundleContext).getURL();
        try {
            return toFile(toURI(url));
        } catch (URISyntaxException e) {
            //
        }
        return null;
    }
    
 // always return a valid bundlesContext or throw a runtimeException
    private static BundleContext getCurrentBundleContext() {
        Bundle bundle = FrameworkUtil.getBundle(EclipseCommandLine.class);
        if (bundle != null) {
            BundleContext bundleContext = bundle.getBundleContext();
            if (bundleContext != null) {
                return bundleContext;
            } else {
                throw new RuntimeException(
                        "could not find current BundleContext, this should never happen, check that the bunlde is activated when this class is accessed");
            }
        } else {
            throw new RuntimeException(
                    "could not find current Bundle, this should never happen, check that the bunlde is activated when this class is accessed");
        }
    }
    
    /**
     * this creates or updates the org.eclipse.equinox.app.IApplicationContext.EXIT_DATA_PROPERTY by adding or changing
     * the command with value, except if value is null then the command shall be removed.
     *
     * @param command the command to add or update or remove (if value is null) (usually starts with a -)
     * @param value the value of the command,if the value is null,will only update the commmand
     * @param delete the flag used to trigger delete or insert/update the command
     * @param isOption this flag used to trigger for the option command without any arguments.
     */
    static public void updateOrCreateExitDataPropertyWithCommand(String command, String value, boolean delete, boolean isOption) {
        try {
            if (isWindows() && TALEND_ARGS.contains(command) && !isPoweredByTalend()) {
                ExceptionHandler.logDebug("command: " + command + ", prop: " + command + ", value: " + value + ", delete: " + delete);
                updateConfigIni(command, value, delete);
                return;
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
       
        
        boolean isValueNull = false;
        if (value == null || "".equals(value)) { //$NON-NLS-1$
            isValueNull = true;
        } else {
            if (1 < value.length() && value.startsWith("'") && value.endsWith("'")) { //$NON-NLS-1$ //$NON-NLS-2$
                // nothing to do
            } else {
                if (value.contains(" ")) { //$NON-NLS-1$
                    value = value.replaceAll("\\\\", "\\\\\\\\"); //$NON-NLS-1$ //$NON-NLS-2$
                    value = "'" + value + "'"; //$NON-NLS-1$ //$NON-NLS-2$
                }
            }
        }
        StringBuffer result = new StringBuffer(512);

        String currentProperty = System.getProperty(org.eclipse.equinox.app.IApplicationContext.EXIT_DATA_PROPERTY);
        String patternStr = "\\s+.+\\s"; //$NON-NLS-1$
        // if the command is only one option. should only process the command without arguments.
        if (isOption) {
            patternStr = "\\s+"; //$NON-NLS-1$
        }

        String commandRegx = command.replaceAll("\\.", "\\\\\\."); //$NON-NLS-1$//$NON-NLS-2$
        String valueRegx = value;
        if (value != null) {
            valueRegx = value.replaceAll("\\\\", "\\\\\\\\"); //$NON-NLS-1$//$NON-NLS-2$
        }
        if (currentProperty != null) {// update the property
            Pattern commandPattern = Pattern.compile(commandRegx + patternStr);// -talendRestart\s+.+\s
            Matcher restartMatcher = commandPattern.matcher(currentProperty);

            if (delete) {// if delete,no matter the value is null or not,remove the command directly
                if (restartMatcher.find()) {// match found so remove it
                    currentProperty = restartMatcher.replaceAll(""); //$NON-NLS-1$
                } // else no match so do nothing
            } else {// else add or update the command
                    // try to find existing commands to update them
                    // find the index of the arg to replace its value
                // if value is null,only add or update the command
                if (restartMatcher.find()) {// match found so update the command
                    if (isOption) {
                        // because no arguments, if have been existed, so ignore.
                    } else {
                        currentProperty = restartMatcher.replaceAll(commandRegx + EclipseCommandLine.NEW_LINE
                                + (isValueNull ? "" : valueRegx + EclipseCommandLine.NEW_LINE));
                    }
                } else {// no match so insert it before the CMD_VMARGS
                    int indexOfVmArgs = currentProperty.indexOf(CMD_VMARGS);
                    if (indexOfVmArgs >= 0) {// found it so insert command before
                        currentProperty = currentProperty.substring(0, indexOfVmArgs) + command + EclipseCommandLine.NEW_LINE
                                + (isValueNull ? "" : value + EclipseCommandLine.NEW_LINE)
                                + currentProperty.substring(indexOfVmArgs);
                    } else {// vmargs command not found so don't know where to set it to throw Exception
                        currentProperty = currentProperty + command + EclipseCommandLine.NEW_LINE
                                + (isValueNull ? "" : value + EclipseCommandLine.NEW_LINE);
//                        throw new IllegalArgumentException("the property :" + org.eclipse.equinox.app.IApplicationContext.EXIT_DATA_PROPERTY + "must constain " + EclipseCommandLine.CMD_VMARGS);
                    }
                }
            }

            result.append(currentProperty);

        } else {// creates a new string
                // define the java process to launch
            String property = System.getProperty(EclipseCommandLine.PROP_VM);
            result.append(property);
            result.append(EclipseCommandLine.NEW_LINE);

            // add the java argument for the jvm
            // append the vmargs and commands. Assume that these already end in \n
            String vmargs = System.getProperty(EclipseCommandLine.PROP_VMARGS);
            if (vmargs != null) {
                result.append(vmargs);
            }

            // append the rest of the args, replacing or adding -data as required
            property = System.getProperty(EclipseCommandLine.PROP_COMMANDS);
            if (property == null) {
                if (value != null) {// command to be set
                    result.append(command);
                    result.append(EclipseCommandLine.NEW_LINE);
                    if (!isValueNull) {
                        result.append(value);
                        result.append(EclipseCommandLine.NEW_LINE);
                    }
                }// else command shall be removed,but it does not exists so ignor it
            } else {
                Pattern commandPattern = Pattern.compile(commandRegx + patternStr);// -talendRestart\s+.+\s
                Matcher restartMatcher = commandPattern.matcher(property);

                if (delete) {// if delete,no matter the value is null or not,remove the command dirctly
                    if (restartMatcher.find()) {// match found so remove it
                        property = restartMatcher.replaceAll(EclipseCommandLine.NEW_LINE);
                    }
                } else {// else need add or update the
                    if (restartMatcher.find()) {// match found so update the command
                        if (isOption) {
                            // because no arguments, if have been existed, so ignore.
                        } else {
                            property = restartMatcher.replaceAll(commandRegx + EclipseCommandLine.NEW_LINE
                                    + (isValueNull ? "" : valueRegx + EclipseCommandLine.NEW_LINE));
                        }
                    } else {// no match so add it
                        result.append(command);
                        result.append(EclipseCommandLine.NEW_LINE);
                        if (!isValueNull) {// won't add value if value is null
                            result.append(value);
                            result.append(EclipseCommandLine.NEW_LINE);
                        }
                    }
                }

                result.append(property);
            }

            // put the vmargs back at the very end so that the Main.java can know the vm args and set them in the system
            // property eclipse.vmargs
            // (the previously set eclipse.commands property already contains the -vm arg)
            if (vmargs != null) {
                result.append(EclipseCommandLine.CMD_VMARGS);
                result.append(EclipseCommandLine.NEW_LINE);
                result.append(vmargs);
            }
        }
        
        String exitData = result.toString();
        
        ExceptionHandler.logDebug("exitData before duplicated: " + exitData);
        
        if (isWindows() && !isPoweredByTalend()) {
            exitData = removeDuplicated(result).toString();
        }
        ExceptionHandler.logDebug("exitData: " + exitData);
        System.setProperty(org.eclipse.equinox.app.IApplicationContext.EXIT_DATA_PROPERTY, exitData);
        
    }
    
    private static StringBuilder removeDuplicated(StringBuffer sb) {
        StringBuilder ret = new StringBuilder();
        StringTokenizer t = new StringTokenizer(sb.toString(), EclipseCommandLine.NEW_LINE);
        while (t.hasMoreElements()) {
            String ele = (String) t.nextElement();
            boolean add = true;
            if (ele.equals("-launcher")) {
                if (ret.indexOf(ele) > 0) {
                    // dump value of launcher
                    t.nextElement();
                    add = false;
                }
            } else if (ele.equals(EclipseCommandLine.CMD_VMARGS)) {
                add = false;
                break;
            }

            if (add) {
                ret.append(ele);
                ret.append(EclipseCommandLine.NEW_LINE);
            }

        }
        
        return ret;

    }
}
