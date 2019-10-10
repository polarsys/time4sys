//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.09.25 � 09:27:08 AM CEST 
//


package org.polarsys.time4sys.mast.parser.trace;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Message complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="T" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Trace}Time" />
 *       &lt;attribute name="S" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Trace}Source_Identifier" />
 *       &lt;attribute name="M" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Trace}Message_Identifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message")
public class Message {

    @XmlAttribute(name = "T", required = true)
    protected float t;
    @XmlAttribute(name = "S", required = true)
    protected int s;
    @XmlAttribute(name = "M", required = true)
    protected BigInteger m;

    /**
     * Obtient la valeur de la propri�t� t.
     * 
     */
    public float getT() {
        return t;
    }

    /**
     * D�finit la valeur de la propri�t� t.
     * 
     */
    public void setT(float value) {
        this.t = value;
    }

    /**
     * Obtient la valeur de la propri�t� s.
     * 
     */
    public int getS() {
        return s;
    }

    /**
     * D�finit la valeur de la propri�t� s.
     * 
     */
    public void setS(int value) {
        this.s = value;
    }

    /**
     * Obtient la valeur de la propri�t� m.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getM() {
        return m;
    }

    /**
     * D�finit la valeur de la propri�t� m.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setM(BigInteger value) {
        this.m = value;
    }

}
