/**
 * FetchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

public class FetchRequest  implements java.io.Serializable {
    private String fields;
    private String filters;
    private String sort;
    private int maxCount;
    private int pageIndex;
    private int pageSize;
    private int recordCount;

    public FetchRequest() {
    }

    private FetchRequest(
           String fields,
           String filters,
           String sort,
           int maxCount,
           int pageIndex,
           int pageSize,
           int recordCount) {
           this.fields = fields;
           this.filters = filters;
           this.sort = sort;
           this.maxCount = maxCount;
           this.pageIndex = pageIndex;
           this.pageSize = pageSize;
           this.recordCount = recordCount;
    }


    /**
     * Gets the fields value for this FetchRequest.
     * 
     * @return fields
     */
    public String getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this FetchRequest.
     * 
     * @param fields
     */
    public void setFields(String fields) {
        this.fields = fields;
    }


    /**
     * Gets the filters value for this FetchRequest.
     * 
     * @return filters
     */
    public String getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this FetchRequest.
     * 
     * @param filters
     */
    public void setFilters(String filters) {
        this.filters = filters;
    }


    /**
     * Gets the sort value for this FetchRequest.
     * 
     * @return sort
     */
    public String getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this FetchRequest.
     * 
     * @param sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }


    /**
     * Gets the maxCount value for this FetchRequest.
     * 
     * @return maxCount
     */
    public int getMaxCount() {
        return maxCount;
    }


    /**
     * Sets the maxCount value for this FetchRequest.
     * 
     * @param maxCount
     */
    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }


    /**
     * Gets the pageIndex value for this FetchRequest.
     * 
     * @return pageIndex
     */
    public int getPageIndex() {
        return pageIndex;
    }


    /**
     * Sets the pageIndex value for this FetchRequest.
     * 
     * @param pageIndex
     */
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * Gets the pageSize value for this FetchRequest.
     * 
     * @return pageSize
     */
    public int getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this FetchRequest.
     * 
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the recordCount value for this FetchRequest.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this FetchRequest.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FetchRequest)) return false;
        FetchRequest other = (FetchRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              this.fields.equals(other.getFields()))) &&
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              this.filters.equals(other.getFilters()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            this.maxCount == other.getMaxCount() &&
            this.pageIndex == other.getPageIndex() &&
            this.pageSize == other.getPageSize() &&
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
        int _hashCode = 1;
        if (getFields() != null) {
            _hashCode += getFields().hashCode();
        }
        if (getFilters() != null) {
            _hashCode += getFilters().hashCode();
        }
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        _hashCode += getMaxCount();
        _hashCode += getPageIndex();
        _hashCode += getPageSize();
        _hashCode += getRecordCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FetchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FetchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Sort"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PageIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
