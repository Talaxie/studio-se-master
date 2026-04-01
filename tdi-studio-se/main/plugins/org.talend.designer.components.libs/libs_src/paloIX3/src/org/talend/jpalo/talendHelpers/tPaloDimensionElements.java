// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   tPaloDimensionElements.java

package org.talend.jpalo.talendHelpers;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class tPaloDimensionElements
{

    public tPaloDimensionElements(int iPosition, String strElementName, int iParentPosition, int iLevel)
    {
        dimensionElements = new ArrayList();
        this.iPosition = iPosition;
        this.strElementName = strElementName;
        this.iParentPosition = iParentPosition;
        this.iLevel = iLevel;
        dFactor = 1.0D;
    }

    public tPaloDimensionElements(int iPosition, String parentEleName, String strElementName, int iParentPosition, int iLevel)
    {
        dimensionElements = new ArrayList();
        this.iPosition = iPosition;
        this.strElementName = strElementName;
        this.parentEleName = parentEleName;
        this.iParentPosition = iParentPosition;
        this.iLevel = iLevel;
        dFactor = 1.0D;
    }

    public tPaloDimensionElements(int iPosition, String strElementName, int iParentPosition, int iLevel, double dFactor)
    {
        dimensionElements = new ArrayList();
        this.iPosition = iPosition;
        this.strElementName = strElementName;
        this.iParentPosition = iParentPosition;
        this.iLevel = iLevel;
        this.dFactor = dFactor;
    }

    public int getPosition()
    {
        return iPosition;
    }

    public String getElementName()
    {
        return strElementName;
    }

    public String getParentEleName()
    {
        return parentEleName;
    }

    public int getParentPosition()
    {
        return iParentPosition;
    }

    public void setParentPosition(int iParentPosition)
    {
        this.iParentPosition = iParentPosition;
    }

    public int getLevel()
    {
        return iLevel;
    }

    public void setLevel(int iLevel)
    {
        this.iLevel = iLevel;
    }

    public double getFactor()
    {
        return dFactor;
    }

    public void setFactor(double dFactor)
    {
        this.dFactor = dFactor;
    }

    public void addElements(tPaloDimensionElements dElement)
    {
        dimensionElements.add(dElement);
    }

    public List getDimensionElements()
    {
        return dimensionElements;
    }

    public boolean hasParent(tPaloDimensionElements dimElements)
    {
        return dimElements.getParentEleName() != null && dimElements.getParentEleName().equals("");
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(iPosition);
        sb.append(" / ");
        sb.append(strElementName);
        sb.append(" / ");
        sb.append(iParentPosition);
        sb.append(" / ");
        sb.append(iLevel);
        sb.append(" / ");
        sb.append(dFactor);
        return sb.toString();
    }

    public static void main(String args[])
    {
        tPaloDimensionElements pde = new tPaloDimensionElements(0, "Parent", ((String) (null)), -1, 0);
        tPaloDimensionElements ch1 = new tPaloDimensionElements(1, "ch1", 0, 1);
        tPaloDimensionElements ch2 = new tPaloDimensionElements(2, "ch2", 1, 2);
        pde.addElements(pde);
        pde.addElements(ch1);
        ch1.addElements(ch2);
        System.out.println(pde.hasParent(pde));
        List elements = pde.getDimensionElements();
        System.out.println(elements.size());
        for(int i = 0; i < elements.size(); i++)
            System.out.println((new StringBuilder(String.valueOf(((tPaloDimensionElements)elements.get(i)).getElementName()))).append(" ,").append(((tPaloDimensionElements)elements.get(i)).getParentPosition()).append(" , ").append(((tPaloDimensionElements)elements.get(i)).getPosition()).toString());

    }

    private int iPosition;
    private String strElementName;
    private int iParentPosition;
    private int iLevel;
    private String parentEleName;
    private double dFactor;
    private List dimensionElements;
}
