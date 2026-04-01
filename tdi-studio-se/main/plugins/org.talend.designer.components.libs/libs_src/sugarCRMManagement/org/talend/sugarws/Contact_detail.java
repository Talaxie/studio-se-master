/**
 * Contact_detail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.sugarws;

public class Contact_detail  implements java.io.Serializable {
    private java.lang.String email_address;

    private java.lang.String name1;

    private java.lang.String name2;

    private java.lang.String association;

    private java.lang.String id;

    private java.lang.String msi_id;

    private java.lang.String type;

    public Contact_detail() {
    }

    public Contact_detail(
           java.lang.String email_address,
           java.lang.String name1,
           java.lang.String name2,
           java.lang.String association,
           java.lang.String id,
           java.lang.String msi_id,
           java.lang.String type) {
           this.email_address = email_address;
           this.name1 = name1;
           this.name2 = name2;
           this.association = association;
           this.id = id;
           this.msi_id = msi_id;
           this.type = type;
    }


    /**
     * Gets the email_address value for this Contact_detail.
     * 
     * @return email_address
     */
    public java.lang.String getEmail_address() {
        return email_address;
    }


    /**
     * Sets the email_address value for this Contact_detail.
     * 
     * @param email_address
     */
    public void setEmail_address(java.lang.String email_address) {
        this.email_address = email_address;
    }


    /**
     * Gets the name1 value for this Contact_detail.
     * 
     * @return name1
     */
    public java.lang.String getName1() {
        return name1;
    }


    /**
     * Sets the name1 value for this Contact_detail.
     * 
     * @param name1
     */
    public void setName1(java.lang.String name1) {
        this.name1 = name1;
    }


    /**
     * Gets the name2 value for this Contact_detail.
     * 
     * @return name2
     */
    public java.lang.String getName2() {
        return name2;
    }


    /**
     * Sets the name2 value for this Contact_detail.
     * 
     * @param name2
     */
    public void setName2(java.lang.String name2) {
        this.name2 = name2;
    }


    /**
     * Gets the association value for this Contact_detail.
     * 
     * @return association
     */
    public java.lang.String getAssociation() {
        return association;
    }


    /**
     * Sets the association value for this Contact_detail.
     * 
     * @param association
     */
    public void setAssociation(java.lang.String association) {
        this.association = association;
    }


    /**
     * Gets the id value for this Contact_detail.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Contact_detail.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the msi_id value for this Contact_detail.
     * 
     * @return msi_id
     */
    public java.lang.String getMsi_id() {
        return msi_id;
    }


    /**
     * Sets the msi_id value for this Contact_detail.
     * 
     * @param msi_id
     */
    public void setMsi_id(java.lang.String msi_id) {
        this.msi_id = msi_id;
    }


    /**
     * Gets the type value for this Contact_detail.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Contact_detail.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contact_detail)) return false;
        Contact_detail other = (Contact_detail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.email_address==null && other.getEmail_address()==null) || 
             (this.email_address!=null &&
              this.email_address.equals(other.getEmail_address()))) &&
            ((this.name1==null && other.getName1()==null) || 
             (this.name1!=null &&
              this.name1.equals(other.getName1()))) &&
            ((this.name2==null && other.getName2()==null) || 
             (this.name2!=null &&
              this.name2.equals(other.getName2()))) &&
            ((this.association==null && other.getAssociation()==null) || 
             (this.association!=null &&
              this.association.equals(other.getAssociation()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.msi_id==null && other.getMsi_id()==null) || 
             (this.msi_id!=null &&
              this.msi_id.equals(other.getMsi_id()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getEmail_address() != null) {
            _hashCode += getEmail_address().hashCode();
        }
        if (getName1() != null) {
            _hashCode += getName1().hashCode();
        }
        if (getName2() != null) {
            _hashCode += getName2().hashCode();
        }
        if (getAssociation() != null) {
            _hashCode += getAssociation().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMsi_id() != null) {
            _hashCode += getMsi_id().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contact_detail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "contact_detail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("association");
        elemField.setXmlName(new javax.xml.namespace.QName("", "association"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msi_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msi_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
