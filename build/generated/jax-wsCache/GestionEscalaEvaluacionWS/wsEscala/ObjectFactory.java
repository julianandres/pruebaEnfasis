
package wsEscala;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsEscala package. 
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

    private final static QName _EditarEscalaEvaluacion_QNAME = new QName("http://logicaServicios/", "editarEscalaEvaluacion");
    private final static QName _ConsultarEscalaEvaluacionResponse_QNAME = new QName("http://logicaServicios/", "consultarEscalaEvaluacionResponse");
    private final static QName _CrearEscalaEvaluacionResponse_QNAME = new QName("http://logicaServicios/", "crearEscalaEvaluacionResponse");
    private final static QName _EliminarCompetencia_QNAME = new QName("http://logicaServicios/", "eliminarCompetencia");
    private final static QName _EliminarCompetenciaResponse_QNAME = new QName("http://logicaServicios/", "eliminarCompetenciaResponse");
    private final static QName _EditarEscalaEvaluacionResponse_QNAME = new QName("http://logicaServicios/", "editarEscalaEvaluacionResponse");
    private final static QName _ConsultarEscalaEvaluacion_QNAME = new QName("http://logicaServicios/", "consultarEscalaEvaluacion");
    private final static QName _CrearEscalaEvaluacion_QNAME = new QName("http://logicaServicios/", "crearEscalaEvaluacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsEscala
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditarEscalaEvaluacion }
     * 
     */
    public EditarEscalaEvaluacion createEditarEscalaEvaluacion() {
        return new EditarEscalaEvaluacion();
    }

    /**
     * Create an instance of {@link CrearEscalaEvaluacionResponse }
     * 
     */
    public CrearEscalaEvaluacionResponse createCrearEscalaEvaluacionResponse() {
        return new CrearEscalaEvaluacionResponse();
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
     * Create an instance of {@link ConsultarEscalaEvaluacionResponse }
     * 
     */
    public ConsultarEscalaEvaluacionResponse createConsultarEscalaEvaluacionResponse() {
        return new ConsultarEscalaEvaluacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarEscalaEvaluacion }
     * 
     */
    public ConsultarEscalaEvaluacion createConsultarEscalaEvaluacion() {
        return new ConsultarEscalaEvaluacion();
    }

    /**
     * Create an instance of {@link CrearEscalaEvaluacion }
     * 
     */
    public CrearEscalaEvaluacion createCrearEscalaEvaluacion() {
        return new CrearEscalaEvaluacion();
    }

    /**
     * Create an instance of {@link EditarEscalaEvaluacionResponse }
     * 
     */
    public EditarEscalaEvaluacionResponse createEditarEscalaEvaluacionResponse() {
        return new EditarEscalaEvaluacionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarEscalaEvaluacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarEscalaEvaluacion")
    public JAXBElement<EditarEscalaEvaluacion> createEditarEscalaEvaluacion(EditarEscalaEvaluacion value) {
        return new JAXBElement<EditarEscalaEvaluacion>(_EditarEscalaEvaluacion_QNAME, EditarEscalaEvaluacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEscalaEvaluacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarEscalaEvaluacionResponse")
    public JAXBElement<ConsultarEscalaEvaluacionResponse> createConsultarEscalaEvaluacionResponse(ConsultarEscalaEvaluacionResponse value) {
        return new JAXBElement<ConsultarEscalaEvaluacionResponse>(_ConsultarEscalaEvaluacionResponse_QNAME, ConsultarEscalaEvaluacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEscalaEvaluacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearEscalaEvaluacionResponse")
    public JAXBElement<CrearEscalaEvaluacionResponse> createCrearEscalaEvaluacionResponse(CrearEscalaEvaluacionResponse value) {
        return new JAXBElement<CrearEscalaEvaluacionResponse>(_CrearEscalaEvaluacionResponse_QNAME, CrearEscalaEvaluacionResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarEscalaEvaluacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarEscalaEvaluacionResponse")
    public JAXBElement<EditarEscalaEvaluacionResponse> createEditarEscalaEvaluacionResponse(EditarEscalaEvaluacionResponse value) {
        return new JAXBElement<EditarEscalaEvaluacionResponse>(_EditarEscalaEvaluacionResponse_QNAME, EditarEscalaEvaluacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEscalaEvaluacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarEscalaEvaluacion")
    public JAXBElement<ConsultarEscalaEvaluacion> createConsultarEscalaEvaluacion(ConsultarEscalaEvaluacion value) {
        return new JAXBElement<ConsultarEscalaEvaluacion>(_ConsultarEscalaEvaluacion_QNAME, ConsultarEscalaEvaluacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEscalaEvaluacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearEscalaEvaluacion")
    public JAXBElement<CrearEscalaEvaluacion> createCrearEscalaEvaluacion(CrearEscalaEvaluacion value) {
        return new JAXBElement<CrearEscalaEvaluacion>(_CrearEscalaEvaluacion_QNAME, CrearEscalaEvaluacion.class, null, value);
    }

}
