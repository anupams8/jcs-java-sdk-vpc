package com.jcs.vpc.model;

import java.io.Serializable;

import com.google.gson.Gson;

public class CreateRouteTableResult extends JCSResult implements Serializable, Cloneable {
	

	private static final long serialVersionUID = 1L;
	private RouteTable routeTable;
	
	public CreateRouteTableResult(){
	}
	
	public CreateRouteTableResult(RouteTable routeTable) {
		super();
		this.routeTable = routeTable;
	}

	public RouteTable getRouteTable() {
		return routeTable;
	}

	public void setRouteTable(RouteTable routeTable) {
		this.routeTable = routeTable;
	}

	public CreateRouteTableResult withRouteTable(RouteTable routeTable){
		setRouteTable(routeTable);
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
		result = prime * result + ((routeTable == null) ? 0 : routeTable.hashCode());
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
		CreateRouteTableResult other = (CreateRouteTableResult) obj;
		if (routeTable == null) {
			if (other.routeTable != null)
				return false;
		} else if (!routeTable.equals(other.routeTable))
			return false;
		return true;
	}
	
	@Override
	public CreateRouteTableResult clone() {
		try {
			return (CreateRouteTableResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
		}
	}
}
