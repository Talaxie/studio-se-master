/**
 * LineSeparatorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AddressDoctor.validator2.addInteractive.Interactive;

public class LineSeparatorType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LineSeparatorType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LST_LF = "LST_LF";
    public static final java.lang.String _LST_SEMICOLON = "LST_SEMICOLON";
    public static final java.lang.String _LST_COMMA = "LST_COMMA";
    public static final java.lang.String _LST_TAB = "LST_TAB";
    public static final java.lang.String _LST_NO_SEPARATOR = "LST_NO_SEPARATOR";
    public static final LineSeparatorType LST_LF = new LineSeparatorType(_LST_LF);
    public static final LineSeparatorType LST_SEMICOLON = new LineSeparatorType(_LST_SEMICOLON);
    public static final LineSeparatorType LST_COMMA = new LineSeparatorType(_LST_COMMA);
    public static final LineSeparatorType LST_TAB = new LineSeparatorType(_LST_TAB);
    public static final LineSeparatorType LST_NO_SEPARATOR = new LineSeparatorType(_LST_NO_SEPARATOR);
    public java.lang.String getValue() { return _value_;}
    public static LineSeparatorType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LineSeparatorType enumeration = (LineSeparatorType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LineSeparatorType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LineSeparatorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "LineSeparatorType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
