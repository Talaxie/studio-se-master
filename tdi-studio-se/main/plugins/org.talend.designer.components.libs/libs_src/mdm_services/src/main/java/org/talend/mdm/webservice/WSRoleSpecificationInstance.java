/**
 * WSRoleSpecificationInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSRoleSpecificationInstance  implements java.io.Serializable {
    private java.lang.String instanceName;

    private boolean writable;

    private java.lang.String[] parameter;

    public WSRoleSpecificationInstance() {
    }

    public WSRoleSpecificationInstance(
           java.lang.String instanceName,
           boolean writable,
           java.lang.String[] parameter) {
           this.instanceName = instanceName;
           this.writable = writable;
           this.parameter = parameter;
    }


    /**
     * Gets the instanceName value for this WSRoleSpecificationInstance.
     * 
     * @return instanceName
     */
    public java.lang.String getInstanceName() {
        return instanceName;
    }


    /**
     * Sets the instanceName value for this WSRoleSpecificationInstance.
     * 
     * @param instanceName
     */
    public void setInstanceName(java.lang.String instanceName) {
        this.instanceName = instanceName;
    }


    /**
     * Gets the writable value for this WSRoleSpecificationInstance.
     * 
     * @return writable
     */
    public boolean isWritable() {
        return writable;
    }


    /**
     * Sets the writable value for this WSRoleSpecificationInstance.
     * 
     * @param writable
     */
    public void setWritable(boolean writable) {
        this.writable = writable;
    }


    /**
     * Gets the parameter value for this WSRoleSpecificationInstance.
     * 
     * @return parameter
     */
    public java.lang.String[] getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this WSRoleSpecificationInstance.
     * 
     * @param parameter
     */
    public void setParameter(java.lang.String[] parameter) {
        this.parameter = parameter;
    }

    public java.lang.String getParameter(int i) {
        return this.parameter[i];
    }

    public void setParameter(int i, java.lang.String _value) {
        this.parameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRoleSpecificationInstance)) return false;
        WSRoleSpecificationInstance other = (WSRoleSpecificationInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instanceName==null && other.getInstanceName()==null) || 
             (this.instanceName!=null &&
              this.instanceName.equals(other.getInstanceName()))) &&
            this.writable == other.isWritable() &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              java.util.Arrays.equals(this.parameter, other.getParameter())));
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
        if (getInstanceName() != null) {
            _hashCode += getInstanceName().hashCode();
        }
        _hashCode += (isWritable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameter(), i);
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
        new org.apache.axis.description.TypeDesc(WSRoleSpecificationInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">>WSRole>specification>instance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "writable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
