package org.talend.bonita;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.bonitasoft.engine.api.LoginAPI;
import org.bonitasoft.engine.api.ProcessAPI;
import org.bonitasoft.engine.api.TenantAPIAccessor;
import org.bonitasoft.engine.bpm.bar.BusinessArchive;
import org.bonitasoft.engine.bpm.bar.BusinessArchiveFactory;
import org.bonitasoft.engine.bpm.process.ProcessDefinition;
import org.bonitasoft.engine.bpm.process.ProcessInstance;
import org.bonitasoft.engine.exception.BonitaException;
import org.bonitasoft.engine.session.APISession;

public class Client {

    private static final String BONITA_HOME_KEY = "bonita.home";

    private APISession session;
    private ProcessAPI processAPI;
    private LoginAPI loginAPI;
    
    public Client(String bonitaHome) throws BonitaException {
    	System.setProperty(BONITA_HOME_KEY,bonitaHome);
    	loginAPI = TenantAPIAccessor.getLoginAPI();
    }
    
    public static void main(String[] args) throws Exception {
    	Client client = new Client("C:/BonitaBPMCommunity-6.5.2/workspace/bonita");

        client.login("walter.bates", "bpm");
        // deploy a process
        String processDefinitionId = client.deployProcess("C:/Users/Talend/Desktop/login--1.0.bar");

        // start a process
        Map<String,Object> vars = new HashMap<String,Object>();
        vars.put("id",1);
        vars.put("name","wangwei");
        vars.put("date","2015");
        client.startProcess(processDefinitionId,vars);
        client.startProcess("login","1.0",vars);
        client.startProcess("login","1.0",vars);
        
        client.logout();
    }

    public String deployProcess(String file) throws BonitaException, IOException {
        BusinessArchive businessArchive = BusinessArchiveFactory.readBusinessArchive(new File(file));
        ProcessDefinition processDefinition = processAPI.deploy(businessArchive);
        processAPI.enableProcess(processDefinition.getId());
        return String.valueOf(processDefinition.getId());
    }

    public String startProcess(String processDefinitionId,Map<String, Object> processVariables) throws BonitaException {
        Map<String, Serializable> listVariablesSerializable = new HashMap<String, Serializable>();

        for (String variableName : processVariables.keySet()) {
            if (processVariables.get(variableName) == null || (!(processVariables.get(variableName) instanceof Serializable))) {
                continue;
            }
            Object value = processVariables.get(variableName);
            Serializable valueSerializable = (Serializable) value;

            variableName = variableName.toLowerCase();
            listVariablesSerializable.put(variableName, valueSerializable);
        }
    	
        ProcessInstance processInstance = processAPI.startProcess(Long.parseLong(processDefinitionId),listVariablesSerializable);
        return String.valueOf(processInstance.getId());
    }
    
    public String startProcess(String processDefinitionName,String processDefinitionVersion,Map<String, Object> processVariables) throws BonitaException {
    	long processDefinitionId = processAPI.getProcessDefinitionId(processDefinitionName, processDefinitionVersion);
        ProcessDefinition processDefinition = processAPI.getProcessDefinition(processDefinitionId);
        
        Map<String, Serializable> listVariablesSerializable = new HashMap<String, Serializable>();

        for (String variableName : processVariables.keySet()) {
            if (processVariables.get(variableName) == null || (!(processVariables.get(variableName) instanceof Serializable)))
                continue;
            Object value = processVariables.get(variableName);
            Serializable valueSerializable = (Serializable) value;

            variableName = variableName.toLowerCase();
            listVariablesSerializable.put(variableName, valueSerializable);
        }
        
        ProcessInstance processInstance = processAPI.startProcess(processDefinition.getId(),listVariablesSerializable);
        return String.valueOf(processInstance.getId());
    }

    public void login(String username, String password) throws BonitaException {
        this.session = loginAPI.login(username, password);
        processAPI = TenantAPIAccessor.getProcessAPI(session);
    }

    public void logout() throws BonitaException {
    	loginAPI.logout(session);
        session = null;
    }

}
