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
package org.talend.updates.runtime.ui;

import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.typed.PojoProperties;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;
import org.eclipse.core.databinding.observable.set.WritableSet;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableSetTreeContentProvider;
import org.eclipse.jface.databinding.viewers.typed.ViewerProperties;
import org.eclipse.jface.databinding.wizard.WizardPageSupport;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckable;
import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.talend.updates.runtime.i18n.Messages;
import org.talend.updates.runtime.model.ExtraFeature;
import org.talend.updates.runtime.model.FeatureCategory;
import org.talend.updates.runtime.model.P2ExtraFeature;

/**
 * created by sgandon on 25 févr. 2013 Detailled comment
 *
 */
public class ChooseThirdPartyLibraryToInstallWizardPage extends WizardPage {

    private Tree tree;

    private final ThirdPartyLibrariesModel thirdPartyLibrariesModel;

    private CheckboxTreeViewer checkboxTreeViewer;

    private StyledText featureDescriptionText;

    public DataBindingContext dbc;

    /**
     * Create the wizard.
     *
     * @param updateWizardModel
     * @wbp.parser.constructor
     */
    public ChooseThirdPartyLibraryToInstallWizardPage(ThirdPartyLibrariesModel thirdPartyLibrariesModel) {
        super("wizardPage"); //$NON-NLS-1$
        this.thirdPartyLibrariesModel = thirdPartyLibrariesModel;
        setTitle(Messages.getString("CheckAdditionalPackagesToInstallJob.check.third.party.lib.to.install")); //$NON-NLS-1$
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.wizard.WizardPage#canFlipToNextPage()
     */
    @Override
    public boolean canFlipToNextPage() {
        return super.canFlipToNextPage() && !thirdPartyLibrariesModel.selectedExtraFeatures.isEmpty()
                && thirdPartyLibrariesModel.canConfigureUpdateSiteLocation();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
     */
    @Override
    public boolean isPageComplete() {
        return thirdPartyLibrariesModel.hasDoNotShowThisAgainChanged ? true : super.isPageComplete();
    }

    /**
     * Create contents of the wizard.
     *
     * @param parent
     */
    @SuppressWarnings("unchecked")
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        setControl(container);
        container.setLayout(new GridLayout(1, false));

        Composite featureComposite = new Composite(container, SWT.NONE);
        GridData gridDataFeature = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gridDataFeature.heightHint = 181;
        featureComposite.setLayoutData(gridDataFeature);
        TreeColumnLayout friendsColumnLayout = new TreeColumnLayout();
        featureComposite.setLayout(friendsColumnLayout);

        checkboxTreeViewer = new CheckboxTreeViewer(featureComposite, SWT.BORDER | SWT.FULL_SELECTION);
        checkboxTreeViewer.setSorter(new ViewerSorter() {// regroupt by class type and then by name

                    /*
                     * (non-Javadoc)
                     *
                     * @see org.eclipse.jface.viewers.ViewerComparator#category(java.lang.Object)
                     */
                    @Override
                    public int category(Object element) {
                        return element.getClass().hashCode();
                    }

                    /*
                     * (non-Javadoc)
                     *
                     * @see org.eclipse.jface.viewers.ViewerComparator#compare(org.eclipse.jface.viewers.Viewer,
                     * java.lang.Object, java.lang.Object)
                     */
                    @Override
                    public int compare(Viewer viewer, Object e1, Object e2) {
                        if ((e2 instanceof ExtraFeature) && ((ExtraFeature) e2).mustBeInstalled()) {
                            return 1;
                        }
                        if ((e1 instanceof ExtraFeature) && ((ExtraFeature) e1).mustBeInstalled()) {
                            return -1;
                        }
                        return ((ExtraFeature) e1).getName().compareTo(((ExtraFeature) e2).getName());
                    }
                });
        tree = checkboxTreeViewer.getTree();
        tree.setSize(400, 155);
        tree.setHeaderVisible(true);
        tree.setLinesVisible(true);

        TreeColumn featureNameColumn = new TreeColumn(tree, SWT.NONE);
        featureNameColumn.setText(Messages.getString("SelectExtraFeaturesToInstallWizardPage.feature.column.name.name"));
        // //$NON-NLS-1$
        friendsColumnLayout.setColumnData(featureNameColumn, new ColumnWeightData(3, true));

        featureDescriptionText = new StyledText(container, SWT.BORDER | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL);
        GridData gd_featureDescriptionText = new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1);
        gd_featureDescriptionText.heightHint = 120;
        featureDescriptionText.setLayoutData(gd_featureDescriptionText);
        featureDescriptionText.setText(Messages.getString("AdditionalPackagesDialog.description.content"));
        final IObservableFactory setFactory = new IObservableFactory() {

            @Override
            public IObservable createObservable(final Object target) {
                if (target instanceof WritableSet) {
                    return (IObservableSet) target;
                }
                if (target instanceof FeatureCategory) {
                    WritableSet set = new WritableSet();
                    set.addAll(((FeatureCategory) target).getChildren());
                    return set;
                }
                return null;
            }
        };

        ObservableSetTreeContentProvider contentProvider = new ObservableSetTreeContentProvider(setFactory, null);

        checkboxTreeViewer.setContentProvider(contentProvider);
        checkboxTreeViewer.addCheckStateListener(new ICheckStateListener() {

            @Override
            public void checkStateChanged(CheckStateChangedEvent event) {
                if (event.getElement() instanceof FeatureCategory) {
                    if (event.getChecked()) {
                        thirdPartyLibrariesModel.selectedExtraFeatures
                                .addAll(((FeatureCategory) event.getElement()).getChildren());
                    } else {
                        thirdPartyLibrariesModel.selectedExtraFeatures
                                .removeAll(((FeatureCategory) event.getElement()).getChildren());
                    }
                } else if (event.getElement() instanceof P2ExtraFeature
                        && ((P2ExtraFeature) event.getElement()).getParentCategory() != null) {
                    if (event.getChecked()) {
                        thirdPartyLibrariesModel.selectedExtraFeatures
                                .add(((P2ExtraFeature) event.getElement()).getParentCategory());
                    } else {
                        boolean containFeature = false;
                        for (ExtraFeature ef : ((P2ExtraFeature) event.getElement()).getParentCategory().getChildren()) {
                            if (!ef.equals(event.getElement()) && thirdPartyLibrariesModel.selectedExtraFeatures.contains(ef)) {
                                containFeature = true;
                                break;
                            }
                        }
                        if (!containFeature) {
                            thirdPartyLibrariesModel.selectedExtraFeatures.remove(((P2ExtraFeature) event.getElement())
                                    .getParentCategory());
                        }
                    }
                }
            }
        });

        checkboxTreeViewer.addTreeListener(new ITreeViewerListener() {

            @Override
            public void treeExpanded(TreeExpansionEvent event) {
                dbc.updateTargets();
            }

            @Override
            public void treeCollapsed(TreeExpansionEvent event) {

            }
        });

        checkboxTreeViewer.setLabelProvider(new ObservableMapLabelProvider(Properties.observeEach(
                contentProvider.getKnownElements(), new IValueProperty[] { PojoProperties.value(ExtraFeature.class, "name"), //$NON-NLS-1$
                        PojoProperties.value(ExtraFeature.class, "version") }))); //$NON-NLS-1$

        checkboxTreeViewer.setInput(thirdPartyLibrariesModel.availableExtraFeatures);
        initDataBindings();
        updateSelectedState(thirdPartyLibrariesModel.availableExtraFeatures);
    }

    protected DataBindingContext initDataBindings() {
        dbc = new DataBindingContext();
        
        // bind selecting of the check boxes to the selected extra features set in the model
        dbc.bindSet(ViewerProperties.<CheckboxTreeViewer, ExtraFeature>checkedElements(ExtraFeature.class).observe(checkboxTreeViewer),
                thirdPartyLibrariesModel.selectedExtraFeatures);

        // add a validator for feature selection because SetObservable does not provide any validator.
        dbc.addValidationStatusProvider(thirdPartyLibrariesModel.new FeatureSelectionValidator());
        WizardPageSupport.create(this, dbc);
        // add a listener to update the description and enabled state when avaialble features are added and also
        // add them to the selected list if the must be installed
        thirdPartyLibrariesModel.availableExtraFeatures.addSetChangeListener(new ISetChangeListener() {

            @Override
            public void handleSetChange(SetChangeEvent arg0) {
                updateSelectedState(arg0.diff.getAdditions());
            }
        });
        return dbc;

    }

    /**
     * when an element is added to the feature list this get called so that the selected state of the item gets
     * automatically set according to it's mustBeInstalled value
     *
     * @param arg0
     */
    protected void updateSelectedState(Set<ExtraFeature> features) {
        for (ExtraFeature ef : features) {
            if (ef.mustBeInstalled()) {
                thirdPartyLibrariesModel.selectedExtraFeatures.add(ef);
            } // else do not select caus must not be installed
        }
    }
}
