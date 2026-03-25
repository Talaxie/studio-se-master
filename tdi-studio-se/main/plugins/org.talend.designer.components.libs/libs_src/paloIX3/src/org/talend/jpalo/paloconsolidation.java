package org.talend.jpalo;


public class paloconsolidation {

	private paloconsolidations paloConsolidations;
	
	private String strElementName;
	private long lElementIdentifier;
	private int iType;
	private double dFactor;
	private int iPos;
	
	public paloconsolidation(){
		super();
	}
	
	/**
	 * Creates a consolidation element 
	 *
	 * @param  Consolidations where the element should be added
	 * @param  Element name
	 * @param  Element type
	 * @param  Consolidation factor
	 */
	public paloconsolidation(paloconsolidations paloConsolidations, long lElementIdentifier, String strElementName, int iType, double dFactor){
		super();
		this.lElementIdentifier = lElementIdentifier;
		this.strElementName=strElementName;
		this.iType=iType;
		this.dFactor=dFactor;
		this.paloConsolidations = paloConsolidations;
		this.iPos = paloConsolidations.getNumberOfConsolidations();
	}
	
	/**
	 * Returns the element identifier 
	 *
	 * @return      The actual element identifier
	 */
	public long getIdentifier(){
		return lElementIdentifier;
	}
	
	
	/**
	 * Returns the element name 
	 *
	 * @return      The actual element name
	 */
	public String getName(){
		return strElementName;
	}

	/**
	 * Returns the element type 
	 *
	 * @return      The actual element type
	 */
	public int getType(){
		return iType;
	}
	
	/**
	 * Returns the consolidation factor of the Element 
	 *
	 * @return      The consolidation numeric factor
	 */
	public double getFactor(){
		return dFactor;
	}
	
	/**
	 * Sets the consolidation factor of the Element 
	 *
	 * @param  The consolidation numeric factor to set
	 */
	public void setFactor(double dFactor){
		this.dFactor = dFactor;
	}
	
	/**
	 * Returns the Element position inside the consolidation 
	 *
	 * @return      The actual position
	 */
	public int getPosition(){
		return iPos;
	}
	
	/**
	 * Moves the element to the given position inside the consolidation
	 *
	 * @param  The position where to move
	 */
	public void moveTo(int iNewPos){
		if(iNewPos!=this.iPos){
			int iOffset=0;
			int iOffset2=iNewPos+1;
			if(iNewPos>this.iPos){
				for(paloconsolidation paloConsolidation : paloConsolidations.getConsolidations()){
					if(paloConsolidation.equals(this))this.iPos=iNewPos;
					else if(paloConsolidation.getPosition()<=iNewPos) paloConsolidation.iPos=iOffset++;
					else if(paloConsolidation.getPosition()>iNewPos) paloConsolidation.iPos=iOffset2++;
				}
			}else{
				for(paloconsolidation paloConsolidation : paloConsolidations.getConsolidations()){
					if(paloConsolidation.equals(this))this.iPos=iNewPos;
					else if(paloConsolidation.getPosition()<iNewPos) paloConsolidation.iPos=iOffset++;
					else if(paloConsolidation.getPosition()>=iNewPos) paloConsolidation.iPos=iOffset2++;
				}
			}
		}
	}
	
	/**
	 * Checks if a consolidation Object equals the actual consolidation 
	 * elemnt. The compare will be done on the names.
	 *
	 * @param  The consolidation Object to compare
	 * @return      true or false
	 */
	public boolean equals ( Object o ){
		if(this.strElementName.equals(((paloconsolidation)o).strElementName)) return true;
		else return false;
	}  
	
	/**
	 * Returns the whole consolidation element as String
	 *
	 * @return      The consolidation element as String
	 */
	public String toString(){
		StringBuffer sbRC = new StringBuffer();
		sbRC.append("Identifier: " + this.lElementIdentifier + " / ");
		sbRC.append("Name: " + this.strElementName + " / ");
		sbRC.append("Factor: " + this.dFactor + " / ");
		sbRC.append("Type: " + this.iType + " / ");
		sbRC.append("Position: " + this.iPos + " / ");
		return sbRC.toString();
	}
}
