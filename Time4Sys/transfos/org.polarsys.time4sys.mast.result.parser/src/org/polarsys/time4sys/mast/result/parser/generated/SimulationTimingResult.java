//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.07.24 � 09:33:27 PM CEST 
//


package org.polarsys.time4sys.mast.result.parser.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Simulation_Timing_Result complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Simulation_Timing_Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worst_Global_Response_Times" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Global_Response_Time_List" minOccurs="0"/>
 *         &lt;element name="Avg_Global_Response_Times" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Global_Response_Time_List" minOccurs="0"/>
 *         &lt;element name="Best_Global_Response_Times" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Global_Response_Time_List" minOccurs="0"/>
 *         &lt;element name="Jitters" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Global_Response_Time_List" minOccurs="0"/>
 *         &lt;element name="Local_Miss_Ratios" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Miss_Ratio_List" minOccurs="0"/>
 *         &lt;element name="Global_Miss_Ratios" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Global_Miss_Ratio_List" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Event_Name" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Identifier" />
 *       &lt;attribute name="Worst_Local_Response_Time" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *       &lt;attribute name="Avg_Local_Response_Time" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *       &lt;attribute name="Best_Local_Response_Time" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *       &lt;attribute name="Worst_Blocking_Time" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *       &lt;attribute name="Avg_Blocking_Time" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *       &lt;attribute name="Max_Preemption_Time" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *       &lt;attribute name="Suspension_Time" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *       &lt;attribute name="Num_Of_Suspensions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="Num_Of_Queued_Activations" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Simulation_Timing_Result", propOrder = {
    "worstGlobalResponseTimes",
    "avgGlobalResponseTimes",
    "bestGlobalResponseTimes",
    "jitters",
    "localMissRatios",
    "globalMissRatios"
})
public class SimulationTimingResult {

    @XmlElement(name = "Worst_Global_Response_Times")
    protected GlobalResponseTimeList worstGlobalResponseTimes;
    @XmlElement(name = "Avg_Global_Response_Times")
    protected GlobalResponseTimeList avgGlobalResponseTimes;
    @XmlElement(name = "Best_Global_Response_Times")
    protected GlobalResponseTimeList bestGlobalResponseTimes;
    @XmlElement(name = "Jitters")
    protected GlobalResponseTimeList jitters;
    @XmlElement(name = "Local_Miss_Ratios")
    protected MissRatioList localMissRatios;
    @XmlElement(name = "Global_Miss_Ratios")
    protected GlobalMissRatioList globalMissRatios;
    @XmlAttribute(name = "Event_Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String eventName;
    @XmlAttribute(name = "Worst_Local_Response_Time")
    protected Float worstLocalResponseTime;
    @XmlAttribute(name = "Avg_Local_Response_Time")
    protected Float avgLocalResponseTime;
    @XmlAttribute(name = "Best_Local_Response_Time")
    protected Float bestLocalResponseTime;
    @XmlAttribute(name = "Worst_Blocking_Time")
    protected Float worstBlockingTime;
    @XmlAttribute(name = "Avg_Blocking_Time")
    protected Float avgBlockingTime;
    @XmlAttribute(name = "Max_Preemption_Time")
    protected Float maxPreemptionTime;
    @XmlAttribute(name = "Suspension_Time")
    protected Float suspensionTime;
    @XmlAttribute(name = "Num_Of_Suspensions")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numOfSuspensions;
    @XmlAttribute(name = "Num_Of_Queued_Activations")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numOfQueuedActivations;

    /**
     * Obtient la valeur de la propri�t� worstGlobalResponseTimes.
     * 
     * @return
     *     possible object is
     *     {@link GlobalResponseTimeList }
     *     
     */
    public GlobalResponseTimeList getWorstGlobalResponseTimes() {
        return worstGlobalResponseTimes;
    }

    /**
     * D�finit la valeur de la propri�t� worstGlobalResponseTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalResponseTimeList }
     *     
     */
    public void setWorstGlobalResponseTimes(GlobalResponseTimeList value) {
        this.worstGlobalResponseTimes = value;
    }

    /**
     * Obtient la valeur de la propri�t� avgGlobalResponseTimes.
     * 
     * @return
     *     possible object is
     *     {@link GlobalResponseTimeList }
     *     
     */
    public GlobalResponseTimeList getAvgGlobalResponseTimes() {
        return avgGlobalResponseTimes;
    }

    /**
     * D�finit la valeur de la propri�t� avgGlobalResponseTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalResponseTimeList }
     *     
     */
    public void setAvgGlobalResponseTimes(GlobalResponseTimeList value) {
        this.avgGlobalResponseTimes = value;
    }

    /**
     * Obtient la valeur de la propri�t� bestGlobalResponseTimes.
     * 
     * @return
     *     possible object is
     *     {@link GlobalResponseTimeList }
     *     
     */
    public GlobalResponseTimeList getBestGlobalResponseTimes() {
        return bestGlobalResponseTimes;
    }

    /**
     * D�finit la valeur de la propri�t� bestGlobalResponseTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalResponseTimeList }
     *     
     */
    public void setBestGlobalResponseTimes(GlobalResponseTimeList value) {
        this.bestGlobalResponseTimes = value;
    }

    /**
     * Obtient la valeur de la propri�t� jitters.
     * 
     * @return
     *     possible object is
     *     {@link GlobalResponseTimeList }
     *     
     */
    public GlobalResponseTimeList getJitters() {
        return jitters;
    }

    /**
     * D�finit la valeur de la propri�t� jitters.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalResponseTimeList }
     *     
     */
    public void setJitters(GlobalResponseTimeList value) {
        this.jitters = value;
    }

    /**
     * Obtient la valeur de la propri�t� localMissRatios.
     * 
     * @return
     *     possible object is
     *     {@link MissRatioList }
     *     
     */
    public MissRatioList getLocalMissRatios() {
        return localMissRatios;
    }

    /**
     * D�finit la valeur de la propri�t� localMissRatios.
     * 
     * @param value
     *     allowed object is
     *     {@link MissRatioList }
     *     
     */
    public void setLocalMissRatios(MissRatioList value) {
        this.localMissRatios = value;
    }

    /**
     * Obtient la valeur de la propri�t� globalMissRatios.
     * 
     * @return
     *     possible object is
     *     {@link GlobalMissRatioList }
     *     
     */
    public GlobalMissRatioList getGlobalMissRatios() {
        return globalMissRatios;
    }

    /**
     * D�finit la valeur de la propri�t� globalMissRatios.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalMissRatioList }
     *     
     */
    public void setGlobalMissRatios(GlobalMissRatioList value) {
        this.globalMissRatios = value;
    }

    /**
     * Obtient la valeur de la propri�t� eventName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * D�finit la valeur de la propri�t� eventName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * Obtient la valeur de la propri�t� worstLocalResponseTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWorstLocalResponseTime() {
        return worstLocalResponseTime;
    }

    /**
     * D�finit la valeur de la propri�t� worstLocalResponseTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWorstLocalResponseTime(Float value) {
        this.worstLocalResponseTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� avgLocalResponseTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAvgLocalResponseTime() {
        return avgLocalResponseTime;
    }

    /**
     * D�finit la valeur de la propri�t� avgLocalResponseTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAvgLocalResponseTime(Float value) {
        this.avgLocalResponseTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� bestLocalResponseTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBestLocalResponseTime() {
        return bestLocalResponseTime;
    }

    /**
     * D�finit la valeur de la propri�t� bestLocalResponseTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBestLocalResponseTime(Float value) {
        this.bestLocalResponseTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� worstBlockingTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWorstBlockingTime() {
        return worstBlockingTime;
    }

    /**
     * D�finit la valeur de la propri�t� worstBlockingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWorstBlockingTime(Float value) {
        this.worstBlockingTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� avgBlockingTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAvgBlockingTime() {
        return avgBlockingTime;
    }

    /**
     * D�finit la valeur de la propri�t� avgBlockingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAvgBlockingTime(Float value) {
        this.avgBlockingTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� maxPreemptionTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxPreemptionTime() {
        return maxPreemptionTime;
    }

    /**
     * D�finit la valeur de la propri�t� maxPreemptionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxPreemptionTime(Float value) {
        this.maxPreemptionTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� suspensionTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSuspensionTime() {
        return suspensionTime;
    }

    /**
     * D�finit la valeur de la propri�t� suspensionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSuspensionTime(Float value) {
        this.suspensionTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� numOfSuspensions.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfSuspensions() {
        return numOfSuspensions;
    }

    /**
     * D�finit la valeur de la propri�t� numOfSuspensions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfSuspensions(BigInteger value) {
        this.numOfSuspensions = value;
    }

    /**
     * Obtient la valeur de la propri�t� numOfQueuedActivations.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfQueuedActivations() {
        return numOfQueuedActivations;
    }

    /**
     * D�finit la valeur de la propri�t� numOfQueuedActivations.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfQueuedActivations(BigInteger value) {
        this.numOfQueuedActivations = value;
    }

}
