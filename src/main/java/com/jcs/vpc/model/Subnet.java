package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class Subnet implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private int availableIpAddressCount;
	private String vpcId;
	private String subnetId;
	private String cidrBlock;

	public int getAvailableIpAddressCount() {
		return availableIpAddressCount;
	}

	public void setAvailableIpAddressCount(int availableIpAddressCount) {
		this.availableIpAddressCount = availableIpAddressCount;
	}

	public String getVpcId() {
		return vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getSubnetId() {
		return subnetId;
	}

	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
	}

	public String getCidrBlock() {
		return cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	public Subnet withAvailableIpAddressCount(int availableIpAddressCount) {
		setAvailableIpAddressCount(availableIpAddressCount);
		return this;
	}
	
	public Subnet withVpcId(String vpcId) {
		setVpcId(cidrBlock);
		return this;
	}
	
	public Subnet withSubnetId(String subnetId) {
		setSubnetId(subnetId);
		return this;
	}

	public Subnet withCidrBlock(String cidrBlock) {
		setCidrBlock(cidrBlock);
		return this;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + availableIpAddressCount;
		result = prime * result + ((cidrBlock == null) ? 0 : cidrBlock.hashCode());
		result = prime * result + ((subnetId == null) ? 0 : subnetId.hashCode());
		result = prime * result + ((vpcId == null) ? 0 : vpcId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subnet other = (Subnet) obj;
		if (availableIpAddressCount != other.availableIpAddressCount)
			return false;
		if (cidrBlock == null) {
			if (other.cidrBlock != null)
				return false;
		} else if (!cidrBlock.equals(other.cidrBlock))
			return false;
		if (subnetId == null) {
			if (other.subnetId != null)
				return false;
		} else if (!subnetId.equals(other.subnetId))
			return false;
		if (vpcId == null) {
			if (other.vpcId != null)
				return false;
		} else if (!vpcId.equals(other.vpcId))
			return false;
		return true;
	}

	@Override
	public Subnet clone() {
		try {
			return (Subnet) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

	
}
