/**
 * WSStringPredicate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSStringPredicate implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WSStringPredicate(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _NONE = new org.apache.axis.types.NMToken("NONE");
    public static final org.apache.axis.types.NMToken _OR = new org.apache.axis.types.NMToken("OR");
    public static final org.apache.axis.types.NMToken _AND = new org.apache.axis.types.NMToken("AND");
    public static final org.apache.axis.types.NMToken _STRICTAND = new org.apache.axis.types.NMToken("STRICTAND");
    public static final org.apache.axis.types.NMToken _EXACTLY = new org.apache.axis.types.NMToken("EXACTLY");
    public static final org.apache.axis.types.NMToken _NOT = new org.apache.axis.types.NMToken("NOT");
    public static final WSStringPredicate NONE = new WSStringPredicate(_NONE);
    public static final WSStringPredicate OR = new WSStringPredicate(_OR);
    public static final WSStringPredicate AND = new WSStringPredicate(_AND);
    public static final WSStringPredicate STRICTAND = new WSStringPredicate(_STRICTAND);
    public static final WSStringPredicate EXACTLY = new WSStringPredicate(_EXACTLY);
    public static final WSStringPredicate NOT = new WSStringPredicate(_NOT);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static WSStringPredicate fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        WSStringPredicate enumeration = (WSStringPredicate)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WSStringPredicate fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.NMToken(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
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
        new org.apache.axis.description.TypeDesc(WSStringPredicate.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringPredicate"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
