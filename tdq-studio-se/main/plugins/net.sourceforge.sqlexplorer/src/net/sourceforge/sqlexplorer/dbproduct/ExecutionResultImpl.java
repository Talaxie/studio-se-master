/**
 * 
 */
package net.sourceforge.sqlexplorer.dbproduct;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.dbproduct.DatabaseProduct.ExecutionResults;
import net.sourceforge.sqlexplorer.parsers.NamedParameter;

public final class ExecutionResultImpl implements ExecutionResults {

    // Current state - IE, which set of results we're currently looking for
    private enum State {
        PRIMARY_RESULTS, // We're providing the main results, from Statement.getResults()
        SECONDARY_RESULTS, // We're providing resultsets from Statement.getMoreResults()
        PARAMETER_RESULTS, // We're returning resultsets from output parameters
        OUTPUT_PARAMETERS, // We're returning a fake result set listing output parameters
        CLOSED
        // All done
    }

    /*
     * Temporary class used by nextDataSet() to collate parameters
     */
    private class ParamValues {

        private NamedParameter param;

        private ArrayList<Integer> columnIndexes = new ArrayList<Integer>();

        public ParamValues(NamedParameter param, int columnIndex) {
            super();
            this.param = param;
            add(columnIndex);
        }

        public void add(int columnIndex) {
            this.columnIndexes.add(new Integer(columnIndex));
        }
    }

    private State state = State.PRIMARY_RESULTS;

    private AbstractDatabaseProduct product;

    private Statement stmt;

    private LinkedList<NamedParameter> parameters;

    private int maxRows;

    private int paramColumnIndex;

    private Iterator<NamedParameter> paramIter;

    private int updateCount;

    private ResultSet currentResultSet;

    // calss name of hive statement,DO NOT modify the string of "HivePreparedStatement".
    private final String hiveStatementClassName = "HivePreparedStatement";

    public ExecutionResultImpl(AbstractDatabaseProduct product, Statement stmt, boolean hasResults,
            LinkedList<NamedParameter> parameters, int maxRows) throws SQLException {
        super();
        this.product = product;
        this.stmt = stmt;
        this.parameters = parameters;
        this.maxRows = maxRows;

        if (!hasResults) {
            state = State.SECONDARY_RESULTS;
        }
    }

    public DataSet nextDataSet() throws SQLException {
        // Close the current one
        if (currentResultSet != null) {
            currentResultSet.close();
            currentResultSet = null;
        }

        // Anything more to do?
        if (state == State.CLOSED) {
            return null;
        }

        // Get the first set
        if (state == State.PRIMARY_RESULTS) {
            currentResultSet = stmt.getResultSet();
            state = State.SECONDARY_RESULTS;
            if (currentResultSet != null) {
                return new DataSet(currentResultSet, null, maxRows);
            }
        }

        // While we have more secondary results (i.e. those that come directly from Statement but after the first
        // getResults())
        while (state == State.SECONDARY_RESULTS) {
            // MOD msjian TDQ-5927, fix the "statement is not executing" error for SQLite.
            if ("org.sqlite.PrepStmt".equals(stmt.getClass().getName())) {
                return null;
            }

            // MOD qiongli TDQ-5907, HivePreparedStatement doesn't support method 'getMoreResults()'.
            // MOD xqliu 2014-03-18
            // if the the connectoin type is hive, when call stmt.getMoreResults() will throw exception, so need to
            // judge the connection type first, if it is hive connection just call "updateCountState()", else call
            // stmt.getMoreResults() to decide to execute "currentResultSet = stmt.getResultSet()" or call
            // "updateCountState()"
            if (stmt.getClass().getName().contains(hiveStatementClassName)) {
                updateCountState();
            } else if (stmt.getMoreResults()) {
                currentResultSet = stmt.getResultSet();
            } else {
                updateCountState();
            }
            // ~ xqliu 2014-03-18
        }

        // Got one? Then exit
        if (currentResultSet != null) {
            this.updateCount += stmt.getUpdateCount();
            return new DataSet(currentResultSet, null, maxRows);
        }

        // Look for output parameters which return resultsets
        if (state == State.PARAMETER_RESULTS && parameters != null) {
            CallableStatement stmt = (CallableStatement) this.stmt;
            if (paramIter == null) {
                paramIter = parameters.iterator();
                paramColumnIndex = 1;
            }
            while (paramIter.hasNext()) {
                NamedParameter param = paramIter.next();
                if (param.getDataType() == NamedParameter.DataType.CURSOR) {
                    currentResultSet = product.getResultSet(stmt, param, paramColumnIndex);
                }
                paramColumnIndex++;
                if (currentResultSet != null) {
                    return new DataSet(Messages.getString("DataSet.Cursor") + ' ' + param.getName(), currentResultSet, null,
                            maxRows);
                }
            }
        }

        // Generate a dataset for output parameters
        state = State.CLOSED;
        if (parameters == null) {
            return null;
        }
        if (!(stmt instanceof CallableStatement)) {
            return null;
        }
        CallableStatement stmt = (CallableStatement) this.stmt;
        TreeMap<NamedParameter, ParamValues> params = new TreeMap<NamedParameter, ParamValues>();
        int columnIndex = 1;
        int numValues = 0;
        for (NamedParameter param : parameters) {
            if (param.getDataType() != NamedParameter.DataType.CURSOR && param.isOutput()) {
                ParamValues pv = params.get(param);
                if (pv == null) {
                    params.put(param, new ParamValues(param, columnIndex));
                } else {
                    pv.add(columnIndex);
                }
                numValues++;
            }
            columnIndex++;
        }
        if (numValues == 0) {
            return null;
        }
        Comparable[][] rows = new Comparable[numValues][2];
        columnIndex = 1;
        int rowIndex = 0;
        for (ParamValues pv : params.values()) {
            int valueIndex = 1;
            for (Integer index : pv.columnIndexes) {
                Comparable[] row = rows[rowIndex++];
                row[0] = pv.param.getName();
                if (pv.columnIndexes.size() > 1) {
                    row[0] = (pv.param.getName() + '[' + valueIndex + ']');
                } else {
                    row[0] = pv.param.getName();
                }
                row[1] = stmt.getString(index);
                valueIndex++;
            }
        }
        return new DataSet(Messages.getString("DataSet.Parameters"), new String[] {
                Messages.getString("SQLExecution.ParameterName"), Messages.getString("SQLExecution.ParameterValue") }, rows);
    }

    /**
     * update the count or state.
     * 
     * @throws SQLException
     */
    private void updateCountState() throws SQLException {
        int updateCount = stmt.getUpdateCount();
        if (updateCount != -1 && updateCount != 0) {
            this.updateCount += updateCount;
        } else {
            state = State.PARAMETER_RESULTS;
        }
    }

    public void close() throws SQLException {
        try {
            stmt.close();
        } catch (SQLException e) {
            // Nothing
        }
        if (currentResultSet != null) {
            currentResultSet.close();
        }
    }

    public int getUpdateCount() throws SQLException {
        return updateCount;
    }
}
