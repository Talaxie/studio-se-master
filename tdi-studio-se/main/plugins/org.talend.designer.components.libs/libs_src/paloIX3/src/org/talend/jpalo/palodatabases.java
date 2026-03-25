package org.talend.jpalo;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

public class palodatabases {

    private paloconnection plConn;

    // OK
    public static final int DATABASE_TYPE_NORMAL = 0;

    public static final int DATABASE_TYPE_SYSTEM_ = 1;

    public static final int DATABASE_TYPE_UNKNOWN = -1;

    public static final int DATABASE_STATUS_UNLOADED = 0;

    public static final int DATABASE_STATUS_LOADED = 1;

    public static final int DATABASE_STATUS_CHANGED = 2;

    public static final int DATABASE_STATUS_LOADING = 3;

    public static final int DATABASE_STATUS_UNKNOWN = -1;

    private ArrayList<palodatabase> paloDatabases = new ArrayList<palodatabase>();

    public palodatabases(paloconnection plConn) throws paloexception {
        super();

        this.plConn = plConn;
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("show_normal", "1"));
        qparams.add(new BasicNameValuePair("show_system", "1"));

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/server/databases");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                paloDatabases.add(new palodatabase(this.plConn, csv.get(1), Long.parseLong(csv.get(0)), Integer.valueOf(csv
                        .get(2)), Integer.valueOf(csv.get(3)), Integer.valueOf(csv.get(4)), Integer.valueOf(csv.get(5)), csv
                        .get(6)));
                // System.out.println(csv.getRawRecord());
            }
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public palodatabase createDatabase(String strDatabaseName) throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("new_name", strDatabaseName));

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/database/create");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            csv.readNext();
            palodatabase plDB = new palodatabase(this.plConn, csv.get(1), Long.parseLong(csv.get(0)),
                    Integer.valueOf(csv.get(2)), Integer.valueOf(csv.get(3)), Integer.valueOf(csv.get(4)), Integer.valueOf(csv
                            .get(5)), "");
            csv.close();
            entity.consumeContent();
            plDB.refreshDatabaseInfo();
            paloDatabases.add(plDB);
            return plDB;
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public void deleteDatabase(String strDatabaseName) throws paloexception {
        palodatabase paloDBToRemove = getDatabase(strDatabaseName);
        if (null != paloDBToRemove) {
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(paloDBToRemove.getDatabaseId())));
            plConn.sendToServerSingleRC(qparams, "/database/destroy");
            paloDatabases.remove(paloDBToRemove);
        }
    }

    public int getNumberOfDatabases() {
        return paloDatabases.size();
    }

    public palodatabase getDatabase(int iIndex) {
        return paloDatabases.get(iIndex);
    }

    public ArrayList<palodatabase> getDatabases() {
        return paloDatabases;
    }

    public palodatabase getDatabase(String strDatabaseName) {
        for (palodatabase palodb : paloDatabases) {
            if (palodb.getName().equals(strDatabaseName)) {
                return palodb;
            }
        }
        return null;
    }

}
