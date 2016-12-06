package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class CreateSubnetResult extends JCSResult implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private Subnet subnet;

	public CreateSubnetResult() {

	}

	public CreateSubnetResult(Subnet subnet) {
		super();
		this.subnet = subnet;
	}

	public Subnet getSubnet() {
		return subnet;
	}

	public void setSubnet(Subnet subnet) {
		this.subnet = subnet;
	}

	public CreateSubnetResult withSubnet(Subnet subnet) {
		setSubnet(subnet);
		return this;
	}

	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((subnet == null) ? 0 : subnet.hashCode());
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
		CreateSubnetResult other = (CreateSubnetResult) obj;
		if (subnet == null) {
			if (other.subnet != null)
				return false;
		} else if (!subnet.equals(other.subnet))
			return false;
		return true;
	}

	@Override
	public CreateSubnetResult clone() {
		try {
			return (CreateSubnetResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
