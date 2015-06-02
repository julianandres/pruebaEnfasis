
package wsIntegrante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarIntegranteAGrupo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarIntegranteAGrupo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoGrupoAsignar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoIntegranteAsignar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarIntegranteAGrupo", propOrder = {
    "codigoGrupoAsignar",
    "codigoIntegranteAsignar"
})
public class AgregarIntegranteAGrupo {

    protected String codigoGrupoAsignar;
    protected String codigoIntegranteAsignar;

    /**
     * Obtiene el valor de la propiedad codigoGrupoAsignar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGrupoAsignar() {
        return codigoGrupoAsignar;
    }

    /**
     * Define el valor de la propiedad codigoGrupoAsignar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGrupoAsignar(String value) {
        this.codigoGrupoAsignar = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoIntegranteAsignar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIntegranteAsignar() {
        return codigoIntegranteAsignar;
    }

    /**
     * Define el valor de la propiedad codigoIntegranteAsignar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIntegranteAsignar(String value) {
        this.codigoIntegranteAsignar = value;
    }

}
