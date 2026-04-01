package org.talend.designer.components.tsort.io.beans;

/**
 * 
 * Interface to load/unload instance data from/to a byte array <br/>
 * 
 * @param <B>
 */
public interface ILightSerializable<B> extends Comparable<B> {

    public ILightSerializable<B> createInstance(byte[] byteArray);

    public byte[] toByteArray();

}
