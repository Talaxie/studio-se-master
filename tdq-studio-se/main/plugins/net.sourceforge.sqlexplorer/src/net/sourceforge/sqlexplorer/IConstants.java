package net.sourceforge.sqlexplorer;

import net.sourceforge.sqlexplorer.plugin.editors.SQLEditor;

import org.eclipse.swt.graphics.Color;

/*
 * Copyright (C) 2002-2004 Andrea Mazzolini andreamazzolini@users.sourceforge.net
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation; either version 2 of the License, or any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program; if not, write to the Free
 * Software Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */

public interface IConstants {

    // The colour of borders and the fade-to-white colour of the selected tabs
    public static final Color TAB_BORDER_COLOR = new Color(null, 153, 186, 243);

    // Used for confirmations where the user can choose to always have the
    // question answered in the same way in the future
    public enum Confirm {
        ASK,
        YES,
        NO
    }

    String AUTO_COMMIT = "SQLEditor.AutoCommit";

    String AUTO_OPEN_EDITOR = "SQLEditor.AutoOpenEditor";

    String CLIP_EXPORT_COLUMNS = "SQLEditor.ClipExportColumns";

    String CLIP_EXPORT_SEPARATOR = "SQLEditor.ClipExportSeparator";

    String COMMIT_ON_CLOSE = "SQLEditor.CommitOnClose";

    String DATASETRESULT_DATE_FORMAT = "DataSetResult.DateFormat";

    String DATASETRESULT_TIME_FORMAT = "DataSetResult.TimeFormat";

    String DATASETRESULT_FORMAT_DATES = "DataSetResult.FormatDates";

    String DEFAULT_DRIVER = "Drivers.DefaultDriverName";

    String FONT = "SQLEditor.Font.V2";

    String HISTORY_AUTOSAVE_AFTER = "SQLHistory.AutoSaveAfterXXStatements";

    String INTERACTIVE_QUERY_TIMEOUT = "InteractiveConnection.QueryTimeOutSeconds";

    String MAX_SQL_ROWS = "SQLEditor.MaxSQLRows";

    String PRE_ROW_COUNT = "SQLEditor.PreRowCount";

    String SQL_ALT_QRY_DELIMITER = "SQLEditor.AltQueryDelimiter";

    String SQL_ASSIST = "SQLEditor.Assist";

    /** The color key for database tables column names */
    String SQL_COLUMS = "SQLEditor.ColumnsColor";

    String SQL_COMMENT_DELIMITER = "SQLEditor.CommentDelimiter";

    /**
     * The color key for everthing in SQL code for which no other color is specified.
     */
    String SQL_DEFAULT = "SQLEditor.DefaultColor";

    String SQL_EDITOR_CLASS = SQLEditor.class.getName();

    /** The color key for SQL keywords in Java code. */
    String SQL_KEYWORD = "SQLEditor.KeywordColor";

    /** The color key for multi-line comments in Java code. */
    String SQL_MULTILINE_COMMENT = "SQLEditor.MultiLineCommentColor";

    String SQL_QRY_DELIMITER = "SQLEditor.QueryDelimiter";

    /** The color key for single-line comments in Java code. */
    String SQL_SINGLE_LINE_COMMENT = "SQLEditor.SingleLineCommentColor";

    /** The color key for string and character literals in Java code. */
    String SQL_STRING = "SQLEditor.StringColor";

    /** The color key for database tables names */
    String SQL_TABLE = "SQLEditor.TableColor";

    String WARN_LIMIT = "SQLEditor.WarnLimit";

    String WORD_WRAP = "SQLEditor.AutoWrap";

    // When executing the code in an editor, should we clear all the results tabs and
    // empty the messages list
    String CLEAR_RESULTS_ON_EXECUTE = "SQLEditor.ClearResultsOnExecute";

    // Should the tabs just have a number (false), or should they have a snippit
    // of the code (true). Eg "q [select * from my_table...]"
    String USE_LONG_CAPTIONS_ON_RESULTS = "SQLEditor.UseLongCaptionsOnResults";

    // When executing more than one query from an editor, should the execution
    // stop at the first error or carry on until the end logging all the errors
    // in the message tab
    String STOP_ON_ERROR = "SQLEditor.StopOnError";

    String LOG_SUCCESS_MESSAGES = "SQLEditor.LogSuccess Messages";

    // Whether unsaved editors should prompt to be saved when they are closed
    String REQUIRE_SAVE_ON_CLOSE_EDITOR = "SQLEditor.RequireSaveOnClose";

    // Whether Untitled editors should be saved to a scratch pad
    String SAVE_UNTITLED_IN_SCRATCH_PAD = "SQLEditor.SaveUntitledInScratchPad";

    // Whether structured comments are enabled in SQL queries
    String ENABLE_STRUCTURED_COMMENTS = "SQLEditor.EnableStructuredComments";

    // Debug logging level for queries
    String QUERY_DEBUG_LOG_LEVEL = "SQLEditor.QueryDebugLog";

    String QUERY_DEBUG_OFF = "off";

    String QUERY_DEBUG_FAILED = "failed";

    String QUERY_DEBUG_ALL = "all";

    // Yes/No/Ask confirmations
    String CONFIRM_YNA_SAVING_INSIDE_PROJECT = "Confirm.SavingOutsideProject";

    // Boolean confirmations
    String CONFIRM_BOOL_CLOSE_ALL_CONNECTIONS = "Confirm.CloseAllConnections";

    String CONFIRM_BOOL_CLOSE_CONNECTION = "Confirm.CloseConnection";

    String CONFIRM_BOOL_SHOW_DIALOG_ON_QUERY_ERROR = "Confirm.ShowDialogOnQueryError";

    String CONFIRM_BOOL_WARN_LARGE_MAXROWS = "Confirm.WarnIfLargeLimit";
}
