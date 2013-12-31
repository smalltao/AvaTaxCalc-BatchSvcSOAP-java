/**
 * BatchSvc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

public interface BatchSvc extends javax.xml.rpc.Service {
    public String getBatchSvcSoapAddress();

    public com.avalara.avatax.services.batch.BatchSvcSoap getBatchSvcSoap() throws javax.xml.rpc.ServiceException;

    public com.avalara.avatax.services.batch.BatchSvcSoap getBatchSvcSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public String getBatchSvcSoap12Address();

    public com.avalara.avatax.services.batch.BatchSvcSoap getBatchSvcSoap12() throws javax.xml.rpc.ServiceException;

    public com.avalara.avatax.services.batch.BatchSvcSoap getBatchSvcSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
