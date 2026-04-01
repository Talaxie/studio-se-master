package pigudf;

import java.io.IOException;
import java.util.Map;
import org.apache.pig.FilterFunc;
import org.apache.pig.backend.executionengine.ExecException;
import org.apache.pig.data.DataBag;
import org.apache.pig.data.Tuple;
import org.apache.pig.data.DataType;
import org.apache.pig.impl.util.WrappedIOException;

/**
 * __PIGUDF_FILTERFUNC__: Filter functions are eval functions that return a boolean value. 
 * Filter functions can be used anywhere a Boolean expression is appropriate,
 * including the FILTER operator or bincond expression. 
 * 
 * {talendTypes} Boolean
 * 
 * {Category} FilterFunc
 * 
 * {param} Tuple(input) input: The Tuple need to be filter.
 * 
 * {example} __PIGUDF_FILTERFUNC__(input).
 */
public class __PIGUDF_FILTERFUNC__ extends FilterFunc{

	 public Boolean exec(Tuple input) throws IOException {
	        if (input == null || input.size() == 0)
	            return null;
	        try {
	            Object values = input.get(0);
	            if (values instanceof DataBag)
	                return ((DataBag)values).size() == 0;
	            else if (values instanceof Map)
	                return ((Map)values).size() == 0;
	            else{
	                throw new IOException("Cannot test a " +
	                    DataType.findTypeName(values) + " for emptiness.");
	            }
	        } catch (ExecException ee) {
	            throw WrappedIOException.wrap("Caught exception processing input row ", ee);   
	        }
	    }
}
