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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.talend.core.model.process.IProcess2;

/**
 * Manages a job codereview, to keep it refreshed, and to allow it to be shared.
 */
public class JobCodereviewLifeCycle {

    private boolean fCodereviewRefreshNeeded;

    private JobCodereview fCodereview;

    private IProcess2 inputProcess;

    public JobCodereviewLifeCycle() {
    }

    public IProcess2 getInputProcess() {
        return this.inputProcess;
    }

    public void setInputProcess(IProcess2 inputProcess) {
        this.inputProcess = inputProcess;
    }

    public JobCodereview getCodereview() {
        return fCodereview;
    }

    /**
     * DOC bqian Comment method "freeCodereview".
     */
    public void freeCodereview() {
        if (fCodereview != null) {
            fCodereview = null;
            inputProcess = null;
        }

    }

    public void ensureRefreshedTypeCodereview(final IProcess2 element, IRunnableContext context) throws InvocationTargetException, InterruptedException {
        if (element == null) {
            freeCodereview();
            return;
        }
        // boolean hierachyCreationNeeded = (fCodereview == null || !element.equals(inputProcess));
        boolean hierachyCreationNeeded = true;

        if (hierachyCreationNeeded || fCodereviewRefreshNeeded) {

            IRunnableWithProgress op = new IRunnableWithProgress() {

                public void run(IProgressMonitor pm) throws InvocationTargetException, InterruptedException {
                    try {
                        doCodereviewRefresh(element, pm);
                    } catch (JavaModelException e) {
                        throw new InvocationTargetException(e);
                    } catch (OperationCanceledException e) {
                        throw new InterruptedException();
                    }
                }
            };
            fCodereviewRefreshNeeded = true;
            context.run(true, true, op);
            fCodereviewRefreshNeeded = false;
        }
    }

    public synchronized void doCodereviewRefresh(IProcess2 element, IProgressMonitor pm) throws JavaModelException {
        // to ensure the order of the two listeners always remove / add listeners on operations
        // on job hierarchies
        // if (fCodereview != null) {
        // fCodereview.removeTypeCodereviewChangedListener(this);
        // JavaCore.removeElementChangedListener(this);
        // }
        fCodereview = createTypeCodereview(element, pm);
        if (pm != null && pm.isCanceled()) {
            throw new OperationCanceledException();
        }
        inputProcess = element;

        // fCodereview.addTypeCodereviewChangedListener(this);
        // JavaCore.addElementChangedListener(this);
        fCodereviewRefreshNeeded = false;
    }

    private JobCodereview createTypeCodereview(IProcess2 process, IProgressMonitor pm) throws JavaModelException {
        return new JobCodereview(process);
    }
}
