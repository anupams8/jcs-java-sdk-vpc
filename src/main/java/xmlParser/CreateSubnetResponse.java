//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.28 at 04:51:18 PM IST 
//


package xmlParser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subnet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="availableIpAddressCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="vpcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="subnetId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="cidrBlock" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "requestId",
    "subnet"
})
@XmlRootElement(name = "CreateSubnetResponse")
public class CreateSubnetResponse {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected CreateSubnetResponse.Subnet subnet;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the subnet property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSubnetResponse.Subnet }
     *     
     */
    public CreateSubnetResponse.Subnet getSubnet() {
        return subnet;
    }

    /**
     * Sets the value of the subnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSubnetResponse.Subnet }
     *     
     */
    public void setSubnet(CreateSubnetResponse.Subnet value) {
        this.subnet = value;
    }


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
     *         &lt;element name="availableIpAddressCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="vpcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="subnetId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="cidrBlock" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "availableIpAddressCount",
        "vpcId",
        "subnetId",
        "cidrBlock"
    })
    public static class Subnet {

        protected int availableIpAddressCount;
        @XmlElement(required = true)
        protected String vpcId;
        @XmlElement(required = true)
        protected String subnetId;
        @XmlElement(required = true)
        protected String cidrBlock;

        /**
         * Gets the value of the availableIpAddressCount property.
         * 
         */
        public int getAvailableIpAddressCount() {
            return availableIpAddressCount;
        }

        /**
         * Sets the value of the availableIpAddressCount property.
         * 
         */
        public void setAvailableIpAddressCount(int value) {
            this.availableIpAddressCount = value;
        }

        /**
         * Gets the value of the vpcId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVpcId() {
            return vpcId;
        }

        /**
         * Sets the value of the vpcId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVpcId(String value) {
            this.vpcId = value;
        }

        /**
         * Gets the value of the subnetId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubnetId() {
            return subnetId;
        }

        /**
         * Sets the value of the subnetId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubnetId(String value) {
            this.subnetId = value;
        }

        /**
         * Gets the value of the cidrBlock property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCidrBlock() {
            return cidrBlock;
        }

        /**
         * Sets the value of the cidrBlock property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCidrBlock(String value) {
            this.cidrBlock = value;
        }

    }

}
