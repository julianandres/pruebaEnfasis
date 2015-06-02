
package wsIntegrante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearIntegranteGrupo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearIntegranteGrupo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoAdicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigosGruposQuePertenece" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEvaluador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearIntegranteGrupo", propOrder = {
    "nombre",
    "apellido",
    "fechaNacimiento",
    "infoAdicional",
    "codigosGruposQuePertenece",
    "codigoEvaluador"
})
public class CrearIntegranteGrupo {

    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;
    protected String infoAdicional;
    protected String codigosGruposQuePertenece;
    protected String codigoEvaluador;

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
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad infoAdicional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoAdicional() {
        return infoAdicional;
    }

    /**
     * Define el valor de la propiedad infoAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoAdicional(String value) {
        this.infoAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad codigosGruposQuePertenece.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigosGruposQuePertenece() {
        return codigosGruposQuePertenece;
    }

    /**
     * Define el valor de la propiedad codigosGruposQuePertenece.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigosGruposQuePertenece(String value) {
        this.codigosGruposQuePertenece = value;
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

}
