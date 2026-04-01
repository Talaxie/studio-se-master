/**
 * WSSynchronizationPlanAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationPlanAction  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSSynchronizationPlanPK wsSynchronizationPlanPK;

    private org.talend.mdm.webservice.WSSynchronizationPlanActionCode wsAction;

    public WSSynchronizationPlanAction() {
    }

    public WSSynchronizationPlanAction(
           org.talend.mdm.webservice.WSSynchronizationPlanPK wsSynchronizationPlanPK,
           org.talend.mdm.webservice.WSSynchronizationPlanActionCode wsAction) {
           this.wsSynchronizationPlanPK = wsSynchronizationPlanPK;
           this.wsAction = wsAction;
    }


    /**
     * Gets the wsSynchronizationPlanPK value for this WSSynchronizationPlanAction.
     * 
     * @return wsSynchronizationPlanPK
     */
    public org.talend.mdm.webservice.WSSynchronizationPlanPK getWsSynchronizationPlanPK() {
        return wsSynchronizationPlanPK;
    }


    /**
     * Sets the wsSynchronizationPlanPK value for this WSSynchronizationPlanAction.
     * 
     * @param wsSynchronizationPlanPK
     */
    public void setWsSynchronizationPlanPK(org.talend.mdm.webservice.WSSynchronizationPlanPK wsSynchronizationPlanPK) {
        this.wsSynchronizationPlanPK = wsSynchronizationPlanPK;
    }


    /**
     * Gets the wsAction value for this WSSynchronizationPlanAction.
     * 
     * @return wsAction
     */
    public org.talend.mdm.webservice.WSSynchronizationPlanActionCode getWsAction() {
        return wsAction;
    }


    /**
     * Sets the wsAction value for this WSSynchronizationPlanAction.
     * 
     * @param wsAction
     */
    public void setWsAction(org.talend.mdm.webservice.WSSynchronizationPlanActionCode wsAction) {
        this.wsAction = wsAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationPlanAction)) return false;
        WSSynchronizationPlanAction other = (WSSynchronizationPlanAction) obj;
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
              this.wsSynchronizationPlanPK.equals(other.getWsSynchronizationPlanPK()))) &&
            ((this.wsAction==null && other.getWsAction()==null) || 
             (this.wsAction!=null &&
              this.wsAction.equals(other.getWsAction())));
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
        if (getWsAction() != null) {
            _hashCode += getWsAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSynchronizationPlanAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSynchronizationPlanPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsSynchronizationPlanPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanActionCode"));
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
