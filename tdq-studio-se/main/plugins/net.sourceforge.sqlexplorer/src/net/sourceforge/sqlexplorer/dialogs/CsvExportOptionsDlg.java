package net.sourceforge.sqlexplorer.dialogs;

import net.sourceforge.sqlexplorer.Messages;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

/**
 * Dialog for obtaining CSV export options.
 * 
 * @author Rocco Rutte <a href="mailto:pdmef@gmx.net">&lt;pdmef@gmx.net&gt;</a>.
 * 
 */
public class CsvExportOptionsDlg extends AbstractExportOptionsDlg {

    boolean isExportAll = false;

    private static final String[] FILTER = { "*.csv", "*.txt" };

    private static final int FLAGS = FMT_CHARSET | FMT_DELIM | FMT_NULL | OPT_HDR | OPT_QUOTE | OPT_RTRIM;

    public CsvExportOptionsDlg(Shell parentShell) {
        super(parentShell);
    }

    @Override
    public String[] getFileFilter() {
        return FILTER;
    }

    @Override
    public int getFlags() {
        return FLAGS;

    }

    @Override
    public String getMessage() {
        return Messages.getString("ExportDialog.csv.message");
    }

    @Override
    public String getTitle() {
        return Messages.getString("ExportDialog.csv.title");
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * net.sourceforge.sqlexplorer.dialogs.AbstractExportOptionsDlg#addContentChooseRadio(org.eclipse.swt.widgets.Composite
     * )
     */
    @Override
    protected void addContentChooseRadio(Composite comp) {
        Group cntChoosGroup = new Group(comp, SWT.SHADOW_ETCHED_IN);
        cntChoosGroup.setText(Messages.getString("ExportDialog.group.content"));
        cntChoosGroup.setLayout(new GridLayout(1, false));

        Button selectCurrenPage = new Button(cntChoosGroup, SWT.RADIO);
        selectCurrenPage.setText(Messages.getString("ExportDialog.group.content.radio.current"));
        selectCurrenPage.setSelection(!isExportAll);
        selectCurrenPage.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseDown(MouseEvent e) {
                isExportAll = false;

            }

        });
        Button selectAll = new Button(cntChoosGroup, SWT.RADIO);
        selectAll.setText(Messages.getString("ExportDialog.group.content.radio.all"));
        selectAll.setSelection(isExportAll);
        selectAll.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseDown(MouseEvent e) {
                isExportAll = true;

            }

        });
    }

    /**
     * Getter for isExportAll.
     * 
     * @return the isExportAll
     */
    public boolean isExportAll() {
        return this.isExportAll;
    }

}
