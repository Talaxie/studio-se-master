/**
 * WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations  implements java.io.Serializable {
    private java.lang.String instancePattern;

    private java.lang.String localRevisionID;

    private java.lang.String remoteRevisionID;

    private java.lang.String algorithm;

    public WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations() {
    }

    public WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations(
           java.lang.String instancePattern,
           java.lang.String localRevisionID,
           java.lang.String remoteRevisionID,
           java.lang.String algorithm) {
           this.instancePattern = instancePattern;
           this.localRevisionID = localRevisionID;
           this.remoteRevisionID = remoteRevisionID;
           this.algorithm = algorithm;
    }


    /**
     * Gets the instancePattern value for this WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations.
     * 
     * @return instancePattern
     */
    public java.lang.String getInstancePattern() {
        return instancePattern;
    }


    /**
     * Sets the instancePattern value for this WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations.
     * 
     * @param instancePattern
     */
    public void setInstancePattern(java.lang.String instancePattern) {
        this.instancePattern = instancePattern;
    }


    /**
     * Gets the localRevisionID value for this WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations.
     * 
     * @return localRevisionID
     */
    public java.lang.String getLocalRevisionID() {
        return localRevisionID;
    }


    /**
     * Sets the localRevisionID value for this WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations.
     * 
     * @param localRevisionID
     */
    public void setLocalRevisionID(java.lang.String localRevisionID) {
        this.localRevisionID = localRevisionID;
    }


    /**
     * Gets the remoteRevisionID value for this WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations.
     * 
     * @return remoteRevisionID
     */
    public java.lang.String getRemoteRevisionID() {
        return remoteRevisionID;
    }


    /**
     * Sets the remoteRevisionID value for this WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations.
     * 
     * @param remoteRevisionID
     */
    public void setRemoteRevisionID(java.lang.String remoteRevisionID) {
        this.remoteRevisionID = remoteRevisionID;
    }


    /**
     * Gets the algorithm value for this WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations.
     * 
     * @return algorithm
     */
    public java.lang.String getAlgorithm() {
        return algorithm;
    }


    /**
     * Sets the algorithm value for this WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations.
     * 
     * @param algorithm
     */
    public void setAlgorithm(java.lang.String algorithm) {
        this.algorithm = algorithm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations)) return false;
        WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations other = (WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instancePattern==null && other.getInstancePattern()==null) || 
             (this.instancePattern!=null &&
              this.instancePattern.equals(other.getInstancePattern()))) &&
            ((this.localRevisionID==null && other.getLocalRevisionID()==null) || 
             (this.localRevisionID!=null &&
              this.localRevisionID.equals(other.getLocalRevisionID()))) &&
            ((this.remoteRevisionID==null && other.getRemoteRevisionID()==null) || 
             (this.remoteRevisionID!=null &&
              this.remoteRevisionID.equals(other.getRemoteRevisionID()))) &&
            ((this.algorithm==null && other.getAlgorithm()==null) || 
             (this.algorithm!=null &&
              this.algorithm.equals(other.getAlgorithm())));
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
        if (getInstancePattern() != null) {
            _hashCode += getInstancePattern().hashCode();
        }
        if (getLocalRevisionID() != null) {
            _hashCode += getLocalRevisionID().hashCode();
        }
        if (getRemoteRevisionID() != null) {
            _hashCode += getRemoteRevisionID().hashCode();
        }
        if (getAlgorithm() != null) {
            _hashCode += getAlgorithm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">>WSSynchronizationPlan>xtentisObjectsSynchronizations>synchronizations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancePattern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instancePattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localRevisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localRevisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteRevisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteRevisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("algorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "algorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
