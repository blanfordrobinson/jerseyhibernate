//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.23 at 09:14:17 AM EDT 
//


package org.ici.dtos;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sx_currency_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sx_currency_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sxCurrencyId",
    "sxCurrencyDesc"
})
@XmlRootElement(name = "currencyDTO")
public class CurrencyDTO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "sx_currency_id")
    protected int sxCurrencyId;
    @XmlElement(name = "sx_currency_desc")
    protected String sxCurrencyDesc;

    /**
     * Gets the value of the sxCurrencyId property.
     * 
     */
    public int getSxCurrencyId() {
        return sxCurrencyId;
    }

    /**
     * Sets the value of the sxCurrencyId property.
     * 
     */
    public void setSxCurrencyId(int value) {
        this.sxCurrencyId = value;
    }

    public boolean isSetSxCurrencyId() {
        return true;
    }

    /**
     * Gets the value of the sxCurrencyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSxCurrencyDesc() {
        return sxCurrencyDesc;
    }

    /**
     * Sets the value of the sxCurrencyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSxCurrencyDesc(String value) {
        this.sxCurrencyDesc = value;
    }

    public boolean isSetSxCurrencyDesc() {
        return (this.sxCurrencyDesc!= null);
    }

}
