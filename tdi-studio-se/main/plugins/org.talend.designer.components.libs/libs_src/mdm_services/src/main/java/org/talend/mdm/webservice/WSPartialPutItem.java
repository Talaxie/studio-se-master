/**
 * WSPartialPutItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Partial Puts an item in the xml storage.
 */
public class WSPartialPutItem  implements java.io.Serializable {
    private java.lang.String xml;

    private java.lang.String datacluster;

    private java.lang.String pivot;

    private java.lang.String datamodel;

    private java.lang.String keyXPath;

    private java.lang.Integer startingPosition;

    private java.lang.Boolean overwrite;

    private boolean report;

    private java.lang.String source;

    public WSPartialPutItem() {
    }

    public WSPartialPutItem(
           java.lang.String xml,
           java.lang.String datacluster,
           java.lang.String pivot,
           java.lang.String datamodel,
           java.lang.String keyXPath,
           java.lang.Integer startingPosition,
           java.lang.Boolean overwrite,
           boolean report,
           java.lang.String source) {
           this.xml = xml;
           this.datacluster = datacluster;
           this.pivot = pivot;
           this.datamodel = datamodel;
           this.keyXPath = keyXPath;
           this.startingPosition = startingPosition;
           this.overwrite = overwrite;
           this.report = report;
           this.source = source;
    }


    /**
     * Gets the xml value for this WSPartialPutItem.
     * 
     * @return xml
     */
    public java.lang.String getXml() {
        return xml;
    }


    /**
     * Sets the xml value for this WSPartialPutItem.
     * 
     * @param xml
     */
    public void setXml(java.lang.String xml) {
        this.xml = xml;
    }


    /**
     * Gets the datacluster value for this WSPartialPutItem.
     * 
     * @return datacluster
     */
    public java.lang.String getDatacluster() {
        return datacluster;
    }


    /**
     * Sets the datacluster value for this WSPartialPutItem.
     * 
     * @param datacluster
     */
    public void setDatacluster(java.lang.String datacluster) {
        this.datacluster = datacluster;
    }


    /**
     * Gets the pivot value for this WSPartialPutItem.
     * 
     * @return pivot
     */
    public java.lang.String getPivot() {
        return pivot;
    }


    /**
     * Sets the pivot value for this WSPartialPutItem.
     * 
     * @param pivot
     */
    public void setPivot(java.lang.String pivot) {
        this.pivot = pivot;
    }


    /**
     * Gets the datamodel value for this WSPartialPutItem.
     * 
     * @return datamodel
     */
    public java.lang.String getDatamodel() {
        return datamodel;
    }


    /**
     * Sets the datamodel value for this WSPartialPutItem.
     * 
     * @param datamodel
     */
    public void setDatamodel(java.lang.String datamodel) {
        this.datamodel = datamodel;
    }


    /**
     * Gets the keyXPath value for this WSPartialPutItem.
     * 
     * @return keyXPath
     */
    public java.lang.String getKeyXPath() {
        return keyXPath;
    }


    /**
     * Sets the keyXPath value for this WSPartialPutItem.
     * 
     * @param keyXPath
     */
    public void setKeyXPath(java.lang.String keyXPath) {
        this.keyXPath = keyXPath;
    }


    /**
     * Gets the startingPosition value for this WSPartialPutItem.
     * 
     * @return startingPosition
     */
    public java.lang.Integer getStartingPosition() {
        return startingPosition;
    }


    /**
     * Sets the startingPosition value for this WSPartialPutItem.
     * 
     * @param startingPosition
     */
    public void setStartingPosition(java.lang.Integer startingPosition) {
        this.startingPosition = startingPosition;
    }


    /**
     * Gets the overwrite value for this WSPartialPutItem.
     * 
     * @return overwrite
     */
    public java.lang.Boolean getOverwrite() {
        return overwrite;
    }


    /**
     * Sets the overwrite value for this WSPartialPutItem.
     * 
     * @param overwrite
     */
    public void setOverwrite(java.lang.Boolean overwrite) {
        this.overwrite = overwrite;
    }


    /**
     * Gets the report value for this WSPartialPutItem.
     * 
     * @return report
     */
    public boolean isReport() {
        return report;
    }


    /**
     * Sets the report value for this WSPartialPutItem.
     * 
     * @param report
     */
    public void setReport(boolean report) {
        this.report = report;
    }


    /**
     * Gets the source value for this WSPartialPutItem.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this WSPartialPutItem.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPartialPutItem)) return false;
        WSPartialPutItem other = (WSPartialPutItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xml==null && other.getXml()==null) || 
             (this.xml!=null &&
              this.xml.equals(other.getXml()))) &&
            ((this.datacluster==null && other.getDatacluster()==null) || 
             (this.datacluster!=null &&
              this.datacluster.equals(other.getDatacluster()))) &&
            ((this.pivot==null && other.getPivot()==null) || 
             (this.pivot!=null &&
              this.pivot.equals(other.getPivot()))) &&
            ((this.datamodel==null && other.getDatamodel()==null) || 
             (this.datamodel!=null &&
              this.datamodel.equals(other.getDatamodel()))) &&
            ((this.keyXPath==null && other.getKeyXPath()==null) || 
             (this.keyXPath!=null &&
              this.keyXPath.equals(other.getKeyXPath()))) &&
            ((this.startingPosition==null && other.getStartingPosition()==null) || 
             (this.startingPosition!=null &&
              this.startingPosition.equals(other.getStartingPosition()))) &&
            ((this.overwrite==null && other.getOverwrite()==null) || 
             (this.overwrite!=null &&
              this.overwrite.equals(other.getOverwrite()))) &&
            this.report == other.isReport() &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource())));
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
        if (getXml() != null) {
            _hashCode += getXml().hashCode();
        }
        if (getDatacluster() != null) {
            _hashCode += getDatacluster().hashCode();
        }
        if (getPivot() != null) {
            _hashCode += getPivot().hashCode();
        }
        if (getDatamodel() != null) {
            _hashCode += getDatamodel().hashCode();
        }
        if (getKeyXPath() != null) {
            _hashCode += getKeyXPath().hashCode();
        }
        if (getStartingPosition() != null) {
            _hashCode += getStartingPosition().hashCode();
        }
        if (getOverwrite() != null) {
            _hashCode += getOverwrite().hashCode();
        }
        _hashCode += (isReport() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPartialPutItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPartialPutItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xml");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datacluster");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datacluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pivot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pivot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datamodel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datamodel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyXPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyXPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startingPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overwrite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overwrite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
