/**
 * WSWhereItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * An And or Or or WhereCondition
 */
public class WSWhereItem  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSWhereCondition whereCondition;

    private org.talend.mdm.webservice.WSWhereItem[] whereAnd;

    private org.talend.mdm.webservice.WSWhereItem[] whereOr;

    public WSWhereItem() {
    }

    public WSWhereItem(
           org.talend.mdm.webservice.WSWhereCondition whereCondition,
           org.talend.mdm.webservice.WSWhereItem[] whereAnd,
           org.talend.mdm.webservice.WSWhereItem[] whereOr) {
           this.whereCondition = whereCondition;
           this.whereAnd = whereAnd;
           this.whereOr = whereOr;
    }


    /**
     * Gets the whereCondition value for this WSWhereItem.
     * 
     * @return whereCondition
     */
    public org.talend.mdm.webservice.WSWhereCondition getWhereCondition() {
        return whereCondition;
    }


    /**
     * Sets the whereCondition value for this WSWhereItem.
     * 
     * @param whereCondition
     */
    public void setWhereCondition(org.talend.mdm.webservice.WSWhereCondition whereCondition) {
        this.whereCondition = whereCondition;
    }


    /**
     * Gets the whereAnd value for this WSWhereItem.
     * 
     * @return whereAnd
     */
    public org.talend.mdm.webservice.WSWhereItem[] getWhereAnd() {
        return whereAnd;
    }


    /**
     * Sets the whereAnd value for this WSWhereItem.
     * 
     * @param whereAnd
     */
    public void setWhereAnd(org.talend.mdm.webservice.WSWhereItem[] whereAnd) {
        this.whereAnd = whereAnd;
    }


    /**
     * Gets the whereOr value for this WSWhereItem.
     * 
     * @return whereOr
     */
    public org.talend.mdm.webservice.WSWhereItem[] getWhereOr() {
        return whereOr;
    }


    /**
     * Sets the whereOr value for this WSWhereItem.
     * 
     * @param whereOr
     */
    public void setWhereOr(org.talend.mdm.webservice.WSWhereItem[] whereOr) {
        this.whereOr = whereOr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSWhereItem)) return false;
        WSWhereItem other = (WSWhereItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.whereCondition==null && other.getWhereCondition()==null) || 
             (this.whereCondition!=null &&
              this.whereCondition.equals(other.getWhereCondition()))) &&
            ((this.whereAnd==null && other.getWhereAnd()==null) || 
             (this.whereAnd!=null &&
              java.util.Arrays.equals(this.whereAnd, other.getWhereAnd()))) &&
            ((this.whereOr==null && other.getWhereOr()==null) || 
             (this.whereOr!=null &&
              java.util.Arrays.equals(this.whereOr, other.getWhereOr())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWhereCondition() != null) {
            _hashCode += getWhereCondition().hashCode();
        }
        if (getWhereAnd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWhereAnd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWhereAnd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWhereOr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWhereOr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWhereOr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSWhereItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whereCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "whereCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereCondition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whereAnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "whereAnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "whereItems"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whereOr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "whereOr"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "whereItems"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
