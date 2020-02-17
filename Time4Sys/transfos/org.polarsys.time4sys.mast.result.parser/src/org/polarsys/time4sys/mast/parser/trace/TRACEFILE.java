//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.09.25 � 09:27:08 AM CEST 
//


package org.polarsys.time4sys.mast.parser.trace;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="Msg_Type_List" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Trace}Msg_Type_List" minOccurs="0"/>
 *         &lt;element name="Src_List" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Trace}Src_List" minOccurs="0"/>
 *         &lt;element name="Msg_List" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Trace}Msg_List"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Model_Name" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Trace}Identifier" />
 *       &lt;attribute name="Model_Date" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Trace}Date_Time" />
 *       &lt;attribute name="Generation_Tool" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Generation_Profile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Generation_Date" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Trace}Date_Time" />
 *       &lt;attribute name="Start_Time" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Trace}Time" />
 *       &lt;attribute name="End_Time" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Trace}Time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "msgTypeList",
    "srcList",
    "msgList"
})
@XmlRootElement(name = "TRACE_FILE")
public class TRACEFILE {

    @XmlElement(name = "Msg_Type_List")
    protected MsgTypeList msgTypeList;
    @XmlElement(name = "Src_List")
    protected SrcList srcList;
    @XmlElement(name = "Msg_List", required = true)
    protected MsgList msgList;
    @XmlAttribute(name = "Model_Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String modelName;
    @XmlAttribute(name = "Model_Date", required = true)
    protected XMLGregorianCalendar modelDate;
    @XmlAttribute(name = "Generation_Tool", required = true)
    protected String generationTool;
    @XmlAttribute(name = "Generation_Profile")
    protected String generationProfile;
    @XmlAttribute(name = "Generation_Date", required = true)
    protected XMLGregorianCalendar generationDate;
    @XmlAttribute(name = "Start_Time", required = true)
    protected float startTime;
    @XmlAttribute(name = "End_Time", required = true)
    protected float endTime;

    /**
     * Obtient la valeur de la propri�t� msgTypeList.
     * 
     * @return
     *     possible object is
     *     {@link MsgTypeList }
     *     
     */
    public MsgTypeList getMsgTypeList() {
        return msgTypeList;
    }

    /**
     * D�finit la valeur de la propri�t� msgTypeList.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgTypeList }
     *     
     */
    public void setMsgTypeList(MsgTypeList value) {
        this.msgTypeList = value;
    }

    /**
     * Obtient la valeur de la propri�t� srcList.
     * 
     * @return
     *     possible object is
     *     {@link SrcList }
     *     
     */
    public SrcList getSrcList() {
        return srcList;
    }

    /**
     * D�finit la valeur de la propri�t� srcList.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcList }
     *     
     */
    public void setSrcList(SrcList value) {
        this.srcList = value;
    }

    /**
     * Obtient la valeur de la propri�t� msgList.
     * 
     * @return
     *     possible object is
     *     {@link MsgList }
     *     
     */
    public MsgList getMsgList() {
        return msgList;
    }

    /**
     * D�finit la valeur de la propri�t� msgList.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgList }
     *     
     */
    public void setMsgList(MsgList value) {
        this.msgList = value;
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

    /**
     * Obtient la valeur de la propri�t� startTime.
     * 
     */
    public float getStartTime() {
        return startTime;
    }

    /**
     * D�finit la valeur de la propri�t� startTime.
     * 
     */
    public void setStartTime(float value) {
        this.startTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� endTime.
     * 
     */
    public float getEndTime() {
        return endTime;
    }

    /**
     * D�finit la valeur de la propri�t� endTime.
     * 
     */
    public void setEndTime(float value) {
        this.endTime = value;
    }

}
