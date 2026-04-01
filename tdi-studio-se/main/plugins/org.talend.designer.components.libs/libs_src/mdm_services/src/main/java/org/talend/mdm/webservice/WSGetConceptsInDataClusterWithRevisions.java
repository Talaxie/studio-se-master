/**
 * WSGetConceptsInDataClusterWithRevisions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSGetConceptsInDataClusterWithRevisions  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSDataClusterPK dataClusterPOJOPK;

    private org.talend.mdm.webservice.WSUniversePK universePK;

    public WSGetConceptsInDataClusterWithRevisions() {
    }

    public WSGetConceptsInDataClusterWithRevisions(
           org.talend.mdm.webservice.WSDataClusterPK dataClusterPOJOPK,
           org.talend.mdm.webservice.WSUniversePK universePK) {
           this.dataClusterPOJOPK = dataClusterPOJOPK;
           this.universePK = universePK;
    }


    /**
     * Gets the dataClusterPOJOPK value for this WSGetConceptsInDataClusterWithRevisions.
     * 
     * @return dataClusterPOJOPK
     */
    public org.talend.mdm.webservice.WSDataClusterPK getDataClusterPOJOPK() {
        return dataClusterPOJOPK;
    }


    /**
     * Sets the dataClusterPOJOPK value for this WSGetConceptsInDataClusterWithRevisions.
     * 
     * @param dataClusterPOJOPK
     */
    public void setDataClusterPOJOPK(org.talend.mdm.webservice.WSDataClusterPK dataClusterPOJOPK) {
        this.dataClusterPOJOPK = dataClusterPOJOPK;
    }


    /**
     * Gets the universePK value for this WSGetConceptsInDataClusterWithRevisions.
     * 
     * @return universePK
     */
    public org.talend.mdm.webservice.WSUniversePK getUniversePK() {
        return universePK;
    }


    /**
     * Sets the universePK value for this WSGetConceptsInDataClusterWithRevisions.
     * 
     * @param universePK
     */
    public void setUniversePK(org.talend.mdm.webservice.WSUniversePK universePK) {
        this.universePK = universePK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGetConceptsInDataClusterWithRevisions)) return false;
        WSGetConceptsInDataClusterWithRevisions other = (WSGetConceptsInDataClusterWithRevisions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataClusterPOJOPK==null && other.getDataClusterPOJOPK()==null) || 
             (this.dataClusterPOJOPK!=null &&
              this.dataClusterPOJOPK.equals(other.getDataClusterPOJOPK()))) &&
            ((this.universePK==null && other.getUniversePK()==null) || 
             (this.universePK!=null &&
              this.universePK.equals(other.getUniversePK())));
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
        if (getDataClusterPOJOPK() != null) {
            _hashCode += getDataClusterPOJOPK().hashCode();
        }
        if (getUniversePK() != null) {
            _hashCode += getUniversePK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGetConceptsInDataClusterWithRevisions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetConceptsInDataClusterWithRevisions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataClusterPOJOPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataClusterPOJOPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("universePK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "universePK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePK"));
        elemField.setNillable(true);
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
