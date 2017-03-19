/**
 * EchoDotService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gedomo.amazon.echodot;

public interface EchoDotService extends javax.xml.rpc.Service {
    public java.lang.String getechoDotPortAddress();

    public com.gedomo.amazon.ws.EchoDotWSI getechoDotPort() throws javax.xml.rpc.ServiceException;

    public com.gedomo.amazon.ws.EchoDotWSI getechoDotPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
