//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.07.24 � 09:33:27 PM CEST 
//


package org.polarsys.time4sys.mast.parser.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;choice>
 *           &lt;element name="System_Slack" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Slack"/>
 *           &lt;element name="Trace" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Trace"/>
 *           &lt;element name="Transaction" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Transaction_Results"/>
 *           &lt;element name="Processing_Resource" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Processing_Resource_Results"/>
 *           &lt;element name="Operation" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Operation_Results"/>
 *           &lt;element name="Scheduling_Server" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Scheduling_Server_Results"/>
 *           &lt;element name="Shared_Resource" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Shared_Resource_Results"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Model_Name" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Identifier" />
 *       &lt;attribute name="Model_Date" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Date_Time" />
 *       &lt;attribute name="Generation_Tool" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Generation_Profile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Generation_Date" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Date_Time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "systemSlackOrTraceOrTransaction"
})
@XmlRootElement(name = "REAL_TIME_SITUATION")
public class REALTIMESITUATION {

    @XmlElements({
        @XmlElement(name = "System_Slack", type = Slack.class),
        @XmlElement(name = "Trace", type = Trace.class),
        @XmlElement(name = "Transaction", type = TransactionResults.class),
        @XmlElement(name = "Processing_Resource", type = ProcessingResourceResults.class),
        @XmlElement(name = "Operation", type = OperationResults.class),
        @XmlElement(name = "Scheduling_Server", type = SchedulingServerResults.class),
        @XmlElement(name = "Shared_Resource", type = SharedResourceResults.class)
    })
    protected List<Object> systemSlackOrTraceOrTransaction;
    @XmlAttribute(name = "Model_Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String modelName;
    @XmlAttribute(name = "Model_Date", required = true)
    protected XMLGregorianCalendar modelDate;
    @XmlAttribute(name = "Generation_Tool", required = true)
    protected String generationTool;
    @XmlAttribute(name = "Generation_Profile")
    protected String generationProfile;
    @XmlAttribute(name = "Generation_Date", required = true)
    protected XMLGregorianCalendar generationDate;

    /**
     * Gets the value of the systemSlackOrTraceOrTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemSlackOrTraceOrTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemSlackOrTraceOrTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Slack }
     * {@link Trace }
     * {@link TransactionResults }
     * {@link ProcessingResourceResults }
     * {@link OperationResults }
     * {@link SchedulingServerResults }
     * {@link SharedResourceResults }
     * 
     * 
     */
    public List<Object> getSystemSlackOrTraceOrTransaction() {
        if (systemSlackOrTraceOrTransaction == null) {
            systemSlackOrTraceOrTransaction = new ArrayList<Object>();
        }
        return this.systemSlackOrTraceOrTransaction;
    }

    /**
     * Obtient la valeur de la propri�t� modelName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * D�finit la valeur de la propri�t� modelName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Obtient la valeur de la propri�t� modelDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModelDate() {
        return modelDate;
    }

    /**
     * D�finit la valeur de la propri�t� modelDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModelDate(XMLGregorianCalendar value) {
        this.modelDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� generationTool.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerationTool() {
        return generationTool;
    }

    /**
     * D�finit la valeur de la propri�t� generationTool.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerationTool(String value) {
        this.generationTool = value;
    }

    /**
     * Obtient la valeur de la propri�t� generationProfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerationProfile() {
        return generationProfile;
    }

    /**
     * D�finit la valeur de la propri�t� generationProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerationProfile(String value) {
        this.generationProfile = value;
    }

    /**
     * Obtient la valeur de la propri�t� generationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGenerationDate() {
        return generationDate;
    }

    /**
     * D�finit la valeur de la propri�t� generationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGenerationDate(XMLGregorianCalendar value) {
        this.generationDate = value;
    }

}
