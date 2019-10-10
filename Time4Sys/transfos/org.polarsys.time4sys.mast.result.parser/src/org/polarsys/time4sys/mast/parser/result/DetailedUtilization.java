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


/**
 * <p>Classe Java pour Detailed_Utilization complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Detailed_Utilization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Total" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Percentage" />
 *       &lt;attribute name="Application" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Percentage" />
 *       &lt;attribute name="Context_Switch" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Percentage" />
 *       &lt;attribute name="Timer" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Percentage" />
 *       &lt;attribute name="Driver" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Percentage" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Detailed_Utilization")
public class DetailedUtilization {

    @XmlAttribute(name = "Total")
    protected Float total;
    @XmlAttribute(name = "Application")
    protected Float application;
    @XmlAttribute(name = "Context_Switch")
    protected Float contextSwitch;
    @XmlAttribute(name = "Timer")
    protected Float timer;
    @XmlAttribute(name = "Driver")
    protected Float driver;

    /**
     * Obtient la valeur de la propriété total.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotal() {
        return total;
    }

    /**
     * Définit la valeur de la propriété total.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotal(Float value) {
        this.total = value;
    }

    /**
     * Obtient la valeur de la propriété application.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getApplication() {
        return application;
    }

    /**
     * Définit la valeur de la propriété application.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setApplication(Float value) {
        this.application = value;
    }

    /**
     * Obtient la valeur de la propriété contextSwitch.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getContextSwitch() {
        return contextSwitch;
    }

    /**
     * Définit la valeur de la propriété contextSwitch.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setContextSwitch(Float value) {
        this.contextSwitch = value;
    }

    /**
     * Obtient la valeur de la propriété timer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimer() {
        return timer;
    }

    /**
     * Définit la valeur de la propriété timer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimer(Float value) {
        this.timer = value;
    }

    /**
     * Obtient la valeur de la propriété driver.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDriver() {
        return driver;
    }

    /**
     * Définit la valeur de la propriété driver.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDriver(Float value) {
        this.driver = value;
    }

}
