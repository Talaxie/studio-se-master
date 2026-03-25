/**
 * WSSynchronizationGetUnsynchronizedItemPKs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationGetUnsynchronizedItemPKs  implements java.io.Serializable {
    private java.lang.String revisionID;

    private org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPOJOPK;

    private java.lang.String conceptName;

    private java.lang.String instancePattern;

    private java.lang.String synchronizationPlanName;

    private int start;

    private int limit;

    public WSSynchronizationGetUnsynchronizedItemPKs() {
    }

    public WSSynchronizationGetUnsynchronizedItemPKs(
           java.lang.String revisionID,
           org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPOJOPK,
           java.lang.String conceptName,
           java.lang.String instancePattern,
           java.lang.String synchronizationPlanName,
           int start,
           int limit) {
           this.revisionID = revisionID;
           this.wsDataClusterPOJOPK = wsDataClusterPOJOPK;
           this.conceptName = conceptName;
           this.instancePattern = instancePattern;
           this.synchronizationPlanName = synchronizationPlanName;
           this.start = start;
           this.limit = limit;
    }


    /**
     * Gets the revisionID value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @return revisionID
     */
    public java.lang.String getRevisionID() {
        return revisionID;
    }


    /**
     * Sets the revisionID value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @param revisionID
     */
    public void setRevisionID(java.lang.String revisionID) {
        this.revisionID = revisionID;
    }


    /**
     * Gets the wsDataClusterPOJOPK value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @return wsDataClusterPOJOPK
     */
    public org.talend.mdm.webservice.WSDataClusterPK getWsDataClusterPOJOPK() {
        return wsDataClusterPOJOPK;
    }


    /**
     * Sets the wsDataClusterPOJOPK value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @param wsDataClusterPOJOPK
     */
    public void setWsDataClusterPOJOPK(org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPOJOPK) {
        this.wsDataClusterPOJOPK = wsDataClusterPOJOPK;
    }


    /**
     * Gets the conceptName value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @return conceptName
     */
    public java.lang.String getConceptName() {
        return conceptName;
    }


    /**
     * Sets the conceptName value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @param conceptName
     */
    public void setConceptName(java.lang.String conceptName) {
        this.conceptName = conceptName;
    }


    /**
     * Gets the instancePattern value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @return instancePattern
     */
    public java.lang.String getInstancePattern() {
        return instancePattern;
    }


    /**
     * Sets the instancePattern value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @param instancePattern
     */
    public void setInstancePattern(java.lang.String instancePattern) {
        this.instancePattern = instancePattern;
    }


    /**
     * Gets the synchronizationPlanName value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @return synchronizationPlanName
     */
    public java.lang.String getSynchronizationPlanName() {
        return synchronizationPlanName;
    }


    /**
     * Sets the synchronizationPlanName value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @param synchronizationPlanName
     */
    public void setSynchronizationPlanName(java.lang.String synchronizationPlanName) {
        this.synchronizationPlanName = synchronizationPlanName;
    }


    /**
     * Gets the start value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @return start
     */
    public int getStart() {
        return start;
    }


    /**
     * Sets the start value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @param start
     */
    public void setStart(int start) {
        this.start = start;
    }


    /**
     * Gets the limit value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @return limit
     */
    public int getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this WSSynchronizationGetUnsynchronizedItemPKs.
     * 
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationGetUnsynchronizedItemPKs)) return false;
        WSSynchronizationGetUnsynchronizedItemPKs other = (WSSynchronizationGetUnsynchronizedItemPKs) obj;
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
            ((this.wsDataClusterPOJOPK==null && other.getWsDataClusterPOJOPK()==null) || 
             (this.wsDataClusterPOJOPK!=null &&
              this.wsDataClusterPOJOPK.equals(other.getWsDataClusterPOJOPK()))) &&
            ((this.conceptName==null && other.getConceptName()==null) || 
             (this.conceptName!=null &&
              this.conceptName.equals(other.getConceptName()))) &&
            ((this.instancePattern==null && other.getInstancePattern()==null) || 
             (this.instancePattern!=null &&
              this.instancePattern.equals(other.getInstancePattern()))) &&
            ((this.synchronizationPlanName==null && other.getSynchronizationPlanName()==null) || 
             (this.synchronizationPlanName!=null &&
              this.synchronizationPlanName.equals(other.getSynchronizationPlanName()))) &&
            this.start == other.getStart() &&
            this.limit == other.getLimit();
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
        if (getWsDataClusterPOJOPK() != null) {
            _hashCode += getWsDataClusterPOJOPK().hashCode();
        }
        if (getConceptName() != null) {
            _hashCode += getConceptName().hashCode();
        }
        if (getInstancePattern() != null) {
            _hashCode += getInstancePattern().hashCode();
        }
        if (getSynchronizationPlanName() != null) {
            _hashCode += getSynchronizationPlanName().hashCode();
        }
        _hashCode += getStart();
        _hashCode += getLimit();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSynchronizationGetUnsynchronizedItemPKs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetUnsynchronizedItemPKs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataClusterPOJOPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataClusterPOJOPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conceptName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conceptName"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
