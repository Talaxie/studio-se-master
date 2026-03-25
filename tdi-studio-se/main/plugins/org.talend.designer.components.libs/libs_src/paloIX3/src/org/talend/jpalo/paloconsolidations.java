package org.talend.jpalo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

public class paloconsolidations {
	
	
	private Hashtable<String, paloconsolidation> paloConsolidations = new Hashtable<String,paloconsolidation>();
	private elementComparator consolidationComparator = new elementComparator();
	
	
	public paloconsolidations(){
		super();
	}
	
	public paloconsolidations(paloelements paloElements, paloelement paloElement){
		super();
		paloelement plElm;
		int iPos=0;
		
		if(paloElement.hasChildren()){
			for(int iElementChild : paloElement.getElementChildren()){
				plElm = paloElements.getElementByIdentifier(iElementChild);
				paloconsolidation plCons = new paloconsolidation(this, plElm.getElementIdentifier(), plElm.getName(), plElm.getElementType(), paloElement.getElementChildrenWeights()[iPos]);
				paloConsolidations.put(plElm.getName(), plCons);
				iPos++;
			}
		}
	}
	
	public void addElementToConsolidation(paloelement plElement){
		paloconsolidation plConsolidation = new paloconsolidation(this, plElement.getElementIdentifier(), plElement.getName(), plElement.getElementType(), 1d );
		paloConsolidations.put(plElement.getName(), plConsolidation);
	}
	
	public void addElementToConsolidation(paloelement plElement, double dFactor){
		paloconsolidation plConsolidation = new paloconsolidation(this, plElement.getElementIdentifier(), plElement.getName(), plElement.getElementType(), dFactor );
		paloConsolidations.put(plElement.getName(),plConsolidation);
	}

	public int getNumberOfConsolidations(){
		return paloConsolidations.size();
	}

	public String getConsolidationStringElementIdentifiers(){
		int iPos=0;
		StringBuilder sbRC = new StringBuilder();
		for(paloconsolidation plCon : getConsolidations()){
			if(iPos++>0) sbRC.append(",");
			sbRC.append(plCon.getIdentifier());
		}
		return sbRC.toString();
	}
	
	public String getConsolidationStringElementWeights(){
		int iPos=0;
		StringBuilder sbRC = new StringBuilder();
		for(paloconsolidation plCon : getConsolidations()){
			if(iPos++>0) sbRC.append(",");
			sbRC.append(plCon.getFactor());
		}
		return sbRC.toString();
	}
	
	public int[] getConsolidationElementIdentifiers(){
		int iRCArr[] = new int[paloConsolidations.size()];
		int iPos=0;
		for(paloconsolidation plCon : getConsolidations())iRCArr[iPos++]=(int)plCon.getIdentifier();
		return iRCArr;
	}
	
	public double[] getConsolidationElementWeights(){
		double dRCArr[] = new double[paloConsolidations.size()];
		int iPos=0;
		for(paloconsolidation plCon : getConsolidations())dRCArr[iPos++]=plCon.getFactor();
		return dRCArr;
	}
	
	public void removeConsolidationElement(int iIndex){
		if(iIndex<paloConsolidations.size()){
			paloconsolidation paloElemToRemove = paloConsolidations.get(iIndex);
			if(null != paloElemToRemove) paloConsolidations.remove(paloElemToRemove);
		}
	}
	
	public void removeConsolidationElement(String strElementName){
		paloConsolidations.get(strElementName).moveTo(paloConsolidations.size());
		paloConsolidations.remove(strElementName);
	}
	
	public void removeAll(){
		paloConsolidations = new Hashtable<String,paloconsolidation>();
	}
	
	
	public paloconsolidation getConsolidation(String strElementName){
		return paloConsolidations.get(strElementName);
	}
	
	
	public paloconsolidation getConsolidation(int iPosition){
		for(paloconsolidation paloConsolidation : paloConsolidations.values()){
			if(paloConsolidation.getPosition()==iPosition) return paloConsolidation;
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<paloconsolidation> getConsolidations(){
		ArrayList<paloconsolidation> rcArrayList = new ArrayList<paloconsolidation>();
		Object[] arObjectsToSort = paloConsolidations.entrySet().toArray(); 
		Arrays.sort(arObjectsToSort, (Comparator)consolidationComparator);
		for(int i=0;i<arObjectsToSort.length;i++){
			rcArrayList.add(((paloconsolidation)((Map.Entry)arObjectsToSort[i]).getValue()));
		}
		return rcArrayList;
	}
	
	private class elementComparator implements Comparator<Map.Entry<String, paloconsolidation>>{
		public int compare(Map.Entry<String, paloconsolidation> o1, Map.Entry<String, paloconsolidation> o2){
			if(o1.getValue().getPosition()>o2.getValue().getPosition()) return 1;
			else return -1;
		}
	}
	
}
