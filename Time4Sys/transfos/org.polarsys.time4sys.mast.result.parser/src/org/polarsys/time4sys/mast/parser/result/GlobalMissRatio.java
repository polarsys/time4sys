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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Global_Miss_Ratio complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété missRatios.
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
     * Définit la valeur de la propriété missRatios.
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

}
