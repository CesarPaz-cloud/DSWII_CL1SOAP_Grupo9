//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.09.30 a las 01:52:43 PM PET 
//


package pe.edu.cibertec.ws.objects;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Date;


/**
 * <p>Clase Java para pacientews complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pacientews"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPaciente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomPaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApePaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocPaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaNacPaciente" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="EmailPaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacientews", propOrder = {
    "idPaciente",
    "nomPaciente",
    "apePaciente",
    "docPaciente",
    "fechaNacPaciente",
    "emailPaciente"
})
public class Pacientews {

    protected int idPaciente;
    @XmlElement(name = "NomPaciente", required = true)
    protected String nomPaciente;
    @XmlElement(name = "ApePaciente", required = true)
    protected String apePaciente;
    @XmlElement(name = "DocPaciente", required = true)
    protected String docPaciente;
    @XmlElement(name = "FechaNacPaciente", required = true)
    @XmlSchemaType(name = "date")
    protected Date fechaNacPaciente;
    @XmlElement(name = "EmailPaciente", required = true)
    protected String emailPaciente;

    /**
     * Obtiene el valor de la propiedad idPaciente.
     * 
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * Define el valor de la propiedad idPaciente.
     * 
     */
    public void setIdPaciente(int value) {
        this.idPaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad nomPaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomPaciente() {
        return nomPaciente;
    }

    /**
     * Define el valor de la propiedad nomPaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomPaciente(String value) {
        this.nomPaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad apePaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApePaciente() {
        return apePaciente;
    }

    /**
     * Define el valor de la propiedad apePaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApePaciente(String value) {
        this.apePaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad docPaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocPaciente() {
        return docPaciente;
    }

    /**
     * Define el valor de la propiedad docPaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocPaciente(String value) {
        this.docPaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacPaciente.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public Date getFechaNacPaciente() {
        return fechaNacPaciente;
    }

    /**
     * Define el valor de la propiedad fechaNacPaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacPaciente(Date value) {
        this.fechaNacPaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad emailPaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPaciente() {
        return emailPaciente;
    }

    /**
     * Define el valor de la propiedad emailPaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPaciente(String value) {
        this.emailPaciente = value;
    }

}
