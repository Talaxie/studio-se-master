/**
 * Parameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AddressDoctor.validator2.addInteractive.Interactive;

public class Parameters  implements java.io.Serializable {
    private com.AddressDoctor.validator2.addInteractive.Interactive.CountryOfOriginType countryOfOrigin;

    private boolean streetWithHNo;

    private com.AddressDoctor.validator2.addInteractive.Interactive.CountryType countryType;

    private com.AddressDoctor.validator2.addInteractive.Interactive.LineSeparatorType lineSeparator;

    private com.AddressDoctor.validator2.addInteractive.Interactive.PreferredLanguageType preferredLanguage;

    private com.AddressDoctor.validator2.addInteractive.Interactive.CapitalizationType capitalization;

    private boolean formattedAddressWithOrganization;

    private boolean removeDiacritics;

    private com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionsRequest fieldDimensions;

    public Parameters() {
    }

    public Parameters(
           com.AddressDoctor.validator2.addInteractive.Interactive.CountryOfOriginType countryOfOrigin,
           boolean streetWithHNo,
           com.AddressDoctor.validator2.addInteractive.Interactive.CountryType countryType,
           com.AddressDoctor.validator2.addInteractive.Interactive.LineSeparatorType lineSeparator,
           com.AddressDoctor.validator2.addInteractive.Interactive.PreferredLanguageType preferredLanguage,
           com.AddressDoctor.validator2.addInteractive.Interactive.CapitalizationType capitalization,
           boolean formattedAddressWithOrganization,
           boolean removeDiacritics,
           com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionsRequest fieldDimensions) {
           this.countryOfOrigin = countryOfOrigin;
           this.streetWithHNo = streetWithHNo;
           this.countryType = countryType;
           this.lineSeparator = lineSeparator;
           this.preferredLanguage = preferredLanguage;
           this.capitalization = capitalization;
           this.formattedAddressWithOrganization = formattedAddressWithOrganization;
           this.removeDiacritics = removeDiacritics;
           this.fieldDimensions = fieldDimensions;
    }


    /**
     * Gets the countryOfOrigin value for this Parameters.
     * 
     * @return countryOfOrigin
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.CountryOfOriginType getCountryOfOrigin() {
        return countryOfOrigin;
    }


    /**
     * Sets the countryOfOrigin value for this Parameters.
     * 
     * @param countryOfOrigin
     */
    public void setCountryOfOrigin(com.AddressDoctor.validator2.addInteractive.Interactive.CountryOfOriginType countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }


    /**
     * Gets the streetWithHNo value for this Parameters.
     * 
     * @return streetWithHNo
     */
    public boolean isStreetWithHNo() {
        return streetWithHNo;
    }


    /**
     * Sets the streetWithHNo value for this Parameters.
     * 
     * @param streetWithHNo
     */
    public void setStreetWithHNo(boolean streetWithHNo) {
        this.streetWithHNo = streetWithHNo;
    }


    /**
     * Gets the countryType value for this Parameters.
     * 
     * @return countryType
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.CountryType getCountryType() {
        return countryType;
    }


    /**
     * Sets the countryType value for this Parameters.
     * 
     * @param countryType
     */
    public void setCountryType(com.AddressDoctor.validator2.addInteractive.Interactive.CountryType countryType) {
        this.countryType = countryType;
    }


    /**
     * Gets the lineSeparator value for this Parameters.
     * 
     * @return lineSeparator
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.LineSeparatorType getLineSeparator() {
        return lineSeparator;
    }


    /**
     * Sets the lineSeparator value for this Parameters.
     * 
     * @param lineSeparator
     */
    public void setLineSeparator(com.AddressDoctor.validator2.addInteractive.Interactive.LineSeparatorType lineSeparator) {
        this.lineSeparator = lineSeparator;
    }


    /**
     * Gets the preferredLanguage value for this Parameters.
     * 
     * @return preferredLanguage
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.PreferredLanguageType getPreferredLanguage() {
        return preferredLanguage;
    }


    /**
     * Sets the preferredLanguage value for this Parameters.
     * 
     * @param preferredLanguage
     */
    public void setPreferredLanguage(com.AddressDoctor.validator2.addInteractive.Interactive.PreferredLanguageType preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }


    /**
     * Gets the capitalization value for this Parameters.
     * 
     * @return capitalization
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.CapitalizationType getCapitalization() {
        return capitalization;
    }


    /**
     * Sets the capitalization value for this Parameters.
     * 
     * @param capitalization
     */
    public void setCapitalization(com.AddressDoctor.validator2.addInteractive.Interactive.CapitalizationType capitalization) {
        this.capitalization = capitalization;
    }


    /**
     * Gets the formattedAddressWithOrganization value for this Parameters.
     * 
     * @return formattedAddressWithOrganization
     */
    public boolean isFormattedAddressWithOrganization() {
        return formattedAddressWithOrganization;
    }


    /**
     * Sets the formattedAddressWithOrganization value for this Parameters.
     * 
     * @param formattedAddressWithOrganization
     */
    public void setFormattedAddressWithOrganization(boolean formattedAddressWithOrganization) {
        this.formattedAddressWithOrganization = formattedAddressWithOrganization;
    }


    /**
     * Gets the removeDiacritics value for this Parameters.
     * 
     * @return removeDiacritics
     */
    public boolean isRemoveDiacritics() {
        return removeDiacritics;
    }


    /**
     * Sets the removeDiacritics value for this Parameters.
     * 
     * @param removeDiacritics
     */
    public void setRemoveDiacritics(boolean removeDiacritics) {
        this.removeDiacritics = removeDiacritics;
    }


    /**
     * Gets the fieldDimensions value for this Parameters.
     * 
     * @return fieldDimensions
     */
    public com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionsRequest getFieldDimensions() {
        return fieldDimensions;
    }


    /**
     * Sets the fieldDimensions value for this Parameters.
     * 
     * @param fieldDimensions
     */
    public void setFieldDimensions(com.AddressDoctor.validator2.addInteractive.Interactive.FieldDimensionsRequest fieldDimensions) {
        this.fieldDimensions = fieldDimensions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Parameters)) return false;
        Parameters other = (Parameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countryOfOrigin==null && other.getCountryOfOrigin()==null) || 
             (this.countryOfOrigin!=null &&
              this.countryOfOrigin.equals(other.getCountryOfOrigin()))) &&
            this.streetWithHNo == other.isStreetWithHNo() &&
            ((this.countryType==null && other.getCountryType()==null) || 
             (this.countryType!=null &&
              this.countryType.equals(other.getCountryType()))) &&
            ((this.lineSeparator==null && other.getLineSeparator()==null) || 
             (this.lineSeparator!=null &&
              this.lineSeparator.equals(other.getLineSeparator()))) &&
            ((this.preferredLanguage==null && other.getPreferredLanguage()==null) || 
             (this.preferredLanguage!=null &&
              this.preferredLanguage.equals(other.getPreferredLanguage()))) &&
            ((this.capitalization==null && other.getCapitalization()==null) || 
             (this.capitalization!=null &&
              this.capitalization.equals(other.getCapitalization()))) &&
            this.formattedAddressWithOrganization == other.isFormattedAddressWithOrganization() &&
            this.removeDiacritics == other.isRemoveDiacritics() &&
            ((this.fieldDimensions==null && other.getFieldDimensions()==null) || 
             (this.fieldDimensions!=null &&
              this.fieldDimensions.equals(other.getFieldDimensions())));
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
        if (getCountryOfOrigin() != null) {
            _hashCode += getCountryOfOrigin().hashCode();
        }
        _hashCode += (isStreetWithHNo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCountryType() != null) {
            _hashCode += getCountryType().hashCode();
        }
        if (getLineSeparator() != null) {
            _hashCode += getLineSeparator().hashCode();
        }
        if (getPreferredLanguage() != null) {
            _hashCode += getPreferredLanguage().hashCode();
        }
        if (getCapitalization() != null) {
            _hashCode += getCapitalization().hashCode();
        }
        _hashCode += (isFormattedAddressWithOrganization() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRemoveDiacritics() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFieldDimensions() != null) {
            _hashCode += getFieldDimensions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Parameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Parameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "CountryOfOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "CountryOfOriginType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetWithHNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "StreetWithHNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "CountryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "CountryType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineSeparator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "LineSeparator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "LineSeparatorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "PreferredLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "PreferredLanguageType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capitalization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Capitalization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "CapitalizationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formattedAddressWithOrganization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FormattedAddressWithOrganization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeDiacritics");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "RemoveDiacritics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "FieldDimensionsRequest"));
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
