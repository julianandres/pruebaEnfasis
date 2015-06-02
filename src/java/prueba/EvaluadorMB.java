/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelos.Evaluador;
import modelos.GrupoEvaluacion;
import ws.GestionEvaluadorWS;
import ws.GestionEvaluadorWS_Service;
import wsGrupo.GestionGrupoEvaluacionWS;
import wsGrupo.GestionGrupoEvaluacionWS_Service;

/**
 *
 * @author Carlos Andres
 */
@ManagedBean
@SessionScoped
public class EvaluadorMB {
    
    GestionEvaluadorWS_Service evaws_service = new GestionEvaluadorWS_Service();
    GestionEvaluadorWS evaws;
 
 private String codigo;
 private String nombre;
 private String apellido;
 private String correoElectronico;
 private String password;
 private String genero;
 private String fechaNacimiento;
 private String telefono;
 private String informacionAdicional;
 private String msg="";
    /**
     * Creates a new instance of Evaluador
     */
    GestionGrupoEvaluacionWS_Service grupws_service = new GestionGrupoEvaluacionWS_Service();
    GestionGrupoEvaluacionWS grupws;
    private ArrayList<GrupoEvaluacion> gruposByEvaluador;
    private IntegranteMB intg;

    public ArrayList<GrupoEvaluacion> getGruposByEvaluador() {
        return gruposByEvaluador;
    }

    public void setGruposByEvaluador(ArrayList<GrupoEvaluacion> gruposByEvaluador) {
        this.gruposByEvaluador = gruposByEvaluador;
    }
    ActividadMB act;
    public EvaluadorMB() {
        evaws = evaws_service.getGestionEvaluadorWSPort();
        grupws = grupws_service.getGestionGrupoEvaluacionWSPort();
        FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        act =(ActividadMB) session.getAttribute("actividadMB");
    }

    

         
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

   

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String mostrarIndex(){
    return "index.xhtml?faces-redirect=true";
    }
    public String mostrarPagPrincipal(){
    return "pagPrincipalEval.xhtml?faces-redirect=true"; 
    }
    public String mostrarAcercaDe(){
    return "acercaSeigc.xhtml?faces-redirect=true";
    }
    public String mostrarServicios(){
    return "servicios.xhtml?faces-redirect=true";
    }
    public String mostrarClientes(){
    return "clientes.xhtml?faces-redirect=true";
    }
    public String mostrarContactanos(){
    return "contactanos.xhtml?faces-redirect=true";
    }
    public String mostrarIniciarSesion(){
        correoElectronico = "";
        password = "";
    return "inicioSesion.xhtml?faces-redirect=true";
    }
    public String mostrarResgistrarse(){
        nombre = "";
        apellido = "";
        correoElectronico = "";
        password = "";
        genero = "";
        fechaNacimiento = "";
        telefono = "";
        informacionAdicional = "";
    return "registro.xhtml?faces-redirect=true";
    }
    public String mostrarEliminarCuenta(){
    return "eliminarCuenta.xhtml?faces-redirect=true";
    }
    
    public String mostrarEditarEvaluador(){
        consultarEvaluador();
    return "editarEval.xhtml?faces-redirect=true";
    }
    public String mostrarGrupos(){
        consultarGruposEvaluador();
    return "grupos.xhtml?faces-redirect=true";
    }
    public String mostrarIntegrantes(){
         FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        intg =(IntegranteMB) session.getAttribute("integranteMB");
        if(intg!=null){
           intg.consultarIntegrantesEvaluador();
        }
    return "integrantes.xhtml?faces-redirect=true";
    }
    public String mostrarActividades(){
    return "actividades.xhtml?faces-redirect=true";
    }
    public String mostrarCompetencias(){
    return "competencias.xhtml?faces-redirect=true";
    }
    public String mostrarEscalas(){
    return "escalas.xhtml?faces-redirect=true";
    }
    
    public String crearEvaluador() {
        if (evaws.crearEvaluador(nombre, apellido, correoElectronico, password, genero, fechaNacimiento, telefono, informacionAdicional)) {
            msg = "Evaluador Creado";
            obtenerCodigoEvaluadorCreado(correoElectronico);
        } else {
            msg = "Error al crear Evaluador";
        }
        System.out.println(msg);
        return "pagPrincipalEval.xhtml?faces-redirect=true";
    }
   public String iniciarSesion(){
       Gson gson = new Gson();
       String resultado="";
       resultado = evaws.consultarEvaluador(null, null, null, correoElectronico, password, null, null, null, null);
       final Type tipoListaEvaluadores = new TypeToken<List<Evaluador>>(){}.getType();
       ArrayList<Evaluador> listaConsulta = new ArrayList<Evaluador>();
       listaConsulta = (ArrayList<Evaluador>)gson.fromJson(resultado, tipoListaEvaluadores);
       if (listaConsulta.isEmpty()){
           System.out.println("estoy en if");
           return "index.xhtml?faces-redirect=true";
       }
       else{
           System.out.println("estoy en else");
           consultarEvaluador();
           return "pagPrincipalEval.xhtml?faces-redirect=true";
       }
   }
   public String editarEvaluador() {
   if(evaws.editarEvaluador(codigo, nombre, apellido, correoElectronico, password, genero, fechaNacimiento, telefono, informacionAdicional, codigo)){
   msg = "Evaluador editado";
   consultarEvaluador();
   }
   else {msg="Error al editar";}
   System.out.println(msg);
   return "pagPrincipalEval.xhtml?faces-redirect=true";
   }
   
   public String eliminarEvaluador() {
       if(evaws.eliminarEvaluador(codigo)){
           msg = "Evaluador eliminado";
       }else {msg="Error al eliminar";}
       System.out.println(msg);
   return "index.xhtml?faces-redirect=true";
   }
   
   public void consultarGruposEvaluador(){
       String resultado;
       Gson gson = new Gson();
       final Type tipoListaGrupos = new TypeToken<List<GrupoEvaluacion>>(){}.getType();
       ArrayList<GrupoEvaluacion> listaConsulta = new ArrayList<GrupoEvaluacion>();
       resultado = grupws.consultarGrupoEvaluacion(null, null,null,null,codigo,null);
       System.out.println("resultado : "+resultado);
       GrupoEvaluacion grupo = new GrupoEvaluacion();
       listaConsulta = (ArrayList<GrupoEvaluacion>)gson.fromJson(resultado, tipoListaGrupos);       
       gruposByEvaluador=listaConsulta;
         System.out.println(gruposByEvaluador.size());
    }
 public void consultarEvaluador(){
       String resultado;
       Gson gson = new Gson();
       final Type tipoListaEvaluadores = new TypeToken<List<Evaluador>>(){}.getType();
       ArrayList<Evaluador> listaConsulta = new ArrayList<Evaluador>();
       resultado = evaws.consultarEvaluador(null, null, null, correoElectronico, null, null, null, null, null);       
       System.out.println("resultado : "+resultado);
       Evaluador eval = new Evaluador();
       listaConsulta = (ArrayList<Evaluador>)gson.fromJson(resultado, tipoListaEvaluadores);
       //System.out.println("Class:"+listaConsulta.getClass()+", n:"+listaConsulta.size());
       eval = listaConsulta.get(0);
       codigo = eval.getCodigo();
       nombre = eval.getNombre();
       apellido = eval.getApellido();
       correoElectronico = eval.getCorreoElectronico();
       password = eval.getPassword();
       genero = eval.getGenero();
       fechaNacimiento = eval.getFechaNacimiento();
       telefono = eval.getTelefono();
       informacionAdicional = eval.getInformacionAdicional();
       
       /*for (Evaluador ev : listaConsulta) {
           System.out.println(ev.getClass());
       }*/
   }
 
  public void obtenerCodigoEvaluadorCreado(String correo){
       String resultado;
       Gson gson = new Gson();
       final Type tipoListaEvaluadores = new TypeToken<List<Evaluador>>(){}.getType();
       ArrayList<Evaluador> listaConsulta = new ArrayList<Evaluador>();
       resultado = evaws.consultarEvaluador(null, null, null, correo, null, null, null, null, null);
       Evaluador eval = new Evaluador();
       listaConsulta = (ArrayList<Evaluador>)gson.fromJson(resultado, tipoListaEvaluadores);
       eval = listaConsulta.get(0);
       codigo = eval.getCodigo();
       nombre = eval.getNombre();
       apellido = eval.getApellido();
       correoElectronico = eval.getCorreoElectronico();
       password = eval.getPassword();
       genero = eval.getGenero();
       fechaNacimiento = eval.getFechaNacimiento();
       telefono = eval.getTelefono();
       informacionAdicional = eval.getInformacionAdicional();
   }
}
