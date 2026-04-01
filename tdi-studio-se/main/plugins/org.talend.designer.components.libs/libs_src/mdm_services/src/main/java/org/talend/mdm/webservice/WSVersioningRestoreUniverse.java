/**
 * WSVersioningRestoreUniverse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Restore universe
 */
public class WSVersioningRestoreUniverse  implements java.io.Serializable {
    private java.lang.String versioningSystemName;

    private java.lang.String tag;

    private java.lang.String[] encodedClusterNames;

    public WSVersioningRestoreUniverse() {
    }

    public WSVersioningRestoreUniverse(
           java.lang.String versioningSystemName,
           java.lang.String tag,
           java.lang.String[] encodedClusterNames) {
           this.versioningSystemName = versioningSystemName;
           this.tag = tag;
           this.encodedClusterNames = encodedClusterNames;
    }


    /**
     * Gets the versioningSystemName value for this WSVersioningRestoreUniverse.
     * 
     * @return versioningSystemName
     */
    public java.lang.String getVersioningSystemName() {
        return versioningSystemName;
    }


    /**
     * Sets the versioningSystemName value for this WSVersioningRestoreUniverse.
     * 
     * @param versioningSystemName
     */
    public void setVersioningSystemName(java.lang.String versioningSystemName) {
        this.versioningSystemName = versioningSystemName;
    }


    /**
     * Gets the tag value for this WSVersioningRestoreUniverse.
     * 
     * @return tag
     */
    public java.lang.String getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this WSVersioningRestoreUniverse.
     * 
     * @param tag
     */
    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }


    /**
     * Gets the encodedClusterNames value for this WSVersioningRestoreUniverse.
     * 
     * @return encodedClusterNames
     */
    public java.lang.String[] getEncodedClusterNames() {
        return encodedClusterNames;
    }


    /**
     * Sets the encodedClusterNames value for this WSVersioningRestoreUniverse.
     * 
     * @param encodedClusterNames
     */
    public void setEncodedClusterNames(java.lang.String[] encodedClusterNames) {
        this.encodedClusterNames = encodedClusterNames;
    }

    public java.lang.String getEncodedClusterNames(int i) {
        return this.encodedClusterNames[i];
    }

    public void setEncodedClusterNames(int i, java.lang.String _value) {
        this.encodedClusterNames[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSVersioningRestoreUniverse)) return false;
        WSVersioningRestoreUniverse other = (WSVersioningRestoreUniverse) obj;
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
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag()))) &&
            ((this.encodedClusterNames==null && other.getEncodedClusterNames()==null) || 
             (this.encodedClusterNames!=null &&
              java.util.Arrays.equals(this.encodedClusterNames, other.getEncodedClusterNames())));
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
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        if (getEncodedClusterNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEncodedClusterNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEncodedClusterNames(), i);
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
        new org.apache.axis.description.TypeDesc(WSVersioningRestoreUniverse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreUniverse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versioningSystemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versioningSystemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encodedClusterNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encodedClusterNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
