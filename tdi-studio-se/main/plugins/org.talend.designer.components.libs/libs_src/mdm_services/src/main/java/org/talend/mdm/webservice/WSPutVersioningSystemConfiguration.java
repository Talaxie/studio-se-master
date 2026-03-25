/**
 * WSPutVersioningSystemConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Put a versioning System Configuration
 */
public class WSPutVersioningSystemConfiguration  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSVersioningSystemConfiguration versioningSystemConfiguration;

    public WSPutVersioningSystemConfiguration() {
    }

    public WSPutVersioningSystemConfiguration(
           org.talend.mdm.webservice.WSVersioningSystemConfiguration versioningSystemConfiguration) {
           this.versioningSystemConfiguration = versioningSystemConfiguration;
    }


    /**
     * Gets the versioningSystemConfiguration value for this WSPutVersioningSystemConfiguration.
     * 
     * @return versioningSystemConfiguration
     */
    public org.talend.mdm.webservice.WSVersioningSystemConfiguration getVersioningSystemConfiguration() {
        return versioningSystemConfiguration;
    }


    /**
     * Sets the versioningSystemConfiguration value for this WSPutVersioningSystemConfiguration.
     * 
     * @param versioningSystemConfiguration
     */
    public void setVersioningSystemConfiguration(org.talend.mdm.webservice.WSVersioningSystemConfiguration versioningSystemConfiguration) {
        this.versioningSystemConfiguration = versioningSystemConfiguration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutVersioningSystemConfiguration)) return false;
        WSPutVersioningSystemConfiguration other = (WSPutVersioningSystemConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.versioningSystemConfiguration==null && other.getVersioningSystemConfiguration()==null) || 
             (this.versioningSystemConfiguration!=null &&
              this.versioningSystemConfiguration.equals(other.getVersioningSystemConfiguration())));
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
        if (getVersioningSystemConfiguration() != null) {
            _hashCode += getVersioningSystemConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutVersioningSystemConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutVersioningSystemConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versioningSystemConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versioningSystemConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningSystemConfiguration"));
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
