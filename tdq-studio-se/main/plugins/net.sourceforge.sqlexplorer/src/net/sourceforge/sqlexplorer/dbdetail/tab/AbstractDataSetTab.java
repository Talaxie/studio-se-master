package net.sourceforge.sqlexplorer.dbdetail.tab;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.dataset.DataSetTable;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;


public abstract class AbstractDataSetTab extends AbstractTab {
   
    private DataSet _dataSet;
      
    protected static final Log _logger = LogFactory.getLog(AbstractDataSetTab.class);
    
    private Composite _composite;    
    
    public final void fillDetailComposite(Composite composite) {

        try {
            
            _composite = composite;

            DataSet dataSet = getCachedDataSet();
            if (dataSet == null) {
                Label label = new Label(composite, SWT.FILL);
                label.setText(Messages.getString("DatabaseDetailView.NoInformation"));
                label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));    
                return;
            }
            
            // store for later use in dataset table
            composite.setData("IDetailTab", this);//$NON-NLS-1$
            
            new DataSetTable(composite, dataSet, getStatusMessage());
                         
            
        } catch (Exception e) {
            
            // couldn't get results.. clean mess up
            Control[] controls = composite.getChildren();
            for (int i = 0; i < controls.length; i++) {
                controls[i].dispose();
            }
            
            // and show error message
            Label label = new Label(composite, SWT.FILL);
            label.setText(Messages.getString("DatabaseDetailView.Tab.Unavailable") + " " + e.getMessage());//$NON-NLS-2$
            label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));    
            
            SQLExplorerPlugin.error(Messages.getString("AbstractDataSetTab.error"), e);
            
        }
        
    }
    
    
    /**
     * Returns dataset. if it doesn't exist yet, it is initialized first.
     */
    public final DataSet getCachedDataSet() throws Exception {
        
        _logger.debug("getting cached data for " + this.getClass().getName());//$NON-NLS-1$
    	
        if (_dataSet != null) {
            return _dataSet;
        }
        
        _dataSet = getDataSet();
        return _dataSet;
    }
    
    
    /**
     * Implement this method to initialzie the dataset;
     */
    public abstract DataSet getDataSet() throws Exception;
    
    
    /**
     * Refresh the contents of the dataset.
     */
    public final void refresh() {
        _dataSet = null;
        
        Control[] controls = _composite.getChildren();
        for (int i = 0; i < controls.length; i++) {
            controls[i].dispose();
        }
        
        fillComposite(_composite);
        _composite.layout();
        _composite.redraw();
    }

       
    /**
     * Implement this method to add a status message on the bottom of the dataset tab.
     */
    public abstract String getStatusMessage();
}
