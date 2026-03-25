package net.sourceforge.sqlexplorer.filelist;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.connections.ConnectionsView;
import net.sourceforge.sqlexplorer.connections.SessionEstablishedAdapter;
import net.sourceforge.sqlexplorer.dbproduct.Session;
import net.sourceforge.sqlexplorer.dbproduct.User;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;
import net.sourceforge.sqlexplorer.util.ImageUtil;
import net.sourceforge.sqlexplorer.util.PartAdapter2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;

public class FileListEditor extends EditorPart {
	
    private static final Log _logger = LogFactory.getLog(BatchJob.class);
    
	private TextEditor editor;
	private Session session;

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());

		// Create a wrapper for our stuff
		final Composite myParent = new Composite(parent, SWT.NONE);
		FormLayout layout = new FormLayout();
		myParent.setLayout(layout);
		FormData data;

		// Create the toolbar and attach it to the top of the composite
		ToolBar toolBar = new ToolBar(myParent, SWT.NONE);
		data = new FormData();
		data.top = new FormAttachment(0, 0);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		toolBar.setLayoutData(data);
		
		ToolBarManager mgr = new ToolBarManager(toolBar);
		mgr.add(new Action(Messages.getString("FileListEditor.Actions.Execute"), ImageUtil.getDescriptor("Images.ExecSQLIcon")) {
			@Override
			public void run() {
				execute();
			}

			@Override
			public String getToolTipText() {
				return Messages.getString("FileListEditor.Actions.Execute.ToolTip");
			}
		});
		mgr.update(true);
		
		// Attach the editor to the toolbar and the top of the sash
		Composite editorParent = new Composite(myParent, SWT.NONE);
		editorParent.setLayout(new FillLayout());
		editor.createPartControl(editorParent);
		data = new FormData();
		data.top = new FormAttachment(toolBar, 0);
		data.bottom = new FormAttachment(100, 100);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		editorParent.setLayoutData(data);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		// Configure the editor
		setSite(site);
		setInput(input);

		// Create the text editor 
		editor = new TextEditor();
		editor.init(site, input);
		
		// Make sure we get notification that our editor is closing because
		//	we may need to stop running queries
		getSite().getPage().addPartListener(new PartAdapter2() {

			/* (non-JavaDoc)
			 * @see net.sourceforge.sqlexplorer.util.PartAdapter2#partClosed(org.eclipse.ui.IWorkbenchPartReference)
			 */
			public void partClosed(IWorkbenchPartReference partRef) {
				if (partRef.getPart(false) == FileListEditor.this) {
					onCloseEditor();
				}
			}
			
		});

		// If we havn't got a view, then try for the current session in the ConnectionsView
		if (getSession() == null) {
	        ConnectionsView view = SQLExplorerPlugin.getDefault().getConnectionsView();
	        if (view != null) {
        		User user = view.getDefaultUser();
    			if (user != null)
    				user.queueForNewSession(new SessionEstablishedAdapter() {
						@Override
						public void sessionEstablished(Session session) {
							setSession(session);
						}
	        		});
	        }
		}
	}

	/**
	 * Called internally when the user tries to close the editor
	 */
	private void onCloseEditor() {
		editor.getDocumentProvider().disconnect(getEditorInput());
		editor.setInput(null);
	}

	/**
	 * @return the session
	 */
	public Session getSession() {
		// In theory, if our session is somehow closed by something else then we will have already
		//	had our session changed or reset; however, just in case this doesn't happen we can
		//	detect it because the session has it's user set to null when it is detached.  If that
		//	happened, then we reset the session to null
		if (session != null && session.getUser() == null)
			session = null;
		return session;
	}

	/**
	 * Sets the session to use for executing queries
	 * 
	 * @param session The new Session
	 */
	public void setSession(Session session) {
		if (session == this.session)
			return;
		
		// If we already have a session and we're changing to a different one, close the current one
		if (getSession() != null && session != this.session)
			this.session.close();
		this.session = session;
		_logger.fatal("Session set to " + session);
	}
	
	@Override
	public boolean isSaveAsAllowed() {
		return editor.isSaveAsAllowed();
	}

	@Override
	public boolean isDirty() {
		return editor.isDirty();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		editor.doSave(monitor);
	}

	@Override
	public void doSaveAs() {
		editor.doSaveAs();
	}

	@Override
	public void setFocus() {
		editor.setFocus();
	}
	
	protected void execute() {
		IDocument doc = editor.getDocumentProvider().getDocument(editor.getEditorInput());
		String str = doc.get();
		BufferedReader reader = new BufferedReader(new StringReader(str));
		LinkedList<File> files = new LinkedList<File>();
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				line = line.trim();
				if (line.length() < 1)
					continue;
				File file = new File(line);
				if (!file.exists() || !file.canRead())
					SQLExplorerPlugin.error("Cannot locate/read file " + file.getAbsolutePath());
				else
					files.add(file);
			}
		}catch(IOException e) {
			SQLExplorerPlugin.error(e);
		}
		if (files.isEmpty())
			return;
		
        final BatchJob bgJob = new BatchJob(getSession().getUser(), files);
        
        editor.getEditorSite().getShell().getDisplay().syncExec(new Runnable() {
			public void run() {
		        IWorkbenchSiteProgressService siteps = (IWorkbenchSiteProgressService) editor.getEditorSite().getAdapter(IWorkbenchSiteProgressService.class);
		        siteps.showInDialog(editor.getEditorSite().getShell(), bgJob);
		        bgJob.schedule();
			}
        });
	}
}
