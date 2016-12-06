package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class DeleteRouteTableRequest extends JCSRequest implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String routeTableId;
	
	public DeleteRouteTableRequest(){
	}
	
	public DeleteRouteTableRequest(String routeTableId) {
		super();
		this.routeTableId = routeTableId;
	}

	public String getrouteTableId() {
		return routeTableId;
	}

	public void setrouteTableId(String routeTableId) {
		this.routeTableId = routeTableId;
	}

	public DeleteRouteTableRequest withrouteTableId(String routeTableId){
		setrouteTableId(routeTableId);
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
		DeleteRouteTableRequest other = (DeleteRouteTableRequest) obj;
		if (routeTableId == null) {
			if (other.routeTableId != null)
				return false;
		} else if (!routeTableId.equals(other.routeTableId))
			return false;
		return true;
	}

	@Override
	public DeleteRouteTableRequest clone() {
		try {
			return (DeleteRouteTableRequest) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}

}
