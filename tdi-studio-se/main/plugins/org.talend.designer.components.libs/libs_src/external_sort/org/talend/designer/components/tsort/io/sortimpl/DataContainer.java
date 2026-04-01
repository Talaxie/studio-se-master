package org.talend.designer.components.tsort.io.sortimpl;

class DataContainer {

    long cursorPosition;

    Object object;

    byte[] data;

    public void reset() {
        object = null;
        data = null;
    }
}
