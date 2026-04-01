Date: 2007 09 26
Author: S. Correia

This project is only for utility classes that have no other dependencies than that described in the MANIFEST.
The dependencies of this project must remains very light. 

  
Use "Eclipse-RegisterBuddy: org.talend.utils" in dependent plugins that use org.talend.utils.ConnectionUtils 
so that org.talend.utils can find the correct JDBC Driver.
