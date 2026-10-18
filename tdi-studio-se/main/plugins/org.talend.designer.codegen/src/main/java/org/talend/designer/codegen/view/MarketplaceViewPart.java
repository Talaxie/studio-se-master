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
package org.talend.designer.codegen.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.part.ViewPart;
import org.talend.commons.ui.runtime.ColorConstants;
import org.talend.commons.ui.utils.io.archive.Unzipper;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.core.ui.webService.Webhook;
import org.talend.designer.codegen.CodeGeneratorActivator;
import org.talend.designer.codegen.components.ui.IComponentPreferenceConstant;
import org.talend.designer.codegen.i18n.Messages;

public class MarketplaceViewPart extends ViewPart {

    private static final Logger LOGGER = Logger.getLogger(MarketplaceViewPart.class);

    public static final String ID = "org.talend.designer.codegen.view.MarketplaceViewPart"; //$NON-NLS-1$

    private Display display = null;

    private Text searchText = null;

    private ExpandItem uninstallExpandItem = null;

    private Composite uninstallComposite = null;

    private List<HashMap<String, String>> componentUninstalleds = null;

    private ExpandItem installExpandItem = null;

    private Composite installComposite = null;

    private List<HashMap<String, String>> componentInstalleds = null;

    private static final String COMPONENTS_PREFERENCE_PAGE_ID = "org.talend.designer.codegen.components.preference"; //$NON-NLS-1$

    private Composite noComponentPathComposite = null;

    private ExpandBar expandBar = null;

    private final IPropertyChangeListener componentPathListener = event -> {
        if (IComponentPreferenceConstant.USER_COMPONENTS_FOLDER.equals(event.getProperty()) && display != null
                && !display.isDisposed()) {
            display.asyncExec(() -> {
                if (expandBar != null && !expandBar.isDisposed()) {
                    componentsInit();
                }
            });
        }
    };

    /**
     * Constructor
     */
    public MarketplaceViewPart() {
        // TODO
    }

    @Override
    public void createPartControl(Composite container) {
        Composite parent = container;
        GridLayout gridLayout = new GridLayout(1, false);
        parent.setLayout(gridLayout);
        display = parent.getDisplay();
        parent.setBackground(ColorConstants.WHITE_COLOR);

        // Créez un composite pour afficher les détails de l'élément sélectionné
        Composite headerComposite = new Composite(parent, SWT.NONE);
        headerComposite.setLayout(new GridLayout(2, false));
        headerComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        headerComposite.setBackground(ColorConstants.WHITE_COLOR);

        searchText = new Text(headerComposite, SWT.BORDER | SWT.SEARCH | SWT.ICON_CANCEL);
        searchText.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        searchText.setText("");
        searchText.setMessage(Messages.getString("MarketplaceViewPart.search")); //$NON-NLS-1$
        searchText.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.keyCode == SWT.CR) {
                    componentsInit();
                }
            }
        });
        searchText.addListener(SWT.DefaultSelection, event -> {
            if (event.detail == SWT.ICON_CANCEL) {
                componentsInit();
            }
        });

        Button searchButton = new Button(headerComposite, SWT.NONE);
        searchButton.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/refresh.png")).createImage());
        searchButton.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false));
        searchButton.addListener(SWT.Selection, event -> componentsInit());

        // No user components folder: message and button to the Talaxie > Components preferences
        noComponentPathComposite = new Composite(parent, SWT.NONE);
        noComponentPathComposite.setLayout(new GridLayout(1, false));
        noComponentPathComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        noComponentPathComposite.setBackground(ColorConstants.WHITE_COLOR);

        Label noComponentPathLabel = new Label(noComponentPathComposite, SWT.WRAP);
        noComponentPathLabel.setText(Messages.getString("MarketplaceViewPart.noComponentPath")); //$NON-NLS-1$
        noComponentPathLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        noComponentPathLabel.setBackground(ColorConstants.WHITE_COLOR);

        Button preferencesButton = new Button(noComponentPathComposite, SWT.PUSH);
        preferencesButton.setText(Messages.getString("MarketplaceViewPart.openPreferences")); //$NON-NLS-1$
        preferencesButton.addListener(SWT.Selection, event -> PreferencesUtil
                .createPreferenceDialogOn(parent.getShell(), COMPONENTS_PREFERENCE_PAGE_ID, null, null).open());

        expandBar = new ExpandBar(parent, SWT.V_SCROLL);
        expandBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        expandBar.setBackground(new Color(255, 255, 255));

        // Uninstall
        uninstallComposite = new Composite(expandBar, SWT.NONE);
        uninstallComposite.setLayout(new GridLayout());
        uninstallComposite.setBackground(new Color(255, 255, 255));
        uninstallExpandItem = new ExpandItem(expandBar, SWT.NONE, 0);
        uninstallExpandItem.setText(Messages.getString("MarketplaceViewPart.notInstalled")); //$NON-NLS-1$
        uninstallExpandItem.setControl(uninstallComposite);
        uninstallExpandItem.setExpanded(true);

        // Install
        installComposite = new Composite(expandBar, SWT.NONE);
        installComposite.setLayout(new GridLayout());
        installComposite.setBackground(new Color(255, 255, 255));
        installExpandItem = new ExpandItem(expandBar, SWT.NONE, 1);
        installExpandItem.setText(Messages.getString("MarketplaceViewPart.installed")); //$NON-NLS-1$
        installExpandItem.setHeight(installComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
        installExpandItem.setControl(installComposite);

        // refresh the view when the user components folder is changed in the preferences
        CodeGeneratorActivator.getDefault().getPreferenceStore().addPropertyChangeListener(componentPathListener);

        componentsInit();
    }

    @Override
    public void setFocus() {
        // TODO
    }

    @Override
    public void dispose() {
        CodeGeneratorActivator.getDefault().getPreferenceStore().removePropertyChangeListener(componentPathListener);
        super.dispose();
    }

    /**
     * Shows the message and the button to the preferences when no user components folder is defined, else the lists of
     * components.
     */
    private void updateComponentPathState() {
        boolean noComponentPath = getComponentPath().isEmpty();
        noComponentPathComposite.setVisible(noComponentPath);
        ((GridData) noComponentPathComposite.getLayoutData()).exclude = !noComponentPath;
        expandBar.setVisible(!noComponentPath);
        ((GridData) expandBar.getLayoutData()).exclude = noComponentPath;
        searchText.setEnabled(!noComponentPath);
        noComponentPathComposite.getParent().layout(true, true);
    }

    private void componentsInit() {
        componentUninstalleds = null;
        componentInstalleds = null;
        updateComponentPathState();
        if (getComponentPath().equals("")) {
            return;
        }
        displayList();

        String search = searchText.getText();
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(() -> {
            try {
                List<HashMap<String, String>> components = Webhook.marketplaceComponents(search);
                componentUninstalleds = new ArrayList<>();
                componentInstalleds = new ArrayList<>();
                for (HashMap<String, String> component : components) {
                    Path componentDirectory = Path.of(getComponentPath(), component.get("name"));
                    if (new File(componentDirectory.toString()).exists()
                            || new File(componentDirectory.toString() + ".car").exists()) {
                        componentInstalleds.add(component);
                    } else {
                        componentUninstalleds.add(component);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            displayList();
        });
    }

    private void displayList() {
        display.syncExec(() -> {
            if (uninstallComposite.getChildren().length > 0) {
                if (!uninstallComposite.getChildren()[0].isDisposed()) {
                    uninstallComposite.getChildren()[0].dispose();
                }
            }
            if (installComposite.getChildren().length > 0) {
                if (!installComposite.getChildren()[0].isDisposed()) {
                    installComposite.getChildren()[0].dispose();
                }
            }
        });

        display.syncExec(() -> {
            // uninstall components
            Composite composite = new Composite(uninstallComposite, SWT.NONE);
            composite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
            composite.setLayout(new GridLayout(1, false));
            composite.setBackground(ColorConstants.WHITE_COLOR);

            if (getComponentPath().equals("")) {
                // nothing: the message and the button to the preferences are shown instead of the lists
            } else if (componentUninstalleds == null) {
                ProgressBar progressBar = new ProgressBar(composite, SWT.INDETERMINATE);
                progressBar.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
                progressBar.setVisible(true);
            } else if (componentUninstalleds.isEmpty()) {
                CLabel authorLabel = new CLabel(composite, SWT.NONE);
                authorLabel.setText(Messages.getString("MarketplaceViewPart.none")); //$NON-NLS-1$
                authorLabel.setBackground(ColorConstants.WHITE_COLOR);
            } else {
                for (HashMap<String, String> component : componentUninstalleds) {
                    Composite titreComposite = new Composite(composite, SWT.NONE);
                    titreComposite.setLayout(new GridLayout(2, false));
                    titreComposite.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, true, false));
                    titreComposite.setBackground(ColorConstants.WHITE_COLOR);

                    // Logo
                    Label imageLabel = new Label(titreComposite, SWT.NONE);
                    imageLabel.setImage(Webhook.getImageFromWeb(component.get("image"), display));
                    imageLabel.setBackground(ColorConstants.WHITE_COLOR);

                    // Titre
                    CLabel titleLabel = new CLabel(titreComposite, SWT.BOLD);
                    titleLabel.setFont(new org.eclipse.swt.graphics.Font(null, "Arial", 14, SWT.BOLD | SWT.ITALIC));
                    titleLabel.setForeground(new Color(96, 125, 139));
                    titleLabel.setText(component.get("name"));
                    titleLabel.setBackground(ColorConstants.WHITE_COLOR);

                    Composite itemComposite = new Composite(composite, SWT.NONE);
                    itemComposite.setLayout(new GridLayout(2, false));
                    itemComposite.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, true, false));
                    itemComposite.setBackground(ColorConstants.WHITE_COLOR);

                    Composite leftComposite = new Composite(itemComposite, SWT.NONE);
                    leftComposite.setLayout(new GridLayout(1, false));
                    leftComposite.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));
                    leftComposite.setBackground(ColorConstants.WHITE_COLOR);

                    // Install
                    Button installButton = new Button(leftComposite, SWT.NONE);
                    if (component.get("origine").equals("Talaxie")) {
                        installButton.setImage(ImageDescriptor
                                .createFromURL(this.getClass().getResource("/icons/appli_16x16.png")).createImage());
                    } else if (component.get("origine").equals("Private")) {
                        installButton.setImage(ImageDescriptor
                                .createFromURL(this.getClass().getResource("/icons/company_16x16.png")).createImage());
                    }
                    installButton.setText(Messages.getString("MarketplaceViewPart.install")); //$NON-NLS-1$
                    installButton.addListener(SWT.Selection, event -> {
                        installButton.setEnabled(false);
                        installButton.setText(Messages.getString("MarketplaceViewPart.installing")); //$NON-NLS-1$
                        if (componentInstall(component))
                            installButton.setText(Messages.getString("MarketplaceViewPart.installedDone")); //$NON-NLS-1$
                        else {
                            installButton.setText(Messages.getString("MarketplaceViewPart.install")); //$NON-NLS-1$
                            installButton.setEnabled(true);
                        }

                    });

                    // Version
                    Label versionLabel = new Label(leftComposite, SWT.WRAP);
                    versionLabel.setText(component.get("version") + " (" + component.get("releaseDate") + ")");
                    versionLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
                    versionLabel.setForeground(new Color(200, 200, 200));
                    versionLabel.setFont(new org.eclipse.swt.graphics.Font(null, "Arial", 7, SWT.ITALIC));
                    versionLabel.setBackground(ColorConstants.WHITE_COLOR);

                    Composite bodyComposite = new Composite(itemComposite, SWT.NONE);
                    bodyComposite.setLayout(new GridLayout(1, false));
                    bodyComposite.setBackground(ColorConstants.WHITE_COLOR);

                    // Description
                    Label descriptionLabel = new Label(bodyComposite, SWT.WRAP);
                    descriptionLabel.setText(component.get("description"));
                    descriptionLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
                    descriptionLabel.setBackground(ColorConstants.WHITE_COLOR);

                    // Item footer
                    Composite itemheaderComposite = new Composite(bodyComposite, SWT.NONE);
                    itemheaderComposite.setLayout(new GridLayout(2, false));
                    itemheaderComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
                    itemheaderComposite.setBackground(ColorConstants.WHITE_COLOR);

                    // Author
                    CLabel authorLabel = new CLabel(itemheaderComposite, SWT.BOLD);
                    authorLabel.setFont(new org.eclipse.swt.graphics.Font(null, "Arial", 7, SWT.BOLD));
                    authorLabel.setForeground(new Color(98, 168, 234));
                    authorLabel.setText(component.get("author"));
                    authorLabel.setBackground(ColorConstants.WHITE_COLOR);

                    // Lien
                    Link link = new Link(itemheaderComposite, SWT.NONE);
                    link.setText("<a href=\"" + component.get("url") + "\">" + Messages.getString("MarketplaceViewPart.seeInfo") + "</a>"); //$NON-NLS-1$
                    link.setBackground(ColorConstants.WHITE_COLOR);
                    link.addListener(SWT.Selection, event -> openUrl(event.text));

                    // Separator
                    Label separatorLabel = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
                    separatorLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
                }
            }
            uninstallExpandItem.setHeight(uninstallComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);

            // install components
            Composite compositeInstall = new Composite(installComposite, SWT.NONE);
            compositeInstall.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
            compositeInstall.setLayout(new GridLayout(1, false));
            compositeInstall.setBackground(ColorConstants.WHITE_COLOR);

            if (getComponentPath().equals("")) {
                // nothing: the message and the button to the preferences are shown instead of the lists
            } else if (componentInstalleds == null) {
                ProgressBar progressBar = new ProgressBar(compositeInstall, SWT.INDETERMINATE);
                progressBar.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
                progressBar.setVisible(true);
            } else if (componentInstalleds.isEmpty()) {
                CLabel authorLabel = new CLabel(compositeInstall, SWT.NONE);
                authorLabel.setText(Messages.getString("MarketplaceViewPart.none")); //$NON-NLS-1$
                authorLabel.setBackground(ColorConstants.WHITE_COLOR);
            } else {
                for (HashMap<String, String> component : componentInstalleds) {
                    Composite titreComposite = new Composite(compositeInstall, SWT.NONE);
                    titreComposite.setLayout(new GridLayout(2, false));
                    titreComposite.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, true, false));
                    titreComposite.setBackground(ColorConstants.WHITE_COLOR);

                    // Logo
                    Label imageLabel = new Label(titreComposite, SWT.NONE);
                    imageLabel.setImage(Webhook.getImageFromWeb(component.get("image"), display));
                    imageLabel.setBackground(ColorConstants.WHITE_COLOR);

                    // Titre
                    CLabel titleLabel = new CLabel(titreComposite, SWT.BOLD);
                    titleLabel.setFont(new org.eclipse.swt.graphics.Font(null, "Arial", 14, SWT.BOLD | SWT.ITALIC));
                    titleLabel.setForeground(new Color(96, 125, 139));
                    titleLabel.setText(component.get("name"));
                    titleLabel.setBackground(ColorConstants.WHITE_COLOR);

                    Composite itemComposite = new Composite(compositeInstall, SWT.NONE);
                    itemComposite.setLayout(new GridLayout(2, false));
                    itemComposite.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, true, false));
                    itemComposite.setBackground(ColorConstants.WHITE_COLOR);

                    Composite leftComposite = new Composite(itemComposite, SWT.NONE);
                    leftComposite.setLayout(new GridLayout(1, false));
                    leftComposite.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));
                    leftComposite.setBackground(ColorConstants.WHITE_COLOR);

                    // Remove
                    Button removeButton = new Button(leftComposite, SWT.NONE);
                    removeButton.setBackground(new Color(210, 255, 210));
                    if (component.get("origine").equals("Talaxie")) {
                        removeButton.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/appli_16x16.png"))
                                .createImage());
                    } else if (component.get("origine").equals("Private")) {
                        removeButton.setImage(ImageDescriptor
                                .createFromURL(this.getClass().getResource("/icons/company_16x16.png")).createImage());
                    }
                    removeButton.setText(Messages.getString("MarketplaceViewPart.remove")); //$NON-NLS-1$
                    removeButton.addListener(SWT.Selection, event -> {
                        removeButton.setEnabled(false);
                        removeButton.setText(Messages.getString("MarketplaceViewPart.removing")); //$NON-NLS-1$
                        if (componentsUninstall(component))
                            promptRestartIfNeeded(Messages.getString("MarketplaceViewPart.uninstallRestart")); //$NON-NLS-1$
                        removeButton.setText(Messages.getString("MarketplaceViewPart.removed")); //$NON-NLS-1$
                    });

                    // Version
                    Label versionLabel = new Label(leftComposite, SWT.WRAP);
                    versionLabel.setText(component.get("version") + " (" + component.get("releaseDate") + ")");
                    versionLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
                    versionLabel.setForeground(new Color(200, 200, 200));
                    versionLabel.setFont(new org.eclipse.swt.graphics.Font(null, "Arial", 7, SWT.ITALIC));
                    versionLabel.setBackground(ColorConstants.WHITE_COLOR);

                    Composite bodyComposite = new Composite(itemComposite, SWT.NONE);
                    bodyComposite.setLayout(new GridLayout(1, false));
                    bodyComposite.setBackground(ColorConstants.WHITE_COLOR);

                    // Description
                    Label descriptionLabel = new Label(bodyComposite, SWT.WRAP);
                    descriptionLabel.setText(component.get("description"));
                    descriptionLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
                    descriptionLabel.setBackground(ColorConstants.WHITE_COLOR);

                    // Item footer
                    Composite itemheaderComposite = new Composite(bodyComposite, SWT.NONE);
                    itemheaderComposite.setLayout(new GridLayout(2, false));
                    itemheaderComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
                    itemheaderComposite.setBackground(ColorConstants.WHITE_COLOR);

                    // Author
                    CLabel authorLabel = new CLabel(itemheaderComposite, SWT.BOLD);
                    authorLabel.setFont(new org.eclipse.swt.graphics.Font(null, "Arial", 7, SWT.BOLD));
                    authorLabel.setForeground(new Color(98, 168, 234));
                    authorLabel.setText(component.get("author"));
                    authorLabel.setBackground(ColorConstants.WHITE_COLOR);

                    // Lien
                    Link link = new Link(itemheaderComposite, SWT.NONE);
                    link.setText("<a href=\"" + component.get("url") + "\">" + Messages.getString("MarketplaceViewPart.seeInfo") + "</a>"); //$NON-NLS-1$
                    link.setBackground(ColorConstants.WHITE_COLOR);
                    link.addListener(SWT.Selection, event -> openUrl(event.text));

                    // Separator
                    Label separatorLabel = new Label(compositeInstall, SWT.SEPARATOR | SWT.HORIZONTAL);
                    separatorLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
                }
            }
            installExpandItem.setHeight(installComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
        });
    }

    private void openUrl(String url) {
        try {
            PlatformUI.getWorkbench().getBrowserSupport().getExternalBrowser().openURL(new URL(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getComponentPath() {
        IPreferenceStore prefStore = CodeGeneratorActivator.getDefault().getPreferenceStore();
        String path = prefStore.getString(IComponentPreferenceConstant.USER_COMPONENTS_FOLDER);
        if (path == null) {
            return "";
        }
        return path;
    }

    private Boolean componentInstall(HashMap<String, String> component) {
        try {
            // Get component archive file
            String workspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
            if (component.get("type").equals("car")) {

                StringBuilder sb = new StringBuilder();
                System.out.println("Préparation pour téléchargement du composant " + component.get("name"));
                String componentCarPath = workspaceLocation + File.separator + component.get("name") + ".car";
                System.out.println("componentCarPath: " + componentCarPath);

                Webhook.downloadFile(component.get("urlArchive"), componentCarPath);

                System.out.println("component.get(\"urlArchive\"): " + component.get("urlArchive"));

                URL installURL = Platform.getInstallLocation().getURL();
                String installDir = (new File(installURL.getPath())).getAbsolutePath();
                System.out.println("installDir: " + installDir);

                if (runCarDeploy(componentCarPath, installDir) == 0) {

                    System.out.println("Composant " + component.get("name") + "installé");

                    Path source = Paths.get(componentCarPath);
                    System.out.println("component.get(\"name\") = " + component.get("name"));
                    System.out.println("getComponentPath() =" + getComponentPath());
                    System.out.println("componentCarPath =" + componentCarPath);

                    Path target = Path.of(getComponentPath(), component.get("name") + ".car");

                    //On deplace le .car dans le dossier component, sa présence permet de savoir que le composant est installé
                    try {
                        Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Fichier déplacé !");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println("Suppression du fichier " + componentCarPath);
                    File componentFile = new File(componentCarPath);
                    componentFile.delete();
                    return false;
                }

            } else {
                String componentZipPath = workspaceLocation + File.separator + component.get("name") + ".zip";
                Webhook.downloadFile(component.get("urlZip"), componentZipPath);

                // Unzip archive
                String targetFolder = getComponentPath() + File.separator;
                Unzipper.unarchiveV2(componentZipPath, targetFolder);
                File componentFile = new File(componentZipPath);
                componentFile.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("-- componentInstall error");
                LOGGER.info(e);
            }
            return false;

        }
        
        promptRestartIfNeeded(Messages.getString("MarketplaceViewPart.installRestart")); //$NON-NLS-1$
        return true;
    }

    public static int runCarDeploy(String componentCarPath, String installDir) {

        StringBuilder sb = new StringBuilder();
        String[] command = { "java", "-jar", componentCarPath, "studio-deploy", "--location", installDir };

        sb.append("Execution de la commande: ");
        for (String string : command) {
            sb.append(string + " ");
        }
        sb.append("\n");

        ProcessBuilder builder = new ProcessBuilder(command);
        builder.redirectErrorStream(true); // merge stdout/stderr

        try {
            Process process = builder.start();

            // Lire la sortie du process
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append("[car deploy] " + line + "\n");
                }
            }

            int exitCode = process.waitFor();
            sb.append("Process finished with code: " + exitCode);

            if (exitCode != 0) {
                String errorMessage = Messages.getString("MarketplaceViewPart.installError"); //$NON-NLS-1$
                MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), errorMessage,
                        sb.toString());
            }
            return exitCode;

        } catch (IOException | InterruptedException e) {
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("-- componentInstall error");
                LOGGER.info(e);
            }
            return -1;
        }
    }
    
    public static void promptRestartIfNeeded(String message) {
        Display.getDefault().asyncExec(() -> {
            boolean restart = MessageDialog.openQuestion(
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                Messages.getString("MarketplaceViewPart.restartTitle"), message //$NON-NLS-1$
            );
            if (restart) {
                PlatformUI.getWorkbench().restart();
            }
        });
    }

    private Boolean componentsUninstall(HashMap<String, String> component) {
        try {
            Path componentDirectory = Path.of(getComponentPath(), component.get("name"));
            File componentFile = new File(componentDirectory.toString());
            if (componentFile.exists()) {
                FilesUtils.removeFolder(componentFile, true);
            }

            componentFile = new File(componentDirectory.toString() + ".car");
            if (componentFile.exists()) {
                FilesUtils.removeFile(componentFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
