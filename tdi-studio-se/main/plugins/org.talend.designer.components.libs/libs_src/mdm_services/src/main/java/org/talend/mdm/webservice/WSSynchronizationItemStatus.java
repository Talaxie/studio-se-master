/**
 * WSSynchronizationItemStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationItemStatus implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WSSynchronizationItemStatus(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _PENDING = new org.apache.axis.types.NMToken("PENDING");
    public static final org.apache.axis.types.NMToken _MANUAL = new org.apache.axis.types.NMToken("MANUAL");
    public static final org.apache.axis.types.NMToken _RESOLVED = new org.apache.axis.types.NMToken("RESOLVED");
    public static final org.apache.axis.types.NMToken _EXECUTED = new org.apache.axis.types.NMToken("EXECUTED");
    public static final WSSynchronizationItemStatus PENDING = new WSSynchronizationItemStatus(_PENDING);
    public static final WSSynchronizationItemStatus MANUAL = new WSSynchronizationItemStatus(_MANUAL);
    public static final WSSynchronizationItemStatus RESOLVED = new WSSynchronizationItemStatus(_RESOLVED);
    public static final WSSynchronizationItemStatus EXECUTED = new WSSynchronizationItemStatus(_EXECUTED);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static WSSynchronizationItemStatus fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        WSSynchronizationItemStatus enumeration = (WSSynchronizationItemStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WSSynchronizationItemStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WSSynchronizationItemStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
