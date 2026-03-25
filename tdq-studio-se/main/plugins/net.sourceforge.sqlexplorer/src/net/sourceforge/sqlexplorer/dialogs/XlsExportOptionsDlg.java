package net.sourceforge.sqlexplorer.dialogs;

import net.sourceforge.sqlexplorer.Messages;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * Dialog for obtaining XLS export options.
 * 
 * @author Rocco Rutte <a href="mailto:pdmef@gmx.net">&lt;pdmef@gmx.net&gt;</a>.
 * 
 */
public class XlsExportOptionsDlg extends AbstractExportOptionsDlg {

    private static final String[] FILTER = { "*.xls" };

    private static final int FLAGS = FMT_CHARSET | FMT_NULL | OPT_HDR | OPT_QUOTE | OPT_RTRIM;

    public XlsExportOptionsDlg(Shell parentShell) {
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
        return Messages.getString("ExportDialog.xls.message");
    }

    @Override
    public String getTitle() {
        return Messages.getString("ExportDialog.xls.title");
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
        // TODO Auto-generated method stub

    }

}
