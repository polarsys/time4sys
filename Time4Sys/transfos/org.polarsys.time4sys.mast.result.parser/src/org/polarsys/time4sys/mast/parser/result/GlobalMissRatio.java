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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Global_Miss_Ratio complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Global_Miss_Ratio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Miss_Ratios" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Miss_Ratio_List"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Referenced_Event" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}External_Reference" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Global_Miss_Ratio", propOrder = {
    "missRatios"
})
public class GlobalMissRatio {

    @XmlElement(name = "Miss_Ratios", required = true)
    protected MissRatioList missRatios;
    @XmlAttribute(name = "Referenced_Event", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String referencedEvent;

    /**
     * Obtient la valeur de la propri�t� missRatios.
     * 
     * @return
     *     possible object is
     *     {@link MissRatioList }
     *     
     */
    public MissRatioList getMissRatios() {
        return missRatios;
    }

    /**
     * D�finit la valeur de la propri�t� missRatios.
     * 
     * @param value
     *     allowed object is
     *     {@link MissRatioList }
     *     
     */
    public void setMissRatios(MissRatioList value) {
        this.missRatios = value;
    }

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

}
