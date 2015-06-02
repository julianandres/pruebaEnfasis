/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


/**
 *
 * @author game
 */
public class IntegranteGrupo {

    private String codigo;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String infoAdicional;
    private String codigosGruposQuePertenece; //Grupos a los que pertenece el integrante
    private String codigoEvaluador;
    private IntegranteGrupo intSel;

    /* /////////////SETS Y GETS///////////// */
    public String getCodigo() {
        return codigo;
    }

    public IntegranteGrupo getIntSel() {
        return intSel;
    }

    public void setIntSel(IntegranteGrupo intSel) {
        this.intSel = intSel;
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

    public void setCodigosGruposQuePertenece(String grupo) {
        this.codigosGruposQuePertenece = grupo;
    }

    public String getCodigoEvaluador() {
        return codigoEvaluador;
    }

    public void setCodigoEvaluador(String codigoEvaluador) {
        this.codigoEvaluador = codigoEvaluador;
    }
    
}
