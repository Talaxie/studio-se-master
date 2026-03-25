package org.talend.jpalo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

public class palodimension {

    private paloelements paloElements;

    private paloconnection plConn;

    private long lDatabaseId;

    @SuppressWarnings("unused")
    private String strCubeName;

    private String strDimensionName;

    private int iDimensionId;

    @SuppressWarnings("unused")
    private int iAssocDimension;

    private int iAttributCube;

    private int iRightsCube;

    private int iNumberOfElements;

    private int iMaximumLevel;

    private int iMaximumIndent;

    private int iMaximumDepth;

    @SuppressWarnings("unused")
    private int iDimensionToken;

    private int iDimensionType;

    public palodimension(paloconnection plConn, long lDatabaseId, String strDimensionName, int iDimensionId, int iAssocDimension,
            int iAttributCube, int iRightsCube, int iNumberOfElements, int iMaximumLevel, int iMaximumIndent, int iMaximumDepth,
            int iDimensionToken) {
        super();
        this.plConn = plConn;
        this.lDatabaseId = lDatabaseId;
        this.strDimensionName = strDimensionName;
        this.iDimensionId = iDimensionId;
        this.iAssocDimension = iAssocDimension;
        this.iAttributCube = iAttributCube;
        this.iRightsCube = iRightsCube;
        this.iNumberOfElements = iNumberOfElements;
        this.iMaximumLevel = iMaximumLevel;
        this.iMaximumIndent = iMaximumIndent;
        this.iMaximumDepth = iMaximumDepth;
        this.iDimensionToken = iDimensionToken;
    }

    public paloelements getElements(boolean bRefresh) throws paloexception {
        if (null == paloElements || bRefresh) {
            paloElements = new paloelements(plConn, this.lDatabaseId, this.iDimensionId);
        }
        return paloElements;
    }

    public paloelements getElements() throws paloexception {
        paloElements = new paloelements(plConn, this.lDatabaseId, this.iDimensionId);
        // return new paloelements(plConn, this.lDatabaseId, this.iDimensionId);
        return paloElements;
    }

    public paloelements getElements(HashSet<String> hsFilteredElements) throws paloexception {
        return new paloelements(plConn, this.lDatabaseId, this.iDimensionId, hsFilteredElements);
    }

    public String getName() {
        return strDimensionName;
    }

    public int getDimensionId() {
        return iDimensionId;
    }

    public String getAssocDimension() {

        return "";// return iAssocDimension;
    }

    public String getAttributCube() throws paloexception {
        try {
            palocubes plCubes = getCubes(palocubes.CUBE_ATTRIBUT);
            if (plCubes != null && this.iAttributCube > 1) {
                palocube plAttributeCube = plCubes.getCubeByIdentifier(this.iAttributCube);
                if (plAttributeCube != null) {
                    return plAttributeCube.getName();
                }
            }
        } catch (Exception e) {
        }
        return "";
    }

    public String getRightsCube() {
        try {
            palocubes plCubes = getCubes(palocubes.CUBE_SYSTEM);
            if (plCubes != null && this.iRightsCube > 1) {
                palocube plAttributeCube = plCubes.getCubeByIdentifier(this.iRightsCube);
                if (plAttributeCube != null) {
                    return plAttributeCube.getName();
                }
            }
        } catch (Exception e) {
        }
        return "";
    }

    public int getNumberOfElements() {
        return iNumberOfElements;
    }

    public int getMaximumLevel() {
        return iMaximumLevel;
    }

    public int getMaximumIndent() {
        return iMaximumIndent;
    }

    public int getMaximumDepth() {
        return iMaximumDepth;
    }

    public int getDimensionType() {
        return iDimensionType;
    }

    public void rename(String strDimensionNewName) throws paloexception {
        if (null != strDimensionNewName && strDimensionNewName.length() > 0 && !strDimensionName.equals(strDimensionNewName)) {
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
            qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));
            qparams.add(new BasicNameValuePair("new_name", strDimensionNewName));

            try {
                HttpEntity entity = this.plConn.sendToServer(qparams, "/dimension/rename");
                CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
                csv.setQuoteChar('"');
                csv.readNext();
                this.strDimensionName = csv.get(1);
                csv.close();
                entity.consumeContent();
            } catch (Exception e) {
                throw new paloexception(e.getMessage());
            }
        }
    }

    public palocubes getCubes() throws paloexception {
        return new palocubes(this.plConn, this.lDatabaseId, this.iDimensionType, this.iDimensionId);
    }

    public palocubes getCubes(int iCubeType) throws paloexception {
        return new palocubes(this.plConn, this.lDatabaseId, iCubeType, this.iDimensionId);
    }

    public void clear() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
        qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/dimension/clear");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            csv.readNext();
            this.strDimensionName = csv.get(1);
            this.iDimensionId = Integer.valueOf(csv.get(0));
            this.iAssocDimension = palohelpers.StringToInt(csv.get(7));
            this.iAttributCube = palohelpers.StringToInt(csv.get(8));
            this.iRightsCube = palohelpers.StringToInt(csv.get(9));
            this.iNumberOfElements = palohelpers.StringToInt(csv.get(2));
            this.iMaximumLevel = palohelpers.StringToInt(csv.get(3));
            this.iMaximumIndent = palohelpers.StringToInt(csv.get(4));
            this.iMaximumDepth = palohelpers.StringToInt(csv.get(5));
            this.iDimensionToken = palohelpers.StringToInt(csv.get(10));
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public void refreshDimensionInfo() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
        qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/dimension/info");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            csv.readNext();
            this.strDimensionName = csv.get(1);
            this.iDimensionId = Integer.valueOf(csv.get(0));
            this.iAssocDimension = palohelpers.StringToInt(csv.get(7));
            this.iAttributCube = palohelpers.StringToInt(csv.get(8));
            this.iRightsCube = palohelpers.StringToInt(csv.get(9));
            this.iNumberOfElements = palohelpers.StringToInt(csv.get(2));
            this.iMaximumLevel = palohelpers.StringToInt(csv.get(3));
            this.iMaximumIndent = palohelpers.StringToInt(csv.get(4));
            this.iMaximumDepth = palohelpers.StringToInt(csv.get(5));
            this.iDimensionToken = palohelpers.StringToInt(csv.get(10));
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }
}
