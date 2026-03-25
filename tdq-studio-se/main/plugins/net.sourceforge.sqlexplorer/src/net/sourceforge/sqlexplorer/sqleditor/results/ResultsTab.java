package net.sourceforge.sqlexplorer.sqleditor.results;

import net.sourceforge.sqlexplorer.plugin.editors.SQLEditor;

import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Composite;

/**
 * The ResultsTab class is instantiated when a new Tab for result sets is created;
 * it exists only to return multiple pieces to the calling code.
 * 
 * NOTE: The TabItem is created, its title is the 1-based index of the tab, and
 * its data has been set to the AbstractSQLExecution but it has no other configuration - 
 * IE the title is not exactly descriptive, there's no tooltip, etc.  Similarly, the
 * parent composite has been created but is completely empty.
 * 
 * The tab does not need to cater for life cycle events or controls - because we're using
 * CTabFolder, the tabs have their own "X" to close/terminate individual query, and the
 * SQLEditor takes care of notifying the query to shutdown.  IE, the parent composite is
 * *just* for result set display.
 */
public class ResultsTab {
	
	// The SQL Editor we are attached to
    @SuppressWarnings("unused")
	private SQLEditor editor;
	
	// The TabItem for the results
	private CTabItem tabItem;
	
	// The parent composite to add controls to 
	private Composite parent;
	
	// The grouping for progress messages
//	private Group group;
	
	/**
	 * Constructor - only used by SQLEditor.createResults
	 * @param editor
	 * @param tabItem
	 * @param parent
	 * @see SQLEditor.createResults()
	 */
	public ResultsTab(SQLEditor editor, CTabItem tabItem, Composite parent) {
		super();
		this.editor = editor;
		this.tabItem = tabItem;
		this.parent = parent;
	}

//	/**
//	 * Called to display the progress bar
//	 */
//	public void displayProgress() {
//		if (tabItem.isDisposed())
//			return;
//
//		// set label to running
//		tabItem.setText(Messages.getString("SQLResultsView.Running"));
//
//		GridLayout gLayout = new GridLayout();
//		gLayout.numColumns = 2;
//		gLayout.marginLeft = 0;
//		gLayout.horizontalSpacing = 0;
//		gLayout.verticalSpacing = 0;
//		gLayout.marginWidth = 0;
//		gLayout.marginHeight = 50;
//		parent.setLayout(gLayout);
//
//		group = new Group(parent, SWT.NULL);
//		group.setLayout(new GridLayout());
//		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
//		group.setText(progressMessage);
//
//		// add progress bar
//		Composite pbComposite = new Composite(group, SWT.FILL);
//		FillLayout pbLayout = new FillLayout();
//		pbLayout.marginHeight = 2;
//		pbLayout.marginWidth = 5;
//		pbComposite.setLayout(pbLayout);
//		pbComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
//		ProgressBar pb = new ProgressBar(pbComposite, SWT.HORIZONTAL
//				| SWT.INDETERMINATE | SWT.BORDER);
//		pb.setVisible(true);
//		pb.setEnabled(true);
//
//		pbComposite.layout();
//		parent.layout();
//
//	}
	
	/**
	 * Returns the tab
	 * @return the tabItem
	 */
	public CTabItem getTabItem() {
		return tabItem;
	}

	/**
	 * Returns the parent composite to add controls to (eg a table with the ResultSet)
	 * @return the parent
	 */
	public Composite getParent() {
		return parent;
	}
	
}