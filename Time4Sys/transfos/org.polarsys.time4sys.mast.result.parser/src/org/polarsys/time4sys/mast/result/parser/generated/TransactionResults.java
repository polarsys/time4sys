//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.24 à 09:33:27 PM CEST 
//


package org.polarsys.time4sys.mast.result.parser.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Transaction_Results complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Transaction_Results">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="Slack" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Slack"/>
 *           &lt;element name="Timing_Result" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Timing_Result"/>
 *           &lt;element name="Simulation_Timing_Result" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Simulation_Timing_Result"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Identifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction_Results", propOrder = {
    "slackOrTimingResultOrSimulationTimingResult"
})
public class TransactionResults {

    @XmlElements({
        @XmlElement(name = "Slack", type = Slack.class),
        @XmlElement(name = "Timing_Result", type = TimingResult.class),
        @XmlElement(name = "Simulation_Timing_Result", type = SimulationTimingResult.class)
    })
    protected List<Object> slackOrTimingResultOrSimulationTimingResult;
    @XmlAttribute(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String name;

    /**
     * Gets the value of the slackOrTimingResultOrSimulationTimingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slackOrTimingResultOrSimulationTimingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlackOrTimingResultOrSimulationTimingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Slack }
     * {@link TimingResult }
     * {@link SimulationTimingResult }
     * 
     * 
     */
    public List<Object> getSlackOrTimingResultOrSimulationTimingResult() {
        if (slackOrTimingResultOrSimulationTimingResult == null) {
            slackOrTimingResultOrSimulationTimingResult = new ArrayList<Object>();
        }
        return this.slackOrTimingResultOrSimulationTimingResult;
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
