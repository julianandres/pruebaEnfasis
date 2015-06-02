
package wsIntegrante;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsIntegrante package. 
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

    private final static QName _AgregarIntegranteAGrupoResponse_QNAME = new QName("http://logicaServicios/", "agregarIntegranteAGrupoResponse");
    private final static QName _EliminarIntegranteGrupo_QNAME = new QName("http://logicaServicios/", "eliminarIntegranteGrupo");
    private final static QName _EliminarIntegranteGrupoResponse_QNAME = new QName("http://logicaServicios/", "eliminarIntegranteGrupoResponse");
    private final static QName _RemoverIntegranteDeGrupo_QNAME = new QName("http://logicaServicios/", "removerIntegranteDeGrupo");
    private final static QName _CrearIntegranteGrupoResponse_QNAME = new QName("http://logicaServicios/", "crearIntegranteGrupoResponse");
    private final static QName _EditarIntegranteGrupoResponse_QNAME = new QName("http://logicaServicios/", "editarIntegranteGrupoResponse");
    private final static QName _AgregarIntegranteAGrupo_QNAME = new QName("http://logicaServicios/", "agregarIntegranteAGrupo");
    private final static QName _EditarIntegranteGrupo_QNAME = new QName("http://logicaServicios/", "editarIntegranteGrupo");
    private final static QName _ConsultarIntegranteGrupoResponse_QNAME = new QName("http://logicaServicios/", "consultarIntegranteGrupoResponse");
    private final static QName _CrearIntegranteGrupo_QNAME = new QName("http://logicaServicios/", "crearIntegranteGrupo");
    private final static QName _RemoverIntegranteDeGrupoResponse_QNAME = new QName("http://logicaServicios/", "removerIntegranteDeGrupoResponse");
    private final static QName _ConsultarIntegranteGrupo_QNAME = new QName("http://logicaServicios/", "consultarIntegranteGrupo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsIntegrante
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarIntegranteGrupo }
     * 
     */
    public EliminarIntegranteGrupo createEliminarIntegranteGrupo() {
        return new EliminarIntegranteGrupo();
    }

    /**
     * Create an instance of {@link EliminarIntegranteGrupoResponse }
     * 
     */
    public EliminarIntegranteGrupoResponse createEliminarIntegranteGrupoResponse() {
        return new EliminarIntegranteGrupoResponse();
    }

    /**
     * Create an instance of {@link RemoverIntegranteDeGrupo }
     * 
     */
    public RemoverIntegranteDeGrupo createRemoverIntegranteDeGrupo() {
        return new RemoverIntegranteDeGrupo();
    }

    /**
     * Create an instance of {@link AgregarIntegranteAGrupoResponse }
     * 
     */
    public AgregarIntegranteAGrupoResponse createAgregarIntegranteAGrupoResponse() {
        return new AgregarIntegranteAGrupoResponse();
    }

    /**
     * Create an instance of {@link CrearIntegranteGrupoResponse }
     * 
     */
    public CrearIntegranteGrupoResponse createCrearIntegranteGrupoResponse() {
        return new CrearIntegranteGrupoResponse();
    }

    /**
     * Create an instance of {@link ConsultarIntegranteGrupoResponse }
     * 
     */
    public ConsultarIntegranteGrupoResponse createConsultarIntegranteGrupoResponse() {
        return new ConsultarIntegranteGrupoResponse();
    }

    /**
     * Create an instance of {@link CrearIntegranteGrupo }
     * 
     */
    public CrearIntegranteGrupo createCrearIntegranteGrupo() {
        return new CrearIntegranteGrupo();
    }

    /**
     * Create an instance of {@link RemoverIntegranteDeGrupoResponse }
     * 
     */
    public RemoverIntegranteDeGrupoResponse createRemoverIntegranteDeGrupoResponse() {
        return new RemoverIntegranteDeGrupoResponse();
    }

    /**
     * Create an instance of {@link EditarIntegranteGrupoResponse }
     * 
     */
    public EditarIntegranteGrupoResponse createEditarIntegranteGrupoResponse() {
        return new EditarIntegranteGrupoResponse();
    }

    /**
     * Create an instance of {@link AgregarIntegranteAGrupo }
     * 
     */
    public AgregarIntegranteAGrupo createAgregarIntegranteAGrupo() {
        return new AgregarIntegranteAGrupo();
    }

    /**
     * Create an instance of {@link EditarIntegranteGrupo }
     * 
     */
    public EditarIntegranteGrupo createEditarIntegranteGrupo() {
        return new EditarIntegranteGrupo();
    }

    /**
     * Create an instance of {@link ConsultarIntegranteGrupo }
     * 
     */
    public ConsultarIntegranteGrupo createConsultarIntegranteGrupo() {
        return new ConsultarIntegranteGrupo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarIntegranteAGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "agregarIntegranteAGrupoResponse")
    public JAXBElement<AgregarIntegranteAGrupoResponse> createAgregarIntegranteAGrupoResponse(AgregarIntegranteAGrupoResponse value) {
        return new JAXBElement<AgregarIntegranteAGrupoResponse>(_AgregarIntegranteAGrupoResponse_QNAME, AgregarIntegranteAGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarIntegranteGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "eliminarIntegranteGrupo")
    public JAXBElement<EliminarIntegranteGrupo> createEliminarIntegranteGrupo(EliminarIntegranteGrupo value) {
        return new JAXBElement<EliminarIntegranteGrupo>(_EliminarIntegranteGrupo_QNAME, EliminarIntegranteGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarIntegranteGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "eliminarIntegranteGrupoResponse")
    public JAXBElement<EliminarIntegranteGrupoResponse> createEliminarIntegranteGrupoResponse(EliminarIntegranteGrupoResponse value) {
        return new JAXBElement<EliminarIntegranteGrupoResponse>(_EliminarIntegranteGrupoResponse_QNAME, EliminarIntegranteGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverIntegranteDeGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "removerIntegranteDeGrupo")
    public JAXBElement<RemoverIntegranteDeGrupo> createRemoverIntegranteDeGrupo(RemoverIntegranteDeGrupo value) {
        return new JAXBElement<RemoverIntegranteDeGrupo>(_RemoverIntegranteDeGrupo_QNAME, RemoverIntegranteDeGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearIntegranteGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearIntegranteGrupoResponse")
    public JAXBElement<CrearIntegranteGrupoResponse> createCrearIntegranteGrupoResponse(CrearIntegranteGrupoResponse value) {
        return new JAXBElement<CrearIntegranteGrupoResponse>(_CrearIntegranteGrupoResponse_QNAME, CrearIntegranteGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarIntegranteGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarIntegranteGrupoResponse")
    public JAXBElement<EditarIntegranteGrupoResponse> createEditarIntegranteGrupoResponse(EditarIntegranteGrupoResponse value) {
        return new JAXBElement<EditarIntegranteGrupoResponse>(_EditarIntegranteGrupoResponse_QNAME, EditarIntegranteGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarIntegranteAGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "agregarIntegranteAGrupo")
    public JAXBElement<AgregarIntegranteAGrupo> createAgregarIntegranteAGrupo(AgregarIntegranteAGrupo value) {
        return new JAXBElement<AgregarIntegranteAGrupo>(_AgregarIntegranteAGrupo_QNAME, AgregarIntegranteAGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarIntegranteGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "editarIntegranteGrupo")
    public JAXBElement<EditarIntegranteGrupo> createEditarIntegranteGrupo(EditarIntegranteGrupo value) {
        return new JAXBElement<EditarIntegranteGrupo>(_EditarIntegranteGrupo_QNAME, EditarIntegranteGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarIntegranteGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarIntegranteGrupoResponse")
    public JAXBElement<ConsultarIntegranteGrupoResponse> createConsultarIntegranteGrupoResponse(ConsultarIntegranteGrupoResponse value) {
        return new JAXBElement<ConsultarIntegranteGrupoResponse>(_ConsultarIntegranteGrupoResponse_QNAME, ConsultarIntegranteGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearIntegranteGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "crearIntegranteGrupo")
    public JAXBElement<CrearIntegranteGrupo> createCrearIntegranteGrupo(CrearIntegranteGrupo value) {
        return new JAXBElement<CrearIntegranteGrupo>(_CrearIntegranteGrupo_QNAME, CrearIntegranteGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverIntegranteDeGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "removerIntegranteDeGrupoResponse")
    public JAXBElement<RemoverIntegranteDeGrupoResponse> createRemoverIntegranteDeGrupoResponse(RemoverIntegranteDeGrupoResponse value) {
        return new JAXBElement<RemoverIntegranteDeGrupoResponse>(_RemoverIntegranteDeGrupoResponse_QNAME, RemoverIntegranteDeGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarIntegranteGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logicaServicios/", name = "consultarIntegranteGrupo")
    public JAXBElement<ConsultarIntegranteGrupo> createConsultarIntegranteGrupo(ConsultarIntegranteGrupo value) {
        return new JAXBElement<ConsultarIntegranteGrupo>(_ConsultarIntegranteGrupo_QNAME, ConsultarIntegranteGrupo.class, null, value);
    }

}
