/**
 * WSSynchronizationGetUnsynchronizedObjectsIDs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationGetUnsynchronizedObjectsIDs  implements java.io.Serializable {
    private java.lang.String revisionID;

    private java.lang.String objectName;

    private java.lang.String instancePattern;

    private java.lang.String synchronizationPlanName;

    public WSSynchronizationGetUnsynchronizedObjectsIDs() {
    }

    public WSSynchronizationGetUnsynchronizedObjectsIDs(
           java.lang.String revisionID,
           java.lang.String objectName,
           java.lang.String instancePattern,
           java.lang.String synchronizationPlanName) {
           this.revisionID = revisionID;
           this.objectName = objectName;
           this.instancePattern = instancePattern;
           this.synchronizationPlanName = synchronizationPlanName;
    }


    /**
     * Gets the revisionID value for this WSSynchronizationGetUnsynchronizedObjectsIDs.
     * 
     * @return revisionID
     */
    public java.lang.String getRevisionID() {
        return revisionID;
    }


    /**
     * Sets the revisionID value for this WSSynchronizationGetUnsynchronizedObjectsIDs.
     * 
     * @param revisionID
     */
    public void setRevisionID(java.lang.String revisionID) {
        this.revisionID = revisionID;
    }


    /**
     * Gets the objectName value for this WSSynchronizationGetUnsynchronizedObjectsIDs.
     * 
     * @return objectName
     */
    public java.lang.String getObjectName() {
        return objectName;
    }


    /**
     * Sets the objectName value for this WSSynchronizationGetUnsynchronizedObjectsIDs.
     * 
     * @param objectName
     */
    public void setObjectName(java.lang.String objectName) {
        this.objectName = objectName;
    }


    /**
     * Gets the instancePattern value for this WSSynchronizationGetUnsynchronizedObjectsIDs.
     * 
     * @return instancePattern
     */
    public java.lang.String getInstancePattern() {
        return instancePattern;
    }


    /**
     * Sets the instancePattern value for this WSSynchronizationGetUnsynchronizedObjectsIDs.
     * 
     * @param instancePattern
     */
    public void setInstancePattern(java.lang.String instancePattern) {
        this.instancePattern = instancePattern;
    }


    /**
     * Gets the synchronizationPlanName value for this WSSynchronizationGetUnsynchronizedObjectsIDs.
     * 
     * @return synchronizationPlanName
     */
    public java.lang.String getSynchronizationPlanName() {
        return synchronizationPlanName;
    }


    /**
     * Sets the synchronizationPlanName value for this WSSynchronizationGetUnsynchronizedObjectsIDs.
     * 
     * @param synchronizationPlanName
     */
    public void setSynchronizationPlanName(java.lang.String synchronizationPlanName) {
        this.synchronizationPlanName = synchronizationPlanName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationGetUnsynchronizedObjectsIDs)) return false;
        WSSynchronizationGetUnsynchronizedObjectsIDs other = (WSSynchronizationGetUnsynchronizedObjectsIDs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.revisionID==null && other.getRevisionID()==null) || 
             (this.revisionID!=null &&
              this.revisionID.equals(other.getRevisionID()))) &&
            ((this.objectName==null && other.getObjectName()==null) || 
             (this.objectName!=null &&
              this.objectName.equals(other.getObjectName()))) &&
            ((this.instancePattern==null && other.getInstancePattern()==null) || 
             (this.instancePattern!=null &&
              this.instancePattern.equals(other.getInstancePattern()))) &&
            ((this.synchronizationPlanName==null && other.getSynchronizationPlanName()==null) || 
             (this.synchronizationPlanName!=null &&
              this.synchronizationPlanName.equals(other.getSynchronizationPlanName())));
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
        if (getRevisionID() != null) {
            _hashCode += getRevisionID().hashCode();
        }
        if (getObjectName() != null) {
            _hashCode += getObjectName().hashCode();
        }
        if (getInstancePattern() != null) {
            _hashCode += getInstancePattern().hashCode();
        }
        if (getSynchronizationPlanName() != null) {
            _hashCode += getSynchronizationPlanName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSynchronizationGetUnsynchronizedObjectsIDs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetUnsynchronizedObjectsIDs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancePattern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instancePattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synchronizationPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "synchronizationPlanName"));
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
