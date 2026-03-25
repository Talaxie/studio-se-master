package org.talend.designer.webservice.ws.wsdlinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author gcui
 */
public class ParameterInfo {

    private String name;

    private int id;

    private String index;

    private String value;

    private String serviceid;// service id

    private String operationname;

    private String inputtype = null;

    private String type;

    private String nameSpace;

    private String ParaFullName;

    /* list of parameters, only filled if complex type */
    private List<ParameterInfo> parameterInfos = new ArrayList<ParameterInfo>();

    /* only if type is array */
    private int arraySize;

    private ParameterInfo parent;

    public ParameterInfo getParent() {
        return parent;
    }

    public void setParent(ParameterInfo parent) {
        this.parent = parent;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public List<ParameterInfo> getParameterInfos() {
        return parameterInfos;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype;
    }

    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname;
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndex() {
        return this.index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public String getParaFullName() {
        return this.ParaFullName;
    }

    public void setParaFullName(String paraFullName) {
        this.ParaFullName = paraFullName;
    }

}
