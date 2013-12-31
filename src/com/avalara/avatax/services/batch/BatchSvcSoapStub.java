/**
 * BatchSvcSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

public class BatchSvcSoapStub extends com.avalara.avatax.services.base.BaseSvcSoapStub implements BatchSvcSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchFetch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FetchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FetchRequest"), com.avalara.avatax.services.batch.FetchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFetchResult"));
        oper.setReturnClass(BatchFetchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFetchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchSave");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Batch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Batch"), Batch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchSaveResult"));
        oper.setReturnClass(BatchSaveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchSaveResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DeleteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DeleteRequest"), com.avalara.avatax.services.batch.DeleteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DeleteResult"));
        oper.setReturnClass(com.avalara.avatax.services.batch.DeleteResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchDeleteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchProcess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchProcessRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchProcessRequest"), BatchProcessRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchProcessResult"));
        oper.setReturnClass(BatchProcessResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchProcessResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchFileFetch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FetchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FetchRequest"), com.avalara.avatax.services.batch.FetchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFileFetchResult"));
        oper.setReturnClass(BatchFileFetchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFileFetchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchFileSave");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFile"), BatchFile.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFileSaveResult"));
        oper.setReturnClass(BatchFileSaveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFileSaveResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BatchFileDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DeleteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DeleteRequest"), com.avalara.avatax.services.batch.DeleteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DeleteResult"));
        oper.setReturnClass(com.avalara.avatax.services.batch.DeleteResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFileDeleteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Ping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PingResult"));
        oper.setReturnClass(com.avalara.avatax.services.batch.PingResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IsAuthorized");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorizedResult"));
        oper.setReturnClass(com.avalara.avatax.services.batch.IsAuthorizedResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorizedResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public BatchSvcSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BatchSvcSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BatchSvcSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfBatch");
            cachedSerQNames.add(qName);
            cls = ArrayOfBatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfBatchFile");
            cachedSerQNames.add(qName);
            cls = ArrayOfBatchFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfMessage");
            cachedSerQNames.add(qName);
            cls = ArrayOfMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BaseResult");
            cachedSerQNames.add(qName);
            cls = BaseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Batch");
            cachedSerQNames.add(qName);
            cls = Batch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFetchResult");
            cachedSerQNames.add(qName);
            cls = BatchFetchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFile");
            cachedSerQNames.add(qName);
            cls = BatchFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFileFetchResult");
            cachedSerQNames.add(qName);
            cls = BatchFileFetchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFileSaveResult");
            cachedSerQNames.add(qName);
            cls = BatchFileSaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchProcessRequest");
            cachedSerQNames.add(qName);
            cls = BatchProcessRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchProcessResult");
            cachedSerQNames.add(qName);
            cls = BatchProcessResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchSaveResult");
            cachedSerQNames.add(qName);
            cls = BatchSaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DeleteRequest");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.batch.DeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DeleteResult");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.batch.DeleteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FetchRequest");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.batch.FetchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilterRequest");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.batch.FilterRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilterResult");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.batch.FilterResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorizedResult");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.batch.IsAuthorizedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Message");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.batch.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PingResult");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.batch.PingResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SeverityLevel");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.batch.SeverityLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public BatchFetchResult batchFetch(com.avalara.avatax.services.batch.FetchRequest fetchRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/BatchFetch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFetch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {fetchRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (BatchFetchResult) _resp;
            } catch (Exception _exception) {
                return (BatchFetchResult) org.apache.axis.utils.JavaUtils.convert(_resp, BatchFetchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public BatchSaveResult batchSave(Batch batch) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/BatchSave");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchSave"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {batch});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (BatchSaveResult) _resp;
            } catch (Exception _exception) {
                return (BatchSaveResult) org.apache.axis.utils.JavaUtils.convert(_resp, BatchSaveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.avalara.avatax.services.batch.DeleteResult batchDelete(com.avalara.avatax.services.batch.DeleteRequest deleteRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/BatchDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {deleteRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.avalara.avatax.services.batch.DeleteResult) _resp;
            } catch (Exception _exception) {
                return (com.avalara.avatax.services.batch.DeleteResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.avalara.avatax.services.batch.DeleteResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public BatchProcessResult batchProcess(BatchProcessRequest batchProcessRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/BatchProcess");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchProcess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {batchProcessRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (BatchProcessResult) _resp;
            } catch (Exception _exception) {
                return (BatchProcessResult) org.apache.axis.utils.JavaUtils.convert(_resp, BatchProcessResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public BatchFileFetchResult batchFileFetch(com.avalara.avatax.services.batch.FetchRequest fetchRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/BatchFileFetch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFileFetch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {fetchRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (BatchFileFetchResult) _resp;
            } catch (Exception _exception) {
                return (BatchFileFetchResult) org.apache.axis.utils.JavaUtils.convert(_resp, BatchFileFetchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public BatchFileSaveResult batchFileSave(BatchFile batchFile) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/BatchFileSave");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFileSave"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {batchFile});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (BatchFileSaveResult) _resp;
            } catch (Exception _exception) {
                return (BatchFileSaveResult) org.apache.axis.utils.JavaUtils.convert(_resp, BatchFileSaveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.avalara.avatax.services.batch.DeleteResult batchFileDelete(com.avalara.avatax.services.batch.DeleteRequest deleteRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/BatchFileDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchFileDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {deleteRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.avalara.avatax.services.batch.DeleteResult) _resp;
            } catch (Exception _exception) {
                return (com.avalara.avatax.services.batch.DeleteResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.avalara.avatax.services.batch.DeleteResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.avalara.avatax.services.batch.PingResult ping(String message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/Ping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.avalara.avatax.services.batch.PingResult) _resp;
            } catch (Exception _exception) {
                return (com.avalara.avatax.services.batch.PingResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.avalara.avatax.services.batch.PingResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.avalara.avatax.services.batch.IsAuthorizedResult isAuthorized(String operations) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/IsAuthorized");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorized"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {operations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.avalara.avatax.services.batch.IsAuthorizedResult) _resp;
            } catch (Exception _exception) {
                return (com.avalara.avatax.services.batch.IsAuthorizedResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.avalara.avatax.services.batch.IsAuthorizedResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
