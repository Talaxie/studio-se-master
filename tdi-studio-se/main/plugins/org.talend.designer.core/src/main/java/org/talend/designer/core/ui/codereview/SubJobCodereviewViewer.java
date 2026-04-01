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

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.talend.core.model.process.IProcess2;

/**
 * A viewer including the content provider for the subjob codereview. Used by the JobCodereviewViewPart which has to
 * provide a JobCodereviewLifeCycle on construction
 */
public class SubJobCodereviewViewer extends JobCodereviewViewer {

    public SubJobCodereviewViewer(Composite parent, JobCodereviewLifeCycle lifeCycle, IWorkbenchPart part) {
        super(parent, new SubJobCodereviewContentProvider(lifeCycle), lifeCycle, part);
    }

    /*
     * @see TypeCodereviewViewer#updateContent
     */
    public void updateContent(boolean expand) {
        getTree().setRedraw(false);
        refresh();

        if (expand) {
             int expandLevel = 3;
             expandToLevel(expandLevel);
        }
        getTree().setRedraw(true);
        getTree().setBackground(new Color(236, 237, 239));
    }

    /**
     * Content provider for the 'traditional' job codereview.
     */
    public static class SubJobCodereviewContentProvider extends JobCodereviewContentProvider {

        public SubJobCodereviewContentProvider(JobCodereviewLifeCycle provider) {
            super(provider);
        }

        protected final void getJobsInCodereview(IProcess2 type, List res) {
            JobCodereview codereview = getCodereview();
            if (codereview != null) {
                IProcess2[] types = codereview.getSubtypes(type);
                for (int i = 0; i < types.length; i++) {
                    res.add(types[i]);
                }
            }
        }
    }

}
