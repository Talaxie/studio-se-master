/**
 * WSFindAllDroppedItemsPKs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Find all dropped items in items trash
 */
public class WSFindAllDroppedItemsPKs  implements java.io.Serializable {
    private java.lang.String regex;

    public WSFindAllDroppedItemsPKs() {
    }

    public WSFindAllDroppedItemsPKs(
           java.lang.String regex) {
           this.regex = regex;
    }


    /**
     * Gets the regex value for this WSFindAllDroppedItemsPKs.
     * 
     * @return regex
     */
    public java.lang.String getRegex() {
        return regex;
    }


    /**
     * Sets the regex value for this WSFindAllDroppedItemsPKs.
     * 
     * @param regex
     */
    public void setRegex(java.lang.String regex) {
        this.regex = regex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSFindAllDroppedItemsPKs)) return false;
        WSFindAllDroppedItemsPKs other = (WSFindAllDroppedItemsPKs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regex==null && other.getRegex()==null) || 
             (this.regex!=null &&
              this.regex.equals(other.getRegex())));
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
        if (getRegex() != null) {
            _hashCode += getRegex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSFindAllDroppedItemsPKs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSFindAllDroppedItemsPKs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regex"));
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
