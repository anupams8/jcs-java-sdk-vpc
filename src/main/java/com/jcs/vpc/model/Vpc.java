package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class Vpc implements Serializable, Cloneable {
	private static final long serialVersionUID = -2799552718629746851L;
	private String vpcId;
	private String cidrBlock;

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

	public Vpc withVpcId(String vpcId) {
		setVpcId(vpcId);
		return this;
	}

	public Vpc withCidrBlock(String cidrBlock) {
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
		result = prime * result + ((cidrBlock == null) ? 0 : cidrBlock.hashCode());
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
		Vpc other = (Vpc) obj;
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
	public Vpc clone() {
		try {
			return (Vpc) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
}
