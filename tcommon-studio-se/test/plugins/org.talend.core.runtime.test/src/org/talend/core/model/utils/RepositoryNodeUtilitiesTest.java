package org.talend.core.model.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.talend.core.model.properties.ItemState;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.repository.RepositoryViewObject;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.model.RepositoryNodeUtilities;

public class RepositoryNodeUtilitiesTest {

    @Test
    public void testGetPath() {
        RepositoryNode parent = new RepositoryNode(null, null, ENodeType.STABLE_SYSTEM_FOLDER);
        parent.setProperties(EProperties.LABEL, "system");
        parent.setProperties(EProperties.CONTENT_TYPE, ERepositoryObjectType.PROCESS);
        parent.setType(ENodeType.STABLE_SYSTEM_FOLDER);
        assertEquals("system", RepositoryNodeUtilities.getPath(parent).toString());

        RepositoryNode son = new RepositoryNode(null, null, ENodeType.STABLE_SYSTEM_FOLDER);
        son.setProperties(EProperties.LABEL, ERepositoryObjectType.PROCESS);
        son.setProperties(EProperties.CONTENT_TYPE, ERepositoryObjectType.PROCESS);
        assertEquals("", RepositoryNodeUtilities.getPath(son).toString());

        Property property1 = PropertiesFactory.eINSTANCE.createProperty();
        property1.setId("property1"); //$NON-NLS-1$
        property1.setVersion("0.1"); //$NON-NLS-1$
        property1.setLabel("test1");//$NON-NLS-1$
        ProcessItem item1 = PropertiesFactory.eINSTANCE.createProcessItem();
        ItemState state = PropertiesFactory.eINSTANCE.createItemState();
        state.setDeleted(false);
        item1.setState(state);
        property1.setItem(item1);
        IRepositoryViewObject irvParent = new RepositoryViewObject(property1, true);
        RepositoryNode simpleFolderParent = new RepositoryNode(irvParent, null, ENodeType.STABLE_SYSTEM_FOLDER);
        simpleFolderParent.setProperties(EProperties.LABEL, ERepositoryObjectType.FOLDER);
        simpleFolderParent.setProperties(EProperties.CONTENT_TYPE, ERepositoryObjectType.PROCESS);
        assertEquals("", RepositoryNodeUtilities.getPath(simpleFolderParent).toString());

        RepositoryNode jobdoc = new RepositoryNode(null, null, ENodeType.STABLE_SYSTEM_FOLDER);
        jobdoc.setProperties(EProperties.LABEL, ERepositoryObjectType.JOB_DOC);
        jobdoc.setProperties(EProperties.CONTENT_TYPE, ERepositoryObjectType.JOB_DOC);
        assertEquals("", RepositoryNodeUtilities.getPath(jobdoc).toString());


    }

}
