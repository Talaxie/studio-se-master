package org.talend.designer.webservice.ws.wsdlutil;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.wsdl.xml.WSDLLocator;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.xml.sax.InputSource;

public class WSDLLocatorImpl implements WSDLLocator {

    private static final String HTTP_HEADER_COOKIE = "Cookie";

    private String wsdlUri;

    private String latestImportUri;

    private ServiceHelperConfiguration configuration;

    private CloseableHttpClient httpClient;

    private Set<InputStream> inputStreams;

    public WSDLLocatorImpl(ServiceHelperConfiguration configuration, String wsdlUri) {
        this.configuration = configuration;
        this.wsdlUri = wsdlUri;
        inputStreams = new HashSet<InputStream>();
    }

    public InputSource getBaseInputSource() {
        try {
            createHttpClient();
            URL url = new URL(wsdlUri);
            HttpGet httpGet = createGetMethod(wsdlUri);
            HttpHost targetHost = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
            CloseableHttpResponse httpResponse = httpClient.execute(targetHost, httpGet);
            try {
                InputStream is = httpResponse.getEntity().getContent();
                inputStreams.add(is);
                return new InputSource(is);
            } finally {
                httpResponse.close();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public InputSource getImportInputSource(String parentLocation, String importLocation) {
        try {
            createHttpClient();
            URL url = getURL(parentLocation, importLocation);
            latestImportUri = url.toExternalForm();
            HttpGet httpGet = createGetMethod(latestImportUri);
            HttpHost targetHost = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
            CloseableHttpResponse httpResponse = httpClient.execute(targetHost, httpGet);
            InputStream is = httpResponse.getEntity().getContent();
            inputStreams.add(is);
            return new InputSource(is);
        } catch (MalformedURLException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static URL getURL(String parentLocation, String wsdlLocation) throws MalformedURLException {
        URL contextURL = (parentLocation != null) ? getURL(null, parentLocation) : null;
        try {
            return new URL(contextURL, wsdlLocation);
        } catch (MalformedURLException e) {
            File tempFile = new File(wsdlLocation);
            if (contextURL == null || (contextURL != null && tempFile.isAbsolute())) {
                return tempFile.toURI().toURL();
            }
            // this line is reached if contextURL != null, wsdlLocation is a relative path,
            // and a MalformedURLException has been thrown - so re-throw the Exception.
            throw e;
        }
    }

    public String getBaseURI() {
        return wsdlUri;
    }

    public String getLatestImportURI() {
        return latestImportUri;
    }

    public void close() {
        for (InputStream is : inputStreams) {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(WSDLLocatorImpl.class.getName()).log(Level.WARNING, null, ex);
            }
        }
        inputStreams.clear();
        try {
            httpClient.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private HttpGet createGetMethod(String uri) {
        HttpGet httpGet = new HttpGet(uri);
        if (configuration.getCookie() != null) {
            httpGet.addHeader(HTTP_HEADER_COOKIE, configuration.getCookie());
        }

        return httpGet;
    }

    private void createHttpClient() {
        RequestConfig config = null;
        if (configuration.getProxyServer() != null) {
            HttpHost proxy = new HttpHost(configuration.getProxyServer(), configuration.getProxyPort());
            config = RequestConfig.custom().setProxy(proxy).build();
        }
        CredentialsProvider credsProvider = null;
        if (configuration.getUsername() != null) {
            Credentials credentials = new UsernamePasswordCredentials(configuration.getUsername(), configuration.getPassword());
            credsProvider = new BasicCredentialsProvider();
            credsProvider.setCredentials(AuthScope.ANY, credentials);
        }

        if (configuration.getProxyUsername() != null) {
            Credentials credentials = new UsernamePasswordCredentials(configuration.getProxyUsername(),
                    configuration.getProxyPassword());
            credsProvider = new BasicCredentialsProvider();
            credsProvider.setCredentials(AuthScope.ANY, credentials);
        }
        httpClient = HttpClients.custom().setDefaultCredentialsProvider(credsProvider).setDefaultRequestConfig(config).build();
    }
}
