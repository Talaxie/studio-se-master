Teradata JDBC Driver 13.00.00.20

Part of the Teradata Tools and Utilities 13.00 product suite


Get the Latest Software
-----------------------

We are always adding new features to the Teradata JDBC Driver, and
fixing issues that might affect your application.

If you obtained this release of the Teradata JDBC Driver from
physical media, please check whether a newer version is available
on the http://www.teradata.com Teradata Download Center in the
Teradata JDBC Driver section.


System Requirements
-------------------

This release of the Teradata JDBC Driver requires JDK/JRE 1.4, 5.0, or 6.0.

Note that IBM WebSphere Application Server 5.0 is not supported, because
WebSphere 5.0 uses JDK 1.3.1.

This release of the Teradata JDBC Driver supports Teradata Database V2R6.0,
V2R6.1, V2R6.2, 12.00, and 13.00.


What's New
----------

- New Teradata JDBC Driver class names are available.
   - For JDBC URL connections: com.teradata.jdbc.TeraDriver
   - For WebSphere Data Sources: com.teradata.jdbc.TeraConnectionPoolDataSource
  The old class names will continue to work; however, a warning message
  will be printed as a reminder to switch over to the new class names.
  Please change your applications and data source definitions at your
  earliest convenience, because the old class names will only be supported
  for a limited number of future releases.

- Remove tdgssjava.jar from your classpath. The tdgssjava.jar file is no
  longer required by the Teradata JDBC Driver; the classes formerly in
  tdgssjava.jar now reside in terajdbc4.jar. This reduces the number of jar
  files from three to two, and simplifies deployment and maintenance.

- Teradata Database 13.00 supports Java User-Defined Functions (UDFs).

- With Teradata Database 13.00, Java Stored Procedures may now return dynamic
  result sets.

- The Teradata JDBC Driver now provides login timeout functionality using the
  value set with DriverManager setLoginTimeout or DataSource setLoginTimeout.

- The Teradata JDBC Driver now provides FastExport support. Setting the TYPE
  connection parameter to FASTEXPORT instructs the JDBC Driver to use the
  Teradata FastExport protocol for PreparedStatement SELECTs that are
  compatible with FastExport.

- The Teradata JDBC Driver's JDBC FastLoad feature was changed to provide
  additional validation of PreparedStatement parameter values, in order to
  reduce the occurrence of rows placed into FastLoad error tables by the
  Teradata Database.

- The Teradata JDBC Driver was changed to no longer require the TNANO and
  TSNANO connection parameters for JDBC FastLoad. JDBC FastLoad now determines
  the scale of TIME and TIMESTAMP destination columns and automatically sends
  TIME and TIMESTAMP data values using the same scale. The TNANO and TSNANO
  connection parameters are now ignored for JDBC FastLoad.

- The Teradata JDBC Driver now works with Teradata Database 12.00 and later to
  provide more precise classification for DATE, TIME, and TIMESTAMP values bound
  to PreparedStatement question-mark parameter markers, thereby enabling the
  Teradata Database to provide better implicit data type conversion for those
  data types.

- With Teradata Database 12.00 and later, the Teradata JDBC Driver now sends
  java.sql.Date values to the Teradata Database as DATE values using the ANSIDate
  DateForm. This provides Y2K-compliant implicit conversion for java.sql.Date
  values that are specified with the PreparedStatement/CallableStatement setDate
  or setObject methods, and sent to destination CHAR/VARCHAR columns and
  parameters. A legacy application requiring non-Y2K-compliant behavior can use a
  Teradata-specific Escape Syntax function to choose non-Y2K-compliant behavior.

- Support for Teradata Database 13.00 QueryBand PROXYUSER user impersonation,
  enabling middle-tier applications to utilize connection pooling and also assert
  end-user identities and roles for access-rights checking and auditing of queries.


Release Notes
-------------

This section highlights issues that you should be aware of when upgrading to
the 13.00.00.20 release of the Teradata JDBC Driver. Please refer to the Teradata
JDBC Driver User Guide for more information about the driver.

This release includes changes to address the following DRs:

DR 139320 add support for session charsets KANJISJIS_0S and KANJIEUC_0U in JDBC FastLoad
DR 139380 add support for additional session charsets in JDBC FastExport
DR 140148 add PERIOD type name to SQLWarning message when attempting JDBC FastLoad into table with PERIOD data type
DR 140534 NullPointerException from PreparedStatement setNull Types.STRUCT when using V2R6.1

This release includes changes to address the following DRs, originally included
in release 13.00.00.19:

DR 101075 Include TTU client version in Client Config parcel built by JDBC
DR 138870 Some invalid JDBC methods throw NullPointerException

This release includes changes to address the following DRs, originally included
in release 13.00.00.18:

DR 115639 input and output java.sql.Struct values for Structured and Internal UDT values
DR 117048 JDBC support for Period Data Types as java.sql.Struct
DR 139824 DatabaseMetaData getColumns should ignore Error 3523 The user does not have any access to dbname.tabname

This release includes changes to address the following DRs, originally included
in release 13.00.00.17:

DR 139774 Reduce finalizer locking for already-closed ResultSets

This release includes changes to address the following DRs, originally included
in release 13.00.00.16:

DR 124457 enable PreparedStatement batch execution to return individual success and error conditions for each parameter set

This release includes changes to address the following DRs, originally included
in release 13.00.00.15:

DR 123191 support TD 13.10 TASM workload management

This release includes changes to address the following DRs, originally included
in release 13.00.00.14:

DR 136315 Coverity found null pointer dereferences in JDBC Driver

This release includes changes to address the following DRs, originally included
in release 13.00.00.13:

DR 127101 support Extended Object Names in parcels

This release includes changes to address the following DRs, originally included
in release 13.00.00.12:

DR 134440 JDBC Error 858 is returned when single & double quotes are combined in the same query & a '?' is located in the quotes

This release includes changes to address the following DRs, originally included
in release 13.00.00.11:

DR 135882 OutOfMemoryError for getMoreResults with multi-statement request returning large result set
DR 136276 ResultSetMetaData getPrecision for DATE column (regression caused by DR 106221)
DR 136380 getDate on CHAR/VARCHAR column containing integer date values throws SQLException with error 1332

This release includes changes to address the following DRs, originally included
in release 13.00.00.09:

DR 104643 CallableStatement.getObject needs to return Time or Timestamp objects for TIME or TIMESTAMP data types
DR 106221 ResultSet and CallableStatement getDate with Calendar parameter to use Calendar's TimeZone to construct Date
DR 106222 ResultSet and CallableStatement getTime/getTimestamp with Calendar parameter to set or use Calendar's TimeZone
DR 134413 PreparedStatement/CallableStatement setDate with Calendar parameter to use Calendar's TimeZone to send DATE value
DR 134573 Enable ResultSet and CallableStatement getTimestamp to return complete TIME value fractional seconds
DR 135093 DatabaseMetaData getColumnPrivileges support for leading spaces in database object names

This release includes changes to address the following DRs, originally included
in release 13.00.00.08:

DR 122317 support FastExport direct export without spooling
DR 122340 provide TRUSTED_SQL connection parameter and {fn teradata_untrusted} escape function
DR 129206 SQL keyword changes and SQLState mappings for TD 13.10

This release includes changes to address the following DRs, originally included
in release 13.00.00.07:

DR 120610 Clean up Coverity defects found in 13g TDGSS JAVA LIBRARIES
DR 123280 GSSException from initSecContext needs to provide the exception cause for troubleshooting
DR 123711 change remaining sample programs to use CHARSET=UTF8 after DBS DR 118299 is available
DR 124683 TDGSSJAVA Kerberos fails when Data Encryption specified and server is MPRAS
DR 125601 TdgssLibraryConfigFile.xml and TdgssUserConfigFile.xml incorrectly specified DH G key in litle endian
DR 132356 TDGSS Java LDAP Mechanism does not handle Non "US-ASCII" characters in logdata
DR 132545 JDBC does not send correct charset in Unicode LDAP logons
DR 133045 If a password includes certain escape chars, the UPN created should have those chars escaped
DR 133291 Modify JDBC sample program for Transaction Isolation levels
DR 133304 Support PreparedStatement setNull with PreparedStatement setClob or setBlob in a batch insert request
DR 133717 Change log level for socket read timeout exceptions from ERROR to INFO

This release includes changes to address the following DRs, originally included
in release 13.00.00.06:

DR 132370 DatabaseMetaData getColumns support for Period and Geospatial data types

This release includes changes to address the following DRs, originally included
in release 13.00.00.05:

DR 132251 improve Thread reference usage for pooled Statement objects

This release includes changes to address the following DRs, originally included
in release 13.00.00.04:

DR 98096 In ANSI mode w/auto commit on, an unnecessary commit is sent after a prepare
DR 99487 enable use of PreparedStatement batch update when LOB_SUPPORT=off
DR 113453 CONNECT_FAILURE_TTL connection parameter
DR 131226 provide connection parameters for TCP socket options
DR 131929 Enable TCP connection parameter to control TCP send and receive buffer sizes

This release includes changes to address the following DRs, originally included
in release 13.00.00.03:

DR 131214 Provide incremental fetch for Console connection result sets

This release includes changes to address the following DRs, originally included
in release 13.00.00.02:

DR 122326 provide a Raw connection type
DR 129026 use INDIC mode for JDBC FastExport
DR 130385 JDBC Driver support for STARTUP string specified by CREATE/MODIFY USER
DR 130413 Connection.getTransactionIsolation may be incorrect after SET SESSION CHARACTERISTICS command

This release includes changes to address the following DRs, originally included
in release 13.00.00.01:

DR 92048 Add COP connection parameter and DataSource property
DR 92605 ResultSet getter methods should throw exception for invalid RS cursor position
DR 95122 remove remaining code for obsolete feature: DR63489 connection parameter
DR 95817 remove undocumented connection pool implementation
DR 96825 remove obsolete CASE_SENSITIVE connection parameter and DataSource property
DR 97757 remove undocumented and obsolete connection parameters
DR 99263 add ConnectionPoolDataSource getters and setters defined by JDBC 3.0 spec 
DR 101602 Exception thrown when a stored procedure called w/ literal IN value & ? OUT vals
DR 102420 return true from DatabaseMetaData.supportsStatementPooling
DR 102470 IndexOutOfBoundsException when a connection string parameter option is missing
DR 103542 Prep stmt batch: setObject/Types.TINYINT and setByte or setObject for same parameter throws exception w/error 857
DR 106528 ResultSet methods isBeforeFirst and isLast return incorrect values for empty result set
DR 108938 Change DatabaseMetaData.getColumns to use the current USEXVIEWS setting
DR 109268 exception with V2R6.0 and earlier when trying to CALL an SP with an OUT parameter with leading spaces in its name
DR 110190 PreparedStatement.execute throws exception for Execute Macro with '?' in macro name
DR 110895 JDBC returns IndexOutOfBoundsException when getObject(index) and other get methods are called with an invalid index
DR 113199 ArrayIndexOutOfBoundException from a reused CallableStatement.setNull with OUT parameter
DR 113547 DBS Error 3130 "Response limit exceeded" while executing Statement.executeBatch() method
DR 113577 scrollable ResultSet not returned as requested from Statement.executeQuery after Statement.executeBatch
DR 113847 SQLException w/error 3760 when attempting to call SP with a space in its name on V2R6.0 and earlier 
DR 114195 {fn TIMESTAMPADD(SQL_TSI_MONTH,count,ts)} returns error when input day-of-month exceeds target month's number of days
DR 115508 NullPointerException from executeXXX methods when invalid charset specified for Java Stored Procedure default connection
DR 116004 JDBC Driver not following Java naming standards or interfaces causing rework
DR 116442 support DNS hostname aliases with Kerberos authentication
DR 120323 BatchUpdateException does not return correct update count while using SELECT statement in Statement.executeBatch
DR 121210 JDBC Driver support for NoPI tables
DR 124418 Throw SQLException chain for DBS error 7980 from CALL to SQLJ stored procedure
DR 125135 provide JDBC sample program to demonstrate use of Geospatial data
DR 126018 additional support for select-list parameter markers
DR 129058 DatabaseMetaData.getColumns support for object names with leading spaces in Data Dictionary
DR 129638 support KANJISJIS_0S, KANJIEUC_0U, LATIN1252_0A with MONITOR partition

This release includes changes to address the following DRs, originally included
in release 12.00.00.110:

DR 132603 Login timeout may wait too long

This release includes changes to address the following DRs, originally included
in release 12.00.00.109:

DR 132157 support PreparedStatement batch update with no parameter markers

This release includes changes to address the following DRs, originally included
in release 12.00.00.106:

DR 129949 Conditional connection is not terminated by JDBC driver if NEW_PASSWORD is invalid

This release includes changes to address the following DRs, originally included
in release 12.00.00.105:

DR 105976 getColumns & getBestRowIdentifier return incorrect values for COLUMN_SIZE for char types on Japanese-enabled DBS
DR 125463 remove unneeded trailing semicolons in SQL request text in sample programs
DR 127065 DatabaseMetaData.getIndexInfo fails to return Unique Primary Index when using UTF8 session character set

This release includes changes to address the following DRs, originally included
in release 12.00.00.104:

DR 69205 send DATE, TIME, and TIMESTAMP type codes to DBS for better implicit data type conversions
DR 97560 provide Teradata-specific escape syntax to set JDBC driver log level
DR 101194 driver should downgrade scrollable result set to forward-only if LOB_SUPPORT=off
DR 102357 PreparedStatement.addBatch exception: setTime/Timestamp & setNull TIME/TIMESTAMP
DR 107027 implement login timeout functionality - use value set by DriverManager.setLoginTimeout or DataSource.setLoginTimeout
DR 108348 support returning dynamic result sets from a Java stored procedure
DR 110511 Modify the Teradata JDBC driver to send StatementInfo parcels from the client in a request message
DR 111264 support FastExport
DR 112298 JDBC FastLoad data validation
DR 112564 Change ClearCase directory structure, and change all package statements to remove "ncr"
DR 112565 Change all copyright comments that contain 'NCR'
DR 112566 Change error message prefixes that contain '[NCR]'
DR 112569 Put the tdgssjava classes into the terajdbc4.jar file
DR 112572 Change the SQL connection Logon & Logoff to use the 'Generic' classes
DR 113344 add a reason for not invoking JDBC FastLoad to the PreparedStatement SQLWarning chain
DR 113678 provide SQLException chain and SQLWarning chain for create/replace XSP
DR 114956 support user impersonation with QueryBand
DR 114981 provide error code and SQLState at the beginning of all SQLException messages
DR 115170 avoid sending Continue/Cancel with RPO=S if Resp/BigResp was sent and EndRequest was received
DR 115627 Support Java User-Defined Functions (UDFs)
DR 115664 support Novell eDirectory for use with the LDAP mechanism
DR 115855 PreparedStatement and CallableStatement setObject should send fractional seconds of Time value to database
DR 116276 support TDGSS mechanism attribute GenerateCredentialFromLogon - move username@@password into mechdata
DR 116279 Translate new JDBC 13.0 error messages into Japanese
DR 116489 SQL keyword changes and SQLState mappings for TD 13.0
DR 116761 Support the consumption of dynamic result sets in an SQL stored procedure
DR 118803 KATAKANAEBCDIC session character set is not supported - omit from JDBC Driver User Guide
DR 120309 support data encryption and user authentication for high-level JDBC FastLoad and FastExport
DR 120378 support a literal IP address as a Teradata Database hostname
DR 120705 Test case prepareNull.java failed with the following exception message against TD 13d build (WS 03)
DR 121130 getParameterMetaData() fails with multi-statement macro and multi-statement requests
DR 121311 if DBS error occurs when inserting LOBs using PreparedStatement batch, driver violates protocol and DBS ends connection
DR 121952 avoid SQLException from Statement.close if connection is already closed
DR 122425 JDBC Driver sent Abort request message for completed request while subsequent ET request was in progress
DR 122427 NullPointerException thrown if LOB length is 0 and a read(data) is performed with data array having nonzero length
DR 123376 Modify JDBC DatabaseMetaData.getColumnPrivileges to handle new access rights added for DBS 13.0
DR 123428 WebSphere Application Server 6.1 DataSource Test Connection failed
DR 123694 Test cases PersistDataSource.java and PersistPoolDataSource.java unable to lookup datasource
DR 124800 NullPointerException when connecting to V2R5.0

This release includes changes to address the following DRs, originally included
in release 12.00.00.01:

DR 118048 IndexOutOfBoundsException from ResultSet positioning methods for large scrollable result set with V2R6.2 and earlier
DR 118571 WebSphere DataSource custom property CHARSET not working for PreparedStatement.setString non-ASCII characters
DR 119329 TeraEncrypt: Error tdgss-stack-trace-begin>>> java.lang.ArrayIndexOutOfBoundsException (shipped with tdgssjava 12.0.1.2)

This release includes changes to address the following DRs, originally included
in release 12.00.00.00:

DR 51544 Updateable result sets. 
DR 58075 Blob and Clob update methods added by the JDBC 3.0 specification. 
DR 92927 handle database password expiration. 
DR 92937 add connection parameter to choose X views or non-X views for metadata. 
DR 94241 provide getMoreResults (KEEP_CURRENT_RESULT) for multistmt req cursor positioning. 
DR 99338 certify WebLogic 9.1 on Windows. 
DR 99339 certify WebLogic 9.1 on Solaris/SPARC. 
DR 99341 certify WebLogic 9.1 on Linux. 
DR 99343 certify ColdFusion MX 7 on Windows. 
DR 101800 support "jdbc:default:connection" URL for use in a Java Stored Procedure. 
DR 102453 JDBC support for Stored Procedure Dynamic Result Sets. 
DR 102730 support full ANSI MERGE statement. 
DR 102732 support the SET QUERY_BAND statement. 
DR 102852 add TD 12.0 reserved words to DatabaseMetaData.getSQLKeywords. 
DR 103778 certify with JBoss 3.2.3 on Windows.
DR 103780 certify with WebSphere 6.1 on Windows. 
DR 103781 certify with WebSphere 6.1 on AIX. 
DR 103782 certify with WebSphere 6.1 on Solaris/SPARC. 
DR 104096 update application server documentation for TTU 12.0 release. 
DR 104748 certify Windows XP Professional x64 on EM64T with JDK 5.0 32-bit. 
DR 104749 certify Windows XP Professional x64 on EM64T with JDK 5.0 64-bit. 
DR 104750 certify 32-bit Windows Server 2003 on EM64T with JDK 5.0 32-bit. 
DR 107100 ResultSet and CallableStatement getString for BYTE/VARBYTE value to use session charset instead of JVM default charset.
DR 107197 JDBC-related corrections to the Introduction to Teradata Warehouse.
DR 108118 UNIX-Kerberos target name is case-sensitive, so Teradata JDBC Driver must change Teradata@m/c to TERADATA@m/c. 
DR 108385 Change Teradata JDBC Driver version to 12.0.0.1. 
DR 108390 accommodate DBS version change from V2R7.0 to 12.0. 
DR 109658 support CHARSET= connection parameter for jdbc:default:connection for Java Stored Procedures. 
DR 109689 Corrections for UNIX classpath listed in Chapter 2 section "Running a Sample Application".
DR 109728 Certify TTU 12.0 JDBC Driver with JBoss 4.0 and JDK 5.0. 
DR 110204 Statement.getMoreResults (KEEP_CURRENT_RESULT) to support only TYPE_SCROLL_INSENSITIVE.
DR 110539 Statement.execute fails for a CALL to a stored procedure.
DR 112657 SQLState mappings for External Stored Procedure error codes.
DR 112978 accommodate 12m DBS DR 110445 change to DBC.Columns.ColumnName value 'RETURN' is now 'RETURN0'.

This release includes changes to address the following DRs, originally included
in release 03.04.00.06:

DR 131684 add JDBC FastLoad support for EJB transactions with multiple PreparedStatements

This release includes changes to address the following DRs, originally included
in release 03.04.00.05:

DR 131418 support DBS_PORT connection parameter with TYPE=FASTLOAD and FASTEXPORT

This release includes changes to address the following DRs, originally included
in release 03.04.00.03:

DR 96980 GtwConfigParcel could fail when new gateway features added
DR 97103 improve correlation of TDSession objects with log messages
DR 98176 avoid sending cancel request if RESP/BIGRESP is used and ENDREQUEST received
DR 100090 modify driver to avoid DBS crash when using LOB_SUPPORT=off and large result set
DR 106708 add LOG=TIMING measurements
DR 114154 CallableStatement batch support to execute CALL sequentially to work within DBS restriction of single CALL at a time
DR 114470 TTU 8.1 Teradata JDBC Driver 3.3 to support TD 12.0 (backport DR 108390)
DR 115269 improve JDBC FastLoad exception handling of PreparedStatement.executeBatch and Connection.rollback
DR 115914 Customer gets errors on jdbc connection attempts originating from TdgssConfigApi (shipped with tdgssjava 6.2.2.19)
DR 118851 Java TDGSS_6.1.1.93_GCA fails against a 12.00.00.04 DBS for Kerberos (shipped with tdgssjava 6.2.2.22)
DR 119000 ResultSetMetaData.isAutoIncrement should return true for identity column
DR 119320 Add ActivityType 123 for REPLACE UDF
DR 120597 force connection failure for invalid response message header
DR 120929 DatabaseMetaData.getColumns returns incorrect information when using UTF8 session character set

This release includes changes to address the following DRs, originally included
in release 03.04.00.02:

DR 107900 support ambiguous data type for ResultSet columns with SIP-enabled prepare of select-list parameter markers
DR 110436 provide consistency for ACCOUNT connection parameter
DR 112806 PreparedStatement: treat Types.FLOAT & Types.REAL as Types.DOUBLE in setObject and preserve float precision in setFloat
DR 113069 executeQuery may return error 1182 if URL param CLIENT_CHARSET is set and the DBS is running V2R6.1 or earlier

This release includes changes to address the following DRs, originally included
in release 03.04.00.01:

DR 100351 support the MONITOR partition
DR 100352 support the DBCCONS partition
DR 103835 return actual update count for MERGE insert, MERGE update, and MERGE mixed SQL statements
DR 104893 provide high-level JDBC FastLoad connection for automatic management of multiple low-level connections
DR 106917 CallableStatement.getObject fails for INOUT Clob parameter when input value was sent to 6.2 DBS as VARCHAR
DR 108500 ResultSetMetaData.getSchemaName to return database name with Teradata Database 6.2
DR 108926 enable JDBC Load and Export sessions to be identifiable by TASM
DR 109424 Make Elicit File protocol work with the JDBC driver and 64 bit Windows DBS
DR 109760 Change sample program T21400JD to demonstrate call to corrected UDF Judf01
DR 110059 Return correct values for getColumnDisplaySize for temporal data types
DR 110112 provide pre-V2R6.2 high-level JDBC FastLoad connection for automatic management of multiple low-level connections
DR 111254 JDBC FastLoad support for BIGINT and large DECIMAL, JDBC FastLoad support for EJB transactions

This release includes changes to address the following DRs, originally included
in release 03.04.00.00:

DR 58028 JDBC 3.0 ParameterMetaData methods.
DR 94704 RFC: Support the retrieval of auto-generated keys from an insert statement.
DR 95968 Add support for BIGINT and DECIMAL(38).
DR 96457 certify JDBC driver with Teradata Database on Windows x64.
DR 96467 update application server documentation for TTU 8.2 / JDBC 3.4 release.
DR 97514 ResultSetMetaData methods to use actual database values rather than COMPAT_xxx.
DR 97554 provide User Defined Type (UDT) information from DatabaseMetaData methods.
DR 99270 certify Solaris 10 64-bit on AMD64 with JDK 5.0 32-bit & 64-bit.
DR 99337 certify Red Hat AS 4.0 64-bit on AMD64 with JDK 5.0 32-bit & 64-bit.
DR 104782 setMaxFieldSize(small value) causes subsequent exceptions from getDate for ANSI date, getTime, and getTimestamp

This release includes changes to address the following DRs, originally included
in release 03.03.00.04:

DR 87473 getColumnDisplaySize returns number of bytes for Character columns
DR 104043 DatabaseMetaData.getTableTypes should return ResultSet ordered by TABLE_TYPE
DR 108939 User Guide must say setAsciiStream/setCharacterStream are not supported for binding data to BYTE or VARBYTE destinations
DR 109213 Encryption problem message may not display an argument
DR 109231 TYPE_SCROLL_INSENSITIVE used with execute method causes subsequent getMoreResults to hang or throw exception
DR 109294 Statement.executeBatch must clear the batch
DR 109615 DatabaseMetaData.getColumns throws exception

This release includes changes to address the following DRs, originally included
in release 03.03.00.03:

DR 101277 enable UDFs, XSPs, and UDMs to be created from resources on client using JDBC
DR 106841 improve SQLException from executeXXX when InputStream bound with setXxxStream is closed before executeXXX
DR 107345 TTU 8.1: Getting NullPointerException from tdgssjava (shipped with tdgssjava 6.2.0.4)
DR 107536 CallableStatement executeUpdate: error 6906 (iterated request disallowed) occurs after error 1184 (invalid parameter)
DR 107987 workaround for Java 2 security Sun Bug ID 6205384 - SocketPermission ignored for unknown host 
DR 108260 restrict printed characters to 7-bit ASCII in debug log message dumps

This release includes changes to address the following DRs, originally included
in release 03.03.00.02:

DR 101381 scalar functions (TIMESTAMPADD, TIMESTAMPDIFF) need SQL_TSI_HOUR
DR 103411 Add support for inserting NULL, Unicode characters, and remaining data types to be supported by JDBC FastLoad
DR 103740 with CHARSET=UTF16, PreparedStatement.executeBatch should accept TIMESTAMP values w/varying number of fractional digits
DR 103772 send millisecond portion of java.sql.Time values to DBS with omitted TNANO connection parameter, & with TNANO=1 or more
DR 104020 getTime & getObject methods: return TIME values w/fractional seconds as java.sql.Time values w/milliseconds precision
DR 104370 throw SQLException when DBS says 'n' characters are coming but really only sends a fraction of 'n'
DR 104825 insert trailing zeros before TIME ZONE for TIME or TIMESTAMP values with varied precisions and no TNANO or TSNANO
DR 105073 Modify setBinary/Ascii/CharacterStream methods to determine when to send Deferred LOB/VARCHAR/VARBYTE values
DR 105265 Ensure driver is registered only once with DriverManager
DR 105633 non-prepared Statement.executeBatch is limited to fewer statements with V2R6.x than with V2R5.x
DR 105834 PreparedStatement.setAsciiStream drops trailing spaces
DR 106091 stream/reader from Clob.getAsciiStream/getCharacterStream should remain valid for Connection lifetime 
DR 106115 Clob.getSubString truncates data when a multi-byte character set is used
DR 106116 cannot execute more than once a CallableStatement with OUT parameters on V2R6.0 and earlier
DR 106118 Incorrect data is returned if the ResultSet is closed while reading a Blob
DR 106136 A finalize statement needs to be implemented for LobStatement 
DR 106243 ResultSet.getAsciiStream returns invalid data on mainframe z/OS USS

This release includes changes to address the following DRs, originally included
in release 03.03.00.01:

DR 58030 RFC: JDBC3.0: DatabaseMetaData methods (New in JDBC 3.0)
DR 58032 RFC: JDBC3.0: DatabaseMetaData methods (MODIFIED from JDBC2.0)
DR 96462 certify Teradata JDBC Driver with SAP Web Application Server 6.40
DR 97255 document Teradata JDBC Driver configuration with SAP Universal Data Connector
DR 98047 DatabaseMetaData.getProcedures returns ResultSet that differs from API javadoc
DR 98048 DatabaseMetaData.getProcedureColumns returns ResultSet differs from API javadoc
DR 98050 DatabaseMetaData.getColumns fails when a database name contains a quote
DR 98051 PreparedStatement.setCharacterStream and setAsciiStream drop trailing spaces
DR 98053 DatabaseMetaData.getColumns returns RS w/RSMD.getColumnTypeName null for all columns
DR 98055 DatabaseMetaData.getPrimaryKeys returns ResultSet that differs from API javadoc
DR 98855 setBigDecimal throw DataTruncation for >18 integral digits; & round frac. digits
DR 99578 implement JDBC 1.0 DatabaseMetaData methods
DR 99720 low-level FastLoad connection with PreparedStatement batch update
DR 99760 AppServer-HowTo HTML doc needs modification for JRun datasource definition
DR 100404 use 24-hour values rather than 12-hour for JDBC driver log message timestamps
DR 100902 automatic close of garbage-collected Statement and ResultSet objects
DR 101115 PreparedStatement.setLong to throw DataTruncation when long value has 19 digits
DR 101767 ResultSet.absolute fails for negative row numbers
DR 102405 thread deadlock for concurrent calls to Statement.executeQuery & ResultSet.close
DR 103173 securerandom.source and/or java.security.egd dont work in 1.5.0_05 (tdgssjava 6.1.0.18)

This release includes changes to address the following DRs, originally included
in release 03.03.00.00:

DR 50036 RFC: JDBC1.0: Escape syntax support
DR 83850 RFC: JDBC2.0: PreparedStatement.getMetaData()
DR 89445 ResultSetMetaData.getColumnClassName should return class name, not null
DR 89449 Need to add COMPAT_xxx URL parameters for three ResultSetMetaData methods 
DR 91121 disallow specification of a username and password when LDAP or Kerberos is used
DR 91636 Implement Denial of services feature as documented in TRP 541-0004949 
DR 91796 update application server documentation for TTU 8.1 / JDBC 3.3 release
DR 92136 Enable transaction isolation level TRANSACTION_READ_UNCOMMITTED
DR 92143 DatabaseMetaData: obtain DBS limits from Config Response parcel
DR 92146 obtain DBS version/release from new feature item in Config Response parcel
DR 92212 testing: support V2R6.1 feature: external security clause for sprocs/UDFs
DR 92216 J2SE 5.0 (JDK 1.5) certification
DR 92219 Solaris 10/SPARC 32-bit and 64-bit certification
DR 92221 AIX 5.3 32-bit and 64-bit certification
DR 92222 SuSE Linux 32-bit certification
DR 92223 WebSphere 6.0 Certification
DR 92228 WebLogic 8.1 with both Sun JVM and JRockit JVM Certification
DR 92230 ColdFusion MX 6.1 Certification
DR 92231 JBoss 4.0 Certification
DR 92449 Implement UTF16 support for tdgss as documented in TRP 541-0005061
DR 92450 eliminate HELP PROCEDURE before calls to sprocs with OUT params
DR 92648 translate new JDBC 3.3 error messages into Japanese
DR 92693 TTU 8.1 / JDBC 3.3 User Guide: no support for V2R6.1 User Defined Types (UDTs)
DR 92736 Include info for the sample files in samples.jar for MVS in the JDBC Users Guide
DR 92919 DatabaseMetaData APIs should support patterns containing single quotes
DR 93293 Single quote in comment throws invalid error via JDBC
DR 93890 getHoldability APIs should return HOLD_CURSORS_OVER_COMMIT, not throw exception
DR 94311 testing: support V2R6.1 feature: activity count overflow warning
DR 94816 JDBC User Guide section "Improving Performance": list use of PreparedStatement
DR 95061 TTU 8.1 JDBC User Guide addition: CALL statements not using Escape Syntax
DR 95334 corrections for JDBC User Guide Appendix D - Data Type Conversions
DR 95741 JDBC User Guide changes to Chapter 1 section "Support for Internationalization"
DR 95961 database error in TERA mode with autocommit off incorrectly turns autocommit on
DR 95969 incomplete update count array in TERA mode w/autocommit off for failed batch req
DR 96149 Provide warning message from SuccessParcel to Statement.getWarnings method
DR 96253 Package TdgssUserConfigFile.xml in a jar file
DR 96653 Revamp JDBC Connection Pool Orange Book as HTML docs in appserver-howto.jar
DR 96824 JDBC User Guide change: discontinued CASE_SENSITIVE connection parameter
DR 96914 TTU 8.1 JDBC User Guide addition: new section: "Planned Future Changes"
DR 97038 TTU 8.1 JDBC User Guide addition: new section: LogonSource Format
DR 97290 Large batch requests using LOB params, may fail to process all requests in batch
DR 97428 HPUX 11.23/Itanium-2 32-bit and 64-bit certification
DR 97550 corrections for COMPAT_GETSCHEMA and COMPAT_GETTABLE information in JDBC UG
DR 97585 TTU 8.1 JDBC User Guide: new contents for section: Response Limit Exceeded Error
DR 97723 fix sample programs T21301JD, T21302JD to use ConnectionPoolDataSource correctly
DR 97747 TTU8.1 JDBC Users Guide: need to add an explanation for DBS error 3926
DR 97816 DatabaseMetaData.getMaxStatements should return 16, not 1048500
DR 98089 TTU 8.1 JDBC User Guide changes: miscellaneous "Supported Methods" changes
DR 98110 TTU 8.1 JDBC UG: refer readers to appserver documentation in download package

This release includes changes to address the following DRs, originally included
in release 03.02.00.03:

DR 56133 Implement JDBC1.0 APIs DatabaseMetaData.getExportedKeys and getImportedKeys
DR 90532 PreparedStatement.setBigDecimal throws java.lang.ArithmeticException exception
DR 92609 Wrong value in the database when PreparedStatement.setBigDecimal is being used
DR 97022 PreparedStatement.executeBatch throws ClassCastException: java.util.ArrayList

This release includes changes to address the following DRs, originally included
in release 03.02.00.02:

DR 84637 RFC: Statement.execute() should not retrieve all the data before returning
DR 87267 JDBC error: ('0A'X) is not a valid Teradata SQL token
DR 89201 UT: NullPointerException for unbound prep stmt parameter (should be SQLException)
DR 90136 JDBC throws parameter error when ? occurs in 2nd quoted string
DR 91353 setNull does not work correctly when the sql type is a Boolean
DR 91951 CLIENT_CHARSET connection parameter
DR 92125 add LOG=TIMING connection parameter
DR 92294 JDBCException when creating UDF: Function 'Judf01' already exists
DR 92697 getTables() to get the table type, the resultset contains "T" instead of Table
DR 92918 map replication error code 6699 to SQLState 40001 (transaction rolled back)
DR 93054 Logon fails with 8019 from jdbc when ldap mechanism is used
DR 93156 Inserting null decimal datatypes not working when URL LOB_SUPPORT=OFF
DR 93157 Using PreparedStatement.setObject(int, Object) to set null value throws NPE
DR 93549 Type 4 driver Get-column-by-name from 2nd RS throws "column not found" exception
DR 94407 do not include class files in samples.jar
DR 94605 Statement.addBatch fails when SQL contains trailing space
DR 94923 row fetching too slow with >1000 rows in result set using 1MB response messages
DR 94970 PreparedStatement.getResultSet should return null for non-RS-returning statement
DR 95078 interoperability issue when Connection.close called while query is in progress
DR 95302 provide SQLState for V2R6.0.x retryable error codes 3231 and 3319
DR 95828 CLIENT_CHARSET DataSource property
DR 95943 DatabaseMetaData.getSQLKeywords for V2R5.0, V2R5.1, and V2R6.0

This release includes changes to address the following DRs, originally included
in release 03.02.00.01:

DR 85852 TeraLocalPrepared/CallableStatement.getResultSetType and other incorrect methods

This release includes changes to address the following DRs, originally included
in release 03.02.00.00:

DR 57921 RFC: JDBC Certification on Windows 2003 Server (32-bit/64-bit)
DR 63499 RFC: Make changes to files for JDBC to use JDK 1.4
DR 68162 RFC: JDBC2.0: PreparedStatement batch updates
DR 68625 RFC: Add more sample files to JDBC package
DR 68837 RFC: V2R6: 1 MB/APH Responses
DR 68844 RFC: V2R6: Security Improvements and Extensions
DR 69061 RFC: JDBC2.0: Scrollable ResultSets (bi-directional cursor positioning)
DR 84400 RFC: Certify Sun Microsystems RowSet implementation with JDBC driver
DR 84635 RFC: remove jdbc4.properties file - use connection attributes
DR 84672 RFC: Remove platform packaging for JDBC Type 4 driver
DR 84853 RFC: Test JDBC Driver with WebSphere 5.1
DR 84854 RFC: Test JDBC driver with WebLogic 8.1 
DR 85123 RFC: JDBC Certification on 64-bit Linux
DR 85393 RFC: Remove Type 3 driver from product
DR 85397 RFC: Update values for DatabaseMetaData functions for V2R6
DR 85434 createStatement: Downgrade RS type and concurrency, and generate SQLWarning
DR 85536 RFC: Enable Type 4 driver to be built on Solaris
DR 85980 RFC: remove sample applets
DR 85981 DatabaseMetaData.getIndexInfo() is not implemented correctly
DR 86049 JDBC was not handling nulls in where clauses correctly in releases 3.1 & earlier
DR 86456 RFC: support LOBs as stored procedure output parameters
DR 86471 TRANSACTION_READ_UNCOMMITTED(1) is not supported 
DR 87018 ResultSet.getConcurrency should return CONCUR_READ_ONLY
DR 87512 various ResultSetMetaData methods throw exceptions
DR 88400 RCI: Null Pointer dereference in ParcelFactory.java
DR 88403 RCI: Null Pointer Dereference in Statement.java
DR 88405 RCI: Resource leak of FileInputStream
DR 88409 RCI: Resource Leak ResultSets not being closed
DR 88581 Null Pointer exception in TDGSS interface code
DR 88763 Deprecate TeraStatement.getSpl and setSpl methods for TTU 8.0
DR 89173 STV: Statement.getXXX and PrepStmt.setXXX conversions must match User Guide


Troubleshooting Topics
----------------------


TERAJDBC4 ERROR ... The com.ncr.teradata.TeraDriver class name is deprecated
----------------------------------------------------------------------------
New Teradata JDBC Driver class names are available.

   - For JDBC URL connections: com.teradata.jdbc.TeraDriver
   - For WebSphere Data Sources: com.teradata.jdbc.TeraConnectionPoolDataSource

The old class names will continue to work; however, a warning message
will be printed as a reminder to switch over to the new class names.

   TERAJDBC4 ERROR ... The com.ncr.teradata.TeraDriver class name is deprecated.
   Please use the com.teradata.jdbc.TeraDriver class name instead.

   TERAJDBC4 ERROR ... The com.ncr.teradata.TeraConnectionPoolDataSource class name is deprecated.
   Please use the com.teradata.jdbc.TeraConnectionPoolDataSource class name instead.


Solution:

Please change your applications and data source definitions at your
earliest convenience, because the old class names will only be supported
for a limited number of future releases.


Error 2665, 2673, or 3944 when using PreparedStatement setDate
--------------------------------------------------------------
After upgrading to this release of the Teradata JDBC Driver, you may
encounter one of the following Teradata Database errors when using the
PreparedStatement setDate method with Teradata Database releases between
TD 12.00.00.00 and TD 12.00.01.01:

Teradata Database Error 2665 Invalid Date.
Teradata Database Error 2673 The source parcel length does not match data that was defined.
Teradata Database Error 3944 Data length is invalid for the data type.


Solution:

If using Teradata Database releases between TD 12.00.00.00 and TD 12.00.01.01,
then upgrade to Teradata Database 12.00.01.02 or later, in order to obtain
the fix for DBS DR 119554.


Incorrect values from getColumnDisplaySize for CLOB columns
-----------------------------------------------------------
When using Teradata Database releases V2R06.00.02.00 through V2R06.00.02.07
or Teradata Database releases V2R06.01.00.00 through V2R06.01.00.08, you may
encounter the problem described by DBS DR 100397 ("PrepInfoX returns
incorrect Length for CLOB columns"), which may cause incorrect values to be
returned for CLOB columns from ResultSetMetaData.getColumnDisplaySize.


Solution:

If using Teradata Database releases V2R06.00.02.00 through V2R06.00.02.07,
then upgrade to release V2R06.00.02.08 or later, which contains the fix
for DR 100397.

If using Teradata Database releases V2R06.01.00.00 through V2R06.01.00.08,
then upgrade to release V2R06.01.00.09 or later, which contains the fix
for DR 100397.


Unable to connect to database when using HPUX 11.23 JDK 5.0
-----------------------------------------------------------

When attempting to connect to the Teradata Database when HPUX 11.23 JDK 5.0,
you may receive an exception similar to: TeraEncrypt: Error
tdgss-stack-trace-begin>>> GSSException: Failure unspecified at GSS-API
level (Mechanism level: Failure during key generation by algorithm layer.)

This is a known problem with HPUX 11.23 JDK 5.0. HP's web site states
the following:

 SecureRandom engine implementation (11i HP Integrity and HP9000 PA-RISC) 

  Beginning with 5.0, Sun Microsystems' SecureRandom engine implementation 
  supports a new algorithm, NativePRNG, in addition to SHA1PRNG. NativePRNG 
  will only be available if /dev/random and /dev/urandom are installed in 
  your system. Because HP-UX does not support seeding entropy generating 
  devices such as /dev/random, applications that rely on this will not be 
  able to use NativePRNG. An attempt to seed the device will cause an 
  exception. This defect is expected to be fixed in a future release.


Solution:

No solution is available for this issue at the present time.


Modifying SQL Statements
------------------------

In the Teradata JDBC Driver, version 3.1 and earlier releases, the Teradata
JDBC driver modified the SQL statement text of PreparedStatements, replacing
all occurrences of "?" with "IS NULL" whenever the application called setNull()
for the "?" in a WHERE clause. For example, if the SQL statement was:

  select * from table1 where colid = ?

and the application called setNull(1), then the Teradata JDBC driver would
change the SQL statement to:

  select * from table1 where colid IS NULL

This was an incorrect procedure to use. The problem was fixed in the Teradata 
JDBC Driver version 3.2, but the fix could change the output of some applications.


Solution:

Refer to the Teradata JDBC Driver User Guide for details on how to change
the application to work correctly with the Teradata JDBC Driver.


Calling Stored Procedures
-------------------------

In the Teradata JDBC Driver, version 3.1 and earlier releases,  the Teradata
JDBC driver permitted stored procedures to be called using the PreparedStatement
interface, and the stored procedure's INOUT and OUT parameter output values
were returned as a single-row result set from the executeQuery method.

Note that the JDBC standard only supports calling stored procedures using the
CallableStatement interface. Also, because stored procedures do not return a
result set, only the execute and executeUpdate methods are supported for calling
a stored procedure. The JDBC 3.0 specification requires a JDBC driver to throw
a SQLException from executeQuery when that method is used to execute a SQL
statement that does not return a result set.

The Teradata JDBC Driver is evolving towards full compliance with that JDBC 3.0
specification requirement:

 - This release of the Teradata JDBC Driver no longer returns a stored 
   procedure's INOUT and OUT parameter output values as a single-row result
   set from the PreparedStatement.executeQuery method. Instead, an empty result
   set is returned.

 - A future release of the Teradata JDBC Driver will throw a SQLException from
   executeQuery when that method is used to execute a SQL statement that does
   not return a result set, such as a SQL CALL statement.

Applications using the PreparedStatement interface to call a stored procedure
may encounter the difference in behavior.


Solution:

Modify the application to call stored procedures by using the CallableStatement
interface, and either the execute or executeUpdate methods.

According to the JDBC standard, the proper sequence for calling a stored
procedure is as follows:
 - Use Escape Syntax curly braces: {call storedproc(arg1, arg2, arg3)}
 - Call Connection.prepareCall to use the CallableStatement interface.
 - Prior to executing the statement, bind all input values for IN and INOUT
   parameters using the CallableStatement setter methods setInt, setString, etc.
 - Prior to executing the statement, register all stored procedure INOUT and OUT
   parameters with the CallableStatement.registerOutParameter method.
 - Use either the CallableStatement.execute or CallableStatement.executeUpdate
   method to execute the SQL CALL statement.
 - After executing the statement, use the CallableStatement getter methods such
   as getInt, getString, etc. to obtain the stored procedure's INOUT and OUT
   parameter output values.


Installation
------------

This release of the Teradata JDBC Driver is distributed as platform-independent 
jar files. For downloading convenience, the platform-independent jar files are 
bundled together and provided in both zip format and tar format.

TeraJDBC__indep_indep.13.00.00.20.zip and TeraJDBC__indep_indep.13.00.00.20.tar
both contain the same set of platform-independent files:

  readme.txt               - this file
  terajdbc4.jar            - the Teradata JDBC Driver
  tdgssconfig.jar          - the Teradata security configuration

Download either the zip file or the tar file, and unzip (or untar) the downloaded
file into a directory of your choice, and then set your classpath to refer to the
necessary jar files.

Your classpath must include:

  terajdbc4.jar
  tdgssconfig.jar

Your classpath must NOT include any jar files from any previous releases of
the Teradata JDBC Driver. It is recommended, but not required, that any
previous release of the Teradata JDBC Driver be uninstalled prior to
downloading and using this release of the Teradata JDBC Driver.

For systems running only Java applications that use the Teradata JDBC Driver, 
the tdgssconfig.jar file replaces the TdgssUserConfigFile.xml file from the 
previous release of the Teradata JDBC Driver. If the TdgssUserConfigFile.xml 
file has not been customized for the site, then the TdgssUserConfigFile.xml 
file is no longer needed and can be removed.

For systems running both C/C++ and Java applications that access the Teradata 
Database, it is possible to share the TeraGSS security configuration. This is 
appropriate if the TdgssUserConfigFile.xml file has been customized for the 
site. To enable sharing, the Java classpath should include the TeraGSS
directory that contains the TdgssUserConfigFile.xml file, and the classpath
should not include the tdgssconfig.jar file.


Documentation
-------------

The Teradata JDBC Driver User Guide Release 13.00.00 is available online
at http://www.info.teradata.com/

Navigate to "Teradata Data Warehousing", then "Teradata Tools and Utilities",
then "Java Database Connectivity (JDBC)", and select the User Guide release
13.00.00, which corresponds to this release of the Teradata JDBC Driver.

Documentation for how to use the Teradata JDBC Driver with supported application
servers is available on the http://www.teradata.com Teradata Download Center in
the Teradata JDBC Driver section.
