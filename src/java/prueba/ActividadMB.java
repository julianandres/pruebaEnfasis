/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;



import com.google.gson.Gson;
import modelos.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import wsActividad.GestionActividadEvaluacionWS;
import wsActividad.GestionActividadEvaluacionWS_Service;

/**
 *
 * @author Carlos Andres
 */
@ManagedBean
@SessionScoped
public class ActividadMB {
    GestionActividadEvaluacionWS_Service activws_service = new GestionActividadEvaluacionWS_Service();
    GestionActividadEvaluacionWS activws;
    GrupoMB grupoeval;
    
    public ActividadMB() {
        activws = activws_service.getGestionActividadEvaluacionWSPort();
        FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        grupoeval =(GrupoMB) session.getAttribute("grupoMB");
        grupoSelected=grupoeval.getGrupoSeleccionado();
        System.out.println(grupoSelected.getNombre());
        consultarActividadesByGrupo();
    }
    
    private String nombre;
    private String tipo;
    private String fechaRealizacion;
    private String codigoEscala;
    private String descripcion;
    private String codigoGrupoRealizacion;
    private String codigoActividad;
    private String msg="";
    private GrupoEvaluacion grupoSelected;
    private ActividadEvaluacion actSelected;
    private List<ActividadEvaluacion> actividades;
    ///////////////////// SETS & gets ////////////////////////////////

    public ActividadEvaluacion getActSelected() {
        return actSelected;
    }

    public void setActSelected(ActividadEvaluacion actSelected) {
        this.actSelected = actSelected;
    }
    public List<ActividadEvaluacion> getActividades() {
        return actividades;
    }

    public void setActividades(List<ActividadEvaluacion> actividades) {
        this.actividades = actividades;
    }
    public GrupoEvaluacion getGrupoSelected() {
        return grupoSelected;
    }

    public void setGrupoSelected(GrupoEvaluacion grupoSelected) {
        this.grupoSelected = grupoSelected;
    }
    
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getCodigoEscala() {
        return codigoEscala;
    }

    public void setCodigoEscala(String codigoEscala) {
        this.codigoEscala = codigoEscala;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoGrupoRealizacion() {
        return codigoGrupoRealizacion;
    }

    public void setCodigoGrupoRealizacion(String codigoGrupoRealizacion) {
        this.codigoGrupoRealizacion = codigoGrupoRealizacion;
    }

    public String getCodigoActividad() {
        return codigoActividad;
    }

    public void setCodigoActividad(String codigoActividad) {
        this.codigoActividad = codigoActividad;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    /////////////////////  FIN SETS & gets ////////////////////////////

     /////////////////////  MÉTODOS -redirección- ////////////////////////////
    public String mostrarCrearActividad(){
        codigoEscala="";
        nombre="";
        tipo="";
        fechaRealizacion="";
        codigoEscala="";
        descripcion="";
        return "crearActividad.xhtml?faces-redirect=true";
    }
    public String mostarEditarActividad(){
        if(actSelected!=null){
        return "editarActividad.xhtml?faces-redirect=true";
        }else{
        return "actividades.xhtml";
         }
    }
   
    ///////////////////// FIN  MÉTODOS -redirección- ////////////////////////////
    
    /////////////////////  MÉTODOS -funciones- ////////////////////////////
    public String crearActividad(){
        grupoSelected=grupoeval.getGrupoSeleccionado();
       
        
        if(grupoSelected!=null){
            System.out.println(grupoSelected.getCodigo());
        codigoGrupoRealizacion=grupoSelected.getCodigo();
        if(activws.crearActividadEvaluacion(nombre, tipo, fechaRealizacion, codigoEscala, descripcion, codigoGrupoRealizacion)){
            msg = "Actividad creada";
        } else {msg = "Error al crear actividad";}
        System.out.println(msg);
        consultarActividadesByGrupo();
        return "actividades.xhtml?faces-redirect=true";
        }else{
        return "crearActividad.xhtml";
        }
    }    
    public String editarActividad(){
        
        grupoSelected=grupoeval.getGrupoSeleccionado();
       if(actSelected!=null){
        if (activws.editarActividadEvaluacion(actSelected.getCodigo(), actSelected.getCodigo(),actSelected.getNombre(), 
            actSelected.getTipo(), actSelected.getFechaRealizacion(),actSelected.getCodigoEscala(), actSelected.getDescripcion(), actSelected.getCodigoGrupoRealizacion())){
            msg = "Actividad editada";
        } else {msg = "Error al editar actividad";}
       }
       
        System.out.println(msg);
        consultarActividadesByGrupo();
        return "actividades.xhtml?faces-redirect=true";
    }
    public String eliminarActividad(){
    if(actSelected!=null){    
    if (activws.eliminarActividadEvaluacion(actSelected.getCodigo())){
            msg = "Actividad eliminada";
        } else {msg = "Error al eliminar actividad";}
        System.out.println(msg);
        
        consultarActividadesByGrupo();
        return "actividades.xhtml?faces-redirect=true";
    }else{
        return "actividades.xhtml";
    }
    }
    public void consultarActividades(){
       String resultado;
       Gson gson = new Gson();
       final Type tipoListaActividades = new TypeToken<List<ActividadEvaluacion>>(){}.getType();
       ArrayList<ActividadEvaluacion> listaConsulta = new ArrayList<ActividadEvaluacion>();
       resultado = activws.consultarActividadEvaluacion(codigoActividad, nombre, tipo, fechaRealizacion, codigoEscala, descripcion, codigoGrupoRealizacion);
       System.out.println("resultado : "+resultado);
       ActividadEvaluacion activ = new ActividadEvaluacion();
       listaConsulta = (ArrayList<ActividadEvaluacion>)gson.fromJson(resultado, tipoListaActividades);       
       activ = listaConsulta.get(0);
       codigoActividad = activ.getCodigo();
       nombre = activ.getNombre();
       tipo = activ.getTipo();
       fechaRealizacion = activ.getFechaRealizacion();
       codigoEscala = activ.getCodigoEscala();
       descripcion = activ.getDescripcion();
       codigoGrupoRealizacion = activ.getCodigoGrupoRealizacion();
    }
     public void consultarActividadesByGrupo(){
       String resultado;
       Gson gson = new Gson();
       grupoSelected=grupoeval.getGrupoSeleccionado();
       final Type tipoListaActividades = new TypeToken<List<ActividadEvaluacion>>(){}.getType();
       ArrayList<ActividadEvaluacion> listaConsulta = new ArrayList<ActividadEvaluacion>();
       resultado = activws.consultarActividadEvaluacion(null,null,null,null,null,null,grupoSelected.getCodigo());
       System.out.println("resultado actividades : "+resultado);
       listaConsulta = (ArrayList<ActividadEvaluacion>)gson.fromJson(resultado, tipoListaActividades);       
       actividades =listaConsulta;
    }
    ///////////////////// FIN MÉTODOS -funciones- //////////////////////////// 

    
}
