/**
 * DocumentServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.datasul.technology.webdesk.dm.ws;

public class DocumentServiceServiceLocator extends org.apache.axis.client.Service implements com.datasul.technology.webdesk.dm.ws.DocumentServiceService {

    public DocumentServiceServiceLocator() {
    }


    public DocumentServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DocumentServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DocumentServicePort
    private java.lang.String DocumentServicePort_address = "http://Sombrio-PC:8180/webdesk/DocumentService";

    public java.lang.String getDocumentServicePortAddress() {
        return DocumentServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DocumentServicePortWSDDServiceName = "DocumentServicePort";

    public java.lang.String getDocumentServicePortWSDDServiceName() {
        return DocumentServicePortWSDDServiceName;
    }

    public void setDocumentServicePortWSDDServiceName(java.lang.String name) {
        DocumentServicePortWSDDServiceName = name;
    }

    public com.datasul.technology.webdesk.dm.ws.DocumentService getDocumentServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DocumentServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDocumentServicePort(endpoint);
    }

    public com.datasul.technology.webdesk.dm.ws.DocumentService getDocumentServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.datasul.technology.webdesk.dm.ws.DocumentServiceBindingStub _stub = new com.datasul.technology.webdesk.dm.ws.DocumentServiceBindingStub(portAddress, this);
            _stub.setPortName(getDocumentServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDocumentServicePortEndpointAddress(java.lang.String address) {
        DocumentServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.datasul.technology.webdesk.dm.ws.DocumentService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.datasul.technology.webdesk.dm.ws.DocumentServiceBindingStub _stub = new com.datasul.technology.webdesk.dm.ws.DocumentServiceBindingStub(new java.net.URL(DocumentServicePort_address), this);
                _stub.setPortName(getDocumentServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DocumentServicePort".equals(inputPortName)) {
            return getDocumentServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "DocumentServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.dm.webdesk.technology.datasul.com/", "DocumentServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DocumentServicePort".equals(portName)) {
            setDocumentServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
