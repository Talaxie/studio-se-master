/**
 * AddInteractiveResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AddressDoctor.validator2.addInteractive.Interactive;

public class AddInteractiveResponse  implements java.io.Serializable {
    private long errorCode;

    private java.lang.String errorMessage;

    private java.lang.String reserved;

    private java.lang.String campaignID;

    private java.lang.String jobToken;

    private java.lang.String validationStatus;

    private com.AddressDoctor.validator2.addInteractive.Interactive.Service[] otherServices;

    private long resultCount;

    private com.AddressDoctor.validator2.addInteractive.Interactive.Result[] results;

    private java.lang.String countryISO3;

    public AddInteractiveResponse() {
    }

    public AddInteractiveResponse(
           long errorCode,
           java.lang.String errorMessage,
           java.lang.String reserved,
           java.lang.String campaignID,
           java.lang.String jobToken,
           java.lang.String validationStatus,
           com.AddressDoctor.validator2.addInteractive.Interactive.Service[] otherServices,
           long resultCount,
           com.AddressDoctor.validator2.addInteractive.Interactive.Result[] results,
           java.lang.String countryISO3) {
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.reserved = reserved;
           this.campaignID = campaignID;
           this.jobToken = jobToken;
           this.validationStatus = validationStatus;
           this.otherServices = otherServices;
           this.resultCount = resultCount;
           this.results = results;
           this.countryISO3 = countryISO3;
    }


    /**
     * Gets the errorCode value for this AddInteractiveResponse.
     * 
     * @return errorCode
     */
    public long getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this AddInteractiveResponse.
     * 
     * @param errorCode
     */
    public void setErrorCode(long errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this AddInteractiveResponse.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this AddInteractiveResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the reserved value for this AddInteractiveResponse.
     * 
     * @return reserved
     */
    public java.lang.String getReserved() {
        return reserved;
    }


    /**
     * Sets the reserved value for this AddInteractiveResponse.
     * 
     * @param reserved
     */
    public void setReserved(java.lang.String reserved) {
        this.reserved = reserved;
    }


    /**
     * Gets the campaignID value for this AddInteractiveResponse.
     * 
     * @return campaignID
     */
    public java.lang.String getCampaignID() {
        return campaignID;
    }


    /**
     * Sets the campaignID value for this AddInteractiveResponse.
     * 
     * @param campaignID
     */
    public void setCampaignID(java.lang.String campaignID) {
        this.campaignID = campaignID;
    }


    /**
     * Gets the jobToken value for this AddInteractiveResponse.
     * 
     * @return jobToken
     */
    public java.lang.String getJobToken() {
        return jobToken;
    }


    /**
     * Sets the jobToken value for this AddInteractiveResponse.
     * 
     * @param jobToken
     */
    public void setJobToken(java.lang.String jobToken) {
        this.jobToken = jobToken;
    }


    /**
     * Gets the validationStatus value for this AddInteractiveResponse.
     * 
     * @return validationStatus
     */
    public java.lang.String getValidationStatus() {
        return validationStatus;
    }


    /**
     * Sets the validationStatus value for this AddInteractiveResponse.
     * 
     * @param validationStatus
     */
    public void setValidationStatus(java.lang.String validationStatus) {
        this.validationStatus = validationStatus;
    }


    /**
     * Gets the otherServices value for this AddInteractiveResponse.
     * 
     * @return otherServices
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.Service[] getOtherServices() {
        return otherServices;
    }


    /**
     * Sets the otherServices value for this AddInteractiveResponse.
     * 
     * @param otherServices
     */
    public void setOtherServices(com.AddressDoctor.validator2.addInteractive.Interactive.Service[] otherServices) {
        this.otherServices = otherServices;
    }


    /**
     * Gets the resultCount value for this AddInteractiveResponse.
     * 
     * @return resultCount
     */
    public long getResultCount() {
        return resultCount;
    }


    /**
     * Sets the resultCount value for this AddInteractiveResponse.
     * 
     * @param resultCount
     */
    public void setResultCount(long resultCount) {
        this.resultCount = resultCount;
    }


    /**
     * Gets the results value for this AddInteractiveResponse.
     * 
     * @return results
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.Result[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this AddInteractiveResponse.
     * 
     * @param results
     */
    public void setResults(com.AddressDoctor.validator2.addInteractive.Interactive.Result[] results) {
        this.results = results;
    }


    /**
     * Gets the countryISO3 value for this AddInteractiveResponse.
     * 
     * @return countryISO3
     */
    public java.lang.String getCountryISO3() {
        return countryISO3;
    }


    /**
     * Sets the countryISO3 value for this AddInteractiveResponse.
     * 
     * @param countryISO3
     */
    public void setCountryISO3(java.lang.String countryISO3) {
        this.countryISO3 = countryISO3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddInteractiveResponse)) return false;
        AddInteractiveResponse other = (AddInteractiveResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.errorCode == other.getErrorCode() &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.reserved==null && other.getReserved()==null) || 
             (this.reserved!=null &&
              this.reserved.equals(other.getReserved()))) &&
            ((this.campaignID==null && other.getCampaignID()==null) || 
             (this.campaignID!=null &&
              this.campaignID.equals(other.getCampaignID()))) &&
            ((this.jobToken==null && other.getJobToken()==null) || 
             (this.jobToken!=null &&
              this.jobToken.equals(other.getJobToken()))) &&
            ((this.validationStatus==null && other.getValidationStatus()==null) || 
             (this.validationStatus!=null &&
              this.validationStatus.equals(other.getValidationStatus()))) &&
            ((this.otherServices==null && other.getOtherServices()==null) || 
             (this.otherServices!=null &&
              java.util.Arrays.equals(this.otherServices, other.getOtherServices()))) &&
            this.resultCount == other.getResultCount() &&
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults()))) &&
            ((this.countryISO3==null && other.getCountryISO3()==null) || 
             (this.countryISO3!=null &&
              this.countryISO3.equals(other.getCountryISO3())));
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
        _hashCode += new Long(getErrorCode()).hashCode();
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
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
        if (getValidationStatus() != null) {
            _hashCode += getValidationStatus().hashCode();
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
        _hashCode += new Long(getResultCount()).hashCode();
        if (getResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryISO3() != null) {
            _hashCode += getCountryISO3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddInteractiveResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "addInteractiveResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("validationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "ValidationStatus"));
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
        elemField.setFieldName("resultCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "ResultCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Result"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Result"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryISO3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "CountryISO3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
