
package ws;

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
@WebService(name = "GestionEvaluadorWS", targetNamespace = "http://logicaServicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GestionEvaluadorWS {


    /**
     * 
     * @param informacionAdicional
     * @param codigo
     * @param password
     * @param fechaNacimiento
     * @param apellido
     * @param genero
     * @param telefono
     * @param nombre
     * @param correoElectronico
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarEvaluador", targetNamespace = "http://logicaServicios/", className = "ws.ConsultarEvaluador")
    @ResponseWrapper(localName = "consultarEvaluadorResponse", targetNamespace = "http://logicaServicios/", className = "ws.ConsultarEvaluadorResponse")
    @Action(input = "http://logicaServicios/GestionEvaluadorWS/consultarEvaluadorRequest", output = "http://logicaServicios/GestionEvaluadorWS/consultarEvaluadorResponse")
    public String consultarEvaluador(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "correoElectronico", targetNamespace = "")
        String correoElectronico,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "genero", targetNamespace = "")
        String genero,
        @WebParam(name = "fechaNacimiento", targetNamespace = "")
        String fechaNacimiento,
        @WebParam(name = "telefono", targetNamespace = "")
        String telefono,
        @WebParam(name = "informacionAdicional", targetNamespace = "")
        String informacionAdicional);

    /**
     * 
     * @param codigo
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarEvaluador", targetNamespace = "http://logicaServicios/", className = "ws.EliminarEvaluador")
    @ResponseWrapper(localName = "eliminarEvaluadorResponse", targetNamespace = "http://logicaServicios/", className = "ws.EliminarEvaluadorResponse")
    @Action(input = "http://logicaServicios/GestionEvaluadorWS/eliminarEvaluadorRequest", output = "http://logicaServicios/GestionEvaluadorWS/eliminarEvaluadorResponse")
    public boolean eliminarEvaluador(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @param informacionAdicional
     * @param codigo
     * @param password
     * @param fechaNacimiento
     * @param codigoBusqueda
     * @param apellido
     * @param genero
     * @param telefono
     * @param nombre
     * @param correoElectronico
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarEvaluador", targetNamespace = "http://logicaServicios/", className = "ws.EditarEvaluador")
    @ResponseWrapper(localName = "editarEvaluadorResponse", targetNamespace = "http://logicaServicios/", className = "ws.EditarEvaluadorResponse")
    @Action(input = "http://logicaServicios/GestionEvaluadorWS/editarEvaluadorRequest", output = "http://logicaServicios/GestionEvaluadorWS/editarEvaluadorResponse")
    public boolean editarEvaluador(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "correoElectronico", targetNamespace = "")
        String correoElectronico,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "genero", targetNamespace = "")
        String genero,
        @WebParam(name = "fechaNacimiento", targetNamespace = "")
        String fechaNacimiento,
        @WebParam(name = "telefono", targetNamespace = "")
        String telefono,
        @WebParam(name = "informacionAdicional", targetNamespace = "")
        String informacionAdicional,
        @WebParam(name = "codigoBusqueda", targetNamespace = "")
        String codigoBusqueda);

    /**
     * 
     * @param informacionAdicional
     * @param password
     * @param fechaNacimiento
     * @param apellido
     * @param genero
     * @param telefono
     * @param nombre
     * @param correoElectronico
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearEvaluador", targetNamespace = "http://logicaServicios/", className = "ws.CrearEvaluador")
    @ResponseWrapper(localName = "crearEvaluadorResponse", targetNamespace = "http://logicaServicios/", className = "ws.CrearEvaluadorResponse")
    @Action(input = "http://logicaServicios/GestionEvaluadorWS/crearEvaluadorRequest", output = "http://logicaServicios/GestionEvaluadorWS/crearEvaluadorResponse")
    public boolean crearEvaluador(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "correoElectronico", targetNamespace = "")
        String correoElectronico,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "genero", targetNamespace = "")
        String genero,
        @WebParam(name = "fechaNacimiento", targetNamespace = "")
        String fechaNacimiento,
        @WebParam(name = "telefono", targetNamespace = "")
        String telefono,
        @WebParam(name = "informacionAdicional", targetNamespace = "")
        String informacionAdicional);

}