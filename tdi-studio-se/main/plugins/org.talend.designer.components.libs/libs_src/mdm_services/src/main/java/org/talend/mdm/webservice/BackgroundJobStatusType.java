/**
 * BackgroundJobStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class BackgroundJobStatusType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BackgroundJobStatusType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _SCHEDULED = new org.apache.axis.types.NMToken("SCHEDULED");
    public static final org.apache.axis.types.NMToken _RUNNING = new org.apache.axis.types.NMToken("RUNNING");
    public static final org.apache.axis.types.NMToken _COMPLETED = new org.apache.axis.types.NMToken("COMPLETED");
    public static final org.apache.axis.types.NMToken _SUSPENDED = new org.apache.axis.types.NMToken("SUSPENDED");
    public static final org.apache.axis.types.NMToken _CANCEL_REQUESTED = new org.apache.axis.types.NMToken("CANCEL_REQUESTED");
    public static final org.apache.axis.types.NMToken _STOPPED = new org.apache.axis.types.NMToken("STOPPED");
    public static final BackgroundJobStatusType SCHEDULED = new BackgroundJobStatusType(_SCHEDULED);
    public static final BackgroundJobStatusType RUNNING = new BackgroundJobStatusType(_RUNNING);
    public static final BackgroundJobStatusType COMPLETED = new BackgroundJobStatusType(_COMPLETED);
    public static final BackgroundJobStatusType SUSPENDED = new BackgroundJobStatusType(_SUSPENDED);
    public static final BackgroundJobStatusType CANCEL_REQUESTED = new BackgroundJobStatusType(_CANCEL_REQUESTED);
    public static final BackgroundJobStatusType STOPPED = new BackgroundJobStatusType(_STOPPED);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static BackgroundJobStatusType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        BackgroundJobStatusType enumeration = (BackgroundJobStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BackgroundJobStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BackgroundJobStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "BackgroundJobStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
