/**
 * WSExtractedContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Content extracted using one of the ExtractUsingTransformer web
 * service
 */
public class WSExtractedContent  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSByteArray wsByteArray;

    private java.lang.String contentType;

    public WSExtractedContent() {
    }

    public WSExtractedContent(
           org.talend.mdm.webservice.WSByteArray wsByteArray,
           java.lang.String contentType) {
           this.wsByteArray = wsByteArray;
           this.contentType = contentType;
    }


    /**
     * Gets the wsByteArray value for this WSExtractedContent.
     * 
     * @return wsByteArray
     */
    public org.talend.mdm.webservice.WSByteArray getWsByteArray() {
        return wsByteArray;
    }


    /**
     * Sets the wsByteArray value for this WSExtractedContent.
     * 
     * @param wsByteArray
     */
    public void setWsByteArray(org.talend.mdm.webservice.WSByteArray wsByteArray) {
        this.wsByteArray = wsByteArray;
    }


    /**
     * Gets the contentType value for this WSExtractedContent.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this WSExtractedContent.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSExtractedContent)) return false;
        WSExtractedContent other = (WSExtractedContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsByteArray==null && other.getWsByteArray()==null) || 
             (this.wsByteArray!=null &&
              this.wsByteArray.equals(other.getWsByteArray()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType())));
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
        if (getWsByteArray() != null) {
            _hashCode += getWsByteArray().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSExtractedContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractedContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsByteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSByteArray"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentType"));
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
