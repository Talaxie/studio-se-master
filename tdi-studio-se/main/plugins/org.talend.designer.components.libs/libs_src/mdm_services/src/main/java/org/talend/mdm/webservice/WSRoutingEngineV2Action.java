/**
 * WSRoutingEngineV2Action.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSRoutingEngineV2Action  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSRoutingEngineV2ActionCode wsAction;

    public WSRoutingEngineV2Action() {
    }

    public WSRoutingEngineV2Action(
           org.talend.mdm.webservice.WSRoutingEngineV2ActionCode wsAction) {
           this.wsAction = wsAction;
    }


    /**
     * Gets the wsAction value for this WSRoutingEngineV2Action.
     * 
     * @return wsAction
     */
    public org.talend.mdm.webservice.WSRoutingEngineV2ActionCode getWsAction() {
        return wsAction;
    }


    /**
     * Sets the wsAction value for this WSRoutingEngineV2Action.
     * 
     * @param wsAction
     */
    public void setWsAction(org.talend.mdm.webservice.WSRoutingEngineV2ActionCode wsAction) {
        this.wsAction = wsAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRoutingEngineV2Action)) return false;
        WSRoutingEngineV2Action other = (WSRoutingEngineV2Action) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        if (getWsAction() != null) {
            _hashCode += getWsAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSRoutingEngineV2Action.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingEngineV2Action"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingEngineV2ActionCode"));
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
