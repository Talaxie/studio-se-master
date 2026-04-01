package org.talend.designer.xmlmap.parts.directedit.proposal;

import java.util.List;

import org.eclipse.jface.fieldassist.IContentProposal;
import org.talend.core.model.components.IODataComponent;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.designer.xmlmap.i18n.Messages;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarTable;
import org.talend.designer.xmlmap.ui.tabs.MapperManager;
import org.talend.designer.xmlmap.util.XmlMapUtil;

public class EntryContentProposal implements IContentProposal {

    private static final String CARRIAGE_RETURN = "\n"; //$NON-NLS-1$

    private static final String EMPTY_STRING = ""; //$NON-NLS-1$

    private AbstractNode entry;

    private String content = "";

    private MapperManager mapperManager;

    public EntryContentProposal(MapperManager mapperManager, AbstractNode entry) {
        this.mapperManager = mapperManager;
        this.entry = entry;
        if (entry instanceof TreeNode) {
            content = XmlMapUtil.convertToExpression(((TreeNode) entry).getXpath());
        } else if (entry instanceof VarNode) {
            VarNode varNode = (VarNode) entry;
            VarTable varTabel = (VarTable) varNode.eContainer();
            content = varTabel.getName() + XmlMapUtil.EXPRESSION_SEPARATOR + varNode.getName();
        }

    }

    @Override
    public String getContent() {
        return content + " ";
    }

    @Override
    public int getCursorPosition() {
        return content.length() + 1;
    }

    @Override
    public String getLabel() {
        return content;
    }

    @Override
    public String getDescription() {

        StringBuilder sb = new StringBuilder();

        String separator = " - "; //$NON-NLS-1$
        if (entry instanceof TreeNode) {

            TreeNode inputEntry = (TreeNode) entry;
            IMetadataColumn metadataColumn = null;
            if (inputEntry.eContainer() instanceof InputXmlTree) {
                InputXmlTree tree = (InputXmlTree) inputEntry.eContainer();
                List<IODataComponent> inputs = mapperManager.getMapperComponent().getIODataComponents().getInputs();
                IMetadataTable table = null;
                for (int i = 0; i < inputs.size(); i++) {
                    IODataComponent ioDataComponent = inputs.get(i);
                    if (tree.getName() != null && tree.getName().equals(ioDataComponent.getConnection().getName())) {
                        table = ioDataComponent.getTable();
                        break;
                    }
                }
                if (table != null && table.getListColumns() != null) {
                    for (IMetadataColumn column : table.getListColumns()) {
                        if (inputEntry.getName().equals(column.getLabel())) {
                            metadataColumn = column;
                        }
                    }
                }
            }
            sb.append(Messages.getString("EntryContentProposal.metadataColumn")).append(" '").append(inputEntry.getName()) //$NON-NLS-1$ //$NON-NLS-2$
                    .append("' "); //$NON-NLS-1$
            sb.append(Messages.getString("EntryContentProposal.properties")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
            sb.append(CARRIAGE_RETURN);
            sb.append(separator).append(Messages.getString("EntryContentProposal.column")).append(inputEntry.getName()); //$NON-NLS-1$
            sb.append(CARRIAGE_RETURN);
            sb.append(separator).append(Messages.getString("EntryContentProposal.key")).append(inputEntry.isKey()); //$NON-NLS-1$
            sb.append(CARRIAGE_RETURN);
            sb.append(separator).append(Messages.getString("EntryContentProposal.type")).append(format(inputEntry.getType())); //$NON-NLS-1$
            if (metadataColumn != null) {
                sb.append(CARRIAGE_RETURN);
                sb.append(separator).append(Messages.getString("EntryContentProposal.length")); //$NON-NLS-1$
                if (metadataColumn.getLength() != null && metadataColumn.getLength() > 0) {
                    sb.append(format(metadataColumn.getLength()));
                }

                sb.append(CARRIAGE_RETURN);
                sb.append(separator).append(Messages.getString("EntryContentProposal.precision")); //$NON-NLS-1$
                if (metadataColumn.getPrecision() != null && metadataColumn.getPrecision() > 0) {
                    sb.append(format(metadataColumn.getPrecision()));
                }
                sb.append(CARRIAGE_RETURN);
                sb.append(separator)
                        .append(Messages.getString("EntryContentProposal.default")).append(format(metadataColumn.getDefault())); //$NON-NLS-1$
                sb.append(CARRIAGE_RETURN);
                sb.append(separator)
                        .append(Messages.getString("EntryContentProposal.comment")).append(format(metadataColumn.getComment())); //$NON-NLS-1$
            }
            sb.append(CARRIAGE_RETURN);
            if (inputEntry.eContainer() instanceof TreeNode) {
                sb.append(separator).append(Messages.getString("EntryContentProposal.xPath")).append(inputEntry.getXpath()); //$NON-NLS-1$
                sb.append(CARRIAGE_RETURN);
            }
            sb.append(separator).append(Messages.getString("EntryContentProposal.expressionKey")); //$NON-NLS-1$
            sb.append(CARRIAGE_RETURN);
            sb.append(format(entry.getExpression()));
            sb.append(CARRIAGE_RETURN);

        } else if (entry instanceof VarNode) {
            sb.append(Messages.getString("EntryContentProposal.variable")).append(" '").append(entry.getName()).append("' :"); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
            sb.append(CARRIAGE_RETURN);
            sb.append(separator).append(Messages.getString("EntryContentProposal.expressionKey")); //$NON-NLS-1$
            sb.append(CARRIAGE_RETURN);
            sb.append(format(entry.getExpression()));
        }
        return sb.toString();

    }

    public String format(Object object) {
        if (object == null) {
            return ""; //$NON-NLS-1$
        }
        return String.valueOf(object);
    }

}
