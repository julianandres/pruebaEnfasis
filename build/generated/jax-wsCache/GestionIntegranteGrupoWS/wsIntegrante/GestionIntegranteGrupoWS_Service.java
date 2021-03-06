
package wsIntegrante;

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
@WebServiceClient(name = "GestionIntegranteGrupoWS", targetNamespace = "http://logicaServicios/", wsdlLocation = "http://localhost:8080/ServidorWeb/GestionIntegranteGrupoWS?WSDL")
public class GestionIntegranteGrupoWS_Service
    extends Service
{

    private final static URL GESTIONINTEGRANTEGRUPOWS_WSDL_LOCATION;
    private final static WebServiceException GESTIONINTEGRANTEGRUPOWS_EXCEPTION;
    private final static QName GESTIONINTEGRANTEGRUPOWS_QNAME = new QName("http://logicaServicios/", "GestionIntegranteGrupoWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServidorWeb/GestionIntegranteGrupoWS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GESTIONINTEGRANTEGRUPOWS_WSDL_LOCATION = url;
        GESTIONINTEGRANTEGRUPOWS_EXCEPTION = e;
    }

    public GestionIntegranteGrupoWS_Service() {
        super(__getWsdlLocation(), GESTIONINTEGRANTEGRUPOWS_QNAME);
    }

    public GestionIntegranteGrupoWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GESTIONINTEGRANTEGRUPOWS_QNAME, features);
    }

    public GestionIntegranteGrupoWS_Service(URL wsdlLocation) {
        super(wsdlLocation, GESTIONINTEGRANTEGRUPOWS_QNAME);
    }

    public GestionIntegranteGrupoWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GESTIONINTEGRANTEGRUPOWS_QNAME, features);
    }

    public GestionIntegranteGrupoWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionIntegranteGrupoWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GestionIntegranteGrupoWS
     */
    @WebEndpoint(name = "GestionIntegranteGrupoWSPort")
    public GestionIntegranteGrupoWS getGestionIntegranteGrupoWSPort() {
        return super.getPort(new QName("http://logicaServicios/", "GestionIntegranteGrupoWSPort"), GestionIntegranteGrupoWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionIntegranteGrupoWS
     */
    @WebEndpoint(name = "GestionIntegranteGrupoWSPort")
    public GestionIntegranteGrupoWS getGestionIntegranteGrupoWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://logicaServicios/", "GestionIntegranteGrupoWSPort"), GestionIntegranteGrupoWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GESTIONINTEGRANTEGRUPOWS_EXCEPTION!= null) {
            throw GESTIONINTEGRANTEGRUPOWS_EXCEPTION;
        }
        return GESTIONINTEGRANTEGRUPOWS_WSDL_LOCATION;
    }

}
