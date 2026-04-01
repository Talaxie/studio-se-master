package org.talend.rcp.action.toolbar;

import org.apache.commons.codec.binary.StringUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.ToolItem;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.service.IExchangeService;
import org.talend.core.service.ITutorialsService;
import org.talend.rcp.i18n.Messages;

public class ResourceToolbarHandler extends AbstractHandler {

    public static final String LEARN = "Learn"; //$NON-NLS-1$

    public static final String LEARN_ORIG_URL = "https://www.deilink.fr/#/academy";//$NON-NLS-1$
    
    public static final String DOCUMENTATION = "Documentation";//$NON-NLS-1$
    
    public static final String DOCUMENTATION_ORIG_URL = Messages.getString("ResourceToolbarHandler.documentationLink"); //$NON-NLS-1$

    public static final String ASK = "Ask"; //$NON-NLS-1$

    public static final String ASK_ORIG_URL = "https://www.deilink.fr/#/community";//$NON-NLS-1$

    public static final String EXCHANGE = "Exchange"; //$NON-NLS-1$

    public static final String EXCHANGE_ORIG_URL = "http://www.talendforge.org/exchange/index.php";//$NON-NLS-1$

    public static final String VIDEOS = "Videos"; //$NON-NLS-1$

    public static final String VIDEOS_ORIG_URL = "https://www.talendforge.org/tutorials";//$NON-NLS-1$

    public static final String CLOUD = "Cloud"; //$NON-NLS-1$

    public static final String CLOUD_ORIG_URL = "https://www.talend.com/free-trial";//$NON-NLS-1$

    public static final String WHATS_NEW_URL = "https://www.deilink.fr/#/release";//$NON-NLS-1$

    public static final String PLANS_URL = "https://www.deilink.fr/#/pricing/";//$NON-NLS-1$

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        String id = event.getCommand().getId();

        if (StringUtils.equals(id, "org.talend.rcp.plans.command")) {//$NON-NLS-1$
            openBrower(PLANS_URL);
        }
        if (StringUtils.equals(id, "org.talend.rcp.whats.new.command")) {//$NON-NLS-1$
            openBrower(WHATS_NEW_URL);
        }
        if (StringUtils.equals(id, "org.talend.resoruses.toolbar.Learn")) {//$NON-NLS-1$
            openBrower(LEARN_ORIG_URL);
        }
        if (StringUtils.equals(id, "org.talend.resoruses.toolbar.Documentation")) {//$NON-NLS-1$
            openBrower(DOCUMENTATION_ORIG_URL);
        }
        if (StringUtils.equals(id, "org.talend.resoruses.toolbar.Ask")) {//$NON-NLS-1$
            openBrower(ASK_ORIG_URL);
        }
        if (StringUtils.equals(id, "org.talend.resoruses.toolbar.Exchange")) {//$NON-NLS-1$
            IExchangeService service = GlobalServiceRegister.getDefault().getService(IExchangeService.class);
            service.openExchangeEditor();
        }
        if (StringUtils.equals(id, "org.talend.resoruses.toolbar.Vidoes")) {//$NON-NLS-1$
            ITutorialsService service = GlobalServiceRegister.getDefault().getService(ITutorialsService.class);
            service.openTutorialsDialog();
        }
        if (StringUtils.equals(id, "org.talend.resoruses.toolbar.Cloud")) {//$NON-NLS-1$
            openBrower(CLOUD_ORIG_URL);
        }
        if (StringUtils.equals(id, "org.talend.resoruses.toolbar.referenceCommand")) {//$NON-NLS-1$
        	if (event == null) return null;
        	if (!( event.getTrigger() instanceof Event)) return null;
        	Event eventWidget = (Event)event.getTrigger();
        	if (!( eventWidget.widget instanceof ToolItem)) return null;
        	ToolItem toolItem = (ToolItem)eventWidget.widget;
        	// Creates fake selection event.
        	Event newEvent = new Event();
        	newEvent.button = 1;
        	newEvent.widget = toolItem;
        	newEvent.detail = SWT.ARROW;
        	newEvent.x = toolItem.getBounds().x;
        	newEvent.y = toolItem.getBounds().y + toolItem.getBounds().height;
        	// Dispatches the event.
        	toolItem.notifyListeners( SWT.Selection, newEvent );
        	return null;	
        }
        return null;
    }

    protected void openBrower(String url) {
        Program.launch(url);
    }
}