
package wsCompetence;

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
@WebService(name = "GestionCompetenciaWS", targetNamespace = "http://logicaServicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GestionCompetenciaWS {


    /**
     * 
     * @param codigoCompetenciaAEliminar
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarCompetencia", targetNamespace = "http://logicaServicios/", className = "wsCompetence.EliminarCompetencia")
    @ResponseWrapper(localName = "eliminarCompetenciaResponse", targetNamespace = "http://logicaServicios/", className = "wsCompetence.EliminarCompetenciaResponse")
    @Action(input = "http://logicaServicios/GestionCompetenciaWS/eliminarCompetenciaRequest", output = "http://logicaServicios/GestionCompetenciaWS/eliminarCompetenciaResponse")
    public boolean eliminarCompetencia(
        @WebParam(name = "codigoCompetenciaAEliminar", targetNamespace = "")
        String codigoCompetenciaAEliminar);

    /**
     * 
     * @param descripcion
     * @param codigo
     * @param codigoActividad
     * @param codigoEvaluador
     * @param codigoCompetenciaEditar
     * @param nombre
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarCompetencia", targetNamespace = "http://logicaServicios/", className = "wsCompetence.EditarCompetencia")
    @ResponseWrapper(localName = "editarCompetenciaResponse", targetNamespace = "http://logicaServicios/", className = "wsCompetence.EditarCompetenciaResponse")
    @Action(input = "http://logicaServicios/GestionCompetenciaWS/editarCompetenciaRequest", output = "http://logicaServicios/GestionCompetenciaWS/editarCompetenciaResponse")
    public boolean editarCompetencia(
        @WebParam(name = "codigoCompetenciaEditar", targetNamespace = "")
        String codigoCompetenciaEditar,
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion,
        @WebParam(name = "codigoActividad", targetNamespace = "")
        String codigoActividad,
        @WebParam(name = "codigoEvaluador", targetNamespace = "")
        String codigoEvaluador);

    /**
     * 
     * @param descripcion
     * @param codigo
     * @param codigoActividad
     * @param codigoEvaluador
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarCompetencia", targetNamespace = "http://logicaServicios/", className = "wsCompetence.ConsultarCompetencia")
    @ResponseWrapper(localName = "consultarCompetenciaResponse", targetNamespace = "http://logicaServicios/", className = "wsCompetence.ConsultarCompetenciaResponse")
    @Action(input = "http://logicaServicios/GestionCompetenciaWS/consultarCompetenciaRequest", output = "http://logicaServicios/GestionCompetenciaWS/consultarCompetenciaResponse")
    public String consultarCompetencia(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion,
        @WebParam(name = "codigoActividad", targetNamespace = "")
        String codigoActividad,
        @WebParam(name = "codigoEvaluador", targetNamespace = "")
        String codigoEvaluador);

    /**
     * 
     * @param descripcion
     * @param codigoActividad
     * @param codigoEvaluador
     * @param nombre
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearCompetencia", targetNamespace = "http://logicaServicios/", className = "wsCompetence.CrearCompetencia")
    @ResponseWrapper(localName = "crearCompetenciaResponse", targetNamespace = "http://logicaServicios/", className = "wsCompetence.CrearCompetenciaResponse")
    @Action(input = "http://logicaServicios/GestionCompetenciaWS/crearCompetenciaRequest", output = "http://logicaServicios/GestionCompetenciaWS/crearCompetenciaResponse")
    public boolean crearCompetencia(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion,
        @WebParam(name = "codigoActividad", targetNamespace = "")
        String codigoActividad,
        @WebParam(name = "codigoEvaluador", targetNamespace = "")
        String codigoEvaluador);

}
