package pigudf;

import java.io.IOException;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

/**
 * __PIGUDF_EVALFUNC__: Eval is the most common type of function ,this example is to transfer input to upper case
 * 
 * {talendTypes} Boolean
 * 
 * {Category} EvalFunc
 * 
 * {param} Tuple(input) input: The Tuple need to be transfered to upper case.
 * 
 * {example} __PIGUDF_EVALFUNC__(input).
 */
public class __PIGUDF_EVALFUNC__ extends EvalFunc<String> {

    public String exec(Tuple input) throws IOException {
        if (input == null || input.size() == 0) {
            return null;
        }
        try {
            String str = (String) input.get(0);
            return str.toUpperCase();
        } catch (Exception e) {
            throw new IOException("Caught exception processing input row ", e);
        }
    }
}
