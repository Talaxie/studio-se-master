package org.talend.designer.core.ui.editor.jobletcontainer;

import org.eclipse.swt.graphics.Image;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.designer.core.ui.editor.connections.CollapseFigure;

/**
 * DOC hwang class global comment. Detailled comment
 */
public class JobletCollapseFigure extends CollapseFigure {

    @Override
    protected Image getCollapseFigure() {
        return ImageProvider.getImage(EImage.SUBJOB_COLLAPSE);
    }

    @Override
    protected Image getExpandFigure() {
        return ImageProvider.getImage(EImage.SUBJOB_EXPAND);
    }

}
