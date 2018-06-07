/**
 * DocumentApprovementHistoryDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.datasul.technology.webdesk.dm.ws;

public class DocumentApprovementHistoryDto  implements java.io.Serializable {
    private java.util.Calendar approvementDate;

    private java.lang.String colleagueId;

    private int documentVersion;

    private int iterationSequence;

    private int levelId;

    private int movementSequence;

    private java.lang.String observation;

    private boolean signed;

    private int status;

    public DocumentApprovementHistoryDto() {
    }

    public DocumentApprovementHistoryDto(
           java.util.Calendar approvementDate,
           java.lang.String colleagueId,
           int documentVersion,
           int iterationSequence,
           int levelId,
           int movementSequence,
           java.lang.String observation,
           boolean signed,
           int status) {
           this.approvementDate = approvementDate;
           this.colleagueId = colleagueId;
           this.documentVersion = documentVersion;
           this.iterationSequence = iterationSequence;
           this.levelId = levelId;
           this.movementSequence = movementSequence;
           this.observation = observation;
           this.signed = signed;
           this.status = status;
    }


    /**
     * Gets the approvementDate value for this DocumentApprovementHistoryDto.
     * 
     * @return approvementDate
     */
    public java.util.Calendar getApprovementDate() {
        return approvementDate;
    }


    /**
     * Sets the approvementDate value for this DocumentApprovementHistoryDto.
     * 
     * @param approvementDate
     */
    public void setApprovementDate(java.util.Calendar approvementDate) {
        this.approvementDate = approvementDate;
    }


    /**
     * Gets the colleagueId value for this DocumentApprovementHistoryDto.
     * 
     * @return colleagueId
     */
    public java.lang.String getColleagueId() {
        return colleagueId;
    }


    /**
     * Sets the colleagueId value for this DocumentApprovementHistoryDto.
     * 
     * @param colleagueId
     */
    public void setColleagueId(java.lang.String colleagueId) {
        this.colleagueId = colleagueId;
    }


    /**
     * Gets the documentVersion value for this DocumentApprovementHistoryDto.
     * 
     * @return documentVersion
     */
    public int getDocumentVersion() {
        return documentVersion;
    }


    /**
     * Sets the documentVersion value for this DocumentApprovementHistoryDto.
     * 
     * @param documentVersion
     */
    public void setDocumentVersion(int documentVersion) {
        this.documentVersion = documentVersion;
    }


    /**
     * Gets the iterationSequence value for this DocumentApprovementHistoryDto.
     * 
     * @return iterationSequence
     */
    public int getIterationSequence() {
        return iterationSequence;
    }


    /**
     * Sets the iterationSequence value for this DocumentApprovementHistoryDto.
     * 
     * @param iterationSequence
     */
    public void setIterationSequence(int iterationSequence) {
        this.iterationSequence = iterationSequence;
    }


    /**
     * Gets the levelId value for this DocumentApprovementHistoryDto.
     * 
     * @return levelId
     */
    public int getLevelId() {
        return levelId;
    }


    /**
     * Sets the levelId value for this DocumentApprovementHistoryDto.
     * 
     * @param levelId
     */
    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }


    /**
     * Gets the movementSequence value for this DocumentApprovementHistoryDto.
     * 
     * @return movementSequence
     */
    public int getMovementSequence() {
        return movementSequence;
    }


    /**
     * Sets the movementSequence value for this DocumentApprovementHistoryDto.
     * 
     * @param movementSequence
     */
    public void setMovementSequence(int movementSequence) {
        this.movementSequence = movementSequence;
    }


    /**
     * Gets the observation value for this DocumentApprovementHistoryDto.
     * 
     * @return observation
     */
    public java.lang.String getObservation() {
        return observation;
    }


    /**
     * Sets the observation value for this DocumentApprovementHistoryDto.
     * 
     * @param observation
     */
    public void setObservation(java.lang.String observation) {
        this.observation = observation;
    }


    /**
     * Gets the signed value for this DocumentApprovementHistoryDto.
     * 
     * @return signed
     */
    public boolean isSigned() {
        return signed;
    }


    /**
     * Sets the signed value for this DocumentApprovementHistoryDto.
     * 
     * @param signed
     */
    public void setSigned(boolean signed) {
        this.signed = signed;
    }


    /**
     * Gets the status value for this DocumentApprovementHistoryDto.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DocumentApprovementHistoryDto.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentApprovementHistoryDto)) return false;
        DocumentApprovementHistoryDto other = (DocumentApprovementHistoryDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.approvementDate==null && other.getApprovementDate()==null) || 
             (this.approvementDate!=null &&
              this.approvementDate.equals(other.getApprovementDate()))) &&
            ((this.colleagueId==null && other.getColleagueId()==null) || 
             (this.colleagueId!=null &&
              this.colleagueId.equals(other.getColleagueId()))) &&
            this.documentVersion == other.getDocumentVersion() &&
            this.iterationSequence == other.getIterationSequence() &&
            this.levelId == other.getLevelId() &&
            this.movementSequence == other.getMovementSequence() &&
            ((this.observation==null && other.getObservation()==null) || 
             (this.observation!=null &&
              this.observation.equals(other.getObservation()))) &&
            this.signed == other.isSigned() &&
            this.status == other.getStatus();
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
        if (getApprovementDate() != null) {
            _hashCode += getApprovementDate().hashCode();
        }
        if (getColleagueId() != null) {
            _hashCode += getColleagueId().hashCode();
        }
        _hashCode += getDocumentVersion();
        _hashCode += getIterationSequence();
        _hashCode += getLevelId();
        _hashCode += getMovementSequence();
        if (getObservation() != null) {
            _hashCode += getObservation().hashCode();
        }
        _hashCode += (isSigned() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentApprovementHistoryDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentApprovementHistoryDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colleagueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colleagueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iterationSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iterationSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("levelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "levelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movementSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "movementSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
