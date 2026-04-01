package org.talend.designer.webservice.ws.wsdlinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.wsdl.Message;

/**
 * 
 * @author gcui
 */
public class OperationInfo {

    /** SOAP operation type */
    private String operationType = "";

    /** The SOAP encoding style to use. */
    private String encodingStyle = "";

    /** The URL where the target object is located. */
    private String targetURL = "";

    /** The namespace URI used for this SOAP operation. */
    private String namespaceURI = "";

    /** The URI of the target object to invoke for this SOAP operation. */
    private String targetObjectURI = "";

    /** The name used to when making an invocation. */
    private String targetMethodName = "";

    /** The input message. */
    private String inputMessageText = "";

    /** The output message. */
    private String outputMessageText = "";

    /** The name of input message. */
    private String inputMessageName = "";

    /** The name of output message. */
    private String outputMessageName = "";

    /** The action URI value to use when making a invocation. */
    private String soapActionURI = "";

    /** The encoding type "document" vs. "rpc" */
    private String style = "document";

    private List<ParameterInfo> inparameters = new ArrayList<ParameterInfo>();

    private List<ParameterInfo> outparameters = new ArrayList<ParameterInfo>();

    private Message inmessage;

    private Message outmessage;

    private Vector wsdltypes;

    private String serviceid;

    public OperationInfo() {
        super();
    }

    public OperationInfo(String style) {
        super();
        setStyle(style);
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    public Vector getWsdltype() {
        return wsdltypes;
    }

    public void setWsdltype(Vector wsdltypes) {
        this.wsdltypes = wsdltypes;
    }

    public Message getInmessage() {
        return inmessage;
    }

    public void setInmessage(Message inmessage) {
        this.inmessage = inmessage;
    }

    public Message getOutmessage() {
        return outmessage;
    }

    public void setOutmessage(Message outmessage) {
        this.outmessage = outmessage;
    }

    public void addInparameter(ParameterInfo parameter) {
        this.inparameters.add(parameter);
    }

    public List<ParameterInfo> getInparameters() {
        return inparameters;
    }

    public void addOutparameter(ParameterInfo parameter) {
        this.outparameters.add(parameter);
    }

    public List<ParameterInfo> getOutparameters() {
        return this.outparameters;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public void setEncodingStyle(String value) {
        encodingStyle = value;
    }

    public String getEncodingStyle() {
        return encodingStyle;
    }

    public void setTargetURL(String value) {
        targetURL = value;
    }

    public String getTargetURL() {
        return targetURL;
    }

    public void setNamespaceURI(String value) {
        namespaceURI = value;
    }

    public String getNamespaceURI() {
        return namespaceURI;
    }

    public void setTargetObjectURI(String value) {
        targetObjectURI = value;
    }

    public String getTargetObjectURI() {
        return targetObjectURI;
    }

    public void setTargetMethodName(String value) {
        targetMethodName = value;
    }

    public String getTargetMethodName() {
        return targetMethodName;
    }

    public void setInputMessageName(String value) {
        inputMessageName = value;
    }

    public String getInputMessageName() {
        return inputMessageName;
    }

    public void setOutputMessageName(String value) {
        outputMessageName = value;
    }

    public String getOutputMessageName() {
        return outputMessageName;
    }

    public void setInputMessageText(String value) {
        inputMessageText = value;
    }

    public String getInputMessageText() {
        return inputMessageText;
    }

    public void setOutputMessageText(String value) {
        outputMessageText = value;
    }

    public String getOutputMessageText() {
        return outputMessageText;
    }

    public void setSoapActionURI(String value) {
        soapActionURI = value;
    }

    public String getSoapActionURI() {
        return soapActionURI;
    }

    public void setStyle(String value) {
        style = value;
    }

    public String getStyle() {
        return style;
    }

    public String toString() {
        return getTargetMethodName();
    }
}
