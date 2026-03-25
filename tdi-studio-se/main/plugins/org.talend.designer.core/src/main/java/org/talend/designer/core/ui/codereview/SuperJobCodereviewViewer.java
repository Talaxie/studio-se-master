// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.codereview;

import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.talend.core.model.process.IProcess2;

/**
 * A viewer including the content provider for the superjob codereview. Used by the JobCodereviewViewPart which has to
 * provide a JobCodereviewLifeCycle on construction
 */
public class SuperJobCodereviewViewer extends JobCodereviewViewer {

    public SuperJobCodereviewViewer(Composite parent, JobCodereviewLifeCycle lifeCycle, IWorkbenchPart part) {
        super(parent, new SuperJobCodereviewContentProvider(lifeCycle), lifeCycle, part);
    }

    /*
     * @see TypeCodereviewViewer#updateContent
     */
    public void updateContent(boolean expand) {
        getTree().setRedraw(false);
        refresh();
        if (expand) {
            expandAll();
        }
        getTree().setRedraw(true);
    }

    /**
     * Content provider for the 'traditional' job codereview.
     */
    public static class SuperJobCodereviewContentProvider extends JobCodereviewContentProvider {

        public SuperJobCodereviewContentProvider(JobCodereviewLifeCycle provider) {
            super(provider);
        }

        protected void getJobsInCodereview(IProcess2 process, List res) {

        }
    }

}
