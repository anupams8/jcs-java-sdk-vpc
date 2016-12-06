package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class AssociateRouteTableResult extends JCSResult implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String associationID;
	
	public AssociateRouteTableResult(){
	}
	
	public AssociateRouteTableResult(String associationID) {
		super();
		this.associationID = associationID;
	}

	public String getAssociationID() {
		return associationID;
	}

	public void setAssociationID(String associationID) {
		this.associationID = associationID;
	}
	
	public AssociateRouteTableResult withAssociationId(String associationId){
		setAssociationID(associationId);
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
		result = prime * result + ((associationID == null) ? 0 : associationID.hashCode());
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
		AssociateRouteTableResult other = (AssociateRouteTableResult) obj;
		if (associationID == null) {
			if (other.associationID != null)
				return false;
		} else if (!associationID.equals(other.associationID))
			return false;
		return true;
	}

	@Override
	public AssociateRouteTableResult clone() {
		try {
			return (AssociateRouteTableResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
