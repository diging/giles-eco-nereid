package edu.asu.diging.gilesecosystem.nereid.core.service;

import edu.asu.diging.gilesecosystem.requests.ICompletedStorageRequest;

public interface IFileService {

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.carolus.core.linnaeus.impl.IPathService#getStoragePath(edu.asu.diging.gilesecosystem.requests.ICompletedStorageRequest)
     */
    String getStoragePath(ICompletedStorageRequest request);

    byte[] getFileContent(String requestId, String documentId, String filename);

    void deleteFile(String requestId, String documentId, String filename);

    String getCSVFilename(ICompletedStorageRequest request);

}