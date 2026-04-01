package cobolConversion;
import java.math.BigDecimal;
import cobolConversion.CharSetEnum;

public class EBCDICType9 {

	public static byte[] writeType9Value(int length, int decimal, BigDecimal value,
			boolean isSigned, boolean isImpliedDecimal,String charset) throws Exception {

		byte[] reValue = null;
		String failoverpositives = "{ABCDEFGHI";
		String failovernegatives = "}JKLMNOPQR";
		if (decimal != value.scale()) {
			BigDecimal tmp = value.setScale(decimal, BigDecimal.ROUND_FLOOR);
			value = tmp;
		}

		String str = value.toPlainString();
		StringBuffer buf = new StringBuffer(str);

		// Modify byte with sign ...
		if (isSigned) {
			int lastidx = buf.length() - 1;
			char lastbyte = buf.charAt(lastidx);
			char repl;
			for (CharSetEnum charsetEnum : CharSetEnum.values()){
	            if(charset.equals(charsetEnum.getCharSet())){
	            	failoverpositives = charsetEnum.failoverpositives;
	            	failovernegatives = charsetEnum.failovernegatives;
	            	break;
	            }
	        }
			if (value.signum() >= 0) {
				repl = failoverpositives.charAt(Integer.parseInt(String
						.valueOf(lastbyte)));
			} else {
				repl = failovernegatives.charAt(Integer.parseInt(String
						.valueOf(lastbyte)));
			}

			buf.setCharAt(lastidx, repl);

			// Delete sign char
			String tmp = buf.toString();
			String tmp2 = tmp.replace("-", "");
			buf = new StringBuffer(tmp2);
		}

		// Delete decimal point...
		if (isImpliedDecimal) {
			String tmp = buf.toString();
			String tmp2 = tmp.replace(".", "");
			buf = new StringBuffer(tmp2);
		}

		// Adding some leading zeros ...
		while (length > buf.length()) {
			buf.insert(0, "0");
		}
		reValue = buf.toString().getBytes(charset);
		return reValue;
	}
	
	
	public static BigDecimal readType9Value(byte[] byteValue,int decimal,boolean isImpliedDecimal,String charset) throws Exception{

        byte[] b = byteValue;
        String failoverpositives = "{ABCDEFGHI";
        String failovernegatives = "}JKLMNOPQR";
        int idx;
        char[] pos = { 0xC0, 0xC1, 0xC2, 0xC3, 0xC4, 0xC5, 0xC6, 0xC7, 0xC8, 0xC9 };
        char[] neg = { 0xD0, 0xD1, 0xD2, 0xD3, 0xD4, 0xD5, 0xD6, 0xD7, 0xD8, 0xD9 };
        String IBMpositives = new String(pos);
        String IBMnegatives = new String(neg);
        String MFnegatives = "pqrstuvwxy";
		String CAnegatives = " !\"#$%&'()";
		for (CharSetEnum charsetEnum : CharSetEnum.values()){
            if(charset.equals(charsetEnum.getCharSet())){
            	failoverpositives = charsetEnum.failoverpositives;
            	failovernegatives = charsetEnum.failovernegatives;
            	break;
            }
        }
        StringBuffer buf = new StringBuffer(new String(b, charset));
        int lastidx = buf.length() - 1;
        char lastbyte = buf.charAt(lastidx);
        boolean positive = true;

        idx = IBMpositives.indexOf(lastbyte);
        if (idx > -1) {
            buf.replace(lastidx, lastidx + 1, new Integer(idx).toString());
            positive = true;
        }

        idx = IBMnegatives.indexOf(lastbyte);
        if (idx > -1) {
            buf.replace(lastidx, lastidx + 1, new Integer(idx).toString());
            positive = false;
        }

        idx = failoverpositives.indexOf(lastbyte);
        if (idx > -1) {
            buf.replace(lastidx, lastidx + 1, new Integer(idx).toString());
            positive = true;
        }

        idx = failovernegatives.indexOf(lastbyte);
        if (idx > -1) {
            buf.replace(lastidx, lastidx + 1, new Integer(idx).toString());
            positive = false;

        }

		idx = MFnegatives.indexOf(lastbyte);
        if (idx > -1) {
            buf.replace(lastidx, lastidx + 1, new Integer(idx).toString());
            positive = false;
				}

		idx = CAnegatives.indexOf(lastbyte);
        if (idx > -1) {
            buf.replace(lastidx, lastidx + 1, new Integer(idx).toString());
            positive = false;
				}

        if ((decimal > 0) && isImpliedDecimal) {
            buf.insert(buf.length() - decimal, '.');
        }

        BigDecimal retVal;

        try {
            retVal = new BigDecimal(buf.toString());
        } catch (NumberFormatException ex) {
            throw new Exception();
        }

        if (!positive) {
            retVal = retVal.negate();
        }

        return retVal;
    
	}
	
}
