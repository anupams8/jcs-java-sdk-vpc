//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.28 at 04:51:18 PM IST 
//


package xmlParser;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="routeTable">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="routeSet">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="destinationCidrBlock" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="routeTableId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vpcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "routeTable",
    "routeTableId",
    "vpcId"
})
@XmlRootElement(name = "CreateRouteTableResponse")
public class CreateRouteTableResponse {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected CreateRouteTableResponse.RouteTable routeTable;
    @XmlElement(required = true)
    protected String routeTableId;
    @XmlElement(required = true)
    protected String vpcId;

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
     * Gets the value of the routeTable property.
     * 
     * @return
     *     possible object is
     *     {@link CreateRouteTableResponse.RouteTable }
     *     
     */
    public CreateRouteTableResponse.RouteTable getRouteTable() {
        return routeTable;
    }

    /**
     * Sets the value of the routeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateRouteTableResponse.RouteTable }
     *     
     */
    public void setRouteTable(CreateRouteTableResponse.RouteTable value) {
        this.routeTable = value;
    }

    /**
     * Gets the value of the routeTableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * Sets the value of the routeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteTableId(String value) {
        this.routeTableId = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="routeSet">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="destinationCidrBlock" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "routeSet"
    })
    public static class RouteTable {

        @XmlElement(required = true)
        protected CreateRouteTableResponse.RouteTable.RouteSet routeSet;

        /**
         * Gets the value of the routeSet property.
         * 
         * @return
         *     possible object is
         *     {@link CreateRouteTableResponse.RouteTable.RouteSet }
         *     
         */
        public CreateRouteTableResponse.RouteTable.RouteSet getRouteSet() {
            return routeSet;
        }

        /**
         * Sets the value of the routeSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateRouteTableResponse.RouteTable.RouteSet }
         *     
         */
        public void setRouteSet(CreateRouteTableResponse.RouteTable.RouteSet value) {
            this.routeSet = value;
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
         *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="destinationCidrBlock" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "item"
        })
        public static class RouteSet {

            @XmlElement(nillable = true)
            protected List<CreateRouteTableResponse.RouteTable.RouteSet.Item> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CreateRouteTableResponse.RouteTable.RouteSet.Item }
             * 
             * 
             */
            public List<CreateRouteTableResponse.RouteTable.RouteSet.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<CreateRouteTableResponse.RouteTable.RouteSet.Item>();
                }
                return this.item;
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
             *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="destinationCidrBlock" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "origin",
                "destinationCidrBlock"
            })
            public static class Item {

                @XmlElement(required = true)
                protected String origin;
                @XmlElement(required = true)
                protected String destinationCidrBlock;

                /**
                 * Gets the value of the origin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrigin() {
                    return origin;
                }

                /**
                 * Sets the value of the origin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrigin(String value) {
                    this.origin = value;
                }

                /**
                 * Gets the value of the destinationCidrBlock property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestinationCidrBlock() {
                    return destinationCidrBlock;
                }

                /**
                 * Sets the value of the destinationCidrBlock property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestinationCidrBlock(String value) {
                    this.destinationCidrBlock = value;
                }

            }

        }

    }

}