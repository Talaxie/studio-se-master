/**
 * WSRoutingOrderV2Status.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSRoutingOrderV2Status implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WSRoutingOrderV2Status(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _ACTIVE = new org.apache.axis.types.NMToken("ACTIVE");
    public static final org.apache.axis.types.NMToken _FAILED = new org.apache.axis.types.NMToken("FAILED");
    public static final org.apache.axis.types.NMToken _COMPLETED = new org.apache.axis.types.NMToken("COMPLETED");
    public static final WSRoutingOrderV2Status ACTIVE = new WSRoutingOrderV2Status(_ACTIVE);
    public static final WSRoutingOrderV2Status FAILED = new WSRoutingOrderV2Status(_FAILED);
    public static final WSRoutingOrderV2Status COMPLETED = new WSRoutingOrderV2Status(_COMPLETED);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static WSRoutingOrderV2Status fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        WSRoutingOrderV2Status enumeration = (WSRoutingOrderV2Status)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WSRoutingOrderV2Status fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WSRoutingOrderV2Status.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2Status"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
