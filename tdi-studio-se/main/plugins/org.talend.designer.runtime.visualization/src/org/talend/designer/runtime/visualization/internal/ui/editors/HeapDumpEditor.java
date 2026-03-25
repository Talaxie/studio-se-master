/*******************************************************************************
 * Copyright (c) 2010-2011 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.editors;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.IHeapElement;
import org.talend.designer.runtime.visualization.ISharedImages;
import org.talend.designer.runtime.visualization.core.dump.HeapDumpParser;
import org.talend.designer.runtime.visualization.internal.ui.IHelpContextIds;
import org.talend.designer.runtime.visualization.internal.ui.properties.memory.HeapHistogramPage;
import org.talend.designer.runtime.visualization.internal.ui.properties.memory.IHeapInput;
import org.xml.sax.SAXException;

/**
 * The heap dump editor.
 */
public class HeapDumpEditor extends AbstractDumpEditor {

    /** The heap histogram. */
    HeapHistogramPage heapHistogramPage;

    /** The heap list elements. */
    List<IHeapElement> heapListElements;

    /** The memory image. */
    private Image memoryImage;

    /**
     * The constructor.
     */
    public HeapDumpEditor() {
        heapListElements = new ArrayList<IHeapElement>();
    }

    /*
     * @see AbstractDumpEditor#createClientPages()
     */
    @Override
    protected void createClientPages() {
        createMemoryPage();

        PlatformUI.getWorkbench().getHelpSystem().setHelp(getContainer(), IHelpContextIds.HEAP_DUMP_EDITOR);
    }

    /*
     * @see EditorPart#init(IEditorSite, IEditorInput)
     */
    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        setSite(site);
        setInput(input);

        setPartName(input.getName());

        if (input instanceof IFileEditorInput) {
            String filePath = ((IFileEditorInput) input).getFile().getRawLocation().toOSString();
            parseDumpFile(filePath);
        } else if (input instanceof FileStoreEditorInput) {
            String filePath = ((FileStoreEditorInput) input).getURI().getPath();
            parseDumpFile(filePath);
        }
    }

    /*
     * @see WorkbenchPart#setFocus()
     */
    @Override
    public void setFocus() {
        heapHistogramPage.setFocus();
    }

    /*
     * @see AbstractDumpEditor#dispose()
     */
    @Override
    public void dispose() {
        super.dispose();
        if (memoryImage != null) {
            memoryImage.dispose();
        }
    }

    /**
     * Creates the memory page.
     */
    private void createMemoryPage() {
        heapHistogramPage = new HeapHistogramPage(getContainer(), getEditorSite().getActionBars());
        heapHistogramPage.setInput(new IHeapInput() {

            @Override
            public IHeapElement[] getHeapListElements() {
                return heapListElements.toArray(new IHeapElement[0]);
            }
        });
        int page = addPage(heapHistogramPage);
        setPageText(page, Messages.memoryTabLabel);
        setPageImage(page, getMemoryImage());

        heapHistogramPage.refresh();
    }

    /**
     * Gets the memory image.
     * 
     * @return The memory image
     */
    private Image getMemoryImage() {
        if (memoryImage == null || memoryImage.isDisposed()) {
            memoryImage = Activator.getImageDescriptor(ISharedImages.MEMORY_IMG_PATH).createImage();
        }
        return memoryImage;
    }

    /**
     * Parses the dump file.
     * 
     * @param filePath The file path
     */
    private void parseDumpFile(final String filePath) {

        Job job = new Job(Messages.parseHeapDumpFileJobLabel) {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                HeapDumpParser parser = new HeapDumpParser(new File(filePath), heapListElements, monitor);

                try {
                    parser.parse();
                } catch (ParserConfigurationException e) {
                    return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not load heap dump file.", e); //$NON-NLS-1$
                } catch (SAXException e) {
                    return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not load heap dump file.", e); //$NON-NLS-1$
                } catch (IOException e) {
                    return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not load heap dump file.", e); //$NON-NLS-1$
                }

                setProfileInfo(parser.getProfileInfo());
                Display.getDefault().asyncExec(new Runnable() {

                    @Override
                    public void run() {
                        if (heapHistogramPage != null) {
                            heapHistogramPage.refresh();
                        }
                    }
                });

                return Status.OK_STATUS;
            }
        };
        job.schedule();
    }
}
