//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.09.25 � 09:27:08 AM CEST 
//


package org.polarsys.time4sys.mast.parser.trace;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.polarsys.time4sys.mast.parser.trace package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.polarsys.time4sys.mast.parser.trace
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TRACEFILE }
     * 
     */
    public TRACEFILE createTRACEFILE() {
        return new TRACEFILE();
    }

    /**
     * Create an instance of {@link MsgTypeList }
     * 
     */
    public MsgTypeList createMsgTypeList() {
        return new MsgTypeList();
    }

    /**
     * Create an instance of {@link SrcList }
     * 
     */
    public SrcList createSrcList() {
        return new SrcList();
    }

    /**
     * Create an instance of {@link MsgList }
     * 
     */
    public MsgList createMsgList() {
        return new MsgList();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

}
