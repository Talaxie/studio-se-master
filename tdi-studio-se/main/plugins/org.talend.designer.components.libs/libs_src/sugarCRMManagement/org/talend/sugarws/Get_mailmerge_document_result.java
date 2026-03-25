/**
 * Get_mailmerge_document_result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.sugarws;

public class Get_mailmerge_document_result  implements java.io.Serializable {
    private java.lang.String html;

    private org.talend.sugarws.Name_value[] name_value_list;

    private org.talend.sugarws.Error_value error;

    public Get_mailmerge_document_result() {
    }

    public Get_mailmerge_document_result(
           java.lang.String html,
           org.talend.sugarws.Name_value[] name_value_list,
           org.talend.sugarws.Error_value error) {
           this.html = html;
           this.name_value_list = name_value_list;
           this.error = error;
    }


    /**
     * Gets the html value for this Get_mailmerge_document_result.
     * 
     * @return html
     */
    public java.lang.String getHtml() {
        return html;
    }


    /**
     * Sets the html value for this Get_mailmerge_document_result.
     * 
     * @param html
     */
    public void setHtml(java.lang.String html) {
        this.html = html;
    }


    /**
     * Gets the name_value_list value for this Get_mailmerge_document_result.
     * 
     * @return name_value_list
     */
    public org.talend.sugarws.Name_value[] getName_value_list() {
        return name_value_list;
    }


    /**
     * Sets the name_value_list value for this Get_mailmerge_document_result.
     * 
     * @param name_value_list
     */
    public void setName_value_list(org.talend.sugarws.Name_value[] name_value_list) {
        this.name_value_list = name_value_list;
    }


    /**
     * Gets the error value for this Get_mailmerge_document_result.
     * 
     * @return error
     */
    public org.talend.sugarws.Error_value getError() {
        return error;
    }


    /**
     * Sets the error value for this Get_mailmerge_document_result.
     * 
     * @param error
     */
    public void setError(org.talend.sugarws.Error_value error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_mailmerge_document_result)) return false;
        Get_mailmerge_document_result other = (Get_mailmerge_document_result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.html==null && other.getHtml()==null) || 
             (this.html!=null &&
              this.html.equals(other.getHtml()))) &&
            ((this.name_value_list==null && other.getName_value_list()==null) || 
             (this.name_value_list!=null &&
              java.util.Arrays.equals(this.name_value_list, other.getName_value_list()))) &&
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
        if (getHtml() != null) {
            _hashCode += getHtml().hashCode();
        }
        if (getName_value_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName_value_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName_value_list(), i);
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
        new org.apache.axis.description.TypeDesc(Get_mailmerge_document_result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "get_mailmerge_document_result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("html");
        elemField.setXmlName(new javax.xml.namespace.QName("", "html"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name_value_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name_value_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "name_value"));
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
