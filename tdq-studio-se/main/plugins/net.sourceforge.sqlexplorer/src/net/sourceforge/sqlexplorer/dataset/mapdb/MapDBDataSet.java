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
package net.sourceforge.sqlexplorer.dataset.mapdb;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.dataset.DataSetRow;
import net.sourceforge.sqlexplorer.service.MapDBUtils;

import org.talend.cwm.indicator.ColumnFilter;
import org.talend.dataquality.indicators.mapdb.DBMap;

/**
 * created by talend on Aug 27, 2014 Detailled comment
 *
 */
public class MapDBDataSet extends TalendDataSet {

    protected Map<Object, List<Object>> dataMap = null;
    
    protected Map<Object, Object[]> objectMap = null;

    protected int currentIndex = 0;

    protected Iterator<Object> iterator = null;

    protected ColumnFilter columnFilter = null;

    /**
     * DOC talend MapDBDataSet constructor comment.
     *
     * @param columnLabels
     * @param data
     */
    public MapDBDataSet(String[] columnLabels, Comparable[][] data, int pageSize) {
        super(columnLabels, data, pageSize);
    }

    public MapDBDataSet(String[] columnLabels, DBMap<Object, Object[]> imputDBMap, int pageSize, ColumnFilter cfilter,
            Long rowSize) {
        super(columnLabels, new Comparable[0][0], pageSize);
        this.objectMap = imputDBMap;
        iterator = objectMap.keySet().iterator();
        this.columnFilter = cfilter;
        this.rowSize = rowSize;
    }
    
    
    public MapDBDataSet(String[] columnLabels, Map<Object, List<Object>> imputDBMap, int pageSize, ColumnFilter cfilter,
            Long rowSize) {
        super(columnLabels, new Comparable[0][0], pageSize);
        this.dataMap = imputDBMap;
        iterator = dataMap.keySet().iterator();
        this.columnFilter = cfilter;
        this.rowSize = rowSize;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sourceforge.sqlexplorer.dataset.DataSet#getRowCount()
     */
    @Override
    public int getRowCount() {
        if (rowSize != -1) {
            return ((Long) rowSize).intValue();
        } else if (dataMap != null) {
            return dataMap.size();
        } else if (objectMap != null) {
            return objectMap.size();
        } else {
            return super.getRowCount();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sourceforge.sqlexplorer.dataset.DataSet#getRow(int)
     */
    @Override
    public DataSetRow getRow(int index) {
        DataSetRow returnDataSetRow = null;
        if (iterator == null) {
            return super.getRow(index);
        } else {
            if (index < 0 || ( dataMap != null && index >= dataMap.size()) || ( objectMap != null && index >= objectMap.size())){
                throw new IndexOutOfBoundsException(Messages.getString("DataSet.errorIndexOutOfRange") + index); //$NON-NLS-1$
            }
            if (currentIndex > index) {
                iterator = dataMap == null ? objectMap.keySet().iterator() : dataMap.keySet().iterator();
                currentIndex = 0;
            }
            while (currentIndex < index && iterator.hasNext()) {
                iterator.next();
                currentIndex++;
            }
            Object currentData = iterator.next();
            currentIndex++;
            
            if (objectMap != null) {
                Object[] objects = objectMap.get(currentData);
                Comparable[] comparable = Arrays.copyOf(objects, objects.length, Comparable[].class);
                returnDataSetRow = new DataSetRow(this, comparable);
                return returnDataSetRow;
            }
            
            List<Object> valueList = dataMap.get(currentData);
            if (columnFilter != null) {
                valueList = columnFilter.filter(valueList);
            }

            Comparable[] comparable = valueList.toArray(new Comparable[valueList.size()]);
            if (comparable.length == 0) {
                comparable = new Comparable[1];
                comparable[0] = null;
            }
            returnDataSetRow = new DataSetRow(this, comparable);
            return returnDataSetRow;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sourceforge.sqlexplorer.dataset.mapdb.TalendDataSet#getCurrentPageDataSet()
     */
    @Override
    public DataSet getCurrentPageDataSet() {
        long pageSize = endIndex - startIndex;
        List<Object[]> subList = null;
        if (objectMap != null) {
            subList = MapDBUtils.getDefault().getDataSetDBMapSubList(this.objectMap, startIndex, endIndex, null);
        } else {
            subList = MapDBUtils.getDefault().getDataSetDBMapSubList(this.dataMap, startIndex, endIndex, null);
        }
        if (columnFilter != null) {
            subList = columnFilter.filterArray(subList);
        }

        // the dataset count, we use the smallest one
        int count = (int) (pageSize > subList.size() ? subList.size() : pageSize);
        Comparable[][] compareArray = new Comparable[(count)][this.getColumns().length];
        // use the smallest count to avoid the array out of size error
        for (int i = 0; i < count; i++) {
            Object[] objArray = subList.get(i);
            for (int j = 0; j < objArray.length; j++) {
                compareArray[i][j] = (Comparable) objArray[j];
            }
        }
        return new DataSet(this.columnHeads, compareArray);
    }

}
