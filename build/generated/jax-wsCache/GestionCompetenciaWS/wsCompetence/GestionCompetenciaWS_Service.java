
package wsCompetence;

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
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GestionCompetenciaWS", targetNamespace = "http://logicaServicios/", wsdlLocation = "http://localhost:8080/ServidorWeb/GestionCompetenciaWS?WSDL")
public class GestionCompetenciaWS_Service
    extends Service
{

    private final static URL GESTIONCOMPETENCIAWS_WSDL_LOCATION;
    private final static WebServiceException GESTIONCOMPETENCIAWS_EXCEPTION;
    private final static QName GESTIONCOMPETENCIAWS_QNAME = new QName("http://logicaServicios/", "GestionCompetenciaWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServidorWeb/GestionCompetenciaWS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GESTIONCOMPETENCIAWS_WSDL_LOCATION = url;
        GESTIONCOMPETENCIAWS_EXCEPTION = e;
    }

    public GestionCompetenciaWS_Service() {
        super(__getWsdlLocation(), GESTIONCOMPETENCIAWS_QNAME);
    }

    public GestionCompetenciaWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GESTIONCOMPETENCIAWS_QNAME, features);
    }

    public GestionCompetenciaWS_Service(URL wsdlLocation) {
        super(wsdlLocation, GESTIONCOMPETENCIAWS_QNAME);
    }

    public GestionCompetenciaWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GESTIONCOMPETENCIAWS_QNAME, features);
    }

    public GestionCompetenciaWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionCompetenciaWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GestionCompetenciaWS
     */
    @WebEndpoint(name = "GestionCompetenciaWSPort")
    public GestionCompetenciaWS getGestionCompetenciaWSPort() {
        return super.getPort(new QName("http://logicaServicios/", "GestionCompetenciaWSPort"), GestionCompetenciaWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionCompetenciaWS
     */
    @WebEndpoint(name = "GestionCompetenciaWSPort")
    public GestionCompetenciaWS getGestionCompetenciaWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://logicaServicios/", "GestionCompetenciaWSPort"), GestionCompetenciaWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GESTIONCOMPETENCIAWS_EXCEPTION!= null) {
            throw GESTIONCOMPETENCIAWS_EXCEPTION;
        }
        return GESTIONCOMPETENCIAWS_WSDL_LOCATION;
    }

}
