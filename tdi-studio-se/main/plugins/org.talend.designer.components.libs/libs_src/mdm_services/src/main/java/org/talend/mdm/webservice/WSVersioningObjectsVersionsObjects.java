/**
 * WSVersioningObjectsVersionsObjects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSVersioningObjectsVersionsObjects  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String name;

    private org.talend.mdm.webservice.WSVersioningHistoryEntry[] wsVersionEntries;

    public WSVersioningObjectsVersionsObjects() {
    }

    public WSVersioningObjectsVersionsObjects(
           java.lang.String type,
           java.lang.String name,
           org.talend.mdm.webservice.WSVersioningHistoryEntry[] wsVersionEntries) {
           this.type = type;
           this.name = name;
           this.wsVersionEntries = wsVersionEntries;
    }


    /**
     * Gets the type value for this WSVersioningObjectsVersionsObjects.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this WSVersioningObjectsVersionsObjects.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the name value for this WSVersioningObjectsVersionsObjects.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSVersioningObjectsVersionsObjects.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the wsVersionEntries value for this WSVersioningObjectsVersionsObjects.
     * 
     * @return wsVersionEntries
     */
    public org.talend.mdm.webservice.WSVersioningHistoryEntry[] getWsVersionEntries() {
        return wsVersionEntries;
    }


    /**
     * Sets the wsVersionEntries value for this WSVersioningObjectsVersionsObjects.
     * 
     * @param wsVersionEntries
     */
    public void setWsVersionEntries(org.talend.mdm.webservice.WSVersioningHistoryEntry[] wsVersionEntries) {
        this.wsVersionEntries = wsVersionEntries;
    }

    public org.talend.mdm.webservice.WSVersioningHistoryEntry getWsVersionEntries(int i) {
        return this.wsVersionEntries[i];
    }

    public void setWsVersionEntries(int i, org.talend.mdm.webservice.WSVersioningHistoryEntry _value) {
        this.wsVersionEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSVersioningObjectsVersionsObjects)) return false;
        WSVersioningObjectsVersionsObjects other = (WSVersioningObjectsVersionsObjects) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.wsVersionEntries==null && other.getWsVersionEntries()==null) || 
             (this.wsVersionEntries!=null &&
              java.util.Arrays.equals(this.wsVersionEntries, other.getWsVersionEntries())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getWsVersionEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWsVersionEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWsVersionEntries(), i);
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
        new org.apache.axis.description.TypeDesc(WSVersioningObjectsVersionsObjects.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSVersioningObjectsVersions>objects"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsVersionEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsVersionEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningHistoryEntry"));
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
