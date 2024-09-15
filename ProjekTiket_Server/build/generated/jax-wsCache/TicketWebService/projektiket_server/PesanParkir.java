
package projektiket_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PesanParkir complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PesanParkir"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nomor_parkir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tanggal_pembelian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tanggal_parkir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lantai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tempatt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PesanParkir", propOrder = {
    "nomorParkir",
    "tanggalPembelian",
    "tanggalParkir",
    "lantai",
    "username",
    "tempatt"
})
public class PesanParkir {

    @XmlElement(name = "nomor_parkir")
    protected String nomorParkir;
    @XmlElement(name = "tanggal_pembelian")
    protected String tanggalPembelian;
    @XmlElement(name = "tanggal_parkir")
    protected String tanggalParkir;
    protected String lantai;
    protected String username;
    protected String tempatt;

    /**
     * Gets the value of the nomorParkir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomorParkir() {
        return nomorParkir;
    }

    /**
     * Sets the value of the nomorParkir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomorParkir(String value) {
        this.nomorParkir = value;
    }

    /**
     * Gets the value of the tanggalPembelian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalPembelian() {
        return tanggalPembelian;
    }

    /**
     * Sets the value of the tanggalPembelian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalPembelian(String value) {
        this.tanggalPembelian = value;
    }

    /**
     * Gets the value of the tanggalParkir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalParkir() {
        return tanggalParkir;
    }

    /**
     * Sets the value of the tanggalParkir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalParkir(String value) {
        this.tanggalParkir = value;
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
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the tempatt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempatt() {
        return tempatt;
    }

    /**
     * Sets the value of the tempatt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempatt(String value) {
        this.tempatt = value;
    }

}
