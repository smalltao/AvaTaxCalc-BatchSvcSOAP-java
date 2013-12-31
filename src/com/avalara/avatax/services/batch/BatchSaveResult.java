/**
 * BatchSaveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

public class BatchSaveResult  extends BaseResult  implements java.io.Serializable {
    private int batchId;
    private java.util.Calendar estimatedCompletion;

    public BatchSaveResult() {
    }

    private BatchSaveResult(
           int batchId,
           java.util.Calendar estimatedCompletion) {
           this.batchId = batchId;
           this.estimatedCompletion = estimatedCompletion;
    }


    /**
     * Gets the batchId value for this BatchSaveResult.
     * 
     * @return batchId
     */
    public int getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this BatchSaveResult.
     * 
     * @param batchId
     */
    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the estimatedCompletion value for this BatchSaveResult.
     * 
     * @return estimatedCompletion
     */
    public java.util.Calendar getEstimatedCompletion() {
        return estimatedCompletion;
    }


    /**
     * Sets the estimatedCompletion value for this BatchSaveResult.
     * 
     * @param estimatedCompletion
     */
    public void setEstimatedCompletion(java.util.Calendar estimatedCompletion) {
        this.estimatedCompletion = estimatedCompletion;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BatchSaveResult)) return false;
        BatchSaveResult other = (BatchSaveResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.batchId == other.getBatchId() &&
            ((this.estimatedCompletion==null && other.getEstimatedCompletion()==null) || 
             (this.estimatedCompletion!=null &&
              this.estimatedCompletion.equals(other.getEstimatedCompletion())));
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
        _hashCode += getBatchId();
        if (getEstimatedCompletion() != null) {
            _hashCode += getEstimatedCompletion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchSaveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchSaveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedCompletion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EstimatedCompletion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
