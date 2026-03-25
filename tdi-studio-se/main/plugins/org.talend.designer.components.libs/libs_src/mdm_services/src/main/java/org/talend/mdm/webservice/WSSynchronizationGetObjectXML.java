/**
 * WSSynchronizationGetObjectXML.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationGetObjectXML  implements java.io.Serializable {
    private java.lang.String revisionID;

    private java.lang.String objectName;

    private java.lang.String uniqueID;

    public WSSynchronizationGetObjectXML() {
    }

    public WSSynchronizationGetObjectXML(
           java.lang.String revisionID,
           java.lang.String objectName,
           java.lang.String uniqueID) {
           this.revisionID = revisionID;
           this.objectName = objectName;
           this.uniqueID = uniqueID;
    }


    /**
     * Gets the revisionID value for this WSSynchronizationGetObjectXML.
     * 
     * @return revisionID
     */
    public java.lang.String getRevisionID() {
        return revisionID;
    }


    /**
     * Sets the revisionID value for this WSSynchronizationGetObjectXML.
     * 
     * @param revisionID
     */
    public void setRevisionID(java.lang.String revisionID) {
        this.revisionID = revisionID;
    }


    /**
     * Gets the objectName value for this WSSynchronizationGetObjectXML.
     * 
     * @return objectName
     */
    public java.lang.String getObjectName() {
        return objectName;
    }


    /**
     * Sets the objectName value for this WSSynchronizationGetObjectXML.
     * 
     * @param objectName
     */
    public void setObjectName(java.lang.String objectName) {
        this.objectName = objectName;
    }


    /**
     * Gets the uniqueID value for this WSSynchronizationGetObjectXML.
     * 
     * @return uniqueID
     */
    public java.lang.String getUniqueID() {
        return uniqueID;
    }


    /**
     * Sets the uniqueID value for this WSSynchronizationGetObjectXML.
     * 
     * @param uniqueID
     */
    public void setUniqueID(java.lang.String uniqueID) {
        this.uniqueID = uniqueID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationGetObjectXML)) return false;
        WSSynchronizationGetObjectXML other = (WSSynchronizationGetObjectXML) obj;
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
            ((this.objectName==null && other.getObjectName()==null) || 
             (this.objectName!=null &&
              this.objectName.equals(other.getObjectName()))) &&
            ((this.uniqueID==null && other.getUniqueID()==null) || 
             (this.uniqueID!=null &&
              this.uniqueID.equals(other.getUniqueID())));
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
        if (getObjectName() != null) {
            _hashCode += getObjectName().hashCode();
        }
        if (getUniqueID() != null) {
            _hashCode += getUniqueID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSynchronizationGetObjectXML.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetObjectXML"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uniqueID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
