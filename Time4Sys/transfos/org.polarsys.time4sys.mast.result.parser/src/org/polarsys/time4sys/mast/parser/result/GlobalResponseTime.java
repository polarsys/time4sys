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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Global_Response_Time complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� referencedEvent.
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
     * D�finit la valeur de la propri�t� referencedEvent.
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
     * Obtient la valeur de la propri�t� timeValue.
     * 
     */
    public float getTimeValue() {
        return timeValue;
    }

    /**
     * D�finit la valeur de la propri�t� timeValue.
     * 
     */
    public void setTimeValue(float value) {
        this.timeValue = value;
    }

}
