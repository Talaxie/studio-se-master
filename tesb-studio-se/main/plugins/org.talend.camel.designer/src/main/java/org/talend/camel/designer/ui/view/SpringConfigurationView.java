package org.talend.camel.designer.ui.view;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.MessagePage;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.part.PageBookView;
import org.talend.camel.designer.i18n.CamelDesignerMessages;
import org.talend.camel.designer.ui.editor.CamelMultiPageTalendEditor;
import org.talend.camel.model.IRouteProcess;

public class SpringConfigurationView extends PageBookView {

    public static final String ID = "org.talend.camel.designer.spring.view"; //$NON-NLS-1$

    @Override
    protected IPage createDefaultPage(PageBook book) {
        MessagePage page = new MessagePage();
        initPage(page);
        page.createControl(book);
        page.setMessage(CamelDesignerMessages.getString("SpringConfigurationView_defaultMessage")); //$NON-NLS-1$
        return page;
    }

    @Override
    protected PageRec doCreatePage(IWorkbenchPart part) {
        final SpringConfigurationPageImpl page = new SpringConfigurationPageImpl(
                ((CamelMultiPageTalendEditor) part).getDesignerEditor());
        initPage(page);
        page.createControl(getPageBook());
        return new PageRec(part, page);
    }

    @Override
    protected void doDestroyPage(IWorkbenchPart part, PageRec rec) {
        rec.page.dispose();
        rec.dispose();
    }

    @Override
    protected IWorkbenchPart getBootstrapPart() {
        IWorkbenchPage page = getSite().getPage();
        if (page != null) {
            return page.getActiveEditor();
        }

        return null;
    }

    @Override
    protected boolean isImportant(IWorkbenchPart part) {
        // We only care about editors
        return part instanceof CamelMultiPageTalendEditor
                && null != ((IRouteProcess) ((CamelMultiPageTalendEditor) part).getProcess()).getSpringContent();
    }

}
