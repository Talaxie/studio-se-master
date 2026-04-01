/**
 * WSPutSynchronizationPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSPutSynchronizationPlan  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSSynchronizationPlan wsSynchronizationPlan;

    public WSPutSynchronizationPlan() {
    }

    public WSPutSynchronizationPlan(
           org.talend.mdm.webservice.WSSynchronizationPlan wsSynchronizationPlan) {
           this.wsSynchronizationPlan = wsSynchronizationPlan;
    }


    /**
     * Gets the wsSynchronizationPlan value for this WSPutSynchronizationPlan.
     * 
     * @return wsSynchronizationPlan
     */
    public org.talend.mdm.webservice.WSSynchronizationPlan getWsSynchronizationPlan() {
        return wsSynchronizationPlan;
    }


    /**
     * Sets the wsSynchronizationPlan value for this WSPutSynchronizationPlan.
     * 
     * @param wsSynchronizationPlan
     */
    public void setWsSynchronizationPlan(org.talend.mdm.webservice.WSSynchronizationPlan wsSynchronizationPlan) {
        this.wsSynchronizationPlan = wsSynchronizationPlan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutSynchronizationPlan)) return false;
        WSPutSynchronizationPlan other = (WSPutSynchronizationPlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsSynchronizationPlan==null && other.getWsSynchronizationPlan()==null) || 
             (this.wsSynchronizationPlan!=null &&
              this.wsSynchronizationPlan.equals(other.getWsSynchronizationPlan())));
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
        if (getWsSynchronizationPlan() != null) {
            _hashCode += getWsSynchronizationPlan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutSynchronizationPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutSynchronizationPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSynchronizationPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsSynchronizationPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlan"));
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
