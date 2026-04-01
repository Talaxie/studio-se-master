// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.dq.helper;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.talend.core.model.metadata.builder.connection.MetadataColumn;
import org.talend.dataprofiler.service.IStoreOnDiskService;
import org.talend.dataquality.PluginConstant;
import org.talend.dataquality.indicators.columnset.BlockKeyIndicator;
import org.talend.dataquality.indicators.columnset.RecordMatchingIndicator;
import org.talend.dataquality.record.linkage.utils.MatchAnalysisConstant;
import org.talend.utils.sugars.TypedReturnCode;

/**
 * created by yyin on 2015年8月13日 Detailled comment
 *
 */
public class StoreOnDiskUtils extends AbstractOSGIServiceUtils {

    private IStoreOnDiskService sdService;

    private static StoreOnDiskUtils sdUtils;

    public static StoreOnDiskUtils getDefault() {
        if (sdUtils == null) {
            sdUtils = new StoreOnDiskUtils();
        }
        return sdUtils;
    }

    @Override
    public String getServiceName() {
        return IStoreOnDiskService.class.getName();
    }

    @Override
    public boolean isServiceInstalled() {
        return getStoreOnDiskService() != null;
    }

    IStoreOnDiskService getStoreOnDiskService() {
        if (this.sdService == null) {
            initService(false);
        }
        return this.sdService;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void setService(BundleContext context, ServiceReference serviceReference) {
        Object obj = context.getService(serviceReference);
        if (obj != null) {
            this.sdService = (IStoreOnDiskService) obj;
        }
    }

    public Object createStoreOnDiskHandler(String tempDataPath, int bufferSize,
            RecordMatchingIndicator recordMatchingIndicator,
            Map<MetadataColumn, String> columnMap) throws IOException {
        if (getStoreOnDiskService() != null) {
            return getStoreOnDiskService().createStoreOnDiskHandler(tempDataPath, bufferSize, recordMatchingIndicator,
                    columnMap);
        }
        return null;
    }

    public void beginQuery(Object storeOnDiskHandler) throws Exception {
        if (getStoreOnDiskService() != null) {
            getStoreOnDiskService().beginQuery(storeOnDiskHandler);
        }
    }

    public void handleRow(Object[] oneRow, Object storeOnDiskHandler) throws Exception {
        if (getStoreOnDiskService() != null) {
            getStoreOnDiskService().handleRow(oneRow, storeOnDiskHandler);
        }
    }

    public void endQuery(Object storeOnDiskHandler) throws Exception {
        if (getStoreOnDiskService() != null) {
            getStoreOnDiskService().endQuery(storeOnDiskHandler);
        }
    }

    public TypedReturnCode<Object> executeWithStoreOnDisk(Map<MetadataColumn, String> columnMap,
            RecordMatchingIndicator recordMatchingIndicator, BlockKeyIndicator blockKeyIndicator,
            Object storeOnDiskHandler,
            Object matchResultConsumer) throws Exception {
        if (getStoreOnDiskService() != null) {
            return getStoreOnDiskService().executeWithStoreOnDisk(columnMap, recordMatchingIndicator, blockKeyIndicator,
                    storeOnDiskHandler, matchResultConsumer);
        } else {
            TypedReturnCode<Object> returnCode = new TypedReturnCode<Object>(false);
            returnCode.setMessage("The Store on Disk Service is null.");
            returnCode.setOk(false);
            return returnCode;
        }
    }

    @Override
    public String getPluginName() {
        return null;
    }

    @Override
    protected String getMissingMessageName() {
        return null;
    }

    @Override
    protected String getRestartMessageName() {
        return null;
    }

    /**
     * sorting the result data by GID,master
     *
     * @param allColumns
     * @param resultData
     * @return
     */
    public static List<Object[]> sortResultByGID(String[] allColumns, List<Object[]> resultData) {
        int gidIndex = -1;
        int masterIndex = -1;
        for (int i = 0; i < allColumns.length; i++) {
            if (StringUtils.endsWithIgnoreCase(allColumns[i], MatchAnalysisConstant.GID)) {
                gidIndex = i;
            } else if (StringUtils.endsWithIgnoreCase(allColumns[i], MatchAnalysisConstant.MASTER)) {
                masterIndex = i;
            }
        }
        // Sort by master first
        final int masterIdx = masterIndex;
        Comparator<Object[]> comparator = new Comparator<Object[]>() {

            @Override
            public int compare(Object[] row1, Object[] row2) {
                return ((String) row2[masterIdx]).compareTo((String) row1[masterIdx]);
            }

        };
        java.util.Collections.sort(resultData, comparator);

        insertionSort(resultData, gidIndex);
        return resultData;
    }

    public static void insertionSort(List<Object[]> data, int gidIdx) {
        int in, out;

        for (out = 1; out < data.size(); out++) {
            Object[] temp = data.get(out);
            in = out;

            while (in > 0 && !isSameGroup(data.get(in - 1)[gidIdx].toString(), (temp[gidIdx]).toString())) {
                data.set(in, data.get(in - 1));
                --in;
            }
            data.set(in, temp);
        }
    }

    /**
     *
     * @param group ID one
     * @param group ID two.
     * @return true if they are the same group considering the two merged groups (groupID contains two more UUID).
     */
    public static boolean isSameGroup(String groupID1, String groupID2) {
        if (groupID1 == null || groupID1.trim().equals(StringUtils.EMPTY) || groupID2 == null
                || groupID2.trim().equals(StringUtils.EMPTY)) {
            return false;
        }
        String[] ids1 = StringUtils.splitByWholeSeparatorPreserveAllTokens(groupID1, PluginConstant.COMMA_STRING);
        String[] ids2 = StringUtils.splitByWholeSeparatorPreserveAllTokens(groupID2, PluginConstant.COMMA_STRING);
        for (String id1 : ids1) {
            for (String id2 : ids2) {
                if (id1.equalsIgnoreCase(id2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
