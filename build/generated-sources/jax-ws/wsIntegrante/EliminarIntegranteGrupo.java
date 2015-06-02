
package wsIntegrante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarIntegranteGrupo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarIntegranteGrupo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoIntegranteAEliminar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarIntegranteGrupo", propOrder = {
    "codigoIntegranteAEliminar"
})
public class EliminarIntegranteGrupo {

    protected String codigoIntegranteAEliminar;

    /**
     * Obtiene el valor de la propiedad codigoIntegranteAEliminar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIntegranteAEliminar() {
        return codigoIntegranteAEliminar;
    }

    /**
     * Define el valor de la propiedad codigoIntegranteAEliminar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIntegranteAEliminar(String value) {
        this.codigoIntegranteAEliminar = value;
    }

}
