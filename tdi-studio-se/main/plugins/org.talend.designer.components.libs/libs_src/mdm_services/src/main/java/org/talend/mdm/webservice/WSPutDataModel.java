/**
 * WSPutDataModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Creates - updates a data model
 */
public class WSPutDataModel  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSDataModel wsDataModel;

    public WSPutDataModel() {
    }

    public WSPutDataModel(
           org.talend.mdm.webservice.WSDataModel wsDataModel) {
           this.wsDataModel = wsDataModel;
    }


    /**
     * Gets the wsDataModel value for this WSPutDataModel.
     * 
     * @return wsDataModel
     */
    public org.talend.mdm.webservice.WSDataModel getWsDataModel() {
        return wsDataModel;
    }


    /**
     * Sets the wsDataModel value for this WSPutDataModel.
     * 
     * @param wsDataModel
     */
    public void setWsDataModel(org.talend.mdm.webservice.WSDataModel wsDataModel) {
        this.wsDataModel = wsDataModel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutDataModel)) return false;
        WSPutDataModel other = (WSPutDataModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsDataModel==null && other.getWsDataModel()==null) || 
             (this.wsDataModel!=null &&
              this.wsDataModel.equals(other.getWsDataModel())));
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
        if (getWsDataModel() != null) {
            _hashCode += getWsDataModel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutDataModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutDataModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModel"));
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
