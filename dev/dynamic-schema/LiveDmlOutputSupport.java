import java.sql.*;
import java.util.*;
import java.math.BigDecimal;
import routines.system.*;

/** Native output recipe: every mutation is confined to a uniquely named disposable table. */
public abstract class LiveDmlOutputSupport {
    static final Properties config = new Properties();
    protected final Map<String,Object> globalMap = new HashMap<>(), resourceMap = new HashMap<>();
    protected final List<rejectedStruct> rejectedRows = new ArrayList<>();
    protected final String projectName = "DynamicDmlTest";
    protected long tos_count_tOracleOutput_1, tos_count_tMysqlOutput_1, tos_count_tPostgresqlOutput_1, tos_count_tMSSqlOutput_1;
    protected Context context = new Context();
    protected boolean mixedKeys;
    protected static class Context {
        public String DB_HOST, DB_PORT, DB_NAME, DB_SCHEMA = "", DB_USER, DB_PASSWORD, DB_PROPERTIES = "";
        public String TEST_TABLE = "TDYN_DML_" + UUID.randomUUID().toString().replace("-", "").substring(0,18).toUpperCase(Locale.ROOT);
    }
    protected static class rowStruct { public String AGENCE, MOIS; public Dynamic SQL; }
    protected static class rejectedStruct extends rowStruct { public String errorCode, errorMessage; }
    protected abstract void execute(ResultSet rows) throws Exception;
    static String id(String db) { return db.equals("mssql") ? "id_MSSQL" : db.equals("oracle") ? "oracle_id" : db.equals("mysql") ? "mysql_id" : "postgres_id"; }
    static String quote(String name,String db) { String q=db.equals("mysql")?"`":db.equals("mssql")?"[":"\"";String end=q.equals("[")?"]":q;return q+name.replace(end,end+end)+end; }
    static void require(boolean ok,String message) {if(!ok)throw new AssertionError(message);}
    static Connection connect(String db) throws SQLException {return DriverManager.getConnection(config.getProperty(db+".url"), config.getProperty(db+".user"),config.getProperty(db+".password"));}
    public static String query(String db,String variant) {
        boolean empty=variant.equals("empty")||variant.equals("keyonly")||variant.equals("create_empty");
        StringBuilder union = new StringBuilder();
        for(int i=0;i<3;i++) {
            if(i>0)union.append(" UNION ALL ");
            String key=i==1?"'K2'":variant.equals("nullable")?"NULL":"'K1'";
            String text=variant.equals("nochange")?"legacy":i==1&&variant.equals("reject")?"bad":i==2?"Été € final":"Été €";
            String type=db.equals("oracle")?"VARCHAR2":db.equals("mysql")?"CHAR":"VARCHAR";
            String national=db.equals("oracle")?"NVARCHAR2":db.equals("mssql")?"NVARCHAR":db.equals("mysql")?"CHAR":"VARCHAR";
            String num=db.equals("oracle")?"NUMBER":"DECIMAL";
            union.append("SELECT CAST(").append(key).append(" AS ").append(type).append("(10)) AS ").append(quote(variant.equals("quoted")?(db.equals("oracle")?"K ] €":"K ] \" €"):"AGENCE",db))
                .append(", CAST('S1' AS ").append(type).append("(6)) AS ").append(quote("MOIS",db));
            if(!empty)union.append(", CAST(").append(variant.equals("nochange")?"99":i==2?"NULL":i==1?"22.1234567890":"11.1234567890").append(" AS ").append(num).append("(38,10)) AS ").append(quote("MONTANT",db))
                .append(", CAST(").append(db.equals("mssql")||db.equals("oracle")?"N":"").append("'").append(text).append("' AS ").append(national).append("(30)) AS ").append(quote("TEXTE",db));
            union.append(", ").append(i).append(" AS ORD").append(db.equals("oracle")?" FROM DUAL":"");
        }
        String columns=quote(variant.equals("quoted")?(db.equals("oracle")?"K ] €":"K ] \" €"):"AGENCE",db)+", "+quote("MOIS",db)+(empty?"":", "+quote("MONTANT",db)+", "+quote("TEXTE",db));
        return "SELECT "+columns+" FROM ("+union+") q"+(variant.equals("zero")?" WHERE 1=0":"")+" ORDER BY ORD";
    }
    protected void test(String db,String action,String variant) throws Exception {
        boolean empty=variant.equals("empty")||variant.equals("keyonly")||variant.equals("create_empty"), composite=variant.equals("composite")||variant.equals("keyonly")||mixedKeys, nullable=variant.equals("nullable"), reject=variant.equals("reject");
        String url=config.getProperty(db+".url");
        java.net.URI uri=java.net.URI.create(url.replace("jdbc:oracle:thin:@//","oracle://").replace("jdbc:","").split(";",2)[0]);
        context.DB_HOST=uri.getHost();context.DB_PORT=""+uri.getPort();
        context.DB_NAME=db.equals("mssql")?url.replaceFirst("(?i).*;database(?:Name)?=([^;]+).*","$1"):uri.getPath().substring(1);
        context.DB_SCHEMA=db.equals("postgres")?"public":db.equals("mssql")?"dbo":"";
        context.DB_USER=config.getProperty(db+".user");context.DB_PASSWORD=config.getProperty(db+".password");
        if(db.equals("mysql")&&variant.equals("nochange"))context.DB_PROPERTIES="useAffectedRows=true";
        if(db.equals("mssql"))context.DB_PROPERTIES="encrypt=true;trustServerCertificate=true;loginTimeout=10";
        String table=quote(context.TEST_TABLE,db), key=quote(variant.equals("quoted")?(db.equals("oracle")?"K ] €":"K ] \" €"):"AGENCE",db), month=quote("MOIS",db), amount=quote("MONTANT",db), text=quote("TEXTE",db);
        try(Connection admin=connect(db)) {
            try {
                String chars=db.equals("oracle")?"VARCHAR2":"VARCHAR", national=db.equals("oracle")?"NVARCHAR2":db.equals("mssql")?"NVARCHAR":"VARCHAR";
                if(!variant.startsWith("create")) try(Statement ddl=admin.createStatement()) {
                    ddl.execute("CREATE TABLE "+table+" ("+key+" "+chars+"(10), "+month+" "+chars+"(6)"+(empty?"":", "+amount+" DECIMAL(38,10), "+text+" "+national+"(30)")
                        +", UNIQUE ("+key+(composite?", "+month:"")+")"+(reject?", CHECK ("+text+" <> 'bad')":"")+")");
                }
                if(!variant.startsWith("create")) try(PreparedStatement seed=admin.prepareStatement("INSERT INTO "+table+" VALUES (?,?"+(empty?"":",?,?")+")")) {
                    for(String value:new String[]{"K1","KEEP",composite?"OTHER":null,reject&&(action.equals("UPDATE")||action.equals("DELETE"))?"K2":null}) {
                        if(value==null)continue;
                        seed.setString(1,value.equals("OTHER")?"K1":value.equals("K1")&&nullable?null:value);seed.setString(2,value.equals("OTHER")?"OTHER":"S1");
                        if(!empty){seed.setBigDecimal(3,new BigDecimal("99.0000000000"));seed.setString(4,"legacy");}seed.executeUpdate();
                    }
                }
                if(reject&&action.equals("DELETE")) try(Statement ddl=admin.createStatement()) {
                    ddl.execute("CREATE TABLE "+quote(context.TEST_TABLE+"C",db)+" (ID "+chars+"(10)"+(composite?", M "+chars+"(6)":"")+", FOREIGN KEY (ID"+(composite?", M":"")+") REFERENCES "+table+" ("+key+(composite?", "+month:"")+"))");
                    ddl.executeUpdate("INSERT INTO "+quote(context.TEST_TABLE+"C",db)+" VALUES ('K1'"+(composite?", 'S1'":"")+")");
                }
                try(Statement source=admin.createStatement();ResultSet rows=source.executeQuery(query(db,variant))){execute(rows);}
                Map<String,String> actual=new TreeMap<>();
                try(Statement read=admin.createStatement();ResultSet rows=read.executeQuery("SELECT * FROM "+table)) {
                    while(rows.next()) {String k=Objects.toString(rows.getString(1),"NULL")+":"+rows.getString(2);
                        require(!actual.containsKey(k),"Duplicate correspondence key: "+k);
                        BigDecimal v=empty?null:rows.getBigDecimal(3);
                        actual.put(k,empty?"":(v==null?"NULL":v.stripTrailingZeros().toPlainString())+"/"+rows.getString(4));}
                }
                String k=nullable?"NULL:S1":"K1:S1";
                Map<String,String> expected=new TreeMap<>();if(!variant.startsWith("create"))expected.put("KEEP:S1",empty?"":"99/legacy");
                if(composite&&!variant.startsWith("create"))expected.put("K1:OTHER",empty?"":"99/legacy");
                if(reject&&action.equals("UPDATE"))expected.put("K2:S1","99/legacy");
                if(variant.equals("zero")||action.equals("INSERT_IF_NOT_EXIST")||(reject&&action.equals("DELETE"))) expected.put(k,empty?"":"99/legacy");
                else if(!action.equals("DELETE")) expected.put(k,empty?"":variant.equals("nochange")?"99/legacy":"NULL/Été € final");
                if(!action.equals("UPDATE")&&!action.equals("DELETE")&&!variant.equals("zero")&&!reject)expected.put("K2:S1",empty?"":variant.equals("nochange")?"99/legacy":"22.123456789/Été €");
                require(actual.equals(expected),db+" "+action+" "+variant+" values: "+actual+" expected "+expected);
                require(rejectedRows.size()==(reject?(action.equals("DELETE")?2:1):0),"Reject count "+rejectedRows.size());
                if(reject) {require(rejectedRows.get(0).SQL!=null&&rejectedRows.get(0).errorCode!=null,"Missing reject snapshot/SQLState");require((action.equals("DELETE")?"Été €":"bad").equals(rejectedRows.get(0).SQL.getColumnValue("TEXTE")),"Reject mutated by following row");}
                require(((Number)globalMap.get(component(db)+"_1_NB_LINE")).intValue()==(variant.equals("zero")?0:3),"Input counter changed");
                System.out.println("PASS "+db+" "+action+" "+variant+" values/keys/counters/reject");
            } finally {try(Statement ddl=admin.createStatement()) {
                if(reject&&action.equals("DELETE")) try {ddl.execute("DROP TABLE "+quote(context.TEST_TABLE+"C",db));}
                catch(SQLException missing){if(missing.getErrorCode()!=942&&missing.getErrorCode()!=3701&&missing.getErrorCode()!=1051&&!"42P01".equals(missing.getSQLState()))throw missing;}
                try {ddl.execute("DROP TABLE "+table);}
                catch(SQLException missing){if(missing.getErrorCode()!=942&&missing.getErrorCode()!=3701&&missing.getErrorCode()!=1051&&!"42P01".equals(missing.getSQLState()))throw missing;}
            }}
        }
    }
    static String component(String db){return db.equals("mssql")?"tMSSqlOutput":db.equals("oracle")?"tOracleOutput":db.equals("mysql")?"tMysqlOutput":"tPostgresqlOutput";}
    public static void main(String[] args) throws Exception {
        Properties queries = new Properties();
        for(String db:new String[]{"mssql","oracle","mysql","postgres"})
            for(String variant:new String[]{"mixed","empty","reject","nullable","composite","keyonly","zero","nochange"})
                queries.setProperty(db+"."+variant,query(db,variant));
        try(java.io.OutputStream out=java.nio.file.Files.newOutputStream(java.nio.file.Paths.get(args[0]))) {
            queries.storeToXML(out,"Synthetic DML recipe SQL", "UTF-8");
        }
    }
}
