package com.gedomo.amazon.ws;

public class EchoDotWSIProxy implements com.gedomo.amazon.ws.EchoDotWSI {
  private String _endpoint = null;
  private com.gedomo.amazon.ws.EchoDotWSI echoDotWSI = null;
  
  public EchoDotWSIProxy() {
    _initEchoDotWSIProxy();
  }
  
  public EchoDotWSIProxy(String endpoint) {
    _endpoint = endpoint;
    _initEchoDotWSIProxy();
  }
  
  private void _initEchoDotWSIProxy() {
    try {
      echoDotWSI = (new com.gedomo.amazon.echodot.EchoDotServiceLocator()).getechoDotPort();
      if (echoDotWSI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)echoDotWSI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)echoDotWSI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (echoDotWSI != null)
      ((javax.xml.rpc.Stub)echoDotWSI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gedomo.amazon.ws.EchoDotWSI getEchoDotWSI() {
    if (echoDotWSI == null)
      _initEchoDotWSIProxy();
    return echoDotWSI;
  }
  
  public void onLight1on() throws java.rmi.RemoteException{
    if (echoDotWSI == null)
      _initEchoDotWSIProxy();
    echoDotWSI.onLight1on();
  }
  
  public void onLight1off() throws java.rmi.RemoteException{
    if (echoDotWSI == null)
      _initEchoDotWSIProxy();
    echoDotWSI.onLight1off();
  }
  
  
}