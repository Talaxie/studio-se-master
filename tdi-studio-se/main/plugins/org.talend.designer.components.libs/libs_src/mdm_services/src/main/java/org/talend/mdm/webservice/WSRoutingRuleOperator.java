/**
 * WSRoutingRuleOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSRoutingRuleOperator implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WSRoutingRuleOperator(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _CONTAINS = new org.apache.axis.types.NMToken("CONTAINS");
    public static final org.apache.axis.types.NMToken _MATCHES = new org.apache.axis.types.NMToken("MATCHES");
    public static final org.apache.axis.types.NMToken _STARTSWITH = new org.apache.axis.types.NMToken("STARTSWITH");
    public static final org.apache.axis.types.NMToken _EQUALS = new org.apache.axis.types.NMToken("EQUALS");
    public static final org.apache.axis.types.NMToken _NOT_EQUALS = new org.apache.axis.types.NMToken("NOT_EQUALS");
    public static final org.apache.axis.types.NMToken _GREATER_THAN = new org.apache.axis.types.NMToken("GREATER_THAN");
    public static final org.apache.axis.types.NMToken _GREATER_THAN_OR_EQUAL = new org.apache.axis.types.NMToken("GREATER_THAN_OR_EQUAL");
    public static final org.apache.axis.types.NMToken _LOWER_THAN = new org.apache.axis.types.NMToken("LOWER_THAN");
    public static final org.apache.axis.types.NMToken _LOWER_THAN_OR_EQUAL = new org.apache.axis.types.NMToken("LOWER_THAN_OR_EQUAL");
    public static final org.apache.axis.types.NMToken _IS_NULL = new org.apache.axis.types.NMToken("IS_NULL");
    public static final org.apache.axis.types.NMToken _IS_NOT_NULL = new org.apache.axis.types.NMToken("IS_NOT_NULL");
    public static final WSRoutingRuleOperator CONTAINS = new WSRoutingRuleOperator(_CONTAINS);
    public static final WSRoutingRuleOperator MATCHES = new WSRoutingRuleOperator(_MATCHES);
    public static final WSRoutingRuleOperator STARTSWITH = new WSRoutingRuleOperator(_STARTSWITH);
    public static final WSRoutingRuleOperator EQUALS = new WSRoutingRuleOperator(_EQUALS);
    public static final WSRoutingRuleOperator NOT_EQUALS = new WSRoutingRuleOperator(_NOT_EQUALS);
    public static final WSRoutingRuleOperator GREATER_THAN = new WSRoutingRuleOperator(_GREATER_THAN);
    public static final WSRoutingRuleOperator GREATER_THAN_OR_EQUAL = new WSRoutingRuleOperator(_GREATER_THAN_OR_EQUAL);
    public static final WSRoutingRuleOperator LOWER_THAN = new WSRoutingRuleOperator(_LOWER_THAN);
    public static final WSRoutingRuleOperator LOWER_THAN_OR_EQUAL = new WSRoutingRuleOperator(_LOWER_THAN_OR_EQUAL);
    public static final WSRoutingRuleOperator IS_NULL = new WSRoutingRuleOperator(_IS_NULL);
    public static final WSRoutingRuleOperator IS_NOT_NULL = new WSRoutingRuleOperator(_IS_NOT_NULL);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static WSRoutingRuleOperator fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        WSRoutingRuleOperator enumeration = (WSRoutingRuleOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WSRoutingRuleOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WSRoutingRuleOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRuleOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
