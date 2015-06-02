
package wsGrupo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsGrupo package. 
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

    private final static QName _AgregarCompetenciaAGrupo_QNAME = new QName("http://logicaServicios/", "agregarCompetenciaAGrupo");
    private final static QName _AgregarCompetenciaAGrupoResponse_QNAME = new QName("http://logicaServicios/", "agregarCompetenciaAGrupoResponse");
    private final static QName _ConsultarIntegrantesAsignadosAGrupoResponse_QNAME = new QName("http://logicaServicios/", "consultarIntegrantesAsignadosAGrupoResponse");
    private final static QName _EliminarGrupoEvaluacionResponse_QNAME = new QName("http://logicaServicios/", "eliminarGrupoEvaluacionResponse");
    private final static QName _ConsultarGrupoEvaluacionResponse_QNAME = new QName("http://logicaServicios/", "consultarGrupoEvaluacionResponse");
    private final static QName _ConsultarIntegrantesQueNoPertenecenAGrupoResponse_QNAME = new QName("http://logicaServicios/", "consultarIntegrantesQueNoPertenecenAGrupoResponse");
    private final static QName _ConsultarCompetenciasDeUnGrupo_QNAME = new QName("http://logicaServicios/", "consultarCompetenciasDeUnGrupo");
    private final static QName _ConsultarIntegrantesAsignadosAGrupo_QNAME = new QName("http://logicaServicios/", "consultarIntegrantesAsignadosAGrupo");
    private final static QName _ConsultarGrupoEvaluacion_QNAME = new QName("http://logicaServicios/", "consultarGrupoEvaluacion");
    private final static QName _ConsultarIntegrantesQueNoPertenecenAGrupo_QNAME = new QName("http://logicaServicios/", "consultarIntegrantesQueNoPertenecenAGrupo");
    private final static QName _CrearGrupoEvaluacion_QNAME = new QName("http://logicaServicios/", "crearGrupoEvaluacion");
    private final static QName _ConsultarCompetenciasDeUnGrupoResponse_QNAME = new QName("http://logicaServicios/", "consultarCompetenciasDeUnGrupoResponse");
    private final static QName _ConsultarCompetenciasNoEstanEnGrupo_QNAME = new QName("http://logicaServicios/", "consultarCompetenciasNoEstanEnGrupo");
    private final static QName _RemoverCompetenciaDeGrupoResponse_QNAME = new QName("http://logicaServicios/", "removerCompetenciaDeGrupoResponse");
    private final static QName _RemoverCompetenciaDeGrupo_QNAME = new QName("http://logicaServicios/", "removerCompetenciaDeGrupo");
    private final static QName _CrearGrupoEvaluacionResponse_QNAME = new QName("http://logicaServicios/", "crearGrupoEvaluacionResponse");
    private final static QName _EliminarGrupoEvaluacion_QNAME = new QName("http://logicaServicios/", "eliminarGrupoEvaluacion");
    private final static QName _ConsultarCompetenciasNoEstanEnGrupoResponse_QNAME = new QName("http://logicaServicios/", "consultarCompetenciasNoEstanEnGrupoResponse");
    private final static QName _EditarGrupoEvaluacion_QNAME = new QName("http://logicaServicios/", "editarGrupoEvaluacion");
    private final static QName _EditarGrupoEvaluacionResponse_QNAME = new QName("http://logicaServicios/", "editarGrupoEvaluacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsGrupo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarCompetenciasDeUnGrupoResponse }
     * 
     */
    public ConsultarCompetenciasDeUnGrupoResponse createConsultarCompetenciasDeUnGrupoResponse() {
        return new ConsultarCompetenciasDeUnGrupoResponse();
    }

    /**
     * Create an instance of {@link ConsultarCompetenciasNoEstanEnGrupo }
     * 
     */
    public ConsultarCompetenciasNoEstanEnGrupo createConsultarCompetenciasNoEstanEnGrupo() {
        return new ConsultarCompetenciasNoEstanEnGrupo();
    }

    /**
     * Create an instance of {@link CrearGrupoEvaluacion }
     * 
     */
    public CrearGrupoEvaluacion createCrearGrupoEvaluacion() {
        return new CrearGrupoEvaluacion();
    }

    /**
     * Create an instance of {@link RemoverCompetenciaDeGrupoResponse }
     * 
     */
    public RemoverCompetenciaDeGrupoResponse createRemoverCompetenciaDeGrupoResponse() {
        return new RemoverCompetenciaDeGrupoResponse();
    }

    /**
     * Create an instance of {@link RemoverCompetenciaDeGrupo }
     * 
     */
    public RemoverCompetenciaDeGrupo createRemoverCompetenciaDeGrupo() {
        return new RemoverCompetenciaDeGrupo();
    }

    /**
     * Create an instance of {@link CrearGrupoEvaluacionResponse }
     * 
     */
    public CrearGrupoEvaluacionResponse createCrearGrupoEvaluacionResponse() {
        return new CrearGrupoEvaluacionResponse();
    }

    /**
     * Create an instance of {@link EliminarGrupoEvaluacion }
     * 
     */
    public EliminarGrupoEvaluacion createEliminarGrupoEvaluacion() {
        return new EliminarGrupoEvaluacion();
    }

    /**
     * Create an instance of {@link EditarGrupoEvaluacion }
     * 
     */
    public EditarGrupoEvaluacion createEditarGrupoEvaluacion() {
        return new EditarGrupoEvaluacion();
    }

    /**
     * Create an instance of {@link EditarGrupoEvaluacionResponse }
     * 
     */
    public EditarGrupoEvaluacionResponse createEditarGrupoEvaluacionResponse() {
        return new EditarGrupoEvaluacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarCompetenciasNoEstanEnGrupoResponse }
     * 
     */
    public ConsultarCompetenciasNoEstanEnGrupoResponse createConsultarCompetenciasNoEstanEnGrupoResponse() {
        return new ConsultarCompetenciasNoEstanEnGrupoResponse();
    }

    /**
     * Create an instance of {@link AgregarCompetenciaAGrupo }
     * 
     */
    public AgregarCompetenciaAGrupo createAgregarCompetenciaAGrupo() {
        return new AgregarCompetenciaAGrupo();
    }

    /**
     * Create an instance of {@link ConsultarGrupoEvaluacionResponse }
     * 
     */
    public ConsultarGrupoEvaluacionResponse createConsultarGrupoEvaluacionResponse() {
        return new ConsultarGrupoEvaluacionResponse();
    }

    /**
     * Create an instance of {@link AgregarCompetenciaAGrupoResponse }
     * 
     */
    public AgregarCompetenciaAGrupoResponse createAgregarCompetenciaAGrupoResponse() {
        return new AgregarCompetenciaAGrupoResponse();
    }

    /**
     * Create an instance of {@link ConsultarIntegrantesAsignadosAGrupoResponse }
     * 
     */
    public ConsultarIntegrantesAsignadosAGrupoResponse createConsultarIntegrantesAsignadosAGrupoResponse() {
        return new ConsultarIntegrantesAsignadosAGrupoResponse();
    }

    /**
     * Create an instance of {@link EliminarGrupoEvaluacionResponse }
     * 
     */
    public EliminarGrupoEvaluacionResponse createEliminarGrupoEvaluacionResponse() {
        return new EliminarGrupoEvaluacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarIntegrantesQueNoPertenecenAGrupoResponse }
     * 
     */
    public ConsultarIntegrantesQueNoPertenecenAGrupoResponse createConsultarIntegrantesQueNoPertenecenAGrupoResponse() {
        return new ConsultarIntegrantesQueNoPertenecenAGrupoResponse();
    }

    /**
     * Create an instance of {@link ConsultarCompetenciasDeUnGrupo }
     * 
     */
    public ConsultarCompetenciasDeUnGrupo createConsultarCompetenciasDeUnGrupo() {
        return new ConsultarCompetenciasDeUnGrupo();
    }

    /**
     * Create an instance of {@link ConsultarGrupoEvaluacion }
     * 
     */
    public ConsultarGrupoEvaluacion createConsultarGrupoEvaluacion() {
        return new ConsultarGrupoEvaluacion();
    }

    /**
     * Create an instance of {@link ConsultarIntegrantesQueNoPertenecenAGrupo }
     * 
     */
    public ConsultarIntegrantesQueNoPertenecenAGrupo createConsultarIntegrantesQueNoPertenecenAGrupo() {
        return new ConsultarIntegrantesQueNoPertenecenAGrupo();
    }

    /**
     * Create an instance of {@link ConsultarIntegrantesAsignadosAGrupo }
     * 
     */
    public ConsultarIntegrantesAsignadosAGrupo createConsultarIntegrantesAsignadosAGrupo() {
        return new ConsultarIntegrantesAsignadosAGrupo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCompetenciaAGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "agregarCompetenciaAGrupo")
    public JAXBElement<AgregarCompetenciaAGrupo> createAgregarCompetenciaAGrupo(AgregarCompetenciaAGrupo value) {
        return new JAXBElement<AgregarCompetenciaAGrupo>(_AgregarCompetenciaAGrupo_QNAME, AgregarCompetenciaAGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCompetenciaAGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "agregarCompetenciaAGrupoResponse")
    public JAXBElement<AgregarCompetenciaAGrupoResponse> createAgregarCompetenciaAGrupoResponse(AgregarCompetenciaAGrupoResponse value) {
        return new JAXBElement<AgregarCompetenciaAGrupoResponse>(_AgregarCompetenciaAGrupoResponse_QNAME, AgregarCompetenciaAGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarIntegrantesAsignadosAGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarIntegrantesAsignadosAGrupoResponse")
    public JAXBElement<ConsultarIntegrantesAsignadosAGrupoResponse> createConsultarIntegrantesAsignadosAGrupoResponse(ConsultarIntegrantesAsignadosAGrupoResponse value) {
        return new JAXBElement<ConsultarIntegrantesAsignadosAGrupoResponse>(_ConsultarIntegrantesAsignadosAGrupoResponse_QNAME, ConsultarIntegrantesAsignadosAGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarGrupoEvaluacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "eliminarGrupoEvaluacionResponse")
    public JAXBElement<EliminarGrupoEvaluacionResponse> createEliminarGrupoEvaluacionResponse(EliminarGrupoEvaluacionResponse value) {
        return new JAXBElement<EliminarGrupoEvaluacionResponse>(_EliminarGrupoEvaluacionResponse_QNAME, EliminarGrupoEvaluacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarGrupoEvaluacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarGrupoEvaluacionResponse")
    public JAXBElement<ConsultarGrupoEvaluacionResponse> createConsultarGrupoEvaluacionResponse(ConsultarGrupoEvaluacionResponse value) {
        return new JAXBElement<ConsultarGrupoEvaluacionResponse>(_ConsultarGrupoEvaluacionResponse_QNAME, ConsultarGrupoEvaluacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarIntegrantesQueNoPertenecenAGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarIntegrantesQueNoPertenecenAGrupoResponse")
    public JAXBElement<ConsultarIntegrantesQueNoPertenecenAGrupoResponse> createConsultarIntegrantesQueNoPertenecenAGrupoResponse(ConsultarIntegrantesQueNoPertenecenAGrupoResponse value) {
        return new JAXBElement<ConsultarIntegrantesQueNoPertenecenAGrupoResponse>(_ConsultarIntegrantesQueNoPertenecenAGrupoResponse_QNAME, ConsultarIntegrantesQueNoPertenecenAGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCompetenciasDeUnGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarCompetenciasDeUnGrupo")
    public JAXBElement<ConsultarCompetenciasDeUnGrupo> createConsultarCompetenciasDeUnGrupo(ConsultarCompetenciasDeUnGrupo value) {
        return new JAXBElement<ConsultarCompetenciasDeUnGrupo>(_ConsultarCompetenciasDeUnGrupo_QNAME, ConsultarCompetenciasDeUnGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarIntegrantesAsignadosAGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarIntegrantesAsignadosAGrupo")
    public JAXBElement<ConsultarIntegrantesAsignadosAGrupo> createConsultarIntegrantesAsignadosAGrupo(ConsultarIntegrantesAsignadosAGrupo value) {
        return new JAXBElement<ConsultarIntegrantesAsignadosAGrupo>(_ConsultarIntegrantesAsignadosAGrupo_QNAME, ConsultarIntegrantesAsignadosAGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarGrupoEvaluacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarGrupoEvaluacion")
    public JAXBElement<ConsultarGrupoEvaluacion> createConsultarGrupoEvaluacion(ConsultarGrupoEvaluacion value) {
        return new JAXBElement<ConsultarGrupoEvaluacion>(_ConsultarGrupoEvaluacion_QNAME, ConsultarGrupoEvaluacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarIntegrantesQueNoPertenecenAGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarIntegrantesQueNoPertenecenAGrupo")
    public JAXBElement<ConsultarIntegrantesQueNoPertenecenAGrupo> createConsultarIntegrantesQueNoPertenecenAGrupo(ConsultarIntegrantesQueNoPertenecenAGrupo value) {
        return new JAXBElement<ConsultarIntegrantesQueNoPertenecenAGrupo>(_ConsultarIntegrantesQueNoPertenecenAGrupo_QNAME, ConsultarIntegrantesQueNoPertenecenAGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearGrupoEvaluacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearGrupoEvaluacion")
    public JAXBElement<CrearGrupoEvaluacion> createCrearGrupoEvaluacion(CrearGrupoEvaluacion value) {
        return new JAXBElement<CrearGrupoEvaluacion>(_CrearGrupoEvaluacion_QNAME, CrearGrupoEvaluacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCompetenciasDeUnGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarCompetenciasDeUnGrupoResponse")
    public JAXBElement<ConsultarCompetenciasDeUnGrupoResponse> createConsultarCompetenciasDeUnGrupoResponse(ConsultarCompetenciasDeUnGrupoResponse value) {
        return new JAXBElement<ConsultarCompetenciasDeUnGrupoResponse>(_ConsultarCompetenciasDeUnGrupoResponse_QNAME, ConsultarCompetenciasDeUnGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCompetenciasNoEstanEnGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarCompetenciasNoEstanEnGrupo")
    public JAXBElement<ConsultarCompetenciasNoEstanEnGrupo> createConsultarCompetenciasNoEstanEnGrupo(ConsultarCompetenciasNoEstanEnGrupo value) {
        return new JAXBElement<ConsultarCompetenciasNoEstanEnGrupo>(_ConsultarCompetenciasNoEstanEnGrupo_QNAME, ConsultarCompetenciasNoEstanEnGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverCompetenciaDeGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "removerCompetenciaDeGrupoResponse")
    public JAXBElement<RemoverCompetenciaDeGrupoResponse> createRemoverCompetenciaDeGrupoResponse(RemoverCompetenciaDeGrupoResponse value) {
        return new JAXBElement<RemoverCompetenciaDeGrupoResponse>(_RemoverCompetenciaDeGrupoResponse_QNAME, RemoverCompetenciaDeGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverCompetenciaDeGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "removerCompetenciaDeGrupo")
    public JAXBElement<RemoverCompetenciaDeGrupo> createRemoverCompetenciaDeGrupo(RemoverCompetenciaDeGrupo value) {
        return new JAXBElement<RemoverCompetenciaDeGrupo>(_RemoverCompetenciaDeGrupo_QNAME, RemoverCompetenciaDeGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearGrupoEvaluacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearGrupoEvaluacionResponse")
    public JAXBElement<CrearGrupoEvaluacionResponse> createCrearGrupoEvaluacionResponse(CrearGrupoEvaluacionResponse value) {
        return new JAXBElement<CrearGrupoEvaluacionResponse>(_CrearGrupoEvaluacionResponse_QNAME, CrearGrupoEvaluacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarGrupoEvaluacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "eliminarGrupoEvaluacion")
    public JAXBElement<EliminarGrupoEvaluacion> createEliminarGrupoEvaluacion(EliminarGrupoEvaluacion value) {
        return new JAXBElement<EliminarGrupoEvaluacion>(_EliminarGrupoEvaluacion_QNAME, EliminarGrupoEvaluacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCompetenciasNoEstanEnGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarCompetenciasNoEstanEnGrupoResponse")
    public JAXBElement<ConsultarCompetenciasNoEstanEnGrupoResponse> createConsultarCompetenciasNoEstanEnGrupoResponse(ConsultarCompetenciasNoEstanEnGrupoResponse value) {
        return new JAXBElement<ConsultarCompetenciasNoEstanEnGrupoResponse>(_ConsultarCompetenciasNoEstanEnGrupoResponse_QNAME, ConsultarCompetenciasNoEstanEnGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarGrupoEvaluacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarGrupoEvaluacion")
    public JAXBElement<EditarGrupoEvaluacion> createEditarGrupoEvaluacion(EditarGrupoEvaluacion value) {
        return new JAXBElement<EditarGrupoEvaluacion>(_EditarGrupoEvaluacion_QNAME, EditarGrupoEvaluacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarGrupoEvaluacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarGrupoEvaluacionResponse")
    public JAXBElement<EditarGrupoEvaluacionResponse> createEditarGrupoEvaluacionResponse(EditarGrupoEvaluacionResponse value) {
        return new JAXBElement<EditarGrupoEvaluacionResponse>(_EditarGrupoEvaluacionResponse_QNAME, EditarGrupoEvaluacionResponse.class, null, value);
    }

}
