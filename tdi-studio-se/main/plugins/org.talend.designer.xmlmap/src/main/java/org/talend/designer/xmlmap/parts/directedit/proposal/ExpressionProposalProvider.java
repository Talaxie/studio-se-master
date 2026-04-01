package org.talend.designer.xmlmap.parts.directedit.proposal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData;
import org.talend.designer.xmlmap.ui.tabs.MapperManager;
import org.talend.designer.xmlmap.util.XmlMapUtil;

public class ExpressionProposalProvider implements IContentProposalProvider {

    private List<EntryContentProposal> proposalsInside = new ArrayList<EntryContentProposal>();

    private final IContentProposalProvider[] otherContentProposalProviders;

    private MapperManager mapperManager;

    public ExpressionProposalProvider(MapperManager mapperManager, IContentProposalProvider[] otherContentProposalProviders) {
        this.otherContentProposalProviders = otherContentProposalProviders;
        this.mapperManager = mapperManager;
    }

    public void init(GraphicalEditPart source) {
        init(source.getModel());
    }

    public void init(Object source) {
        XmlMapData mapData = mapperManager.getExternalData();
        int index = 0;
        boolean needVar = false;
        if (source instanceof OutputTreeNode || source instanceof OutputXmlTree) {
            needVar = true;
            index = mapData.getInputTrees().size();
        } else if (source instanceof TreeNode) {
            AbstractInOutTree abstractTree = XmlMapUtil.getAbstractInOutTree((TreeNode) source);
            index = mapData.getInputTrees().indexOf(abstractTree);
            if (index == -1) {
                index = 0;
            }
        } else if (source instanceof VarNode) {
            index = mapData.getInputTrees().size();
        } else if (source instanceof InputXmlTree) {
            index = mapData.getInputTrees().indexOf(source) + 1;
        }
        for (int i = 0; i < index; i++) {
            InputXmlTree inputTree = mapData.getInputTrees().get(i);
            getProposalsInside(inputTree.getNodes(), proposalsInside);
        }
        if (needVar) {
            getProposalsInside(mapData.getVarTables().get(0).getNodes(), proposalsInside);
        }
    }

    private void getProposalsInside(List<? extends AbstractNode> nodes, List<EntryContentProposal> proposalsInside) {
        for (AbstractNode absNode : nodes) {
            if (absNode instanceof TreeNode) {
                TreeNode treeNode = (TreeNode) absNode;
                if (XmlMapUtil.isDragable(treeNode)) {
                    proposalsInside.add(new EntryContentProposal(mapperManager, treeNode));
                }
                if (!treeNode.getChildren().isEmpty()) {
                    getProposalsInside(treeNode.getChildren(), proposalsInside);
                }
            } else {
                proposalsInside.add(new EntryContentProposal(mapperManager, absNode));
            }
        }

    }

    @Override
    public IContentProposal[] getProposals(String contents, int position) {
        List<IContentProposal> proposals = new ArrayList<IContentProposal>();
        proposals.addAll(proposalsInside);
        for (IContentProposalProvider contentProposalProvider : otherContentProposalProviders) {
            proposals.addAll(Arrays.asList(contentProposalProvider.getProposals(contents, position)));
        }
        IContentProposal[] res = new IContentProposal[proposals.size()];
        res = proposals.toArray(res);
        return res;

    }

}
