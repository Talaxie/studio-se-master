/**
 * WSKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * In simple terms: each key field is found using the path selectorpath/fieldpath
 * within the element
 */
public class WSKey  implements java.io.Serializable {
    private java.lang.String selectorpath;

    private java.lang.String[] fieldpath;

    public WSKey() {
    }

    public WSKey(
           java.lang.String selectorpath,
           java.lang.String[] fieldpath) {
           this.selectorpath = selectorpath;
           this.fieldpath = fieldpath;
    }


    /**
     * Gets the selectorpath value for this WSKey.
     * 
     * @return selectorpath
     */
    public java.lang.String getSelectorpath() {
        return selectorpath;
    }


    /**
     * Sets the selectorpath value for this WSKey.
     * 
     * @param selectorpath
     */
    public void setSelectorpath(java.lang.String selectorpath) {
        this.selectorpath = selectorpath;
    }


    /**
     * Gets the fieldpath value for this WSKey.
     * 
     * @return fieldpath
     */
    public java.lang.String[] getFieldpath() {
        return fieldpath;
    }


    /**
     * Sets the fieldpath value for this WSKey.
     * 
     * @param fieldpath
     */
    public void setFieldpath(java.lang.String[] fieldpath) {
        this.fieldpath = fieldpath;
    }

    public java.lang.String getFieldpath(int i) {
        return this.fieldpath[i];
    }

    public void setFieldpath(int i, java.lang.String _value) {
        this.fieldpath[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSKey)) return false;
        WSKey other = (WSKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.selectorpath==null && other.getSelectorpath()==null) || 
             (this.selectorpath!=null &&
              this.selectorpath.equals(other.getSelectorpath()))) &&
            ((this.fieldpath==null && other.getFieldpath()==null) || 
             (this.fieldpath!=null &&
              java.util.Arrays.equals(this.fieldpath, other.getFieldpath())));
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
        if (getSelectorpath() != null) {
            _hashCode += getSelectorpath().hashCode();
        }
        if (getFieldpath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldpath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldpath(), i);
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
        new org.apache.axis.description.TypeDesc(WSKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectorpath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectorpath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldpath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldpath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
