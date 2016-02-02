/**
 * ProductWSImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class ProductWSImplServiceLocator extends org.apache.axis.client.Service implements ws.ProductWSImplService {

    public ProductWSImplServiceLocator() {
    }


    public ProductWSImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductWSImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductWSImplPort
    private java.lang.String ProductWSImplPort_address = "http://localhost:4242/ws/product";

    public java.lang.String getProductWSImplPortAddress() {
        return ProductWSImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductWSImplPortWSDDServiceName = "ProductWSImplPort";

    public java.lang.String getProductWSImplPortWSDDServiceName() {
        return ProductWSImplPortWSDDServiceName;
    }

    public void setProductWSImplPortWSDDServiceName(java.lang.String name) {
        ProductWSImplPortWSDDServiceName = name;
    }

    public ws.ProductWS getProductWSImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductWSImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductWSImplPort(endpoint);
    }

    public ws.ProductWS getProductWSImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.ProductWSImplPortBindingStub _stub = new ws.ProductWSImplPortBindingStub(portAddress, this);
            _stub.setPortName(getProductWSImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductWSImplPortEndpointAddress(java.lang.String address) {
        ProductWSImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.ProductWS.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.ProductWSImplPortBindingStub _stub = new ws.ProductWSImplPortBindingStub(new java.net.URL(ProductWSImplPort_address), this);
                _stub.setPortName(getProductWSImplPortWSDDServiceName());
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
        if ("ProductWSImplPort".equals(inputPortName)) {
            return getProductWSImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws/", "ProductWSImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws/", "ProductWSImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductWSImplPort".equals(portName)) {
            setProductWSImplPortEndpointAddress(address);
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
