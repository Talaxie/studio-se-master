package org.talend.dataquality.indicators.mapdb.helper;


public interface IObjectConvertArray {
    //Get all of attribute be Array style
    Object[] getArrays();
    //Retore the object by array
    void restoreObjectByArrays(Object[] elements);
}
