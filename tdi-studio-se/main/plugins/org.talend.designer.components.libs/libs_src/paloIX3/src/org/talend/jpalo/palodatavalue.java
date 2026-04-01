package org.talend.jpalo;

public class palodatavalue {
	
	public final static int PALO_NUMERIC = 1;
	public final static int PALO_STRING = 0;
	
	private String[] sArrCoordinates;
	private int iType=99;
	private double dValue;
	private String sValue;
	
	private String sError;
	private boolean bValid;
	
	public palodatavalue(){
		super();
	}

	public palodatavalue(double dValue){
		super();
		this.dValue = dValue;
		iType=PALO_NUMERIC;
		bValid=true;
	}
	
	public palodatavalue(String sValue){
		super();
		this.sValue = sValue;
		iType=PALO_STRING;
		bValid=true;
		sError="";
	}
	
	public palodatavalue(String[] sArrCoordinates, double dValue){
		super();
		int i=0;
		this.sArrCoordinates = new String[sArrCoordinates.length];
		for(String strCoordinate : sArrCoordinates){
			this.sArrCoordinates[i++] = strCoordinate;
		}
		this.dValue = dValue;
		iType=PALO_NUMERIC;
		bValid=true;
		sError="";
	}
	
	public palodatavalue(String[] sArrCoordinates, String sValue){
		super();
		int i=0;
		this.sArrCoordinates = new String[sArrCoordinates.length];
		for(String strCoordinate : sArrCoordinates){
			this.sArrCoordinates[i++] = strCoordinate;
		}
		this.sValue = sValue;
		iType=PALO_STRING;
		bValid=true;
		sError="";
	}


	
	public void setValue(String[] sArrCoordinates, double dValue){
		int i=0;
		for(String strCoordinate : sArrCoordinates){
			this.sArrCoordinates[i++] = strCoordinate;
		}
		setDoubleValue(dValue);
	}
	
	public void setValue(String[] sArrCoordinates, String sValue){
		int i=0;
		for(String strCoordinate : sArrCoordinates){
			this.sArrCoordinates[i++] = strCoordinate;
		}
		setStringValue(sValue);
	}
	
	public String[] getCoordinates(){
		return sArrCoordinates;
	}
	
	public String getCoordinatesString(){
		StringBuilder sbR = new StringBuilder();
		for(int i=0;i<this.sArrCoordinates.length;i++){
			if(i>0) sbR.append(",");
			sbR.append(sArrCoordinates[i]);
		}
		return sbR.toString();
	}

	public String getStringValue(){
		return sValue;
	}

	public double getDoubleValue(){
		return dValue;
	}
	
	public void setStringValue(String sValue){
		this.sValue = sValue;
		iType=PALO_STRING;
		bValid=true;
		sError="";
	}

	public void setDoubleValue(double dValue){
		this.dValue= dValue;
		iType=PALO_NUMERIC;
		bValid=true;
		sError="";
	}
	
	public int getType(){
		return iType;
	}

	public boolean isValid(){
		return bValid;
	}
	
	public String getErrorText(){
		return sError;
	}
	
	public String toString(){
		StringBuilder sbR = new StringBuilder();
		for(int i=0;i<this.sArrCoordinates.length;i++){
			if(i>0) sbR.append("|");
			sbR.append(sArrCoordinates[i]);
		}
		sbR.append("|");
		if(this.getType()==PALO_NUMERIC) sbR.append(this.dValue);
		else sbR.append(this.sValue);
		return sbR.toString();
	}
}
