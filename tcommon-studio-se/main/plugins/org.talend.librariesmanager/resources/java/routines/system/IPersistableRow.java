package routines.system;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jboss.marshalling.Marshaller;
import org.jboss.marshalling.Unmarshaller;

public interface IPersistableRow<R> {

    public void writeData(ObjectOutputStream out);

    public void readData(ObjectInputStream in);


    default public void writeData(Marshaller marshaller){
        //sub-class need to override this method
        throw new UnsupportedOperationException("Method need to be override");
    }

    default public void readData(Unmarshaller in){
        throw new UnsupportedOperationException("Method need to be override");
    }

    default public boolean supportJboss(){
        //Override this method to return true after implement the Jboss methods above
        return false;
    }

}
