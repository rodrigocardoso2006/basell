package com.datasul.technology.webdesk.dm.ws;

public class DocumentServiceProxy implements com.datasul.technology.webdesk.dm.ws.DocumentService {
  private String _endpoint = null;
  private com.datasul.technology.webdesk.dm.ws.DocumentService documentService = null;
  
  public DocumentServiceProxy() {
    _initDocumentServiceProxy();
  }
  
  public DocumentServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initDocumentServiceProxy();
  }
  
  private void _initDocumentServiceProxy() {
    try {
      documentService = (new com.datasul.technology.webdesk.dm.ws.DocumentServiceServiceLocator()).getDocumentServicePort();
      if (documentService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)documentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)documentService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (documentService != null)
      ((javax.xml.rpc.Stub)documentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentService getDocumentService() {
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService;
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] approveDocument(int companyId, java.lang.String userId, java.lang.String password, int documentId, int version, java.lang.String approverId, boolean approved, java.lang.String observation) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.approveDocument(companyId, userId, password, documentId, version, approverId, approved, observation);
  }
  
  public java.lang.String[] copyDocumentToUploadArea(java.lang.String user, java.lang.String password, int companyId, int documentId, int version, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.copyDocumentToUploadArea(user, password, companyId, documentId, version, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.CopyDocumentDto[] copyDocuments(int companyId, java.lang.String login, java.lang.String password, java.lang.String userId, int[] origins, int destination) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.copyDocuments(companyId, login, password, userId, origins, destination);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] createDocument(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverDto[] approvers, com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[] relatedDocuments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.createDocument(username, password, companyId, document, attachments, security, approvers, relatedDocuments);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] createDocumentWithApprovementLevels(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[] approversWithLevels, com.datasul.technology.webdesk.dm.ws.ApprovalLevelDto[] levels, com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[] relatedDocuments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.createDocumentWithApprovementLevels(username, password, companyId, document, attachments, security, approversWithLevels, levels, relatedDocuments);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] createSimpleDocument(java.lang.String username, java.lang.String password, int companyId, int parentDocumentId, java.lang.String publisherId, java.lang.String documentDescription, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.createSimpleDocument(username, password, companyId, parentDocumentId, publisherId, documentDescription, attachments);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] createSimpleDocumentPrivate(java.lang.String username, java.lang.String password, int companyId, int parentDocumentId, java.lang.String documentDescription, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.createSimpleDocumentPrivate(username, password, companyId, parentDocumentId, documentDescription, attachments);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] deleteDocument(java.lang.String user, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.deleteDocument(user, password, companyId, documentId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] destroyDocument(java.lang.String user, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.destroyDocument(user, password, companyId, documentId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] destroyDocumentApproval(java.lang.String userId, java.lang.String password, int companyId, int documentId, java.lang.String publisherId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.destroyDocumentApproval(userId, password, companyId, documentId, publisherId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] findMostPopularDocuments(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int nrResultados) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.findMostPopularDocuments(username, password, companyId, colleagueId, nrResultados);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] findMostPopularDocumentsOnDemand(int companyId, java.lang.String user, java.lang.String password, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.findMostPopularDocumentsOnDemand(companyId, user, password, colleagueId, limit, lastRowId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] findRecycledDocuments(java.lang.String user, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.findRecycledDocuments(user, password, companyId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getActiveDocument(java.lang.String username, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.getActiveDocument(username, password, companyId, documentId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[] getApprovers(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.getApprovers(username, password, companyId, documentId, version);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentApprovementHistoryDto[] getDocumentApprovalHistory(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.getDocumentApprovalHistory(username, password, companyId, documentId, version);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentApprovalStatusDto[] getDocumentApprovalStatus(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.getDocumentApprovalStatus(username, password, companyId, documentId, version);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getDocumentByExternalId(java.lang.String username, java.lang.String password, int companyId, java.lang.String externalDocumentnId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.getDocumentByExternalId(username, password, companyId, externalDocumentnId, colleagueId);
  }
  
  public byte[] getDocumentContent(java.lang.String username, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId, int documentoVersao, java.lang.String nomeArquivo) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.getDocumentContent(username, password, companyId, documentId, colleagueId, documentoVersao, nomeArquivo);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getDocumentVersion(java.lang.String username, java.lang.String password, int companyId, int documentId, int version, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.getDocumentVersion(username, password, companyId, documentId, version, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[] getRelatedDocuments(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.getRelatedDocuments(username, password, companyId, documentId, version);
  }
  
  public int getReportSubjectId(java.lang.String username, java.lang.String password, int companyId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.getReportSubjectId(username, password, companyId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] getSecurity(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.getSecurity(username, password, companyId, documentId, version);
  }
  
  public int getUserPermissions(int companyId, java.lang.String username, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.getUserPermissions(companyId, username, documentId, version);
  }
  
  public java.lang.String moveDocument(java.lang.String username, java.lang.String password, int companyId, int[] documentIds, java.lang.String colleagueId, int destFolderId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.moveDocument(username, password, companyId, documentIds, colleagueId, destFolderId);
  }
  
  public void removeSecurity(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    documentService.removeSecurity(username, password, companyId, documentId, version);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] restoreDocument(java.lang.String user, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.restoreDocument(user, password, companyId, documentId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateDocument(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverDto[] approvers, com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[] relatedDocuments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.updateDocument(username, password, companyId, document, attachments, security, approvers, relatedDocuments);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateDocumentConversionStatus(java.lang.String username, java.lang.String password, int companyId, int documentId, int version, int status, java.lang.String msg) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.updateDocumentConversionStatus(username, password, companyId, documentId, version, status, msg);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateDocumentWithApprovementLevels(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[] approversWithLevels, com.datasul.technology.webdesk.dm.ws.ApprovalLevelDto[] levels, com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[] relatedDocuments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.updateDocumentWithApprovementLevels(username, password, companyId, document, attachments, security, approversWithLevels, levels, relatedDocuments);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateGroupSecurityType(java.lang.String username, java.lang.String password, int companyId, int documentId, int version, int permissionType, int restrictionType, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.updateGroupSecurityType(username, password, companyId, documentId, version, permissionType, restrictionType, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateSimpleDocument(java.lang.String username, java.lang.String password, int companyId, int documentId, java.lang.String publisherId, java.lang.String documentDescription, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.updateSimpleDocument(username, password, companyId, documentId, publisherId, documentDescription, attachments);
  }
  
  public java.lang.String validateIntegrationRequirements(java.lang.String username, java.lang.String password, int companyId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.validateIntegrationRequirements(username, password, companyId);
  }
  
  
}