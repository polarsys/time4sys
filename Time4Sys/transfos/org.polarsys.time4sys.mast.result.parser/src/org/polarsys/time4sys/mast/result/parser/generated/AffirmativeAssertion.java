//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.24 à 09:33:27 PM CEST 
//


package org.polarsys.time4sys.mast.result.parser.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Affirmative_Assertion.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Affirmative_Assertion">
 *   &lt;restriction base="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Assertion">
 *     &lt;enumeration value="Yes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Affirmative_Assertion")
@XmlEnum(Assertion.class)
public enum AffirmativeAssertion {

    @XmlEnumValue("Yes")
    YES(Assertion.YES);
    private final Assertion value;

    AffirmativeAssertion(Assertion v) {
        value = v;
    }

    public Assertion value() {
        return value;
    }

    public static AffirmativeAssertion fromValue(Assertion v) {
        for (AffirmativeAssertion c: AffirmativeAssertion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
