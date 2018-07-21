
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CxPortalWebService", targetNamespace = "http://Checkmarx.com", wsdlLocation = "http://10.0.0.21/CxWebInterface/Portal/CxWebService.asmx?wsdl")
public class CxPortalWebService
    extends Service
{

    private final static URL CXPORTALWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException CXPORTALWEBSERVICE_EXCEPTION;
    private final static QName CXPORTALWEBSERVICE_QNAME = new QName("http://Checkmarx.com", "CxPortalWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.0.0.21/CxWebInterface/Portal/CxWebService.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CXPORTALWEBSERVICE_WSDL_LOCATION = url;
        CXPORTALWEBSERVICE_EXCEPTION = e;
    }

    public CxPortalWebService() {
        super(__getWsdlLocation(), CXPORTALWEBSERVICE_QNAME);
    }

    public CxPortalWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CXPORTALWEBSERVICE_QNAME, features);
    }

    public CxPortalWebService(URL wsdlLocation) {
        super(wsdlLocation, CXPORTALWEBSERVICE_QNAME);
    }

    public CxPortalWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CXPORTALWEBSERVICE_QNAME, features);
    }

    public CxPortalWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CxPortalWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CxPortalWebServiceSoap
     */
    @WebEndpoint(name = "CxPortalWebServiceSoap")
    public CxPortalWebServiceSoap getCxPortalWebServiceSoap() {
        return super.getPort(new QName("http://Checkmarx.com", "CxPortalWebServiceSoap"), CxPortalWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CxPortalWebServiceSoap
     */
    @WebEndpoint(name = "CxPortalWebServiceSoap")
    public CxPortalWebServiceSoap getCxPortalWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://Checkmarx.com", "CxPortalWebServiceSoap"), CxPortalWebServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns CxPortalWebServiceSoap
     */
    @WebEndpoint(name = "CxPortalWebServiceSoap12")
    public CxPortalWebServiceSoap getCxPortalWebServiceSoap12() {
        return super.getPort(new QName("http://Checkmarx.com", "CxPortalWebServiceSoap12"), CxPortalWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CxPortalWebServiceSoap
     */
    @WebEndpoint(name = "CxPortalWebServiceSoap12")
    public CxPortalWebServiceSoap getCxPortalWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://Checkmarx.com", "CxPortalWebServiceSoap12"), CxPortalWebServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CXPORTALWEBSERVICE_EXCEPTION!= null) {
            throw CXPORTALWEBSERVICE_EXCEPTION;
        }
        return CXPORTALWEBSERVICE_WSDL_LOCATION;
    }

}