/**
 * BatchFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

public class BatchFile  implements java.io.Serializable {
    private int batchFileId;
    private int batchId;
    private byte[] content;
    private String contentType;
    private String ext;
    private String filePath;
    private String name;
    private int size;
    private int errorCount;

    public BatchFile() {
    }

    private BatchFile(
           int batchFileId,
           int batchId,
           byte[] content,
           String contentType,
           String ext,
           String filePath,
           String name,
           int size,
           int errorCount) {
           this.batchFileId = batchFileId;
           this.batchId = batchId;
           this.content = content;
           this.contentType = contentType;
           this.ext = ext;
           this.filePath = filePath;
           this.name = name;
           this.size = size;
           this.errorCount = errorCount;
    }


    /**
     * Gets the batchFileId value for this BatchFile.
     * 
     * @return batchFileId
     */
    public int getBatchFileId() {
        return batchFileId;
    }


    /**
     * Sets the batchFileId value for this BatchFile.
     * 
     * @param batchFileId
     */
    public void setBatchFileId(int batchFileId) {
        this.batchFileId = batchFileId;
    }


    /**
     * Gets the batchId value for this BatchFile.
     * 
     * @return batchId
     */
    public int getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this BatchFile.
     * 
     * @param batchId
     */
    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the content value for this BatchFile.
     * 
     * @return content
     */
    public byte[] getContent() {
        return content;
    }


    /**
     * Sets the content value for this BatchFile.
     * 
     * @param content
     */
    public void setContent(byte[] content) {
        this.content = content;
    }


    /**
     * Gets the contentType value for this BatchFile.
     * 
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this BatchFile.
     * 
     * @param contentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the ext value for this BatchFile.
     * 
     * @return ext
     */
    public String getExt() {
        return ext;
    }


    /**
     * Sets the ext value for this BatchFile.
     * 
     * @param ext
     */
    public void setExt(String ext) {
        this.ext = ext;
    }


    /**
     * Gets the filePath value for this BatchFile.
     * 
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }


    /**
     * Sets the filePath value for this BatchFile.
     * 
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


    /**
     * Gets the name value for this BatchFile.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this BatchFile.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the size value for this BatchFile.
     * 
     * @return size
     */
    public int getSize() {
        return size;
    }


    /**
     * Sets the size value for this BatchFile.
     * 
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }


    /**
     * Gets the errorCount value for this BatchFile.
     * 
     * @return errorCount
     */
    public int getErrorCount() {
        return errorCount;
    }


    /**
     * Sets the errorCount value for this BatchFile.
     * 
     * @param errorCount
     */
    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BatchFile)) return false;
        BatchFile other = (BatchFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.batchFileId == other.getBatchFileId() &&
            this.batchId == other.getBatchId() &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              java.util.Arrays.equals(this.content, other.getContent()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.ext==null && other.getExt()==null) || 
             (this.ext!=null &&
              this.ext.equals(other.getExt()))) &&
            ((this.filePath==null && other.getFilePath()==null) || 
             (this.filePath!=null &&
              this.filePath.equals(other.getFilePath()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.size == other.getSize() &&
            this.errorCount == other.getErrorCount();
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
        _hashCode += getBatchFileId();
        _hashCode += getBatchId();
        if (getContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContent());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getExt() != null) {
            _hashCode += getExt().hashCode();
        }
        if (getFilePath() != null) {
            _hashCode += getFilePath().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getSize();
        _hashCode += getErrorCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchFileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFileId"));
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
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ErrorCount"));
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
