// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.components.lookup.persistent;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jboss.marshalling.Marshaller;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.Marshalling;
import org.jboss.marshalling.MarshallingConfiguration;
import org.jboss.marshalling.Unmarshaller;
import org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE;
import org.talend.designer.components.persistent.IRowCreator;
import org.talend.designer.components.persistent.utils.FileUtils;

import routines.system.IPersistableRow;

/**
 * Manager for lookup type 'ALL_ROWS'.
 *
 * <code>PersistentLookupManager</code>. This is the API to serialize/deserialize Talend objects sequentially and be
 * able to iterate on them.
 *
 * JBoss library is used to avoid memory leaks noticed with Sun ObjectInputStream class.
 *
 * Warning: JBossObjectInputStream may not deserialize any objects such as for example java.io.File, you could encounter
 * the following error:
 *
 * <pre>
 * Caused by: java.lang.reflect.InvocationTargetException
 *     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 *     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
 *     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
 *     at java.lang.reflect.Method.invoke(Method.java:597)
 *     at org.jboss.serial.persister.RegularObjectPersister.readSlotWithMethod(RegularObjectPersister.java:103)
 *     ... 32 more
 * Caused by: java.io.EOFException
 *     at java.io.DataInputStream.readFully(DataInputStream.java:180)
 *     at java.io.DataInputStream.readLong(DataInputStream.java:399)
 *     at org.jboss.serial.util.StringUtil.readString(StringUtil.java:212)
 *     at org.jboss.serial.objectmetamodel.DataContainer$DataContainerDirectInput.readUTF(DataContainer.java:757)
 *     at org.jboss.serial.persister.ObjectInputStreamProxy.readUTF(ObjectInputStreamProxy.java:196)
 *     at org.jboss.serial.objectmetamodel.FieldsContainer.readField(FieldsContainer.java:147)
 *     at org.jboss.serial.objectmetamodel.FieldsContainer.readMyself(FieldsContainer.java:218)
 *     at org.jboss.serial.persister.ObjectInputStreamProxy.readFields(ObjectInputStreamProxy.java:224)
 *     at java.io.File.readObject(File.java:1927)
 *     ... 37 more
 *</pre>
 *
 * @see http://www.talendforge.org/bugs/view.php?id=6780#bugnotes
 *
 * @param <B> bean
 */
public class PersistentLookupManager<B extends IPersistableRow<B>> implements IPersistentLookupManager<B>, Cloneable {

    /** This is 0 when using Sun stream library and 1 when using JBoss implementation */
    private static final int JBOSS_EOF = 1;

    private String container;

    private ObjectOutputStream objectOutStream;

    private BufferedInputStream bufferedInStream;

    private BufferedOutputStream bufferedOutputStream;

    private ObjectInputStream objectInStream;

    private IRowCreator<B> rowCreator;

    private B dataInstance;

    private boolean init = false;

    private boolean USE_JBOSS_IMPLEMENTATION = false;

    Marshaller marshaller;

    Unmarshaller unmarshaller;
    final MarshallerFactory marshallerFactory = Marshalling.getProvidedMarshallerFactory("river");

    final MarshallingConfiguration configuration = new MarshallingConfiguration();

    /**
     * PersistentLookupManager constructor.
     *
     * @param container
     * @throws IOException
     */
    public PersistentLookupManager(MATCHING_MODE matchingMode, String container, IRowCreator<B> rowCreator) throws IOException {
        super();
        this.container = container;
        this.rowCreator = rowCreator;
        FileUtils.createParentFolderIfNotExists(container);
    }

    public void initPut() throws IOException {

        this.dataInstance = this.rowCreator.createRowInstance();

    }

    private String buildDataFilePath() {
        return container + "_Data.bin"; //$NON-NLS-1$
    }

    public void put(B bean) throws IOException {
        if(!init){
            File file = new File(buildDataFilePath());

            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            if(bean.supportJboss()){

                marshaller = marshallerFactory.createMarshaller(configuration);
                marshaller.start(Marshalling.createByteOutput(bufferedOutputStream));
                USE_JBOSS_IMPLEMENTATION = true;

            }else {
                objectOutStream = new ObjectOutputStream(bufferedOutputStream);
            }
            init = true;
        }
        if(USE_JBOSS_IMPLEMENTATION){
            bean.writeData(marshaller);
        }else {
            bean.writeData(objectOutStream);
            objectOutStream.reset();
        }

    }

    public void endPut() throws IOException {
        if(USE_JBOSS_IMPLEMENTATION){
        	if(marshaller!=null) {
        	    marshaller.flush();
        		marshaller.close();
        	}
        }else {
        	if(objectOutStream!=null) {
        		objectOutStream.close();
        	}
        }
    }

    public void initGet() throws IOException {

        initDataIn();
        this.dataInstance = this.rowCreator.createRowInstance();

    }

    public void lookup(B key) throws IOException {

        if (this.objectInStream != null) {
            this.objectInStream.close();
        }
        if (this.bufferedInStream != null) {
            this.bufferedInStream.close();
        }

        initDataIn();

    }

    private void initDataIn() throws IOException {
    	if(!init) {
    		return;
    	}
        this.bufferedInStream = new BufferedInputStream(new FileInputStream(buildDataFilePath()));
        if(USE_JBOSS_IMPLEMENTATION){
            unmarshaller = marshallerFactory.createUnmarshaller(configuration);
            unmarshaller.start(Marshalling.createByteInput(bufferedInStream));
        }else {
            this.objectInStream = new ObjectInputStream(bufferedInStream);
        }

    }

    public B getNextFreeRow() {
        return this.dataInstance;
    }

    public boolean hasNext() throws IOException {
    	if(!init) {
    		return false;
    	}
        // return this.objectInStream.available() > 0 || this.bufferedInStream.available() > 0;
        if(USE_JBOSS_IMPLEMENTATION){
            return unmarshaller.available() > 0;
        }else {
            return this.objectInStream.available() > JBOSS_EOF || this.bufferedInStream.available() > 0;
        }

    }

    public B next() throws IOException {
        if(USE_JBOSS_IMPLEMENTATION){
            dataInstance.readData(unmarshaller);
        }else{
            dataInstance.readData(this.objectInStream);
        }
        return dataInstance;
    }

    public void endGet() throws IOException {
        closeResource(objectInStream);
        closeResource(bufferedInStream);
        closeResource(unmarshaller);
        closeResource(bufferedOutputStream);

        File file = new File(buildDataFilePath());
        file.delete();
    }

    private void closeResource(Closeable resource) throws IOException {
        if (resource != null) {
            resource.close();
        }
    }

    public void clear() throws IOException {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
