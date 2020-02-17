//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.24 à 09:33:27 PM CEST 
//


package org.polarsys.time4sys.mast.parser.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Global_Response_Time complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Global_Response_Time">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Referenced_Event" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}External_Reference" />
 *       &lt;attribute name="Time_Value" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Global_Response_Time")
public class GlobalResponseTime {

    @XmlAttribute(name = "Referenced_Event", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String referencedEvent;
    @XmlAttribute(name = "Time_Value", required = true)
    protected float timeValue;

    /**
     * Obtient la valeur de la propriété referencedEvent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedEvent() {
        return referencedEvent;
    }

    /**
     * Définit la valeur de la propriété referencedEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedEvent(String value) {
        this.referencedEvent = value;
    }

    /**
     * Obtient la valeur de la propriété timeValue.
     * 
     */
    public float getTimeValue() {
        return timeValue;
    }

    /**
     * Définit la valeur de la propriété timeValue.
     * 
     */
    public void setTimeValue(float value) {
        this.timeValue = value;
    }

}
