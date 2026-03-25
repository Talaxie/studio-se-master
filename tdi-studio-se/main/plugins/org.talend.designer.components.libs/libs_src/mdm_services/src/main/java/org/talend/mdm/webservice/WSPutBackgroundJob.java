/**
 * WSPutBackgroundJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSPutBackgroundJob  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSBackgroundJob wsBackgroundJob;

    public WSPutBackgroundJob() {
    }

    public WSPutBackgroundJob(
           org.talend.mdm.webservice.WSBackgroundJob wsBackgroundJob) {
           this.wsBackgroundJob = wsBackgroundJob;
    }


    /**
     * Gets the wsBackgroundJob value for this WSPutBackgroundJob.
     * 
     * @return wsBackgroundJob
     */
    public org.talend.mdm.webservice.WSBackgroundJob getWsBackgroundJob() {
        return wsBackgroundJob;
    }


    /**
     * Sets the wsBackgroundJob value for this WSPutBackgroundJob.
     * 
     * @param wsBackgroundJob
     */
    public void setWsBackgroundJob(org.talend.mdm.webservice.WSBackgroundJob wsBackgroundJob) {
        this.wsBackgroundJob = wsBackgroundJob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutBackgroundJob)) return false;
        WSPutBackgroundJob other = (WSPutBackgroundJob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsBackgroundJob==null && other.getWsBackgroundJob()==null) || 
             (this.wsBackgroundJob!=null &&
              this.wsBackgroundJob.equals(other.getWsBackgroundJob())));
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
        if (getWsBackgroundJob() != null) {
            _hashCode += getWsBackgroundJob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutBackgroundJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutBackgroundJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsBackgroundJob");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsBackgroundJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJob"));
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
