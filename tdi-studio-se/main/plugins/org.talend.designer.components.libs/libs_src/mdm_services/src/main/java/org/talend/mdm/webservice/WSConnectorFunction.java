/**
 * WSConnectorFunction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSConnectorFunction implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WSConnectorFunction(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _GET_STATUS = new org.apache.axis.types.NMToken("GET_STATUS");
    public static final org.apache.axis.types.NMToken _START = new org.apache.axis.types.NMToken("START");
    public static final org.apache.axis.types.NMToken _STOP = new org.apache.axis.types.NMToken("STOP");
    public static final org.apache.axis.types.NMToken _PULL = new org.apache.axis.types.NMToken("PULL");
    public static final org.apache.axis.types.NMToken _PUSH = new org.apache.axis.types.NMToken("PUSH");
    public static final WSConnectorFunction GET_STATUS = new WSConnectorFunction(_GET_STATUS);
    public static final WSConnectorFunction START = new WSConnectorFunction(_START);
    public static final WSConnectorFunction STOP = new WSConnectorFunction(_STOP);
    public static final WSConnectorFunction PULL = new WSConnectorFunction(_PULL);
    public static final WSConnectorFunction PUSH = new WSConnectorFunction(_PUSH);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static WSConnectorFunction fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        WSConnectorFunction enumeration = (WSConnectorFunction)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WSConnectorFunction fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WSConnectorFunction.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorFunction"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
