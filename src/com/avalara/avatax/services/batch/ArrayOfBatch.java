/**
 * ArrayOfBatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

public class ArrayOfBatch  implements java.io.Serializable {
    private com.avalara.avatax.services.batch.Batch[] batch;

    public ArrayOfBatch() {
    }

    public ArrayOfBatch(
           com.avalara.avatax.services.batch.Batch[] batch) {
           this.batch = batch;
    }


    /**
     * Gets the batch value for this ArrayOfBatch.
     * 
     * @return batch
     */
    public com.avalara.avatax.services.batch.Batch[] getBatch() {
        return batch;
    }


    /**
     * Sets the batch value for this ArrayOfBatch.
     * 
     * @param batch
     */
    public void setBatch(com.avalara.avatax.services.batch.Batch[] batch) {
        this.batch = batch;
    }

    public com.avalara.avatax.services.batch.Batch getBatch(int i) {
        return this.batch[i];
    }

    public void setBatch(int i, com.avalara.avatax.services.batch.Batch _value) {
        this.batch[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfBatch)) return false;
        ArrayOfBatch other = (ArrayOfBatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batch==null && other.getBatch()==null) || 
             (this.batch!=null &&
              java.util.Arrays.equals(this.batch, other.getBatch())));
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
        if (getBatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatch());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfBatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfBatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Batch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Batch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
