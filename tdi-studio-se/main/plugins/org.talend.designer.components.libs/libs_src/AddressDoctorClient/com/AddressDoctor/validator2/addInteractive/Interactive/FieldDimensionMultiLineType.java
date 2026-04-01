/**
 * FieldDimensionMultiLineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AddressDoctor.validator2.addInteractive.Interactive;

public class FieldDimensionMultiLineType  implements java.io.Serializable {
    private int maxLines;

    private int maxLineLength;

    public FieldDimensionMultiLineType() {
    }

    public FieldDimensionMultiLineType(
           int maxLines,
           int maxLineLength) {
           this.maxLines = maxLines;
           this.maxLineLength = maxLineLength;
    }


    /**
     * Gets the maxLines value for this FieldDimensionMultiLineType.
     * 
     * @return maxLines
     */
    public int getMaxLines() {
        return maxLines;
    }


    /**
     * Sets the maxLines value for this FieldDimensionMultiLineType.
     * 
     * @param maxLines
     */
    public void setMaxLines(int maxLines) {
        this.maxLines = maxLines;
    }


    /**
     * Gets the maxLineLength value for this FieldDimensionMultiLineType.
     * 
     * @return maxLineLength
     */
    public int getMaxLineLength() {
        return maxLineLength;
    }


    /**
     * Sets the maxLineLength value for this FieldDimensionMultiLineType.
     * 
     * @param maxLineLength
     */
    public void setMaxLineLength(int maxLineLength) {
        this.maxLineLength = maxLineLength;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldDimensionMultiLineType)) return false;
        FieldDimensionMultiLineType other = (FieldDimensionMultiLineType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.maxLines == other.getMaxLines() &&
            this.maxLineLength == other.getMaxLineLength();
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
        _hashCode += getMaxLines();
        _hashCode += getMaxLineLength();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldDimensionMultiLineType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionMultiLineType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "MaxLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLineLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "MaxLineLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
