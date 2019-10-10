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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Shared_Resource_Results complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Shared_Resource_Results">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Priority_Ceiling" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Priority_Ceiling" minOccurs="0"/>
 *         &lt;element name="Utilization" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Utilization" minOccurs="0"/>
 *         &lt;element name="Queue_Size" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Queue_Size" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="Name" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Identifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shared_Resource_Results", propOrder = {

})
public class SharedResourceResults {

    @XmlElement(name = "Priority_Ceiling")
    protected PriorityCeiling priorityCeiling;
    @XmlElement(name = "Utilization")
    protected Utilization utilization;
    @XmlElement(name = "Queue_Size")
    protected QueueSize queueSize;
    @XmlAttribute(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String name;

    /**
     * Obtient la valeur de la propriété priorityCeiling.
     * 
     * @return
     *     possible object is
     *     {@link PriorityCeiling }
     *     
     */
    public PriorityCeiling getPriorityCeiling() {
        return priorityCeiling;
    }

    /**
     * Définit la valeur de la propriété priorityCeiling.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityCeiling }
     *     
     */
    public void setPriorityCeiling(PriorityCeiling value) {
        this.priorityCeiling = value;
    }

    /**
     * Obtient la valeur de la propriété utilization.
     * 
     * @return
     *     possible object is
     *     {@link Utilization }
     *     
     */
    public Utilization getUtilization() {
        return utilization;
    }

    /**
     * Définit la valeur de la propriété utilization.
     * 
     * @param value
     *     allowed object is
     *     {@link Utilization }
     *     
     */
    public void setUtilization(Utilization value) {
        this.utilization = value;
    }

    /**
     * Obtient la valeur de la propriété queueSize.
     * 
     * @return
     *     possible object is
     *     {@link QueueSize }
     *     
     */
    public QueueSize getQueueSize() {
        return queueSize;
    }

    /**
     * Définit la valeur de la propriété queueSize.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueSize }
     *     
     */
    public void setQueueSize(QueueSize value) {
        this.queueSize = value;
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
