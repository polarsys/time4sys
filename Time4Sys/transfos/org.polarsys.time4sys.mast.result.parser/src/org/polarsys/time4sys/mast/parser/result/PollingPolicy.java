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
 * <p>Classe Java pour Polling_Policy complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Polling_Policy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="The_Priority" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Priority" />
 *       &lt;attribute name="Preassigned" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Assertion" />
 *       &lt;attribute name="Polling_Period" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *       &lt;attribute name="Polling_Worst_Overhead" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Normalized_Execution_Time" />
 *       &lt;attribute name="Polling_Avg_Overhead" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Normalized_Execution_Time" />
 *       &lt;attribute name="Polling_Best_Overhead" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Normalized_Execution_Time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Polling_Policy")
public class PollingPolicy {

    @XmlAttribute(name = "The_Priority")
    protected Integer thePriority;
    @XmlAttribute(name = "Preassigned")
    protected Assertion preassigned;
    @XmlAttribute(name = "Polling_Period")
    protected Float pollingPeriod;
    @XmlAttribute(name = "Polling_Worst_Overhead")
    protected Float pollingWorstOverhead;
    @XmlAttribute(name = "Polling_Avg_Overhead")
    protected Float pollingAvgOverhead;
    @XmlAttribute(name = "Polling_Best_Overhead")
    protected Float pollingBestOverhead;

    /**
     * Obtient la valeur de la propri�t� thePriority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThePriority() {
        return thePriority;
    }

    /**
     * D�finit la valeur de la propri�t� thePriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThePriority(Integer value) {
        this.thePriority = value;
    }

    /**
     * Obtient la valeur de la propri�t� preassigned.
     * 
     * @return
     *     possible object is
     *     {@link Assertion }
     *     
     */
    public Assertion getPreassigned() {
        return preassigned;
    }

    /**
     * D�finit la valeur de la propri�t� preassigned.
     * 
     * @param value
     *     allowed object is
     *     {@link Assertion }
     *     
     */
    public void setPreassigned(Assertion value) {
        this.preassigned = value;
    }

    /**
     * Obtient la valeur de la propri�t� pollingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPollingPeriod() {
        return pollingPeriod;
    }

    /**
     * D�finit la valeur de la propri�t� pollingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPollingPeriod(Float value) {
        this.pollingPeriod = value;
    }

    /**
     * Obtient la valeur de la propri�t� pollingWorstOverhead.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPollingWorstOverhead() {
        return pollingWorstOverhead;
    }

    /**
     * D�finit la valeur de la propri�t� pollingWorstOverhead.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPollingWorstOverhead(Float value) {
        this.pollingWorstOverhead = value;
    }

    /**
     * Obtient la valeur de la propri�t� pollingAvgOverhead.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPollingAvgOverhead() {
        return pollingAvgOverhead;
    }

    /**
     * D�finit la valeur de la propri�t� pollingAvgOverhead.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPollingAvgOverhead(Float value) {
        this.pollingAvgOverhead = value;
    }

    /**
     * Obtient la valeur de la propri�t� pollingBestOverhead.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPollingBestOverhead() {
        return pollingBestOverhead;
    }

    /**
     * D�finit la valeur de la propri�t� pollingBestOverhead.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPollingBestOverhead(Float value) {
        this.pollingBestOverhead = value;
    }

}
