CREATE TABLE  "TEST_COUNT" 
   (	"TEST_INT" NUMBER(*,0) NOT NULL ENABLE, 
	"TEST_INT_NULL" NUMBER(*,0), 
	"TEST_DATE" DATE NOT NULL ENABLE, 
	"TEST_DATE_NULL" DATE, 
	"TEST_CHAR" CHAR(10) NOT NULL ENABLE, 
	"TEST_CHAR_NULL" CHAR(10), 
	"TEST_VARCHAR" VARCHAR2(10) NOT NULL ENABLE, 
	"TEST_VARCHAR_NULL" VARCHAR2(10), 
	"TEST_DOUBLE" FLOAT(126) NOT NULL ENABLE, 
	"TEST_DOUBLE_NULL" FLOAT(126), 
	"TEST_TIMESTAMP" TIMESTAMP (0) NOT NULL ENABLE, 
	"TEST_TIMESTAMP_NULL" TIMESTAMP (0)
   )

CREATE TABLE  "TEST_DUPLICATES" 
   (	"TEST_INT" NUMBER(*,0) NOT NULL ENABLE, 
	"TEST_INT_NULL" NUMBER(*,0), 
	"TEST_DATE_NULL" DATE, 
	"TEST_STRING_NULL" VARCHAR2(10)
   )

CREATE TABLE  "TEST_MEDIAN" 
   (	"TEST_INT" NUMBER(*,0) NOT NULL ENABLE, 
	"TEST_INT_NULL" NUMBER(*,0)
   )

CREATE TABLE  "TEST_MEDIAN_BIS" 
   (	"TEST_INT" NUMBER(*,0) NOT NULL ENABLE, 
	"TEST_INT_NULL" NUMBER(*,0)
   )



INSERT INTO test_count VALUES (-6,-6,'2002-01-01','2002-01-01','\"Martin\"',NULL,'\"JEWrnm\"',NULL,0.09,NULL,'2008-05-22 12:30:12','1999-01-01 15:41:00');
INSERT INTO test_count VALUES(2,2,'1950-01-01','1950-01-01','\"Theodore\"','\"Theodore\"','\"ydMWjP\"','\"ydMWjP\"',0.09,NULL,'2008-05-22 12:30:12','1972-01-01 15:41:00');
INSERT INTO test_count VALUES(-3,-3,'1985-01-01','1985-01-01','\"Warren\"','\"Warren\"','\"4BQTVz\"','\"4BQTVz\"',3.55,3.55,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-6,NULL,'1984-01-01',NULL,'\"Thomas\"','\"Thomas\"','\"AXSavo\"',NULL,-0.75,-0.75,'2008-05-22 12:28:01','2010-01-01 15:41:00');
INSERT INTO test_count VALUES(1,1,'2012-01-01','2012-01-01','\"Harry\"','\"Harry\"','\"BIHEZ7\"','\"BIHEZ7\"',-0.88,-0.88,'2020-01-01 15:41:00','2020-01-01 15:41:00');
INSERT INTO test_count VALUES(-10,-10,'1959-01-01','1959-01-01','\"Ulysses\"','\"Ulysses\"','\"Queglt\"','\"Queglt\"',3.16,3.16,'1984-01-01 15:41:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-5,-5,'1986-01-01','1986-01-01','\"Calvin\"','\"Calvin\"','\"wwdamH\"','\"wwdamH\"',-2.27,-2.27,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(8,8,'1961-01-01','1961-01-01','\"George\"','\"George\"','\"vKxMjL\"','\"vKxMjL\"',-1.35,-1.35,'2020-01-01 15:41:00','2020-01-01 15:41:00');
INSERT INTO test_count VALUES(-8,-8,'1992-01-01','1992-01-01','\"Ulysses\"','\"Ulysses\"','\"2oVdLq\"','\"2oVdLq\"',2.54,2.54,'2001-01-01 15:41:00','2001-01-01 15:41:00');
INSERT INTO test_count VALUES(10,10,'1952-01-01','1952-01-01','\"Herbert\"','\"Herbert\"','\"neXrmd\"','\"neXrmd\"',-3.94,-3.94,'2007-01-01 15:41:00','2007-01-01 15:41:00');
INSERT INTO test_count VALUES(-5,-5,'1959-01-01','1959-01-01','\"Calvin\"','\"Calvin\"','\"tjHQsC\"','\"tjHQsC\"',1.12,1.12,'1999-01-01 15:41:00','1999-01-01 15:41:00');
INSERT INTO test_count VALUES(5,NULL,'1982-01-01',NULL,'\"Grover\"','\"Grover\"','\"Y5TaRM\"',NULL,-2.45,-2.45,'2008-05-22 12:28:01','1979-01-01 15:41:00');
INSERT INTO test_count VALUES(-4,-4,'1989-01-01','1989-01-01','\"Calvin\"','\"Calvin\"','\"BxMnkg\"','\"BxMnkg\"',-0.42,NULL,'2008-05-22 12:30:12','1987-01-01 15:41:00');
INSERT INTO test_count VALUES(-3,-3,'1991-01-01','1991-01-01','\"Dwight\"','\"Dwight\"','\"ue9XEj\"','\"ue9XEj\"',3.65,3.65,'2017-01-01 15:41:00','2017-01-01 15:41:00');
INSERT INTO test_count VALUES(-6,-6,'1990-01-01','0000-00-00','\"Grover\"',NULL,'\"fAk3fs\"',NULL,1,1,'2008-05-22 12:28:01','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-2,-2,'1978-01-01','1978-01-01','\"John\"','\"John\"','\"Ih4AEh\"','\"Ih4AEh\"',1.13,1.13,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(1,1,'1965-01-01','1965-01-01','\"Lyndon\"','\"Lyndon\"','\"fYYesd\"','\"fYYesd\"',0.22,NULL,'2008-05-22 12:30:12','1980-01-01 15:41:00');
INSERT INTO test_count VALUES(3,3,'1991-01-01','1991-01-01','\"Benjamin\"','\"Benjamin\"','\"NQKJoS\"','\"NQKJoS\"',-2.05,-2.05,'1998-01-01 15:41:00','1998-01-01 15:41:00');
INSERT INTO test_count VALUES(-8,-8,'1964-01-01','1964-01-01','\"Grover\"','\"Grover\"','\"RQsDnl\"','\"RQsDnl\"',3.42,3.42,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-4,-4,'1972-01-01','1972-01-01','\"Lyndon\"','\"Lyndon\"','\"nCfrWH\"','\"nCfrWH\"',0.19,NULL,'2008-05-22 12:30:12','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(2,2,'1986-01-01','1986-01-01','\"Lyndon\"','\"Lyndon\"','\"ORZqWO\"','\"ORZqWO\"',3.06,3.06,'2007-01-01 15:41:00','2007-01-01 15:41:00');
INSERT INTO test_count VALUES(-4,-4,'1988-01-01','1988-01-01','\"Calvin\"','\"Calvin\"','\"AojFLR\"','\"AojFLR\"',0.19,NULL,'2008-05-22 12:30:12','2009-01-01 15:41:00');
INSERT INTO test_count VALUES(4,4,'1965-01-01','1965-01-01','\"Calvin\"','\"Calvin\"','\"Wp5mT3\"','\"Wp5mT3\"',-0.11,NULL,'2008-05-22 12:30:12','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-9,-9,'1982-01-01','1982-01-01','\"Martin\"','\"Martin\"','\"xVzAxn\"','\"xVzAxn\"',0.85,0.85,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-7,-7,'1987-01-01','1987-01-01','\"Bill\"','\"Bill\"','\"Pz3iMF\"','\"Pz3iMF\"',-3.29,-3.29,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-6,-6,'1962-01-01','1962-01-01','\"Bill\"','\"Bill\"','\"5DJd0A\"','\"5DJd0A\"',0.54,0.54,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(2,2,'1964-01-01','1964-01-01','\"Bill\"','\"Bill\"','\"k15Erj\"','\"k15Erj\"',0.25,NULL,'2008-05-22 12:30:12','2020-01-01 15:41:00');
INSERT INTO test_count VALUES(9,9,'2002-01-01','2002-01-01','\"Franklin\"','\"Franklin\"','\"wCywv7\"','\"wCywv7\"',-0.7,-0.7,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-10,NULL,'1955-01-01',NULL,'\"Richard\"','\"Richard\"','\"dzwzLR\"',NULL,-2.01,-2.01,'2008-05-22 12:28:01','1982-01-01 15:41:00');
INSERT INTO test_count VALUES(-8,-8,'1966-01-01','1966-01-01','\"Calvin\"','\"Calvin\"','\"QK6h7v\"','\"QK6h7v\"',2.84,2.84,'2008-05-22 12:37:27',NULL);
INSERT INTO test_count VALUES(9,9,'2014-01-01','2014-01-01','\"Grover\"','\"Grover\"','\"VnpOK3\"','\"VnpOK3\"',-0.99,-0.99,'1985-01-01 15:41:00','1985-01-01 15:41:00');
INSERT INTO test_count VALUES(-6,-6,'1973-01-01','1973-01-01','\"Warren\"',NULL,'\"bJiCDa\"',NULL,1.86,1.86,'2008-05-22 12:28:01','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(3,3,'1982-01-01','1982-01-01','\"John\"','\"John\"','\"HiZJGl\"','\"HiZJGl\"',1.76,1.76,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(9,9,'2019-01-01','2019-01-01','\"Franklin\"','\"Franklin\"','\"2IG4qe\"','\"2IG4qe\"',-0.09,NULL,'2008-05-22 12:30:12','2018-01-01 15:41:00');
INSERT INTO test_count VALUES(4,4,'2008-01-01','2008-01-01','\"Thomas\"','\"Thomas\"','\"9WV4CM\"','\"9WV4CM\"',3.62,3.62,'2002-01-01 15:41:00','2002-01-01 15:41:00');
INSERT INTO test_count VALUES(2,2,'1974-01-01','1974-01-01','\"Richard\"','\"Richard\"','\"CteD2Z\"','\"CteD2Z\"',-0.16,NULL,'2008-05-22 12:30:12','2003-01-01 15:41:00');
INSERT INTO test_count VALUES(2,2,'1952-01-01','1952-01-01','\"Ronald\"','\"Ronald\"','\"wMYna6\"','\"wMYna6\"',-1.32,-1.32,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-5,-5,'1950-01-01','1950-01-01','\"Grover\"','\"Grover\"','\"0s2rVq\"','\"0s2rVq\"',1.58,1.58,'2010-01-01 15:41:00','2010-01-01 15:41:00');
INSERT INTO test_count VALUES(10,10,'2012-01-01','2012-01-01','\"Gerald\"','\"Gerald\"','\"ckx3sg\"','\"ckx3sg\"',2.78,2.78,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(2,2,'1983-01-01','1983-01-01','\"Theodore\"','\"Theodore\"','\"AL5RoM\"','\"AL5RoM\"',-2.32,-2.32,'1998-01-01 15:41:00','1998-01-01 15:41:00');
INSERT INTO test_count VALUES(5,5,'2017-01-01','2017-01-01','\"Harry\"','\"Harry\"','\"cffFRQ\"','\"cffFRQ\"',-4.55,-4.55,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(3,3,'2006-01-01','2006-01-01','\"Herbert\"','\"Herbert\"','\"EWruJc\"','\"EWruJc\"',5.1,5.1,'2004-01-01 15:41:00','2004-01-01 15:41:00');
INSERT INTO test_count VALUES(3,3,'1954-01-01','1954-01-01','\"Thomas\"','\"Thomas\"','\"MXt7VL\"','\"MXt7VL\"',-0.11,NULL,'2008-05-22 12:30:12','2006-01-01 15:41:00');
INSERT INTO test_count VALUES(-10,-10,'1994-01-01','0000-00-00','\"Martin\"','\"Martin\"','\"Eizzv0\"','\"Eizzv0\"',-4.55,-4.55,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(9,9,'2002-01-01','2002-01-01','\"Woodrow\"','\"Woodrow\"','\"5bG1HY\"','\"5bG1HY\"',-0.4,NULL,'2008-05-22 12:30:12','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-6,-6,'1976-01-01','1976-01-01','\"Ronald\"','\"Ronald\"','\"QW7tEQ\"','\"QW7tEQ\"',-1.22,-1.22,'2012-01-01 15:41:00','2012-01-01 15:41:00');
INSERT INTO test_count VALUES(0,NULL,'1957-01-01',NULL,'\"Martin\"','\"Martin\"','\"QqvcUk\"',NULL,2.03,2.03,'2008-05-22 12:28:01','1985-01-01 15:41:00');
INSERT INTO test_count VALUES(-4,-4,'1997-01-01','1997-01-01','\"Ronald\"','\"Ronald\"','\"W5SRMk\"','\"W5SRMk\"',-3.88,-3.88,'2008-05-22 12:37:27',NULL);
INSERT INTO test_count VALUES(-8,-8,'2019-01-01','2019-01-01','\"Andrew\"','\"Andrew\"','\"6JB0BN\"','\"6JB0BN\"',-2.13,-2.13,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(7,7,'1953-01-01','1953-01-01','\"Thomas\"','\"Thomas\"','\"sMNJRU\"','\"sMNJRU\"',-5.09,-5.09,'2002-01-01 15:41:00','2002-01-01 15:41:00');
INSERT INTO test_count VALUES(9,9,'1960-01-01','1960-01-01','\"Gerald\"','\"Gerald\"','\"Y8mfN8\"','\"Y8mfN8\"',2.3,2.3,'1983-01-01 15:41:00','1983-01-01 15:41:00');
INSERT INTO test_count VALUES(9,9,'2018-01-01','2018-01-01','\"Gerald\"','\"Gerald\"','\"24AN7m\"','\"24AN7m\"',-4.22,-4.22,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-9,-9,'1950-01-01','1950-01-01','\"Thomas\"','\"Thomas\"','\"lpIjKw\"','\"lpIjKw\"',1,1,'2020-01-01 15:41:00','2020-01-01 15:41:00');
INSERT INTO test_count VALUES(4,4,'2017-01-01','2017-01-01','\"Warren\"','\"Warren\"','\"CnRKYj\"','\"CnRKYj\"',-0.15,NULL,'2008-05-22 12:30:12','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-10,-10,'1975-01-01','1975-01-01','\"Dwight\"','\"Dwight\"','\"0Wuinn\"','\"0Wuinn\"',-1.07,-1.07,'2015-01-01 15:41:00','2015-01-01 15:41:00');
INSERT INTO test_count VALUES(8,8,'1958-01-01','1958-01-01','\"Bill\"',NULL,'\"bkaGWs\"',NULL,-3.86,-3.86,'2008-05-22 12:28:01','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(0,NULL,'1985-01-01',NULL,'\"Franklin\"','\"Franklin\"','\"OZJSZi\"',NULL,0.97,0.97,'2008-05-22 12:28:01','1987-01-01 15:41:00');
INSERT INTO test_count VALUES(3,3,'2007-01-01','2007-01-01','\"Ulysses\"','\"Ulysses\"','\"944ix5\"','\"944ix5\"',0.69,0.69,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-5,-5,'1992-01-01','1992-01-01','\"Gerald\"','\"Gerald\"','\"2Ihetq\"','\"2Ihetq\"',5.2,5.2,'2017-01-01 15:41:00','2017-01-01 15:41:00');
INSERT INTO test_count VALUES(9,9,'1993-01-01','1993-01-01','\"Lyndon\"','\"Lyndon\"','\"y3eNit\"','\"y3eNit\"',2.05,2.05,'1997-01-01 15:41:00','1997-01-01 15:41:00');
INSERT INTO test_count VALUES(3,3,'1964-01-01','1964-01-01','\"William\"','\"William\"','\"5Nxxos\"','\"5Nxxos\"',-0.42,NULL,'2008-05-22 12:30:12','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(1,1,'1986-01-01','1986-01-01','\"Grover\"','\"Grover\"','\"51EuLL\"','\"51EuLL\"',-0.08,NULL,'2008-05-22 12:30:12','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(6,6,'1958-01-01','1958-01-01','\"John\"','\"John\"','\"H5T6NX\"','\"H5T6NX\"',0.11,NULL,'2008-05-22 12:30:12','1987-01-01 15:41:00');
INSERT INTO test_count VALUES(-7,-7,'1980-01-01','1980-01-01','\"Franklin\"','\"Franklin\"','\"eNwuZB\"','\"eNwuZB\"',1.13,1.13,'1995-01-01 15:41:00','1995-01-01 15:41:00');
INSERT INTO test_count VALUES(3,3,'1986-01-01','1986-01-01','\"Lyndon\"','\"Lyndon\"','\"o56CIi\"','\" \"',-0.98,-0.98,'2005-01-01 15:41:00','2005-01-01 15:41:00');
INSERT INTO test_count VALUES(7,7,'2008-01-01','2008-01-01','\"Chester\"','\"Chester\"','\"TChXOU\"','\"TChXOU\"',-2.15,-2.15,'2014-01-01 15:41:00','2014-01-01 15:41:00');
INSERT INTO test_count VALUES(4,4,'1962-01-01','1962-01-01','\"Thomas\"','\"Thomas\"','\"q9i4QR\"','\"q9i4QR\"',-2.39,-2.39,'1974-01-01 15:41:00','1974-01-01 15:41:00');
INSERT INTO test_count VALUES(-3,-3,'2002-01-01','2002-01-01','\"Richard\"','\"Richard\"','\"YcC6zF\"','\"YcC6zF\"',-0.56,-0.56,'1972-01-01 15:41:00','1972-01-01 15:41:00');
INSERT INTO test_count VALUES(6,6,'1963-01-01','1963-01-01','\"William\"','\"William\"','\"y3DOLc\"','\"y3DOLc\"',5.63,5.63,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(4,4,'2018-01-01','2018-01-01','\"Franklin\"','\"Franklin\"','\"XQ6KrG\"','\"     \"',-0.53,-0.53,'2006-01-01 15:41:00','2006-01-01 15:41:00');
INSERT INTO test_count VALUES(5,5,'1999-01-01','1999-01-01','\"Gerald\"','\"Gerald\"','\"69UKga\"','\"69UKga\"',-2.31,-2.31,'2001-01-01 15:41:00','2001-01-01 15:41:00');
INSERT INTO test_count VALUES(-2,-2,'1988-01-01','1988-01-01','\"Millard\"','\"Millard\"','\"dKsdJf\"','\"dKsdJf\"',1.38,1.38,'1994-01-01 15:41:00','1994-01-01 15:41:00');
INSERT INTO test_count VALUES(-7,-7,'2020-01-01','2020-01-01','\"Bill\"','\"Bill\"','\"ron7j6\"','\"ron7j6\"',-5.11,-5.11,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(5,5,'1978-01-01','1978-01-01','\"Rutherfor','\"Rutherfor','\"EHcC7a\"','\"EHcC7a\"',-0.56,NULL,'2008-05-22 12:30:12','1998-01-01 15:41:00');
INSERT INTO test_count VALUES(-1,-1,'2015-01-01','2015-01-01','\"Lyndon\"','\"Lyndon\"','\"XlTZIM\"','\"XlTZIM\"',0.07,NULL,'2008-05-22 12:30:12','1993-01-01 15:41:00');
INSERT INTO test_count VALUES(3,3,'1975-01-01','1975-01-01','\"Grover\"','\"Grover\"','\"FYFC36\"','\"FYFC36\"',0.35,NULL,'2008-05-22 12:30:12','2002-01-01 15:41:00');
INSERT INTO test_count VALUES(10,10,'1974-01-01','1974-01-01','\"Martin\"','\"   \"','\"a4il6A\"','\"a4il6A\"',1,1,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-6,-6,'1975-01-01','1975-01-01','\"James\"','\"James\"','\"bykGu0\"','\"bykGu0\"',3.84,3.84,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(5,5,'1957-01-01','1957-01-01','\"Millard\"','\"Millard\"','\"RZBHJW\"','\"RZBHJW\"',-1.53,-1.53,'1974-01-01 15:41:00','1974-01-01 15:41:00');
INSERT INTO test_count VALUES(-4,-4,'2009-01-01','2009-01-01','\"Martin\"','\"Martin\"','\"LLzJ6w\"','\"     \"',-1.37,-1.37,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(7,7,'2019-01-01','2019-01-01','\"Martin\"','\"Martin\"','\"WVc2qB\"','\"WVc2qB\"',-0.09,NULL,'2008-05-22 12:30:12','2005-01-01 15:41:00');
INSERT INTO test_count VALUES(-1,-1,'1989-01-01','1989-01-01','\"Ronald\"','\"Ronald\"','\"BVR3Oe\"','\"BVR3Oe\"',0.59,0.59,'2001-01-01 15:41:00','2001-01-01 15:41:00');
INSERT INTO test_count VALUES(-9,-9,'1958-01-01','1958-01-01','\"George\"','\"George\"','\"YATJeW\"','\"YATJeW\"',-1.22,-1.22,'1996-01-01 15:41:00','1996-01-01 15:41:00');
INSERT INTO test_count VALUES(9,9,'1980-01-01','1980-01-01','\"Warren\"','\"Warren\"','\"dWUulN\"','\"dWUulN\"',-0.6,-0.6,'2017-01-01 15:41:00','2017-01-01 15:41:00');
INSERT INTO test_count VALUES(-2,-2,'1990-01-01','1990-01-01','\"William\"','\"William\"','\"ce2TAV\"','\"ce2TAV\"',-0.19,NULL,'2008-05-22 12:30:12','2015-01-01 15:41:00');
INSERT INTO test_count VALUES(-5,-5,'2010-01-01','2010-01-01','\"Ronald\"','\"Ronald\"','\"iLMljv\"','\"iLMljv\"',0.23,NULL,'2008-05-22 12:30:12','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-7,-7,'1960-01-01','1960-01-01','\"Andrew\"','\"Andrew\"','\"Jjd0jx\"','\"Jjd0jx\"',0.26,NULL,'2008-05-22 12:30:12','1990-01-01 15:41:00');
INSERT INTO test_count VALUES(6,6,'1954-01-01','1954-01-01','\"Lyndon\"','\"Lyndon\"','\"XU6fH4\"','\"XU6fH4\"',0.96,0.96,'2020-01-01 15:41:00','2020-01-01 15:41:00');
INSERT INTO test_count VALUES(-1,-1,'1983-01-01','1983-01-01','\"Harry\"','\"Harry\"','\"Hd0Y77\"','\"Hd0Y77\"',2.05,2.05,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(1,1,'2014-01-01','2014-01-01','\"Jimmy\"','\"Jimmy\"','\"vVvrZy\"','\"vVvrZy\"',0.15,NULL,'2008-05-22 12:30:12','1986-01-01 15:41:00');
INSERT INTO test_count VALUES(-5,-5,'1973-01-01','1973-01-01','\"James\"','\"James\"','\"3KyapA\"','\"3KyapA\"',1.07,1.07,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-4,-4,'2004-01-01','2004-01-01','\"Andrew\"','\"Andrew\"','\"zA5rrn\"','\"zA5rrn\"',4.15,4.15,'1986-01-01 15:41:00','1986-01-01 15:41:00');
INSERT INTO test_count VALUES(2,2,'1968-01-01','1968-01-01','\"Warren\"','\"Warren\"','\"e1DFDH\"','\"e1DFDH\"',-2.77,-2.77,'1971-01-01 15:41:00','1971-01-01 15:41:00');
INSERT INTO test_count VALUES(-5,-5,'2006-01-01','2006-01-01','\"Harry\"','\"Harry\"','\"i6JXIQ\"','\"i6JXIQ\"',-0.92,-0.92,'2004-01-01 15:41:00','2004-01-01 15:41:00');
INSERT INTO test_count VALUES(-2,-2,'1978-01-01','1978-01-01','\"Gerald\"','\"Gerald\"','\"yx8MS6\"','\"yx8MS6\"',-1.63,-1.63,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(-3,-3,'1974-01-01','1974-01-01','\"Warren\"','\"Warren\"','\"6lwnbp\"','\"6lwnbp\"',-2.17,NULL,'2008-05-22 12:30:12','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(3,3,'1986-01-01','1986-01-01','\"Jimmy\"','\"Jimmy\"','\"bIzWby\"','\"bIzWby\"',0.14,NULL,'2008-05-22 12:30:12','1971-01-01 15:41:00');
INSERT INTO test_count VALUES(-4,-4,'2000-01-01','2000-01-01','\"Theodore\"','\"Theodore\"','\"IZjrsN\"','\"IZjrsN\"',-1.11,-1.11,'2003-01-01 15:41:00','2003-01-01 15:41:00');
INSERT INTO test_count VALUES(-10,-10,'1976-01-01','1976-01-01','\"Lyndon\"','\"Lyndon\"','\"ta1jnT\"','\"ta1jnT\"',-1.03,-1.03,'0000-00-00 00:00:00','0000-00-00 00:00:00');
INSERT INTO test_count VALUES(5,5,'1953-01-01','1953-01-01','\"Andrew\"','\"Andrew\"','\"ldIhf3\"','\"ldIhf3\"',4.7,4.7,'1986-01-01 15:41:00','1986-01-01 15:41:00');


INSERT INTO test_duplicates VALUES (4,4,'2008-07-24','\"parent\"');
INSERT INTO test_duplicates VALUES(4,4,'2008-07-24','\"child\"');
INSERT INTO test_duplicates VALUES(4,4,'2008-07-24','\"cousin\"');
INSERT INTO test_duplicates VALUES(4,4,'2008-07-04','\"genealogy');
INSERT INTO test_duplicates VALUES(4,4,'2002-01-01','\"fire\"');
INSERT INTO test_duplicates VALUES(4,4,'2001-05-09','\"parent\"');
INSERT INTO test_duplicates VALUES(4,4,'1999-12-31','');
INSERT INTO test_duplicates VALUES(4,4,'2000-01-01','\"parent\"');
INSERT INTO test_duplicates VALUES(4,4,'2000-01-02','\"cousin\"');
INSERT INTO test_duplicates VALUES(5,5,'1998-12-01','\"cousin\"');
INSERT INTO test_duplicates VALUES(5,5,'0000-00-00','\"parent\"');
INSERT INTO test_duplicates VALUES(5,5,'0000-00-00','');
INSERT INTO test_duplicates VALUES(5,5,'0000-00-00','');
INSERT INTO test_duplicates VALUES(1,1,'0000-00-00','');
INSERT INTO test_duplicates VALUES(0,0,'2003-10-12','');
INSERT INTO test_duplicates VALUES(0,0,'0000-00-00','');
INSERT INTO test_duplicates VALUES(0,0,'0000-00-00','');
INSERT INTO test_duplicates VALUES(0,0,'0000-00-00','');
INSERT INTO test_duplicates VALUES(0,0,'0000-00-00','');
INSERT INTO test_duplicates VALUES(0,0,'0000-00-00','');


INSERT INTO test_median VALUES (1,1);
INSERT INTO test_median VALUES(2,2);
INSERT INTO test_median VALUES(2,NULL);
INSERT INTO test_median VALUES(2,2);
INSERT INTO test_median VALUES(3,3);
INSERT INTO test_median VALUES(3,3);
INSERT INTO test_median VALUES(44,44);
INSERT INTO test_median VALUES(234,NULL);
INSERT INTO test_median VALUES(234,NULL);
INSERT INTO test_median VALUES(123,123);
INSERT INTO test_median VALUES(122,122);
INSERT INTO test_median VALUES(345,345);
INSERT INTO test_median VALUES(75,75);
INSERT INTO test_median VALUES(75,75);
INSERT INTO test_median VALUES(45,45);


INSERT INTO test_median_bis VALUES (1,1);
INSERT INTO test_median_bis VALUES(2,2);
INSERT INTO test_median_bis VALUES(2,NULL);
INSERT INTO test_median_bis VALUES(2,2);
INSERT INTO test_median_bis VALUES(3,3);
INSERT INTO test_median_bis VALUES(3,3);
INSERT INTO test_median_bis VALUES(44,44);
INSERT INTO test_median_bis VALUES(234,NULL);
INSERT INTO test_median_bis VALUES(234,NULL);
INSERT INTO test_median_bis VALUES(123,123);
INSERT INTO test_median_bis VALUES(122,122);
INSERT INTO test_median_bis VALUES(345,345);
INSERT INTO test_median_bis VALUES(75,75);
INSERT INTO test_median_bis VALUES(75,75);