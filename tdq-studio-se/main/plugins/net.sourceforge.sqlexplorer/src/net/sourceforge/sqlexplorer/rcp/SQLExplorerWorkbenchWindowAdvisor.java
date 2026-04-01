package net.sourceforge.sqlexplorer.rcp;

import net.sourceforge.sqlexplorer.Messages;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;


/**
 * WindowAdvisor.  Controls the look & feel of our application.
 * 
 * @author Davy Vanherbergen
 */
public class SQLExplorerWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {
   
    /**
     * Default constructor.
     */
    public SQLExplorerWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    /**
     * Set properties after application window is created.
     * 
     * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#postWindowOpen()
     */
    public void postWindowOpen() {

        super.postWindowOpen();
        IWorkbenchWindowConfigurer windowConfigurer = getWindowConfigurer();
        windowConfigurer.setTitle(Messages.getString("Application.SQLExplorer.WindowTitle"));
        windowConfigurer.setShowCoolBar(false);
        windowConfigurer.setShowPerspectiveBar(false);
        windowConfigurer.setShowProgressIndicator(true);
    }


    /**
     * Here we check the menu bar and remove all items that aren't ours..
     * 
     * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#postWindowCreate()
     */
    public void postWindowCreate() {               

        super.postWindowCreate();
        
        IWorkbenchWindowConfigurer windowConfigurer = getWindowConfigurer(); 
        windowConfigurer.setShowCoolBar(false);
        
        IMenuManager menuBar = windowConfigurer.getActionBarConfigurer().getMenuManager();
        
        // clean file menu
        hideMenuItem(menuBar, IWorkbenchActionConstants.M_FILE, "converstLineDelimitersTo");
        hideMenuItem(menuBar, IWorkbenchActionConstants.M_FILE, "org.eclipse.ui.edit.text.openExternalFile");
                      
        // clean help menu
        hideMenuItem(menuBar, "help", "org.eclipse.ui.actionSet.keyBindings");
        hideMenuItem(menuBar, "help", "org.eclipse.ui.actions.showKeyAssistHandler");

        // refresh menubar 
        menuBar.updateAll(true);
        
    }
    
    
    /**
     * Hide a menu item from the menu bar
     * 
     * @param menuBar
     * @param menupath
     * @param id
     */
    private void hideMenuItem(IMenuManager menuBar, String menupath, String id) {
        
        IMenuManager menu = menuBar.findMenuUsingPath(menupath);
        
        if (menu == null) {
            return;
        }
        
        IContributionItem item = menu.findUsingPath(id);
        if (item != null) {
            item.setVisible(false);
        }
        
    }
    
    /**
     * Create advisor to populate menu bar.
     * 
     * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#createActionBarAdvisor(org.eclipse.ui.application.IActionBarConfigurer)
     */
    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new SQLExplorerActionBarAdvisor(configurer);
    }
    
}
