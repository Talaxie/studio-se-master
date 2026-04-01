/**
 * WSSynchronizationPlanItemsSynchronizations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationPlanItemsSynchronizations  implements java.io.Serializable {
    private java.lang.String conceptName;

    private java.lang.String idsPattern;

    private java.lang.String localCluster;

    private java.lang.String localRevisionID;

    private java.lang.String remoteCluster;

    private java.lang.String remoteRevisionID;

    private java.lang.String algorithm;

    public WSSynchronizationPlanItemsSynchronizations() {
    }

    public WSSynchronizationPlanItemsSynchronizations(
           java.lang.String conceptName,
           java.lang.String idsPattern,
           java.lang.String localCluster,
           java.lang.String localRevisionID,
           java.lang.String remoteCluster,
           java.lang.String remoteRevisionID,
           java.lang.String algorithm) {
           this.conceptName = conceptName;
           this.idsPattern = idsPattern;
           this.localCluster = localCluster;
           this.localRevisionID = localRevisionID;
           this.remoteCluster = remoteCluster;
           this.remoteRevisionID = remoteRevisionID;
           this.algorithm = algorithm;
    }


    /**
     * Gets the conceptName value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @return conceptName
     */
    public java.lang.String getConceptName() {
        return conceptName;
    }


    /**
     * Sets the conceptName value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @param conceptName
     */
    public void setConceptName(java.lang.String conceptName) {
        this.conceptName = conceptName;
    }


    /**
     * Gets the idsPattern value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @return idsPattern
     */
    public java.lang.String getIdsPattern() {
        return idsPattern;
    }


    /**
     * Sets the idsPattern value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @param idsPattern
     */
    public void setIdsPattern(java.lang.String idsPattern) {
        this.idsPattern = idsPattern;
    }


    /**
     * Gets the localCluster value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @return localCluster
     */
    public java.lang.String getLocalCluster() {
        return localCluster;
    }


    /**
     * Sets the localCluster value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @param localCluster
     */
    public void setLocalCluster(java.lang.String localCluster) {
        this.localCluster = localCluster;
    }


    /**
     * Gets the localRevisionID value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @return localRevisionID
     */
    public java.lang.String getLocalRevisionID() {
        return localRevisionID;
    }


    /**
     * Sets the localRevisionID value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @param localRevisionID
     */
    public void setLocalRevisionID(java.lang.String localRevisionID) {
        this.localRevisionID = localRevisionID;
    }


    /**
     * Gets the remoteCluster value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @return remoteCluster
     */
    public java.lang.String getRemoteCluster() {
        return remoteCluster;
    }


    /**
     * Sets the remoteCluster value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @param remoteCluster
     */
    public void setRemoteCluster(java.lang.String remoteCluster) {
        this.remoteCluster = remoteCluster;
    }


    /**
     * Gets the remoteRevisionID value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @return remoteRevisionID
     */
    public java.lang.String getRemoteRevisionID() {
        return remoteRevisionID;
    }


    /**
     * Sets the remoteRevisionID value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @param remoteRevisionID
     */
    public void setRemoteRevisionID(java.lang.String remoteRevisionID) {
        this.remoteRevisionID = remoteRevisionID;
    }


    /**
     * Gets the algorithm value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @return algorithm
     */
    public java.lang.String getAlgorithm() {
        return algorithm;
    }


    /**
     * Sets the algorithm value for this WSSynchronizationPlanItemsSynchronizations.
     * 
     * @param algorithm
     */
    public void setAlgorithm(java.lang.String algorithm) {
        this.algorithm = algorithm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationPlanItemsSynchronizations)) return false;
        WSSynchronizationPlanItemsSynchronizations other = (WSSynchronizationPlanItemsSynchronizations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conceptName==null && other.getConceptName()==null) || 
             (this.conceptName!=null &&
              this.conceptName.equals(other.getConceptName()))) &&
            ((this.idsPattern==null && other.getIdsPattern()==null) || 
             (this.idsPattern!=null &&
              this.idsPattern.equals(other.getIdsPattern()))) &&
            ((this.localCluster==null && other.getLocalCluster()==null) || 
             (this.localCluster!=null &&
              this.localCluster.equals(other.getLocalCluster()))) &&
            ((this.localRevisionID==null && other.getLocalRevisionID()==null) || 
             (this.localRevisionID!=null &&
              this.localRevisionID.equals(other.getLocalRevisionID()))) &&
            ((this.remoteCluster==null && other.getRemoteCluster()==null) || 
             (this.remoteCluster!=null &&
              this.remoteCluster.equals(other.getRemoteCluster()))) &&
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
        if (getConceptName() != null) {
            _hashCode += getConceptName().hashCode();
        }
        if (getIdsPattern() != null) {
            _hashCode += getIdsPattern().hashCode();
        }
        if (getLocalCluster() != null) {
            _hashCode += getLocalCluster().hashCode();
        }
        if (getLocalRevisionID() != null) {
            _hashCode += getLocalRevisionID().hashCode();
        }
        if (getRemoteCluster() != null) {
            _hashCode += getRemoteCluster().hashCode();
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
        new org.apache.axis.description.TypeDesc(WSSynchronizationPlanItemsSynchronizations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSSynchronizationPlan>itemsSynchronizations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conceptName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conceptName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idsPattern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idsPattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localCluster"));
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
        elemField.setFieldName("remoteCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
