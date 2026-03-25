/**
 * WSSynchronizationItemRemoteInstances.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationItemRemoteInstances  implements java.io.Serializable {
    private java.lang.String remoteSystemName;

    private java.lang.String remoteRevisionID;

    private java.lang.String xml;

    private java.util.Calendar lastLocalSynchronizationTime;

    public WSSynchronizationItemRemoteInstances() {
    }

    public WSSynchronizationItemRemoteInstances(
           java.lang.String remoteSystemName,
           java.lang.String remoteRevisionID,
           java.lang.String xml,
           java.util.Calendar lastLocalSynchronizationTime) {
           this.remoteSystemName = remoteSystemName;
           this.remoteRevisionID = remoteRevisionID;
           this.xml = xml;
           this.lastLocalSynchronizationTime = lastLocalSynchronizationTime;
    }


    /**
     * Gets the remoteSystemName value for this WSSynchronizationItemRemoteInstances.
     * 
     * @return remoteSystemName
     */
    public java.lang.String getRemoteSystemName() {
        return remoteSystemName;
    }


    /**
     * Sets the remoteSystemName value for this WSSynchronizationItemRemoteInstances.
     * 
     * @param remoteSystemName
     */
    public void setRemoteSystemName(java.lang.String remoteSystemName) {
        this.remoteSystemName = remoteSystemName;
    }


    /**
     * Gets the remoteRevisionID value for this WSSynchronizationItemRemoteInstances.
     * 
     * @return remoteRevisionID
     */
    public java.lang.String getRemoteRevisionID() {
        return remoteRevisionID;
    }


    /**
     * Sets the remoteRevisionID value for this WSSynchronizationItemRemoteInstances.
     * 
     * @param remoteRevisionID
     */
    public void setRemoteRevisionID(java.lang.String remoteRevisionID) {
        this.remoteRevisionID = remoteRevisionID;
    }


    /**
     * Gets the xml value for this WSSynchronizationItemRemoteInstances.
     * 
     * @return xml
     */
    public java.lang.String getXml() {
        return xml;
    }


    /**
     * Sets the xml value for this WSSynchronizationItemRemoteInstances.
     * 
     * @param xml
     */
    public void setXml(java.lang.String xml) {
        this.xml = xml;
    }


    /**
     * Gets the lastLocalSynchronizationTime value for this WSSynchronizationItemRemoteInstances.
     * 
     * @return lastLocalSynchronizationTime
     */
    public java.util.Calendar getLastLocalSynchronizationTime() {
        return lastLocalSynchronizationTime;
    }


    /**
     * Sets the lastLocalSynchronizationTime value for this WSSynchronizationItemRemoteInstances.
     * 
     * @param lastLocalSynchronizationTime
     */
    public void setLastLocalSynchronizationTime(java.util.Calendar lastLocalSynchronizationTime) {
        this.lastLocalSynchronizationTime = lastLocalSynchronizationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationItemRemoteInstances)) return false;
        WSSynchronizationItemRemoteInstances other = (WSSynchronizationItemRemoteInstances) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.remoteSystemName==null && other.getRemoteSystemName()==null) || 
             (this.remoteSystemName!=null &&
              this.remoteSystemName.equals(other.getRemoteSystemName()))) &&
            ((this.remoteRevisionID==null && other.getRemoteRevisionID()==null) || 
             (this.remoteRevisionID!=null &&
              this.remoteRevisionID.equals(other.getRemoteRevisionID()))) &&
            ((this.xml==null && other.getXml()==null) || 
             (this.xml!=null &&
              this.xml.equals(other.getXml()))) &&
            ((this.lastLocalSynchronizationTime==null && other.getLastLocalSynchronizationTime()==null) || 
             (this.lastLocalSynchronizationTime!=null &&
              this.lastLocalSynchronizationTime.equals(other.getLastLocalSynchronizationTime())));
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
        if (getRemoteSystemName() != null) {
            _hashCode += getRemoteSystemName().hashCode();
        }
        if (getRemoteRevisionID() != null) {
            _hashCode += getRemoteRevisionID().hashCode();
        }
        if (getXml() != null) {
            _hashCode += getXml().hashCode();
        }
        if (getLastLocalSynchronizationTime() != null) {
            _hashCode += getLastLocalSynchronizationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSynchronizationItemRemoteInstances.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSSynchronizationItem>remoteInstances"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteSystemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteSystemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteRevisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteRevisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xml");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLocalSynchronizationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastLocalSynchronizationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
