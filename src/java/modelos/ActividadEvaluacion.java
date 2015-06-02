/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


/**
 *
 * @author lenovo
 */
public class ActividadEvaluacion {
    
    private String codigo;
    private String nombre;
    private String tipo;
    private String fechaRealizacion;
    private String codigoEscala;// evaluar este parámetro
    private String descripcion;
    private String codigoGrupoRealizacion;
    
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
    
}
