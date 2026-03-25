/**
 * WSVersioningGetItemsVersions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Get tagging versions for one or more Items instances
 */
public class WSVersioningGetItemsVersions  implements java.io.Serializable {
    private java.lang.String versioningSystemName;

    private org.talend.mdm.webservice.WSItemPK[] wsItemPKs;

    public WSVersioningGetItemsVersions() {
    }

    public WSVersioningGetItemsVersions(
           java.lang.String versioningSystemName,
           org.talend.mdm.webservice.WSItemPK[] wsItemPKs) {
           this.versioningSystemName = versioningSystemName;
           this.wsItemPKs = wsItemPKs;
    }


    /**
     * Gets the versioningSystemName value for this WSVersioningGetItemsVersions.
     * 
     * @return versioningSystemName
     */
    public java.lang.String getVersioningSystemName() {
        return versioningSystemName;
    }


    /**
     * Sets the versioningSystemName value for this WSVersioningGetItemsVersions.
     * 
     * @param versioningSystemName
     */
    public void setVersioningSystemName(java.lang.String versioningSystemName) {
        this.versioningSystemName = versioningSystemName;
    }


    /**
     * Gets the wsItemPKs value for this WSVersioningGetItemsVersions.
     * 
     * @return wsItemPKs
     */
    public org.talend.mdm.webservice.WSItemPK[] getWsItemPKs() {
        return wsItemPKs;
    }


    /**
     * Sets the wsItemPKs value for this WSVersioningGetItemsVersions.
     * 
     * @param wsItemPKs
     */
    public void setWsItemPKs(org.talend.mdm.webservice.WSItemPK[] wsItemPKs) {
        this.wsItemPKs = wsItemPKs;
    }

    public org.talend.mdm.webservice.WSItemPK getWsItemPKs(int i) {
        return this.wsItemPKs[i];
    }

    public void setWsItemPKs(int i, org.talend.mdm.webservice.WSItemPK _value) {
        this.wsItemPKs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSVersioningGetItemsVersions)) return false;
        WSVersioningGetItemsVersions other = (WSVersioningGetItemsVersions) obj;
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
              this.versioningSystemName.equals(other.getVersioningSystemName()))) &&
            ((this.wsItemPKs==null && other.getWsItemPKs()==null) || 
             (this.wsItemPKs!=null &&
              java.util.Arrays.equals(this.wsItemPKs, other.getWsItemPKs())));
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
        if (getWsItemPKs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWsItemPKs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWsItemPKs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSVersioningGetItemsVersions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetItemsVersions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versioningSystemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versioningSystemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsItemPKs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsItemPKs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
