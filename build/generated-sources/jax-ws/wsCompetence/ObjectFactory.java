
package wsCompetence;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsCompetence package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearCompetenciaResponse_QNAME = new QName("http://logicaServicios/", "crearCompetenciaResponse");
    private final static QName _ConsultarCompetencia_QNAME = new QName("http://logicaServicios/", "consultarCompetencia");
    private final static QName _EditarCompetencia_QNAME = new QName("http://logicaServicios/", "editarCompetencia");
    private final static QName _EliminarCompetencia_QNAME = new QName("http://logicaServicios/", "eliminarCompetencia");
    private final static QName _EliminarCompetenciaResponse_QNAME = new QName("http://logicaServicios/", "eliminarCompetenciaResponse");
    private final static QName _ConsultarCompetenciaResponse_QNAME = new QName("http://logicaServicios/", "consultarCompetenciaResponse");
    private final static QName _CrearCompetencia_QNAME = new QName("http://logicaServicios/", "crearCompetencia");
    private final static QName _EditarCompetenciaResponse_QNAME = new QName("http://logicaServicios/", "editarCompetenciaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsCompetence
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearCompetenciaResponse }
     * 
     */
    public CrearCompetenciaResponse createCrearCompetenciaResponse() {
        return new CrearCompetenciaResponse();
    }

    /**
     * Create an instance of {@link ConsultarCompetencia }
     * 
     */
    public ConsultarCompetencia createConsultarCompetencia() {
        return new ConsultarCompetencia();
    }

    /**
     * Create an instance of {@link EliminarCompetencia }
     * 
     */
    public EliminarCompetencia createEliminarCompetencia() {
        return new EliminarCompetencia();
    }

    /**
     * Create an instance of {@link EliminarCompetenciaResponse }
     * 
     */
    public EliminarCompetenciaResponse createEliminarCompetenciaResponse() {
        return new EliminarCompetenciaResponse();
    }

    /**
     * Create an instance of {@link EditarCompetencia }
     * 
     */
    public EditarCompetencia createEditarCompetencia() {
        return new EditarCompetencia();
    }

    /**
     * Create an instance of {@link ConsultarCompetenciaResponse }
     * 
     */
    public ConsultarCompetenciaResponse createConsultarCompetenciaResponse() {
        return new ConsultarCompetenciaResponse();
    }

    /**
     * Create an instance of {@link CrearCompetencia }
     * 
     */
    public CrearCompetencia createCrearCompetencia() {
        return new CrearCompetencia();
    }

    /**
     * Create an instance of {@link EditarCompetenciaResponse }
     * 
     */
    public EditarCompetenciaResponse createEditarCompetenciaResponse() {
        return new EditarCompetenciaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCompetenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearCompetenciaResponse")
    public JAXBElement<CrearCompetenciaResponse> createCrearCompetenciaResponse(CrearCompetenciaResponse value) {
        return new JAXBElement<CrearCompetenciaResponse>(_CrearCompetenciaResponse_QNAME, CrearCompetenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCompetencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarCompetencia")
    public JAXBElement<ConsultarCompetencia> createConsultarCompetencia(ConsultarCompetencia value) {
        return new JAXBElement<ConsultarCompetencia>(_ConsultarCompetencia_QNAME, ConsultarCompetencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarCompetencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarCompetencia")
    public JAXBElement<EditarCompetencia> createEditarCompetencia(EditarCompetencia value) {
        return new JAXBElement<EditarCompetencia>(_EditarCompetencia_QNAME, EditarCompetencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCompetencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "eliminarCompetencia")
    public JAXBElement<EliminarCompetencia> createEliminarCompetencia(EliminarCompetencia value) {
        return new JAXBElement<EliminarCompetencia>(_EliminarCompetencia_QNAME, EliminarCompetencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCompetenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "eliminarCompetenciaResponse")
    public JAXBElement<EliminarCompetenciaResponse> createEliminarCompetenciaResponse(EliminarCompetenciaResponse value) {
        return new JAXBElement<EliminarCompetenciaResponse>(_EliminarCompetenciaResponse_QNAME, EliminarCompetenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCompetenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarCompetenciaResponse")
    public JAXBElement<ConsultarCompetenciaResponse> createConsultarCompetenciaResponse(ConsultarCompetenciaResponse value) {
        return new JAXBElement<ConsultarCompetenciaResponse>(_ConsultarCompetenciaResponse_QNAME, ConsultarCompetenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCompetencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearCompetencia")
    public JAXBElement<CrearCompetencia> createCrearCompetencia(CrearCompetencia value) {
        return new JAXBElement<CrearCompetencia>(_CrearCompetencia_QNAME, CrearCompetencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarCompetenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarCompetenciaResponse")
    public JAXBElement<EditarCompetenciaResponse> createEditarCompetenciaResponse(EditarCompetenciaResponse value) {
        return new JAXBElement<EditarCompetenciaResponse>(_EditarCompetenciaResponse_QNAME, EditarCompetenciaResponse.class, null, value);
    }

}
