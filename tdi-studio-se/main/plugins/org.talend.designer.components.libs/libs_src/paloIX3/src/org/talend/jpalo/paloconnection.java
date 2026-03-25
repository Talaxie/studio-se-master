package org.talend.jpalo;

import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

import com.talend.csv.CSVReader;

public class paloconnection {

    private HttpHost paloTargetHost;

    private DefaultHttpClient paloHttpClient;

    private String strToken = "";

    private int iSessionTimeOut = 0;

    private String strUserName = "";

    private String strUserPW = "";

    private String strServer = "";

    private String strPort = "";

    public paloconnection(String strUserName, String strUserPW, String strServer, String strPort) throws paloexception {

        super();
        this.strUserName = strUserName;
        this.strUserPW = strUserPW;
        this.strServer = strServer;
        this.strPort = strPort;

        initConnection();

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("user", this.strUserName));
        qparams.add(new BasicNameValuePair("password", palohelpers.getMD5(this.strUserPW)));

        try {
            HttpEntity entity = sendToServer(qparams, "/server/login");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            csv.readNext();
            this.strToken = csv.get(0);
            this.iSessionTimeOut = Integer.valueOf(csv.get(1));
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.toString());
        }
    }

    public String getPaloToken() {
        return strToken;
    }

    public int getSessionTimeout() {
        return iSessionTimeOut;
    }

    public palodatabases getDatabases() throws paloexception {
        return new palodatabases(this);
    }

    // Load the Server
    public void load() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.strToken));
        sendToServerSingleRC(qparams, "/server/load");
    }

    // Saves the Server
    public void save() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.strToken));
        sendToServerSingleRC(qparams, "/server/save");
    }

    // Shutdowns the Server
    public void shutdown() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.strToken));
        sendToServerSingleRC(qparams, "/server/shutdown");
    }

    // Logouts the current palo User
    public void logout() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.strToken));

        try {
            HttpEntity entity = sendToServer(qparams, "/server/logout");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");

            // CsvReader csv = new CsvReader(sendToServer(qparams, "/server/logout").getContent(),
            // Charset.defaultCharset());
            csv.setQuoteChar('"');
            csv.readNext();
            csv.close();
            entity.consumeContent();
            // paloHttpClient.getConnectionManager().shutdown();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    private void initConnection() {

        pingPaloServer();

        paloTargetHost = new HttpHost(strServer, Integer.valueOf(strPort), "http");
        SchemeRegistry supportedSchemes = new SchemeRegistry();
        supportedSchemes.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), Integer.valueOf(strPort)));

        // prepare parameters
        HttpParams params = new BasicHttpParams();
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(params, "UTF-8");
        HttpProtocolParams.setUseExpectContinue(params, true);

        ClientConnectionManager connMgr = new ThreadSafeClientConnManager(params, supportedSchemes);
        paloHttpClient = new DefaultHttpClient(connMgr, params);
    }

    private void pingPaloServer() {
        try {
            // int timeOut = 1000; // I recommend 3 seconds at least int timeout = 3000; / / Ich empfehle 3 Sekunden
            // mindestens
            // boolean status = InetAddress.getByName(strServer).isReachable(timeOut);
            Socket s = new Socket(strServer, Integer.valueOf(strPort));
            s.close();
        } catch (Exception e) {
        }
    }

    // Retrieves only true or false based on the given connection
    public boolean sendToServerSingleRC(List<NameValuePair> qparams, String strAPIUrl) throws paloexception {
        try {
            HttpEntity entity = sendToServer(qparams, strAPIUrl);
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            // CsvReader csv = new CsvReader(sendToServer(qparams, strAPIUrl).getContent(), Charset.defaultCharset());
            csv.setQuoteChar('"');
            csv.readNext();
            boolean bStatus = Boolean.getBoolean(csv.get(0));
            csv.close();
            entity.consumeContent();
            return bStatus;
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public HttpEntity sendToServer(List<NameValuePair> qparams, String strAPIUrl) throws paloexception {

        try {
            URI uri = URIUtils.createURI("http", strServer, Integer.valueOf(strPort), strAPIUrl,
                    URLEncodedUtils.format(qparams, "UTF-8"), null);
            HttpGet req = new HttpGet(uri);

            // System.out.println(req.getURI());

            // Send to Server
            HttpResponse rsp = paloHttpClient.execute(paloTargetHost, req);
            HttpEntity entity = rsp.getEntity();

            // /System.out.println(rsp.getStatusLine().getStatusCode());

            if (rsp.getStatusLine().getStatusCode() != 200) {
                // Error had been occured
                // Close Connection and thend raise paloexception error
                CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
                csv.setQuoteChar('"');
                csv.readNext();
                paloexception plX = new paloexception(csv.get(0), csv.get(1), csv.get(2));
                csv.close();
                entity.consumeContent();
                // req.abort();
                // paloHttpClient.getConnectionManager().shutdown();
                throw (plX);
            } else {
                return entity;
            }

        } catch (Exception e) {
            // if(paloHttpClient!=null)paloHttpClient.getConnectionManager().shutdown();
            throw new paloexception(e.getMessage());
        }
    }

    public String getRulefunctions() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", getPaloToken()));
        try {
            StringBuilder sb = new StringBuilder();
            HttpEntity entity = sendToServer(qparams, "/rule/functions");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                sb.append(csv.get(0));
            }
            csv.close();
            entity.consumeContent();
            return sb.toString();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public String getVersion() throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("", ""));
        try {
            StringBuilder sb = new StringBuilder();
            HttpEntity entity = sendToServer(qparams, "/server/info");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                sb.append(csv.get(0));
                sb.append(".");
                sb.append(csv.get(1));
                sb.append(".");
                sb.append(csv.get(2));
                sb.append(".");
                sb.append(csv.get(3));
            }
            csv.close();
            entity.consumeContent();
            return sb.toString();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if (paloHttpClient != null) {
                paloHttpClient.getConnectionManager().shutdown();
            }
        } catch (Exception e) {
        } finally {
            super.finalize();
        }
    }

}
