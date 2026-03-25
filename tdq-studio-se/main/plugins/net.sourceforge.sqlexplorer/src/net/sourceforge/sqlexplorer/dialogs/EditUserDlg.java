package net.sourceforge.sqlexplorer.dialogs;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dbproduct.Alias;
import net.sourceforge.sqlexplorer.dbproduct.User;
import net.sourceforge.sqlexplorer.util.ImageUtil;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditUserDlg extends TitleAreaDialog {
	
	public enum Type {
		CREATE, EDIT, COPY
	}

	private Text password;
	private Text userName;
    private Button autoCommit;
    private Button commitOnClose;
    
    private Type type;
    private Alias alias;
	private User user;
	
	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public EditUserDlg(Shell parentShell, Type type, Alias alias, User user) {
		super(parentShell);
		this.type = type;
		this.alias = alias;
		this.user = user;
	}

	/**
	 * Create contents of the dialog
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginBottom = 10;
		gridLayout.marginTop = 10;
		gridLayout.marginRight = 10;
		gridLayout.marginLeft = 10;
		gridLayout.numColumns = 2;
		container.setLayout(gridLayout);
		final GridData gd_container = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd_container.heightHint = 126;
		container.setLayoutData(gd_container);

		final Label connectionProfileLabel = new Label(container, SWT.NONE);
		connectionProfileLabel.setText("Connection Profile");

		final Label profileName = new Label(container, SWT.NONE);
		profileName.setText("Label");

		final Label label_3 = new Label(container, SWT.NONE);
		label_3.setText("Driver");

		final Label driverName = new Label(container, SWT.NONE);
		driverName.setText("Label");

		final Label label_4 = new Label(container, SWT.NONE);
		label_4.setText("URL");

		final Label url = new Label(container, SWT.NONE);
		url.setText("Label");

		final Label usernameLabel = new Label(container, SWT.NONE);
		usernameLabel.setLayoutData(new GridData(99, SWT.DEFAULT));
		usernameLabel.setText("Username");

		userName = new Text(container, SWT.BORDER);
		final GridData gd_userName = new GridData(SWT.LEFT, SWT.CENTER, true, false);
		gd_userName.widthHint = 218;
		userName.setLayoutData(gd_userName);

		final Label passwordLabel = new Label(container, SWT.NONE);
		passwordLabel.setText("Password");

		password = new Text(container, SWT.BORDER);
		final GridData gd_password = new GridData(SWT.LEFT, SWT.CENTER, true, false);
		gd_password.widthHint = 218;
		password.setLayoutData(gd_password);
		password.setEchoChar('*');
		new Label(container, SWT.NONE);

		autoCommit = new Button(container, SWT.CHECK);
		autoCommit.setToolTipText("Sets the default for new SQL Editors");
		autoCommit.setText("Auto Commit (for new connections)");
		new Label(container, SWT.NONE);
        
        commitOnClose = new Button(container, SWT.CHECK);
        final GridData gd_commitOnClose = new GridData();
        commitOnClose.setLayoutData(gd_commitOnClose);
        commitOnClose.setToolTipText("Sets the default for new SQL editors");
        commitOnClose.setText("Commit On Close (for new connections)");
        
        autoCommit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				commitOnClose.setEnabled(!autoCommit.getSelection());
			}
        });

        if (user != null) {
        	if (type != Type.COPY) {
	        	userName.setText(user.getUserName());
	        	password.setText(user.getPassword());
        	}
        	autoCommit.setSelection(user.isAutoCommit());
	        commitOnClose.setEnabled(!user.isAutoCommit());
	        commitOnClose.setSelection(user.isCommitOnClose());
        }
		setTitle("Create / Edit User Details");
		setTitleImage(ImageUtil.getImage("Images.WizardLogo"));
        
		profileName.setText(alias.getName());
		if (alias.getDriver() != null)
			driverName.setText(alias.getDriver().getName());
		else
			driverName.setText("");
		url.setText(alias.getUrl());
		
		return area;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		String userName = this.userName.getText().trim();
		String password = this.password.getText().trim();
		if (userName.length() < 1) {
			MessageDialog.openError(getShell(), Messages.getString("EditUserDlg.MustGiveUsername.Title"), Messages.getString("EditUserDlg.MustGiveUsername.Message"));
			return;
		}
		
		User newUser = new User(userName, password);
		newUser.setAutoCommit(autoCommit.getSelection());
		newUser.setCommitOnClose(commitOnClose.getSelection());
    	alias.setHasNoUserName(false);
       	User mergedUser = alias.addUser(newUser);
       	if (mergedUser != user && user != null) {
       		alias.removeUser(user);
       		user = mergedUser;
       	}
		
		super.okPressed();
	}

	/**
	 * Create contents of the button bar
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(376, 304);
	}

}
