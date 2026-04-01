package cobolConversion;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public enum CharSetEnum {
	// define data table for using
	Cp037("Cp037", "{ABCDEFGHI", "}JKLMNOPQR"), Cp273("Cp273", "äABCDEFGHI",
	"üJKLMNOPQR"), Cp277("Cp277", "æABCDEFGHI", "åJKLMNOPQR"), Cp278(
	"Cp278", "äABCDEFGHI", "åJKLMNOPQR"), Cp280("Cp280", "àABCDEFGHI",
	"èJKLMNOPQR"), Cp284("Cp284", "{ABCDEFGHI", "}JKLMNOPQR"), Cp285(
	"Cp285", "{ABCDEFGHI", "}JKLMNOPQR"), Cp297("Cp297", "éABCDEFGHI",
	"èJKLMNOPQR"), Cp420("Cp420", "{ABCDEFGHI", "}JKLMNOPQR"), Cp424(
	"Cp424", "{ABCDEFGHI", "}JKLMNOPQR"), Cp500("Cp500", "{ABCDEFGHI",
	"}JKLMNOPQR"), Cp870("Cp870", "{ABCDEFGHI", "}JKLMNOPQR"), Cp871(
	"Cp871", "þABCDEFGHI", "æJKLMNOPQR"), Cp875("Cp875", "{ABCDEFGHI",
	"}JKLMNOPQR"), Cp1025("Cp1025", "{ABCDEFGHI", "}JKLMNOPQR"), Cp1026(
	"Cp1026", "çABCDEFGHI", "ğJKLMNOPQR"), Cp1047("Cp1047",
	"{ABCDEFGHI", "}JKLMNOPQR"), Cp1112("Cp1112", "{ABCDEFGHI",
	"}JKLMNOPQR"), Cp1122("Cp1122", "äABCDEFGHI", "ğJKLMNOPQR"), Cp1123(
	"Cp1123", "{ABCDEFGHI", "}JKLMNOPQR"), Cp1140("Cp1140",
	"{ABCDEFGHI", "}JKLMNOPQR"), Cp1141("Cp1141", "äABCDEFGHI",
	"üJKLMNOPQR"), Cp1142("Cp1142", "æABCDEFGHI", "åJKLMNOPQR"), Cp1143(
	"Cp1143", "äABCDEFGHI", "åJKLMNOPQR"), Cp1144("Cp1144",
	"àABCDEFGHI", "èJKLMNOPQR"), Cp1145("Cp1145", "{ABCDEFGHI",
	"}JKLMNOPQR"), Cp1146("Cp1146", "{ABCDEFGHI", "}JKLMNOPQR"), Cp1147(
	"Cp1147", "éABCDEFGHI", "èJKLMNOPQR"), Cp1148("Cp1148",
	"{ABCDEFGHI", "}JKLMNOPQR"), Cp1149("Cp1149", "þABCDEFGHI",
	"æJKLMNOPQR");

	String charSet;
	String failoverpositives;
	String failovernegatives;

	//default construct 
	CharSetEnum(String charSet, String failoverpositives,
			String failovernegatives) {
		this.charSet = charSet;
		this.failoverpositives = failoverpositives;
		this.failovernegatives = failovernegatives;
	}

	public String getCharSet() {
		return charSet;
	}

	public static void main(String[] a) {
		String charset = "Cp037";
		System.out.println(Charset.defaultCharset());
		for (CharSetEnum charsetEnum : CharSetEnum.values()) {
			if (charset.equals(charsetEnum.getCharSet())) {
				System.out.println(charsetEnum.failoverpositives);
				System.out.println(charsetEnum.failovernegatives);
			}
		}
	}
}
