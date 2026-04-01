- When reloading ecore and genmodel from xsd files, please take care to reorder items in .ecore files
- have a look at commits 15815 and 15816 to see how to do this


Diagram files ".aird"
=====================
- REQUIRED: install the Eclipse plugin "EcoreTools : Ecore Diagram Editor 3.0" from "Help" > "Eclipse Market Place"

To create a diagram files .aird from .core file, please follow the below instructions:
- right click on ".ecore" file > "Initialize Ecore Diagram" > "Finish"
- right click on created ".aird" file > "Create Representation"
- in opened Wizard, select the "Design" > "Entities" then "Next", then "Finish"
- change the representation name as you want, then "Ok"
- the diagram is now opened but empty, DOUBLE-CLICK on displated note
=> Diagram is creating...


To open a diagram files .aird, please follow the below instructions:
- open the "Sirius" > "Model Explorer" view from "Window" > "Show View" > "Other"
- then, "right click on .aird file" > "Open"
- the diagram will not open in an editor at this time, so expand "tree item .aird" from "Model explorer" view 
	to "Representations per category" > "Design" > "Entities" > right click on "talend file class diagram" > "Open"
=> Diagram is opened