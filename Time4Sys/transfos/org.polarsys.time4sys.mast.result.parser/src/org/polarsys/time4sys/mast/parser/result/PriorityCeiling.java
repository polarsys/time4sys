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
 * <p>Classe Java pour Priority_Ceiling complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Priority_Ceiling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Ceiling" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Priority" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Priority_Ceiling")
public class PriorityCeiling {

    @XmlAttribute(name = "Ceiling")
    protected Integer ceiling;

    /**
     * Obtient la valeur de la propri�t� ceiling.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCeiling() {
        return ceiling;
    }

    /**
     * D�finit la valeur de la propri�t� ceiling.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCeiling(Integer value) {
        this.ceiling = value;
    }

}
