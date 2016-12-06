package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class CreateSubnetRequest extends JCSRequest implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vpcId;
	private String cidrBlock;

	public CreateSubnetRequest() {
	}

	public CreateSubnetRequest(String vpcId, String cidrBlock) {
		super();
		this.vpcId = vpcId;
		this.cidrBlock = cidrBlock;
	}

	public String getVpcId() {
		return vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getCidrBlock() {
		return cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cidrBlock == null) ? 0 : cidrBlock.hashCode());
		result = prime * result + ((vpcId == null) ? 0 : vpcId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateSubnetRequest other = (CreateSubnetRequest) obj;
		if (cidrBlock == null) {
			if (other.cidrBlock != null)
				return false;
		} else if (!cidrBlock.equals(other.cidrBlock))
			return false;
		if (vpcId == null) {
			if (other.vpcId != null)
				return false;
		} else if (!vpcId.equals(other.vpcId))
			return false;
		return true;
	}

	@Override
	public CreateSubnetRequest clone() {
		try {
			return (CreateSubnetRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
}
