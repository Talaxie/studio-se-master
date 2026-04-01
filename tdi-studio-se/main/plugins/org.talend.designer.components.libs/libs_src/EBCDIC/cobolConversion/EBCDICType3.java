package cobolConversion;
import java.math.BigDecimal;

import org.apache.commons.lang.mutable.MutableInt;

public class EBCDICType3 {
	public static BigDecimal readType3Value(byte[] byteValue, int decimal,
			boolean isImpliedDecimal){
		BigDecimal retVal = new BigDecimal(unpackDecimal(byteValue,decimal,isImpliedDecimal));
		int lgth = byteValue.length;
		int tmp = byteValue[lgth-1] & 0x0F;

		if ((tmp == 0x0F) || (tmp == 0x0C)) {
			return retVal;
		} else if (tmp == 0x0D) {
			return retVal.negate();
		} else {
			return null;
		}
	}

	public static boolean isValidPackedDecimal(byte[] byteArr){
		boolean isValid = false;
		int lgth = byteArr.length;
		if(lgth > 0){
			int tmp = byteArr[lgth-1] & 0x0F;
			if(tmp == 0x0F || tmp == 0x0C || tmp == 0x0D){
				isValid = true;
			}else{
				return false;
			}

			int temp;
			for (int i = 0; i < lgth; i++) {
				temp = (byteArr[i] & 0xF0) >> 4;//compute the higher nibble
				isValid = isValid && (temp < 10);

				if (i < (lgth - 1)) {
					temp = byteArr[i] & 0x0F;//compute the lower nibble
					isValid = isValid && (temp < 10);
				}

				if(!isValid){
					return false;
				}
			}
		}
		return isValid;
	}

	public static String unpackDecimal(byte[] byteValue, int decimal, boolean isImpliedDecimal){
		int len = byteValue.length;
		StringBuffer strbuf = new StringBuffer();
		int tmp;
		int tmp1;
		int tmp2;
		for (int i = 0; i < len; i++) {
			tmp = byteValue[i];
			tmp1 = tmp & 0xF0;
			tmp2 = tmp1 >> 4;
			strbuf.append(tmp2);

			if (i < (len - 1)) {
				tmp = byteValue[i];
				tmp1 = tmp & 0x0F;
				strbuf.append(tmp1);
			}
		}

		if ((decimal > 0) && isImpliedDecimal) {
			strbuf.insert(strbuf.length() - decimal, '.');
		}

		return strbuf.toString();
	}

	public static BigDecimal readType3(byte[] byteValue, int decimal,
			boolean isImpliedDecimal,String defaultStrValue){
			if(defaultStrValue == null || "".equals(defaultStrValue)){
				return readType3Value(byteValue,decimal,isImpliedDecimal);
			}else{
				boolean isValid = isValidPackedDecimal(byteValue);
				BigDecimal convertedBigDecimal = null;
				if(isValid){
					int lgth = byteValue.length;
					int tmp = byteValue[lgth-1] & 0x0F;
					convertedBigDecimal = new BigDecimal(unpackDecimal(byteValue,decimal,isImpliedDecimal));// implicit else part for 0x0F or 0x0C
					if(tmp == 0x0D){
						convertedBigDecimal = convertedBigDecimal.negate();
					}
				}else{
					convertedBigDecimal = new BigDecimal(defaultStrValue);
				}
			   return convertedBigDecimal;
			}
	}

	public static byte[] writeType3Value(int length, int decimal,
			BigDecimal value, boolean isSigned) throws Exception {

		if (decimal != value.scale()) {
			BigDecimal tmp = value.setScale(decimal, BigDecimal.ROUND_FLOOR);
			value = tmp;
		}

		String str = value.toPlainString();
		int len = str.length();
		byte[] buf = new byte[length];
		MutableInt k = new MutableInt(len);
		byte even; // left and right nibble ( we go from right to left )
		byte odd;

		for (int i = length - 1; i >= 0; i--) {
			// Last byte needs sign nibble
			if (i == (length - 1)) {
				even = getNextByte(str, k);

				if (isSigned) {
					if (value.signum() >= 0) {
						odd = 0x0C;
					} else {
						odd = 0x0D;
					}
				} else {
					odd = (byte) 0x0F;
				}
			} else {
				// Packing rest of the digits...
				// Get even digit if exist or zero
				odd = getNextByte(str, k);
				even = getNextByte(str, k);
			}

			buf[i] = (byte) ((even << 4) | odd);
		}

		// TODO: Check if str ">" buf and eventually throw an Exc.
		return buf;
	}

	private static byte getNextByte(String number, MutableInt recentlyReturned) {
		MutableInt zero = new MutableInt(0);
		recentlyReturned.decrement();

		if (recentlyReturned.compareTo(zero) >= 0) {
			while (!"0123456789".contains(String.valueOf(number
					.charAt(recentlyReturned.intValue())))) {
				recentlyReturned.decrement();

				if (recentlyReturned.compareTo(zero) < 0) {
					return 0;
				}
			}

			return (byte) (Character.getNumericValue(number
					.charAt(recentlyReturned.intValue())));
		} else {
			return 0;
		}
	}
}
