
package wsEscala;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarEscalaEvaluacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarEscalaEvaluacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelesLinguisticos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEvaluador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarEscalaEvaluacion", propOrder = {
    "codigo",
    "nombre",
    "nivelesLinguisticos",
    "codigoEvaluador",
    "codigoGrupo"
})
public class ConsultarEscalaEvaluacion {

    protected String codigo;
    protected String nombre;
    protected String nivelesLinguisticos;
    protected String codigoEvaluador;
    protected String codigoGrupo;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

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
     * Obtiene el valor de la propiedad nivelesLinguisticos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelesLinguisticos() {
        return nivelesLinguisticos;
    }

    /**
     * Define el valor de la propiedad nivelesLinguisticos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelesLinguisticos(String value) {
        this.nivelesLinguisticos = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEvaluador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEvaluador() {
        return codigoEvaluador;
    }

    /**
     * Define el valor de la propiedad codigoEvaluador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEvaluador(String value) {
        this.codigoEvaluador = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    /**
     * Define el valor de la propiedad codigoGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGrupo(String value) {
        this.codigoGrupo = value;
    }

}
