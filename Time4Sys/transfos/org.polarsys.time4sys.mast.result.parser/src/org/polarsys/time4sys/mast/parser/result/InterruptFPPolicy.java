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
 * <p>Classe Java pour Interrupt_FP_Policy complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     *     {@link AffirmativeAssertion }
     *     
     */
    public AffirmativeAssertion getPreassigned() {
        return preassigned;
    }

    /**
     * D�finit la valeur de la propri�t� preassigned.
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
