package org.talend.jpalo;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

public class palodatamulti {

    public final static int PALO_SPLASH_DISABLE = 0;

    public final static int PALO_SPLASH_DEFAULT = 1;

    public final static int PALO_SPLASH_BASE_SET = 3;

    public final static int PALO_SPLASH_BASE_ADD = 2;

    private paloconnection plConn;

    private long lDatabaseId;

    private ArrayList<paloelements> alPaloElements = new ArrayList<paloelements>();

    private List<palodatavalue> lstPaloValues = new ArrayList<palodatavalue>();

    private int iNbOfCoordinates = 0;

    private int iNbOfDataVolumns = 0;

    private int iCurrentPos = 0;

    private void initDataSetList() {
        String strArr[] = new String[iNbOfCoordinates];
        for (int i = 0; i < iNbOfDataVolumns; i++) {
            palodatavalue plDV = new palodatavalue(strArr, 0);
            lstPaloValues.add(plDV);
        }
    }

    public void cleanDataSetList() {
        iCurrentPos = 0;
    }

    public palodatamulti(paloconnection plConn, palodatabase plDB, int iNbOfDataVolumns, int iNbOfCoordinates,
            ArrayList<paloelements> alPaloElements) {
        this.plConn = plConn;
        this.lDatabaseId = plDB.getDatabaseId();
        lstPaloValues = new ArrayList<palodatavalue>(iNbOfDataVolumns);
        this.iNbOfCoordinates = iNbOfCoordinates;
        this.iNbOfDataVolumns = iNbOfDataVolumns;
        this.alPaloElements = alPaloElements;
        // Init lstPaloValues
        initDataSetList();
    }

    public void addToValueList(String[] strArrCoordinates, double dValue) {
        strArrCoordinates = replaceStringArrWithElementId(strArrCoordinates);
        lstPaloValues.get(iCurrentPos++).setValue(strArrCoordinates, dValue);
    }

    public void addToValueList(String[] strArrCoordinates, String sValue) {
        strArrCoordinates = replaceStringArrWithElementId(strArrCoordinates);
        lstPaloValues.get(iCurrentPos++).setValue(strArrCoordinates, sValue);
    }

    public int getNumberOfValues() {
        return iCurrentPos;
    }

    public palodatavalue getDataValue(int iPos) {
        return lstPaloValues.get(iPos);
    }

    public void setData(palocube plCube, int SPLASH_MODE, boolean bAddValue, boolean bUseEventProcessor) throws paloexception {

        StringBuilder sbCoordinates = new StringBuilder();
        StringBuilder sbValues = new StringBuilder();
        int iPos = 0;
        for (int i = 0; i < iCurrentPos; i++) {
            // for(palodatavalue plValue : this.lstPaloValues){
            palodatavalue plValue = getDataValue(i);
            if (iPos > 0) {
                sbCoordinates.append(":");
                sbValues.append(":");
            }
            sbCoordinates.append(plValue.getCoordinatesString());
            if (palodatavalue.PALO_NUMERIC == plValue.getType()) {
                sbValues.append(plValue.getDoubleValue());
            } else {
                sbValues.append(plValue.getStringValue());
            }
            iPos++;
        }

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(plCube.getCubeId())));

        qparams.add(new BasicNameValuePair("paths", sbCoordinates.toString()));
        qparams.add(new BasicNameValuePair("values", sbValues.toString()));
        qparams.add(new BasicNameValuePair("add", palohelpers.BooleanToString(bAddValue)));
        qparams.add(new BasicNameValuePair("event_processor", palohelpers.BooleanToString(bUseEventProcessor)));
        qparams.add(new BasicNameValuePair("splash", String.valueOf(SPLASH_MODE)));

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/cell/replace_bulk");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            csv.readNext();
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    private String[] replaceStringArrWithElementId(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            paloelement plElm = alPaloElements.get(i).getElement(strArr[i]);
            if (null == plElm) {
                strArr[i] = "-1";
            } else {
                strArr[i] = String.valueOf(plElm.getElementIdentifier());
            }
        }
        return strArr;
    }

}
