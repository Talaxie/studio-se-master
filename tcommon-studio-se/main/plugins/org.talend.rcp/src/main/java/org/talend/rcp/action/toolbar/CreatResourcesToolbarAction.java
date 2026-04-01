// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.rcp.action.toolbar;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuAdapter;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IActionDelegate2;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowPulldownDelegate2;
import org.eclipse.ui.internal.WWinPluginPulldown;
import org.talend.core.PluginChecker;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.utils.RepositoryManagerHelper;
import org.talend.core.model.utils.TalendPropertiesUtil;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.ui.views.IRepositoryView;
import org.talend.rcp.i18n.Messages;

/**
 * DOC qwei class global comment. Detailled comment <br/>
 *
 * $Id: talend.epf 1 2006-09-29 17:06:40 +0000 (ææäº, 29 ä¹æ 2006) nrousseau $
 *
 */
public  class CreatResourcesToolbarAction implements IWorkbenchWindowPulldownDelegate2, IActionDelegate2 {

    /**
     * The menu created by this action
     */
    private Menu fMenu;

    protected boolean fRecreateMenu = false;
    
    protected IWorkbenchWindow window;
    
    public static final String LEARN = "Learn"; //$NON-NLS-1$

    public static final String LEARN_ORIG_URL = "https://help.talend.com";

    public static final String ASK = "Ask"; //$NON-NLS-1$

    public static final String ASK_ORIG_URL = "https://community.talend.com";

    public static final String EXCHANGE = "Exchange"; //$NON-NLS-1$

    public static final String EXCHANGE_ORIG_URL = "http://www.talendforge.org/exchange/index.php";

    public static final String VIDEOS = "Videos"; //$NON-NLS-1$

    public static final String VIDEOS_ORIG_URL = "https://www.talendforge.org/tutorials";

    public static final String CLOUD = "Cloud"; //$NON-NLS-1$

    public static final String CLOUD_ORIG_URL = "https://iam.integrationcloud.talend.com/idp/trial-registration?utm_medium=studio&utm_source=toolbar&utm_campaign=dynamic_acronym";


    /**
     * The action used to render this delegate.
     */
    private IAction fAction;

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.IWorkbenchWindowPulldownDelegate2#getMenu(org.eclipse.swt.widgets.Menu)
     */
    @Override
    public Menu getMenu(Menu parent) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#dispose()
     */
    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
     */
    @Override
    public void init(IWorkbenchWindow window) {
        // TODO Auto-generated method stub
        this.window = window;

    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.IActionDelegate2#init(org.eclipse.jface.action.IAction)
     */
    @Override
    public void init(IAction action) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
     */
    @Override
    public void run(IAction action) {
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.IActionDelegate2#runWithEvent(org.eclipse.jface.action.IAction,
     * org.eclipse.swt.widgets.Event)
     */
    @Override
    public void runWithEvent(IAction action, Event event) {
        if (fMenu == null && action instanceof WWinPluginPulldown) {
            IMenuCreator menuProxy = ((WWinPluginPulldown) action).getMenuCreator();
            ToolItem item = (ToolItem) event.widget;
            menuProxy.getMenu(item.getParent());
        }
        fMenu.setVisible(true);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
     * org.eclipse.jface.viewers.ISelection)
     */
    @Override
    public void selectionChanged(IAction action, ISelection selection) {

    }

    private boolean containsType(Object[] objects, ERepositoryObjectType type) {
        boolean flag = false;
        for (Object object : objects) {
            IRepositoryNode node = (IRepositoryNode) object;
            if (node.getContentType() != null && node.getContentType().equals(type)) {
                flag = true;
                break;
            }
            if (node.getContentType() != null && node.hasChildren()) {
                flag = containsType(node.getChildren().toArray(), type);
                if (flag) {
                    break;
                }
            }
        }
        return flag;
    }

    protected void fillMenu(Menu menu) {

        addToMenu(menu, new ResourceImageTextAction(this.window, "/icons/demo.png", LEARN_ORIG_URL, LEARN,
                Messages.getString("LinksToolbarItem_Learn")), -1);
        addToMenu(menu, new ResourceImageTextAction(this.window, "/icons/irc_protocol.png", ASK_ORIG_URL, ASK,
                Messages.getString("LinksToolbarItem_7")), -1);
        addToMenu(menu, new ResourceImageTextAction(this.window, "/icons/videos_icon16x16.png", VIDEOS_ORIG_URL, VIDEOS,
                Messages.getString("LinksToolbarItem_videos")), -1);
        if (!PluginChecker.isTIS()) {
            addToMenu(menu, new ResourceImageTextAction(this.window, "/icons/cloud.png", CLOUD_ORIG_URL, CLOUD,
                    Messages.getString("LinksToolbarItem_cloud")), -1);
        }
    }

    /**
     * Adds a separator to the given menu.
     *
     * @param menu
     */
    protected void addSeparator(Menu menu) {
        new MenuItem(menu, SWT.SEPARATOR);
    }

    protected void addToMenu(Menu menu, IAction action, int accelerator) {
        StringBuffer label = new StringBuffer();
        if (accelerator >= 0 && accelerator < 10) {
            // add the numerical accelerator
            label.append('&');
            label.append(accelerator);
            label.append(' ');
        }
        label.append(action.getText());
        action.setText(label.toString());
        ActionContributionItem item = new ActionContributionItem(action);
        item.fill(menu, -1);
    }

    @Override
    public Menu getMenu(Control parent) {
        setMenu(new Menu(parent));
        fillMenu(fMenu);
        initMenu();
        return fMenu;
    }

    private void setMenu(Menu menu) {
        if (fMenu != null) {
            fMenu.dispose();
        }
        fMenu = menu;
    }

    /**
     * Creates the menu for the action.
     */
    private void initMenu() {
        // Add listener to re-populate the menu each time
        // it is shown because of dynamic history list
        fMenu.addMenuListener(new MenuAdapter() {

            @Override
            public void menuShown(MenuEvent e) {
                if (fRecreateMenu) {
                    Menu m = (Menu) e.widget;
                    MenuItem[] items = m.getItems();
                    for (MenuItem item : items) {
                        item.dispose();
                    }
                    fillMenu(m);
                    fRecreateMenu = false;
                }
            }
        });

    }

}
