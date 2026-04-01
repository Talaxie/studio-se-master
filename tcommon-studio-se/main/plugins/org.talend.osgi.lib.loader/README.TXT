this implements equinox hooks.
To make it work in the Eclipse IDE you are required to have this project folder located in the same folder as the org.eclipse.osgi bundle.
One ways of doing this is to import a copy of this folder in the workspace (not an basic import) or you can use a symbolic link into the workspace folder to point to this folder
and import(as binary project) the org.eclipse.osgi plugin into the workspace too using the "Plug-ins" view.
You also need to add the followin system property in your launch configurator :
     -Dosgi.framework.extensions=org.talend.osgi.lib.loader

WARNING  : this is a critical piece of code, make sure you pass all the test and create new ones whenever you make some changes.
The tests are located here : https://github.com/Talaxie/tcommon-studio-se/tree/master/test/plugins/org.talend.librariesmanager.ui.test


for more information see : 
http://wiki.eclipse.org/index.php/Adaptor_Hooks
http://eclipsesource.com/blogs/2013/01/23/how-to-track-lifecycle-changes-of-osgi-bundles/
http://www.eclipsecon.org/2008/sub/attachments/Equinox_Framework_How_to_get_Hooked.pdf
http://www.eclemma.org/research/instrumentingosgi/index.html
https://www.eclipse.org/forums/index.php/mv/msg/828380/1442031/#msg_1442031
