/**
 * Set_relationship_value.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.sugarws;

public class Set_relationship_value  implements java.io.Serializable {
    private java.lang.String module1;

    private java.lang.String module1_id;

    private java.lang.String module2;

    private java.lang.String module2_id;

    public Set_relationship_value() {
    }

    public Set_relationship_value(
           java.lang.String module1,
           java.lang.String module1_id,
           java.lang.String module2,
           java.lang.String module2_id) {
           this.module1 = module1;
           this.module1_id = module1_id;
           this.module2 = module2;
           this.module2_id = module2_id;
    }


    /**
     * Gets the module1 value for this Set_relationship_value.
     * 
     * @return module1
     */
    public java.lang.String getModule1() {
        return module1;
    }


    /**
     * Sets the module1 value for this Set_relationship_value.
     * 
     * @param module1
     */
    public void setModule1(java.lang.String module1) {
        this.module1 = module1;
    }


    /**
     * Gets the module1_id value for this Set_relationship_value.
     * 
     * @return module1_id
     */
    public java.lang.String getModule1_id() {
        return module1_id;
    }


    /**
     * Sets the module1_id value for this Set_relationship_value.
     * 
     * @param module1_id
     */
    public void setModule1_id(java.lang.String module1_id) {
        this.module1_id = module1_id;
    }


    /**
     * Gets the module2 value for this Set_relationship_value.
     * 
     * @return module2
     */
    public java.lang.String getModule2() {
        return module2;
    }


    /**
     * Sets the module2 value for this Set_relationship_value.
     * 
     * @param module2
     */
    public void setModule2(java.lang.String module2) {
        this.module2 = module2;
    }


    /**
     * Gets the module2_id value for this Set_relationship_value.
     * 
     * @return module2_id
     */
    public java.lang.String getModule2_id() {
        return module2_id;
    }


    /**
     * Sets the module2_id value for this Set_relationship_value.
     * 
     * @param module2_id
     */
    public void setModule2_id(java.lang.String module2_id) {
        this.module2_id = module2_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Set_relationship_value)) return false;
        Set_relationship_value other = (Set_relationship_value) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.module1==null && other.getModule1()==null) || 
             (this.module1!=null &&
              this.module1.equals(other.getModule1()))) &&
            ((this.module1_id==null && other.getModule1_id()==null) || 
             (this.module1_id!=null &&
              this.module1_id.equals(other.getModule1_id()))) &&
            ((this.module2==null && other.getModule2()==null) || 
             (this.module2!=null &&
              this.module2.equals(other.getModule2()))) &&
            ((this.module2_id==null && other.getModule2_id()==null) || 
             (this.module2_id!=null &&
              this.module2_id.equals(other.getModule2_id())));
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
        if (getModule1() != null) {
            _hashCode += getModule1().hashCode();
        }
        if (getModule1_id() != null) {
            _hashCode += getModule1_id().hashCode();
        }
        if (getModule2() != null) {
            _hashCode += getModule2().hashCode();
        }
        if (getModule2_id() != null) {
            _hashCode += getModule2_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Set_relationship_value.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "set_relationship_value"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "module1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module1_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "module1_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "module2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module2_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "module2_id"));
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
