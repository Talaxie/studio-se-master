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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.process.ProcessUtils;
import org.talend.core.model.repository.IRepositoryObject;
import org.talend.core.repository.ui.view.RepositoryLabelProvider;

/**
 * DOC bqian class global comment. Detailled comment
 */
public class CodereviewViewerProvider extends LabelProvider implements IStructuredContentProvider {

    private static final Object[] NO_ELEMENTS = new Object[0];

    private JobCodereviewLifeCycle lifeCycle;

    private RepositoryLabelProvider provider;

    public CodereviewViewerProvider(JobCodereviewLifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;

        provider = new RepositoryLabelProvider(null);
    }

    @Override
    public Image getImage(Object element) {
        IRepositoryObject object = (IRepositoryObject) element;

        return provider.getImage(object);
    }

    @Override
    public String getText(Object element) {
        IRepositoryObject obj = (IRepositoryObject) element;
        return provider.getText(obj.getProperty());
    }

    public void dispose() {

    }

    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

    }

    public Object[] getElements(Object inputElement) {
        if (inputElement instanceof IProcess2) {
            /*
            IProcess2 process = (IProcess2) inputElement;

            List res = new ArrayList();
            JobCodereview codereview = lifeCycle.getCodereview();
            ProcessUtils.clearFakeProcesses(); // force to create fake list
            res.addAll(codereview.getContextDependencies(process));
            res.addAll(codereview.getMetadataDependencies(process));
            ProcessUtils.clearFakeProcesses();
            return res.toArray();
            */

            List<String> items = new ArrayList<>();
            /*
            if (inputProcess != null) {
                items.add(getJobLabel());
                items.add(getProjectLabel());
            }
            */
            items.add("#1");
            items.add("#2");
            items.add("#3");
            return items.toArray();
        }
        return NO_ELEMENTS;
    }

}
