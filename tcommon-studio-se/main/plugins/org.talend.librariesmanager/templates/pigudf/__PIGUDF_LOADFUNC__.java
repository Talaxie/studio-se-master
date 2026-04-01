package pigudf;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.pig.LoadFunc;
import org.apache.pig.PigException;
import org.apache.pig.backend.executionengine.ExecException;
import org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit;
import org.apache.pig.data.DataByteArray;
import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;



/**
 * __PIGUDF_LOADFUNC__: The load user-defined functions control how data goes into Pig of Pig.
 * The loader implementation in the example is a loader for text data with line delimiter as '\n' and '\t' 
 * as default field delimiter (which can be overridden by passing a different field delimiter in the constructor)
 * this is similar to current PigStorage loader in Pig. The implementation uses an existing Hadoop supported 
 * Inputformat - TextInputFormat - as the underlying InputFormat. 
 * 
 * {talendTypes} Boolean
 * 
 * {Category} LoadFunc
 * 
 * {param} String(delimiter) delimiter
 * 
 * {example} __PIGUDF_LOADFUNC__(delimiter).
 */
public class __PIGUDF_LOADFUNC__ extends LoadFunc {
    protected RecordReader in = null;
    private byte fieldDel = '\t';
    private ArrayList<Object> mProtoTuple = null;
    private TupleFactory mTupleFactory = TupleFactory.getInstance();

    public __PIGUDF_LOADFUNC__() {
    }

    public __PIGUDF_LOADFUNC__(String delimiter) {
        this();
        if (delimiter.length() == 1) {
            this.fieldDel = (byte)delimiter.charAt(0);
        } else if (delimiter.length() >  1 && delimiter.charAt(0) == '\\') {
            switch (delimiter.charAt(1)) {
            case 't':
                this.fieldDel = (byte)'\t';
                break;

            case 'x':
               fieldDel =
                    Integer.valueOf(delimiter.substring(2), 16).byteValue();
               break;

            case 'u':
                this.fieldDel =
                    Integer.valueOf(delimiter.substring(2)).byteValue();
                break;

            default:
                throw new RuntimeException("Unknown delimiter " + delimiter);
            }
        } else {
            throw new RuntimeException("PigStorage delimeter must be a single character");
        }
    }

    @Override
    public Tuple getNext() throws IOException {
        try {
            boolean notDone = in.nextKeyValue();
            if (!notDone) {
                return null;
            }
            Text value = (Text) in.getCurrentValue();
            byte[] buf = value.getBytes();
            int len = value.getLength();
            int start = 0;

            for (int i = 0; i < len; i++) {
                if (buf[i] == fieldDel) {
                    readField(buf, start, i);
                    start = i + 1;
                }
            }
            // pick up the last field
            readField(buf, start, len);

            Tuple t =  mTupleFactory.newTupleNoCopy(mProtoTuple);
            mProtoTuple = null;
            return t;
        } catch (InterruptedException e) {
            int errCode = 6018;
            String errMsg = "Error while reading input";
            throw new ExecException(errMsg, errCode,
                    PigException.REMOTE_ENVIRONMENT, e);
        }

    }

    private void readField(byte[] buf, int start, int end) {
        if (mProtoTuple == null) {
            mProtoTuple = new ArrayList<Object>();
        }

        if (start == end) {
            // NULL value
            mProtoTuple.add(null);
        } else {
            mProtoTuple.add(new DataByteArray(buf, start, end));
        }
    }

    @Override
    public InputFormat getInputFormat() {
        return new TextInputFormat();
    }

    @Override
    public void prepareToRead(RecordReader reader, PigSplit split) {
        in = reader;
    }

    @Override
    public void setLocation(String location, Job job)
            throws IOException {
        FileInputFormat.setInputPaths(job, location);
    }
}