package org.talend.jpalo;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

public class palorules {

    public static final int RULES_TEXT = 0;

    public static final int RULES_NUMERIC = 1;

    private ArrayList<palorule> paloRules = new ArrayList<palorule>();

    private paloconnection plConn;

    private long lDatabaseId;

    private int iCubeId;

    private String strRuleParseResult;

    public palorules(paloconnection plConn, long lDatabaseId, int iCubeId) throws paloexception {
        super();
        this.plConn = plConn;
        this.lDatabaseId = lDatabaseId;
        this.iCubeId = iCubeId;

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(this.iCubeId)));
        qparams.add(new BasicNameValuePair("use_identifier", "0"));
        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/cube/rules");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                // System.out.println(csv.getRawRecord());
                paloRules.add(new palorule(plConn, lDatabaseId, iCubeId, palohelpers.StringToInt(csv.get(0)), csv.get(1), csv
                        .get(2), csv.get(3), palohelpers.StringToLong(csv.get(4)), palohelpers.StringToBoolean(csv.get(5))));
            }
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }

    }

    public int getNumberOfRules() {
        return paloRules.size();
    }

    // Returns the Rule at the given Position
    public palorule getRule(int iIndex) {
        return paloRules.get(iIndex);
    }

    // Returns the Rule with the given Identifier
    public palorule getRule(long lIdentifier) {
        for (palorule paloRule : paloRules) {
            if (paloRule.getIdentifier() == lIdentifier) {
                return paloRule;
            }
        }
        return null;
    }

    // Returns the Rule with the given Extern_Id
    public palorule getRule(String strExtern_Id) {
        for (palorule paloRule : paloRules) {
            if (paloRule.getExtern_Id().equals(strExtern_Id)) {
                return paloRule;
            }
        }
        return null;
    }

    public ArrayList<palorule> getRules() {
        return paloRules;
    }

    // Deletes the Rule at the given position
    public void deleteRule(int iIndex) throws paloexception {
        palorule paloRuleToRemove = getRule(iIndex);
        if (null != paloRuleToRemove) {
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
            qparams.add(new BasicNameValuePair("cube", String.valueOf(this.iCubeId)));
            qparams.add(new BasicNameValuePair("rule", String.valueOf(paloRuleToRemove.getIdentifier())));
            plConn.sendToServerSingleRC(qparams, "/rule/destroy");
            paloRules.remove(paloRuleToRemove);
        }
    }

    // Deletes the Rule with given Identifier
    public void deleteRule(long lIdentifier) throws paloexception {
        palorule paloRuleToRemove = getRule(lIdentifier);
        if (null != paloRuleToRemove) {
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
            qparams.add(new BasicNameValuePair("cube", String.valueOf(this.iCubeId)));
            qparams.add(new BasicNameValuePair("rule", String.valueOf(paloRuleToRemove.getIdentifier())));
            plConn.sendToServerSingleRC(qparams, "/rule/destroy");
            paloRules.remove(paloRuleToRemove);
        }
    }

    // Deletes the Rule with given External_Id
    public void deleteRule(String strExtern_Id) throws paloexception {
        palorule paloRuleToRemove = getRule(strExtern_Id);
        if (null != paloRuleToRemove) {
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
            qparams.add(new BasicNameValuePair("cube", String.valueOf(this.iCubeId)));
            qparams.add(new BasicNameValuePair("rule", String.valueOf(paloRuleToRemove.getIdentifier())));
            plConn.sendToServerSingleRC(qparams, "/rule/destroy");
            paloRules.remove(paloRuleToRemove);
        }
    }

    public String parseRule(String strRuleToParse) throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(this.iCubeId)));
        qparams.add(new BasicNameValuePair("definition", strRuleToParse));
        try {
            StringBuilder sb = new StringBuilder();
            HttpEntity entity = this.plConn.sendToServer(qparams, "/rule/parse");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                sb.append(csv.get(0));
            }
            csv.close();
            entity.consumeContent();
            return sb.toString();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public String getParseRuleResult() {
        return strRuleParseResult;
    }

    /**
     * Adds a rule to the given cube
     * 
     * 
     * @param The rule definition
     * @param Identifier flag
     * @param An external Id
     * @param The comment for this rule
     * @param Acitvation flag
     * @return The added palorule
     */
    public palorule addRule(String strRuleDefinition, boolean bUseIdentifier, String strExtern_Id, String strComment,
            boolean bActivate) throws paloexception {
        palorule plRule = null;
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(this.iCubeId)));
        qparams.add(new BasicNameValuePair("definition", strRuleDefinition));
        qparams.add(new BasicNameValuePair("activate", palohelpers.BooleanToString(bActivate)));
        qparams.add(new BasicNameValuePair("external_identifier", strExtern_Id));
        qparams.add(new BasicNameValuePair("comment", strComment));
        qparams.add(new BasicNameValuePair("use_identifier", palohelpers.BooleanToString(bUseIdentifier)));

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/rule/create");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                // System.out.println(csv.getRawRecord());
                plRule = new palorule(plConn, lDatabaseId, iCubeId, palohelpers.StringToInt(csv.get(0)), csv.get(1), csv.get(2),
                        csv.get(3), palohelpers.StringToLong(csv.get(4)), palohelpers.StringToBoolean(csv.get(5)));
                paloRules.add(plRule);
            }
            csv.close();
            entity.consumeContent();
            return plRule;
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public static void main(String args[]) throws Exception {
        paloconnection pcon = new paloconnection("admin", "admin", "localhost", "7777");
        palodatabases pds = new palodatabases(pcon);
        palodatabase pd = pds.createDatabase("PaloRuleTest");
        palodimensions pdims = pd.getDimensions(0);
        palodimension pdim = null;
        palodimension pdim1 = null;
        pdim = pdims.getDimension("Monat");
        if (pdim == null) {
            pdim = pdims.createDimension("Monat");
        }
        pdim1 = pdims.getDimension("D2");
        if (pdim1 == null) {
            pdim = pdims.createDimension("D2");
        }
        palocubes pcs = new palocubes(pcon, pd, 0);
        if (pcs.getCube("cube1") == null) {
            pcs.createCube("cube1", new String[] { "Monat", "D2" }, 0);
        }
        palorules pll = new palorules(pcon, pd.getDatabaseId(), pcs.getCube("cube1").getCubeId());
    }
}
