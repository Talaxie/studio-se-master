/**
 * Get_entry_result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.sugarws;

public class Get_entry_result  implements java.io.Serializable {
    private org.talend.sugarws.Field[] field_list;

    private org.talend.sugarws.Entry_value[] entry_list;

    private org.talend.sugarws.Error_value error;

    public Get_entry_result() {
    }

    public Get_entry_result(
           org.talend.sugarws.Field[] field_list,
           org.talend.sugarws.Entry_value[] entry_list,
           org.talend.sugarws.Error_value error) {
           this.field_list = field_list;
           this.entry_list = entry_list;
           this.error = error;
    }


    /**
     * Gets the field_list value for this Get_entry_result.
     * 
     * @return field_list
     */
    public org.talend.sugarws.Field[] getField_list() {
        return field_list;
    }


    /**
     * Sets the field_list value for this Get_entry_result.
     * 
     * @param field_list
     */
    public void setField_list(org.talend.sugarws.Field[] field_list) {
        this.field_list = field_list;
    }


    /**
     * Gets the entry_list value for this Get_entry_result.
     * 
     * @return entry_list
     */
    public org.talend.sugarws.Entry_value[] getEntry_list() {
        return entry_list;
    }


    /**
     * Sets the entry_list value for this Get_entry_result.
     * 
     * @param entry_list
     */
    public void setEntry_list(org.talend.sugarws.Entry_value[] entry_list) {
        this.entry_list = entry_list;
    }


    /**
     * Gets the error value for this Get_entry_result.
     * 
     * @return error
     */
    public org.talend.sugarws.Error_value getError() {
        return error;
    }


    /**
     * Sets the error value for this Get_entry_result.
     * 
     * @param error
     */
    public void setError(org.talend.sugarws.Error_value error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_entry_result)) return false;
        Get_entry_result other = (Get_entry_result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.field_list==null && other.getField_list()==null) || 
             (this.field_list!=null &&
              java.util.Arrays.equals(this.field_list, other.getField_list()))) &&
            ((this.entry_list==null && other.getEntry_list()==null) || 
             (this.entry_list!=null &&
              java.util.Arrays.equals(this.entry_list, other.getEntry_list()))) &&
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
        if (getField_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getField_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getField_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntry_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntry_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntry_list(), i);
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
        new org.apache.axis.description.TypeDesc(Get_entry_result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "get_entry_result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "field_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "field"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entry_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entry_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "entry_value"));
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
