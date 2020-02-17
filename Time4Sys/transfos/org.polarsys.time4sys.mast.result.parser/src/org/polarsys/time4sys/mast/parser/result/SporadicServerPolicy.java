//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.07.24 � 09:33:27 PM CEST 
//


package org.polarsys.time4sys.mast.parser.result;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Sporadic_Server_Policy complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Sporadic_Server_Policy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Normal_Priority" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Priority" />
 *       &lt;attribute name="Preassigned" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Assertion" />
 *       &lt;attribute name="Background_Priority" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Priority" />
 *       &lt;attribute name="Initial_Capacity" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *       &lt;attribute name="Replenishment_Period" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *       &lt;attribute name="Max_Pending_Replenishments" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sporadic_Server_Policy")
public class SporadicServerPolicy {

    @XmlAttribute(name = "Normal_Priority")
    protected Integer normalPriority;
    @XmlAttribute(name = "Preassigned")
    protected Assertion preassigned;
    @XmlAttribute(name = "Background_Priority")
    protected Integer backgroundPriority;
    @XmlAttribute(name = "Initial_Capacity")
    protected Float initialCapacity;
    @XmlAttribute(name = "Replenishment_Period")
    protected Float replenishmentPeriod;
    @XmlAttribute(name = "Max_Pending_Replenishments")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxPendingReplenishments;

    /**
     * Obtient la valeur de la propri�t� normalPriority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNormalPriority() {
        return normalPriority;
    }

    /**
     * D�finit la valeur de la propri�t� normalPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNormalPriority(Integer value) {
        this.normalPriority = value;
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
     * Obtient la valeur de la propri�t� backgroundPriority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackgroundPriority() {
        return backgroundPriority;
    }

    /**
     * D�finit la valeur de la propri�t� backgroundPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackgroundPriority(Integer value) {
        this.backgroundPriority = value;
    }

    /**
     * Obtient la valeur de la propri�t� initialCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInitialCapacity() {
        return initialCapacity;
    }

    /**
     * D�finit la valeur de la propri�t� initialCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInitialCapacity(Float value) {
        this.initialCapacity = value;
    }

    /**
     * Obtient la valeur de la propri�t� replenishmentPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReplenishmentPeriod() {
        return replenishmentPeriod;
    }

    /**
     * D�finit la valeur de la propri�t� replenishmentPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReplenishmentPeriod(Float value) {
        this.replenishmentPeriod = value;
    }

    /**
     * Obtient la valeur de la propri�t� maxPendingReplenishments.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPendingReplenishments() {
        return maxPendingReplenishments;
    }

    /**
     * D�finit la valeur de la propri�t� maxPendingReplenishments.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPendingReplenishments(BigInteger value) {
        this.maxPendingReplenishments = value;
    }

}
