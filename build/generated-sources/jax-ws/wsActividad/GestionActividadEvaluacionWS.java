
package wsActividad;

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
@WebService(name = "GestionActividadEvaluacionWS", targetNamespace = "http://logicaServicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GestionActividadEvaluacionWS {


    /**
     * 
     * @param descripcion
     * @param codigo
     * @param tipo
     * @param fechaRealizacion
     * @param codigoBusqueda
     * @param codigoEscala
     * @param nombre
     * @param codigoGrupoRealizacion
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarActividadEvaluacion", targetNamespace = "http://logicaServicios/", className = "wsActividad.EditarActividadEvaluacion")
    @ResponseWrapper(localName = "editarActividadEvaluacionResponse", targetNamespace = "http://logicaServicios/", className = "wsActividad.EditarActividadEvaluacionResponse")
    @Action(input = "http://logicaServicios/GestionActividadEvaluacionWS/editarActividadEvaluacionRequest", output = "http://logicaServicios/GestionActividadEvaluacionWS/editarActividadEvaluacionResponse")
    public boolean editarActividadEvaluacion(
        @WebParam(name = "codigoBusqueda", targetNamespace = "")
        String codigoBusqueda,
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "tipo", targetNamespace = "")
        String tipo,
        @WebParam(name = "fechaRealizacion", targetNamespace = "")
        String fechaRealizacion,
        @WebParam(name = "codigoEscala", targetNamespace = "")
        String codigoEscala,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion,
        @WebParam(name = "codigoGrupoRealizacion", targetNamespace = "")
        String codigoGrupoRealizacion);

    /**
     * 
     * @param descripcion
     * @param tipo
     * @param fechaRealizacion
     * @param codigoEscala
     * @param nombre
     * @param codigoGrupoRealizacion
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearActividadEvaluacion", targetNamespace = "http://logicaServicios/", className = "wsActividad.CrearActividadEvaluacion")
    @ResponseWrapper(localName = "crearActividadEvaluacionResponse", targetNamespace = "http://logicaServicios/", className = "wsActividad.CrearActividadEvaluacionResponse")
    @Action(input = "http://logicaServicios/GestionActividadEvaluacionWS/crearActividadEvaluacionRequest", output = "http://logicaServicios/GestionActividadEvaluacionWS/crearActividadEvaluacionResponse")
    public boolean crearActividadEvaluacion(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "tipo", targetNamespace = "")
        String tipo,
        @WebParam(name = "fechaRealizacion", targetNamespace = "")
        String fechaRealizacion,
        @WebParam(name = "codigoEscala", targetNamespace = "")
        String codigoEscala,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion,
        @WebParam(name = "codigoGrupoRealizacion", targetNamespace = "")
        String codigoGrupoRealizacion);

    /**
     * 
     * @param codigoAeliminar
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarActividadEvaluacion", targetNamespace = "http://logicaServicios/", className = "wsActividad.EliminarActividadEvaluacion")
    @ResponseWrapper(localName = "eliminarActividadEvaluacionResponse", targetNamespace = "http://logicaServicios/", className = "wsActividad.EliminarActividadEvaluacionResponse")
    @Action(input = "http://logicaServicios/GestionActividadEvaluacionWS/eliminarActividadEvaluacionRequest", output = "http://logicaServicios/GestionActividadEvaluacionWS/eliminarActividadEvaluacionResponse")
    public boolean eliminarActividadEvaluacion(
        @WebParam(name = "codigoAeliminar", targetNamespace = "")
        String codigoAeliminar);

    /**
     * 
     * @param descripcion
     * @param codigo
     * @param tipo
     * @param fechaRealizacion
     * @param codigoEscala
     * @param nombre
     * @param codigoGrupoRealizacion
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarActividadEvaluacion", targetNamespace = "http://logicaServicios/", className = "wsActividad.ConsultarActividadEvaluacion")
    @ResponseWrapper(localName = "consultarActividadEvaluacionResponse", targetNamespace = "http://logicaServicios/", className = "wsActividad.ConsultarActividadEvaluacionResponse")
    @Action(input = "http://logicaServicios/GestionActividadEvaluacionWS/consultarActividadEvaluacionRequest", output = "http://logicaServicios/GestionActividadEvaluacionWS/consultarActividadEvaluacionResponse")
    public String consultarActividadEvaluacion(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "tipo", targetNamespace = "")
        String tipo,
        @WebParam(name = "fechaRealizacion", targetNamespace = "")
        String fechaRealizacion,
        @WebParam(name = "codigoEscala", targetNamespace = "")
        String codigoEscala,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion,
        @WebParam(name = "codigoGrupoRealizacion", targetNamespace = "")
        String codigoGrupoRealizacion);

}
