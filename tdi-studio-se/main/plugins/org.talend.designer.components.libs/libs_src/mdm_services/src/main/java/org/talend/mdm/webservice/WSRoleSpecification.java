/**
 * WSRoleSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSRoleSpecification  implements java.io.Serializable {
    private java.lang.String objectType;

    private boolean admin;

    private org.talend.mdm.webservice.WSRoleSpecificationInstance[] instance;

    public WSRoleSpecification() {
    }

    public WSRoleSpecification(
           java.lang.String objectType,
           boolean admin,
           org.talend.mdm.webservice.WSRoleSpecificationInstance[] instance) {
           this.objectType = objectType;
           this.admin = admin;
           this.instance = instance;
    }


    /**
     * Gets the objectType value for this WSRoleSpecification.
     * 
     * @return objectType
     */
    public java.lang.String getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this WSRoleSpecification.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.String objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the admin value for this WSRoleSpecification.
     * 
     * @return admin
     */
    public boolean isAdmin() {
        return admin;
    }


    /**
     * Sets the admin value for this WSRoleSpecification.
     * 
     * @param admin
     */
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


    /**
     * Gets the instance value for this WSRoleSpecification.
     * 
     * @return instance
     */
    public org.talend.mdm.webservice.WSRoleSpecificationInstance[] getInstance() {
        return instance;
    }


    /**
     * Sets the instance value for this WSRoleSpecification.
     * 
     * @param instance
     */
    public void setInstance(org.talend.mdm.webservice.WSRoleSpecificationInstance[] instance) {
        this.instance = instance;
    }

    public org.talend.mdm.webservice.WSRoleSpecificationInstance getInstance(int i) {
        return this.instance[i];
    }

    public void setInstance(int i, org.talend.mdm.webservice.WSRoleSpecificationInstance _value) {
        this.instance[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRoleSpecification)) return false;
        WSRoleSpecification other = (WSRoleSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            this.admin == other.isAdmin() &&
            ((this.instance==null && other.getInstance()==null) || 
             (this.instance!=null &&
              java.util.Arrays.equals(this.instance, other.getInstance())));
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
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        _hashCode += (isAdmin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInstance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstance(), i);
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
        new org.apache.axis.description.TypeDesc(WSRoleSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSRole>specification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "admin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">>WSRole>specification>instance"));
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
