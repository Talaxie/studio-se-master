package org.talend.camel.designer.util;

import java.io.InputStream;
import java.util.Scanner;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.talend.camel.core.model.camelProperties.CamelProcessItem;
import org.talend.camel.designer.ui.view.SpringConfigurationView;
import org.talend.commons.exception.ExceptionHandler;

public class CamelSpringUtil {

    private static String TMP_SPRING_CONTENT = null;

    private CamelSpringUtil() {
    }

    public static String getDefaultContent(CamelProcessItem item) {
        if (TMP_SPRING_CONTENT == null) {
            TMP_SPRING_CONTENT = getTmpSpringContent();
        }

        return TMP_SPRING_CONTENT.replace("${RouteItemName}", item.getProperty().getLabel());
    }

    @SuppressWarnings("resource")
    private static String getTmpSpringContent() {
        try {
            InputStream is = CamelSpringUtil.class.getResourceAsStream("spring.xml");
            String defaultContent = new Scanner(is).useDelimiter("\\A").next();
            is.close();
            return defaultContent;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static IViewPart openSpringView(int mode) {
        // TESB-17301: 'Spring' View is not visible
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        if (window != null) {
            IWorkbenchPage page = window.getActivePage();
            if (page != null) {
                try {
                    return page.showView(SpringConfigurationView.ID, null, mode);
                } catch (PartInitException e) {
                    ExceptionHandler.process(e);
                }
            }
        }
        return null;
    }
}
