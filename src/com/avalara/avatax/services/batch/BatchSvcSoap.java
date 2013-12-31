/**
 * BatchSvcSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.batch;

public interface BatchSvcSoap extends com.avalara.avatax.services.base.BaseSvcSoap {

    /**
     * Fetches one or more Batch
     */
    public BatchFetchResult batchFetch(com.avalara.avatax.services.batch.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Saves a Batch entry
     */
    public BatchSaveResult batchSave(Batch batch) throws java.rmi.RemoteException;

    /**
     * Deletes one or more Batches
     */
    public com.avalara.avatax.services.batch.DeleteResult batchDelete(com.avalara.avatax.services.batch.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Processes one or more Batches
     */
    public BatchProcessResult batchProcess(BatchProcessRequest batchProcessRequest) throws java.rmi.RemoteException;

    /**
     * Fetches one or more BatchFiles
     */
    public BatchFileFetchResult batchFileFetch(com.avalara.avatax.services.batch.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Saves a Batch File
     */
    public BatchFileSaveResult batchFileSave(BatchFile batchFile) throws java.rmi.RemoteException;

    /**
     * Deletes one or more BatchFiles
     */
    public com.avalara.avatax.services.batch.DeleteResult batchFileDelete(com.avalara.avatax.services.batch.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Tests connectivity and version of the service
     */
    public com.avalara.avatax.services.batch.PingResult ping(String message) throws java.rmi.RemoteException;

    /**
     * Checks authentication and authorization to one or more operations
     * on the service.
     */
    public com.avalara.avatax.services.batch.IsAuthorizedResult isAuthorized(String operations) throws java.rmi.RemoteException;
}
