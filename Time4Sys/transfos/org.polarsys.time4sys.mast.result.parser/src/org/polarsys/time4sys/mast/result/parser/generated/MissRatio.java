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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Miss_Ratio complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Miss_Ratio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Deadline" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *       &lt;attribute name="Ratio" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Percentage" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Miss_Ratio")
public class MissRatio {

    @XmlAttribute(name = "Deadline", required = true)
    protected float deadline;
    @XmlAttribute(name = "Ratio", required = true)
    protected float ratio;

    /**
     * Obtient la valeur de la propriété deadline.
     * 
     */
    public float getDeadline() {
        return deadline;
    }

    /**
     * Définit la valeur de la propriété deadline.
     * 
     */
    public void setDeadline(float value) {
        this.deadline = value;
    }

    /**
     * Obtient la valeur de la propriété ratio.
     * 
     */
    public float getRatio() {
        return ratio;
    }

    /**
     * Définit la valeur de la propriété ratio.
     * 
     */
    public void setRatio(float value) {
        this.ratio = value;
    }

}
