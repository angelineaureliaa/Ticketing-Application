
package projektiket_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BacaReservasi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BacaReservasi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tempat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lantai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tanggal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BacaReservasi", propOrder = {
    "tempat",
    "lantai",
    "tanggal"
})
public class BacaReservasi {

    protected String tempat;
    protected String lantai;
    protected String tanggal;

    /**
     * Gets the value of the tempat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempat() {
        return tempat;
    }

    /**
     * Sets the value of the tempat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempat(String value) {
        this.tempat = value;
    }

    /**
     * Gets the value of the lantai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLantai() {
        return lantai;
    }

    /**
     * Sets the value of the lantai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLantai(String value) {
        this.lantai = value;
    }

    /**
     * Gets the value of the tanggal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * Sets the value of the tanggal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggal(String value) {
        this.tanggal = value;
    }

}
