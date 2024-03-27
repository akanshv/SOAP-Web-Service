
package in.beginzero.webserviceclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DivIntegers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DivIntegers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstnumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="secondnumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DivIntegers", propOrder = {
    "firstnumber",
    "secondnumber"
})
public class DivIntegers {

    protected int firstnumber;
    protected int secondnumber;

    /**
     * Gets the value of the firstnumber property.
     * 
     */
    public int getFirstnumber() {
        return firstnumber;
    }

    /**
     * Sets the value of the firstnumber property.
     * 
     */
    public void setFirstnumber(int value) {
        this.firstnumber = value;
    }

    /**
     * Gets the value of the secondnumber property.
     * 
     */
    public int getSecondnumber() {
        return secondnumber;
    }

    /**
     * Sets the value of the secondnumber property.
     * 
     */
    public void setSecondnumber(int value) {
        this.secondnumber = value;
    }

}
