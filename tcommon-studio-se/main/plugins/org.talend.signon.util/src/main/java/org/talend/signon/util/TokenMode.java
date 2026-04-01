// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.signon.util;

import org.talend.utils.json.JSONException;
import org.talend.utils.json.JSONObject;

public class TokenMode {

    private static final String ACCESS_TOKEN_KEY = "access_token";

    private static final String EXPIRES_IN_KEY = "expires_in";

    private static final String ID_TOKEN_KEY = "id_token";

    private static final String REFRESH_TOKEN_KEY = "refresh_token";

    private static final String SCOPE_KEY = "scope";

    private static final String TOKEN_TYPE_KEY = "token_type";

    private static final String LAST_REFRESH_TIME_KEY = "last_refresh_time";

    private static final String DATA_CENTER_KEY = "data_center";

    private String clientId;

    private String accessToken;

    private String refreshToken;

    private long expiresIn;

    private String idToken;

    private String scope;

    private String tokenType;

    private String dataCenter;

    private long lastRefreshTime = System.currentTimeMillis();

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public long getLastRefreshTime() {
        return lastRefreshTime;
    }

    public void setLastRefreshTime(long lastRefreshTime) {
        this.lastRefreshTime = lastRefreshTime;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public static TokenMode parseFromJson(String jsonString, String dataCenter) throws JSONException {
        JSONObject jsonObj = new JSONObject(jsonString);
        TokenMode token = new TokenMode();
        token.setAccessToken(jsonObj.getString(TokenMode.ACCESS_TOKEN_KEY));
        token.setExpiresIn(jsonObj.getLong(TokenMode.EXPIRES_IN_KEY));
        token.setRefreshToken(jsonObj.getString(TokenMode.REFRESH_TOKEN_KEY));  
        if (jsonObj.has(TokenMode.ID_TOKEN_KEY)) {
            token.setIdToken(jsonObj.getString(TokenMode.ID_TOKEN_KEY));
        } 
        if (jsonObj.has(TokenMode.SCOPE_KEY)) {
            token.setScope(jsonObj.getString(TokenMode.SCOPE_KEY));
        }
        if (jsonObj.has(TokenMode.TOKEN_TYPE_KEY)) {
            token.setTokenType(jsonObj.getString(TokenMode.TOKEN_TYPE_KEY));
        } 
        if (jsonObj.has(TokenMode.LAST_REFRESH_TIME_KEY)) {
            token.setLastRefreshTime(jsonObj.getLong(TokenMode.LAST_REFRESH_TIME_KEY));
        }
        if (dataCenter == null && jsonObj.has(TokenMode.DATA_CENTER_KEY)) {
            token.setDataCenter(jsonObj.getString(TokenMode.DATA_CENTER_KEY));
        } else {
            token.setDataCenter(dataCenter);
        }
        return token;
    }

    public static JSONObject writeToJson(TokenMode token) throws JSONException {
        JSONObject object = new JSONObject();
        object.put(TokenMode.ACCESS_TOKEN_KEY, token.getAccessToken());
        object.put(TokenMode.EXPIRES_IN_KEY, token.getExpiresIn());
        object.put(TokenMode.ID_TOKEN_KEY, token.getIdToken());
        object.put(TokenMode.REFRESH_TOKEN_KEY, token.getRefreshToken());
        object.put(TokenMode.SCOPE_KEY, token.getScope());
        object.put(TokenMode.TOKEN_TYPE_KEY, token.getTokenType());
        object.put(TokenMode.LAST_REFRESH_TIME_KEY, token.getLastRefreshTime());
        object.put(TokenMode.DATA_CENTER_KEY, token.getDataCenter());

        return object;
    }
}
