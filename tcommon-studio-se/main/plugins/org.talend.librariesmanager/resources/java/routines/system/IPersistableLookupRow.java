package routines.system;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jboss.marshalling.Marshaller;
import org.jboss.marshalling.Unmarshaller;

public interface IPersistableLookupRow<R> {

    public void writeKeysData(ObjectOutputStream out);

    public void readKeysData(ObjectInputStream in);

    public void writeValuesData(DataOutputStream dataOut, ObjectOutputStream objectOut);

    public void readValuesData(DataInputStream dataIn, ObjectInputStream objectIn);

    public void copyDataTo(R other);

    public void copyKeysDataTo(R other);

    default public void writeKeysData(Marshaller marshaller){
        //sub-class need to override this method
        throw new UnsupportedOperationException("Method need to be override");
    }

    default public void readKeysData(Unmarshaller in){
        throw new UnsupportedOperationException("Method need to be override");
    }

    default public void writeValuesData(DataOutputStream dataOut, Marshaller objectOut){
        throw new UnsupportedOperationException("Method need to be override");
    }

    default public void readValuesData(DataInputStream dataIn, Unmarshaller objectIn){
        throw new UnsupportedOperationException("Method need to be override");
    }

    default public boolean supportMarshaller(){
        //Override this method to return true after implement the Jboss methods above
        return false;
    }
}
