// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.bigquery;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.talend.core.model.metadata.IMetadataContextModeManager;
import org.talend.core.model.metadata.builder.connection.BigQueryConnection;
import org.talend.core.model.properties.BigQueryConnectionItem;

import com.google.api.gax.paging.Page;
import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.OAuth2Credentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.Dataset;
import com.google.cloud.bigquery.DatasetId;
import com.google.cloud.bigquery.FieldValueList;
import com.google.cloud.bigquery.Job;
import com.google.cloud.bigquery.JobId;
import com.google.cloud.bigquery.JobInfo;
import com.google.cloud.bigquery.QueryJobConfiguration;
import com.google.cloud.bigquery.Table;
import com.google.cloud.bigquery.TableResult;

public class BigQueryClientManager {

    BigQueryConnectionItem connectionItem;

    BigQueryConnection bigqueryConnection;
    
    private String projectId;
    
    private BigQuery bigquery;

    public BigQueryClientManager() {
    }

    public void init(BigQueryConnection bigqueryConnection) throws FileNotFoundException, IOException {
    	this.bigqueryConnection = bigqueryConnection;
    	projectId = bigqueryConnection.getProjectId();
    	final String serviceAccountCredentialsFile = bigqueryConnection.getServiceAccountCredentialsFile();
    	final boolean isUseRegionEndpoint = bigqueryConnection.isUseRegionEndpoint();
    	final String regionEndpoint = bigqueryConnection.getRegionEndpoint();
    	
    	bigquery = createConnectionByServiceAccount(serviceAccountCredentialsFile, isUseRegionEndpoint, regionEndpoint, projectId);
    }

    public void init(BigQueryConnection bigqueryConnection, IMetadataContextModeManager contextModelManager) throws FileNotFoundException, IOException {
    	this.bigqueryConnection = bigqueryConnection;
    	projectId = contextModelManager.getOriginalValue(bigqueryConnection.getProjectId());
    	final String serviceAccountCredentialsFile = contextModelManager.getOriginalValue(bigqueryConnection.getServiceAccountCredentialsFile());
    	final boolean isUseRegionEndpoint = bigqueryConnection.isUseRegionEndpoint();
    	final String regionEndpoint = contextModelManager.getOriginalValue(bigqueryConnection.getRegionEndpoint());
    	
    	bigquery = createConnectionByServiceAccount(serviceAccountCredentialsFile, isUseRegionEndpoint, regionEndpoint, projectId);
    }
    
    private BigQuery createConnectionByServiceAccount(final String serviceAccountCredentialsFile, final boolean isUseRegionEndpoint, final String regionEndpoint, final String projectId) throws FileNotFoundException, IOException {
    	GoogleCredentials credentials;
        File credentialsFile = new File(serviceAccountCredentialsFile);
        try (FileInputStream credentialsStream = new FileInputStream(credentialsFile)) {
            credentials = ServiceAccountCredentials.fromStream(credentialsStream);
        }

        BigQueryOptions.Builder bigQueryOptionsBuilder = BigQueryOptions
                .newBuilder().setCredentials(credentials).setProjectId(projectId);
        BigQuery bigquery = bigQueryOptionsBuilder.build().getService();
        
        Page<Dataset> datasets = bigquery.listDatasets(projectId, BigQuery.DatasetListOption.pageSize(1));
        
        return bigquery;
    }
    
    private BigQuery createConnectionByAccessToken(final String accessToken, final String projectId) {
        AccessToken at = new AccessToken(accessToken, null);
        com.google.auth.oauth2.OAuth2Credentials credentials = OAuth2Credentials.newBuilder().setAccessToken(at).build();

        BigQueryOptions.Builder bigQueryOptionsBuilder = BigQueryOptions
                .newBuilder().setCredentials(credentials).setProjectId(projectId);
        BigQuery bigquery = bigQueryOptionsBuilder.build().getService();
        
        Page<Dataset> datasets = bigquery.listDatasets(projectId, BigQuery.DatasetListOption.pageSize(1));
        
        return bigquery;
    }

	public List<TableModel> searchTables(final String dataSet, final String tableFilter) {
		DatasetId datasetId = DatasetId.of(projectId, dataSet);
        Page<Table> tables = bigquery.listTables(datasetId, BigQuery.TableListOption.pageSize(100));
        
        final List<TableModel> result = new ArrayList<>();
        
        Pattern pattern = Pattern.compile(tableFilter.replace("*", ".*"));
        
        tables.iterateAll().forEach(
                table -> {
                    String tableName = table.getTableId().getTable();
                    String description = table.getDescription();
                    if(pattern.matcher(tableName).matches()) {
                    	TableModel model = new TableModel();
                    	model.name = tableName;
                    	model.description = description;
                    	model.dataSet = dataSet;
                    	result.add(model);
                    }
                }
        );
        
        return result;
	}
	
	private static Pattern pattern = Pattern.compile("([a-zA-Z0-9]+)\\s*\\(([0-9]+)(\\s*,\\s*([0-9]+))?\\)");
	
	public List<TableColumnModel> getTableMetadata(final String dataSet, final String tableName) throws InterruptedException {
		List<TableColumnModel> result = new ArrayList<>();
		
		final String sqlForBasicInfo = "SELECT * FROM " + dataSet +  ".INFORMATION_SCHEMA.COLUMNS WHERE table_name = '" + tableName + "'";
		final TableResult resultForBasicInfo = executeSQL(sqlForBasicInfo);
        
		final String sqlForKeyInfo = "SELECT * FROM " + dataSet +  ".INFORMATION_SCHEMA.KEY_COLUMN_USAGE WHERE table_name = '" + tableName + "'";
		final TableResult resultForKeyInfo = executeSQL(sqlForKeyInfo);
		
        for (FieldValueList row : resultForBasicInfo.iterateAll()) {
        	String table_name = row.get("TABLE_NAME").getStringValue();
            String column_name = row.get("COLUMN_NAME").getStringValue();
            boolean nullable = "YES".equals(row.get("IS_NULLABLE").getStringValue());
            String dataType = row.get("DATA_TYPE").getStringValue();
            boolean isHidden = "YES".equals(row.get("IS_HIDDEN").getStringValue());
            long position = row.get("ORDINAL_POSITION").getLongValue();
            
            boolean isKey = false;
            
            Integer length = null;
            Integer scale = null;
            
            Matcher matcher = pattern.matcher(dataType);
            if(matcher.find()) {
            	dataType = matcher.group(1);
            	length = Integer.valueOf(matcher.group(2));
            	if(matcher.groupCount() > 3) {
            		String v = matcher.group(4);
            		if(v!=null) {
            			scale = Integer.valueOf(v);
            		}
            	}
            }
            
            //key info table should not a big table, so no performance cost for inside loop
            for (FieldValueList keyrow : resultForKeyInfo.iterateAll()) {
            	String table_name_in_keytable = keyrow.get("TABLE_NAME").getStringValue();
                String column_name_in_keytable = keyrow.get("COLUMN_NAME").getStringValue();
                long position_in_keytable = row.get("ORDINAL_POSITION").getLongValue();
                
                String constraint_name_in_keytable = keyrow.get("CONSTRAINT_NAME").getStringValue();
                
                if(table_name.equals(table_name_in_keytable) && position == position_in_keytable) {
                	if(constraint_name_in_keytable!=null && constraint_name_in_keytable.contains(".pk$")) {//TODO : is right for all case?
                		isKey = true;
                	}
                }
            }
            
            if(!isHidden) {
            	TableColumnModel model = new TableColumnModel();
            	model.columnName = column_name;
            	model.dataType = dataType;
            	model.isKey = isKey;
            	model.nullable = nullable;
            	model.length = length;
            	model.scale = scale;
            	result.add(model);
            }
        }
        
        return result;
	}

	private TableResult executeSQL(final String sql) throws InterruptedException {
		QueryJobConfiguration queryConfigForBasicInfo = QueryJobConfiguration.newBuilder(sql)
	        .setUseLegacySql(false)
	        .build();
		
		JobId jobId = JobId.of(UUID.randomUUID().toString());
        Job queryJob = bigquery.create(JobInfo.newBuilder(queryConfigForBasicInfo).setJobId(jobId).build());

        queryJob = queryJob.waitFor();

        if (queryJob == null) {
            throw new RuntimeException("Job no longer exists");
        } else if (queryJob.getStatus().getError() != null) {
            throw new RuntimeException(queryJob.getStatus().getError().toString());
        }
        
        final TableResult result = queryJob.getQueryResults();
		return result;
	}

    
}
