/**
 * FieldDimensionsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AddressDoctor.validator2.addInteractive.Interactive;

public class FieldDimensionsRequest  implements java.io.Serializable {
    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType organization;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType contact;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType building;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType street;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType POBox;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType locality;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType postalCode;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType province;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType country;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType countrySpecificLocalityLine;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType deliveryAddressLines;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType formattedAddress;

    public FieldDimensionsRequest() {
    }

    public FieldDimensionsRequest(
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType organization,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType contact,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType building,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType street,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType POBox,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType locality,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType postalCode,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType province,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType country,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType countrySpecificLocalityLine,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType deliveryAddressLines,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType formattedAddress) {
           this.organization = organization;
           this.contact = contact;
           this.building = building;
           this.street = street;
           this.POBox = POBox;
           this.locality = locality;
           this.postalCode = postalCode;
           this.province = province;
           this.country = country;
           this.countrySpecificLocalityLine = countrySpecificLocalityLine;
           this.deliveryAddressLines = deliveryAddressLines;
           this.formattedAddress = formattedAddress;
    }


    /**
     * Gets the organization value for this FieldDimensionsRequest.
     * 
     * @return organization
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this FieldDimensionsRequest.
     * 
     * @param organization
     */
    public void setOrganization(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType organization) {
        this.organization = organization;
    }


    /**
     * Gets the contact value for this FieldDimensionsRequest.
     * 
     * @return contact
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this FieldDimensionsRequest.
     * 
     * @param contact
     */
    public void setContact(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType contact) {
        this.contact = contact;
    }


    /**
     * Gets the building value for this FieldDimensionsRequest.
     * 
     * @return building
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType getBuilding() {
        return building;
    }


    /**
     * Sets the building value for this FieldDimensionsRequest.
     * 
     * @param building
     */
    public void setBuilding(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType building) {
        this.building = building;
    }


    /**
     * Gets the street value for this FieldDimensionsRequest.
     * 
     * @return street
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType getStreet() {
        return street;
    }


    /**
     * Sets the street value for this FieldDimensionsRequest.
     * 
     * @param street
     */
    public void setStreet(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType street) {
        this.street = street;
    }


    /**
     * Gets the POBox value for this FieldDimensionsRequest.
     * 
     * @return POBox
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType getPOBox() {
        return POBox;
    }


    /**
     * Sets the POBox value for this FieldDimensionsRequest.
     * 
     * @param POBox
     */
    public void setPOBox(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType POBox) {
        this.POBox = POBox;
    }


    /**
     * Gets the locality value for this FieldDimensionsRequest.
     * 
     * @return locality
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType getLocality() {
        return locality;
    }


    /**
     * Sets the locality value for this FieldDimensionsRequest.
     * 
     * @param locality
     */
    public void setLocality(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType locality) {
        this.locality = locality;
    }


    /**
     * Gets the postalCode value for this FieldDimensionsRequest.
     * 
     * @return postalCode
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this FieldDimensionsRequest.
     * 
     * @param postalCode
     */
    public void setPostalCode(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the province value for this FieldDimensionsRequest.
     * 
     * @return province
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType getProvince() {
        return province;
    }


    /**
     * Sets the province value for this FieldDimensionsRequest.
     * 
     * @param province
     */
    public void setProvince(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType province) {
        this.province = province;
    }


    /**
     * Gets the country value for this FieldDimensionsRequest.
     * 
     * @return country
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType getCountry() {
        return country;
    }


    /**
     * Sets the country value for this FieldDimensionsRequest.
     * 
     * @param country
     */
    public void setCountry(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType country) {
        this.country = country;
    }


    /**
     * Gets the countrySpecificLocalityLine value for this FieldDimensionsRequest.
     * 
     * @return countrySpecificLocalityLine
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType getCountrySpecificLocalityLine() {
        return countrySpecificLocalityLine;
    }


    /**
     * Sets the countrySpecificLocalityLine value for this FieldDimensionsRequest.
     * 
     * @param countrySpecificLocalityLine
     */
    public void setCountrySpecificLocalityLine(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionSingleLineType countrySpecificLocalityLine) {
        this.countrySpecificLocalityLine = countrySpecificLocalityLine;
    }


    /**
     * Gets the deliveryAddressLines value for this FieldDimensionsRequest.
     * 
     * @return deliveryAddressLines
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType getDeliveryAddressLines() {
        return deliveryAddressLines;
    }


    /**
     * Sets the deliveryAddressLines value for this FieldDimensionsRequest.
     * 
     * @param deliveryAddressLines
     */
    public void setDeliveryAddressLines(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType deliveryAddressLines) {
        this.deliveryAddressLines = deliveryAddressLines;
    }


    /**
     * Gets the formattedAddress value for this FieldDimensionsRequest.
     * 
     * @return formattedAddress
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType getFormattedAddress() {
        return formattedAddress;
    }


    /**
     * Sets the formattedAddress value for this FieldDimensionsRequest.
     * 
     * @param formattedAddress
     */
    public void setFormattedAddress(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionMultiLineType formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldDimensionsRequest)) return false;
        FieldDimensionsRequest other = (FieldDimensionsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.building==null && other.getBuilding()==null) || 
             (this.building!=null &&
              this.building.equals(other.getBuilding()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.POBox==null && other.getPOBox()==null) || 
             (this.POBox!=null &&
              this.POBox.equals(other.getPOBox()))) &&
            ((this.locality==null && other.getLocality()==null) || 
             (this.locality!=null &&
              this.locality.equals(other.getLocality()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.countrySpecificLocalityLine==null && other.getCountrySpecificLocalityLine()==null) || 
             (this.countrySpecificLocalityLine!=null &&
              this.countrySpecificLocalityLine.equals(other.getCountrySpecificLocalityLine()))) &&
            ((this.deliveryAddressLines==null && other.getDeliveryAddressLines()==null) || 
             (this.deliveryAddressLines!=null &&
              this.deliveryAddressLines.equals(other.getDeliveryAddressLines()))) &&
            ((this.formattedAddress==null && other.getFormattedAddress()==null) || 
             (this.formattedAddress!=null &&
              this.formattedAddress.equals(other.getFormattedAddress())));
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
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getBuilding() != null) {
            _hashCode += getBuilding().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getPOBox() != null) {
            _hashCode += getPOBox().hashCode();
        }
        if (getLocality() != null) {
            _hashCode += getLocality().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCountrySpecificLocalityLine() != null) {
            _hashCode += getCountrySpecificLocalityLine().hashCode();
        }
        if (getDeliveryAddressLines() != null) {
            _hashCode += getDeliveryAddressLines().hashCode();
        }
        if (getFormattedAddress() != null) {
            _hashCode += getFormattedAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldDimensionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionMultiLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionMultiLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("building");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Building"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionMultiLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionMultiLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "POBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionSingleLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Locality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionMultiLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionSingleLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionMultiLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionSingleLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countrySpecificLocalityLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "CountrySpecificLocalityLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionSingleLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryAddressLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "DeliveryAddressLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionMultiLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formattedAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FormattedAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionMultiLineType"));
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
