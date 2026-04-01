package org.talend.jpalo;

import java.math.BigInteger;
import java.security.MessageDigest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class palohelpers {
	
	public static String getMD5(String strIn){
    	try{
    		MessageDigest md5 = MessageDigest.getInstance("MD5");
    		md5.update(strIn.getBytes());
    		BigInteger hash = new BigInteger(1, md5.digest());
			String shortMd5 = hash.toString(16);
			StringBuilder ret = new StringBuilder(32);
            int l = 32 - shortMd5.length();
			for (int i = l; i > 0; i--)	ret.append('0');
			ret.append(shortMd5);
			
			return ret.toString();

    	}catch(Exception e){
    		return null;
    	}
    }
	
	public static int StringToInt(String strIn){
		if(null == strIn || strIn.length()==0) return -1;
		return Integer.valueOf(strIn);
	}
	
	public static double StringToDouble(String strIn){
		if(null == strIn || strIn.length()==0) return -1d;
		return Double.valueOf(strIn);
	}
	
	public static long StringToLong(String strIn){
		if(null == strIn || strIn.length()==0) return -1l;
			if(strIn.length()>18){
				strIn = strIn.substring(0, 18);
			}
		return Long.valueOf(strIn);
	}

	public static boolean StringToBoolean(String strIn){
		if(null == strIn || strIn.length()==0) return false;
		if(strIn.trim().equals("1")) return true;
		return false;
	}
	
	public static int[] StringToIntArray(String strIn, int iNumberOfValues){
		if(null == strIn || strIn.length()==0) return null;
		int iPos=0;
		int[] intArray=new int[iNumberOfValues];
		for(String str : strIn.split(",")) intArray[iPos++]=Integer.valueOf(str);
		return intArray;
	}
	
	public static double[] StringToDoubleArray(String strIn, int iNumberOfValues){
		if(null == strIn || strIn.length()==0) return null;
		int iPos=0;
		double[] doubleArray=new double[iNumberOfValues];
		for(String str : strIn.split(",")) doubleArray[iPos++]=Double.valueOf(str);
		return doubleArray;
	}
	
	public static String makeStrinOfArray(String[] strArr){
		StringBuilder sbRC = new StringBuilder();
		int i=0;
		for(String strElementArr : strArr){
			if(i>0)sbRC.append(",");
			sbRC.append(strElementArr);
			i++;
		}
		return sbRC.toString();
	}
	
	public static String BooleanToString(boolean bIn){
		if(bIn) return "1";
		else return "0";
	}
	
	
	public static Date getCalcDateBegin(int iDateTimeStamp){
		try{
			 Calendar calStart = Calendar.getInstance();
			 calStart.set(Calendar.YEAR, 1970);
			 calStart.set(Calendar.MONTH, 0);
			 calStart.set(Calendar.DATE, 1);
			 calStart.set(Calendar.HOUR_OF_DAY, 0);
			 calStart.set(Calendar.MINUTE, 0);
			 calStart.set(Calendar.SECOND, 0);
			 
			 calStart.add(Calendar.SECOND, iDateTimeStamp);
			 return calStart.getTime();
		
		}catch(Exception e){
			return null;
		}
	}
	
	
	
	public static <T> Iterable<List<T>> finiteCartesianProduct(final List<Collection<T>> sets){
        return new Iterable<List<T>>(){
            private long size=1;
            {
                for(Collection<T> set:sets)size*=(long)set.size();
            }
            
            public Iterator<List<T>> iterator() {
                return new Iterator<List<T>>(){
                    long counter=0;
                    ArrayList<T> currentValues=new ArrayList<T>(sets.size());
                    ArrayList<Iterator<T>> iterators=new ArrayList<Iterator<T>>(sets.size());
                    {
                        for(Iterable<T> set:sets){
                            Iterator<T> it=set.iterator();
                            iterators.add(it);
                            if(it.hasNext()){
                                currentValues.add(it.next());
                            }
                        }
                    }
                    public boolean hasNext() {
                        return counter<size;
                    }
                    
                    public List<T> next() {
                        List<T> result=new LinkedList<T>(currentValues);
                        counter++;
                        increment(0);
                        return result;
                    }
                    
                    private void increment(int i){
                        if(iterators.get(i).hasNext()){
                            currentValues.set(i,iterators.get(i).next());
                        }else{
                            iterators.set(i,sets.get(i).iterator());
                            currentValues.set(i,iterators.get(i).next());
                            if(i<iterators.size()-1){
                                increment(i+1);
                            }
                        }
                    }
                    
                    public void remove() {
                        throw new UnsupportedOperationException("this operaion is not supported");
                    }
                };
            }
        };
    }
	
	
	
}
