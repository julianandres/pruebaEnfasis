
package wsActividad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarActividadEvaluacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarActividadEvaluacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoAeliminar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarActividadEvaluacion", propOrder = {
    "codigoAeliminar"
})
public class EliminarActividadEvaluacion {

    protected String codigoAeliminar;

    /**
     * Obtiene el valor de la propiedad codigoAeliminar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAeliminar() {
        return codigoAeliminar;
    }

    /**
     * Define el valor de la propiedad codigoAeliminar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAeliminar(String value) {
        this.codigoAeliminar = value;
    }

}
