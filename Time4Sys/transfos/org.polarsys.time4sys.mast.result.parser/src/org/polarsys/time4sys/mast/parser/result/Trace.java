//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.07.24 � 09:33:27 PM CEST 
//


package org.polarsys.time4sys.mast.parser.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Trace complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Trace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Pathname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trace")
public class Trace {

    @XmlAttribute(name = "Pathname", required = true)
    protected String pathname;

    /**
     * Obtient la valeur de la propri�t� pathname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathname() {
        return pathname;
    }

    /**
     * D�finit la valeur de la propri�t� pathname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathname(String value) {
        this.pathname = value;
    }

}
