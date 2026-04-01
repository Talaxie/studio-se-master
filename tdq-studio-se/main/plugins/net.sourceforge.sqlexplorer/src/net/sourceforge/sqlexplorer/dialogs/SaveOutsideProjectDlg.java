/*
 * Copyright (C) 2007 SQL Explorer Development Team
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
package net.sourceforge.sqlexplorer.dialogs;

import net.sourceforge.sqlexplorer.IConstants;
import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * Dialog which prompts the user to warn them they are about to save outside
 * a project and that this is not normally a good idea.  Allows the user to
 * turn off further prompts
 * 
 * @author John Spackman
 */
public class SaveOutsideProjectDlg extends TitleAreaDialog {
	
	public SaveOutsideProjectDlg(Shell parentShell) {
		super(parentShell);
	}

    @Override
	public int open() {
    	IConstants.Confirm confirm = SQLExplorerPlugin.getConfirm(IConstants.CONFIRM_YNA_SAVING_INSIDE_PROJECT);
    	if (confirm == IConstants.Confirm.YES)
    		return SWT.YES;
    	else if (confirm == IConstants.Confirm.NO)
    		return SWT.NO;
		return super.open();
	}

	protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText(Messages.getString("Confirm.SaveOutsideProject.Title"));
    }

    @Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.YES_ID, IDialogConstants.YES_LABEL, true);
		createButton(parent, IDialogConstants.NO_ID, IDialogConstants.NO_LABEL, false);
	}

	@Override
	protected Control createContents(Composite parent) {
		Control control = super.createContents(parent);
        setTitle(Messages.getString("Confirm.SaveOutsideProject.Title"));
        return control;
	}

	protected Control createDialogArea(Composite parent) {
		
        // top level composite
        Composite parentComposite = (Composite) super.createDialogArea(parent);

        // create a composite with standard margins and spacing
        Composite composite = new Composite(parentComposite, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
        layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
        layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
        layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
        composite.setLayout(layout);
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        composite.setFont(parentComposite.getFont());

        Label label = new Label(composite, SWT.WRAP);
        String msg = Messages.getString("Confirm.SaveOutsideProject.Intro") + "\n\n";
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
        if (projects == null || projects.length == 0)
        	msg = msg + Messages.getString("Confirm.SaveOutsideProject.NoProjectsConfigured");
    	msg = msg + Messages.getString("Confirm.SaveOutsideProject.SaveInProject");
        label.setText(msg);
        
        return parentComposite;
    }

    protected Point getInitialSize() {
        return new Point(455, 340);
    }
}
