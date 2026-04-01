/**
 * WSWhereOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSWhereOperator implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WSWhereOperator(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _JOIN = new org.apache.axis.types.NMToken("JOIN");
    public static final org.apache.axis.types.NMToken _CONTAINS_TEXT_OF = new org.apache.axis.types.NMToken("CONTAINS_TEXT_OF");
    public static final org.apache.axis.types.NMToken _CONTAINS = new org.apache.axis.types.NMToken("CONTAINS");
    public static final org.apache.axis.types.NMToken _STARTSWITH = new org.apache.axis.types.NMToken("STARTSWITH");
    public static final org.apache.axis.types.NMToken _STRICTCONTAINS = new org.apache.axis.types.NMToken("STRICTCONTAINS");
    public static final org.apache.axis.types.NMToken _EQUALS = new org.apache.axis.types.NMToken("EQUALS");
    public static final org.apache.axis.types.NMToken _NOT_EQUALS = new org.apache.axis.types.NMToken("NOT_EQUALS");
    public static final org.apache.axis.types.NMToken _GREATER_THAN = new org.apache.axis.types.NMToken("GREATER_THAN");
    public static final org.apache.axis.types.NMToken _GREATER_THAN_OR_EQUAL = new org.apache.axis.types.NMToken("GREATER_THAN_OR_EQUAL");
    public static final org.apache.axis.types.NMToken _LOWER_THAN = new org.apache.axis.types.NMToken("LOWER_THAN");
    public static final org.apache.axis.types.NMToken _LOWER_THAN_OR_EQUAL = new org.apache.axis.types.NMToken("LOWER_THAN_OR_EQUAL");
    public static final org.apache.axis.types.NMToken _NO_OPERATOR = new org.apache.axis.types.NMToken("NO_OPERATOR");
    public static final org.apache.axis.types.NMToken _FULLTEXTSEARCH = new org.apache.axis.types.NMToken("FULLTEXTSEARCH");
    public static final org.apache.axis.types.NMToken _EMPTY_NULL = new org.apache.axis.types.NMToken("EMPTY_NULL");
    public static final WSWhereOperator JOIN = new WSWhereOperator(_JOIN);
    public static final WSWhereOperator CONTAINS_TEXT_OF = new WSWhereOperator(_CONTAINS_TEXT_OF);
    public static final WSWhereOperator CONTAINS = new WSWhereOperator(_CONTAINS);
    public static final WSWhereOperator STARTSWITH = new WSWhereOperator(_STARTSWITH);
    public static final WSWhereOperator STRICTCONTAINS = new WSWhereOperator(_STRICTCONTAINS);
    public static final WSWhereOperator EQUALS = new WSWhereOperator(_EQUALS);
    public static final WSWhereOperator NOT_EQUALS = new WSWhereOperator(_NOT_EQUALS);
    public static final WSWhereOperator GREATER_THAN = new WSWhereOperator(_GREATER_THAN);
    public static final WSWhereOperator GREATER_THAN_OR_EQUAL = new WSWhereOperator(_GREATER_THAN_OR_EQUAL);
    public static final WSWhereOperator LOWER_THAN = new WSWhereOperator(_LOWER_THAN);
    public static final WSWhereOperator LOWER_THAN_OR_EQUAL = new WSWhereOperator(_LOWER_THAN_OR_EQUAL);
    public static final WSWhereOperator NO_OPERATOR = new WSWhereOperator(_NO_OPERATOR);
    public static final WSWhereOperator FULLTEXTSEARCH = new WSWhereOperator(_FULLTEXTSEARCH);
    public static final WSWhereOperator EMPTY_NULL = new WSWhereOperator(_EMPTY_NULL);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static WSWhereOperator fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        WSWhereOperator enumeration = (WSWhereOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WSWhereOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WSWhereOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
