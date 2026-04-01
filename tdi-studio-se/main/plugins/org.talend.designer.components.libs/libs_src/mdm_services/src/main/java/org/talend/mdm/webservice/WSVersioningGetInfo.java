/**
 * WSVersioningGetInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Get Information about the Versioning System
 */
public class WSVersioningGetInfo  implements java.io.Serializable {
    private java.lang.String versioningSystemName;

    public WSVersioningGetInfo() {
    }

    public WSVersioningGetInfo(
           java.lang.String versioningSystemName) {
           this.versioningSystemName = versioningSystemName;
    }


    /**
     * Gets the versioningSystemName value for this WSVersioningGetInfo.
     * 
     * @return versioningSystemName
     */
    public java.lang.String getVersioningSystemName() {
        return versioningSystemName;
    }


    /**
     * Sets the versioningSystemName value for this WSVersioningGetInfo.
     * 
     * @param versioningSystemName
     */
    public void setVersioningSystemName(java.lang.String versioningSystemName) {
        this.versioningSystemName = versioningSystemName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSVersioningGetInfo)) return false;
        WSVersioningGetInfo other = (WSVersioningGetInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.versioningSystemName==null && other.getVersioningSystemName()==null) || 
             (this.versioningSystemName!=null &&
              this.versioningSystemName.equals(other.getVersioningSystemName())));
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
        if (getVersioningSystemName() != null) {
            _hashCode += getVersioningSystemName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSVersioningGetInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versioningSystemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versioningSystemName"));
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
