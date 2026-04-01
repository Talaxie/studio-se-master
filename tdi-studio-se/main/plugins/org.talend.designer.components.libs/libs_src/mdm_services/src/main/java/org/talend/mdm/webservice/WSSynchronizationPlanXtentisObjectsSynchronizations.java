/**
 * WSSynchronizationPlanXtentisObjectsSynchronizations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationPlanXtentisObjectsSynchronizations  implements java.io.Serializable {
    private java.lang.String xtentisObjectName;

    private org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations[] synchronizations;

    public WSSynchronizationPlanXtentisObjectsSynchronizations() {
    }

    public WSSynchronizationPlanXtentisObjectsSynchronizations(
           java.lang.String xtentisObjectName,
           org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations[] synchronizations) {
           this.xtentisObjectName = xtentisObjectName;
           this.synchronizations = synchronizations;
    }


    /**
     * Gets the xtentisObjectName value for this WSSynchronizationPlanXtentisObjectsSynchronizations.
     * 
     * @return xtentisObjectName
     */
    public java.lang.String getXtentisObjectName() {
        return xtentisObjectName;
    }


    /**
     * Sets the xtentisObjectName value for this WSSynchronizationPlanXtentisObjectsSynchronizations.
     * 
     * @param xtentisObjectName
     */
    public void setXtentisObjectName(java.lang.String xtentisObjectName) {
        this.xtentisObjectName = xtentisObjectName;
    }


    /**
     * Gets the synchronizations value for this WSSynchronizationPlanXtentisObjectsSynchronizations.
     * 
     * @return synchronizations
     */
    public org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations[] getSynchronizations() {
        return synchronizations;
    }


    /**
     * Sets the synchronizations value for this WSSynchronizationPlanXtentisObjectsSynchronizations.
     * 
     * @param synchronizations
     */
    public void setSynchronizations(org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations[] synchronizations) {
        this.synchronizations = synchronizations;
    }

    public org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations getSynchronizations(int i) {
        return this.synchronizations[i];
    }

    public void setSynchronizations(int i, org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations _value) {
        this.synchronizations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationPlanXtentisObjectsSynchronizations)) return false;
        WSSynchronizationPlanXtentisObjectsSynchronizations other = (WSSynchronizationPlanXtentisObjectsSynchronizations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xtentisObjectName==null && other.getXtentisObjectName()==null) || 
             (this.xtentisObjectName!=null &&
              this.xtentisObjectName.equals(other.getXtentisObjectName()))) &&
            ((this.synchronizations==null && other.getSynchronizations()==null) || 
             (this.synchronizations!=null &&
              java.util.Arrays.equals(this.synchronizations, other.getSynchronizations())));
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
        if (getXtentisObjectName() != null) {
            _hashCode += getXtentisObjectName().hashCode();
        }
        if (getSynchronizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSynchronizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSynchronizations(), i);
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
        new org.apache.axis.description.TypeDesc(WSSynchronizationPlanXtentisObjectsSynchronizations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSSynchronizationPlan>xtentisObjectsSynchronizations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xtentisObjectName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xtentisObjectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synchronizations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "synchronizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">>WSSynchronizationPlan>xtentisObjectsSynchronizations>synchronizations"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
