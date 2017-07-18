package com.beeva.ClienteSOAP.ws;

public class ClientewsProxy implements com.beeva.ClienteSOAP.ws.Clientews {
  private String _endpoint = null;
  private com.beeva.ClienteSOAP.ws.Clientews clientews = null;
  
  public ClientewsProxy() {
    _initClientewsProxy();
  }
  
  public ClientewsProxy(String endpoint) {
    _endpoint = endpoint;
    _initClientewsProxy();
  }
  
  private void _initClientewsProxy() {
    try {
      clientews = (new com.beeva.ClienteSOAP.ws.ClienteImplServiceLocator()).getClienteImplPort();
      if (clientews != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clientews)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clientews)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clientews != null)
      ((javax.xml.rpc.Stub)clientews)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.beeva.ClienteSOAP.ws.Clientews getClientews() {
    if (clientews == null)
      _initClientewsProxy();
    return clientews;
  }
  
  public com.beeva.ClienteSOAP.ws.Cliente obtendatos(int arg0) throws java.rmi.RemoteException{
    if (clientews == null)
      _initClientewsProxy();
    return clientews.obtendatos(arg0);
  }
  
  
}