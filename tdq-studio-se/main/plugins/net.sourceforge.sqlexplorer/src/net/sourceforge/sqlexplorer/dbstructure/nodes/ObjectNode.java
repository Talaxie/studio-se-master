package net.sourceforge.sqlexplorer.dbstructure.nodes;

import org.eclipse.swt.graphics.Image;


public class ObjectNode extends AbstractNode {

    public ObjectNode(String name, String type, INode parent, Image image) {
    	super(parent, name, parent.getSession(), type);
        _image = image;
    }
    

    /**
     * This node cannot have childnodes.
     */
    public boolean isEndNode() {
        return true;
    }

    /**
     * This node cannot have childnodes.
     */
    public void loadChildren() {
        return;
    }


    public String getQualifiedName() {
        return "\"" + getSchemaOrCatalogName() + "\".\"" + getName() + "\"";
    }

}
