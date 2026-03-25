/**
 * WSSynchronizationPlanStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationPlanStatus  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSSynchronizationPlanStatusCode wsStatusCode;

    private java.lang.String statusMessage;

    private java.util.Calendar lastRunStarted;

    private java.util.Calendar lastRunStopped;

    public WSSynchronizationPlanStatus() {
    }

    public WSSynchronizationPlanStatus(
           org.talend.mdm.webservice.WSSynchronizationPlanStatusCode wsStatusCode,
           java.lang.String statusMessage,
           java.util.Calendar lastRunStarted,
           java.util.Calendar lastRunStopped) {
           this.wsStatusCode = wsStatusCode;
           this.statusMessage = statusMessage;
           this.lastRunStarted = lastRunStarted;
           this.lastRunStopped = lastRunStopped;
    }


    /**
     * Gets the wsStatusCode value for this WSSynchronizationPlanStatus.
     * 
     * @return wsStatusCode
     */
    public org.talend.mdm.webservice.WSSynchronizationPlanStatusCode getWsStatusCode() {
        return wsStatusCode;
    }


    /**
     * Sets the wsStatusCode value for this WSSynchronizationPlanStatus.
     * 
     * @param wsStatusCode
     */
    public void setWsStatusCode(org.talend.mdm.webservice.WSSynchronizationPlanStatusCode wsStatusCode) {
        this.wsStatusCode = wsStatusCode;
    }


    /**
     * Gets the statusMessage value for this WSSynchronizationPlanStatus.
     * 
     * @return statusMessage
     */
    public java.lang.String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this WSSynchronizationPlanStatus.
     * 
     * @param statusMessage
     */
    public void setStatusMessage(java.lang.String statusMessage) {
        this.statusMessage = statusMessage;
    }


    /**
     * Gets the lastRunStarted value for this WSSynchronizationPlanStatus.
     * 
     * @return lastRunStarted
     */
    public java.util.Calendar getLastRunStarted() {
        return lastRunStarted;
    }


    /**
     * Sets the lastRunStarted value for this WSSynchronizationPlanStatus.
     * 
     * @param lastRunStarted
     */
    public void setLastRunStarted(java.util.Calendar lastRunStarted) {
        this.lastRunStarted = lastRunStarted;
    }


    /**
     * Gets the lastRunStopped value for this WSSynchronizationPlanStatus.
     * 
     * @return lastRunStopped
     */
    public java.util.Calendar getLastRunStopped() {
        return lastRunStopped;
    }


    /**
     * Sets the lastRunStopped value for this WSSynchronizationPlanStatus.
     * 
     * @param lastRunStopped
     */
    public void setLastRunStopped(java.util.Calendar lastRunStopped) {
        this.lastRunStopped = lastRunStopped;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationPlanStatus)) return false;
        WSSynchronizationPlanStatus other = (WSSynchronizationPlanStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsStatusCode==null && other.getWsStatusCode()==null) || 
             (this.wsStatusCode!=null &&
              this.wsStatusCode.equals(other.getWsStatusCode()))) &&
            ((this.statusMessage==null && other.getStatusMessage()==null) || 
             (this.statusMessage!=null &&
              this.statusMessage.equals(other.getStatusMessage()))) &&
            ((this.lastRunStarted==null && other.getLastRunStarted()==null) || 
             (this.lastRunStarted!=null &&
              this.lastRunStarted.equals(other.getLastRunStarted()))) &&
            ((this.lastRunStopped==null && other.getLastRunStopped()==null) || 
             (this.lastRunStopped!=null &&
              this.lastRunStopped.equals(other.getLastRunStopped())));
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
        if (getWsStatusCode() != null) {
            _hashCode += getWsStatusCode().hashCode();
        }
        if (getStatusMessage() != null) {
            _hashCode += getStatusMessage().hashCode();
        }
        if (getLastRunStarted() != null) {
            _hashCode += getLastRunStarted().hashCode();
        }
        if (getLastRunStopped() != null) {
            _hashCode += getLastRunStopped().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSynchronizationPlanStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanStatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRunStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastRunStarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRunStopped");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastRunStopped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
