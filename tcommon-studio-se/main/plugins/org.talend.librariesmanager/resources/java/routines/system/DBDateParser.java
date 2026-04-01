package routines.system;

import routines.TalendDate;

public abstract class DBDateParser {
	
    public static final String MYSQL = "mysql_id";
    private static java.util.Map<String, DBDateParser> managerMap = new java.util.HashMap<String, DBDateParser>();
    
    public static DBDateParser getDBDateParser(String dbmsId){
    	DBDateParser dBDateParser = managerMap.get(dbmsId);
    	if(dBDateParser==null){
    		if(MYSQL.equals(dbmsId)){
    			dBDateParser = new MysqlDateParser();
    		}
    	}
    	managerMap.put(dbmsId, dBDateParser);
    	return dBDateParser;
    }
    public String getDateString(String dbmsId,String dbType,long date,String pattern){
		String return_date = "";
		String defaultPattern = getDBDateParser(dbmsId).getDefaultPattern(dbType);
		return_date = TalendDate.formatDate(defaultPattern, new java.util.Date(date));
		if(pattern==null||"".equals(pattern)||defaultPattern.equals(pattern)){
			return return_date;
		}else{
			java.util.Date real_date = TalendDate.parseDate(defaultPattern, return_date);
			return TalendDate.formatDate(pattern, real_date);
		}
	}
	
	public abstract String getDefaultPattern(String dbType);

}	
class MysqlDateParser extends DBDateParser{
	
	private static final String DEFAULT_DATE_PATTERN="yyyy-MM-dd";
	private static final String DEFAULT_DATETIME_PATTERN="yyyy-MM-dd HH:mm:ss";
	private static final String DEFAULT_TIMESTAMP_PATTERN="yyyy-MM-dd HH:mm:ss";
	private static final String DEFAULT_TIME_PATTERN="HH:mm:ss";
	private static final String DEFAULT_YEAR_PATTERN="yyyy";
			
	public synchronized String getDefaultPattern(String dBType) {
		String defaultPattern="";
		if("DATE".equals(dBType)){
			defaultPattern = DEFAULT_DATE_PATTERN;
		}else if("DATETIME".equals(dBType)){
			defaultPattern = DEFAULT_DATETIME_PATTERN;
		}else if("TIMESTAMP".equals(dBType)){
			defaultPattern = DEFAULT_TIMESTAMP_PATTERN;
		}else if("TIME".equals(dBType)){
			defaultPattern = DEFAULT_TIME_PATTERN;
		}else if("YEAR".equals(dBType)){
			defaultPattern = DEFAULT_YEAR_PATTERN;
		}
		return defaultPattern;
	}
}
