
package wsIntegrante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para removerIntegranteDeGrupo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="removerIntegranteDeGrupo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoIntegrante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removerIntegranteDeGrupo", propOrder = {
    "codigoGrupo",
    "codigoIntegrante"
})
public class RemoverIntegranteDeGrupo {

    protected String codigoGrupo;
    protected String codigoIntegrante;

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

    /**
     * Obtiene el valor de la propiedad codigoIntegrante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIntegrante() {
        return codigoIntegrante;
    }

    /**
     * Define el valor de la propiedad codigoIntegrante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIntegrante(String value) {
        this.codigoIntegrante = value;
    }

}
