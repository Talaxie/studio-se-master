/**
 * WSRoutingEngineV2ActionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSRoutingEngineV2ActionCode implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WSRoutingEngineV2ActionCode(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _START = new org.apache.axis.types.NMToken("START");
    public static final org.apache.axis.types.NMToken _STOP = new org.apache.axis.types.NMToken("STOP");
    public static final org.apache.axis.types.NMToken _SUSPEND = new org.apache.axis.types.NMToken("SUSPEND");
    public static final org.apache.axis.types.NMToken _RESUME = new org.apache.axis.types.NMToken("RESUME");
    public static final org.apache.axis.types.NMToken _STATUS = new org.apache.axis.types.NMToken("STATUS");
    public static final WSRoutingEngineV2ActionCode START = new WSRoutingEngineV2ActionCode(_START);
    public static final WSRoutingEngineV2ActionCode STOP = new WSRoutingEngineV2ActionCode(_STOP);
    public static final WSRoutingEngineV2ActionCode SUSPEND = new WSRoutingEngineV2ActionCode(_SUSPEND);
    public static final WSRoutingEngineV2ActionCode RESUME = new WSRoutingEngineV2ActionCode(_RESUME);
    public static final WSRoutingEngineV2ActionCode STATUS = new WSRoutingEngineV2ActionCode(_STATUS);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static WSRoutingEngineV2ActionCode fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        WSRoutingEngineV2ActionCode enumeration = (WSRoutingEngineV2ActionCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WSRoutingEngineV2ActionCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WSRoutingEngineV2ActionCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingEngineV2ActionCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
