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
package org.talend.commons.ui.swt.advanced.composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Sash;

/**
 * This class is used for constructing 2 composites, putting 1 sashes in the middle composite, which is used for
 * changing other 2 composites.
 *
 */
public class TwoCompositesSashForm extends Composite {

    public static final int SASH_WIDTH = 3;

    private Composite leftComposite;

    private Composite rightComposite;

    private Sash midSash;

    /**
     * Initialize.
     *
     * @param parent
     * @param style
     */
    public TwoCompositesSashForm(Composite parent, int style) {
        super(parent, style);
        final GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 3;
        gridLayout.marginBottom = 0;
        gridLayout.marginHeight = 0;
        gridLayout.marginLeft = 0;
        gridLayout.marginRight = 0;
        gridLayout.marginTop = 0;
        gridLayout.marginWidth = 0;
        gridLayout.horizontalSpacing = 0;

        setLayout(gridLayout);
        final GridData gridData = new GridData(GridData.FILL_BOTH);
        setLayoutData(gridData);

        addComponents();
        addSashListeners();
    }

    /**
     * Changes all widgets's position when sash was moved.
     *
     * @param shift
     */
    private void setCompositesBounds(int shift) {
        // Set mid Composite Width.
        int midSashPreLocation = midSash.getBounds().x;
        midSash.setLocation(midSashPreLocation + shift, midSash.getBounds().y);
        if (midSash.getBounds().x > 0) {
            if (midSashPreLocation < 0) {
                leftComposite.setSize(leftComposite.getBounds().width + shift + midSashPreLocation, leftComposite
                        .getBounds().height);
            } else {
                leftComposite.setSize(leftComposite.getBounds().width + shift, leftComposite.getBounds().height);
            }
        } else {
            leftComposite.setSize(0, leftComposite.getBounds().height);
        }
        // Set Right Composte Width.
        rightComposite.setLocation(rightComposite.getBounds().x + shift, rightComposite.getBounds().y);
        rightComposite.setSize(rightComposite.getBounds().width - shift, rightComposite.getBounds().height);
    }

    public Composite getLeftComposite() {
        return this.leftComposite;
    }

    public Composite getRightComposite() {
        return this.rightComposite;
    }

    private void addSashListeners() {
        midSash.addListener(SWT.Selection, new Listener() {

            /*
             * (non-Java)
             *
             * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
             */
            public void handleEvent(Event event) {
                int shift = event.x - midSash.getBounds().x;
                setCompositesBounds(shift);
            }

        });
    }

    private void addComponents() {
        leftComposite = new Composite(this, SWT.NONE);
        GridLayout gridLayout = new GridLayout();
        gridLayout.marginBottom = 0;
        gridLayout.marginHeight = 0;
        gridLayout.marginLeft = 0;
        gridLayout.marginRight = 0;
        gridLayout.marginTop = 0;
        gridLayout.marginWidth = 0;
        gridLayout.horizontalSpacing = 0;
        GridData gridData = new GridData(GridData.FILL_BOTH);

        leftComposite.setLayout(gridLayout);
        leftComposite.setLayoutData(gridData);

        midSash = new Sash(this, SWT.VERTICAL | SWT.SMOOTH);
        GridData gridData2 = new GridData(GridData.FILL_VERTICAL);
        midSash.setLayoutData(gridData2);
        midSash.setSize(SASH_WIDTH, midSash.getBounds().height);

        rightComposite = new Composite(this, SWT.NONE);
        GridLayout gridLayout3 = new GridLayout();
        gridLayout3.marginBottom = 0;
        gridLayout3.marginHeight = 0;
        gridLayout3.marginLeft = 0;
        gridLayout3.marginRight = 0;
        gridLayout3.marginTop = 0;
        gridLayout3.marginWidth = 0;
        gridLayout3.horizontalSpacing = 0;
        rightComposite.setLayout(gridLayout3);
        GridData gridData4 = new GridData(GridData.FILL_BOTH);
        rightComposite.setLayoutData(gridData4);
    }

    public void setGridDatas() {
        Composite composite = (Composite) leftComposite.getChildren()[0];
        GridLayout gridLayout2 = new GridLayout();
        gridLayout2.marginBottom = 0;
        gridLayout2.marginHeight = 0;
        gridLayout2.marginLeft = 0;
        gridLayout2.marginRight = 0;
        gridLayout2.marginTop = 0;
        gridLayout2.marginWidth = 0;
        gridLayout2.horizontalSpacing = 0;
        composite.setLayout(gridLayout2);
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));

        Composite composite2 = (Composite) rightComposite.getChildren()[0];
        gridLayout2 = new GridLayout();
        gridLayout2.marginBottom = 0;
        gridLayout2.marginHeight = 0;
        gridLayout2.marginLeft = 0;
        gridLayout2.marginRight = 0;
        gridLayout2.marginTop = 0;
        gridLayout2.marginWidth = 0;
        gridLayout2.horizontalSpacing = 0;
        composite2.setLayout(gridLayout2);
        composite2.setLayoutData(new GridData(GridData.FILL_BOTH));

    }
}
