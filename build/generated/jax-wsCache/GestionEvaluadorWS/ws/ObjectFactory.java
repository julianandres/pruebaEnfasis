
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _ConsultarEvaluador_QNAME = new QName("http://logicaServicios/", "consultarEvaluador");
    private final static QName _EliminarEvaluador_QNAME = new QName("http://logicaServicios/", "eliminarEvaluador");
    private final static QName _EliminarEvaluadorResponse_QNAME = new QName("http://logicaServicios/", "eliminarEvaluadorResponse");
    private final static QName _ConsultarEvaluadorResponse_QNAME = new QName("http://logicaServicios/", "consultarEvaluadorResponse");
    private final static QName _CrearEvaluador_QNAME = new QName("http://logicaServicios/", "crearEvaluador");
    private final static QName _EditarEvaluador_QNAME = new QName("http://logicaServicios/", "editarEvaluador");
    private final static QName _CrearEvaluadorResponse_QNAME = new QName("http://logicaServicios/", "crearEvaluadorResponse");
    private final static QName _EditarEvaluadorResponse_QNAME = new QName("http://logicaServicios/", "editarEvaluadorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarEvaluadorResponse }
     * 
     */
    public EliminarEvaluadorResponse createEliminarEvaluadorResponse() {
        return new EliminarEvaluadorResponse();
    }

    /**
     * Create an instance of {@link ConsultarEvaluador }
     * 
     */
    public ConsultarEvaluador createConsultarEvaluador() {
        return new ConsultarEvaluador();
    }

    /**
     * Create an instance of {@link EliminarEvaluador }
     * 
     */
    public EliminarEvaluador createEliminarEvaluador() {
        return new EliminarEvaluador();
    }

    /**
     * Create an instance of {@link ConsultarEvaluadorResponse }
     * 
     */
    public ConsultarEvaluadorResponse createConsultarEvaluadorResponse() {
        return new ConsultarEvaluadorResponse();
    }

    /**
     * Create an instance of {@link CrearEvaluador }
     * 
     */
    public CrearEvaluador createCrearEvaluador() {
        return new CrearEvaluador();
    }

    /**
     * Create an instance of {@link EditarEvaluador }
     * 
     */
    public EditarEvaluador createEditarEvaluador() {
        return new EditarEvaluador();
    }

    /**
     * Create an instance of {@link EditarEvaluadorResponse }
     * 
     */
    public EditarEvaluadorResponse createEditarEvaluadorResponse() {
        return new EditarEvaluadorResponse();
    }

    /**
     * Create an instance of {@link CrearEvaluadorResponse }
     * 
     */
    public CrearEvaluadorResponse createCrearEvaluadorResponse() {
        return new CrearEvaluadorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEvaluador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarEvaluador")
    public JAXBElement<ConsultarEvaluador> createConsultarEvaluador(ConsultarEvaluador value) {
        return new JAXBElement<ConsultarEvaluador>(_ConsultarEvaluador_QNAME, ConsultarEvaluador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEvaluador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "eliminarEvaluador")
    public JAXBElement<EliminarEvaluador> createEliminarEvaluador(EliminarEvaluador value) {
        return new JAXBElement<EliminarEvaluador>(_EliminarEvaluador_QNAME, EliminarEvaluador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEvaluadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "eliminarEvaluadorResponse")
    public JAXBElement<EliminarEvaluadorResponse> createEliminarEvaluadorResponse(EliminarEvaluadorResponse value) {
        return new JAXBElement<EliminarEvaluadorResponse>(_EliminarEvaluadorResponse_QNAME, EliminarEvaluadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEvaluadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarEvaluadorResponse")
    public JAXBElement<ConsultarEvaluadorResponse> createConsultarEvaluadorResponse(ConsultarEvaluadorResponse value) {
        return new JAXBElement<ConsultarEvaluadorResponse>(_ConsultarEvaluadorResponse_QNAME, ConsultarEvaluadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEvaluador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearEvaluador")
    public JAXBElement<CrearEvaluador> createCrearEvaluador(CrearEvaluador value) {
        return new JAXBElement<CrearEvaluador>(_CrearEvaluador_QNAME, CrearEvaluador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarEvaluador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarEvaluador")
    public JAXBElement<EditarEvaluador> createEditarEvaluador(EditarEvaluador value) {
        return new JAXBElement<EditarEvaluador>(_EditarEvaluador_QNAME, EditarEvaluador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEvaluadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearEvaluadorResponse")
    public JAXBElement<CrearEvaluadorResponse> createCrearEvaluadorResponse(CrearEvaluadorResponse value) {
        return new JAXBElement<CrearEvaluadorResponse>(_CrearEvaluadorResponse_QNAME, CrearEvaluadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarEvaluadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarEvaluadorResponse")
    public JAXBElement<EditarEvaluadorResponse> createEditarEvaluadorResponse(EditarEvaluadorResponse value) {
        return new JAXBElement<EditarEvaluadorResponse>(_EditarEvaluadorResponse_QNAME, EditarEvaluadorResponse.class, null, value);
    }

}
