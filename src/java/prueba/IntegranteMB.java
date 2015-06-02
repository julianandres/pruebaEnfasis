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
import modelos.IntegranteGrupo;
import wsIntegrante.GestionIntegranteGrupoWS;
import wsIntegrante.GestionIntegranteGrupoWS_Service;


/**
 *
 * @author Carlos Andres
 */
@ManagedBean
@SessionScoped
public class IntegranteMB {
    private GestionIntegranteGrupoWS_Service int_service = new GestionIntegranteGrupoWS_Service();
    private GestionIntegranteGrupoWS integrante;
    EvaluadorMB eval;
    private ArrayList<IntegranteGrupo> integrantesByEvaluador;

    public ArrayList<IntegranteGrupo> getIntegrantesByEvaluador() {
        return integrantesByEvaluador;
    }

    public void setIntegrantesByEvaluador(ArrayList<IntegranteGrupo> integrantesByEvaluador) {
        this.integrantesByEvaluador = integrantesByEvaluador;
    }
   
    public IntegranteMB() {
      integrante = int_service.getGestionIntegranteGrupoWSPort();
      FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        eval =(EvaluadorMB) session.getAttribute("evaluadorMB");
        consultarIntegrantesEvaluador();
    }
    private String nombre; 
    private String apellido;
    private String fechaNacimiento;
    private String infoAdicional;
    private String codigosGruposQuePertenece;
    private String codigoIntegrante; //se genera automaticamente.
    private String msg = "";
    private IntegranteGrupo intSelect;
    private IntegranteGrupo intAEditar;

    public IntegranteGrupo getIntAEditar() {
        return intAEditar;
    }

    public void setIntAEditar(IntegranteGrupo intAEditar) {
        this.intAEditar = intAEditar;
    }
    
    public IntegranteGrupo getIntSelect() {
        return intSelect;
    }

    public void setIntSelect(IntegranteGrupo intSelect) {
        this.intSelect = intSelect;
    }
    
    ///////////////////// SETS & gets ////////////////////////////////
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    public String getCodigosGruposQuePertenece() {
        return codigosGruposQuePertenece;
    }

    public void setCodigosGruposQuePertenece(String codigosGruposQuePertenece) {
        this.codigosGruposQuePertenece = codigosGruposQuePertenece;
    }

    public String getCodigoIntegrante() {
        return codigoIntegrante;
    }

    public void setCodigoIntegrante(String codigoIntegrante) {
        this.codigoIntegrante = codigoIntegrante;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String crearIntegrante(){
        String retorno;
        codigosGruposQuePertenece="";
       if(integrante.crearIntegranteGrupo(nombre, apellido, fechaNacimiento, infoAdicional, codigosGruposQuePertenece, eval.getCodigo())){
           consultarIntegrantesEvaluador();
           retorno="integrantes.xhtml";
       }else{
           msg="error creando integrante";
           retorno=mostrarCrearIntegrante();
       }         
       return retorno;
    }
    public String sssss(){
        System.out.println("integrante integrante");
    return "index.xhtml";
    }
    public String editarIntegrante(){
       String retorno="";
       if(integrante.editarIntegranteGrupo(intAEditar.getCodigo(), intAEditar.getCodigo(), intAEditar.getNombre(),intAEditar.getApellido(), intAEditar.getFechaNacimiento(),intAEditar.getInfoAdicional(),intAEditar.getCodigosGruposQuePertenece(),intAEditar.getCodigoEvaluador())){
           consultarIntegrantesEvaluador();
           retorno="integrantes.xhtml";
       }else{
           msg="error creando integrante";
           retorno=mostarEditarIntegrante();
       }      
        System.out.println("retorno");
       return retorno;    
    }
    
     /////////////////////  FIN SETS & gets ////////////////////////////

     /////////////////////  MÉTODOS -redirección- ////////////////////////////
    public String mostrarCrearIntegrante(){
        return "crearIntegrante.xhtml?faces-redirect=true";
    }
    public String eliminarEstudiante(){
    String resultado="";
    try{
    if(intSelect.getCodigo()!=null){
    if(integrante.eliminarIntegranteGrupo(intSelect.getCodigo())){
        
    }else{
        
    }
     
    }
    }catch(Exception e){
      
    }
    
    consultarIntegrantesEvaluador();
    
    return "integrantes.xhtml?faces-redirect=true";
    }
    public String mostarEditarIntegrante(){
        consultarIntegrantesEvaluador();
       if(intSelect!=null){
         intAEditar=intSelect;
         return "editarIntegrante.xhtml?faces-redirect=true";
       }else{
         return "integrantes.xhtml?faces-redirect=true";
       } 
    }public void consultarIntegrantesEvaluador(){
       String resultado;
       Gson gson = new Gson();
       final Type tipoListaIntegrantes = new TypeToken<List<IntegranteGrupo>>(){}.getType();
       ArrayList<IntegranteGrupo> listaConsulta = new ArrayList<IntegranteGrupo>();
       resultado = integrante.consultarIntegranteGrupo(null,null,
               null,null,null,null, eval.getCodigo());
       System.out.println("resultado : "+resultado);
       listaConsulta = (ArrayList<IntegranteGrupo>)gson.fromJson(resultado, tipoListaIntegrantes);       
       integrantesByEvaluador=listaConsulta;
    }
    public String mostrarEliminarIntegrante(){
        return "eliminarIntegrante.xhtml?faces-redirect=true";
    }
    
    
    ///////////////////// FIN  MÉTODOS -redirección- ////////////////////////////
    
    /////////////////////  MÉTODOS -funciones- ////////////////////////////
    
    ///////////////////// FIN MÉTODOS -funciones- ////////////////////////////
}
