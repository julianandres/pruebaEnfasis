
package wsGrupo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarGrupoEvaluacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarGrupoEvaluacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoGrupoAEliminar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarGrupoEvaluacion", propOrder = {
    "codigoGrupoAEliminar"
})
public class EliminarGrupoEvaluacion {

    protected String codigoGrupoAEliminar;

    /**
     * Obtiene el valor de la propiedad codigoGrupoAEliminar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGrupoAEliminar() {
        return codigoGrupoAEliminar;
    }

    /**
     * Define el valor de la propiedad codigoGrupoAEliminar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGrupoAEliminar(String value) {
        this.codigoGrupoAEliminar = value;
    }

}
