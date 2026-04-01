package org.talend.jpalo;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

public class palocube {

    // OK

    // @SuppressWarnings("unused")
    // private ArrayList<palocubelock> paloCubelocks = new ArrayList<palocubelock>();

    private paloconnection plConn;

    private long lDatabaseId;

    private int iCubeId;

    private String strCubeName;

    private int iNumberOfDimensions;

    private int[] iArrDimensionsIdentifier;

    private long iNumberOfCells;

    private long lNumberOfFilledCells;

    private int iCubeStatus;

    private int iCubeType;

    @SuppressWarnings("unused")
    private int iCubeToken;

    public palocube(paloconnection plConn, long lDatabaseId, int iCubeId, // 0 cube identifier Identifier of the cube
            String strCubeName, // 1 name_cube string Name of the cube
            int iNumberOfDimensions, // 2 number_dimensions integer Number of dimensions
            int[] iArrDimensionsIdentifier, // 3 dimensions integer Comma separate list of dimension identifiers
            long lNumberOfCells, // 4 number_cells integer Total number of cells
            long lNumberOfFilledCells,// 5 number_filled_cells integer Number of filled numeric base cells plus number
                                      // of filled string cells
            int iCubeStatus, // 6 status integer Status of cube (0=unloaded, 1=loaded and 2=changed)
            int iCubeType, // 7 type integer Type of cube (0=normal, 1=system, 2=attribute, 3=user info)
            int strCubeToken// 8 cube_token integer The cube token of the cube
    ) {
        super();

        this.plConn = plConn;
        this.lDatabaseId = lDatabaseId;

        this.iCubeId = iCubeId;
        this.strCubeName = strCubeName;
        this.iNumberOfDimensions = iNumberOfDimensions;
        this.iArrDimensionsIdentifier = iArrDimensionsIdentifier;
        this.iNumberOfCells = lNumberOfCells;
        this.lNumberOfFilledCells = lNumberOfFilledCells;
        this.iCubeStatus = iCubeStatus;
        this.iCubeType = iCubeType;
        this.iCubeToken = strCubeToken;
    }

    public String getName() {
        return strCubeName;
    }

    public String getDatabaseName() {
        return "";// strDatabaseName;
    }

    public void rename(String strCubeNewName) throws paloexception {
        if (null != strCubeNewName && strCubeNewName.length() > 0 && !strCubeName.equals(strCubeNewName)) {
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
            qparams.add(new BasicNameValuePair("cube", String.valueOf(iCubeId)));
            qparams.add(new BasicNameValuePair("new_name", strCubeNewName));

            try {
                HttpEntity entity = this.plConn.sendToServer(qparams, "/cube/rename");
                CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
                csv.setQuoteChar('"');
                csv.readNext();
                this.strCubeName = csv.get(1);
                csv.close();
                entity.consumeContent();
            } catch (Exception e) {
                throw new paloexception(e.getMessage());
            }
        }
    }

    public int getCubeId() {
        return iCubeId;
    }

    public int getNumberOfDimensions() {
        return iNumberOfDimensions;
    }

    public long getNumberOfCells() {
        return iNumberOfCells;
    }

    public long getNumberOfFilledCells() {
        return lNumberOfFilledCells;
    }

    public int getCubeStatus() {
        return iCubeStatus;
    }

    public int getCubeType() {
        return iCubeType;
    }

    public void save() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(this.iCubeId)));
        plConn.sendToServerSingleRC(qparams, "/cube/save");
    }

    public void load() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(this.iCubeId)));
        plConn.sendToServerSingleRC(qparams, "/cube/load");
    }

    public void unload() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(this.iCubeId)));
        plConn.sendToServerSingleRC(qparams, "/cube/unload");
    }

    public void refreshCubeInfo() throws paloexception {

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(iCubeId)));
        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/cube/info");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            csv.readNext();

            this.iCubeId = palohelpers.StringToInt(csv.get(0));
            this.strCubeName = csv.get(1);
            this.iNumberOfDimensions = palohelpers.StringToInt(csv.get(2));
            this.iArrDimensionsIdentifier = palohelpers.StringToIntArray(csv.get(3), palohelpers.StringToInt(csv.get(2)));
            this.iNumberOfCells = palohelpers.StringToLong(csv.get(4));
            this.lNumberOfFilledCells = palohelpers.StringToLong(csv.get(5));
            this.iCubeStatus = palohelpers.StringToInt(csv.get(6));
            this.iCubeType = palohelpers.StringToInt(csv.get(7));
            this.iCubeToken = palohelpers.StringToInt(csv.get(8));

            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public void clear() throws paloexception {
        clear(null);
    }

    public void clear(String strArrArea) throws paloexception {

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(iCubeId)));

        if (strArrArea == null) {
            qparams.add(new BasicNameValuePair("complete", "1"));
        } else {
            // qparams.add(new BasicNameValuePair("complete", "0"));
            qparams.add(new BasicNameValuePair("area", strArrArea));
        }

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/cube/clear");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            csv.readNext();

            this.iCubeId = palohelpers.StringToInt(csv.get(0));
            this.strCubeName = csv.get(1);
            this.iNumberOfDimensions = palohelpers.StringToInt(csv.get(2));
            this.iArrDimensionsIdentifier = palohelpers.StringToIntArray(csv.get(3), palohelpers.StringToInt(csv.get(2)));
            this.iNumberOfCells = palohelpers.StringToLong(csv.get(4));
            this.lNumberOfFilledCells = palohelpers.StringToLong(csv.get(5));
            this.iCubeStatus = palohelpers.StringToInt(csv.get(6));
            this.iCubeType = palohelpers.StringToInt(csv.get(7));
            this.iCubeToken = palohelpers.StringToInt(csv.get(8));

            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public palorules getCubeRules() throws paloexception {
        return new palorules(this.plConn, this.lDatabaseId, this.iCubeId);
    }

    public palodimensions getDimensions() throws paloexception {
        return new palodimensions(this.plConn, this.lDatabaseId, this.iCubeType, this.iArrDimensionsIdentifier);
    }

}
