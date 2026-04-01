package org.talend.rcp.action.toolbar;

import org.apache.commons.codec.binary.StringUtils;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.program.Program;
import org.eclipse.ui.IWorkbenchWindow;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.service.IExchangeService;
import org.talend.core.service.ITutorialsService;

public class ResourceImageTextAction extends Action {

    private IWorkbenchWindow window;

    private String url;

    public ResourceImageTextAction(IWorkbenchWindow window, String imagePath, String url, String text, String tipText) {
        this.window = window;
        this.url = url;
        ImageRegistry imageRegistry = JFaceResources.getImageRegistry();
        if (imageRegistry.get(imagePath) == null) {
            ImageDescriptor imageDescriptor = ImageDescriptor.createFromFile(ResourceImageTextAction.class, imagePath);;
            if (imageDescriptor != null) {
                imageRegistry.put(imagePath, imageDescriptor);
            }
        }
        setImageDescriptor(imageRegistry.getDescriptor(imagePath));
        setToolTipText(tipText);
        setText(text);
    }

    @Override
    public void run() {
        if (window != null) {
           
            if (StringUtils.equals(CreatResourcesToolbarAction.EXCHANGE_ORIG_URL, url)) {
                IExchangeService service = GlobalServiceRegister.getDefault().getService(IExchangeService.class);
                service.openExchangeEditor();
            } else if (StringUtils.equals(CreatResourcesToolbarAction.VIDEOS_ORIG_URL, url)) {
                ITutorialsService service = GlobalServiceRegister.getDefault().getService(ITutorialsService.class);
                service.openTutorialsDialog();
            } else {
                openBrower(url);
            }
        }
    }

    protected void openBrower(String url) {
        Program.launch(url);
    }
}