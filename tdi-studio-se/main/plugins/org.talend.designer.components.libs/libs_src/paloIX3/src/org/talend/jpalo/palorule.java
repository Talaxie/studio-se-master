package org.talend.jpalo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

public class palorule {

    private paloconnection plConn;

    private long lDatabaseId;

    private int iCubeId;

    private int lIdentifier;

    private String strDefinition;

    private String strExtern_Id;

    private String strComment;

    private long lTimeStamp;

    private boolean bActivated;

    public palorule(paloconnection plConn, long lDatabaseId, int iCubeId, int lIdentifier, // 0 rule identifier
                                                                                           // Identifier of the rule
            String strDefinition,// 1 rule_string string Textual representation for the rule
            String strExtern_Id,// 2 external_identifier string external identifier of the rule
            String strComment, // 3 comment string comment for the rule
            long lTimeStamp, // 4 timestamp string creation time of the rule in seconds since 1970-01-01
            boolean bActivated // 5 active integer 0=rule is not active, 1=rule is active
    ) {
        super();
        this.plConn = plConn;
        this.lDatabaseId = lDatabaseId;
        this.iCubeId = iCubeId;
        this.lIdentifier = lIdentifier;
        this.strDefinition = strDefinition;
        this.strExtern_Id = strExtern_Id;
        this.strComment = strComment;
        this.lTimeStamp = lTimeStamp;
        this.bActivated = bActivated;

    }

    public long getIdentifier() {
        return lIdentifier;
    }

    public String getDefinition() {
        return strDefinition;
    }

    public void setDefinition(String strDefinition) {
        this.strDefinition = strDefinition;
    }

    public String getExtern_Id() {
        return strExtern_Id;
    }

    public void setExtern_Id(String strExtern_Id) {
        this.strExtern_Id = strExtern_Id;
    }

    public String getComment() {
        return strComment;
    }

    public void setComment(String strComment) {
        this.strComment = strComment;
    }

    public long getTimeStamp() {
        return lTimeStamp;
    }

    public Date getModificationData() {
        return palohelpers.getCalcDateBegin((int) lTimeStamp);
    }

    public boolean getActivated() {
        return bActivated;
    }

    public void setActivated(boolean bActivated) {
        this.bActivated = bActivated;
    }

    public void refreshRuleInfo() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(this.iCubeId)));
        qparams.add(new BasicNameValuePair("rule", String.valueOf(this.lIdentifier)));
        qparams.add(new BasicNameValuePair("use_identifier", palohelpers.BooleanToString(false)));

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/rule/info");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                lIdentifier = palohelpers.StringToInt(csv.get(0));
                strDefinition = csv.get(1);
                strExtern_Id = csv.get(2);
                strComment = csv.get(3);
                lTimeStamp = palohelpers.StringToLong(csv.get(4));
                bActivated = palohelpers.StringToBoolean(csv.get(5));
            }
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public void modifyRule() throws paloexception {

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("cube", String.valueOf(this.iCubeId)));
        qparams.add(new BasicNameValuePair("rule", String.valueOf(this.lIdentifier)));
        qparams.add(new BasicNameValuePair("definition", strDefinition));
        qparams.add(new BasicNameValuePair("activate", palohelpers.BooleanToString(this.bActivated)));
        qparams.add(new BasicNameValuePair("external_identifier", strExtern_Id));
        qparams.add(new BasicNameValuePair("comment", strComment));
        qparams.add(new BasicNameValuePair("use_identifier", palohelpers.BooleanToString(false)));

        try {
            HttpEntity entity = this.plConn.sendToServer(qparams, "/rule/modify");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                lIdentifier = palohelpers.StringToInt(csv.get(0));
                strDefinition = csv.get(1);
                strExtern_Id = csv.get(2);
                strComment = csv.get(3);
                lTimeStamp = palohelpers.StringToLong(csv.get(4));
                bActivated = palohelpers.StringToBoolean(csv.get(5));
            }
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

}
