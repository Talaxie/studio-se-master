package org.talend.jpalo;

public class palo {

	public palo(){
		super();
	}
	
	public palo(boolean bDeploy){
		super();
	}
	
    public paloconnection connect(String strUserName, String strUserPass, String strServer, String strPort) throws paloexception{
        return new paloconnection(strUserName, strUserPass, strServer, strPort);
    }
	
}
