/**
 * DocumentServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.datasul.technology.webdesk.dm.ws;

public class DocumentServiceBindingStub extends org.apache.axis.client.Stub implements com.datasul.technology.webdesk.dm.ws.DocumentService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[33];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("approveDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "approverId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "approved"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "observation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("copyDocumentToUploadArea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://jaxb.dev.java.net/array", "stringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("copyDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "origins"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jaxb.dev.java.net/array", "intArray"), int[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "destination"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "copyDocumentDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.CopyDocumentDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "boolean"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Document"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDtoArray"), com.datasul.technology.webdesk.dm.ws.DocumentDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Attachments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "attachmentArray"), com.datasul.technology.webdesk.dm.ws.Attachment[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "security"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentSecurityConfigDtoArray"), com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Approvers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approverDtoArray"), com.datasul.technology.webdesk.dm.ws.ApproverDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RelatedDocuments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "relatedDocumentDtoArray"), com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDocumentWithApprovementLevels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Document"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDtoArray"), com.datasul.technology.webdesk.dm.ws.DocumentDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Attachments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "attachmentArray"), com.datasul.technology.webdesk.dm.ws.Attachment[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "security"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentSecurityConfigDtoArray"), com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ApproversWithLevels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approverWithLevelDtoArray"), com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Levels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approvalLevelDtoArray"), com.datasul.technology.webdesk.dm.ws.ApprovalLevelDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RelatedDocuments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "relatedDocumentDtoArray"), com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSimpleDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parentDocumentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "publisherId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Attachments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "attachmentArray"), com.datasul.technology.webdesk.dm.ws.Attachment[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSimpleDocumentPrivate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parentDocumentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Attachments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "attachmentArray"), com.datasul.technology.webdesk.dm.ws.Attachment[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("destroyDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("destroyDocumentApproval");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "publisherId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findMostPopularDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nrResultados"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findMostPopularDocumentsOnDemand");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "lastRowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findRecycledDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActiveDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "folder"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getApprovers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approverWithLevelDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Approvers"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentApprovalHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentApprovementHistoryDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.DocumentApprovementHistoryDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "DocumentApprovementHistoryDtos"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentApprovalStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentApprovalStatusDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.DocumentApprovalStatusDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "DocumentApprovalStatusDtos"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentByExternalId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "externalDocumentnId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Documents"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentoVersao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nomeArquivo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "folder"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "folder"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRelatedDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "relatedDocumentDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "RelatedDocuments"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getReportSubjectId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "topicId"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSecurity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentSecurityConfigDtoArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Security"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserPermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moveDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jaxb.dev.java.net/array", "intArray"), int[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "destFolderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeSecurity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("restoreDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Document"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDtoArray"), com.datasul.technology.webdesk.dm.ws.DocumentDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Attachments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "attachmentArray"), com.datasul.technology.webdesk.dm.ws.Attachment[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "security"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentSecurityConfigDtoArray"), com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Approvers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approverDtoArray"), com.datasul.technology.webdesk.dm.ws.ApproverDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RelatedDocuments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "relatedDocumentDtoArray"), com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDocumentConversionStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "msg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDocumentWithApprovementLevels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Document"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDtoArray"), com.datasul.technology.webdesk.dm.ws.DocumentDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Attachments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "attachmentArray"), com.datasul.technology.webdesk.dm.ws.Attachment[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "security"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentSecurityConfigDtoArray"), com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ApproversWithLevels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approverWithLevelDtoArray"), com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Levels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approvalLevelDtoArray"), com.datasul.technology.webdesk.dm.ws.ApprovalLevelDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RelatedDocuments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "relatedDocumentDtoArray"), com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateGroupSecurityType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "permissionType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "restrictionType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "colleagueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSimpleDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "publisherId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Attachments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "attachmentArray"), com.datasul.technology.webdesk.dm.ws.Attachment[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray"));
        oper.setReturnClass(com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateIntegrationRequirements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"),
                      "com.datasul.technology.webdesk.dm.ws.Exception",
                      new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception"), 
                      true
                     ));
        _operations[32] = oper;

    }

    public DocumentServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DocumentServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DocumentServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://jaxb.dev.java.net/array", "intArray");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://jaxb.dev.java.net/array", "stringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approvalLevelDto");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.ApprovalLevelDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approvalLevelDtoArray");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.ApprovalLevelDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approvalLevelDto");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approverDto");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.ApproverDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approverDtoArray");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.ApproverDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approverDto");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approverWithLevelDto");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approverWithLevelDtoArray");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approverWithLevelDto");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "attachment");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "attachmentArray");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "attachment");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "copyDocumentDto");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.CopyDocumentDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "copyDocumentDtoArray");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.CopyDocumentDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "copyDocumentDto");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentApprovalStatusDto");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.DocumentApprovalStatusDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentApprovalStatusDtoArray");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.DocumentApprovalStatusDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentApprovalStatusDto");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentApprovementHistoryDto");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.DocumentApprovementHistoryDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentApprovementHistoryDtoArray");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.DocumentApprovementHistoryDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentApprovementHistoryDto");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDto");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.DocumentDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDtoArray");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.DocumentDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentDto");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentSecurityConfigDto");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentSecurityConfigDtoArray");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "documentSecurityConfigDto");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "Exception");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.Exception.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "relatedDocumentDto");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "relatedDocumentDtoArray");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "relatedDocumentDto");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessage");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.WebServiceMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessageArray");
            cachedSerQNames.add(qName);
            cls = com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "webServiceMessage");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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
                java.lang.String key = (java.lang.String) keys.nextElement();
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
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
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
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] approveDocument(int companyId, java.lang.String userId, java.lang.String password, int documentId, int version, java.lang.String approverId, boolean approved, java.lang.String observation) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("approveDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "approveDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(companyId), userId, password, new java.lang.Integer(documentId), new java.lang.Integer(version), approverId, new java.lang.Boolean(approved), observation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] copyDocumentToUploadArea(java.lang.String user, java.lang.String password, int companyId, int documentId, int version, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("copyDocumentToUploadArea");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "copyDocumentToUploadArea"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), new java.lang.Integer(version), colleagueId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.CopyDocumentDto[] copyDocuments(int companyId, java.lang.String login, java.lang.String password, java.lang.String userId, int[] origins, int destination) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("copyFolder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "copyDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(companyId), login, password, userId, origins, new java.lang.Integer(destination)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.CopyDocumentDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.CopyDocumentDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.CopyDocumentDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] createDocument(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverDto[] approvers, com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[] relatedDocuments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("createDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "createDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), document, attachments, security, approvers, relatedDocuments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] createDocumentWithApprovementLevels(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[] approversWithLevels, com.datasul.technology.webdesk.dm.ws.ApprovalLevelDto[] levels, com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[] relatedDocuments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("createDocumentWithApprovementLevels");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "createDocumentWithApprovementLevels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), document, attachments, security, approversWithLevels, levels, relatedDocuments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] createSimpleDocument(java.lang.String username, java.lang.String password, int companyId, int parentDocumentId, java.lang.String publisherId, java.lang.String documentDescription, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("createSimpleDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "createSimpleDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(parentDocumentId), publisherId, documentDescription, attachments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] createSimpleDocumentPrivate(java.lang.String username, java.lang.String password, int companyId, int parentDocumentId, java.lang.String documentDescription, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("createSimpleDocumentPrivate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "createSimpleDocumentPrivate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(parentDocumentId), documentDescription, attachments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] deleteDocument(java.lang.String user, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deleteDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "deleteDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), colleagueId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] destroyDocument(java.lang.String user, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("destroyDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "destroyDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), colleagueId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] destroyDocumentApproval(java.lang.String userId, java.lang.String password, int companyId, int documentId, java.lang.String publisherId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("destroyDocumentApproval");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "destroyDocumentApproval"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), publisherId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.DocumentDto[] findMostPopularDocuments(java.lang.String username, java.lang.String password, int companyId, java.lang.String colleagueId, int nrResultados) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("findMostPopularDocuments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "findMostPopularDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), colleagueId, new java.lang.Integer(nrResultados)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.DocumentDto[] findMostPopularDocumentsOnDemand(int companyId, java.lang.String user, java.lang.String password, java.lang.String colleagueId, int limit, int lastRowId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("findMostPopularDocumentsOnDemand");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "findMostPopularDocumentsOnDemand"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(companyId), user, password, colleagueId, new java.lang.Integer(limit), new java.lang.Integer(lastRowId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.DocumentDto[] findRecycledDocuments(java.lang.String user, java.lang.String password, int companyId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("findRecycledDocuments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "findRecycledDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, password, new java.lang.Integer(companyId), colleagueId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getActiveDocument(java.lang.String username, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getActiveDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "getActiveDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), colleagueId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[] getApprovers(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getApprovers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "getApprovers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), new java.lang.Integer(version)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.DocumentApprovementHistoryDto[] getDocumentApprovalHistory(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDocumentApprovalHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "getDocumentApprovalHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), new java.lang.Integer(version)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.DocumentApprovementHistoryDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.DocumentApprovementHistoryDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.DocumentApprovementHistoryDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.DocumentApprovalStatusDto[] getDocumentApprovalStatus(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDocumentApprovalStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "getDocumentApprovalStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), new java.lang.Integer(version)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.DocumentApprovalStatusDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.DocumentApprovalStatusDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.DocumentApprovalStatusDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getDocumentByExternalId(java.lang.String username, java.lang.String password, int companyId, java.lang.String externalDocumentnId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDocumentByExternalId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "getDocumentByExternalId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), externalDocumentnId, colleagueId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] getDocumentContent(java.lang.String username, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId, int documentoVersao, java.lang.String nomeArquivo) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDocumentContent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "getDocumentContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), colleagueId, new java.lang.Integer(documentoVersao), nomeArquivo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.DocumentDto[] getDocumentVersion(java.lang.String username, java.lang.String password, int companyId, int documentId, int version, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDocumentVersion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "getDocumentVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), new java.lang.Integer(version), colleagueId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.DocumentDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.DocumentDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[] getRelatedDocuments(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getRelatedDocuments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "getRelatedDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), new java.lang.Integer(version)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getReportSubjectId(java.lang.String username, java.lang.String password, int companyId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getReportSubject");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "getReportSubjectId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] getSecurity(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSecurity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "getSecurity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), new java.lang.Integer(version)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getUserPermissions(int companyId, java.lang.String username, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getUserPermissions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "getUserPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(companyId), username, new java.lang.Integer(documentId), new java.lang.Integer(version)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String moveDocument(java.lang.String username, java.lang.String password, int companyId, int[] documentIds, java.lang.String colleagueId, int destFolderId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("moveDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "moveDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), documentIds, colleagueId, new java.lang.Integer(destFolderId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void removeSecurity(java.lang.String username, java.lang.String password, int companyId, int documentId, int version) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("removeSecurity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "removeSecurity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), new java.lang.Integer(version)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] restoreDocument(java.lang.String user, java.lang.String password, int companyId, int documentId, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("restoreDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "restoreDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), colleagueId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateDocument(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverDto[] approvers, com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[] relatedDocuments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "updateDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), document, attachments, security, approvers, relatedDocuments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateDocumentConversionStatus(java.lang.String username, java.lang.String password, int companyId, int documentId, int version, int status, java.lang.String msg) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateDocumentConversionStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "updateDocumentConversionStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), new java.lang.Integer(version), new java.lang.Integer(status), msg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateDocumentWithApprovementLevels(java.lang.String username, java.lang.String password, int companyId, com.datasul.technology.webdesk.dm.ws.DocumentDto[] document, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments, com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDto[] security, com.datasul.technology.webdesk.dm.ws.ApproverWithLevelDto[] approversWithLevels, com.datasul.technology.webdesk.dm.ws.ApprovalLevelDto[] levels, com.datasul.technology.webdesk.dm.ws.RelatedDocumentDto[] relatedDocuments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateDocumentWithApprovementLevels");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "updateDocumentWithApprovementLevels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), document, attachments, security, approversWithLevels, levels, relatedDocuments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateGroupSecurityType(java.lang.String username, java.lang.String password, int companyId, int documentId, int version, int permissionType, int restrictionType, java.lang.String colleagueId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateGroupSecurityType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "updateGroupSecurityType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), new java.lang.Integer(version), new java.lang.Integer(permissionType), new java.lang.Integer(restrictionType), colleagueId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.datasul.technology.webdesk.dm.ws.WebServiceMessage[] updateSimpleDocument(java.lang.String username, java.lang.String password, int companyId, int documentId, java.lang.String publisherId, java.lang.String documentDescription, com.datasul.technology.webdesk.dm.ws.Attachment[] attachments) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateSimpleDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "updateSimpleDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId), new java.lang.Integer(documentId), publisherId, documentDescription, attachments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasul.technology.webdesk.dm.ws.WebServiceMessage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasul.technology.webdesk.dm.ws.WebServiceMessage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String validateIntegrationRequirements(java.lang.String username, java.lang.String password, int companyId) throws java.rmi.RemoteException, com.datasul.technology.webdesk.dm.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validateIntegrationRequirements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "validateIntegrationRequirements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(companyId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.datasul.technology.webdesk.dm.ws.Exception) {
              throw (com.datasul.technology.webdesk.dm.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
