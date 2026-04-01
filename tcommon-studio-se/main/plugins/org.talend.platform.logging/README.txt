plugin used for login with log4j in the Eclipse RCP platform. 

Usage: simply add this plugin into the platform plugins and declare the TalendPlatformLogAppender in 
the log4j configuration file(s).

The dependency on org.eclipse.pde.runtime is not really needed. But if one want to see the log 
in the Error log, the dependency assures that the plugin will be loaded.