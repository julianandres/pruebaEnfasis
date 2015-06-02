/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;


import modelos.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import wsCompetence.GestionCompetenciaWS;
import wsCompetence.GestionCompetenciaWS_Service;

/**
 *
 * @author Carlos Andres
 */
@ManagedBean
@SessionScoped
public class CompetenciaMB {
    GestionCompetenciaWS_Service compws_service = new GestionCompetenciaWS_Service();
    GestionCompetenciaWS compws;
    ActividadMB acteval;
    private ActividadEvaluacion actSelect;
    public CompetenciaMB() {
        compws = compws_service.getGestionCompetenciaWSPort();
        FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        acteval =(ActividadMB) session.getAttribute("actividadMB");
        actSelect=acteval.getActSelected();
        consultarCompetenciasByActandEval();
    }
    
    private String nombre;
    private String descripcion;
    private String codigoActividad;
    private String codigoEvaluador;
    private String codigoCompetencia; // este es el que se genera automaticamente.
    private String msg = "";
    private Competencia compSel;
    private List<Competencia> competencias;
    
    ///////////////////// SETS & gets ////////////////////////////////

    public ActividadEvaluacion getActSelect() {
        return actSelect;
    }

    public void setActSelect(ActividadEvaluacion actSelect) {
        this.actSelect = actSelect;
    }

    
    public Competencia getCompSel() {
        return compSel;
    }

    public void setCompSel(Competencia compSel) {
        this.compSel = compSel;
    }

    
    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoActividad() {
        return codigoActividad;
    }

    public void setCodigoActividad(String codigoActividad) {
        this.codigoActividad = codigoActividad;
    }

    public String getCodigoEvaluador() {
        return codigoEvaluador;
    }

    public void setCodigoEvaluador(String codigoEvaluador) {
        this.codigoEvaluador = codigoEvaluador;
    }

    public String getCodigoCompetencia() {
        return codigoCompetencia;
    }

    public void setCodigoCompetencia(String codigoCompetencia) {
        this.codigoCompetencia = codigoCompetencia;
    }
    

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
 /////////////////////  FIN SETS & gets ////////////////////////////

     /////////////////////  MÉTODOS -redirección- ////////////////////////////
    public String mostrarCrearCompetencia(){
        return "crearCompetencia.xhtml?faces-redirect=true";
    }
    public String mostarEditarCompetencia(){
        return "editarCompetencia.xhtml?faces-redirect=true";
    }
    public String mostrarEliminarCompetencia(){
        return "eliminarCompetencia.xhtml?faces-redirect=true";
    }
    ///////////////////// FIN  MÉTODOS -redirección- ////////////////////////////
    
    /////////////////////  MÉTODOS -funciones- ////////////////////////////
    public String crearCompetencia(){
        if(compws.crearCompetencia(nombre, descripcion, codigoActividad, codigoEvaluador)){
            msg = "Competencia creada";
        } else {msg = "Error al crear competencia";}
        System.out.println(msg);
        return "competencias.xhtml?faces-redirect=true";
    }    
    public String editarComptencia(){
    if (compws.editarCompetencia(codigoCompetencia, codigoCompetencia, nombre, descripcion, codigoActividad, codigoEvaluador)){
            msg = "Competencia editada";
        } else {msg = "Error al editar competencia";}
        System.out.println(msg);
        return "competencias.xhtml?faces-redirect=true";
    }
    public String eliminarCompetencia(){
    if (compws.eliminarCompetencia(codigoCompetencia)){
            msg = "Competencia eliminada";
        } else {msg = "Error al eliminar competencia";}
        System.out.println(msg);
        return "competencias.xhtml?faces-redirect=true";
    }
    public void consultarCompetencias(){
       String resultado;
       Gson gson = new Gson();
       final Type tipoListaCompetencias = new TypeToken<List<modelos.Competencia>>(){}.getType();
       ArrayList<modelos.Competencia> listaConsulta = new ArrayList<modelos.Competencia>();
       resultado = compws.consultarCompetencia(codigoCompetencia, nombre, descripcion, codigoActividad, codigoEvaluador);
       System.out.println("resultado : "+resultado);
       modelos.Competencia compe = new modelos.Competencia();
       listaConsulta = (ArrayList<modelos.Competencia>)gson.fromJson(resultado, tipoListaCompetencias);       
       compe = listaConsulta.get(0);
       codigoCompetencia = compe.getCodigo();
       nombre = compe.getNombre();
       descripcion = compe.getDescripcion();
       codigoActividad = compe.getCodigoActividad();
       codigoEvaluador = compe.getCodigoEvaluador();
    }
    public void consultarCompetenciasByActandEval(){
       String resultado;
       Gson gson = new Gson();
       final Type tipoListaCompetencias = new TypeToken<List<modelos.Competencia>>(){}.getType();
       ArrayList<modelos.Competencia> listaConsulta = new ArrayList<modelos.Competencia>();
       resultado = compws.consultarCompetencia(null,null,null,"codActividad","codEval");
       System.out.println("resultado : "+resultado);
       modelos.Competencia compe = new modelos.Competencia();
       listaConsulta = (ArrayList<modelos.Competencia>)gson.fromJson(resultado, tipoListaCompetencias);       
       compe = listaConsulta.get(0);
       codigoCompetencia = compe.getCodigo();
       nombre = compe.getNombre();
       descripcion = compe.getDescripcion();
       codigoActividad = compe.getCodigoActividad();
       codigoEvaluador = compe.getCodigoEvaluador();
    }
    ///////////////////// FIN MÉTODOS -funciones- //////////////////////////// 
    
}
