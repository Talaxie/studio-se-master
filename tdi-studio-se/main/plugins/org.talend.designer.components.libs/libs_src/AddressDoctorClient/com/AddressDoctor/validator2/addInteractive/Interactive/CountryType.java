/**
 * CountryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AddressDoctor.validator2.addInteractive.Interactive;

public class CountryType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CountryType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ISO_2 = "ISO_2";
    public static final java.lang.String _ISO_3 = "ISO_3";
    public static final java.lang.String _ISO_NUMBER = "ISO_NUMBER";
    public static final java.lang.String _ABBREVIATION = "ABBREVIATION";
    public static final java.lang.String _NAME_CN = "NAME_CN";
    public static final java.lang.String _NAME_DA = "NAME_DA";
    public static final java.lang.String _NAME_DE = "NAME_DE";
    public static final java.lang.String _NAME_EN = "NAME_EN";
    public static final java.lang.String _NAME_ES = "NAME_ES";
    public static final java.lang.String _NAME_FI = "NAME_FI";
    public static final java.lang.String _NAME_FR = "NAME_FR";
    public static final java.lang.String _NAME_GR = "NAME_GR";
    public static final java.lang.String _NAME_HU = "NAME_HU";
    public static final java.lang.String _NAME_IT = "NAME_IT";
    public static final java.lang.String _NAME_JP = "NAME_JP";
    public static final java.lang.String _NAME_KR = "NAME_KR";
    public static final java.lang.String _NAME_NL = "NAME_NL";
    public static final java.lang.String _NAME_PL = "NAME_PL";
    public static final java.lang.String _NAME_PT = "NAME_PT";
    public static final java.lang.String _NAME_RU = "NAME_RU";
    public static final java.lang.String _NAME_SA = "NAME_SA";
    public static final java.lang.String _NAME_SE = "NAME_SE";
    public static final CountryType ISO_2 = new CountryType(_ISO_2);
    public static final CountryType ISO_3 = new CountryType(_ISO_3);
    public static final CountryType ISO_NUMBER = new CountryType(_ISO_NUMBER);
    public static final CountryType ABBREVIATION = new CountryType(_ABBREVIATION);
    public static final CountryType NAME_CN = new CountryType(_NAME_CN);
    public static final CountryType NAME_DA = new CountryType(_NAME_DA);
    public static final CountryType NAME_DE = new CountryType(_NAME_DE);
    public static final CountryType NAME_EN = new CountryType(_NAME_EN);
    public static final CountryType NAME_ES = new CountryType(_NAME_ES);
    public static final CountryType NAME_FI = new CountryType(_NAME_FI);
    public static final CountryType NAME_FR = new CountryType(_NAME_FR);
    public static final CountryType NAME_GR = new CountryType(_NAME_GR);
    public static final CountryType NAME_HU = new CountryType(_NAME_HU);
    public static final CountryType NAME_IT = new CountryType(_NAME_IT);
    public static final CountryType NAME_JP = new CountryType(_NAME_JP);
    public static final CountryType NAME_KR = new CountryType(_NAME_KR);
    public static final CountryType NAME_NL = new CountryType(_NAME_NL);
    public static final CountryType NAME_PL = new CountryType(_NAME_PL);
    public static final CountryType NAME_PT = new CountryType(_NAME_PT);
    public static final CountryType NAME_RU = new CountryType(_NAME_RU);
    public static final CountryType NAME_SA = new CountryType(_NAME_SA);
    public static final CountryType NAME_SE = new CountryType(_NAME_SE);
    public java.lang.String getValue() { return _value_;}
    public static CountryType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CountryType enumeration = (CountryType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CountryType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CountryType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "CountryType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
