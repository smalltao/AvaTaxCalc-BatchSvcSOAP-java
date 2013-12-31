/**
 * Batch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

import java.util.GregorianCalendar;

public class Batch  implements java.io.Serializable {
    private int accountId;
    private int batchId;
    private String batchStatusId;
    private String batchTypeId;
    private int companyId;
    private java.util.Calendar createdDate;
    private int createdUserId;
    private java.util.Calendar completedDate;
    private ArrayOfBatchFile files;
    private java.util.Calendar modifiedDate;
    private int modifiedUserId;
    private String name;
    private String options;
    private int recordCount;
    private int currentRecord;

    public Batch() {
        createdDate=new GregorianCalendar(1900,1,1);
        completedDate=new GregorianCalendar(1900,1,1);
        modifiedDate=new GregorianCalendar(1900,1,1);
    }

    private Batch(
           int accountId,
           int batchId,
           String batchStatusId,
           String batchTypeId,
           int companyId,
           java.util.Calendar createdDate,
           int createdUserId,
           java.util.Calendar completedDate,
           ArrayOfBatchFile files,
           java.util.Calendar modifiedDate,
           int modifiedUserId,
           String name,
           String options,
           int recordCount,
           int currentRecord) {
           this.accountId = accountId;
           this.batchId = batchId;
           this.batchStatusId = batchStatusId;
           this.batchTypeId = batchTypeId;
           this.companyId = companyId;
           this.createdDate = createdDate;
           this.createdUserId = createdUserId;
           this.completedDate = completedDate;
           this.files = files;
           this.modifiedDate = modifiedDate;
           this.modifiedUserId = modifiedUserId;
           this.name = name;
           this.options = options;
           this.recordCount = recordCount;
           this.currentRecord = currentRecord;
    }


    /**
     * Gets the accountId value for this Batch.
     * 
     * @return accountId
     */
    public int getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Batch.
     * 
     * @param accountId
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the batchId value for this Batch.
     * 
     * @return batchId
     */
    public int getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this Batch.
     * 
     * @param batchId
     */
    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the batchStatusId value for this Batch.
     * 
     * @return batchStatusId
     */
    public String getBatchStatusId() {
        return batchStatusId;
    }


    /**
     * Sets the batchStatusId value for this Batch.
     * 
     * @param batchStatusId
     */
    public void setBatchStatusId(String batchStatusId) {
        this.batchStatusId = batchStatusId;
    }


    /**
     * Gets the batchTypeId value for this Batch.
     * 
     * @return batchTypeId
     */
    public String getBatchTypeId() {
        return batchTypeId;
    }


    /**
     * Sets the batchTypeId value for this Batch.
     * 
     * @param batchTypeId
     */
    public void setBatchTypeId(String batchTypeId) {
        this.batchTypeId = batchTypeId;
    }


    /**
     * Gets the companyId value for this Batch.
     * 
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this Batch.
     * 
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the createdDate value for this Batch.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Batch.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdUserId value for this Batch.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this Batch.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the completedDate value for this Batch.
     * 
     * @return completedDate
     */
    public java.util.Calendar getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this Batch.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.util.Calendar completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the files value for this Batch.
     * 
     * @return files
     */
    public ArrayOfBatchFile getFiles() {
        return files;
    }


    /**
     * Sets the files value for this Batch.
     * 
     * @param files
     */
    public void setFiles(ArrayOfBatchFile files) {
        this.files = files;
    }


    /**
     * Gets the modifiedDate value for this Batch.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Batch.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedUserId value for this Batch.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this Batch.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the name value for this Batch.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this Batch.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the options value for this Batch.
     * 
     * @return options
     */
    public String getOptions() {
        return options;
    }


    /**
     * Sets the options value for this Batch.
     * 
     * @param options
     */
    public void setOptions(String options) {
        this.options = options;
    }


    /**
     * Gets the recordCount value for this Batch.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this Batch.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }


    /**
     * Gets the currentRecord value for this Batch.
     * 
     * @return currentRecord
     */
    public int getCurrentRecord() {
        return currentRecord;
    }


    /**
     * Sets the currentRecord value for this Batch.
     * 
     * @param currentRecord
     */
    public void setCurrentRecord(int currentRecord) {
        this.currentRecord = currentRecord;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Batch)) return false;
        Batch other = (Batch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountId == other.getAccountId() &&
            this.batchId == other.getBatchId() &&
            ((this.batchStatusId==null && other.getBatchStatusId()==null) || 
             (this.batchStatusId!=null &&
              this.batchStatusId.equals(other.getBatchStatusId()))) &&
            ((this.batchTypeId==null && other.getBatchTypeId()==null) || 
             (this.batchTypeId!=null &&
              this.batchTypeId.equals(other.getBatchTypeId()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.createdUserId == other.getCreatedUserId() &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              this.files.equals(other.getFiles()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.modifiedUserId == other.getModifiedUserId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            this.recordCount == other.getRecordCount() &&
            this.currentRecord == other.getCurrentRecord();
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
        _hashCode += getAccountId();
        _hashCode += getBatchId();
        if (getBatchStatusId() != null) {
            _hashCode += getBatchStatusId().hashCode();
        }
        if (getBatchTypeId() != null) {
            _hashCode += getBatchTypeId().hashCode();
        }
        _hashCode += getCompanyId();
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getCreatedUserId();
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        if (getFiles() != null) {
            _hashCode += getFiles().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getModifiedUserId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        _hashCode += getRecordCount();
        _hashCode += getCurrentRecord();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Batch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Batch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CreatedUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompletedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Files"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfBatchFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ModifiedUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RecordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CurrentRecord"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  com.avalara.avatax.services.base.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
