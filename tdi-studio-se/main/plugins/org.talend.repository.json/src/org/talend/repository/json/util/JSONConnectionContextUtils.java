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
package org.talend.repository.json.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.repository.model.json.JSONFileConnection;
import org.talend.repository.model.json.JSONXPathLoopDescriptor;
import org.talend.repository.model.json.JsonFactory;

/**
 * DOC wanghong class global comment. Detailled comment
 */
public final class JSONConnectionContextUtils {

    public static JSONFileConnection getJSONOriginalValueConnection(JSONFileConnection connection, ConnectionItem connectionItem,
            boolean isContextMode, boolean defaultContext) {
        if (isContextMode) {
            ContextType contextType = ConnectionContextHelper.getContextTypeForContextMode(connectionItem.getConnection(),
                    connectionItem.getConnection().getContextName(), defaultContext);
            return (JSONFileConnection) JSONConnectionContextUtils.cloneOriginalValueJSONFileConnection(connection, contextType);
        }
        return connection;
    }

    @SuppressWarnings("unchecked")//$NON-NLS-1$
    public static JSONFileConnection cloneOriginalValueJSONFileConnection(JSONFileConnection fileConn, ContextType contextType) {
        if (fileConn == null) {
            return null;
        }

        JSONFileConnection cloneConn = JsonFactory.eINSTANCE.createJSONFileConnection();

        String filePath = ConnectionContextHelper.getOriginalValue(contextType, fileConn.getJSONFilePath());
        String encoding = ConnectionContextHelper.getOriginalValue(contextType, fileConn.getEncoding());

        filePath = TalendQuoteUtils.removeQuotes(filePath);
        cloneConn.setJSONFilePath(filePath);
        encoding = TalendQuoteUtils.removeQuotes(encoding);
        cloneConn.setEncoding(encoding);
        //
        cloneConn.setMaskXPattern(fileConn.getMaskXPattern());
        cloneConn.setGuess(fileConn.isGuess());
        
        cloneConn.setReadbyMode(fileConn.getReadbyMode());

        ConnectionContextHelper.cloneConnectionProperties(fileConn, cloneConn);

        cloneConn.getSchema().clear();

        List<JSONXPathLoopDescriptor> descs = (List<JSONXPathLoopDescriptor>) fileConn.getSchema();
        for (JSONXPathLoopDescriptor desc : descs) {
            JSONXPathLoopDescriptor cloneDesc = JsonFactory.eINSTANCE.createJSONXPathLoopDescriptor();
            cloneDesc.setLimitBoucle(desc.getLimitBoucle().intValue());
            String xPathQuery = ConnectionContextHelper.getOriginalValue(contextType, desc.getAbsoluteXPathQuery());
            xPathQuery = TalendQuoteUtils.removeQuotes(xPathQuery);
            cloneDesc.setAbsoluteXPathQuery(xPathQuery);

            cloneDesc.getSchemaTargets().clear();
            List<org.talend.repository.model.json.SchemaTarget> schemaTargets = (List<org.talend.repository.model.json.SchemaTarget>) desc
                    .getSchemaTargets();
            for (org.talend.repository.model.json.SchemaTarget schemaTarget : schemaTargets) {
                org.talend.repository.model.json.SchemaTarget cloneSchemaTarget = JsonFactory.eINSTANCE.createSchemaTarget();
                cloneSchemaTarget.setRelativeXPathQuery(schemaTarget.getRelativeXPathQuery());
                cloneSchemaTarget.setTagName(schemaTarget.getTagName());

                cloneSchemaTarget.setSchema(cloneDesc);
                cloneDesc.getSchemaTargets().add(cloneSchemaTarget);
            }

            cloneDesc.setConnection(cloneConn);
            cloneConn.getSchema().add(cloneDesc);
        }

        return cloneConn;
    }
    

    public static String getOriginalJSONContent(JSONFileConnection connection) {
        try {
            return IOUtils.toString(new FileInputStream(getJsonPath(connection)), getConnectionEncoding(connection));
        } catch (IOException e) {
            ExceptionHandler.process(e);
        }

        return null;
    }

    public static String getJsonPath(JSONFileConnection connection) {
        String jsonFilePath = connection.getJSONFilePath();
        try {
            if (connection.isContextMode()) {
                ContextType contextType = ConnectionContextHelper.getContextTypeForContextMode(connection, connection.getContextName());
                jsonFilePath = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType, jsonFilePath));
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return jsonFilePath;
    }

    public static String getConnectionEncoding(JSONFileConnection connection) {
        String encoding = connection.getEncoding();
        try {
            if (connection.isContextMode()) {
                ContextType contextType = ConnectionContextHelper.getContextTypeForContextMode(connection, connection.getContextName());
                encoding = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType, encoding));
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return encoding;
    }
}
