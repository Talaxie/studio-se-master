/**
 * Module_fields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.sugarws;

public class Module_fields  implements java.io.Serializable {
    private java.lang.String module_name;

    private org.talend.sugarws.Field[] module_fields;

    private org.talend.sugarws.Error_value error;

    public Module_fields() {
    }

    public Module_fields(
           java.lang.String module_name,
           org.talend.sugarws.Field[] module_fields,
           org.talend.sugarws.Error_value error) {
           this.module_name = module_name;
           this.module_fields = module_fields;
           this.error = error;
    }


    /**
     * Gets the module_name value for this Module_fields.
     * 
     * @return module_name
     */
    public java.lang.String getModule_name() {
        return module_name;
    }


    /**
     * Sets the module_name value for this Module_fields.
     * 
     * @param module_name
     */
    public void setModule_name(java.lang.String module_name) {
        this.module_name = module_name;
    }


    /**
     * Gets the module_fields value for this Module_fields.
     * 
     * @return module_fields
     */
    public org.talend.sugarws.Field[] getModule_fields() {
        return module_fields;
    }


    /**
     * Sets the module_fields value for this Module_fields.
     * 
     * @param module_fields
     */
    public void setModule_fields(org.talend.sugarws.Field[] module_fields) {
        this.module_fields = module_fields;
    }


    /**
     * Gets the error value for this Module_fields.
     * 
     * @return error
     */
    public org.talend.sugarws.Error_value getError() {
        return error;
    }


    /**
     * Sets the error value for this Module_fields.
     * 
     * @param error
     */
    public void setError(org.talend.sugarws.Error_value error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Module_fields)) return false;
        Module_fields other = (Module_fields) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.module_name==null && other.getModule_name()==null) || 
             (this.module_name!=null &&
              this.module_name.equals(other.getModule_name()))) &&
            ((this.module_fields==null && other.getModule_fields()==null) || 
             (this.module_fields!=null &&
              java.util.Arrays.equals(this.module_fields, other.getModule_fields()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getModule_name() != null) {
            _hashCode += getModule_name().hashCode();
        }
        if (getModule_fields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModule_fields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModule_fields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Module_fields.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "module_fields"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "module_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module_fields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "module_fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "field"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "error_value"));
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
