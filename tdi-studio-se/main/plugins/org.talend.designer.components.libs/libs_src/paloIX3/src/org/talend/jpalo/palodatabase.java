package org.talend.jpalo;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

public class palodatabase {

    private paloconnection plConn;

    // OK
    // private native palodimensions JNIgetDimensions(palodatabase paloDatabase, int iDimensionType);
    // private native palocubes JNIgetCubes(palodatabase paloDatabase, int iDimensionType, int iWithCell);

    private String strDatabaseName;

    private long lDatabaseId;

    private int iNumberOfDimensions;

    private int iNumberOfCubes;

    private int iStatus;

    private int iType;

    @SuppressWarnings("unused")
    private String strDatabaseToken;

    public palodatabase(paloconnection plConn, String strDatabaseName, long lDatabaseId, int iNumberOfDimensions,
            int iNumberOfCubes, int iStatus, int iType, String strDatabaseToken) {
        super();
        this.plConn = plConn;
        this.strDatabaseName = strDatabaseName;
        this.lDatabaseId = lDatabaseId;
        this.iNumberOfCubes = iNumberOfCubes;
        this.iNumberOfDimensions = iNumberOfDimensions;
        this.iStatus = iStatus;
        this.iType = iType;
        this.strDatabaseToken = strDatabaseToken;
    }

    public palodimensions getDimensions(int iDimensionType) throws paloexception {
        return new palodimensions(this.plConn, this, iDimensionType);
    }

    public palocubes getCubes(int iCubeType) throws paloexception {
        return new palocubes(this.plConn, this, iCubeType);
        // return getCubes(iCubeType, 0);
    }

    /*
     * public palocubes getCubes(int iCubeType, int iOnlyWithCells){ return JNIgetCubes(this, iCubeType,
     * iOnlyWithCells); }
     */

    public void save() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        plConn.sendToServerSingleRC(qparams, "/database/save");
    }

    public void load() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        plConn.sendToServerSingleRC(qparams, "/database/load");
    }

    public void unload() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        plConn.sendToServerSingleRC(qparams, "/database/unload");
    }

    public void rename(String strNewName) throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("new_name", strNewName));

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/database/rename");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            csv.readNext();

            this.strDatabaseName = csv.get(1);
            this.iNumberOfDimensions = Integer.valueOf(csv.get(2));
            this.iNumberOfCubes = Integer.valueOf(csv.get(3));
            this.iStatus = Integer.valueOf(csv.get(4));
            this.iType = Integer.valueOf(csv.get(5));
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public String getName() {
        return strDatabaseName;
    }

    public long getDatabaseId() {
        return lDatabaseId;
    }

    public int getNumberOfDimensions() {
        return iNumberOfDimensions;
    }

    public int getNumberOfCubes() {
        return iNumberOfCubes;
    }

    public int getStatus() {
        return iStatus;
    }

    public int getType() {
        return iType;
    }

    public void refreshDatabaseInfo() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/database/info");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            csv.readNext();

            this.strDatabaseName = csv.get(1);
            this.iNumberOfDimensions = Integer.valueOf(csv.get(2));
            this.iNumberOfCubes = Integer.valueOf(csv.get(3));
            this.iStatus = Integer.valueOf(csv.get(4));
            this.iType = Integer.valueOf(csv.get(5));
            this.strDatabaseToken = csv.get(6);
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }
}