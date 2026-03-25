/**
 * Upgrade_history_result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package org.talend.sugarws;

public class Upgrade_history_result  implements java.io.Serializable {
    private org.talend.sugarws.Upgrade_history[] upgrade_history_list;

    private org.talend.sugarws.Error_value error;

    public Upgrade_history_result() {
    }

    public Upgrade_history_result(
           org.talend.sugarws.Upgrade_history[] upgrade_history_list,
           org.talend.sugarws.Error_value error) {
           this.upgrade_history_list = upgrade_history_list;
           this.error = error;
    }


    /**
     * Gets the upgrade_history_list value for this Upgrade_history_result.
     * 
     * @return upgrade_history_list
     */
    public org.talend.sugarws.Upgrade_history[] getUpgrade_history_list() {
        return upgrade_history_list;
    }


    /**
     * Sets the upgrade_history_list value for this Upgrade_history_result.
     * 
     * @param upgrade_history_list
     */
    public void setUpgrade_history_list(org.talend.sugarws.Upgrade_history[] upgrade_history_list) {
        this.upgrade_history_list = upgrade_history_list;
    }


    /**
     * Gets the error value for this Upgrade_history_result.
     * 
     * @return error
     */
    public org.talend.sugarws.Error_value getError() {
        return error;
    }


    /**
     * Sets the error value for this Upgrade_history_result.
     * 
     * @param error
     */
    public void setError(org.talend.sugarws.Error_value error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Upgrade_history_result)) return false;
        Upgrade_history_result other = (Upgrade_history_result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.upgrade_history_list==null && other.getUpgrade_history_list()==null) || 
             (this.upgrade_history_list!=null &&
              java.util.Arrays.equals(this.upgrade_history_list, other.getUpgrade_history_list()))) &&
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
        if (getUpgrade_history_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpgrade_history_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpgrade_history_list(), i);
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
        new org.apache.axis.description.TypeDesc(Upgrade_history_result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "upgrade_history_result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upgrade_history_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upgrade_history_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "upgrade_history"));
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
