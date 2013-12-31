/**
 * BatchSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

import java.net.MalformedURLException;
import java.net.URL;

public class BatchSvcLocator extends org.apache.axis.client.Service implements BatchSvc {

    public BatchSvcLocator() {
    }


    public BatchSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BatchSvcLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BatchSvcSoap
    private String BatchSvcSoap_address = "http://localhost/avatax.services/Batch/BatchSvc.asmx";

    public String getBatchSvcSoapAddress() {
        return BatchSvcSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String BatchSvcSoapWSDDServiceName = "BatchSvcSoap";

    public String getBatchSvcSoapWSDDServiceName() {
        return BatchSvcSoapWSDDServiceName;
    }

    public void setBatchSvcSoapWSDDServiceName(String name) {
        BatchSvcSoapWSDDServiceName = name;
    }

    public com.avalara.avatax.services.batch.BatchSvcSoap getBatchSvcSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BatchSvcSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBatchSvcSoap(endpoint);
    }

    public com.avalara.avatax.services.batch.BatchSvcSoap getBatchSvcSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
             // BEGIN CUSTOM
            String path = portAddress.toString();
            if (!path.endsWith(".asmx"))
            {
                if (!path.endsWith("/"))
                {
                    path += "/";
                }
                path += "batch/batchsvc.asmx";
                portAddress = new URL(path);
            }
            // END CUSTOM
            com.avalara.avatax.services.batch.BatchSvcSoapStub _stub = new com.avalara.avatax.services.batch.BatchSvcSoapStub(portAddress, this);
            _stub.setPortName(getBatchSvcSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
         // BEGIN CUSTOM
        catch (MalformedURLException e)
        {
            return null;
        }
        // END CUSTOM
    }

    public void setBatchSvcSoapEndpointAddress(String address) {
        BatchSvcSoap_address = address;
    }


    // Use to get a proxy class for BatchSvcSoap12
    private String BatchSvcSoap12_address = "http://localhost/avatax.services/Batch/BatchSvc.asmx";

    public String getBatchSvcSoap12Address() {
        return BatchSvcSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String BatchSvcSoap12WSDDServiceName = "BatchSvcSoap12";

    public String getBatchSvcSoap12WSDDServiceName() {
        return BatchSvcSoap12WSDDServiceName;
    }

    public void setBatchSvcSoap12WSDDServiceName(String name) {
        BatchSvcSoap12WSDDServiceName = name;
    }

    public com.avalara.avatax.services.batch.BatchSvcSoap getBatchSvcSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BatchSvcSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBatchSvcSoap12(endpoint);
    }

    public com.avalara.avatax.services.batch.BatchSvcSoap getBatchSvcSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.avalara.avatax.services.batch.BatchSvcSoap12Stub _stub = new com.avalara.avatax.services.batch.BatchSvcSoap12Stub(portAddress, this);
            _stub.setPortName(getBatchSvcSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBatchSvcSoap12EndpointAddress(String address) {
        BatchSvcSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.avalara.avatax.services.batch.BatchSvcSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.avalara.avatax.services.batch.BatchSvcSoapStub _stub = new com.avalara.avatax.services.batch.BatchSvcSoapStub(new java.net.URL(BatchSvcSoap_address), this);
                _stub.setPortName(getBatchSvcSoapWSDDServiceName());
                return _stub;
            }
            if (com.avalara.avatax.services.batch.BatchSvcSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.avalara.avatax.services.batch.BatchSvcSoap12Stub _stub = new com.avalara.avatax.services.batch.BatchSvcSoap12Stub(new java.net.URL(BatchSvcSoap12_address), this);
                _stub.setPortName(getBatchSvcSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("BatchSvcSoap".equals(inputPortName)) {
            return getBatchSvcSoap();
        }
        else if ("BatchSvcSoap12".equals(inputPortName)) {
            return getBatchSvcSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchSvcSoap"));
            ports.add(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchSvcSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("BatchSvcSoap".equals(portName)) {
            setBatchSvcSoapEndpointAddress(address);
        }
        else 
if ("BatchSvcSoap12".equals(portName)) {
            setBatchSvcSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
