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
import modelos.EscalaEvaluacion;
import wsEscala.GestionEscalaEvaluacionWS;
import wsEscala.GestionEscalaEvaluacionWS_Service;

/**
 *
 * @author Carlos Andres
 */
@ManagedBean
@SessionScoped
public class EscalaMB {

    GestionEscalaEvaluacionWS_Service escalws_service = new GestionEscalaEvaluacionWS_Service();
    GestionEscalaEvaluacionWS escalws;
    EvaluadorMB eval;
    public EscalaMB() {
        escalws = escalws_service.getGestionEscalaEvaluacionWSPort();
        FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        eval =(EvaluadorMB) session.getAttribute("evaluadorMB");
        consultarEscalasByEvaluador();
    }
    private String nombre;
    private String nivelesLinguisticos;
    private String codigoEvaluador;
    private String codigoGrupo;
    private String codigoEscala; //se genera automaticamente.
    private String msg = "";
    private EscalaEvaluacion escaSelect;
    private List<EscalaEvaluacion> escalasByEvaluador;

    ///////////////////// SETS & gets ////////////////////////////////

    public EscalaEvaluacion getEscaSelect() {
        return escaSelect;
    }

    public void setEscaSelect(EscalaEvaluacion escaSelect) {
        this.escaSelect = escaSelect;
    }

    public List<EscalaEvaluacion> getEscalasByEvaluador() {
        return escalasByEvaluador;
    }

    public void setEscalasByEvaluador(List<EscalaEvaluacion> escalasByEvaluador) {
        this.escalasByEvaluador = escalasByEvaluador;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivelesLinguisticos() {
        return nivelesLinguisticos;
    }

    public void setNivelesLinguisticos(String nivelesLinguisticos) {
        this.nivelesLinguisticos = nivelesLinguisticos;
    }

    public String getCodigoEvaluador() {
        return codigoEvaluador;
    }

    public void setCodigoEvaluador(String codigoEvaluador) {
        this.codigoEvaluador = codigoEvaluador;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getCodigoEscala() {
        return codigoEscala;
    }

    public void setCodigoEscala(String codigoEscala) {
        this.codigoEscala = codigoEscala;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    /////////////////////  FIN SETS & gets ////////////////////////////

    /////////////////////  MÉTODOS -redirección- ////////////////////////////
    public String mostrarCrearEscala() {
        return "crearEscala.xhtml?faces-redirect=true";
    }

    public String mostarEditarEscala() {
        if(escaSelect!=null){
        return "editarEscala.xhtml?faces-redirect=true";
        }else{
        return "escalas.xhtml";
        }
    }

    public String mostrarEliminarEscala() {
        return "eliminarEscala.xhtml?faces-redirect=true";
    }
    ///////////////////// FIN  MÉTODOS -redirección- ////////////////////////////
    
    /////////////////////  MÉTODOS -funciones- ////////////////////////////
    public String crearEscala(){
        codigoGrupo="grupo";
        if(escalws.crearEscalaEvaluacion(nombre, nivelesLinguisticos, eval.getCodigo(), codigoGrupo)){
            msg = "Escala creada";
        } else {msg = "Error al crear escala";}
        System.out.println(msg);
        consultarEscalasByEvaluador();
        return "escalas.xhtml?faces-redirect=true";
    }    
    public String editarEscala(){
    if (escalws.editarEscalaEvaluacion(escaSelect.getCodigo(),escaSelect.getCodigo(), escaSelect.getNombre(), escaSelect.getNivelesLinguisticos(), escaSelect.getCodigoEvaluador(), escaSelect.getCodigoGrupo())){
            msg = "Escala editada";
        } else {msg = "Error al editar escala";}
        System.out.println(msg);
        consultarEscalasByEvaluador();
        return "escalas.xhtml?faces-redirect=true";
    }
    public String eliminarEscala(){
    if(escaSelect!=null){    
    if (escalws.eliminarCompetencia(escaSelect.getCodigo())){
            msg = "Escala eliminada";
        } else {msg = "Error al eliminar escala";}
        System.out.println(msg);
        consultarEscalasByEvaluador();
        return "escalas.xhtml?faces-redirect=true";
    }else{
        consultarEscalasByEvaluador();
       return "escalas.xhtml";
    }
    }
    public void consultarEscalas(){
       String resultado;
       Gson gson = new Gson();
       final Type tipoListaEscalas = new TypeToken<List<EscalaEvaluacion>>(){}.getType();
       ArrayList<EscalaEvaluacion> listaConsulta = new ArrayList<EscalaEvaluacion>();
       resultado = escalws.consultarEscalaEvaluacion(codigoEscala, nombre, nivelesLinguisticos, codigoEvaluador, codigoGrupo);
       System.out.println("resultado : "+resultado);
       EscalaEvaluacion escal = new EscalaEvaluacion();
       listaConsulta = (ArrayList<EscalaEvaluacion>)gson.fromJson(resultado, tipoListaEscalas);       
       escal = listaConsulta.get(0);
       codigoEscala = escal.getCodigo();
       nombre = escal.getNombre();
       nivelesLinguisticos = escal.getNivelesLinguisticos();
       codigoEvaluador = escal.getCodigoEvaluador();
       codigoGrupo = escal.getCodigoGrupo();
    }
    public void consultarEscalasByEvaluador(){
       String resultado;
       Gson gson = new Gson();
       final Type tipoListaEscalas = new TypeToken<List<EscalaEvaluacion>>(){}.getType();
       ArrayList<EscalaEvaluacion> listaConsulta = new ArrayList<EscalaEvaluacion>();
       resultado = escalws.consultarEscalaEvaluacion(null, null, null, eval.getCodigo(), null);
       System.out.println("resultado : "+resultado);
       listaConsulta = (ArrayList<EscalaEvaluacion>)gson.fromJson(resultado, tipoListaEscalas);       
       escalasByEvaluador=listaConsulta;
    }
    ///////////////////// FIN MÉTODOS -funciones- //////////////////////////// 

}
