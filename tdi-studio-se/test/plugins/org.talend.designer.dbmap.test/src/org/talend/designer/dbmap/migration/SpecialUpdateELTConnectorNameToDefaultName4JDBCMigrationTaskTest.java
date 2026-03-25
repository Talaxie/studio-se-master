package org.talend.designer.dbmap.migration;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.talend.commons.exception.BusinessException;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;

public class SpecialUpdateELTConnectorNameToDefaultName4JDBCMigrationTaskTest {

    ProcessType processType = null;

    ProcessItem processItem = null;
    

    @Before
    public void testBefore() throws PersistenceException {
        processItem = PropertiesFactory.eINSTANCE.createProcessItem();
        String[] paramDefault = new String[] { "JDBC_EXT_CN_Schema", "JDBC_WFAN_CN_Schema" };
        ContextType devGroup = createContextType("Default", paramDefault);
        processType = TalendFileFactory.eINSTANCE.createProcessType();
        processItem.setProcess(processType);
        processType.setDefaultContext("Default");
        processType.getContext().add(devGroup);
    }

    @After
    public void testAfter() throws PersistenceException, BusinessException {
        processType = null;
        processItem = null;
    }
    
    @Test
    public void testReplaceVariablesForExpression() {
        SpecialUpdateELTConnectorNameToDefaultName4JDBCMigrationTask mt =
                new SpecialUpdateELTConnectorNameToDefaultName4JDBCMigrationTask();
        String testSql = "(SELECT DISTINCT EMP_SKEY,DATE_SKEY FROM \n" + "(SELECT DISTINCT\n" + "DE.EMP_SKEY,\n"
                + "DD.DATE_SKEY\n" + "FROM context.JDBC_EXT_CN_Schema.WRK_TIMESHEETITEM TI1\n"
                + "  LEFT OUTER JOIN context.JDBC_EXT_CN_Schema.WRK_TIMESHEETITEMTRC TR ON (TI1.TIMESHEETITEMID = TR.ASSOCTIMESHEETID)    \n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_DATE DD   ON DD.DATE_DAT = TI1.EVENTDTM\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_EMP DE    ON DE.EMP_ID = TI1.EMPLOYEEID\n"
                + "  WHERE (TR.ENTEREDONDTM > {ts'\"+((String)globalMap.get(\"EXT_MAX_UPDATEDTM\"))+\"'} OR TI1.UPDATEDTM > {ts'\"+((String)globalMap.get(\"EXT_MAX_UPDATEDTM\"))+\"'})\n"
                + "AND  DD.DATE_DAT >= {d '\" + ((String)globalMap.get(\"HST_LOAD_START_DAT\"))+ \"'}\n"
                + "  UNION ALL\n" + "SELECT DISTINCT\n" + "DE.EMP_SKEY,\n" + "DD.DATE_SKEY\n"
                + "FROM context.JDBC_EXT_CN_Schema.WRK_PUNCHEVENT PU1\n"
                + "LEFT OUTER JOIN  context.JDBC_EXT_CN_Schema.WRK_PUNCHEVENTTRC PT ON (PT.ASSOCPUNCHEVENTID  = PU1.PUNCHEVENTID)\n"
                + "LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_DATE DD ON DD.DATE_DAT = PU1.PUNCH_DATE\n"
                + "LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_EMP DE  ON DE.EMP_ID = PU1.EMPLOYEEID\n"
                + "WHERE (PT.ENTEREDONDTM > {ts'\"+((String)globalMap.get(\"EXT_MAX_UPDATEDTM\"))+\"'} OR PU1.UPDATEDTM > {ts'\"+((String)globalMap.get(\"EXT_MAX_UPDATEDTM\"))+\"'})\n"
                + "AND  DD.DATE_DAT >= {d '\" + ((String)globalMap.get(\"HST_LOAD_START_DAT\"))+ \"'}\n" + "UNION ALL\n"
                + "SELECT DISTINCT\n" + "DE.EMP_SKEY,\n" + "DD.DATE_SKEY\n"
                + "FROM context.JDBC_EXT_CN_Schema.WRK_WFCAUDIT WA\n"
                + "LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_DATE DD ON (DD.DATE_DAT >= COALESCE(WA.TODTM,WA.AUDITDTM)-1 AND DD.DATE_DAT < COALESCE(WA.TODTM,WA.AUDITDTM))\n"
                + "LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_EMP DE  ON DE.EMP_ID = WA.EMPLOYEEID\n"
                + "WHERE (WA.ENTEREDONDTM > {ts'\"+((String)globalMap.get(\"EXT_MAX_UPDATEDTM\"))+\"'})\n"
                + "AND  DD.DATE_DAT >= {d '\" + ((String)globalMap.get(\"HST_LOAD_START_DAT\"))+ \"'}\n" + ")T)";

        String result = "\"(SELECT DISTINCT EMP_SKEY,DATE_SKEY FROM \n" + "(SELECT DISTINCT\n" + "DE.EMP_SKEY,\n"
                + "DD.DATE_SKEY\n" + "FROM \" +context.JDBC_EXT_CN_Schema+ \".WRK_TIMESHEETITEM TI1\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_EXT_CN_Schema+ \".WRK_TIMESHEETITEMTRC TR ON (TI1.TIMESHEETITEMID = TR.ASSOCTIMESHEETID)    \n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_DATE DD   ON DD.DATE_DAT = TI1.EVENTDTM\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_EMP DE    ON DE.EMP_ID = TI1.EMPLOYEEID\n"
                + "  WHERE (TR.ENTEREDONDTM > {ts'\"+((String)globalMap.get(\"EXT_MAX_UPDATEDTM\"))+\"'} OR TI1.UPDATEDTM > {ts'\"+((String)globalMap.get(\"EXT_MAX_UPDATEDTM\"))+\"'})\n"
                + "AND  DD.DATE_DAT >= {d '\" + ((String)globalMap.get(\"HST_LOAD_START_DAT\"))+ \"'}\n"
                + "  UNION ALL\n" + "SELECT DISTINCT\n" + "DE.EMP_SKEY,\n" + "DD.DATE_SKEY\n"
                + "FROM \" +context.JDBC_EXT_CN_Schema+ \".WRK_PUNCHEVENT PU1\n"
                + "LEFT OUTER JOIN  \" +context.JDBC_EXT_CN_Schema+ \".WRK_PUNCHEVENTTRC PT ON (PT.ASSOCPUNCHEVENTID  = PU1.PUNCHEVENTID)\n"
                + "LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_DATE DD ON DD.DATE_DAT = PU1.PUNCH_DATE\n"
                + "LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_EMP DE  ON DE.EMP_ID = PU1.EMPLOYEEID\n"
                + "WHERE (PT.ENTEREDONDTM > {ts'\"+((String)globalMap.get(\"EXT_MAX_UPDATEDTM\"))+\"'} OR PU1.UPDATEDTM > {ts'\"+((String)globalMap.get(\"EXT_MAX_UPDATEDTM\"))+\"'})\n"
                + "AND  DD.DATE_DAT >= {d '\" + ((String)globalMap.get(\"HST_LOAD_START_DAT\"))+ \"'}\n" + "UNION ALL\n"
                + "SELECT DISTINCT\n" + "DE.EMP_SKEY,\n" + "DD.DATE_SKEY\n"
                + "FROM \" +context.JDBC_EXT_CN_Schema+ \".WRK_WFCAUDIT WA\n"
                + "LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_DATE DD ON (DD.DATE_DAT >= COALESCE(WA.TODTM,WA.AUDITDTM)-1 AND DD.DATE_DAT < COALESCE(WA.TODTM,WA.AUDITDTM))\n"
                + "LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_EMP DE  ON DE.EMP_ID = WA.EMPLOYEEID\n"
                + "WHERE (WA.ENTEREDONDTM > {ts'\"+((String)globalMap.get(\"EXT_MAX_UPDATEDTM\"))+\"'})\n"
                + "AND  DD.DATE_DAT >= {d '\" + ((String)globalMap.get(\"HST_LOAD_START_DAT\"))+ \"'}\n" + ")T)\"";
        assertEquals(result, mt.replaceVariablesForExpression(processType, testSql));

        String testSql2 = "(SELECT DISTINCT\n"
                + "COALESCE(DAU2.AUDIT_USER_SKEY,DAU.AUDIT_USER_SKEY,1) AS AUDIT_USER_SKEY,\n" + "WE.PRSN_NBR_TXT,\n"
                + "WE.EMP_SKEY,\n" + "WR1.WRK_RULE_SKEY AS WRK_RULE_SKEY,\n"
                + "COALESCE(TR.ENTEREDONDTM,TI1.ENTEREDONDTM) AS ENTERED_ON_DTM, \n" + "DD.DATE_DAT AS EVENT_DTM,\n"
                + "DD.DATE_SKEY AS DATE_SKEY,\n" + "COALESCE(DS2.DSRC_SKEY, DS.DSRC_SKEY) AS DSRC_SKEY,\n"
                + "WE.BIRTH_DAT,\n" + "WE.CO_HIRE_DAT,\n" + "NULL AS TENURE_SKEY,\n"
                + "COALESCE(TI1.TIMESHEETITEMID,0) AS TIMESHEETITEMID,\n" + "0 AS PUNCHEVENTID,\n"
                + "NULL AS AUDIT_TYPE_SKEY, \n" + "PC1.PAYCD_SKEY AS PAYCD_SKEY,\n"
                + "hst2.HM_LBRACCT_SKEY AS AUDIT_USER_PRI_LBRACCT_SKEY,\n"
                + "COALESCE(LA1.LBRACCT_SKEY,HST.HM_LBRACCT_SKEY) AS LBRACCT_SKEY,\n"
                + "OJ1_3.ORG_SKEY AS AUDIT_USER_PRI_ORG_SKEY,\n"
                + "COALESCE(OJ1_1.ORG_SKEY,OJ1_2.ORG_SKEY) AS ORG_SKEY,\n" + "0 AS CANCEL_FLAG, \n"
                + "CASE WHEN DAU.EMP_ID = TI1.EMPLOYEEID THEN 1 ELSE 0 END AS EDIT_SELF_SWT,\n" + "1 AS AUDIT_CNT,\n"
                + "COALESCE(TI2.DURATIONSECSQTY/3600.0,0) AS FROM_HRS,\n"
                + "COALESCE(TI1.DURATIONSECSQTY/3600.0,0) AS TO_HRS,\n" + "OV1.OVERRIDE_TYP_SKEY OVERRIDE_TYP_SKEY,\n"
                + "1 AS PASS_NBR,\n" + "TR.ACTIONTYPEID_CHAR,\n" + "TI1.TMSHTITEMTYPEID_CHAR,\n"
                + "TI1.DELETEDSW_CHAR,\n" + "TI2.DELETEDSW_CHAR AS DELETEDSW_CHAR2,\n"
                + "COALESCE(\"+globalMap.get(\"TIMESHEETITEMID_CHAR\")+\",'0') AS TIMESHEETITEMID_CHAR,\n"
                + "TI1.SRC_SKEY,\n" + "TI1.TENANT_SKEY,\n" + "CASE\n"
                + "        WHEN TR.ENTEREDONDTM >= TI1.UPDATEDTM    THEN TR.ENTEREDONDTM\n"
                + "        ELSE TI1.UPDATEDTM \n" + "    END AS MAX_UPDATEDTM,\n" + "PC2.PAYCD_NAM FROM_PAYCD,\n"
                + "LA2.LBRACCT_FULL_NAM AS FROM_LBRACCT_FULL_NAM,\n" + "OJ2_1.ORG_PATH_TXT AS FROM_ORG_PATH_TXT,\n"
                + "COALESCE(TR.TIMESHTITMTRCID,0) AS TIMESHTITMTRCID,\n"
                + "COALESCE(CMNT1.COMMENTTEXT,CMNT2.COMMENTTEXT) AS COMMNT,\n" + "TI1.TCEDITBYTYPEID\n"
                + "FROM context.JDBC_EXT_CN_Schema.WRK_TIMESHEETITEM TI1\n"
                + "  LEFT OUTER JOIN context.JDBC_EXT_CN_Schema.WRK_TIMESHEETITEMTRC TR ON (TI1.TIMESHEETITEMID = TR.ASSOCTIMESHEETID)    \n"
                + "  LEFT OUTER JOIN  context.JDBC_WFAN_CN_Schema.DIM_EMP WE ON (TI1.EMPLOYEEID = WE.EMP_ID)   \n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_PAYCD PC1 ON (TI1.PAYCODEID = PC1.PAYCD_ID)\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_PAYCD PC2 ON (TI1.FROMPAYCODEID = PC2.PAYCD_ID)  \n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_LBRACCT LA1 ON (TI1.LABORACCTID = LA1.LBRACCT_ID)\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_LBRACCT LA2 ON (TI1.FROMLABORACCTID = LA2.LBRACCT_ID)\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_WRK_RULE WR1 ON (TI1.WORKRULEID = WR1.WRK_RULE_ID AND TI1.EVENTDTM >= WR1.WRK_RULE_EFF_DAT AND TI1.EVENTDTM <   WR1.WRK_RULE_EXP_DAT AND TI1.EVENTDTM < WR1.REC_EXP_DTM and WR1.REC_ACTV_SWT = 1)\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.LKP_OVERRIDE_TYP OV1 ON (TI1.OVERRIDETYPEID = OV1.OVERRIDE_TYP_ID)  \n"
                + "  LEFT OUTER JOIN context.JDBC_EXT_CN_Schema.WRK_TIMESHEETITEM TI2 ON (TI2.TIMESHEETITEMID = TR.TIMESHEETITEMID)\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_PAYCD PC2_1 ON (TI2.PAYCODEID = PC2_1.PAYCD_ID)\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_PAYCD PC2_2 ON (TI2.FROMPAYCODEID = PC2_2.PAYCD_ID)\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_DSRC DS ON (DS.DSRC_ID  = TI1.DATASOURCEID)\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_DSRC DS2 ON (DS2.DSRC_ID  = TR.DATASOURCEID)\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_ORG OJ1_1 ON (OJ1_1.REC_ACTV_SWT = 1 and TI1.ORGIDSID = OJ1_1.ORG_IDS_ID AND OJ1_1.ORIG_ORG_EFF_DAT <= TI1.EVENTDTM AND OJ1_1.ORIG_ORG_EXP_DAT > TI1.EVENTDTM)\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_ORG OJ2_1 ON (OJ2_1.REC_ACTV_SWT = 1 and TI1.FROMORGIDSID = OJ2_1.ORG_IDS_ID AND OJ2_1.ORIG_ORG_EFF_DAT <= TI1.EVENTDTM AND OJ2_1.ORIG_ORG_EXP_DAT > TI1.EVENTDTM)\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_DATE DD   ON DD.DATE_DAT = TI1.EVENTDTM\n"
                + "  LEFT OUTER JOIN context.JDBC_EXT_CN_Schema.EXT_DIM_AUDIT_USER DAU ON DAU.CLIENT_USER_NAM = DS.DSRC_USR_NAM \n"
                + "  LEFT OUTER JOIN context.JDBC_EXT_CN_Schema.EXT_DIM_AUDIT_USER DAU2 ON DAU2.CLIENT_USER_NAM = DS2.DSRC_USR_NAM\n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.HST_EMP_HM_LBRACCT hst\n"
                + "    ON (WE.EMP_SKEY = HST.EMP_SKEY AND TI1.EVENTDTM >= HST.EMP_HM_LBRACCT_EFF_DAT AND TI1.EVENTDTM < HST.EMP_HM_LBRACCT_EXP_DAT) \n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.HST_EMP_HM_LBRACCT hst2\n"
                + "    ON (DAU.EMP_SKEY = HST2.EMP_SKEY AND TI1.ENTEREDONDTM >= HST2.EMP_HM_LBRACCT_EFF_DAT AND TI1.ENTEREDONDTM < HST2.EMP_HM_LBRACCT_EXP_DAT) \n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_ORG OJ1_2 ON (OJ1_2.REC_ACTV_SWT = 1 and OJ1_2.ORG_IDS_ID = HST.PRI_ORG_IDS_ID AND OJ1_2.ORIG_ORG_EFF_DAT <= TI1.EVENTDTM AND OJ1_2.ORIG_ORG_EXP_DAT > TI1.EVENTDTM) \n"
                + "  LEFT OUTER JOIN context.JDBC_WFAN_CN_Schema.DIM_ORG OJ1_3 ON (OJ1_3.REC_ACTV_SWT = 1 and OJ1_3.ORG_IDS_ID = HST2.PRI_ORG_IDS_ID AND OJ1_3.ORIG_ORG_EFF_DAT <= TI1.ENTEREDONDTM AND OJ1_3.ORIG_ORG_EXP_DAT > TI1.ENTEREDONDTM) \n"
                + "  LEFT OUTER JOIN context.JDBC_EXT_CN_Schema.WRK_COMMENTS CMNT1 ON CMNT1.COMMENTID = TI1.COMMENTID\n"
                + "  LEFT OUTER JOIN context.JDBC_EXT_CN_Schema.WRK_COMMENTS CMNT2 ON CMNT2.COMMENTID = TR.COMMENTID   \n"
                + "JOIN context.JDBC_EXT_CN_Schema.TMP_CDC_TIMECARDAUDIT CDC ON WE.EMP_SKEY=CDC.EMP_SKEY AND DD.DATE_SKEY=CDC.DATE_SKEY\n"
                + "  WHERE  DD.DATE_SKEY BETWEEN \"+(Integer)globalMap.get(\"STRT_SKEY\")+\" and \"+(Integer)globalMap.get(\"END_SKEY\")+\"\n"
                + ")";

        String result2 = "\"(SELECT DISTINCT\n"
                + "COALESCE(DAU2.AUDIT_USER_SKEY,DAU.AUDIT_USER_SKEY,1) AS AUDIT_USER_SKEY,\n" + "WE.PRSN_NBR_TXT,\n"
                + "WE.EMP_SKEY,\n" + "WR1.WRK_RULE_SKEY AS WRK_RULE_SKEY,\n"
                + "COALESCE(TR.ENTEREDONDTM,TI1.ENTEREDONDTM) AS ENTERED_ON_DTM, \n" + "DD.DATE_DAT AS EVENT_DTM,\n"
                + "DD.DATE_SKEY AS DATE_SKEY,\n" + "COALESCE(DS2.DSRC_SKEY, DS.DSRC_SKEY) AS DSRC_SKEY,\n"
                + "WE.BIRTH_DAT,\n" + "WE.CO_HIRE_DAT,\n" + "NULL AS TENURE_SKEY,\n"
                + "COALESCE(TI1.TIMESHEETITEMID,0) AS TIMESHEETITEMID,\n" + "0 AS PUNCHEVENTID,\n"
                + "NULL AS AUDIT_TYPE_SKEY, \n" + "PC1.PAYCD_SKEY AS PAYCD_SKEY,\n"
                + "hst2.HM_LBRACCT_SKEY AS AUDIT_USER_PRI_LBRACCT_SKEY,\n"
                + "COALESCE(LA1.LBRACCT_SKEY,HST.HM_LBRACCT_SKEY) AS LBRACCT_SKEY,\n"
                + "OJ1_3.ORG_SKEY AS AUDIT_USER_PRI_ORG_SKEY,\n"
                + "COALESCE(OJ1_1.ORG_SKEY,OJ1_2.ORG_SKEY) AS ORG_SKEY,\n" + "0 AS CANCEL_FLAG, \n"
                + "CASE WHEN DAU.EMP_ID = TI1.EMPLOYEEID THEN 1 ELSE 0 END AS EDIT_SELF_SWT,\n" + "1 AS AUDIT_CNT,\n"
                + "COALESCE(TI2.DURATIONSECSQTY/3600.0,0) AS FROM_HRS,\n"
                + "COALESCE(TI1.DURATIONSECSQTY/3600.0,0) AS TO_HRS,\n" + "OV1.OVERRIDE_TYP_SKEY OVERRIDE_TYP_SKEY,\n"
                + "1 AS PASS_NBR,\n" + "TR.ACTIONTYPEID_CHAR,\n" + "TI1.TMSHTITEMTYPEID_CHAR,\n"
                + "TI1.DELETEDSW_CHAR,\n" + "TI2.DELETEDSW_CHAR AS DELETEDSW_CHAR2,\n"
                + "COALESCE(\"+globalMap.get(\"TIMESHEETITEMID_CHAR\")+\",'0') AS TIMESHEETITEMID_CHAR,\n"
                + "TI1.SRC_SKEY,\n" + "TI1.TENANT_SKEY,\n" + "CASE\n"
                + "        WHEN TR.ENTEREDONDTM >= TI1.UPDATEDTM    THEN TR.ENTEREDONDTM\n"
                + "        ELSE TI1.UPDATEDTM \n" + "    END AS MAX_UPDATEDTM,\n" + "PC2.PAYCD_NAM FROM_PAYCD,\n"
                + "LA2.LBRACCT_FULL_NAM AS FROM_LBRACCT_FULL_NAM,\n" + "OJ2_1.ORG_PATH_TXT AS FROM_ORG_PATH_TXT,\n"
                + "COALESCE(TR.TIMESHTITMTRCID,0) AS TIMESHTITMTRCID,\n"
                + "COALESCE(CMNT1.COMMENTTEXT,CMNT2.COMMENTTEXT) AS COMMNT,\n" + "TI1.TCEDITBYTYPEID\n"
                + "FROM \" +context.JDBC_EXT_CN_Schema+ \".WRK_TIMESHEETITEM TI1\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_EXT_CN_Schema+ \".WRK_TIMESHEETITEMTRC TR ON (TI1.TIMESHEETITEMID = TR.ASSOCTIMESHEETID)    \n"
                + "  LEFT OUTER JOIN  \" +context.JDBC_WFAN_CN_Schema+ \".DIM_EMP WE ON (TI1.EMPLOYEEID = WE.EMP_ID)   \n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_PAYCD PC1 ON (TI1.PAYCODEID = PC1.PAYCD_ID)\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_PAYCD PC2 ON (TI1.FROMPAYCODEID = PC2.PAYCD_ID)  \n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_LBRACCT LA1 ON (TI1.LABORACCTID = LA1.LBRACCT_ID)\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_LBRACCT LA2 ON (TI1.FROMLABORACCTID = LA2.LBRACCT_ID)\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_WRK_RULE WR1 ON (TI1.WORKRULEID = WR1.WRK_RULE_ID AND TI1.EVENTDTM >= WR1.WRK_RULE_EFF_DAT AND TI1.EVENTDTM <   WR1.WRK_RULE_EXP_DAT AND TI1.EVENTDTM < WR1.REC_EXP_DTM and WR1.REC_ACTV_SWT = 1)\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".LKP_OVERRIDE_TYP OV1 ON (TI1.OVERRIDETYPEID = OV1.OVERRIDE_TYP_ID)  \n"
                + "  LEFT OUTER JOIN \" +context.JDBC_EXT_CN_Schema+ \".WRK_TIMESHEETITEM TI2 ON (TI2.TIMESHEETITEMID = TR.TIMESHEETITEMID)\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_PAYCD PC2_1 ON (TI2.PAYCODEID = PC2_1.PAYCD_ID)\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_PAYCD PC2_2 ON (TI2.FROMPAYCODEID = PC2_2.PAYCD_ID)\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_DSRC DS ON (DS.DSRC_ID  = TI1.DATASOURCEID)\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_DSRC DS2 ON (DS2.DSRC_ID  = TR.DATASOURCEID)\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_ORG OJ1_1 ON (OJ1_1.REC_ACTV_SWT = 1 and TI1.ORGIDSID = OJ1_1.ORG_IDS_ID AND OJ1_1.ORIG_ORG_EFF_DAT <= TI1.EVENTDTM AND OJ1_1.ORIG_ORG_EXP_DAT > TI1.EVENTDTM)\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_ORG OJ2_1 ON (OJ2_1.REC_ACTV_SWT = 1 and TI1.FROMORGIDSID = OJ2_1.ORG_IDS_ID AND OJ2_1.ORIG_ORG_EFF_DAT <= TI1.EVENTDTM AND OJ2_1.ORIG_ORG_EXP_DAT > TI1.EVENTDTM)\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_DATE DD   ON DD.DATE_DAT = TI1.EVENTDTM\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_EXT_CN_Schema+ \".EXT_DIM_AUDIT_USER DAU ON DAU.CLIENT_USER_NAM = DS.DSRC_USR_NAM \n"
                + "  LEFT OUTER JOIN \" +context.JDBC_EXT_CN_Schema+ \".EXT_DIM_AUDIT_USER DAU2 ON DAU2.CLIENT_USER_NAM = DS2.DSRC_USR_NAM\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".HST_EMP_HM_LBRACCT hst\n"
                + "    ON (WE.EMP_SKEY = HST.EMP_SKEY AND TI1.EVENTDTM >= HST.EMP_HM_LBRACCT_EFF_DAT AND TI1.EVENTDTM < HST.EMP_HM_LBRACCT_EXP_DAT) \n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".HST_EMP_HM_LBRACCT hst2\n"
                + "    ON (DAU.EMP_SKEY = HST2.EMP_SKEY AND TI1.ENTEREDONDTM >= HST2.EMP_HM_LBRACCT_EFF_DAT AND TI1.ENTEREDONDTM < HST2.EMP_HM_LBRACCT_EXP_DAT) \n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_ORG OJ1_2 ON (OJ1_2.REC_ACTV_SWT = 1 and OJ1_2.ORG_IDS_ID = HST.PRI_ORG_IDS_ID AND OJ1_2.ORIG_ORG_EFF_DAT <= TI1.EVENTDTM AND OJ1_2.ORIG_ORG_EXP_DAT > TI1.EVENTDTM) \n"
                + "  LEFT OUTER JOIN \" +context.JDBC_WFAN_CN_Schema+ \".DIM_ORG OJ1_3 ON (OJ1_3.REC_ACTV_SWT = 1 and OJ1_3.ORG_IDS_ID = HST2.PRI_ORG_IDS_ID AND OJ1_3.ORIG_ORG_EFF_DAT <= TI1.ENTEREDONDTM AND OJ1_3.ORIG_ORG_EXP_DAT > TI1.ENTEREDONDTM) \n"
                + "  LEFT OUTER JOIN \" +context.JDBC_EXT_CN_Schema+ \".WRK_COMMENTS CMNT1 ON CMNT1.COMMENTID = TI1.COMMENTID\n"
                + "  LEFT OUTER JOIN \" +context.JDBC_EXT_CN_Schema+ \".WRK_COMMENTS CMNT2 ON CMNT2.COMMENTID = TR.COMMENTID   \n"
                + "JOIN \" +context.JDBC_EXT_CN_Schema+ \".TMP_CDC_TIMECARDAUDIT CDC ON WE.EMP_SKEY=CDC.EMP_SKEY AND DD.DATE_SKEY=CDC.DATE_SKEY\n"
                + "  WHERE  DD.DATE_SKEY BETWEEN \"+(Integer)globalMap.get(\"STRT_SKEY\")+\" and \"+(Integer)globalMap.get(\"END_SKEY\")+\"\n"
                + ")\"";
        assertEquals(result2, mt.replaceVariablesForExpression(processType, testSql2));

    }

    @Test
    public void testAddQuotesForTableAndSchemaIfNotExist() {
        SpecialUpdateELTConnectorNameToDefaultName4JDBCMigrationTask mt =
                new SpecialUpdateELTConnectorNameToDefaultName4JDBCMigrationTask();
        String tableName1 = "DIM_ORG";
        String tableName2 = "\"DIM_ORG";
        String tableName3 = "\"DIM_ORG\"";
        String tableName4 = "context.JDBC_EXT_CN_Schema";
        String tableName5 = "((String)globalMap.get(\"EXT_MAX_UPDATEDTM\"))";
        String tableName6 = "DIM_ORG\"";
        assertEquals("\"DIM_ORG\"", mt.addQuotesForTableAndSchemaIfNotExist(tableName1));
        assertEquals("\"DIM_ORG\"", mt.addQuotesForTableAndSchemaIfNotExist(tableName2));
        assertEquals(tableName3, mt.addQuotesForTableAndSchemaIfNotExist(tableName3));
        assertEquals(tableName4, mt.addQuotesForTableAndSchemaIfNotExist(tableName4));
        assertEquals(tableName5, mt.addQuotesForTableAndSchemaIfNotExist(tableName5));
        assertEquals("\"DIM_ORG\"", mt.addQuotesForTableAndSchemaIfNotExist(tableName6));
    }
    private ContextType createContextType(String contextName, String[] paramNames) {
        ContextType context = TalendFileFactory.eINSTANCE.createContextType();
        context.setName(contextName);
        for (String paramName : paramNames) {
            ContextParameterType param = TalendFileFactory.eINSTANCE.createContextParameterType();
            param.setName(paramName);
            param.setType("id_String");
            context.getContextParameter().add(param);
        }
        return context;
    }

}
