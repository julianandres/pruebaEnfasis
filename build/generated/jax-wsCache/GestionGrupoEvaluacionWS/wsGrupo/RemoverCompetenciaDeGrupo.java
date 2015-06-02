
package wsGrupo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para removerCompetenciaDeGrupo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="removerCompetenciaDeGrupo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCompetencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "removerCompetenciaDeGrupo", propOrder = {
    "codigoCompetencia",
    "codigoGrupo"
})
public class RemoverCompetenciaDeGrupo {

    protected String codigoCompetencia;
    protected String codigoGrupo;

    /**
     * Obtiene el valor de la propiedad codigoCompetencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCompetencia() {
        return codigoCompetencia;
    }

    /**
     * Define el valor de la propiedad codigoCompetencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCompetencia(String value) {
        this.codigoCompetencia = value;
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
