package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class AssociateRouteTableRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String routeTableId;
	private String subnetId;
	
	public AssociateRouteTableRequest(){
	}
	
	public AssociateRouteTableRequest(String routeTableId, String subnetId) {
		super();
		this.routeTableId = routeTableId;
		this.subnetId = subnetId;
	}

	public String getrouteTableId() {
		return routeTableId;
	}

	public void setrouteTableId(String routeTableId) {
		this.routeTableId = routeTableId;
	}

	public String getsubnetId() {
		return subnetId;
	}

	public void setsubnetId(String subnetId) {
		this.subnetId = subnetId;
	}
	
	public AssociateRouteTableRequest withRouteTableId(String routeTableId){
		setrouteTableId(routeTableId);
		return this;	
	}

	public AssociateRouteTableRequest withSubnetId(String subnetId){
		setsubnetId(subnetId);
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
		result = prime * result + ((routeTableId == null) ? 0 : routeTableId.hashCode());
		result = prime * result + ((subnetId == null) ? 0 : subnetId.hashCode());
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
		AssociateRouteTableRequest other = (AssociateRouteTableRequest) obj;
		if (routeTableId == null) {
			if (other.routeTableId != null)
				return false;
		} else if (!routeTableId.equals(other.routeTableId))
			return false;
		if (subnetId == null) {
			if (other.subnetId != null)
				return false;
		} else if (!subnetId.equals(other.subnetId))
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
