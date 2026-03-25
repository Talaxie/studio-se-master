/**
 * WSRoutingOrderV2SearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSRoutingOrderV2SearchCriteria  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSRoutingOrderV2Status status;

    private java.lang.String anyFieldContains;

    private java.lang.String nameContains;

    private long timeCreatedMin;

    private long timeCreatedMax;

    private long timeScheduledMin;

    private long timeScheduledMax;

    private long timeLastRunStartedMin;

    private long timeLastRunStartedMax;

    private long timeLastRunCompletedMin;

    private long timeLastRunCompletedMax;

    private java.lang.String itemPKConceptContains;

    private java.lang.String itemPKIDFieldsContain;

    private java.lang.String serviceJNDIContains;

    private java.lang.String serviceParametersContain;

    private java.lang.String messageContain;

    public WSRoutingOrderV2SearchCriteria() {
    }

    public WSRoutingOrderV2SearchCriteria(
           org.talend.mdm.webservice.WSRoutingOrderV2Status status,
           java.lang.String anyFieldContains,
           java.lang.String nameContains,
           long timeCreatedMin,
           long timeCreatedMax,
           long timeScheduledMin,
           long timeScheduledMax,
           long timeLastRunStartedMin,
           long timeLastRunStartedMax,
           long timeLastRunCompletedMin,
           long timeLastRunCompletedMax,
           java.lang.String itemPKConceptContains,
           java.lang.String itemPKIDFieldsContain,
           java.lang.String serviceJNDIContains,
           java.lang.String serviceParametersContain,
           java.lang.String messageContain) {
           this.status = status;
           this.anyFieldContains = anyFieldContains;
           this.nameContains = nameContains;
           this.timeCreatedMin = timeCreatedMin;
           this.timeCreatedMax = timeCreatedMax;
           this.timeScheduledMin = timeScheduledMin;
           this.timeScheduledMax = timeScheduledMax;
           this.timeLastRunStartedMin = timeLastRunStartedMin;
           this.timeLastRunStartedMax = timeLastRunStartedMax;
           this.timeLastRunCompletedMin = timeLastRunCompletedMin;
           this.timeLastRunCompletedMax = timeLastRunCompletedMax;
           this.itemPKConceptContains = itemPKConceptContains;
           this.itemPKIDFieldsContain = itemPKIDFieldsContain;
           this.serviceJNDIContains = serviceJNDIContains;
           this.serviceParametersContain = serviceParametersContain;
           this.messageContain = messageContain;
    }


    /**
     * Gets the status value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return status
     */
    public org.talend.mdm.webservice.WSRoutingOrderV2Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param status
     */
    public void setStatus(org.talend.mdm.webservice.WSRoutingOrderV2Status status) {
        this.status = status;
    }


    /**
     * Gets the anyFieldContains value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return anyFieldContains
     */
    public java.lang.String getAnyFieldContains() {
        return anyFieldContains;
    }


    /**
     * Sets the anyFieldContains value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param anyFieldContains
     */
    public void setAnyFieldContains(java.lang.String anyFieldContains) {
        this.anyFieldContains = anyFieldContains;
    }


    /**
     * Gets the nameContains value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return nameContains
     */
    public java.lang.String getNameContains() {
        return nameContains;
    }


    /**
     * Sets the nameContains value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param nameContains
     */
    public void setNameContains(java.lang.String nameContains) {
        this.nameContains = nameContains;
    }


    /**
     * Gets the timeCreatedMin value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return timeCreatedMin
     */
    public long getTimeCreatedMin() {
        return timeCreatedMin;
    }


    /**
     * Sets the timeCreatedMin value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param timeCreatedMin
     */
    public void setTimeCreatedMin(long timeCreatedMin) {
        this.timeCreatedMin = timeCreatedMin;
    }


    /**
     * Gets the timeCreatedMax value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return timeCreatedMax
     */
    public long getTimeCreatedMax() {
        return timeCreatedMax;
    }


    /**
     * Sets the timeCreatedMax value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param timeCreatedMax
     */
    public void setTimeCreatedMax(long timeCreatedMax) {
        this.timeCreatedMax = timeCreatedMax;
    }


    /**
     * Gets the timeScheduledMin value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return timeScheduledMin
     */
    public long getTimeScheduledMin() {
        return timeScheduledMin;
    }


    /**
     * Sets the timeScheduledMin value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param timeScheduledMin
     */
    public void setTimeScheduledMin(long timeScheduledMin) {
        this.timeScheduledMin = timeScheduledMin;
    }


    /**
     * Gets the timeScheduledMax value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return timeScheduledMax
     */
    public long getTimeScheduledMax() {
        return timeScheduledMax;
    }


    /**
     * Sets the timeScheduledMax value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param timeScheduledMax
     */
    public void setTimeScheduledMax(long timeScheduledMax) {
        this.timeScheduledMax = timeScheduledMax;
    }


    /**
     * Gets the timeLastRunStartedMin value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return timeLastRunStartedMin
     */
    public long getTimeLastRunStartedMin() {
        return timeLastRunStartedMin;
    }


    /**
     * Sets the timeLastRunStartedMin value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param timeLastRunStartedMin
     */
    public void setTimeLastRunStartedMin(long timeLastRunStartedMin) {
        this.timeLastRunStartedMin = timeLastRunStartedMin;
    }


    /**
     * Gets the timeLastRunStartedMax value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return timeLastRunStartedMax
     */
    public long getTimeLastRunStartedMax() {
        return timeLastRunStartedMax;
    }


    /**
     * Sets the timeLastRunStartedMax value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param timeLastRunStartedMax
     */
    public void setTimeLastRunStartedMax(long timeLastRunStartedMax) {
        this.timeLastRunStartedMax = timeLastRunStartedMax;
    }


    /**
     * Gets the timeLastRunCompletedMin value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return timeLastRunCompletedMin
     */
    public long getTimeLastRunCompletedMin() {
        return timeLastRunCompletedMin;
    }


    /**
     * Sets the timeLastRunCompletedMin value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param timeLastRunCompletedMin
     */
    public void setTimeLastRunCompletedMin(long timeLastRunCompletedMin) {
        this.timeLastRunCompletedMin = timeLastRunCompletedMin;
    }


    /**
     * Gets the timeLastRunCompletedMax value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return timeLastRunCompletedMax
     */
    public long getTimeLastRunCompletedMax() {
        return timeLastRunCompletedMax;
    }


    /**
     * Sets the timeLastRunCompletedMax value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param timeLastRunCompletedMax
     */
    public void setTimeLastRunCompletedMax(long timeLastRunCompletedMax) {
        this.timeLastRunCompletedMax = timeLastRunCompletedMax;
    }


    /**
     * Gets the itemPKConceptContains value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return itemPKConceptContains
     */
    public java.lang.String getItemPKConceptContains() {
        return itemPKConceptContains;
    }


    /**
     * Sets the itemPKConceptContains value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param itemPKConceptContains
     */
    public void setItemPKConceptContains(java.lang.String itemPKConceptContains) {
        this.itemPKConceptContains = itemPKConceptContains;
    }


    /**
     * Gets the itemPKIDFieldsContain value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return itemPKIDFieldsContain
     */
    public java.lang.String getItemPKIDFieldsContain() {
        return itemPKIDFieldsContain;
    }


    /**
     * Sets the itemPKIDFieldsContain value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param itemPKIDFieldsContain
     */
    public void setItemPKIDFieldsContain(java.lang.String itemPKIDFieldsContain) {
        this.itemPKIDFieldsContain = itemPKIDFieldsContain;
    }


    /**
     * Gets the serviceJNDIContains value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return serviceJNDIContains
     */
    public java.lang.String getServiceJNDIContains() {
        return serviceJNDIContains;
    }


    /**
     * Sets the serviceJNDIContains value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param serviceJNDIContains
     */
    public void setServiceJNDIContains(java.lang.String serviceJNDIContains) {
        this.serviceJNDIContains = serviceJNDIContains;
    }


    /**
     * Gets the serviceParametersContain value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return serviceParametersContain
     */
    public java.lang.String getServiceParametersContain() {
        return serviceParametersContain;
    }


    /**
     * Sets the serviceParametersContain value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param serviceParametersContain
     */
    public void setServiceParametersContain(java.lang.String serviceParametersContain) {
        this.serviceParametersContain = serviceParametersContain;
    }


    /**
     * Gets the messageContain value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @return messageContain
     */
    public java.lang.String getMessageContain() {
        return messageContain;
    }


    /**
     * Sets the messageContain value for this WSRoutingOrderV2SearchCriteria.
     * 
     * @param messageContain
     */
    public void setMessageContain(java.lang.String messageContain) {
        this.messageContain = messageContain;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRoutingOrderV2SearchCriteria)) return false;
        WSRoutingOrderV2SearchCriteria other = (WSRoutingOrderV2SearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.anyFieldContains==null && other.getAnyFieldContains()==null) || 
             (this.anyFieldContains!=null &&
              this.anyFieldContains.equals(other.getAnyFieldContains()))) &&
            ((this.nameContains==null && other.getNameContains()==null) || 
             (this.nameContains!=null &&
              this.nameContains.equals(other.getNameContains()))) &&
            this.timeCreatedMin == other.getTimeCreatedMin() &&
            this.timeCreatedMax == other.getTimeCreatedMax() &&
            this.timeScheduledMin == other.getTimeScheduledMin() &&
            this.timeScheduledMax == other.getTimeScheduledMax() &&
            this.timeLastRunStartedMin == other.getTimeLastRunStartedMin() &&
            this.timeLastRunStartedMax == other.getTimeLastRunStartedMax() &&
            this.timeLastRunCompletedMin == other.getTimeLastRunCompletedMin() &&
            this.timeLastRunCompletedMax == other.getTimeLastRunCompletedMax() &&
            ((this.itemPKConceptContains==null && other.getItemPKConceptContains()==null) || 
             (this.itemPKConceptContains!=null &&
              this.itemPKConceptContains.equals(other.getItemPKConceptContains()))) &&
            ((this.itemPKIDFieldsContain==null && other.getItemPKIDFieldsContain()==null) || 
             (this.itemPKIDFieldsContain!=null &&
              this.itemPKIDFieldsContain.equals(other.getItemPKIDFieldsContain()))) &&
            ((this.serviceJNDIContains==null && other.getServiceJNDIContains()==null) || 
             (this.serviceJNDIContains!=null &&
              this.serviceJNDIContains.equals(other.getServiceJNDIContains()))) &&
            ((this.serviceParametersContain==null && other.getServiceParametersContain()==null) || 
             (this.serviceParametersContain!=null &&
              this.serviceParametersContain.equals(other.getServiceParametersContain()))) &&
            ((this.messageContain==null && other.getMessageContain()==null) || 
             (this.messageContain!=null &&
              this.messageContain.equals(other.getMessageContain())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAnyFieldContains() != null) {
            _hashCode += getAnyFieldContains().hashCode();
        }
        if (getNameContains() != null) {
            _hashCode += getNameContains().hashCode();
        }
        _hashCode += new Long(getTimeCreatedMin()).hashCode();
        _hashCode += new Long(getTimeCreatedMax()).hashCode();
        _hashCode += new Long(getTimeScheduledMin()).hashCode();
        _hashCode += new Long(getTimeScheduledMax()).hashCode();
        _hashCode += new Long(getTimeLastRunStartedMin()).hashCode();
        _hashCode += new Long(getTimeLastRunStartedMax()).hashCode();
        _hashCode += new Long(getTimeLastRunCompletedMin()).hashCode();
        _hashCode += new Long(getTimeLastRunCompletedMax()).hashCode();
        if (getItemPKConceptContains() != null) {
            _hashCode += getItemPKConceptContains().hashCode();
        }
        if (getItemPKIDFieldsContain() != null) {
            _hashCode += getItemPKIDFieldsContain().hashCode();
        }
        if (getServiceJNDIContains() != null) {
            _hashCode += getServiceJNDIContains().hashCode();
        }
        if (getServiceParametersContain() != null) {
            _hashCode += getServiceParametersContain().hashCode();
        }
        if (getMessageContain() != null) {
            _hashCode += getMessageContain().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSRoutingOrderV2SearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2SearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyFieldContains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anyFieldContains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameContains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameContains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeCreatedMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeCreatedMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeCreatedMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeCreatedMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeScheduledMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeScheduledMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeScheduledMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeScheduledMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLastRunStartedMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeLastRunStartedMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLastRunStartedMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeLastRunStartedMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLastRunCompletedMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeLastRunCompletedMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLastRunCompletedMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeLastRunCompletedMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPKConceptContains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemPKConceptContains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPKIDFieldsContain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemPKIDFieldsContain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceJNDIContains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceJNDIContains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceParametersContain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceParametersContain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageContain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageContain"));
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
