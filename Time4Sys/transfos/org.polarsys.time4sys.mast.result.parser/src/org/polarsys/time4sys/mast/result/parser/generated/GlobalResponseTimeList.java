//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.07.24 � 09:33:27 PM CEST 
//


package org.polarsys.time4sys.mast.result.parser.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Global_Response_Time_List complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Global_Response_Time_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Global_Response_Time" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Global_Response_Time" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Global_Response_Time_List", propOrder = {
    "globalResponseTime"
})
public class GlobalResponseTimeList {

    @XmlElement(name = "Global_Response_Time", required = true)
    protected List<GlobalResponseTime> globalResponseTime;

    /**
     * Gets the value of the globalResponseTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalResponseTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalResponseTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalResponseTime }
     * 
     * 
     */
    public List<GlobalResponseTime> getGlobalResponseTime() {
        if (globalResponseTime == null) {
            globalResponseTime = new ArrayList<GlobalResponseTime>();
        }
        return this.globalResponseTime;
    }

}
