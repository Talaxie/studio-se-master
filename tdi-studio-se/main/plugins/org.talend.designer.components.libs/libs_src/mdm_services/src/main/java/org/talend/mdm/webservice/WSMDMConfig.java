/**
 * WSMDMConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSMDMConfig  implements java.io.Serializable {
    private java.lang.String serverName;

    private java.lang.String serverPort;

    private java.lang.String userName;

    private java.lang.String password;

    private java.lang.String xdbDriver;

    private java.lang.String xdbID;

    private java.lang.String xdbUrl;

    private java.lang.String isupurl;

    public WSMDMConfig() {
    }

    public WSMDMConfig(
           java.lang.String serverName,
           java.lang.String serverPort,
           java.lang.String userName,
           java.lang.String password,
           java.lang.String xdbDriver,
           java.lang.String xdbID,
           java.lang.String xdbUrl,
           java.lang.String isupurl) {
           this.serverName = serverName;
           this.serverPort = serverPort;
           this.userName = userName;
           this.password = password;
           this.xdbDriver = xdbDriver;
           this.xdbID = xdbID;
           this.xdbUrl = xdbUrl;
           this.isupurl = isupurl;
    }


    /**
     * Gets the serverName value for this WSMDMConfig.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this WSMDMConfig.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the serverPort value for this WSMDMConfig.
     * 
     * @return serverPort
     */
    public java.lang.String getServerPort() {
        return serverPort;
    }


    /**
     * Sets the serverPort value for this WSMDMConfig.
     * 
     * @param serverPort
     */
    public void setServerPort(java.lang.String serverPort) {
        this.serverPort = serverPort;
    }


    /**
     * Gets the userName value for this WSMDMConfig.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this WSMDMConfig.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the password value for this WSMDMConfig.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this WSMDMConfig.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the xdbDriver value for this WSMDMConfig.
     * 
     * @return xdbDriver
     */
    public java.lang.String getXdbDriver() {
        return xdbDriver;
    }


    /**
     * Sets the xdbDriver value for this WSMDMConfig.
     * 
     * @param xdbDriver
     */
    public void setXdbDriver(java.lang.String xdbDriver) {
        this.xdbDriver = xdbDriver;
    }


    /**
     * Gets the xdbID value for this WSMDMConfig.
     * 
     * @return xdbID
     */
    public java.lang.String getXdbID() {
        return xdbID;
    }


    /**
     * Sets the xdbID value for this WSMDMConfig.
     * 
     * @param xdbID
     */
    public void setXdbID(java.lang.String xdbID) {
        this.xdbID = xdbID;
    }


    /**
     * Gets the xdbUrl value for this WSMDMConfig.
     * 
     * @return xdbUrl
     */
    public java.lang.String getXdbUrl() {
        return xdbUrl;
    }


    /**
     * Sets the xdbUrl value for this WSMDMConfig.
     * 
     * @param xdbUrl
     */
    public void setXdbUrl(java.lang.String xdbUrl) {
        this.xdbUrl = xdbUrl;
    }


    /**
     * Gets the isupurl value for this WSMDMConfig.
     * 
     * @return isupurl
     */
    public java.lang.String getIsupurl() {
        return isupurl;
    }


    /**
     * Sets the isupurl value for this WSMDMConfig.
     * 
     * @param isupurl
     */
    public void setIsupurl(java.lang.String isupurl) {
        this.isupurl = isupurl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSMDMConfig)) return false;
        WSMDMConfig other = (WSMDMConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.serverPort==null && other.getServerPort()==null) || 
             (this.serverPort!=null &&
              this.serverPort.equals(other.getServerPort()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.xdbDriver==null && other.getXdbDriver()==null) || 
             (this.xdbDriver!=null &&
              this.xdbDriver.equals(other.getXdbDriver()))) &&
            ((this.xdbID==null && other.getXdbID()==null) || 
             (this.xdbID!=null &&
              this.xdbID.equals(other.getXdbID()))) &&
            ((this.xdbUrl==null && other.getXdbUrl()==null) || 
             (this.xdbUrl!=null &&
              this.xdbUrl.equals(other.getXdbUrl()))) &&
            ((this.isupurl==null && other.getIsupurl()==null) || 
             (this.isupurl!=null &&
              this.isupurl.equals(other.getIsupurl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getServerPort() != null) {
            _hashCode += getServerPort().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getXdbDriver() != null) {
            _hashCode += getXdbDriver().hashCode();
        }
        if (getXdbID() != null) {
            _hashCode += getXdbID().hashCode();
        }
        if (getXdbUrl() != null) {
            _hashCode += getXdbUrl().hashCode();
        }
        if (getIsupurl() != null) {
            _hashCode += getIsupurl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSMDMConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xdbDriver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xdbDriver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xdbID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xdbID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xdbUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xdbUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isupurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isupurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
