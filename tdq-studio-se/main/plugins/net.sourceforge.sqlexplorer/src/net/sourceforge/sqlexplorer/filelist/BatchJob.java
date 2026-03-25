package net.sourceforge.sqlexplorer.filelist;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.dbproduct.DatabaseProduct;
import net.sourceforge.sqlexplorer.dbproduct.SQLConnection;
import net.sourceforge.sqlexplorer.dbproduct.Session;
import net.sourceforge.sqlexplorer.dbproduct.User;
import net.sourceforge.sqlexplorer.parsers.ParserException;
import net.sourceforge.sqlexplorer.parsers.Query;
import net.sourceforge.sqlexplorer.parsers.QueryParser;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;
import net.sourceforge.sqlexplorer.plugin.editors.Message;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

/**
 * Performs batched execution of a series of SQL scripts against a given alias/user
 * @author John Spackman
 *
 */
public class BatchJob extends Job {
	
    private static final Log _logger = LogFactory.getLog(BatchJob.class);
    
	private User user;
	
	private Session session;
	
	private List<File> files;

	public BatchJob(User user, List<File> files) {
		this(Messages.getString("BatchJob.Title"), user, files);
	}

	public BatchJob(String name, User user, List<File> files) {
		super(name);
		this.user = user;
		this.files = files;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		monitor.beginTask(Messages.getString("BatchJob.ExecutingScripts"), files.size());
		DatabaseProduct product = user.getAlias().getDriver().getDatabaseProduct();
		SQLConnection connection = null;
		try {
			if (session == null)
				session = user.createSession();
			connection = session.grabConnection();

			int index = 0;
			for (File file : files) {
				if (monitor.isCanceled())
					break;
				monitor.worked(index++);
				monitor.subTask(file.getName());
				_logger.fatal(file.getAbsolutePath());
	
				String sql = null;
				try {
					char[] buffer = new char[(int)file.length() + 10];
					FileReader reader = new FileReader(file);
					int length = reader.read(buffer);
					reader.close();
					if (length < 0 || length >= buffer.length) {
						SQLExplorerPlugin.error("Cannot read from file " + file.getAbsolutePath());
						continue;
					}
					// Normalise this to have standard \n in strings.  \r confuses Oracle and
					//	isn't normally needed internally anyway
			    	StringBuffer sb = new StringBuffer(new String(buffer, 0, length));
			    	buffer = null;
			    	for (int i = 0; i < sb.length(); i++) {
			    		if (sb.charAt(i) == '\r') {
			    			sb.deleteCharAt(i);
			    			i--;
			    		}
			    	}
			    	sql = sb.toString();
			    	sb = null;
				}catch(IOException e) {
					SQLExplorerPlugin.error("Cannot read from file " + file.getAbsolutePath(), e);
					continue;
				}
				
				QueryParser parser = product.getQueryParser(sql, 1);
				parser.parse();
				for (Query query : parser) {
		            DatabaseProduct.ExecutionResults results = null;
		            try {
		            	results = product.executeQuery(connection, query, -1);
		            	DataSet dataSet;
		            	while ((dataSet = results.nextDataSet()) != null) {
		            		
	                    	LinkedList<Message> messages = new LinkedList<Message>();
		                    Collection<Message> messagesTmp = session.getDatabaseProduct().getErrorMessages(connection, query);
		                    if (messagesTmp != null)
		                    	messages.addAll(messagesTmp);
		                    messagesTmp = session.getDatabaseProduct().getServerMessages(connection);
		                    if (messagesTmp != null)
		                    	messages.addAll(messagesTmp);
	                    	for (Message msg : messages)
	                    		msg.setLineNo(parser.adjustLineNo(msg.getLineNo()));
		                    for (Message message : messages) {
		                    	_logger.fatal(message.getSql());
		                    }
		            	}
		            }catch(SQLException e) {
                    	_logger.fatal(e.getMessage());
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
			}
			monitor.done();
		}catch(SQLException e) {
			SQLExplorerPlugin.error(e);
		}catch(ParserException e) {
			SQLExplorerPlugin.error(e);
		} finally {
			if (connection != null)
				session.releaseConnection(connection);
		}
        return new Status(IStatus.OK, getClass().getName(), IStatus.OK, Messages.getString("BatchJob.Success"), null);
	}

}
