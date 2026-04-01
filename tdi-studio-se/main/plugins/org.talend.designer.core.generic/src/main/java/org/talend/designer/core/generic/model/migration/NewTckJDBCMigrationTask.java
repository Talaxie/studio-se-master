// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.generic.model.migration;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class NewTckJDBCMigrationTask extends ConvertTCompV0ToTckComponentMigrationTask {

    @Override
    public Date getOrder() {
        return new GregorianCalendar(2023, 0, 11, 18, 0, 0).getTime();
    }

    @Override
    protected String getMigrationFile() {
        return "NewTckJDBCMigrationTask.properties";
    }
    
    private Map<String, String> old2New;
    
    protected String correctValue(String path, String value) {
        if("dbMapping".equals(path)) {
            initMap();
            
            String newValue = old2New.get(value);
            return newValue != null ? newValue : value;
        }
        return value;
    }
    
    private void initMap() {
        if(old2New != null) {
            return;
        }
        
        old2New = new HashMap<String, String>();
        old2New.put("mysql_id", "MYSQL");
        old2New.put("as400_id", "AS400");
        old2New.put("access_id", "ACCESS");
        old2New.put("ibmdb2_id", "DB2");
        old2New.put("firebird_id", "FIREBIRD");
        old2New.put("hsqldb_id", "HSQLDB");
        old2New.put("informix_id", "INFORMIX");
        old2New.put("ingres_id", "INGRES");
        old2New.put("vectorwise_id", "VECTORWISE");
        //old2New.put("", "INTERBASE"); seems we remove INTERBASE support
        old2New.put("javadb_id", "JAVADB");
        old2New.put("maxdb_id", "MAXDB");
        old2New.put("id_MSSQL", "MSSQL");
        old2New.put("netezza_id", "NETEZZA");
        old2New.put("oracle_id", "ORACLE");
        old2New.put("postgres_id", "POSTGRESQL");
        old2New.put("postgresplus_id", "POSTGREPLUS");
        old2New.put("sqlite_id", "SQLITE");
        old2New.put("sybase_id", "SYBASE");
        old2New.put("saphana_id", "SAPHANA");
        old2New.put("teradata_id", "TERADATA");
        old2New.put("vertica_id", "VERTICA");
        old2New.put("h2_id", "H2");
        old2New.put("MSODBC", "ODBC");
    }
    
}
