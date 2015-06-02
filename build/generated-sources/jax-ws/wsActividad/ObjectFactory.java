
package wsActividad;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsActividad package. 
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

    private final static QName _ConsultarActividadEvaluacionResponse_QNAME = new QName("http://logicaServicios/", "consultarActividadEvaluacionResponse");
    private final static QName _EditarActividadEvaluacion_QNAME = new QName("http://logicaServicios/", "editarActividadEvaluacion");
    private final static QName _CrearActividadEvaluacionResponse_QNAME = new QName("http://logicaServicios/", "crearActividadEvaluacionResponse");
    private final static QName _EliminarActividadEvaluacionResponse_QNAME = new QName("http://logicaServicios/", "eliminarActividadEvaluacionResponse");
    private final static QName _CrearActividadEvaluacion_QNAME = new QName("http://logicaServicios/", "crearActividadEvaluacion");
    private final static QName _EditarActividadEvaluacionResponse_QNAME = new QName("http://logicaServicios/", "editarActividadEvaluacionResponse");
    private final static QName _EliminarActividadEvaluacion_QNAME = new QName("http://logicaServicios/", "eliminarActividadEvaluacion");
    private final static QName _ConsultarActividadEvaluacion_QNAME = new QName("http://logicaServicios/", "consultarActividadEvaluacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsActividad
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditarActividadEvaluacion }
     * 
     */
    public EditarActividadEvaluacion createEditarActividadEvaluacion() {
        return new EditarActividadEvaluacion();
    }

    /**
     * Create an instance of {@link ConsultarActividadEvaluacionResponse }
     * 
     */
    public ConsultarActividadEvaluacionResponse createConsultarActividadEvaluacionResponse() {
        return new ConsultarActividadEvaluacionResponse();
    }

    /**
     * Create an instance of {@link EliminarActividadEvaluacionResponse }
     * 
     */
    public EliminarActividadEvaluacionResponse createEliminarActividadEvaluacionResponse() {
        return new EliminarActividadEvaluacionResponse();
    }

    /**
     * Create an instance of {@link CrearActividadEvaluacionResponse }
     * 
     */
    public CrearActividadEvaluacionResponse createCrearActividadEvaluacionResponse() {
        return new CrearActividadEvaluacionResponse();
    }

    /**
     * Create an instance of {@link CrearActividadEvaluacion }
     * 
     */
    public CrearActividadEvaluacion createCrearActividadEvaluacion() {
        return new CrearActividadEvaluacion();
    }

    /**
     * Create an instance of {@link ConsultarActividadEvaluacion }
     * 
     */
    public ConsultarActividadEvaluacion createConsultarActividadEvaluacion() {
        return new ConsultarActividadEvaluacion();
    }

    /**
     * Create an instance of {@link EditarActividadEvaluacionResponse }
     * 
     */
    public EditarActividadEvaluacionResponse createEditarActividadEvaluacionResponse() {
        return new EditarActividadEvaluacionResponse();
    }

    /**
     * Create an instance of {@link EliminarActividadEvaluacion }
     * 
     */
    public EliminarActividadEvaluacion createEliminarActividadEvaluacion() {
        return new EliminarActividadEvaluacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarActividadEvaluacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarActividadEvaluacionResponse")
    public JAXBElement<ConsultarActividadEvaluacionResponse> createConsultarActividadEvaluacionResponse(ConsultarActividadEvaluacionResponse value) {
        return new JAXBElement<ConsultarActividadEvaluacionResponse>(_ConsultarActividadEvaluacionResponse_QNAME, ConsultarActividadEvaluacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarActividadEvaluacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarActividadEvaluacion")
    public JAXBElement<EditarActividadEvaluacion> createEditarActividadEvaluacion(EditarActividadEvaluacion value) {
        return new JAXBElement<EditarActividadEvaluacion>(_EditarActividadEvaluacion_QNAME, EditarActividadEvaluacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearActividadEvaluacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearActividadEvaluacionResponse")
    public JAXBElement<CrearActividadEvaluacionResponse> createCrearActividadEvaluacionResponse(CrearActividadEvaluacionResponse value) {
        return new JAXBElement<CrearActividadEvaluacionResponse>(_CrearActividadEvaluacionResponse_QNAME, CrearActividadEvaluacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarActividadEvaluacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "eliminarActividadEvaluacionResponse")
    public JAXBElement<EliminarActividadEvaluacionResponse> createEliminarActividadEvaluacionResponse(EliminarActividadEvaluacionResponse value) {
        return new JAXBElement<EliminarActividadEvaluacionResponse>(_EliminarActividadEvaluacionResponse_QNAME, EliminarActividadEvaluacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearActividadEvaluacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearActividadEvaluacion")
    public JAXBElement<CrearActividadEvaluacion> createCrearActividadEvaluacion(CrearActividadEvaluacion value) {
        return new JAXBElement<CrearActividadEvaluacion>(_CrearActividadEvaluacion_QNAME, CrearActividadEvaluacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarActividadEvaluacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarActividadEvaluacionResponse")
    public JAXBElement<EditarActividadEvaluacionResponse> createEditarActividadEvaluacionResponse(EditarActividadEvaluacionResponse value) {
        return new JAXBElement<EditarActividadEvaluacionResponse>(_EditarActividadEvaluacionResponse_QNAME, EditarActividadEvaluacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarActividadEvaluacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "eliminarActividadEvaluacion")
    public JAXBElement<EliminarActividadEvaluacion> createEliminarActividadEvaluacion(EliminarActividadEvaluacion value) {
        return new JAXBElement<EliminarActividadEvaluacion>(_EliminarActividadEvaluacion_QNAME, EliminarActividadEvaluacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarActividadEvaluacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarActividadEvaluacion")
    public JAXBElement<ConsultarActividadEvaluacion> createConsultarActividadEvaluacion(ConsultarActividadEvaluacion value) {
        return new JAXBElement<ConsultarActividadEvaluacion>(_ConsultarActividadEvaluacion_QNAME, ConsultarActividadEvaluacion.class, null, value);
    }

}
