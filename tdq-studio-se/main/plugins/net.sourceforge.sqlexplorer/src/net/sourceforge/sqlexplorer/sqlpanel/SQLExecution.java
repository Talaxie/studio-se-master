/*
 * Copyright (C) 2006 SQL Explorer Development Team
 * http://sourceforge.net/projects/eclipsesql
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.sqlexplorer.sqlpanel;

import java.sql.SQLException;
import java.sql.Statement;

import net.sourceforge.sqlexplorer.IConstants;
import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.dataset.DataSetTable;
import net.sourceforge.sqlexplorer.dbproduct.DatabaseProduct;
import net.sourceforge.sqlexplorer.parsers.Query;
import net.sourceforge.sqlexplorer.parsers.QueryParser;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;
import net.sourceforge.sqlexplorer.plugin.editors.Message;
import net.sourceforge.sqlexplorer.plugin.editors.SQLEditor;
import net.sourceforge.sqlexplorer.sqleditor.results.ResultsTab;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * Executes one or more SQL statements in sequence, displaying the results in tabs
 * and/or in the Messages tab
 * @modified John Spackman
 *
 */
public class SQLExecution extends AbstractSQLExecution {
	
	// Whether the editor has any messages
	private boolean hasMessages;

	// Maximum number of rows to return
    protected int _maxRows;

    // The Statement being used to execute the current query
    protected Statement _stmt;


    /**
     * Constructor
     * @param _editor
     * @param queryParser
     * @param maxRows
     * @param _session
     */
    public SQLExecution(SQLEditor _editor, QueryParser queryParser, int maxRows) {
		super(_editor, queryParser);
    	_maxRows = maxRows;
	}


	/**
     * Display SQL Results in result pane
     * @param sqlResult the results of the query
     */
    protected void displayResults(final SQLResult sqlResult) {

    	// Switch to the UI thread to execute this
    	getEditor().getSite().getShell().getDisplay().asyncExec(new Runnable() {

            public void run() {
            	
            	ResultsTab resultsTab = allocateResultsTab(sqlResult.getQuery());
            	if (resultsTab == null)
            		return;
            	String caption = sqlResult.getDataSet().getCaption();
            	if (caption != null)
            		resultsTab.getTabItem().setText(caption);

                try {
                    // set initial message
                    setProgressMessage(Messages.getString("SQLResultsView.ConnectionWait"));
                    
                	Composite composite = resultsTab.getParent();

                    GridLayout gLayout = new GridLayout();
                    gLayout.numColumns = 2;
                    gLayout.marginLeft = 0;
                    gLayout.horizontalSpacing = 0;
                    gLayout.verticalSpacing = 0;
                    gLayout.marginWidth = 0;
                    gLayout.marginHeight = 0;
                    composite.setLayout(gLayout);

                    int resultCount = sqlResult.getDataSet().getRows().length;
                    String statusMessage = Messages.getString("SQLResultsView.Time.Prefix") + " "
                            + sqlResult.getExecutionTimeMillis() + " "
                            + Messages.getString("SQLResultsView.Time.Postfix");
                    getEditor().setMessage(statusMessage);
                    
                    if (resultCount > 0)
                        statusMessage = statusMessage + "  " + Messages.getString("SQLResultsView.Count.Prefix") + " " + resultCount;

                    Query sql = sqlResult.getQuery();
                    int lineNo = sql.getLineNo();
                    lineNo = getQueryParser().adjustLineNo(lineNo);
                    getEditor().addMessage(new Message(Message.Status.SUCCESS, lineNo, 0, sql.getQuerySql(), statusMessage));
                    new DataSetTable(composite, sqlResult.getDataSet(), statusMessage);

                    composite.setData("parenttab", resultsTab.getTabItem());

                    composite.layout();
                    composite.redraw();

                    // reset to start message in case F5 will be used
                    setProgressMessage(Messages.getString("SQLResultsView.ConnectionWait"));

                } catch (Exception e) {

                    // add message
                	if (resultsTab != null) {
	                    String message = e.getMessage();
	                    Label errorLabel = new Label(resultsTab.getParent(), SWT.FILL);
	                    errorLabel.setText(message);
	                    errorLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
                	}
                    SQLExplorerPlugin.error("Error creating result tab", e);
                }
            };
        });
    }


    private void closeStatement() {
        
        if (_stmt == null) {
            return;
        }
        if (_stmt != null) {
            try {
                _stmt.close();
            } catch (Exception e) {
                SQLExplorerPlugin.error("Error closing statement.", e);
            }
        }
        _stmt = null;
        
    }
    
    protected void doExecution(IProgressMonitor monitor) throws Exception {
        int numErrors = 0;
        SQLException lastSQLException = null;

        try {
        	long overallUpdateCount = 0;
            long overallStartTime = System.currentTimeMillis();
        	for (Query query : getQueryParser()) {
            	if (monitor.isCanceled())
            		break;
            	if (getEditor().isClosed())
            		break;
            	
            	// Get the next bit of SQL to run and store it as "current"
            	if (query == null)
            		break;
            	String querySQL = query.getQuerySql().toString();
            	if (querySQL == null)
            		continue;
            	
            	// Initialise
	            setProgressMessage(Messages.getString("SQLResultsView.Executing"));
                final long startTime = System.currentTimeMillis();
                
                // Run it
	            DatabaseProduct.ExecutionResults results = null;
	            try {
	            	DatabaseProduct product = getEditor().getSession().getDatabaseProduct();
	            	try {
		            	results = product.executeQuery(_connection, query, _maxRows);
	            	}catch(RuntimeException e) {
	            		throw new SQLException(e.getMessage());
	            	}
                    final long endTime = System.currentTimeMillis();
	            	DataSet dataSet;
	            	boolean checkedForMessages = false;
	            	while ((dataSet = results.nextDataSet()) != null) {

	                    // update sql result
	            		SQLResult sqlResult = new SQLResult();
	            		sqlResult.setQuery(query);
	                    sqlResult.setDataSet(dataSet);
	                    sqlResult.setExecutionTimeMillis(endTime - startTime);
	
	                    // Save successfull query
	                    SQLExplorerPlugin.getDefault().getSQLHistory().addSQL(querySQL, _session);

	                    if (monitor.isCanceled())
	                        return;

	                    checkForMessages(query);
	                    checkedForMessages = true;
	                    
	                    // show results..
	                    displayResults(sqlResult);
	            	}
	            	overallUpdateCount += results.getUpdateCount();
	            	
	            	if (!checkedForMessages)
	            		checkForMessages(query);
		            debugLogQuery(query, null);
	
	            } catch(final SQLException e) {
		            debugLogQuery(query, e);
	            	boolean stopOnError = SQLExplorerPlugin.getDefault().getPreferenceStore().getBoolean(IConstants.STOP_ON_ERROR);
	                logException(e, query, stopOnError);
	                closeStatement();
	                hasMessages = true;
	            	if (stopOnError) {
	        			errorDialog(Messages.getString("SQLResultsView.Error.Title"), e.getMessage());
	        			return;
	            	}
	            	numErrors++;
	            	lastSQLException = e;
	            	
	            } finally {
	            	try {
	            		if (results != null) {
	            			results.close();
	            			results = null;
	            		}
	            	}catch(SQLException e) {
	            		// Nothing
	            	}
	            }
            }
            if (!hasMessages || SQLExplorerPlugin.getDefault().getPreferenceStore().getBoolean(IConstants.LOG_SUCCESS_MESSAGES)) {
                long overallTime = System.currentTimeMillis() - overallStartTime;
                String message = Long.toString(overallUpdateCount) + " " + Messages.getString("SQLEditor.Update.Prefix") + " " + 
    				Long.toString(overallTime) + " " + Messages.getString("SQLEditor.Update.Postfix");
            
            	addMessage(new Message(Message.Status.STATUS, getQueryParser().adjustLineNo(1), 0, "", message));
            }
        } catch (Exception e) {
            closeStatement();
            throw e;
        }
        if (numErrors == 1)
        	throw lastSQLException;
        else if (numErrors > 1 && SQLExplorerPlugin.getDefault().getPreferenceStore().getBoolean(IConstants.CONFIRM_BOOL_SHOW_DIALOG_ON_QUERY_ERROR))
            getEditor().getSite().getShell().getDisplay().asyncExec(new Runnable() {
                public void run() {
        	    	MessageDialogWithToggle dialog = MessageDialogWithToggle.openInformation(getEditor().getSite().getShell(), 
        	    			Messages.getString("SQLExecution.Error.Title"), 
        	    			Messages.getString("SQLExecution.Error.Message"), 
        	    			Messages.getString("SQLExecution.Error.Toggle"), 
        	    			false, null, null);
        	    	
        	    	if (dialog.getToggleState() && dialog.getReturnCode() == IDialogConstants.OK_ID)
        	    		SQLExplorerPlugin.getDefault().getPluginPreferences().setValue(IConstants.CONFIRM_BOOL_SHOW_DIALOG_ON_QUERY_ERROR, false);
                }
            });
    }
    
    /**
     * Cancel sql execution and close execution tab.
     */
    public void doStop() {

        if (_stmt != null) {
            try {
                _stmt.cancel();
            } catch (Exception e) {
                SQLExplorerPlugin.error("Error cancelling statement.", e);
            }
            try {
                closeStatement();
            } catch (Exception e) {
                SQLExplorerPlugin.error("Error closing statement.", e);
            }
        }

    }

}
