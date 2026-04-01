/**
 * Entry_value.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.sugarws;

public class Entry_value  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String module_name;

    private org.talend.sugarws.Name_value[] name_value_list;

    public Entry_value() {
    }

    public Entry_value(
           java.lang.String id,
           java.lang.String module_name,
           org.talend.sugarws.Name_value[] name_value_list) {
           this.id = id;
           this.module_name = module_name;
           this.name_value_list = name_value_list;
    }


    /**
     * Gets the id value for this Entry_value.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Entry_value.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the module_name value for this Entry_value.
     * 
     * @return module_name
     */
    public java.lang.String getModule_name() {
        return module_name;
    }


    /**
     * Sets the module_name value for this Entry_value.
     * 
     * @param module_name
     */
    public void setModule_name(java.lang.String module_name) {
        this.module_name = module_name;
    }


    /**
     * Gets the name_value_list value for this Entry_value.
     * 
     * @return name_value_list
     */
    public org.talend.sugarws.Name_value[] getName_value_list() {
        return name_value_list;
    }


    /**
     * Sets the name_value_list value for this Entry_value.
     * 
     * @param name_value_list
     */
    public void setName_value_list(org.talend.sugarws.Name_value[] name_value_list) {
        this.name_value_list = name_value_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entry_value)) return false;
        Entry_value other = (Entry_value) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.module_name==null && other.getModule_name()==null) || 
             (this.module_name!=null &&
              this.module_name.equals(other.getModule_name()))) &&
            ((this.name_value_list==null && other.getName_value_list()==null) || 
             (this.name_value_list!=null &&
              java.util.Arrays.equals(this.name_value_list, other.getName_value_list())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getModule_name() != null) {
            _hashCode += getModule_name().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entry_value.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "entry_value"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "module_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name_value_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name_value_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "name_value"));
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
