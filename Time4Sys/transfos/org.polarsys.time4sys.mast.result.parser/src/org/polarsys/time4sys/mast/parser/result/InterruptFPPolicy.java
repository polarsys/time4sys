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
 * <p>Classe Java pour Interrupt_FP_Policy complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Interrupt_FP_Policy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="The_Priority" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Priority" />
 *       &lt;attribute name="Preassigned" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Affirmative_Assertion" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interrupt_FP_Policy")
public class InterruptFPPolicy {

    @XmlAttribute(name = "The_Priority")
    protected Integer thePriority;
    @XmlAttribute(name = "Preassigned")
    protected AffirmativeAssertion preassigned;

    /**
     * Obtient la valeur de la propriété thePriority.
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
     * Définit la valeur de la propriété thePriority.
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
     * Obtient la valeur de la propriété preassigned.
     * 
     * @return
     *     possible object is
     *     {@link AffirmativeAssertion }
     *     
     */
    public AffirmativeAssertion getPreassigned() {
        return preassigned;
    }

    /**
     * Définit la valeur de la propriété preassigned.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmativeAssertion }
     *     
     */
    public void setPreassigned(AffirmativeAssertion value) {
        this.preassigned = value;
    }

}
