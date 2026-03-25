package org.talend.bonita;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

public class RestClient {

	private static final String BONITA_URI = "http://localhost:8080/bonita";
	
	private final HttpClient httpClient;
	private HttpContext httpContext;
	private final String bonitaURI;

	public static void main(String[] args) {
		PoolingClientConnectionManager conMan = getConnectionManager();
		RestClient client = new RestClient(new DefaultHttpClient(conMan), BONITA_URI);
		
		client.loginAs("walter.bates", "bpm");
		//deploy it
		String processId = client.deployProcess("C:/Users/Talend/Desktop/login--1.0.bar");
		
		processId = client.getProcessID("login","1.0");
		System.out.println(processId);
		//start it
		Map<String,String> map = new HashMap<String,String>();
		map.put("id","1");
		map.put("name","wangwei");
		client.startProcess(processId,map);
		
		client.logout();
		client.close();
	}
	
	private static PoolingClientConnectionManager getConnectionManager() {
		PoolingClientConnectionManager conMan = new PoolingClientConnectionManager(SchemeRegistryFactory.createDefault());
		conMan.setMaxTotal(200);
		conMan.setDefaultMaxPerRoute(200);
		return conMan;
	}
	
	public RestClient() {
		PoolingClientConnectionManager conMan = getConnectionManager();
		httpClient = new DefaultHttpClient(conMan);
		this.bonitaURI = BONITA_URI;
	}
	
	public RestClient(String bonitaURI) {
		PoolingClientConnectionManager conMan = getConnectionManager();
		httpClient = new DefaultHttpClient(conMan);
		this.bonitaURI = bonitaURI;
	}
	
	public RestClient(HttpClient client, String bonitaURI) {
		httpClient = client;
		this.bonitaURI = bonitaURI;
	}

	public void close() {
		httpClient.getConnectionManager().shutdown();
	}

	public void loginAs(String username, String password) {
		try {

			CookieStore cookieStore = new BasicCookieStore();
			httpContext = new BasicHttpContext();
			httpContext.setAttribute(ClientContext.COOKIE_STORE, cookieStore);

			String loginURL = "/loginservice";

			// If you misspell a parameter you will get a HTTP 500 error
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add(new BasicNameValuePair("username", username));
			urlParameters.add(new BasicNameValuePair("password", password));
			urlParameters.add(new BasicNameValuePair("redirect", "false"));

			// UTF-8 is mandatory otherwise you get a NPE
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(urlParameters, "utf-8");
			executePostRequest(loginURL, entity);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}
	
	public void logout() {
		consumeResponse(executeGetRequest("/logoutservice"),false);
	}

	public String getProcessID(String processName,String version) {
		return extractProcessId(executeGetRequest("/API/bpm/process?f=name=" + processName + "&f=version=" + version));
	}
	
	public String deployProcess(String path) {
		try {
			String uploadedFilePath = uploadGeneratedBar(path);
			String processId = installProcessFromUploadedBar(uploadedFilePath);
			enableProcess(processId);
			return processId;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
	
	private String uploadGeneratedBar(String path) throws IOException, ClientProtocolException {
		// build the process example
		File barFile = new File(path);

		HttpPost post = new HttpPost(bonitaURI + "/portal/processUpload");

		MultipartEntity entity = new MultipartEntity();
		entity.addPart("file", new FileBody(barFile));
		post.setEntity(entity);

		HttpResponse response = httpClient.execute(post, httpContext);
		return extractUploadedFilePathFromResponse(response);

	}
	
	private String extractUploadedFilePathFromResponse(HttpResponse response) {
		try {
			return EntityUtils.toString(response.getEntity());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
	
	private String installProcessFromUploadedBar(String uploadedFilePath) {
		String payloadAsString = "{\"fileupload\":\"" + uploadedFilePath + "\"}";

		return extractProcessId(executePostRequest("/API/bpm/process", payloadAsString));

	}
	
	private String extractProcessId(HttpResponse response) {
		ensureStatusOk(response);
		try {
			String processInJSON = EntityUtils.toString(response.getEntity());
			
			int index = processInJSON.indexOf("id\":");
			if(index < 0) {
				throw new RuntimeException("the response doesn't contain id information");
			} 
			
			String remain = processInJSON.substring(index + 5);
			String id = remain.substring(0, remain.indexOf("\""));

			return id;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void enableProcess(String processId) {
		String payloadAsString = "{\"activationState\":\"ENABLED\"}";
		consumeResponse(executePutRequest("/API/bpm/process/" + processId, payloadAsString),true);
	}
	
	public String startProcess(String processDefinitionId, Map<String,String> keyValues) {
		String apiURI = "/API/bpm/case/";
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		
		sb.append("\"processDefinitionId\": ");
		sb.append(processDefinitionId);
		
		appendVars(sb,keyValues);
		
		sb.append("}");
		String payloadAsString = sb.toString();
		return extractProcessId(executePostRequest(apiURI, payloadAsString));
	}
	
	private void appendVars(StringBuilder sb, Map<String, String> keyValues) {
		if(keyValues==null || keyValues.isEmpty()) {
			return;
		}
		
		sb.append(",\"variables\":[");
		Iterator<Map.Entry<String, String>> iterator = keyValues.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			sb.append("{");
			
			sb.append("\"name\":");
			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\"");
			
			sb.append(",");
			
			sb.append("\"value\":");
			sb.append("\"");
			sb.append(entry.getValue());
			sb.append("\"");
			
			sb.append("}");
			
			if(iterator.hasNext()) {
				sb.append(",");
			}
		}
		sb.append("]");
	}

	private HttpResponse executeGetRequest(String apiURI) {
		try {
			HttpGet getRequest = new HttpGet(bonitaURI + apiURI);

			HttpResponse response = httpClient.execute(getRequest, httpContext);

			return response;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}
	
	private int executePostRequest(String apiURI, UrlEncodedFormEntity entity) {
		try {
			HttpPost postRequest = new HttpPost(bonitaURI + apiURI);

			postRequest.setEntity(entity);

			HttpResponse response = httpClient.execute(postRequest, httpContext);

			return consumeResponse(response, true);

		} catch (HttpHostConnectException e) {
			throw new RuntimeException("Bonita bundle may not have been started, or the URL is invalid. Please verify hostname and port number. URL used is: " + BONITA_URI,e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}
	
	private HttpResponse executePostRequest(String apiURI, String payloadAsString) {
		try {
			HttpPost postRequest = new HttpPost(bonitaURI + apiURI);

			StringEntity input = new StringEntity(payloadAsString);
			input.setContentType("application/json");

			postRequest.setEntity(input);

			HttpResponse response = httpClient.execute(postRequest, httpContext);

			return response;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	private HttpResponse executePutRequest(String apiURI, String payloadAsString) {
		try {
			HttpPut putRequest = new HttpPut(bonitaURI + apiURI);
			putRequest.addHeader("Content-Type", "application/json");

			StringEntity input = new StringEntity(payloadAsString);
			input.setContentType("application/json");
			putRequest.setEntity(input);

			return httpClient.execute(putRequest, httpContext);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	private int consumeResponse(HttpResponse response, boolean printResponse) {

		String responseAsString = consumeResponseIfNecessary(response);
		if(printResponse) {
			System.out.println(responseAsString);
		}

		return ensureStatusOk(response);
	}

	private String consumeResponseIfNecessary(HttpResponse response) {
		if (response.getEntity() != null) {
			BufferedReader rd;
			try {
				rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

				StringBuffer result = new StringBuffer();
				String line = "";
				while ((line = rd.readLine()) != null) {
					result.append(line);
				}
				return result.toString();
			} catch (Exception e) {
				throw new RuntimeException("Failed to consume response.", e);
			}
		} else {
			return "";
		}
	}
	
	private int ensureStatusOk(HttpResponse response) {
		if (response.getStatusLine().getStatusCode() != 201 && response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode() + " : "
					+ response.getStatusLine().getReasonPhrase());
		}
		return response.getStatusLine().getStatusCode();
	}

}
