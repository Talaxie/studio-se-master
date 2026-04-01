package org.talend.designer.abstractmap.ui.visualmap.link;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

/**
 * DOC amaumont class global comment. Detailled comment <br/>
 * 
 * $Id: IMapperLink.java 3351 2007-05-04 12:14:00Z plegall $
 * 
 */
public interface IMapperLink {

    public void draw(GC gc, Rectangle boundsOfDrawing);

    public void calculate();

    public PointLinkDescriptor getPointLinkDescriptor1();

    public PointLinkDescriptor getPointLinkDescriptor2();

    /**
     * DOC amaumont Comment method "setSate".
     * 
     * @param linkState
     */
    public void setState(ILinkState linkState);

    /**
     * DOC amaumont Comment method "getSate".
     * 
     * @return stateLink
     */
    public ILinkState getState();

    /**
     * DOC amaumont Comment method "setLevel".
     * 
     * @param level
     */
    public void setLevel(Integer level);

    public Integer getLevel();

}
