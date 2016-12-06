package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class CreateRouteTableRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String vpcId;
	
	public CreateRouteTableRequest(){
	}

	public CreateRouteTableRequest(String vpcId) {
		super();
		this.vpcId = vpcId;
	}

	public String getVpcId() {
		return vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}
	
	public CreateRouteTableRequest withVpcId(String vpcId){
		setVpcId(vpcId);
		return this;
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
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
		CreateRouteTableRequest other = (CreateRouteTableRequest) obj;
		if (vpcId == null) {
			if (other.vpcId != null)
				return false;
		} else if (!vpcId.equals(other.vpcId))
			return false;
		return true;
	}
	
	@Override
	public CreateRouteTableRequest clone() {
		try {
			return (CreateRouteTableRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
}
