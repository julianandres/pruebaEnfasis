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
public class GrupoEvaluacion {

    private String codigo;
    private String nombre;
    private String codigosCompetenciasObjetivo;
    private String descripcion;
    private String codEvaluador;
    private String codigosIntegrantesGrupo;

    /* /////////////SETS Y GETS///////////// */
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

    public String getCodigosCompetenciasObjetivo() {
        return codigosCompetenciasObjetivo;
    }

    public void setCodigosCompetenciasObjetivo(String competenciaObjetivo) {
        this.codigosCompetenciasObjetivo = competenciaObjetivo;
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
   
}
