
package com.upem.sellingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="borrowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copy_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etr_user_book" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="years" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookWS", propOrder = {
    "author",
    "borrowed",
    "category",
    "copyNumber",
    "description",
    "disp",
    "etrUserBook",
    "isbn",
    "price",
    "title",
    "years"
})
public class BookWS {

    protected String author;
    protected boolean borrowed;
    protected String category;
    @XmlElement(name = "copy_number")
    protected int copyNumber;
    protected String description;
    protected String disp;
    @XmlElement(name = "etr_user_book")
    protected String etrUserBook;
    protected String isbn;
    protected double price;
    protected String title;
    protected int years;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the borrowed property.
     * 
     */
    public boolean isBorrowed() {
        return borrowed;
    }

    /**
     * Sets the value of the borrowed property.
     * 
     */
    public void setBorrowed(boolean value) {
        this.borrowed = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the copyNumber property.
     * 
     */
    public int getCopyNumber() {
        return copyNumber;
    }

    /**
     * Sets the value of the copyNumber property.
     * 
     */
    public void setCopyNumber(int value) {
        this.copyNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the disp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisp() {
        return disp;
    }

    /**
     * Sets the value of the disp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisp(String value) {
        this.disp = value;
    }

    /**
     * Gets the value of the etrUserBook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtrUserBook() {
        return etrUserBook;
    }

    /**
     * Sets the value of the etrUserBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtrUserBook(String value) {
        this.etrUserBook = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the years property.
     * 
     */
    public int getYears() {
        return years;
    }

    /**
     * Sets the value of the years property.
     * 
     */
    public void setYears(int value) {
        this.years = value;
    }

	@Override
	public String toString() {
		return "BookWS [author=" + author + ", borrowed=" + borrowed
				+ ", category=" + category + ", copyNumber=" + copyNumber
				+ ", description=" + description + ", disp=" + disp + ", isbn="
				+ isbn + ", price=" + price + ", title=" + title + ", years="
				+ years + "]";
	}
    

}
