/**
 * WSWhereCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Use this object to write where conditions.
 */
public class WSWhereCondition  implements java.io.Serializable {
    private java.lang.String leftPath;

    private org.talend.mdm.webservice.WSWhereOperator operator;

    private java.lang.String rightValueOrPath;

    private org.talend.mdm.webservice.WSStringPredicate stringPredicate;

    private boolean spellCheck;

    public WSWhereCondition() {
    }

    public WSWhereCondition(
           java.lang.String leftPath,
           org.talend.mdm.webservice.WSWhereOperator operator,
           java.lang.String rightValueOrPath,
           org.talend.mdm.webservice.WSStringPredicate stringPredicate,
           boolean spellCheck) {
           this.leftPath = leftPath;
           this.operator = operator;
           this.rightValueOrPath = rightValueOrPath;
           this.stringPredicate = stringPredicate;
           this.spellCheck = spellCheck;
    }


    /**
     * Gets the leftPath value for this WSWhereCondition.
     * 
     * @return leftPath
     */
    public java.lang.String getLeftPath() {
        return leftPath;
    }


    /**
     * Sets the leftPath value for this WSWhereCondition.
     * 
     * @param leftPath
     */
    public void setLeftPath(java.lang.String leftPath) {
        this.leftPath = leftPath;
    }


    /**
     * Gets the operator value for this WSWhereCondition.
     * 
     * @return operator
     */
    public org.talend.mdm.webservice.WSWhereOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this WSWhereCondition.
     * 
     * @param operator
     */
    public void setOperator(org.talend.mdm.webservice.WSWhereOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the rightValueOrPath value for this WSWhereCondition.
     * 
     * @return rightValueOrPath
     */
    public java.lang.String getRightValueOrPath() {
        return rightValueOrPath;
    }


    /**
     * Sets the rightValueOrPath value for this WSWhereCondition.
     * 
     * @param rightValueOrPath
     */
    public void setRightValueOrPath(java.lang.String rightValueOrPath) {
        this.rightValueOrPath = rightValueOrPath;
    }


    /**
     * Gets the stringPredicate value for this WSWhereCondition.
     * 
     * @return stringPredicate
     */
    public org.talend.mdm.webservice.WSStringPredicate getStringPredicate() {
        return stringPredicate;
    }


    /**
     * Sets the stringPredicate value for this WSWhereCondition.
     * 
     * @param stringPredicate
     */
    public void setStringPredicate(org.talend.mdm.webservice.WSStringPredicate stringPredicate) {
        this.stringPredicate = stringPredicate;
    }


    /**
     * Gets the spellCheck value for this WSWhereCondition.
     * 
     * @return spellCheck
     */
    public boolean isSpellCheck() {
        return spellCheck;
    }


    /**
     * Sets the spellCheck value for this WSWhereCondition.
     * 
     * @param spellCheck
     */
    public void setSpellCheck(boolean spellCheck) {
        this.spellCheck = spellCheck;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSWhereCondition)) return false;
        WSWhereCondition other = (WSWhereCondition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.leftPath==null && other.getLeftPath()==null) || 
             (this.leftPath!=null &&
              this.leftPath.equals(other.getLeftPath()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.rightValueOrPath==null && other.getRightValueOrPath()==null) || 
             (this.rightValueOrPath!=null &&
              this.rightValueOrPath.equals(other.getRightValueOrPath()))) &&
            ((this.stringPredicate==null && other.getStringPredicate()==null) || 
             (this.stringPredicate!=null &&
              this.stringPredicate.equals(other.getStringPredicate()))) &&
            this.spellCheck == other.isSpellCheck();
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
        if (getLeftPath() != null) {
            _hashCode += getLeftPath().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getRightValueOrPath() != null) {
            _hashCode += getRightValueOrPath().hashCode();
        }
        if (getStringPredicate() != null) {
            _hashCode += getStringPredicate().hashCode();
        }
        _hashCode += (isSpellCheck() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSWhereCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leftPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereOperator"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightValueOrPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rightValueOrPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringPredicate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stringPredicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringPredicate"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spellCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spellCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
