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
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
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
import org.eclipse.ui.part.ViewPart;
import org.talend.commons.ui.runtime.ColorConstants;
import org.talend.commons.ui.utils.io.archive.Unzipper;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.core.ui.webService.Webhook;
import org.talend.designer.codegen.CodeGeneratorActivator;
import org.talend.designer.codegen.components.ui.IComponentPreferenceConstant;

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
        searchText.setMessage("Search...");
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

        ExpandBar expandBar = new ExpandBar(parent, SWT.V_SCROLL);
        expandBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        expandBar.setBackground(new Color(255, 255, 255));

        // Uninstall
        uninstallComposite = new Composite(expandBar, SWT.NONE);
        uninstallComposite.setLayout(new GridLayout());
        uninstallComposite.setBackground(new Color(255, 255, 255));
        uninstallExpandItem = new ExpandItem(expandBar, SWT.NONE, 0);
        uninstallExpandItem.setText("Not installed");
        uninstallExpandItem.setControl(uninstallComposite);
        uninstallExpandItem.setExpanded(true);

        // Install
        installComposite = new Composite(expandBar, SWT.NONE);
        installComposite.setLayout(new GridLayout());
        installComposite.setBackground(new Color(255, 255, 255));
        installExpandItem = new ExpandItem(expandBar, SWT.NONE, 1);
        installExpandItem.setText("Installed");
        installExpandItem.setHeight(installComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
        installExpandItem.setControl(installComposite);

        componentsInit();
    }

    @Override
    public void setFocus() {
        // TODO
    }

    private void componentsInit() {
        componentUninstalleds = null;
        componentInstalleds = null;
        displayList();
        if (getComponentPath().equals("")) {
            return;
        }

        String search = searchText.getText();
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(() -> {
            try {
                List<HashMap<String, String>> components = Webhook.marketplaceComponents(search);
                componentUninstalleds = new ArrayList<>();
                componentInstalleds = new ArrayList<>();
                for (HashMap<String, String> component : components) {
                    Path componentDirectory = Path.of(getComponentPath(), component.get("name"));
                    if (new File(componentDirectory.toString()).exists()) {
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
                CLabel noComponentPathLabel = new CLabel(composite, SWT.NONE);
                noComponentPathLabel.setText("No component path defined !");
            } else if (componentUninstalleds == null) {
                ProgressBar progressBar = new ProgressBar(composite, SWT.INDETERMINATE);
                progressBar.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
                progressBar.setVisible(true);
            } else if (componentUninstalleds.isEmpty()) {
                CLabel authorLabel = new CLabel(composite, SWT.NONE);
                authorLabel.setText("None");
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
                    installButton.setText("Installer");
                    installButton.addListener(SWT.Selection, event -> {
                        installButton.setEnabled(false);
                        installButton.setText("Installation...");
                        componentInstall(component);
                        installButton.setText("Installé");
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
                    link.setText("<a href=\"" + component.get("url") + "\">(see info)</a>");
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
                CLabel noComponentPathLabel = new CLabel(compositeInstall, SWT.NONE);
                noComponentPathLabel.setText("No component path defined !");
            } else if (componentInstalleds == null) {
                ProgressBar progressBar = new ProgressBar(compositeInstall, SWT.INDETERMINATE);
                progressBar.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
                progressBar.setVisible(true);
            } else if (componentInstalleds.isEmpty()) {
                CLabel authorLabel = new CLabel(compositeInstall, SWT.NONE);
                authorLabel.setText("None");
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
                    removeButton.setText("Remove");
                    removeButton.addListener(SWT.Selection, event -> {
                        removeButton.setEnabled(false);
                        removeButton.setText("Removing...");
                        componentsUninstall(component);
                        removeButton.setText("Removed");
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
                    link.setText("<a href=\"" + component.get("url") + "\">(see info)</a>");
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

                LOGGER.info("Préparation pour téléchargement du composant " + component.get("name"));
                String componentCarPath = workspaceLocation + File.separator + component.get("name") + ".car";
                LOGGER.info("componentCarPath: " + componentCarPath);

                Webhook.downloadFile(component.get("urlArchive"), componentCarPath);

                LOGGER.info("component.get(\"urlArchive\"): " + component.get("urlArchive"));

                String home = null;
                try {
                    URL url = Platform.getInstallLocation().getURL();
                    home = new File(url.toURI()).getAbsolutePath();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                LOGGER.info("Eclipse install folder: " + home);

                URL installURL = Platform.getInstallLocation().getURL();
                String installDir = (new File(installURL.getPath())).getAbsolutePath();
                LOGGER.info("installDir: " + installDir);

                if (runCarDeploy(componentCarPath, installDir) == 0) {
                    File componentFile = new File(componentCarPath);
                    componentFile.delete();
                    LOGGER.info("Composant " + component.get("name") + "installé");
                } else
                    LOGGER.info("Erreur durant l'installation du Composant " + component.get("name"));

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

        }
        return true;
    }

    public static int runCarDeploy(String componentCarPath, String installDir) {
        // Construire la commande avec des arguments correctement quotés
        String[] command = { "java", "-jar", componentCarPath, "studio-deploy", "--location", installDir };

        ProcessBuilder builder = new ProcessBuilder(command);

        // Important : hériter de l'environnement système
        builder.redirectErrorStream(true); // merge stdout/stderr

        try {
            Process process = builder.start();

            // Lire la sortie du process
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    LOGGER.info("[car deploy] " + line); // ou logger dans ton app
                }
            }

            int exitCode = process.waitFor();
            LOGGER.info("Process finished with code: " + exitCode);
            return exitCode;

        } catch (IOException | InterruptedException e) {
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("-- componentInstall error");
                LOGGER.info(e);
            }
            return -1;
        }
    }

    private Boolean componentsUninstall(HashMap<String, String> component) {
        try {
            Path componentDirectory = Path.of(getComponentPath(), component.get("name"));
            File componentFile = new File(componentDirectory.toString());
            if (componentFile.exists()) {
                FilesUtils.removeFolder(componentFile, true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
