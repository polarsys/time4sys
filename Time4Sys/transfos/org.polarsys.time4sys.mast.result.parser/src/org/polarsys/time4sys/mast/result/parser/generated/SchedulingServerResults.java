//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.07.24 � 09:33:27 PM CEST 
//


package org.polarsys.time4sys.mast.result.parser.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Scheduling_Server_Results complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Scheduling_Server_Results">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Non_Preemptible_FP_Policy" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Non_Preemptible_FP_Policy"/>
 *         &lt;element name="Fixed_Priority_Policy" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Fixed_Priority_Policy"/>
 *         &lt;element name="Interrupt_FP_Policy" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Interrupt_FP_Policy"/>
 *         &lt;element name="Polling_Policy" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Polling_Policy"/>
 *         &lt;element name="Sporadic_Server_Policy" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Sporadic_Server_Policy"/>
 *       &lt;/choice>
 *       &lt;attribute name="Name" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Identifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scheduling_Server_Results", propOrder = {
    "nonPreemptibleFPPolicy",
    "fixedPriorityPolicy",
    "interruptFPPolicy",
    "pollingPolicy",
    "sporadicServerPolicy"
})
public class SchedulingServerResults {

    @XmlElement(name = "Non_Preemptible_FP_Policy")
    protected NonPreemptibleFPPolicy nonPreemptibleFPPolicy;
    @XmlElement(name = "Fixed_Priority_Policy")
    protected FixedPriorityPolicy fixedPriorityPolicy;
    @XmlElement(name = "Interrupt_FP_Policy")
    protected InterruptFPPolicy interruptFPPolicy;
    @XmlElement(name = "Polling_Policy")
    protected PollingPolicy pollingPolicy;
    @XmlElement(name = "Sporadic_Server_Policy")
    protected SporadicServerPolicy sporadicServerPolicy;
    @XmlAttribute(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String name;

    /**
     * Obtient la valeur de la propri�t� nonPreemptibleFPPolicy.
     * 
     * @return
     *     possible object is
     *     {@link NonPreemptibleFPPolicy }
     *     
     */
    public NonPreemptibleFPPolicy getNonPreemptibleFPPolicy() {
        return nonPreemptibleFPPolicy;
    }

    /**
     * D�finit la valeur de la propri�t� nonPreemptibleFPPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link NonPreemptibleFPPolicy }
     *     
     */
    public void setNonPreemptibleFPPolicy(NonPreemptibleFPPolicy value) {
        this.nonPreemptibleFPPolicy = value;
    }

    /**
     * Obtient la valeur de la propri�t� fixedPriorityPolicy.
     * 
     * @return
     *     possible object is
     *     {@link FixedPriorityPolicy }
     *     
     */
    public FixedPriorityPolicy getFixedPriorityPolicy() {
        return fixedPriorityPolicy;
    }

    /**
     * D�finit la valeur de la propri�t� fixedPriorityPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPriorityPolicy }
     *     
     */
    public void setFixedPriorityPolicy(FixedPriorityPolicy value) {
        this.fixedPriorityPolicy = value;
    }

    /**
     * Obtient la valeur de la propri�t� interruptFPPolicy.
     * 
     * @return
     *     possible object is
     *     {@link InterruptFPPolicy }
     *     
     */
    public InterruptFPPolicy getInterruptFPPolicy() {
        return interruptFPPolicy;
    }

    /**
     * D�finit la valeur de la propri�t� interruptFPPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link InterruptFPPolicy }
     *     
     */
    public void setInterruptFPPolicy(InterruptFPPolicy value) {
        this.interruptFPPolicy = value;
    }

    /**
     * Obtient la valeur de la propri�t� pollingPolicy.
     * 
     * @return
     *     possible object is
     *     {@link PollingPolicy }
     *     
     */
    public PollingPolicy getPollingPolicy() {
        return pollingPolicy;
    }

    /**
     * D�finit la valeur de la propri�t� pollingPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link PollingPolicy }
     *     
     */
    public void setPollingPolicy(PollingPolicy value) {
        this.pollingPolicy = value;
    }

    /**
     * Obtient la valeur de la propri�t� sporadicServerPolicy.
     * 
     * @return
     *     possible object is
     *     {@link SporadicServerPolicy }
     *     
     */
    public SporadicServerPolicy getSporadicServerPolicy() {
        return sporadicServerPolicy;
    }

    /**
     * D�finit la valeur de la propri�t� sporadicServerPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link SporadicServerPolicy }
     *     
     */
    public void setSporadicServerPolicy(SporadicServerPolicy value) {
        this.sporadicServerPolicy = value;
    }

    /**
     * Obtient la valeur de la propri�t� name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
