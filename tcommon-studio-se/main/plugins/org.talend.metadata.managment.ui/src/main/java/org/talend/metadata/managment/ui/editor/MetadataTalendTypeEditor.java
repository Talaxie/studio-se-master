// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.metadata.managment.ui.editor;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.osgi.framework.Bundle;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.LoginException;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.exception.SystemException;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.commons.utils.workbench.resources.ResourceUtils;
import org.talend.core.model.metadata.Dbms;
import org.talend.core.model.metadata.MetadataTalendType;
import org.talend.core.model.utils.ResourceModelHelper;
import org.talend.core.model.utils.XSDValidater;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.metadata.managment.ui.MetadataManagmentUiPlugin;
import org.talend.metadata.managment.ui.dialog.MappingFileCheckViewerDialog;
import org.talend.metadata.managment.ui.i18n.Messages;
import org.talend.repository.ProjectManager;
import org.talend.repository.RepositoryWorkUnit;

/**
 * bqian. MetadataTalendType Editor<br/>
 *
 * $Id: MetadataTalendTypeEditor.java 2738 2007-05-11 13:12:27Z bqian $
 *
 */
public class MetadataTalendTypeEditor extends FieldEditor {

    public static final String ID = "org.talend.core.prefs.ui.MetadataTalendTypeEditor"; //$NON-NLS-1$

    public static final String INTERAL_XSD_FILE = MetadataTalendType.INTERNAL_MAPPINGS_FOLDER + "/mapping_validate.xsd"; //$NON-NLS-1$

    private XSDValidater validater;

    /**
     * The Add button.
     */
    protected Button addButton;

    /**
     * The Remove button.
     */
    protected Button removeButton;

    private Button exportButton;

    private Button editButton;

    private String selectId = "mysql_id"; // default_id //$NON-NLS-1$

    TmpFilesManager tmpFileManager = new TmpFilesManager();

    protected TableViewer viewer;

    // hywang add for bug 7695
    private Dbms[] allDbms;

    /**
     * Store file infomation <br/>
     *
     * $Id: MetadataTalendTypeEditor.java 1 May 21, 2007 3:47:57 PM +0000 $
     *
     */
    class FileInfo {

        String fileName;

        File file;

        IDocument fileContent;

        FileType type;

        boolean isDeleted;

    }

    enum FileType {
        USER_DEFINED,
        SYSTEM_DEFAULT,
        USER_EXTERNAL,
    }

    /**
     * FileInfo manager. <br/>
     *
     * $Id: MetadataTalendTypeEditor.java 1 May 21, 2007 3:48:13 PM +0000 $
     *
     */
    class TmpFilesManager {

        // store the editing temporary files
        private List<FileInfo> tmpFiles = new ArrayList<FileInfo>();

        TmpFilesManager() {
            init();
        }

        private void init() {
            try {
                tmpFiles.clear();
                java.nio.file.Path systemMappingPath = MetadataTalendType.getSystemFolderURLOfMappingsFile().toPath();
                Map<String, File> systemFileMap = Stream
                        .of(systemMappingPath.toFile()
                                .listFiles(f -> f.getName().matches(MetadataTalendType.MAPPING_FILE_PATTERN)))
                        .collect(Collectors.toMap(File::getName, Function.identity()));
                List<File> files = MetadataTalendType.getMetadataMappingFiles();
                for (File file : files) {
                    FileInfo info = new FileInfo();
                    info.file = file;
                    info.fileName = file.getName();
                    if (file.toPath().startsWith(systemMappingPath)) {
                        info.type = FileType.SYSTEM_DEFAULT;
                    } else if (systemFileMap.containsKey(file.getName())) {
                        info.type = FileType.USER_DEFINED;
                    } else {
                        info.type = FileType.USER_EXTERNAL;
                    }
                    this.addFile(info);
                }
            } catch (SystemException e) {
                ExceptionHandler.process(e);
            }
        }

        public void addFile(FileInfo file) {
            tmpFiles.add(file);
        }

        List<FileInfo> getTempFiles(boolean includeDeleted) {
            return tmpFiles.stream().filter(f -> includeDeleted || !f.isDeleted || FileType.SYSTEM_DEFAULT == f.type)
                    .sorted((f1, f2) -> f1.fileName.compareTo(f2.fileName)).collect(Collectors.toList());
        }

        boolean contains(String fileName) {
            for (FileInfo info : tmpFiles) {
                if (info.fileName.equals(fileName)) {
                    return true;
                }
            }
            return false;
        }

        void remove(FileInfo file) {
            tmpFiles.remove(file);
        }

        void reload() {
            try {
                MetadataTalendType.loadCommonMappings();
                init();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
        }

    }

    /**
     * MetadataTalendTypeEditor constructor.
     *
     * @param name
     * @param labelText
     * @param parent
     */
    public MetadataTalendTypeEditor(String name, String labelText, Composite parent) {
        init(name, labelText);
        createControl(parent);
        initialValidator();
        // hywang add for bug 7695
        this.allDbms = MetadataTalendType.getAllDbmsArray();

    }

    private void initialValidator() {
        try {
            Path filePath = new Path(INTERAL_XSD_FILE);
            Bundle b = Platform.getBundle("org.talend.core.runtime"); //$NON-NLS-1$
            URL url = FileLocator.toFileURL(FileLocator.find(b, filePath, null));
            File xsdFile = new File(url.getFile());

            validater = new XSDValidater();
            validater.setXsdFile(xsdFile);
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor.
     */
    protected void doFillIntoGrid(Composite parent, int numColumns) {
        Control control = getLabelControl(parent);
        GridData gd = new GridData();
        gd.horizontalSpan = numColumns;
        control.setLayoutData(gd);

        viewer = getTableControl(parent);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.verticalAlignment = GridData.FILL;
        gd.horizontalSpan = numColumns - 1;
        gd.grabExcessHorizontalSpace = true;
        gd.grabExcessVerticalSpace = true;
        viewer.getTable().setLayoutData(gd);

        Composite buttonBox = getButtonBoxControl(parent);
        gd = new GridData();
        gd.verticalAlignment = GridData.BEGINNING;
        buttonBox.setLayoutData(gd);
    }

    /**
     * Returns this field editor's list control.
     *
     * @param parent the parent control
     * @return the list control
     */
    protected TableViewer getTableControl(Composite parent) {
        Table table = createTable(parent);
        viewer = new TableViewer(table);
        viewer.setContentProvider(createContentProvider());
        viewer.setLabelProvider(createLabelProvider());
        table.setFont(parent.getFont());
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                MetadataTalendTypeEditor.this.selectionChanged();
            }
        });
        viewer.addDoubleClickListener(new IDoubleClickListener() {

            public void doubleClick(DoubleClickEvent event) {
                editItem();
            }
        });
        return viewer;
    }

    /**
     * Edit the selected item.
     */
    protected void editItem() {
        FileInfo fileSelected = getSelection();

        MappingFileCheckViewerDialog sourceViewerDialog = new MappingFileCheckViewerDialog(this.getShell(),
                Messages.getString("MetadataTalendTypeEditor.editMappingDialog.title")); //$NON-NLS-1$
        sourceViewerDialog.setValidater(validater);
        if (fileSelected.fileContent != null) {
            // This indicates that the FileInfo has been edited.
            sourceViewerDialog.setDocument(fileSelected.fileContent);
        } else {
            // The first time to edit this FileInfo
            sourceViewerDialog.setDocument(fileSelected.file);
        }
        if (sourceViewerDialog.open() == IDialogConstants.OK_ID) {
            System.out.println(sourceViewerDialog.getResult());
            try {
                File systemFile = new File(MetadataTalendType.getSystemFolderURLOfMappingsFile(), fileSelected.fileName);
                if (systemFile.exists()) {
                    String currentSha1 = MetadataTalendType.getSha1OfText(sourceViewerDialog.getDocument().get());
                    String systemSha1 = MetadataTalendType.getSha1OfFile(systemFile);
                    if (currentSha1 != null && currentSha1.equals(systemSha1)) {
                        fileSelected.type = FileType.SYSTEM_DEFAULT;
                        fileSelected.file = systemFile;
                        setControlEnable(removeButton, false);
                    } else {
                        fileSelected.type = FileType.USER_DEFINED;
                        fileSelected.file = new File(MetadataTalendType.getProjectFolderURLOfMappingsFile(),
                                fileSelected.fileName);
                        setControlEnable(removeButton, true);
                    }
                }
                fileSelected.fileContent = sourceViewerDialog.getDocument();
                fileSelected.isDeleted = false;
            } catch (SystemException e) {
                ExceptionHandler.process(e);
            }
        }
    }

    /**
     * Returns this field editor's button box containing the Add, Remove, Up, and Down button.
     *
     * @param parent the parent control
     * @return the button box
     */
    public Composite getButtonBoxControl(Composite parent) {
        Composite buttonBox = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        layout.marginWidth = 0;
        buttonBox.setLayout(layout);
        createButtons(buttonBox);
        selectionChanged();
        return buttonBox;
    }

    protected Table createTable(Composite parent) {
        Table contextTable = new Table(parent, SWT.BORDER | SWT.SINGLE);
        contextTable.setLinesVisible(true);
        contextTable.setHeaderVisible(true);

        TableColumn fileNameColumn = new TableColumn(contextTable, SWT.NONE);
        fileNameColumn.setText(Messages.getString("MetadataTalendTypeEditor.column1.Name")); //$NON-NLS-1$
        fileNameColumn.setWidth(300);

        return contextTable;
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor.
     */
    protected void adjustForNumColumns(int numColumns) {
        Control control = getLabelControl();
        ((GridData) control.getLayoutData()).horizontalSpan = numColumns;
        ((GridData) viewer.getTable().getLayoutData()).horizontalSpan = numColumns - 1;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.commons.ui.swt.preferences.TableEditor#createButtons(org.eclipse.swt.widgets.Composite)
     */
    protected void createButtons(Composite box) {
        addButton = createPushButton(box, Messages.getString("MetadataTalendTypeEditor.button.import")); //$NON-NLS-1$
        addButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                importItem();
            }
        });

        exportButton = createPushButton(box, Messages.getString("MetadataTalendTypeEditor.button.export")); //$NON-NLS-1$
        exportButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                exportItem();
            }
        });
        editButton = createPushButton(box, Messages.getString("MetadataTalendTypeEditor.button.edit")); //$NON-NLS-1$
        editButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                editItem();
            }
        });
        removeButton = createPushButton(box, JFaceResources.getString("ListEditor.remove")); //$NON-NLS-1$
        removeButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                removeItem();
            }
        });

    }

    /**
     * bqian Comment method "removeItem".
     */
    protected void removeItem() {
        FileInfo info = getSelection();
        info.isDeleted = true;
        if (FileType.USER_DEFINED == info.type) {
            try {
                info.type = FileType.SYSTEM_DEFAULT;
                info.file = new File(MetadataTalendType.getSystemFolderURLOfMappingsFile(), info.fileName);
                info.fileContent = null;
            } catch (SystemException e) {
                ExceptionHandler.process(e);
            }
        }
        refreshViewer();
    }

    /**
     * Helper method to create a push button.
     *
     * @param parent the parent control
     * @param key the resource name used to supply the button's label text
     * @return Button
     */
    protected Button createPushButton(Composite parent, String text) {
        Button button = new Button(parent, SWT.PUSH);
        button.setText(text);
        button.setFont(parent.getFont());
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        int widthHint = convertHorizontalDLUsToPixels(button, IDialogConstants.BUTTON_WIDTH);
        data.widthHint = Math.max(widthHint, button.computeSize(SWT.DEFAULT, SWT.DEFAULT, true).x);
        button.setLayoutData(data);
        return button;
    }

    private Shell getShell() {
        return getLabelControl().getShell();
    }

    private FileInfo getSelection() {
        return (FileInfo) ((IStructuredSelection) viewer.getSelection()).getFirstElement();
    }

    private void exportItem() {
        FileInfo selectedFileInfo = getSelection();
        FileDialog dia = new FileDialog(getShell(), SWT.SAVE);
        dia.setFileName(selectedFileInfo.fileName);
        dia.setFilterExtensions(new String[] { "*.xml" }); //$NON-NLS-1$
        String destination = dia.open();
        if (destination == null) {
            return;
        }
        File destinationFile = new File(destination);
        try {
            if (selectedFileInfo.fileContent != null) {
                Files.write(destinationFile.toPath(), selectedFileInfo.fileContent.get().getBytes());
            } else {
                FilesUtils.copyFile(selectedFileInfo.file, destinationFile);
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

    protected IStructuredContentProvider createContentProvider() {
        return new ArrayContentProvider();
    }

    protected ITableLabelProvider createLabelProvider() {
        return new ITableLabelProvider() {

            public Image getColumnImage(Object element, int columnIndex) {
                return null;
            }

            public String getColumnText(Object element, int columnIndex) {
                if (columnIndex == 0) {
                    if (element instanceof String) {
                        return (String) element;
                    }
                    if (element instanceof FileInfo) {
                        return ((FileInfo) element).file.getName();
                    }
                }
                throw new IllegalStateException();
            }

            public void addListener(ILabelProviderListener listener) {
            }

            public void dispose() {
            }

            public boolean isLabelProperty(Object element, String property) {
                return false;
            }

            public void removeListener(ILabelProviderListener listener) {
            }
        };
    }

    /**
     * Notifies that the Add button has been pressed.
     */
    private void importItem() {
        setPresentsDefaultValue(false);
        File input = getNewInputObject();
        if (input != null) {
            Optional<FileInfo> optional = tmpFileManager.getTempFiles(true).stream()
                    .filter(f -> f.fileName.equals(input.getName())).findAny();
            if (optional.isPresent()) {
                FileInfo tmpFileInfo = optional.get();
                try {
                    String content = new String(Files.readAllBytes(input.toPath()));
                    if (FileType.SYSTEM_DEFAULT == tmpFileInfo.type) {
                        String systemSha1 = MetadataTalendType.getSha1OfSystemMappingFile(tmpFileInfo.fileName);
                        String inputSha1 = MetadataTalendType.getSha1OfText(content);
                        if (inputSha1.equals(systemSha1)) {
                            return;
                        }
                        tmpFileInfo.type = FileType.USER_DEFINED;
                    }
                    tmpFileInfo.fileContent = new Document(content);
                    tmpFileInfo.isDeleted = false;
                } catch (IOException e) {
                    ExceptionHandler.process(e);
                }
            } else {
                FileInfo fileInfo = new FileInfo();
                fileInfo.file = input;
                fileInfo.fileName = input.getName();
                fileInfo.type = FileType.USER_EXTERNAL;
                tmpFileManager.addFile(fileInfo);
            }
            refreshViewer();
        }
    }

    private void refreshViewer() {
        viewer.setInput(tmpFileManager.getTempFiles(false));
        viewer.refresh();
        selectionChanged();
    }

    protected File getNewInputObject() {
        Shell shell = this.getShell();
        FileDialog dialog = new FileDialog(shell);
        dialog.setFilterExtensions(new String[] { "*.xml" }); //$NON-NLS-1$
        String fileName = dialog.open();
        if (fileName == null) {
            return null;
        }
        File xmlFile = new File(fileName);
        if (tmpFileManager.contains(xmlFile.getName())) {
            boolean confirm = MessageDialog.openConfirm(
                            shell,
                    Messages.getString("MetadataTalendTypeEditor.confirmTitle"), //$NON-NLS-1$
                    Messages.getString("MetadataTalendTypeEditor.fileOverwrite")); //$NON-NLS-1$
            return confirm ? xmlFile : null;
        }

        if (!xmlFile.getName().startsWith("mapping_")) { //$NON-NLS-1$
            MessageDialog
                    .openWarning(
                            shell,
                            Messages.getString("MetadataTalendTypeEditor.error.message"), Messages.getString("MetadataTalendTypeEditor.fileNameStartRule")); //$NON-NLS-1$ //$NON-NLS-2$
            return null;
        }

        try {
            // TODO amaumont : temporary disabled to load new version of mapping files
            // TODO amaumont : create a new xsd before enable it
            // validater.validateWithDom(xmlFile);

            return xmlFile;
        } catch (Exception e) {
            IStatus status = new Status(IStatus.ERROR, MetadataManagmentUiPlugin.PLUGIN_ID, IStatus.ERROR,
                    Messages.getString("MetadataTalendTypeEditor.fileIsInvalid"), e); //$NON-NLS-1$
            ErrorDialog.openError(shell, Messages.getString("MetadataTalendTypeEditor.error.message"), null, status); //$NON-NLS-1$
        }

        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.commons.ui.swt.preferences.TableEditor#selectionChanged()
     */
    protected void selectionChanged() {
        boolean selected = !viewer.getSelection().isEmpty();
        setControlEnable(exportButton, selected);
        setControlEnable(editButton, selected);

        boolean removeEnable = selected;
        StructuredSelection select = (StructuredSelection) viewer.getSelection();

        if (select != null) {
            FileInfo info = (FileInfo) select.getFirstElement();
            if (info != null) {
                String buttonText = null;
                if (FileType.USER_DEFINED == info.type || FileType.SYSTEM_DEFAULT == info.type) {
                    buttonText = Messages.getString("MetadataTalendTypeEditor.button.restore"); //$NON-NLS-1$
                } else if (FileType.USER_EXTERNAL == info.type) {
                    buttonText = JFaceResources.getString("ListEditor.remove"); //$NON-NLS-1$
                }
                removeButton.setText(buttonText);
                removeEnable = FileType.SYSTEM_DEFAULT != info.type;
                String id = null;
                String infoName = info.fileName;
                for (Dbms allDbm : allDbms) {
                    if (allDbm.getLabel().equalsIgnoreCase(infoName.substring(0, infoName.indexOf(".")).replace("_", " "))) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        id = allDbm.getId();
                    }
                }
                setSelectId(id); 
            }
        }
        setControlEnable(removeButton, removeEnable);
    }

    protected void setControlEnable(Control control, boolean enable) {
        if (control != null && !control.isDisposed()) {
            control.setEnabled(enable);
        }
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor.
     */
    protected void doLoadDefault() {
        boolean confirm = MessageDialog.openConfirm(Display.getCurrent().getActiveShell(),
                Messages.getString("MetadataTalendTypeEditor.confirmTitle"), //$NON-NLS-1$
                Messages.getString("MetadataTalendTypeEditor.confirmMessage")); //$NON-NLS-1$
        if (confirm) {
            RepositoryWorkUnit workUnit = new RepositoryWorkUnit("Restore mapping files") { //$NON-NLS-1$

                @Override
                protected void run() throws LoginException, PersistenceException {
                    try {
                        File[] projectMappingFiles = MetadataTalendType.getProjectFolderURLOfMappingsFile().listFiles();
                        if (projectMappingFiles != null) {
                            Set<String> systemFileNames = Stream
                                    .of(MetadataTalendType.getSystemFolderURLOfMappingsFile()
                                            .listFiles(f -> f.getName().matches(MetadataTalendType.MAPPING_FILE_PATTERN)))
                                    .map(File::getName).collect(Collectors.toSet());
                            Stream.of(projectMappingFiles).filter(f -> systemFileNames.contains(f.getName()))
                                    .forEach(File::delete);
                        }
                    } catch (SystemException e) {
                        ExceptionHandler.process(e);
                    }
                }
            };
            workUnit.setAvoidUnloadResources(true);
            ProxyRepositoryFactory.getInstance().executeRepositoryWorkUnit(workUnit);
            tmpFileManager.reload();
            super.load();
            viewer.refresh();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.commons.ui.swt.preferences.TableEditor#doLoad()
     */
    @Override
    protected void doLoad() {
        viewer.setInput(tmpFileManager.getTempFiles(false));
    }

    /**
     * Method use for mapping select dialog
     * <p>
     * DOC YeXiaowei Comment method "forceLoad".
     */
    public void forceLoad() {
        viewer.setInput(tmpFileManager.getTempFiles(false));
    }

    /**
     *
     * DOC YeXiaowei Comment method "forceStore".
     */
    public void forceStore() {
        doStore();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.preference.FieldEditor#doStore()
     */
    @Override
    protected void doStore() {
        RepositoryWorkUnit workUnit = new RepositoryWorkUnit("Store mapping files") { //$NON-NLS-1$

            @Override
            protected void run() {
                applyChange();
            }
        };
        workUnit.setAvoidUnloadResources(true);
        ProxyRepositoryFactory.getInstance().executeRepositoryWorkUnit(workUnit);
    }

    private void applyChange() {
        IFolder mappingFolder = null;
        try {
            mappingFolder = ResourceUtils.getFolder(
                    ResourceModelHelper.getProject(ProjectManager.getInstance().getCurrentProject()),
                    MetadataTalendType.PROJECT_MAPPING_FOLDER, false);
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
        }

        boolean needReload = false;
        List<FileInfo> tmpFiles = tmpFileManager.getTempFiles(true);
        for (FileInfo info : tmpFiles) {
            IFile file = mappingFolder.getFile(info.fileName);
            if (FileType.SYSTEM_DEFAULT == info.type || info.isDeleted) {
                try {
                    if (file.exists()) {
                        file.delete(true, null);
                        needReload = true;
                    }
                } catch (CoreException e) {
                    ExceptionHandler.process(e);
                }
                continue;
            }
            if (FileType.USER_DEFINED == info.type || FileType.USER_EXTERNAL == info.type) {
                try {
                    byte[] newContent = info.fileContent == null ? Files.readAllBytes(info.file.toPath())
                            : info.fileContent.get().getBytes();
                    InputStream inputStream = new ByteArrayInputStream(newContent);
                    if (file.exists()) {
                        file.setContents(inputStream, true, false, null);
                    } else {
                        if (!mappingFolder.exists()) {
                            ResourceUtils.createFolder(mappingFolder);
                        }
                        file.create(inputStream, true, null);
                    }
                    needReload = true;
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
            }
        }
        if (needReload) {
            tmpFileManager.reload();
        }
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor.
     */
    public int getNumberOfControls() {
        return 2;
    }

    /**
     * Getter for selectId.
     *
     * @return the selectId
     */
    public String getSelectId() {
        return this.selectId;
    }

    /**
     * Sets the selectId.
     *
     * @param selectId the selectId to set
     */
    public void setSelectId(String selectId) {
        this.selectId = selectId;
    }
}
