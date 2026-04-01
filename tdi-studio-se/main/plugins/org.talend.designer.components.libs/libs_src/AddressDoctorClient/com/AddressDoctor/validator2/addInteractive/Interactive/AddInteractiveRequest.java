/**
 * AddInteractiveRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AddressDoctor.validator2.addInteractive.Interactive;

public class AddInteractiveRequest  implements java.io.Serializable {
    private com.AddressDoctor.validator2.addInteractive.Interactive.Authentication authentication;

    private java.lang.String reserved;

    private java.lang.String campaignID;

    private java.lang.String jobToken;

    private com.AddressDoctor.validator2.addInteractive.Interactive.Service[] otherServices;

    private com.AddressDoctor.validator2.addInteractive.Interactive.Parameters parameters;

    private com.AddressDoctor.validator2.addInteractive.Interactive.Address address;

    public AddInteractiveRequest() {
    }

    public AddInteractiveRequest(
           com.AddressDoctor.validator2.addInteractive.Interactive.Authentication authentication,
           java.lang.String reserved,
           java.lang.String campaignID,
           java.lang.String jobToken,
           com.AddressDoctor.validator2.addInteractive.Interactive.Service[] otherServices,
           com.AddressDoctor.validator2.addInteractive.Interactive.Parameters parameters,
           com.AddressDoctor.validator2.addInteractive.Interactive.Address address) {
           this.authentication = authentication;
           this.reserved = reserved;
           this.campaignID = campaignID;
           this.jobToken = jobToken;
           this.otherServices = otherServices;
           this.parameters = parameters;
           this.address = address;
    }


    /**
     * Gets the authentication value for this AddInteractiveRequest.
     * 
     * @return authentication
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.Authentication getAuthentication() {
        return authentication;
    }


    /**
     * Sets the authentication value for this AddInteractiveRequest.
     * 
     * @param authentication
     */
    public void setAuthentication(com.AddressDoctor.validator2.addInteractive.Interactive.Authentication authentication) {
        this.authentication = authentication;
    }


    /**
     * Gets the reserved value for this AddInteractiveRequest.
     * 
     * @return reserved
     */
    public java.lang.String getReserved() {
        return reserved;
    }


    /**
     * Sets the reserved value for this AddInteractiveRequest.
     * 
     * @param reserved
     */
    public void setReserved(java.lang.String reserved) {
        this.reserved = reserved;
    }


    /**
     * Gets the campaignID value for this AddInteractiveRequest.
     * 
     * @return campaignID
     */
    public java.lang.String getCampaignID() {
        return campaignID;
    }


    /**
     * Sets the campaignID value for this AddInteractiveRequest.
     * 
     * @param campaignID
     */
    public void setCampaignID(java.lang.String campaignID) {
        this.campaignID = campaignID;
    }


    /**
     * Gets the jobToken value for this AddInteractiveRequest.
     * 
     * @return jobToken
     */
    public java.lang.String getJobToken() {
        return jobToken;
    }


    /**
     * Sets the jobToken value for this AddInteractiveRequest.
     * 
     * @param jobToken
     */
    public void setJobToken(java.lang.String jobToken) {
        this.jobToken = jobToken;
    }


    /**
     * Gets the otherServices value for this AddInteractiveRequest.
     * 
     * @return otherServices
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.Service[] getOtherServices() {
        return otherServices;
    }


    /**
     * Sets the otherServices value for this AddInteractiveRequest.
     * 
     * @param otherServices
     */
    public void setOtherServices(com.AddressDoctor.validator2.addInteractive.Interactive.Service[] otherServices) {
        this.otherServices = otherServices;
    }


    /**
     * Gets the parameters value for this AddInteractiveRequest.
     * 
     * @return parameters
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.Parameters getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this AddInteractiveRequest.
     * 
     * @param parameters
     */
    public void setParameters(com.AddressDoctor.validator2.addInteractive.Interactive.Parameters parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the address value for this AddInteractiveRequest.
     * 
     * @return address
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AddInteractiveRequest.
     * 
     * @param address
     */
    public void setAddress(com.AddressDoctor.validator2.addInteractive.Interactive.Address address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddInteractiveRequest)) return false;
        AddInteractiveRequest other = (AddInteractiveRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authentication==null && other.getAuthentication()==null) || 
             (this.authentication!=null &&
              this.authentication.equals(other.getAuthentication()))) &&
            ((this.reserved==null && other.getReserved()==null) || 
             (this.reserved!=null &&
              this.reserved.equals(other.getReserved()))) &&
            ((this.campaignID==null && other.getCampaignID()==null) || 
             (this.campaignID!=null &&
              this.campaignID.equals(other.getCampaignID()))) &&
            ((this.jobToken==null && other.getJobToken()==null) || 
             (this.jobToken!=null &&
              this.jobToken.equals(other.getJobToken()))) &&
            ((this.otherServices==null && other.getOtherServices()==null) || 
             (this.otherServices!=null &&
              java.util.Arrays.equals(this.otherServices, other.getOtherServices()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              this.parameters.equals(other.getParameters()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getAuthentication() != null) {
            _hashCode += getAuthentication().hashCode();
        }
        if (getReserved() != null) {
            _hashCode += getReserved().hashCode();
        }
        if (getCampaignID() != null) {
            _hashCode += getCampaignID().hashCode();
        }
        if (getJobToken() != null) {
            _hashCode += getJobToken().hashCode();
        }
        if (getOtherServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParameters() != null) {
            _hashCode += getParameters().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddInteractiveRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "addInteractiveRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Authentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Authentication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Reserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "CampaignID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "JobToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "OtherServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Service"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Parameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Address"));
        elemField.setMinOccurs(0);
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
