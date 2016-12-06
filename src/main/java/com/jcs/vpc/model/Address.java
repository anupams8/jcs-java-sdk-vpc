package com.jcs.vpc.model;

import java.io.Serializable;

public class Address implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String domain;
	private String instanceId;
	private String networkInterfaceId;
	private String associationId;
	private String networkInterfaceOwnerId;
	private String publicIp;
	private String allocationId;
	private String privateIpAddress;

	public Address() {
	}

	public Address(String domain, String instanceId, String publicIp,
			String allocationId, String privateIpAddress) {
		super();
		this.domain = domain;
		this.instanceId = instanceId;
		this.publicIp = publicIp;
		this.allocationId = allocationId;
		this.privateIpAddress = privateIpAddress;
	}

	public Address(String domain, String instanceId, String networkInterfaceId,
			String associationId, String networkInterfaceOwnerId, String publicIp, String allocationId,
			String privateIpAddress) {
		super();
		this.domain = domain;
		this.instanceId = instanceId;
		this.networkInterfaceId = networkInterfaceId;
		this.associationId = associationId;
		this.networkInterfaceOwnerId = networkInterfaceOwnerId;
		this.publicIp = publicIp;
		this.allocationId = allocationId;
		this.privateIpAddress = privateIpAddress;
	}

	
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getPublicIp() {
		return publicIp;
	}

	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}

	public String getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
	}

	public String getPrivateIpAddress() {
		return privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
	}

	public String getNetworkInterfaceId() {
		return networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
	}

	public String getAssociationId() {
		return associationId;
	}

	public void setAssociationId(String associationId) {
		this.associationId = associationId;
	}

	public String getNetworkInterfaceOwnerId() {
		return networkInterfaceOwnerId;
	}

	public void setNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
		this.networkInterfaceOwnerId = networkInterfaceOwnerId;
	}

	public Address withDomain(String domain) {
		setDomain(domain);
		return this;
	}

	public Address withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}

	public Address withPublicIp(String publicIp) {
        setPublicIp(publicIp);
		return this;
	}

	public Address withAllocationId(String allocationId) {
		setAllocationId(allocationId);
		return this;
	}

	public Address withNetworkInterfaceId(String networkInterfaceId) {
		setNetworkInterfaceId(networkInterfaceId);
		return this;
	}
	
	public Address withAssociationId(String associationId) {
		setAssociationId(associationId);
		return this;
	}
	
	public Address withNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
		setNetworkInterfaceOwnerId(networkInterfaceOwnerId);
		return this;
	}
}
