/**
 * Get_entry_list_result_encoded.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.sugarws;

public class Get_entry_list_result_encoded  implements java.io.Serializable {
    private int result_count;

    private int next_offset;

    private int total_count;

    private java.lang.String[] field_list;

    private java.lang.String entry_list;

    private org.talend.sugarws.Error_value error;

    public Get_entry_list_result_encoded() {
    }

    public Get_entry_list_result_encoded(
           int result_count,
           int next_offset,
           int total_count,
           java.lang.String[] field_list,
           java.lang.String entry_list,
           org.talend.sugarws.Error_value error) {
           this.result_count = result_count;
           this.next_offset = next_offset;
           this.total_count = total_count;
           this.field_list = field_list;
           this.entry_list = entry_list;
           this.error = error;
    }


    /**
     * Gets the result_count value for this Get_entry_list_result_encoded.
     * 
     * @return result_count
     */
    public int getResult_count() {
        return result_count;
    }


    /**
     * Sets the result_count value for this Get_entry_list_result_encoded.
     * 
     * @param result_count
     */
    public void setResult_count(int result_count) {
        this.result_count = result_count;
    }


    /**
     * Gets the next_offset value for this Get_entry_list_result_encoded.
     * 
     * @return next_offset
     */
    public int getNext_offset() {
        return next_offset;
    }


    /**
     * Sets the next_offset value for this Get_entry_list_result_encoded.
     * 
     * @param next_offset
     */
    public void setNext_offset(int next_offset) {
        this.next_offset = next_offset;
    }


    /**
     * Gets the total_count value for this Get_entry_list_result_encoded.
     * 
     * @return total_count
     */
    public int getTotal_count() {
        return total_count;
    }


    /**
     * Sets the total_count value for this Get_entry_list_result_encoded.
     * 
     * @param total_count
     */
    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }


    /**
     * Gets the field_list value for this Get_entry_list_result_encoded.
     * 
     * @return field_list
     */
    public java.lang.String[] getField_list() {
        return field_list;
    }


    /**
     * Sets the field_list value for this Get_entry_list_result_encoded.
     * 
     * @param field_list
     */
    public void setField_list(java.lang.String[] field_list) {
        this.field_list = field_list;
    }


    /**
     * Gets the entry_list value for this Get_entry_list_result_encoded.
     * 
     * @return entry_list
     */
    public java.lang.String getEntry_list() {
        return entry_list;
    }


    /**
     * Sets the entry_list value for this Get_entry_list_result_encoded.
     * 
     * @param entry_list
     */
    public void setEntry_list(java.lang.String entry_list) {
        this.entry_list = entry_list;
    }


    /**
     * Gets the error value for this Get_entry_list_result_encoded.
     * 
     * @return error
     */
    public org.talend.sugarws.Error_value getError() {
        return error;
    }


    /**
     * Sets the error value for this Get_entry_list_result_encoded.
     * 
     * @param error
     */
    public void setError(org.talend.sugarws.Error_value error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_entry_list_result_encoded)) return false;
        Get_entry_list_result_encoded other = (Get_entry_list_result_encoded) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.result_count == other.getResult_count() &&
            this.next_offset == other.getNext_offset() &&
            this.total_count == other.getTotal_count() &&
            ((this.field_list==null && other.getField_list()==null) || 
             (this.field_list!=null &&
              java.util.Arrays.equals(this.field_list, other.getField_list()))) &&
            ((this.entry_list==null && other.getEntry_list()==null) || 
             (this.entry_list!=null &&
              this.entry_list.equals(other.getEntry_list()))) &&
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
        _hashCode += getResult_count();
        _hashCode += getNext_offset();
        _hashCode += getTotal_count();
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
            _hashCode += getEntry_list().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_entry_list_result_encoded.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "get_entry_list_result_encoded"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result_count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("next_offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "next_offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "field_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entry_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entry_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
