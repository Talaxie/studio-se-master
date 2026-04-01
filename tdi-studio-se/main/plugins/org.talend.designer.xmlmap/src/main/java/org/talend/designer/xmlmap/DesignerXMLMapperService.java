// ============================================================================
package org.talend.designer.xmlmap;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.talend.core.model.process.INode;
import org.talend.core.service.IDesignerXMLMapperService;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData;
import org.talend.designer.xmlmap.util.MapDataHelper;
import org.talend.designer.xmlmap.util.XMLMapperHelper;

/**
 * DOC YeXiaowei class global comment. Detailled comment <br/>
 * 
 */
public class DesignerXMLMapperService implements IDesignerXMLMapperService {


    /*
     * (non-Javadoc)
     * 
     * @see org.talend.designer.mapper.IDesignerMapperSerivce#isVirtualComponent(org.talend.core.model.process.INode)
     */
    public boolean isVirtualComponent(INode node) {
        return XMLMapperHelper.isGeneratedAsVirtualComponent(node);
    }

    @Override
    public Object rebuildXmlMapData(INode node) {
        XmlMapData copyOfMapData = null;
        if (node != null && node instanceof XmlMapComponent) {
            XmlMapComponent mapperComponent = (XmlMapComponent) node;
            if (mapperComponent.getExternalEmfData() != null) {
                copyOfMapData = EcoreUtil.copy((XmlMapData) mapperComponent.getExternalEmfData());
                MapDataHelper helper = new MapDataHelper();
                helper.rebuildXmlMapData(copyOfMapData, mapperComponent);
            }
        }
        return copyOfMapData;
    }
}
