package org.talend.jpalo;

public class paloexception extends Exception{

	static final long serialVersionUID = -55283749234798L;

	public paloexception(){
		super("Palo exception occurred.");
	}

	public paloexception(String inStr){
		super(inStr);
	}
	
	public paloexception(String strMsgNumber, String strError1, String strError2){
		this(strMsgNumber +" "+ strError1 + " "+ strError2);
		//super(strMsgNumber +" "+ strError1 + " "+ strError2);
	}
}