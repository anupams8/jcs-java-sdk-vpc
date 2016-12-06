package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class DisassociateRouteTableRequest extends JCSRequest implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
	private String associationId;
	
	public DisassociateRouteTableRequest(){
	}
	
	public DisassociateRouteTableRequest(String associationId) {
		super();
		this.associationId = associationId;
	}

	public String getAssociationId() {
		return this.associationId;
	}

	public void setAssociationId(String associationId) {
		this.associationId = associationId;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((associationId == null) ? 0 : associationId.hashCode());
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
		DisassociateRouteTableRequest other = (DisassociateRouteTableRequest) obj;
		if (associationId == null) {
			if (other.associationId != null)
				return false;
		} else if (!associationId.equals(other.associationId))
			return false;
		return true;
	}

	@Override
	public AssociateRouteTableRequest clone() {
		try {
			return (AssociateRouteTableRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
