/*
 * Copyright (C) 2007 SQL Explorer Development Team
 * http://sourceforge.net/projects/eclipsesql
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.sqlexplorer.parsers;

import java.util.Iterator;
import java.util.StringTokenizer;

import net.sourceforge.sqlexplorer.IConstants;
import net.sourceforge.sqlexplorer.parsers.Tokenizer.Token;
import net.sourceforge.sqlexplorer.parsers.scp.StructuredCommentException;
import net.sourceforge.sqlexplorer.parsers.scp.StructuredCommentParser;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;

import org.eclipse.core.runtime.Preferences;

/**
 * This is the original QueryTokenizer implementation from SQLExplorer v3.0; it's included
 * for completness and for backward compatibility but be warned this code has a few bugs 
 * (eg regarding comments).  
 * 
 * This parser is based on scanning the SQL text looking for separators (eg ";", "go", or 
 * "/") that show where to split the text into separate queries; conversely, the new 
 * AbstractSyntaxQueryParser derived style is based on scanning the SQL text for language grammar
 * tokens so that it can split the SQL by natural syntax.
 * 
 * @modified John Spackman
 */
public class BasicQueryParser extends AbstractQueryParser {

    private static String _alternateQuerySeparator;

    private static String _querySeparator;

    private String _sQuerys;

    private String _sNextQuery;
    
    private int lineNo = 1;
    
    private CharSequence sql;

    /**
     * These characters at the beginning of an SQL statement indicate that it is
     * a comment.
     */
    private String _solComment;
    
	public BasicQueryParser(CharSequence sql) {
		super();
	    Preferences prefs = SQLExplorerPlugin.getDefault().getPluginPreferences();
	    String querySeparator = prefs.getString(IConstants.SQL_QRY_DELIMITER);
	    String alternateSeparator = prefs.getString(IConstants.SQL_ALT_QRY_DELIMITER);
	    String solComment = prefs.getString(IConstants.SQL_COMMENT_DELIMITER);
	    
        if (querySeparator != null && querySeparator.trim().length() > 0) {
            _querySeparator = querySeparator.substring(0, 1);
        } else {
            // failsave..
            _querySeparator = ";";
        }
        
        if (alternateSeparator != null && alternateSeparator.trim().length() > 0) {
            _alternateQuerySeparator = alternateSeparator;    
        } else {
            _alternateQuerySeparator = null;
        }        

        if (solComment != null && solComment.trim().length() > 0) {
            _solComment = solComment;
        } else {
            _solComment = null;
        }
        
        if (sql == null)
        	sql = "";
        this.sql = sql;
	}

    /* (non-JavaDoc)
	 * @see net.sourceforge.sqlexplorer.parsers.QueryParser#parse()
	 */
	public void parse() throws ParserException {
		if (sql == null)
			return;

	    Preferences prefs = SQLExplorerPlugin.getDefault().getPluginPreferences();
		if (prefs.getBoolean(IConstants.ENABLE_STRUCTURED_COMMENTS)) {
			StringBuffer buffer = new StringBuffer(sql.toString());
			Tokenizer tokenizer = new Tokenizer(buffer);
			StructuredCommentParser structuredComments = new StructuredCommentParser(this, buffer);
			
			// Otherwise just use a standard tokenizer
			try {
				Token token;
				while ((token = tokenizer.nextToken()) != null) {
					if (token.getTokenType() == Tokenizer.TokenType.EOL_COMMENT ||
							token.getTokenType() == Tokenizer.TokenType.ML_COMMENT) {
						structuredComments.addComment(token);
					}
				}
			}catch(StructuredCommentException e) {
				
			}
			
			// Do the structured comments and then reset the tokenizer
			structuredComments.process();
			tokenizer.reset();
			tokenizer = null;
			sql = buffer;
		}
        
        _sQuerys = prepareSQL(sql.toString());
        _sNextQuery = doParse();
        sql = null;
	}

	/* (non-JavaDoc)
	 * @see net.sourceforge.sqlexplorer.parsers.QueryParser#addLineNoOffset(int, int)
	 */
	public void addLineNoOffset(int originalLineNo, int numLines) {
		// Nothing - not supported
	}

	/* (non-JavaDoc)
	 * @see net.sourceforge.sqlexplorer.parsers.QueryParser#adjustLineNo(int)
	 */
	public int adjustLineNo(int lineNo) {
		return lineNo; // Not implemented
	}

	/* (non-JavaDoc)
	 * @see net.sourceforge.sqlexplorer.parsers.QueryParser#iterator()
	 */
	public Iterator<Query> iterator() {
		return new Iterator<Query>() {

			/* (non-JavaDoc)
			 * @see java.util.Iterator#hasNext()
			 */
			public boolean hasNext() {
		        return _sNextQuery != null;
			}

			/* (non-JavaDoc)
			 * @see java.util.Iterator#next()
			 */
			public Query next() {
				return nextQuery();
			}

			/* (non-JavaDoc)
			 * @see java.util.Iterator#remove()
			 */
			public void remove() {
				throw new IllegalAccessError();
			}
			
		};
	}

	/**
	 * Retrieves the next Query in the sequence
	 * @return
	 */
    public Query nextQuery() {
    	if (_sNextQuery == null)
    		return null;
		String sReturnQuery = _sNextQuery;
		int thisLineNo = lineNo;
        _sNextQuery = doParse();
        if (sReturnQuery == null)
        	return null;
        if (sReturnQuery.startsWith("--"))
        	return nextQuery();
    	
        return new BasicQuery(sReturnQuery, thisLineNo);
    }

    private int findFirstSeparator() {

        String separator = _querySeparator;
        int separatorLength = _querySeparator.length();
        int iQuoteCount = 1;
        int iIndex1 = 0 - separatorLength;
        
        while (iQuoteCount % 2 != 0) {
            
            iQuoteCount = 0;
            iIndex1 = _sQuerys.indexOf(separator, iIndex1 + separatorLength);

            if (iIndex1 > -1) {
                int iIndex2 = _sQuerys.lastIndexOf('\'', iIndex1 + separatorLength - 1);
                while (iIndex2 != -1) {
                    if (_sQuerys.charAt(iIndex2 - 1) != '\\') {
                        iQuoteCount++;
                    }
                    iIndex2 = _sQuerys.lastIndexOf('\'', iIndex2 - 1);
                }
            } else {
                return -1;
            }
        }
        
        return iIndex1;
    }

    private int findFirstAlternateSeparator() {

        if (_alternateQuerySeparator == null) {
            return -1;
        }

        String separator = _alternateQuerySeparator;
        int separatorLength = _alternateQuerySeparator.length();
        int iQuoteCount = 1;
        int iIndex1 = 0 - separatorLength;
        
        while (iQuoteCount % 2 != 0) {
            
            iQuoteCount = 0;
            iIndex1 = _sQuerys.indexOf(separator, iIndex1 + separatorLength);

            if (iIndex1 > -1) {
                int iIndex2 = _sQuerys.lastIndexOf('\'', iIndex1 + separatorLength - 1);
                while (iIndex2 != -1) {
                    if (_sQuerys.charAt(iIndex2 - 1) != '\\') {
                        iQuoteCount++;
                    }
                    iIndex2 = _sQuerys.lastIndexOf('\'', iIndex2 - 1);
                }
            } else {
                return -1;
            }
        }
        
        return iIndex1;
    }

    public String doParse() {
        
        if (_sQuerys.length() == 0) {
            return null;
        }
        
        // MOD sizhaoliu 2012-04-13 TDQ-5042 avoid empty result because of the script description
        if (_sQuerys.startsWith("--")) {
            int nlIndex = _sQuerys.indexOf("\n");
            if (nlIndex > 0) {
                String sNextQuery = _sQuerys.substring(0, nlIndex);
                _sQuerys = _sQuerys.substring(nlIndex + 1).trim();
                return sNextQuery;
            }
        }
        
        String separator = _querySeparator;
                
        int indexSep = findFirstSeparator();
        int indexAltSep = findFirstAlternateSeparator();
        
        if (indexAltSep > -1) {
            if (indexSep < 0 || indexAltSep < indexSep) {
                // use alternate separator
                separator = _alternateQuerySeparator;
            }
        }
        
        int separatorLength = separator.length();
        int iQuoteCount = 1;
        int iIndex1 = 0 - separatorLength;
        
        while (iQuoteCount % 2 != 0) {
            
            iQuoteCount = 0;
            iIndex1 = _sQuerys.indexOf(separator, iIndex1 + separatorLength);

            if (iIndex1 > -1) {
                int iIndex2 = _sQuerys.lastIndexOf('\'', iIndex1 + separatorLength - 1);
                while (iIndex2 != -1) {
                    if (_sQuerys.charAt(iIndex2 - 1) != '\\') {
                        iQuoteCount++;
                    }
                    iIndex2 = _sQuerys.lastIndexOf('\'', iIndex2 - 1);
                }
            } else {
                String sNextQuery = _sQuerys;
                _sQuerys = "";
                if (_solComment != null && sNextQuery.startsWith(_solComment)) {
                    return doParse();
                }
                return replaceLineFeeds(sNextQuery);
            }
        }
        String sNextQuery = _sQuerys.substring(0, iIndex1);
        _sQuerys = _sQuerys.substring(iIndex1 + separatorLength).trim();
        if (_solComment != null && sNextQuery.startsWith(_solComment)) {
            return doParse();
        }
        return replaceLineFeeds(sNextQuery);
    }

    private String prepareSQL(String sql) {
        StringBuffer results = new StringBuffer(1024);

        for (StringTokenizer tok = new StringTokenizer(sql.trim(), "\n", false); tok.hasMoreTokens();) {
            String line = tok.nextToken();
            if (!line.startsWith(_solComment)) {
                results.append(line).append('\n');
            }
        }

        // JHS 2007-07-16
        // PL/SQL does not like having a forced CR (presumably only a Windows issue)
        for (int i = 0; i < results.length(); ) {
        	if (results.charAt(i) == '\r')
        		results.deleteCharAt(i);
        	else 
        		i++;
        }
        
        return results.toString();
    }

    private String replaceLineFeeds(String sql) {
        StringBuffer sbReturn = new StringBuffer();
        int iPrev = 0;
        int linefeed = sql.indexOf('\n');
        int iQuote = -1;
        while (linefeed != -1) {
            iQuote = sql.indexOf('\'', iQuote + 1);
            if (iQuote != -1 && iQuote < linefeed) {
                int iNextQute = sql.indexOf('\'', iQuote + 1);
                if (iNextQute > linefeed) {
                    sbReturn.append(sql.substring(iPrev, linefeed));
                    sbReturn.append('\n');
                    iPrev = linefeed + 1;
                    linefeed = sql.indexOf('\n', iPrev);
                }
            } else {
                linefeed = sql.indexOf('\n', linefeed + 1);
            }
        }
        sbReturn.append(sql.substring(iPrev));
        
        // Count up the line numbers.  This is a dirty and inefficient hack but as the parser 
        //	is to be completely rewritten soon anyway... >:)
        for (int i = 0; i < sbReturn.length(); i++)
        	if (sbReturn.charAt(i) == '\n')
    			lineNo++;
        
        return sbReturn.toString();
    }

}
