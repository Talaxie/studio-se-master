/**
 * WSDeleteSynchronizationPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSDeleteSynchronizationPlan  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSSynchronizationPlanPK wsSynchronizationPlanPK;

    public WSDeleteSynchronizationPlan() {
    }

    public WSDeleteSynchronizationPlan(
           org.talend.mdm.webservice.WSSynchronizationPlanPK wsSynchronizationPlanPK) {
           this.wsSynchronizationPlanPK = wsSynchronizationPlanPK;
    }


    /**
     * Gets the wsSynchronizationPlanPK value for this WSDeleteSynchronizationPlan.
     * 
     * @return wsSynchronizationPlanPK
     */
    public org.talend.mdm.webservice.WSSynchronizationPlanPK getWsSynchronizationPlanPK() {
        return wsSynchronizationPlanPK;
    }


    /**
     * Sets the wsSynchronizationPlanPK value for this WSDeleteSynchronizationPlan.
     * 
     * @param wsSynchronizationPlanPK
     */
    public void setWsSynchronizationPlanPK(org.talend.mdm.webservice.WSSynchronizationPlanPK wsSynchronizationPlanPK) {
        this.wsSynchronizationPlanPK = wsSynchronizationPlanPK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDeleteSynchronizationPlan)) return false;
        WSDeleteSynchronizationPlan other = (WSDeleteSynchronizationPlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsSynchronizationPlanPK==null && other.getWsSynchronizationPlanPK()==null) || 
             (this.wsSynchronizationPlanPK!=null &&
              this.wsSynchronizationPlanPK.equals(other.getWsSynchronizationPlanPK())));
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
        if (getWsSynchronizationPlanPK() != null) {
            _hashCode += getWsSynchronizationPlanPK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSDeleteSynchronizationPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteSynchronizationPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSynchronizationPlanPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsSynchronizationPlanPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanPK"));
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
