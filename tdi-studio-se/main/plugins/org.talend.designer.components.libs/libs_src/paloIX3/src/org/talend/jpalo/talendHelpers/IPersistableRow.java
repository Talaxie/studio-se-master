// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IPersistableRow.java

package org.talend.jpalo.talendHelpers;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public interface IPersistableRow
{

    public abstract void writeData(ObjectOutputStream objectoutputstream);

    public abstract void readData(ObjectInputStream objectinputstream);
}
