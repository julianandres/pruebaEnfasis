
package wsEscala;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarCompetencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarCompetencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCompetenciaAEliminar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarCompetencia", propOrder = {
    "codigoCompetenciaAEliminar"
})
public class EliminarCompetencia {

    protected String codigoCompetenciaAEliminar;

    /**
     * Obtiene el valor de la propiedad codigoCompetenciaAEliminar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCompetenciaAEliminar() {
        return codigoCompetenciaAEliminar;
    }

    /**
     * Define el valor de la propiedad codigoCompetenciaAEliminar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCompetenciaAEliminar(String value) {
        this.codigoCompetenciaAEliminar = value;
    }

}
