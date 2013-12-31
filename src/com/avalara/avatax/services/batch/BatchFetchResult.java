/**
 * BatchFetchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

public class BatchFetchResult  extends BaseResult  implements java.io.Serializable {
    private ArrayOfBatch batches;
    private int recordCount;

    public BatchFetchResult() {
    }

    private BatchFetchResult(
           ArrayOfBatch batches,
           int recordCount) {
           this.batches = batches;
           this.recordCount = recordCount;
    }


    /**
     * Gets the batches value for this BatchFetchResult.
     * 
     * @return batches
     */
    public ArrayOfBatch getBatches() {
        return batches;
    }


    /**
     * Sets the batches value for this BatchFetchResult.
     * 
     * @param batches
     */
    public void setBatches(ArrayOfBatch batches) {
        this.batches = batches;
    }


    /**
     * Gets the recordCount value for this BatchFetchResult.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this BatchFetchResult.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BatchFetchResult)) return false;
        BatchFetchResult other = (BatchFetchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.batches==null && other.getBatches()==null) || 
             (this.batches!=null &&
              this.batches.equals(other.getBatches()))) &&
            this.recordCount == other.getRecordCount();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBatches() != null) {
            _hashCode += getBatches().hashCode();
        }
        _hashCode += getRecordCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchFetchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFetchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batches");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Batches"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfBatch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RecordCount"));
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
