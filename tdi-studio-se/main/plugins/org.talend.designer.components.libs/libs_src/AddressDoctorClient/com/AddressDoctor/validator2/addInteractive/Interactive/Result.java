/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AddressDoctor.validator2.addInteractive.Interactive;

public class Result  implements java.io.Serializable {
    private com.AddressDoctor.validator2.addInteractive.Interactive.Address address;

    private double resultPercentage;

    private java.lang.String elementMatchStatus;

    private java.lang.String elementResultStatus;

    public Result() {
    }

    public Result(
           com.AddressDoctor.validator2.addInteractive.Interactive.Address address,
           double resultPercentage,
           java.lang.String elementMatchStatus,
           java.lang.String elementResultStatus) {
           this.address = address;
           this.resultPercentage = resultPercentage;
           this.elementMatchStatus = elementMatchStatus;
           this.elementResultStatus = elementResultStatus;
    }


    /**
     * Gets the address value for this Result.
     * 
     * @return address
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Result.
     * 
     * @param address
     */
    public void setAddress(com.AddressDoctor.validator2.addInteractive.Interactive.Address address) {
        this.address = address;
    }


    /**
     * Gets the resultPercentage value for this Result.
     * 
     * @return resultPercentage
     */
    public double getResultPercentage() {
        return resultPercentage;
    }


    /**
     * Sets the resultPercentage value for this Result.
     * 
     * @param resultPercentage
     */
    public void setResultPercentage(double resultPercentage) {
        this.resultPercentage = resultPercentage;
    }


    /**
     * Gets the elementMatchStatus value for this Result.
     * 
     * @return elementMatchStatus
     */
    public java.lang.String getElementMatchStatus() {
        return elementMatchStatus;
    }


    /**
     * Sets the elementMatchStatus value for this Result.
     * 
     * @param elementMatchStatus
     */
    public void setElementMatchStatus(java.lang.String elementMatchStatus) {
        this.elementMatchStatus = elementMatchStatus;
    }


    /**
     * Gets the elementResultStatus value for this Result.
     * 
     * @return elementResultStatus
     */
    public java.lang.String getElementResultStatus() {
        return elementResultStatus;
    }


    /**
     * Sets the elementResultStatus value for this Result.
     * 
     * @param elementResultStatus
     */
    public void setElementResultStatus(java.lang.String elementResultStatus) {
        this.elementResultStatus = elementResultStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            this.resultPercentage == other.getResultPercentage() &&
            ((this.elementMatchStatus==null && other.getElementMatchStatus()==null) || 
             (this.elementMatchStatus!=null &&
              this.elementMatchStatus.equals(other.getElementMatchStatus()))) &&
            ((this.elementResultStatus==null && other.getElementResultStatus()==null) || 
             (this.elementResultStatus!=null &&
              this.elementResultStatus.equals(other.getElementResultStatus())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        _hashCode += new Double(getResultPercentage()).hashCode();
        if (getElementMatchStatus() != null) {
            _hashCode += getElementMatchStatus().hashCode();
        }
        if (getElementResultStatus() != null) {
            _hashCode += getElementResultStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "ResultPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementMatchStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "ElementMatchStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementResultStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "ElementResultStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
