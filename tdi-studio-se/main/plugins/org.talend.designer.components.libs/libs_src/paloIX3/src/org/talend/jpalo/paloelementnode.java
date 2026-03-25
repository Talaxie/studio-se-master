// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   paloelementnode.java

package org.talend.jpalo;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package org.talend.jpalo:
//            paloconsolidation, paloelement

public class paloelementnode
{

    paloelementnode(paloelement pElm)
    {
        childElements = new ArrayList();
        index = -1;
        this.pElm = pElm;
    }

    paloelementnode(paloelement pElm, paloconsolidation pCons)
    {
        childElements = new ArrayList();
        index = -1;
        this.pElm = pElm;
        this.pCons = pCons;
    }

    paloelementnode(paloelement pElm, paloconsolidation pCons, int index)
    {
        childElements = new ArrayList();
        this.index = -1;
        this.pElm = pElm;
        this.pCons = pCons;
        this.index = index;
    }

    public paloelement getPaloElement()
    {
        return pElm;
    }

    public int getIndex()
    {
        return index;
    }

    public void addChild(paloelementnode child)
    {
        childElements.add(child);
    }

    public paloelementnode[] getChildren()
    {
        return (paloelementnode[])childElements.toArray();
    }

    public paloconsolidation getConsolidation()
    {
        return pCons;
    }

    public int getDepth()
    {
        return pCons.getPosition();
    }

    public boolean hasChildren()
    {
        return childElements.size() != 0;
    }

    public void setParent(paloelementnode parent)
    {
        this.parent = parent;
    }

    public paloelementnode getParent()
    {
        return parent;
    }

    public boolean equals(Object obj)
    {
        return false;
    }

    public int hashCode()
    {
        return 0;
    }

    private paloelement pElm;
    private paloconsolidation pCons;
    private paloelementnode parent;
    private List childElements;
    private int index;
}
