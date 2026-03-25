/**
 * WSSynchronizationGetItemXML.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationGetItemXML  implements java.io.Serializable {
    private java.lang.String revisionID;

    private org.talend.mdm.webservice.WSItemPK wsItemPOJOPK;

    public WSSynchronizationGetItemXML() {
    }

    public WSSynchronizationGetItemXML(
           java.lang.String revisionID,
           org.talend.mdm.webservice.WSItemPK wsItemPOJOPK) {
           this.revisionID = revisionID;
           this.wsItemPOJOPK = wsItemPOJOPK;
    }


    /**
     * Gets the revisionID value for this WSSynchronizationGetItemXML.
     * 
     * @return revisionID
     */
    public java.lang.String getRevisionID() {
        return revisionID;
    }


    /**
     * Sets the revisionID value for this WSSynchronizationGetItemXML.
     * 
     * @param revisionID
     */
    public void setRevisionID(java.lang.String revisionID) {
        this.revisionID = revisionID;
    }


    /**
     * Gets the wsItemPOJOPK value for this WSSynchronizationGetItemXML.
     * 
     * @return wsItemPOJOPK
     */
    public org.talend.mdm.webservice.WSItemPK getWsItemPOJOPK() {
        return wsItemPOJOPK;
    }


    /**
     * Sets the wsItemPOJOPK value for this WSSynchronizationGetItemXML.
     * 
     * @param wsItemPOJOPK
     */
    public void setWsItemPOJOPK(org.talend.mdm.webservice.WSItemPK wsItemPOJOPK) {
        this.wsItemPOJOPK = wsItemPOJOPK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationGetItemXML)) return false;
        WSSynchronizationGetItemXML other = (WSSynchronizationGetItemXML) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.revisionID==null && other.getRevisionID()==null) || 
             (this.revisionID!=null &&
              this.revisionID.equals(other.getRevisionID()))) &&
            ((this.wsItemPOJOPK==null && other.getWsItemPOJOPK()==null) || 
             (this.wsItemPOJOPK!=null &&
              this.wsItemPOJOPK.equals(other.getWsItemPOJOPK())));
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
        if (getRevisionID() != null) {
            _hashCode += getRevisionID().hashCode();
        }
        if (getWsItemPOJOPK() != null) {
            _hashCode += getWsItemPOJOPK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSynchronizationGetItemXML.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetItemXML"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsItemPOJOPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsItemPOJOPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
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
