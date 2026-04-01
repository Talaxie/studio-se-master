/**
 * WSRoutingOrderV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSRoutingOrderV2  implements java.io.Serializable {
    private java.lang.String name;

    private org.talend.mdm.webservice.WSRoutingOrderV2Status status;

    private long timeCreated;

    private long timeScheduled;

    private long timeLastRunStarted;

    private long timeLastRunCompleted;

    private org.talend.mdm.webservice.WSItemPK wsItemPK;

    private java.lang.String serviceJNDI;

    private java.lang.String serviceParameters;

    private java.lang.String message;

    private java.lang.String bindingUniverseName;

    private java.lang.String bindingUserToken;

    public WSRoutingOrderV2() {
    }

    public WSRoutingOrderV2(
           java.lang.String name,
           org.talend.mdm.webservice.WSRoutingOrderV2Status status,
           long timeCreated,
           long timeScheduled,
           long timeLastRunStarted,
           long timeLastRunCompleted,
           org.talend.mdm.webservice.WSItemPK wsItemPK,
           java.lang.String serviceJNDI,
           java.lang.String serviceParameters,
           java.lang.String message,
           java.lang.String bindingUniverseName,
           java.lang.String bindingUserToken) {
           this.name = name;
           this.status = status;
           this.timeCreated = timeCreated;
           this.timeScheduled = timeScheduled;
           this.timeLastRunStarted = timeLastRunStarted;
           this.timeLastRunCompleted = timeLastRunCompleted;
           this.wsItemPK = wsItemPK;
           this.serviceJNDI = serviceJNDI;
           this.serviceParameters = serviceParameters;
           this.message = message;
           this.bindingUniverseName = bindingUniverseName;
           this.bindingUserToken = bindingUserToken;
    }


    /**
     * Gets the name value for this WSRoutingOrderV2.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSRoutingOrderV2.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this WSRoutingOrderV2.
     * 
     * @return status
     */
    public org.talend.mdm.webservice.WSRoutingOrderV2Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSRoutingOrderV2.
     * 
     * @param status
     */
    public void setStatus(org.talend.mdm.webservice.WSRoutingOrderV2Status status) {
        this.status = status;
    }


    /**
     * Gets the timeCreated value for this WSRoutingOrderV2.
     * 
     * @return timeCreated
     */
    public long getTimeCreated() {
        return timeCreated;
    }


    /**
     * Sets the timeCreated value for this WSRoutingOrderV2.
     * 
     * @param timeCreated
     */
    public void setTimeCreated(long timeCreated) {
        this.timeCreated = timeCreated;
    }


    /**
     * Gets the timeScheduled value for this WSRoutingOrderV2.
     * 
     * @return timeScheduled
     */
    public long getTimeScheduled() {
        return timeScheduled;
    }


    /**
     * Sets the timeScheduled value for this WSRoutingOrderV2.
     * 
     * @param timeScheduled
     */
    public void setTimeScheduled(long timeScheduled) {
        this.timeScheduled = timeScheduled;
    }


    /**
     * Gets the timeLastRunStarted value for this WSRoutingOrderV2.
     * 
     * @return timeLastRunStarted
     */
    public long getTimeLastRunStarted() {
        return timeLastRunStarted;
    }


    /**
     * Sets the timeLastRunStarted value for this WSRoutingOrderV2.
     * 
     * @param timeLastRunStarted
     */
    public void setTimeLastRunStarted(long timeLastRunStarted) {
        this.timeLastRunStarted = timeLastRunStarted;
    }


    /**
     * Gets the timeLastRunCompleted value for this WSRoutingOrderV2.
     * 
     * @return timeLastRunCompleted
     */
    public long getTimeLastRunCompleted() {
        return timeLastRunCompleted;
    }


    /**
     * Sets the timeLastRunCompleted value for this WSRoutingOrderV2.
     * 
     * @param timeLastRunCompleted
     */
    public void setTimeLastRunCompleted(long timeLastRunCompleted) {
        this.timeLastRunCompleted = timeLastRunCompleted;
    }


    /**
     * Gets the wsItemPK value for this WSRoutingOrderV2.
     * 
     * @return wsItemPK
     */
    public org.talend.mdm.webservice.WSItemPK getWsItemPK() {
        return wsItemPK;
    }


    /**
     * Sets the wsItemPK value for this WSRoutingOrderV2.
     * 
     * @param wsItemPK
     */
    public void setWsItemPK(org.talend.mdm.webservice.WSItemPK wsItemPK) {
        this.wsItemPK = wsItemPK;
    }


    /**
     * Gets the serviceJNDI value for this WSRoutingOrderV2.
     * 
     * @return serviceJNDI
     */
    public java.lang.String getServiceJNDI() {
        return serviceJNDI;
    }


    /**
     * Sets the serviceJNDI value for this WSRoutingOrderV2.
     * 
     * @param serviceJNDI
     */
    public void setServiceJNDI(java.lang.String serviceJNDI) {
        this.serviceJNDI = serviceJNDI;
    }


    /**
     * Gets the serviceParameters value for this WSRoutingOrderV2.
     * 
     * @return serviceParameters
     */
    public java.lang.String getServiceParameters() {
        return serviceParameters;
    }


    /**
     * Sets the serviceParameters value for this WSRoutingOrderV2.
     * 
     * @param serviceParameters
     */
    public void setServiceParameters(java.lang.String serviceParameters) {
        this.serviceParameters = serviceParameters;
    }


    /**
     * Gets the message value for this WSRoutingOrderV2.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this WSRoutingOrderV2.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the bindingUniverseName value for this WSRoutingOrderV2.
     * 
     * @return bindingUniverseName
     */
    public java.lang.String getBindingUniverseName() {
        return bindingUniverseName;
    }


    /**
     * Sets the bindingUniverseName value for this WSRoutingOrderV2.
     * 
     * @param bindingUniverseName
     */
    public void setBindingUniverseName(java.lang.String bindingUniverseName) {
        this.bindingUniverseName = bindingUniverseName;
    }


    /**
     * Gets the bindingUserToken value for this WSRoutingOrderV2.
     * 
     * @return bindingUserToken
     */
    public java.lang.String getBindingUserToken() {
        return bindingUserToken;
    }


    /**
     * Sets the bindingUserToken value for this WSRoutingOrderV2.
     * 
     * @param bindingUserToken
     */
    public void setBindingUserToken(java.lang.String bindingUserToken) {
        this.bindingUserToken = bindingUserToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRoutingOrderV2)) return false;
        WSRoutingOrderV2 other = (WSRoutingOrderV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.timeCreated == other.getTimeCreated() &&
            this.timeScheduled == other.getTimeScheduled() &&
            this.timeLastRunStarted == other.getTimeLastRunStarted() &&
            this.timeLastRunCompleted == other.getTimeLastRunCompleted() &&
            ((this.wsItemPK==null && other.getWsItemPK()==null) || 
             (this.wsItemPK!=null &&
              this.wsItemPK.equals(other.getWsItemPK()))) &&
            ((this.serviceJNDI==null && other.getServiceJNDI()==null) || 
             (this.serviceJNDI!=null &&
              this.serviceJNDI.equals(other.getServiceJNDI()))) &&
            ((this.serviceParameters==null && other.getServiceParameters()==null) || 
             (this.serviceParameters!=null &&
              this.serviceParameters.equals(other.getServiceParameters()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.bindingUniverseName==null && other.getBindingUniverseName()==null) || 
             (this.bindingUniverseName!=null &&
              this.bindingUniverseName.equals(other.getBindingUniverseName()))) &&
            ((this.bindingUserToken==null && other.getBindingUserToken()==null) || 
             (this.bindingUserToken!=null &&
              this.bindingUserToken.equals(other.getBindingUserToken())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += new Long(getTimeCreated()).hashCode();
        _hashCode += new Long(getTimeScheduled()).hashCode();
        _hashCode += new Long(getTimeLastRunStarted()).hashCode();
        _hashCode += new Long(getTimeLastRunCompleted()).hashCode();
        if (getWsItemPK() != null) {
            _hashCode += getWsItemPK().hashCode();
        }
        if (getServiceJNDI() != null) {
            _hashCode += getServiceJNDI().hashCode();
        }
        if (getServiceParameters() != null) {
            _hashCode += getServiceParameters().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getBindingUniverseName() != null) {
            _hashCode += getBindingUniverseName().hashCode();
        }
        if (getBindingUserToken() != null) {
            _hashCode += getBindingUserToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSRoutingOrderV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeScheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeScheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLastRunStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeLastRunStarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLastRunCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeLastRunCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsItemPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsItemPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceJNDI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceJNDI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindingUniverseName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindingUniverseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindingUserToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindingUserToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
