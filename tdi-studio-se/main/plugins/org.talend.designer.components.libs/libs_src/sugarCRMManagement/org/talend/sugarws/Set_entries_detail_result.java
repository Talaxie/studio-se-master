/**
 * Set_entries_detail_result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.sugarws;

public class Set_entries_detail_result  implements java.io.Serializable {
    private org.talend.sugarws.Name_value[][] name_value_lists;

    private org.talend.sugarws.Error_value error;

    public Set_entries_detail_result() {
    }

    public Set_entries_detail_result(
           org.talend.sugarws.Name_value[][] name_value_lists,
           org.talend.sugarws.Error_value error) {
           this.name_value_lists = name_value_lists;
           this.error = error;
    }


    /**
     * Gets the name_value_lists value for this Set_entries_detail_result.
     * 
     * @return name_value_lists
     */
    public org.talend.sugarws.Name_value[][] getName_value_lists() {
        return name_value_lists;
    }


    /**
     * Sets the name_value_lists value for this Set_entries_detail_result.
     * 
     * @param name_value_lists
     */
    public void setName_value_lists(org.talend.sugarws.Name_value[][] name_value_lists) {
        this.name_value_lists = name_value_lists;
    }


    /**
     * Gets the error value for this Set_entries_detail_result.
     * 
     * @return error
     */
    public org.talend.sugarws.Error_value getError() {
        return error;
    }


    /**
     * Sets the error value for this Set_entries_detail_result.
     * 
     * @param error
     */
    public void setError(org.talend.sugarws.Error_value error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Set_entries_detail_result)) return false;
        Set_entries_detail_result other = (Set_entries_detail_result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name_value_lists==null && other.getName_value_lists()==null) || 
             (this.name_value_lists!=null &&
              java.util.Arrays.equals(this.name_value_lists, other.getName_value_lists()))) &&
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
        if (getName_value_lists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName_value_lists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName_value_lists(), i);
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
        new org.apache.axis.description.TypeDesc(Set_entries_detail_result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "set_entries_detail_result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name_value_lists");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name_value_lists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "name_value_list"));
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
