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
package org.talend.repository.bigquery.ui.util;

import java.util.ArrayList;
import java.util.List;

import org.talend.commons.utils.data.text.IndiceHelper;
import org.talend.core.model.metadata.MetadataTalendType;
import org.talend.core.model.metadata.MetadataToolHelper;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.GenericPackage;
import org.talend.core.model.metadata.builder.connection.MetadataColumn;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.cwm.helper.ConnectionHelper;
import org.talend.cwm.helper.PackageHelper;
import org.talend.cwm.helper.TaggedValueHelper;
import org.talend.repository.bigquery.TableColumnModel;
import org.talend.repository.model.IProxyRepositoryFactory;

import orgomg.cwm.objectmodel.core.Package;

public class MetaTableHelper {

	public static void addMetadataTable(Connection connection, MetadataTable metadataTable) {
		GenericPackage g = (GenericPackage) ConnectionHelper.getPackage(connection.getName(), connection,
				GenericPackage.class);
		if (g != null) {
			g.getOwnedElement().add(metadataTable);
		} else {
			GenericPackage gpkg = ConnectionFactory.eINSTANCE.createGenericPackage();
			gpkg.setName(connection.getName());
			PackageHelper.addMetadataTable(metadataTable, gpkg);
			ConnectionHelper.addPackage(gpkg, connection);

		}
	}

	public static void removeMetadataTables(Connection connection, List<MetadataTable> tables) {
		for (MetadataTable table : tables) {
			removeMetadataTable(connection, table);
		}
	}

	public static void removeMetadataTable(Connection connection, MetadataTable table) {
		if (table.getNamespace() instanceof Package) {
			Package pkg = (Package) table.getNamespace();
			if (pkg.getOwnedElement().contains(table)) {
				pkg.getOwnedElement().remove(table);
			}

		} else {
			GenericPackage pkg = (GenericPackage) ConnectionHelper.getPackage(connection.getName(), connection,
					GenericPackage.class);
			if (pkg != null) {
				if (pkg.getOwnedElement().contains(table)) {
					pkg.getOwnedElement().remove(table);
				}
			}
		}
	}

	public static List<MetadataTable> getTables(Connection connection) {
		return getTables(connection, false);
	}

	public static List<MetadataTable> getTables(Connection connection, boolean sort) {
		List<MetadataTable> tables = ConnectionHelper.getTablesWithOrders(connection);
		if (sort) {
			tables.sort((t1, t2) -> t1.getLabel().compareTo(t2.getLabel()));
		}
		return tables;
	}

	public static MetadataTable setEMFTableFields(String dataSet, String tableName, MetadataTable createBigQueryTable, List<String> existingNames, List<TableColumnModel> fields) {
		IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
		boolean isNewModel = createBigQueryTable == null;
		if (isNewModel) {
			createBigQueryTable = ConnectionFactory.eINSTANCE.createMetadataTable();//createBigQueryTable();
			createBigQueryTable.setId(factory.getNextId());
			createBigQueryTable.setName(tableName);
			//createBigQueryTable.setTableType(MetadataManager.TYPE_TABLE);
			String lableName = IndiceHelper.getIndexedLabel(tableName, existingNames);
			existingNames.add(lableName);
			lableName = MetadataToolHelper.validateValue(lableName);
			createBigQueryTable.setLabel(lableName);
			TaggedValueHelper.setTaggedValue(createBigQueryTable, "dataSet", dataSet);
		} else {
			createBigQueryTable.getColumns().clear();
		}

		List<String> columnLabels = new ArrayList<String>();
		int index = 0;

		for (TableColumnModel field : fields) {
            setTableFieldMetadata(createBigQueryTable, columnLabels, index, field);
        }

		return createBigQueryTable;
	}

	private static void setTableFieldMetadata(MetadataTable createBigQueryTable,
			List<String> columnLabels, int index, TableColumnModel field) {
		MetadataColumn createBigQueryTableField = createBigQueryTableField = ConnectionFactory.eINSTANCE.createMetadataColumn();//createBigQueryTableField();
		createBigQueryTableField.setName(field.getColumnName());
		String label = MetadataToolHelper.validateColumnName(field.getColumnName(), index++, columnLabels);
		createBigQueryTableField.setLabel(label);
		columnLabels.add(label);
		if(field.getLength()!=null) {
			createBigQueryTableField.setLength(field.getLength());
		}
		if(field.getScale()!=null) {
			createBigQueryTableField.setPrecision(field.getScale());
		}
		createBigQueryTableField.setKey(field.isKey());
		createBigQueryTableField.setNullable(field.isNullable());
		createBigQueryTableField.setComment(null);
		
		String type = field.getDataType();
		createBigQueryTableField.setSourceType(type);
		createBigQueryTableField
                .setTalendType(MetadataTalendType.getMappingTypeRetriever("bigquery_id").getDefaultSelectedTalendType(type));
		createBigQueryTableField.setPattern(TalendTextUtils.addQuotes("dd-MM-yyyy"));
        
        createBigQueryTable.getColumns().add(createBigQueryTableField);
	}

}
