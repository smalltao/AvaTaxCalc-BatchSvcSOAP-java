/**
 * ArrayOfBatchFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

public class ArrayOfBatchFile  implements java.io.Serializable {
    private com.avalara.avatax.services.batch.BatchFile[] batchFile;

    public ArrayOfBatchFile() {
    }

    public ArrayOfBatchFile(
           com.avalara.avatax.services.batch.BatchFile[] batchFile) {
           this.batchFile = batchFile;
    }


    /**
     * Gets the batchFile value for this ArrayOfBatchFile.
     * 
     * @return batchFile
     */
    public com.avalara.avatax.services.batch.BatchFile[] getBatchFile() {
        return batchFile;
    }


    /**
     * Sets the batchFile value for this ArrayOfBatchFile.
     * 
     * @param batchFile
     */
    public void setBatchFile(com.avalara.avatax.services.batch.BatchFile[] batchFile) {
        this.batchFile = batchFile;
    }

    public com.avalara.avatax.services.batch.BatchFile getBatchFile(int i) {
        return this.batchFile[i];
    }

    public void setBatchFile(int i, com.avalara.avatax.services.batch.BatchFile _value) {
        this.batchFile[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArrayOfBatchFile)) return false;
        ArrayOfBatchFile other = (ArrayOfBatchFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchFile==null && other.getBatchFile()==null) || 
             (this.batchFile!=null &&
              java.util.Arrays.equals(this.batchFile, other.getBatchFile())));
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
        if (getBatchFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatchFile());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBatchFile(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfBatchFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfBatchFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchFile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFile"));
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
