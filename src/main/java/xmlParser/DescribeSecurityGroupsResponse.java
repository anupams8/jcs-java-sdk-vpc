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
 *         &lt;element name="securityGroupInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vpcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element ref="{http://vpc.ind-west-1.jiocloudservices.com/doc/2016-03-01/}IpPermissions"/>
 *                             &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element ref="{http://vpc.ind-west-1.jiocloudservices.com/doc/2016-03-01/}IpPermissionsEgress"/>
 *                             &lt;element name="groupDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "requestId",
    "securityGroupInfo"
})
@XmlRootElement(name = "DescribeSecurityGroupsResponse")
public class DescribeSecurityGroupsResponse {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected DescribeSecurityGroupsResponse.SecurityGroupInfo securityGroupInfo;

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
     * Gets the value of the securityGroupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeSecurityGroupsResponse.SecurityGroupInfo }
     *     
     */
    public DescribeSecurityGroupsResponse.SecurityGroupInfo getSecurityGroupInfo() {
        return securityGroupInfo;
    }

    /**
     * Sets the value of the securityGroupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeSecurityGroupsResponse.SecurityGroupInfo }
     *     
     */
    public void setSecurityGroupInfo(DescribeSecurityGroupsResponse.SecurityGroupInfo value) {
        this.securityGroupInfo = value;
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
     *                   &lt;element name="vpcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element ref="{http://vpc.ind-west-1.jiocloudservices.com/doc/2016-03-01/}IpPermissions"/>
     *                   &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element ref="{http://vpc.ind-west-1.jiocloudservices.com/doc/2016-03-01/}IpPermissionsEgress"/>
     *                   &lt;element name="groupDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class SecurityGroupInfo {

        @XmlElement(nillable = true)
        protected List<DescribeSecurityGroupsResponse.SecurityGroupInfo.Item> item;

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
         * {@link DescribeSecurityGroupsResponse.SecurityGroupInfo.Item }
         * 
         * 
         */
        public List<DescribeSecurityGroupsResponse.SecurityGroupInfo.Item> getItem() {
            if (item == null) {
                item = new ArrayList<DescribeSecurityGroupsResponse.SecurityGroupInfo.Item>();
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
         *         &lt;element name="vpcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element ref="{http://vpc.ind-west-1.jiocloudservices.com/doc/2016-03-01/}IpPermissions"/>
         *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element ref="{http://vpc.ind-west-1.jiocloudservices.com/doc/2016-03-01/}IpPermissionsEgress"/>
         *         &lt;element name="groupDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "vpcId",
            "groupId",
            "ipPermissions",
            "groupName",
            "ipPermissionsEgress",
            "groupDescription"
        })
        public static class Item {

            @XmlElement(required = true)
            protected String vpcId;
            @XmlElement(required = true)
            protected String groupId;
            @XmlElement(name = "IpPermissions", required = true)
            protected IpPermissions ipPermissions;
            @XmlElement(required = true)
            protected String groupName;
            @XmlElement(name = "IpPermissionsEgress", required = true)
            protected IpPermissionsEgress ipPermissionsEgress;
            @XmlElement(required = true)
            protected String groupDescription;

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
             * Gets the value of the groupId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupId() {
                return groupId;
            }

            /**
             * Sets the value of the groupId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupId(String value) {
                this.groupId = value;
            }

            /**
             * Gets the value of the ipPermissions property.
             * 
             * @return
             *     possible object is
             *     {@link IpPermissions }
             *     
             */
            public IpPermissions getIpPermissions() {
                return ipPermissions;
            }

            /**
             * Sets the value of the ipPermissions property.
             * 
             * @param value
             *     allowed object is
             *     {@link IpPermissions }
             *     
             */
            public void setIpPermissions(IpPermissions value) {
                this.ipPermissions = value;
            }

            /**
             * Gets the value of the groupName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupName() {
                return groupName;
            }

            /**
             * Sets the value of the groupName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupName(String value) {
                this.groupName = value;
            }

            /**
             * Gets the value of the ipPermissionsEgress property.
             * 
             * @return
             *     possible object is
             *     {@link IpPermissionsEgress }
             *     
             */
            public IpPermissionsEgress getIpPermissionsEgress() {
                return ipPermissionsEgress;
            }

            /**
             * Sets the value of the ipPermissionsEgress property.
             * 
             * @param value
             *     allowed object is
             *     {@link IpPermissionsEgress }
             *     
             */
            public void setIpPermissionsEgress(IpPermissionsEgress value) {
                this.ipPermissionsEgress = value;
            }

            /**
             * Gets the value of the groupDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupDescription() {
                return groupDescription;
            }

            /**
             * Sets the value of the groupDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupDescription(String value) {
                this.groupDescription = value;
            }

        }

    }

}
