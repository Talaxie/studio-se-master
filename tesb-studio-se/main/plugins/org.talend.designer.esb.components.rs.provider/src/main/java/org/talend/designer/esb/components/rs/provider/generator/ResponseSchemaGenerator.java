package org.talend.designer.esb.components.rs.provider.generator;

import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.ui.editor.properties.controllers.AbstractElementPropertySectionController;
import org.talend.designer.core.ui.editor.properties.controllers.generator.IControllerGenerator;

public class ResponseSchemaGenerator implements IControllerGenerator {

	private IDynamicProperty dp;

	/* (non-Javadoc)
	 * @see org.talend.designer.core.ui.editor.properties.controllers.generator.IControllerGenerator#generate()
	 */
	public AbstractElementPropertySectionController generate() {
		return new RestResponseSchemaController(dp);
	}

	/* (non-Javadoc)
	 * @see org.talend.designer.core.ui.editor.properties.controllers.generator.IControllerGenerator#setDynamicProperty(org.talend.core.properties.tab.IDynamicProperty)
	 */
	public void setDynamicProperty(IDynamicProperty dp) {
		this.dp = dp;
	}

}
