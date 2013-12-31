/**
 * FilterRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

public class FilterRequest  implements java.io.Serializable {
    private String filters;
    private int maxCount;

    public FilterRequest() {
    }

    private FilterRequest(
           String filters,
           int maxCount) {
           this.filters = filters;
           this.maxCount = maxCount;
    }


    /**
     * Gets the filters value for this FilterRequest.
     * 
     * @return filters
     */
    public String getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this FilterRequest.
     * 
     * @param filters
     */
    public void setFilters(String filters) {
        this.filters = filters;
    }


    /**
     * Gets the maxCount value for this FilterRequest.
     * 
     * @return maxCount
     */
    public int getMaxCount() {
        return maxCount;
    }


    /**
     * Sets the maxCount value for this FilterRequest.
     * 
     * @param maxCount
     */
    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FilterRequest)) return false;
        FilterRequest other = (FilterRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              this.filters.equals(other.getFilters()))) &&
            this.maxCount == other.getMaxCount();
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
        if (getFilters() != null) {
            _hashCode += getFilters().hashCode();
        }
        _hashCode += getMaxCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilterRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "MaxCount"));
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
