package org.talend.designer.gefabstractmap.figures.layout;

import java.util.List;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.talend.commons.ui.swt.geftree.TreeAnimation;
import org.talend.designer.gefabstractmap.figures.table.entity.ExpandCollapseFigure;
import org.talend.designer.gefabstractmap.figures.table.entity.TableTreeEntityFigure;
import org.talend.designer.gefabstractmap.figures.table.entity.TreeBranch;

/**
 * wchen class global comment. Detailled comment
 */
public class TreeBranchLayout extends AbstractLayout {

    private TreeBranch treeBranch;

    private int depth = -1;

    private int branchLineStyle = SWT.LINE_SOLID;

    private int xOffset;

    public TreeBranchLayout(TreeBranch treeBranch) {
        this.treeBranch = treeBranch;
    }

    @Override
    public void layout(IFigure container) {
        TreeAnimation.recordInitialState(container);
        if (TreeAnimation.playbackState(container)) {
            return;
        }

        Rectangle clientArea = container.getClientArea();
        int X = clientArea.x + 15;
        int Y = clientArea.y + clientArea.height;
        xOffset = 15;

        Dimension titleSize = treeBranch.getTitle().getPreferredSize();
        Rectangle titleBounds = new Rectangle();
        titleBounds.setSize(titleSize);

        if (treeBranch.isEnableExpand()) {
            final int tDeeps = treeBranch.getDepth();
            int titleOffset = (tDeeps - 1) * 2 * treeBranch.getGaps();
            X = X + titleOffset;

            xOffset = xOffset + titleOffset;

            ExpandCollapseFigure expandCollapseFigure = treeBranch.getExpandCollapseFigure();
            final Dimension ecSize = expandCollapseFigure.getPreferredSize();
            Rectangle ecBounds = new Rectangle();
            ecBounds.setSize(ecSize);

            int maxHeight = Math.max(titleSize.height, ecSize.height);
            Y = Y - maxHeight;
            int ecX = X - 15 + 1;

            ecBounds.setLocation(ecX, Y);
            expandCollapseFigure.setBounds(ecBounds);
        } else {
            Y = Y - titleSize.height;
        }

        titleBounds.setLocation(X, Y);

        // if (clientArea.getRight().x > titleBounds.getRight().x) {
        // int newWidth = clientArea.getRight().x - titleBounds.x;
        // titleBounds.width = newWidth;
        // }

        treeBranch.getTitle().setBounds(titleBounds);

    }

    @Override
    protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
        Dimension prefSize = new Dimension();
        xOffset = 15;
        Dimension titleSize = treeBranch.getTitle().getPreferredSize().getCopy();
        if (treeBranch.isEnableExpand()) {
            final int tDeeps = treeBranch.getDepth();
            int titleOffset = (tDeeps - 1) * 2 * treeBranch.getGaps();
            xOffset = xOffset + titleOffset;
        }
        prefSize.expand(titleSize);
        prefSize.width += xOffset;
        return prefSize;

    }

    public void calculateDepth() {
        int depth = 0;
        if (getTreeNodeFigure() != null) {
            TableTreeEntityFigure parent = getTreeNodeFigure().getParentEntity();
            if (parent != null && parent.getTreeBranch() != null) {
                depth += parent.getTreeBranch().getDepth();
            }
        }
        depth++;
        setDepth(depth);

    }

    public int getDepth() {
        // if (!getTreeNodeFigure().isExpanded())
        // return 1;
        if (depth == -1) {
            calculateDepth();
        }
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    private TableTreeEntityFigure getTreeNodeFigure() {
        return treeBranch.getEntityFigure();
    }

    public int getBranchLineStyle() {
        return this.branchLineStyle;
    }

    public void setBranchLineStyle(int branchLineStyle) {
        this.branchLineStyle = branchLineStyle;
    }

    public void paintLines(Graphics g) {
        int gap = treeBranch.getGaps();
        g.setLineStyle(getBranchLineStyle());

        IFigure startFig = treeBranch.getTitle();

        int x = startFig.getBounds().x + gap;
        int y = startFig.getBounds().bottom() - 2;
        if (getTreeNodeFigure() != null) {
            List children = getTreeNodeFigure().getContents().getChildren();
            if (children.size() == 0) {
                return;
            }
            int bottom = y;
            for (int i = 0; i < children.size(); i++) {
                TableTreeEntityFigure treeNode = (TableTreeEntityFigure) children.get(i);
                Rectangle childStartBounds = treeNode.getTreeBranch().getTitle().getBounds();
                Point pt = childStartBounds.getLeft();
                g.drawLine(x, pt.y, pt.x, pt.y);
                bottom = Math.max(bottom, pt.y);
            }
            g.drawLine(x, y, x, bottom);
        }
    }

}
