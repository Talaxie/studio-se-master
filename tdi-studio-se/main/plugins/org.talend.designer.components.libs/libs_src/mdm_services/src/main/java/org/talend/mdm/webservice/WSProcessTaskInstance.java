/**
 * WSProcessTaskInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSProcessTaskInstance  implements java.io.Serializable {
    private java.lang.String uuid;

    private java.lang.String status;

    private java.lang.String candidates;

    private java.lang.String name;

    private java.lang.String readyDate;

    private java.lang.String processName;

    private java.lang.String processVersion;

    private java.lang.String processInstanceNb;

    private java.lang.String processInstanceUUID;

    private java.lang.String processDefineUUID;

    private java.lang.String priority;

    public WSProcessTaskInstance() {
    }

    public WSProcessTaskInstance(
           java.lang.String uuid,
           java.lang.String status,
           java.lang.String candidates,
           java.lang.String name,
           java.lang.String readyDate,
           java.lang.String processName,
           java.lang.String processVersion,
           java.lang.String processInstanceNb,
           java.lang.String processInstanceUUID,
           java.lang.String processDefineUUID,
           java.lang.String priority) {
           this.uuid = uuid;
           this.status = status;
           this.candidates = candidates;
           this.name = name;
           this.readyDate = readyDate;
           this.processName = processName;
           this.processVersion = processVersion;
           this.processInstanceNb = processInstanceNb;
           this.processInstanceUUID = processInstanceUUID;
           this.processDefineUUID = processDefineUUID;
           this.priority = priority;
    }


    /**
     * Gets the uuid value for this WSProcessTaskInstance.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this WSProcessTaskInstance.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the status value for this WSProcessTaskInstance.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSProcessTaskInstance.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the candidates value for this WSProcessTaskInstance.
     * 
     * @return candidates
     */
    public java.lang.String getCandidates() {
        return candidates;
    }


    /**
     * Sets the candidates value for this WSProcessTaskInstance.
     * 
     * @param candidates
     */
    public void setCandidates(java.lang.String candidates) {
        this.candidates = candidates;
    }


    /**
     * Gets the name value for this WSProcessTaskInstance.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSProcessTaskInstance.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the readyDate value for this WSProcessTaskInstance.
     * 
     * @return readyDate
     */
    public java.lang.String getReadyDate() {
        return readyDate;
    }


    /**
     * Sets the readyDate value for this WSProcessTaskInstance.
     * 
     * @param readyDate
     */
    public void setReadyDate(java.lang.String readyDate) {
        this.readyDate = readyDate;
    }


    /**
     * Gets the processName value for this WSProcessTaskInstance.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this WSProcessTaskInstance.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the processVersion value for this WSProcessTaskInstance.
     * 
     * @return processVersion
     */
    public java.lang.String getProcessVersion() {
        return processVersion;
    }


    /**
     * Sets the processVersion value for this WSProcessTaskInstance.
     * 
     * @param processVersion
     */
    public void setProcessVersion(java.lang.String processVersion) {
        this.processVersion = processVersion;
    }


    /**
     * Gets the processInstanceNb value for this WSProcessTaskInstance.
     * 
     * @return processInstanceNb
     */
    public java.lang.String getProcessInstanceNb() {
        return processInstanceNb;
    }


    /**
     * Sets the processInstanceNb value for this WSProcessTaskInstance.
     * 
     * @param processInstanceNb
     */
    public void setProcessInstanceNb(java.lang.String processInstanceNb) {
        this.processInstanceNb = processInstanceNb;
    }


    /**
     * Gets the processInstanceUUID value for this WSProcessTaskInstance.
     * 
     * @return processInstanceUUID
     */
    public java.lang.String getProcessInstanceUUID() {
        return processInstanceUUID;
    }


    /**
     * Sets the processInstanceUUID value for this WSProcessTaskInstance.
     * 
     * @param processInstanceUUID
     */
    public void setProcessInstanceUUID(java.lang.String processInstanceUUID) {
        this.processInstanceUUID = processInstanceUUID;
    }


    /**
     * Gets the processDefineUUID value for this WSProcessTaskInstance.
     * 
     * @return processDefineUUID
     */
    public java.lang.String getProcessDefineUUID() {
        return processDefineUUID;
    }


    /**
     * Sets the processDefineUUID value for this WSProcessTaskInstance.
     * 
     * @param processDefineUUID
     */
    public void setProcessDefineUUID(java.lang.String processDefineUUID) {
        this.processDefineUUID = processDefineUUID;
    }


    /**
     * Gets the priority value for this WSProcessTaskInstance.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this WSProcessTaskInstance.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSProcessTaskInstance)) return false;
        WSProcessTaskInstance other = (WSProcessTaskInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.candidates==null && other.getCandidates()==null) || 
             (this.candidates!=null &&
              this.candidates.equals(other.getCandidates()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.readyDate==null && other.getReadyDate()==null) || 
             (this.readyDate!=null &&
              this.readyDate.equals(other.getReadyDate()))) &&
            ((this.processName==null && other.getProcessName()==null) || 
             (this.processName!=null &&
              this.processName.equals(other.getProcessName()))) &&
            ((this.processVersion==null && other.getProcessVersion()==null) || 
             (this.processVersion!=null &&
              this.processVersion.equals(other.getProcessVersion()))) &&
            ((this.processInstanceNb==null && other.getProcessInstanceNb()==null) || 
             (this.processInstanceNb!=null &&
              this.processInstanceNb.equals(other.getProcessInstanceNb()))) &&
            ((this.processInstanceUUID==null && other.getProcessInstanceUUID()==null) || 
             (this.processInstanceUUID!=null &&
              this.processInstanceUUID.equals(other.getProcessInstanceUUID()))) &&
            ((this.processDefineUUID==null && other.getProcessDefineUUID()==null) || 
             (this.processDefineUUID!=null &&
              this.processDefineUUID.equals(other.getProcessDefineUUID()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority())));
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
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCandidates() != null) {
            _hashCode += getCandidates().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getReadyDate() != null) {
            _hashCode += getReadyDate().hashCode();
        }
        if (getProcessName() != null) {
            _hashCode += getProcessName().hashCode();
        }
        if (getProcessVersion() != null) {
            _hashCode += getProcessVersion().hashCode();
        }
        if (getProcessInstanceNb() != null) {
            _hashCode += getProcessInstanceNb().hashCode();
        }
        if (getProcessInstanceUUID() != null) {
            _hashCode += getProcessInstanceUUID().hashCode();
        }
        if (getProcessDefineUUID() != null) {
            _hashCode += getProcessDefineUUID().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSProcessTaskInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessTaskInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candidates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "candidates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstanceNb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processInstanceNb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstanceUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processInstanceUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDefineUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processDefineUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
