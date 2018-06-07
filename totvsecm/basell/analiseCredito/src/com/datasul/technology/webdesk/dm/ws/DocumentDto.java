/**
 * DocumentDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.datasul.technology.webdesk.dm.ws;

public class DocumentDto  implements java.io.Serializable {
    private java.lang.Integer accessCount;

    private java.lang.Boolean activeVersion;

    private java.lang.String additionalComments;

    private java.lang.Boolean approvalAndOr;

    private java.lang.Boolean approved;

    private java.util.Calendar approvedDate;

    private java.lang.Integer atualizationId;

    private java.lang.String backgroundColor;

    private java.lang.String backgroundImage;

    private java.lang.String bannerImage;

    private java.lang.String cardDescription;

    private java.lang.String colleagueId;

    private java.lang.String colleagueName;

    private int companyId;

    private java.lang.Long crc;

    private java.util.Calendar createDate;

    private java.lang.String datasetName;

    private java.lang.Boolean deleted;

    private java.lang.String documentDescription;

    private java.lang.Integer documentId;

    private java.lang.String documentKeyWord;

    private java.lang.Integer documentPropertyNumber;

    private java.lang.Integer documentPropertyVersion;

    private java.lang.String documentType;

    private java.lang.String documentTypeId;

    private java.lang.Boolean downloadEnabled;

    private java.lang.Boolean draft;

    private java.util.Calendar expirationDate;

    private java.lang.Boolean expires;

    private java.lang.String externalDocumentId;

    private java.lang.Integer folderId;

    private java.lang.String[] foo;

    private java.lang.Integer iconId;

    private java.lang.Boolean imutable;

    private java.lang.Boolean indexed;

    private boolean inheritSecurity;

    private java.lang.Boolean internalVisualizer;

    private java.lang.Boolean isEncrypted;

    private java.lang.String keyWord;

    private java.lang.String languageId;

    private java.lang.String languageIndicator;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String lastModifiedTime;

    private java.lang.Boolean newStructure;

    private java.lang.Integer parentDocumentId;

    private java.lang.String phisicalFile;

    private java.lang.Float phisicalFileSize;

    private java.lang.Integer priority;

    private java.lang.String privateColleagueId;

    private java.lang.Boolean privateDocument;

    private java.lang.Boolean protectedCopy;

    private java.lang.String publisherId;

    private java.lang.String relatedFiles;

    private int rowId;

    private java.lang.Integer searchNumber;

    private int securityLevel;

    private java.lang.Boolean tool;

    private java.lang.Integer topicId;

    private boolean translated;

    private java.lang.String UUID;

    private boolean updateIsoProperties;

    private java.lang.Boolean userNotify;

    private java.util.Calendar validationStartDate;

    private int version;

    private java.lang.String versionDescription;

    private java.lang.String versionOption;

    private java.lang.String visualization;

    private java.lang.String volumeId;

    public DocumentDto() {
    }

    public DocumentDto(
           java.lang.Integer accessCount,
           java.lang.Boolean activeVersion,
           java.lang.String additionalComments,
           java.lang.Boolean approvalAndOr,
           java.lang.Boolean approved,
           java.util.Calendar approvedDate,
           java.lang.Integer atualizationId,
           java.lang.String backgroundColor,
           java.lang.String backgroundImage,
           java.lang.String bannerImage,
           java.lang.String cardDescription,
           java.lang.String colleagueId,
           java.lang.String colleagueName,
           int companyId,
           java.lang.Long crc,
           java.util.Calendar createDate,
           java.lang.String datasetName,
           java.lang.Boolean deleted,
           java.lang.String documentDescription,
           java.lang.Integer documentId,
           java.lang.String documentKeyWord,
           java.lang.Integer documentPropertyNumber,
           java.lang.Integer documentPropertyVersion,
           java.lang.String documentType,
           java.lang.String documentTypeId,
           java.lang.Boolean downloadEnabled,
           java.lang.Boolean draft,
           java.util.Calendar expirationDate,
           java.lang.Boolean expires,
           java.lang.String externalDocumentId,
           java.lang.Integer folderId,
           java.lang.String[] foo,
           java.lang.Integer iconId,
           java.lang.Boolean imutable,
           java.lang.Boolean indexed,
           boolean inheritSecurity,
           java.lang.Boolean internalVisualizer,
           java.lang.Boolean isEncrypted,
           java.lang.String keyWord,
           java.lang.String languageId,
           java.lang.String languageIndicator,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastModifiedTime,
           java.lang.Boolean newStructure,
           java.lang.Integer parentDocumentId,
           java.lang.String phisicalFile,
           java.lang.Float phisicalFileSize,
           java.lang.Integer priority,
           java.lang.String privateColleagueId,
           java.lang.Boolean privateDocument,
           java.lang.Boolean protectedCopy,
           java.lang.String publisherId,
           java.lang.String relatedFiles,
           int rowId,
           java.lang.Integer searchNumber,
           int securityLevel,
           java.lang.Boolean tool,
           java.lang.Integer topicId,
           boolean translated,
           java.lang.String UUID,
           boolean updateIsoProperties,
           java.lang.Boolean userNotify,
           java.util.Calendar validationStartDate,
           int version,
           java.lang.String versionDescription,
           java.lang.String versionOption,
           java.lang.String visualization,
           java.lang.String volumeId) {
           this.accessCount = accessCount;
           this.activeVersion = activeVersion;
           this.additionalComments = additionalComments;
           this.approvalAndOr = approvalAndOr;
           this.approved = approved;
           this.approvedDate = approvedDate;
           this.atualizationId = atualizationId;
           this.backgroundColor = backgroundColor;
           this.backgroundImage = backgroundImage;
           this.bannerImage = bannerImage;
           this.cardDescription = cardDescription;
           this.colleagueId = colleagueId;
           this.colleagueName = colleagueName;
           this.companyId = companyId;
           this.crc = crc;
           this.createDate = createDate;
           this.datasetName = datasetName;
           this.deleted = deleted;
           this.documentDescription = documentDescription;
           this.documentId = documentId;
           this.documentKeyWord = documentKeyWord;
           this.documentPropertyNumber = documentPropertyNumber;
           this.documentPropertyVersion = documentPropertyVersion;
           this.documentType = documentType;
           this.documentTypeId = documentTypeId;
           this.downloadEnabled = downloadEnabled;
           this.draft = draft;
           this.expirationDate = expirationDate;
           this.expires = expires;
           this.externalDocumentId = externalDocumentId;
           this.folderId = folderId;
           this.foo = foo;
           this.iconId = iconId;
           this.imutable = imutable;
           this.indexed = indexed;
           this.inheritSecurity = inheritSecurity;
           this.internalVisualizer = internalVisualizer;
           this.isEncrypted = isEncrypted;
           this.keyWord = keyWord;
           this.languageId = languageId;
           this.languageIndicator = languageIndicator;
           this.lastModifiedDate = lastModifiedDate;
           this.lastModifiedTime = lastModifiedTime;
           this.newStructure = newStructure;
           this.parentDocumentId = parentDocumentId;
           this.phisicalFile = phisicalFile;
           this.phisicalFileSize = phisicalFileSize;
           this.priority = priority;
           this.privateColleagueId = privateColleagueId;
           this.privateDocument = privateDocument;
           this.protectedCopy = protectedCopy;
           this.publisherId = publisherId;
           this.relatedFiles = relatedFiles;
           this.rowId = rowId;
           this.searchNumber = searchNumber;
           this.securityLevel = securityLevel;
           this.tool = tool;
           this.topicId = topicId;
           this.translated = translated;
           this.UUID = UUID;
           this.updateIsoProperties = updateIsoProperties;
           this.userNotify = userNotify;
           this.validationStartDate = validationStartDate;
           this.version = version;
           this.versionDescription = versionDescription;
           this.versionOption = versionOption;
           this.visualization = visualization;
           this.volumeId = volumeId;
    }


    /**
     * Gets the accessCount value for this DocumentDto.
     * 
     * @return accessCount
     */
    public java.lang.Integer getAccessCount() {
        return accessCount;
    }


    /**
     * Sets the accessCount value for this DocumentDto.
     * 
     * @param accessCount
     */
    public void setAccessCount(java.lang.Integer accessCount) {
        this.accessCount = accessCount;
    }


    /**
     * Gets the activeVersion value for this DocumentDto.
     * 
     * @return activeVersion
     */
    public java.lang.Boolean getActiveVersion() {
        return activeVersion;
    }


    /**
     * Sets the activeVersion value for this DocumentDto.
     * 
     * @param activeVersion
     */
    public void setActiveVersion(java.lang.Boolean activeVersion) {
        this.activeVersion = activeVersion;
    }


    /**
     * Gets the additionalComments value for this DocumentDto.
     * 
     * @return additionalComments
     */
    public java.lang.String getAdditionalComments() {
        return additionalComments;
    }


    /**
     * Sets the additionalComments value for this DocumentDto.
     * 
     * @param additionalComments
     */
    public void setAdditionalComments(java.lang.String additionalComments) {
        this.additionalComments = additionalComments;
    }


    /**
     * Gets the approvalAndOr value for this DocumentDto.
     * 
     * @return approvalAndOr
     */
    public java.lang.Boolean getApprovalAndOr() {
        return approvalAndOr;
    }


    /**
     * Sets the approvalAndOr value for this DocumentDto.
     * 
     * @param approvalAndOr
     */
    public void setApprovalAndOr(java.lang.Boolean approvalAndOr) {
        this.approvalAndOr = approvalAndOr;
    }


    /**
     * Gets the approved value for this DocumentDto.
     * 
     * @return approved
     */
    public java.lang.Boolean getApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this DocumentDto.
     * 
     * @param approved
     */
    public void setApproved(java.lang.Boolean approved) {
        this.approved = approved;
    }


    /**
     * Gets the approvedDate value for this DocumentDto.
     * 
     * @return approvedDate
     */
    public java.util.Calendar getApprovedDate() {
        return approvedDate;
    }


    /**
     * Sets the approvedDate value for this DocumentDto.
     * 
     * @param approvedDate
     */
    public void setApprovedDate(java.util.Calendar approvedDate) {
        this.approvedDate = approvedDate;
    }


    /**
     * Gets the atualizationId value for this DocumentDto.
     * 
     * @return atualizationId
     */
    public java.lang.Integer getAtualizationId() {
        return atualizationId;
    }


    /**
     * Sets the atualizationId value for this DocumentDto.
     * 
     * @param atualizationId
     */
    public void setAtualizationId(java.lang.Integer atualizationId) {
        this.atualizationId = atualizationId;
    }


    /**
     * Gets the backgroundColor value for this DocumentDto.
     * 
     * @return backgroundColor
     */
    public java.lang.String getBackgroundColor() {
        return backgroundColor;
    }


    /**
     * Sets the backgroundColor value for this DocumentDto.
     * 
     * @param backgroundColor
     */
    public void setBackgroundColor(java.lang.String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }


    /**
     * Gets the backgroundImage value for this DocumentDto.
     * 
     * @return backgroundImage
     */
    public java.lang.String getBackgroundImage() {
        return backgroundImage;
    }


    /**
     * Sets the backgroundImage value for this DocumentDto.
     * 
     * @param backgroundImage
     */
    public void setBackgroundImage(java.lang.String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }


    /**
     * Gets the bannerImage value for this DocumentDto.
     * 
     * @return bannerImage
     */
    public java.lang.String getBannerImage() {
        return bannerImage;
    }


    /**
     * Sets the bannerImage value for this DocumentDto.
     * 
     * @param bannerImage
     */
    public void setBannerImage(java.lang.String bannerImage) {
        this.bannerImage = bannerImage;
    }


    /**
     * Gets the cardDescription value for this DocumentDto.
     * 
     * @return cardDescription
     */
    public java.lang.String getCardDescription() {
        return cardDescription;
    }


    /**
     * Sets the cardDescription value for this DocumentDto.
     * 
     * @param cardDescription
     */
    public void setCardDescription(java.lang.String cardDescription) {
        this.cardDescription = cardDescription;
    }


    /**
     * Gets the colleagueId value for this DocumentDto.
     * 
     * @return colleagueId
     */
    public java.lang.String getColleagueId() {
        return colleagueId;
    }


    /**
     * Sets the colleagueId value for this DocumentDto.
     * 
     * @param colleagueId
     */
    public void setColleagueId(java.lang.String colleagueId) {
        this.colleagueId = colleagueId;
    }


    /**
     * Gets the colleagueName value for this DocumentDto.
     * 
     * @return colleagueName
     */
    public java.lang.String getColleagueName() {
        return colleagueName;
    }


    /**
     * Sets the colleagueName value for this DocumentDto.
     * 
     * @param colleagueName
     */
    public void setColleagueName(java.lang.String colleagueName) {
        this.colleagueName = colleagueName;
    }


    /**
     * Gets the companyId value for this DocumentDto.
     * 
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this DocumentDto.
     * 
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the crc value for this DocumentDto.
     * 
     * @return crc
     */
    public java.lang.Long getCrc() {
        return crc;
    }


    /**
     * Sets the crc value for this DocumentDto.
     * 
     * @param crc
     */
    public void setCrc(java.lang.Long crc) {
        this.crc = crc;
    }


    /**
     * Gets the createDate value for this DocumentDto.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this DocumentDto.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the datasetName value for this DocumentDto.
     * 
     * @return datasetName
     */
    public java.lang.String getDatasetName() {
        return datasetName;
    }


    /**
     * Sets the datasetName value for this DocumentDto.
     * 
     * @param datasetName
     */
    public void setDatasetName(java.lang.String datasetName) {
        this.datasetName = datasetName;
    }


    /**
     * Gets the deleted value for this DocumentDto.
     * 
     * @return deleted
     */
    public java.lang.Boolean getDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this DocumentDto.
     * 
     * @param deleted
     */
    public void setDeleted(java.lang.Boolean deleted) {
        this.deleted = deleted;
    }


    /**
     * Gets the documentDescription value for this DocumentDto.
     * 
     * @return documentDescription
     */
    public java.lang.String getDocumentDescription() {
        return documentDescription;
    }


    /**
     * Sets the documentDescription value for this DocumentDto.
     * 
     * @param documentDescription
     */
    public void setDocumentDescription(java.lang.String documentDescription) {
        this.documentDescription = documentDescription;
    }


    /**
     * Gets the documentId value for this DocumentDto.
     * 
     * @return documentId
     */
    public java.lang.Integer getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this DocumentDto.
     * 
     * @param documentId
     */
    public void setDocumentId(java.lang.Integer documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the documentKeyWord value for this DocumentDto.
     * 
     * @return documentKeyWord
     */
    public java.lang.String getDocumentKeyWord() {
        return documentKeyWord;
    }


    /**
     * Sets the documentKeyWord value for this DocumentDto.
     * 
     * @param documentKeyWord
     */
    public void setDocumentKeyWord(java.lang.String documentKeyWord) {
        this.documentKeyWord = documentKeyWord;
    }


    /**
     * Gets the documentPropertyNumber value for this DocumentDto.
     * 
     * @return documentPropertyNumber
     */
    public java.lang.Integer getDocumentPropertyNumber() {
        return documentPropertyNumber;
    }


    /**
     * Sets the documentPropertyNumber value for this DocumentDto.
     * 
     * @param documentPropertyNumber
     */
    public void setDocumentPropertyNumber(java.lang.Integer documentPropertyNumber) {
        this.documentPropertyNumber = documentPropertyNumber;
    }


    /**
     * Gets the documentPropertyVersion value for this DocumentDto.
     * 
     * @return documentPropertyVersion
     */
    public java.lang.Integer getDocumentPropertyVersion() {
        return documentPropertyVersion;
    }


    /**
     * Sets the documentPropertyVersion value for this DocumentDto.
     * 
     * @param documentPropertyVersion
     */
    public void setDocumentPropertyVersion(java.lang.Integer documentPropertyVersion) {
        this.documentPropertyVersion = documentPropertyVersion;
    }


    /**
     * Gets the documentType value for this DocumentDto.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this DocumentDto.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the documentTypeId value for this DocumentDto.
     * 
     * @return documentTypeId
     */
    public java.lang.String getDocumentTypeId() {
        return documentTypeId;
    }


    /**
     * Sets the documentTypeId value for this DocumentDto.
     * 
     * @param documentTypeId
     */
    public void setDocumentTypeId(java.lang.String documentTypeId) {
        this.documentTypeId = documentTypeId;
    }


    /**
     * Gets the downloadEnabled value for this DocumentDto.
     * 
     * @return downloadEnabled
     */
    public java.lang.Boolean getDownloadEnabled() {
        return downloadEnabled;
    }


    /**
     * Sets the downloadEnabled value for this DocumentDto.
     * 
     * @param downloadEnabled
     */
    public void setDownloadEnabled(java.lang.Boolean downloadEnabled) {
        this.downloadEnabled = downloadEnabled;
    }


    /**
     * Gets the draft value for this DocumentDto.
     * 
     * @return draft
     */
    public java.lang.Boolean getDraft() {
        return draft;
    }


    /**
     * Sets the draft value for this DocumentDto.
     * 
     * @param draft
     */
    public void setDraft(java.lang.Boolean draft) {
        this.draft = draft;
    }


    /**
     * Gets the expirationDate value for this DocumentDto.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this DocumentDto.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the expires value for this DocumentDto.
     * 
     * @return expires
     */
    public java.lang.Boolean getExpires() {
        return expires;
    }


    /**
     * Sets the expires value for this DocumentDto.
     * 
     * @param expires
     */
    public void setExpires(java.lang.Boolean expires) {
        this.expires = expires;
    }


    /**
     * Gets the externalDocumentId value for this DocumentDto.
     * 
     * @return externalDocumentId
     */
    public java.lang.String getExternalDocumentId() {
        return externalDocumentId;
    }


    /**
     * Sets the externalDocumentId value for this DocumentDto.
     * 
     * @param externalDocumentId
     */
    public void setExternalDocumentId(java.lang.String externalDocumentId) {
        this.externalDocumentId = externalDocumentId;
    }


    /**
     * Gets the folderId value for this DocumentDto.
     * 
     * @return folderId
     */
    public java.lang.Integer getFolderId() {
        return folderId;
    }


    /**
     * Sets the folderId value for this DocumentDto.
     * 
     * @param folderId
     */
    public void setFolderId(java.lang.Integer folderId) {
        this.folderId = folderId;
    }


    /**
     * Gets the foo value for this DocumentDto.
     * 
     * @return foo
     */
    public java.lang.String[] getFoo() {
        return foo;
    }


    /**
     * Sets the foo value for this DocumentDto.
     * 
     * @param foo
     */
    public void setFoo(java.lang.String[] foo) {
        this.foo = foo;
    }

    public java.lang.String getFoo(int i) {
        return this.foo[i];
    }

    public void setFoo(int i, java.lang.String _value) {
        this.foo[i] = _value;
    }


    /**
     * Gets the iconId value for this DocumentDto.
     * 
     * @return iconId
     */
    public java.lang.Integer getIconId() {
        return iconId;
    }


    /**
     * Sets the iconId value for this DocumentDto.
     * 
     * @param iconId
     */
    public void setIconId(java.lang.Integer iconId) {
        this.iconId = iconId;
    }


    /**
     * Gets the imutable value for this DocumentDto.
     * 
     * @return imutable
     */
    public java.lang.Boolean getImutable() {
        return imutable;
    }


    /**
     * Sets the imutable value for this DocumentDto.
     * 
     * @param imutable
     */
    public void setImutable(java.lang.Boolean imutable) {
        this.imutable = imutable;
    }


    /**
     * Gets the indexed value for this DocumentDto.
     * 
     * @return indexed
     */
    public java.lang.Boolean getIndexed() {
        return indexed;
    }


    /**
     * Sets the indexed value for this DocumentDto.
     * 
     * @param indexed
     */
    public void setIndexed(java.lang.Boolean indexed) {
        this.indexed = indexed;
    }


    /**
     * Gets the inheritSecurity value for this DocumentDto.
     * 
     * @return inheritSecurity
     */
    public boolean isInheritSecurity() {
        return inheritSecurity;
    }


    /**
     * Sets the inheritSecurity value for this DocumentDto.
     * 
     * @param inheritSecurity
     */
    public void setInheritSecurity(boolean inheritSecurity) {
        this.inheritSecurity = inheritSecurity;
    }


    /**
     * Gets the internalVisualizer value for this DocumentDto.
     * 
     * @return internalVisualizer
     */
    public java.lang.Boolean getInternalVisualizer() {
        return internalVisualizer;
    }


    /**
     * Sets the internalVisualizer value for this DocumentDto.
     * 
     * @param internalVisualizer
     */
    public void setInternalVisualizer(java.lang.Boolean internalVisualizer) {
        this.internalVisualizer = internalVisualizer;
    }


    /**
     * Gets the isEncrypted value for this DocumentDto.
     * 
     * @return isEncrypted
     */
    public java.lang.Boolean getIsEncrypted() {
        return isEncrypted;
    }


    /**
     * Sets the isEncrypted value for this DocumentDto.
     * 
     * @param isEncrypted
     */
    public void setIsEncrypted(java.lang.Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }


    /**
     * Gets the keyWord value for this DocumentDto.
     * 
     * @return keyWord
     */
    public java.lang.String getKeyWord() {
        return keyWord;
    }


    /**
     * Sets the keyWord value for this DocumentDto.
     * 
     * @param keyWord
     */
    public void setKeyWord(java.lang.String keyWord) {
        this.keyWord = keyWord;
    }


    /**
     * Gets the languageId value for this DocumentDto.
     * 
     * @return languageId
     */
    public java.lang.String getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this DocumentDto.
     * 
     * @param languageId
     */
    public void setLanguageId(java.lang.String languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the languageIndicator value for this DocumentDto.
     * 
     * @return languageIndicator
     */
    public java.lang.String getLanguageIndicator() {
        return languageIndicator;
    }


    /**
     * Sets the languageIndicator value for this DocumentDto.
     * 
     * @param languageIndicator
     */
    public void setLanguageIndicator(java.lang.String languageIndicator) {
        this.languageIndicator = languageIndicator;
    }


    /**
     * Gets the lastModifiedDate value for this DocumentDto.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this DocumentDto.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastModifiedTime value for this DocumentDto.
     * 
     * @return lastModifiedTime
     */
    public java.lang.String getLastModifiedTime() {
        return lastModifiedTime;
    }


    /**
     * Sets the lastModifiedTime value for this DocumentDto.
     * 
     * @param lastModifiedTime
     */
    public void setLastModifiedTime(java.lang.String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }


    /**
     * Gets the newStructure value for this DocumentDto.
     * 
     * @return newStructure
     */
    public java.lang.Boolean getNewStructure() {
        return newStructure;
    }


    /**
     * Sets the newStructure value for this DocumentDto.
     * 
     * @param newStructure
     */
    public void setNewStructure(java.lang.Boolean newStructure) {
        this.newStructure = newStructure;
    }


    /**
     * Gets the parentDocumentId value for this DocumentDto.
     * 
     * @return parentDocumentId
     */
    public java.lang.Integer getParentDocumentId() {
        return parentDocumentId;
    }


    /**
     * Sets the parentDocumentId value for this DocumentDto.
     * 
     * @param parentDocumentId
     */
    public void setParentDocumentId(java.lang.Integer parentDocumentId) {
        this.parentDocumentId = parentDocumentId;
    }


    /**
     * Gets the phisicalFile value for this DocumentDto.
     * 
     * @return phisicalFile
     */
    public java.lang.String getPhisicalFile() {
        return phisicalFile;
    }


    /**
     * Sets the phisicalFile value for this DocumentDto.
     * 
     * @param phisicalFile
     */
    public void setPhisicalFile(java.lang.String phisicalFile) {
        this.phisicalFile = phisicalFile;
    }


    /**
     * Gets the phisicalFileSize value for this DocumentDto.
     * 
     * @return phisicalFileSize
     */
    public java.lang.Float getPhisicalFileSize() {
        return phisicalFileSize;
    }


    /**
     * Sets the phisicalFileSize value for this DocumentDto.
     * 
     * @param phisicalFileSize
     */
    public void setPhisicalFileSize(java.lang.Float phisicalFileSize) {
        this.phisicalFileSize = phisicalFileSize;
    }


    /**
     * Gets the priority value for this DocumentDto.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this DocumentDto.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the privateColleagueId value for this DocumentDto.
     * 
     * @return privateColleagueId
     */
    public java.lang.String getPrivateColleagueId() {
        return privateColleagueId;
    }


    /**
     * Sets the privateColleagueId value for this DocumentDto.
     * 
     * @param privateColleagueId
     */
    public void setPrivateColleagueId(java.lang.String privateColleagueId) {
        this.privateColleagueId = privateColleagueId;
    }


    /**
     * Gets the privateDocument value for this DocumentDto.
     * 
     * @return privateDocument
     */
    public java.lang.Boolean getPrivateDocument() {
        return privateDocument;
    }


    /**
     * Sets the privateDocument value for this DocumentDto.
     * 
     * @param privateDocument
     */
    public void setPrivateDocument(java.lang.Boolean privateDocument) {
        this.privateDocument = privateDocument;
    }


    /**
     * Gets the protectedCopy value for this DocumentDto.
     * 
     * @return protectedCopy
     */
    public java.lang.Boolean getProtectedCopy() {
        return protectedCopy;
    }


    /**
     * Sets the protectedCopy value for this DocumentDto.
     * 
     * @param protectedCopy
     */
    public void setProtectedCopy(java.lang.Boolean protectedCopy) {
        this.protectedCopy = protectedCopy;
    }


    /**
     * Gets the publisherId value for this DocumentDto.
     * 
     * @return publisherId
     */
    public java.lang.String getPublisherId() {
        return publisherId;
    }


    /**
     * Sets the publisherId value for this DocumentDto.
     * 
     * @param publisherId
     */
    public void setPublisherId(java.lang.String publisherId) {
        this.publisherId = publisherId;
    }


    /**
     * Gets the relatedFiles value for this DocumentDto.
     * 
     * @return relatedFiles
     */
    public java.lang.String getRelatedFiles() {
        return relatedFiles;
    }


    /**
     * Sets the relatedFiles value for this DocumentDto.
     * 
     * @param relatedFiles
     */
    public void setRelatedFiles(java.lang.String relatedFiles) {
        this.relatedFiles = relatedFiles;
    }


    /**
     * Gets the rowId value for this DocumentDto.
     * 
     * @return rowId
     */
    public int getRowId() {
        return rowId;
    }


    /**
     * Sets the rowId value for this DocumentDto.
     * 
     * @param rowId
     */
    public void setRowId(int rowId) {
        this.rowId = rowId;
    }


    /**
     * Gets the searchNumber value for this DocumentDto.
     * 
     * @return searchNumber
     */
    public java.lang.Integer getSearchNumber() {
        return searchNumber;
    }


    /**
     * Sets the searchNumber value for this DocumentDto.
     * 
     * @param searchNumber
     */
    public void setSearchNumber(java.lang.Integer searchNumber) {
        this.searchNumber = searchNumber;
    }


    /**
     * Gets the securityLevel value for this DocumentDto.
     * 
     * @return securityLevel
     */
    public int getSecurityLevel() {
        return securityLevel;
    }


    /**
     * Sets the securityLevel value for this DocumentDto.
     * 
     * @param securityLevel
     */
    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }


    /**
     * Gets the tool value for this DocumentDto.
     * 
     * @return tool
     */
    public java.lang.Boolean getTool() {
        return tool;
    }


    /**
     * Sets the tool value for this DocumentDto.
     * 
     * @param tool
     */
    public void setTool(java.lang.Boolean tool) {
        this.tool = tool;
    }


    /**
     * Gets the topicId value for this DocumentDto.
     * 
     * @return topicId
     */
    public java.lang.Integer getTopicId() {
        return topicId;
    }


    /**
     * Sets the topicId value for this DocumentDto.
     * 
     * @param topicId
     */
    public void setTopicId(java.lang.Integer topicId) {
        this.topicId = topicId;
    }


    /**
     * Gets the translated value for this DocumentDto.
     * 
     * @return translated
     */
    public boolean isTranslated() {
        return translated;
    }


    /**
     * Sets the translated value for this DocumentDto.
     * 
     * @param translated
     */
    public void setTranslated(boolean translated) {
        this.translated = translated;
    }


    /**
     * Gets the UUID value for this DocumentDto.
     * 
     * @return UUID
     */
    public java.lang.String getUUID() {
        return UUID;
    }


    /**
     * Sets the UUID value for this DocumentDto.
     * 
     * @param UUID
     */
    public void setUUID(java.lang.String UUID) {
        this.UUID = UUID;
    }


    /**
     * Gets the updateIsoProperties value for this DocumentDto.
     * 
     * @return updateIsoProperties
     */
    public boolean isUpdateIsoProperties() {
        return updateIsoProperties;
    }


    /**
     * Sets the updateIsoProperties value for this DocumentDto.
     * 
     * @param updateIsoProperties
     */
    public void setUpdateIsoProperties(boolean updateIsoProperties) {
        this.updateIsoProperties = updateIsoProperties;
    }


    /**
     * Gets the userNotify value for this DocumentDto.
     * 
     * @return userNotify
     */
    public java.lang.Boolean getUserNotify() {
        return userNotify;
    }


    /**
     * Sets the userNotify value for this DocumentDto.
     * 
     * @param userNotify
     */
    public void setUserNotify(java.lang.Boolean userNotify) {
        this.userNotify = userNotify;
    }


    /**
     * Gets the validationStartDate value for this DocumentDto.
     * 
     * @return validationStartDate
     */
    public java.util.Calendar getValidationStartDate() {
        return validationStartDate;
    }


    /**
     * Sets the validationStartDate value for this DocumentDto.
     * 
     * @param validationStartDate
     */
    public void setValidationStartDate(java.util.Calendar validationStartDate) {
        this.validationStartDate = validationStartDate;
    }


    /**
     * Gets the version value for this DocumentDto.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this DocumentDto.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the versionDescription value for this DocumentDto.
     * 
     * @return versionDescription
     */
    public java.lang.String getVersionDescription() {
        return versionDescription;
    }


    /**
     * Sets the versionDescription value for this DocumentDto.
     * 
     * @param versionDescription
     */
    public void setVersionDescription(java.lang.String versionDescription) {
        this.versionDescription = versionDescription;
    }


    /**
     * Gets the versionOption value for this DocumentDto.
     * 
     * @return versionOption
     */
    public java.lang.String getVersionOption() {
        return versionOption;
    }


    /**
     * Sets the versionOption value for this DocumentDto.
     * 
     * @param versionOption
     */
    public void setVersionOption(java.lang.String versionOption) {
        this.versionOption = versionOption;
    }


    /**
     * Gets the visualization value for this DocumentDto.
     * 
     * @return visualization
     */
    public java.lang.String getVisualization() {
        return visualization;
    }


    /**
     * Sets the visualization value for this DocumentDto.
     * 
     * @param visualization
     */
    public void setVisualization(java.lang.String visualization) {
        this.visualization = visualization;
    }


    /**
     * Gets the volumeId value for this DocumentDto.
     * 
     * @return volumeId
     */
    public java.lang.String getVolumeId() {
        return volumeId;
    }


    /**
     * Sets the volumeId value for this DocumentDto.
     * 
     * @param volumeId
     */
    public void setVolumeId(java.lang.String volumeId) {
        this.volumeId = volumeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentDto)) return false;
        DocumentDto other = (DocumentDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessCount==null && other.getAccessCount()==null) || 
             (this.accessCount!=null &&
              this.accessCount.equals(other.getAccessCount()))) &&
            ((this.activeVersion==null && other.getActiveVersion()==null) || 
             (this.activeVersion!=null &&
              this.activeVersion.equals(other.getActiveVersion()))) &&
            ((this.additionalComments==null && other.getAdditionalComments()==null) || 
             (this.additionalComments!=null &&
              this.additionalComments.equals(other.getAdditionalComments()))) &&
            ((this.approvalAndOr==null && other.getApprovalAndOr()==null) || 
             (this.approvalAndOr!=null &&
              this.approvalAndOr.equals(other.getApprovalAndOr()))) &&
            ((this.approved==null && other.getApproved()==null) || 
             (this.approved!=null &&
              this.approved.equals(other.getApproved()))) &&
            ((this.approvedDate==null && other.getApprovedDate()==null) || 
             (this.approvedDate!=null &&
              this.approvedDate.equals(other.getApprovedDate()))) &&
            ((this.atualizationId==null && other.getAtualizationId()==null) || 
             (this.atualizationId!=null &&
              this.atualizationId.equals(other.getAtualizationId()))) &&
            ((this.backgroundColor==null && other.getBackgroundColor()==null) || 
             (this.backgroundColor!=null &&
              this.backgroundColor.equals(other.getBackgroundColor()))) &&
            ((this.backgroundImage==null && other.getBackgroundImage()==null) || 
             (this.backgroundImage!=null &&
              this.backgroundImage.equals(other.getBackgroundImage()))) &&
            ((this.bannerImage==null && other.getBannerImage()==null) || 
             (this.bannerImage!=null &&
              this.bannerImage.equals(other.getBannerImage()))) &&
            ((this.cardDescription==null && other.getCardDescription()==null) || 
             (this.cardDescription!=null &&
              this.cardDescription.equals(other.getCardDescription()))) &&
            ((this.colleagueId==null && other.getColleagueId()==null) || 
             (this.colleagueId!=null &&
              this.colleagueId.equals(other.getColleagueId()))) &&
            ((this.colleagueName==null && other.getColleagueName()==null) || 
             (this.colleagueName!=null &&
              this.colleagueName.equals(other.getColleagueName()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.crc==null && other.getCrc()==null) || 
             (this.crc!=null &&
              this.crc.equals(other.getCrc()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.datasetName==null && other.getDatasetName()==null) || 
             (this.datasetName!=null &&
              this.datasetName.equals(other.getDatasetName()))) &&
            ((this.deleted==null && other.getDeleted()==null) || 
             (this.deleted!=null &&
              this.deleted.equals(other.getDeleted()))) &&
            ((this.documentDescription==null && other.getDocumentDescription()==null) || 
             (this.documentDescription!=null &&
              this.documentDescription.equals(other.getDocumentDescription()))) &&
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            ((this.documentKeyWord==null && other.getDocumentKeyWord()==null) || 
             (this.documentKeyWord!=null &&
              this.documentKeyWord.equals(other.getDocumentKeyWord()))) &&
            ((this.documentPropertyNumber==null && other.getDocumentPropertyNumber()==null) || 
             (this.documentPropertyNumber!=null &&
              this.documentPropertyNumber.equals(other.getDocumentPropertyNumber()))) &&
            ((this.documentPropertyVersion==null && other.getDocumentPropertyVersion()==null) || 
             (this.documentPropertyVersion!=null &&
              this.documentPropertyVersion.equals(other.getDocumentPropertyVersion()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.documentTypeId==null && other.getDocumentTypeId()==null) || 
             (this.documentTypeId!=null &&
              this.documentTypeId.equals(other.getDocumentTypeId()))) &&
            ((this.downloadEnabled==null && other.getDownloadEnabled()==null) || 
             (this.downloadEnabled!=null &&
              this.downloadEnabled.equals(other.getDownloadEnabled()))) &&
            ((this.draft==null && other.getDraft()==null) || 
             (this.draft!=null &&
              this.draft.equals(other.getDraft()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.expires==null && other.getExpires()==null) || 
             (this.expires!=null &&
              this.expires.equals(other.getExpires()))) &&
            ((this.externalDocumentId==null && other.getExternalDocumentId()==null) || 
             (this.externalDocumentId!=null &&
              this.externalDocumentId.equals(other.getExternalDocumentId()))) &&
            ((this.folderId==null && other.getFolderId()==null) || 
             (this.folderId!=null &&
              this.folderId.equals(other.getFolderId()))) &&
            ((this.foo==null && other.getFoo()==null) || 
             (this.foo!=null &&
              java.util.Arrays.equals(this.foo, other.getFoo()))) &&
            ((this.iconId==null && other.getIconId()==null) || 
             (this.iconId!=null &&
              this.iconId.equals(other.getIconId()))) &&
            ((this.imutable==null && other.getImutable()==null) || 
             (this.imutable!=null &&
              this.imutable.equals(other.getImutable()))) &&
            ((this.indexed==null && other.getIndexed()==null) || 
             (this.indexed!=null &&
              this.indexed.equals(other.getIndexed()))) &&
            this.inheritSecurity == other.isInheritSecurity() &&
            ((this.internalVisualizer==null && other.getInternalVisualizer()==null) || 
             (this.internalVisualizer!=null &&
              this.internalVisualizer.equals(other.getInternalVisualizer()))) &&
            ((this.isEncrypted==null && other.getIsEncrypted()==null) || 
             (this.isEncrypted!=null &&
              this.isEncrypted.equals(other.getIsEncrypted()))) &&
            ((this.keyWord==null && other.getKeyWord()==null) || 
             (this.keyWord!=null &&
              this.keyWord.equals(other.getKeyWord()))) &&
            ((this.languageId==null && other.getLanguageId()==null) || 
             (this.languageId!=null &&
              this.languageId.equals(other.getLanguageId()))) &&
            ((this.languageIndicator==null && other.getLanguageIndicator()==null) || 
             (this.languageIndicator!=null &&
              this.languageIndicator.equals(other.getLanguageIndicator()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastModifiedTime==null && other.getLastModifiedTime()==null) || 
             (this.lastModifiedTime!=null &&
              this.lastModifiedTime.equals(other.getLastModifiedTime()))) &&
            ((this.newStructure==null && other.getNewStructure()==null) || 
             (this.newStructure!=null &&
              this.newStructure.equals(other.getNewStructure()))) &&
            ((this.parentDocumentId==null && other.getParentDocumentId()==null) || 
             (this.parentDocumentId!=null &&
              this.parentDocumentId.equals(other.getParentDocumentId()))) &&
            ((this.phisicalFile==null && other.getPhisicalFile()==null) || 
             (this.phisicalFile!=null &&
              this.phisicalFile.equals(other.getPhisicalFile()))) &&
            ((this.phisicalFileSize==null && other.getPhisicalFileSize()==null) || 
             (this.phisicalFileSize!=null &&
              this.phisicalFileSize.equals(other.getPhisicalFileSize()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.privateColleagueId==null && other.getPrivateColleagueId()==null) || 
             (this.privateColleagueId!=null &&
              this.privateColleagueId.equals(other.getPrivateColleagueId()))) &&
            ((this.privateDocument==null && other.getPrivateDocument()==null) || 
             (this.privateDocument!=null &&
              this.privateDocument.equals(other.getPrivateDocument()))) &&
            ((this.protectedCopy==null && other.getProtectedCopy()==null) || 
             (this.protectedCopy!=null &&
              this.protectedCopy.equals(other.getProtectedCopy()))) &&
            ((this.publisherId==null && other.getPublisherId()==null) || 
             (this.publisherId!=null &&
              this.publisherId.equals(other.getPublisherId()))) &&
            ((this.relatedFiles==null && other.getRelatedFiles()==null) || 
             (this.relatedFiles!=null &&
              this.relatedFiles.equals(other.getRelatedFiles()))) &&
            this.rowId == other.getRowId() &&
            ((this.searchNumber==null && other.getSearchNumber()==null) || 
             (this.searchNumber!=null &&
              this.searchNumber.equals(other.getSearchNumber()))) &&
            this.securityLevel == other.getSecurityLevel() &&
            ((this.tool==null && other.getTool()==null) || 
             (this.tool!=null &&
              this.tool.equals(other.getTool()))) &&
            ((this.topicId==null && other.getTopicId()==null) || 
             (this.topicId!=null &&
              this.topicId.equals(other.getTopicId()))) &&
            this.translated == other.isTranslated() &&
            ((this.UUID==null && other.getUUID()==null) || 
             (this.UUID!=null &&
              this.UUID.equals(other.getUUID()))) &&
            this.updateIsoProperties == other.isUpdateIsoProperties() &&
            ((this.userNotify==null && other.getUserNotify()==null) || 
             (this.userNotify!=null &&
              this.userNotify.equals(other.getUserNotify()))) &&
            ((this.validationStartDate==null && other.getValidationStartDate()==null) || 
             (this.validationStartDate!=null &&
              this.validationStartDate.equals(other.getValidationStartDate()))) &&
            this.version == other.getVersion() &&
            ((this.versionDescription==null && other.getVersionDescription()==null) || 
             (this.versionDescription!=null &&
              this.versionDescription.equals(other.getVersionDescription()))) &&
            ((this.versionOption==null && other.getVersionOption()==null) || 
             (this.versionOption!=null &&
              this.versionOption.equals(other.getVersionOption()))) &&
            ((this.visualization==null && other.getVisualization()==null) || 
             (this.visualization!=null &&
              this.visualization.equals(other.getVisualization()))) &&
            ((this.volumeId==null && other.getVolumeId()==null) || 
             (this.volumeId!=null &&
              this.volumeId.equals(other.getVolumeId())));
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
        if (getAccessCount() != null) {
            _hashCode += getAccessCount().hashCode();
        }
        if (getActiveVersion() != null) {
            _hashCode += getActiveVersion().hashCode();
        }
        if (getAdditionalComments() != null) {
            _hashCode += getAdditionalComments().hashCode();
        }
        if (getApprovalAndOr() != null) {
            _hashCode += getApprovalAndOr().hashCode();
        }
        if (getApproved() != null) {
            _hashCode += getApproved().hashCode();
        }
        if (getApprovedDate() != null) {
            _hashCode += getApprovedDate().hashCode();
        }
        if (getAtualizationId() != null) {
            _hashCode += getAtualizationId().hashCode();
        }
        if (getBackgroundColor() != null) {
            _hashCode += getBackgroundColor().hashCode();
        }
        if (getBackgroundImage() != null) {
            _hashCode += getBackgroundImage().hashCode();
        }
        if (getBannerImage() != null) {
            _hashCode += getBannerImage().hashCode();
        }
        if (getCardDescription() != null) {
            _hashCode += getCardDescription().hashCode();
        }
        if (getColleagueId() != null) {
            _hashCode += getColleagueId().hashCode();
        }
        if (getColleagueName() != null) {
            _hashCode += getColleagueName().hashCode();
        }
        _hashCode += getCompanyId();
        if (getCrc() != null) {
            _hashCode += getCrc().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDatasetName() != null) {
            _hashCode += getDatasetName().hashCode();
        }
        if (getDeleted() != null) {
            _hashCode += getDeleted().hashCode();
        }
        if (getDocumentDescription() != null) {
            _hashCode += getDocumentDescription().hashCode();
        }
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getDocumentKeyWord() != null) {
            _hashCode += getDocumentKeyWord().hashCode();
        }
        if (getDocumentPropertyNumber() != null) {
            _hashCode += getDocumentPropertyNumber().hashCode();
        }
        if (getDocumentPropertyVersion() != null) {
            _hashCode += getDocumentPropertyVersion().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getDocumentTypeId() != null) {
            _hashCode += getDocumentTypeId().hashCode();
        }
        if (getDownloadEnabled() != null) {
            _hashCode += getDownloadEnabled().hashCode();
        }
        if (getDraft() != null) {
            _hashCode += getDraft().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getExpires() != null) {
            _hashCode += getExpires().hashCode();
        }
        if (getExternalDocumentId() != null) {
            _hashCode += getExternalDocumentId().hashCode();
        }
        if (getFolderId() != null) {
            _hashCode += getFolderId().hashCode();
        }
        if (getFoo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFoo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFoo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIconId() != null) {
            _hashCode += getIconId().hashCode();
        }
        if (getImutable() != null) {
            _hashCode += getImutable().hashCode();
        }
        if (getIndexed() != null) {
            _hashCode += getIndexed().hashCode();
        }
        _hashCode += (isInheritSecurity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInternalVisualizer() != null) {
            _hashCode += getInternalVisualizer().hashCode();
        }
        if (getIsEncrypted() != null) {
            _hashCode += getIsEncrypted().hashCode();
        }
        if (getKeyWord() != null) {
            _hashCode += getKeyWord().hashCode();
        }
        if (getLanguageId() != null) {
            _hashCode += getLanguageId().hashCode();
        }
        if (getLanguageIndicator() != null) {
            _hashCode += getLanguageIndicator().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastModifiedTime() != null) {
            _hashCode += getLastModifiedTime().hashCode();
        }
        if (getNewStructure() != null) {
            _hashCode += getNewStructure().hashCode();
        }
        if (getParentDocumentId() != null) {
            _hashCode += getParentDocumentId().hashCode();
        }
        if (getPhisicalFile() != null) {
            _hashCode += getPhisicalFile().hashCode();
        }
        if (getPhisicalFileSize() != null) {
            _hashCode += getPhisicalFileSize().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getPrivateColleagueId() != null) {
            _hashCode += getPrivateColleagueId().hashCode();
        }
        if (getPrivateDocument() != null) {
            _hashCode += getPrivateDocument().hashCode();
        }
        if (getProtectedCopy() != null) {
            _hashCode += getProtectedCopy().hashCode();
        }
        if (getPublisherId() != null) {
            _hashCode += getPublisherId().hashCode();
        }
        if (getRelatedFiles() != null) {
            _hashCode += getRelatedFiles().hashCode();
        }
        _hashCode += getRowId();
        if (getSearchNumber() != null) {
            _hashCode += getSearchNumber().hashCode();
        }
        _hashCode += getSecurityLevel();
        if (getTool() != null) {
            _hashCode += getTool().hashCode();
        }
        if (getTopicId() != null) {
            _hashCode += getTopicId().hashCode();
        }
        _hashCode += (isTranslated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUUID() != null) {
            _hashCode += getUUID().hashCode();
        }
        _hashCode += (isUpdateIsoProperties() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUserNotify() != null) {
            _hashCode += getUserNotify().hashCode();
        }
        if (getValidationStartDate() != null) {
            _hashCode += getValidationStartDate().hashCode();
        }
        _hashCode += getVersion();
        if (getVersionDescription() != null) {
            _hashCode += getVersionDescription().hashCode();
        }
        if (getVersionOption() != null) {
            _hashCode += getVersionOption().hashCode();
        }
        if (getVisualization() != null) {
            _hashCode += getVisualization().hashCode();
        }
        if (getVolumeId() != null) {
            _hashCode += getVolumeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalComments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalAndOr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvalAndOr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atualizationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atualizationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundColor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backgroundColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backgroundImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bannerImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bannerImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colleagueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colleagueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colleagueName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colleagueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datasetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datasetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentKeyWord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentKeyWord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentPropertyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentPropertyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentPropertyVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentPropertyVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downloadEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("draft");
        elemField.setXmlName(new javax.xml.namespace.QName("", "draft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expires");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDocumentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalDocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "folderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iconId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imutable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imutable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indexed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inheritSecurity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inheritSecurity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalVisualizer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalVisualizer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEncrypted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isEncrypted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyWord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyWord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastModifiedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newStructure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newStructure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentDocumentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentDocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phisicalFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phisicalFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phisicalFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phisicalFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateColleagueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateColleagueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectedCopy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protectedCopy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publisherId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tool");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topicId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topicId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateIsoProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateIsoProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotify");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userNotify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validationStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visualization");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visualization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volumeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
