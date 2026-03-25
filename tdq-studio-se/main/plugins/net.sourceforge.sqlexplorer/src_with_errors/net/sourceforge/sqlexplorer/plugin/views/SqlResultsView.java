/*
 * Copyright (C) 2006 SQL Explorer Development Team http://sourceforge.net/projects/eclipsesql
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to
 * the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package net.sourceforge.sqlexplorer.plugin.views;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;
import net.sourceforge.sqlexplorer.sqlpanel.AbstractSQLExecution;
import net.sourceforge.sqlexplorer.sqlpanel.SQLResult;
import net.sourceforge.sqlexplorer.sqlpanel.actions.CloseSQLResultTab;
import net.sourceforge.sqlexplorer.util.TextUtil;

import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

/**
 * Displays the results for every query executed in the sql editor.
 * 
 * @author Davy Vanherbergen
 */
public class SqlResultsView extends ViewPart {

    private int _lastTabNumber = 0;

    private Composite _parent;

    private SQLResult[] _results;

    private TabFolder _tabFolder;

    /**
     * Add a new (SQL) Execution Tab
     * 
     * @param AbstractSQLExecution
     */
    public void addSQLExecution(AbstractSQLExecution sqlExecution) {

        if (_tabFolder == null || _tabFolder.isDisposed()) {

            clearParent();

            // create tab folder for different sessions
            _tabFolder = new TabFolder(_parent, SWT.NULL);

            _parent.layout();
            _parent.redraw();

        }

        // create tab
        _lastTabNumber = _lastTabNumber + 1;
        final TabItem tabItem = new TabItem(_tabFolder, SWT.NULL);

        // set tab text & tooltip
        String labelText = "" + _lastTabNumber;
        tabItem.setText(labelText);
        tabItem.setData("tabLabel", labelText);
        tabItem.setToolTipText(TextUtil.getWrappedText(sqlExecution.getSqlStatement()));

        // create composite for our result
        Composite composite = new Composite(_tabFolder, SWT.NULL);

        GridLayout layout = new GridLayout();
        layout.numColumns = 1;
        layout.marginLeft = 0;
        layout.horizontalSpacing = 0;
        layout.verticalSpacing = 2;
        layout.marginWidth = 0;
        layout.marginHeight = 0;

        composite.setLayout(layout);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        tabItem.setControl(composite);
        tabItem.setData(sqlExecution);

        tabItem.addDisposeListener(new DisposeListener() {

            public void widgetDisposed(final DisposeEvent e) {

                BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {

                    public void run() {

                        // stop all sql execution if still running
                        TabItem tabItem = (TabItem) e.getSource();
                        AbstractSQLExecution sqlExecution = (AbstractSQLExecution) tabItem.getData();
                        sqlExecution.stop();
                        tabItem.setData(null);

                        if (_tabFolder != null && !_tabFolder.isDisposed()) {

                            if (_tabFolder.getItemCount() == 0) {
                                // this is last tab..
                                clearParent();
                                setDefaultMessage();
                            }

                        } else if (_tabFolder.isDisposed()) {
                            clearParent();
                            setDefaultMessage();
                        }
                    }
                });
            }

        });

        // add sql statement, first create temp label to calculate correct size

        String sqlStatement = sqlExecution.getSqlStatement();

        int labelHeight = 60;
        int labelStyle = SWT.WRAP | SWT.MULTI;

        Text tmpLabel = new Text(composite, labelStyle);
        tmpLabel.setText(TextUtil.removeLineBreaks(sqlExecution.getSqlStatement()));
        tmpLabel.setLayoutData(new FillLayout());
        int parentWidth = _parent.getClientArea().width;
        Point idealSize = tmpLabel.computeSize(parentWidth - 30, SWT.DEFAULT);

        if (idealSize.y <= 60) {
            // we don't need a scroll bar. minimize
            labelHeight = idealSize.y;
        } else {
            // we need a scroll bar
            labelStyle = SWT.WRAP | SWT.MULTI | SWT.V_SCROLL;
        }

        tmpLabel.dispose();

        // now create real label
        // create spanned cell for table data

        Composite headerComposite = new Composite(composite, SWT.FILL);
        headerComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        GridLayout hLayout = new GridLayout();
        hLayout.numColumns = 2;
        hLayout.marginLeft = 0;
        hLayout.horizontalSpacing = 0;
        hLayout.verticalSpacing = 0;
        hLayout.marginWidth = 0;
        hLayout.marginHeight = 0;

        headerComposite.setLayout(hLayout);

        Text label = new Text(headerComposite, labelStyle);
        label.setEditable(false);
        label.setBackground(_parent.getBackground());
        label.setText(TextUtil.removeLineBreaks(sqlStatement));
        label.setToolTipText(TextUtil.getWrappedText(sqlStatement));

        GridData labelGridData = new GridData(SWT.FILL, SWT.TOP, true, false);
        labelGridData.heightHint = labelHeight;
        label.setLayoutData(labelGridData);

        // add action bar

        ToolBarManager toolBarMgr = new ToolBarManager(SWT.FLAT);
        toolBarMgr.createControl(headerComposite);
        toolBarMgr.add(new CloseSQLResultTab(tabItem));
        toolBarMgr.update(true);
        GridData gid = new GridData();
        gid.horizontalAlignment = SWT.RIGHT;
        gid.verticalAlignment = SWT.TOP;
        toolBarMgr.getControl().setLayoutData(gid);

        // add detail composite to show progress bar and results
        Composite detailComposite = new Composite(composite, SWT.FILL);
        detailComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        sqlExecution.setComposite(detailComposite);
        sqlExecution.setParentTab(tabItem);
        sqlExecution.startExecution();

        // set new tab as the active one
        _tabFolder.setSelection(_tabFolder.getItemCount() - 1);

        // refresh view
        composite.layout();
        _tabFolder.layout();
        _tabFolder.redraw();

        // bring this view to top of the view stack
        getSite().getPage().bringToTop(this);

    }

    /**
     * Remove all items from parent
     */
    private void clearParent() {

        Control[] children = _parent.getChildren();
        if (children != null) {
            for (int i = 0; i < children.length; i++) {
                children[i].dispose();
            }
        }

        _lastTabNumber = 0;
    }

    /**
     * Initialize sql result view.
     * 
     * @see org.eclipse.ui.IWorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    public void createPartControl(Composite parent) {

        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, SQLExplorerPlugin.PLUGIN_ID + ".SQLResultsView");

        _parent = parent;

        // set default message
        if (_results == null || _results.length == 0) {
            setDefaultMessage();
        }

    }

    /**
     * Set a default message, this method is called when no results are available for viewing.
     */
    private void setDefaultMessage() {

        clearParent();

        // add message
        String message = Messages.getString("SQLResultsView.NoResults");
        Label label = new Label(_parent, SWT.FILL);
        label.setText(message);
        label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        _parent.layout();
        _parent.redraw();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IWorkbenchPart#setFocus()
     */
    public void setFocus() {

    }
}
