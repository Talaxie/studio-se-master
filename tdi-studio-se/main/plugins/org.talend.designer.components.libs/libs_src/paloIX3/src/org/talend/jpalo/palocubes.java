package org.talend.jpalo;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

public class palocubes {

    public static final int CUBE_NORMAL = 0;

    public static final int CUBE_SYSTEM = 1;

    public static final int CUBE_ATTRIBUT = 2;

    public static final int CUBE_USER_INFO = 3;

    public static final int CUBE_UNKNOWN = -1;

    public static final int CUBE_STATUS_UNLOADED = 0;

    public static final int CUBE_STATUS_LOADED = 1;

    public static final int CUBE_STATUS_CHANGED = 2;

    public static final int CUBE_STATUS_UNKNOWN = -1;

    private paloconnection plConn;

    private palodatabase plDB;

    private ArrayList<palocube> paloCubes = new ArrayList<palocube>();

    public palocubes(paloconnection plConn, palodatabase plDB, int iCubeType) throws paloexception {

        super();

        this.plConn = plConn;
        this.plDB = plDB;

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.plDB.getDatabaseId())));

        switch (iCubeType) {
        case CUBE_NORMAL:
            qparams.add(new BasicNameValuePair("show_info", "0"));
            qparams.add(new BasicNameValuePair("show_normal", "1"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            break;
        case CUBE_SYSTEM:
            qparams.add(new BasicNameValuePair("show_info", "0"));
            qparams.add(new BasicNameValuePair("show_normal", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_system", "1"));
            break;
        case CUBE_ATTRIBUT:
            qparams.add(new BasicNameValuePair("show_info", "0"));
            qparams.add(new BasicNameValuePair("show_normal", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "1"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            break;
        case CUBE_USER_INFO:
            qparams.add(new BasicNameValuePair("show_info", "1"));
            qparams.add(new BasicNameValuePair("show_normal", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            break;
        case CUBE_UNKNOWN:
            qparams.add(new BasicNameValuePair("show_info", "1"));
            qparams.add(new BasicNameValuePair("show_normal", "1"));
            qparams.add(new BasicNameValuePair("show_attribute", "1"));
            qparams.add(new BasicNameValuePair("show_system", "1"));
            break;
        }

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/database/cubes");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                palocube plCube = new palocube(plConn, plDB.getDatabaseId(), palohelpers.StringToInt(csv.get(0)), csv.get(1),
                        palohelpers.StringToInt(csv.get(2)), palohelpers.StringToIntArray(csv.get(3),
                                palohelpers.StringToInt(csv.get(2))), palohelpers.StringToLong(csv.get(4)),
                        palohelpers.StringToLong(csv.get(5)), palohelpers.StringToInt(csv.get(6)), palohelpers.StringToInt(csv
                                .get(7)), palohelpers.StringToInt(csv.get(8)));

                paloCubes.add(plCube);
            }
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public palocubes(paloconnection plConn, long lDatabaseId, int iCubeType, int iDimensionId) throws paloexception {

        super();

        this.plConn = plConn;

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
        qparams.add(new BasicNameValuePair("dimension", String.valueOf(iDimensionId)));

        switch (iCubeType) {
        case CUBE_NORMAL:
            qparams.add(new BasicNameValuePair("show_info", "0"));
            qparams.add(new BasicNameValuePair("show_normal", "1"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            break;
        case CUBE_SYSTEM:
            qparams.add(new BasicNameValuePair("show_info", "0"));
            qparams.add(new BasicNameValuePair("show_normal", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_system", "1"));
            break;
        case CUBE_ATTRIBUT:
            qparams.add(new BasicNameValuePair("show_info", "0"));
            qparams.add(new BasicNameValuePair("show_normal", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "1"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            break;
        case CUBE_USER_INFO:
            qparams.add(new BasicNameValuePair("show_info", "1"));
            qparams.add(new BasicNameValuePair("show_normal", "0"));
            qparams.add(new BasicNameValuePair("show_attribute", "0"));
            qparams.add(new BasicNameValuePair("show_system", "0"));
            break;
        case CUBE_UNKNOWN:
            qparams.add(new BasicNameValuePair("show_info", "1"));
            qparams.add(new BasicNameValuePair("show_normal", "1"));
            qparams.add(new BasicNameValuePair("show_attribute", "1"));
            qparams.add(new BasicNameValuePair("show_system", "1"));
            break;
        }

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/dimension/cubes");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                palocube plCube = new palocube(plConn, lDatabaseId, palohelpers.StringToInt(csv.get(0)), csv.get(1),
                        palohelpers.StringToInt(csv.get(2)), palohelpers.StringToIntArray(csv.get(3),
                                palohelpers.StringToInt(csv.get(2))), palohelpers.StringToLong(csv.get(4)),
                        palohelpers.StringToLong(csv.get(5)), palohelpers.StringToInt(csv.get(6)), palohelpers.StringToInt(csv
                                .get(7)), palohelpers.StringToInt(csv.get(8)));

                paloCubes.add(plCube);
            }
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public int getNumberOfCubes() {
        return paloCubes.size();
    }

    public palocube getCube(int iIndex) {
        return paloCubes.get(iIndex);
    }

    public ArrayList<palocube> getCubes() {
        return paloCubes;
    }

    public void deleteCube(String strCubeName) throws paloexception {
        palocube paloCubeToRemove = getCube(strCubeName);
        if (null != paloCubeToRemove) {
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(this.plDB.getDatabaseId())));
            qparams.add(new BasicNameValuePair("cube", String.valueOf(paloCubeToRemove.getCubeId())));
            plConn.sendToServerSingleRC(qparams, "/cube/destroy");
            paloCubes.remove(paloCubeToRemove);
        }
    }

    public palocube getCube(String strCubeName) {
        for (palocube paloCube : paloCubes) {
            if (paloCube.getName().equals(strCubeName)) {
                return paloCube;
            }
        }
        return null;
    }

    public palocube getCubeByIdentifier(int iCubeId) {
        for (palocube paloCube : paloCubes) {
            if (paloCube.getCubeId() == iCubeId) {
                return paloCube;
            }
        }
        return null;
    }

    public palocube createCube(String strCubeName, String[] strArrDimensions, int iType) throws paloexception {
        palodimensions plDIMs = plDB.getDimensions(iType);
        StringBuilder sbDimensionsToCreate = new StringBuilder();
        int iPos = 0;
        for (String strDimensionName : strArrDimensions) {
            if (iPos > 0) {
                sbDimensionsToCreate.append(",");
            }
            palodimension plDIM = plDIMs.getDimension(strDimensionName);
            if (null == plDIM) {
                sbDimensionsToCreate.append("-1");
            } else {
                sbDimensionsToCreate.append(plDIMs.getDimension(strDimensionName).getDimensionId());
            }
            iPos++;
        }

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.plDB.getDatabaseId())));
        qparams.add(new BasicNameValuePair("new_name", strCubeName));
        qparams.add(new BasicNameValuePair("type", String.valueOf(iType)));
        qparams.add(new BasicNameValuePair("dimensions", sbDimensionsToCreate.toString()));

        try {
            palocube plCube = null;
            HttpEntity entity = this.plConn.sendToServer(qparams, "/cube/create");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                // System.out.println(csv.getRawRecord());
                plCube = new palocube(plConn, plDB.getDatabaseId(), palohelpers.StringToInt(csv.get(0)), csv.get(1),
                        palohelpers.StringToInt(csv.get(2)), palohelpers.StringToIntArray(csv.get(3),
                                palohelpers.StringToInt(csv.get(2))), palohelpers.StringToLong(csv.get(4)),
                        palohelpers.StringToLong(csv.get(5)), palohelpers.StringToInt(csv.get(6)), palohelpers.StringToInt(csv
                                .get(7)), palohelpers.StringToInt(csv.get(8)));

                paloCubes.add(plCube);
            }
            csv.close();
            entity.consumeContent();
            return plCube;
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }
}
