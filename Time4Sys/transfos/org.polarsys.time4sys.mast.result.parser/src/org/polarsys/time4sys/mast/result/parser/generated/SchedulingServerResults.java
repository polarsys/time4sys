//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.24 à 09:33:27 PM CEST 
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
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété nonPreemptibleFPPolicy.
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
     * Définit la valeur de la propriété nonPreemptibleFPPolicy.
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
     * Obtient la valeur de la propriété fixedPriorityPolicy.
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
     * Définit la valeur de la propriété fixedPriorityPolicy.
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
     * Obtient la valeur de la propriété interruptFPPolicy.
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
     * Définit la valeur de la propriété interruptFPPolicy.
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
     * Obtient la valeur de la propriété pollingPolicy.
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
     * Définit la valeur de la propriété pollingPolicy.
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
     * Obtient la valeur de la propriété sporadicServerPolicy.
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
     * Définit la valeur de la propriété sporadicServerPolicy.
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
     * Obtient la valeur de la propriété name.
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
     * Définit la valeur de la propriété name.
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
