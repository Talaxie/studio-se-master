package com.AddressDoctor.validator2.addInteractive.Interactive;

public class InteractiveSoapProxy implements com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveSoap {
  private String _endpoint = null;
  private com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveSoap interactiveSoap = null;
  
  public InteractiveSoapProxy() {
    _initInteractiveSoapProxy();
  }
  
  public InteractiveSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initInteractiveSoapProxy();
  }
  
  private void _initInteractiveSoapProxy() {
    try {
      interactiveSoap = (new com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveLocator()).getInteractiveSoap();
      if (interactiveSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)interactiveSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)interactiveSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (interactiveSoap != null)
      ((javax.xml.rpc.Stub)interactiveSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveSoap getInteractiveSoap() {
    if (interactiveSoap == null)
      _initInteractiveSoapProxy();
    return interactiveSoap;
  }
  
  public com.AddressDoctor.validator2.addInteractive.Interactive.AddInteractiveResponse validate(com.AddressDoctor.validator2.addInteractive.Interactive.AddInteractiveRequest addInteractiveRequest) throws java.rmi.RemoteException{
    if (interactiveSoap == null)
      _initInteractiveSoapProxy();
    return interactiveSoap.validate(addInteractiveRequest);
  }
  
  
}