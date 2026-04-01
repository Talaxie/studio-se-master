/**
 * WSServiceActionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSServiceActionCode implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WSServiceActionCode(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _START = new org.apache.axis.types.NMToken("START");
    public static final org.apache.axis.types.NMToken _STOP = new org.apache.axis.types.NMToken("STOP");
    public static final org.apache.axis.types.NMToken _STATUS = new org.apache.axis.types.NMToken("STATUS");
    public static final org.apache.axis.types.NMToken _EXECUTE = new org.apache.axis.types.NMToken("EXECUTE");
    public static final WSServiceActionCode START = new WSServiceActionCode(_START);
    public static final WSServiceActionCode STOP = new WSServiceActionCode(_STOP);
    public static final WSServiceActionCode STATUS = new WSServiceActionCode(_STATUS);
    public static final WSServiceActionCode EXECUTE = new WSServiceActionCode(_EXECUTE);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static WSServiceActionCode fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        WSServiceActionCode enumeration = (WSServiceActionCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WSServiceActionCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WSServiceActionCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceActionCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
