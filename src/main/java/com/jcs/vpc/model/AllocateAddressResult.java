package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class AllocateAddressResult extends JCSResult implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
	private String requestId;
	private String publicIp;
	private String domain;
	private String allocationId;


	public AllocateAddressResult() {
	}

	public AllocateAddressResult(String requestId, String publicIp, String domain, String allocationId) {
		super();
		this.requestId = requestId;
		this.publicIp = publicIp;
		this.domain = domain;
		this.allocationId = allocationId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
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

	public AllocateAddressResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	public AllocateAddressResult withDomain(String domain) {
		setDomain(domain);
		return this;
	}

	public AllocateAddressResult withPublicIp(String publicIp) {
        setPublicIp(publicIp);
		return this;
	}

	public AllocateAddressResult withAllocationId(String allocationId) {
		setAllocationId(allocationId);
		return this;
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
	@Override
	public AllocateAddressResult clone() {
		try {
			return (AllocateAddressResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
