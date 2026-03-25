package org.talend.jpalo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

public class palodata {

    public palodata() {
        alPaloElements = new ArrayList();
        htPaloResultData = new Hashtable();
        lstDimensionElements = new LinkedList();
    }

    public palodata(paloconnection plConn, palodatabase plDB, palocube paloCube)

    {
        alPaloElements = new ArrayList();
        htPaloResultData = new Hashtable();
        lstDimensionElements = new LinkedList();
        this.plConn = plConn;
        lDatabaseId = plDB.getDatabaseId();
        plCube = paloCube;
    }

    public palodata(paloconnection plConn, palodatabase plDB, palocube paloCube, ArrayList alPaloElements,
            String strDimensionElementsArray[][], int iBatchSize) {
        this.alPaloElements = new ArrayList();
        htPaloResultData = new Hashtable();
        lstDimensionElements = new LinkedList();
        this.plConn = plConn;
        lDatabaseId = plDB.getDatabaseId();
        plCube = paloCube;
        this.alPaloElements = alPaloElements;
        this.strDimensionElementsArray = strDimensionElementsArray;

        this.iBatchSize = iBatchSize;
        htPaloResultData = new Hashtable();
        buildDimElemIteratorFromArray();
    }

    private void buildDimElemIteratorFromArray() {
        iDimensionElementLength = strDimensionElementsArray.length;
        for (String[] element : strDimensionElementsArray) {
            lstDimensionElements.add(Arrays.asList(element));
        }

        itDimensionElements = palohelpers.finiteCartesianProduct(lstDimensionElements).iterator();
    }

    public boolean getResults() throws paloexception {
        int iRowCounter = 0;
        List lstDimensionElementArray = new LinkedList();
        htPaloResultData = new Hashtable();
        for (; itDimensionElements.hasNext() && iRowCounter < iBatchSize; iRowCounter++) {
            List x = (List) itDimensionElements.next();
            for (int i = 0; i < x.size(); i++) {
                lstDimensionElementArray.add(x.get(i));
            }

        }

        int iPos = 0;
        int iCoordPos = 0;
        StringBuilder sbCoordinates = new StringBuilder();
        for (Iterator iterator = lstDimensionElementArray.iterator(); iterator.hasNext();) {
            String strCoordElement = (String) iterator.next();
            if (iPos > 0) {
                sbCoordinates.append(",");
            }
            paloelement plElm = ((paloelements) alPaloElements.get(iCoordPos)).getElement(strCoordElement);
            if (plElm == null) {
                sbCoordinates.append("-1");
            } else {
                sbCoordinates.append(plElm.getElementIdentifier());
            }
            iPos++;
            if (++iCoordPos >= iDimensionElementLength) {
                iCoordPos = 0;
                sbCoordinates.append(":");
                iPos = 0;
            }
        }

        if (iRowCounter > 0) {
            List qparams = new ArrayList();
            qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
            qparams.add(new BasicNameValuePair("cube", String.valueOf(plCube.getCubeId())));
            qparams.add(new BasicNameValuePair("paths", sbCoordinates.toString()));
            try {
                HttpEntity entity = plConn.sendToServer(qparams, "/cell/values");
                CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
                csv.setQuoteChar('"');
                int iCoordElem = 0;
                while (csv.readNext()) {
                    if(iCoordElem > lstDimensionElementArray.size()-1){
                        break;
                    }
                    String strArrCoord[] = new String[iDimensionElementLength];
                    for (int i = 0; i < iDimensionElementLength; i++) {
                        strArrCoord[i] = (String) lstDimensionElementArray.get(iCoordElem++);
                    }

                    if (palohelpers.StringToInt(csv.get(0)) == 1) {
                        if (palohelpers.StringToInt(csv.get(1)) > 0) {
                            htPaloResultData.put(strArrCoord,
                                    new palodatavalue(strArrCoord, palohelpers.StringToDouble(csv.get(2))));
                        } else {
                            htPaloResultData.put(strArrCoord, new palodatavalue(strArrCoord, 0.0D));
                        }
                    } else if (palohelpers.StringToInt(csv.get(0)) == 0) {
                        htPaloResultData.put(strArrCoord, new palodatavalue(strArrCoord, csv.get(2)));
                    }
                }
                csv.close();
                entity.consumeContent();
            } catch (Exception e) {
                throw new paloexception(e.getMessage());
            }
        }
        return iRowCounter <= iBatchSize && iRowCounter > 0;
    }

    public Hashtable getResultHashTable() {
        return htPaloResultData;
    }

    public palodatavalue getValue(String strDimensionElementArray[], boolean bRefreshElements) throws paloexception {
        long lDimensionElementIdentifierArray[] = new long[strDimensionElementArray.length];
        if (plDims == null || bRefreshElements) {
            plDims = plCube.getDimensions();
        }
        for (int i = 0; i < strDimensionElementArray.length; i++) {
            paloelement plElm = plDims.getDimension(i).getElements(false).getElement(strDimensionElementArray[i]);
            if (plElm == null) {
                lDimensionElementIdentifierArray[i] = -1L;
            } else {
                lDimensionElementIdentifierArray[i] = plElm.getElementIdentifier();
            }
        }

        return getValue(lDimensionElementIdentifierArray);
    }

    public palodatavalue getValue(long lDimensionElementIdentifierArray[]) throws paloexception {
        List qparams = new ArrayList();
        qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(plCube.getCubeId())));
        StringBuilder sbCoordinates = new StringBuilder();
        int iPos = 0;
        long al[];
        int j = (al = lDimensionElementIdentifierArray).length;
        for (int i = 0; i < j; i++) {
            long lDimensionElementIdentifier = al[i];
            if (iPos > 0) {
                sbCoordinates.append(",");
            }
            sbCoordinates.append(lDimensionElementIdentifier);
            iPos++;
        }

        qparams.add(new BasicNameValuePair("path", sbCoordinates.toString()));
        palodatavalue rcDataValue = null;
        try {
            HttpEntity entity = plConn.sendToServer(qparams, "/cell/value");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                if (palohelpers.StringToInt(csv.get(0)) == 1) {
                    if (palohelpers.StringToInt(csv.get(1)) > 0) {
                        rcDataValue = new palodatavalue(palohelpers.StringToDouble(csv.get(2)));
                    } else {
                        rcDataValue = new palodatavalue(0.0D);
                    }
                } else if (palohelpers.StringToInt(csv.get(0)) == 0) {
                    rcDataValue = new palodatavalue(csv.get(2));
                }
            }
            csv.close();
            entity.consumeContent();
            return rcDataValue;
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public static final int PALO_SPLASH_DISABLE = 0;

    public static final int PALO_SPLASH_DEFAULT = 1;

    public static final int PALO_SPLASH_BASE_SET = 3;

    public static final int PALO_SPLASH_BASE_ADD = 2;

    private paloconnection plConn;

    private palodimensions plDims;

    private long lDatabaseId;

    private ArrayList alPaloElements;

    private Hashtable htPaloResultData;

    private palocube plCube;

    private String strDimensionElementsArray[][];

    private List lstDimensionElements;

    private Iterator itDimensionElements;

    private int iBatchSize;

    private int iDimensionElementLength;
}
