/**
 * ClienteImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.beeva.ClienteSOAP.ws;

public class ClienteImplServiceLocator extends org.apache.axis.client.Service implements com.beeva.ClienteSOAP.ws.ClienteImplService {

    public ClienteImplServiceLocator() {
    }


    public ClienteImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClienteImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClienteImplPort
    private java.lang.String ClienteImplPort_address = "http://localhost:9997/ws/Obtendatos";

    public java.lang.String getClienteImplPortAddress() {
        return ClienteImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClienteImplPortWSDDServiceName = "ClienteImplPort";

    public java.lang.String getClienteImplPortWSDDServiceName() {
        return ClienteImplPortWSDDServiceName;
    }

    public void setClienteImplPortWSDDServiceName(java.lang.String name) {
        ClienteImplPortWSDDServiceName = name;
    }

    public com.beeva.ClienteSOAP.ws.Clientews getClienteImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClienteImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClienteImplPort(endpoint);
    }

    public com.beeva.ClienteSOAP.ws.Clientews getClienteImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.beeva.ClienteSOAP.ws.ClienteImplPortBindingStub _stub = new com.beeva.ClienteSOAP.ws.ClienteImplPortBindingStub(portAddress, this);
            _stub.setPortName(getClienteImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClienteImplPortEndpointAddress(java.lang.String address) {
        ClienteImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.beeva.ClienteSOAP.ws.Clientews.class.isAssignableFrom(serviceEndpointInterface)) {
                com.beeva.ClienteSOAP.ws.ClienteImplPortBindingStub _stub = new com.beeva.ClienteSOAP.ws.ClienteImplPortBindingStub(new java.net.URL(ClienteImplPort_address), this);
                _stub.setPortName(getClienteImplPortWSDDServiceName());
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
        if ("ClienteImplPort".equals(inputPortName)) {
            return getClienteImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.ClienteSOAP.beeva.com/", "ClienteImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.ClienteSOAP.beeva.com/", "ClienteImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClienteImplPort".equals(portName)) {
            setClienteImplPortEndpointAddress(address);
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
