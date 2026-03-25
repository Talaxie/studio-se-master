package org.talend.netsuite;

public class NetsuiteException extends Exception {

	private static final long serialVersionUID = 1L;

	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public NetsuiteException(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

}
