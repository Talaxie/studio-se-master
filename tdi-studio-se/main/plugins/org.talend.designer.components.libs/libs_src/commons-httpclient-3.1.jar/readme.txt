Notice: the new commons-httpclient-3.1.jar with source code: HttpMethodBase.java


for bug: http://www.talendforge.org/bugs/view.php?id=8874

when user use the tSalesforceInput with this problem.
description:
1. Salesforce Server support http1.1
2. user's company install a proxy, but this proxy will convert the http1.1 to http1.0
3. user use tSalesforceInput with the proxy, there will work on http1.0
4. commons-httpclient-3.1.jar must work on http1.1

so, there get this problem.

-----------------------------------------------
Index: java/org/apache/commons/httpclient/HttpMethodBase.java
===============================================
RCS file: /home/cvspublic/jakarta-commons/httpclient/src/java/org/apache/commons/httpclient/HttpMethodBase.java,v
retrieving revision 1.159.2.30
diff -u -r1.159.2.30 HttpMethodBase.java
--- java/org/apache/commons/httpclient/HttpMethodBase.java	27 Jul 2004 01:34:48 -0000	1.159.2.30
+++ java/org/apache/commons/httpclient/HttpMethodBase.java	19 Aug 2004 08:25:43 -0000
@@ -2008,9 +2008,9 @@
     private InputStream readResponseBody(HttpConnection conn)
         throws IOException {

-        LOG.trace("enter HttpMethodBase.readResponseBody(HttpState, HttpConnection)");
+        LOG.trace("enter HttpMethodBase.readResponseBody(HttpConnection)");

-        responseBody = null; // is this desired?
+        responseBody = null;
         InputStream is = conn.getResponseInputStream();
         if (Wire.CONTENT_WIRE.enabled()) {
             is = new WireLogInputStream(is, Wire.CONTENT_WIRE);
@@ -2044,10 +2044,7 @@
                     }
                 }
             } else {
-                if (LOG.isWarnEnabled()) {
-                    LOG.warn("Transfer-Encoding is set but does not contain \"chunked\":
"
-                        + transferEncoding);
-                }
+                LOG.info("Response content is not chunk-encoded");
                 // The connection must be terminated by closing
                 // the socket as per RFC 2616, 3.6
                 setConnectionCloseForced(true);
@@ -2062,8 +2059,8 @@
                     if (connectionHeader != null) {
                         connectionDirective = connectionHeader.getValue();
                     }
-                    if (!"close".equalsIgnoreCase(connectionDirective)) {
-                        LOG.warn("Response content length is not known");
+                    if (isHttp11() && !"close".equalsIgnoreCase(connectionDirective))
{
+                        LOG.info("Response content length is not known");
                         setConnectionCloseForced(true); =======> problem is here!!!
                     }
                     result = is;
-----------------------------------------------