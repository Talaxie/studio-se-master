package org.talend.repository.services.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

public class FolderNameUtil {

	private static final Pattern PATTERN_PUNCT_EXCEPT_SLASH = Pattern.compile("(?![/])\\p{Punct}");

	public static String replaceAllLimited(String input) {
		if (input == null) {
			return input;
		}
		return PATTERN_PUNCT_EXCEPT_SLASH.matcher(input).replaceAll("-");
	}

	public static String getImportedXmlSchemaPath(String namespace,
			String portType, String operation) throws URISyntaxException {
		if (namespace == null || portType == null || operation == null) {
			throw new URISyntaxException(namespace + " " + portType + " "
					+ operation, "The arguments can't be empty, please check");
		}
		StringBuilder builder = new StringBuilder(replaceAllLimited(new URI(namespace).getRawSchemeSpecificPart()));
		if (builder.length() > 0) {
			while (builder.charAt(0) == '/') {
				builder.deleteCharAt(0);
			}
			if (builder.charAt(builder.length() - 1) != '/') {
				builder.append('/');
			}
		}
		builder.append(portType).append('/').append(operation);
		return builder.toString();
	}

	// quick check
//	public static void main(String[] args) throws URISyntaxException {
//		String[] s = new String[] { "sdf://ftp.is.co.za/rfc/rfc1808.txt",
//		"http://www.ietf.org/rfc/rfc2396.txt",
//		"ldap://[2001:db8::7]/c=GB?objectClass?one",
//		"mailto:John.Doe@example.com",
//		"news:comp.infosystems.www.servers.unix",
//		"tel:+1-816-555-1212",
//		"telnet://192.0.2.16:80/",
//		"urn:oasis:names:specification:docbook:dtd:xml:4.1.2"
//		};
//		for (String t : s) {
//			System.out.println(getImportedXmlSchemaPath(t, "port", "op"));
//		}
//	}

}
