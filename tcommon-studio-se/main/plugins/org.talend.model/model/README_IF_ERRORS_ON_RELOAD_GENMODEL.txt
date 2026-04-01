author nrousseau@talend.com
- If you really need to have no error, follow the tutorial bellow, but in all case, you will always be able to see your model if click on the Generator Tab.
- For compatibility with db repository, 2 errors MUST remain.
Those errors are because EMF want Project > (list)FolderItem, and FolderItem>(list)Item to be Unique. BUT, these ones are not compatible with db repository.
No matter if reload all the model, those property MUST be set back to Unique = FALSE. (So there will always be 2 errors)  
@author nrousseau@talend.com


@author amaumont@talend.com

I encountered the following problems and I found a solution with help of nrousseau, if anyone has a simpler solution, please send and email to:

  nrousseau@talend.com and amaumont@talend.com
 

Problems were detected while validating and converting the Ecore models
-----------------------------------------------------------------------
A containment or bidirectional reference must be unique if its upper bound is different from 1

Use case:

- you apply the needed modifications in a file ecore file [name].ecore (STATE_1)
- Right-Click on file [name].genmodel
- Click on menu item "Reload..."
- Error dialog occurs => ecore_problems_error1.png
- Next
- Finish
- Error occurs again with more precision => ecore_problems_error2.png

One solution:

- Recover the original [name].ecore from STATE_1, which has been modified by the previous operations
- Open the file [name].ecore with Double-Click

* STEP 1
- Select the first item
- Right-click on the first item 'platform/resource/.../[name].ecore' and click on the action "Validate" 
- if you obtain no error, retry from STEP 1 until obtain the errors
- you should obtain a result like the screenshot (ecore_problems_solution_step1.png)
- by clicking Ok on error dialog it display the first element where the problem occurs (ecore_problems_solution_step2.png)
- Double-Click on the item to open the view 'Properties'
- Change the property 'Unique' from 'false' to 'true'
- DO NOT SAVE THE FILE FOR THE MOMENT

- redo the same operation from STEP 1 until no error occurs and the message "Validation completed successfully" appears.
- SAVE the file [name].ecore
- IMPORTANT!!!: CLOSE the file "[name].ecore", else new files useless "Ecore.ecore" and "notation.ecore" will be created and other problems will occur... 
- Right-Click on file [name].genmodel
- Click on menu item "Reload..."
- Next > Next > ... > Finish
- Right-Click on the root item of the [name].genmodel into the tab editor 
- Generate Model code


@author amaumont@talend.com