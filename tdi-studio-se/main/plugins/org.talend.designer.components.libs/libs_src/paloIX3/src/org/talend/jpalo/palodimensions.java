package org.talend.jpalo;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

public class palodimensions {

    public static final int DIMENSION_UNKNOWN = -1;

    public static final int DIMENSION_NORMAL = 0;

    public static final int DIMENSION_SYSTEM = 1;

    public static final int DIMENSION_ATTRIBUTE = 2;

    public static final int DIMENSION_USER_INFO = 3;

    private ArrayList<palodimension> paloDimensions = new ArrayList<palodimension>();

    private paloconnection plConn;

    private palodatabase plDB;

    private String strDatabaseName;

    private String strCubeName;

    public palodimensions(paloconnection plConn, palodatabase plDB, int iDimensionType) throws paloexception {
        super();

        this.plConn = plConn;
        this.plDB = plDB;

        strDatabaseName = plDB.getName();

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.plDB.getDatabaseId())));

        switch (iDimensionType) {
        case DIMENSION_NORMAL:
            qparams.add(new BasicNameValuePair("show_normal", "1"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_info", "0"));
            break;
        case DIMENSION_SYSTEM:
            qparams.add(new BasicNameValuePair("show_normal", "0"));
            qparams.add(new BasicNameValuePair("show_system", "1"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_info", "0"));
            break;
        case DIMENSION_ATTRIBUTE:
            qparams.add(new BasicNameValuePair("show_normal", "1"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "1"));
            qparams.add(new BasicNameValuePair("show_info", "0"));
            break;
        case DIMENSION_USER_INFO:
            qparams.add(new BasicNameValuePair("show_normal", "0"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_info", "1"));
            break;
        case DIMENSION_UNKNOWN:
            qparams.add(new BasicNameValuePair("show_normal", "1"));
            qparams.add(new BasicNameValuePair("show_system", "1"));
            qparams.add(new BasicNameValuePair("show_attribute", "1"));
            qparams.add(new BasicNameValuePair("show_info", "1"));
            break;
        }

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/database/dimensions");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                paloDimensions.add(new palodimension(this.plConn, this.plDB.getDatabaseId(), csv.get(1), Integer.valueOf(csv
                        .get(0)), palohelpers.StringToInt(csv.get(7)), palohelpers.StringToInt(csv.get(8)), palohelpers
                        .StringToInt(csv.get(9)), palohelpers.StringToInt(csv.get(2)), palohelpers.StringToInt(csv.get(3)),
                        palohelpers.StringToInt(csv.get(4)), palohelpers.StringToInt(csv.get(5)), palohelpers.StringToInt(csv
                                .get(10))));
            }
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public palodimensions(paloconnection plConn, long lDatabaseId, int iDimensionType, int[] iArrDimensionsIdentifier)
            throws paloexception {

        super();

        this.plConn = plConn;

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));

        switch (iDimensionType) {
        case DIMENSION_NORMAL:
            qparams.add(new BasicNameValuePair("show_normal", "1"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_info", "0"));
            break;
        case DIMENSION_SYSTEM:
            qparams.add(new BasicNameValuePair("show_normal", "0"));
            qparams.add(new BasicNameValuePair("show_system", "1"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_info", "0"));
            break;
        case DIMENSION_ATTRIBUTE:
            qparams.add(new BasicNameValuePair("show_normal", "1"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "1"));
            qparams.add(new BasicNameValuePair("show_info", "0"));
            break;
        case DIMENSION_USER_INFO:
            qparams.add(new BasicNameValuePair("show_normal", "0"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_info", "1"));
            break;
        case DIMENSION_UNKNOWN:
            qparams.add(new BasicNameValuePair("show_normal", "1"));
            qparams.add(new BasicNameValuePair("show_system", "1"));
            qparams.add(new BasicNameValuePair("show_attribute", "1"));
            qparams.add(new BasicNameValuePair("show_info", "1"));
            break;
        }

        try {

            ArrayList<palodimension> paloDimensionsCube = new ArrayList<palodimension>();

            HttpEntity entity = this.plConn.sendToServer(qparams, "/database/dimensions");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                paloDimensionsCube.add(new palodimension(this.plConn, lDatabaseId, csv.get(1), Integer.valueOf(csv.get(0)),
                        palohelpers.StringToInt(csv.get(7)), palohelpers.StringToInt(csv.get(8)), palohelpers.StringToInt(csv
                                .get(9)), palohelpers.StringToInt(csv.get(2)), palohelpers.StringToInt(csv.get(3)), palohelpers
                                .StringToInt(csv.get(4)), palohelpers.StringToInt(csv.get(5)), palohelpers.StringToInt(csv
                                .get(10))));
            }
            csv.close();
            entity.consumeContent();

            for (int element : iArrDimensionsIdentifier) {
                for (palodimension plDimCube : paloDimensionsCube) {
                    if (plDimCube.getDimensionId() == element) {
                        paloDimensions.add(plDimCube);
                    }
                }
            }

        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public palodimension createDimension(String strDimensionName, int iType) throws paloexception {

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.plDB.getDatabaseId())));
        qparams.add(new BasicNameValuePair("new_name", strDimensionName));
        qparams.add(new BasicNameValuePair("type", String.valueOf(iType)));

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/dimension/create");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            csv.readNext();
            palodimension plDim = new palodimension(this.plConn, this.plDB.getDatabaseId(), csv.get(1),
                    palohelpers.StringToInt(csv.get(0)), palohelpers.StringToInt(csv.get(7)),
                    palohelpers.StringToInt(csv.get(8)), palohelpers.StringToInt(csv.get(9)),
                    palohelpers.StringToInt(csv.get(2)), palohelpers.StringToInt(csv.get(3)),
                    palohelpers.StringToInt(csv.get(4)), palohelpers.StringToInt(csv.get(5)),
                    palohelpers.StringToInt(csv.get(10)));
            paloDimensions.add(plDim);
            csv.close();
            entity.consumeContent();
            return plDim;
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public palodimension createDimension(String strDimensionName) throws paloexception {
        return createDimension(strDimensionName, palodimensions.DIMENSION_NORMAL);
    }

    public ArrayList<palodimension> getDimensions() {
        return paloDimensions;
    }

    public String getDatabaseName() {
        return strDatabaseName;
    }

    public String getCubeName() {
        return strCubeName;
    }

    public int getNumberOfDimensions() {
        return paloDimensions.size();
    }

    public palodimension getDimension(int iIndex) {
        return paloDimensions.get(iIndex);
    }

    public palodimension getDimension(String strDimensionName) {
        for (palodimension palodim : paloDimensions) {
            if (palodim.getName().equals(strDimensionName)) {
                return palodim;
            }
        }
        return null;
    }

    public palodimension getDimensionByIdentifier(int iDimensionId) {
        for (palodimension palodim : paloDimensions) {
            if (palodim.getDimensionId() == iDimensionId) {
                return palodim;
            }
        }
        return null;
    }

    public void deleteDimension(String strDimensionName) throws paloexception {
        palodimension paloDimToRemove = getDimension(strDimensionName);
        if (null != paloDimToRemove) {
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(plDB.getDatabaseId())));
            qparams.add(new BasicNameValuePair("dimension", String.valueOf(paloDimToRemove.getDimensionId())));
            plConn.sendToServerSingleRC(qparams, "/dimension/destroy");
            paloDimensions.remove(paloDimToRemove);
        }
    }

}
