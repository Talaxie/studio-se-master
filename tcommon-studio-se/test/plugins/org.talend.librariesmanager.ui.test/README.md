This tests the osgi loader but requires some settings to be launched from eclipse.
I have not tried to launch it from maven yet.

You can use the **OsgiLoaderTest.launch** eclipse launch configuration to launch the test but you need to have following files in the workspace :   
 * org.eclipse.osgi  (see readme in org.talend.osgi.lib.loader to know how to do this)
 * org.talend.osgi.lib.loader  
 * org.talend.librariesmanager.ui  

The bundles used for the test are to be found in the resources/plugins folder, they are eclipse project that can be imported in eclipse but this is not required only if you want to change the content which is not advised.  
The eclipse project is configured to use the **resource** folder a sources.  
This works fine for both bundle with no sources but the bundle **test.call.plugin.lib** needs to be jarred into **test.call.plugin.lib.jar** 