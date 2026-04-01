// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
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

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author PCW created on Nov 7, 2023
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PAT {

    @JsonProperty("active")
    private boolean active;

    @JsonProperty("login")
    private String login;

    @JsonProperty("pat_created")
    private Date pat_created;

    @JsonProperty("email")
    private String email;

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the pat_created
     */
    public Date getPat_created() {
        return pat_created;
    }

    /**
     * @param pat_created the pat_created to set
     */
    public void setPat_created(Date pat_created) {
        this.pat_created = pat_created;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
