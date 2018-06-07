package com.datasul.technology.webdesk.dm.ws;

public class FolderServiceProxy implements com.datasul.technology.webdesk.dm.ws.FolderService {
  private String _endpoint = null;
  private com.datasul.technology.webdesk.dm.ws.FolderService folderService = null;
  
  public FolderServiceProxy() {
    _initFolderServiceProxy();
  }
  
  public FolderServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFolderServiceProxy();
  }
  
  private void _initFolderServiceProxy() {
    try {
      folderService = (new com.datasul.technology.webdesk.dm.ws.FolderServiceServiceLocator()).getFolderServicePort();
      if (folderService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)folderService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)folderService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (folderService != null)
      ((javax.xml.rpc.Stub)folderService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.datasul.technology.webdesk.dm.ws.FolderService getFolderService() {
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService;
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] createFolder(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverDto[] approvers) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.createFolder(username, password, companyId, document, security, approvers);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] createFolderWithApprovementLevels(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[] approversWithLevels, com.datasul.technology.webdesk.dm.ws.ApprovalLevelDto[] levels) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.createFolderWithApprovementLevels(username, password, companyId, document, security, approversWithLevels, levels);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] createSimpleFolder(java.lang.String username, java.lang.String password, int companyId, int parentDocumentId, java.lang.String publisherId, java.lang.String documentDescription) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.createSimpleFolder(username, password, companyId, parentDocumentId, publisherId, documentDescription);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] deleteDocument(java.lang.String user, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.deleteDocument(user, password, companyId, documentId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] destroyDocument(java.lang.String user, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.destroyDocument(user, password, companyId, documentId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] findRecycledDocuments(java.lang.String user, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.findRecycledDocuments(user, password, companyId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[] getApprovers(java.lang.String username, java.lang.String password, int companyId, int documentId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.getApprovers(username, password, companyId, documentId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getChildren(java.lang.String username, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.getChildren(username, password, companyId, documentId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getFolder(java.lang.String username, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.getFolder(username, password, companyId, documentId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getPrivateChildren(java.lang.String username, java.lang.String password, int companyId, int parentDocumentId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.getPrivateChildren(username, password, companyId, parentDocumentId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getRootFolders(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.getRootFolders(username, password, companyId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] getSecurity(java.lang.String username, java.lang.String password, int companyId, int documentId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.getSecurity(username, password, companyId, documentId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getSubFolders(java.lang.String username, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.getSubFolders(username, password, companyId, documentId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getSubFoldersOnDemand(int companyId, java.lang.String user, java.lang.String password, int parentDocumentId, boolean privateFolder, java.lang.String[] documentTypes, int limit, int lastRowId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.getSubFoldersOnDemand(companyId, user, password, parentDocumentId, privateFolder, documentTypes, limit, lastRowId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getSubFoldersPermission(java.lang.String username, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId, int permission) throws java.rmi.RemoteException{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.getSubFoldersPermission(username, password, companyId, documentId, colleagueId, permission);
  }
  
  public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getSubPrivateFolders(java.lang.String username, java.lang.String password, int companyId, int documentId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.getSubPrivateFolders(username, password, companyId, documentId);
  }
  
  public int getUserPermissions(int companyId, java.lang.String username, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.getUserPermissions(companyId, username, documentId, version);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] restoreDocument(java.lang.String user, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.restoreDocument(user, password, companyId, documentId, colleagueId);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateFolder(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverDto[] approvers) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.updateFolder(username, password, companyId, document, security, approvers);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateFolderWithApprovementLevels(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[] approversWithLevels, com.datasul.technology.webdesk.dm.ws.ApprovalLevelDto[] levels) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.updateFolderWithApprovementLevels(username, password, companyId, document, security, approversWithLevels, levels);
  }
  
  public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateSimpleFolder(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception{
    if (folderService == null)
      _initFolderServiceProxy();
    return folderService.updateSimpleFolder(username, password, companyId, document);
  }
  
  
}