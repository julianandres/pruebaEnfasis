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
import modelos.IntegranteGrupo;
import wsGrupo.GestionGrupoEvaluacionWS;
import wsGrupo.GestionGrupoEvaluacionWS_Service;
import wsIntegrante.GestionIntegranteGrupoWS;
import wsIntegrante.GestionIntegranteGrupoWS_Service;

/**
 *
 * @author Carlos Andres
 */
@ManagedBean
@SessionScoped
public class GrupoMB {
    GestionGrupoEvaluacionWS_Service grupws_service = new GestionGrupoEvaluacionWS_Service();
    GestionGrupoEvaluacionWS grupws;
    GestionIntegranteGrupoWS_Service integrante = new GestionIntegranteGrupoWS_Service();
    GestionIntegranteGrupoWS intws;
    EvaluadorMB eval;
    ActividadMB act;
    private List<GrupoEvaluacion> gruposByEvaluador;
    public GrupoMB() {
        grupws = grupws_service.getGestionGrupoEvaluacionWSPort();
        intws=integrante.getGestionIntegranteGrupoWSPort();
        FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        eval =(EvaluadorMB) session.getAttribute("evaluadorMB");
        act =(ActividadMB) session.getAttribute("actividadMB");
        gruposByEvaluador=eval.getGruposByEvaluador();
        consultarGruposEvaluador();
    }
    private GrupoEvaluacion selGrupo;
    private String nombre;
    private String codigosCompetenciasObjetivo;
    private String descripcion;
    private IntegranteGrupo selectInt=new IntegranteGrupo();
    private IntegranteGrupo selectIntNoAs=new IntegranteGrupo();
    private List<IntegranteGrupo> interantesNoAsignados;
    private List<IntegranteGrupo> interantesAsignados;
    
    private String codEvaluador;
    private String codigosIntegrantesGrupo;
    private String codigoGrupo; // este es el que se genera automaticamente.
    private String msg = "";
    private GrupoEvaluacion grupoSeleccionado;

    public GrupoEvaluacion getGrupoSeleccionado() {
        return grupoSeleccionado;
    }
    public String mostrarActividades(){
        FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        act =(ActividadMB) session.getAttribute("actividadMB");
        if(act!=null){
           act.setGrupoSelected(grupoSeleccionado);
           act.consultarActividadesByGrupo();
        }
    return "actividades.xhtml?faces-redirect=true";
    }
    public void setGrupoSeleccionado(GrupoEvaluacion grupoSeleccionado) {
        this.grupoSeleccionado = grupoSeleccionado;
    }

    
    public List<GrupoEvaluacion> getGruposByEvaluador() {
        return gruposByEvaluador;
    }

    public void setGruposByEvaluador(List<GrupoEvaluacion> evaluadoresByEvaluador) {
        this.gruposByEvaluador = evaluadoresByEvaluador;
    }
    
    
    public GrupoEvaluacion getSelGrupo() {
        return selGrupo;
    }

    public void setSelGrupo(GrupoEvaluacion selGrupo) {
        this.selGrupo = selGrupo;
    }    
    public IntegranteGrupo getSelectIntNoAs() {
        return selectIntNoAs;
    }

    public void setSelectIntNoAs(IntegranteGrupo selectIntNoAs) {
        this.selectIntNoAs = selectIntNoAs;
    }
    
    public IntegranteGrupo getSelectInt() {
        return selectInt;
    }

    public void setSelectInt(IntegranteGrupo selectInt) {
        this.selectInt = selectInt;
    }
    
    public List<IntegranteGrupo> getInterantesNoAsignados() {
        return interantesNoAsignados;
    }

    public void setInterantesNoAsignados(List<IntegranteGrupo> interantesNoAsignados) {
        this.interantesNoAsignados = interantesNoAsignados;
    }

    public List<IntegranteGrupo> getInterantesAsignados() {
        return interantesAsignados;
    }

    public void setInterantesAsignados(List<IntegranteGrupo> interantesAsignados) {
        this.interantesAsignados = interantesAsignados;
    }

    
    ///////////////////// SETS & gets ////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigosCompetenciasObjetivo() {
        return codigosCompetenciasObjetivo;
    }

    public void setCodigosCompetenciasObjetivo(String codigosCompetenciasObjetivo) {
        this.codigosCompetenciasObjetivo = codigosCompetenciasObjetivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodEvaluador() {
        return codEvaluador;
    }

    public void setCodEvaluador(String codEvaluador) {
        this.codEvaluador = codEvaluador;
    }

    public String getCodigosIntegrantesGrupo() {
        return codigosIntegrantesGrupo;
    }

    public void setCodigosIntegrantesGrupo(String codigosIntegrantesGrupo) {
        this.codigosIntegrantesGrupo = codigosIntegrantesGrupo;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    /////////////////////  FIN SETS & gets ////////////////////////////

     /////////////////////  MÉTODOS -redirección- ////////////////////////////
    public String mostrarAgregarIntegrantesGrupo(){
    
    return "agregaring.xhtml";
    }
    
    public String mostrarCrearGrupo(){
        return "crearGrupo.xhtml?faces-redirect=true";
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
    public String mostarEditarGrupo(){
       if(grupoSeleccionado!=null){
        try{
         System.out.println(grupoSeleccionado.getCodigo() + " name " + grupoSeleccionado.getNombre() );  
        //interantesAsignados=convertirJsonToListIntegranteGrupo(grupws.consultarIntegrantesAsignadosAGrupo(codigoGrupo));
        //interantesNoAsignados=convertirJsonToListIntegranteGrupo(grupws.consultarInterantesQueNoPertenecenAGrupo(codigoGrupo,eval.getCodigo()));
        }catch(Exception e){
        
        }
        return "editarGrupo.xhtml?faces-redirect=true";
       }else{
       return "grupos.xhtml";
       }
    }
    public String mostrarEliminarGrupo(){
        return "eliminarGrupo.xhtml?faces-redirect=true";
    }
    ///////////////////// FIN  MÉTODOS -redirección- ////////////////////////////
    
    /////////////////////  MÉTODOS -funciones- ////////////////////////////
    public String crearGrupo(){
        codigosIntegrantesGrupo="";
        codEvaluador=eval.getCodigo();
        codigosCompetenciasObjetivo="";
        if(grupws.crearGrupoEvaluacion(nombre, codigosCompetenciasObjetivo, descripcion, eval.getCodigo(), codigosIntegrantesGrupo)){
            msg = "Grupo creada";
        } else {msg = "Error al crear grupo";}
        System.out.println(msg);
        consultarGruposEvaluador();
        return "grupos.xhtml?faces-redirect=true";
    }    
    public String editarGrupo(){
        codigosIntegrantesGrupo="";
        codigosCompetenciasObjetivo="";
        for(int i=0;i<interantesAsignados.size();i++){
         // codigosIntegrantesGrupo+=interantesAsignados.get(i).getCodigoIntegrante()+",";
        //TODO integrantes grupo
        
        }  
        Evaluador eval = new Evaluador();
        if (grupws.editarGrupoEvaluacion(grupoSeleccionado.getCodigo(), grupoSeleccionado.getCodigo(), grupoSeleccionado.getNombre(), grupoSeleccionado.getCodigosCompetenciasObjetivo(), grupoSeleccionado.getDescripcion(), grupoSeleccionado.getCodEvaluador(), grupoSeleccionado.getCodigosIntegrantesGrupo())){
            msg = "Grupo editado";
        } else {msg = "Error al editar grupo";}
        System.out.println(msg);
        consultarGruposEvaluador();
        return "grupos.xhtml?faces-redirect=true";
    }
    public String eliminarGrupo(){
    if (grupws.eliminarGrupoEvaluacion(grupoSeleccionado.getCodigo())){
            msg = "Grupo eliminado";
        } else {msg = "Error al eliminar grupo";}
        System.out.println(msg);
        
        consultarGruposEvaluador();
        return "grupos.xhtml?faces-redirect=true";
    }
    public String verGrupo(){
    if(grupoSeleccionado!=null){
        System.out.println(grupoSeleccionado.getNombre());
        System.out.println(grupoSeleccionado.getCodigo());
        interantesNoAsignados=convertirJsonToListIntegranteGrupo(grupws.consultarIntegrantesQueNoPertenecenAGrupo(grupoSeleccionado.getCodigo(), eval.getCodigo()));
        interantesAsignados=convertirJsonToListIntegranteGrupo(grupws.consultarIntegrantesAsignadosAGrupo(grupoSeleccionado.getCodigo(),eval.getCodigo()));
    return "verGrupo.xhtml";
    }else{
    return "grupos.xhtml";
    }
    }
    
    public String mostrarAgregarIntegrantes(){
    
    
    return "agregaring.xhtml";
    }
    
    public void consultarGrupos(){
       String resultado;
       Gson gson = new Gson();
       final Type tipoListaGrupos = new TypeToken<List<GrupoEvaluacion>>(){}.getType();
       ArrayList<GrupoEvaluacion> listaConsulta = new ArrayList<GrupoEvaluacion>();
       resultado = grupws.consultarGrupoEvaluacion(codigoGrupo, nombre, codigosCompetenciasObjetivo, descripcion, codEvaluador, codigosIntegrantesGrupo);
       System.out.println("resultado : "+resultado);
       GrupoEvaluacion grupo = new GrupoEvaluacion();
       listaConsulta = (ArrayList<GrupoEvaluacion>)gson.fromJson(resultado, tipoListaGrupos);       
       grupo = listaConsulta.get(0);
       codigoGrupo = grupo.getCodigo();
       nombre = grupo.getNombre();
       codigosCompetenciasObjetivo = grupo.getCodigosCompetenciasObjetivo();
       descripcion = grupo.getDescripcion();
       codEvaluador = eval.getCodigo();
       codigosIntegrantesGrupo = grupo.getCodigosIntegrantesGrupo();
    }
     public void consultarGruposEvaluador(){
       String resultado;
       Gson gson = new Gson();
       final Type tipoListaGrupos = new TypeToken<List<GrupoEvaluacion>>(){}.getType();
       ArrayList<GrupoEvaluacion> listaConsulta = new ArrayList<GrupoEvaluacion>();
       resultado = grupws.consultarGrupoEvaluacion(null, null,null,null, eval.getCodigo(),null);
       System.out.println("resultado : "+resultado);
       GrupoEvaluacion grupo = new GrupoEvaluacion();
       listaConsulta = (ArrayList<GrupoEvaluacion>)gson.fromJson(resultado, tipoListaGrupos);       
       gruposByEvaluador=listaConsulta;
         System.out.println(gruposByEvaluador.size());
    }
    public List<IntegranteGrupo> convertirJsonToListIntegranteGrupo(String json){
       Gson gson = new Gson();
       final Type tipoListIntegr = new TypeToken<List<IntegranteGrupo>>(){}.getType();
       ArrayList<IntegranteGrupo> listaConsulta = new ArrayList<IntegranteGrupo>();
       IntegranteGrupo grupo = new IntegranteGrupo();
       listaConsulta = (ArrayList<IntegranteGrupo>)gson.fromJson(json, tipoListIntegr);       
       return listaConsulta;
    }
    public String agregarIntegrante(){
       if(selectIntNoAs!=null){
        intws.agregarIntegranteAGrupo(grupoSeleccionado.getCodigo(),selectIntNoAs.getCodigo());
        consultarIntegrantes();
       }
    return "agregaring.xhtml";
    }
    public String quitarIntegrante(){
        if(selectInt!=null){
           intws.removerIntegranteDeGrupo(grupoSeleccionado.getCodigo(), selectInt.getCodigo());
           consultarIntegrantes();
        }
    return "agregaring.xhtml";
    }
     public void consultarIntegrantes(){
         String result =grupws.consultarIntegrantesQueNoPertenecenAGrupo(grupoSeleccionado.getCodigo(), eval.getCodigo());
        interantesNoAsignados=convertirJsonToListIntegranteGrupo(grupws.consultarIntegrantesQueNoPertenecenAGrupo(grupoSeleccionado.getCodigo(), eval.getCodigo()));
        interantesAsignados=convertirJsonToListIntegranteGrupo(grupws.consultarIntegrantesAsignadosAGrupo(grupoSeleccionado.getCodigo(),eval.getCodigo()));
         System.out.println("hola");
     }
    ///////////////////// FIN MÉTODOS -funciones- //////////////////////////// 
    
}
