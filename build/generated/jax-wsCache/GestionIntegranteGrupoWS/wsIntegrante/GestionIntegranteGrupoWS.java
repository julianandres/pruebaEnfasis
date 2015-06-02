
package wsIntegrante;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GestionIntegranteGrupoWS", targetNamespace = "http://logicaServicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GestionIntegranteGrupoWS {


    /**
     * 
     * @param infoAdicional
     * @param codigo
     * @param fechaNacimiento
     * @param apellido
     * @param codigoIntegranteAEditar
     * @param codigoEvaluador
     * @param nombre
     * @param codigosGruposQuePertenece
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarIntegranteGrupo", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.EditarIntegranteGrupo")
    @ResponseWrapper(localName = "editarIntegranteGrupoResponse", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.EditarIntegranteGrupoResponse")
    @Action(input = "http://logicaServicios/GestionIntegranteGrupoWS/editarIntegranteGrupoRequest", output = "http://logicaServicios/GestionIntegranteGrupoWS/editarIntegranteGrupoResponse")
    public boolean editarIntegranteGrupo(
        @WebParam(name = "codigoIntegranteAEditar", targetNamespace = "")
        String codigoIntegranteAEditar,
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "fechaNacimiento", targetNamespace = "")
        String fechaNacimiento,
        @WebParam(name = "infoAdicional", targetNamespace = "")
        String infoAdicional,
        @WebParam(name = "codigosGruposQuePertenece", targetNamespace = "")
        String codigosGruposQuePertenece,
        @WebParam(name = "codigoEvaluador", targetNamespace = "")
        String codigoEvaluador);

    /**
     * 
     * @param codigoIntegranteAsignar
     * @param codigoGrupoAsignar
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarIntegranteAGrupo", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.AgregarIntegranteAGrupo")
    @ResponseWrapper(localName = "agregarIntegranteAGrupoResponse", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.AgregarIntegranteAGrupoResponse")
    @Action(input = "http://logicaServicios/GestionIntegranteGrupoWS/agregarIntegranteAGrupoRequest", output = "http://logicaServicios/GestionIntegranteGrupoWS/agregarIntegranteAGrupoResponse")
    public boolean agregarIntegranteAGrupo(
        @WebParam(name = "codigoGrupoAsignar", targetNamespace = "")
        String codigoGrupoAsignar,
        @WebParam(name = "codigoIntegranteAsignar", targetNamespace = "")
        String codigoIntegranteAsignar);

    /**
     * 
     * @param codigoIntegranteAEliminar
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarIntegranteGrupo", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.EliminarIntegranteGrupo")
    @ResponseWrapper(localName = "eliminarIntegranteGrupoResponse", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.EliminarIntegranteGrupoResponse")
    @Action(input = "http://logicaServicios/GestionIntegranteGrupoWS/eliminarIntegranteGrupoRequest", output = "http://logicaServicios/GestionIntegranteGrupoWS/eliminarIntegranteGrupoResponse")
    public boolean eliminarIntegranteGrupo(
        @WebParam(name = "codigoIntegranteAEliminar", targetNamespace = "")
        String codigoIntegranteAEliminar);

    /**
     * 
     * @param infoAdicional
     * @param codigo
     * @param fechaNacimiento
     * @param apellido
     * @param codigoEvaluador
     * @param nombre
     * @param codigosGruposQuePertenece
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarIntegranteGrupo", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.ConsultarIntegranteGrupo")
    @ResponseWrapper(localName = "consultarIntegranteGrupoResponse", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.ConsultarIntegranteGrupoResponse")
    @Action(input = "http://logicaServicios/GestionIntegranteGrupoWS/consultarIntegranteGrupoRequest", output = "http://logicaServicios/GestionIntegranteGrupoWS/consultarIntegranteGrupoResponse")
    public String consultarIntegranteGrupo(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "fechaNacimiento", targetNamespace = "")
        String fechaNacimiento,
        @WebParam(name = "infoAdicional", targetNamespace = "")
        String infoAdicional,
        @WebParam(name = "codigosGruposQuePertenece", targetNamespace = "")
        String codigosGruposQuePertenece,
        @WebParam(name = "codigoEvaluador", targetNamespace = "")
        String codigoEvaluador);

    /**
     * 
     * @param infoAdicional
     * @param fechaNacimiento
     * @param apellido
     * @param codigoEvaluador
     * @param nombre
     * @param codigosGruposQuePertenece
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearIntegranteGrupo", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.CrearIntegranteGrupo")
    @ResponseWrapper(localName = "crearIntegranteGrupoResponse", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.CrearIntegranteGrupoResponse")
    @Action(input = "http://logicaServicios/GestionIntegranteGrupoWS/crearIntegranteGrupoRequest", output = "http://logicaServicios/GestionIntegranteGrupoWS/crearIntegranteGrupoResponse")
    public boolean crearIntegranteGrupo(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "fechaNacimiento", targetNamespace = "")
        String fechaNacimiento,
        @WebParam(name = "infoAdicional", targetNamespace = "")
        String infoAdicional,
        @WebParam(name = "codigosGruposQuePertenece", targetNamespace = "")
        String codigosGruposQuePertenece,
        @WebParam(name = "codigoEvaluador", targetNamespace = "")
        String codigoEvaluador);

    /**
     * 
     * @param codigoIntegrante
     * @param codigoGrupo
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removerIntegranteDeGrupo", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.RemoverIntegranteDeGrupo")
    @ResponseWrapper(localName = "removerIntegranteDeGrupoResponse", targetNamespace = "http://logicaServicios/", className = "wsIntegrante.RemoverIntegranteDeGrupoResponse")
    @Action(input = "http://logicaServicios/GestionIntegranteGrupoWS/removerIntegranteDeGrupoRequest", output = "http://logicaServicios/GestionIntegranteGrupoWS/removerIntegranteDeGrupoResponse")
    public boolean removerIntegranteDeGrupo(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        String codigoGrupo,
        @WebParam(name = "codigoIntegrante", targetNamespace = "")
        String codigoIntegrante);

}
