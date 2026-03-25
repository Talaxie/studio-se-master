package org.talend.http;

import net.sf.json.JSONObject;

import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;

public class HttpUtil {
	
	public static void handHttpResponse(org.apache.http.HttpResponse response) throws java.io.IOException {
	    if(response == null) {
	        return;
	    }
	    
	    if(response.getStatusLine().getStatusCode() != 200) {
            String message = "";
            
            String returnedValue = EntityUtils.toString(response.getEntity());
            
            ContentType contentType = ContentType.get(response.getEntity());
            if (contentType != null && ContentType.APPLICATION_JSON.getMimeType().equals(contentType.getMimeType())) {
                JSONObject object = JSONObject.fromObject(returnedValue);
                
                message = getValueFromJson(object, "message");
                String cause = getValueFromJson(object, "cause");
                if (!cause.isEmpty()) {
                    if (!message.isEmpty()) {
                        message = message + "\n" + cause;
                    } else {
                        message = cause;
                    }
                }
                
                if (message.isEmpty()) {
                    message = response.getStatusLine().getReasonPhrase();
                }
            } else {
                if (returnedValue.isEmpty()) {
                    message = response.getStatusLine().getReasonPhrase();
                }
            }
            
            throw new RuntimeException(message);
        }
	}
	
	private static String getValueFromJson(JSONObject object, String key) {
        String message = "";
        try {
            message = object.getString(key);
        } catch (Exception e) {
            message = "";
        }
        return message;
    }
	
	public static void handHttpResponse(java.net.HttpURLConnection connection) throws java.io.IOException {
	    if(connection == null) {
	        return;
	    }
	    
	    int responseCode = connection.getResponseCode();
	    String responseMessage = connection.getResponseMessage();
        if(responseCode != 200) {//login fail
            throw new RuntimeException("" + responseCode + " : " + responseMessage);
        }
    }
	
}