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
 * <p>Classe Java pour Detailed_Utilization complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� total.
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
     * D�finit la valeur de la propri�t� total.
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
     * Obtient la valeur de la propri�t� application.
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
     * D�finit la valeur de la propri�t� application.
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
     * Obtient la valeur de la propri�t� contextSwitch.
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
     * D�finit la valeur de la propri�t� contextSwitch.
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
     * Obtient la valeur de la propri�t� timer.
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
     * D�finit la valeur de la propri�t� timer.
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
     * Obtient la valeur de la propri�t� driver.
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
     * D�finit la valeur de la propri�t� driver.
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
