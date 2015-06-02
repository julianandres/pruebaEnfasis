
package wsGrupo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearGrupoEvaluacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearGrupoEvaluacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigosCompetenciasObjetivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codEvaluador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigosIntegrantesGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearGrupoEvaluacion", propOrder = {
    "nombre",
    "codigosCompetenciasObjetivo",
    "descripcion",
    "codEvaluador",
    "codigosIntegrantesGrupo"
})
public class CrearGrupoEvaluacion {

    protected String nombre;
    protected String codigosCompetenciasObjetivo;
    protected String descripcion;
    protected String codEvaluador;
    protected String codigosIntegrantesGrupo;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad codigosCompetenciasObjetivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigosCompetenciasObjetivo() {
        return codigosCompetenciasObjetivo;
    }

    /**
     * Define el valor de la propiedad codigosCompetenciasObjetivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigosCompetenciasObjetivo(String value) {
        this.codigosCompetenciasObjetivo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad codEvaluador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEvaluador() {
        return codEvaluador;
    }

    /**
     * Define el valor de la propiedad codEvaluador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEvaluador(String value) {
        this.codEvaluador = value;
    }

    /**
     * Obtiene el valor de la propiedad codigosIntegrantesGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigosIntegrantesGrupo() {
        return codigosIntegrantesGrupo;
    }

    /**
     * Define el valor de la propiedad codigosIntegrantesGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigosIntegrantesGrupo(String value) {
        this.codigosIntegrantesGrupo = value;
    }

}
